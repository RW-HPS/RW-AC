package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import java.lang.Thread;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i.class */
public class i implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    private Thread.UncaughtExceptionHandler f544a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public i(Thread.UncaughtExceptionHandler uncaughtExceptionHandler) {
        this.f544a = uncaughtExceptionHandler;
    }

    public synchronized void uncaughtException(Thread thread, Throwable th) {
        GameEngine gameEngine = null;
        try {
            GameEngine.dQ = null;
            GameEngine.dR = null;
            GameEngine.dP = null;
            System.gc();
            try {
                GameEngine.m3e("uncaughtException start");
                gameEngine = GameEngine.getGameEngine();
                if (gameEngine != null && (th instanceof OutOfMemoryError)) {
                    GameEngine.m3e("Freeing memory");
                    try {
                        com.corrodinggames.rts.game.b.b.al = null;
                        if (gameEngine.bL != null) {
                            gameEngine.bL = null;
                        }
                        if (gameEngine.bN != null) {
                            gameEngine.bN.i();
                            gameEngine.bN = null;
                        }
                        System.gc();
                        GameEngine.m3e("uncaughtException: Memory freed");
                    } catch (Throwable th2) {
                        GameEngine.m3e("exception freeing memory");
                        th2.printStackTrace();
                    }
                }
                GameEngine.a("gameEngine:uncaughtExceptionHandler", th);
                String a2 = GameEngine.a(th);
                boolean z = false;
                boolean z2 = false;
                if (gameEngine != null) {
                    SettingsEngine settingsEngine = gameEngine.settingsEngine;
                    if (settingsEngine != null) {
                        z = settingsEngine.sendReports;
                    } else {
                        GameEngine.m3e("CustomExceptionHandler: no settings");
                    }
                } else {
                    GameEngine.m3e("CustomExceptionHandler: no game");
                }
                if (GameEngine.dO) {
                    GameEngine.m3e("CustomExceptionHandler: a crash was already sent");
                    z = false;
                    z2 = true;
                }
                GameEngine.dO = true;
                if (z) {
                    try {
                        GameEngine.m3e("Starting errorReport");
                        GameNetAPIOperate.a("uncaughtException", a2);
                        GameEngine.m3e("waiting");
                        Thread.sleep(800L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if (!z2 && gameEngine != null && gameEngine.dH != null) {
                    gameEngine.dH.a(th);
                }
                GameEngine.e("fatal", a2);
            } catch (Exception e2) {
                GameEngine.m3e("exception sending crash");
                e2.printStackTrace();
            }
            if (gameEngine != null) {
                if (gameEngine.dH != null && gameEngine.dH.a()) {
                    GameEngine.m3e("gameCrashesDontExit=true");
                    if (1 == 0) {
                        GameEngine.m3e("Crash was not handled, exiting");
                        Runtime.getRuntime().halt(1);
                        return;
                    }
                    return;
                } else if (gameEngine.bX != null && gameEngine.bX.B) {
                    GameEngine.m3e("Sending disconnect");
                    gameEngine.bX.c("Game crash");
                }
            }
            if (!GameEngine.az) {
                if (this.f544a != null) {
                    GameEngine.m3e("CustomExceptionHandler: sending to: defaultUEH.uncaughtException");
                    this.f544a.uncaughtException(thread, th);
                    GameEngine.m3e("CustomExceptionHandler: back from: defaultUEH.uncaughtException");
                } else {
                    GameEngine.m3e("CustomExceptionHandler: defaultUEH==null");
                    System.exit(2);
                }
            }
            GameEngine.av = th;
            if (1 == 0) {
                GameEngine.m3e("Crash was not handled, exiting");
                Runtime.getRuntime().halt(1);
            }
        } catch (Throwable th3) {
            try {
                GameEngine.m3e("Exception in uncaughtException");
                th3.printStackTrace();
                if (0 == 0) {
                    GameEngine.m3e("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
            } catch (Throwable th4) {
                if (0 == 0) {
                    GameEngine.m3e("Crash was not handled, exiting");
                    Runtime.getRuntime().halt(1);
                }
                throw th4;
            }
        }
    }
}