package com.corrodinggames.rts.game.units.p015c;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0205a;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p026e.AbstractC0534j;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.c.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/c/a.class */
public class C0319a extends AbstractC0534j {

    /* renamed from: a */
    static C0970e f1904a = null;

    /* renamed from: b */
    static C0970e f1905b = null;

    /* renamed from: c */
    static C0970e f1906c = null;

    /* renamed from: d */
    static C0970e[] f1907d = new C0970e[10];

    /* renamed from: e */
    int f1908e;

    /* renamed from: f */
    float f1909f;

    /* renamed from: g */
    Rect f1910g;

    /* renamed from: h */
    Rect f1911h;

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.ladybug;
    }

    /* renamed from: f */
    public static void m4110f() {
        f1905b = GameEngine.getGameEngine().f6326bO.mo222a(C0067R.drawable.ladybug);
        f1907d = PlayerData.m4432a(f1905b);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f1904a;
        }
        return f1907d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.f6329bR.m2365b(this.f7172eo, this.f7173ep, this.f7174eq, EnumC0759d.blood, false, EnumC0763h.high) != null) {
        }
        gameEngine.f6324bM.m2812a(C0637e.f4093A, 0.8f, this.f7172eo, this.f7173ep);
        C0195l.m4477a(this, 1);
        return false;
    }

    public C0319a(boolean z) {
        super(z);
        this.f1908e = 0;
        this.f1909f = 0.0f;
        this.f1910g = new Rect();
        this.f1911h = new Rect();
        m2729T(17);
        m2728U(26);
        this.f1626cj = 5.0f;
        this.f1627ck = this.f1626cj + 3.0f;
        this.f1638cv = 130.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f1905b;
        this.f3926P = EnumC0205a.f1422a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a_ */
    public Rect mo3227a_(boolean z) {
        int i = this.f1908e * this.f4260es;
        this.f1910g.m5172a(i, 0, i + this.f4260es, 0 + this.f4261et);
        return this.f1910g;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bP */
    public boolean mo3634bP() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bO */
    public boolean mo3635bO() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1653cK) {
            if (this.f1908e == 0) {
                this.f1908e = 1;
            } else {
                this.f1908e = 0;
            }
        }
        if (this.f1909f != 0.0f) {
            this.f1909f = C0773f.m2218a(this.f1909f, f);
            this.f1908e = 2;
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
        C0188f.m4522a((AbstractC0244am) this, abstractC0244am, 14.0f, (C0188f) null, false);
        this.f1909f = 4.0f;
        PointF E = mo3056E(i);
        GameEngine.getGameEngine().f6324bM.m2812a(C0637e.f4094B, 0.3f, E.x, E.y);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 43.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 17.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        return 5.5f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: c */
    public boolean mo438c(float f) {
        return super.mo438c(f);
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
        return 7.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: E */
    public boolean mo3057E() {
        return true;
    }
}