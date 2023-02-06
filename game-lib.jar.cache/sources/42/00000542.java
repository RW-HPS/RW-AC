package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.j.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/u.class */
class u implements Runnable {
    int a;
    List b;
    s c;
    String d;
    boolean e;

    public u(List list, s sVar, String str, boolean z, int i) {
        this.a = i;
        this.b = list;
        this.c = sVar;
        this.d = str;
        this.e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            if (GameNetAPIOperate.a) {
                GameEngine.b("LoadFromMasterServer", this.a + ": Started doSingleRequest");
            }
            BufferedReader bufferedReader = GameNetAPIOperate.a(this.b, this.d, this.e).a;
            if (GameNetAPIOperate.a) {
                GameEngine.b("LoadFromMasterServer", this.a + ": Ended doSingleRequest");
            }
            this.c.a(bufferedReader, this.a, this.d);
        } catch (Exception e) {
            e.printStackTrace();
            String a = f.a(e, true);
            if (e instanceof UnknownHostException) {
                a = "DNS lookup failed, check your internet connection";
            }
            if (a != null && a.contains("Cleartext HTTP traffic")) {
                a = a + " ( Broken apk file? - " + gameEngine.l() + ")";
            }
            this.c.d = "#" + this.a + ": " + a;
            GameEngine.m5e("Error getting game list from server #" + this.a);
            if (gameEngine.p()) {
                gameEngine.a("Error getting game list from server #" + this.a, 1);
            }
        }
        synchronized (this.c) {
            this.c.f--;
            if (this.c.f == 0) {
                this.c.a();
            }
        }
    }
}