package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.j.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/u.class */
class RunnableC0924u implements Runnable {

    /* renamed from: a */
    int f6112a;

    /* renamed from: b */
    List f6113b;

    /* renamed from: c */
    AbstractC0922s f6114c;

    /* renamed from: d */
    String f6115d;

    /* renamed from: e */
    boolean f6116e;

    public RunnableC0924u(List list, AbstractC0922s abstractC0922s, String str, boolean z, int i) {
        this.f6112a = i;
        this.f6113b = list;
        this.f6114c = abstractC0922s;
        this.f6115d = str;
        this.f6116e = z;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            if (GameNetAPIOperate.f6091a) {
                GameEngine.m1015b("LoadFromMasterServer", this.f6112a + ": Started doSingleRequest");
            }
            BufferedReader bufferedReader = GameNetAPIOperate.m1271a(this.f6113b, this.f6115d, this.f6116e).f6109a;
            if (GameNetAPIOperate.f6091a) {
                GameEngine.m1015b("LoadFromMasterServer", this.f6112a + ": Ended doSingleRequest");
            }
            this.f6114c.mo1256a(bufferedReader, this.f6112a, this.f6115d);
        } catch (Exception e) {
            e.printStackTrace();
            String m2188a = C0773f.m2188a(e, true);
            if (e instanceof UnknownHostException) {
                m2188a = "DNS lookup failed, check your internet connection";
            }
            if (m2188a != null && m2188a.contains("Cleartext HTTP traffic")) {
                m2188a = m2188a + " ( Broken apk file? - " + gameEngine.mo981l() + ")";
            }
            this.f6114c.f6106d = "#" + this.f6112a + ": " + m2188a;
            GameEngine.m5460e("Error getting game list from server #" + this.f6112a);
            if (gameEngine.mo974p()) {
                gameEngine.m1065a("Error getting game list from server #" + this.f6112a, 1);
            }
        }
        synchronized (this.f6114c) {
            this.f6114c.f6108f--;
            if (this.f6114c.f6108f == 0) {
                this.f6114c.mo1257a();
            }
        }
    }
}