package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamID;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/a.class */
public class SteamData implements Runnable {

    /* renamed from: a */
    SteamEngine f7303a;

    /* renamed from: b */
    String f7304b;

    /* renamed from: c */
    SteamID f7305c;

    /* renamed from: d */
    SteamID f7306d;

    /* renamed from: e */
    long f7307e;

    /* renamed from: f */
    Thread f7308f;

    public SteamData(SteamEngine steamEngine, SteamID steamID, SteamID steamID2, long j) {
        this.f7303a = steamEngine;
        this.f7305c = steamID;
        this.f7306d = steamID2;
        this.f7307e = j;
        this.f7304b = steamEngine.f7311c.getFriendPersonaName(steamID);
    }

    /* renamed from: a */
    public void m296a() {
        if (this.f7308f != null) {
            throw new RuntimeException("already started");
        }
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.c.a.1
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().getRoot().showPopupWithButtons("Invite", "'" + SteamData.this.f7304b + "' has invited you to join a game", true, new C0051e("Join", SteamData.this), null);
            }
        });
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m5777e("Join clicked");
        ScriptEngine.getInstance().getRoot().closePopup();
        GameEngine.getGameEngine();
        this.f7303a.f7312d.joinLobby(this.f7306d);
    }
}