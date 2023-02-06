package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.os.Looper;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.EngineLoad;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.av;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import com.corrodinggames.rts.gameFramework.net.ac;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.unitAction.x;
import com.corrodinggames.rts.gameFramework.utility.aj;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.librocket.SlickLibRocket;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Locale;
import java.util.concurrent.Semaphore;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.newdawn.slick.Input;
import org.newdawn.slick.ScalableGame;
import org.newdawn.slick.SlickException;
import org.newdawn.slick.opengl.renderer.Renderer;
import org.newdawn.slick.opengl.renderer.VBORenderer;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/Main.class */
public class Main extends ac {
    public static boolean a = false;
    public static boolean b = true;
    public static String c = "Rusted Warfare";
    public d d;
    public GameNetEngine h;
    com.corrodinggames.rts.java.b.a i;
    public RWBasicGame j;
    RWAppGameContainer k;
    String[] l;
    static Main m;
    int n;
    SlickLibRocket p;
    Thread r;
    public boolean u;
    public int v;
    public String e = "#28";
    aj f = new aj();
    boolean g = true;
    long o = System.nanoTime();
    com.corrodinggames.rts.gameFramework.n q = new i(this);
    boolean s = true;
    Object t = new Object();

    public static void main(String[] strArr) {
        m = new Main();
        m.a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.m.f();
            }
        };
    }

    public static void a(String str) {
        GameEngine.m5e(str);
    }

    public void f() {
        com.corrodinggames.rts.gameFramework.utility.l lVar = new com.corrodinggames.rts.gameFramework.utility.l(new InputStreamReader(System.in));
        while (this.g) {
            try {
                String a2 = lVar.a();
                if (a2 == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    a((PlayerConnect) null, "ADMIN", a2, true);
                }
            } catch (IOException e2) {
                if (this.n < 3) {
                    GameEngine.m5e("Error while reading stdin: " + e2.toString());
                    this.n++;
                    if (this.n == 3) {
                        GameEngine.m5e("Too many stdin errors, ignoring");
                    }
                }
                try {
                    Thread.sleep(700L);
                } catch (InterruptedException e3) {
                    e3.printStackTrace();
                }
            }
        }
    }

    public void g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.aq();
                Looper.a();
                semaphore.release(1);
                Looper.c();
            }
        });
        thread.setDaemon(true);
        thread.start();
        try {
            semaphore.acquire();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public synchronized void a(String[] strArr) {
        float f;
        float f2;
        this.l = strArr;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        boolean z7 = false;
        boolean z8 = false;
        Integer num = null;
        Integer num2 = null;
        GameEngine.m5e("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    a("connect lobby:" + lowerCase);
                    GameEngine.aK = lowerCase;
                    str = null;
                } else if (str.equals("-width")) {
                    num = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else if (str.equals("-height")) {
                    num2 = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else {
                    a("Unknown two_part_arg: " + str);
                    str = null;
                }
            } else if (lowerCase.equals("-debug")) {
                i++;
                if (i >= strArr.length) {
                    a("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = strArr[i];
                ScriptServerSocket.a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= strArr.length) {
                    a("-debugscript requires parameters");
                    System.exit(1);
                }
                ScriptServerSocket.addScriptFilePath(strArr[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= strArr.length) {
                    a("-log requires parameters");
                    System.exit(1);
                }
                String str4 = strArr[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    GameEngine.m5e("File logging started");
                } catch (FileNotFoundException e) {
                    GameEngine.a("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (!lowerCase.equals("-nologfile")) {
                if (lowerCase.equals("-lang")) {
                    i++;
                    if (i >= strArr.length) {
                        a("-lang requires parameters");
                        System.exit(1);
                    }
                    com.corrodinggames.rts.gameFramework.translations.a.d = strArr[i];
                } else if (lowerCase.equals("-logcolor")) {
                    GameEngine.ax = true;
                } else if (lowerCase.equals("-nodisplay")) {
                    z = true;
                } else if (lowerCase.equals("-canvasgl")) {
                    GameEngine.aD = true;
                } else if (lowerCase.equals("-replay_debug")) {
                    GameEngine.aw = true;
                } else if (lowerCase.equals("-nopreferipv4")) {
                    z4 = true;
                } else if (lowerCase.equals("-noresources")) {
                    GameEngine.aB = true;
                } else if (lowerCase.equals("-nosound")) {
                    z2 = true;
                } else if (lowerCase.equals("-nomusic")) {
                    z3 = true;
                } else if (lowerCase.equals("-safemode")) {
                    GameEngine.aO = true;
                } else if (lowerCase.equals("-extrasafemode")) {
                    GameEngine.aP = true;
                } else if (lowerCase.equals("-disable_vbos")) {
                    z7 = true;
                } else if (lowerCase.equals("-disable_atlas")) {
                    GameEngine.aC = true;
                } else if (lowerCase.equals("-force_vbos")) {
                    z8 = true;
                } else if (lowerCase.equals("-allowsoftwarerender")) {
                    z5 = true;
                } else if (lowerCase.equals("-fullscreen")) {
                    z6 = true;
                } else if (lowerCase.equals("-nobackground")) {
                    GameEngine.ay = true;
                } else if (lowerCase.equals("-nomods")) {
                    GameEngine.aJ = true;
                } else if (lowerCase.equals("-printunits")) {
                    GameEngine.aE = true;
                } else if (lowerCase.equals("-outputunitimages")) {
                    GameEngine.aF = true;
                } else if (lowerCase.equals("-oldreplays")) {
                    GameEngine.aG = true;
                } else if (lowerCase.equals("-teamshaders")) {
                    GameEngine.aN = true;
                } else if (lowerCase.equals("-noteamshaders")) {
                    GameEngine.aN = false;
                } else if (lowerCase.equals("-devdebug")) {
                    i++;
                    if (i >= strArr.length) {
                        a("-debugscript requires parameters");
                        System.exit(1);
                    }
                    GameEngine.aQ = strArr[i];
                } else if (lowerCase.equals("-postprocessing")) {
                    GameEngine.aM = true;
                } else if (lowerCase.equals("-nopostprocessing")) {
                    GameEngine.aM = false;
                } else if (lowerCase.equals("-disabletextureread")) {
                    LoadImage.F = false;
                } else if (lowerCase.equals("-sandbox")) {
                    GameEngine.aI = true;
                } else if (lowerCase.equals("-steam")) {
                    GameEngine.aH = true;
                } else if (lowerCase.equals("-width") || lowerCase.equals("-height")) {
                    str = lowerCase;
                } else if (lowerCase.startsWith("+")) {
                    if (lowerCase.equals("+connect_lobby")) {
                        str = lowerCase;
                    } else {
                        a("Unknown steam option: " + lowerCase);
                    }
                } else if (lowerCase.trim().length() != 0) {
                    a("Unknown option: " + lowerCase);
                    str2 = "Unknown option: " + lowerCase;
                }
            }
            i++;
        }
        GameEngine.m5e("Game arguments:");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            a("arg: " + strArr[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (GameEngine.aH) {
                a("Unknown options but running anyway due to being in steam");
            } else {
                a("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        GameEngine.aU = true;
        GameEngine.aq();
        String property = System.getProperty("os.name");
        GameEngine.m5e("OS name: " + property);
        GameEngine.m5e("OS version: " + System.getProperty("os.version"));
        GameEngine.m5e("LWJGL version: " + Sys.getVersion());
        GameEngine.m5e("Build Number: " + this.e);
        GameEngine.m5e("Game Version: 1.15");
        GameEngine.m5e("Game Code: 176");
        EngineLoad.b = Sys.is64Bit();
        GameEngine.m5e("Is 64bit: " + EngineLoad.b);
        GameEngine.m5e("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        GameEngine.m5e("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        GameEngine.m5e("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            EngineLoad.c = true;
        }
        if (z4) {
            GameEngine.m5e("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (GameEngine.aH) {
            SteamEngine.steamEngine = new com.corrodinggames.rts.java.steam.SteamEngine();
            GameEngine.m5e("Early steam init");
            SteamEngine.getSteamEngine().b();
            GameEngine.m5e("Early steam init done.");
        } else {
            GameEngine.m5e("steam not requested");
        }
        g();
        String str5 = c;
        if (z) {
            str5 = VariableScope.nullOrMissingString;
        }
        Input.disableControllers();
        if (a) {
            Renderer.setRenderer(2);
        }
        if (!z8 && EngineLoad.c) {
            GameEngine.m5e("Disabling vbo on mac (without force option)");
            z7 = true;
        }
        if (z7) {
            GameEngine.m5e("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                GameEngine.m5e("Failed to disable VBOs, wrong class");
            }
        }
        e.c();
        this.j = new RWBasicGame(str5);
        this.j.b = this;
        this.j.i = z;
        this.j.j = z2;
        this.j.k = z3;
        if (z) {
            GameEngine.a("Skipping display mode call");
            f = 800.0f;
            f2 = 600.0f;
        } else {
            try {
                DisplayMode displayMode = Display.getDisplayMode();
                f = displayMode.getHeight();
                f2 = displayMode.getWidth();
            } catch (Exception e2) {
                GameEngine.a("Failed to get display mode, defaulting to min size");
                e2.printStackTrace();
                f = 800.0f;
                f2 = 600.0f;
            }
        }
        GameEngine.m5e("screenHeight:" + f);
        GameEngine.m5e("screenWidth:" + f2);
        int i3 = 1000;
        int i4 = 733;
        if (f > 800.0f) {
            i3 = 1000;
            i4 = 800;
        }
        if (f > 900.0f) {
            i3 = 1600;
            i4 = 900;
        }
        if (z) {
            i3 = 10;
            i4 = 10;
        }
        if (num != null) {
            GameEngine.m5e("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            GameEngine.m5e("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (z5) {
            GameEngine.m5e("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.j.l = false;
        boolean z9 = z6;
        try {
            if (this.j.l) {
                this.j.a(i3 * 2, i4 * 2);
                this.k = new RWAppGameContainer(new ScalableGame(this.j, i3, i4), i3, i4, z9);
            } else {
                this.k = new RWAppGameContainer(this.j, i3, i4, z9);
            }
            this.j.c = this.k;
            Display.setResizable(true);
            this.r = new Thread(new StartLwjgl(this));
            this.r.setDaemon(false);
            this.r.start();
        } catch (SlickException e3) {
            throw new RuntimeException((Throwable) e3);
        }
    }

    public void b(String str) {
        this.q.a(str, true);
    }

    public synchronized void h() {
        b("displayModes");
        b("starting controllers");
        this.o = System.nanoTime();
        GameEngine.aU = true;
        GameEngine.bb = true;
        if (!GameEngine.aB) {
            if (GameEngine.aD) {
                GameEngine.aX = true;
                GameEngine.aW = true;
                GameEngine.bg = x.class;
            } else {
                GameEngine.aX = true;
                GameEngine.aW = true;
                GameEngine.bg = e.class;
            }
        }
        if (this.j != null && !this.j.j) {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            GameEngine.m5e("openALAudio hasDevice:" + openALAudio.hasDevice());
            com.corrodinggames.rts.gameFramework.a.e.c = new o(openALAudio);
            if (this.j.k) {
                GameEngine.m5e("Music disabled");
                am.a = new av();
            } else {
                am.a = new l(openALAudio);
            }
        } else {
            GameEngine.print("Disabling sound with NullSoundFactory");
            com.corrodinggames.rts.gameFramework.a.e.c = new com.corrodinggames.rts.gameFramework.a.f();
            am.a = new av();
        }
        GameNetAPIOperate.d = new HTTP();
        com.corrodinggames.rts.gameFramework.ac.b = new v();
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        b("loading libRocket");
        GameEngine.m5e("start libRocket setup");
        this.d = new d();
        this.i = com.corrodinggames.rts.java.b.a.p();
        this.i.f = this;
        this.p = new SlickLibRocket();
        this.i.a(this.p, this.d);
        this.p.debug = false;
        this.p.setup();
        b("libRocket - fonts");
        this.p.loadFont("font/Delicious-Roman.otf");
        this.p.loadFont("font/Delicious-Italic.otf");
        this.p.loadFont("font/Delicious-Bold.otf");
        this.p.loadFont("font/Delicious-BoldItalic.otf");
        this.p.loadFont("font/Roboto-Regular.ttf");
        this.p.loadFont("font/Roboto-Bold.ttf");
        GameEngine.m5e("NotoSansCJKsc start");
        this.p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.p.loadFont("font/DroidSansFallback.ttf", "fallback");
        GameEngine.m5e("NotoSansCJKsc end");
        this.i.c();
        GameEngine.m5e("end libRocket setup");
        b("GuiEngine");
        Unit.a("libRocket setup took:", loadAllUnitsTook);
        GameEngine.dz = this.e;
        ServerContext serverContext = new ServerContext();
        b("GameEngine");
        GameEngine.ck = new Point(this.j.a.getWidth(), this.j.a.getHeight());
        GameEngine a2 = GameEngine.a(serverContext, this.q);
        b("GameEngine ready");
        GameEngine.m5e("version: " + a2.u() + " " + a2.c(false) + ":" + this.e);
        this.i.b();
        ScriptServerSocket.b();
        this.h = a2.netEngine;
        a2.settingsEngine.showZoomButton = false;
        a2.settingsEngine.showUnitGroups = false;
        this.j.a(this.d);
        this.j.a(1000, 800);
        long nanoTime = System.nanoTime();
        GameEngine.m5e("-----------------------------");
        GameEngine.m5e("----- Game init finished in:" + ((nanoTime - this.o) / 1000000.0d) + " ms");
        a2.netEngine.d = this;
        a2.netEngine.y = "unset";
        if (!GameEngine.ay) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    /* renamed from: b */
    public void startGame() {
        this.f.a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                GameEngine gameEngine = GameEngine.getGameEngine();
                GameEngine.m5e("got startGameEvent..");
                com.corrodinggames.rts.appFramework.n.r();
                if (gameEngine.bL == null || !gameEngine.bL.W) {
                    GameEngine.m5e("Not starting multiplayer game because map failed to load");
                    gameEngine.netEngine.af();
                    return;
                }
                gameEngine.netEngine.bd = true;
                gameEngine.bH = false;
                gameEngine.aq = false;
                Main.this.i.c(false);
                com.corrodinggames.librocket.a.a().f();
                Main.this.p.getActiveDocument();
                if (Main.this.p.c != null) {
                    Main.this.p.c.getRoot().resumeNonMenu();
                    return;
                }
                GameEngine.m5e("startGameEvent: scriptEngine==null");
                GameEngine.T();
            }
        });
    }

    public void a(float f) {
        this.f.a();
    }

    public void a(boolean z) {
        this.g = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            gameEngine.netEngine.u();
        } else {
            gameEngine.netEngine.closeServer("shutdownServer");
        }
        try {
            try {
                Thread.sleep(100L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.exit(0);
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
    }

    Main() {
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public synchronized boolean a(PlayerConnect playerConnect, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public synchronized void b(PlayerConnect playerConnect, String str, String str2) {
        a(playerConnect, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public void c() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getGameEngine().netEngine.aW && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public synchronized void a(final int i, final String str, final String str2, final PlayerConnect playerConnect) {
        if (this.p != null && this.p.c != null) {
            this.p.c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.p.c.getRoot().receiveChatMessage(i, str, str2, playerConnect);
                }
            });
        } else {
            GameEngine.T();
        }
    }

    public synchronized void a(PlayerConnect playerConnect, String str, String str2, boolean z) {
        if (!z) {
            a(str + ": " + str2);
        }
        if (this.s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public String a(PlayerConnect playerConnect, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public synchronized void c(PlayerConnect playerConnect, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public synchronized void b(PlayerConnect playerConnect, String str) {
    }

    public void i() {
        GameEngine.getGameEngine();
        this.j.g();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public void d() {
        com.corrodinggames.librocket.a.a().o();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.ac
    public void a(EnterPasswordCallback enterPasswordCallback) {
        com.corrodinggames.librocket.a.a().a(enterPasswordCallback);
    }
}