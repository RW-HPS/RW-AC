package com.corrodinggames.rts.game.units.p026e;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.e.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/o.class */
public class C0539o extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f3712a = null;

    /* renamed from: b */
    static C0970e f3713b = null;

    /* renamed from: c */
    static C0970e f3714c = null;

    /* renamed from: d */
    static C0970e[] f3715d = new C0970e[10];

    /* renamed from: e */
    Rect f3716e;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.tankDestroyer;
    }

    /* renamed from: f */
    public static void m3223f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3713b = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2);
        f3712a = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2_dead);
        f3714c = gameEngine.f6326bO.mo222a(C0067R.drawable.tank2_turret);
        f3715d = PlayerData.m4432a(f3713b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3712a;
        }
        return f3715d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return f3714c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2370b(this.f7172eo, this.f7173ep, this.f7174eq);
        this.f3917M = f3712a;
        m448S(0);
        this.f1610bT = false;
        gameEngine.f6324bM.m2812a(C0637e.f4081o, 0.8f, this.f7172eo, this.f7173ep);
        mo2895bq();
        return true;
    }

    public C0539o(boolean z) {
        super(z);
        this.f3716e = new Rect();
        m2729T(16);
        m2728U(30);
        this.f1626cj = 11.0f;
        this.f1627ck = this.f1626cj + 2.0f;
        this.f1638cv = 350.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3713b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        PointF E = mo3056E(i);
        C0188f m4525a = C0188f.m4525a(this, E.x, E.y);
        m4525a.f1022U = 35.0f;
        m4525a.f987l = abstractC0244am;
        m4525a.f983h = 60.0f;
        m4525a.f995t = 3.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6329bR.m2385a(E.x, E.y, this.f7174eq, -1127220);
        gameEngine.f6329bR.m2390a(E.x, E.y, this.f7174eq, this.f1654cL[i].f1717a);
        gameEngine.f6324bM.m2812a(C0637e.f4083q, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 150.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 70.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 1.9f;
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
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: g */
    public float mo2866g(int i) {
        return 10.0f;
    }
}