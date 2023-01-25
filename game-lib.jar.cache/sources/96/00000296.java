package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0627w;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0240ai;
import com.corrodinggames.rts.game.units.C0247ap;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0238ag;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.InterfaceC0474d;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a;
import com.corrodinggames.rts.game.units.custom.p018b.C0396h;
import com.corrodinggames.rts.game.units.custom.p018b.C0397i;
import com.corrodinggames.rts.game.units.custom.p018b.C0401m;
import com.corrodinggames.rts.game.units.custom.p018b.C0402n;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p024d.AbstractC0503i;
import com.corrodinggames.rts.game.units.p024d.C0504j;
import com.corrodinggames.rts.game.units.p024d.C0505k;
import com.corrodinggames.rts.game.units.p024d.C0512q;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;
import com.corrodinggames.rts.game.units.p026e.C0524b;
import com.corrodinggames.rts.game.units.p026e.C0531i;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0643ab;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.C0761f;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1115ai;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class C0456j extends AbstractC0627w implements InterfaceC0242ak, InterfaceC0474d, InterfaceC0506l {

    /* renamed from: a */
    public int f2868a;

    /* renamed from: b */
    public final C0432e f2869b;

    /* renamed from: c */
    float f2870c;

    /* renamed from: d */
    float f2871d;

    /* renamed from: e */
    float f2872e;

    /* renamed from: f */
    public float f2873f;

    /* renamed from: g */
    boolean f2874g;

    /* renamed from: h */
    public boolean f2875h;

    /* renamed from: i */
    public boolean f2876i;

    /* renamed from: j */
    float f2877j;

    /* renamed from: k */
    boolean f2878k;

    /* renamed from: l */
    boolean f2879l;

    /* renamed from: m */
    float f2880m;

    /* renamed from: n */
    boolean f2881n;

    /* renamed from: o */
    float f2882o;

    /* renamed from: p */
    public boolean f2883p;

    /* renamed from: q */
    float f2884q;

    /* renamed from: r */
    boolean f2885r;

    /* renamed from: s */
    float f2886s;

    /* renamed from: t */
    float f2887t;

    /* renamed from: u */
    public float f2888u;

    /* renamed from: v */
    public boolean f2889v;

    /* renamed from: w */
    float f2890w;

    /* renamed from: x */
    public C0458l f2891x;

    /* renamed from: y */
    public C0361as f2892y;

    /* renamed from: z */
    public C0458l f2893z;

    /* renamed from: A */
    public AbstractC0381at[] f2894A;

    /* renamed from: B */
    public final C1136m f2895B;

    /* renamed from: C */
    public C1136m f2896C;

    /* renamed from: D */
    public float f2897D;

    /* renamed from: E */
    PointF[] f2898E;

    /* renamed from: F */
    PointF[] f2899F;

    /* renamed from: G */
    C0188f[] f2900G;

    /* renamed from: J */
    Paint f2901J;

    /* renamed from: dL */
    final C0505k f2902dL;

    /* renamed from: dM */
    public static PointF f2903dM;

    /* renamed from: dN */
    public static AbstractC0244am f2904dN;

    /* renamed from: dO */
    public static int f2905dO;

    /* renamed from: dP */
    public float f2906dP;

    /* renamed from: dQ */
    public float f2907dQ;

    /* renamed from: dR */
    public float f2908dR;

    /* renamed from: dS */
    public float f2909dS;

    /* renamed from: dT */
    public C0397i[] f2910dT;

    /* renamed from: dY */
    static boolean f2911dY;

    /* renamed from: dZ */
    static final HashMap f2912dZ;

    /* renamed from: ea */
    static int f2913ea;

    /* renamed from: eb */
    static String f2914eb;

    /* renamed from: ec */
    static final PointF f2915ec;

    /* renamed from: ed */
    C0454h f2916ed;

    /* renamed from: ee */
    protected static final C1115ai f2917ee;

    /* renamed from: ef */
    protected static final PointF f2918ef;

    /* renamed from: eg */
    C1136m f2919eg;

    /* renamed from: H */
    static final PointF f2920H = new PointF();

    /* renamed from: I */
    static final PointF f2921I = new PointF();

    /* renamed from: K */
    protected static final PointF f2922K = new PointF();

    /* renamed from: dK */
    protected static final C1115ai f2923dK = new C1115ai();

    /* renamed from: dU */
    static ArrayList f2924dU = new ArrayList();

    /* renamed from: dV */
    public static C1136m f2925dV = new C1136m();

    /* renamed from: dW */
    public static C1136m f2926dW = new C1136m();

    /* renamed from: dX */
    public static C1136m f2927dX = new C1136m();

    /* renamed from: K */
    public void m3686K() {
        this.f2898E = new PointF[6];
        this.f2899F = new PointF[this.f2898E.length];
        for (int i = 0; i < this.f2898E.length; i++) {
            this.f2898E[i] = new PointF();
            this.f2899F[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: b */
    public PointF[] mo3170b() {
        if (this.f2898E == null) {
            m3686K();
        }
        return this.f2898E;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0474d
    /* renamed from: e_ */
    public PointF[] mo3169e_() {
        if (this.f2898E == null) {
            m3686K();
        }
        return this.f2899F;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo1977a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(11);
        gameOutputStream.writeFloat(this.f2872e);
        gameOutputStream.writeFloat(this.f2880m);
        gameOutputStream.writeBoolean(this.f2881n);
        gameOutputStream.writeInt(this.f2895B.size());
        Iterator it = this.f2895B.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1347a((AbstractC0244am) it.next());
        }
        gameOutputStream.writeBoolean(this.f2885r);
        gameOutputStream.writeFloat(this.f2882o);
        gameOutputStream.writeFloat(this.f2873f);
        gameOutputStream.writeFloat(this.f2886s);
        gameOutputStream.writeBoolean(this.f2889v);
        byte b = 0;
        if (this.f2910dT != null) {
            b = (byte) this.f2910dT.length;
        }
        gameOutputStream.writeByte(b);
        if (this.f2910dT != null) {
            for (int i = 0; i < b; i++) {
                C0397i c0397i = this.f2910dT[i];
                gameOutputStream.writeFloat(c0397i.f2388b);
                gameOutputStream.writeFloat(c0397i.f2389c);
                gameOutputStream.writeFloat(c0397i.f2400d);
                gameOutputStream.writeFloat(c0397i.f2394i);
                gameOutputStream.writeBoolean(c0397i.f2395k);
                gameOutputStream.writeBoolean(c0397i.f2401j);
                gameOutputStream.writeBoolean(c0397i.f2402m);
                gameOutputStream.writeBoolean(c0397i.f2403n);
            }
        }
        this.f2902dL.m3375a(gameOutputStream);
        gameOutputStream.mo1399a(this.f2893z);
        gameOutputStream.writeBoolean(this.f2876i);
        gameOutputStream.writeBoolean(this.f2875h);
        boolean z = this.f2916ed != this.f2891x.f2953O;
        gameOutputStream.writeBoolean(z);
        if (z) {
            C0453g.m3707a(this.f2916ed, gameOutputStream);
        }
        C0361as.m4000a(this.f2892y, this, gameOutputStream);
        gameOutputStream.writeFloat(this.f2884q);
        super.mo1977a(gameOutputStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo2367a(GameInputStream gameInputStream) {
        InterfaceC0303as m1304q;
        byte readByte;
        C0397i c0397i;
        if (gameInputStream.m1324b() >= 32) {
            int readInt = gameInputStream.readInt();
            this.f2872e = gameInputStream.readFloat();
            this.f2880m = gameInputStream.readFloat();
            this.f2881n = gameInputStream.readBoolean();
            this.f2895B.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                AbstractC0244am m1306o = gameInputStream.m1306o();
                if (m1306o != null) {
                    this.f2895B.add(m1306o);
                }
            }
            if (readInt >= 1) {
                this.f2885r = gameInputStream.readBoolean();
            }
            if (readInt >= 2) {
                this.f2882o = gameInputStream.readFloat();
            }
            if (readInt >= 3) {
                this.f2873f = gameInputStream.readFloat();
                this.f2886s = gameInputStream.readFloat();
            }
            if (readInt >= 4) {
                this.f2889v = gameInputStream.readBoolean();
            }
            if (readInt >= 5 && (readByte = gameInputStream.readByte()) != 0) {
                m3612du();
                if (this.f2910dT == null) {
                    GameEngine.m5572e("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < readByte; i2++) {
                    if (this.f2910dT == null) {
                        c0397i = new C0397i();
                    } else if (i2 >= this.f2910dT.length) {
                        GameEngine.m5572e("readIn: legs " + ((int) i2) + ">=" + this.f2910dT.length);
                        c0397i = new C0397i();
                    } else {
                        c0397i = this.f2910dT[i2];
                    }
                    C0397i c0397i2 = c0397i;
                    c0397i2.f2388b = gameInputStream.readFloat();
                    c0397i2.f2389c = gameInputStream.readFloat();
                    c0397i2.f2400d = gameInputStream.readFloat();
                    c0397i2.f2394i = gameInputStream.readFloat();
                    c0397i2.f2395k = gameInputStream.readBoolean();
                    c0397i2.f2404o = true;
                    c0397i2.f2401j = gameInputStream.readBoolean();
                    c0397i2.f2402m = gameInputStream.readBoolean();
                    c0397i2.f2403n = gameInputStream.readBoolean();
                }
            }
            if (readInt >= 6) {
                this.f2902dL.m3374a(gameInputStream);
            }
            if (readInt >= 7 && (m1304q = gameInputStream.m1304q()) != null) {
                if (m1304q instanceof C0458l) {
                    this.f2893z = (C0458l) m1304q;
                } else {
                    GameEngine.print("Got non CustomUnitMetadata object of:" + m1304q.mo4202i() + " loading real_meta");
                    this.f2893z = C0458l.f2933b;
                }
            }
            if (readInt >= 8) {
                this.f2876i = gameInputStream.readBoolean();
                this.f2875h = gameInputStream.readBoolean();
            }
            if (readInt >= 9 && gameInputStream.readBoolean()) {
                m3667a(C0453g.m3706a(gameInputStream), true);
            }
            if (readInt >= 10) {
                C0361as.m3997a(this, gameInputStream, readInt);
            }
            if (readInt >= 11) {
                this.f2884q = gameInputStream.readFloat();
            }
        }
        super.mo2367a(gameInputStream);
        if (this.f2910dT != null) {
            this.f2906dP = this.f7172eo;
            this.f2907dQ = this.f7173ep;
            this.f2908dR = this.f7174eq;
            this.f2909dS = this.f1623cg;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cr */
    public boolean mo3269cr() {
        return this.f2891x.f3295eM > 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bB */
    public int mo2940bB() {
        return this.f2895B.size();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bA */
    public boolean mo2941bA() {
        return this.f2881n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3268d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2891x.f3295eM == 0 || this.f2881n || this.f1629cm < 1.0f || !m3688G(abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1614bX != abstractC0244am.f1614bX && !z && (!this.f2891x.f3060cB || this.f1614bX != PlayerData.f1373i)) {
            return false;
        }
        if (this.f2891x.f3159eP != null && !this.f2891x.f3159eP.m3700a() && !C0453g.m3708a(this.f2891x.f3159eP, abstractC0244am.mo4278de())) {
            return false;
        }
        if (this.f2891x.f3296eQ.size() > 0) {
            boolean z2 = false;
            Iterator it = this.f2891x.f3296eQ.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((EnumC0246ao) it.next()) == abstractC0244am.mo3093h()) {
                    z2 = true;
                    break;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return C1152y.m469a(abstractC0244am, this.f2891x.f3160eR, this.f2891x.f3161eS);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3265e(AbstractC0244am abstractC0244am, boolean z) {
        if (!mo3268d(abstractC0244am, z)) {
            return false;
        }
        m3692C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3692C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1656cN = this;
        this.f2895B.add(abstractC0244am);
        if (this.f2891x.f3061cC && this.f1614bX == PlayerData.f1373i) {
            mo4265e(abstractC0244am.f1614bX);
        }
        m4344a(EnumC0348af.transportingNewUnit, abstractC0244am);
        abstractC0244am.m4344a(EnumC0348af.enteredTransport, this);
        GameEngine.getGameEngine().f6330bS.m1822l(abstractC0244am);
    }

    /* renamed from: D */
    public void m3691D(AbstractC0244am abstractC0244am) {
        m4344a(EnumC0348af.transportUnloadedOrRemovedUnit, abstractC0244am);
        abstractC0244am.m4344a(EnumC0348af.leftTransport, this);
        if (this.f2891x.f3062cD && this.f2895B.size() == 0) {
            mo4265e(PlayerData.f1373i);
        }
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: e */
    public void mo3266e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1656cN == this) {
            this.f2895B.remove(abstractC0244am);
            abstractC0244am.f1656cN = null;
            m3691D(abstractC0244am);
            return;
        }
        GameEngine.m998g("Unit is not being transported");
    }

    /* renamed from: L */
    public void m3685L() {
        if (this.f2891x.f3295eM == 0) {
            return;
        }
        this.f2881n = true;
        this.f2880m = 30.0f;
    }

    /* renamed from: M */
    public void m3684M() {
        if (this.f2891x.f3295eM == 0) {
            return;
        }
        this.f2881n = false;
    }

    /* renamed from: g */
    public boolean m3606g(boolean z) {
        if (this.f2895B.size() == 0) {
            return false;
        }
        return m3663b((AbstractC0244am) this.f2895B.remove(this.f2895B.size() - 1), z, this.f2895B.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m3674a(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        this.f2895B.remove(abstractC0244am);
        return m3663b(abstractC0244am, z, z2);
    }

    /* renamed from: b */
    private boolean m3663b(AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.f2891x.f3090dk != null) {
            f = this.f2891x.f3090dk.floatValue();
        }
        float f2 = 70.0f;
        if (this.f2891x.f3093dn != null) {
            f2 = this.f2891x.f3093dn.floatValue();
        }
        float f3 = this.f2891x.f3088di;
        float f4 = this.f2891x.f3089dj;
        float m2123k = (this.f7172eo + (C0773f.m2123k(this.f1623cg + f) * f4)) - (C0773f.m2126j(this.f1623cg + f) * f3);
        float m2126j = this.f7173ep + (C0773f.m2126j(this.f1623cg + f) * f4) + (C0773f.m2123k(this.f1623cg + f) * f3);
        float m2123k2 = m2123k + (C0773f.m2123k(this.f1623cg + 90.0f) * (z2 ? -7.0f : 7.0f));
        float m2126j2 = m2126j + (C0773f.m2126j(this.f1623cg + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !mo3421bI()) {
            if (!C1152y.m475a(abstractC0244am, m2123k2, m2126j2)) {
                m2123k2 += 10.0f;
            }
            if (!C1152y.m475a(abstractC0244am, m2123k2, m2126j2)) {
                m2123k2 -= 20.0f;
            }
            if (!C1152y.m475a(abstractC0244am, m2123k2, m2126j2)) {
                m2123k2 -= 10.0f;
                m2126j2 += 10.0f;
            }
            if (!C1152y.m475a(abstractC0244am, m2123k2, m2126j2)) {
                m2126j2 -= 20.0f;
            }
        }
        if (!z && !C1152y.m475a(abstractC0244am, m2123k2, m2126j2) && !mo3421bI()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (abstractC0629y.f1657cO == this) {
                    C0402n dn = abstractC0629y.m4270dn();
                    if (dn == null) {
                        GameEngine.m5572e("Unload, attachment data is null");
                    }
                    if (dn != null) {
                        z4 = dn.f2432E;
                    }
                }
            }
            C1152y.m470a(abstractC0244am, this);
            float f5 = this.f1623cg + f;
            if (!z4) {
                abstractC0244am.f7172eo = m2123k2;
                abstractC0244am.f7173ep = m2126j2;
                abstractC0244am.f1623cg = f5;
                abstractC0244am.f1620cd = 0.0f;
                abstractC0244am.f1619cc = 0.0f;
                abstractC0244am.f1616bZ = 0.0f;
                abstractC0244am.f1617ca = 0.0f;
                abstractC0244am.f1616bZ += 0.1f;
            }
            abstractC0244am.f1608bR = this;
            abstractC0244am.f1609bS = 45.0f;
            if (z4) {
                abstractC0244am.f1609bS = 85.0f;
            }
            if (abstractC0244am instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am;
                if (!z4) {
                    abstractC0629y2.m2880j(abstractC0244am.f1623cg);
                }
                if (!this.f2891x.f3165eW.read(this)) {
                    abstractC0629y2.m2959az();
                    if (f2 != 0.0f) {
                        abstractC0629y2.m2902d(abstractC0244am.f7172eo + (C0773f.m2123k(f5 + (z2 ? -7.0f : 7.0f)) * f2), abstractC0244am.f7173ep + (C0773f.m2126j(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    abstractC0629y2.f3952ac = 0;
                } else {
                    abstractC0629y2.m3004aH();
                }
            }
            if (!z4) {
                if (!this.f2891x.f3092dm) {
                    abstractC0244am.f7174eq = this.f7174eq;
                }
                abstractC0244am.f7174eq += this.f2891x.f3091dl;
            }
            if (abstractC0244am instanceof C0456j) {
                ((C0456j) abstractC0244am).m3629dF();
            }
        }
        if (!z3) {
            this.f2895B.add(abstractC0244am);
        } else {
            m3691D(abstractC0244am);
        }
        return z3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bY */
    public int mo3272bY() {
        if (this.f2891x.f3295eM == 0 || !this.f2891x.f2939x) {
            return -1;
        }
        return m3626dI();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bZ */
    public int mo3271bZ() {
        if (this.f2891x.f3295eM == 0 || !this.f2891x.f2939x) {
            return -1;
        }
        return this.f2891x.f3295eM;
    }

    /* renamed from: ds */
    public void m3614ds() {
        if (this.f2895B.f7109a > 0) {
            m3604h(this.f2891x.f3164eV.read(this));
        }
    }

    /* renamed from: h */
    public void m3604h(boolean z) {
        Iterator it = this.f2895B.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1656cN = null;
            abstractC0244am.f7172eo = this.f7172eo + (C0773f.m2123k(this.f1623cg) * (-9.0f));
            abstractC0244am.f7173ep = this.f7173ep + (C0773f.m2126j(this.f1623cg) * (-9.0f));
            if (z) {
                abstractC0244am.m4291cj();
            }
        }
        this.f2895B.clear();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bu */
    public void mo2915bu() {
        if (!this.f1612bV) {
            m4345a(EnumC0348af.destroyed);
        }
        Object[] m540a = this.f2891x.f3227h.m540a();
        for (int i = this.f2891x.f3227h.f7109a - 1; i >= 0; i--) {
            ((AbstractC0389a) m540a[i]).mo3944b(this);
        }
        super.mo2915bu();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0673ay, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo2749a() {
        m3614ds();
        Object[] m540a = this.f2891x.f3227h.m540a();
        for (int i = this.f2891x.f3227h.f7109a - 1; i >= 0; i--) {
            ((AbstractC0389a) m540a[i]).mo3942c(this);
        }
        PlayerData.m4545a((AbstractC0244am) this);
        this.f2902dL.m3373a(true);
        super.mo2749a();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dt */
    public C0458l mo5568r() {
        return this.f2891x;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3073I() {
        if (this.f2891x.f2979aH || this.f2874g || this.f1657cO != null) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aR */
    public boolean mo2994aR() {
        if (this.f2891x.f3117dP) {
            return false;
        }
        C0402n dn = m4270dn();
        if (dn != null && !dn.f2438O) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aS */
    public boolean mo2993aS() {
        if (this.f2891x.f2979aH) {
            return false;
        }
        C0402n dn = m4270dn();
        if (dn != null && !dn.f2434H) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3093h() {
        return this.f2891x.f3172fh;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3092i() {
        return this.f2891x.f3172fh == EnumC0246ao.AIR && this.f7174eq >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo3098Q() {
        return this.f7174eq <= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cv */
    public boolean mo3149cv() {
        if (mo3093h() == EnumC0246ao.WATER) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ct */
    public boolean mo4144ct() {
        if (mo3093h() == EnumC0246ao.AIR) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public C0970e mo3090v() {
        if (this.f1614bX.site == -1 || this.f2891x.f2972as == null) {
            return null;
        }
        return this.f2891x.f2972as[this.f1614bX.m4560R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2903d() {
        if (this.f1612bV && this.f2891x.f3248an != null) {
            return this.f2891x.f3248an;
        }
        return this.f2891x.f3251ar[this.f1614bX.m4560R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2877k() {
        return this.f2891x.f3250ap;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3079F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && (!this.f1612bV || this.f7174eq >= 1.0f) && this.f7174eq >= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2900d(int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2583C != null && c0416bn.f2583C.read(this)) {
            return null;
        }
        if (c0416bn.f2618aE != null) {
            return c0416bn.f2618aE[this.f1614bX.m4560R()];
        }
        if (c0416bn.f2617aD != null) {
            return c0416bn.f2617aD;
        }
        if (this.f2891x.f3252at != null) {
            return this.f2891x.f3252at[this.f1614bX.m4560R()];
        }
        return this.f2891x.f3249ao;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: h */
    public float mo2886h(int i) {
        return this.f2891x.f3301fQ[i].f2620aG;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: i */
    public float mo2882i(int i) {
        return this.f2891x.f3301fQ[i].f2621aH;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3095e() {
        PlayerData playerData;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (mo3421bI()) {
            gameEngine.f6332bU.m1184a(this);
        }
        if (this.f1629cm < 1.0f) {
            if (this.f2891x.f3018bx != null && this.f2891x.f3018bx.m3487b()) {
                this.f2891x.f3018bx.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, null);
                return false;
            } else if (this.f2891x.f3019by != null && this.f2891x.f3019by.m3487b()) {
                this.f2891x.f3019by.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, null);
                return false;
            } else {
                m3038a(EnumC0233ab.verysmall);
                return false;
            }
        }
        if (!this.f2891x.f3173fi) {
            m453S(0);
        }
        if (this.f2891x.f3019by != null && this.f2891x.f3019by.m3487b()) {
            this.f2891x.f3019by.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, null);
        }
        if (this.f2891x.f3264bB != -1) {
            m3676a((AbstractC0244am) null, this.f7172eo, this.f7173ep, this.f2891x.f3264bB, (C0410bh) null, 0);
        }
        if (this.f2891x.f3021bC != null) {
            if (this.f2891x.f3022bD && this.f1583bt != null && this.f1583bt.f1614bX != null) {
                playerData = this.f1583bt.f1614bX;
            } else {
                playerData = this.f1614bX;
            }
            if (!playerData.f1329E) {
                this.f2891x.f3021bC.m3903a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, playerData, this.f1649cG, this);
            }
        }
        this.f1610bT = false;
        if (!this.f2891x.f3173fi) {
            m3614ds();
        }
        if (this.f2891x.f3008bn) {
            boolean z = false;
            if (this.f2891x.f3012br && gameEngine.m1102O() && gameEngine.netEngine.gameMapData.nukes) {
                z = true;
            }
            if (!z) {
                C0188f m3336a = C0512q.m3336a(this, this.f7172eo, this.f7173ep, this.f7172eo, this.f7173ep);
                m3336a.f1060aH = false;
                m3336a.f1027Z = this.f2891x.f3009bo;
                m3336a.f1026Y = this.f2891x.f3010bp;
            }
        }
        if (this.f2891x.f3007bm != 0) {
            C0240ai c0240ai = new C0240ai(false);
            c0240ai.f7172eo = this.f7172eo;
            c0240ai.f7173ep = this.f7173ep;
            c0240ai.mo2952b(PlayerData.f1372h);
            PlayerData.m4507c(c0240ai);
        }
        if (this.f2891x.f3020bz != null) {
            this.f2891x.f3020bz.m3911a(this.f7172eo, this.f7173ep, 1.0f);
        }
        if (this.f2891x.f3151eD) {
            if (this.f2891x.f3020bz == null) {
                gameEngine.f6324bM.m2836a(C0637e.f4093A, 0.8f, this.f7172eo, this.f7173ep);
            }
            if (this.f2891x.f3015bu) {
                if (!mo3092i() && !this.f2891x.f3292eJ) {
                    C0195l.m4583a(this, 1);
                }
                if (this.f2891x.f3014bt != null) {
                    m3037a(this.f2891x.f3014bt, true);
                } else if (this.f2891x.f3004bj) {
                    m3038a(EnumC0233ab.large);
                }
            }
            if (this.f2891x.f3152eE) {
                for (int i = 0; i < mo2920bp(); i++) {
                    gameEngine.f6329bR.m2383d(this.f7172eo, this.f7173ep, this.f7174eq);
                }
            }
        } else {
            if (this.f2910dT != null) {
                m3611dv();
                for (int i2 = 0; i2 < this.f2910dT.length; i2++) {
                    C0397i c0397i = this.f2910dT[i2];
                    C0403ba c0403ba = this.f2891x.f3255ax[i2];
                    float f = this.f7172eo + c0397i.f2388b;
                    float f2 = this.f7173ep + c0397i.f2389c;
                    if (c0403ba.f2496J && !c0403ba.f2468p && (c0403ba.f2469q == null || !c0403ba.f2469q.read(this))) {
                        if (!C1152y.m455d(f, f2) && !this.f2891x.f3292eJ) {
                            C0195l.m4585a(f, f2);
                        }
                        gameEngine.f6329bR.m2393b(f, f2, 0.0f);
                    }
                }
            }
            if (!mo3092i()) {
                if (this.f2891x.f3015bu) {
                    if (this.f2891x.f3014bt != null) {
                        m3037a(this.f2891x.f3014bt, true);
                    } else {
                        m3038a(EnumC0233ab.small);
                    }
                }
            } else {
                if (this.f2891x.f3015bu) {
                    if (this.f2891x.f3014bt != null) {
                        m3037a(this.f2891x.f3014bt, false);
                    } else {
                        gameEngine.f6329bR.m2393b(this.f7172eo, this.f7173ep, this.f7174eq);
                    }
                }
                for (int i3 = 0; i3 < mo2920bp(); i3++) {
                    gameEngine.f6329bR.m2381e(this.f7172eo, this.f7173ep, this.f7174eq);
                }
            }
        }
        if (this.f2891x.f3173fi) {
            return true;
        }
        if (this.f2891x.f3248an != null) {
            this.f3917M = this.f2891x.f3248an;
            this.f2868a = 0;
            this.f4264ew = true;
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bq */
    public void mo2919bq() {
        if (!this.f2891x.f3292eJ) {
            super.mo2919bq();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: U */
    public void mo3063U() {
        float mo3084C;
        super.mo3063U();
        for (int i = 0; i < this.f2891x.f3301fQ.length; i++) {
            C0247ap c0247ap = this.f1654cL[i];
            GameEngine.m5572e("Dir was:" + c0247ap.f1717a + " for name:" + this.f2891x.f3301fQ[i].f2567a);
            GameEngine.m5572e("lockDelay:" + c0247ap.f1720d + " shootCooldown:" + c0247ap.f1721e);
            GameEngine.m5572e("updateAndShouldResetTurret:" + mo2953b(i, 0.0f));
            GameEngine.m5572e("idleDir:" + mo3084C(i));
            GameEngine.m5572e("diffDir:" + C0773f.m2166c(c0247ap.f1717a, mo3084C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m3666a(C0458l c0458l, boolean z, boolean z2) {
        m3665a(c0458l, z, z2, (AbstractC0381at[]) null);
    }

    /* renamed from: a */
    public void m3665a(C0458l c0458l, boolean z, boolean z2, AbstractC0381at[] abstractC0381atArr) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0458l c0458l2 = this.f2891x;
        C0361as c0361as = this.f2892y;
        this.f2891x = c0458l;
        this.f1694dz = this.f2891x;
        this.f2892y = c0458l.f3278cL;
        if (z2) {
            C0361as.m3999a(this, c0361as, c0458l2);
        } else if (abstractC0381atArr != null) {
            C0361as.m3998a(this, c0361as, abstractC0381atArr);
        }
        m4327bS();
        if (!z2) {
            m3602j(true);
        }
        if (!z) {
            if (c0458l.f3301fQ.length > 1) {
                boolean z3 = true;
                if (c0458l.f3301fQ.length != c0458l2.f3301fQ.length) {
                    z3 = false;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= c0458l.f3301fQ.length) {
                            break;
                        }
                        if (c0458l.f3301fQ[i].f2567a.equalsIgnoreCase(c0458l2.f3301fQ[i].f2567a)) {
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    C0247ap[] c0247apArr = new C0247ap[c0458l.f3301fQ.length];
                    for (int i2 = 0; i2 < c0458l.f3301fQ.length; i2++) {
                        C0416bn c0416bn = c0458l.f3301fQ[i2];
                        C0416bn m3543e = c0458l2.m3543e(c0416bn.f2567a);
                        if (m3543e != null) {
                            c0247apArr[c0416bn.f2571e] = this.f1654cL[m3543e.f2571e];
                            this.f1654cL[m3543e.f2571e] = null;
                        }
                    }
                    for (int i3 = 0; i3 < c0458l.f3301fQ.length; i3++) {
                        if (c0247apArr[i3] == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < c0458l.f3301fQ.length) {
                                    if (this.f1654cL[i4] == null) {
                                        i4++;
                                    } else {
                                        c0247apArr[i3] = this.f1654cL[i4];
                                        this.f1654cL[i4] = null;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (c0247apArr[i3] == null) {
                                c0247apArr[i3] = new C0247ap();
                            }
                            c0247apArr[i3].m4244a(this.f1623cg);
                        }
                    }
                    this.f1654cL = c0247apArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < c0458l.f3301fQ.length; i5++) {
                this.f1654cL[i5].m4244a(this.f1623cg + mo3086B(i5));
            }
        }
        if (this.f2891x.f3246ae) {
            m2751V(this.f2891x.f2964af);
            m2750W(this.f2891x.f2965ag);
        } else {
            m2753T(this.f2891x.f2964af);
            m2752U(this.f2891x.f2965ag);
        }
        this.f4264ew = false;
        this.f1626cj = this.f2891x.f3079cW;
        this.f1627ck = this.f2891x.f3083dd;
        if (this.f1612bV) {
            this.f2868a = 0;
        } else {
            this.f2868a = this.f2891x.f2959Y;
        }
        this.f2874g = false;
        if (z) {
            this.f7174eq += this.f2891x.f3286dS;
        }
        float f = this.f1638cv;
        this.f1638cv = this.f2892y.f2256c;
        if (z) {
            m4257o(this.f1638cv);
        } else if (f == 0.0f) {
            m4257o(this.f1638cv);
        } else {
            m4257o((this.f1637cu / f) * this.f1638cv);
        }
        float f2 = this.f1643cA;
        this.f1643cA = this.f2892y.f2260g;
        if (this.f2891x.f3069cM) {
            if (this.f1640cx > this.f1643cA) {
                this.f1640cx = this.f1643cA;
            }
        } else if (z) {
            this.f1640cx = this.f1643cA;
        } else if (f2 == 0.0f) {
            this.f1640cx = this.f1643cA;
        } else {
            this.f1640cx = (this.f1640cx / f2) * this.f1643cA;
        }
        if (this.f2891x.f3071cO) {
            if (this.f1644cB > this.f2892y.f2257d) {
                this.f1644cB = this.f2892y.f2257d;
            }
        } else if (z) {
            this.f1644cB = this.f2892y.f2257d * this.f2891x.f3075cS;
        } else if (c0361as.f2257d == 0.0f) {
            this.f1644cB = this.f2892y.f2257d;
        } else {
            this.f1644cB = (this.f1644cB / c0361as.f2257d) * this.f2892y.f2257d;
        }
        if (this.f1614bX == null) {
            this.f3917M = this.f2891x.f3245ad;
        } else {
            mo3065S();
        }
        if (this.f2891x.f2979aH && z) {
            this.f1623cg = -90.0f;
        }
        mo3094f_();
        if (!z && ((this.f1587bx != null || this.f1588by != null) && (!C0429b.m3851b(this.f2891x.f3048ch, c0458l2.f3048ch) || !C0429b.m3851b(this.f2891x.f3050cj, c0458l2.f3050cj)))) {
            this.f1587bx = null;
            this.f1588by = null;
        }
        if (!z) {
            boolean z4 = this.f2891x.mo4201j() != c0458l2.mo4201j();
            if (this.f2891x.mo4201j()) {
                this.f1620cd = 0.0f;
                this.f1619cc = 0.0f;
                if (c0458l2.mo4201j() && !this.f2891x.f3279cX.equals(c0458l2.f3279cX)) {
                    z4 = true;
                }
            }
            if (z4) {
                gameEngine.f6332bU.m1184a(this);
            }
        }
        this.f2877j = 1.0f;
        if (this.f2891x.f3277cI != -2) {
        }
        if (!this.f1612bV) {
            m3629dF();
        }
        if (this.f2891x.f3153eF) {
        }
        m3612du();
        m4277dg().m3881a(this.f2891x);
        if (!z) {
            int mo2924bl = mo2924bl();
            for (int i6 = 0; i6 < mo2924bl; i6++) {
                C0247ap c0247ap = this.f1654cL[i6];
                C0416bn c0416bn2 = this.f2891x.f3301fQ[i6];
                if (c0416bn2 != null) {
                    if (c0247ap.f1721e > c0416bn2.f2625m) {
                        c0247ap.f1721e = c0416bn2.f2625m;
                    }
                    if (c0247ap.f1722f > c0416bn2.f2626n) {
                        c0247ap.f1722f = c0416bn2.f2626n;
                    }
                }
            }
        }
        if (!z) {
            if (!this.f2891x.f3082dc) {
                this.f2902dL.f3531b = null;
            }
            if (this.f2891x.f3171fg != c0458l2.f3171fg) {
                m3004aH();
            }
        }
        if (this.f2891x.f3062cD && this.f2895B.size() == 0) {
            mo2952b(PlayerData.f1373i);
        }
        if (this.f1649cG && !gameEngine.f6330bS.m1828i(this)) {
            gameEngine.f6330bS.m1822l(this);
        }
        if (!z) {
            Object[] m540a = this.f2891x.f3227h.m540a();
            for (int i7 = this.f2891x.f3227h.f7109a - 1; i7 >= 0; i7--) {
                ((AbstractC0389a) m540a[i7]).mo3949a(this, c0458l2);
            }
            if (this.f1629cm >= 1.0f) {
                if (this.f2892y.f2267n > c0361as.f2267n) {
                    mo2904c(false);
                }
            } else {
                if ((this.f2891x.f3087dh != -1 ? this.f2891x.f3087dh : this.f2892y.f2267n) > (c0458l2.f3087dh != -1 ? c0458l2.f3087dh : c0361as.f2267n)) {
                    mo2904c(false);
                }
            }
        }
        if (this.f2876i && this.f2891x.f3097dv != null) {
            this.f2869b.m3814a(this.f2891x.f3097dv, 7, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f_ */
    public void mo3094f_() {
        if (this.f2891x.f2979aH) {
            this.f1610bT = false;
        } else if (!this.f1612bV) {
            this.f1610bT = true;
            if (this.f2891x.f3150eC) {
                this.f1610bT = false;
            }
        } else {
            this.f1610bT = false;
        }
        if (this.f1657cO != null) {
            this.f1610bT = false;
        }
    }

    public C0456j(boolean z, C0458l c0458l) {
        super(z);
        this.f2869b = new C0432e(this);
        this.f2870c = 1.0f;
        this.f2875h = true;
        this.f2876i = true;
        this.f2877j = 1.0f;
        this.f2878k = false;
        this.f2883p = true;
        this.f2895B = new C1136m();
        this.f2896C = null;
        this.f2898E = null;
        this.f2899F = null;
        this.f2902dL = new C0505k(this);
        this.f2910dT = null;
        this.f2919eg = new C1136m();
        m3666a(c0458l, true, false);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo1764a(float f) {
        float f2;
        C0760e m2384c;
        float a;
        InterfaceC0303as mo5569c;
        float f3;
        float f4;
        float f5;
        C0760e m2392b;
        boolean z = this.f2876i;
        if (z) {
            this.f2876i = false;
            Object[] m540a = this.f2891x.f3227h.m540a();
            for (int i = this.f2891x.f3227h.f7109a - 1; i >= 0; i--) {
                ((AbstractC0389a) m540a[i]).mo3953a(this);
            }
            m3662b(EnumC0348af.created);
        }
        C0458l c0458l = this.f2891x;
        super.mo1764a(f);
        if (this.f1612bV && !this.f2879l) {
            if (this.f7174eq > 0.0f) {
                if (c0458l.f3173fi && !(this.f1622cf == 0.0f && this.f1619cc == 0.0f && this.f1620cd == 0.0f)) {
                    this.f2873f += 0.017f * f;
                    this.f7174eq -= this.f2873f * f;
                    PointF n = m2866n(f);
                    this.f7172eo += n.x;
                    this.f7173ep += n.y;
                    if (c0458l.f3171fg == EnumC0246ao.AIR) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        this.f1685dq += f;
                        this.f1683do += f;
                        if (c0458l.f3174fj && this.f1685dq > 9.0f) {
                            this.f1685dq = C0773f.m2167c(1.0f, 3.0f);
                            C0760e m2388b = gameEngine.f6329bR.m2388b(this.f7172eo, this.f7173ep, this.f7174eq, EnumC0759d.custom, false, EnumC0763h.low);
                            if (m2388b != null) {
                                m2388b.f4849aq = 0;
                                m2388b.f4848ap = 0;
                                m2388b.f4873ar = (short) 2;
                                m2388b.f4806r = true;
                                m2388b.f4814E = 0.5f;
                                m2388b.f4832W = 60.0f;
                                m2388b.f4831V = 60.0f;
                                m2388b.f4816G = 0.9f;
                                m2388b.f4815F = 1.2f;
                                m2388b.f4874as = false;
                                m2388b.f4825P = 0.0f;
                                m2388b.f4826Q = 0.0f;
                            }
                        }
                        if (this.f1683do > 7.0f) {
                            this.f1683do = 0.0f;
                            C0760e m2388b2 = gameEngine.f6329bR.m2388b(this.f7172eo, this.f7173ep, this.f7174eq, EnumC0759d.custom, false, EnumC0763h.verylow);
                            if (m2388b2 != null) {
                                C0761f.m2363b(m2388b2, true);
                                m2388b2.f4818I = this.f7172eo;
                                m2388b2.f4819J = this.f7173ep;
                                m2388b2.f4820K = this.f7174eq;
                                m2388b2.f4825P += C0773f.m2167c(-0.1f, 0.1f) + this.f1619cc;
                                m2388b2.f4826Q += C0773f.m2167c(-0.1f, 0.1f) + this.f1620cd;
                                m2388b2.f4818I += C0773f.m2167c(-4.0f, 4.0f);
                                m2388b2.f4819J += C0773f.m2167c(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f2873f += c0458l.f3289dW * f;
                    this.f7174eq -= this.f2873f * f;
                }
            } else if (!this.f2878k) {
                this.f2878k = true;
                if (c0458l.f3173fi) {
                    m3614ds();
                    m453S(0);
                    if (c0458l.f3248an != null) {
                        this.f3917M = c0458l.f3248an;
                        this.f2868a = 0;
                        this.f4264ew = true;
                    } else {
                        m4292ci();
                    }
                }
                if (this.f2873f > 0.5d) {
                    if (c0458l.f3017bw != null && c0458l.f3017bw.m3490a()) {
                        c0458l.f3017bw.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, null);
                    }
                    if (m4311cK()) {
                        if (c0458l.f3016bv) {
                            m3038a(EnumC0233ab.verysmall);
                        }
                        if (m4312cJ()) {
                            GameEngine.getGameEngine().f6329bR.m2406a(this.f7172eo, this.f7173ep, 0.0f, 0, 0.0f, 0.0f, this.f1623cg);
                        }
                    } else if (c0458l.f3016bv) {
                        m3038a(EnumC0233ab.small);
                    }
                }
                this.f2873f = 0.0f;
            } else if (m4311cK()) {
                if (this.f7174eq > -10.0f) {
                    this.f2873f += 8.0E-4f * f;
                    this.f7174eq -= this.f2873f * f;
                    if (m4312cJ()) {
                        this.f2887t += f;
                        if (this.f2887t > 30.0f) {
                            this.f2887t = 0.0f;
                            if (mo2853s_() && (m2392b = GameEngine.getGameEngine().f6329bR.m2392b(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg)) != null) {
                                m2392b.f4825P = 0.0f;
                                m2392b.f4826Q = -0.1f;
                            }
                        }
                    }
                } else {
                    this.f2879l = true;
                }
            } else {
                this.f7174eq = 0.0f;
                this.f2879l = true;
            }
        }
        if (this.f1612bV) {
            return;
        }
        GameEngine gameEngine2 = GameEngine.getGameEngine();
        if (c0458l.f3002bh != 0.0f && this.f1629cm < 1.0f) {
            float f6 = this.f1629cm + (c0458l.f3002bh * f);
            if (f6 >= 1.0f) {
                PlayerData.m4523b((AbstractC0244am) this);
                this.f1629cm = 1.0f;
                this.f1630cn = 1.0f;
                PlayerData.m4507c(this);
            } else {
                this.f1629cm = f6;
                this.f1630cn = f6;
            }
        }
        if (!m4326bT()) {
            if (this.f1629cm < 1.0f) {
                if (c0458l.f3098dw != null) {
                    this.f2869b.m3815a(c0458l.f3098dw, 8);
                    this.f2869b.m3817a(f);
                } else if (c0458l.f3099dx != null) {
                    this.f2869b.m3815a(c0458l.f3099dx, 99);
                    this.f2869b.f2746b = this.f1629cm;
                    this.f2869b.f2754d = 0.0f;
                    this.f2869b.m3817a(f);
                }
            }
            Object[] m540a2 = c0458l.f3227h.m540a();
            for (int i2 = c0458l.f3227h.f7109a - 1; i2 >= 0; i2--) {
                ((AbstractC0389a) m540a2[i2]).mo3952a(this, f);
            }
            boolean z2 = true;
            if ((this.f1629cm < 1.0f && !c0458l.f3044cd) || (this.f1656cN != null && !c0458l.f3043cc)) {
                z2 = false;
            }
            if (z2) {
                m3664b(f, z);
                C0458l c0458l2 = this.f2891x;
                return;
            }
            return;
        }
        Object[] m540a3 = c0458l.f3227h.m540a();
        for (int i3 = c0458l.f3227h.f7109a - 1; i3 >= 0; i3--) {
            ((AbstractC0389a) m540a3[i3]).mo3943b(this, f);
        }
        if (this.f2875h) {
            this.f2875h = false;
            m4345a(EnumC0348af.completeAndActive);
        }
        if (this.f2892y.f2269p != 0.0f && (this.f1637cu < this.f1638cv || this.f2892y.f2269p < 0.0f)) {
            this.f1637cu += this.f2892y.f2269p * f;
            if (this.f1637cu > this.f1638cv) {
                this.f1637cu = this.f1638cv;
            }
        }
        if (this.f2892y.f2257d != 0.0f) {
            if (!this.f2889v) {
                f5 = c0458l.f3072cP;
            } else {
                f5 = c0458l.f3073cQ;
            }
            if (this.f1644cB < this.f2892y.f2257d || f5 < 0.0f) {
                this.f1644cB += f5 * f;
            }
            if (this.f1644cB >= this.f2892y.f2257d) {
                this.f1644cB = this.f2892y.f2257d;
                this.f2889v = false;
            }
            if (this.f1644cB <= 0.0f) {
                if (c0458l.f3005bk) {
                    mo2914bv();
                    return;
                }
                this.f1644cB = 0.0f;
            }
        }
        if (this.f1643cA != 0.0f) {
            if (this.f2892y.f2261h != 0.0f) {
                this.f1640cx += this.f2892y.f2261h * f;
                if (this.f1640cx > this.f1643cA) {
                    this.f1640cx = this.f1643cA;
                }
            }
            if (this.f1640cx < 0.0f) {
                this.f1640cx = 0.0f;
            }
            if (this.f1641cy != 0.0f) {
                this.f1641cy -= (this.f1641cy * 0.02f) * f;
                this.f1641cy = C0773f.m2233a(this.f1641cy, 0.0f, c0458l.f3078cV * f);
                if (this.f1641cy > 50.0f) {
                    this.f1641cy = 50.0f;
                }
            }
        }
        this.f2902dL.m3389a(f);
        C0458l c0458l3 = this.f2891x;
        if (c0458l3.f3180fp) {
            C0524b.m3300a(f, this);
        }
        if (c0458l3.f3053cn) {
            this.f2882o += f;
            if (this.f2882o > c0458l3.f3054cr - 0.1f) {
                this.f2882o -= c0458l3.f3054cr;
                boolean read = c0458l3.f3056cx.read(this);
                if (this.f2883p != read) {
                    PlayerData.m4545a((AbstractC0244am) this);
                    this.f2883p = read;
                    PlayerData.m4507c(this);
                }
                if (this.f2883p) {
                    c0458l3.f3270co.m3834g(this);
                }
            }
        }
        if (c0458l3.f3273ct != null) {
            this.f2884q += f;
            if (this.f2884q >= c0458l3.f3274cu) {
                this.f2884q = 0.0f;
                c0458l3.f3273ct.writeToUnit(this);
            }
        }
        if (this.f1653cK) {
            this.f2869b.m3815a(c0458l3.f3283ds, 3);
        } else if (!this.f2869b.f2755e || this.f2869b.f2745a == c0458l3.f3284dt) {
            this.f2869b.m3815a(c0458l3.f3284dt, 2);
        }
        if (c0458l3.f3028bL) {
            if (c0458l3.f3026bJ && gameEngine2.f6473dd) {
                if (this.f1622cf > 0.0f || (this.f1622cf < 0.0f && c0458l3.f3027bK)) {
                    this.f2887t += f;
                }
                if (this.f2887t > 10.0f) {
                    this.f2887t = 0.0f;
                    if (this.f7169el && m4312cJ()) {
                        float f7 = this.f1623cg + 180.0f;
                        if (this.f1622cf < 0.0f) {
                            f7 += 180.0f;
                        }
                        float f8 = this.f1626cj - 6.0f;
                        if (f8 < 4.0f) {
                            f8 = 4.0f;
                        }
                        gameEngine2.f6329bR.m2392b(this.f7172eo + (C0773f.m2123k(f7) * f8), this.f7173ep + (C0773f.m2126j(f7) * f8), 0.0f, f7);
                    }
                }
            }
            if (gameEngine2.f6472dc && ((this.f1622cf > 0.0f || this.f1622cf < 0.0f) && this.f7169el)) {
                this.f2871d += f;
                if (this.f2871d > c0458l3.f3034bR) {
                    this.f2871d = 0.0f;
                    if (this.f1622cf > 0.0f) {
                        if (c0458l3.f3031bO != null) {
                            c0458l3.f3031bO.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, this);
                        }
                    } else if (c0458l3.f3032bP != null) {
                        float f9 = this.f1623cg;
                        if (c0458l3.f3033bQ) {
                            f9 += 180.0f;
                        }
                        c0458l3.f3032bP.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, f9, this);
                    }
                    if (c0458l3.f3029bM && ((this.f1622cf > 0.0f || c0458l3.f3030bN) && !m4312cJ())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f10 = i4 == 0 ? -20 : 20;
                            float f11 = this.f1623cg + 180.0f;
                            if (this.f1622cf < 0.0f) {
                                f10 += 180.0f;
                                f11 += 180.0f;
                            }
                            C0760e m2385c = gameEngine2.f6329bR.m2385c(this.f7172eo + (C0773f.m2123k(this.f1623cg + 180.0f + f10) * (this.f1626cj - 1.0f)), this.f7173ep + (C0773f.m2126j(this.f1623cg + 180.0f + f10) * (this.f1626cj - 1.0f)), this.f7174eq, f11 + C0773f.m2167c(-7.0f, 7.0f), 0);
                            if (m2385c != null) {
                                m2385c.f4825P += C0773f.m2167c(-0.15f, 0.15f);
                                m2385c.f4826Q += C0773f.m2167c(-0.15f, 0.15f);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (c0458l3.f3295eM > 0) {
            if (c0458l3.f3167eY != 0.0f && this.f2895B.f7109a > 0) {
                Object[] m540a4 = this.f2895B.m540a();
                for (int i5 = 0; i5 < this.f2895B.f7109a; i5++) {
                    AbstractC0244am abstractC0244am = (AbstractC0244am) m540a4[i5];
                    if (abstractC0244am.f1637cu < abstractC0244am.f1638cv || c0458l3.f3167eY < 0.0f) {
                        abstractC0244am.f1637cu += c0458l3.f3167eY * f;
                        if (abstractC0244am.f1637cu > abstractC0244am.f1638cv) {
                            abstractC0244am.f1637cu = abstractC0244am.f1638cv;
                        }
                    }
                }
            }
            if (this.f2881n && c0458l3.f3168fc.read(this)) {
                this.f2880m = C0773f.m2234a(this.f2880m, f);
                if (this.f2880m == 0.0f) {
                    this.f2880m = c0458l3.f3157eN;
                    if (this.f2895B.size() == 0) {
                        this.f2881n = false;
                    } else {
                        m3606g(false);
                        if (this.f2895B.size() == 0) {
                            this.f2881n = false;
                        }
                    }
                }
            }
        }
        if (this.f1653cK) {
            this.f2886s = 0.0f;
        } else {
            this.f2886s += f;
        }
        if (c0458l3.f3171fg != EnumC0246ao.AIR && this.f1657cO == null) {
            m3629dF();
        }
        if ((c0458l3.f3171fg == EnumC0246ao.OVER_CLIFF || c0458l3.f3171fg == EnumC0246ao.OVER_CLIFF_WATER) && this.f1653cK) {
            if (m4313cI()) {
                this.f2877j = 0.7f;
            } else {
                this.f2877j = 1.0f;
            }
        }
        if (c0458l3.f3171fg == EnumC0246ao.AIR) {
            this.f2872e += 2.0f * f;
            if (this.f2872e > 360.0f) {
                this.f2872e -= 360.0f;
            }
            boolean mo3092i = mo3092i();
            boolean z3 = false;
            if (c0458l3.f3118dQ) {
                boolean cK = m4311cK();
                if (!this.f1653cK && !cK && this.f2886s > 3.0f && (!c0458l3.f3119dR || m2968aq())) {
                    z3 = true;
                }
            }
            if (this.f1657cO == null) {
                if (z3) {
                    if (c0458l3.f3287dU < 0.0f) {
                        f4 = (C0773f.m2168c(this.f7174eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = c0458l3.f3287dU;
                    }
                    this.f7174eq = C0773f.m2233a(this.f7174eq, 2.0f, f4 * f);
                } else {
                    float m2126j = this.f2892y.f2270q + (C0773f.m2126j(this.f2872e) * c0458l3.f3120dT);
                    if (c0458l3.f3287dU < 0.0f) {
                        f3 = (C0773f.m2168c(this.f7174eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f3 = c0458l3.f3287dU;
                    }
                    this.f7174eq = C0773f.m2233a(this.f7174eq, m2126j, C0773f.m2188b(f3, (C0773f.m2168c(this.f7174eq - m2126j) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (mo3092i != mo3092i()) {
                    this.f3976ay = true;
                    m3629dF();
                }
            }
        } else {
            float f12 = this.f2892y.f2270q - c0458l3.f3120dT;
            if (this.f7174eq < f12) {
                this.f7174eq += 0.2f * f;
                if (this.f7174eq >= f12) {
                    this.f7174eq = f12;
                }
            }
            if ((this.f2892y.f2270q != 0.0f || c0458l3.f3120dT != 0.0f || this.f7174eq > 0.0f) && this.f1657cO == null) {
                float f13 = this.f2892y.f2270q;
                if (c0458l3.f3120dT != 0.0f) {
                    this.f2872e += 2.0f * f;
                    if (this.f2872e > 360.0f) {
                        this.f2872e -= 360.0f;
                    }
                    f13 += C0773f.m2126j(this.f2872e) * c0458l3.f3120dT;
                }
                if (c0458l3.f3287dU < 0.0f) {
                    f2 = (C0773f.m2168c(this.f7174eq - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f2 = c0458l3.f3287dU;
                }
                this.f7174eq = C0773f.m2233a(this.f7174eq, f13, C0773f.m2188b(f2, (C0773f.m2168c(this.f7174eq - f13) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z4 = false;
                if (this.f7174eq > this.f2892y.f2270q + c0458l3.f3120dT + 1.0f) {
                    this.f2873f += c0458l3.f3288dV * f;
                    if (this.f7174eq < 0.0f) {
                        this.f2873f = C0773f.m2188b(this.f2873f, 0.2f);
                    }
                    this.f7174eq -= this.f2873f * f;
                    if (this.f2873f > 1.5d) {
                        this.f1685dq += f;
                        if (this.f1685dq > 0.5d) {
                            this.f1685dq = 0.0f;
                            C0760e m2388b3 = gameEngine2.f6329bR.m2388b(this.f7172eo + C0773f.m2167c(-this.f1626cj, this.f1626cj), this.f7173ep + C0773f.m2167c(-this.f1626cj, this.f1626cj), this.f7174eq, EnumC0759d.custom, false, EnumC0763h.high);
                            if (m2388b3 != null) {
                                m2388b3.f4849aq = 0;
                                m2388b3.f4848ap = 0;
                                m2388b3.f4873ar = (short) 2;
                                m2388b3.f4806r = true;
                                m2388b3.f4807s = true;
                                m2388b3.f4808t = 40.0f;
                                m2388b3.f4871an = true;
                                m2388b3.f4825P = 0.1f;
                                m2388b3.f4827R = 0.0f;
                                m2388b3.f4809u = true;
                                m2388b3.f4814E = 0.4f;
                                m2388b3.f4832W = 380.0f;
                                m2388b3.f4831V = m2388b3.f4832W;
                                m2388b3.f4816G = 0.8f;
                                m2388b3.f4815F = 1.7f;
                                m2388b3.f4874as = false;
                                m2388b3.f4825P += C0773f.m2167c(-0.04f, 0.04f);
                                m2388b3.f4826Q += C0773f.m2167c(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.f7174eq <= this.f2892y.f2270q + c0458l3.f3120dT + 1.0f) {
                        if (this.f2873f > 2.0f) {
                            z4 = true;
                        }
                        if (this.f7174eq < this.f2892y.f2270q + c0458l3.f3120dT) {
                            this.f7174eq = this.f2892y.f2270q + c0458l3.f3120dT;
                        }
                        this.f2873f = 0.0f;
                    }
                } else {
                    if (this.f2873f > 2.0f) {
                        z4 = true;
                    }
                    this.f2873f = 0.0f;
                }
                if (z4 && (m2384c = gameEngine2.f6329bR.m2384c(this.f7172eo, this.f7173ep, this.f7174eq, 0)) != null) {
                    m2384c.f4816G = 0.8f;
                    m2384c.f4815F = 1.4f;
                    m2384c.f4831V = 60.0f;
                    m2384c.f4832W = m2384c.f4831V;
                }
            }
        }
        boolean z5 = false;
        boolean z6 = false;
        if (c0458l3.f3001bg) {
            z6 = true;
        }
        if (this.f2893z != null && this.f2893z.f3001bg) {
            z6 = true;
        }
        if (z6) {
            AbstractC0224s m3366d = this.f2902dL.m3366d();
            boolean z7 = false;
            if (m3366d != null) {
                if (m3366d instanceof C0342g) {
                    C0342g c0342g = (C0342g) m3366d;
                    C0339d c0339d = c0342g.f2162a;
                    boolean z8 = false;
                    z7 = c0342g.m4096L();
                    if (c0339d.f2068l != null && (mo5569c = c0339d.f2068l.mo5569c()) != null && (mo5569c instanceof C0458l)) {
                        z5 = true;
                        if (mo5569c != c0458l3) {
                            if (this.f2893z != null) {
                                PlayerData.m4523b((AbstractC0244am) this);
                                m3665a(this.f2893z, false, false, this.f2894A);
                                this.f2893z = null;
                                this.f2894A = null;
                                c0458l3 = this.f2891x;
                                PlayerData.m4507c(this);
                            }
                            PlayerData.m4523b((AbstractC0244am) this);
                            this.f2893z = c0458l3;
                            this.f2894A = c0339d.f2069m;
                            m3665a((C0458l) mo5569c, false, false, c0339d.f2069m);
                            c0458l3 = this.f2891x;
                            PlayerData.m4507c(this);
                        }
                    }
                    if (c0339d.f2095W != null) {
                        float floatValue = c0339d.f2095W.floatValue();
                        if (c0339d.f2098Z) {
                            float f14 = this.f7172eo;
                            float f15 = this.f7173ep;
                            C0504j m3372b = this.f2902dL.m3372b();
                            if (m3372b != null) {
                                float f16 = Float.MIN_VALUE;
                                float f17 = Float.MIN_VALUE;
                                if (m3372b.f3522i != null) {
                                    f16 = m3372b.f3522i.f7172eo;
                                    f17 = m3372b.f3522i.f7173ep;
                                } else if (m3372b.f3521h != null) {
                                    f16 = m3372b.f3521h.x;
                                    f17 = m3372b.f3521h.y;
                                }
                                if (f16 > Float.MIN_VALUE) {
                                    floatValue += C0773f.m2154d(f14, f15, f16, f17);
                                }
                            }
                        }
                        if (c0339d.f2099aa == null) {
                            a = m3053a(f, floatValue, true, c0339d.f2096X);
                        } else {
                            int i6 = c0339d.f2099aa.f2571e;
                            a = m3056a(f, floatValue, i6);
                            C0247ap c0247ap = this.f1654cL[i6];
                            c0247ap.m4241b(5);
                            c0247ap.f1718b = c0247ap.f1717a;
                        }
                        if (c0339d.f2097Y && C0773f.m2168c(a) > 5.0f) {
                            z8 = true;
                        }
                    }
                    if (c0339d.f2094V != null && !z8) {
                        this.f2869b.m3815a(c0339d.f2094V.m3503b(), 10);
                    }
                    if (z8) {
                        this.f2902dL.f3534e = 0.0f;
                    }
                }
                if (c0458l3.f3100dy != null && m3366d.mo5567i() != null && this.f2902dL.f3534e >= c0458l3.f3100dy.f2846q) {
                    this.f2869b.m3815a(c0458l3.f3100dy, 5);
                }
            }
            this.f2874g = z7;
            if (this.f2874g) {
                this.f1619cc = 0.0f;
                this.f1620cd = 0.0f;
                this.f1622cf = 0.0f;
            }
        }
        if (this.f2893z != null && !z5) {
            PlayerData.m4523b((AbstractC0244am) this);
            m3665a(this.f2893z, false, false, this.f2894A);
            this.f2893z = null;
            this.f2894A = null;
            C0458l c0458l4 = this.f2891x;
            PlayerData.m4507c(this);
        }
        this.f2869b.m3817a(f);
        m3664b(f, z);
        C0458l c0458l5 = this.f2891x;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cy */
    public float mo3399cy() {
        int i = this.f2891x.f3270co.f2723b;
        if (!this.f2883p) {
            return 0.0f;
        }
        return i * this.f2891x.f3055cs;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cz */
    public C0444f mo4283cz() {
        if (!this.f2883p) {
            return C0444f.f2829a;
        }
        return this.f2891x.f3271cp;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cA */
    public C0444f mo4320cA() {
        if (!this.f2883p) {
            return C0444f.f2829a;
        }
        return this.f2891x.f3272cq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3041a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        return m3669a(this.f2891x.f3301fQ[i], i, abstractC0244am, z, z2);
    }

    /* renamed from: a */
    public final boolean m3670a(C0416bn c0416bn, int i, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float m2232a = C0773f.m2232a(this.f7172eo, this.f7173ep, f, f2);
        if (m2232a > c0416bn.f2604ae) {
            if (this.f1614bX == gameEngine.f6312bs) {
                gameEngine.f6330bS.m1854b("Location too far");
                return false;
            }
            return false;
        } else if (m2232a < c0416bn.f2644ah) {
            if (this.f1614bX == gameEngine.f6312bs) {
                gameEngine.f6330bS.m1854b("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m3669a(C0416bn c0416bn, int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        float f;
        if (!z && (c0416bn.f2589I || z2)) {
            float m2232a = C0773f.m2232a(this.f7172eo, this.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            if (m2232a > c0416bn.f2604ae || m2232a < c0416bn.f2644ah) {
                return false;
            }
        }
        if (!c0416bn.f2588H) {
            return true;
        }
        if (c0416bn.f2645ai != -1.0f) {
            if (c0416bn.f2633w != -1) {
                f = this.f1654cL[c0416bn.f2633w].f1717a + c0416bn.f2575j;
            } else {
                f = this.f1623cg + c0416bn.f2575j;
            }
            if (C0773f.m2168c(C0773f.m2166c(f, C0773f.m2154d(this.f7172eo, this.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep), 360.0f)) > c0416bn.f2645ai) {
                return false;
            }
        }
        if (c0416bn.f2594N != null && !c0416bn.f2594N.read(this)) {
            return false;
        }
        if (c0416bn.f2595O != null && !C0453g.m3708a(c0416bn.f2595O, abstractC0244am.mo4278de())) {
            return false;
        }
        if (c0416bn.f2596P != null && C0453g.m3708a(c0416bn.f2596P, abstractC0244am.mo4278de())) {
            return false;
        }
        if (abstractC0244am.mo3092i()) {
            if (c0416bn.f2590J != null) {
                return c0416bn.f2590J.read(this);
            }
            return true;
        } else if (abstractC0244am.mo3098Q()) {
            if (c0416bn.f2592L != null) {
                return c0416bn.f2592L.read(this);
            }
            return true;
        } else if (c0416bn.f2593M != null && !c0416bn.f2593M.read(this) && !abstractC0244am.m4314cH()) {
            return false;
        } else {
            if (c0416bn.f2591K != null) {
                return c0416bn.f2591K.read(this);
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3032a(AbstractC0244am abstractC0244am, int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (!c0416bn.f2635B || !m3669a(c0416bn, i, abstractC0244am, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.f2891x.f3301fQ.length; i2++) {
            C0416bn c0416bn2 = this.f2891x.f3301fQ[i2];
            if (c0416bn2 != null && i2 != i && c0416bn2.f2608ao != null && c0416bn2.f2608ao == c0416bn && this.f1654cL[i2].f1721e < 9000.0f - ((mo2954b(i) * 0.5f) - c0416bn2.f2626n)) {
                this.f1654cL[i2].f1721e = 0.0f;
            }
        }
        if (c0416bn.f2633w != -1) {
            C0416bn c0416bn3 = this.f2891x.f3301fQ[c0416bn.f2633w];
            if (!c0416bn3.f2635B && c0416bn3.f2628p != 0.0f) {
                this.f1654cL[c0416bn.f2633w].f1721e = mo2954b(c0416bn.f2633w) + mo2852t(c0416bn.f2633w);
            }
        }
        this.f2869b.m3814a(this.f2891x.f3285du, 11, true);
        m3661b(c0416bn);
        m3676a(abstractC0244am, -1.0f, -1.0f, i, (C0410bh) null, 0);
    }

    /* renamed from: a */
    public boolean m3671a(C0416bn c0416bn) {
        if (c0416bn.f2632u > 0.0f && (c0416bn.f2632u > this.f1644cB || this.f2889v)) {
            return false;
        }
        if (c0416bn.f2579v != null && !c0416bn.f2579v.mo3824b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m3661b(C0416bn c0416bn) {
        if (c0416bn.f2632u > 0.0f) {
            this.f1644cB -= c0416bn.f2632u;
            if (this.f1644cB < c0416bn.f2632u && this.f2891x.f3074cR) {
                this.f2889v = true;
            }
        }
        if (c0416bn.f2579v != null) {
            c0416bn.f2579v.mo3830a(this);
        }
    }

    /* renamed from: a */
    public static C0188f m3675a(AbstractC0244am abstractC0244am, int i, C0410bh c0410bh, float f, float f2, float f3, float f4) {
        C0188f m4629a = C0188f.m4629a(abstractC0244am, f, f2, f3, i);
        m3680a(m4629a, abstractC0244am, i, c0410bh, f, f2, f3, f4);
        return m4629a;
    }

    /* renamed from: a */
    public static void m3680a(C0188f c0188f, AbstractC0244am abstractC0244am, int i, C0410bh c0410bh, float f, float f2, float f3, float f4) {
        C0760e m2399a;
        GameEngine gameEngine = GameEngine.getGameEngine();
        c0188f.f1052az = f4;
        c0188f.f1073aT = f4;
        if (abstractC0244am == null) {
            throw new RuntimeException("Source cannot be null");
        }
        c0188f.f982g = c0410bh;
        c0188f.f1008G = c0410bh.f1138aI;
        c0188f.f1070aR = c0410bh.f1202aJ;
        c0188f.f1022U = c0410bh.f1101b;
        c0188f.f1026Y = c0410bh.f1102c;
        if (!c0410bh.f1142aN && (abstractC0244am instanceof C0456j)) {
            C0456j c0456j = (C0456j) abstractC0244am;
            c0188f.f1022U *= c0456j.f2892y.f2259f;
            c0188f.f1026Y *= c0456j.f2892y.f2259f;
        }
        c0188f.f1027Z = c0410bh.f1154i;
        if (c0410bh.f1157l) {
            c0188f.f1028aa = false;
            c0188f.f1029ab = true;
        } else {
            c0188f.f1028aa = !c0410bh.f1156k;
        }
        c0188f.f1030ac = c0410bh.f1159n;
        if (c0410bh.f1158m) {
            c0188f.f1031ad = true;
            c0188f.f1032ae = false;
        }
        c0188f.f1005D = c0410bh.f1161p;
        c0188f.f1078aY = c0410bh.f1162q;
        c0188f.f1079aZ = c0410bh.f1163r;
        if (c0410bh.f1160o < 0.5d) {
            c0188f.f1004C = true;
        } else {
            c0188f.f1009H = c0410bh.f1160o;
        }
        c0188f.f983h = c0410bh.f1109v;
        c0188f.f984i = c0410bh.f1108u;
        c0188f.f995t = c0410bh.f1166w;
        if (c0410bh.f1141aM != 0.0f) {
            c0188f.f995t += C0773f.m2211a((AbstractC1155w) abstractC0244am, (int) ((-c0410bh.f1141aM) * 100.0f), (int) (c0410bh.f1141aM * 100.0f), 1) / 100.0f;
        }
        if (c0410bh.f1122T && i != -1) {
            c0188f.f1047au = abstractC0244am;
            if (abstractC0244am instanceof AbstractC0629y) {
                c0188f.f1048av = i;
                C1115ai mo3082D = ((AbstractC0629y) abstractC0244am).mo3082D(i);
                c0188f.f1049aw = mo3082D.f7064a;
                c0188f.f1050ax = mo3082D.f7065b;
                c0188f.f1051ay = abstractC0244am.f7174eq + mo3082D.f7066c;
            } else {
                c0188f.f1049aw = abstractC0244am.f7172eo;
                c0188f.f1050ax = abstractC0244am.f7173ep;
                c0188f.f1051ay = abstractC0244am.f7174eq;
            }
        }
        c0188f.f998w = c0410bh.f1114D;
        c0188f.f996u = c0410bh.f1115E;
        c0188f.f997v = c0410bh.f1116F;
        c0188f.f1033af = c0410bh.f1143aO;
        c0188f.f1034ag = c0410bh.f1144aP;
        c0188f.f1035ah = c0410bh.f1145aQ;
        c0188f.f1036ai = c0410bh.f1203aR;
        c0188f.f1038ak = c0410bh.f1204aS;
        c0188f.f1039al = c0410bh.f1205aT;
        c0188f.f1040am = c0410bh.f1206aU;
        c0188f.f1041an = c0410bh.f1146aV;
        if (c0410bh.f1207aW > 0.0f) {
            c0188f.f1042ao = true;
            c0188f.f1024W = c0410bh.f1207aW;
            c0188f.f1025X = c0188f.f1024W;
        }
        c0188f.f1044ar = c0410bh.f1198aE;
        if (c0410bh.f1200aG != 0.0f) {
            float f5 = c0410bh.f1201aH;
            int m5354a = Color.m5354a(c0188f.f1044ar);
            int m5350b = (int) (Color.m5350b(c0188f.f1044ar) * f5);
            int m5349c = (int) (Color.m5349c(c0188f.f1044ar) * f5);
            int m5348d = (int) (Color.m5348d(c0188f.f1044ar) * f5);
            int m4567K = abstractC0244am.f1614bX.m4567K();
            c0188f.f1044ar = Color.m5352a(m5354a, C0773f.m2182b((int) (m5350b + (Color.m5350b(m4567K) * c0410bh.f1200aG)), 0, 255), C0773f.m2182b((int) (m5349c + (Color.m5349c(m4567K) * c0410bh.f1200aG)), 0, 255), C0773f.m2182b((int) (m5348d + (Color.m5348d(m4567K) * c0410bh.f1200aG)), 0, 255));
        }
        c0188f.f1017P = c0410bh.f1167x;
        c0188f.f1019R = c0410bh.f1110y;
        c0188f.f1020S = !c0410bh.f1111A;
        c0188f.f1018Q = c0410bh.f1168z;
        if (c0410bh.f1112B != null) {
            c0188f.f1017P = (short) 0;
            c0188f.f1019R = (short) 0;
        }
        c0188f.f999x = c0410bh.f1199aF;
        c0188f.f988m = c0410bh.f1164s;
        c0188f.f1002A = c0410bh.f1169I;
        c0188f.f1014M = c0410bh.f1178V;
        c0188f.f1003B = c0410bh.f1179W;
        c0188f.f1060aH = c0410bh.f1181ae;
        c0188f.f1059aG = c0410bh.f1192aw;
        c0188f.f1065aM = c0410bh.f1182af;
        if (c0410bh.f1130ai != null) {
            c0410bh.f1130ai.m3489a(c0188f.f7172eo, c0188f.f7173ep, c0188f.f7174eq, c0188f.f1052az, c0188f);
        }
        if (c0410bh.f1185ao != -1) {
            boolean z = false;
            C0760e c0760e = c0188f.f1068aP;
            if (c0760e != null && c0760e.f4800b == c0188f && c0760e.f4802d && c0760e != null) {
                if (c0760e.f4831V < 150.0f) {
                    c0760e.f4831V = 200.0f;
                }
                z = true;
            }
            if (!z && (m2399a = gameEngine.f6329bR.m2399a(c0188f, c0410bh.f1185ao, c0410bh.f1186ap)) != null) {
                if (c0410bh.f1135aq) {
                    m2399a.f4801c = true;
                }
                if (c0410bh.f1172L) {
                    c0188f.f1068aP = m2399a;
                }
            }
        }
        c0188f.f1069aQ = c0410bh.f1187ar;
        if (c0410bh.f1188as != -1.0f) {
            c0188f.f1061aI = c0410bh.f1188as;
        }
        if (c0410bh.f1189at != -1.0f) {
            c0188f.f1062aJ = c0410bh.f1189at;
        }
        c0188f.f1064aL = -1.0f;
        if (c0410bh.f1190au != -1.0f) {
            c0188f.f993r = c0410bh.f1190au;
        }
        c0188f.f994s = c0410bh.f1191av;
        if (c0410bh.f1149aZ != null) {
        }
        c0188f.f1057aE = c0410bh.f1153bd;
        c0188f.f7170em = abstractC0244am.f7170em;
        if (c0188f.f7170em < 4 && f3 >= -1.0f) {
            c0188f.f7170em = 4;
        }
        if (c0410bh.f1177U) {
            c0188f.f7170em = 1;
        }
    }

    /* renamed from: a */
    public C0188f m3676a(AbstractC0244am abstractC0244am, float f, float f2, int i, C0410bh c0410bh, int i2) {
        C0410bh c0410bh2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2614aA != null) {
            this.f2869b.m3814a(c0416bn.f2614aA.m3503b(), 6, true);
        }
        if (c0416bn.f2615aB > 0.0f) {
            m2958b(c0416bn.f2615aB);
        }
        if (c0416bn.f2616aC != null) {
            c0416bn.f2616aC.m3498a(this, new PointF(f, f2), abstractC0244am, i2 + 1, 0);
        }
        if (c0410bh == null) {
            c0410bh2 = this.f2891x.f3205fR[c0416bn.m3905a(this)];
        } else {
            c0410bh2 = c0410bh;
        }
        PointF mo3070K = mo3070K(i);
        C1115ai mo3082D = mo3082D(i);
        if (c0416bn.f2622aI > 0) {
            for (int i3 = 0; i3 < c0416bn.f2622aI; i3++) {
                if (this.f2895B != null && this.f2895B.size() > 0) {
                    AbstractC0244am abstractC0244am2 = (AbstractC0244am) this.f2895B.remove(this.f2895B.size() - 1);
                    C0247ap c0247ap = this.f1654cL[i];
                    C1152y.m470a(abstractC0244am2, this);
                    abstractC0244am2.f7172eo = mo3082D.f7064a;
                    abstractC0244am2.f7173ep = mo3082D.f7065b;
                    abstractC0244am2.f1623cg = c0247ap.f1717a;
                    if (abstractC0244am2 instanceof AbstractC0629y) {
                        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
                        abstractC0629y.m2959az();
                        if (abstractC0244am != null) {
                            abstractC0629y.m2864n(abstractC0244am);
                        } else {
                            abstractC0629y.m2898e(f, f2);
                        }
                    }
                }
            }
        }
        C0188f c0188f = null;
        if (c0410bh2.f1172L && c0410bh == null) {
            if (this.f2900G == null) {
                this.f2900G = new C0188f[31];
            }
            if (this.f2900G[i] != null && !this.f2900G[i].f7167ej) {
                c0188f = this.f2900G[i];
                c0188f.m4630a(this, mo3082D.f7064a, mo3082D.f7065b, this.f7174eq + mo3082D.f7066c);
                if (!c0410bh2.f1174N && c0188f.f1043ap != null) {
                    c0188f.f1043ap.clear();
                }
            }
        }
        this.f1592bC = (int) (this.f1592bC + 1 + this.f7166eh);
        float f3 = this.f1654cL[i].f1717a;
        boolean z = false;
        if (c0188f == null) {
            c0188f = C0188f.m4629a(this, mo3082D.f7064a, mo3082D.f7065b, this.f7174eq + mo3082D.f7066c, i);
            if (c0410bh2.f1172L && c0410bh == null) {
                this.f2900G[i] = c0188f;
            }
        } else {
            c0188f.f982g = c0410bh2;
            z = true;
        }
        m3680a(c0188f, this, i, c0410bh2, mo3082D.f7064a, mo3082D.f7065b, this.f7174eq + mo3082D.f7066c, f3);
        c0410bh2.m3923a(this, c0188f, abstractC0244am, f, f2, mo2870m());
        if (!z && c0410bh2.f1120R == 0.0f && c0410bh2.f1121S == 0.0f) {
            c0188f.f1012K = mo3070K.x;
            c0188f.f1013L = mo3070K.y;
        }
        if (c0416bn.f2587G != null) {
            gameEngine.f6329bR.m2408a(mo3082D.f7064a, mo3082D.f7065b, this.f7174eq + mo3082D.f7066c, c0416bn.f2587G.intValue());
        }
        if (c0416bn.f2585E != null) {
            c0416bn.f2585E.m3489a(mo3082D.f7064a, mo3082D.f7065b, this.f7174eq + mo3082D.f7066c, this.f1654cL[i].f1717a, this);
        }
        if (c0416bn.f2584D != null) {
            c0416bn.f2584D.m3911a(mo3082D.f7064a, mo3082D.f7065b, 1.0f + C0773f.m2167c(-0.07f, 0.07f));
        }
        if (this.f2891x.f3130eg) {
            this.f3928R = null;
        }
        if (c0416bn.f2612ay) {
            this.f1654cL[i].f1726j = null;
        }
        if (this.f2891x.f3004bj && !this.f1612bV) {
            mo2914bv();
        }
        if (this.f2891x.f3006bl && !this.f1612bV) {
            mo2749a();
            this.f1612bV = true;
        }
        return c0188f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2870m() {
        return this.f2892y.f2262i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: y */
    public int mo3162y() {
        if (this.f2892y.f2268o != -1) {
            return this.f2892y.f2268o;
        }
        return super.mo3162y();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public int mo3164u(AbstractC0244am abstractC0244am) {
        int mo4211a = abstractC0244am.mo5568r().mo4211a(this);
        if (this.f2891x.f3260aX != -1) {
            if (this.f2891x.f2995aY) {
                int i = (int) (this.f2891x.f3260aX + this.f1626cj);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1626cj);
                }
                return i + mo4211a;
            }
            return this.f2891x.f3260aX + mo4211a;
        }
        return mo3162y() + mo4211a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: v */
    public int mo3163v(AbstractC0244am abstractC0244am) {
        int mo4211a = abstractC0244am.mo5568r().mo4211a(this);
        if (this.f2891x.f3261aZ != -1) {
            if (this.f2891x.f2996ba) {
                int i = (int) (this.f2891x.f3261aZ + this.f1626cj);
                if (abstractC0244am != null) {
                    i = (int) (i + abstractC0244am.f1626cj);
                }
                return i + mo4211a;
            }
            return this.f2891x.f3261aZ + mo4211a;
        }
        return mo3162y() + mo4211a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: w */
    public boolean mo4251w(AbstractC0244am abstractC0244am) {
        return this.f2891x.f2996ba;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: x */
    public boolean mo4249x(AbstractC0244am abstractC0244am) {
        return this.f2891x.f2995aY;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cx */
    public float mo4284cx() {
        return this.f2892y.f2271r;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public float mo3187c(AbstractC0244am abstractC0244am) {
        return this.f2891x.f2997bb;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: z */
    public float mo4247z(AbstractC0244am abstractC0244am) {
        float f = this.f2891x.f2998bc;
        if (abstractC0244am.mo3308g() > 0.0f) {
            f = abstractC0244am.mo3308g() * this.f2891x.f3262bd;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: f */
    public float mo2893f(AbstractC0244am abstractC0244am) {
        return this.f2891x.f2999be;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public float mo3188b(AbstractC0244am abstractC0244am) {
        return this.f2891x.f3000bf;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2846z() {
        return this.f2892y.f2263j * this.f2877j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aZ */
    public float mo2986aZ() {
        return this.f2891x.f3133ej;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ba */
    public float mo2935ba() {
        return this.f2891x.f3134ek;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3089A() {
        return this.f2892y.f2264k;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2907c(int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2598U != null) {
            return c0416bn.f2598U.floatValue();
        }
        return this.f2891x.f3125eb;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: x */
    public float mo2848x(int i) {
        return this.f2891x.f3301fQ[i].f2636Q;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2849w(int i) {
        return this.f2891x.f3301fQ[i].f2639V;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: y */
    public float mo2847y(int i) {
        return this.f2891x.f3301fQ[i].f2640W;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3087B() {
        return this.f2891x.f3136eo;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cD */
    public float mo4317cD() {
        return this.f2891x.f3265bH * this.f2870c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: p */
    public float mo2861p(int i) {
        return this.f2891x.f3266bI;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public float mo3283d(boolean z) {
        if (!this.f2891x.f3103dB) {
            return 0.0f;
        }
        if (z && this.f2891x.f3105dD) {
            return this.f1654cL[this.f2891x.f3108dG].f1717a + 90.0f;
        }
        if (this.f2891x.f3104dC) {
            return this.f1654cL[this.f2891x.f3108dG].f1717a + 90.0f;
        }
        return super.mo3283d(z);
    }

    static {
        for (int i = 0; i < 10; i++) {
            f2927dX.add(new C0457k());
        }
        f2911dY = true;
        f2912dZ = new HashMap();
        f2913ea = 0;
        f2914eb = VariableScope.nullOrMissingString;
        f2915ec = new PointF();
        f2917ee = new C1115ai();
        f2918ef = new PointF();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cY */
    public PointF mo4298cY() {
        PointF pointF = f2920H;
        C0458l c0458l = this.f2891x;
        if (c0458l.f3104dC && this.f1654cL[c0458l.f3108dG].f1721e != 0.0f && c0458l.f3107dF.f2628p != 0.0f) {
            pointF.setSite(mo3076G(c0458l.f3108dG));
            pointF.moveAdd(-this.f7172eo, -this.f7173ep);
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        return pointF;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aP */
    public PointF mo2996aP() {
        C0458l c0458l = this.f2891x;
        PointF mo4298cY = mo4298cY();
        f2921I.x = mo4298cY.x + c0458l.f3067cJ;
        f2921I.y = mo4298cY.y + c0458l.f3068cK;
        return f2921I;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo2361c(float f) {
        C0970e mo3064T;
        float f2;
        float f3;
        C0458l c0458l = this.f2891x;
        boolean z = this.f1612bV;
        if (this.f2910dT != null && !z) {
            C0396h.m3961a(this, f, false, false);
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceC1063y interfaceC1063y = gameEngine.f6326bO;
        Paint mo2998aN = mo2998aN();
        float mo4317cD = mo4317cD();
        PointF mo4298cY = mo4298cY();
        mo2995aQ();
        int i = c0458l.f3228i.f7109a;
        if (i > 0) {
            Object[] m540a = c0458l.f3228i.m540a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0389a) m540a[i2]).mo3967d(this, f);
            }
        }
        if (this.f4264ew) {
            float f4 = (this.f7172eo + mo4298cY.x) - gameEngine.f6357cw;
            float f5 = ((this.f7173ep + mo4298cY.y) - gameEngine.f6358cx) - this.f7174eq;
            if (mo4317cD != 1.0f) {
                interfaceC1063y.mo142k();
                interfaceC1063y.mo231a(mo4317cD, mo4317cD, f4, f5);
            }
            interfaceC1063y.mo205a(this.f3917M, f4, f5, mo3283d(false) - 90.0f, mo2998aN);
            if (mo4317cD != 1.0f) {
                interfaceC1063y.mo141l();
            }
        } else {
            RectF mo3413cF = mo3413cF();
            float f6 = mo4298cY.x;
            float f7 = mo4298cY.y - this.f7174eq;
            mo3413cF.f234a += f6;
            mo3413cF.f235b += f7;
            mo3413cF.f236c += f6;
            mo3413cF.f237d += f7;
            Rect mo3251a_ = mo3251a_(false);
            float f8 = (mo3413cF.f234a + mo3413cF.f236c) * 0.5f;
            float f9 = (mo3413cF.f235b + mo3413cF.f237d) * 0.5f;
            interfaceC1063y.mo142k();
            if (mo4317cD != 1.0f) {
                interfaceC1063y.mo231a(mo4317cD, mo4317cD, f8, f9);
            }
            interfaceC1063y.mo232a(mo3283d(false), f8, f9);
            interfaceC1063y.mo198a(this.f3917M, mo3251a_, mo3413cF, mo2998aN);
            interfaceC1063y.mo141l();
        }
        if (i > 0) {
            Object[] m540a2 = c0458l.f3228i.m540a();
            for (int i3 = i - 1; i3 >= 0; i3--) {
                ((AbstractC0389a) m540a2[i3]).mo3966e(this, f);
            }
        }
        C1152y.m468a((AbstractC0629y) this);
        if (this.f2910dT != null && !z && c0458l.f3256ay) {
            C0396h.m3961a(this, f, true, false);
        }
        if (mo2974ak() && c0458l.f3305fV != null && !z) {
            float mo2896e = this.f1654cL[c0458l.f3305fV.f2571e].f1722f / mo2896e(c0458l.f3305fV.f2571e);
            if (mo2896e != 0.0f) {
                boolean z2 = true;
                boolean Y = m3059Y();
                if (Y && c0458l.f3039bW) {
                    z2 = false;
                } else if (!Y && c0458l.f3035bS) {
                    z2 = false;
                }
                if (z2 && c0458l.f3301fQ[c0458l.f3305fV.f2571e].f2619aF == null) {
                    C1115ai bn = m2922bn();
                    gameEngine.f6326bO.mo142k();
                    gameEngine.f6326bO.mo174b(bn.f7064a - gameEngine.f6357cw, ((bn.f7065b - bn.f7066c) - gameEngine.f6358cx) - this.f7174eq);
                    gameEngine.f6326bO.mo233a(mo2896e, mo2896e);
                    if (Y) {
                        gameEngine.f6326bO.mo204a(C0524b.f3622f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        gameEngine.f6326bO.mo204a(C0524b.f3621e, 0.0f, 0.0f, (Paint) null);
                    }
                    gameEngine.f6326bO.mo141l();
                }
            }
        }
        if (c0458l.f3204fP && !z) {
            int mo2924bl = mo2924bl();
            for (int i4 = 0; i4 < mo2924bl; i4++) {
                float mo2896e2 = this.f1654cL[i4].f1722f / mo2896e(i4);
                C0416bn c0416bn = c0458l.f3301fQ[i4];
                if (c0416bn != null && mo2896e2 != 0.0f && c0416bn.f2619aF != null) {
                    C1152y.m466a(this, c0416bn.f2619aF, mo2896e2, i4);
                }
            }
        }
        if (!z && this.f1640cx > 0.0f && this.f1642cz == 0.0f && (mo3064T = mo3064T()) != null) {
            if (!c0458l.f3077cU) {
                f2 = 0.0f + 0.09f + ((this.f1640cx / this.f1643cA) * 0.4f) + ((C0773f.m2188b(this.f1641cy, 50.0f) / 50.0f) * 0.5f);
            } else {
                float m2188b = 0.0f + ((C0773f.m2188b(this.f1641cy, 50.0f) / 50.0f) * 0.5f);
                float f10 = this.f1641cy;
                if (f10 > 5.0f) {
                    f10 = 5.0f;
                }
                f2 = m2188b + ((f10 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.f2901J == null) {
                    this.f2901J = C1152y.m486a();
                }
                Paint paint = this.f2901J;
                paint.m5337a((int) (f2 * 255.0f), 255, 255, 255);
                float f11 = this.f7172eo - gameEngine.f6357cw;
                float f12 = (this.f7173ep - gameEngine.f6358cx) - this.f7174eq;
                if (!c0458l.f3254av) {
                    f3 = ((c0458l.f3085df * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((c0458l.f3085df * 2) / mo3064T.f6620p) * 1.25f;
                }
                gameEngine.f6326bO.mo142k();
                gameEngine.f6326bO.mo231a(f3, f3, f11, f12);
                gameEngine.f6326bO.mo205a(mo3064T, f11, f12, mo3283d(false) - 90.0f, paint);
                gameEngine.f6326bO.mo141l();
            }
        }
        if (i > 0) {
            Object[] m540a3 = c0458l.f3228i.m540a();
            for (int i5 = i - 1; i5 >= 0; i5--) {
                ((AbstractC0389a) m540a3[i5]).mo3969c(this, f);
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: T */
    public C0970e mo3064T() {
        return this.f2891x.f3253au;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3085C() {
        return this.f2891x.f3115dN;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3083D() {
        return this.f2891x.f3116dO;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bi */
    public boolean mo2927bi() {
        return this.f2891x.f3121dX;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bj */
    public boolean mo2926bj() {
        return this.f2891x.f3122dY;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3091l() {
        return this.f2891x.f3137ep;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ag */
    public boolean mo2978ag() {
        return this.f2891x.f3139er.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2979af() {
        return this.f2891x.f3138eq.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ae */
    public boolean mo2980ae() {
        return this.f2891x.f3140es.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ah */
    public boolean mo2977ah() {
        if (this.f2891x.f3141et == null) {
            return true;
        }
        return this.f2891x.f3141et.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public boolean mo2874k(AbstractC0244am abstractC0244am) {
        C0458l c0458l = this.f2891x;
        if (c0458l.f3142eu) {
            if (c0458l.f3143ev != null && !C0453g.m3708a(c0458l.f3143ev, abstractC0244am.mo4278de())) {
                return false;
            }
            if (c0458l.f3144ew != null && C0453g.m3708a(c0458l.f3144ew, abstractC0244am.mo4278de())) {
                return false;
            }
            if (c0458l.f3145ex) {
                boolean z = false;
                for (int i = 0; i < c0458l.f3301fQ.length; i++) {
                    C0416bn c0416bn = c0458l.f3301fQ[i];
                    if ((c0416bn.f2596P == null || !C0453g.m3708a(c0416bn.f2596P, abstractC0244am.mo4278de())) && (c0416bn.f2595O == null || C0453g.m3708a(c0416bn.f2595O, abstractC0244am.mo4278de()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (abstractC0244am.mo3092i()) {
            return mo2979af();
        }
        if (abstractC0244am.mo3098Q()) {
            return mo2980ae();
        }
        if (!mo2977ah() && !abstractC0244am.m4314cH()) {
            return false;
        }
        return mo2978ag();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3081E() {
        return this.f2891x.f3146ey;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2890g(int i) {
        return this.f2891x.f3301fQ[i].f2599X;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2845z(int i) {
        return this.f2891x.f3301fQ[i].f2642ab;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3088A(int i) {
        return this.f2891x.f3301fQ[i].f2644ah;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3086B(int i) {
        return this.f2891x.f3301fQ[i].f2575j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3084C(int i) {
        float f;
        float f2;
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2633w != -1) {
            f = this.f1654cL[c0416bn.f2633w].f1717a;
        } else {
            f = this.f1623cg;
        }
        if (this.f1625ci && mo2933bc() > 0.95d) {
            f2 = f + c0416bn.f2576k;
        } else {
            f2 = f + c0416bn.f2575j;
        }
        if (c0416bn.f2651ar != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bm */
    public boolean mo2923bm() {
        return this.f2891x.f3113dL;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2859q(int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (!c0416bn.f2635B) {
            return 0.0f;
        }
        C0410bh c0410bh = this.f2891x.f3205fR[c0416bn.m3905a(this)];
        float f = 0.0f;
        if (!c0410bh.f1164s) {
            f = 0.0f + c0410bh.f1101b;
        }
        float f2 = f + c0410bh.f1102c;
        if (!c0410bh.f1142aN) {
            f2 *= this.f2892y.f2259f;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2954b(int i) {
        return this.f2891x.f3301fQ[i].f2625m * this.f2892y.f2258e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2896e(int i) {
        return this.f2891x.f3301fQ[i].f2626n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: f */
    public float mo2894f(int i) {
        return this.f2891x.f3301fQ[i].f2627o;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: s */
    public boolean mo2854s(int i) {
        return this.f2891x.f3301fQ[i].f2631s;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: t */
    public float mo2852t(int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2578t == 0.0f || c0416bn.f2626n == 0.0f) {
            return 0.0f;
        }
        return -(c0416bn.f2578t * (this.f1654cL[i].f1722f / c0416bn.f2626n));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: r */
    public boolean mo2857r(int i) {
        if (this.f2891x.f3301fQ[i].f2635B) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public void mo2950b(AbstractC0244am abstractC0244am, int i) {
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2586F != null) {
            PointF mo3080E = mo3080E(i);
            c0416bn.f2586F.m3489a(mo3080E.x, mo3080E.y, this.f7174eq, this.f1654cL[i].f1717a, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: u */
    public boolean mo2851u(int i) {
        if (!m3671a(this.f2891x.f3301fQ[i])) {
            return false;
        }
        return super.mo2851u(i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: s */
    public int mo4253s(AbstractC0244am abstractC0244am) {
        return this.f2891x.f3149eB;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bO */
    public boolean mo4136bO() {
        return this.f2891x.f3151eD;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bP */
    public boolean mo4135bP() {
        return this.f2891x.f3152eE;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3160bN() {
        return this.f2892y.f2255b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cG */
    public boolean mo4315cG() {
        return this.f2891x.f2971aq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3251a_(boolean z) {
        float f;
        if (z && !this.f2891x.f2971aq) {
            return super.mo3251a_(z);
        }
        if (this.f1612bV) {
            return super.mo3251a_(z);
        }
        C0458l c0458l = this.f2891x;
        int i = this.f2868a;
        int i2 = 0;
        C0460m c0460m = c0458l.f3110dI;
        if (this.f2869b.f2745a != null && this.f2869b.f2745a.f2843k != null) {
            c0460m = this.f2869b.f2745a.f2843k;
        }
        if (c0460m != null) {
            float f2 = c0460m.f3345b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.f1623cg;
                if (c0460m.f3344a) {
                    f = -this.f1654cL[c0458l.f3108dG].f1717a;
                }
            } else {
                f = this.f1623cg;
                if (c0460m.f3344a) {
                    f = this.f1654cL[c0458l.f3108dG].f1717a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - c0460m.f3348e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (c0460m.f3346c > 0) {
                i += i4 * c0460m.f3346c;
            }
            if (c0460m.f3347d > 0) {
                i2 = 0 + (i4 * c0460m.f3347d);
            }
        }
        if (i >= c0458l.f3242V) {
            i2 += i / c0458l.f3242V;
            i %= c0458l.f3242V;
        }
        return super.m4338a(z, i, i2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cF */
    public RectF mo3413cF() {
        RectF cF = super.mo3413cF();
        if (this.f2891x.f2969ak) {
            cF.m5268a(this.f2891x.f2966ah, this.f2891x.f2967ai - this.f2891x.f2968aj);
        }
        return cF;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2924bl() {
        if (this.f2891x == null) {
            return 1;
        }
        return this.f2891x.f3301fQ.length;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: v */
    public int mo2850v(int i) {
        return this.f2891x.f3301fQ[i].f2634x;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public C1115ai mo3078F(int i) {
        return m3681a(i, false);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3076G(int i) {
        C1115ai m3681a = m3681a(i, false);
        f2922K.x = m3681a.f7064a;
        f2922K.y = m3681a.f7065b;
        return f2922K;
    }

    /* renamed from: a */
    public C1115ai m3681a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        float f4;
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2633w == -1) {
            f = this.f7172eo;
            f2 = this.f7173ep;
            f3 = 0.0f;
            f4 = this.f1623cg;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            C1115ai m3681a = m3681a(c0416bn.f2633w, true);
            f = m3681a.f7064a;
            f2 = m3681a.f7065b;
            f3 = m3681a.f7066c;
            f4 = this.f1654cL[c0416bn.f2633w].f1717a;
        }
        if (this.f1654cL[i].f1721e > 0.0f && c0416bn.f2628p != 0.0f) {
            float f5 = 0.0f;
            float mo2954b = (mo2954b(i) + mo2852t(i)) - this.f1654cL[i].f1721e;
            if (mo2954b < c0416bn.f2629q) {
                f5 = (mo2954b / c0416bn.f2629q) * c0416bn.f2628p;
            } else if (mo2954b < c0416bn.f2629q + c0416bn.f2630r) {
                f5 = c0416bn.f2628p - (((mo2954b - c0416bn.f2629q) / c0416bn.f2630r) * c0416bn.f2628p);
            }
            if (f5 != 0.0f) {
                f += C0773f.m2123k(this.f1654cL[i].f1717a) * f5;
                f2 += C0773f.m2126j(this.f1654cL[i].f1717a) * f5;
            }
        }
        float f6 = c0416bn.f2572f;
        float f7 = c0416bn.f2573g;
        float f8 = c0416bn.f2574h;
        if (f6 != 0.0f || f7 != 0.0f) {
            float m2126j = C0773f.m2126j(f4);
            float m2123k = C0773f.m2123k(f4);
            f += (m2123k * f7) - (m2126j * f6);
            f2 += ((m2126j * f7) + (m2123k * f6)) * c0416bn.f2624i;
        }
        f2923dK.f7064a = f;
        f2923dK.f7065b = f2;
        f2923dK.f7066c = f3 + f8;
        return f2923dK;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3155N() {
        if (this.f2893z != null) {
            return this.f2893z.mo4212a(mo3062V());
        }
        return this.f2891x.mo4212a(mo3062V());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public AbstractC0224s mo4348a(C0208c c0208c) {
        C0458l c0458l;
        if (this.f2893z != null) {
            c0458l = this.f2893z;
        } else {
            c0458l = this.f2891x;
        }
        return c0458l.m3585a(c0208c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: V */
    public int mo3062V() {
        return this.f2891x.f3051cl;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public AbstractC0224s mo3392e(InterfaceC0303as interfaceC0303as) {
        return this.f2902dL.m3370b(interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3191a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s == C0531i.f3675i) {
            if (!z) {
                m3685L();
            } else {
                m3684M();
            }
        } else if (abstractC0224s == C0531i.f3676j) {
            if (!z) {
                m3684M();
            }
        } else {
            if (!z) {
                if (pointF != null && !mo3040a(abstractC0224s, pointF.x, pointF.y)) {
                    return;
                }
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2162a.f2121ax != null) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        if (this.f1614bX == gameEngine.f6312bs && !gameEngine.m1108I()) {
                            c0342g.f2162a.f2121ax.m3913a();
                        }
                    }
                    if (c0342g.f2162a.f2117at != null) {
                        c0342g.f2162a.f2117at.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, this);
                    }
                }
            }
            if (z && (abstractC0224s instanceof C0342g) && !((C0342g) abstractC0224s).f2162a.f2139M) {
                return;
            }
            C0504j m3384a = this.f2902dL.m3384a(abstractC0224s, z, pointF, abstractC0244am);
            if (!z) {
                if (m3384a != null) {
                    mo4343a(EnumC0348af.queueItemAdded, (AbstractC0244am) null, abstractC0224s.mo4095P(), (VariableScope) null);
                }
            } else if (m3384a != null) {
                mo4343a(EnumC0348af.queueItemCancelled, (AbstractC0244am) null, abstractC0224s.mo4095P(), (VariableScope) null);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3154a(AbstractC0224s abstractC0224s, boolean z) {
        mo3191a(abstractC0224s, z, (PointF) null, (AbstractC0244am) null);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public void mo3394b(AbstractC0224s abstractC0224s, boolean z) {
        this.f2902dL.m3385a(abstractC0224s, z);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3396a(AbstractC0224s abstractC0224s) {
        this.f2902dL.m3386a(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3040a(AbstractC0224s abstractC0224s, float f, float f2) {
        if (abstractC0224s instanceof C0342g) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            C0342g c0342g = (C0342g) abstractC0224s;
            if (c0342g.f2162a.f2104ag != null && c0342g.f2162a.f2105ah == null) {
                if (c0342g.f2162a.f2104ag.intValue() >= this.f2891x.f3301fQ.length) {
                    m3015a("checkTargetedActionOrder: " + c0342g.f2162a.f2104ag + " larger than max turret size");
                    return true;
                } else if (!m3670a(this.f2891x.f3301fQ[c0342g.f2162a.f2104ag.intValue()], c0342g.f2162a.f2104ag.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (c0342g.f2162a.f2109al != null && C1152y.m482a(f, f2, c0342g.f2162a.f2109al)) {
                        if (this.f1614bX == gameEngine.f6312bs) {
                            gameEngine.f6330bS.m1854b("Invalid map location (Must be passable by " + c0342g.f2162a.f2109al.name() + ")");
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3039a(AbstractC0224s abstractC0224s, boolean z, float f, float f2) {
        AbstractC0224s mo4348a;
        if ((abstractC0224s instanceof C0342g) && (mo4348a = mo4348a(abstractC0224s.m4414N())) != null) {
            C0342g c0342g = (C0342g) mo4348a;
            Integer num = c0342g.f2162a.f2104ag;
            if (num != null && c0342g.f2162a.f2105ah == null && num.intValue() < this.f2891x.f3301fQ.length) {
                C0416bn c0416bn = this.f2891x.f3301fQ[num.intValue()];
                if (c0416bn.f2643ag > 0.0f) {
                    C1152y.m458b((AbstractC0244am) this, c0416bn.f2643ag, true);
                }
                C1152y.m471a((AbstractC0244am) this, c0416bn.f2603ad, true, true);
            }
            if (z && c0342g.f2162a.f2110am != null) {
                c0342g.f2162a.f2110am.m3962a(this, f, f2);
            }
        }
        super.mo3039a(abstractC0224s, z, f, f2);
    }

    /* renamed from: a */
    public boolean m3677a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i, int i2) {
        PointF pointF2 = null;
        AbstractC0244am abstractC0244am2 = null;
        int i3 = 0;
        if (i > 0) {
            pointF2 = f2903dM;
            abstractC0244am2 = f2904dN;
            i3 = f2905dO;
        }
        f2903dM = pointF;
        f2904dN = abstractC0244am;
        f2905dO = i2;
        boolean m3678a = m3678a(abstractC0224s, pointF, abstractC0244am, i);
        f2903dM = pointF2;
        f2904dN = abstractC0244am2;
        f2905dO = i3;
        return m3678a;
    }

    /* renamed from: a */
    public boolean m3678a(AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (i > 10) {
            return false;
        }
        abstractC0224s.mo4410a(this, abstractC0244am);
        if (abstractC0224s instanceof C0342g) {
            C0342g c0342g = (C0342g) abstractC0224s;
            C0339d c0339d = c0342g.f2162a;
            if (c0339d.f2075t != null && !c0339d.f2075t.read(this)) {
                return true;
            }
            boolean z = false;
            if (c0339d.f2101ad != null) {
                this.f1644cB += c0342g.f2162a.f2101ad.floatValue();
                z = true;
            }
            if (c0339d.f2102ae != null) {
                c0339d.f2102ae.m3833h(this);
                z = true;
            }
            if (c0339d.f2103af != null) {
                c0339d.f2103af.m3872a((AbstractC0244am) this, this.f1614bX.m4573E(), true);
                z = true;
            }
            if (c0339d.f2130aH != null) {
                if (c0339d.f2130aH.read(this)) {
                    this.f1590bA = gameEngine.f6315by;
                }
                z = true;
            }
            if (c0339d.f2104ag != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < c0339d.f2108ak; i2++) {
                    if (c0339d.f2105ah != null) {
                        pointF2 = new PointF();
                        if (c0339d.f2106ai == null) {
                            pointF2.setSite(this.f7172eo, this.f7173ep);
                        } else {
                            AbstractC0244am readUnit = c0339d.f2106ai.readUnit(this);
                            if (readUnit != null) {
                                pointF2.setSite(readUnit.f7172eo, readUnit.f7173ep);
                            } else {
                                pointF2.setSite(this.f7172eo, this.f7173ep);
                            }
                        }
                        float m2123k = C0773f.m2123k(this.f1623cg);
                        float m2126j = C0773f.m2126j(this.f1623cg);
                        float f = c0339d.f2105ah.x;
                        float f2 = c0339d.f2105ah.y;
                        pointF2.moveAdd((m2123k * f2) - (m2126j * f), (m2126j * f2) + (m2123k * f));
                    }
                    if (pointF2 == null) {
                        GameNetEngine.m1481g("completeQueueItem:" + c0342g.m4414N() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        m3676a((AbstractC0244am) null, pointF2.x, pointF2.y, c0342g.f2162a.f2104ag.intValue(), c0342g.f2162a.f2107aj, i);
                    }
                }
                z = true;
            }
            if (c0339d.f2116as != null) {
                c0339d.f2116as.m3489a(this.f7172eo, this.f7173ep, this.f7174eq, this.f1623cg, this);
                z = true;
            }
            if (c0339d.f2118au != null) {
                c0339d.f2118au.m3911a(this.f7172eo, this.f7173ep, 1.0f);
                z = true;
            }
            if (c0339d.f2119av != null && !gameEngine.m1108I()) {
                c0339d.f2119av.m3913a();
                z = true;
            }
            if (c0339d.f2120aw != null) {
                if (this.f1614bX == gameEngine.f6312bs && !gameEngine.m1108I()) {
                    c0339d.f2120aw.m3913a();
                }
                z = true;
            }
            if (c0339d.f2146ac.f7109a > 0) {
                Object[] m540a = c0339d.f2146ac.m540a();
                for (int i3 = 0; i3 < c0339d.f2146ac.f7109a; i3++) {
                    if (((AbstractC0321a) m540a[i3]).mo4117a(this, abstractC0224s, pointF, abstractC0244am, i)) {
                        z = true;
                    }
                }
            }
            PointF pointF3 = pointF;
            AbstractC0244am abstractC0244am2 = abstractC0244am;
            if ((c0339d.f2113ap != null || c0342g.f2162a.f2114aq != null) && c0339d.f2111an != null) {
                abstractC0244am2 = c0339d.f2111an.readUnit(this);
                pointF3 = new PointF();
                if (abstractC0244am2 != null) {
                    pointF3.x = abstractC0244am2.f7172eo;
                    pointF3.y = abstractC0244am2.f7173ep;
                } else {
                    pointF3.x = this.f7172eo;
                    pointF3.y = this.f7173ep;
                }
            }
            if (c0339d.f2113ap != null) {
                if (c0339d.f2112ao == null || c0339d.f2112ao.read(this)) {
                    int i4 = 1;
                    if (c0339d.f2115ar != null) {
                        i4 = (int) c0339d.f2115ar.readNumber(this);
                        if (i4 > 10000) {
                            i4 = 10000;
                        }
                    }
                    for (int i5 = 0; i5 < i4; i5++) {
                        c0342g.f2162a.f2113ap.m3498a(this, pointF3, abstractC0244am2, i + 1, i5);
                    }
                }
                z = true;
            }
            if (c0342g.f2162a.f2114aq != null) {
                if (c0339d.f2112ao == null || c0339d.f2112ao.read(this)) {
                    c0342g.f2162a.f2114aq.m3499a(this, pointF3, abstractC0244am2);
                }
                z = true;
            }
            C0458l c0458l = null;
            if (c0339d.f2089H != null) {
                c0458l = c0339d.f2089H.mo5569c();
            }
            if (c0458l != null) {
                if (GameEngine.f6406aw) {
                    GameEngine.print(mo3103c() + ": converting unit: " + abstractC0224s.m4413O());
                }
                if (!(c0458l instanceof C0458l)) {
                    AbstractC0244am mo4213a = c0458l.mo4213a();
                    mo4213a.f7172eo = this.f7172eo;
                    mo4213a.f7173ep = this.f7173ep;
                    if (!mo4213a.mo3421bI()) {
                        mo4213a.f1623cg = this.f1623cg;
                    }
                    mo4213a.mo4261f(this.f1614bX);
                    mo4213a.mo4358B(null);
                    float f3 = this.f1638cv;
                    float f4 = mo4213a.f1638cv;
                    if (f3 == 0.0f) {
                        mo4213a.m4257o(mo4213a.f1638cv);
                    } else {
                        mo4213a.m4257o((this.f1637cu / f3) * f4);
                    }
                    if (this.f1649cG) {
                        GameEngine.getGameEngine().f6330bS.m1824k(mo4213a);
                    }
                    PlayerData.m4507c(mo4213a);
                    m4292ci();
                } else {
                    C0454h c0454h = null;
                    if (c0339d.f2092Q) {
                        c0454h = mo4278de();
                    }
                    PlayerData.m4523b((AbstractC0244am) this);
                    this.f2893z = null;
                    m3665a(c0458l, false, false, c0339d.f2093R);
                    if (c0454h != null) {
                        m3667a(c0454h, true);
                    }
                    mo3065S();
                    this.f2902dL.m3365e();
                    this.f1591bB = GameEngine.getGameEngine().f6315by;
                    PlayerData.m4507c(this);
                }
                z = true;
                if (!c0342g.mo4102B().m3846c()) {
                    m3061W();
                }
            }
            if (!z && c0339d.f2070n) {
                GameEngine.m5572e("completeQueueItem:" + c0342g.m4414N() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: b */
    public void mo3360b(C0504j c0504j) {
        AbstractC0224s mo4348a = mo4348a(c0504j.f3527j);
        if (mo4348a != null && (mo4348a instanceof C0342g)) {
            C0339d c0339d = ((C0342g) mo4348a).f2162a;
            if (c0339d.f2100ab != null) {
                f2915ec.x = this.f7172eo;
                f2915ec.y = this.f7173ep;
                c0339d.f2100ab.m3498a(this, f2915ec, null, 0, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: c */
    public boolean mo3359c(C0504j c0504j) {
        return true;
    }

    /* renamed from: i */
    public void m3603i(boolean z) {
        this.f2902dL.m3373a(z);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3318a(C0504j c0504j) {
        float f;
        AbstractC0224s mo4348a = mo4348a(c0504j.f3527j);
        if (mo4348a != null && m3677a(mo4348a, c0504j.f3521h, c0504j.f3522i, 0, 0)) {
            return;
        }
        float f2 = 0.0f;
        if (this.f2891x.f2979aH && this.f2891x.f3090dk != null) {
            f2 = this.f1623cg + this.f2891x.f3090dk.floatValue() + 90.0f;
        }
        if (this.f2891x.f3093dn != null) {
            f = this.f2891x.f3093dn.floatValue();
        } else if (this.f2902dL.f3531b != null) {
            f = this.f1626cj * 3.0f;
        } else {
            f = this.f1626cj * 2.0f;
        }
        AbstractC0244am m3376a = this.f2902dL.m3376a(c0504j, f, this.f2885r, f2);
        if (m3376a != null) {
            m3689F(m3376a);
            PlayerData.m4507c(m3376a);
            m4344a(EnumC0348af.queuedUnitFinished, m3376a);
        }
    }

    /* renamed from: E */
    public void m3690E(AbstractC0244am abstractC0244am) {
        float f = 0.0f;
        if (this.f2891x.f2979aH && this.f2891x.f3090dk != null) {
            f = this.f1623cg + this.f2891x.f3090dk.floatValue() + 90.0f;
        }
        abstractC0244am.f1623cg = 90.0f + f;
        float f2 = 70.0f;
        if (this.f2891x.f3093dn != null) {
            f2 = this.f2891x.f3093dn.floatValue();
        }
        this.f2902dL.m3381a(abstractC0244am, f2, this.f2885r);
    }

    /* renamed from: F */
    public void m3689F(AbstractC0244am abstractC0244am) {
        abstractC0244am.f7172eo = this.f7172eo + this.f2891x.f3088di;
        abstractC0244am.f7173ep = this.f7173ep + this.f2891x.f3089dj;
        if (!this.f2891x.f2979aH) {
            float f = 180.0f;
            if (this.f2891x.f3090dk != null) {
                f = this.f2891x.f3090dk.floatValue();
            }
            float f2 = 70.0f;
            if (this.f2891x.f3093dn != null) {
                f2 = this.f2891x.f3093dn.floatValue();
            }
            boolean m3276a = C0531i.m3276a(this, abstractC0244am, this.f2885r, 7.0f, f, f2, this.f2891x.f3088di, this.f2891x.f3089dj);
            if (!this.f2891x.f3092dm) {
                abstractC0244am.f7174eq = this.f7174eq;
            }
            abstractC0244am.f7174eq += this.f2891x.f3091dl;
            if (abstractC0244am instanceof C0456j) {
                ((C0456j) abstractC0244am).m3629dF();
            }
            if ((mo3092i() || !m3276a || this.f2891x.f3163eU.read(this)) && mo3269cr()) {
                m3692C(abstractC0244am);
            }
        }
        this.f2885r = !this.f2885r;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: by */
    public C0429b mo2911by() {
        C1136m m3363g = this.f2902dL.m3363g();
        int size = m3363g.size();
        if (size == 0) {
            return C0429b.f2734a;
        }
        C0429b c0429b = new C0429b();
        Object[] m540a = m3363g.m540a();
        for (int i = 0; i < size; i++) {
            AbstractC0224s mo4348a = mo4348a(((C0504j) m540a[i]).f3527j);
            if (mo4348a != null && (mo4348a instanceof C0342g)) {
                C0342g c0342g = (C0342g) mo4348a;
                if (c0342g.f2162a.f2101ad != null) {
                    c0429b.f2724c += c0342g.f2162a.f2101ad.floatValue();
                }
                if (c0342g.f2162a.f2102ae != null) {
                    C0429b c0429b2 = c0342g.f2162a.f2102ae;
                    if (!c0429b2.m3846c()) {
                        c0429b = C0429b.m3866a(c0429b, c0429b2);
                    }
                }
                if (c0342g.f2162a.f2103af != null) {
                    C0429b c0429b3 = c0342g.f2162a.f2103af;
                    if (!c0429b3.m3846c()) {
                        c0429b = C0429b.m3866a(c0429b, c0429b3);
                    }
                }
            }
        }
        return c0429b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dA */
    public boolean mo3358dA() {
        return this.f2891x.f3295eM > 0 && m3626dI() > this.f2891x.f3295eM;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: h */
    public int mo3352h(InterfaceC0303as interfaceC0303as) {
        return this.f2902dL.m3380a(interfaceC0303as);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: f */
    public int mo3353f(boolean z) {
        return this.f2902dL.m3387a(AbstractC0224s.f1466i, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public int mo3361a(C0208c c0208c, boolean z) {
        return this.f2902dL.m3388a(c0208c, z);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dw */
    public C0504j mo3357dw() {
        return this.f2902dL.m3372b();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bD */
    public C0429b mo2938bD() {
        return this.f2902dL.m3368c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dx */
    public C1136m mo3356dx() {
        return this.f2902dL.f3532c;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dz */
    public void mo3354dz() {
        this.f2902dL.f3534e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: dy */
    public boolean mo3355dy() {
        return this.f2902dL.m3390a();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public int mo3395a(C0453g c0453g) {
        return this.f2902dL.m3378a(c0453g);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.InterfaceC0506l
    /* renamed from: a */
    public void mo3362a(PointF pointF) {
        if (this.f2891x.f3082dc) {
            this.f2902dL.f3531b = pointF;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: x */
    public float mo4250x() {
        if (!this.f2891x.f2935t) {
            return -1.0f;
        }
        return super.mo4250x();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bU */
    public boolean mo4325bU() {
        return this.f2891x.f2936u;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bV */
    public float mo3334bV() {
        if (m4326bT() && !this.f2902dL.m3390a() && this.f2891x.f2941z) {
            return this.f2902dL.f3534e;
        }
        return super.mo3334bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public float mo3259bW() {
        if (this.f2892y.f2257d > 0.0f && this.f1644cB < this.f2892y.f2257d && this.f2891x.f2937v) {
            return this.f1644cB / this.f2892y.f2257d;
        }
        if (this.f1643cA > 0.0f && this.f1640cx < this.f1643cA && this.f2891x.f2940y) {
            return this.f1640cx / this.f1643cA;
        }
        if (this.f2892y.f2257d == 0.0f && this.f1643cA == 0.0f) {
            if (this.f2891x.f3290em != -1 && this.f1654cL[this.f2891x.f3290em].f1721e > 0.0f) {
                return 1.0f - (this.f1654cL[this.f2891x.f3290em].f1721e / mo2954b(this.f2891x.f3290em));
            }
            if (this.f2891x.f3291en != -1 && this.f1654cL[this.f2891x.f3291en].f1722f != 0.0f) {
                return this.f1654cL[this.f2891x.f3291en].f1722f / mo2896e(this.f2891x.f3291en);
            }
        }
        return super.mo3259bW();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: f */
    public boolean mo2358f(float f) {
        return super.mo2358f(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: p */
    public void mo4256p(float f) {
        int i = this.f2891x.f3228i.f7109a;
        if (i > 0) {
            Object[] m540a = this.f2891x.f3228i.m540a();
            for (int i2 = i - 1; i2 >= 0; i2--) {
                ((AbstractC0389a) m540a[i2]).mo3965f(this, f);
            }
        }
        super.mo4256p(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo2359e(float f) {
        super.mo2359e(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ca */
    public void mo3393ca() {
        if (this.f2902dL.f3531b != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.f6326bO.mo230a((int) (this.f7172eo - gameEngine.f6357cw), (int) (this.f7173ep - gameEngine.f6358cx), (int) (this.f2902dL.f3531b.x - gameEngine.f6357cw), (int) (this.f2902dL.f3531b.y - gameEngine.f6358cx), AbstractC0503i.f3512y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cb */
    public void mo3430cb() {
        boolean z = false;
        if ((this.f2892y.f2262i > 70.0f && this.f2891x.f3137ep && this.f2891x.f3112dK == null) || (this.f2891x.f3112dK != null && this.f2891x.f3112dK.booleanValue())) {
            C1152y.m473a((AbstractC0244am) this, mo2870m(), true);
            z = true;
        } else if (this.f2891x.f2979aH && this.f2892y.f2268o > 50 && !this.f2891x.f3137ep) {
            C1152y.m473a((AbstractC0244am) this, this.f2892y.f2268o, true);
            z = true;
        }
        if (this.f2891x.f3234o.size() != 0) {
            Iterator it = this.f2891x.f3234o.iterator();
            while (it.hasNext()) {
                C1152y.m473a((AbstractC0244am) this, ((C0472y) it.next()).f3389a, true);
                z = true;
            }
        }
        if (this.f2891x.f3024bF) {
            int mo2924bl = mo2924bl();
            for (int i = 0; i < mo2924bl; i++) {
                C0416bn c0416bn = this.f2891x.f3301fQ[i];
                if (c0416bn.f2607ak != null && c0416bn.f2646al > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    C1152y.m474a((AbstractC0244am) this, c0416bn.f2646al, Color.m5352a(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: d */
    public void mo2360d(float f) {
        super.mo2360d(f);
        if (this.f1612bV) {
            return;
        }
        this.f1703dI.m3885a(f, this);
        if (this.f2891x.f3247al != null) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            float f2 = this.f7172eo - gameEngine.f6357cw;
            float f3 = (this.f7173ep - gameEngine.f6358cx) - this.f7174eq;
            float mo4317cD = mo4317cD();
            if (mo4317cD != 1.0f) {
                gameEngine.f6326bO.mo142k();
                gameEngine.f6326bO.mo231a(mo4317cD, mo4317cD, f2, f3);
            }
            if (this.f2891x.f2970am) {
                int i = this.f2891x.f3247al.f6620p;
                int i2 = this.f2891x.f3247al.f6621q;
                int i3 = i / 2;
                int i4 = i2 / 2;
                f1689du.m5267a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                f1690dv.m5281a(0, 0, 0 + i, 0 + i2);
            } else {
                f1689du.m5267a(f2 - this.f4262eu, f3 - this.f4263ev, f2 + this.f4262eu, f3 + this.f4263ev);
                f1690dv.m5281a(0, 0, 0 + this.f4260es, 0 + this.f4261et);
            }
            gameEngine.f6326bO.mo198a(this.f2891x.f3247al, f1690dv, f1689du, mo2998aN());
            if (mo4317cD != 1.0f) {
                gameEngine.f6326bO.mo141l();
            }
        }
        if (this.f2891x.f3257az && this.f2910dT != null && !this.f1612bV) {
            C0396h.m3961a(this, f, false, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aM */
    public float mo2999aM() {
        return this.f2891x.f3109dH;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aN */
    public Paint mo2998aN() {
        return super.mo2998aN();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aV */
    public boolean mo2990aV() {
        return this.f2891x.f3153eF;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bI */
    public boolean mo3421bI() {
        return this.f2891x.f2979aH;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: q */
    public boolean mo3304q() {
        if (this.f1657cO != null && this.f1657cO.f1629cm < 1.0f) {
            return true;
        }
        return this.f2891x.f2982aK;
    }

    /* renamed from: H */
    private boolean m3687H(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3304q() || abstractC0244am == this) {
            return false;
        }
        if (abstractC0244am.mo3421bI()) {
            if (this.f2891x.f2992aU) {
                return true;
            }
            return false;
        } else if (this.f2891x.f2993aV) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3035a(AbstractC0244am abstractC0244am) {
        if (this.f2891x.f3179fo != null && !C0453g.m3708a(this.f2891x.f3179fo, abstractC0244am.mo4278de())) {
            return false;
        }
        return m3687H(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: l */
    public boolean mo2871l(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.mo3308g() != 0.0f && mo4258h(abstractC0244am, true)) {
            return true;
        }
        if (this.f2891x.f3178fn != null && !C0453g.m3708a(this.f2891x.f3178fn, abstractC0244am.mo4278de())) {
            return false;
        }
        return m3687H(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public void mo2867m(AbstractC0244am abstractC0244am) {
        C0643ab c0643ab;
        if (this.f2891x.f3003bi) {
            C0305au ar = m2967ar();
            if (ar != null && (c0643ab = ar.f1807i) != null) {
                c0643ab.m2815a(ar);
            }
            if (this.f1649cG && abstractC0244am != null) {
                GameEngine.getGameEngine().f6330bS.m1824k(abstractC0244am);
            }
            m4292ci();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: al */
    public boolean mo2973al() {
        if (this.f2891x.f3003bi) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: aj */
    public boolean mo2975aj() {
        return this.f2891x.f3181fq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cu */
    public boolean mo4285cu() {
        return this.f2891x.f3202fN;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ak */
    public boolean mo2974ak() {
        return this.f2891x.f3180fp;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public boolean mo3166g(AbstractC0244am abstractC0244am, boolean z) {
        if (!mo4258h(abstractC0244am, z)) {
            return false;
        }
        if (z && abstractC0244am.m4321c((AbstractC0629y) this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public boolean mo4258h(AbstractC0244am abstractC0244am, boolean z) {
        if (!this.f2891x.f3175fk) {
            return false;
        }
        if (this.f2891x.f3176fl != null && !C0453g.m3708a(this.f2891x.f3176fl, abstractC0244am.mo4278de())) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cS */
    public int mo4304cS() {
        return this.f2891x.f3177fm;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bJ */
    public boolean mo3324bJ() {
        return this.f2891x.f3185fu;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo2369a(float f, boolean z) {
        super.mo2369a(f, z);
        if (!this.f1612bV && mo2974ak()) {
            if (m3059Y()) {
                if (!this.f2891x.f3039bW) {
                    C0524b.m3298b(f, this);
                }
            } else if (!this.f2891x.f3035bS) {
                C0524b.m3298b(f, this);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: o */
    public boolean mo3306o() {
        return this.f2891x.f3057cy;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: p */
    public boolean mo3305p() {
        return this.f2891x.f3058cz;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cO */
    public boolean mo4308cO() {
        return this.f2891x.f3059cA;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public void mo4261f(PlayerData playerData) {
        if (this.f2891x.f3063cE) {
            mo2952b(PlayerData.f1372h);
        } else if (this.f2891x.f3062cD && this.f2895B.size() == 0) {
            mo2952b(PlayerData.f1373i);
        } else {
            super.mo4261f(playerData);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: B */
    public void mo4358B(AbstractC0244am abstractC0244am) {
        super.mo4358B(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: g */
    public float mo3308g() {
        return this.f2891x.f3064cF;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cQ */
    public int mo4306cQ() {
        return this.f2891x.f3065cG;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cR */
    public C0454h mo4305cR() {
        return this.f2891x.f3066cH;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cP */
    public void mo4307cP() {
        if (this.f2891x.f3002bh == 0.0f && mo3308g() > 0.0f) {
            PlayerData.m4523b((AbstractC0244am) this);
            this.f1629cm = 1.0f;
            PlayerData.m4507c(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cp */
    public C0208c mo3270cp() {
        if (this.f2891x.f3295eM != 0) {
            return C0531i.f3675i.m4414N();
        }
        return super.mo3270cp();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: L */
    public float mo3069L(int i) {
        return this.f2891x.f3301fQ[i].f2605af;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: K */
    public PointF mo3070K(int i) {
        C0188f c0188f;
        PointF K = super.mo3070K(i);
        if (this.f2891x.f3148eA) {
            if (this.f2891x.f3205fR[this.f2891x.f3301fQ[i].m3905a(this)].f1173M && this.f2900G != null && (c0188f = this.f2900G[i]) != null && !c0188f.f7167ej) {
                K.x += c0188f.f1012K;
                K.y += c0188f.f1013L;
            }
        }
        return K;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bd */
    public float mo2932bd() {
        return this.f2892y.f2257d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: be */
    public EnumC0307b mo2931be() {
        return this.f2891x.f3126ec;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bf */
    public boolean mo2930bf() {
        if (this.f2891x.f3129ef) {
            return false;
        }
        if (this.f2891x.f3126ec == EnumC0307b.bomber) {
            C0305au ar = m2967ar();
            if ((ar != null && (ar.m4172d() == EnumC0306av.attackMove || ar.m4172d() == EnumC0306av.patrol)) || this.f3926P == EnumC0205a.outOfRange) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bX */
    public boolean mo3258bX() {
        return this.f2889v;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bg */
    public boolean mo2929bg() {
        return this.f2891x.f3132ei;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2933bc() {
        return this.f2891x.f3135el;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public void mo4262f(float f, float f2) {
        super.mo4262f(f, f2);
        m4345a(EnumC0348af.teleported);
        float f3 = this.f1623cg;
        if (this.f2891x.f3106dE) {
            f3 = this.f1654cL[this.f2891x.f3108dG].f1717a;
        }
        this.f2906dP = this.f7172eo;
        this.f2907dQ = this.f7173ep;
        this.f2908dR = this.f7174eq;
        this.f2909dS = f3;
    }

    /* renamed from: du */
    public void m3612du() {
        if (this.f2891x.f3255ax == null && this.f2910dT == null) {
            return;
        }
        if (this.f2891x.f3255ax == null || this.f2891x.f3255ax.length == 0) {
            this.f2910dT = null;
        } else if (this.f2910dT == null || this.f2910dT.length != this.f2891x.f3255ax.length) {
            this.f2910dT = new C0397i[this.f2891x.f3255ax.length];
            for (int i = 0; i < this.f2891x.f3255ax.length; i++) {
                C0397i c0397i = new C0397i();
                this.f2910dT[i] = c0397i;
                c0397i.f2387a = i;
                c0397i.f2405s = this.f2891x.f3255ax[i].f2488r;
            }
            float f = this.f1623cg;
            if (this.f2891x.f3106dE) {
                f = this.f1654cL[this.f2891x.f3108dG].f1717a;
            }
            this.f2906dP = this.f7172eo;
            this.f2907dQ = this.f7173ep;
            this.f2908dR = this.f7174eq;
            this.f2909dS = f;
            m3611dv();
            for (int i2 = 0; i2 < this.f2891x.f3255ax.length; i2++) {
                this.f2910dT[i2].f2402m = true;
            }
        }
    }

    /* renamed from: dv */
    public void m3611dv() {
        C0396h.f2383a.mo3943b(this, 0.0f);
    }

    /* renamed from: dB */
    public void m3633dB() {
        if (this.f2910dT != null) {
            for (int i = 0; i < this.f2910dT.length; i++) {
                this.f2910dT[i].f2403n = true;
                this.f2910dT[i].f2402m = true;
            }
            m3611dv();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aT */
    public int mo2992aT() {
        if (this.f2891x.f3305fV == null) {
            return -1;
        }
        return this.f2891x.f3305fV.f2571e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: s */
    public int mo2855s() {
        return this.f2892y.f2267n;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c */
    public void mo2904c(boolean z) {
        C0458l c0458l = this.f2891x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f1656cN != null || this.f1657cO != null) {
            return;
        }
        int i = this.f2892y.f2267n;
        if (this.f1629cm < 1.0f && c0458l.f3087dh != -1) {
            i = c0458l.f3087dh;
        }
        if (i > 0) {
            gameEngine.f6323bL.m4769a(this.f7172eo, this.f7173ep, i, this.f1614bX, z);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cc */
    public Rect mo3420cc() {
        return this.f2891x.f3279cX;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ce */
    public Rect mo4296ce() {
        return this.f2891x.f3281cZ;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cd */
    public Rect mo3419cd() {
        return this.f2891x.f3280cY;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public boolean mo2953b(int i, float f) {
        float mo3084C;
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        if (c0416bn.f2652as != 0.0f) {
            boolean z = true;
            if (c0416bn.f2610av != null && !c0416bn.f2610av.read(this)) {
                z = false;
            }
            if (z) {
                C0247ap c0247ap = this.f1654cL[i];
                if (c0416bn.f2651ar != 0.0f) {
                    mo3084C = c0247ap.f1717a;
                } else if (!c0416bn.f2650aq) {
                    mo3084C = c0247ap.f1718b;
                } else {
                    mo3084C = mo3084C(i);
                }
                c0247ap.f1727k += f;
                float f2 = f * c0416bn.f2609au;
                if (c0247ap.f1728l > 0.0f) {
                    if (c0247ap.f1728l < Float.POSITIVE_INFINITY && m3056a(f2, mo3084C + c0247ap.f1728l, i) == 0.0f) {
                        c0247ap.f1728l = Float.POSITIVE_INFINITY;
                    }
                } else if (c0247ap.f1728l > Float.NEGATIVE_INFINITY && m3056a(f2, mo3084C + c0247ap.f1728l, i) == 0.0f) {
                    c0247ap.f1728l = Float.NEGATIVE_INFINITY;
                }
                if (c0247ap.f1727k > c0416bn.f2653at) {
                    c0247ap.f1727k = -C0773f.m2212a(this, 0, (int) c0416bn.f2654aw);
                    float f3 = c0416bn.f2652as;
                    if (c0416bn.f2611ax > 0.0f) {
                        f3 += C0773f.m2178b(this, 0.0f, c0416bn.f2611ax, i);
                    }
                    c0247ap.f1728l = c0247ap.f1728l > 0.0f ? -f3 : f3;
                    return false;
                }
                return false;
            }
        }
        if (c0416bn.f2651ar != 0.0f) {
            this.f1654cL[i].f1717a += c0416bn.f2651ar * f;
            if (this.f1654cL[i].f1717a > 180.0f) {
                this.f1654cL[i].f1717a -= 360.0f;
            }
            if (this.f1654cL[i].f1717a < -180.0f) {
                this.f1654cL[i].f1717a += 360.0f;
                return false;
            }
            return false;
        }
        return c0416bn.f2650aq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cw */
    public int mo3292cw() {
        return this.f2891x.f3297eZ;
    }

    /* renamed from: dC */
    public ArrayList m3632dC() {
        f2924dU.clear();
        ArrayList mo3155N = mo3155N();
        if (mo3155N.size() != 0) {
            Iterator it = mo3155N.iterator();
            while (it.hasNext()) {
                AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
                if (abstractC0224s instanceof C0342g) {
                    C0342g c0342g = (C0342g) abstractC0224s;
                    if (c0342g.f2164c == EnumC0340e.upgrade) {
                        f2924dU.add(c0342g);
                    }
                }
            }
        }
        return f2924dU;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cm */
    public C0208c mo3316cm() {
        ArrayList m3632dC = m3632dC();
        if (m3632dC.size() > 0) {
            return ((AbstractC0224s) m3632dC.get(0)).m4414N();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3475a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList m3632dC = m3632dC();
        if (m3632dC.size() < 2) {
            return;
        }
        m3632dC.remove(0);
        Iterator it = m3632dC.iterator();
        while (it.hasNext()) {
            arrayList.add(((AbstractC0224s) it.next()).m4414N());
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cZ */
    public float mo3343cZ() {
        return this.f2891x.f3080da;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: da */
    public float mo3342da() {
        return this.f2891x.f3081db;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bv */
    public void mo2914bv() {
        PlayerData.m4545a((AbstractC0244am) this);
        this.f2902dL.m3373a(true);
        super.mo2914bv();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dc */
    public void mo4279dc() {
        this.f7174eq = 170.0f;
        this.f2873f = 1.5f;
        m3633dB();
        super.mo4279dc();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dd */
    public boolean mo3291dd() {
        return this.f2891x.f3052cm;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bp */
    public int mo2920bp() {
        return this.f2891x.f3011bq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3044a(int i, float f) {
        this.f1654cL[i].f1717a += f;
        if (this.f2891x.f3304fU) {
            for (int i2 = 0; i2 < this.f2891x.f3301fQ.length; i2++) {
                if (this.f2891x.f3301fQ[i2].f2633w == i) {
                    this.f1654cL[i2].f1717a += f;
                    this.f1654cL[i2].m4243a(2);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: db */
    public float mo3341db() {
        return super.mo3341db() + this.f2891x.f3086dg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3074H(int i) {
        return this.f2891x.f3301fQ[i].f2628p;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public float mo3072I(int i) {
        return this.f2891x.f3301fQ[i].f2629q;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: J */
    public float mo3071J(int i) {
        return this.f2891x.f3301fQ[i].f2630r;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public float mo3097a(AbstractC0244am abstractC0244am, float f, C0188f c0188f) {
        C0402n dn = m4270dn();
        if (dn != null && this.f1657cO != null && dn.f2426j) {
            int i = 0;
            if (c0188f != null) {
                i = c0188f.f1056aD;
            }
            if (i >= 0) {
                C0188f m4633a = C0188f.m4633a(c0188f);
                if (dn.f2427k) {
                    m4633a.f1040am = 0.0f;
                }
                f = this.f1657cO.mo3097a(abstractC0244am, f, m4633a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (mo3100J()) {
            f = 0.0f;
        }
        if (this.f2892y.f2265l > 0.0f && f > this.f2891x.f3070cN) {
            float f2 = this.f2892y.f2265l;
            if (c0188f != null) {
                f2 -= c0188f.f1041an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.f2891x.f3070cN) {
                f = this.f2891x.f3070cN;
            }
        }
        if (c0188f != null) {
            mo4343a(EnumC0348af.tookDamage, abstractC0244am, c0188f.f1057aE, (VariableScope) null);
        } else {
            m4344a(EnumC0348af.tookDamage, abstractC0244am);
        }
        return super.mo3097a(abstractC0244am, f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aU */
    public float mo2991aU() {
        return this.f2891x.f3111dJ;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ac */
    public boolean mo2982ac() {
        if (!this.f2891x.f3131eh) {
            return false;
        }
        return super.mo2982ac();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3036a(EnumC0238ag enumC0238ag) {
        if (enumC0238ag == EnumC0238ag.attack) {
            return this.f2891x.f3094do.m3913a();
        }
        if (enumC0238ag == EnumC0238ag.move) {
            return this.f2891x.f3095dp.m3913a();
        }
        if (enumC0238ag == EnumC0238ag.newSelection) {
            return this.f2891x.f3096dq.m3913a();
        }
        return false;
    }

    /* renamed from: b */
    public void m3662b(EnumC0348af enumC0348af) {
        C0458l c0458l = this.f2891x;
        if (c0458l.f3315gq.f7109a == 0) {
            return;
        }
        Object[] m540a = c0458l.f3315gq.m540a();
        for (int i = c0458l.f3315gq.f7109a - 1; i >= 0; i--) {
            C0347ae c0347ae = (C0347ae) m540a[i];
            if (c0347ae.f2183a == enumC0348af) {
                f2915ec.x = this.f7172eo;
                f2915ec.y = this.f7173ep;
                m3677a(c0347ae.f2184b, f2915ec, (AbstractC0244am) null, 0, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo4343a(EnumC0348af enumC0348af, AbstractC0244am abstractC0244am, C0454h c0454h, VariableScope variableScope) {
        C0457k c0457k;
        C0458l c0458l = this.f2891x;
        if (c0458l.f3315gq.f7109a == 0) {
            return;
        }
        Object[] m540a = c0458l.f3315gq.m540a();
        for (int i = c0458l.f3315gq.f7109a - 1; i >= 0; i--) {
            C0347ae c0347ae = (C0347ae) m540a[i];
            if (c0347ae.f2183a == enumC0348af && (c0347ae.f2186d == null || C0453g.m3709a(c0347ae.f2186d, c0454h))) {
                if (f2927dX.size() > 0) {
                    c0457k = (C0457k) f2927dX.m536b();
                } else {
                    c0457k = new C0457k();
                }
                c0457k.f2928a = c0347ae;
                c0457k.f2929b = this;
                c0457k.f2930c = abstractC0244am;
                c0457k.f2931d = c0454h;
                c0457k.f2932e = variableScope;
                f2926dW.add(c0457k);
            }
        }
    }

    /* renamed from: s */
    public static void m3600s(float f) {
    }

    /* renamed from: dD */
    public static void m3631dD() {
        if (f2926dW.f7109a == 0) {
            return;
        }
        f2926dW = new C1136m();
    }

    /* renamed from: a */
    public static void m3683a(float f, int i) {
        int i2;
        if (f2926dW.f7109a == 0) {
            return;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= 105 || (i2 = f2926dW.f7109a) == 0) {
                break;
            }
            Object[] m540a = f2926dW.m540a();
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                C0457k c0457k = (C0457k) m540a[i4];
                C0347ae c0347ae = c0457k.f2928a;
                C0456j c0456j = c0457k.f2929b;
                if (c0347ae.f2185c == c0456j.f2891x) {
                    f2915ec.x = c0456j.f7172eo;
                    f2915ec.y = c0456j.f7173ep;
                    PointF pointF = f2915ec;
                    LogicBoolean.setContextEventSource(c0457k);
                    c0456j.m3677a(c0347ae.f2184b, pointF, (AbstractC0244am) null, 0, 0);
                    LogicBoolean.clearContext();
                }
            }
            if (i3 < 105) {
                if (i2 == f2926dW.f7109a) {
                    break;
                }
                Object[] m540a2 = f2926dW.m540a();
                int i5 = 0;
                for (int i6 = i2; i6 < f2926dW.f7109a; i6++) {
                    if (i3 < ((C0457k) m540a2[i6]).f2928a.f2187e) {
                        i5++;
                    }
                }
                if (i5 <= 0) {
                    break;
                }
                f2925dV.clear();
                for (int i7 = 0; i7 < f2926dW.f7109a; i7++) {
                    C0457k c0457k2 = (C0457k) m540a2[i7];
                    boolean z = true;
                    if (i7 < i2) {
                        z = false;
                    } else if (i3 >= c0457k2.f2928a.f2187e) {
                        z = false;
                    }
                    if (!z) {
                        c0457k2.m3594a();
                        f2927dX.add(c0457k2);
                    } else {
                        f2925dV.add(c0457k2);
                    }
                }
                f2926dW.clear();
                C1136m c1136m = f2925dV;
                f2925dV = f2926dW;
                f2926dW = c1136m;
                if (i5 != f2926dW.f7109a) {
                    GameEngine.m5572e("processAllQueuedEvents: " + i5 + "!=" + f2926dW.f7109a);
                }
                i3++;
            } else {
                GameEngine.m5572e("processAllQueuedEvents: recursion limit reached");
                break;
            }
        }
        Object[] m540a3 = f2926dW.m540a();
        for (int i8 = f2926dW.f7109a - 1; i8 >= 0; i8--) {
            C0457k c0457k3 = (C0457k) m540a3[i8];
            c0457k3.m3594a();
            f2927dX.add(c0457k3);
        }
        f2926dW.clear();
    }

    /* renamed from: dE */
    public static void m3630dE() {
    }

    /* renamed from: b */
    public void m3664b(float f, boolean z) {
        C0458l c0458l = this.f2891x;
        if (!c0458l.f3206fX) {
            return;
        }
        if (this.f2890w != 0.0f) {
            this.f2890w = C0773f.m2234a(this.f2890w, f);
            if (this.f2890w == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        C0465r[] c0465rArr = c0458l.f3207fY;
        if (c0465rArr != null) {
            m3682a(f, c0465rArr);
            if (c0458l != this.f2891x) {
                return;
            }
        }
        C0465r[] c0465rArr2 = c0458l.f3208fZ;
        if (c0465rArr2 != null && (((int) (GameEngine.getGameEngine().tick + this.f7166eh)) % 4 == 0 || z)) {
            m3682a(f, c0465rArr2);
            if (c0458l != this.f2891x) {
                return;
            }
        }
        C0465r[] c0465rArr3 = c0458l.f3209ga;
        if (c0465rArr3 != null) {
            if (((int) (GameEngine.getGameEngine().tick + this.f7166eh)) % 8 == 0 || z) {
                m3682a(f, c0465rArr3);
                if (c0458l != this.f2891x) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m3682a(float f, C0465r[] c0465rArr) {
        C0458l c0458l = this.f2891x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        for (C0465r c0465r : c0465rArr) {
            if (c0465r.f3369a.read(this)) {
                if (gameEngine.f6444bl && gameEngine.f6446bn && this.f1649cG) {
                    if (c0465r.f3372d != null) {
                        String str = VariableScope.nullOrMissingString + c0465r.f3372d.m4413O();
                    }
                    String str2 = "autoTrigger fired on: " + m4319cB() + " details: " + c0465r.f3369a.getDebugDetails(this);
                    GameEngine.m5572e(str2);
                    gameEngine.f6330bS.f5265i.m1958a(str2, 2000);
                }
                f2915ec.x = this.f7172eo;
                f2915ec.y = this.f7173ep;
                m3677a(c0465r.f3372d, f2915ec, (AbstractC0244am) null, 0, 0);
                this.f2890w = this.f2891x.f3267ca;
                if (c0458l != this.f2891x) {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: de */
    public C0454h mo4278de() {
        return this.f2916ed;
    }

    /* renamed from: a */
    public void m3667a(C0454h c0454h, boolean z) {
        if (z) {
            this.f2916ed = c0454h;
            return;
        }
        PlayerData.m4523b((AbstractC0244am) this);
        this.f2916ed = c0454h;
        PlayerData.m4507c(this);
    }

    /* renamed from: j */
    public void m3602j(boolean z) {
        m3667a(this.f2891x.f2953O, z);
    }

    /* renamed from: a */
    public void m3668a(C0454h c0454h) {
        C0454h mo4278de = mo4278de();
        if (mo4278de == null || mo4278de.m3698b() == 0) {
            m3667a(c0454h, false);
        } else if (C0453g.m3703b(mo4278de, c0454h)) {
        } else {
            C0455i c0455i = new C0455i(mo4278de);
            if (c0455i.m3695a(c0454h)) {
                m3667a(c0455i.m3697a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m3660b(C0454h c0454h) {
        C0454h mo4278de = mo4278de();
        if (mo4278de == null || mo4278de.m3698b() == 0 || !C0453g.m3708a(c0454h, mo4278de)) {
            return;
        }
        C0455i c0455i = new C0455i(mo4278de);
        if (c0455i.m3694b(c0454h)) {
            m3667a(c0455i.m3697a(), false);
        }
    }

    /* renamed from: dF */
    public final void m3629dF() {
        if (this.f2891x.f3171fg == EnumC0246ao.AIR) {
            if (mo3092i()) {
                m453S(5);
            } else if (mo3269cr() && this.f1628cl == 0.0f) {
                m453S(3);
            } else {
                m453S(2);
            }
        } else if (this.f1628cl == 0.0f) {
            m453S(this.f2891x.f3277cI);
        } else {
            m453S(2);
        }
        this.f7171en = 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ck */
    public boolean mo3429ck() {
        if (!this.f2891x.f3210gi) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: f */
    public boolean mo3264f() {
        return this.f2891x.f3169fd.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: j */
    public boolean mo3262j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public C1115ai mo3082D(int i) {
        C0247ap c0247ap = this.f1654cL[i];
        C0416bn c0416bn = this.f2891x.f3301fQ[i];
        float f = c0416bn.f2599X;
        float f2 = c0416bn.f2600Y;
        if (c0416bn.f2641Z != 0.0f && c0247ap.f1729m) {
            f2 += c0416bn.f2641Z;
        }
        float f3 = mo3081E() ? this.f1623cg : c0247ap.f1717a;
        C1115ai mo3078F = mo3078F(i);
        float m2123k = C0773f.m2123k(f3);
        float m2126j = C0773f.m2126j(f3);
        float f4 = mo3078F.f7064a;
        float f5 = mo3078F.f7065b;
        float f6 = mo3078F.f7066c;
        f2917ee.f7064a = f4 + ((m2123k * f) - (m2126j * f2));
        f2917ee.f7065b = f5 + (m2126j * f) + (m2123k * f2);
        f2917ee.f7066c = f6 + c0416bn.f2601aa;
        return f2917ee;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3080E(int i) {
        C1115ai mo3082D = mo3082D(i);
        f2918ef.x = mo3082D.f7064a;
        f2918ef.y = mo3082D.f7065b;
        return f2918ef;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cl */
    public boolean mo4290cl() {
        return this.f2891x.f3200fJ;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cn */
    public float mo4289cn() {
        return this.f2891x.f3299fK;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3034a(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2891x.f3101dz != null) {
            this.f2869b.m3815a(this.f2891x.f3101dz, 5);
        }
        if (this.f2891x.f3035bS) {
            this.f3931U = C0773f.m2234a(this.f3931U, f);
            if (this.f3931U == 0.0f) {
                this.f3931U = this.f2891x.f3036bT;
                if (this.f2891x.f3037bU != null) {
                    C0247ap c0247ap = this.f1654cL[i];
                    PointF mo3080E = mo3080E(i);
                    this.f2891x.f3037bU.m3489a(mo3080E.x, mo3080E.y, this.f7174eq, c0247ap.f1717a, this);
                }
                if (this.f2891x.f3038bV != null) {
                    this.f2891x.f3038bV.m3489a(abstractC0244am.f7172eo, abstractC0244am.f7173ep, abstractC0244am.f7174eq, abstractC0244am.f1623cg, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.mo3034a(abstractC0244am, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public void mo2951b(AbstractC0244am abstractC0244am, float f, int i) {
        if (this.f2891x.f3102dA != null) {
            this.f2869b.m3815a(this.f2891x.f3102dA, 5);
        }
        if (this.f2891x.f3039bW) {
            this.f3931U = C0773f.m2234a(this.f3931U, f);
            if (this.f3931U == 0.0f) {
                this.f3931U = this.f2891x.f3040bX;
                if (this.f2891x.f3041bY != null) {
                    C0247ap c0247ap = this.f1654cL[i];
                    PointF mo3080E = mo3080E(i);
                    this.f2891x.f3041bY.m3489a(mo3080E.x, mo3080E.y, this.f7174eq, c0247ap.f1717a, this);
                }
                if (this.f2891x.f3042bZ != null) {
                    this.f2891x.f3042bZ.m3489a(abstractC0244am.f7172eo, abstractC0244am.f7173ep, abstractC0244am.f7174eq, abstractC0244am.f1623cg, abstractC0244am);
                    return;
                }
                return;
            }
            return;
        }
        super.mo2951b(abstractC0244am, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cg */
    public boolean mo4294cg() {
        return this.f2892y.f2266m;
    }

    /* renamed from: dG */
    public boolean m3628dG() {
        if (this.f2891x.f2960Z != null && !this.f2891x.f2960Z.read(this)) {
            return false;
        }
        if (!this.f2892y.f2266m) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.f6312bs.m4508c(this.f1614bX) && !gameEngine.f6312bs.m4528b()) {
                return false;
            }
        }
        C0402n dn = m4270dn();
        if (dn != null && !dn.f2443o) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1759t() {
        C0402n dn = m4270dn();
        if (dn != null && dn.f2441m) {
            return true;
        }
        return this.f2891x.f2984aM;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cV */
    public boolean mo4301cV() {
        C0402n dn = m4270dn();
        if (dn != null && dn.f2442n) {
            return true;
        }
        return this.f2891x.f2985aN;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3096d(AbstractC0244am abstractC0244am) {
        C0458l c0458l = this.f2891x;
        return ((c0458l.f2990aS != null && !C0453g.m3708a(c0458l.f2990aS, abstractC0244am.mo4278de())) || m3627dH() || c0458l.f2986aO) ? false : true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cW */
    public boolean mo4300cW() {
        return this.f2891x.f2991aT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cT */
    public boolean mo4303cT() {
        return this.f2891x.f2986aO || mo1758u() || (this.f1629cm < 1.0f && this.f2891x.f3002bh <= 0.0f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dh */
    public C0454h mo4276dh() {
        return this.f2891x.f2954P;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: am */
    public float mo2972am() {
        return this.f2891x.f3154eG;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: an */
    public boolean mo2971an() {
        return super.mo2971an() || this.f2891x.f3153eF;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public boolean mo2366a(GameEngine gameEngine) {
        if (!gameEngine.f6465cO.m5261b(this.f7172eo, this.f7173ep)) {
            if (!this.f2891x.f2942B) {
                return false;
            }
            boolean z = false;
            if (this.f2891x.f2943C != null) {
                C0458l.f3217a.m5280a(this.f2891x.f2943C);
                C0458l.f3217a.m5282a((int) this.f7172eo, (int) this.f7173ep);
                if (gameEngine.f6467cQ.m5276b(C0458l.f3217a)) {
                    z = true;
                }
            }
            if (gameEngine.f6465cO.m5261b(this.f7172eo, this.f7173ep - this.f7174eq)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.f1656cN != null) {
            return false;
        }
        if ((this.f1658cP != null && this.f1658cP.f2456I) || !m4282d(gameEngine.f6312bs) || !m3628dG()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public AbstractC0629y m3672a(C0402n c0402n) {
        return C0401m.m3951a(this, c0402n);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public C0402n mo3014a(short s) {
        return C0401m.m3947a(this, s);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3020a(AbstractC0629y abstractC0629y, C0402n c0402n) {
        if (abstractC0629y == this) {
            return false;
        }
        if (c0402n == null) {
            GameEngine.print("attachRequest: No attachedSlotData");
            return false;
        }
        AbstractC0629y m3951a = C0401m.m3951a(this, c0402n);
        if (m3951a != null) {
            GameEngine.print("attachRequest: a unit is already in slot (parent:" + m4319cB() + " slot:" + c0402n.m3940b() + " existing:" + m3951a.m4318cC() + ")");
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0401m.m3950a(this, c0402n, abstractC0629y);
        abstractC0629y.f1657cO = this;
        abstractC0629y.f1658cP = c0402n;
        abstractC0629y.f1659cQ = gameEngine.f6315by;
        abstractC0629y.f1610bT = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public boolean mo2946b(AbstractC0629y abstractC0629y) {
        if (abstractC0629y.f1657cO != this) {
            GameEngine.print("deattachRequest: unit is not attached");
            return false;
        }
        C0402n c0402n = abstractC0629y.f1658cP;
        if (c0402n == null) {
            GameEngine.print("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        AbstractC0629y m3951a = C0401m.m3951a(this, c0402n);
        if (m3951a == null) {
            GameEngine.print("deattachRequest: Failed, no unit in slot");
            GameEngine.m998g("deattachRequest");
            return false;
        } else if (abstractC0629y != m3951a) {
            String str = "null";
            if (m3951a != null) {
                str = m3951a.m4319cB();
            }
            GameEngine.print("deattachRequest: unit and slot don't match - requested:" + abstractC0629y.m4319cB() + " current:" + str);
            return false;
        } else {
            if (this.f2895B.remove(abstractC0629y)) {
                m3691D(abstractC0629y);
            }
            C0401m.m3950a(this, c0402n, (AbstractC0629y) null);
            abstractC0629y.f1657cO = null;
            abstractC0629y.f1658cP = null;
            abstractC0629y.mo3094f_();
            m4344a(EnumC0348af.attachmentRemoved, this);
            return true;
        }
    }

    /* renamed from: dH */
    public boolean m3627dH() {
        C0402n dn = m4270dn();
        if (dn != null && !dn.f2440l) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: J */
    public boolean mo3100J() {
        if (m3627dH() || this.f2891x.f2987aP) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: di */
    public void mo4275di() {
        C0458l c0458l = this.f2891x;
        if (!c0458l.f3275cv.m3846c()) {
            c0458l.f3275cv.mo3830a(this);
        }
        if (!c0458l.f3276cw.m3846c() && this.f1629cm >= 1.0f) {
            c0458l.f3276cw.mo3830a(this);
        }
        super.mo4275di();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dj */
    public void mo4274dj() {
        C0458l c0458l = this.f2891x;
        if (!c0458l.f3275cv.m3846c()) {
            c0458l.f3275cv.m3833h(this);
        }
        if (!c0458l.f3276cw.m3846c() && this.f1629cm >= 1.0f) {
            c0458l.f3276cw.m3833h(this);
        }
        super.mo4274dj();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3026a(C0305au c0305au) {
        m4345a(EnumC0348af.newWaypointGivenByPlayer);
        C0402n dn = m4270dn();
        if (dn != null && dn.f2434H) {
            EnumC0306av m4172d = c0305au.m4172d();
            if (m4172d == EnumC0306av.attackMove || m4172d == EnumC0306av.move) {
                m2912bx();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: c_ */
    public boolean mo4297c_() {
        C0458l c0458l = this.f2891x;
        if (!c0458l.f2989aR && GameEngine.getGameEngine().f6312bs.m4508c(this.f1614bX)) {
            return false;
        }
        return c0458l.f2988aQ;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dk */
    public boolean mo4273dk() {
        return this.f2891x.f2961aa;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dl */
    public boolean mo4272dl() {
        return this.f2891x.f3293eK;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dm */
    public boolean mo4271dm() {
        return this.f2891x.f3294eL;
    }

    /* renamed from: G */
    public boolean m3688G(AbstractC0244am abstractC0244am) {
        int m3626dI = m3626dI();
        int mo3292cw = abstractC0244am.mo3292cw();
        if (this.f2891x.f3158eO) {
            mo3292cw = 1;
        }
        if (m3626dI + mo3292cw <= this.f2891x.f3295eM) {
            return true;
        }
        return false;
    }

    /* renamed from: dI */
    public int m3626dI() {
        int i = 0;
        if (this.f2891x.f3158eO) {
            i = 0 + this.f2895B.size();
        } else if (this.f2895B.f7109a > 0) {
            Iterator it = this.f2895B.iterator();
            while (it.hasNext()) {
                i += ((AbstractC0244am) it.next()).mo3292cw();
            }
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public void mo4265e(PlayerData playerData) {
        C0402n m4270dn;
        if (this.f1614bX == playerData) {
            return;
        }
        super.mo4265e(playerData);
        if (this.f2895B != null && !this.f2891x.f3166eX) {
            Iterator it = this.f2895B.iterator();
            while (it.hasNext()) {
                ((AbstractC0244am) it.next()).mo4265e(playerData);
            }
        }
        if (this.f2896C != null) {
            Iterator it2 = this.f2896C.iterator();
            while (it2.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it2.next();
                if (abstractC0244am != null && (m4270dn = abstractC0244am.m4270dn()) != null && !m4270dn.f2431z) {
                    abstractC0244am.mo4265e(playerData);
                }
            }
        }
        m4345a(EnumC0348af.teamChanged);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cN */
    public C0429b mo4309cN() {
        return this.f2891x.f3049ci;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ch */
    public void mo4293ch() {
        if (this.f2891x.f3013bs) {
            if (this.f1637cu <= -1.0f) {
                this.f1637cu = -1.0f;
                return;
            }
            return;
        }
        super.mo4293ch();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bz */
    public C1136m mo2910bz() {
        return this.f2895B;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public C1136m mo4263e(boolean z) {
        this.f2919eg.clear();
        if (this.f2891x.f3258aA.f7109a > 0) {
            C0401m.m3948a(this, this.f2919eg, z);
        }
        if (this.f2919eg.f7109a > 0) {
            return this.f2919eg;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: do */
    public float mo4269do() {
        return this.f2891x.f3084de;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dp */
    public boolean mo4268dp() {
        return this.f2891x.f3238A;
    }

    /* renamed from: dJ */
    public void m3625dJ() {
        if (this.f2892y.f2254a) {
            this.f2892y = this.f2892y.m3992b();
        }
    }
}