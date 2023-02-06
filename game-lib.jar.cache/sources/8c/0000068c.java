package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.EngineLoad;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.unitAction.y;
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
    GameContainer a;
    Main b;
    RWAppGameContainer c;
    com.corrodinggames.rts.gameFramework.unitAction.n d;
    GameEngine e;
    d f;
    boolean g;
    Object h;
    boolean i;
    boolean j;
    boolean k;
    boolean l;
    LoadImage m;
    LoadImage n;
    boolean o;
    boolean p;
    boolean q;
    boolean r;
    boolean s;
    int t;
    boolean u;
    boolean v;
    float w;
    float x;
    boolean y;
    private boolean[] Z;
    int z;
    float A;
    float B;
    int C;
    int D;
    int E;
    int F;
    int G;
    int H;
    boolean I;
    boolean J;
    float K;
    int L;
    String M;
    String N;
    long O;
    float P;
    float Q;
    float R;
    int S;
    int T;
    long U;
    float V;
    float W;
    int X;
    com.corrodinggames.rts.game.j Y;

    public RWBasicGame(String str) {
        super(str);
        this.g = false;
        this.h = new Object();
        this.i = false;
        this.j = false;
        this.k = false;
        this.l = false;
        this.p = false;
        this.q = false;
        this.r = false;
        this.s = false;
        this.u = false;
        this.y = false;
        this.Z = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP];
        this.z = 0;
        this.A = 0.0f;
        this.B = 0.0f;
        this.C = 0;
        this.D = 0;
        this.K = 0.0f;
        this.L = 0;
        this.M = VariableScope.nullOrMissingString;
        this.N = VariableScope.nullOrMissingString;
        this.O = -9999L;
        this.P = 1.0f;
        this.Q = 1.0f;
        this.R = 1.0f;
        this.S = 100;
        this.T = 100;
        this.V = 0.0f;
        this.W = 0.0f;
    }

    public boolean closeRequested() {
        if (!this.i && !ScriptServerSocket.a() && this.c != null && !this.c.isFullscreen()) {
            ScriptEngine.getInstance().addScriptToQueue("askQuitGame();");
            return false;
        }
        return true;
    }

    public void init(GameContainer gameContainer) {
        this.a = gameContainer;
        gameContainer.setAlwaysRender(true);
        gameContainer.setForceExit(true);
        gameContainer.setShowFPS(false);
        gameContainer.setTargetFrameRate(300);
        if (GameEngine.ay) {
            gameContainer.setShowFPS(true);
            gameContainer.setTargetFrameRate(30);
        }
        gameContainer.setIcons(new String[]{"res/drawable/icon_window.png", "res/drawable/icon_window128.png", "res/drawable/icon_window24.png", "res/drawable/icon_window16.png"});
        gameContainer.setUpdateOnlyWhenVisible(false);
        gameContainer.getInput().enableKeyRepeat();
        this.m = e.b(AssetsID.drawable.logo, true);
        this.n = e.b(AssetsID.drawable.pointer, true);
        gameContainer.setMouseCursor(this.n.C(), 0, 0);
        this.U = System.currentTimeMillis();
    }

    public void a() {
        this.e = GameEngine.getGameEngine();
        if (this.a.isVSyncRequested() != this.e.settingsEngine.renderVsync) {
            try {
                this.a.setVSync(this.e.settingsEngine.renderVsync);
            } catch (OpenGLException e) {
                GameEngine.a("Error while changing vsync setting", (Throwable) e);
            }
        }
        if (this.e.settingsEngine.highRefreshRate) {
            this.a.setTargetFrameRate(300);
        } else {
            this.a.setTargetFrameRate(120);
        }
        boolean z = false;
        if (this.e.settingsEngine.enableMouseCapture && ((!this.e.settingsEngine.slick2dFullScreen || this.e.cU) && !this.e.aq && !this.e.a(false) && this.e.bq)) {
            z = true;
        }
        if (z != this.v) {
            GameEngine.m5e("Grabbing mouse:" + z);
            this.v = z;
            if (!this.u) {
                this.a.setMouseGrabbed(this.v);
            }
            if (this.v) {
            }
            if (!this.v) {
                Mouse.setCursorPosition((int) (this.w * this.P), (int) (Display.getHeight() - (this.x * this.P)));
            }
            GameEngine.aR = this.v;
        }
        this.a.setSmoothDeltas(this.e.settingsEngine.renderSmoothDelta);
        if (this.o != Display.isActive()) {
            this.o = Display.isActive();
            if (this.o) {
                f();
            }
        }
    }

    public void b() {
        if (this.p) {
            GameEngine.g("loadingStartedThreaded");
            return;
        }
        this.p = true;
        c();
    }

    public void c() {
        if (this.q) {
            GameEngine.g("loadingStartedNonThreaded");
            return;
        }
        this.q = true;
        if (this.b == null) {
            this.b = new Main();
        }
        this.b.h();
        if (GameEngine.aI) {
            GameEngine.m5e("switching to sandbox");
            ScriptEngine.getInstance().addScriptToQueue("open('sandboxOptions.rml', 'maps/skirmish/[z;p10]Crossing Large (10p).tmx'); loadConfigAndStartNewSandbox('maps/skirmish/[z;p10]Crossing Large (10p).tmx');");
        }
        this.r = true;
    }

    public void a(d dVar) {
        GameEngine.print("SlickContainer:setup");
        this.e = GameEngine.getGameEngine();
        this.f = dVar;
        this.f.d = new com.corrodinggames.rts.appFramework.m();
        this.f.a = this.a.getWidth();
        this.f.b = this.a.getHeight();
        this.e.b(this.f.a, this.f.b);
        this.d = new com.corrodinggames.rts.gameFramework.unitAction.n();
    }

    public void update(GameContainer gameContainer, int i) {
        this.t = i;
    }

    public int a(int i) {
        if (i == 0) {
            return 1;
        }
        if (i == 1) {
            return 2;
        }
        if (i == 2) {
            return 3;
        }
        GameEngine.m5e("Unknown mouse button:" + i);
        return 0;
    }

    public void a(int i, int i2, boolean z) {
        int i3;
        int i4;
        if (this.y) {
            GameEngine.m5e("mouseGrab:m:" + z + ",newX:" + i + ",newY:" + i2);
        }
        if (!this.v) {
            this.w = (int) (i / this.P);
            this.x = (int) (i2 / this.P);
            return;
        }
        if (z) {
            if (this.u) {
                i3 = i - this.S;
                i4 = i2 - this.T;
            } else {
                i3 = i;
                i4 = i2;
            }
            this.w += i3 / this.P;
            this.x += i4 / this.P;
        } else {
            this.w = (int) (i / this.P);
            this.x = (int) (i2 / this.P);
        }
        if (this.w < 0.0f) {
            this.w = 0.0f;
        }
        if (this.x < 0.0f) {
            this.x = 0.0f;
        }
        if (this.f != null) {
            if (this.w > this.f.o() - 1) {
                this.w = this.f.o() - 1;
            }
            if (this.x > this.f.p() - 1) {
                this.x = this.f.p() - 1;
                return;
            }
            return;
        }
        GameEngine.m5e("processMouseGrab gameView==null");
    }

    public void mousePressed(int i, int i2, int i3) {
        int a;
        a(i2, i3, false);
        if (d()) {
            a(this.w, this.x);
            this.b.p.processMouseButtonDown(0, 0);
        } else if (this.f != null && (a = a(i)) != 0) {
            this.f.d.a(this.w, this.x, true, a);
        }
    }

    public void a(float f, float f2) {
        float f3 = f * this.P;
        float f4 = f2 * this.P;
        this.b.p.mouseMove((int) (f3 / this.R), (int) (f4 / this.R), 0);
    }

    public void mouseDragged(int i, int i2, int i3, int i4) {
        a(i3, i4, true);
        if (d()) {
            a(this.w, this.x);
        } else if (this.f != null) {
            this.f.d.a(this.w, this.x);
        }
    }

    public void mouseMoved(int i, int i2, int i3, int i4) {
        a(i3, i4, true);
        if (d()) {
            a(this.w, this.x);
        } else if (this.f != null) {
            this.f.d.a(this.w, this.x);
        }
    }

    public void mouseReleased(int i, int i2, int i3) {
        int a;
        a(i2, i3, false);
        if (d()) {
            this.b.p.processMouseButtonUp(0, 0);
        } else if (this.f != null && (a = a(i)) != 0) {
            this.f.d.a(this.w, this.x, false, a);
        }
    }

    public void mouseWheelMoved(int i) {
        if (d()) {
            this.b.p.processMouseWheel((-(i / 120)) * 2, 0);
        } else if (this.e != null) {
            this.e.k(i);
        }
    }

    boolean d() {
        if (this.b != null && this.b.p != null && !this.b.p.b()) {
            return true;
        }
        return false;
    }

    public boolean b(int i) {
        if (i >= this.Z.length || i < 0) {
            return false;
        }
        return this.Z[i];
    }

    public int e() {
        int i = 0;
        if (b(42) || b(54)) {
            i = 0 + 2;
        }
        if (b(29) || b(157)) {
            i++;
        }
        if (b(56) || b(184)) {
            i += 4;
        }
        return i;
    }

    public void a(int i, boolean z) {
        if (i >= this.Z.length || i < 0) {
            return;
        }
        this.Z[i] = z;
    }

    public void f() {
        for (int i = 0; i < this.Z.length; i++) {
            if (this.Z[i]) {
                c(i);
            }
        }
    }

    public void keyPressed(int i, char c) {
        a(i, true);
        if (this.b.i == null) {
            GameEngine.m5e("keyPressed: guiEngine==null");
        } else {
            this.b.i.a(i, c);
        }
    }

    public void c(int i) {
        keyReleased(i, (char) 0);
    }

    public void keyReleased(int i, char c) {
        a(i, false);
        if (d()) {
            Integer c2 = SlickToAndroidKeycodes.c(i);
            if (c2 != null) {
                this.b.p.processKeyUp(c2.intValue(), e());
            } else if (!Character.isISOControl(c)) {
            }
        }
        if (this.e != null) {
            this.e.b(SlickToAndroidKeycodes.b(i), false);
        }
    }

    public void a(int i, int i2) {
        this.E = i;
        this.F = i2;
        g();
    }

    public void g() {
        if (this.l || this.i) {
            return;
        }
        try {
            boolean z = this.e.settingsEngine.slick2dFullScreen;
            boolean z2 = this.e.settingsEngine.slick2dBorderless;
            if (z2) {
                z = true;
            }
            int i = this.E;
            int i2 = this.F;
            if (z) {
                i = this.c.getScreenWidth();
                i2 = this.c.getScreenHeight();
                String str = this.e.settingsEngine.slick2dFullScreenResolution;
                if (str == null) {
                    GameEngine.m5e("fullScreenResolutionString is null");
                    str = "native";
                }
                if (!str.equals("native")) {
                    String[] split = str.split("x");
                    if (split.length != 2) {
                        GameEngine.print("Unknown resolution format:" + str);
                    } else {
                        Integer l = com.corrodinggames.rts.gameFramework.f.l(split[0]);
                        Integer l2 = com.corrodinggames.rts.gameFramework.f.l(split[1]);
                        if (l == null || l2 == null) {
                            GameEngine.print("Bad resolution int:" + str);
                        } else {
                            i = l.intValue();
                            i2 = l2.intValue();
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
            float f2 = f * this.e.settingsEngine.uiRenderScale;
            float f3 = this.e.settingsEngine.renderDensity;
            if (this.I == z && this.J == z2 && this.E == this.G && this.F == this.H && com.corrodinggames.rts.gameFramework.f.h(f2, this.P) && com.corrodinggames.rts.gameFramework.f.h(f3, this.Q)) {
                return;
            }
            int i3 = i;
            int i4 = i2;
            boolean z3 = this.J != z2;
            this.P = f2;
            this.Q = f3;
            this.R = this.P;
            this.R *= ((this.Q - 1.0f) * 0.5f) + 1.0f;
            this.G = this.E;
            this.H = this.F;
            this.I = z;
            this.J = z2;
            boolean z4 = false;
            if (z2 && z) {
                z4 = true;
            }
            System.setProperty("org.lwjgl.opengl.Window.undecorated", z4 ? "true" : "false");
            if (z) {
                GameEngine.m5e("screen: " + this.c.getScreenWidth() + ", " + this.c.getScreenHeight());
                GameEngine.m5e("container: " + this.a.getWidth() + ", " + this.a.getHeight());
                if (z2) {
                    this.c.setDisplayMode(i3, i4, false);
                } else {
                    this.c.setDisplayMode(i3, i4, true);
                }
            } else {
                boolean z5 = false;
                if (this.c.isFullscreen()) {
                    z5 = true;
                }
                if (z3) {
                    z5 = true;
                    if (i3 > 2 && i4 > 2) {
                        this.c.setDisplayMode(i3 - 1, i4 - 1, false);
                    }
                }
                if (z5) {
                    this.c.setDisplayMode(i3, i4, false);
                    Display.setResizable(false);
                    Display.setResizable(true);
                } else {
                    SGL sgl = Renderer.get();
                    sgl.initDisplay(i3, i4);
                    sgl.enterOrtho(i3, i4);
                    Field declaredField = GameContainer.class.getDeclaredField("width");
                    declaredField.setAccessible(true);
                    declaredField.set(this.c, Integer.valueOf(i3));
                    Field declaredField2 = GameContainer.class.getDeclaredField("height");
                    declaredField2.setAccessible(true);
                    declaredField2.set(this.c, Integer.valueOf(i4));
                }
            }
            this.S = Display.getWidth() / 2;
            this.T = Display.getHeight() / 2;
            int i5 = (int) (i3 / this.P);
            int i6 = (int) (i4 / this.P);
            int i7 = (int) (i3 / this.R);
            int i8 = (int) (i4 / this.R);
            if (this.f != null) {
                this.f.a = i5;
                this.f.b = i6;
            } else {
                GameEngine.m5e("setResolution: gameView=null");
            }
            if (this.e != null) {
                this.e.b(i5, i6);
                this.e.X();
            } else {
                GameEngine.m5e("setResolution: game=null");
            }
            if (this.b != null && this.b.p != null) {
                this.b.p.setDimensionsWrap(i7, i8);
            } else {
                GameEngine.m5e("setResolution: main.libRocket=null");
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void a(String str, boolean z) {
        boolean z2 = true;
        if (!str.startsWith("Loading units ")) {
            GameEngine.m5e("--Now loading:" + str);
            z2 = false;
        }
        if (z) {
            this.N = this.M;
            this.M = str;
        }
        long currentTimeMillis = System.currentTimeMillis();
        if (z2 && currentTimeMillis < this.O + 10) {
            return;
        }
        this.O = currentTimeMillis;
        Graphics a = this.c.a();
        a((GameContainer) this.c, a);
        this.c.a(a);
    }

    public void a(GameContainer gameContainer, Graphics graphics) {
        this.K += this.t;
        this.L++;
        graphics.setColor(Color.black);
        graphics.clear();
        if (this.m != null) {
            graphics.drawImage(this.m.C(), (Display.getWidth() / 2) - (this.m.p / 2), (Display.getHeight() / 2) - (this.m.q / 2));
        }
        String str = "Loading";
        for (int i = 0; i <= this.L % 4; i++) {
            str = str + ".";
        }
        String e = com.corrodinggames.rts.gameFramework.f.e("    " + str, 17);
        int width = graphics.getFont().getWidth(e);
        int height = Display.getHeight() - 70;
        graphics.setColor(Color.white);
        graphics.drawString(e, (Display.getWidth() / 2) - (width / 2), height);
        graphics.setColor(new Color(1.0f, 1.0f, 1.0f, 0.6f));
        graphics.drawString(this.M, (Display.getWidth() / 2) - (graphics.getFont().getWidth(this.M) / 2), height + 20);
    }

    public void a(e eVar) {
        eVar.k();
        if (this.P != 1.0f) {
            eVar.a(this.P, this.P);
        }
    }

    public void b(e eVar) {
        eVar.l();
    }

    public void a(Graphics graphics, float f) {
        graphics.pushTransform();
        graphics.scale(f, f);
    }

    public void a(Graphics graphics) {
        graphics.popTransform();
    }

    public void render(GameContainer gameContainer, Graphics graphics) {
        long currentTimeMillis = System.currentTimeMillis();
        float f = ((float) (currentTimeMillis - this.U)) * 0.060000002f;
        int i = (int) (currentTimeMillis - this.U);
        this.U = currentTimeMillis;
        if (this.v && this.u && gameContainer.hasFocus()) {
            Mouse.setCursorPosition(this.S, this.T);
        }
        if (!this.r) {
            a(gameContainer, graphics);
            if (!this.s) {
                this.s = true;
            } else if (!this.p) {
                b();
            }
        } else if (this.e == null) {
            GameEngine.print("render: game==null");
        } else {
            a();
            float f2 = this.t * 0.060000002f;
            int width = Display.getWidth();
            int height = Display.getHeight();
            if (width != this.G || height != this.H) {
                if (this.C != width || this.D != height) {
                    this.C = width;
                    this.D = height;
                    this.B = 0.0f;
                }
                this.B += f2;
                this.A += f2;
                if (this.A > 300.0f || this.B > 20.0f || this.A > 0.0f) {
                    this.A = 0.0f;
                    this.B = 0.0f;
                    a(width, height);
                }
            }
            float f3 = this.R;
            this.b.a(f2);
            if (this.e.settingsEngine.liveReloading) {
                this.z++;
                if (this.z > 30) {
                    this.z = 0;
                    if (LoadImage.y != null) {
                        Iterator it = LoadImage.y.iterator();
                        while (it.hasNext()) {
                            ((LoadImage) it.next()).t();
                        }
                    }
                    if (!this.e.h(48)) {
                        this.b.p.detectChangesAndReload();
                    }
                }
            }
            boolean z = false;
            e eVar = null;
            if (!this.e.bG) {
                graphics.setColor(Color.gray);
                graphics.resetTransform();
                graphics.clearClip();
                graphics.clear();
                if (!d() && !this.e.bI) {
                    this.X++;
                    if (this.X > 100) {
                        this.X = 0;
                        GameEngine.m5e("Fail safe menu");
                        com.corrodinggames.librocket.a.a().b();
                    }
                }
            } else {
                this.X = 0;
            }
            boolean a = this.e.bT.ae.a();
            boolean z2 = this.e.bl && this.e.bT.af.a();
            if (z2) {
                a = true;
            }
            if (this.e.bG) {
                graphics.resetTransform();
                if (!this.e.dv) {
                    graphics.clearClip();
                    graphics.clear();
                }
                graphics.setColor(Color.black);
                if (!GameEngine.aB) {
                    eVar = (e) this.e.bO;
                    if (eVar != null) {
                        eVar.f = graphics;
                        eVar.L = this.P;
                        z = true;
                        a(eVar);
                    }
                }
                boolean z3 = this.e.cS;
                if (a) {
                    this.e.cS = true;
                }
                this.e.a(f2, this.t);
                if (a) {
                    this.e.cS = z3;
                }
                this.t = 0;
                if (!GameEngine.aB && z) {
                    b(eVar);
                }
            } else {
                this.e.netEngine.b(f2);
                this.e.bN.a(f2);
            }
            a(graphics, f3);
            SteamEngine.getSteamEngine().a(0.0f);
            this.b.p.c.update(f2);
            if (!this.b.p.b()) {
                this.b.p.a(graphics);
                this.b.p.update();
                this.b.p.render();
                this.b.p.c.checkForErrors();
                this.b.p.debug = false;
            }
            this.b.p.postUpdate();
            a(graphics);
            if (this.i) {
                graphics.clear();
            }
            if (this.v && !a && !this.e.cU) {
                graphics.drawImage(this.n.C(), this.w * this.P, this.x * this.P);
            }
            if (a) {
                screenshots(graphics, z2);
            }
            if (this.b.u) {
                this.b.v++;
                if (this.b.v > 2) {
                    this.b.u = false;
                    this.b.v = 0;
                    GameEngine.m5e("Saving settings (queued)");
                    this.e.settingsEngine.save();
                }
            }
        }
    }

    /* renamed from: a */
    public void screenshots(Graphics graphics, boolean z) {
        d dVar = this.f;
        int i = 10;
        int i2 = 10;
        if (dVar != null) {
            i = dVar.a;
            i2 = dVar.b;
        }
        try {
            try {
                GameEngine.m5e("Saving screenshot");
                File file = new File("screenshots");
                if (!file.exists()) {
                    file.mkdir();
                }
                final String str = "screenshot_" + com.corrodinggames.rts.gameFramework.f.a("d MMM yyyy HH.mm.ss") + ".png";
                final String str2 = "screenshots" + File.separator + str;
                if (!z) {
                    Image image = new Image(this.c.getWidth(), this.c.getHeight());
                    graphics.copyArea(image, 0, 0);
                    final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    ImageOut.write(image, "png", byteArrayOutputStream);
                    GameEngine.f(null, "Saving screenshot: " + str);
                    new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.u.1
                        @Override // java.lang.Runnable
                        public void run() {
                            try {
                                FileOutputStream fileOutputStream = new FileOutputStream(str2);
                                fileOutputStream.write(byteArrayOutputStream.toByteArray());
                                fileOutputStream.close();
                                GameEngine.m5e("Screenshot saved: " + str);
                            } catch (Exception e) {
                                e.printStackTrace();
                                GameEngine.n("Failed to write screenshot:" + e.getMessage());
                            }
                        }
                    }).start();
                    if (dVar != null) {
                        dVar.a = i;
                        dVar.b = i2;
                        return;
                    }
                    return;
                }
                if (this.Y == null) {
                    this.Y = new com.corrodinggames.rts.game.j();
                }
                int i3 = (int) (dVar.a * 2.0f);
                int i4 = (int) (dVar.b * 2.0f);
                y yVar = this.e.bO;
                this.Y.a(yVar, i3, i4, 0);
                EngineLoad engineLoad = (EngineLoad) this.e;
                boolean z2 = this.e.cS;
                engineLoad.a(this.Y);
                this.e.cS = true;
                try {
                    this.e.bO.b(android.graphics.Color.a(0, 0, 0));
                    dVar.b(true);
                    engineLoad.b(i3, i4);
                    engineLoad.k();
                    engineLoad.a(0.0f, 0);
                    engineLoad.b(i, i2);
                    engineLoad.k();
                    engineLoad.b(this.Y);
                    this.e.cS = z2;
                    yVar.a(this.Y.a, new File(str2));
                    GameEngine.f(null, "Saving large screenshot: " + str);
                    if (dVar != null) {
                        dVar.a = i;
                        dVar.b = i2;
                    }
                } catch (Throwable th) {
                    engineLoad.b(this.Y);
                    this.e.cS = z2;
                    throw th;
                }
            } catch (Throwable th2) {
                if (dVar != null) {
                    dVar.a = i;
                    dVar.b = i2;
                }
                throw th2;
            }
        } catch (Exception e) {
            e.printStackTrace();
            GameEngine.n("Failed to take screenshot:" + e.getMessage());
            if (dVar != null) {
                dVar.a = i;
                dVar.b = i2;
            }
        }
    }
}