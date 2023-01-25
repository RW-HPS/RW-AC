package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.appFramework.C0121m;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.C0193j;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0979n;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.lang.reflect.Field;
import java.util.Iterator;
import org.lwjgl.input.Mouse;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.OpenGLException;
import org.newdawn.slick.BasicGame;
import org.newdawn.slick.Color;
import org.newdawn.slick.GameContainer;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Image;
import org.newdawn.slick.imageout.ImageOut;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.SGL;

/* renamed from: com.corrodinggames.rts.java.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/u.class */
public class RWBasicGame extends BasicGame {

    /* renamed from: a */
    GameContainer f7492a;

    /* renamed from: b */
    Main f7493b;

    /* renamed from: c */
    RWAppGameContainer f7494c;

    /* renamed from: d */
    C0979n f7495d;

    /* renamed from: e */
    GameEngine f7496e;

    /* renamed from: f */
    C1205d f7497f;

    /* renamed from: g */
    boolean f7498g;

    /* renamed from: h */
    Object f7499h;

    /* renamed from: i */
    boolean f7500i;

    /* renamed from: j */
    boolean f7501j;

    /* renamed from: k */
    boolean f7502k;

    /* renamed from: l */
    boolean f7503l;

    /* renamed from: m */
    LoadImage f7504m;

    /* renamed from: n */
    LoadImage f7505n;

    /* renamed from: o */
    boolean f7506o;

    /* renamed from: p */
    boolean f7507p;

    /* renamed from: q */
    boolean f7508q;

    /* renamed from: r */
    boolean f7509r;

    /* renamed from: s */
    boolean f7510s;

    /* renamed from: t */
    int f7511t;

    /* renamed from: u */
    boolean f7512u;

    /* renamed from: v */
    boolean f7513v;

    /* renamed from: w */
    float f7514w;

    /* renamed from: x */
    float f7515x;

    /* renamed from: y */
    boolean f7516y;

    /* renamed from: Z */
    private boolean[] f7517Z;

    /* renamed from: z */
    int f7518z;

    /* renamed from: A */
    float f7519A;

    /* renamed from: B */
    float f7520B;

    /* renamed from: C */
    int f7521C;

    /* renamed from: D */
    int f7522D;

    /* renamed from: E */
    int f7523E;

    /* renamed from: F */
    int f7524F;

    /* renamed from: G */
    int f7525G;

    /* renamed from: H */
    int f7526H;

    /* renamed from: I */
    boolean f7527I;

    /* renamed from: J */
    boolean f7528J;

    /* renamed from: K */
    float f7529K;

    /* renamed from: L */
    int f7530L;

    /* renamed from: M */
    String f7531M;

    /* renamed from: N */
    String f7532N;

    /* renamed from: O */
    long f7533O;

    /* renamed from: P */
    float f7534P;

    /* renamed from: Q */
    float f7535Q;

    /* renamed from: R */
    float f7536R;

    /* renamed from: S */
    int f7537S;

    /* renamed from: T */
    int f7538T;

    /* renamed from: U */
    long f7539U;

    /* renamed from: V */
    float f7540V;

    /* renamed from: W */
    float f7541W;

    /* renamed from: X */
    int f7542X;

    /* renamed from: Y */
    C0193j f7543Y;

    public RWBasicGame(String str) {
        super(str);
        this.f7498g = false;
        this.f7499h = new Object();
        this.f7500i = false;
        this.f7501j = false;
        this.f7502k = false;
        this.f7503l = false;
        this.f7507p = false;
        this.f7508q = false;
        this.f7509r = false;
        this.f7510s = false;
        this.f7512u = false;
        this.f7516y = false;
        this.f7517Z = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];
        this.f7518z = 0;
        this.f7519A = 0.0f;
        this.f7520B = 0.0f;
        this.f7521C = 0;
        this.f7522D = 0;
        this.f7529K = 0.0f;
        this.f7530L = 0;
        this.f7531M = VariableScope.nullOrMissingString;
        this.f7532N = VariableScope.nullOrMissingString;
        this.f7533O = -9999L;
        this.f7534P = 1.0f;
        this.f7535Q = 1.0f;
        this.f7536R = 1.0f;
        this.f7537S = 100;
        this.f7538T = 100;
        this.f7540V = 0.0f;
        this.f7541W = 0.0f;
    }

    public boolean closeRequested() {
        if (!this.f7500i && !ScriptServerSocket.m5461a() && this.f7494c != null && !this.f7494c.isFullscreen()) {
            ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
            return false;
        }
        return true;
    }

    public void init(GameContainer gameContainer) {
        this.f7492a = gameContainer;
        gameContainer.setAlwaysRender(true);
        gameContainer.setForceExit(true);
        gameContainer.setShowFPS(false);
        gameContainer.setTargetFrameRate(300);
        if (GameEngine.f6296ay) {
            gameContainer.setShowFPS(true);
            gameContainer.setTargetFrameRate(30);
        }
        gameContainer.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
        gameContainer.setUpdateOnlyWhenVisible(false);
        gameContainer.getInput().enableKeyRepeat();
        this.f7504m = C1208e.m165b(C0067R.drawable.logo, true);
        this.f7505n = C1208e.m165b(C0067R.drawable.pointer, true);
        gameContainer.setMouseCursor(this.f7505n.mo414C(), 0, 0);
        this.f7539U = System.currentTimeMillis();
    }

    /* renamed from: a */
    public void m41a() {
        this.f7496e = GameEngine.getGameEngine();
        if (this.f7492a.isVSyncRequested() != this.f7496e.settingsEngine.renderVsync) {
            try {
                this.f7492a.setVSync(this.f7496e.settingsEngine.renderVsync);
            } catch (OpenGLException e) {
                GameEngine.m1175a("Error while changing vsync setting", (Throwable) e);
            }
        }
        if (this.f7496e.settingsEngine.highRefreshRate) {
            this.f7492a.setTargetFrameRate(300);
        } else {
            this.f7492a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.f7496e.settingsEngine.enableMouseCapture && ((!this.f7496e.settingsEngine.slick2dFullScreen || this.f7496e.f6374cU) && !this.f7496e.f6294aq && !this.f7496e.m1172a(false) && this.f7496e.f6448bq)) {
            z = true;
        }
        if (z != this.f7513v) {
            GameEngine.m5925e("Grabbing mouse:" + z);
            this.f7513v = z;
            if (!this.f7512u) {
                this.f7492a.setMouseGrabbed(this.f7513v);
            }
            if (this.f7513v) {
            }
            if (!this.f7513v) {
                Mouse.setCursorPosition((int) (this.f7514w * this.f7534P), (int) (Display.getHeight() - (this.f7515x * this.f7534P)));
            }
            GameEngine.f6306aR = this.f7513v;
        }
        this.f7492a.setSmoothDeltas(this.f7496e.settingsEngine.renderSmoothDelta);
        if (this.f7506o != Display.isActive()) {
            this.f7506o = Display.isActive();
            if (this.f7506o) {
                m21f();
            }
        }
    }

    /* renamed from: b */
    public void m28b() {
        if (this.f7507p) {
            GameEngine.m1104g("loadingStartedThreaded");
            return;
        }
        this.f7507p = true;
        m25c();
    }

    /* renamed from: c */
    public void m25c() {
        if (this.f7508q) {
            GameEngine.m1104g("loadingStartedNonThreaded");
            return;
        }
        this.f7508q = true;
        if (this.f7493b == null) {
            this.f7493b = new Main();
        }
        this.f7493b.m417h();
        if (GameEngine.f6409aI) {
            GameEngine.m5925e("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.f7509r = true;
    }

    /* renamed from: a */
    public void m35a(C1205d c1205d) {
        GameEngine.print("SlickContainer:setup");
        this.f7496e = GameEngine.getGameEngine();
        this.f7497f = c1205d;
        this.f7497f.f7362d = new C0121m();
        this.f7497f.f7360a = this.f7492a.getWidth();
        this.f7497f.f7361b = this.f7492a.getHeight();
        this.f7496e.m1134b(this.f7497f.f7360a, this.f7497f.f7361b);
        this.f7495d = new C0979n();
    }

    public void update(GameContainer gameContainer, int i) {
        this.f7511t = i;
    }

    /* renamed from: a */
    public int m39a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        GameEngine.m5925e("Unknown mouse button:" + i);
        return 0;
    }

    /* renamed from: a */
    public void m37a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.f7516y) {
            GameEngine.m5925e("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.f7513v) {
            this.f7514w = (int) (i / this.f7534P);
            this.f7515x = (int) (i2 / this.f7534P);
            return;
        }
        if (z) {
            if (this.f7512u) {
                i3 = i - this.f7537S;
                i4 = i2 - this.f7538T;
            } else {
                i3 = i;
                i4 = i2;
            }
            this.f7514w += i3 / this.f7534P;
            this.f7515x += i4 / this.f7534P;
        } else {
            this.f7514w = (int) (i / this.f7534P);
            this.f7515x = (int) (i2 / this.f7534P);
        }
        if (this.f7514w < 0.0f) {
            this.f7514w = 0.0f;
        }
        if (this.f7515x < 0.0f) {
            this.f7515x = 0.0f;
        }
        if (this.f7497f != null) {
            if (this.f7514w > this.f7497f.m237o() - 1) {
                this.f7514w = this.f7497f.m237o() - 1;
            }
            if (this.f7515x > this.f7497f.m236p() - 1) {
                this.f7515x = this.f7497f.m236p() - 1;
                return;
            }
            return;
        }
        GameEngine.m5925e("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            m40a(this.f7514w, this.f7515x);
            this.f7493b.f7200p.processMouseButtonDown(0, 0);
        } else if (this.f7497f != null && (m39a = m39a(i)) != 0) {
            this.f7497f.f7362d.m5371a(this.f7514w, this.f7515x, true, m39a);
        }
    }

    /* renamed from: a */
    public void m40a(float f, float f2) {
        float f3 = f * this.f7534P;
        float f4 = f2 * this.f7534P;
        this.f7493b.f7200p.mouseMove((int) (f3 / this.f7536R), (int) (f4 / this.f7536R), 0);
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            m40a(this.f7514w, this.f7515x);
        } else if (this.f7497f != null) {
            this.f7497f.f7362d.m5372a(this.f7514w, this.f7515x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        m37a(i3, i4, true);
        if (m23d()) {
            m40a(this.f7514w, this.f7515x);
        } else if (this.f7497f != null) {
            this.f7497f.f7362d.m5372a(this.f7514w, this.f7515x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int m39a;
        m37a(i2, i3, false);
        if (m23d()) {
            this.f7493b.f7200p.processMouseButtonUp(0, 0);
        } else if (this.f7497f != null && (m39a = m39a(i)) != 0) {
            this.f7497f.f7362d.m5371a(this.f7514w, this.f7515x, false, m39a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (m23d()) {
            this.f7493b.f7200p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.f7496e != null) {
            this.f7496e.m1097k(i);
        }
    }

    /* renamed from: d */
    boolean m23d() {
        if (this.f7493b != null && this.f7493b.f7200p != null && !this.f7493b.f7200p.m5480b()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m27b(int i) {
        if (i >= this.f7517Z.length || i < 0) {
            return false;
        }
        return this.f7517Z[i];
    }

    /* renamed from: e */
    public int m22e() {
        int i = 0;
        if (m27b(42) || m27b(54)) {
            i = 0 + 2;
        }
        if (m27b(29) || m27b(157)) {
            i++;
        }
        if (m27b(56) || m27b(184)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: a */
    public void m36a(int i, boolean z) {
        if (i >= this.f7517Z.length || i < 0) {
            return;
        }
        this.f7517Z[i] = z;
    }

    /* renamed from: f */
    public void m21f() {
        for (int i = 0; i < this.f7517Z.length; i++) {
            if (this.f7517Z[i]) {
                m24c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        m36a(i, true);
        if (this.f7493b.f7193i == null) {
            GameEngine.m5925e("keyPressed: guiEngine==null");
        } else {
            this.f7493b.f7193i.m5509a(i, c);
        }
    }

    /* renamed from: c */
    public void m24c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        m36a(i, false);
        if (m23d()) {
            Integer m762c = SlickToAndroidKeycodes.m762c(i);
            if (m762c != null) {
                this.f7493b.f7200p.processKeyUp(m762c.intValue(), m22e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.f7496e != null) {
            this.f7496e.m1133b(SlickToAndroidKeycodes.m764b(i), false);
        }
    }

    /* renamed from: a */
    public void m38a(int i, int i2) {
        this.f7523E = i;
        this.f7524F = i2;
        m20g();
    }

    /* renamed from: g */
    public void m20g() {
        if (this.f7503l || this.f7500i) {
            return;
        }
        try {
            boolean z = this.f7496e.settingsEngine.slick2dFullScreen;
            boolean z2 = this.f7496e.settingsEngine.slick2dBorderless;
            if (z2) {
                z = true;
            }
            int i = this.f7523E;
            int i2 = this.f7524F;
            if (z) {
                i = this.f7494c.getScreenWidth();
                i2 = this.f7494c.getScreenHeight();
                String str = this.f7496e.settingsEngine.slick2dFullScreenResolution;
                if (str == null) {
                    GameEngine.m5925e("fullScreenResolutionString is null");
                    str = "native";
                }
                if (!str.equals("native")) {
                    String[] split = str.split("x");
                    if (split.length != 2) {
                        GameEngine.print("Unknown resolution format:" + str);
                    } else {
                        Integer m2238l = C0773f.m2238l(split[0]);
                        Integer m2238l2 = C0773f.m2238l(split[1]);
                        if (m2238l == null || m2238l2 == null) {
                            GameEngine.print("Bad resolution int:" + str);
                        } else {
                            i = m2238l.intValue();
                            i2 = m2238l2.intValue();
                        }
                    }
                }
            }
            float f = 1.0f;
            if (i > 3360.0f || i2 > 1890.0f) {
                f = 2.0f;
            } else if (i > 2688.0f || i2 > 1512.0f) {
                f = 1.5f;
            }
            float f2 = f * this.f7496e.settingsEngine.uiRenderScale;
            float f3 = this.f7496e.settingsEngine.renderDensity;
            if (this.f7527I == z && this.f7528J == z2 && this.f7523E == this.f7525G && this.f7524F == this.f7526H && C0773f.m2250h(f2, this.f7534P) && C0773f.m2250h(f3, this.f7535Q)) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            boolean z3 = this.f7528J != z2;
            this.f7534P = f2;
            this.f7535Q = f3;
            this.f7536R = this.f7534P;
            this.f7536R *= ((this.f7535Q - 1.0f) * 0.5f) + 1.0f;
            this.f7525G = this.f7523E;
            this.f7526H = this.f7524F;
            this.f7527I = z;
            this.f7528J = z2;
            boolean z4 = false;
            if (z2 && z) {
                z4 = true;
            }
            System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
            if (z) {
                GameEngine.m5925e("screen: " + this.f7494c.getScreenWidth() + ", " + this.f7494c.getScreenHeight());
                GameEngine.m5925e("container: " + this.f7492a.getWidth() + ", " + this.f7492a.getHeight());
                if (z2) {
                    this.f7494c.setDisplayMode(i3, i4, false);
                } else {
                    this.f7494c.setDisplayMode(i3, i4, true);
                }
            } else {
                boolean z5 = false;
                if (this.f7494c.isFullscreen()) {
                    z5 = true;
                }
                if (z3) {
                    z5 = true;
                    if (i3 > 2 && i4 > 2) {
                        this.f7494c.setDisplayMode(i3 - 1, i4 - 1, false);
                    }
                }
                if (z5) {
                    this.f7494c.setDisplayMode(i3, i4, false);
                    Display.setResizable(false);
                    Display.setResizable(true);
                } else {
                    SGL sgl = Renderer.get();
                    sgl.initDisplay(i3, i4);
                    sgl.enterOrtho(i3, i4);
                    Field declaredField = GameContainer.class.getDeclaredField("width");
                    declaredField.setAccessible(true);
                    declaredField.set(this.f7494c, Integer.valueOf(i3));
                    Field declaredField2 = GameContainer.class.getDeclaredField("height");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.f7494c, Integer.valueOf(i4));
                }
            }
            this.f7537S = Display.getWidth() / 2;
            this.f7538T = Display.getHeight() / 2;
            int i5 = (int) (i3 / this.f7534P);
            int i6 = (int) (i4 / this.f7534P);
            int i7 = (int) (i3 / this.f7536R);
            int i8 = (int) (i4 / this.f7536R);
            if (this.f7497f != null) {
                this.f7497f.f7360a = i5;
                this.f7497f.f7361b = i6;
            } else {
                GameEngine.m5925e("setResolution: gameView=null");
            }
            if (this.f7496e != null) {
                this.f7496e.m1134b(i5, i6);
                this.f7496e.m1199X();
            } else {
                GameEngine.m5925e("setResolution: game=null");
            }
            if (this.f7493b != null && this.f7493b.f7200p != null) {
                this.f7493b.f7200p.setDimensionsWrap(i7, i8);
            } else {
                GameEngine.m5925e("setResolution: main.libRocket=null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m33a(String str, boolean z) {
        boolean z2 = true;
        if (!str.startsWith("Loading units ")) {
            GameEngine.m5925e("--Now loading:" + str);
            z2 = false;
        }
        if (z) {
            this.f7532N = this.f7531M;
            this.f7531M = str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 && currentTimeMillis < this.f7533O + 10) {
            return;
        }
        this.f7533O = currentTimeMillis;
        Graphics m303a = this.f7494c.m303a();
        m32a((GameContainer) this.f7494c, m303a);
        this.f7494c.m302a(m303a);
    }

    /* renamed from: a */
    public void m32a(GameContainer gameContainer, Graphics graphics) {
        this.f7529K += this.f7511t;
        this.f7530L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.f7504m != null) {
            graphics.drawImage(this.f7504m.mo414C(), (Display.getWidth() / 2) - (this.f7504m.f6622p / 2), (Display.getHeight() / 2) - (this.f7504m.f6623q / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.f7530L % 4; i++) {
            str = str + ".";
        }
        String m2262e = C0773f.m2262e("    " + str, 17);
        int width = graphics.getFont().getWidth(m2262e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(m2262e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.f7531M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.f7531M) / 2), height + 20);
    }

    /* renamed from: a */
    public void m34a(C1208e c1208e) {
        c1208e.mo881k();
        if (this.f7534P != 1.0f) {
            c1208e.mo938a(this.f7534P, this.f7534P);
        }
    }

    /* renamed from: b */
    public void m26b(C1208e c1208e) {
        c1208e.mo880l();
    }

    /* renamed from: a */
    public void m30a(Graphics graphics, float f) {
        graphics.pushTransform();
        graphics.scale(f, f);
    }

    /* renamed from: a */
    public void m31a(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.f7539U)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.f7539U);
        this.f7539U = currentTimeMillis;
        if (this.f7513v && this.f7512u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.f7537S, this.f7538T);
        }
        if (!this.f7509r) {
            m32a(gameContainer, graphics);
            if (!this.f7510s) {
                this.f7510s = true;
            } else if (!this.f7507p) {
                m28b();
            }
        } else if (this.f7496e == null) {
            GameEngine.print("render: game==null");
        } else {
            m41a();
            float f2 = this.f7511t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (width != this.f7525G || height != this.f7526H) {
                if (this.f7521C != width || this.f7522D != height) {
                    this.f7521C = width;
                    this.f7522D = height;
                    this.f7520B = 0.0f;
                }
                this.f7520B += f2;
                this.f7519A += f2;
                if (this.f7519A > 300.0f || this.f7520B > 20.0f || this.f7519A > 0.0f) {
                    this.f7519A = 0.0f;
                    this.f7520B = 0.0f;
                    m38a(width, height);
                }
            }
            float f3 = this.f7536R;
            this.f7493b.m435a(f2);
            if (this.f7496e.settingsEngine.liveReloading) {
                this.f7518z++;
                if (this.f7518z > 30) {
                    this.f7518z = 0;
                    if (LoadImage.f7471y != null) {
                        Iterator it = LoadImage.f7471y.iterator();
                        while (it.hasNext()) {
                            ((LoadImage) it.next()).mo387t();
                        }
                    }
                    if (!this.f7496e.m1103h(48)) {
                        this.f7493b.f7200p.detectChangesAndReload();
                    }
                }
            }
            boolean z = false;
            C1208e c1208e = null;
            if (!this.f7496e.f6455bG) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                if (!m23d() && !this.f7496e.f6457bI) {
                    this.f7542X++;
                    if (this.f7542X > 100) {
                        this.f7542X = 0;
                        GameEngine.m5925e("Fail safe menu");
                        AbstractC0043a.m5510a().m5504b();
                    }
                }
            } else {
                this.f7542X = 0;
            }
            boolean m2921a = this.f7496e.f6331bT.f4170ae.m2921a();
            boolean z2 = this.f7496e.f6444bl && this.f7496e.f6331bT.f4171af.m2921a();
            if (z2) {
                m2921a = true;
            }
            if (this.f7496e.f6455bG) {
                graphics.resetTransform();
                if (!this.f7496e.f6486dv) {
                    graphics.clearClip();
                    graphics.clear();
                }
                graphics.setColor(Color.black);
                if (!GameEngine.f6299aB) {
                    c1208e = (C1208e) this.f7496e.f6326bO;
                    if (c1208e != null) {
                        c1208e.f7378f = graphics;
                        c1208e.f7411L = this.f7534P;
                        z = true;
                        m34a(c1208e);
                    }
                }
                boolean z3 = this.f7496e.f6372cS;
                if (m2921a) {
                    this.f7496e.f6372cS = true;
                }
                this.f7496e.m1193a(f2, this.f7511t);
                if (m2921a) {
                    this.f7496e.f6372cS = z3;
                }
                this.f7511t = 0;
                if (!GameEngine.f6299aB && z) {
                    m26b(c1208e);
                }
            } else {
                this.f7496e.netEngine.m1645b(f2);
                this.f7496e.f6325bN.m2900a(f2);
            }
            m30a(graphics, f3);
            SteamEngine.getSteamEngine().m789a(0.0f);
            this.f7493b.f7200p.f359c.update(f2);
            if (!this.f7493b.f7200p.m5480b()) {
                this.f7493b.f7200p.m234a(graphics);
                this.f7493b.f7200p.update();
                this.f7493b.f7200p.render();
                this.f7493b.f7200p.f359c.checkForErrors();
                this.f7493b.f7200p.debug = false;
            }
            this.f7493b.f7200p.postUpdate();
            m31a(graphics);
            if (this.f7500i) {
                graphics.clear();
            }
            if (this.f7513v && !m2921a && !this.f7496e.f6374cU) {
                graphics.drawImage(this.f7505n.mo414C(), this.f7514w * this.f7534P, this.f7515x * this.f7534P);
            }
            if (m2921a) {
                m29a(graphics, z2);
            }
            if (this.f7493b.f7205u) {
                this.f7493b.f7206v++;
                if (this.f7493b.f7206v > 2) {
                    this.f7493b.f7205u = false;
                    this.f7493b.f7206v = 0;
                    GameEngine.m5925e("Saving settings (queued)");
                    this.f7496e.settingsEngine.save();
                }
            }
        }
    }

    /* renamed from: a */
    public void m29a(Graphics graphics, boolean z) {
        C1205d c1205d = this.f7497f;
        int i = 10;
        int i2 = 10;
        if (c1205d != null) {
            i = c1205d.f7360a;
            i2 = c1205d.f7361b;
        }
        try {
            try {
                GameEngine.m5925e("Saving screenshot");
                File file = new File("screenshots");
                if (!file.exists()) {
                    file.mkdir();
                }
                final String str = "screenshot_" + C0773f.m2320a("d MMM yyyy HH.mm.ss") + ".png";
                final String str2 = "screenshots" + File.separator + str;
                if (!z) {
                    Image image = new Image(this.f7494c.getWidth(), this.f7494c.getHeight());
                    graphics.copyArea(image, 0, 0);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ImageOut.write(image, "png", byteArrayOutputStream);
                    GameEngine.m1107f(null, "Saving screenshot: " + str);
                    new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.u.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                fileOutputStream.close();
                                GameEngine.m5925e("Screenshot saved: " + str);
                            } catch (Exception e) {
                                e.printStackTrace();
                                GameEngine.m1090n("Failed to write screenshot:" + e.getMessage());
                            }
                        }
                    }).start();
                    if (c1205d != null) {
                        c1205d.f7360a = i;
                        c1205d.f7361b = i2;
                        return;
                    }
                    return;
                }
                if (this.f7543Y == null) {
                    this.f7543Y = new C0193j();
                }
                int i3 = (int) (c1205d.f7360a * 2.0f);
                int i4 = (int) (c1205d.f7361b * 2.0f);
                InterfaceC1063y interfaceC1063y = this.f7496e.f6326bO;
                this.f7543Y.m4919a(interfaceC1063y, i3, i4, 0);
                C0191i c0191i = (C0191i) this.f7496e;
                boolean z2 = this.f7496e.f6372cS;
                c0191i.m4964a(this.f7543Y);
                this.f7496e.f6372cS = true;
                try {
                    this.f7496e.f6326bO.mo897b(android.graphics.Color.m5708a(0, 0, 0));
                    c1205d.mo250b(true);
                    c0191i.m4954b(i3, i4);
                    c0191i.m4937k();
                    c0191i.m4969a(0.0f, 0);
                    c0191i.m4954b(i, i2);
                    c0191i.m4937k();
                    c0191i.m4953b(this.f7543Y);
                    this.f7496e.f6372cS = z2;
                    interfaceC1063y.mo910a(this.f7543Y.f1280a, new File(str2));
                    GameEngine.m1107f(null, "Saving large screenshot: " + str);
                    if (c1205d != null) {
                        c1205d.f7360a = i;
                        c1205d.f7361b = i2;
                    }
                } catch (Throwable th) {
                    c0191i.m4953b(this.f7543Y);
                    this.f7496e.f6372cS = z2;
                    throw th;
                }
            } catch (Throwable th2) {
                if (c1205d != null) {
                    c1205d.f7360a = i;
                    c1205d.f7361b = i2;
                }
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            GameEngine.m1090n("Failed to take screenshot:" + e.getMessage());
            if (c1205d != null) {
                c1205d.f7360a = i;
                c1205d.f7361b = i2;
            }
        }
    }
}