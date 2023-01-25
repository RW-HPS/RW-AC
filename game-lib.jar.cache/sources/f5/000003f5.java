package com.corrodinggames.rts.game.units.p029h;

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
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.h.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h/d.class */
public class C0592d extends AbstractC0596f {

    /* renamed from: a */
    static C0970e f3859a = null;

    /* renamed from: b */
    static C0970e f3860b = null;

    /* renamed from: c */
    static C0970e f3861c = null;

    /* renamed from: d */
    static C0970e[] f3862d = new C0970e[10];

    /* renamed from: e */
    static PointF f3863e = new PointF();

    /* renamed from: f */
    Rect f3864f;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.missileShip;
    }

    /* renamed from: f */
    public static void m3133f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3860b = gameEngine.f6326bO.mo222a(C0067R.drawable.scout_ship);
        f3859a = gameEngine.f6326bO.mo222a(C0067R.drawable.scout_ship_dead);
        f3861c = m4240a(f3860b, f3860b.mo387m(), f3860b.mo388l());
        f3862d = PlayerData.m4432a(f3860b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3859a;
        }
        return f3862d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3861c;
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

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine.getGameEngine().f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3859a;
        m448S(0);
        this.f1610bT = false;
        return true;
    }

    public C0592d(boolean z) {
        super(z);
        this.f3864f = new Rect();
        m2729T(17);
        m2728U(31);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj - 2.0f;
        this.f1638cv = 350.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3860b;
    }

    @Override // com.corrodinggames.rts.game.units.p029h.AbstractC0596f, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public PointF mo3056E(int i) {
        float f = this.f1623cg;
        f3863e.setSite(this.f7172eo + (C0773f.m2107k(f) * 6.0f), this.f7173ep + (C0773f.m2110j(f) * 6.0f));
        return f3863e;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: q */
    public float mo2835q(int i) {
        return 62.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF mo3056E = mo3056E(i);
        if (!abstractC0244am.mo3074Q()) {
            C0188f m4523a = C0188f.m4523a(this, mo3056E.x, mo3056E.y, this.f7174eq, i);
            PointF K = mo3046K(i);
            m4523a.f1012K = K.x;
            m4523a.f1013L = K.y;
            m4523a.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
            m4523a.f1022U = 62.0f;
            m4523a.f987l = abstractC0244am;
            m4523a.f983h = 190.0f;
            m4523a.f995t = 2.0f;
            m4523a.f1060aH = true;
            m4523a.f1065aM = true;
            m4523a.f1069aQ = true;
            gameEngine.f6324bM.m2812a(C0637e.f4079m, 0.8f, this.f7172eo, this.f7173ep);
            gameEngine.f6329bR.m2385a(this.f7172eo, this.f7173ep, this.f7174eq, -1118720);
            gameEngine.f6329bR.m2377a(m4523a, -1118720);
            return;
        }
        C0188f m4523a2 = C0188f.m4523a(this, mo3056E.x, mo3056E.y, this.f7174eq - 1.0f, i);
        m4523a2.f1044ar = Color.m5243a(255, 0, 0, 150);
        m4523a2.f999x = 1.0f;
        m4523a2.f1022U = 42.0f;
        m4523a2.f987l = abstractC0244am;
        m4523a2.f983h = 220.0f;
        m4523a2.f995t = 1.9f;
        m4523a2.f1065aM = true;
        m4523a2.f1069aQ = true;
        gameEngine.f6324bM.m2812a(C0637e.f4079m, 0.8f, this.f7172eo, this.f7173ep);
        gameEngine.f6329bR.m2385a(this.f7172eo, this.f7173ep, this.f7174eq, -1118720);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 200.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 170.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 1.2f;
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
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
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
        return super.mo438c(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: ae */
    public boolean mo2956ae() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: e */
    public void mo434e(float f) {
        super.mo434e(f);
        C1152y.m471a(this, mo2846m());
    }
}