package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a.class */
public class SteamData implements Runnable {

    /* renamed from: a */
    SteamEngine f728a;
    String b;
    SteamID c;
    SteamID d;
    long e;
    Thread f;

    public SteamData(SteamEngine steamEngine, SteamID steamID, SteamID steamID2, long j) {
        this.f728a = steamEngine;
        this.c = steamID;
        this.d = steamID2;
        this.e = j;
        this.b = steamEngine.c.getFriendPersonaName(steamID);
    }

    public void a() {
        if (this.f != null) {
            throw new RuntimeException("already started");
        }
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().getRoot().showPopupWithButtons("Invite", "'" + SteamData.this.b + "' has invited you to join a game", true, new e("Join", SteamData.this), null);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m2e("Join clicked");
        ScriptEngine.getInstance().getRoot().closePopup();
        GameEngine.getGameEngine();
        this.f728a.d.joinLobby(this.d);
    }
}