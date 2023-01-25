package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/g.class */
public class C0529g extends AbstractC0530h {

    /* renamed from: a */
    float f3658a;

    /* renamed from: b */
    static C0970e f3659b = null;

    /* renamed from: c */
    static C0970e f3660c = null;

    /* renamed from: d */
    static C0970e f3661d = null;

    /* renamed from: e */
    static C0970e[] f3662e = new C0970e[10];

    /* renamed from: f */
    Rect f3663f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.hoverTank;
    }

    /* renamed from: f */
    public static void m3258f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3660c = gameEngine.f6326bO.mo222a(C0067R.drawable.hover_tank);
        f3659b = gameEngine.f6326bO.mo222a(C0067R.drawable.hover_tank_dead);
        f3661d = gameEngine.f6326bO.mo222a(C0067R.drawable.hover_tank_shadow);
        f3662e = PlayerData.m4432a(f3660c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3659b;
        }
        return f3662e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3661d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        this.f3917M = f3659b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.small);
        return true;
    }

    public C0529g(boolean z) {
        super(z);
        this.f3658a = 0.0f;
        this.f3663f = new Rect();
        m2724b(f3660c);
        this.f1626cj = 7.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 150.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3660c;
        this.f3918N = f3661d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0530h, com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV || !m4226bT()) {
            return;
        }
        this.f3658a += 3.0f * f;
        if (this.f3658a > 360.0f) {
            this.f3658a -= 360.0f;
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, 4.0f + (C0773f.m2110j(this.f3658a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 23.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1044ar = Color.m5243a(255, 50, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4523a.f1022U = mo2835q(i);
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 85.0f;
        m4523a.f995t = 2.0f;
        m4523a.f993r = 6.0f;
        m4523a.f994s = 0.2f;
        m4523a.f1017P = (short) 6;
        m4523a.f999x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -14483678);
        gameEngine.f6329bR.m2377a(m4523a, -16716288);
        gameEngine.f6324bM.m2811a(C0637e.f4092z, 0.3f, 1.3f + C0773f.m2151c(-0.07f, 0.07f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 140.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 180.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: i */
    public void mo2860i(float f) {
        this.f1623cg += f;
        if (this.f1623cg > 180.0f) {
            this.f1623cg -= 360.0f;
        }
        if (this.f1623cg < -180.0f) {
            this.f1623cg += 360.0f;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.09f;
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
    /* renamed from: c */
    public float mo2883c(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public float mo3259d(boolean z) {
        return this.f1654cL[0].f1717a + 90.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
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
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.5f;
    }
}