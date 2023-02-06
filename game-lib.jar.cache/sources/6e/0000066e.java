package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/e.class */
public class SteamMatchmakingCallback implements com.codedisaster.steamworks.SteamMatchmakingCallback {
    SteamEngine a;

    public SteamMatchmakingCallback(SteamEngine steamEngine) {
        this.a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListChanged(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        GameEngine.m5e("onFavoritesListChanged");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyInvite(SteamID steamID, SteamID steamID2, long j) {
        GameEngine.m5e("onLobbyInvite");
        new SteamData(this.a, steamID, steamID2, j).a();
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyEnter(SteamID steamID, int i, boolean z, SteamMatchmaking.ChatRoomEnterResponse chatRoomEnterResponse) {
        GameEngine.m5e("onLobbyEnter");
        if (z) {
            GameEngine.m5e("onLobbyEnter blocked: " + chatRoomEnterResponse);
        }
        this.a.c(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyDataUpdate(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m5e("onLobbyDataUpdate success: " + z);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatUpdate(SteamID steamID, SteamID steamID2, SteamID steamID3, SteamMatchmaking.ChatMemberStateChange chatMemberStateChange) {
        GameEngine.m5e("onLobbyChatUpdate steamIDUserChanged: " + steamID2 + " stateChange:" + chatMemberStateChange);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatMessage(SteamID steamID, SteamID steamID2, SteamMatchmaking.ChatEntryType chatEntryType, int i) {
        GameEngine.m5e("onLobbyChatMessage");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyGameCreated(SteamID steamID, SteamID steamID2, int i, short s) {
        GameEngine.m5e("onLobbyGameCreated");
        this.a.a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyMatchList(int i) {
        GameEngine.m5e("onLobbyMatchList");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyKicked(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m5e("onLobbyKicked");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyCreated(SteamResult steamResult, SteamID steamID) {
        GameEngine.m5e("onLobbyCreated");
        this.a.a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListAccountsUpdated(SteamResult steamResult) {
        GameEngine.m5e("onFavoritesListAccountsUpdated");
    }
}