package com.corrodinggames.rts.java.steam;

/* renamed from: com.corrodinggames.rts.java.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/c.class */
public class SteamUtilsCallback implements com.codedisaster.steamworks.SteamUtilsCallback {
    final /* synthetic */ SteamEngine a;

    public SteamUtilsCallback(SteamEngine steamEngine) {
        this.a = steamEngine;
    }

    @Override // com.codedisaster.steamworks.SteamUtilsCallback
    public void onSteamShutdown() {
    }
}