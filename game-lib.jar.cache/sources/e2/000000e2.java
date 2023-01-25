package com.corrodinggames.librocket;

import android.app.Activity;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.utility.C1134k;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.awt.Desktop;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.librocket.a */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/a.class */
public abstract class AbstractC0043a {

    /* renamed from: a */
    protected static AbstractC0043a f343a;

    /* renamed from: b */
    public AbstractC0048b f344b;

    /* renamed from: c */
    public InterfaceC0096f f345c;

    /* renamed from: d */
    boolean f346d = true;

    /* renamed from: e */
    boolean f347e = true;

    /* renamed from: g */
    public abstract void mo300g();

    /* renamed from: h */
    public abstract void mo299h();

    /* renamed from: i */
    public abstract int mo298i();

    /* renamed from: d */
    public abstract void mo301d(boolean z);

    /* renamed from: a */
    public static AbstractC0043a m5493a() {
        return f343a;
    }

    /* renamed from: a */
    public void m5491a(AbstractC0048b abstractC0048b, InterfaceC0096f interfaceC0096f) {
        this.f344b = abstractC0048b;
        this.f345c = interfaceC0096f;
    }

    /* renamed from: b */
    public void m5487b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null) {
            gameEngine.m1182a((Activity) null, this.f345c, true);
        } else {
            GameEngine.m5907e("showMainMenu: game is null");
        }
        this.f344b.setDocument("mainMenu.rml");
    }

    /* renamed from: c */
    public void m5484c() {
    }

    /* renamed from: d */
    public void m5482d() {
        this.f344b.setDocument("settings.rml");
    }

    /* renamed from: e */
    public void m5481e() {
        this.f344b.setDocument("leaderboard.rml");
    }

    /* renamed from: a */
    public synchronized void m5488a(boolean z) {
        this.f347e = z;
        m5480f();
    }

    /* renamed from: f */
    public synchronized void m5480f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine == null) {
            GameEngine.print("Main::resumeGame(): game==null");
            return;
        }
        gameEngine.f6320bD = true;
        gameEngine.m1182a((Activity) null, this.f345c, this.f347e);
    }

    /* renamed from: b */
    public synchronized void m5485b(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            GameEngine.m5907e("endGame: queDisconnectAndWait");
            gameEngine.netEngine.m1552u();
            return;
        }
        GameEngine.m5907e("endGame: network disconnect");
        gameEngine.netEngine.closeServer("shutdownServer");
    }

    /* renamed from: a */
    public synchronized void m5489a(String str) {
        m5485b(true);
        GameEngine.getGameEngine();
        this.f347e = false;
        ActivityC0117i.m5366a(str, false, 8, 0, true, false);
        m5480f();
    }

    /* renamed from: c */
    public void m5483c(boolean z) {
        this.f347e = z;
    }

    /* renamed from: j */
    public boolean m5479j() {
        if (this.f344b != null && !this.f344b.m5463b()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m5492a(int i, char c) {
        int m764b = SlickToAndroidKeycodes.m764b(i);
        if (m5479j()) {
            Integer m762c = SlickToAndroidKeycodes.m762c(i);
            Object m5460b = this.f344b.m5460b("event_onkeydown");
            if (m5460b != null) {
                ScriptEngine.getInstance().addScriptToQueue(m5460b + "(" + m764b + ");");
                if (this.f344b.m5458c() != null) {
                    return;
                }
            }
            if (c > '\u00ff') {
                ScriptEngine.getInstance().addRunnableToQueue(new RunnableC00441());
            }
            if (i == 30 && mo298i() == 1) {
                this.f344b.processKeyDown(93, 0);
                this.f344b.processKeyUp(93, 0);
                this.f344b.processKeyDown(91, 2);
                this.f344b.processKeyUp(91, 2);
                return;
            } else if (i == 46 && mo298i() == 1) {
                this.f344b.processKeyDown(14, 1);
                return;
            } else if (i == 47 && mo298i() == 1) {
                this.f344b.processKeyDown(33, 1);
                return;
            } else {
                if (m762c != null) {
                    this.f344b.processKeyDown(m762c.intValue(), mo298i());
                } else if (c != 0) {
                    if (Character.isISOControl(c)) {
                        if (c == '\b') {
                            GameEngine.m5907e("backspace char pressed");
                            this.f344b.processKeyDown(69, 0);
                            this.f344b.processKeyUp(69, 0);
                        } else {
                            GameEngine.m5907e("keyPressed skipping isISOControl:" + i + " c:" + ((int) c) + " c_print:" + c);
                        }
                    } else {
                        this.f344b.processTextInputChar(c);
                    }
                }
                if (i == 28 || i == 156) {
                    ScriptEngine.getInstance().addScriptToQueue("onEnter();");
                } else if (c == '\r') {
                    GameEngine.m5907e("keyPressed: new line entered");
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
            gameEngine.m1126b(m764b, true);
            if (i == 1) {
            }
        }
    }

    /* renamed from: com.corrodinggames.librocket.a$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$1.class */
    class RunnableC00441 implements Runnable {
        RunnableC00441() {
        }

        public void run() {
            AbstractC0043a.this.f344b.f367c.getRoot().event_unicodeEntered();
        }
    }

    /* renamed from: k */
    public LinkedList m5478k() {
        return null;
    }

    /* renamed from: b */
    public boolean m5486b(String str) {
        try {
            if (Desktop.isDesktopSupported() && Desktop.getDesktop().isSupported(Desktop.Action.BROWSE)) {
                try {
                    GameEngine.m5907e("Opening link from desktop api");
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

    /* renamed from: l */
    public void m5477l() {
    }

    /* renamed from: m */
    public void m5476m() {
    }

    /* renamed from: n */
    public void m5475n() {
    }

    /* renamed from: o */
    public void m5474o() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getGameEngine().netEngine.f5749aW && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueue("mp.closeBattleroomIfOpen()");
        }
    }

    /* renamed from: a */
    public void m5490a(EnterPasswordCallback enterPasswordCallback) {
        GameEngine.getGameEngine();
        ScriptEngine scriptEngine = ScriptEngine.getInstance();
        if (scriptEngine != null) {
            scriptEngine.addRunnableToQueue(new RunnableC00452(scriptEngine, enterPasswordCallback));
        }
    }

    /* renamed from: com.corrodinggames.librocket.a$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2.class */
    class RunnableC00452 implements Runnable {

        /* renamed from: a */
        final C1134k f349a = new C1134k(false);

        /* renamed from: b */
        final /* synthetic */ ScriptEngine f350b;

        /* renamed from: c */
        final /* synthetic */ EnterPasswordCallback f351c;

        RunnableC00452(ScriptEngine scriptEngine, EnterPasswordCallback enterPasswordCallback) {
            this.f350b = scriptEngine;
            this.f351c = enterPasswordCallback;
        }

        public void run() {
            Root root = this.f350b.getRoot();
            C0051e c0051e = new C0051e(this.f351c.f5843f != null ? this.f351c.f5843f : "Join", new RunnableC00461(root));
            c0051e.f386c = true;
            RunnableC00472 runnableC00472 = new RunnableC00472(root);
            C0051e c0051e2 = new C0051e(this.f351c.f5844g != null ? this.f351c.f5844g : "Close", runnableC00472);
            String str = "Password Required";
            String str2 = "This server requires a password to join";
            if (this.f351c.f5839b != null) {
                str = "Server Question";
                str2 = C0855a.m1826c(this.f351c.f5839b);
            }
            if (this.f351c.f5842e != null) {
                str = this.f351c.f5842e;
            }
            C0050d c0050d = new C0050d();
            c0050d.f376b = str;
            c0050d.f377c = str2;
            c0050d.f378d = VariableScope.nullOrMissingString;
            c0050d.f379e = c0051e2;
            c0050d.f380f = c0051e;
            c0050d.f382h = false;
            c0050d.f383i = runnableC00472;
            AbstractC0043a.this.f344b.m5470a(c0050d);
        }

        /* renamed from: com.corrodinggames.librocket.a$2$1 */
        /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2$1.class */
        class RunnableC00461 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Root f353a;

            RunnableC00461(Root root) {
                this.f353a = root;
            }

            public void run() {
                if (RunnableC00452.this.f349a.f7102a) {
                    GameEngine.print("AskPasswordCallBack already called");
                    return;
                }
                RunnableC00452.this.f349a.f7102a = true;
                String popupText = this.f353a.getPopupText();
                this.f353a.closeAlertOnly();
                RunnableC00452.this.f351c.mo1542a(popupText);
            }
        }

        /* renamed from: com.corrodinggames.librocket.a$2$2 */
        /* loaded from: game-lib.jar:com/corrodinggames/librocket/a$2$2.class */
        class RunnableC00472 implements Runnable {

            /* renamed from: a */
            final /* synthetic */ Root f355a;

            RunnableC00472(Root root) {
                this.f355a = root;
            }

            public void run() {
                if (RunnableC00452.this.f349a.f7102a) {
                    GameEngine.print("AskPasswordCallBack already called");
                    return;
                }
                RunnableC00452.this.f349a.f7102a = true;
                this.f355a.closeAlertOnly();
                RunnableC00452.this.f351c.mo1543a();
            }
        }
    }
}