package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamFriends;
import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/d.class */
public class SteamFriendsCallback implements com.codedisaster.steamworks.SteamFriendsCallback {
    SteamEngine a;

    public SteamFriendsCallback(SteamEngine steamEngine) {
        this.a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onSetPersonaNameResponse(boolean z, boolean z2, SteamResult steamResult) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onPersonaStateChange(SteamID steamID, SteamFriends.PersonaChange personaChange) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameOverlayActivated(boolean z) {
        GameEngine.m5e("onGameOverlayActivated");
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameLobbyJoinRequested(SteamID steamID, SteamID steamID2) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onAvatarImageLoaded(SteamID steamID, int i, int i2, int i3) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onFriendRichPresenceUpdate(SteamID steamID, int i) {
    }

    @Override // com.codedisaster.steamworks.SteamFriendsCallback
    public void onGameRichPresenceJoinRequested(SteamID steamID, String str) {
    }
}