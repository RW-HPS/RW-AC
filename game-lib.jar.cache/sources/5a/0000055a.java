package com.corrodinggames.rts.gameFramework;

import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.net.wifi.WifiInfo;
import android.net.wifi.WifiManager;
import android.os.Build;
import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.corrodinggames.rts.game.EngineLoad;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.f.UnitGeoIndex;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.mod.ModEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.path.PathEngine;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.lang.Thread;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l.class */
public abstract class GameEngine {
    public Context an;
    public com.corrodinggames.rts.appFramework.f ao;
    public com.corrodinggames.rts.appFramework.f ap;
    public boolean aq;
    public static Throwable av;
    public static boolean ay;
    public static boolean az;
    public static boolean aA;
    public static boolean aB;
    public static boolean aC;
    public static boolean aD;
    public static boolean aE;
    public static boolean aF;
    public static boolean aG;
    public static boolean aJ;
    public static boolean aR;
    public boolean aS;
    public static Class bg;
    public static com.corrodinggames.rts.gameFramework.unitAction.y bh;
    public boolean bj;
    public boolean bp;

    /* renamed from: bs */
    public PlayerData playerTeam;
    public boolean bv;
    public boolean bw;
    public int by;
    public int bz;
    public int bA;
    public int bB;
    public int bC;
    public boolean bD;
    public int bJ;
    public com.corrodinggames.rts.gameFramework.utility.i bK;
    public com.corrodinggames.rts.game.maps.b bL;
    public com.corrodinggames.rts.gameFramework.a.e bM;
    public am bN;
    public com.corrodinggames.rts.gameFramework.unitAction.y bO;
    public CollisionEngine bP;

    /* renamed from: bQ */
    public SettingsEngine settingsEngine;
    public com.corrodinggames.rts.gameFramework.emitter.c bR;
    public InterfaceEngine bS;
    public ac bT;
    public PathEngine bU;
    public GroupController bV;
    public com.corrodinggames.rts.gameFramework.Interface.o bW;

    /* renamed from: bX */
    public GameNetEngine netEngine;

    /* renamed from: bY */
    public StatsHandler stats;
    public ModEngine bZ;
    public GameSaver ca;

    /* renamed from: cb */
    public ReplayEngine replayEngine;
    public UnitGeoIndex cc;
    public Unit cd;
    public com.corrodinggames.rts.gameFramework.status.f ce;
    public CommandController cf;
    public float ci;
    public float cj;
    public static Point ck;
    public float cl;
    public float cm;
    public float co;
    public float cp;
    public float cq;
    public float cr;
    public float cs;
    public boolean ct;
    public int cu;
    public int cv;
    public float cw;
    public float cx;
    public float cy;
    public float cz;
    public float cA;
    public float cB;
    public float cC;
    public float cD;
    public float cE;
    public float cF;
    public float cG;
    public float cH;
    public float cI;
    public float cJ;
    public boolean cR;
    public boolean cS;
    public float cT;
    public boolean cU;
    public boolean cZ;
    public float da;
    public float db;
    public String dl;
    public GameInputStream dm;
    public Paint dn;

    /* renamed from: do  reason: not valid java name */
    public Paint f3do;
    public Paint dp;
    public int dw;
    float dA;
    public String dE;
    public String dF;
    public String dG;
    String dK;
    String dL;
    private int e;
    static byte[] dP;
    static com.corrodinggames.rts.gameFramework.utility.d dS;
    static boolean dV;
    static boolean dX;
    static boolean dY;
    public boolean ee;
    public boolean ef;
    public String eg;
    public boolean eh;
    public boolean ei;
    static int ej;

    /* renamed from: al */
    protected static GameEngine gameEngine = null;
    public static boolean as = true;
    public static boolean at = false;
    public static boolean au = false;
    public static boolean aw = false;
    public static boolean ax = false;
    public static boolean aH = false;
    public static boolean aI = false;
    public static String aK = null;
    public static boolean aL = false;
    public static boolean aM = false;
    public static boolean aN = false;
    public static boolean aO = false;
    public static boolean aP = false;
    public static String aQ = null;
    public static boolean aT = false;
    public static boolean aU = false;
    public static boolean aV = false;
    public static boolean aW = false;
    public static boolean aX = false;
    public static boolean aY = false;
    public static boolean aZ = false;
    public static String ba = null;
    public static boolean bb = false;
    public static boolean bc = true;
    public static boolean bd = true;
    public static boolean be = false;
    public static boolean bf = false;
    public static o dy = new v();
    public static String dz = Build.VERSION.RELEASE;
    public static boolean dO = false;
    static byte[] dQ = new byte[1000];
    static byte[] dR = new byte[1000];
    static boolean dT = false;
    static int dU = 0;
    static u dW = null;
    public final Object aj = new Object();
    public final Object ak = new Object();
    public Context am = null;
    public boolean ar = false;
    public boolean bi = false;
    public boolean bk = false;
    public boolean bl = false;
    public boolean bm = false;
    public boolean bn = false;
    public boolean bo = false;
    public boolean bq = false;
    public boolean br = false;
    public float bt = 1.0f;
    public float bu = -1.0f;

    /* renamed from: bx */
    public int tick = 0;
    public boolean bE = false;
    public volatile boolean bF = false;
    public volatile boolean bG = false;
    public volatile boolean bH = false;
    public volatile boolean bI = false;
    public com.corrodinggames.rts.gameFramework.player.a cg = new com.corrodinggames.rts.gameFramework.player.a();
    public boolean ch = false;
    public float cn = 1.0f;
    public final Rect cK = new Rect();
    public final Rect cL = new Rect();
    public final RectF cM = new RectF();
    public final Rect cN = new Rect();
    public final RectF cO = new RectF();
    public final RectF cP = new RectF();
    public final Rect cQ = new Rect();
    public float cV = 1.0f;
    public boolean cW = false;
    public float cX = 1.0f;
    public float cY = 1.0f;
    public boolean dc = true;
    public boolean dd = true;
    public boolean de = true;
    public boolean df = true;
    public boolean dg = true;
    public float dh = 0.0f;
    public float di = 0.0f;
    public boolean dj = false;
    protected z dk = null;
    public boolean dq = false;
    public boolean dr = false;
    public float ds = 0.0f;
    public boolean dt = false;
    public boolean du = false;
    public boolean dv = false;
    public float dx = 0.0f;
    boolean dB = false;
    ArrayList dC = new ArrayList();
    final Handler dD = new Handler(Looper.b());
    private Runnable a = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.1
        @Override // java.lang.Runnable
        public void run() {
            String str = GameEngine.this.dE;
            try {
                if (str == null) {
                    GameEngine.print("Cannot show toast, no message");
                } else {
                    Toast.makeText(GameEngine.this.am, str, 1).show();
                }
            } catch (Exception e) {
                GameEngine.print("Error showing toast: " + ((Object) str));
                e.printStackTrace();
            }
        }
    };
    private Runnable b = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.2
        @Override // java.lang.Runnable
        public void run() {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    GameEngine.this.bp = false;
                }
            };
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    GameEngine.this.bp = false;
                }
            };
            GameEngine.m328e("showMessageBoxRunnable context:" + GameEngine.this.am.getClass().getName());
            try {
                new AlertDialog.Builder(GameEngine.this.am).setIcon(17301543).setTitle(GameEngine.this.dF).setMessage(GameEngine.this.dG).setOnCancelListener(onCancelListener).setPositiveButton("Ok", onClickListener).show();
            } catch (WindowManager.BadTokenException e) {
                GameEngine.print("Failed to show message: " + GameEngine.this.dG);
                e.printStackTrace();
            }
        }
    };
    public n dH = null;
    transient String dI = null;
    Object dJ = new Object();
    public boolean[] dM = new boolean[10];
    protected ConcurrentLinkedQueue dN = new ConcurrentLinkedQueue();
    private boolean[] c = new boolean[KeyEvent.a() + 1];
    private boolean[] d = new boolean[KeyEvent.a() + 1];
    public byte dZ = 42;
    public byte ea = 42;
    public final q eb = new q();
    public final q ec = new q();
    public final q ed = new q();

    public abstract void a(Context context);

    public abstract boolean a();

    public abstract boolean a(boolean z);

    public abstract void a(Activity activity, com.corrodinggames.rts.appFramework.f fVar, boolean z);

    public abstract void b(int i, int i2);

    public abstract int c(boolean z);

    public abstract boolean n();

    public abstract boolean p();

    public abstract String l();

    public abstract String m();

    public abstract String r();

    public abstract String t();

    public abstract String u();

    public abstract void s();

    public abstract String v();

    public abstract void a(boolean z, boolean z2, s sVar);

    public abstract void a(boolean z, s sVar);

    public abstract void e();

    public abstract void g();

    public abstract void x();

    public abstract void a(float f, int i);

    public abstract int z();

    public abstract int b();

    public abstract boolean c();

    public abstract boolean d();

    public static boolean b(Context context) {
        String h;
        if (aU) {
            h = "dedicatedServer";
        } else {
            h = context.g().h();
        }
        Log.d("RustedWarfare", "packageName:" + h);
        if (h.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    public boolean A() {
        return this.cS || this.cT > 0.0f || this.cU;
    }

    /* renamed from: B */
    public static final GameEngine getGameEngine() {
        return gameEngine;
    }

    public static final boolean C() {
        return be;
    }

    public static final boolean D() {
        return bf;
    }

    public void c(Context context) {
        com.corrodinggames.rts.appFramework.c.a(context);
        this.am = context;
    }

    public static synchronized GameEngine a(Context context, n nVar) {
        if (gameEngine != null) {
            if (nVar != null) {
                gameEngine.dH = nVar;
            }
            gameEngine.c(context);
            return gameEngine;
        }
        gameEngine = dy.a(context);
        m328e("Created new gameEngine of:" + gameEngine.getClass().getName());
        if (nVar != null) {
            gameEngine.dH = nVar;
        }
        gameEngine.a(context);
        return gameEngine;
    }

    public GameEngine(Context context) {
        Log.d("RustedWarfare", "GameEngine:GameEngine()");
        if (gameEngine != null) {
            throw new RuntimeException("gameEngine already created");
        }
        c(context);
        gameEngine = this;
    }

    protected void finalize() {
        Log.d("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    public boolean E() {
        return true;
    }

    public void F() {
    }

    public String G() {
        if (av()) {
            return "PC";
        }
        if (aZ) {
            String a = com.corrodinggames.rts.gameFramework.l.a.a();
            if (a != null) {
                return "IOS - " + a;
            }
            return "IOS";
        } else if (aU) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    public String H() {
        return dz;
    }

    public boolean I() {
        if (this.bH) {
            return true;
        }
        return false;
    }

    public synchronized void J() {
        m328e("--- setRunning ---");
        if (!av() && !aZ) {
            this.bN.h();
        }
        if (!aW && !bb && this.dk == null) {
            this.dk = new z();
            this.dk.a(true);
            this.dk.start();
        }
    }

    public synchronized void K() {
        m328e("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.dk) {
            L();
        }
    }

    public synchronized void L() {
        m328e("--- setStopped ---");
        if (this.dk == null) {
            Log.d("RustedWarfare", "gameThread already null");
            return;
        }
        if (!av()) {
            this.bN.f();
        }
        this.dk.a(false);
        if (Thread.currentThread() != this.dk) {
            boolean z = true;
            while (z) {
                try {
                    this.dk.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.d("RustedWarfare", "thread stop");
        } else {
            g("currentThread is game thread");
        }
        this.dk = null;
        if (this.ao != null) {
            this.ao.l();
        }
        if (this.bE) {
            Debug.stopMethodTracing();
        }
    }

    public boolean M() {
        if (this.netEngine == null || !this.netEngine.B || this.netEngine.F || this.replayEngine.j()) {
            return false;
        }
        return true;
    }

    public boolean N() {
        if (this.netEngine == null) {
            return false;
        }
        return this.netEngine.B;
    }

    public boolean O() {
        if (this.netEngine == null) {
            return false;
        }
        return this.netEngine.F || this.netEngine.B || this.replayEngine.j();
    }

    public boolean P() {
        if (this.netEngine == null || this.netEngine.F) {
            return true;
        }
        return (this.netEngine.B || this.replayEngine.j()) ? false : true;
    }

    public void Q() {
        this.ct = false;
        if (this.cy < 0.0f) {
            this.cy = 0.0f;
            this.ct = true;
        }
        if (this.cz < 0.0f) {
            this.cz = 0.0f;
            this.ct = true;
        }
        if (this.bL != null) {
            if (this.cy > this.bL.i() - this.cE) {
                this.cy = this.bL.i() - this.cE;
                this.ct = true;
            }
            if (this.cz > this.bL.j() - this.cB) {
                this.cz = this.bL.j() - this.cB;
                this.ct = true;
            }
            if (this.cE > this.bL.i()) {
                this.cy = (this.bL.i() / 2.0f) - (this.cE / 2.0f);
                this.ct = true;
            }
            if (this.cB > this.bL.j()) {
                this.cz = (this.bL.j() / 2.0f) - (this.cB / 2.0f);
                this.ct = true;
            }
        }
        a(this.cy, this.cz);
    }

    public void a(float f, float f2) {
        this.cy = f;
        this.cz = f2;
        this.cu = (int) this.cy;
        this.cv = (int) this.cz;
        this.cw = ((int) (this.cy * this.cX)) / this.cX;
        this.cx = ((int) (this.cz * this.cX)) / this.cX;
        int i = 90;
        if (C()) {
            i = 210;
        }
        this.cN.a((int) (this.cy - i), (int) (this.cz - i), (int) (this.cy + this.cA + i), (int) (this.cz + this.cB + i));
        this.cO.a(this.cN);
        this.cQ.a((int) this.cy, (int) this.cz, (int) (this.cy + this.cA), (int) (this.cz + this.cB));
        this.cP.a((int) (this.cy - 300), (int) (this.cz - 300), (int) (this.cy + this.cA + 300), (int) (this.cz + this.cB + 300));
    }

    public void b(float f, float f2) {
        a(f - (this.cE / 2.0f), f2 - (this.cB / 2.0f));
    }

    public static boolean d(Context context) {
        if (aU) {
            return false;
        }
        if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.c("wifi")).getConnectionInfo();
                if (connectionInfo != null) {
                    if ("BlueStacks".equals(connectionInfo.getSSID())) {
                        return true;
                    }
                    return false;
                }
                return false;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        return false;
    }

    public void R() {
        if (this.cX != 1.0f) {
            this.bO.a(this.cX, this.cX);
        }
    }

    public void S() {
        if (this.cX != 1.0f) {
            this.bO.a(1.0f / this.cX, 1.0f / this.cX);
        }
    }

    public static void a(String str, Exception exc) {
        m328e(str);
        exc.printStackTrace();
    }

    public static String a(String str, String str2) {
        if (ax && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    public static void a(String str) {
        m328e(a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void print(String str) {
        m328e(a(str, "\u001b[33m"));
    }

    public static void a(String str, Throwable th) {
        print(str);
        m328e(VariableScope.nullOrMissingString + th.toString());
        m328e("cause:" + th.getCause());
        th.printStackTrace();
    }

    public static void c(String str) {
        if (aX) {
            Log.b("RustedWarfare", str);
        } else {
            Log.b("RustedWarfare", str);
        }
    }

    public static void d(String str) {
        c(str);
    }

    /* renamed from: e  reason: collision with other method in class */
    public static void m328e(String str) {
        c(str);
    }

    public static void b(String str, String str2) {
        c(str + ":" + str2);
    }

    public static synchronized void f(String str) {
        c(str + " (at " + System.nanoTime() + ")");
    }

    public static void T() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            m328e(stackTraceElement.toString());
        }
    }

    public static String U() {
        StackTraceElement[] stackTrace;
        String str = VariableScope.nullOrMissingString;
        for (int i = 0; i < new Throwable().getStackTrace().length; i++) {
            str = str + stackTrace[i].toString() + "\n";
        }
        return str;
    }

    public static void g(String str) {
        print(str);
        T();
    }

    public static long V() {
        return System.currentTimeMillis();
    }

    public static final boolean a(long j, long j2) {
        long V = V();
        if (j + j2 < V || V < j - 1000) {
            return true;
        }
        return false;
    }

    public float W() {
        float f = this.ci;
        if (this.settingsEngine != null) {
            f = f * this.settingsEngine.renderDensity * this.settingsEngine.uiRenderScale;
            if (this.settingsEngine.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    public int e(float f) {
        return (int) ((f * this.cj) + 0.5f);
    }

    public int a(int i) {
        return (int) ((i * this.cj) + 0.5f);
    }

    public void X() {
        if (this.dA != this.cj) {
            m328e("Density size changed now: " + this.cj + ", refreshing fonts");
            synchronized (this.dC) {
                Iterator it = this.dC.iterator();
                while (it.hasNext()) {
                    ((m) it.next()).a();
                }
            }
            this.dA = this.cj;
            if (this.bO != null) {
            }
        }
    }

    protected void Y() {
        Iterator it = this.dC.iterator();
        while (it.hasNext()) {
            this.bO.a(((m) it.next()).b);
        }
        this.dB = true;
    }

    public void a(Paint paint) {
        a(paint, 16.0f);
    }

    public void a(Paint paint, float f) {
        m mVar = new m(this);
        mVar.a = f;
        mVar.b = paint;
        mVar.a();
        synchronized (this.dC) {
            this.dC.add(mVar);
        }
        if (this.dB) {
            this.bO.a(mVar.b);
        }
    }

    public void b(Paint paint, float f) {
        float e = e(f);
        if (paint.k() != e) {
            paint.b(e);
        }
    }

    public void h(String str) {
        a(str, true);
    }

    public void a(String str, boolean z) {
        this.dI = str;
        if (this.dH != null) {
            this.dH.a(str, z);
        }
    }

    public void Z() {
        this.dI = null;
    }

    public void i(String str) {
        a(str, 1);
    }

    public void a(String str, int i) {
        if (aU) {
            m328e("alert:" + str);
        } else if (str == null) {
            g("Cannot show alert, no message text");
        } else {
            this.dE = str;
            this.dD.a(this.a);
        }
        if (this.dH != null) {
            this.dH.a(str, i);
        }
    }

    public boolean aa() {
        if (this.dH != null) {
            return this.dH.c();
        }
        return false;
    }

    public void a(String str, com.corrodinggames.rts.game.units.custom.bb bbVar) {
        String str2 = null;
        if (bbVar != null) {
            str2 = bbVar.b();
        }
        c(str, str2);
    }

    public void c(String str, String str2) {
        if (this.dH != null) {
            this.dH.a(str, str2);
        }
        if (aU) {
            if (this.dH == null) {
                print("showMessageBox: not showing due to non-android:" + str2);
                return;
            }
            return;
        }
        this.bp = true;
        this.dF = str;
        this.dG = str2;
        this.dD.a(this.b);
    }

    public void ab() {
        synchronized (this.dJ) {
            if (this.dK != null) {
                c(this.dL, this.dK);
                this.dK = null;
                this.dL = null;
            }
        }
    }

    public void d(String str, String str2) {
        this.dL = str;
        this.dK = str2;
        if (aW) {
            ab();
        } else {
            new Thread() { // from class: com.corrodinggames.rts.gameFramework.l.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        sleep(3000L);
                    } catch (InterruptedException e) {
                    }
                    GameEngine.this.ab();
                }
            }.start();
        }
    }

    public boolean ac() {
        if (this.aq || this.ao.k() == null) {
            return false;
        }
        return this.ao.k().b();
    }

    public void ad() {
        if (this.ao.k() == null) {
            return;
        }
        this.ao.k().c();
    }

    public int ae() {
        if (this.aq) {
            return 0;
        }
        return this.ao.k().a();
    }

    public float af() {
        return b(0);
    }

    public float ag() {
        return c(0);
    }

    public float b(int i) {
        if (this.ao == null) {
            return 0.0f;
        }
        if (this.settingsEngine.renderDoubleScale) {
            return this.ao.k().d()[i] / 2.0f;
        }
        return this.ao.k().d()[i];
    }

    public float c(int i) {
        if (this.ao == null) {
            return 0.0f;
        }
        if (this.settingsEngine.renderDoubleScale) {
            return this.ao.k().f()[i] / 2.0f;
        }
        return this.ao.k().f()[i];
    }

    public int d(int i) {
        return this.ao.k().e()[i];
    }

    public boolean e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        }
        if (f(i) != -1) {
            return true;
        }
        return false;
    }

    public int f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] e = this.ao.k().e();
        for (int i2 = 0; i2 < e.length; i2++) {
            if (e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    public boolean g(int i) {
        if (i < this.c.length && i >= 0 && this.c[i] && this.d[i]) {
            this.d[i] = false;
            return true;
        }
        return false;
    }

    public boolean h(int i) {
        if (i >= this.c.length || i < 0) {
            return false;
        }
        return this.c[i];
    }

    public boolean a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int ah = ah();
        if ((i & 2) != 0) {
            if ((ah & 2) == 0) {
                z2 = false;
            }
        } else if ((ah & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((ah & 1) == 0) {
                z2 = false;
            }
        } else if ((ah & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((ah & 4) == 0) {
                z2 = false;
            }
        } else if ((ah & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    public boolean i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    public static String j(int i) {
        String str = VariableScope.nullOrMissingString;
        if ((i & 2) != 0) {
            str = str + "shift+";
        }
        if ((i & 1) != 0) {
            str = str + "ctrl+";
        }
        if ((i & 4) != 0) {
            str = str + "alt+";
        }
        return str;
    }

    public int ah() {
        int i = 0;
        if (h(59) || h(60)) {
            i = 0 + 2;
        }
        if (h(113) || h(114)) {
            i++;
        }
        if (h(57) || h(58)) {
            i += 4;
        }
        return i;
    }

    public boolean c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.c.length) {
            z = this.c[i];
        }
        if (i2 >= 0 && i2 < this.c.length) {
            z2 = this.c[i2];
        }
        return z || z2;
    }

    public void b(int i, boolean z) {
        if (i >= 0 && i < this.c.length) {
            this.c[i] = z;
            if (z) {
                this.d[i] = z;
                return;
            }
            return;
        }
        m328e("setKeyState: Key out of range:" + i);
    }

    public void k(int i) {
        this.dN.add(new t(this, i));
    }

    public int ai() {
        return this.e;
    }

    protected void aj() {
        this.e = 0;
        while (true) {
            p pVar = (p) this.dN.poll();
            if (pVar != null) {
                if (pVar instanceof r) {
                    r rVar = (r) pVar;
                    if (rVar.c >= this.c.length || rVar.c < 0) {
                        b("updateKeyState", "keyCode (" + rVar.c + ") is out of range");
                    } else {
                        this.c[rVar.c] = !rVar.d;
                        this.d[rVar.c] = !rVar.d;
                    }
                } else if (pVar instanceof t) {
                    this.e += ((t) pVar).c;
                }
            } else {
                return;
            }
        }
    }

    public static String j(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    public static String k(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        return str.substring(i);
    }

    public static Integer l(String str) {
        String k = k(str);
        m328e("getMapLevel for :" + str + " file:" + k);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(k);
        if (matcher.matches()) {
            m328e("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    public static String m(String str) {
        GameEngine gameEngine2 = getGameEngine();
        Integer l = l(str);
        if (l == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] a = com.corrodinggames.rts.gameFramework.file.a.a(substring, true);
        if (a == null) {
            return null;
        }
        for (String str2 : a) {
            Integer l2 = l(str2);
            if (l2 != null && l2.intValue() > l.intValue() && (!gameEngine2.ar || com.corrodinggames.rts.appFramework.i.a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    public String ak() {
        return this.dl;
    }

    public String al() {
        String str = this.dl;
        if ((this.dl == null || VariableScope.nullOrMissingString.equals(this.dl)) && N()) {
            str = this.netEngine.l();
        }
        return com.corrodinggames.rts.appFramework.i.e(com.corrodinggames.rts.appFramework.i.d(str));
    }

    public String am() {
        return com.corrodinggames.rts.appFramework.i.d(this.dl);
    }

    public MapType an() {
        if (com.corrodinggames.rts.appFramework.i.g(this.dl)) {
            return MapType.customMap;
        }
        return MapType.skirmishMap;
    }

    public static String a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    public static String b(Throwable th) {
        String replace;
        Throwable th2;
        String message = th.getMessage();
        if (message == null) {
            replace = th.getClass().getName();
        } else {
            replace = message.replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString).replace("java.lang.RuntimeException: ", VariableScope.nullOrMissingString);
        }
        Throwable th3 = th;
        while (true) {
            th2 = th3;
            if (th2 != null) {
                Throwable cause = th2.getCause();
                if (cause == null || cause == th || cause == th2) {
                    break;
                }
                th3 = cause;
            } else {
                break;
            }
        }
        if (th2 != null && th2 != th) {
            String message2 = th2.getMessage();
            if (message2 == null) {
                message2 = th2.getClass().getName();
            }
            if (!message2.equals(replace)) {
                replace = replace + " caused by (" + message2 + ")";
            }
        }
        return replace;
    }

    public static File ao() {
        com.corrodinggames.rts.gameFramework.file.a.d();
        String str = "/SD/rustedWarfare/crashes.txt";
        if (at()) {
            str = "/SD/rustedWarfare/crashes.txt";
        }
        return new File(com.corrodinggames.rts.gameFramework.file.a.e(str));
    }

    public static void e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(com.corrodinggames.rts.gameFramework.file.a.a(ao(), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " - 1.15" + VariableScope.nullOrMissingString + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            m328e("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    public static void ap() {
        if (!at || aU) {
            return;
        }
        if (dS != null) {
            print("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        dS = new com.corrodinggames.rts.gameFramework.utility.d(4000);
        dS.a(new com.corrodinggames.rts.gameFramework.utility.e() { // from class: com.corrodinggames.rts.gameFramework.l.4
            @Override // com.corrodinggames.rts.gameFramework.utility.e
            public void a(com.corrodinggames.rts.gameFramework.utility.a aVar) {
                if (GameEngine.dT) {
                    GameEngine.print("activeANRWatchDog: ANR already detected");
                }
                GameEngine.dT = true;
                GameEngine.print("activeANRWatchDog: ANR detected");
                String a = GameEngine.a(aVar);
                GameNetAPIOperate.a("detectedANR", a);
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(GameSaver.a("lastFreeze", VariableScope.nullOrMissingString, true));
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    printStream.print(a);
                    printStream.close();
                    fileOutputStream.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
        dS.start();
        print("setupANRWatchDog: running");
    }

    public static void aq() {
        if (dP == null && av()) {
            dP = new byte[2500000];
            dP[0] = 2;
            dP[dP.length - 1] = 5;
        }
        if (aA) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof i)) {
            Thread.setDefaultUncaughtExceptionHandler(new i(defaultUncaughtExceptionHandler));
        }
    }

    public boolean ar() {
        return true;
    }

    public boolean as() {
        return true;
    }

    public static void n(String str) {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null) {
            dU++;
            if (dU < 1000) {
                print("reportProblem: " + str);
            }
            if (dU < 10) {
                gameEngine2.a(str, 1);
            }
        }
    }

    public static boolean at() {
        return !aU;
    }

    public static boolean au() {
        return !aW || aZ;
    }

    public static boolean av() {
        return aW && !aZ;
    }

    public static boolean aw() {
        return aW && !aZ;
    }

    public static boolean ax() {
        return aU && !aW;
    }

    public boolean ay() {
        return this.netEngine.B || this.replayEngine.j();
    }

    public void a(com.corrodinggames.rts.game.units.am amVar, float f) {
        this.bW.a((int) amVar.eo, (int) amVar.ep, f, amVar);
        this.bS.i.c(amVar);
    }

    public static boolean az() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.teamShaders && (gameEngine2.settingsEngine.newRender || !at())) {
            return true;
        }
        return aN;
    }

    public static boolean aA() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.shaderEffects && (gameEngine2.settingsEngine.newRender || !at())) {
            return true;
        }
        return aM;
    }

    public static boolean aB() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.shaderEffects && (gameEngine2.settingsEngine.newRender || !at())) {
            return true;
        }
        return aM;
    }

    public static void aC() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    public Context aD() {
        return this.am;
    }

    public static void f(String str, String str2) {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 == null) {
            return;
        }
        if (gameEngine2.bS != null && gameEngine2.bS.h != null) {
            gameEngine2.bS.h.a(str, str2);
        } else {
            g("addMessage: interfaceEngine/messageInterface==null");
        }
    }

    public static void a(u uVar, Throwable th) {
        dQ = null;
        m328e("reportCaughtOutOfMemory:" + dW);
        if (dW != null) {
            return;
        }
        dW = uVar;
        if (th != null) {
            c(th);
        }
        aC();
    }

    public static void c(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable th2) {
            m328e("Failed to print stacktrace");
        }
    }

    public void aE() {
        if (dX && !dY) {
            dY = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int h = this.bZ.h();
            if (h > 1) {
                str = str + "This is often caused by large mods, you currently have: " + h + " mods loaded. ";
            }
            c("Warning: Low memory detected", str);
        }
        if (!dV && dW != null) {
            m328e("Showing out of memory message");
            dV = true;
            String str2 = "trying to load data";
            if (dW == u.gameImage) {
                str2 = "trying to load game textures";
            } else if (dW == u.gameImageCreate) {
                str2 = "trying to create a texture";
            } else if (dW == u.gameImageColor) {
                str2 = "trying to colour new texture";
            } else if (dW == u.gameImageFogBuffer) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (dW == u.gameFont) {
                str2 = "trying to create game fonts";
            } else if (dW == u.gameSound) {
                str2 = "trying to load game sounds";
            } else if (dW == u.uiImage) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int h2 = this.bZ.h();
            if (h2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + h2 + " mods. ";
            }
            if (av() && !EngineLoad.b) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            c("Warning: Out Of Memory", str3);
        }
    }

    public void aF() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.dZ;
            this.ea = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            m328e("Low memory detected");
            e.printStackTrace();
            dX = true;
        }
    }

    public void a(Runnable runnable) {
        this.ec.a(runnable);
    }

    public final boolean a(float f, float f2, float f3) {
        return this.cM.a < f + f3 && f - f3 < this.cM.c && this.cM.b < f2 + f3 && f2 - f3 < this.cM.d;
    }

    public static boolean o(String str) {
        if (aQ == null) {
            return false;
        }
        return aQ.contains(str);
    }

    public static void p(String str) {
        GameNetEngine gameNetEngine = getGameEngine().netEngine;
        String str2 = VariableScope.nullOrMissingString + str;
        print(str2);
        T();
        ej++;
        if (ej < 10 && gameNetEngine != null) {
            gameNetEngine.m(str2);
        }
    }

    public void a(com.corrodinggames.rts.gameFramework.player.f fVar, com.corrodinggames.rts.gameFramework.player.c cVar) {
        this.cg = new com.corrodinggames.rts.gameFramework.player.a(fVar, cVar);
        this.cg.a();
    }
}