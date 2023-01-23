package com.corrodinggames.rts.gameFramework;

import android.os.Process;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/z.class */
public class z extends Thread {

    /* renamed from: a  reason: collision with root package name */
    static int f705a = 0;
    public boolean b;
    long c;

    public synchronized void a(boolean z) {
        this.b = z;
    }

    public z() {
        super("GameThread" + f705a);
        this.b = true;
        f705a++;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        long j;
        GameEngine.aq();
        if (!GameEngine.aU) {
            Process.setThreadPriority(-4);
        }
        a();
        long j2 = this.c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        while (this.b) {
            long nanoTime = System.nanoTime();
            long j3 = this.c;
            a();
            gameEngine.a(((float) (this.c - j3)) * 0.060000002f, (int) (this.c - j3));
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

    public void a() {
        this.c = System.currentTimeMillis();
    }
}