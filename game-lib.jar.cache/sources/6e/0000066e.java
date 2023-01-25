package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/e.class */
public class SteamMatchmakingCallback implements com.codedisaster.steamworks.SteamMatchmakingCallback {

    /* renamed from: a */
    SteamEngine f7329a;

    public SteamMatchmakingCallback(SteamEngine steamEngine) {
        this.f7329a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListChanged(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        GameEngine.m5777e("onFavoritesListChanged");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyInvite(SteamID steamID, SteamID steamID2, long j) {
        GameEngine.m5777e("onLobbyInvite");
        new SteamData(this.f7329a, steamID, steamID2, j).m296a();
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyEnter(SteamID steamID, int i, boolean z, SteamMatchmaking.ChatRoomEnterResponse chatRoomEnterResponse) {
        GameEngine.m5777e("onLobbyEnter");
        if (z) {
            GameEngine.m5777e("onLobbyEnter blocked: " + chatRoomEnterResponse);
        }
        this.f7329a.m285c(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyDataUpdate(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m5777e("onLobbyDataUpdate success: " + z);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatUpdate(SteamID steamID, SteamID steamID2, SteamID steamID3, SteamMatchmaking.ChatMemberStateChange chatMemberStateChange) {
        GameEngine.m5777e("onLobbyChatUpdate steamIDUserChanged: " + steamID2 + " stateChange:" + chatMemberStateChange);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatMessage(SteamID steamID, SteamID steamID2, SteamMatchmaking.ChatEntryType chatEntryType, int i) {
        GameEngine.m5777e("onLobbyChatMessage");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyGameCreated(SteamID steamID, SteamID steamID2, int i, short s) {
        GameEngine.m5777e("onLobbyGameCreated");
        this.f7329a.m294a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyMatchList(int i) {
        GameEngine.m5777e("onLobbyMatchList");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyKicked(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m5777e("onLobbyKicked");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyCreated(SteamResult steamResult, SteamID steamID) {
        GameEngine.m5777e("onLobbyCreated");
        this.f7329a.m294a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListAccountsUpdated(SteamResult steamResult) {
        GameEngine.m5777e("onFavoritesListAccountsUpdated");
    }
}