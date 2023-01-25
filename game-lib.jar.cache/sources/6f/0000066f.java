package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamNetworking;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.java.c.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/f.class */
public class SteamNetworkingCallback implements com.codedisaster.steamworks.SteamNetworkingCallback {

    /* renamed from: a */
    SteamEngine f7330a;

    public SteamNetworkingCallback(SteamEngine steamEngine) {
        this.f7330a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionConnectFail(SteamID steamID, SteamNetworking.P2PSessionError p2PSessionError) {
        GameEngine.m5777e("onP2PSessionConnectFail:" + p2PSessionError);
        SteamSocket steamSocket = (SteamSocket) this.f7330a.f7320l.get(steamID);
        if (steamSocket != null && !steamSocket.isClosed()) {
            GameEngine.m5777e("onP2PSessionConnectFail: closing active socket");
            try {
                steamSocket.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamNetworkingCallback
    public void onP2PSessionRequest(SteamID steamID) {
        GameEngine.m5777e("onP2PSessionRequest:" + steamID);
        this.f7330a.f7316h.acceptP2PSessionWithUser(steamID);
    }
}