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
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/b/a.class */
public class C0308a extends AbstractC0309b {

    /* renamed from: a */
    static C0970e f1839a = null;

    /* renamed from: b */
    static C0970e f1840b = null;

    /* renamed from: c */
    static C0970e f1841c = null;

    /* renamed from: d */
    static C0970e f1842d = null;

    /* renamed from: e */
    static C0970e[] f1843e = new C0970e[10];

    /* renamed from: f */
    float f1844f;

    /* renamed from: g */
    Rect f1845g;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.airShip;
    }

    /* renamed from: f */
    public static void m4130f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f1840b = gameEngine.f6326bO.mo222a(C0067R.drawable.ship);
        f1841c = gameEngine.f6326bO.mo222a(C0067R.drawable.ship_shadow);
        f1839a = gameEngine.f6326bO.mo222a(C0067R.drawable.ship_dead);
        f1843e = PlayerData.m4432a(f1840b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1839a;
        }
        return f1843e[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f1841c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f1842d;
    }

    @Override // com.corrodinggames.rts.game.units.p014b.AbstractC0309b, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f1839a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0308a(boolean z) {
        super(z);
        this.f1845g = new Rect();
        m2729T(24);
        m2728U(22);
        this.f1626cj = 11.0f;
        this.f1627ck = this.f1626cj + 0.0f;
        this.f1638cv = 250.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1840b;
        this.f3918N = f1841c;
        this.f7174eq = 0.0f;
        this.f1844f = 0.18f;
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
        this.f7174eq = C0773f.m2217a(this.f7174eq, 20.0f, 0.3f * f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4523a = C0188f.m4523a(this, E.x, E.y, this.f7174eq, i);
        PointF K = mo3046K(i);
        m4523a.f1012K = K.x;
        m4523a.f1013L = K.y;
        m4523a.f1022U = 30.0f;
        m4523a.f987l = abstractC0244am;
        m4523a.f983h = 75.0f;
        m4523a.f995t = 6.0f;
        m4523a.f999x = 2.0f;
        m4523a.f1000y = 4.0f;
        m4523a.f1044ar = Color.m5243a(250, 74, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_RADIO_SERVICE, 255);
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0760e m2390a = gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        if (m2390a != null) {
            m2390a.f4849aq = 10;
        }
        gameEngine.f6324bM.m2811a(C0637e.f4091y, 0.14f, 1.0f + C0773f.m2151c(-0.1f, 0.1f), E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 170.0f;
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
        return 2.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 3.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bm */
    public boolean mo2899bm() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: w */
    public float mo2825w(int i) {
        return 0.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.16f;
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
    /* renamed from: ag */
    public boolean mo2954ag() {
        return false;
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
}