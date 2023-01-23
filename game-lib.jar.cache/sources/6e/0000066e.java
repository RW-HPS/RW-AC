package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.codedisaster.steamworks.SteamMatchmaking;
import com.codedisaster.steamworks.SteamResult;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/e.class */
public class SteamMatchmakingCallback implements com.codedisaster.steamworks.SteamMatchmakingCallback {

    /* renamed from: a */
    SteamEngine f733a;

    public SteamMatchmakingCallback(SteamEngine steamEngine) {
        this.f733a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListChanged(int i, int i2, int i3, int i4, int i5, boolean z, int i6) {
        GameEngine.m2e("onFavoritesListChanged");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyInvite(SteamID steamID, SteamID steamID2, long j) {
        GameEngine.m2e("onLobbyInvite");
        new SteamData(this.f733a, steamID, steamID2, j).a();
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyEnter(SteamID steamID, int i, boolean z, SteamMatchmaking.ChatRoomEnterResponse chatRoomEnterResponse) {
        GameEngine.m2e("onLobbyEnter");
        if (z) {
            GameEngine.m2e("onLobbyEnter blocked: " + chatRoomEnterResponse);
        }
        this.f733a.c(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyDataUpdate(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m2e("onLobbyDataUpdate success: " + z);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatUpdate(SteamID steamID, SteamID steamID2, SteamID steamID3, SteamMatchmaking.ChatMemberStateChange chatMemberStateChange) {
        GameEngine.m2e("onLobbyChatUpdate steamIDUserChanged: " + steamID2 + " stateChange:" + chatMemberStateChange);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyChatMessage(SteamID steamID, SteamID steamID2, SteamMatchmaking.ChatEntryType chatEntryType, int i) {
        GameEngine.m2e("onLobbyChatMessage");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyGameCreated(SteamID steamID, SteamID steamID2, int i, short s) {
        GameEngine.m2e("onLobbyGameCreated");
        this.f733a.a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyMatchList(int i) {
        GameEngine.m2e("onLobbyMatchList");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyKicked(SteamID steamID, SteamID steamID2, boolean z) {
        GameEngine.m2e("onLobbyKicked");
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onLobbyCreated(SteamResult steamResult, SteamID steamID) {
        GameEngine.m2e("onLobbyCreated");
        this.f733a.a(steamID);
    }

    @Override // com.codedisaster.steamworks.SteamMatchmakingCallback
    public void onFavoritesListAccountsUpdated(SteamResult steamResult) {
        GameEngine.m2e("onFavoritesListAccountsUpdated");
    }
}