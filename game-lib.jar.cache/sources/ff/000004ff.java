package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import java.lang.Thread;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i.class */
public class i implements Thread.UncaughtExceptionHandler {
    private Thread.UncaughtExceptionHandler a;

    i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.a = uncaughtExceptionHandler;
    }

    @Override // java.lang.Thread.UncaughtExceptionHandler
    public synchronized void uncaughtException(Thread thread, Throwable th) {
        GameEngine gameEngine = null;
        try {
            GameEngine.dQ = null;
            GameEngine.dR = null;
            GameEngine.dP = null;
            System.gc();
            try {
                GameEngine.m5e("uncaughtException start");
                gameEngine = GameEngine.getGameEngine();
                if (gameEngine != null && (th instanceof OutOfMemoryError)) {
                    GameEngine.m5e("Freeing memory");
                    try {
                        com.corrodinggames.rts.game.maps.b.al = null;
                        if (gameEngine.bL != null) {
                            gameEngine.bL = null;
                        }
                        if (gameEngine.bN != null) {
                            gameEngine.bN.i();
                            gameEngine.bN = null;
                        }
                        System.gc();
                        GameEngine.m5e("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        GameEngine.m5e("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                GameEngine.a("gameEngine:uncaughtExceptionHandler", th);
                String a = GameEngine.a(th);
                boolean z = false;
                boolean z2 = false;
                if (gameEngine != null) {
                    SettingsEngine settingsEngine = gameEngine.settingsEngine;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        GameEngine.m5e("CustomExceptionHandler: no settings");
                    }
                } else {
                    GameEngine.m5e("CustomExceptionHandler: no game");
                }
                if (GameEngine.dO) {
                    GameEngine.m5e("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                GameEngine.dO = true;
                if (z) {
                    try {
                        GameEngine.m5e("Starting errorReport");
                        GameNetAPIOperate.a("uncaughtException", a);
                        GameEngine.m5e("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!z2 && gameEngine != null && gameEngine.dH != null) {
                    gameEngine.dH.a(th);
                }
                GameEngine.e("fatal", a);
            } catch (Exception e2) {
                GameEngine.m5e("exception sending crash");
                e2.printStackTrace();
            }
            if (gameEngine != null) {
                if (gameEngine.dH != null && gameEngine.dH.a()) {
                    GameEngine.m5e("gameCrashesDontExit=true");
                    if (1 == 0) {
                        GameEngine.m5e("Crash was not handled, exiting");
                        Runtime.getRuntime().halt(1);
                        return;
                    }
                    return;
                } else if (gameEngine.netEngine != null && gameEngine.netEngine.B) {
                    GameEngine.m5e("Sending disconnect");
                    gameEngine.netEngine.c("Game crash");
                }
            }
            if (!GameEngine.az) {
                if (this.a != null) {
                    GameEngine.m5e("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.a.uncaughtException(thread, th);
                    GameEngine.m5e("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    GameEngine.m5e("CustomExceptionHandler: defaultUEH==null");
                    System.exit(2);
                }
            }
            GameEngine.av = th;
            if (1 == 0) {
                GameEngine.m5e("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        } catch (Throwable th3) {
            try {
                GameEngine.m5e("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 == 0) {
                    GameEngine.m5e("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
            } catch (Throwable th4) {
                if (0 == 0) {
                    GameEngine.m5e("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}