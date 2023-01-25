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

/* renamed from: com.corrodinggames.rts.game.units.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/f.class */
public class C0528f extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3650a = null;

    /* renamed from: b */
    static C0970e f3651b = null;

    /* renamed from: c */
    static C0970e[] f3652c = new C0970e[10];

    /* renamed from: d */
    static C0970e f3653d = null;

    /* renamed from: e */
    int f3654e;

    /* renamed from: f */
    float f3655f;

    /* renamed from: g */
    float f3656g;

    /* renamed from: h */
    Rect f3657h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.heavyTank;
    }

    /* renamed from: f */
    public static void m3261f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_tank);
        f3652c = PlayerData.m4432a(mo222a);
        f3650a = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_tank_dead);
        f3651b = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_tank_turret);
        f3653d = m4240a(mo222a, mo222a.mo387m() / 3, mo222a.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3650a;
        }
        return f3652c[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3653d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3651b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.f1612bV && this.f1629cm >= 1.0f && !this.f1633cq;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        this.f3917M = f3650a;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.normal);
        return true;
    }

    public C0528f(boolean z) {
        super(z);
        this.f3657h = new Rect();
        m2725a(f3652c[7], 3);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 600.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3652c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (!this.f1612bV && this.f1622cf != 0.0f) {
            this.f3655f += f;
            if (this.f3655f > 1.4d) {
                this.f3655f = 0.0f;
                this.f3654e++;
                if (this.f3654e > 2) {
                    this.f3654e = 0;
                }
            }
            if (this.f7169el) {
                this.f3656g += f;
                if (this.f3656g > 9.0f) {
                    this.f3656g = 0.0f;
                    m3263K();
                }
            }
        }
    }

    /* renamed from: K */
    public void m3263K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f = this.f1623cg;
        if (this.f1622cf < 0.0f) {
            f += 180.0f;
        }
        int i = 0;
        while (i <= 1) {
            float f2 = i == 0 ? -20 : 20;
            gameEngine.f6329bR.m2362c(this.f7172eo + (C0773f.m2107k(f + 180.0f + f2) * this.f1626cj), this.f7173ep + (C0773f.m2110j(f + 180.0f + f2) * this.f1626cj), this.f7174eq, f + 180.0f, 0);
            i++;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 50.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!abstractC0244am.mo3068i()) {
            PointF E = mo3056E(i);
            C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
            PointF K = mo3046K(i);
            m4525a.f1012K = K.x;
            m4525a.f1013L = K.y;
            m4525a.f1044ar = Color.m5243a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m4525a.f1022U = mo2835q(i);
            m4525a.f987l = abstractC0244am;
            m4525a.f983h = 60.0f;
            m4525a.f995t = 4.0f;
            m4525a.f999x = 2.0f;
            m4525a.f1069aQ = true;
            m4525a.f1001z = true;
            gameEngine.f6329bR.m2377a(m4525a, -16716288);
            gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1127220);
            gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
            gameEngine.f6324bM.m2812a(C0637e.f4087u, 0.3f, this.f7172eo, this.f7173ep);
            return;
        }
        PointF E2 = mo3056E(i);
        E2.setSite(this.f7172eo, this.f7173ep);
        C0188f m4525a2 = C0188f.m4525a(this, this.f7172eo, this.f7173ep);
        m4525a2.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4525a2.f1022U = mo2835q(i);
        m4525a2.f987l = abstractC0244am;
        m4525a2.f983h = 190.0f;
        m4525a2.f995t = 0.5f;
        m4525a2.f993r = 5.0f;
        m4525a2.f1060aH = true;
        m4525a2.f1061aI = 10.0f;
        m4525a2.f1062aJ = 15.0f;
        m4525a2.f1065aM = true;
        m4525a2.f1069aQ = true;
        m4525a2.f1059aG = true;
        gameEngine.f6324bM.m2812a(C0637e.f4079m, 0.2f, this.f7172eo, this.f7173ep);
        gameEngine.f6329bR.m2377a(m4525a2, -1118720);
        gameEngine.f6329bR.m2385a(E2.x, E2.y, this.f7174eq, -1127220);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2909bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.1f;
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
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        if (z) {
            return super.mo3227a_(z);
        }
        if (this.f1612bV) {
            return super.mo3227a_(z);
        }
        return super.m4239a(z, this.f3654e);
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}