package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p026e.C0531i;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.b.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/d.class */
public class C0313d extends AbstractC0309b implements InterfaceC0242ak {

    /* renamed from: e */
    float f1877e;

    /* renamed from: f */
    float f1878f;

    /* renamed from: g */
    boolean f1879g;

    /* renamed from: o */
    C1136m f1880o;

    /* renamed from: p */
    Rect f1881p;

    /* renamed from: a */
    static C0970e f1873a = null;

    /* renamed from: b */
    static C0970e f1874b = null;

    /* renamed from: c */
    static C0970e f1875c = null;

    /* renamed from: d */
    static C0970e[] f1876d = new C0970e[10];

    /* renamed from: q */
    public static final AbstractC0224s f1882q = new AbstractC0229x(109) { // from class: com.corrodinggames.rts.game.units.b.d.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0313d) abstractC0244am).f1880o.size();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return (((C0313d) abstractC0244am).f1879g || ((AbstractC0629y) abstractC0244am).m4215cK() || ((C0313d) abstractC0244am).f1880o.size() <= 0) ? false : true;
        }
    };

    /* renamed from: r */
    public static final AbstractC0224s f1883r = new AbstractC0229x(110) { // from class: com.corrodinggames.rts.game.units.b.d.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0313d) abstractC0244am).f1879g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            return mo3096a(abstractC0244am, false);
        }
    };

    /* renamed from: s */
    static ArrayList f1884s = new ArrayList();

    static {
        f1884s.add(f1882q);
        f1884s.add(f1883r);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f1877e);
        gameOutputStream.writeFloat(this.f1878f);
        gameOutputStream.writeBoolean(this.f1879g);
        gameOutputStream.writeInt(this.f1880o.size());
        Iterator it = this.f1880o.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1334a((AbstractC0244am) it.next());
        }
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f1877e = gameInputStream.readFloat();
        this.f1878f = gameInputStream.readFloat();
        this.f1879g = gameInputStream.readBoolean();
        this.f1880o.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0244am m1293o = gameInputStream.m1293o();
            if (m1293o != null) {
                this.f1880o.add(m1293o);
            }
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bY */
    public int mo3248bY() {
        return C0531i.m3251a(this.f1880o);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bZ */
    public int mo3247bZ() {
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.dropship;
    }

    /* renamed from: L */
    public static void m4120L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1874b = gameEngine.f6326bO.mo222a(C0067R.drawable.dropship);
        f1875c = gameEngine.f6326bO.mo222a(C0067R.drawable.dropship_shadow);
        f1873a = gameEngine.f6326bO.mo222a(C0067R.drawable.dropship_dead);
        f1876d = PlayerData.m4432a(f1874b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1873a;
        }
        return f1876d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f1875c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f1873a;
        m448S(0);
        this.f1610bT = false;
        m4116f(true);
        return true;
    }

    public C0313d(boolean z) {
        super(z);
        this.f1877e = 0.0f;
        this.f1880o = new C1136m();
        this.f1881p = new Rect();
        m2729T(45);
        m2728U(47);
        this.f1626cj = 20.0f;
        this.f1627ck = this.f1626cj + 0.0f;
        this.f1638cv = 500.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1874b;
        this.f3918N = f1875c;
        this.f7174eq = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3049I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return this.f7174eq >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: ct */
    public boolean mo3613ct() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            return;
        }
        boolean cK = m4215cK();
        if (this.f1879g && !cK && !this.f1653cK && this.f7174eq < 4.0f) {
            this.f1878f = C0773f.m2218a(this.f1878f, f);
            if (this.f1878f == 0.0f) {
                this.f1878f = 30.0f;
                if (this.f1880o.size() == 0) {
                    this.f1879g = false;
                } else {
                    boolean z = this.f1880o.size() % 2 == 0;
                    float m2107k = this.f7172eo + (C0773f.m2107k(this.f1623cg) * (-9.0f));
                    float m2110j = this.f7173ep + (C0773f.m2110j(this.f1623cg) * (-9.0f));
                    float m2107k2 = m2107k + (C0773f.m2107k(this.f1623cg + 90.0f) * (z ? -7 : 7)) + (C0773f.m2110j(this.f1623cg + 90.0f) * (z ? -7 : 7));
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f1880o.remove(this.f1880o.size() - 1);
                    if (!C1152y.m470a(abstractC0244am, m2107k2, m2110j)) {
                        m2107k2 += 10.0f;
                    }
                    if (!C1152y.m470a(abstractC0244am, m2107k2, m2110j)) {
                        m2107k2 -= 20.0f;
                    }
                    if (!C1152y.m470a(abstractC0244am, m2107k2, m2110j)) {
                        m2107k2 -= 10.0f;
                        m2110j += 10.0f;
                    }
                    if (!C1152y.m470a(abstractC0244am, m2107k2, m2110j)) {
                        m2110j -= 20.0f;
                    }
                    if (!C1152y.m470a(abstractC0244am, m2107k2, m2110j)) {
                        this.f1880o.add(abstractC0244am);
                    } else {
                        abstractC0244am.f1656cN = null;
                        abstractC0244am.f7172eo = m2107k2;
                        abstractC0244am.f7173ep = m2110j;
                        abstractC0244am.f1616bZ += 0.1f;
                        abstractC0244am.f1623cg = this.f1623cg + 180.0f;
                        abstractC0244am.f1608bR = this;
                        abstractC0244am.f1609bS = 45.0f;
                        if (abstractC0244am instanceof AbstractC0629y) {
                            AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                            abstractC0629y.m2935az();
                            abstractC0629y.m2878d(this.f7172eo + (C0773f.m2107k(this.f1623cg) * (-66.0f)), this.f7173ep + (C0773f.m2110j(this.f1623cg) * (-66.0f)));
                        }
                        if (this.f1880o.size() == 0) {
                            this.f1879g = false;
                        }
                    }
                }
            }
        }
        this.f1877e += 2.0f * f;
        if (this.f1877e > 360.0f) {
            this.f1877e -= 360.0f;
        }
        boolean mo3068i = mo3068i();
        if (m4226bT()) {
            if (m2944aq() && !cK) {
                this.f7174eq = C0773f.m2217a(this.f7174eq, 2.0f, 0.4f * f);
            } else {
                this.f7174eq = C0773f.m2217a(this.f7174eq, 35.0f + (C0773f.m2110j(this.f1877e) * 1.5f), 0.35f * f);
            }
        }
        if (mo3068i != mo3068i()) {
            this.f3976ay = true;
            if (mo3068i()) {
                m448S(5);
            } else {
                m448S(2);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        float mo2866g = mo2866g(i);
        float f = this.f1623cg;
        f4017bg.setSite(this.f7172eo + (C0773f.m2107k(f) * mo2866g), this.f7173ep + (C0773f.m2110j(f) * mo2866g));
        return f4017bg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3056E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, mo3056E.x, mo3056E.y, this.f7174eq, i);
        m4523a.f1044ar = Color.m5243a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        m4523a.f1022U = 35.0f;
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 80.0f;
        m4523a.f995t = 4.0f;
        m4523a.f999x = 2.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(mo3056E.x, mo3056E.y, this.f7174eq, -1127220);
        gameEngine.f6329bR.m2390a(mo3056E.x, mo3056E.y, this.f7174eq, this.f1654cL[i].f1717a);
        gameEngine.f6324bM.m2812a(C0637e.f4087u, 0.3f, this.f7172eo, this.f7173ep);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 2.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0673ay, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo447a() {
        m4116f(true);
        super.mo447a();
    }

    /* renamed from: f */
    public void m4116f(boolean z) {
        Iterator it = this.f1880o.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1656cN = null;
            abstractC0244am.f7172eo = this.f7172eo + (C0773f.m2107k(this.f1623cg) * (-9.0f));
            abstractC0244am.f7173ep = this.f7173ep + (C0773f.m2110j(this.f1623cg) * (-9.0f));
            if (z) {
                abstractC0244am.m4209cj();
            }
        }
        this.f1880o.clear();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bA */
    public boolean mo2917bA() {
        return this.f1879g;
    }

    /* renamed from: M */
    public void m4119M() {
        this.f1879g = true;
        this.f1878f = 30.0f;
    }

    /* renamed from: ds */
    public void m4117ds() {
        this.f1879g = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 16000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3244d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1879g || !C0531i.m3250a(this.f1880o, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1614bX != abstractC0244am.f1614bX && !z) {
            return false;
        }
        return C1152y.m464a(abstractC0244am, true, true);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3241e(AbstractC0244am abstractC0244am, boolean z) {
        if (!mo3244d(abstractC0244am, z)) {
            return false;
        }
        m4121C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m4121C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1656cN = this;
        this.f1880o.add(abstractC0244am);
        GameEngine.getGameEngine().f6330bS.m1808l(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: e */
    public void mo3242e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1656cN == this) {
            this.f1880o.remove(abstractC0244am);
            abstractC0244am.f1656cN = null;
            return;
        }
        GameEngine.m990g("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1882q) {
            m4119M();
        }
        if (abstractC0224s == f1883r) {
            m4117ds();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bB */
    public int mo2916bB() {
        return this.f1880o.size();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cr */
    public boolean mo3245cr() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cp */
    public C0208c mo3246cp() {
        return f1882q.m4309N();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f1884s;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: f */
    public boolean mo3240f() {
        return !m4215cK();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: j */
    public boolean mo3238j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bz */
    public C1136m mo2886bz() {
        return this.f1880o;
    }
}