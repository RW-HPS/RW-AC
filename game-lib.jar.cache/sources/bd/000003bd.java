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
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/l.class */
public class C0536l extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3690a = null;

    /* renamed from: b */
    static C0970e f3691b = null;

    /* renamed from: c */
    static C0970e[] f3692c = new C0970e[10];

    /* renamed from: d */
    static C0970e f3693d = null;

    /* renamed from: e */
    public static C0970e f3694e = null;

    /* renamed from: f */
    int f3695f;

    /* renamed from: g */
    float f3696g;

    /* renamed from: h */
    Rect f3697h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.mammothTank;
    }

    /* renamed from: f */
    public static void m3231f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0970e mo222a = gameEngine.f6326bO.mo222a(C0067R.drawable.mammoth_tank);
        f3692c = PlayerData.m4432a(mo222a);
        f3690a = gameEngine.f6326bO.mo222a(C0067R.drawable.mammoth_tank_dead);
        f3691b = gameEngine.f6326bO.mo222a(C0067R.drawable.mammoth_tank_turret);
        f3694e = gameEngine.f6326bO.mo222a(C0067R.drawable.lighting_charge);
        f3693d = m4240a(mo222a, mo222a.mo387m() / 2, mo222a.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3690a;
        }
        return f3692c[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3693d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3691b;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq > -2.0f && !this.f1612bV;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public float mo3053G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: H */
    public float mo3051H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        this.f3917M = f3690a;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.largeUnit);
        return true;
    }

    public C0536l(boolean z) {
        super(z);
        this.f3697h = new Rect();
        m2725a(f3692c[7], 2);
        this.f1626cj = 21.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 2900.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3692c[7];
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1653cK) {
            this.f3696g += f;
            if (this.f3696g > 3.0f) {
                this.f3696g = 0.0f;
                this.f3695f = 1 - this.f3695f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 14000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        m4525a.f1044ar = Color.m5243a(255, 247, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_EISU, 129);
        m4525a.f1022U = 260.0f;
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = 20.0f;
        m4525a.f995t = 4.0f;
        m4525a.f999x = 2.0f;
        m4525a.f1069aQ = true;
        m4525a.f1002A = true;
        m4525a.f1014M = true;
        m4525a.f1036ai = 0.5f;
        m4525a.f1038ak = 1.0f;
        m4525a.f1039al = 0.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1118482);
        gameEngine.f6324bM.m2812a(C0637e.f4090x, 0.2f, this.f7172eo, this.f7173ep);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 210.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bc */
    public float mo2909bc() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.04f;
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
        return super.m4239a(z, this.f3695f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        if (!super.mo438c(f)) {
            return false;
        }
        C1152y.m463a((AbstractC0629y) this);
        C1152y.m461a(this, f3694e, this.f1654cL[0].f1722f / mo2872e(0), 0);
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
        return 22.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return 60.0f;
    }
}