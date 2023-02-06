package com.corrodinggames.librocket;

import android.app.Activity;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.f;
import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.k;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/a.class */
public abstract class a {
    protected static a a;
    public b b;
    public f c;
    boolean d = true;
    boolean e = true;

    public abstract void g();

    public abstract void h();

    public abstract int i();

    public abstract void d(boolean z);

    public static a a() {
        return a;
    }

    public void a(b bVar, f fVar) {
        this.b = bVar;
        this.c = fVar;
    }

    public void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null) {
            gameEngine.a((Activity) null, this.c, true);
        } else {
            GameEngine.m5e("showMainMenu: game is null");
        }
        this.b.setDocument("mainMenu.rml");
    }

    public void c() {
    }

    public void d() {
        this.b.setDocument("settings.rml");
    }

    public void e() {
        this.b.setDocument("leaderboard.rml");
    }

    public synchronized void a(boolean z) {
        this.e = z;
        f();
    }

    public synchronized void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine == null) {
            GameEngine.print("Main::resumeGame(): game==null");
            return;
        }
        gameEngine.bD = true;
        gameEngine.a((Activity) null, this.c, this.e);
    }

    public synchronized void b(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            GameEngine.m5e("endGame: queDisconnectAndWait");
            gameEngine.netEngine.u();
            return;
        }
        GameEngine.m5e("endGame: network disconnect");
        gameEngine.netEngine.closeServer("shutdownServer");
    }

    public synchronized void a(String str) {
        b(true);
        GameEngine.getGameEngine();
        this.e = false;
        i.a(str, false, 8, 0, true, false);
        f();
    }

    public void c(boolean z) {
        this.e = z;
    }

    public boolean j() {
        if (this.b != null && !this.b.b()) {
            return true;
        }
        return false;
    }

    public void a(int i, char c) {
        int b = SlickToAndroidKeycodes.b(i);
        if (j()) {
            Integer c2 = SlickToAndroidKeycodes.c(i);
            Object b2 = this.b.b("event_onkeydown");
            if (b2 != null) {
                ScriptEngine.getInstance().addScriptToQueue(b2 + "(" + b + ");");
                if (this.b.c() != null) {
                    return;
                }
            }
            if (c > '\u00ff') {
                ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.a.1
                    @Override // java.lang.Runnable
                    public void run() {
                        a.this.b.c.getRoot().event_unicodeEntered();
                    }
                });
            }
            if (i == 30 && i() == 1) {
                this.b.processKeyDown(93, 0);
                this.b.processKeyUp(93, 0);
                this.b.processKeyDown(91, 2);
                this.b.processKeyUp(91, 2);
                return;
            } else if (i == 46 && i() == 1) {
                this.b.processKeyDown(14, 1);
                return;
            } else if (i == 47 && i() == 1) {
                this.b.processKeyDown(33, 1);
                return;
            } else {
                if (c2 != null) {
                    this.b.processKeyDown(c2.intValue(), i());
                } else if (c != 0) {
                    if (Character.isISOControl(c)) {
                        if (c == '\b') {
                            GameEngine.m5e("backspace char pressed");
                            this.b.processKeyDown(69, 0);
                            this.b.processKeyUp(69, 0);
                        } else {
                            GameEngine.m5e("keyPressed skipping isISOControl:" + i + " c:" + ((int) c) + " c_print:" + c);
                        }
                    } else {
                        this.b.processTextInputChar(c);
                    }
                }
                if (i == 28 || i == 156) {
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                } else if (c == '\r') {
                    GameEngine.m5e("keyPressed: new line entered");
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                }
                if (i == 1) {
                    ScriptEngine.getInstance().addScriptToQueue("onEscape();");
                    return;
                }
                return;
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null) {
            gameEngine.b(b, true);
            if (i == 1) {
            }
        }
    }

    public LinkedList k() {
        return null;
    }

    public boolean b(String str) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    GameEngine.m5e("Opening link from desktop api");
                    Desktop.getDesktop().browse(new URI(str));
                    return true;
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (URISyntaxException e2) {
                    e2.printStackTrace();
                }
            } else {
                String lowerCase = System.getProperty("os.name").toLowerCase();
                String[] strArr = null;
                if (lowerCase.contains("win")) {
                    strArr = new String[]{"rundll32", "url.dll,FileProtocolHandler", str};
                }
                if (lowerCase.contains("mac")) {
                    strArr = new String[]{"open", str};
                }
                if (lowerCase.contains("nix") || lowerCase.contains("nux")) {
                    strArr = new String[]{"xdg-open", str};
                }
                if (strArr != null) {
                    try {
                        Runtime.getRuntime().exec(strArr);
                        return true;
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
                return false;
            }
        } catch (RuntimeException e4) {
            e4.printStackTrace();
            return false;
        }
        e4.printStackTrace();
        return false;
    }

    public void l() {
    }

    public void m() {
    }

    public void n() {
    }

    public void o() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getGameEngine().netEngine.aW && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueue("mp.closeBattleroomIfOpen()");
        }
    }

    public void a(EnterPasswordCallback enterPasswordCallback) {
        GameEngine.getGameEngine();
        ScriptEngine scriptEngine = ScriptEngine.getInstance();
        if (scriptEngine != null) {
            scriptEngine.addRunnableToQueue(new AnonymousClass2(scriptEngine, enterPasswordCallback));
        }
    }

    /* renamed from: com.corrodinggames.librocket.a$2  reason: invalid class name */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2.class */
    class AnonymousClass2 implements Runnable {
        final k a = new k(false);
        final /* synthetic */ ScriptEngine b;
        final /* synthetic */ EnterPasswordCallback c;

        AnonymousClass2(ScriptEngine scriptEngine, EnterPasswordCallback enterPasswordCallback) {
            this.b = scriptEngine;
            this.c = enterPasswordCallback;
        }

        @Override // java.lang.Runnable
        public void run() {
            final Root root = this.b.getRoot();
            e eVar = new e(this.c.f != null ? this.c.f : "Join", new Runnable() { // from class: com.corrodinggames.librocket.a.2.1
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass2.this.a.a) {
                        GameEngine.print("AskPasswordCallBack already called");
                        return;
                    }
                    AnonymousClass2.this.a.a = true;
                    String popupText = root.getPopupText();
                    root.closeAlertOnly();
                    AnonymousClass2.this.c.a(popupText);
                }
            });
            eVar.c = true;
            Runnable runnable = new Runnable() { // from class: com.corrodinggames.librocket.a.2.2
                @Override // java.lang.Runnable
                public void run() {
                    if (AnonymousClass2.this.a.a) {
                        GameEngine.print("AskPasswordCallBack already called");
                        return;
                    }
                    AnonymousClass2.this.a.a = true;
                    root.closeAlertOnly();
                    AnonymousClass2.this.c.a();
                }
            };
            e eVar2 = new e(this.c.g != null ? this.c.g : "Close", runnable);
            String str = "Password Required";
            String str2 = "This server requires a password to join";
            if (this.c.b != null) {
                str = "Server Question";
                str2 = com.corrodinggames.rts.gameFramework.translations.a.c(this.c.b);
            }
            if (this.c.e != null) {
                str = this.c.e;
            }
            d dVar = new d();
            dVar.b = str;
            dVar.c = str2;
            dVar.d = VariableScope.nullOrMissingString;
            dVar.e = eVar2;
            dVar.f = eVar;
            dVar.h = false;
            dVar.i = runnable;
            a.this.b.a(dVar);
        }
    }
}