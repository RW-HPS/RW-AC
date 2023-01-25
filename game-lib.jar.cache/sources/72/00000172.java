package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.game.units.p024d.C0494e;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;
import com.corrodinggames.rts.game.units.p027f.C0546f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1147u;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/i.class */
public class C0164i extends AbstractC0170o {

    /* renamed from: a */
    float f690a;

    /* renamed from: b */
    EnumC0165j f691b;

    /* renamed from: c */
    EnumC0166k f692c;

    /* renamed from: d */
    float f693d;

    /* renamed from: e */
    float f694e;

    /* renamed from: f */
    float f695f;

    /* renamed from: g */
    float f696g;

    /* renamed from: h */
    int f697h;

    /* renamed from: i */
    float f698i;

    /* renamed from: j */
    float f699j;

    /* renamed from: k */
    float f700k;

    /* renamed from: l */
    float f701l;

    /* renamed from: m */
    float f702m;

    /* renamed from: n */
    boolean f703n;

    /* renamed from: o */
    boolean f704o;

    /* renamed from: p */
    C1136m f705p;

    /* renamed from: q */
    C1147u f706q;

    /* renamed from: r */
    C1147u f707r;

    /* renamed from: s */
    boolean f708s;

    /* renamed from: t */
    boolean f709t;

    /* renamed from: u */
    float f710u;

    /* renamed from: v */
    float f711v;

    /* renamed from: w */
    PointF f712w;

    /* renamed from: x */
    PointF f713x;

    /* renamed from: y */
    int f714y;

    /* renamed from: z */
    InterfaceC0303as f715z;

    /* renamed from: A */
    C0429b f716A;

    /* renamed from: B */
    C0429b f717B;

    /* renamed from: C */
    int f718C;

    /* renamed from: D */
    int f719D;

    /* renamed from: E */
    String f720E;

    /* renamed from: F */
    int f721F;

    /* renamed from: G */
    int f722G;

    /* renamed from: H */
    boolean f723H;

    /* renamed from: I */
    int f724I;

    /* renamed from: J */
    int f725J;

    /* renamed from: K */
    int f726K;

    /* renamed from: L */
    int f727L;

    /* renamed from: M */
    boolean f728M;

    /* renamed from: N */
    ArrayList f729N;

    /* renamed from: O */
    InterfaceC0303as f730O;

    /* renamed from: P */
    C0429b f731P;

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo1977a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeEnum(this.f691b);
        gameOutputStream.writeEnum(this.f692c);
        gameOutputStream.writeFloat(this.f693d);
        gameOutputStream.writeFloat(this.f694e);
        gameOutputStream.writeFloat(this.f695f);
        gameOutputStream.writeFloat(this.f696g);
        gameOutputStream.writeFloat(this.f698i);
        gameOutputStream.writeFloat(this.f699j);
        gameOutputStream.writeFloat(this.f700k);
        gameOutputStream.writeFloat(this.f701l);
        gameOutputStream.writeByte(4);
        gameOutputStream.writeFloat(this.f711v);
        gameOutputStream.writeFloat(this.f702m);
        gameOutputStream.writeBoolean(this.f703n);
        gameOutputStream.writeBoolean(this.f704o);
        gameOutputStream.writeInt(this.f697h);
        super.mo1977a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o
    /* renamed from: a */
    public void mo4790a(GameInputStream gameInputStream) {
        this.f691b = (EnumC0165j) gameInputStream.m1322b(EnumC0165j.class);
        this.f692c = (EnumC0166k) gameInputStream.m1322b(EnumC0166k.class);
        this.f693d = gameInputStream.readFloat();
        this.f694e = gameInputStream.readFloat();
        this.f695f = gameInputStream.readFloat();
        this.f696g = gameInputStream.readFloat();
        this.f698i = gameInputStream.readFloat();
        this.f699j = gameInputStream.readFloat();
        this.f700k = gameInputStream.readFloat();
        this.f701l = gameInputStream.readFloat();
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.f711v = gameInputStream.readFloat();
        }
        if (readByte >= 2) {
            this.f702m = gameInputStream.readFloat();
        }
        if (readByte >= 3) {
            this.f703n = gameInputStream.readBoolean();
            this.f704o = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.f697h = gameInputStream.readInt();
        }
        super.mo4790a(gameInputStream);
    }

    public C0164i(C0136a c0136a, float f, float f2) {
        super(c0136a, f, f2);
        this.f693d = -1.0f;
        this.f696g = 100.0f;
        this.f698i = 50.0f;
        this.f699j = 50.0f;
        this.f705p = new C1136m();
        this.f706q = new C1147u();
        this.f707r = new C1147u();
        this.f711v = 0.0f;
        this.f712w = new PointF();
        this.f713x = new PointF();
        this.f723H = false;
        this.f729N = new ArrayList();
    }

    /* renamed from: a */
    public PointF m4850a() {
        C0180g m4716e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF pointF = null;
        int i = (int) (this.f764U * gameEngine.f6323bL.f790r);
        gameEngine.f6323bL.m4770a(this.f762S, this.f763T);
        int i2 = gameEngine.f6323bL.f802T;
        int i3 = gameEngine.f6323bL.f803U;
        for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
            for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                if (gameEngine.f6323bL.m4726c(i4, i5) && (m4716e = gameEngine.f6323bL.m4716e(i4, i5)) != null && m4716e.f923i) {
                    AbstractC0244am m3422b = AbstractC0493d.m3422b(i4, i5);
                    boolean z = false;
                    if (m3422b == null) {
                        z = true;
                    }
                    if (m3422b != null && (m3422b instanceof AbstractC0629y) && !((AbstractC0629y) m3422b).mo5568r().mo4195p()) {
                        z = true;
                    }
                    if (z) {
                        gameEngine.f6323bL.m4766a(i4, i5);
                        if (pointF == null || C0773f.rand(0, 100) < 50) {
                            this.f712w.setSite(gameEngine.f6323bL.f802T + gameEngine.f6323bL.f788p, gameEngine.f6323bL.f803U + gameEngine.f6323bL.f789q);
                            pointF = this.f712w;
                        }
                    }
                }
            }
        }
        return pointF;
    }

    /* renamed from: a */
    public void m4837a(AbstractC0629y abstractC0629y) {
        this.f706q.remove(abstractC0629y);
    }

    /* renamed from: b */
    public void m4832b() {
        this.f705p.clear();
        this.f706q.clear();
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && !abstractC0244am.f1612bV && !abstractC0244am.mo1758u() && m4846a(abstractC0244am)) {
                this.f706q.mo500a(abstractC0244am);
                InterfaceC0303as interfaceC0303as = abstractC0244am.f1694dz;
                if (!this.f705p.contains(interfaceC0303as)) {
                    this.f705p.add(interfaceC0303as);
                }
            }
        }
    }

    /* renamed from: a */
    public boolean m4843a(InterfaceC0303as interfaceC0303as) {
        if (m4839a(interfaceC0303as, false, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4830b(InterfaceC0303as interfaceC0303as) {
        if ((GameEngine.getGameEngine().f6441ar && !interfaceC0303as.mo4215C()) || interfaceC0303as.mo4191w()) {
            return false;
        }
        Object[] m540a = this.f705p.m540a();
        int size = this.f705p.size();
        for (int i = 0; i < size; i++) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) m540a[i];
            AbstractC0244am[] m504a = this.f706q.m504a();
            int i2 = 0;
            int size2 = this.f706q.size();
            while (true) {
                if (i2 < size2) {
                    AbstractC0244am abstractC0244am = m504a[i2];
                    if (abstractC0244am.mo5568r() != interfaceC0303as2 || !(abstractC0244am instanceof AbstractC0629y)) {
                        i2++;
                    } else if (((AbstractC0629y) abstractC0244am).m2948b(interfaceC0303as, true)) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    /* renamed from: c */
    public InterfaceC0303as m4829c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f761R.f586aY) {
            return null;
        }
        int m4848a = m4848a(this.f761R.f616bC);
        InterfaceC0303as interfaceC0303as = null;
        float f = -1.0f;
        Iterator it = EnumC0249ar.f1796ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as2 = (InterfaceC0303as) it.next();
            if (interfaceC0303as2.mo4201j() && m4830b(interfaceC0303as2)) {
                int m4969a = this.f761R.m4969a(interfaceC0303as2, EnumC0157b.include);
                int m4827c = m4827c(interfaceC0303as2);
                boolean z = false;
                if (interfaceC0303as2 instanceof C0458l) {
                    z = true;
                    C0458l c0458l = (C0458l) interfaceC0303as2;
                    if (c0458l.f3300fL.size() != 0) {
                        Iterator it2 = c0458l.f3300fL.iterator();
                        while (it2.hasNext()) {
                            InterfaceC0303as interfaceC0303as3 = (InterfaceC0303as) it2.next();
                            m4969a += this.f761R.m4969a(interfaceC0303as3, EnumC0157b.include);
                            m4827c += m4827c(interfaceC0303as3);
                        }
                    }
                }
                float f2 = -2.0f;
                if (interfaceC0303as2.mo4195p() && !z) {
                    int i = m4827c;
                    if (m4850a() != null && C0773f.rand(0, 100) < 90) {
                        if (i == 0) {
                            if (this.f761R.credits < 5000.0d) {
                                f2 = 0.98f;
                            } else {
                                f2 = 0.58f;
                            }
                        }
                        if (i == 1) {
                            f2 = 0.55f;
                        }
                        if (i == 2) {
                            f2 = 0.4f;
                        }
                        if (i >= 3) {
                            f2 = 0.25f / i;
                        }
                        if (m4969a >= 3) {
                            f2 = (float) (f2 * 0.6d);
                        }
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.landFactory && (m4969a < 5 || m4848a == 0)) {
                    if (m4969a == 0) {
                        f2 = 0.8f;
                    } else if (m4827c < 2) {
                        f2 = 0.46f / (m4969a + (m4827c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.seaFactory && this.f761R.m4955ah() && (m4969a < 5 || m4848a == 0)) {
                    if (m4969a == 0) {
                        f2 = 0.3f;
                    } else if (m4827c < 1) {
                        f2 = 0.1f / (m4969a + (m4827c * 2));
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.airFactory && (m4969a < 5 || m4848a == 0)) {
                    if (m4969a == 0) {
                        f2 = 0.48f;
                    } else if (m4827c < 2) {
                        f2 = 0.29f / (m4969a + m4827c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.turret) {
                    if (m4827c == 0) {
                        f2 = 0.47f;
                    } else if (m4827c < 3) {
                        f2 = 0.35f / m4827c;
                    } else if (m4827c < 4) {
                        f2 = 0.025f / m4827c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.laserDefence && m4827c == 0) {
                    f2 = 0.018f;
                }
                if (interfaceC0303as2 == EnumC0249ar.repairbay && m4827c == 0) {
                    f2 = 0.02f;
                }
                if (interfaceC0303as2 == EnumC0249ar.antiAirTurret) {
                    if (m4827c == 0) {
                        f2 = 0.42f;
                    } else if (this.f761R.m4960ac()) {
                        if (m4827c < 4) {
                            f2 = 0.3f / m4827c;
                        }
                    } else if (m4827c < 3) {
                        f2 = 0.3f / m4827c;
                    } else if (m4827c < 4) {
                        f2 = 0.02f / m4827c;
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.fabricator && this.f761R.credits > 2000.0d && m4827c < 5) {
                    if (m4969a == 0) {
                        f2 = 0.11f;
                    } else {
                        f2 = 0.07f / ((0.2f * m4969a) + m4827c);
                    }
                }
                if (interfaceC0303as2 == EnumC0249ar.AntiNukeLaucher && ((!gameEngine.m1102O() || !gameEngine.netEngine.gameMapData.nukes) && this.f761R.credits > 2200.0d && m4969a < 4)) {
                    if (m4969a == 0) {
                        f2 = 0.06f;
                    } else if (m4827c < 1) {
                        f2 = 0.05f / (m4969a + (m4827c * 2));
                    }
                }
                if (z) {
                    C0458l c0458l2 = (C0458l) interfaceC0303as2;
                    if (!c0458l2.f3187fw && ((m4969a < c0458l2.f3188fx || c0458l2.f3188fx == -1) && (m4827c < c0458l2.f3189fy || c0458l2.f3189fy == -1))) {
                        f2 = c0458l2.f3190fz;
                        if (m4827c < c0458l2.f3191fA) {
                            f2 = c0458l2.f3192fB;
                        }
                        if (m4827c == 0) {
                            f2 += c0458l2.f3193fC;
                        }
                        if (m4969a == 0) {
                            f2 += c0458l2.f3194fD;
                        }
                        if (interfaceC0303as2.mo4195p() && m4850a() == null) {
                            f2 = -2.0f;
                        }
                    }
                }
                if (this.f761R.m4959ad() && interfaceC0303as2 == EnumC0249ar.experimentalLandFactory && this.f761R.credits > 15000.0d) {
                    if (m4969a == 0) {
                        f2 = 0.04f;
                    }
                    if (this.f761R.credits > 55000.0d && m4969a == 1) {
                        f2 = 0.03f;
                    }
                }
                if (f2 >= 0.0f && (f2 > f || C0773f.m2167c(0.0f, 1.0f) < 0.01d)) {
                    f = f2;
                    interfaceC0303as = interfaceC0303as2;
                }
            }
        }
        this.f695f = f;
        return interfaceC0303as;
    }

    /* renamed from: a */
    public int m4848a(AbstractC0159d abstractC0159d) {
        int i = 0;
        Iterator it = abstractC0159d.f651c.iterator();
        while (it.hasNext()) {
            i += m4827c(((C0160e) it.next()).f654a);
        }
        return i;
    }

    /* renamed from: c */
    public int m4827c(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        C1147u c1147u = this.f706q;
        AbstractC0244am[] m504a = c1147u.m504a();
        int size = c1147u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m504a[i2];
            if (abstractC0244am.f1614bX == this.f761R && abstractC0244am.f1694dz == interfaceC0303as && m4846a(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: d */
    public int m4826d() {
        int i = 0;
        C1147u c1147u = this.f706q;
        AbstractC0244am[] m504a = c1147u.m504a();
        int size = c1147u.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m504a[i2];
            if (abstractC0244am.f1614bX == this.f761R && (abstractC0244am instanceof AbstractC0629y)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (m4834a(abstractC0629y, false) && !abstractC0629y.f1603bM && abstractC0629y.f3979aB == null && this.f761R.m4924h(abstractC0629y) && this.f761R.m4922i(abstractC0629y)) {
                    i++;
                }
            }
        }
        return i;
    }

    /* renamed from: e */
    public int m4823e() {
        return this.f726K;
    }

    /* renamed from: f */
    public boolean m4822f() {
        return m4818h() != 0;
    }

    /* renamed from: g */
    public AbstractC0244am m4820g() {
        float f = this.f764U + 120.0f;
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f7172eo + f > this.f762S && abstractC0244am.f7172eo - f < this.f762S && abstractC0244am.f7173ep + f > this.f763T && abstractC0244am.f7173ep - f < this.f763T && abstractC0244am.f1614bX != this.f761R && m4791a(abstractC0244am, 120.0f) && abstractC0244am.f1614bX.m4508c(this.f761R) && this.f761R.m4920j(abstractC0244am)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: h */
    public int m4818h() {
        return m4849a(60.0f);
    }

    /* renamed from: a */
    public int m4849a(float f) {
        int i = 0;
        float f2 = this.f764U + f;
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i2 = 0; i2 < size; i2++) {
            AbstractC0244am abstractC0244am = m504a[i2];
            if (abstractC0244am.f7172eo + f2 > this.f762S && abstractC0244am.f7172eo - f2 < this.f762S && abstractC0244am.f7173ep + f2 > this.f763T && abstractC0244am.f7173ep - f2 < this.f763T && abstractC0244am.f1614bX != this.f761R && m4791a(abstractC0244am, f) && abstractC0244am.f1614bX.m4508c(this.f761R) && abstractC0244am.mo3091l() && this.f761R.m4920j(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public void m4817i() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0244am m4820g = m4820g();
        if (m4820g != null) {
            SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
            AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
            int size = AbstractC0244am.f1594bE.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m504a[i];
                if (abstractC0244am instanceof AbstractC0629y) {
                    AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                    if (abstractC0244am.f1614bX == this.f761R && this.f761R.m4936b(abstractC0244am, m4820g) && this.f761R.m4922i(abstractC0629y) && abstractC0629y.m2968aq()) {
                        if (!abstractC0244am.f1603bM) {
                            if (C0136a.m4974a(abstractC0244am, this.f762S, this.f763T, 800.0f)) {
                                m2445a.m2343a(abstractC0629y);
                            }
                        } else if (C0136a.m4974a(abstractC0244am, this.f762S, this.f763T, 540.0f)) {
                            m2445a.m2343a(abstractC0629y);
                        }
                    }
                }
            }
            m2445a.m2345a(m4820g);
        }
    }

    /* renamed from: a */
    public boolean m4846a(AbstractC0244am abstractC0244am) {
        return m4844a(abstractC0244am, false);
    }

    /* renamed from: a */
    public boolean m4844a(AbstractC0244am abstractC0244am, boolean z) {
        if ((abstractC0244am instanceof AbstractC0629y) && ((AbstractC0629y) abstractC0244am).f3980aC == this) {
            if (!z || m4789b(abstractC0244am)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4834a(AbstractC0629y abstractC0629y, boolean z) {
        if (abstractC0629y.f3980aC == this) {
            if (!z || m4789b(abstractC0629y)) {
                return true;
            }
            return false;
        }
        return false;
    }

    /* renamed from: j */
    public int m4816j() {
        int i = 0;
        Iterator it = m4815k().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (this.f761R != abstractC0244am.f1614bX && abstractC0244am.f1614bX.m4508c(this.f761R) && (abstractC0244am instanceof AbstractC0629y) && m4789b(abstractC0244am)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: k */
    public C0546f m4815k() {
        return GameEngine.getGameEngine().f6340cc.m3224b(this.f762S, this.f763T, this.f764U);
    }

    /* renamed from: x */
    private AbstractC0629y m4804x() {
        return m4842a((InterfaceC0303as) null, (PointF) null, true);
    }

    /* renamed from: y */
    private AbstractC0629y m4803y() {
        return m4821f(null);
    }

    /* renamed from: f */
    private AbstractC0629y m4821f(InterfaceC0303as interfaceC0303as) {
        return m4842a(interfaceC0303as, (PointF) null, false);
    }

    /* renamed from: a */
    private AbstractC0629y m4842a(InterfaceC0303as interfaceC0303as, PointF pointF, boolean z) {
        if (this.f726K == 0) {
            return null;
        }
        this.f714y = 0;
        float f = Float.MAX_VALUE;
        AbstractC0629y abstractC0629y = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (interfaceC0303as != null && ((gameEngine.f6441ar && !interfaceC0303as.mo4215C()) || interfaceC0303as.mo4191w())) {
            return null;
        }
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && m4846a(abstractC0244am) && abstractC0244am.f1656cN == null && abstractC0244am.mo2975aj() && (abstractC0244am instanceof AbstractC0629y) && this.f761R.m4922i(abstractC0244am)) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am;
                if (C0161f.m4884a(abstractC0629y2) && (!z || abstractC0629y2.mo3073I())) {
                    this.f714y++;
                    if (interfaceC0303as == null || abstractC0629y2.m2948b(interfaceC0303as, true)) {
                        boolean z2 = false;
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0773f.m2232a(pointF.x, pointF.y, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
                        }
                        if (abstractC0629y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0773f.m2167c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            abstractC0629y = (AbstractC0629y) abstractC0244am;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0629y;
    }

    /* renamed from: a */
    private AbstractC0629y m4845a(AbstractC0244am abstractC0244am, PointF pointF, boolean z) {
        if (this.f727L == 0) {
            return null;
        }
        float f = Float.MAX_VALUE;
        AbstractC0629y abstractC0629y = null;
        GameEngine.getGameEngine();
        AbstractC0244am[] m504a = this.f706q.m504a();
        int size = this.f706q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m504a[i];
            if (abstractC0244am2.f1614bX == this.f761R && m4846a(abstractC0244am2) && abstractC0244am2.f1656cN == null) {
                InterfaceC0303as mo5568r = abstractC0244am2.mo5568r();
                if (mo5568r.mo4197n() && (abstractC0244am2 instanceof AbstractC0629y) && this.f761R.m4922i(abstractC0244am2)) {
                    AbstractC0629y abstractC0629y2 = (AbstractC0629y) abstractC0244am2;
                    if (C0161f.m4881b(abstractC0629y2) && ((!z || abstractC0629y2.mo3073I()) && (abstractC0244am == null || abstractC0629y2.mo4258h(abstractC0244am, true)))) {
                        boolean z2 = false;
                        if (mo5568r instanceof C0458l) {
                            C0458l c0458l = (C0458l) mo5568r;
                            if (c0458l.f3198fH != null && !m4838a(c0458l.f3198fH)) {
                            }
                        }
                        float f2 = -1.0f;
                        if (pointF != null) {
                            f2 = C0773f.m2232a(pointF.x, pointF.y, abstractC0244am2.f7172eo, abstractC0244am2.f7173ep);
                        }
                        if (abstractC0629y == null) {
                            z2 = true;
                        } else {
                            if (pointF != null && f2 < f) {
                                z2 = true;
                            }
                            if (C0773f.m2167c(0.0f, 1.0f) < 0.2d) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            abstractC0629y = (AbstractC0629y) abstractC0244am2;
                            if (pointF != null) {
                                f = f2;
                            }
                        }
                    }
                }
            }
        }
        return abstractC0629y;
    }

    /* renamed from: g */
    private boolean m4819g(InterfaceC0303as interfaceC0303as) {
        PointF e;
        AbstractC0629y m4842a;
        this.f715z = interfaceC0303as;
        this.f716A = null;
        this.f717B = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (interfaceC0303as.mo4195p()) {
            e = m4850a();
        } else {
            e = m4785e(interfaceC0303as);
        }
        if (e == null || (m4842a = m4842a(interfaceC0303as, e, false)) == null) {
            return false;
        }
        if (interfaceC0303as == EnumC0249ar.seaFactory) {
            int m456c = C1152y.m456c(e.x, e.y, EnumC0246ao.WATER);
            this.f761R.getClass();
            if (m456c < 3000) {
                return false;
            }
        }
        int i = 1;
        AbstractC0224s m3027a = m4842a.m3027a(interfaceC0303as, true);
        if (m3027a != null) {
            i = m3027a.mo4398t();
        } else {
            GameEngine.print("buildBuilding: could not find getBuildUnitAction for builder this shouldn't happen:" + interfaceC0303as.mo4202i());
        }
        if (!m3027a.mo3118b(m4842a) || !m3027a.mo3120a((AbstractC0244am) m4842a, false)) {
            if (!this.f761R.m4967a(m3027a.mo4102B(), m4842a)) {
                this.f716A = m3027a.mo4102B();
                this.f717B = this.f716A.m3832i(m4842a);
                return true;
            }
            return true;
        } else if (m3027a.mo4103A()) {
            SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
            m2445a.m2343a(m4842a);
            m2445a.m2347a(m3027a.m4414N(), e, (AbstractC0244am) null);
            return true;
        } else {
            SyncPacket m2445a2 = gameEngine.f6343cf.m2445a(this.f761R);
            m2445a2.m2343a(m4842a);
            m2445a2.m2352a(e.x, e.y, interfaceC0303as, i);
            return true;
        }
    }

    /* renamed from: z */
    private boolean m4802z() {
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && m4846a(abstractC0244am) && abstractC0244am.m4326bT() && !abstractC0244am.mo1758u() && (abstractC0244am instanceof AbstractC0629y) && ((AbstractC0629y) abstractC0244am).m2976ai()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4838a(C0454h c0454h) {
        C0454h mo4278de;
        AbstractC0244am[] m504a = this.f706q.m504a();
        int size = this.f706q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && abstractC0244am.m4326bT() && (mo4278de = abstractC0244am.mo4278de()) != null && C0453g.m3708a(c0454h, mo4278de)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private AbstractC0629y m4839a(InterfaceC0303as interfaceC0303as, boolean z, boolean z2) {
        AbstractC0244am[] m504a = this.f706q.m504a();
        int size = this.f706q.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && abstractC0244am.m4326bT() && this.f761R.m4922i(abstractC0244am) && (abstractC0244am instanceof InterfaceC0506l) && (abstractC0244am instanceof AbstractC0629y)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                InterfaceC0506l interfaceC0506l = (InterfaceC0506l) abstractC0244am;
                AbstractC0224s mo3392e = abstractC0244am.mo3392e(interfaceC0303as);
                if (mo3392e != null && ((interfaceC0506l.mo3355dy() || !z) && !mo3392e.mo4081m(abstractC0244am) && mo3392e.mo3118b(abstractC0629y) && mo3392e.mo3120a((AbstractC0244am) abstractC0629y, false) && ((!(abstractC0244am instanceof C0494e) || interfaceC0303as.mo4198m() || m4806u() <= 2 || this.f708s || !z) && (!z2 || abstractC0629y.f3981aD)))) {
                    return abstractC0629y;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    private boolean m4847a(AbstractC0159d abstractC0159d, boolean z) {
        Iterator it = abstractC0159d.m4894a().iterator();
        while (it.hasNext()) {
            if (m4841a(((C0160e) it.next()).f654a, z)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    private boolean m4841a(InterfaceC0303as interfaceC0303as, boolean z) {
        return m4840a(interfaceC0303as, z, 1);
    }

    /* renamed from: a */
    private boolean m4840a(InterfaceC0303as interfaceC0303as, boolean z, int i) {
        if (i < 1) {
            GameEngine.m1023b("AI", "buildUnit: quantity cannot be < 1");
            return false;
        }
        AbstractC0629y m4839a = m4839a(interfaceC0303as, true, z);
        if (m4839a == null) {
        }
        if (m4839a == null) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0224s e = m4839a.mo3392e(interfaceC0303as);
        if (e == null) {
            GameEngine.m1023b("AI", "buildUnit: action is null!");
            return false;
        } else if (!e.mo3118b(m4839a)) {
            GameEngine.m1023b("AI", "buildUnit: isAvailable==false");
            return false;
        } else if (!e.mo3120a((AbstractC0244am) m4839a, false)) {
            GameEngine.m1023b("AI", "buildUnit: isActive==false");
            return false;
        } else if (e.mo4087g(m4839a)) {
            return false;
        } else {
            if (e.mo4401n_() && gameEngine.f6441ar) {
                return false;
            }
            for (int i2 = 0; i2 < i; i2++) {
                SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
                m2445a.m2343a(m4839a);
                m2445a.m2348a(e.mo4394z());
            }
            return true;
        }
    }

    /* renamed from: l */
    C0164i m4814l() {
        C0164i c0164i;
        float f = -1.0f;
        C0164i c0164i2 = null;
        Iterator it = this.f761R.f601bn.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && (c0164i = (C0164i) abstractC0170o) != this && c0164i.m4823e() > 1) {
                float a = c0164i.m4792a(this);
                if (c0164i2 == null || a < f) {
                    f = a;
                    c0164i2 = c0164i;
                }
            }
        }
        return c0164i2;
    }

    /* renamed from: m */
    public void m4813m() {
        AbstractC0629y m4804x;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0164i m4814l = m4814l();
        if (m4814l != null && m4814l.m4823e() > 1 && (m4804x = m4814l.m4804x()) != null) {
            PointF w = m4783w();
            if (C1152y.m475a(m4804x, w.x, w.y)) {
                boolean m4975a = this.f761R.m4975a(m4804x, w.x, w.y);
                if (m4975a || this.f761R.f568aG != 0) {
                    SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
                    m2445a.m2343a(m4804x);
                    m2445a.m2353a(w.x, w.y);
                    this.f697h++;
                    this.f696g = C0773f.rand(1800, 2500);
                    if (this.f697h >= 2) {
                        this.f696g += 11000.0f;
                    }
                    m4814l.f726K--;
                    if (!m4975a) {
                        boolean z = true;
                        if (m4804x.f3979aB != null) {
                            if (!m4804x.f3979aB.mo4861a()) {
                                m4804x.f3979aB.m4857b(m4804x);
                            } else {
                                z = false;
                                if (!m4804x.f3979aB.f689G.contains(m4804x)) {
                                    m4804x.f3979aB.f689G.add(m4804x);
                                }
                            }
                        }
                        if (z) {
                            C0167l c0167l = new C0167l(this.f761R);
                            c0167l.m4800c(m4804x);
                            c0167l.f762S = w.x;
                            c0167l.f763T = w.y;
                        }
                        this.f696g = C0773f.rand(12000, 14000);
                    }
                }
            }
        }
    }

    /* renamed from: A */
    private AbstractC0244am m4851A() {
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m504a[i];
            if (abstractC0244am.f1614bX == this.f761R && m4844a(abstractC0244am, true) && abstractC0244am.mo3421bI() && (abstractC0244am.f1637cu < abstractC0244am.f1638cv - 1.0f || abstractC0244am.f1629cm < 1.0f)) {
                return abstractC0244am;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m4812n() {
        GameEngine.getGameEngine();
        if (this.f707r.size() == 0 || this.f708s) {
            return;
        }
        for (int i = 0; i < 8; i++) {
            InterfaceC0303as m4887c = this.f761R.f614bA.m4887c();
            if (m4887c != null && m4843a(m4887c) && m4824d(m4887c)) {
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b8  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00bb A[SYNTHETIC] */
    /* renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean m4824d(InterfaceC0303as interfaceC0303as) {
        if (!(interfaceC0303as instanceof C0458l)) {
            return false;
        }
        C0458l c0458l = (C0458l) interfaceC0303as;
        if (c0458l.f3195fE == -1 && c0458l.f3196fF == -1) {
            return false;
        }
        int i = 0;
        int i2 = 0;
        boolean z = c0458l.f3197fG;
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i3 = 0; i3 < size; i3++) {
            AbstractC0244am abstractC0244am = m504a[i3];
            if (abstractC0244am.f1614bX == this.f761R && abstractC0244am.f1656cN == null && (abstractC0244am instanceof AbstractC0629y) && this.f761R.m4922i(abstractC0244am)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                InterfaceC0303as mo5568r = abstractC0244am.mo5568r();
                if (z) {
                    if (!mo5568r.mo4197n()) {
                    }
                    i2++;
                    if (!m4846a(abstractC0244am)) {
                        i++;
                    }
                } else {
                    if (mo5568r != c0458l && !c0458l.f3300fL.contains(mo5568r)) {
                    }
                    i2++;
                    if (!m4846a(abstractC0244am)) {
                    }
                }
            }
        }
        if (c0458l.f3195fE != -1 && i >= c0458l.f3195fE) {
            return false;
        }
        if (c0458l.f3196fF != -1 && i2 >= c0458l.f3196fF) {
            return false;
        }
        return m4841a((InterfaceC0303as) c0458l, true);
    }

    /* renamed from: o */
    public void m4811o() {
        AbstractC0244am m4809r;
        if (this.f707r.size() != 0 && (m4809r = m4809r()) != null) {
            this.f713x.setSite(m4809r.f7172eo, m4809r.f7173ep);
            AbstractC0629y m4845a = m4845a(m4809r, this.f713x, true);
            if (m4845a != null) {
                m4836a(m4845a, m4809r);
            }
        }
    }

    /* renamed from: q */
    public void m4810q() {
        AbstractC0629y abstractC0629y;
        C0305au m2967ar;
        AbstractC0244am m4162i;
        if (this.f707r.size() != 0 && this.f717B != null) {
            AbstractC0244am[] m504a = this.f706q.m504a();
            int size = this.f706q.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m504a[i];
                if (abstractC0244am.f1614bX == this.f761R && m4846a(abstractC0244am) && abstractC0244am.f1656cN == null && abstractC0244am.mo5568r().mo4197n() && (abstractC0244am instanceof AbstractC0629y) && this.f761R.m4922i(abstractC0244am) && C0773f.m2167c(0.0f, 1.0f) <= 0.3d && (m2967ar = (abstractC0629y = (AbstractC0629y) abstractC0244am).m2967ar()) != null && m2967ar.m4172d() == EnumC0306av.reclaim && (m4162i = m2967ar.m4162i()) != null && m4162i.mo3308g() > 0.0f && !this.f717B.m3842c(m4162i.m4310cM())) {
                    m4836a(abstractC0629y, m4809r());
                    return;
                }
            }
        }
    }

    /* renamed from: r */
    public AbstractC0244am m4809r() {
        AbstractC0244am abstractC0244am = null;
        for (int i = 0; i < 20; i++) {
            abstractC0244am = this.f707r.mo503a(C0773f.rand(0, this.f707r.size() - 1));
            if (abstractC0244am == null || this.f717B == null || this.f717B.m3842c(abstractC0244am.m4310cM())) {
                break;
            }
        }
        return abstractC0244am;
    }

    /* renamed from: a */
    public void m4836a(AbstractC0629y abstractC0629y, AbstractC0244am abstractC0244am) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (abstractC0629y.mo3166g(abstractC0244am, true)) {
            SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
            m2445a.m2343a(abstractC0629y);
            m2445a.m2332d(abstractC0244am);
        }
    }

    /* renamed from: s */
    public void m4808s() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        AbstractC0244am m4851A = m4851A();
        if (m4851A != null) {
            this.f713x.setSite(m4851A.f7172eo, m4851A.f7173ep);
            AbstractC0629y m4842a = m4842a((InterfaceC0303as) null, this.f713x, true);
            if (m4842a != null && m4842a.mo3035a(m4851A) && m4851A.m4264e(m4842a) < 2) {
                SyncPacket m2445a = gameEngine.f6343cf.m2445a(this.f761R);
                m2445a.m2343a(m4842a);
                m2445a.m2337b(m4851A);
            }
        }
    }

    /* renamed from: b */
    public void m4831b(float f) {
        m4828c(f);
        int i = this.f725J;
        int i2 = this.f724I;
        m4832b();
        this.f703n = m4802z();
        if (this.f703n) {
            this.f704o = true;
        }
        if (i >= 1) {
            m4808s();
        }
        if (this.f728M && this.f724I > 0) {
            m4812n();
            m4810q();
            m4811o();
        }
        if (i < 2 && this.f698i == 0.0f) {
            this.f698i = 300.0f;
            int m4979a = this.f761R.m4979a(this.f761R.f613bz, EnumC0157b.include);
            if (!this.f708s || m4979a <= 2) {
                boolean z = C0773f.rand(0, 100) < 5;
                if (!z && m4847a(this.f761R.f613bz, true)) {
                    this.f723H = false;
                    this.f698i = 900.0f;
                } else {
                    if (!z) {
                        this.f723H = true;
                    }
                    if (!this.f708s && this.f711v == 0.0f && i < 1 && this.f696g == 0.0f) {
                        m4813m();
                    }
                }
            }
        }
        int m4816j = m4816j();
        if (i == 0 && i2 == 0) {
            this.f700k += f;
            if (m4816j > 2) {
                this.f700k += 2.0f * f;
            }
            if (m4816j > 5) {
                this.f700k += 4.0f * f;
            }
        } else {
            this.f700k = C0773f.m2234a(this.f700k, f);
        }
        if (this.f700k > 11000.0f) {
            mo4784p();
        }
        if (this.f691b == EnumC0165j.Pre && ((i != 0 && i2 != 0) || (i2 > 5 && m4816j == 0))) {
            this.f701l += f;
            if (this.f701l > 2000.0f) {
                this.f691b = EnumC0165j.Active;
            }
        }
        m4807t();
    }

    /* renamed from: t */
    public void m4807t() {
        if (this.f691b == null) {
            GameEngine.m1074a("fixOverlaps: this.state==null");
            GameEngine.m1074a("id:" + this.f760Q);
            GameEngine.m1074a("x:" + this.f762S);
            GameEngine.m1074a("y:" + this.f763T);
            GameEngine.m1074a("radius:" + this.f764U);
            if (this.f761R != null) {
                GameEngine.m1074a("team:" + this.f761R.site);
                return;
            }
            return;
        }
        Iterator it = this.f761R.f600bm.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof C0164i) && abstractC0170o != this) {
                C0164i c0164i = (C0164i) abstractC0170o;
                if (C0773f.m2232a(this.f762S, this.f763T, c0164i.f762S, c0164i.f763T) < 400.0f) {
                    if (c0164i.f691b == null) {
                        GameEngine.m1074a("fixOverlaps: targetBase.state==null");
                    } else if (c0164i.f691b.m4801a() < this.f691b.m4801a()) {
                        c0164i.mo4784p();
                    } else {
                        mo4784p();
                    }
                }
            }
        }
    }

    /* renamed from: u */
    public int m4806u() {
        return this.f724I;
    }

    /* renamed from: c */
    public void m4828c(float f) {
        this.f724I = 0;
        this.f725J = 0;
        this.f727L = 0;
        this.f726K = 0;
        this.f728M = false;
        this.f707r.clear();
        if (1 != 0) {
            Iterator it = m4815k().iterator();
            while (it.hasNext()) {
                AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
                if (abstractC0244am.mo3308g() > 0.0f && m4789b(abstractC0244am)) {
                    this.f728M = true;
                    this.f707r.mo500a(abstractC0244am);
                }
            }
        }
        AbstractC0244am[] m504a = AbstractC0244am.f1594bE.m504a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am2 = m504a[i];
            if (abstractC0244am2.f1614bX == this.f761R && (abstractC0244am2 instanceof AbstractC0629y)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
                if (m4834a(abstractC0629y, false) && abstractC0244am2.m4326bT() && this.f761R.m4922i(abstractC0244am2) && !abstractC0244am2.mo1758u()) {
                    InterfaceC0303as mo5568r = abstractC0244am2.mo5568r();
                    if (mo5568r.mo4201j()) {
                        this.f724I++;
                    }
                    if (mo5568r.mo4198m()) {
                        this.f725J++;
                        if (C0161f.m4884a(abstractC0629y)) {
                            this.f726K++;
                        }
                    }
                    if (mo5568r.mo4197n()) {
                        this.f727L++;
                    }
                    if (abstractC0244am2 instanceof InterfaceC0506l) {
                        this.f725J += ((InterfaceC0506l) abstractC0244am2).mo3352h(EnumC0249ar.builder);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public void m4825d(float f) {
        InterfaceC0303as m4829c;
        this.f708s = m4822f();
        this.f709t = this.f708s;
        if (this.f708s) {
            this.f711v += f;
            this.f710u = 100.0f;
        } else {
            this.f711v = 0.0f;
        }
        if (this.f711v > 6000.0f) {
            this.f708s = false;
        }
        this.f702m = C0773f.m2234a(this.f702m, f);
        this.f694e = C0773f.m2234a(this.f694e, f);
        this.f696g = C0773f.m2234a(this.f696g, f);
        this.f698i = C0773f.m2234a(this.f698i, f);
        this.f699j = C0773f.m2234a(this.f699j, f);
        if (this.f708s && this.f699j == 0.0f) {
            this.f699j = 100 + (this.f760Q % 15);
            if (!this.f761R.f586aY) {
                m4817i();
            }
        }
        if (this.f694e <= 0.0f) {
            this.f694e = 270 + (this.f760Q % 15);
            if (this.f761R.m4960ac()) {
                this.f694e = SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3 + (this.f760Q % 15);
            }
            if (this.f695f < 0.2d) {
                this.f694e += 180.0f;
            }
            if (this.f695f < 0.08d) {
                this.f694e += 180.0f;
            }
            if ((m4803y() != null) && (m4829c = m4829c()) != null && ((this.f695f > 0.8d || this.f761R.m4550a(1300.0d)) && ((this.f695f > 0.4d || this.f761R.m4550a(1700.0d)) && ((this.f695f > 0.2d || this.f761R.m4550a(2100.0d)) && ((this.f695f > 0.1d || this.f761R.m4550a(2800.0d)) && ((this.f695f > 0.05d || this.f761R.m4550a(3100.0d)) && (this.f695f > 0.01d || this.f761R.m4550a(4800.0d)))))))) {
                this.f718C++;
                if (!m4819g(m4829c)) {
                    this.f694e -= 120.0f;
                    this.f719D++;
                }
            }
        }
        float m4806u = m4806u() / 3.0f;
        if (m4806u < 1.0f) {
            m4806u = 1.0f;
        }
        if (this.f708s) {
            this.f693d = (float) (this.f693d + (f * 0.015d));
        }
        if (this.f695f < 0.6d) {
            if (this.f761R.f589bb < 2) {
                this.f693d = (float) (this.f693d + (f * 7.0E-4d * m4806u));
            } else if (this.f761R.m4550a(1200.0d)) {
                this.f693d = (float) (this.f693d + (f * 1.0E-4d * m4806u));
            }
            if (this.f761R.m4550a(1600.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.001d));
            }
            if (this.f761R.m4550a(2200.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.001d));
            }
            if (this.f761R.m4550a(2600.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.001d));
            }
            if (this.f761R.m4550a(8000.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.005d));
            }
            if (this.f761R.m4550a(9000.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.01d));
            }
            if (this.f761R.m4550a(10100.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.01d));
            }
            if (this.f761R.m4550a(30000.0d)) {
                this.f693d = (float) (this.f693d + (f * 0.05d));
            }
        }
        if (this.f761R.m4550a(5000.0d)) {
            this.f693d = (float) (this.f693d + (f * 0.001d));
        }
        if (!this.f761R.m4550a(800.0d) && !this.f708s && this.f693d > 1.2f) {
            this.f693d = 1.2f;
        }
        if (this.f693d > 3.5f) {
            this.f693d = 3.5f;
        }
        for (int i = 0; i < 12; i++) {
            m4805v();
            if (this.f693d < 3.0f) {
                return;
            }
        }
    }

    /* renamed from: a */
    public void m4833a(ArrayList arrayList, AbstractC0159d abstractC0159d, EnumC0246ao enumC0246ao, int i) {
        this.f729N.clear();
        for (int i2 = 0; i2 < i; i2++) {
            InterfaceC0303as m4893a = abstractC0159d.m4893a(enumC0246ao);
            if (m4893a != null && !this.f729N.contains(m4893a)) {
                this.f729N.add(m4893a);
            }
        }
        arrayList.addAll(this.f729N);
    }

    /* renamed from: v */
    public void m4805v() {
        EnumC0246ao enumC0246ao;
        AbstractC0244am m4820g;
        int m4826d = m4826d();
        int i = 12;
        int i2 = 50;
        if (this.f761R.m4960ac()) {
            i2 = 65;
            i = 16;
        }
        boolean a = this.f761R.m4550a(25000.0d);
        ArrayList arrayList = new ArrayList();
        boolean m4954ai = this.f761R.m4954ai();
        boolean m4953aj = this.f761R.m4953aj();
        float f = 0.4f;
        float f2 = 0.3f;
        if (!this.f761R.f595bh) {
            f = 0.1f;
            f2 = 0.5f;
        }
        if (!this.f761R.f596bi) {
            f = 0.2f;
            f2 = 0.1f;
        }
        float m2167c = C0773f.m2167c(0.0f, 1.0f);
        if (m2167c < f) {
            enumC0246ao = EnumC0246ao.LAND;
        } else if (m2167c < f + f2) {
            enumC0246ao = EnumC0246ao.HOVER;
        } else {
            enumC0246ao = EnumC0246ao.AIR;
        }
        if ((this.f761R.m4550a(1300.0d) && this.f693d >= 1.0f) || (this.f761R.m4550a(300.0d) && this.f693d >= 3.0f)) {
            if (this.f761R.m4955ah() && this.f761R.f590bc < i && C0773f.m2164c(100) < 35) {
                m4833a(arrayList, this.f761R.f608bu, null, 2);
                if (a) {
                }
            }
            if (m4826d < 3 && this.f761R.f588ba < i2) {
                if (enumC0246ao == EnumC0246ao.LAND) {
                    m4833a(arrayList, this.f761R.f605br, null, 4);
                    if (a) {
                    }
                } else if (enumC0246ao == EnumC0246ao.HOVER) {
                    m4833a(arrayList, this.f761R.f606bs, null, 4);
                    if (a) {
                    }
                } else {
                    m4833a(arrayList, this.f761R.f607bt, null, 4);
                    if (a) {
                    }
                }
            }
            if (this.f693d >= 1.0f && m4954ai && this.f702m == 0.0f) {
                int m4979a = this.f761R.m4979a(this.f761R.f611bx, EnumC0157b.include);
                int m4979a2 = m4979a + this.f761R.m4979a(this.f761R.f612by, EnumC0157b.include);
                int m4948ao = this.f761R.m4948ao();
                if ((this.f761R.m4550a(1700.0d) || m4948ao > 10 || (this.f761R.f599bl == 0 && m4948ao >= 1 && m4979a == 0)) && (m4979a2 < 3 || (m4948ao > 20 && m4979a2 < 5))) {
                    if (m4953aj && m4979a2 < 2) {
                        m4833a(arrayList, this.f761R.f610bw, null, 2);
                    } else {
                        m4833a(arrayList, this.f761R.f610bw, EnumC0246ao.AIR, 2);
                    }
                }
            }
        }
        if (arrayList.size() == 0) {
            this.f721F++;
        }
        while (arrayList.size() != 0) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) arrayList.remove(arrayList.size() - 1);
            AbstractC0244am m4336b = AbstractC0244am.m4336b(interfaceC0303as);
            boolean z = true;
            if (this.f708s && C0773f.m2164c(100) < 10 && (m4820g = m4820g()) != null && !this.f761R.m4936b(m4336b, m4820g)) {
                this.f721F++;
                z = false;
            }
            if (z) {
                if (m4841a(interfaceC0303as, false)) {
                    this.f721F++;
                    this.f761R.f618bE.m4899a(interfaceC0303as);
                    this.f693d -= 1.0f;
                    if (this.f761R.m4925g(m4336b)) {
                        this.f702m = 1000.0f;
                        this.f761R.f599bl++;
                        return;
                    }
                    return;
                }
                this.f722G++;
            }
        }
    }

    /* renamed from: a */
    public void m4835a(AbstractC0629y abstractC0629y, C0429b c0429b, boolean z) {
        this.f730O = abstractC0629y.mo5568r();
        if (z) {
            this.f731P = null;
            this.f717B = null;
            return;
        }
        this.f731P = c0429b;
        this.f717B = c0429b.m3832i(abstractC0629y);
    }
}