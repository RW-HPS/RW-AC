package com.corrodinggames.rts.gameFramework;

import android.os.Process;

/* renamed from: com.corrodinggames.rts.gameFramework.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/z.class */
public class C1158z extends Thread {

    /* renamed from: a */
    static int f7182a = 0;

    /* renamed from: b */
    public boolean f7183b;

    /* renamed from: c */
    long f7184c;

    /* renamed from: a */
    public synchronized void m416a(boolean z) {
        this.f7183b = z;
    }

    public C1158z() {
        super("GameThread" + f7182a);
        this.f7183b = true;
        f7182a++;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        long j;
        GameEngine.m1033aq();
        if (!GameEngine.f6418aU) {
            Process.setThreadPriority(-4);
        }
        m417a();
        long j2 = this.f7184c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        while (this.f7183b) {
            long nanoTime = System.nanoTime();
            long j3 = this.f7184c;
            m417a();
            gameEngine.mo1079a(((float) (this.f7184c - j3)) * 0.060000002f, (int) (this.f7184c - j3));
            if (!gameEngine.settingsEngine.batterySaving) {
            }
            if (gameEngine.settingsEngine.batterySaving) {
                j = 32258064;
            } else if (gameEngine.settingsEngine.highRefreshRate) {
                j = 3333333;
            } else {
                j = 16393442;
            }
            long round = Math.round((float) (j - (System.nanoTime() - nanoTime)));
            if (round > 0) {
                long nanoTime2 = System.nanoTime();
                while (true) {
                    long nanoTime3 = System.nanoTime() - nanoTime2;
                    if (nanoTime3 <= round && nanoTime3 >= 0) {
                        long j4 = (long) ((round - nanoTime3) / 1000000.0d);
                        if (j4 > 1) {
                            try {
                                Thread.sleep(j4);
                            } catch (Exception e) {
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m417a() {
        this.f7184c = System.currentTimeMillis();
    }
}