package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/d.class */
public class C0526d extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3637a = null;

    /* renamed from: b */
    static C0970e f3638b = null;

    /* renamed from: c */
    static C0970e f3639c = null;

    /* renamed from: d */
    static C0970e[] f3640d = new C0970e[10];

    /* renamed from: e */
    int f3641e;

    /* renamed from: f */
    float f3642f;

    /* renamed from: g */
    Rect f3643g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.experimentalTank;
    }

    /* renamed from: f */
    public static void m3266f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_tank);
        f3640d = PlayerData.m4432a(mo222a);
        f3637a = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_tank_dead);
        f3638b = gameEngine.f6326bO.mo222a(C0067R.drawable.experimental_tank_turret);
        f3639c = m4240a(mo222a, mo222a.mo387m() / 2, mo222a.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3637a;
        }
        return f3640d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3639c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq > -2.0f && this.f1629cm >= 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        if (m3270R(i)) {
            return null;
        }
        return f3638b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        m3014a(EnumC0233ab.largeUnit);
        this.f3917M = f3637a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0526d(boolean z) {
        super(z);
        this.f3643g = new Rect();
        m2725a(f3640d[7], 2);
        this.f1626cj = 37.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 6000.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3640d[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV) {
            if (this.f1628cl != 0.0f) {
                m448S(2);
            } else {
                m448S(4);
            }
        }
        if (this.f1653cK) {
            this.f3642f += f;
            if (this.f3642f > 5.0f) {
                this.f3642f = 0.0f;
                this.f3641e = 1 - this.f3641e;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 80000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        if (!m3270R(i)) {
            PointF E = mo3056E(i);
            C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
            PointF K = mo3046K(i);
            m4525a.f1012K = K.x;
            m4525a.f1013L = K.y;
            m4525a.f1044ar = Color.m5243a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
            m4525a.f983h = 120.0f;
            m4525a.f995t = 5.0f;
            m4525a.f987l = abstractC0244am;
            m4525a.f1026Y = 60.0f;
            m4525a.f1022U = 40.0f;
            m4525a.f1027Z = 45.0f;
            m4525a.f1028aa = true;
            m4525a.f999x = 2.0f;
            m4525a.f1069aQ = true;
            m4525a.f1017P = (short) 9;
            m4525a.f999x = 1.0f;
            m4525a.f7170em = this.f7170em;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, 16745216);
            gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
            gameEngine.f6329bR.m2377a(m4525a, -1127220);
            gameEngine.f6324bM.m2812a(C0637e.f4088v, 0.3f, this.f7172eo, this.f7173ep);
            return;
        }
        PointF E2 = mo3056E(i);
        E2.setSite(this.f7172eo, this.f7173ep);
        C0188f m4525a2 = C0188f.m4525a(this, this.f7172eo, this.f7173ep);
        m4525a2.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4525a2.f1022U = 60.0f;
        m4525a2.f987l = abstractC0244am;
        m4525a2.f983h = 190.0f;
        m4525a2.f995t = 3.0f;
        m4525a2.f993r = 6.0f;
        m4525a2.f1060aH = true;
        m4525a2.f1061aI = 10.0f;
        m4525a2.f1062aJ = 15.0f;
        m4525a2.f1065aM = true;
        m4525a2.f1069aQ = true;
        m4525a2.f1059aG = true;
        m4525a2.f7170em = this.f7170em;
        GameEngine gameEngine2 = GameEngine.getGameEngine();
        gameEngine2.f6324bM.m2812a(C0637e.f4079m, 0.2f, this.f7172eo, this.f7173ep);
        gameEngine2.f6329bR.m2377a(m4525a2, -1118720);
        gameEngine2.f6329bR.m2385a(E2.x, E2.y, this.f7174eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public boolean mo3017a(int i, AbstractC0244am abstractC0244am, boolean z, boolean z2) {
        if (!z && z2 && !m2861h(abstractC0244am)) {
            return false;
        }
        if (m3270R(i)) {
            if (!abstractC0244am.mo3068i()) {
                return false;
            }
            return true;
        } else if (abstractC0244am.mo3068i()) {
            return false;
        } else {
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 310.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        if (m3270R(i)) {
            i -= 4;
        }
        return 110 - (i * 20);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        if (m3270R(i)) {
            i -= 4;
        }
        return i * 20;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2909bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bh */
    public int mo2904bh() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        if (m3270R(i)) {
            return 1.0f;
        }
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        if (m3270R(i)) {
            return 4.5f;
        }
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        if (this.f1612bV && !z) {
            return super.mo3227a_(z);
        }
        if (z) {
            return super.mo3227a_(z);
        }
        int i = 0 + (this.f3641e * this.f4260es);
        this.f3643g.m5172a(i, 0, i + this.f4260es, 0 + this.f4261et);
        return this.f3643g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        C1152y.m463a((AbstractC0629y) this);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: af */
    public boolean mo2955af() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        PointF G = super.mo3052G(i);
        float f = G.x;
        float f2 = G.y;
        if (!m3270R(i)) {
            if (i <= 1) {
                f += C0773f.m2107k(this.f1623cg) * 5.0f;
                f2 += C0773f.m2110j(this.f1623cg) * 5.0f;
            }
            float f3 = (-45) + (90 * i);
            f += C0773f.m2107k(this.f1623cg + f3) * 18.0f;
            f2 += C0773f.m2110j(this.f1623cg + f3) * 18.0f;
        }
        f4018bh.setSite(f, f2);
        return f4018bh;
    }

    /* renamed from: R */
    public boolean m3270R(int i) {
        if (i >= 4) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 6;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cw */
    public int mo3268cw() {
        return 5;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: dd */
    public boolean mo3267dd() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3050H(int i) {
        return -2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public float mo3048I(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: J */
    public float mo3047J(int i) {
        return 12.0f;
    }
}