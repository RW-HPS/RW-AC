package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* renamed from: com.corrodinggames.rts.game.units.e.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/k.class */
public class C0535k extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3683a = null;

    /* renamed from: b */
    static C0970e f3684b = null;

    /* renamed from: c */
    static C0970e f3685c = null;

    /* renamed from: d */
    static C0970e f3686d = null;

    /* renamed from: e */
    static C0970e[] f3687e = new C0970e[10];

    /* renamed from: f */
    static C0970e f3688f = null;

    /* renamed from: g */
    Rect f3689g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.laserTank;
    }

    /* renamed from: f */
    public static void m3233f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3684b = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_tank_base);
        f3683a = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_tank_dead);
        f3685c = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_tank_turrent);
        f3686d = gameEngine.f6326bO.mo222a(C0067R.drawable.laser_tank_charge);
        f3687e = PlayerData.m4432a(f3684b);
        f3688f = m4240a(f3684b, f3684b.mo387m(), f3684b.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3683a;
        }
        return f3687e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3688f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && !this.f1612bV;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3685c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        this.f3917M = f3683a;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.small);
        return true;
    }

    public C0535k(boolean z) {
        super(z);
        this.f3689g = new Rect();
        m2725a(f3684b, 1);
        this.f1626cj = 14.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 300.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3684b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        m4525a.f1022U = mo2835q(i);
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = 8.0f;
        m4525a.f1003B = true;
        m4525a.f1002A = true;
        m4525a.f1069aQ = true;
        m4525a.f1044ar = Color.m5243a(80, 255, 0, 0);
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1127220);
        gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        gameEngine.f6324bM.m2812a(C0637e.f4091y, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bW */
    public float mo3235bW() {
        if (this.f1654cL[0].f1721e > 0.0f) {
            return 1.0f - (this.f1654cL[0].f1721e / mo2930b(0));
        }
        if (this.f1654cL[0].f1722f != 0.0f) {
            return this.f1654cL[0].f1722f / mo2872e(0);
        }
        return super.mo3235bW();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bX */
    public boolean mo3234bX() {
        return this.f1654cL[0].f1721e > 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 190.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 450.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 80.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        C1152y.m463a((AbstractC0629y) this);
        if (!this.f1612bV) {
            float mo2872e = this.f1654cL[0].f1722f / mo2872e(0);
            if (mo2872e != 0.0f) {
                PointF E = mo3056E(0);
                gameEngine.f6326bO.mo138i();
                gameEngine.f6326bO.mo169b(E.x - gameEngine.f6357cw, E.y - gameEngine.f6358cx);
                gameEngine.f6326bO.mo229a(mo2872e, mo2872e);
                gameEngine.f6326bO.mo199a(f3686d, 0.0f, 0.0f, (Paint) null);
                gameEngine.f6326bO.mo137j();
                return true;
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.07f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.12f;
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
        return 19.0f;
    }
}