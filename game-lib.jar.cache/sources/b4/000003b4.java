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
import com.corrodinggames.rts.gameFramework.p035d.C0758c;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/e.class */
public class C0527e extends AbstractC0530h {

    /* renamed from: a */
    float f3644a;

    /* renamed from: b */
    static C0970e f3645b = null;

    /* renamed from: c */
    static C0970e f3646c = null;

    /* renamed from: d */
    static C0970e f3647d = null;

    /* renamed from: e */
    static C0970e[] f3648e = new C0970e[10];

    /* renamed from: f */
    Rect f3649f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.heavyHoverTank;
    }

    /* renamed from: f */
    public static void m3264f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3646c = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_hover_tank);
        f3645b = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_hover_tank_dead);
        f3647d = gameEngine.f6326bO.mo222a(C0067R.drawable.heavy_hover_tank_shadow);
        f3648e = PlayerData.m4432a(f3646c);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3645b;
        }
        return f3648e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3647d;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine();
        this.f3917M = f3645b;
        m448S(0);
        this.f1610bT = false;
        m3014a(EnumC0233ab.normal);
        return true;
    }

    public C0527e(boolean z) {
        super(z);
        this.f3644a = 0.0f;
        this.f3649f = new Rect();
        m2729T(24);
        m2728U(36);
        this.f1626cj = 11.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 450.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3646c;
        this.f3918N = f3647d;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0530h, com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV || !m4226bT()) {
            return;
        }
        this.f3644a += 3.0f * f;
        if (this.f3644a > 360.0f) {
            this.f3644a -= 360.0f;
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, 4.0f + (C0773f.m2110j(this.f3644a) * 1.5f), 0.1f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 40.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 0, 50);
        m4523a.f1022U = mo2835q(i);
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 95.0f;
        m4523a.f995t = 1.0f;
        m4523a.f993r = 7.0f;
        m4523a.f994s = 0.2f;
        m4523a.f1017P = (short) 7;
        m4523a.f999x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0760e m2385a = gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -56798);
        if (m2385a != null) {
            m2385a.f4814E = 0.7f;
            m2385a.f4831V = 30.0f;
            m2385a.f4832W = m2385a.f4831V;
            C0758c.m2379a(m2385a, this);
        }
        gameEngine.f6329bR.m2377a(m4523a, -1179648);
        gameEngine.f6324bM.m2812a(C0637e.f4092z, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 160.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 75.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 0.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 20.0f;
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
        return 0.06f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.09f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 2.4f;
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
        return 16.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}