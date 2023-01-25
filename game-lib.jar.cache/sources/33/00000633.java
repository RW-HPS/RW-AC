package com.corrodinggames.rts.java;

import android.content.ServerContext;
import android.graphics.Point;
import android.p003os.Looper;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0122n;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1065n;
import com.corrodinggames.rts.gameFramework.C0644ac;
import com.corrodinggames.rts.gameFramework.C0654am;
import com.corrodinggames.rts.gameFramework.C0670av;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.C0865ac;
import com.corrodinggames.rts.gameFramework.net.EnterPasswordCallback;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p030a.C0638f;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C1062x;
import com.corrodinggames.rts.gameFramework.utility.C1116aj;
import com.corrodinggames.rts.gameFramework.utility.C1135l;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import com.corrodinggames.rts.java.librocket.SlickLibRocket;
import com.corrodinggames.rts.java.p052b.C1188a;
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
public class Main extends C0865ac {

    /* renamed from: a */
    public static boolean f7185a = false;

    /* renamed from: b */
    public static boolean f7186b = true;

    /* renamed from: c */
    public static String f7187c = "Rusted Warfare";

    /* renamed from: d */
    public C1205d f7188d;

    /* renamed from: h */
    public GameNetEngine f7192h;

    /* renamed from: i */
    C1188a f7193i;

    /* renamed from: j */
    public RWBasicGame f7194j;

    /* renamed from: k */
    RWAppGameContainer f7195k;

    /* renamed from: l */
    String[] f7196l;

    /* renamed from: m */
    static Main f7197m;

    /* renamed from: n */
    int f7198n;

    /* renamed from: p */
    SlickLibRocket f7200p;

    /* renamed from: r */
    Thread f7202r;

    /* renamed from: u */
    public boolean f7205u;

    /* renamed from: v */
    public int f7206v;

    /* renamed from: e */
    public String f7189e = "#28";

    /* renamed from: f */
    C1116aj f7190f = new C1116aj();

    /* renamed from: g */
    boolean f7191g = true;

    /* renamed from: o */
    long f7199o = System.nanoTime();

    /* renamed from: q */
    AbstractC1065n f7201q = new C1212i(this);

    /* renamed from: s */
    boolean f7203s = true;

    /* renamed from: t */
    Object f7204t = new Object();

    public static void main(String[] strArr) {
        f7197m = new Main();
        f7197m.m427a(strArr);
        new Runnable() { // from class: com.corrodinggames.rts.java.Main.1
            @Override // java.lang.Runnable
            public void run() {
                Main.f7197m.m419f();
            }
        };
    }

    /* renamed from: a */
    public static void m429a(String str) {
        GameEngine.m5925e(str);
    }

    /* renamed from: f */
    public void m419f() {
        C1135l c1135l = new C1135l(new InputStreamReader(System.in));
        while (this.f7191g) {
            try {
                String m560a = c1135l.m560a();
                if (m560a == null) {
                    try {
                        Thread.sleep(200L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                } else {
                    m430a((PlayerConnect) null, "ADMIN", m560a, true);
                }
            } catch (IOException e2) {
                if (this.f7198n < 3) {
                    GameEngine.m5925e("Error while reading stdin: " + e2.toString());
                    this.f7198n++;
                    if (this.f7198n == 3) {
                        GameEngine.m5925e("Too many stdin errors, ignoring");
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

    /* renamed from: g */
    public void m418g() {
        final Semaphore semaphore = new Semaphore(0);
        Thread thread = new Thread(new Runnable() { // from class: com.corrodinggames.rts.java.Main.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m1147aq();
                Looper.m5574a();
                semaphore.release(1);
                Looper.m5571c();
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

    /* renamed from: a */
    public synchronized void m427a(String[] strArr) {
        float f;
        float f2;
        this.f7196l = strArr;
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
        GameEngine.m5925e("Reading args");
        String str = null;
        String str2 = null;
        int i = 0;
        while (i < strArr.length) {
            String lowerCase = strArr[i].trim().toLowerCase(Locale.ENGLISH);
            if (str != null) {
                if (str.equals("+connect_lobby")) {
                    m429a("connect lobby:" + lowerCase);
                    GameEngine.f6410aK = lowerCase;
                    str = null;
                } else if (str.equals("-width")) {
                    num = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else if (str.equals("-height")) {
                    num2 = Integer.valueOf(Integer.parseInt(lowerCase));
                    str = null;
                } else {
                    m429a("Unknown two_part_arg: " + str);
                    str = null;
                }
            } else if (lowerCase.equals("-debug")) {
                i++;
                if (i >= strArr.length) {
                    m429a("-debug requires parameters");
                    System.exit(1);
                }
                String str3 = strArr[i];
                ScriptServerSocket.m5460a(Integer.parseInt(str3.split(":")[0]), str3.split(":")[1]);
            } else if (lowerCase.equals("-debugscript")) {
                i++;
                if (i >= strArr.length) {
                    m429a("-debugscript requires parameters");
                    System.exit(1);
                }
                ScriptServerSocket.addScriptFilePath(strArr[i]);
            } else if (lowerCase.equals("-log")) {
                i++;
                if (i >= strArr.length) {
                    m429a("-log requires parameters");
                    System.exit(1);
                }
                String str4 = strArr[i];
                try {
                    PrintStream printStream = new PrintStream(str4);
                    System.setOut(printStream);
                    System.setErr(printStream);
                    GameEngine.m5925e("File logging started");
                } catch (FileNotFoundException e) {
                    GameEngine.m1180a("Cannot open log file:" + str4);
                    e.printStackTrace();
                }
            } else if (!lowerCase.equals("-nologfile")) {
                if (lowerCase.equals("-lang")) {
                    i++;
                    if (i >= strArr.length) {
                        m429a("-lang requires parameters");
                        System.exit(1);
                    }
                    C0855a.f5615d = strArr[i];
                } else if (lowerCase.equals("-logcolor")) {
                    GameEngine.f6407ax = true;
                } else if (lowerCase.equals("-nodisplay")) {
                    z = true;
                } else if (lowerCase.equals("-canvasgl")) {
                    GameEngine.f6301aD = true;
                } else if (lowerCase.equals("-replay_debug")) {
                    GameEngine.f6406aw = true;
                } else if (lowerCase.equals("-nopreferipv4")) {
                    z4 = true;
                } else if (lowerCase.equals("-noresources")) {
                    GameEngine.f6299aB = true;
                } else if (lowerCase.equals("-nosound")) {
                    z2 = true;
                } else if (lowerCase.equals("-nomusic")) {
                    z3 = true;
                } else if (lowerCase.equals("-safemode")) {
                    GameEngine.f6414aO = true;
                } else if (lowerCase.equals("-extrasafemode")) {
                    GameEngine.f6415aP = true;
                } else if (lowerCase.equals("-disable_vbos")) {
                    z7 = true;
                } else if (lowerCase.equals("-disable_atlas")) {
                    GameEngine.f6300aC = true;
                } else if (lowerCase.equals("-force_vbos")) {
                    z8 = true;
                } else if (lowerCase.equals("-allowsoftwarerender")) {
                    z5 = true;
                } else if (lowerCase.equals("-fullscreen")) {
                    z6 = true;
                } else if (lowerCase.equals("-nobackground")) {
                    GameEngine.f6296ay = true;
                } else if (lowerCase.equals("-nomods")) {
                    GameEngine.f6305aJ = true;
                } else if (lowerCase.equals("-printunits")) {
                    GameEngine.f6302aE = true;
                } else if (lowerCase.equals("-outputunitimages")) {
                    GameEngine.f6303aF = true;
                } else if (lowerCase.equals("-oldreplays")) {
                    GameEngine.f6304aG = true;
                } else if (lowerCase.equals("-teamshaders")) {
                    GameEngine.f6413aN = true;
                } else if (lowerCase.equals("-noteamshaders")) {
                    GameEngine.f6413aN = false;
                } else if (lowerCase.equals("-devdebug")) {
                    i++;
                    if (i >= strArr.length) {
                        m429a("-debugscript requires parameters");
                        System.exit(1);
                    }
                    GameEngine.f6416aQ = strArr[i];
                } else if (lowerCase.equals("-postprocessing")) {
                    GameEngine.f6412aM = true;
                } else if (lowerCase.equals("-nopostprocessing")) {
                    GameEngine.f6412aM = false;
                } else if (lowerCase.equals("-disabletextureread")) {
                    LoadImage.f7479F = false;
                } else if (lowerCase.equals("-sandbox")) {
                    GameEngine.f6409aI = true;
                } else if (lowerCase.equals("-steam")) {
                    GameEngine.f6408aH = true;
                } else if (lowerCase.equals("-width") || lowerCase.equals("-height")) {
                    str = lowerCase;
                } else if (lowerCase.startsWith("+")) {
                    if (lowerCase.equals("+connect_lobby")) {
                        str = lowerCase;
                    } else {
                        m429a("Unknown steam option: " + lowerCase);
                    }
                } else if (lowerCase.trim().length() != 0) {
                    m429a("Unknown option: " + lowerCase);
                    str2 = "Unknown option: " + lowerCase;
                }
            }
            i++;
        }
        GameEngine.m5925e("Game arguments:");
        for (int i2 = 0; i2 < strArr.length; i2++) {
            m429a("arg: " + strArr[i2].trim().toLowerCase(Locale.ENGLISH));
        }
        if (str2 != null) {
            if (GameEngine.f6408aH) {
                m429a("Unknown options but running anyway due to being in steam");
            } else {
                m429a("Exiting due to unknown option: " + str2);
                System.exit(1);
            }
        }
        GameEngine.f6418aU = true;
        GameEngine.m1147aq();
        String property = System.getProperty("os.name");
        GameEngine.m5925e("OS name: " + property);
        GameEngine.m5925e("OS version: " + System.getProperty("os.version"));
        GameEngine.m5925e("LWJGL version: " + Sys.getVersion());
        GameEngine.m5925e("Build Number: " + this.f7189e);
        GameEngine.m5925e("Game Version: 1.15");
        GameEngine.m5925e("Game Code: 176");
        C0191i.f1219b = Sys.is64Bit();
        GameEngine.m5925e("Is 64bit: " + C0191i.f1219b);
        GameEngine.m5925e("JVM maxMemory:" + Runtime.getRuntime().maxMemory());
        GameEngine.m5925e("JVM totalMemory:" + Runtime.getRuntime().totalMemory());
        GameEngine.m5925e("JVM freeMemory:" + Runtime.getRuntime().freeMemory());
        if (property != null && property.toLowerCase().contains("mac os")) {
            C0191i.f1220c = true;
        }
        if (z4) {
            GameEngine.m5925e("Skipping preferIPv4Stack=true");
        } else {
            System.setProperty("java.net.preferIPv4Stack", "true");
        }
        if (GameEngine.f6408aH) {
            SteamEngine.steamEngine = new com.corrodinggames.rts.java.steam.SteamEngine();
            GameEngine.m5925e("Early steam init");
            SteamEngine.getSteamEngine().m786b();
            GameEngine.m5925e("Early steam init done.");
        } else {
            GameEngine.m5925e("steam not requested");
        }
        m418g();
        String str5 = f7187c;
        if (z) {
            str5 = VariableScope.nullOrMissingString;
        }
        Input.disableControllers();
        if (f7185a) {
            Renderer.setRenderer(2);
        }
        if (!z8 && C0191i.f1220c) {
            GameEngine.m5925e("Disabling vbo on mac (without force option)");
            z7 = true;
        }
        if (z7) {
            GameEngine.m5925e("disable_vbos requested");
            VBORenderer vBORenderer = Renderer.get();
            if (vBORenderer instanceof VBORenderer) {
                vBORenderer.disableVBOs();
            } else {
                GameEngine.m5925e("Failed to disable VBOs, wrong class");
            }
        }
        C1208e.m154c();
        this.f7194j = new RWBasicGame(str5);
        this.f7194j.f7493b = this;
        this.f7194j.f7500i = z;
        this.f7194j.f7501j = z2;
        this.f7194j.f7502k = z3;
        if (z) {
            GameEngine.m1180a("Skipping display mode call");
            f = 800.0f;
            f2 = 600.0f;
        } else {
            try {
                DisplayMode displayMode = Display.getDisplayMode();
                f = displayMode.getHeight();
                f2 = displayMode.getWidth();
            } catch (Exception e2) {
                GameEngine.m1180a("Failed to get display mode, defaulting to min size");
                e2.printStackTrace();
                f = 800.0f;
                f2 = 600.0f;
            }
        }
        GameEngine.m5925e("screenHeight:" + f);
        GameEngine.m5925e("screenWidth:" + f2);
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
            GameEngine.m5925e("Overriding width to:" + num);
            i3 = num.intValue();
        }
        if (num2 != null) {
            GameEngine.m5925e("Overriding height to:" + num2);
            i4 = num2.intValue();
        }
        if (z5) {
            GameEngine.m5925e("allowSoftwareOpenGL is now on");
            System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
        }
        this.f7194j.f7503l = false;
        boolean z9 = z6;
        try {
            if (this.f7194j.f7503l) {
                this.f7194j.m38a(i3 * 2, i4 * 2);
                this.f7195k = new RWAppGameContainer(new ScalableGame(this.f7194j, i3, i4), i3, i4, z9);
            } else {
                this.f7195k = new RWAppGameContainer(this.f7194j, i3, i4, z9);
            }
            this.f7194j.f7494c = this.f7195k;
            Display.setResizable(true);
            this.f7202r = new Thread(new StartLwjgl(this));
            this.f7202r.setDaemon(false);
            this.f7202r.start();
        } catch (SlickException e3) {
            throw new RuntimeException((Throwable) e3);
        }
    }

    /* renamed from: b */
    public void m423b(String str) {
        this.f7201q.mo869a(str, true);
    }

    /* renamed from: h */
    public synchronized void m417h() {
        m423b("displayModes");
        m423b("starting controllers");
        this.f7199o = System.nanoTime();
        GameEngine.f6418aU = true;
        GameEngine.f6425bb = true;
        if (!GameEngine.f6299aB) {
            if (GameEngine.f6301aD) {
                GameEngine.f6421aX = true;
                GameEngine.f6420aW = true;
                GameEngine.f6308bg = C1062x.class;
            } else {
                GameEngine.f6421aX = true;
                GameEngine.f6420aW = true;
                GameEngine.f6308bg = C1208e.class;
            }
        }
        if (this.f7194j != null && !this.f7194j.f7501j) {
            OpenALAudio openALAudio = new OpenALAudio(20, 9, 512);
            GameEngine.m5925e("openALAudio hasDevice:" + openALAudio.hasDevice());
            C0637e.f4069c = new C1220o(openALAudio);
            if (this.f7194j.f7502k) {
                GameEngine.m5925e("Music disabled");
                C0654am.f4220a = new C0670av();
            } else {
                C0654am.f4220a = new C1217l(openALAudio);
            }
        } else {
            GameEngine.print("Disabling sound with NullSoundFactory");
            C0637e.f4069c = new C0638f();
            C0654am.f4220a = new C0670av();
        }
        GameNetAPIOperate.f6092d = new HTTP();
        C0644ac.f4115b = new C1228v();
        long m2574a = C0742br.m2574a();
        m423b("loading libRocket");
        GameEngine.m5925e("start libRocket setup");
        this.f7188d = new C1205d();
        this.f7193i = C1188a.m297p();
        this.f7193i.f7300f = this;
        this.f7200p = new SlickLibRocket();
        this.f7193i.m5508a(this.f7200p, this.f7188d);
        this.f7200p.debug = false;
        this.f7200p.setup();
        m423b("libRocket - fonts");
        this.f7200p.loadFont("font/Delicious-Roman.otf");
        this.f7200p.loadFont("font/Delicious-Italic.otf");
        this.f7200p.loadFont("font/Delicious-Bold.otf");
        this.f7200p.loadFont("font/Delicious-BoldItalic.otf");
        this.f7200p.loadFont("font/Roboto-Regular.ttf");
        this.f7200p.loadFont("font/Roboto-Bold.ttf");
        GameEngine.m5925e("NotoSansCJKsc start");
        this.f7200p.loadFont("font/NotoSansCJKsc-Regular.otf", "notoSans");
        this.f7200p.loadFont("font/DroidSansFallback.ttf", "fallback");
        GameEngine.m5925e("NotoSansCJKsc end");
        this.f7193i.m5501c();
        GameEngine.m5925e("end libRocket setup");
        m423b("GuiEngine");
        C0742br.m2569a("libRocket setup took:", m2574a);
        GameEngine.f6431dz = this.f7189e;
        ServerContext serverContext = new ServerContext();
        m423b("GameEngine");
        GameEngine.f6346ck = new Point(this.f7194j.f7492a.getWidth(), this.f7194j.f7492a.getHeight());
        GameEngine m1187a = GameEngine.m1187a(serverContext, this.f7201q);
        m423b("GameEngine ready");
        GameEngine.m5925e("version: " + m1187a.m1083u() + " " + m1187a.m1120c(false) + ":" + this.f7189e);
        this.f7193i.m5504b();
        ScriptServerSocket.m5458b();
        this.f7192h = m1187a.netEngine;
        m1187a.settingsEngine.showZoomButton = false;
        m1187a.settingsEngine.showUnitGroups = false;
        this.f7194j.m35a(this.f7188d);
        this.f7194j.m38a(1000, 800);
        long nanoTime = System.nanoTime();
        GameEngine.m5925e("-----------------------------");
        GameEngine.m5925e("----- Game init finished in:" + ((nanoTime - this.f7199o) / 1000000.0d) + " ms");
        m1187a.netEngine.f5774d = this;
        m1187a.netEngine.f5698y = "unset";
        if (!GameEngine.f6296ay) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: b */
    public void startGame() {
        this.f7190f.m612a(new Runnable() { // from class: com.corrodinggames.rts.java.Main.3
            @Override // java.lang.Runnable
            public void run() {
                GameEngine gameEngine = GameEngine.getGameEngine();
                GameEngine.m5925e("got startGameEvent..");
                ActivityC0122n.m5356r();
                if (gameEngine.f6323bL == null || !gameEngine.f6323bL.f804W) {
                    GameEngine.m5925e("Not starting multiplayer game because map failed to load");
                    gameEngine.netEngine.m1667af();
                    return;
                }
                gameEngine.netEngine.f5753bd = true;
                gameEngine.f6456bH = false;
                gameEngine.f6294aq = false;
                Main.this.f7193i.m5500c(false);
                AbstractC0043a.m5510a().m5497f();
                Main.this.f7200p.getActiveDocument();
                if (Main.this.f7200p.f359c != null) {
                    Main.this.f7200p.f359c.getRoot().resumeNonMenu();
                    return;
                }
                GameEngine.m5925e("startGameEvent: scriptEngine==null");
                GameEngine.m1203T();
            }
        });
    }

    /* renamed from: a */
    public void m435a(float f) {
        this.f7190f.m613a();
    }

    /* renamed from: a */
    public void m428a(boolean z) {
        this.f7191g = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            gameEngine.netEngine.m1559u();
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

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: a */
    public synchronized boolean m431a(PlayerConnect playerConnect, String str, String str2) {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: b */
    public synchronized void m424b(PlayerConnect playerConnect, String str, String str2) {
        m430a(playerConnect, str, str2, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: c */
    public void m422c() {
        ScriptEngine scriptEngine;
        if (!GameEngine.getGameEngine().netEngine.f5749aW && (scriptEngine = ScriptEngine.getInstance()) != null) {
            scriptEngine.addScriptToQueueIfNotAlreadyQueued("mp.refreshUI()");
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: a */
    public synchronized void m434a(final int i, final String str, final String str2, final PlayerConnect playerConnect) {
        if (this.f7200p != null && this.f7200p.f359c != null) {
            this.f7200p.f359c.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.Main.4
                @Override // java.lang.Runnable
                public void run() {
                    Main.this.f7200p.f359c.getRoot().receiveChatMessage(i, str, str2, playerConnect);
                }
            });
        } else {
            GameEngine.m1203T();
        }
    }

    /* renamed from: a */
    public synchronized void m430a(PlayerConnect playerConnect, String str, String str2, boolean z) {
        if (!z) {
            m429a(str + ": " + str2);
        }
        if (this.f7203s) {
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: a */
    public String m432a(PlayerConnect playerConnect, String str) {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: c */
    public synchronized void m421c(PlayerConnect playerConnect, String str, String str2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: b */
    public synchronized void m425b(PlayerConnect playerConnect, String str) {
    }

    /* renamed from: i */
    public void m416i() {
        GameEngine.getGameEngine();
        this.f7194j.m20g();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: d */
    public void m420d() {
        AbstractC0043a.m5510a().m5491o();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.C0865ac
    /* renamed from: a */
    public void m433a(EnterPasswordCallback enterPasswordCallback) {
        AbstractC0043a.m5510a().m5507a(enterPasswordCallback);
    }
}