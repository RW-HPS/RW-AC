package com.corrodinggames.rts.game.units.p029h;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0758c;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/a.class */
public class C0589a extends AbstractC0596f {

    /* renamed from: a */
    static C0970e f3839a = null;

    /* renamed from: b */
    static C0970e f3840b = null;

    /* renamed from: c */
    static C0970e f3841c = null;

    /* renamed from: d */
    static C0970e f3842d = null;

    /* renamed from: e */
    static C0970e[] f3843e = new C0970e[10];

    /* renamed from: f */
    Rect f3844f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.battleShip;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 9000.0f;
    }

    /* renamed from: f */
    public static void m3148f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3840b = gameEngine.f6326bO.mo222a(C0067R.drawable.battle_ship_t2);
        f3839a = gameEngine.f6326bO.mo222a(C0067R.drawable.battle_ship_t2_dead);
        f3841c = gameEngine.f6326bO.mo222a(C0067R.drawable.battle_ship_t2_turret);
        f3843e = PlayerData.m4432a(f3840b);
        f3842d = m4240a(f3840b, f3840b.mo387m(), f3840b.mo388l());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3839a;
        }
        return f3843e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3841c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3842d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: F */
    public boolean mo3055F() {
        return GameEngine.getGameEngine().settingsEngine.renderExtraShadows && this.f7174eq > -2.0f;
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
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3839a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0589a(boolean z) {
        super(z);
        this.f3844f = new Rect();
        m2724b(f3840b);
        this.f1626cj = 20.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 1200.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3840b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 65.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1022U = mo2835q(i);
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 80.0f;
        m4523a.f999x = 2.0f;
        m4523a.f995t = 4.0f;
        m4523a.f1020S = true;
        m4523a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 0);
        m4523a.f1069aQ = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6324bM.m2812a(C0637e.f4084r, 0.2f, E.x, E.y);
        gameEngine.f6329bR.m2377a(m4523a, -1118720);
        C0760e m2390a = gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        if (m2390a != null) {
            C0758c.m2379a(m2390a, this);
        }
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 240.0f;
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
    /* renamed from: C */
    public float mo3060C(int i) {
        if (this.f1625ci && mo2909bc() > 0.95d) {
            if (i == 0) {
                return this.f1623cg + 140.0f;
            }
            return this.f1623cg - 140.0f;
        }
        return this.f1623cg;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.08f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.08f;
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
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 15.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bl */
    public int mo2900bl() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: G */
    public PointF mo3052G(int i) {
        float f;
        PointF G = super.mo3052G(i);
        float f2 = G.x;
        float f3 = G.y;
        if (i == 0) {
            f = 22.0f;
        } else {
            f = 4.0f;
        }
        f4018bh.setSite(f2 + (C0773f.m2107k(this.f1623cg) * f), f3 + (C0773f.m2110j(this.f1623cg) * f));
        return f4018bh;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 120 - (i * 28);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: e */
    public float mo2872e(int i) {
        return i * 30;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
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