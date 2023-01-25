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
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import android.view.KeyEvent;
import android.view.WindowManager;
import android.widget.Toast;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.InterfaceC0096f;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p027f.C0543c;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.mod.C0858a;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0758c;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import com.corrodinggames.rts.gameFramework.p037f.C0833o;
import com.corrodinggames.rts.gameFramework.p043k.C0943l;
import com.corrodinggames.rts.gameFramework.p044l.C0955a;
import com.corrodinggames.rts.gameFramework.player.C0847a;
import com.corrodinggames.rts.gameFramework.player.EnumC0850c;
import com.corrodinggames.rts.gameFramework.player.EnumC0853f;
import com.corrodinggames.rts.gameFramework.status.C1085f;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1101a;
import com.corrodinggames.rts.gameFramework.utility.C1122d;
import com.corrodinggames.rts.gameFramework.utility.C1131i;
import com.corrodinggames.rts.gameFramework.utility.InterfaceC1126e;
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

    /* renamed from: an */
    public Context f6291an;

    /* renamed from: ao */
    public InterfaceC0096f f6292ao;

    /* renamed from: ap */
    public InterfaceC0096f f6293ap;

    /* renamed from: aq */
    public boolean f6294aq;

    /* renamed from: av */
    public static Throwable f6295av;

    /* renamed from: ay */
    public static boolean f6296ay;

    /* renamed from: az */
    public static boolean f6297az;

    /* renamed from: aA */
    public static boolean f6298aA;

    /* renamed from: aB */
    public static boolean f6299aB;

    /* renamed from: aC */
    public static boolean f6300aC;

    /* renamed from: aD */
    public static boolean f6301aD;

    /* renamed from: aE */
    public static boolean f6302aE;

    /* renamed from: aF */
    public static boolean f6303aF;

    /* renamed from: aG */
    public static boolean f6304aG;

    /* renamed from: aJ */
    public static boolean f6305aJ;

    /* renamed from: aR */
    public static boolean f6306aR;

    /* renamed from: aS */
    public boolean f6307aS;

    /* renamed from: bg */
    public static Class f6308bg;

    /* renamed from: bh */
    public static InterfaceC1063y f6309bh;

    /* renamed from: bj */
    public boolean f6310bj;

    /* renamed from: bp */
    public boolean f6311bp;

    /* renamed from: bs */
    public PlayerData f6312bs;

    /* renamed from: bv */
    public boolean f6313bv;

    /* renamed from: bw */
    public boolean f6314bw;

    /* renamed from: by */
    public int f6315by;

    /* renamed from: bz */
    public int f6316bz;

    /* renamed from: bA */
    public int f6317bA;

    /* renamed from: bB */
    public int f6318bB;

    /* renamed from: bC */
    public int f6319bC;

    /* renamed from: bD */
    public boolean f6320bD;

    /* renamed from: bJ */
    public int f6321bJ;

    /* renamed from: bK */
    public C1131i f6322bK;

    /* renamed from: bL */
    public C0173b f6323bL;

    /* renamed from: bM */
    public C0637e f6324bM;

    /* renamed from: bN */
    public C0654am f6325bN;

    /* renamed from: bO */
    public InterfaceC1063y f6326bO;

    /* renamed from: bP */
    public C0632a f6327bP;

    /* renamed from: bQ */
    public SettingsEngine settingsEngine;

    /* renamed from: bR */
    public C0758c f6329bR;

    /* renamed from: bS */
    public C0825g f6330bS;

    /* renamed from: bT */
    public C0644ac f6331bT;

    /* renamed from: bU */
    public C0943l f6332bU;

    /* renamed from: bV */
    public C0642aa f6333bV;

    /* renamed from: bW */
    public C0833o f6334bW;

    /* renamed from: bX */
    public GameNetEngine netEngine;

    /* renamed from: bY */
    public C0731bg f6336bY;

    /* renamed from: bZ */
    public C0858a f6337bZ;

    /* renamed from: ca */
    public C1157y f6338ca;

    /* renamed from: cb */
    public C0725ba f6339cb;

    /* renamed from: cc */
    public C0543c f6340cc;

    /* renamed from: cd */
    public C0742br f6341cd;

    /* renamed from: ce */
    public C1085f f6342ce;

    /* renamed from: cf */
    public C0751c f6343cf;

    /* renamed from: ci */
    public float f6344ci;

    /* renamed from: cj */
    public float f6345cj;

    /* renamed from: ck */
    public static Point f6346ck;

    /* renamed from: cl */
    public float f6347cl;

    /* renamed from: cm */
    public float f6348cm;

    /* renamed from: co */
    public float f6349co;

    /* renamed from: cp */
    public float f6350cp;

    /* renamed from: cq */
    public float f6351cq;

    /* renamed from: cr */
    public float f6352cr;

    /* renamed from: cs */
    public float f6353cs;

    /* renamed from: ct */
    public boolean f6354ct;

    /* renamed from: cu */
    public int f6355cu;

    /* renamed from: cv */
    public int f6356cv;

    /* renamed from: cw */
    public float f6357cw;

    /* renamed from: cx */
    public float f6358cx;

    /* renamed from: cy */
    public float f6359cy;

    /* renamed from: cz */
    public float f6360cz;

    /* renamed from: cA */
    public float f6361cA;

    /* renamed from: cB */
    public float f6362cB;

    /* renamed from: cC */
    public float f6363cC;

    /* renamed from: cD */
    public float f6364cD;

    /* renamed from: cE */
    public float f6365cE;

    /* renamed from: cF */
    public float f6366cF;

    /* renamed from: cG */
    public float f6367cG;

    /* renamed from: cH */
    public float f6368cH;

    /* renamed from: cI */
    public float f6369cI;

    /* renamed from: cJ */
    public float f6370cJ;

    /* renamed from: cR */
    public boolean f6371cR;

    /* renamed from: cS */
    public boolean f6372cS;

    /* renamed from: cT */
    public float f6373cT;

    /* renamed from: cU */
    public boolean f6374cU;

    /* renamed from: cZ */
    public boolean f6375cZ;

    /* renamed from: da */
    public float f6376da;

    /* renamed from: db */
    public float f6377db;

    /* renamed from: dl */
    public String f6378dl;

    /* renamed from: dm */
    public GameInputStream f6379dm;

    /* renamed from: dn */
    public Paint f6380dn;

    /* renamed from: do */
    public Paint f6381do;

    /* renamed from: dp */
    public Paint f6382dp;

    /* renamed from: dw */
    public int f6383dw;

    /* renamed from: dA */
    float f6384dA;

    /* renamed from: dE */
    public String f6385dE;

    /* renamed from: dF */
    public String f6386dF;

    /* renamed from: dG */
    public String f6387dG;

    /* renamed from: dK */
    String f6388dK;

    /* renamed from: dL */
    String f6389dL;

    /* renamed from: e */
    private int f6390e;

    /* renamed from: dP */
    static byte[] f6391dP;

    /* renamed from: dS */
    static C1122d f6392dS;

    /* renamed from: dV */
    static boolean f6393dV;

    /* renamed from: dX */
    static boolean f6394dX;

    /* renamed from: dY */
    static boolean f6395dY;

    /* renamed from: ee */
    public boolean f6396ee;

    /* renamed from: ef */
    public boolean f6397ef;

    /* renamed from: eg */
    public String f6398eg;

    /* renamed from: eh */
    public boolean f6399eh;

    /* renamed from: ei */
    public boolean f6400ei;

    /* renamed from: ej */
    static int f6401ej;

    /* renamed from: al */
    protected static GameEngine gameEngine = null;

    /* renamed from: as */
    public static boolean f6403as = true;

    /* renamed from: at */
    public static boolean f6404at = false;

    /* renamed from: au */
    public static boolean f6405au = false;

    /* renamed from: aw */
    public static boolean f6406aw = false;

    /* renamed from: ax */
    public static boolean f6407ax = false;

    /* renamed from: aH */
    public static boolean f6408aH = false;

    /* renamed from: aI */
    public static boolean f6409aI = false;

    /* renamed from: aK */
    public static String f6410aK = null;

    /* renamed from: aL */
    public static boolean f6411aL = false;

    /* renamed from: aM */
    public static boolean f6412aM = false;

    /* renamed from: aN */
    public static boolean f6413aN = false;

    /* renamed from: aO */
    public static boolean f6414aO = false;

    /* renamed from: aP */
    public static boolean f6415aP = false;

    /* renamed from: aQ */
    public static String f6416aQ = null;

    /* renamed from: aT */
    public static boolean f6417aT = false;

    /* renamed from: aU */
    public static boolean f6418aU = false;

    /* renamed from: aV */
    public static boolean f6419aV = false;

    /* renamed from: aW */
    public static boolean f6420aW = false;

    /* renamed from: aX */
    public static boolean f6421aX = false;

    /* renamed from: aY */
    public static boolean f6422aY = false;

    /* renamed from: aZ */
    public static boolean f6423aZ = false;

    /* renamed from: ba */
    public static String f6424ba = null;

    /* renamed from: bb */
    public static boolean f6425bb = false;

    /* renamed from: bc */
    public static boolean f6426bc = true;

    /* renamed from: bd */
    public static boolean f6427bd = true;

    /* renamed from: be */
    public static boolean f6428be = false;

    /* renamed from: bf */
    public static boolean f6429bf = false;

    /* renamed from: dy */
    public static AbstractC1093o f6430dy = new C1154v();

    /* renamed from: dz */
    public static String f6431dz = Build.VERSION.RELEASE;

    /* renamed from: dO */
    public static boolean f6432dO = false;

    /* renamed from: dQ */
    static byte[] f6433dQ = new byte[1000];

    /* renamed from: dR */
    static byte[] f6434dR = new byte[1000];

    /* renamed from: dT */
    static boolean f6435dT = false;

    /* renamed from: dU */
    static int f6436dU = 0;

    /* renamed from: dW */
    static EnumC1100u f6437dW = null;

    /* renamed from: aj */
    public final Object f6438aj = new Object();

    /* renamed from: ak */
    public final Object f6439ak = new Object();

    /* renamed from: am */
    public Context f6440am = null;

    /* renamed from: ar */
    public boolean f6441ar = false;

    /* renamed from: bi */
    public boolean f6442bi = false;

    /* renamed from: bk */
    public boolean f6443bk = false;

    /* renamed from: bl */
    public boolean f6444bl = false;

    /* renamed from: bm */
    public boolean f6445bm = false;

    /* renamed from: bn */
    public boolean f6446bn = false;

    /* renamed from: bo */
    public boolean f6447bo = false;

    /* renamed from: bq */
    public boolean f6448bq = false;

    /* renamed from: br */
    public boolean f6449br = false;

    /* renamed from: bt */
    public float f6450bt = 1.0f;

    /* renamed from: bu */
    public float f6451bu = -1.0f;

    /* renamed from: bx */
    public int tick = 0;

    /* renamed from: bE */
    public boolean f6453bE = false;

    /* renamed from: bF */
    public volatile boolean f6454bF = false;

    /* renamed from: bG */
    public volatile boolean f6455bG = false;

    /* renamed from: bH */
    public volatile boolean f6456bH = false;

    /* renamed from: bI */
    public volatile boolean f6457bI = false;

    /* renamed from: cg */
    public C0847a f6458cg = new C0847a();

    /* renamed from: ch */
    public boolean f6459ch = false;

    /* renamed from: cn */
    public float f6460cn = 1.0f;

    /* renamed from: cK */
    public final Rect f6461cK = new Rect();

    /* renamed from: cL */
    public final Rect f6462cL = new Rect();

    /* renamed from: cM */
    public final RectF f6463cM = new RectF();

    /* renamed from: cN */
    public final Rect f6464cN = new Rect();

    /* renamed from: cO */
    public final RectF f6465cO = new RectF();

    /* renamed from: cP */
    public final RectF f6466cP = new RectF();

    /* renamed from: cQ */
    public final Rect f6467cQ = new Rect();

    /* renamed from: cV */
    public float f6468cV = 1.0f;

    /* renamed from: cW */
    public boolean f6469cW = false;

    /* renamed from: cX */
    public float f6470cX = 1.0f;

    /* renamed from: cY */
    public float f6471cY = 1.0f;

    /* renamed from: dc */
    public boolean f6472dc = true;

    /* renamed from: dd */
    public boolean f6473dd = true;

    /* renamed from: de */
    public boolean f6474de = true;

    /* renamed from: df */
    public boolean f6475df = true;

    /* renamed from: dg */
    public boolean f6476dg = true;

    /* renamed from: dh */
    public float f6477dh = 0.0f;

    /* renamed from: di */
    public float f6478di = 0.0f;

    /* renamed from: dj */
    public boolean f6479dj = false;

    /* renamed from: dk */
    protected C1158z f6480dk = null;

    /* renamed from: dq */
    public boolean f6481dq = false;

    /* renamed from: dr */
    public boolean f6482dr = false;

    /* renamed from: ds */
    public float f6483ds = 0.0f;

    /* renamed from: dt */
    public boolean f6484dt = false;

    /* renamed from: du */
    public boolean f6485du = false;

    /* renamed from: dv */
    public boolean f6486dv = false;

    /* renamed from: dx */
    public float f6487dx = 0.0f;

    /* renamed from: dB */
    boolean f6488dB = false;

    /* renamed from: dC */
    ArrayList f6489dC = new ArrayList();

    /* renamed from: dD */
    final Handler f6490dD = new Handler(Looper.m5102b());

    /* renamed from: a */
    private Runnable f6491a = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.1
        @Override // java.lang.Runnable
        public void run() {
            String str = GameEngine.this.f6385dE;
            try {
                if (str == null) {
                    GameEngine.print("Cannot show toast, no message");
                } else {
                    Toast.makeText(GameEngine.this.f6440am, str, 1).show();
                }
            } catch (Exception e) {
                GameEngine.print("Error showing toast: " + ((Object) str));
                e.printStackTrace();
            }
        }
    };

    /* renamed from: b */
    private Runnable f6492b = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.l.2
        @Override // java.lang.Runnable
        public void run() {
            DialogInterface.OnClickListener onClickListener = new DialogInterface.OnClickListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.1
                @Override // android.content.DialogInterface.OnClickListener
                public void onClick(DialogInterface dialogInterface, int i) {
                    GameEngine.this.f6311bp = false;
                }
            };
            DialogInterface.OnCancelListener onCancelListener = new DialogInterface.OnCancelListener() { // from class: com.corrodinggames.rts.gameFramework.l.2.2
                @Override // android.content.DialogInterface.OnCancelListener
                public void onCancel(DialogInterface dialogInterface) {
                    GameEngine.this.f6311bp = false;
                }
            };
            GameEngine.m5453e("showMessageBoxRunnable context:" + GameEngine.this.f6440am.getClass().getName());
            try {
                new AlertDialog.Builder(GameEngine.this.f6440am).setIcon(17301543).setTitle(GameEngine.this.f6386dF).setMessage(GameEngine.this.f6387dG).setOnCancelListener(onCancelListener).setPositiveButton("Ok", onClickListener).show();
            } catch (WindowManager.BadTokenException e) {
                GameEngine.print("Failed to show message: " + GameEngine.this.f6387dG);
                e.printStackTrace();
            }
        }
    };

    /* renamed from: dH */
    public AbstractC1065n f6493dH = null;

    /* renamed from: dI */
    transient String f6494dI = null;

    /* renamed from: dJ */
    Object f6495dJ = new Object();

    /* renamed from: dM */
    public boolean[] f6496dM = new boolean[10];

    /* renamed from: dN */
    protected ConcurrentLinkedQueue f6497dN = new ConcurrentLinkedQueue();

    /* renamed from: c */
    private boolean[] f6498c = new boolean[KeyEvent.m5051a() + 1];

    /* renamed from: d */
    private boolean[] f6499d = new boolean[KeyEvent.m5051a() + 1];

    /* renamed from: dZ */
    public byte f6500dZ = 42;

    /* renamed from: ea */
    public byte f6501ea = 42;

    /* renamed from: eb */
    public final C1096q f6502eb = new C1096q();

    /* renamed from: ec */
    public final C1096q f6503ec = new C1096q();

    /* renamed from: ed */
    public final C1096q f6504ed = new C1096q();

    /* renamed from: a */
    public abstract void mo1073a(Context context);

    /* renamed from: a */
    public abstract boolean mo1081a();

    /* renamed from: a */
    public abstract boolean mo1057a(boolean z);

    /* renamed from: a */
    public abstract void mo1074a(Activity activity, InterfaceC0096f interfaceC0096f, boolean z);

    /* renamed from: b */
    public abstract void mo1019b(int i, int i2);

    /* renamed from: c */
    public abstract int mo1005c(boolean z);

    /* renamed from: n */
    public abstract boolean mo976n();

    /* renamed from: p */
    public abstract boolean mo973p();

    /* renamed from: l */
    public abstract String mo980l();

    /* renamed from: m */
    public abstract String mo978m();

    /* renamed from: r */
    public abstract String mo971r();

    /* renamed from: t */
    public abstract String mo969t();

    /* renamed from: u */
    public abstract String mo968u();

    /* renamed from: s */
    public abstract void mo970s();

    /* renamed from: v */
    public abstract String mo967v();

    /* renamed from: a */
    public abstract void mo1055a(boolean z, boolean z2, EnumC1098s enumC1098s);

    /* renamed from: a */
    public abstract void mo1056a(boolean z, EnumC1098s enumC1098s);

    /* renamed from: e */
    public abstract void mo999e();

    /* renamed from: g */
    public abstract void mo991g();

    /* renamed from: x */
    public abstract void mo966x();

    /* renamed from: a */
    public abstract void mo1078a(float f, int i);

    /* renamed from: z */
    public abstract int mo965z();

    /* renamed from: b */
    public abstract int mo1022b();

    /* renamed from: c */
    public abstract boolean mo1012c();

    /* renamed from: d */
    public abstract boolean mo1004d();

    /* renamed from: b */
    public static boolean m1017b(Context context) {
        String mo5298h;
        if (f6418aU) {
            mo5298h = "dedicatedServer";
        } else {
            mo5298h = context.mo5299g().mo5298h();
        }
        Log.m5063d("RustedWarfare", "packageName:" + mo5298h);
        if (mo5298h.contains("rtsdemo")) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    public boolean m1107A() {
        return this.f6372cS || this.f6373cT > 0.0f || this.f6374cU;
    }

    /* renamed from: B */
    public static final GameEngine getGameEngine() {
        return gameEngine;
    }

    /* renamed from: C */
    public static final boolean m1105C() {
        return f6428be;
    }

    /* renamed from: D */
    public static final boolean m1104D() {
        return f6429bf;
    }

    /* renamed from: c */
    public void m1009c(Context context) {
        C0090c.m4934a(context);
        this.f6440am = context;
    }

    /* renamed from: a */
    public static synchronized GameEngine m1072a(Context context, AbstractC1065n abstractC1065n) {
        if (gameEngine != null) {
            if (abstractC1065n != null) {
                gameEngine.f6493dH = abstractC1065n;
            }
            gameEngine.m1009c(context);
            return gameEngine;
        }
        gameEngine = f6430dy.mo448a(context);
        m5453e("Created new gameEngine of:" + gameEngine.getClass().getName());
        if (abstractC1065n != null) {
            gameEngine.f6493dH = abstractC1065n;
        }
        gameEngine.mo1073a(context);
        return gameEngine;
    }

    public GameEngine(Context context) {
        Log.m5063d("RustedWarfare", "GameEngine:GameEngine()");
        if (gameEngine != null) {
            throw new RuntimeException("gameEngine already created");
        }
        m1009c(context);
        gameEngine = this;
    }

    protected void finalize() {
        Log.m5063d("RustedWarfare", "GameEngine:finalize()");
        super.finalize();
    }

    /* renamed from: E */
    public boolean m1103E() {
        return true;
    }

    /* renamed from: F */
    public void m1102F() {
    }

    /* renamed from: G */
    public String m1101G() {
        if (m1027av()) {
            return "PC";
        }
        if (f6423aZ) {
            String m964a = C0955a.m964a();
            if (m964a != null) {
                return "IOS - " + m964a;
            }
            return "IOS";
        } else if (f6418aU) {
            return "SERVER";
        } else {
            return Build.MODEL;
        }
    }

    /* renamed from: H */
    public String m1100H() {
        return f6431dz;
    }

    /* renamed from: I */
    public boolean m1099I() {
        if (this.f6456bH) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public synchronized void m1098J() {
        m5453e("--- setRunning ---");
        if (!m1027av() && !f6423aZ) {
            this.f6325bN.m2737h();
        }
        if (!f6420aW && !f6425bb && this.f6480dk == null) {
            this.f6480dk = new C1158z();
            this.f6480dk.m415a(true);
            this.f6480dk.start();
        }
    }

    /* renamed from: K */
    public synchronized void m1097K() {
        m5453e("--- setStoppedIfNotInGameThread ---");
        if (Thread.currentThread() != this.f6480dk) {
            m1096L();
        }
    }

    /* renamed from: L */
    public synchronized void m1096L() {
        m5453e("--- setStopped ---");
        if (this.f6480dk == null) {
            Log.m5063d("RustedWarfare", "gameThread already null");
            return;
        }
        if (!m1027av()) {
            this.f6325bN.m2739f();
        }
        this.f6480dk.m415a(false);
        if (Thread.currentThread() != this.f6480dk) {
            boolean z = true;
            while (z) {
                try {
                    this.f6480dk.join();
                    z = false;
                } catch (InterruptedException e) {
                }
            }
            Log.m5063d("RustedWarfare", "thread stop");
        } else {
            m989g("currentThread is game thread");
        }
        this.f6480dk = null;
        if (this.f6292ao != null) {
            this.f6292ao.mo238l();
        }
        if (this.f6453bE) {
            Debug.stopMethodTracing();
        }
    }

    /* renamed from: M */
    public boolean m1095M() {
        if (this.netEngine == null || !this.netEngine.f5782B || this.netEngine.f5783F || this.f6339cb.m2479j()) {
            return false;
        }
        return true;
    }

    /* renamed from: N */
    public boolean m1094N() {
        if (this.netEngine == null) {
            return false;
        }
        return this.netEngine.f5782B;
    }

    /* renamed from: O */
    public boolean m1093O() {
        if (this.netEngine == null) {
            return false;
        }
        return this.netEngine.f5783F || this.netEngine.f5782B || this.f6339cb.m2479j();
    }

    /* renamed from: P */
    public boolean m1092P() {
        if (this.netEngine == null || this.netEngine.f5783F) {
            return true;
        }
        return (this.netEngine.f5782B || this.f6339cb.m2479j()) ? false : true;
    }

    /* renamed from: Q */
    public void m1091Q() {
        this.f6354ct = false;
        if (this.f6359cy < 0.0f) {
            this.f6359cy = 0.0f;
            this.f6354ct = true;
        }
        if (this.f6360cz < 0.0f) {
            this.f6360cz = 0.0f;
            this.f6354ct = true;
        }
        if (this.f6323bL != null) {
            if (this.f6359cy > this.f6323bL.m4599i() - this.f6365cE) {
                this.f6359cy = this.f6323bL.m4599i() - this.f6365cE;
                this.f6354ct = true;
            }
            if (this.f6360cz > this.f6323bL.m4598j() - this.f6362cB) {
                this.f6360cz = this.f6323bL.m4598j() - this.f6362cB;
                this.f6354ct = true;
            }
            if (this.f6365cE > this.f6323bL.m4599i()) {
                this.f6359cy = (this.f6323bL.m4599i() / 2.0f) - (this.f6365cE / 2.0f);
                this.f6354ct = true;
            }
            if (this.f6362cB > this.f6323bL.m4598j()) {
                this.f6360cz = (this.f6323bL.m4598j() / 2.0f) - (this.f6362cB / 2.0f);
                this.f6354ct = true;
            }
        }
        m1080a(this.f6359cy, this.f6360cz);
    }

    /* renamed from: a */
    public void m1080a(float f, float f2) {
        this.f6359cy = f;
        this.f6360cz = f2;
        this.f6355cu = (int) this.f6359cy;
        this.f6356cv = (int) this.f6360cz;
        this.f6357cw = ((int) (this.f6359cy * this.f6470cX)) / this.f6470cX;
        this.f6358cx = ((int) (this.f6360cz * this.f6470cX)) / this.f6470cX;
        int i = 90;
        if (m1105C()) {
            i = 210;
        }
        this.f6464cN.m5166a((int) (this.f6359cy - i), (int) (this.f6360cz - i), (int) (this.f6359cy + this.f6361cA + i), (int) (this.f6360cz + this.f6362cB + i));
        this.f6465cO.m5151a(this.f6464cN);
        this.f6467cQ.m5166a((int) this.f6359cy, (int) this.f6360cz, (int) (this.f6359cy + this.f6361cA), (int) (this.f6360cz + this.f6362cB));
        this.f6466cP.m5152a((int) (this.f6359cy - 300), (int) (this.f6360cz - 300), (int) (this.f6359cy + this.f6361cA + 300), (int) (this.f6360cz + this.f6362cB + 300));
    }

    /* renamed from: b */
    public void m1021b(float f, float f2) {
        m1080a(f - (this.f6365cE / 2.0f), f2 - (this.f6362cB / 2.0f));
    }

    /* renamed from: d */
    public static boolean m1002d(Context context) {
        if (f6418aU) {
            return false;
        }
        if (Build.MODEL.equals("GT-I9100") || Build.MODEL.equals("GT-I9300")) {
            try {
                WifiInfo connectionInfo = ((WifiManager) context.mo5303c("wifi")).getConnectionInfo();
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

    /* renamed from: R */
    public void m1090R() {
        if (this.f6470cX != 1.0f) {
            this.f6326bO.mo227a(this.f6470cX, this.f6470cX);
        }
    }

    /* renamed from: S */
    public void m1089S() {
        if (this.f6470cX != 1.0f) {
            this.f6326bO.mo227a(1.0f / this.f6470cX, 1.0f / this.f6470cX);
        }
    }

    /* renamed from: a */
    public static void m1062a(String str, Exception exc) {
        m5453e(str);
        exc.printStackTrace();
    }

    /* renamed from: a */
    public static String m1061a(String str, String str2) {
        if (f6407ax && !str.contains("\u001b[0m")) {
            str = str2 + str + "\u001b[0m";
        }
        return str;
    }

    /* renamed from: a */
    public static void m1065a(String str) {
        m5453e(m1061a("--- ERROR: " + str, "\u001b[31m"));
    }

    /* renamed from: b */
    public static void print(String str) {
        m5453e(m1061a(str, "\u001b[33m"));
    }

    /* renamed from: a */
    public static void m1060a(String str, Throwable th) {
        print(str);
        m5453e(VariableScope.nullOrMissingString + th.toString());
        m5453e("cause:" + th.getCause());
        th.printStackTrace();
    }

    /* renamed from: c */
    public static void m1008c(String str) {
        if (f6421aX) {
            Log.m5067b("RustedWarfare", str);
        } else {
            Log.m5067b("RustedWarfare", str);
        }
    }

    /* renamed from: d */
    public static void m1001d(String str) {
        m1008c(str);
    }

    /* renamed from: e */
    public static void m5453e(String str) {
        m1008c(str);
    }

    /* renamed from: b */
    public static void m1014b(String str, String str2) {
        m1008c(str + ":" + str2);
    }

    /* renamed from: f */
    public static synchronized void m993f(String str) {
        m1008c(str + " (at " + System.nanoTime() + ")");
    }

    /* renamed from: T */
    public static void m1088T() {
        for (StackTraceElement stackTraceElement : new Throwable().getStackTrace()) {
            m5453e(stackTraceElement.toString());
        }
    }

    /* renamed from: U */
    public static String m1087U() {
        StackTraceElement[] stackTrace;
        String str = VariableScope.nullOrMissingString;
        for (int i = 0; i < new Throwable().getStackTrace().length; i++) {
            str = str + stackTrace[i].toString() + "\n";
        }
        return str;
    }

    /* renamed from: g */
    public static void m989g(String str) {
        print(str);
        m1088T();
    }

    /* renamed from: V */
    public static long m1086V() {
        return System.currentTimeMillis();
    }

    /* renamed from: a */
    public static final boolean m1075a(long j, long j2) {
        long m1086V = m1086V();
        if (j + j2 < m1086V || m1086V < j - 1000) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    public float m1085W() {
        float f = this.f6344ci;
        if (this.settingsEngine != null) {
            f = f * this.settingsEngine.renderDensity * this.settingsEngine.uiRenderScale;
            if (this.settingsEngine.renderDoubleScale) {
                return f / 2.0f;
            }
        }
        return f;
    }

    /* renamed from: e */
    public int m998e(float f) {
        return (int) ((f * this.f6345cj) + 0.5f);
    }

    /* renamed from: a */
    public int m1077a(int i) {
        return (int) ((i * this.f6345cj) + 0.5f);
    }

    /* renamed from: X */
    public void m1084X() {
        if (this.f6384dA != this.f6345cj) {
            m5453e("Density size changed now: " + this.f6345cj + ", refreshing fonts");
            synchronized (this.f6489dC) {
                Iterator it = this.f6489dC.iterator();
                while (it.hasNext()) {
                    ((C0958m) it.next()).m954a();
                }
            }
            this.f6384dA = this.f6345cj;
            if (this.f6326bO != null) {
            }
        }
    }

    /* renamed from: Y */
    protected void m1083Y() {
        Iterator it = this.f6489dC.iterator();
        while (it.hasNext()) {
            this.f6326bO.mo212a(((C0958m) it.next()).f6512b);
        }
        this.f6488dB = true;
    }

    /* renamed from: a */
    public void m1071a(Paint paint) {
        m1070a(paint, 16.0f);
    }

    /* renamed from: a */
    public void m1070a(Paint paint, float f) {
        C0958m c0958m = new C0958m(this);
        c0958m.f6511a = f;
        c0958m.f6512b = paint;
        c0958m.m954a();
        synchronized (this.f6489dC) {
            this.f6489dC.add(c0958m);
        }
        if (this.f6488dB) {
            this.f6326bO.mo212a(c0958m.f6512b);
        }
    }

    /* renamed from: b */
    public void m1016b(Paint paint, float f) {
        float m998e = m998e(f);
        if (paint.m5180k() != m998e) {
            paint.mo912b(m998e);
        }
    }

    /* renamed from: h */
    public void m987h(String str) {
        m1059a(str, true);
    }

    /* renamed from: a */
    public void m1059a(String str, boolean z) {
        this.f6494dI = str;
        if (this.f6493dH != null) {
            this.f6493dH.mo109a(str, z);
        }
    }

    /* renamed from: Z */
    public void m1082Z() {
        this.f6494dI = null;
    }

    /* renamed from: i */
    public void m985i(String str) {
        m1064a(str, 1);
    }

    /* renamed from: a */
    public void m1064a(String str, int i) {
        if (f6418aU) {
            m5453e("alert:" + str);
        } else if (str == null) {
            m989g("Cannot show alert, no message text");
        } else {
            this.f6385dE = str;
            this.f6490dD.m5112a(this.f6491a);
        }
        if (this.f6493dH != null) {
            this.f6493dH.mo111a(str, i);
        }
    }

    /* renamed from: aa */
    public boolean m1048aa() {
        if (this.f6493dH != null) {
            return this.f6493dH.mo105c();
        }
        return false;
    }

    /* renamed from: a */
    public void m1063a(String str, C0404bb c0404bb) {
        String str2 = null;
        if (c0404bb != null) {
            str2 = c0404bb.m3909b();
        }
        m1007c(str, str2);
    }

    /* renamed from: c */
    public void m1007c(String str, String str2) {
        if (this.f6493dH != null) {
            this.f6493dH.mo110a(str, str2);
        }
        if (f6418aU) {
            if (this.f6493dH == null) {
                print("showMessageBox: not showing due to non-android:" + str2);
                return;
            }
            return;
        }
        this.f6311bp = true;
        this.f6386dF = str;
        this.f6387dG = str2;
        this.f6490dD.m5112a(this.f6492b);
    }

    /* renamed from: ab */
    public void m1047ab() {
        synchronized (this.f6495dJ) {
            if (this.f6388dK != null) {
                m1007c(this.f6389dL, this.f6388dK);
                this.f6388dK = null;
                this.f6389dL = null;
            }
        }
    }

    /* renamed from: d */
    public void m1000d(String str, String str2) {
        this.f6389dL = str;
        this.f6388dK = str2;
        if (f6420aW) {
            m1047ab();
        } else {
            new Thread() { // from class: com.corrodinggames.rts.gameFramework.l.3
                @Override // java.lang.Thread, java.lang.Runnable
                public void run() {
                    try {
                        sleep(3000L);
                    } catch (InterruptedException e) {
                    }
                    GameEngine.this.m1047ab();
                }
            }.start();
        }
    }

    /* renamed from: ac */
    public boolean m1046ac() {
        if (this.f6294aq || this.f6292ao.mo239k() == null) {
            return false;
        }
        return this.f6292ao.mo239k().m4901b();
    }

    /* renamed from: ad */
    public void m1045ad() {
        if (this.f6292ao.mo239k() == null) {
            return;
        }
        this.f6292ao.mo239k().m4900c();
    }

    /* renamed from: ae */
    public int m1044ae() {
        if (this.f6294aq) {
            return 0;
        }
        return this.f6292ao.mo239k().m4904a();
    }

    /* renamed from: af */
    public float m1043af() {
        return m1020b(0);
    }

    /* renamed from: ag */
    public float m1042ag() {
        return m1011c(0);
    }

    /* renamed from: b */
    public float m1020b(int i) {
        if (this.f6292ao == null) {
            return 0.0f;
        }
        if (this.settingsEngine.renderDoubleScale) {
            return this.f6292ao.mo239k().m4899d()[i] / 2.0f;
        }
        return this.f6292ao.mo239k().m4899d()[i];
    }

    /* renamed from: c */
    public float m1011c(int i) {
        if (this.f6292ao == null) {
            return 0.0f;
        }
        if (this.settingsEngine.renderDoubleScale) {
            return this.f6292ao.mo239k().m4897f()[i] / 2.0f;
        }
        return this.f6292ao.mo239k().m4897f()[i];
    }

    /* renamed from: d */
    public int m1003d(int i) {
        return this.f6292ao.mo239k().m4898e()[i];
    }

    /* renamed from: e */
    public boolean m997e(int i) {
        if (i != 1 && i != 2 && i != 3) {
            throw new RuntimeException("Unknown mouseButton:" + i);
        }
        if (m994f(i) != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public int m994f(int i) {
        if (i == 0) {
            throw new RuntimeException("finding state of 0 doesn't make sense");
        }
        int[] m4898e = this.f6292ao.mo239k().m4898e();
        for (int i2 = 0; i2 < m4898e.length; i2++) {
            if (m4898e[i2] == i) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: g */
    public boolean m990g(int i) {
        if (i < this.f6498c.length && i >= 0 && this.f6498c[i] && this.f6499d[i]) {
            this.f6499d[i] = false;
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public boolean m988h(int i) {
        if (i >= this.f6498c.length || i < 0) {
            return false;
        }
        return this.f6498c[i];
    }

    /* renamed from: a */
    public boolean m1076a(int i, boolean z) {
        boolean z2 = true;
        boolean z3 = true;
        int m1041ah = m1041ah();
        if ((i & 2) != 0) {
            if ((m1041ah & 2) == 0) {
                z2 = false;
            }
        } else if ((m1041ah & 2) != 0) {
            z3 = false;
        }
        if ((i & 1) != 0) {
            if ((m1041ah & 1) == 0) {
                z2 = false;
            }
        } else if ((m1041ah & 1) != 0) {
            z3 = false;
        }
        if ((i & 4) != 0) {
            if ((m1041ah & 4) == 0) {
                z2 = false;
            }
        } else if ((m1041ah & 4) != 0) {
            z3 = false;
        }
        if (z) {
            return z2;
        }
        return z2 && z3;
    }

    /* renamed from: i */
    public boolean m986i(int i) {
        if (i == 59 || i == 60 || i == 113 || i == 114 || i == 57 || i == 58) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public static String m984j(int i) {
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

    /* renamed from: ah */
    public int m1041ah() {
        int i = 0;
        if (m988h(59) || m988h(60)) {
            i = 0 + 2;
        }
        if (m988h(113) || m988h(114)) {
            i++;
        }
        if (m988h(57) || m988h(58)) {
            i += 4;
        }
        return i;
    }

    /* renamed from: c */
    public boolean m1010c(int i, int i2) {
        boolean z = false;
        boolean z2 = false;
        if (i >= 0 && i < this.f6498c.length) {
            z = this.f6498c[i];
        }
        if (i2 >= 0 && i2 < this.f6498c.length) {
            z2 = this.f6498c[i2];
        }
        return z || z2;
    }

    /* renamed from: b */
    public void m1018b(int i, boolean z) {
        if (i >= 0 && i < this.f6498c.length) {
            this.f6498c[i] = z;
            if (z) {
                this.f6499d[i] = z;
                return;
            }
            return;
        }
        m5453e("setKeyState: Key out of range:" + i);
    }

    /* renamed from: k */
    public void m982k(int i) {
        this.f6497dN.add(new C1099t(this, i));
    }

    /* renamed from: ai */
    public int m1040ai() {
        return this.f6390e;
    }

    /* renamed from: aj */
    protected void m1039aj() {
        this.f6390e = 0;
        while (true) {
            C1095p c1095p = (C1095p) this.f6497dN.poll();
            if (c1095p != null) {
                if (c1095p instanceof C1097r) {
                    C1097r c1097r = (C1097r) c1095p;
                    if (c1097r.f6952c >= this.f6498c.length || c1097r.f6952c < 0) {
                        m1014b("updateKeyState", "keyCode (" + c1097r.f6952c + ") is out of range");
                    } else {
                        this.f6498c[c1097r.f6952c] = !c1097r.f6953d;
                        this.f6499d[c1097r.f6952c] = !c1097r.f6953d;
                    }
                } else if (c1095p instanceof C1099t) {
                    this.f6390e += ((C1099t) c1095p).f6958c;
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: j */
    public static String m983j(String str) {
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        return str.substring(0, lastIndexOf);
    }

    /* renamed from: k */
    public static String m981k(String str) {
        int i;
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            i = 0;
        } else {
            i = lastIndexOf + 1;
        }
        return str.substring(i);
    }

    /* renamed from: l */
    public static Integer m979l(String str) {
        String m981k = m981k(str);
        m5453e("getMapLevel for :" + str + " file:" + m981k);
        Matcher matcher = Pattern.compile("^l(\\d*);.*").matcher(m981k);
        if (matcher.matches()) {
            m5453e("getMapLevel:" + str + ":" + Integer.parseInt(matcher.group(1)));
            return Integer.valueOf(Integer.parseInt(matcher.group(1)));
        }
        return null;
    }

    /* renamed from: m */
    public static String m977m(String str) {
        GameEngine gameEngine2 = getGameEngine();
        Integer m979l = m979l(str);
        if (m979l == null) {
            return null;
        }
        int lastIndexOf = str.lastIndexOf("/");
        if (lastIndexOf == -1) {
            lastIndexOf = str.length();
        }
        String substring = str.substring(0, lastIndexOf);
        String[] m2295a = C0765a.m2295a(substring, true);
        if (m2295a == null) {
            return null;
        }
        for (String str2 : m2295a) {
            Integer m979l2 = m979l(str2);
            if (m979l2 != null && m979l2.intValue() > m979l.intValue() && (!gameEngine2.f6441ar || ActivityC0117i.m4914a(str2, substring + "/" + str2))) {
                return substring + "/" + str2;
            }
        }
        return null;
    }

    /* renamed from: ak */
    public String m1038ak() {
        return this.f6378dl;
    }

    /* renamed from: al */
    public String m1037al() {
        String str = this.f6378dl;
        if ((this.f6378dl == null || VariableScope.nullOrMissingString.equals(this.f6378dl)) && m1094N()) {
            str = this.netEngine.m1450l();
        }
        return ActivityC0117i.m4911e(ActivityC0117i.m4912d(str));
    }

    /* renamed from: am */
    public String m1036am() {
        return ActivityC0117i.m4912d(this.f6378dl);
    }

    /* renamed from: an */
    public MapType m1035an() {
        if (ActivityC0117i.m4909g(this.f6378dl)) {
            return MapType.f5868b;
        }
        return MapType.f5867a;
    }

    /* renamed from: a */
    public static String m1058a(Throwable th) {
        StringWriter stringWriter = new StringWriter();
        PrintWriter printWriter = new PrintWriter(stringWriter);
        th.printStackTrace(printWriter);
        String obj = stringWriter.toString();
        printWriter.close();
        return obj;
    }

    /* renamed from: b */
    public static String m1013b(Throwable th) {
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

    /* renamed from: ao */
    public static File m1034ao() {
        C0765a.m2285d();
        String str = "/SD/rustedWarfare/crashes.txt";
        if (m1029at()) {
            str = "/SD/rustedWarfare/crashes.txt";
        }
        return new File(C0765a.m2282e(str));
    }

    /* renamed from: e */
    public static void m995e(String str, String str2) {
        try {
            PrintWriter printWriter = new PrintWriter(C0765a.m2299a(m1034ao(), true));
            printWriter.write("\r\n" + str + " (at " + new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS").format(new Date()) + " - 1.15" + VariableScope.nullOrMissingString + ")\n");
            printWriter.write(str2 + "\r\n");
            printWriter.close();
        } catch (Throwable th) {
            m5453e("Exception in writeCrashToFile");
            th.printStackTrace();
        }
    }

    /* renamed from: ap */
    public static void m1033ap() {
        if (!f6404at || f6418aU) {
            return;
        }
        if (f6392dS != null) {
            print("setupANRWatchDog: activeANRWatchDog!=null");
            return;
        }
        f6392dS = new C1122d(4000);
        f6392dS.m564a(new InterfaceC1126e() { // from class: com.corrodinggames.rts.gameFramework.l.4
            @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1126e
            /* renamed from: a */
            public void mo563a(C1101a c1101a) {
                if (GameEngine.f6435dT) {
                    GameEngine.print("activeANRWatchDog: ANR already detected");
                }
                GameEngine.f6435dT = true;
                GameEngine.print("activeANRWatchDog: ANR detected");
                String m1058a = GameEngine.m1058a(c1101a);
                GameNetAPIOperate.m1275a("detectedANR", m1058a);
                try {
                    Thread.sleep(400L);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(C1157y.m424a("lastFreeze", VariableScope.nullOrMissingString, true));
                    PrintStream printStream = new PrintStream(fileOutputStream);
                    printStream.print(m1058a);
                    printStream.close();
                    fileOutputStream.close();
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
            }
        });
        f6392dS.start();
        print("setupANRWatchDog: running");
    }

    /* renamed from: aq */
    public static void m1032aq() {
        if (f6391dP == null && m1027av()) {
            f6391dP = new byte[2500000];
            f6391dP[0] = 2;
            f6391dP[f6391dP.length - 1] = 5;
        }
        if (f6298aA) {
            Thread.UncaughtExceptionHandler uncaughtExceptionHandler = Thread.currentThread().getUncaughtExceptionHandler();
            if (!(uncaughtExceptionHandler instanceof C0857i)) {
                Thread.currentThread().setUncaughtExceptionHandler(new C0857i(uncaughtExceptionHandler));
                return;
            }
            return;
        }
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler();
        if (!(defaultUncaughtExceptionHandler instanceof C0857i)) {
            Thread.setDefaultUncaughtExceptionHandler(new C0857i(defaultUncaughtExceptionHandler));
        }
    }

    /* renamed from: ar */
    public boolean m1031ar() {
        return true;
    }

    /* renamed from: as */
    public boolean m1030as() {
        return true;
    }

    /* renamed from: n */
    public static void m975n(String str) {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null) {
            f6436dU++;
            if (f6436dU < 1000) {
                print("reportProblem: " + str);
            }
            if (f6436dU < 10) {
                gameEngine2.m1064a(str, 1);
            }
        }
    }

    /* renamed from: at */
    public static boolean m1029at() {
        return !f6418aU;
    }

    /* renamed from: au */
    public static boolean m1028au() {
        return !f6420aW || f6423aZ;
    }

    /* renamed from: av */
    public static boolean m1027av() {
        return f6420aW && !f6423aZ;
    }

    /* renamed from: aw */
    public static boolean m1026aw() {
        return f6420aW && !f6423aZ;
    }

    /* renamed from: ax */
    public static boolean m1025ax() {
        return f6418aU && !f6420aW;
    }

    /* renamed from: ay */
    public boolean m1024ay() {
        return this.netEngine.f5782B || this.f6339cb.m2479j();
    }

    /* renamed from: a */
    public void m1069a(AbstractC0244am abstractC0244am, float f) {
        this.f6334bW.m1772a((int) abstractC0244am.f7172eo, (int) abstractC0244am.f7173ep, f, abstractC0244am);
        this.f6330bS.f5265i.m1938c(abstractC0244am);
    }

    /* renamed from: az */
    public static boolean m1023az() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.teamShaders && (gameEngine2.settingsEngine.newRender || !m1029at())) {
            return true;
        }
        return f6413aN;
    }

    /* renamed from: aA */
    public static boolean m1054aA() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.shaderEffects && (gameEngine2.settingsEngine.newRender || !m1029at())) {
            return true;
        }
        return f6412aM;
    }

    /* renamed from: aB */
    public static boolean m1053aB() {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 != null && gameEngine2.settingsEngine.shaderEffects && (gameEngine2.settingsEngine.newRender || !m1029at())) {
            return true;
        }
        return f6412aM;
    }

    /* renamed from: aC */
    public static void m1052aC() {
        System.out.println("Free memory (bytes): " + Runtime.getRuntime().freeMemory());
        long maxMemory = Runtime.getRuntime().maxMemory();
        System.out.println("Maximum memory (bytes): " + (maxMemory == Long.MAX_VALUE ? "no limit" : Long.valueOf(maxMemory)));
        System.out.println("Total memory (bytes): " + Runtime.getRuntime().totalMemory());
    }

    /* renamed from: aD */
    public Context m1051aD() {
        return this.f6440am;
    }

    /* renamed from: f */
    public static void m992f(String str, String str2) {
        GameEngine gameEngine2 = getGameEngine();
        if (gameEngine2 == null) {
            return;
        }
        if (gameEngine2.f6330bS != null && gameEngine2.f6330bS.f5264h != null) {
            gameEngine2.f6330bS.f5264h.m1781a(str, str2);
        } else {
            m989g("addMessage: interfaceEngine/messageInterface==null");
        }
    }

    /* renamed from: a */
    public static void m1067a(EnumC1100u enumC1100u, Throwable th) {
        f6433dQ = null;
        m5453e("reportCaughtOutOfMemory:" + f6437dW);
        if (f6437dW != null) {
            return;
        }
        f6437dW = enumC1100u;
        if (th != null) {
            m1006c(th);
        }
        m1052aC();
    }

    /* renamed from: c */
    public static void m1006c(Throwable th) {
        try {
            th.printStackTrace();
        } catch (Throwable th2) {
            m5453e("Failed to print stacktrace");
        }
    }

    /* renamed from: aE */
    public void m1050aE() {
        if (f6394dX && !f6395dY) {
            f6395dY = true;
            String str = "Warning game has less than 5mb of free space remaining. A larger battle might cause a crash. ";
            int m1680h = this.f6337bZ.m1680h();
            if (m1680h > 1) {
                str = str + "This is often caused by large mods, you currently have: " + m1680h + " mods loaded. ";
            }
            m1007c("Warning: Low memory detected", str);
        }
        if (!f6393dV && f6437dW != null) {
            m5453e("Showing out of memory message");
            f6393dV = true;
            String str2 = "trying to load data";
            if (f6437dW == EnumC1100u.gameImage) {
                str2 = "trying to load game textures";
            } else if (f6437dW == EnumC1100u.gameImageCreate) {
                str2 = "trying to create a texture";
            } else if (f6437dW == EnumC1100u.gameImageColor) {
                str2 = "trying to colour new texture";
            } else if (f6437dW == EnumC1100u.gameImageFogBuffer) {
                str2 = "trying to create texture buffer for on-screen fog fading";
            } else if (f6437dW == EnumC1100u.gameFont) {
                str2 = "trying to create game fonts";
            } else if (f6437dW == EnumC1100u.gameSound) {
                str2 = "trying to load game sounds";
            } else if (f6437dW == EnumC1100u.uiImage) {
                str2 = "trying to load UI textures";
            }
            String str3 = "The game ran out of memory " + str2 + ". ";
            int m1680h2 = this.f6337bZ.m1680h();
            if (m1680h2 > 1) {
                str3 = str3 + "This is often caused by large mods, you currently have: " + m1680h2 + " mods. ";
            }
            if (m1027av() && !C0191i.f1219b) {
                str3 = str3 + "You are also using the 32 bit version, switching to the 64 bit version might help. ";
            }
            m1007c("Warning: Out Of Memory", str3);
        }
    }

    /* renamed from: aF */
    public void m1049aF() {
        try {
            byte[] bArr = new byte[5000000];
            bArr[0] = this.f6500dZ;
            this.f6501ea = bArr[1];
        } catch (OutOfMemoryError e) {
            System.gc();
            m5453e("Low memory detected");
            e.printStackTrace();
            f6394dX = true;
        }
    }

    /* renamed from: a */
    public void m1066a(Runnable runnable) {
        this.f6503ec.m751a(runnable);
    }

    /* renamed from: a */
    public final boolean m1079a(float f, float f2, float f3) {
        return this.f6463cM.f234a < f + f3 && f - f3 < this.f6463cM.f236c && this.f6463cM.f235b < f2 + f3 && f2 - f3 < this.f6463cM.f237d;
    }

    /* renamed from: o */
    public static boolean m974o(String str) {
        if (f6416aQ == null) {
            return false;
        }
        return f6416aQ.contains(str);
    }

    /* renamed from: p */
    public static void m972p(String str) {
        GameNetEngine gameNetEngine = getGameEngine().netEngine;
        String str2 = VariableScope.nullOrMissingString + str;
        print(str2);
        m1088T();
        f6401ej++;
        if (f6401ej < 10 && gameNetEngine != null) {
            gameNetEngine.m1447m(str2);
        }
    }

    /* renamed from: a */
    public void m1068a(EnumC0853f enumC0853f, EnumC0850c enumC0850c) {
        this.f6458cg = new C0847a(enumC0853f, enumC0850c);
        this.f6458cg.m1735a();
    }
}