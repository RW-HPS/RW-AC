package com.corrodinggames.rts.game.units.p014b;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/e.class */
public class C0316e extends AbstractC0309b {

    /* renamed from: a */
    static C0970e f1885a = null;

    /* renamed from: b */
    static C0970e f1886b = null;

    /* renamed from: c */
    static C0970e f1887c = null;

    /* renamed from: d */
    static C0970e f1888d = null;

    /* renamed from: e */
    static C0970e[] f1889e = new C0970e[10];

    /* renamed from: f */
    float f1890f;

    /* renamed from: g */
    Rect f1891g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.gunShip;
    }

    /* renamed from: f */
    public static void m4114f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1886b = gameEngine.f6326bO.mo222a(C0067R.drawable.gunship);
        f1887c = gameEngine.f6326bO.mo222a(C0067R.drawable.gunship_shadow);
        f1885a = gameEngine.f6326bO.mo222a(C0067R.drawable.gunship_dead);
        f1889e = PlayerData.m4432a(f1886b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1885a;
        }
        return f1889e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f1887c;
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
        this.f3917M = f1885a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0316e(boolean z) {
        super(z);
        this.f1890f = 0.0f;
        this.f1891g = new Rect();
        m2729T(25);
        m2728U(35);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj + 0.0f;
        this.f1638cv = 260.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1886b;
        this.f3918N = f1887c;
        this.f7174eq = 0.0f;
        m448S(5);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: I */
    public boolean mo3049I() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0627w, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: i */
    public boolean mo3068i() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV) {
            return;
        }
        this.f1890f += 2.0f * f;
        if (this.f1890f > 360.0f) {
            this.f1890f -= 360.0f;
        }
        this.f7174eq = C0773f.m2217a(this.f7174eq, 20.0f + (C0773f.m2110j(this.f1890f) * 1.5f), 0.1f * f);
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
    /* renamed from: q */
    public float mo2835q(int i) {
        return 35.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3056E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, mo3056E.x, mo3056E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1044ar = Color.m5243a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
        m4523a.f1022U = mo2835q(i);
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
        if (this.f7174eq < 15.0f) {
            return 0.0f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bi */
    public boolean mo2903bi() {
        return true;
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
        return 0.2f;
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
    /* renamed from: af */
    public boolean mo2955af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 15.0f;
    }
}