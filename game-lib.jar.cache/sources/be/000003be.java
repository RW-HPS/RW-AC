package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/m.class */
public class C0537m extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3698a = null;

    /* renamed from: b */
    static C0970e f3699b = null;

    /* renamed from: c */
    static C0970e f3700c = null;

    /* renamed from: d */
    static C0970e[] f3701d = new C0970e[10];

    /* renamed from: e */
    Rect f3702e;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.megaTank;
    }

    /* renamed from: f */
    public static void m3229f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3699b = gameEngine.f6326bO.mo222a(C0067R.drawable.mega_tank);
        f3698a = gameEngine.f6326bO.mo222a(C0067R.drawable.mega_tank_dead);
        f3700c = gameEngine.f6326bO.mo222a(C0067R.drawable.mega_tank_turret);
        f3701d = PlayerData.m4432a(f3699b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3698a;
        }
        return f3701d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3700c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3698a;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4081o, 0.8f, this.f7172eo, this.f7173ep);
        mo2895bq();
        return true;
    }

    public C0537m(boolean z) {
        super(z);
        this.f3702e = new Rect();
        m2729T(20);
        m2728U(25);
        this.f1626cj = 12.0f;
        this.f1627ck = this.f1626cj + 1.0f;
        this.f1638cv = 550.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3699b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 7000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        if (!abstractC0244am.mo3068i()) {
            PointF E = mo3056E(i);
            C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
            m4525a.f1044ar = Color.m5243a(255, 150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 40);
            m4525a.f1022U = 50.0f;
            m4525a.f987l = abstractC0244am;
            m4525a.f983h = 60.0f;
            m4525a.f995t = 3.0f;
            m4525a.f999x = 2.0f;
            m4525a.f1069aQ = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1127220);
            gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
            gameEngine.f6324bM.m2812a(C0637e.f4087u, 0.3f, this.f7172eo, this.f7173ep);
            return;
        }
        C0188f m4525a2 = C0188f.m4525a(this, this.f7172eo, this.f7173ep);
        m4525a2.f1044ar = Color.m5243a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE, 50);
        m4525a2.f1022U = 40.0f;
        m4525a2.f987l = abstractC0244am;
        m4525a2.f983h = 190.0f;
        m4525a2.f995t = 4.0f;
        m4525a2.f1060aH = true;
        m4525a2.f1061aI = 10.0f;
        m4525a2.f1062aJ = 15.0f;
        m4525a2.f1065aM = true;
        m4525a2.f1069aQ = true;
        GameEngine.getGameEngine().f6324bM.m2812a(C0637e.f4079m, 0.2f, this.f7172eo, this.f7173ep);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 140.0f;
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
    /* renamed from: A */
    public float mo3065A() {
        return 1.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 2.0f;
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
        return 12.0f;
    }
}