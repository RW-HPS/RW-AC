package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p026e.C0536l;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/c.class */
public class C0310c extends AbstractC0309b {

    /* renamed from: q */
    float f1862q;

    /* renamed from: r */
    boolean f1863r;

    /* renamed from: s */
    boolean f1864s;

    /* renamed from: t */
    float f1865t;

    /* renamed from: u */
    float f1866u;

    /* renamed from: v */
    protected Paint f1867v;

    /* renamed from: w */
    PointF f1868w;

    /* renamed from: x */
    Rect f1869x;

    /* renamed from: a */
    static C0970e f1853a = null;

    /* renamed from: b */
    static C0970e f1854b = null;

    /* renamed from: c */
    static C0970e f1855c = null;

    /* renamed from: d */
    static C0970e f1856d = null;

    /* renamed from: e */
    static C0970e[] f1857e = new C0970e[10];

    /* renamed from: f */
    static C0970e[] f1858f = new C0970e[10];

    /* renamed from: g */
    static C0970e[] f1859g = new C0970e[10];

    /* renamed from: o */
    static C0970e f1860o = null;

    /* renamed from: p */
    static C0970e f1861p = null;

    /* renamed from: y */
    public static final AbstractC0224s f1870y = new AbstractC0229x(151) { // from class: com.corrodinggames.rts.game.units.b.c.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Surface unit.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return "Fly";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return !((C0310c) abstractC0244am).f1863r;
        }
    };

    /* renamed from: z */
    public static final AbstractC0224s f1871z = new AbstractC0229x(152) { // from class: com.corrodinggames.rts.game.units.b.c.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Dive unit underwater.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return "Dive";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return ((C0310c) abstractC0244am).f1863r && ((AbstractC0629y) abstractC0244am).m4216cJ();
        }
    };

    /* renamed from: A */
    static ArrayList f1872A = new ArrayList();

    static {
        f1872A.add(f1870y);
        f1872A.add(f1871z);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f1863r);
        gameOutputStream.writeFloat(this.f1865t);
        gameOutputStream.writeFloat(this.f1866u);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f1863r = gameInputStream.readBoolean();
        this.f1864s = !mo3074Q();
        if (gameInputStream.m1311b() >= 21) {
            this.f1865t = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 22) {
            this.f1866u = gameInputStream.readFloat();
        }
        m4127M();
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: Q */
    public boolean mo3074Q() {
        return this.f7174eq < -1.0f;
    }

    /* renamed from: b */
    public boolean m4125b() {
        if (!this.f1863r || this.f7174eq < 0.0f) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: h */
    public EnumC0246ao mo3069h() {
        if (this.f1632cp) {
            return EnumC0246ao.f1711d;
        }
        if (m4125b()) {
            return EnumC0246ao.f1712e;
        }
        return EnumC0246ao.f1711d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: f */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.amphibiousJet;
    }

    /* renamed from: L */
    public static void m4128L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1854b = gameEngine.f6326bO.mo222a(C0067R.drawable.amphibious_jet);
        f1855c = gameEngine.f6326bO.mo222a(C0067R.drawable.amphibious_jet_shadow);
        f1853a = gameEngine.f6326bO.mo222a(C0067R.drawable.amphibious_jet_dead);
        f1857e = PlayerData.m4432a(f1854b);
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.amphibious_jet_p1);
        C0970e mo222a2 = gameEngine.f6326bO.mo222a(C0067R.drawable.amphibious_jet_p2);
        f1858f = PlayerData.m4432a(mo222a);
        f1859g = PlayerData.m4432a(mo222a2);
        f1860o = m4241a(mo222a);
        f1861p = m4241a(mo222a2);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: aQ */
    public boolean mo2971aQ() {
        if (super.mo2971aQ()) {
            m4122f(true);
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        if (this.f1612bV) {
            return true;
        }
        m4122f(false);
        if (!this.f1612bV) {
            for (int i = 0; i < mo2900bl(); i++) {
                if (i != m4124ds()) {
                    float mo2872e = this.f1654cL[i].f1722f / mo2872e(i);
                    if (mo2872e != 0.0f) {
                        GameEngine gameEngine = GameEngine.getGameEngine();
                        PointF E = mo3056E(i);
                        gameEngine.f6326bO.mo138i();
                        gameEngine.f6326bO.mo169b(E.x - gameEngine.f6357cw, (E.y - gameEngine.f6358cx) - this.f7174eq);
                        gameEngine.f6326bO.mo229a(mo2872e * 0.7f, mo2872e * 0.7f);
                        gameEngine.f6326bO.mo199a(C0536l.f3694e, 0.0f, 0.0f, (Paint) null);
                        gameEngine.f6326bO.mo137j();
                    }
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m4122f(boolean z) {
        Paint paint;
        C0970e c0970e;
        float f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!z) {
            paint = mo2974aN();
        } else {
            this.f1867v.m5228a(50, 255, 255, 255);
            paint = this.f1867v;
        }
        for (int i = 0; i <= 1; i++) {
            PointF m4126a = m4126a(i, z);
            float f2 = m4126a.x - gameEngine.f6357cw;
            float f3 = m4126a.y - gameEngine.f6358cx;
            float mo3259d = mo3259d(false) - 90.0f;
            if (!z) {
                f3 -= this.f7174eq;
            }
            if (i == 0) {
                if (z) {
                    c0970e = f1861p;
                } else {
                    c0970e = f1859g[this.f1614bX.m4454R()];
                }
                f = mo3259d + 0.0f;
            } else {
                if (z) {
                    c0970e = f1860o;
                } else {
                    c0970e = f1858f[this.f1614bX.m4454R()];
                }
                f = mo3259d - 0.0f;
            }
            gameEngine.f6326bO.mo200a(c0970e, f2, f3, f, paint);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 3;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        if (i == m4124ds()) {
            return super.mo3052G(i);
        }
        float mo3259d = mo3259d(false) - 90.0f;
        PointF m4126a = m4126a(i, false);
        float f = m4126a.x;
        float f2 = m4126a.y;
        f4018bh.setSite(f + (C0773f.m2107k(mo3259d) * 5.0f), f2 + (C0773f.m2110j(mo3259d) * 5.0f));
        return f4018bh;
    }

    /* renamed from: a */
    public PointF m4126a(int i, boolean z) {
        float mo3259d = mo3259d(false) - 90.0f;
        if (i == m4124ds()) {
            throw new RuntimeException("index==2 is for base");
        }
        float f = this.f7172eo;
        float f2 = this.f7173ep;
        float m2171b = C0773f.m2171b(this.f1866u * 4.0f, 0.0f, 1.0f);
        float m2171b2 = C0773f.m2171b((this.f1866u * 2.0f) - 1.0f, 0.0f, 1.0f);
        float m2107k = f + (C0773f.m2107k(mo3259d) * (7.0f - (5.0f * m2171b)));
        float m2110j = f2 + (C0773f.m2110j(mo3259d) * (7.0f - (5.0f * m2171b)));
        float f3 = (-90) + (SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT * i);
        this.f1868w.setSite(m2107k + (C0773f.m2107k(mo3259d + f3) * (12.0f - (5.0f * m2171b2))), m2110j + (C0773f.m2110j(mo3259d + f3) * (12.0f - (5.0f * m2171b2))));
        return this.f1868w;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1853a;
        }
        return f1857e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f1855c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f1856d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f1853a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0310c(boolean z) {
        super(z);
        this.f1863r = true;
        this.f1864s = true;
        this.f1865t = 0.0f;
        this.f1866u = 0.0f;
        this.f1867v = new C0966ag();
        this.f1868w = new PointF();
        this.f1869x = new Rect();
        m2724b(f1854b);
        this.f1626cj = 12.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 530.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1854b;
        this.f3918N = f1855c;
        this.f7174eq = 0.0f;
        m448S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return !m4125b();
    }

    /* renamed from: M */
    public void m4127M() {
        if (!this.f1864s) {
            m448S(1);
        } else {
            m448S(5);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        float f2;
        super.mo446a(f);
        if (!m4226bT() || this.f1612bV) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f1862q += 2.0f * f;
        if (this.f1862q > 360.0f) {
            this.f1862q -= 360.0f;
        }
        if (this.f1863r) {
            f2 = 20.0f + (C0773f.m2110j(this.f1862q) * 1.5f);
        } else {
            f2 = -8.0f;
        }
        if (this.f1863r && !mo3074Q()) {
            this.f1866u = C0773f.m2217a(this.f1866u, 0.0f, 0.018f * f);
        } else {
            this.f1866u = C0773f.m2217a(this.f1866u, 1.0f, 0.018f * f);
        }
        if (C0773f.m2152c(this.f7174eq - f2) > 3.0f) {
            float f3 = 0.6f;
            if (mo3074Q()) {
                f3 = 0.6f / 6.0f;
            }
            this.f1865t = C0773f.m2172b(this.f1865t, f3);
            this.f1865t = C0773f.m2217a(this.f1865t, f3, 0.006f * f);
        } else {
            this.f1865t = C0773f.m2217a(this.f1865t, 0.07f, 0.006f * f);
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, f2, this.f1865t * f);
        boolean z = false;
        if (this.f1864s && mo3074Q()) {
            if (!m4216cJ()) {
                this.f1863r = true;
            } else {
                this.f1864s = false;
                m4127M();
                z = true;
            }
        }
        if (!this.f1864s && !mo3074Q()) {
            this.f1864s = true;
            m4127M();
            z = true;
        }
        if (z) {
            gameEngine.f6329bR.m2384a(this.f7172eo, this.f7173ep, 0.0f, 0, 0.0f, 0.0f);
            for (int i = -180; i < 180; i += 45) {
                float f4 = this.f1623cg + i;
                C0760e m2369b = gameEngine.f6329bR.m2369b((float) (this.f7172eo + (Math.cos(Math.toRadians(f4)) * (-5.0d))), (float) (this.f7173ep + (Math.sin(Math.toRadians(f4)) * (-5.0d))), 0.0f, f4);
                if (m2369b != null) {
                    m2369b.f4873ar = (short) 2;
                    m2369b.f4807s = true;
                    m2369b.f4808t = 7.0f;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        if (i == m4124ds()) {
            return 0.0f;
        }
        return 45.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        if (i == m4124ds()) {
            return;
        }
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        m4523a.f1044ar = Color.m5243a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m4523a.f1022U = mo2835q(i);
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 10.0f;
        m4523a.f995t = 4.0f;
        m4523a.f999x = 2.0f;
        m4523a.f1069aQ = false;
        m4523a.f1002A = true;
        m4523a.f1014M = true;
        m4523a.f1036ai = 0.5f;
        m4523a.f1038ak = 1.0f;
        m4523a.f1039al = 0.1f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1118482);
        gameEngine.f6324bM.m2812a(C0637e.f4090x, 0.2f, this.f7172eo, this.f7173ep);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        if (m4125b()) {
            return 100.0f;
        }
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 110.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 25 + (i * 10);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: f */
    public float mo2870f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        if (!mo3074Q()) {
            return 1.4f;
        }
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        if (!mo3074Q()) {
            return 3.8f;
        }
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.3f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: y */
    public float mo2823y(int i) {
        return 0.38f;
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
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bi */
    public boolean mo2903bi() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bj */
    public boolean mo2902bj() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: i */
    public void mo2860i(float f) {
        if (!m3034Z()) {
            super.mo2860i(f);
            return;
        }
        this.f1623cg += f;
        if (this.f1623cg > 180.0f) {
            this.f1623cg -= 360.0f;
        }
        if (this.f1623cg < -180.0f) {
            this.f1623cg += 360.0f;
        }
    }

    /* renamed from: ds */
    public int m4124ds() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public float mo3259d(boolean z) {
        return this.f1654cL[m4124ds()].f1717a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ah */
    public boolean mo2953ah() {
        if (!mo3074Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ae */
    public boolean mo2956ae() {
        if (!mo3074Q()) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        if (!mo3074Q()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ag */
    public boolean mo2954ag() {
        if (!mo3074Q()) {
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f1870y) {
            this.f1863r = true;
        }
        if (abstractC0224s == f1871z) {
            this.f1863r = false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f1872A;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}