package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0625u;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0386ay;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0473z;
import com.corrodinggames.rts.game.units.custom.EnumC0348af;
import com.corrodinggames.rts.game.units.custom.EnumC0387az;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.gameFramework.AbstractC0674az;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnumC0914m;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.C0761f;
import com.corrodinggames.rts.gameFramework.p035d.C0762g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1115ai;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1147u;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class C0188f extends AbstractC0674az {

    /* renamed from: g */
    public C0189g f982g;

    /* renamed from: h */
    public float f983h;

    /* renamed from: i */
    public float f984i;

    /* renamed from: j */
    public AbstractC0244am f985j;

    /* renamed from: k */
    public short f986k;

    /* renamed from: l */
    public AbstractC0244am f987l;

    /* renamed from: m */
    public boolean f988m;

    /* renamed from: n */
    public float f989n;

    /* renamed from: o */
    public float f990o;

    /* renamed from: p */
    public float f991p;

    /* renamed from: q */
    public C0188f f992q;

    /* renamed from: r */
    public float f993r;

    /* renamed from: s */
    public float f994s;

    /* renamed from: t */
    public float f995t;

    /* renamed from: u */
    public float f996u;

    /* renamed from: v */
    public float f997v;

    /* renamed from: w */
    public float f998w;

    /* renamed from: x */
    public float f999x;

    /* renamed from: y */
    public float f1000y;

    /* renamed from: z */
    public boolean f1001z;

    /* renamed from: A */
    public boolean f1002A;

    /* renamed from: B */
    public boolean f1003B;

    /* renamed from: C */
    public boolean f1004C;

    /* renamed from: D */
    public boolean f1005D;

    /* renamed from: E */
    public boolean f1006E;

    /* renamed from: F */
    public float f1007F;

    /* renamed from: G */
    public boolean f1008G;

    /* renamed from: H */
    public float f1009H;

    /* renamed from: I */
    public float f1010I;

    /* renamed from: J */
    public float f1011J;

    /* renamed from: K */
    public float f1012K;

    /* renamed from: L */
    public float f1013L;

    /* renamed from: M */
    public boolean f1014M;

    /* renamed from: N */
    public float f1015N;

    /* renamed from: O */
    public float[] f1016O;

    /* renamed from: P */
    public short f1017P;

    /* renamed from: Q */
    public short f1018Q;

    /* renamed from: R */
    public short f1019R;

    /* renamed from: S */
    public boolean f1020S;

    /* renamed from: T */
    public boolean f1021T;

    /* renamed from: U */
    public float f1022U;

    /* renamed from: V */
    public boolean f1023V;

    /* renamed from: W */
    public float f1024W;

    /* renamed from: X */
    public float f1025X;

    /* renamed from: Y */
    public float f1026Y;

    /* renamed from: Z */
    public float f1027Z;

    /* renamed from: aa */
    public boolean f1028aa;

    /* renamed from: ab */
    public boolean f1029ab;

    /* renamed from: ac */
    public boolean f1030ac;

    /* renamed from: ad */
    public boolean f1031ad;

    /* renamed from: ae */
    public boolean f1032ae;

    /* renamed from: af */
    public boolean f1033af;

    /* renamed from: ag */
    public float f1034ag;

    /* renamed from: ah */
    public float f1035ah;

    /* renamed from: ai */
    public float f1036ai;

    /* renamed from: aj */
    public float f1037aj;

    /* renamed from: ak */
    public float f1038ak;

    /* renamed from: al */
    public float f1039al;

    /* renamed from: am */
    public float f1040am;

    /* renamed from: an */
    public float f1041an;

    /* renamed from: ao */
    public boolean f1042ao;

    /* renamed from: ap */
    public C1136m f1043ap;

    /* renamed from: ar */
    public int f1044ar;

    /* renamed from: as */
    public boolean f1045as;

    /* renamed from: at */
    public boolean f1046at;

    /* renamed from: au */
    public AbstractC1155w f1047au;

    /* renamed from: av */
    public int f1048av;

    /* renamed from: aw */
    public float f1049aw;

    /* renamed from: ax */
    public float f1050ax;

    /* renamed from: ay */
    public float f1051ay;

    /* renamed from: az */
    public float f1052az;

    /* renamed from: aA */
    public float f1053aA;

    /* renamed from: aB */
    public boolean f1054aB;

    /* renamed from: aC */
    public boolean f1055aC;

    /* renamed from: aD */
    public int f1056aD;

    /* renamed from: aE */
    public C0454h f1057aE;

    /* renamed from: aF */
    public float f1058aF;

    /* renamed from: aG */
    public boolean f1059aG;

    /* renamed from: aH */
    public boolean f1060aH;

    /* renamed from: aI */
    public float f1061aI;

    /* renamed from: aJ */
    public float f1062aJ;

    /* renamed from: aK */
    public boolean f1063aK;

    /* renamed from: aL */
    public float f1064aL;

    /* renamed from: aM */
    public boolean f1065aM;

    /* renamed from: aN */
    public float f1066aN;

    /* renamed from: aO */
    public float f1067aO;

    /* renamed from: aP */
    public C0760e f1068aP;

    /* renamed from: aQ */
    public boolean f1069aQ;

    /* renamed from: aR */
    public boolean f1070aR;

    /* renamed from: bn */
    private boolean f1071bn;

    /* renamed from: aS */
    public boolean f1072aS;

    /* renamed from: aT */
    public float f1073aT;

    /* renamed from: aU */
    public boolean f1074aU;

    /* renamed from: aV */
    float f1075aV;

    /* renamed from: aW */
    float f1076aW;

    /* renamed from: aX */
    float f1077aX;

    /* renamed from: aY */
    public boolean f1078aY;

    /* renamed from: aZ */
    public boolean f1079aZ;

    /* renamed from: bi */
    public static final C1147u f1080bi;

    /* renamed from: bj */
    public C0966ag f1081bj;

    /* renamed from: bk */
    public static C0966ag f1082bk;

    /* renamed from: bl */
    public static int f1083bl;

    /* renamed from: a */
    public static final C1136m f1084a = new C1136m();

    /* renamed from: bm */
    private static final C0188f f1085bm = new C0188f(true);

    /* renamed from: b */
    static C0970e f1086b = null;

    /* renamed from: c */
    static C0970e f1087c = null;

    /* renamed from: d */
    static C0970e f1088d = null;

    /* renamed from: e */
    static final Rect f1089e = new Rect();

    /* renamed from: f */
    static final RectF f1090f = new RectF();

    /* renamed from: aq */
    static final int f1091aq = Color.m5243a(255, 255, 255, 255);

    /* renamed from: ba */
    public static final C0966ag f1092ba = new C0966ag();

    /* renamed from: bb */
    public static final Paint f1093bb = new Paint();

    /* renamed from: bd */
    public static final Paint f1094bd = new Paint();

    /* renamed from: be */
    public static final Paint f1095be = new Paint();

    /* renamed from: bf */
    public static final Paint f1096bf = new Paint();

    /* renamed from: bg */
    public static final Paint f1097bg = new Paint();

    /* renamed from: bh */
    public static final Paint f1098bh = new Paint();

    /* renamed from: bc */
    public static final Paint f1099bc = new C0966ag();

    static {
        f1099bc.m5206b(-16777216);
        f1099bc.m5201c(108);
        f1094bd.m5228a(80, 255, 0, 0);
        f1094bd.mo914a(true);
        f1094bd.m5231a(5.0f);
        f1095be.m5228a(30, 255, 0, 0);
        f1095be.mo914a(true);
        f1095be.m5231a(8.0f);
        f1096bf.m5228a(80, 128, 166, 255);
        f1096bf.mo914a(true);
        f1096bf.m5231a(5.0f);
        f1097bg.m5228a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1097bg.mo914a(true);
        f1097bg.m5231a(3.0f);
        f1098bh.m5228a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1098bh.mo914a(true);
        f1098bh.m5231a(8.0f);
        f1080bi = new C1147u();
        f1082bk = null;
        f1083bl = 0;
    }

    public C0188f(boolean z) {
        super(z);
        this.f982g = C0189g.f1100a;
        this.f986k = (short) -1;
        this.f993r = -1.0f;
        this.f994s = 0.1f;
        this.f999x = 2.0f;
        this.f1000y = -1.0f;
        this.f1001z = true;
        this.f1009H = 1.0f;
        this.f1017P = (short) -1;
        this.f1018Q = (short) -1;
        this.f1019R = (short) 0;
        this.f1020S = true;
        this.f1023V = false;
        this.f1024W = 0.0f;
        this.f1025X = 0.0f;
        this.f1029ab = false;
        this.f1030ac = false;
        this.f1031ad = false;
        this.f1032ae = true;
        this.f1036ai = 1.0f;
        this.f1037aj = 1.0f;
        this.f1038ak = 1.0f;
        this.f1039al = 1.0f;
        this.f1040am = 1.0f;
        this.f1044ar = f1091aq;
        this.f1048av = -1;
        this.f1061aI = 40.0f;
        this.f1062aJ = 60.0f;
        this.f1063aK = false;
        this.f1064aL = 2.0f;
        this.f1070aR = true;
        this.f1073aT = 0.0f;
        if (!z) {
            f1084a.add(this);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo447a() {
        f1084a.remove(this);
        super.mo447a();
    }

    /* renamed from: a */
    public static C0188f m4527a(C0188f c0188f) {
        C0188f c0188f2 = f1085bm;
        c0188f2.f1056aD = -1;
        if (c0188f == null) {
            c0188f2.f1040am = 1.0f;
            c0188f2.f1038ak = 1.0f;
            c0188f2.f1039al = 1.0f;
            c0188f2.f1041an = 0.0f;
        } else {
            c0188f2.f1040am = c0188f.f1040am;
            c0188f2.f1038ak = c0188f.f1038ak;
            c0188f2.f1039al = c0188f.f1039al;
            c0188f2.f1041an = c0188f.f1041an;
        }
        return c0188f2;
    }

    /* renamed from: a */
    public void m4524a(AbstractC0244am abstractC0244am, float f, float f2, float f3) {
        this.f985j = abstractC0244am;
        this.f7172eo = f;
        this.f7173ep = f2;
        this.f7174eq = f3;
        this.f1071bn = false;
        this.f1023V = false;
    }

    /* renamed from: b */
    public void m4521b() {
        if (this.f1005D) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            C0760e m2359d = gameEngine.f6329bR.m2359d(this.f7172eo, this.f7173ep, this.f7174eq, 0);
            if (m2359d != null) {
                m2359d.f4816G = 0.7f;
                m2359d.f4815F = 2.1f;
                m2359d.f4873ar = (short) 2;
                m2359d.f4831V = 90.0f;
                m2359d.f4832W = m2359d.f4831V;
            }
            gameEngine.f6324bM.m2812a(C0637e.f4082p, 0.8f, this.f7172eo, this.f7173ep);
        }
        mo447a();
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f983h);
        gameOutputStream.mo1334a(this.f985j);
        gameOutputStream.mo1334a(this.f987l);
        gameOutputStream.writeFloat(this.f995t);
        gameOutputStream.writeInt(99);
        gameOutputStream.writeBoolean(this.f1002A);
        gameOutputStream.writeBoolean(this.f1003B);
        gameOutputStream.writeBoolean(this.f1020S);
        gameOutputStream.writeBoolean(this.f1021T);
        gameOutputStream.writeFloat(this.f1022U);
        gameOutputStream.writeFloat(this.f1026Y);
        gameOutputStream.writeFloat(this.f1027Z);
        gameOutputStream.writeInt(this.f1044ar);
        gameOutputStream.writeBoolean(this.f1060aH);
        gameOutputStream.writeFloat(this.f1061aI);
        gameOutputStream.writeFloat(this.f1062aJ);
        gameOutputStream.writeBoolean(this.f1063aK);
        gameOutputStream.writeFloat(this.f1064aL);
        gameOutputStream.writeBoolean(this.f1065aM);
        gameOutputStream.writeFloat(this.f1066aN);
        gameOutputStream.writeBoolean(this.f1069aQ);
        gameOutputStream.writeBoolean(this.f1070aR);
        gameOutputStream.writeBoolean(this.f1071bn);
        gameOutputStream.writeBoolean(this.f1072aS);
        gameOutputStream.writeBoolean(this.f1014M);
        gameOutputStream.mo1331a(this.f1017P);
        gameOutputStream.writeFloat(this.f993r);
        gameOutputStream.writeFloat(this.f994s);
        gameOutputStream.writeBoolean(this.f1045as);
        gameOutputStream.writeBoolean(this.f1046at);
        gameOutputStream.writeFloat(this.f1052az);
        gameOutputStream.writeFloat(this.f1053aA);
        gameOutputStream.writeBoolean(this.f1054aB);
        gameOutputStream.writeBoolean(this.f1055aC);
        gameOutputStream.writeBoolean(false);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeBoolean(this.f1006E);
        gameOutputStream.writeFloat(this.f1007F);
        gameOutputStream.writeFloat(this.f1011J);
        gameOutputStream.writeFloat(this.f1012K);
        gameOutputStream.writeFloat(this.f1013L);
        gameOutputStream.writeBoolean(this.f988m);
        gameOutputStream.writeFloat(this.f989n);
        gameOutputStream.writeFloat(this.f990o);
        gameOutputStream.writeBoolean(this.f1004C);
        gameOutputStream.writeBoolean(this.f1005D);
        gameOutputStream.mo1383a(this.f992q);
        gameOutputStream.writeFloat(this.f1075aV);
        gameOutputStream.writeFloat(this.f1076aW);
        gameOutputStream.writeFloat(this.f1077aX);
        gameOutputStream.writeBoolean(this.f1023V);
        gameOutputStream.writeFloat(this.f1024W);
        gameOutputStream.writeFloat(this.f1025X);
        gameOutputStream.writeBoolean(this.f1074aU);
        gameOutputStream.mo1331a(this.f1019R);
        gameOutputStream.writeBoolean(this.f1042ao);
        gameOutputStream.m1398a(this.f1043ap);
        gameOutputStream.mo1331a(this.f1018Q);
        gameOutputStream.writeFloat(this.f999x);
        gameOutputStream.writeBoolean(this.f1028aa);
        gameOutputStream.writeBoolean(this.f1031ad);
        gameOutputStream.writeBoolean(this.f1008G);
        gameOutputStream.writeFloat(this.f1009H);
        gameOutputStream.writeBoolean(this.f1032ae);
        gameOutputStream.writeBoolean(this.f1059aG);
        gameOutputStream.writeBoolean(this.f1001z);
        gameOutputStream.writeFloat(this.f1000y);
        gameOutputStream.writeFloat(this.f1067aO);
        gameOutputStream.writeFloat(this.f984i);
        gameOutputStream.writeBoolean(this.f1078aY);
        gameOutputStream.writeBoolean(this.f1033af);
        gameOutputStream.writeFloat(this.f1034ag);
        gameOutputStream.writeFloat(this.f1035ah);
        gameOutputStream.writeFloat(this.f1036ai);
        gameOutputStream.writeFloat(this.f1037aj);
        gameOutputStream.writeInt(0);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.writeFloat(0.0f);
        gameOutputStream.mo1386a((InterfaceC0303as) null);
        gameOutputStream.writeInt(0);
        gameOutputStream.writeBoolean(false);
        C0453g.m3683a(this.f1057aE, gameOutputStream);
        gameOutputStream.writeFloat(this.f1038ak);
        gameOutputStream.writeFloat(this.f1039al);
        gameOutputStream.writeBoolean(this.f1029ab);
        gameOutputStream.writeBoolean(this.f1030ac);
        gameOutputStream.writeFloat(this.f1041an);
        gameOutputStream.writeBoolean(false);
        C0189g.m4514a(this.f982g, gameOutputStream);
        boolean z = (this.f1047au == null || this.f1047au.f7167ej) ? false : true;
        gameOutputStream.writeBoolean(z);
        if (z) {
            gameOutputStream.mo1383a(this.f1047au);
            gameOutputStream.writeFloat(this.f1049aw);
            gameOutputStream.writeFloat(this.f1050ax);
            gameOutputStream.writeFloat(this.f1051ay);
        }
        gameOutputStream.mo1331a(this.f986k);
        gameOutputStream.writeInt(this.f1056aD);
        gameOutputStream.writeFloat(this.f1040am);
        gameOutputStream.writeFloat(this.f991p);
        gameOutputStream.writeInt(this.f1048av);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f983h = gameInputStream.readFloat();
        this.f985j = gameInputStream.m1293o();
        this.f987l = gameInputStream.m1318a(EnumC0914m.expected);
        this.f995t = gameInputStream.readFloat();
        this.f999x = gameInputStream.readInt();
        this.f1002A = gameInputStream.readBoolean();
        this.f1003B = gameInputStream.readBoolean();
        this.f1020S = gameInputStream.readBoolean();
        this.f1021T = gameInputStream.readBoolean();
        this.f1022U = gameInputStream.readFloat();
        this.f1026Y = gameInputStream.readFloat();
        this.f1027Z = gameInputStream.readFloat();
        this.f1044ar = gameInputStream.readInt();
        this.f1060aH = gameInputStream.readBoolean();
        this.f1061aI = gameInputStream.readFloat();
        this.f1062aJ = gameInputStream.readFloat();
        this.f1063aK = gameInputStream.readBoolean();
        this.f1064aL = gameInputStream.readFloat();
        this.f1065aM = gameInputStream.readBoolean();
        this.f1066aN = gameInputStream.readFloat();
        this.f1069aQ = gameInputStream.readBoolean();
        this.f1070aR = gameInputStream.readBoolean();
        this.f1071bn = gameInputStream.readBoolean();
        if (gameInputStream.m1311b() >= 7) {
            this.f1072aS = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 13) {
            this.f1014M = gameInputStream.readBoolean();
            this.f1017P = gameInputStream.readShort();
        }
        if (gameInputStream.m1311b() >= 16) {
            this.f993r = gameInputStream.readFloat();
            this.f994s = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 17) {
            this.f1045as = gameInputStream.readBoolean();
            this.f1046at = gameInputStream.readBoolean();
            this.f1052az = gameInputStream.readFloat();
            this.f1053aA = gameInputStream.readFloat();
            this.f1054aB = gameInputStream.readBoolean();
            this.f1055aC = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 18) {
            gameInputStream.readBoolean();
            gameInputStream.readFloat();
            gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 28) {
            this.f1006E = gameInputStream.readBoolean();
            this.f1007F = gameInputStream.readFloat();
            this.f1011J = gameInputStream.readFloat();
            this.f1012K = gameInputStream.readFloat();
            this.f1013L = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 29) {
            this.f988m = gameInputStream.readBoolean();
            this.f989n = gameInputStream.readFloat();
            this.f990o = gameInputStream.readFloat();
            this.f1004C = gameInputStream.readBoolean();
            this.f1005D = gameInputStream.readBoolean();
            this.f992q = (C0188f) gameInputStream.m1316a(C0188f.class);
            this.f1075aV = gameInputStream.readFloat();
            this.f1076aW = gameInputStream.readFloat();
            this.f1077aX = gameInputStream.readFloat();
            this.f1023V = gameInputStream.readBoolean();
            this.f1024W = gameInputStream.readFloat();
            this.f1025X = gameInputStream.readFloat();
            this.f1074aU = gameInputStream.readBoolean();
            this.f1019R = gameInputStream.readShort();
            this.f1042ao = gameInputStream.readBoolean();
            C1136m c1136m = new C1136m();
            gameInputStream.m1317a(c1136m, AbstractC0244am.class);
            if (c1136m.size() > 0) {
                this.f1043ap = c1136m;
            }
            this.f1018Q = gameInputStream.readShort();
        }
        if (gameInputStream.m1311b() >= 35) {
            this.f999x = gameInputStream.readFloat();
            this.f1028aa = gameInputStream.readBoolean();
            this.f1031ad = gameInputStream.readBoolean();
            this.f1008G = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 38) {
            this.f1009H = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 39) {
            this.f1032ae = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 41) {
            this.f1059aG = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 43) {
            this.f1001z = gameInputStream.readBoolean();
            this.f1000y = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 44) {
            this.f1067aO = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 47) {
            this.f984i = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 48) {
            this.f1078aY = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 59) {
            this.f1033af = gameInputStream.readBoolean();
            this.f1034ag = gameInputStream.readFloat();
            this.f1035ah = gameInputStream.readFloat();
            this.f1036ai = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 60) {
            this.f1037aj = gameInputStream.readFloat();
            gameInputStream.readInt();
            gameInputStream.readFloat();
            gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 62) {
            gameInputStream.m1291q();
            gameInputStream.readInt();
            gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 63) {
            this.f1057aE = C0453g.m3682a(gameInputStream);
        }
        if (gameInputStream.m1311b() >= 64) {
            this.f1038ak = gameInputStream.readFloat();
            this.f1039al = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 66) {
            this.f1029ab = gameInputStream.readBoolean();
            this.f1030ac = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 67 && gameInputStream.m1311b() < 78) {
            C0418bp.m3875a(gameInputStream, true);
        }
        if (gameInputStream.m1311b() >= 68) {
            this.f1041an = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 77) {
            gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 78) {
            this.f982g = C0189g.m4511a(gameInputStream);
        }
        if (gameInputStream.m1311b() >= 81 && gameInputStream.readBoolean()) {
            this.f1047au = gameInputStream.m1316a(AbstractC1155w.class);
            this.f1049aw = gameInputStream.readFloat();
            this.f1050ax = gameInputStream.readFloat();
            this.f1051ay = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 83) {
            this.f986k = gameInputStream.readShort();
            this.f1056aD = gameInputStream.readInt();
        }
        if (gameInputStream.m1311b() >= 88) {
            this.f1040am = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 89) {
            this.f991p = gameInputStream.readFloat();
            this.f1048av = gameInputStream.readInt();
        }
        super.mo441a(gameInputStream);
    }

    /* renamed from: c */
    public static void m4518c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1086b = gameEngine.f6326bO.mo222a(C0067R.drawable.projectiles);
        f1087c = gameEngine.f6326bO.mo222a(C0067R.drawable.projectiles2);
        f1088d = gameEngine.f6326bO.mo222a(C0067R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m4517d() {
        this.f1072aS = true;
    }

    /* renamed from: a */
    public static C0188f m4525a(AbstractC0244am abstractC0244am, float f, float f2) {
        C0188f c0188f = new C0188f(false);
        c0188f.f985j = abstractC0244am;
        c0188f.f7172eo = f;
        c0188f.f7173ep = f2;
        c0188f.f1044ar = Color.m5243a(255, 100, 30, 30);
        c0188f.f7171en = abstractC0244am.f7171en + 1;
        c0188f.f7170em = 4;
        return c0188f;
    }

    /* renamed from: a */
    public static C0188f m4523a(AbstractC0244am abstractC0244am, float f, float f2, float f3, int i) {
        C0188f m4525a = m4525a(abstractC0244am, f, f2);
        m4525a.f7174eq = f3;
        m4525a.f986k = (short) i;
        m4525a.f1010I = C0773f.m2162b(abstractC0244am, 0.0f, 1.0f, abstractC0244am.f1592bC);
        abstractC0244am.f1592bC++;
        return m4525a;
    }

    /* renamed from: a */
    public void m4526a(AbstractC0244am abstractC0244am) {
        float f;
        if ((this.f1034ag == 0.0f && this.f1035ah == 0.0f) || abstractC0244am.mo3397bI()) {
            return;
        }
        if (C0773f.m2216a(this.f1075aV, this.f1076aW, abstractC0244am.f7172eo, abstractC0244am.f7173ep) > 100.0f) {
            f = C0773f.m2138d(this.f1075aV, this.f1076aW, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
        } else {
            f = this.f1052az;
        }
        float mo3136bN = this.f1035ah + (this.f1034ag / abstractC0244am.mo3136bN());
        abstractC0244am.f1619cc += C0773f.m2107k(f) * mo3136bN;
        abstractC0244am.f1620cd += C0773f.m2110j(f) * mo3136bN;
    }

    /* renamed from: a */
    public static void m4522a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, float f, C0188f c0188f, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6314bw && f > 0.0f) {
            f = 0.0f;
        }
        if (abstractC0244am2 != null && !abstractC0244am2.f1612bV) {
            if (c0188f != null && c0188f.f982g.f1206bc && abstractC0244am != null) {
                abstractC0244am2.mo3586e(abstractC0244am.f1614bX);
            }
            if (c0188f != null) {
                if (c0188f.f1036ai != 1.0f && abstractC0244am2.mo3397bI()) {
                    f *= c0188f.f1036ai;
                }
                if (c0188f.f1037aj != 1.0f && abstractC0244am2.mo3068i()) {
                    f *= c0188f.f1037aj;
                }
            }
            if (f < 0.0f) {
                abstractC0244am2.m4237b(abstractC0244am, -f, c0188f);
            } else {
                boolean z2 = !abstractC0244am2.f1612bV && abstractC0244am2.f1637cu > 0.0f;
                abstractC0244am2.mo3073a(abstractC0244am, f, c0188f);
                float f2 = f;
                if (abstractC0244am2.mo3076J()) {
                    f2 = 0.0f;
                }
                if (f2 > 0.0f) {
                    gameEngine.f6336bY.m2463a(abstractC0244am, abstractC0244am2, f2);
                }
                if (abstractC0244am != null) {
                    abstractC0244am.f1664cV += f2;
                    if (z2 && (abstractC0244am2.f1612bV || abstractC0244am2.f1637cu < 0.0f)) {
                        abstractC0244am.f1663cU++;
                        abstractC0244am.m4243a(EnumC0348af.killedAnyUnit, abstractC0244am2);
                    }
                }
            }
            if (c0188f != null && !abstractC0244am2.f1612bV) {
                float m4229bQ = abstractC0244am2.m4229bQ();
                if (m4229bQ != -1.0f) {
                    float m2138d = C0773f.m2138d(c0188f.f7172eo, c0188f.f7173ep, abstractC0244am2.f7172eo, abstractC0244am2.f7173ep);
                    float f3 = 100.0f / m4229bQ;
                    abstractC0244am2.f1619cc += C0773f.m2107k(m2138d) * f3;
                    abstractC0244am2.f1620cd += C0773f.m2110j(m2138d) * f3;
                }
            }
        }
    }

    /* renamed from: e */
    public float m4516e() {
        float f = 1.0f;
        if (this.f1011J < this.f1007F) {
            f = this.f1011J / this.f1007F;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        float m2138d;
        float m2216a;
        float f2;
        float f3;
        C0760e m2359d;
        C0760e m2359d2;
        C0473z m4513a;
        C0760e m2365b;
        float f4;
        float f5;
        float f6;
        float f7;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f1072aS) {
            mo447a();
        }
        if (this.f987l == null && !this.f1055aC) {
            mo447a();
            return;
        }
        if (this.f984i > 0.0f) {
            this.f984i = C0773f.m2218a(this.f984i, f);
            if (this.f984i > 0.0f) {
                return;
            }
        }
        C0189g c0189g = this.f982g;
        if (this.f984i == 0.0f) {
            this.f984i = -1.0f;
            if (c0189g.f1163al != null) {
                c0189g.f1163al.m3894a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1052az, this.f985j, null, false, this.f1056aD + 1, this, null);
            }
        }
        this.f983h = C0773f.m2218a(this.f983h, f);
        boolean z = false;
        if (this.f1059aG) {
            if (this.f987l == null) {
                z = true;
            } else if (this.f987l.f1612bV) {
                z = true;
            }
        }
        if (z) {
            m4530a(c0189g.f1175ax, c0189g.f1176ay, (C0454h) null);
        }
        if (c0189g.f1177az) {
            this.f1058aF = C0773f.m2218a(this.f1058aF, f);
            if (this.f1058aF == 0.0f) {
                this.f1058aF = c0189g.f1178aA;
                m4530a(c0189g.f1179aB, c0189g.f1180aC, c0189g.f1181aD);
            }
        }
        if (c0189g.f1143R != 0.0f || c0189g.f1144S != 0.0f) {
            float f8 = c0189g.f1143R;
            if (this.f987l != null) {
                f8 += this.f987l.f1626cj * c0189g.f1144S;
            }
            this.f1012K = C0773f.m2110j(((360.0f * this.f1010I) + (this.f1011J * 1.0f)) % 360.0f) * f8;
            this.f1013L = C0773f.m2110j(((360.0f * this.f1010I) + (this.f1011J * 1.5f)) % 360.0f) * f8;
        }
        if (this.f1006E && this.f987l != null) {
            this.f1012K = C0773f.m2110j((this.f1011J * 1.0f) % 360.0f) * this.f987l.f1626cj * 0.4f;
            this.f1013L = C0773f.m2110j((this.f1011J * 1.5f) % 360.0f) * this.f987l.f1626cj * 0.4f;
            float f9 = this.f987l.f7172eo + this.f1012K;
            float f10 = this.f987l.f7173ep + this.f1013L;
            if (this.f7169el) {
                this.f1066aN += f;
                this.f1067aO += f;
                if (this.f1066aN > 11.0f) {
                    this.f1066aN = C0773f.m2151c(1.0f, 4.0f);
                    C0760e m2365b2 = gameEngine.f6329bR.m2365b(f9, f10, this.f987l.f7174eq, EnumC0759d.custom, false, EnumC0763h.low);
                    if (m2365b2 != null) {
                        m2365b2.f4849aq = 0;
                        m2365b2.f4848ap = 0;
                        m2365b2.f4873ar = (short) 2;
                        m2365b2.f4806r = true;
                        m2365b2.f4814E = 0.5f;
                        m2365b2.f4832W = 60.0f;
                        m2365b2.f4831V = 60.0f;
                        m2365b2.f4816G = 0.7f;
                        m2365b2.f4815F = 0.3f;
                        m2365b2.f4874as = false;
                        m2365b2.f4825P = C0773f.m2151c(-0.3f, 0.3f);
                        m2365b2.f4826Q = (-0.9f) + C0773f.m2151c(-0.3f, 0.3f);
                    }
                }
                if (this.f1067aO > 75.0f) {
                    this.f1067aO = C0773f.m2151c(1.0f, 20.0f);
                    gameEngine.f6329bR.m2370b(f9, f10, this.f987l.f7174eq);
                }
            }
        }
        float f11 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.f1055aC) {
            float f12 = this.f987l.f7172eo + this.f1012K;
            float f13 = this.f987l.f7173ep + this.f1013L;
            float f14 = this.f987l.f7174eq;
            m2138d = C0773f.m2138d(this.f7172eo, this.f7173ep, f12, f13);
            m2216a = C0773f.m2216a(this.f7172eo, this.f7173ep, f12, f13);
            f2 = f14;
            f3 = f2 - this.f7174eq;
            f11 = this.f987l.f1626cj;
            z2 = this.f987l instanceof AbstractC0493d;
            z3 = this.f987l.f1640cx > 10.0f + this.f1022U;
        } else {
            float f15 = this.f1052az;
            if (this.f992q != null) {
                float f16 = this.f992q.f7172eo + this.f1012K;
                float f17 = this.f992q.f7173ep + this.f1013L;
                float f18 = this.f992q.f7174eq;
                m2138d = C0773f.m2138d(this.f7172eo, this.f7173ep, f16, f17);
                m2216a = C0773f.m2216a(this.f7172eo, this.f7173ep, f16, f17);
                f2 = f18;
                f3 = f2 - this.f7174eq;
            } else if (this.f987l != null) {
                float f19 = this.f987l.f7172eo + this.f1012K;
                float f20 = this.f987l.f7173ep + this.f1013L;
                float f21 = this.f987l.f7174eq;
                m2138d = C0773f.m2138d(this.f7172eo, this.f7173ep, f19, f20);
                m2216a = C0773f.m2216a(this.f7172eo, this.f7173ep, f19, f20);
                f2 = f21;
                f3 = f2 - this.f7174eq;
                f11 = this.f987l.f1626cj;
                z2 = this.f987l instanceof AbstractC0493d;
                z3 = this.f987l.f1640cx > 10.0f + this.f1022U;
            } else if (this.f988m) {
                float f22 = this.f989n + this.f1012K;
                float f23 = this.f990o + this.f1013L;
                float f24 = this.f991p;
                m2138d = C0773f.m2138d(this.f7172eo, this.f7173ep, f22, f23);
                m2216a = C0773f.m2216a(this.f7172eo, this.f7173ep, f22, f23);
                f2 = f24;
                f3 = f2 - this.f7174eq;
            } else {
                float f25 = this.f989n + this.f1012K;
                float f26 = this.f990o + this.f1013L;
                m2138d = C0773f.m2138d(this.f7172eo, this.f7173ep, f25, f26);
                m2216a = C0773f.m2216a(this.f7172eo, this.f7173ep, f25, f26);
                f2 = 0.0f;
                f3 = 0.0f - this.f7174eq;
            }
        }
        float f27 = c0189g.f1140O;
        if (m2216a < 225.0f) {
            f27 = c0189g.f1141P;
        }
        if (f27 >= 0.0f) {
            this.f1052az += C0773f.m2150c(this.f1052az, m2138d, f27 * f);
            m2138d = this.f1052az;
        } else {
            this.f1052az = m2138d;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f28 = m2138d;
        if (this.f1047au != null && !this.f1047au.f7167ej) {
            if (this.f1048av >= 0) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) this.f1047au;
                if (this.f1048av >= abstractC0629y.mo2900bl()) {
                    this.f1048av = 0;
                }
                C1115ai mo3058D = abstractC0629y.mo3058D(this.f1048av);
                f5 = mo3058D.f7064a;
                f6 = mo3058D.f7065b;
                f7 = this.f985j.f7174eq + mo3058D.f7066c;
            } else {
                f5 = this.f1047au.f7172eo;
                f6 = this.f1047au.f7173ep;
                f7 = this.f1047au.f7174eq;
            }
            float f29 = f5 - this.f1049aw;
            float f30 = f6 - this.f1050ax;
            float f31 = f7 - this.f1051ay;
            this.f7172eo += f29;
            this.f7173ep += f30;
            this.f7174eq += f31;
            this.f1049aw = f5;
            this.f1050ax = f6;
            this.f1051ay = f7;
        }
        if (!this.f1002A) {
            this.f7172eo += this.f996u * f;
            this.f7173ep += this.f997v * f;
            if (this.f998w != 0.0f) {
                this.f7174eq += this.f998w * f;
                f3 = f2 - this.f7174eq;
            }
            if (this.f7174eq > 0.0f) {
                if (c0189g.f1132G != 0.0f) {
                    this.f7174eq -= c0189g.f1132G * f;
                    f3 = f2 - this.f7174eq;
                }
                if (c0189g.f1133H != 0.0f) {
                    this.f998w -= c0189g.f1133H * f;
                }
            }
            if (!this.f1060aH || this.f1061aI < this.f7174eq || this.f1063aK) {
                float f32 = this.f995t * f;
                z4 = true;
                if (m2216a < f32 * f32) {
                    f32 = C0773f.m2219a(m2216a);
                    m2216a = 0.0f;
                }
                this.f7172eo += C0773f.m2107k(m2138d) * f32;
                this.f7173ep += C0773f.m2110j(m2138d) * f32;
            }
            if (this.f1060aH) {
                if (this.f1064aL < 0.0f) {
                    f4 = this.f995t * f;
                    z4 = true;
                } else {
                    f4 = this.f1064aL * f;
                }
                if (!this.f1063aK) {
                    this.f7174eq = C0773f.m2217a(this.f7174eq, this.f1062aJ, f4);
                    if (this.f7174eq < this.f1061aI) {
                        f28 = -90.0f;
                    }
                    if (this.f7174eq >= this.f1062aJ) {
                        this.f1063aK = true;
                    }
                } else if (m2216a < 400.0f) {
                    this.f7174eq = C0773f.m2217a(this.f7174eq, f2, f4);
                    if (C0773f.m2152c(this.f7174eq - f2) > 0.5f) {
                        f28 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f33 = f3;
                float f34 = this.f995t * f;
                z4 = true;
                if (f33 != 0.0f) {
                    if (m2216a > 0.1d) {
                        f34 = C0773f.m2172b((C0773f.m2152c(f33) / C0773f.m2219a(m2216a)) * this.f995t * f, this.f995t * f);
                    }
                    this.f7174eq += C0773f.m2172b(f3, f34);
                    f3 = f2 - this.f7174eq;
                }
            }
        }
        if (z4 && this.f993r > 0.0f) {
            this.f995t = C0773f.m2217a(this.f995t, this.f993r, this.f994s * f);
        }
        if (c0189g.f1164am != 0.0f) {
            float m2110j = C0773f.m2110j((((this.f1011J * 360.0f) / c0189g.f1165an) + (360.0f * this.f1010I)) % 360.0f) * c0189g.f1164am * f;
            this.f7172eo += C0773f.m2107k(m2138d + 90.0f) * m2110j;
            this.f7173ep += C0773f.m2110j(m2138d + 90.0f) * m2110j;
        }
        if (this.f7169el && ((this.f1065aM || c0189g.f1159ah != null) && !this.f1071bn)) {
            this.f1066aN += f;
            if (this.f1066aN > c0189g.f1158ag) {
                this.f1066aN = 0.0f;
                boolean z6 = false;
                if (this.f1005D) {
                    z6 = true;
                }
                if (c0189g.f1159ah != null) {
                    c0189g.f1159ah.m3465a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1073aT, this);
                }
                if (this.f1065aM && (m2365b = gameEngine.f6329bR.m2365b(this.f7172eo, this.f7173ep, this.f7174eq, EnumC0759d.custom, z6, EnumC0763h.low)) != null) {
                    if (this.f7174eq >= 0.0f) {
                        m2365b.f4849aq = 0;
                        m2365b.f4848ap = 0;
                        m2365b.f4873ar = (short) 2;
                        m2365b.f4806r = true;
                        m2365b.f4814E = 0.5f;
                        m2365b.f4831V = 70.0f;
                        m2365b.f4832W = m2365b.f4831V;
                        m2365b.f4874as = true;
                        if (z5) {
                            m2365b.f4874as = false;
                        }
                        m2365b.f4826Q = 0.1f;
                        m2365b.f4807s = true;
                        m2365b.f4808t = 5.0f;
                        m2365b.f4816G = 0.5f;
                        m2365b.f4815F = 1.2f;
                        m2365b.f4833Y = C0773f.m2151c(-180.0f, 180.0f);
                        if (this.f1005D) {
                            m2365b.f4816G = 0.5f;
                            m2365b.f4815F = 2.1f;
                        }
                    } else {
                        m2365b.f4849aq = 9;
                        m2365b.f4848ap = 1;
                        m2365b.f4873ar = (short) 1;
                        m2365b.f4806r = true;
                        m2365b.f4814E = 0.5f;
                        m2365b.f4832W = 60.0f;
                        m2365b.f4831V = 60.0f;
                        m2365b.f4826Q = 0.1f;
                    }
                }
            }
        }
        if (!this.f1071bn) {
            boolean z7 = false;
            AbstractC0244am abstractC0244am = null;
            boolean z8 = false;
            float f35 = 6.0f;
            if (z2) {
                f35 = f11 * 0.8f;
                if (f35 < 6.0f) {
                    f35 = 6.0f;
                }
            }
            if (z3) {
                f35 = f11 * 1.1f;
            }
            float f36 = 3.0f;
            if (this.f998w != 0.0f || c0189g.f1132G != 0.0f) {
                f36 = 3.0f + C0773f.m2152c(this.f998w * f) + C0773f.m2152c(c0189g.f1132G * f);
            }
            if (m2216a < f35 * f35 && C0773f.m2152c(f3) < f36) {
                z7 = true;
                abstractC0244am = this.f987l;
            }
            if (this.f1002A) {
                z7 = true;
                abstractC0244am = this.f987l;
            }
            if (this.f1033af && this.f983h == 0.0f) {
                z7 = true;
            }
            if (this.f1045as) {
                float f37 = this.f1053aA + 50.0f;
                AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
                int size = AbstractC0244am.f1594bE.size();
                for (int i = 0; i < size; i++) {
                    AbstractC0244am abstractC0244am2 = m499a[i];
                    if (abstractC0244am2.f7172eo + f37 > this.f7172eo && abstractC0244am2.f7172eo - f37 < this.f7172eo && abstractC0244am2.f7173ep + f37 > this.f7173ep && abstractC0244am2.f7173ep - f37 < this.f7173ep && abstractC0244am2.f1610bT && false == abstractC0244am2.mo3068i() && abstractC0244am2.f1656cN == null) {
                        float m2216a2 = C0773f.m2216a(this.f7172eo, this.f7173ep, abstractC0244am2.f7172eo, abstractC0244am2.f7173ep);
                        float f38 = this.f1053aA + abstractC0244am2.f1626cj;
                        if (m2216a2 < f38 * f38) {
                            z7 = true;
                            abstractC0244am = abstractC0244am2;
                        }
                    }
                }
            }
            if (this.f1046at) {
                gameEngine.f6323bL.m4664a(this.f7172eo, this.f7173ep);
                if (gameEngine.f6332bU.m1177a(EnumC0246ao.f1713f, gameEngine.f6323bL.f802T, gameEngine.f6323bL.f803U)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.f1055aC) {
            }
            if (this.f1078aY && (((this.f1060aH && z5 && this.f7174eq < 30.0f) || z7) && this.f985j != null)) {
                this.f1078aY = false;
                C0625u c0625u = new C0625u(false);
                c0625u.f7172eo = this.f7172eo;
                c0625u.f7173ep = this.f7173ep;
                c0625u.mo2928b(this.f985j.f1614bX);
                c0625u.f3915a = 15;
                c0625u.f3916b = 360.0f;
                PlayerData.m4401c(c0625u);
            }
            if (z7) {
                this.f1071bn = true;
                this.f1075aV = this.f7172eo;
                this.f1076aW = this.f7173ep;
                this.f1077aX = this.f7174eq;
                if (this.f1002A) {
                    if (this.f1055aC) {
                        this.f1075aV = this.f989n;
                        this.f1076aW = this.f990o;
                        this.f1077aX = 0.0f;
                    }
                    if (this.f987l != null) {
                        this.f1075aV = this.f987l.f7172eo + this.f1012K;
                        this.f1076aW = this.f987l.f7173ep + this.f1013L;
                        this.f1077aX = this.f987l.f7174eq;
                    }
                }
                if (!this.f1003B && !this.f1014M && !c0189g.f1149X) {
                    this.f1020S = false;
                }
                boolean z9 = false;
                if (this.f987l != null) {
                    z9 = this.f987l.f1640cx > 10.0f;
                }
                C0473z c0473z = c0189g.f1201aX;
                if (z9) {
                    c0473z = c0189g.f1202aY;
                }
                if (this.f987l != null && (m4513a = c0189g.m4513a(this.f987l)) != null) {
                    c0473z = m4513a;
                }
                if (c0473z != null) {
                    c0473z.m3465a(this.f1075aV, this.f1076aW, this.f1077aX, this.f1073aT, this.f987l);
                }
                if (c0189g.f1161aj != null) {
                    c0189g.f1161aj.m3894a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1052az, this.f985j, null, false, this.f1056aD + 1, this, this.f987l);
                }
                if (c0189g.f1203aZ != null && this.f985j != null) {
                    c0189g.f1203aZ.m3879a(this.f1075aV, this.f1076aW, 0.0f, this.f1052az, this.f985j.f1614bX, false, this.f985j);
                }
                if (c0189g.f1204ba > 0 && this.f985j != null && (this.f985j instanceof C0456j)) {
                    C0456j c0456j = (C0456j) this.f985j;
                    for (int i2 = 0; i2 < c0189g.f1204ba; i2++) {
                        if (c0456j.f2895B != null && c0456j.f2895B.size() > 0) {
                            AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0456j.f2895B.remove(c0456j.f2895B.size() - 1);
                            C1152y.m465a(abstractC0244am3, c0456j);
                            abstractC0244am3.f7172eo = this.f1075aV;
                            abstractC0244am3.f7173ep = this.f1076aW;
                            abstractC0244am3.f1623cg = this.f1052az;
                            abstractC0244am3.f1620cd = 0.0f;
                            abstractC0244am3.f1619cc = 0.0f;
                            abstractC0244am3.f1616bZ = 0.0f;
                            abstractC0244am3.f1617ca = 0.0f;
                            if (abstractC0244am3 instanceof AbstractC0629y) {
                                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am3;
                                abstractC0629y2.m2935az();
                                abstractC0629y2.m2856j(abstractC0244am3.f1623cg);
                                if (abstractC0244am3 instanceof C0456j) {
                                    ((C0456j) abstractC0244am3).m3605dF();
                                }
                            }
                            c0456j.m3667D(abstractC0244am3);
                        }
                    }
                }
                if (c0189g.f1205bb && this.f985j != null) {
                    this.f985j.mo3584f(this.f1075aV, this.f1076aW);
                }
                if (!z8 && abstractC0244am != null) {
                    if (this.f1006E) {
                        this.f1071bn = false;
                        float m4516e = (this.f1022U / 60.0f) * f * m4516e();
                        if (this.f1027Z == 0.0f) {
                            m4526a(abstractC0244am);
                        }
                        m4522a(this.f985j, abstractC0244am, c0189g.m4512a(abstractC0244am, m4516e, true), this, false);
                    } else {
                        if (this.f1027Z == 0.0f) {
                            m4526a(abstractC0244am);
                        }
                        m4522a(this.f985j, abstractC0244am, c0189g.m4512a(abstractC0244am, this.f1022U, false), this, false);
                    }
                }
                if (this.f992q != null) {
                    if (c0189g.f1103d) {
                        this.f992q.f983h = 0.0f;
                    } else {
                        this.f992q.m4521b();
                    }
                    mo447a();
                }
                if (!this.f1006E) {
                    boolean z10 = true;
                    if (this.f987l != null && this.f987l.f1640cx > 10.0f) {
                        z10 = false;
                        if (c0189g.f1202aY == null && (m2359d2 = gameEngine.f6329bR.m2359d(this.f1075aV, this.f1076aW, this.f1077aX, -1127220)) != null) {
                            m2359d2.f4831V = 10.0f;
                            m2359d2.f4815F = 0.5f;
                            if (this.f1069aQ) {
                                m2359d2.f4831V = 25.0f;
                                m2359d2.f4815F = 1.0f;
                            }
                            m2359d2.f4873ar = (short) 2;
                            m2359d2.f4832W = m2359d2.f4831V;
                        }
                    }
                    if (this.f1008G) {
                        z10 = false;
                        C0761f.m2344b(this.f7172eo, this.f7173ep).f4876a = 21.0f;
                    }
                    if (z10) {
                        if (!this.f1069aQ) {
                            if (c0189g.f1201aX == null) {
                                gameEngine.f6329bR.m2363c(this.f1075aV, this.f1076aW, this.f1077aX);
                            }
                        } else if (c0189g.f1201aX == null) {
                            if (this.f1027Z > 10.0f && (m2359d = gameEngine.f6329bR.m2359d(this.f1075aV, this.f1076aW, this.f1077aX, 0)) != null) {
                                m2359d.f4815F = this.f1027Z / 25.0f;
                                m2359d.f4814E = 0.7f;
                                if (this.f1077aX > 5.0f) {
                                    m2359d.f4873ar = (short) 2;
                                }
                            }
                            gameEngine.f6329bR.m2370b(this.f1075aV, this.f1076aW, this.f1077aX);
                            if (this.f1070aR && !this.f1005D) {
                                gameEngine.f6324bM.m2811a(C0637e.f4080n, 0.5f, 1.0f + C0773f.m2151c(-0.06f, 0.06f), this.f1075aV, this.f1076aW);
                            }
                        }
                        if (this.f1005D && c0189g.f1201aX == null) {
                            gameEngine.f6324bM.m2811a(C0637e.f4095C, 1.6f, 0.7f, this.f1075aV, this.f1076aW);
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, 255, 255));
                            if (m2385a != null) {
                                m2385a.f4816G = 14.0f;
                                m2385a.f4815F = 8.0f;
                                m2385a.f4814E = 0.9f;
                                m2385a.f4831V = 35.0f;
                                m2385a.f4832W = m2385a.f4831V;
                                m2385a.f4806r = true;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2361c = gameEngine.f6329bR.m2361c(this.f1075aV, this.f1076aW, this.f1077aX, -1127220);
                            if (m2361c != null) {
                                m2361c.f4816G = 1.5f;
                                m2361c.f4815F = 3.0f;
                                m2361c.f4873ar = (short) 2;
                                m2361c.f4831V = 20.0f;
                                m2361c.f4832W = m2361c.f4831V;
                                m2361c.f4830U = 0.0f;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2361c2 = gameEngine.f6329bR.m2361c(this.f1075aV, this.f1076aW, this.f1077aX, -1127220);
                            if (m2361c2 != null) {
                                m2361c2.f4816G = 0.2f;
                                m2361c2.f4815F = 5.0f;
                                m2361c2.f4873ar = (short) 2;
                                m2361c2.f4831V = 65.0f;
                                m2361c2.f4832W = m2361c2.f4831V;
                                m2361c2.f4830U = 0.0f;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a2 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, 255, 255));
                            if (m2385a2 != null) {
                                m2385a2.f4816G = 3.0f;
                                m2385a2.f4815F = 6.0f;
                                m2385a2.f4814E = 0.9f;
                                m2385a2.f4831V = 290.0f;
                                m2385a2.f4832W = m2385a2.f4831V;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a3 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (m2385a3 != null) {
                                m2385a3.f4816G = 2.0f;
                                m2385a3.f4815F = 6.0f;
                                m2385a3.f4814E = 0.5f;
                                m2385a3.f4831V = 370.0f;
                                m2385a3.f4832W = m2385a3.f4831V;
                                m2385a3.f4830U = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a4 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (m2385a4 != null) {
                                    m2385a4.f4816G = 0.2f;
                                    m2385a4.f4815F = 9.0f;
                                    m2385a4.f4814E = 0.7f;
                                    m2385a4.f4831V = 210.0f;
                                    m2385a4.f4832W = m2385a4.f4831V;
                                    m2385a4.f4830U = 20 + (i3 * 110);
                                }
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a5 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, 255, 255));
                            if (m2385a5 != null) {
                                m2385a5.f4816G = 3.0f;
                                m2385a5.f4815F = 4.0f;
                                m2385a5.f4814E = 0.2f;
                                m2385a5.f4831V = 870.0f;
                                m2385a5.f4832W = m2385a5.f4831V;
                                m2385a5.f4806r = true;
                                m2385a5.f4830U = 70.0f;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a6 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (m2385a6 != null) {
                                m2385a6.f4816G = 4.0f;
                                m2385a6.f4815F = 1.0f;
                                m2385a6.f4814E = 0.9f;
                                m2385a6.f4831V = 320.0f;
                                m2385a6.f4832W = m2385a6.f4831V;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a7 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (m2385a7 != null) {
                                m2385a7.f4816G = 2.0f;
                                m2385a7.f4815F = 1.0f;
                                m2385a7.f4814E = 1.0f;
                                m2385a7.f4831V = 340.0f;
                                m2385a7.f4832W = m2385a7.f4831V;
                                m2385a7.f4807s = true;
                                m2385a7.f4808t = 20.0f;
                            }
                            gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                            C0760e m2385a8 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (m2385a8 != null) {
                                m2385a8.f4816G = 1.5f;
                                m2385a8.f4815F = 1.5f;
                                m2385a8.f4814E = 0.3f;
                                m2385a8.f4831V = 1340.0f;
                                m2385a8.f4832W = m2385a8.f4831V;
                                m2385a8.f4807s = true;
                                m2385a8.f4808t = 40.0f;
                                m2385a8.f4830U = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a9 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2385a9 != null) {
                                    m2385a9.f4816G = 1.5f;
                                    m2385a9.f4815F = 1.4f;
                                    m2385a9.f4814E = 1.3f;
                                    m2385a9.f4831V = 340.0f;
                                    m2385a9.f4832W = m2385a9.f4831V;
                                    m2385a9.f4826Q = -0.29f;
                                    m2385a9.f4807s = true;
                                    m2385a9.f4808t = 50.0f;
                                    m2385a9.f4830U = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a10 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, Color.m5243a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (m2385a10 != null) {
                                    m2385a10.f4816G = 1.3f;
                                    m2385a10.f4815F = 1.0f;
                                    m2385a10.f4814E = 1.0f;
                                    m2385a10.f4831V = 340.0f;
                                    m2385a10.f4832W = m2385a10.f4831V;
                                    m2385a10.f4826Q = -0.14f;
                                    m2385a10.f4807s = true;
                                    m2385a10.f4808t = 50.0f;
                                    m2385a10.f4830U = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a11 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW - 30.0f, this.f7174eq, -16711936);
                                if (m2385a11 != null) {
                                    m2385a11.f4816G = 1.5f;
                                    m2385a11.f4815F = 2.6f;
                                    m2385a11.f4814E = 1.3f;
                                    m2385a11.f4831V = 510.0f;
                                    m2385a11.f4832W = m2385a11.f4831V;
                                    m2385a11.f4826Q = -0.2f;
                                    m2385a11.f4807s = true;
                                    m2385a11.f4808t = 50.0f;
                                    m2385a11.f4869B = null;
                                    m2385a11.f4811x = Color.m5243a(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    m2385a11.f4830U = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a12 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW - 30.0f, this.f7174eq, -16711936);
                                if (m2385a12 != null) {
                                    m2385a12.f4816G = 1.5f;
                                    m2385a12.f4815F = 3.8f;
                                    m2385a12.f4814E = 0.8f;
                                    m2385a12.f4831V = 590.0f;
                                    m2385a12.f4832W = m2385a12.f4831V;
                                    m2385a12.f4826Q = -0.2f;
                                    m2385a12.f4807s = true;
                                    m2385a12.f4808t = 50.0f;
                                    m2385a12.f4869B = null;
                                    m2385a12.f4811x = Color.m5243a(105, 115, 115, 115);
                                    m2385a12.f4830U = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                C0761f m2348a = C0761f.m2348a(this.f1075aV + C0773f.m2214a(-10.0f, 10.0f, (int) this.f7166eh), this.f1076aW + C0773f.m2214a(-10.0f, 10.0f, ((int) this.f7166eh) + i8));
                                if (m2348a != null) {
                                    m2348a.f4891t = 200 + (i8 * 70);
                                    m2348a.f4876a = 980 + (i8 * 800);
                                }
                            }
                            if (!C1152y.m450d(this.f1075aV, this.f1076aW)) {
                                C0195l.m4478a(this.f1075aV, this.f1076aW, EnumC0196m.nuke);
                            }
                            if (GameEngine.m1054aB()) {
                                if (gameEngine.f6329bR.f4769m == null) {
                                    gameEngine.f6329bR.f4769m = gameEngine.f6326bO.mo216a(C0067R.drawable.shockwave_normal_256, true);
                                }
                                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                                C0760e m2385a13 = gameEngine.f6329bR.m2385a(this.f1075aV, this.f1076aW, this.f7174eq, -1);
                                if (m2385a13 != null && gameEngine.f6329bR.f4769m != null) {
                                    m2385a13.f4863a = new C0386ay((EnumC0387az) null);
                                    m2385a13.f4863a.imageStrip = new C0762g();
                                    m2385a13.f4863a.imageStrip.f4910k = true;
                                    m2385a13.f4863a.imageStrip.f4908i = gameEngine.f6329bR.f4769m;
                                    m2385a13.f4863a.imageStrip.f4901b = m2385a13.f4863a.imageStrip.f4908i.mo387m();
                                    m2385a13.f4863a.imageStrip.f4902c = m2385a13.f4863a.imageStrip.f4908i.mo388l();
                                    m2385a13.f4873ar = (short) 3;
                                    m2385a13.f4816G = 0.5f;
                                    m2385a13.f4815F = 3.5f;
                                    m2385a13.f4814E = 0.5f;
                                    m2385a13.f4831V = 60.0f;
                                    m2385a13.f4832W = m2385a13.f4831V;
                                    m2385a13.f4826Q = -0.2f;
                                    m2385a13.f4807s = true;
                                    m2385a13.f4808t = 1.0f;
                                    m2385a13.f4869B = null;
                                    m2385a13.f4830U = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f1071bn && !this.f1023V) {
            this.f1024W = C0773f.m2218a(this.f1024W, f);
            if (this.f1042ao) {
                m4520b(1.0f - (this.f1024W / this.f1025X));
            }
            if (this.f1024W == 0.0f) {
                this.f1023V = true;
                m4520b(1.0f);
                if (!this.f1003B && !this.f1014M && !c0189g.f1149X) {
                    mo447a();
                }
            }
        }
        this.f1011J += f;
        if (this.f983h == 0.0f && (!this.f1071bn || this.f1023V)) {
            if (c0189g.f1162ak != null) {
                c0189g.f1162ak.m3894a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1052az, this.f985j, null, false, this.f1056aD + 1, this, null);
            }
            mo447a();
        }
        if (!this.f1074aU) {
            this.f1073aT = f28;
            this.f1074aU = true;
        }
        this.f1073aT += C0773f.m2150c(this.f1073aT, f28, 12.0f * f);
    }

    /* renamed from: b */
    public void m4520b(float f) {
        boolean z = false;
        if (this.f982g.f1105f) {
            return;
        }
        if (this.f982g.f1104e) {
            z = true;
        }
        if (!z) {
            if (this.f1026Y != 0.0f && this.f1027Z > 0.0f) {
                z = true;
            }
            if ((this.f1034ag != 0.0f || this.f1035ah != 0.0f) && this.f1027Z > 0.0f) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        float f2 = this.f1027Z * f;
        float f3 = f2;
        if (this.f982g.f1107h) {
            f3 += 150.0f;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1080bi.clear();
        gameEngine.f6340cc.m3199b(this.f1075aV, this.f1076aW, f3, f1080bi);
        AbstractC0244am[] m499a = f1080bi.m499a();
        int size = f1080bi.size();
        for (int i = 0; i < size; i++) {
            m4519b(m499a[i], f, f2);
        }
        f1080bi.clear();
    }

    /* renamed from: b */
    public void m4519b(AbstractC0244am abstractC0244am, float f, float f2) {
        if (abstractC0244am.f1656cN != null) {
            return;
        }
        if (this.f1043ap != null && this.f1043ap.contains(abstractC0244am)) {
            return;
        }
        if (this.f985j != null) {
            PlayerData playerData = this.f985j.f1614bX;
            PlayerData playerData2 = abstractC0244am.f1614bX;
            if (playerData2 != playerData && playerData.m4390d(playerData2)) {
                return;
            }
            if (this.f1028aa && !playerData.m4402c(playerData2)) {
                return;
            }
            if (this.f1029ab && playerData.m4402c(playerData2)) {
                return;
            }
        }
        if (abstractC0244am.f7174eq < -5.0f && this.f1077aX >= -2.0f && !this.f1030ac) {
            return;
        }
        if (this.f1032ae) {
            if (abstractC0244am.mo3068i() != (this.f1077aX >= 5.0f)) {
                return;
            }
        } else if (!this.f1031ad && abstractC0244am.mo3068i()) {
            return;
        }
        float m2216a = C0773f.m2216a(this.f1075aV, this.f1076aW, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
        if (m2216a > f2 * f2 && !this.f982g.f1107h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(m2216a);
        if (this.f982g.f1107h) {
            sqrt -= abstractC0244am.f1626cj;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f2 || sqrt < this.f982g.f1109j) {
            return;
        }
        m4529a(f, abstractC0244am, sqrt);
    }

    /* renamed from: a */
    public void m4529a(float f, AbstractC0244am abstractC0244am, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f1027Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f982g.f1106g) {
            f3 = 1.0f;
        }
        float f4 = f3 * this.f1026Y;
        m4526a(abstractC0244am);
        m4522a(this.f985j, abstractC0244am, this.f982g.m4512a(abstractC0244am, f4, true), this, true);
        if (this.f1042ao) {
            if (this.f1043ap == null) {
                this.f1043ap = new C1136m();
            }
            this.f1043ap.add(abstractC0244am);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo440a(GameEngine gameEngine) {
        if (gameEngine.f6465cO.m5152b(this.f7172eo, this.f7173ep)) {
            return true;
        }
        if ((this.f1003B || this.f1006E || this.f982g.f1149X) && this.f987l != null && gameEngine.f6465cO.m5152b(this.f987l.f7172eo, this.f987l.f7173ep)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.f1020S || this.f984i > 0.0f) {
            return false;
        }
        C0189g c0189g = this.f982g;
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceC1063y interfaceC1063y = gameEngine.f6326bO;
        float f5 = this.f7172eo - gameEngine.f6357cw;
        float f6 = this.f7173ep - gameEngine.f6358cx;
        if (this.f987l != null) {
            f2 = this.f987l.f7172eo;
            f3 = this.f987l.f7173ep;
            f4 = this.f987l.f7174eq;
        } else {
            f2 = this.f989n;
            f3 = this.f990o;
            f4 = this.f991p;
        }
        if (!this.f1079aZ && !this.f1005D) {
            boolean z = false;
            if (this.f1002A) {
                if (this.f987l != null) {
                    if (!gameEngine.f6323bL.m4662a(this.f987l.f7172eo, this.f987l.f7173ep, gameEngine.f6312bs)) {
                        z = true;
                    }
                } else if (this.f988m && !gameEngine.f6323bL.m4662a(this.f989n, this.f990o, gameEngine.f6312bs)) {
                    z = true;
                }
            }
            if (!gameEngine.f6323bL.m4662a(this.f7172eo, this.f7173ep, gameEngine.f6312bs) && !z) {
                return false;
            }
            this.f1079aZ = true;
        }
        if (this.f1006E || c0189g.f1149X) {
            if (c0189g.f1150Y != null) {
                Paint m4515f = m4515f();
                float f7 = 0.0f;
                if (c0189g.f1155ad != 0.0f) {
                    f7 = 0.0f + (c0189g.f1155ad * this.f1011J);
                }
                float f8 = this.f7172eo - gameEngine.f6357cw;
                float f9 = (this.f7173ep - gameEngine.f6358cx) - this.f7174eq;
                float f10 = (f2 - gameEngine.f6357cw) + this.f1012K;
                float f11 = ((f3 - f4) - gameEngine.f6358cx) + this.f1013L;
                float f12 = (f10 + f8) * 0.5f;
                float f13 = (f11 + f9) * 0.5f;
                float m2170b = C0773f.m2170b(f12, f13, f10, f11);
                float m2138d = C0773f.m2138d(f12, f13, f10, f11);
                interfaceC1063y.mo136k();
                f1090f.m5158a(f12 - c0189g.f1150Y.f6622r, f13 - m2170b, f12 + c0189g.f1150Y.f6622r, f13 + m2170b);
                interfaceC1063y.mo228a(m2138d + 90.0f, f12, f13);
                interfaceC1063y.mo192a(c0189g.f1150Y, f1090f, m4515f, 0.0f, f7, 0, 0);
                interfaceC1063y.mo135l();
                if (c0189g.f1151Z != null) {
                    if (c0189g.f1152aa) {
                        interfaceC1063y.mo136k();
                        interfaceC1063y.mo228a(m2138d + 90.0f, f8, f9);
                        interfaceC1063y.mo199a(c0189g.f1151Z, f8, f9, m4515f);
                        interfaceC1063y.mo135l();
                    } else {
                        interfaceC1063y.mo199a(c0189g.f1151Z, f8, f9, m4515f);
                    }
                }
                if (c0189g.f1153ab != null) {
                    if (c0189g.f1154ac) {
                        interfaceC1063y.mo136k();
                        interfaceC1063y.mo228a(m2138d + 90.0f, f10, f11);
                        interfaceC1063y.mo199a(c0189g.f1153ab, f10, f11, m4515f);
                        interfaceC1063y.mo135l();
                        return true;
                    }
                    interfaceC1063y.mo199a(c0189g.f1153ab, f10, f11, m4515f);
                    return true;
                }
                return true;
            }
            f1096bf.m5201c((int) (60.0f + (m4516e() * 60.0f)));
            float f14 = (f2 - gameEngine.f6357cw) + this.f1012K;
            float f15 = ((f3 - f4) - gameEngine.f6358cx) + this.f1013L;
            f1096bf.m5231a(6.0f);
            interfaceC1063y.mo226a(this.f7172eo - gameEngine.f6357cw, (this.f7173ep - gameEngine.f6358cx) - this.f7174eq, f14, f15, f1096bf);
            f1096bf.m5231a(3.0f);
            interfaceC1063y.mo226a(this.f7172eo - gameEngine.f6357cw, (this.f7173ep - gameEngine.f6358cx) - this.f7174eq, f14, f15, f1096bf);
            interfaceC1063y.mo224a(f14, f15, 8.0f, f1096bf);
            interfaceC1063y.mo224a(f14, f15, 5.0f, f1096bf);
            return true;
        } else if (this.f1003B) {
            float f16 = (f2 - gameEngine.f6357cw) + this.f1012K;
            float f17 = ((f3 - f4) - gameEngine.f6358cx) + this.f1013L;
            f1094bd.m5206b(this.f1044ar);
            f1095be.m5206b(this.f1044ar);
            f1095be.m5201c((int) (f1095be.m5192f() * 0.5f));
            interfaceC1063y.mo226a(this.f7172eo - gameEngine.f6357cw, (this.f7173ep - gameEngine.f6358cx) - this.f7174eq, f16, f17, f1095be);
            interfaceC1063y.mo226a(this.f7172eo - gameEngine.f6357cw, (this.f7173ep - gameEngine.f6358cx) - this.f7174eq, f16, f17, f1094bd);
            interfaceC1063y.mo224a(f16, f17, 5.0f, f1094bd);
            return true;
        } else if (this.f1014M) {
            this.f1015N = C0773f.m2218a(this.f1015N, f);
            if (this.f1016O == null) {
                this.f1016O = new float[20];
                this.f1015N = 0.0f;
            }
            if (this.f1015N == 0.0f) {
                this.f1015N = 4.0f;
                for (int i = 0; i < this.f1016O.length; i++) {
                    this.f1016O[i] = C0773f.m2151c(-10.0f, 10.0f);
                }
            }
            float f18 = this.f7172eo - gameEngine.f6357cw;
            float f19 = (this.f7173ep - gameEngine.f6358cx) - this.f7174eq;
            float f20 = f2 - gameEngine.f6357cw;
            float f21 = (f3 - f4) - gameEngine.f6358cx;
            float m2149c = C0773f.m2149c(f18, f19, f20, f21);
            int length = this.f1016O.length;
            if (m2149c < 200.0f) {
                length = C0773f.m2167b(0, length - 5);
            } else if (m2149c < 100.0f) {
                length = C0773f.m2167b(0, length - 10);
            }
            float f22 = m2149c / (length - 1);
            float m2138d2 = C0773f.m2138d(f18, f19, f20, f21);
            float f23 = f18;
            float f24 = f19;
            float m2107k = C0773f.m2107k(m2138d2);
            float m2110j = C0773f.m2110j(m2138d2);
            for (int i2 = 0; i2 < length; i2++) {
                float f25 = this.f1016O[i2];
                float f26 = f18 + (m2107k * i2 * f22);
                float f27 = f19 + (m2110j * i2 * f22);
                if (i2 != length - 1) {
                    f26 -= m2110j * f25;
                    f27 += m2107k * f25;
                }
                interfaceC1063y.mo226a(f23, f24, f26, f27, f1097bg);
                f23 = f26;
                f24 = f27;
            }
            return true;
        } else if (this.f1017P != -1) {
            C0970e c0970e = f1086b;
            int i3 = 20;
            int i4 = 20;
            if (this.f1019R == 1) {
                c0970e = f1088d;
                i3 = 60;
                i4 = 60;
            } else if (this.f1019R == 2) {
                c0970e = f1087c;
                i3 = 20;
                i4 = 20;
            }
            if (c0189g.f1128C != null) {
                C1152y.m460a(c0189g.f1128C, f5, f6, 0.0f, this.f1073aT, this.f999x, f1099bc, c0189g.f1128C.f6620p, c0189g.f1128C.f6621q, 0);
            } else if (this.f1018Q != -1 && this.f1001z) {
                C1152y.m460a(c0970e, f5, f6, 0.0f, this.f1073aT, this.f999x, f1099bc, i3, i4, this.f1018Q);
            }
            if (c0189g.f1127B != null) {
                c0970e = c0189g.f1127B;
                i3 = c0189g.f1127B.f6620p;
                i4 = c0189g.f1127B.f6621q;
            }
            C1152y.m460a(c0970e, f5, f6, this.f7174eq, this.f1073aT, this.f999x, m4515f(), i3, i4, this.f1017P);
            return true;
        } else {
            f1093bb.m5206b(this.f1044ar);
            if (this.f7174eq > 0.0f && this.f1001z) {
                interfaceC1063y.mo224a(f5, f6, this.f999x, f1099bc);
            }
            interfaceC1063y.mo224a(f5, f6 - this.f7174eq, this.f999x, f1093bb);
            if (this.f1000y > 0.0f) {
                f1093bb.m5201c(f1093bb.m5192f() / 3);
                interfaceC1063y.mo224a(f5, f6 - this.f7174eq, this.f1000y, f1093bb);
                return true;
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo445a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: d */
    public void mo437d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: f */
    public boolean mo433f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m4515f() {
        C0966ag c0966ag;
        if (this.f1044ar != f1091aq) {
            if (GameEngine.m1030at()) {
                c0966ag = m4528a(this.f1044ar);
            } else {
                c0966ag = f1093bb;
                c0966ag.m5206b(this.f1044ar);
            }
        } else {
            c0966ag = f1092ba;
        }
        return c0966ag;
    }

    /* renamed from: a */
    public C0966ag m4528a(int i) {
        if (this.f1081bj != null) {
            return this.f1081bj;
        }
        if (f1082bk != null && f1083bl == i) {
            this.f1081bj = f1082bk;
            return this.f1081bj;
        }
        C0966ag c0966ag = new C0966ag();
        c0966ag.m5225a(new LightingColorFilter(i, 0));
        c0966ag.m5206b(i);
        f1082bk = c0966ag;
        f1083bl = i;
        this.f1081bj = c0966ag;
        return this.f1081bj;
    }

    /* renamed from: a */
    public void m4530a(float f, float f2, C0454h c0454h) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f985j == null) {
            GameEngine.print("Projectile: cannot Retarget: source==null");
            return;
        }
        float m2107k = this.f7172eo + (C0773f.m2107k(this.f1052az) * f2);
        float m2110j = this.f7173ep + (C0773f.m2110j(this.f1052az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        AbstractC0629y abstractC0629y = null;
        AbstractC0244am abstractC0244am = null;
        if (this.f985j instanceof AbstractC0629y) {
            abstractC0629y = (AbstractC0629y) this.f985j;
            abstractC0244am = abstractC0629y.m2959ab();
        }
        Iterator it = gameEngine.f6340cc.m3209a(m2107k, m2110j, f).iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (this.f985j.f1614bX != abstractC0244am2.f1614bX) {
                boolean z = true;
                if (abstractC0629y != null) {
                    z = abstractC0629y.m2925b(abstractC0244am2, true);
                }
                if (z && this.f986k >= 0 && abstractC0629y != null && this.f986k < abstractC0629y.mo2900bl() && !abstractC0629y.mo3017a((int) this.f986k, abstractC0244am2, true, false)) {
                    z = false;
                }
                if (c0454h != null && !C0453g.m3684a(c0454h, abstractC0244am2.mo3599de())) {
                    z = false;
                }
                if (z) {
                    float m2216a = C0773f.m2216a(m2107k, m2110j, abstractC0244am2.f7172eo, abstractC0244am2.f7173ep);
                    boolean z2 = false;
                    if (f4 == -1.0f || m2216a < f4) {
                        z2 = true;
                    }
                    if (abstractC0244am == abstractC0244am2) {
                        z2 = true;
                    }
                    if (z2 && m2216a < f3) {
                        f4 = m2216a;
                        this.f987l = abstractC0244am2;
                    }
                }
            }
        }
    }
}