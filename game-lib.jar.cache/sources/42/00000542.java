package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.j.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/u.class */
public class u implements Runnable {

    /* renamed from: a */
    int f594a;
    List b;
    s c;
    String d;
    boolean e;

    public u(List list, s sVar, String str, boolean z, int i) {
        this.f594a = i;
        this.b = list;
        this.c = sVar;
        this.d = str;
        this.e = z;
    }

    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            if (GameNetAPIOperate.f587a) {
                GameEngine.b("LoadFromMasterServer", this.f594a + ": Started doSingleRequest");
            }
            BufferedReader bufferedReader = GameNetAPIOperate.a(this.b, this.d, this.e).f593a;
            if (GameNetAPIOperate.f587a) {
                GameEngine.b("LoadFromMasterServer", this.f594a + ": Ended doSingleRequest");
            }
            this.c.a(bufferedReader, this.f594a, this.d);
        } catch (Exception e) {
            e.printStackTrace();
            String a2 = f.a(e, true);
            if (e instanceof UnknownHostException) {
                a2 = "DNS lookup failed, check your internet connection";
            }
            if (a2 != null && a2.contains("Cleartext HTTP traffic")) {
                a2 = a2 + " ( Broken apk file? - " + gameEngine.l() + ")";
            }
            this.c.d = "#" + this.f594a + ": " + a2;
            GameEngine.m2e("Error getting game list from server #" + this.f594a);
            if (gameEngine.p()) {
                gameEngine.a("Error getting game list from server #" + this.f594a, 1);
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