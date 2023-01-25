package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/e.class */
class C0485e extends AbstractC0483c {

    /* renamed from: b */
    final /* synthetic */ C0478b f3440b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0485e(C0478b c0478b) {
        super(c0478b);
        this.f3440b = c0478b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: c */
    public String mo3417c() {
        return C0478b.f3422x;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public int mo3416d() {
        return EnumC0249ar.turret.mo3529c() + C0478b.f3436dO.mo3093c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public C0970e mo3415d(int i) {
        C0970e c0970e;
        c0970e = C0478b.f3412e;
        return c0970e;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    float mo3424a() {
        return 155.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public float mo3422a(int i) {
        return 5.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public float mo3418b(int i) {
        return 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3421a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3425c(i);
        C0188f m4523a = C0188f.m4523a(this.f3440b, c.x, c.y);
        m4523a.f990h = 60.0f;
        m4523a.f1002t = 3.0f + ((this.f3440b.f3416k * 13) % 2.0f);
        m4523a.f1078aR = false;
        m4523a.f1015G = true;
        m4523a.f1052ar = Color.m5237a(105, 255, 255, 255);
        m4523a.f1024P = (short) 3;
        m4523a.f1006x = 1.3f;
        PointF m4252a = abstractC0244am.m4252a(c.x, c.y, m4523a.f1002t, m4523a.f990h, mo3424a());
        m4523a.f1063aC = true;
        m4523a.f995m = true;
        m4523a.f996n = m4252a.x;
        m4523a.f997o = m4252a.y;
        m4523a.f996n += (-15) + ((this.f3440b.f3416k * 13) % 30);
        m4523a.f997o += (-15) + ((63 + (this.f3440b.f3416k * 33)) % 30);
        m4523a.f7171em = 3;
        m4523a.f1033Y = mo3418b(i);
        m4523a.f1034Z = 65.0f;
        m4523a.f1035aa = true;
        m4523a.f1011C = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f3440b.f3416k++;
        if (this.f3440b.f3416k > 10) {
            this.f3440b.f3416k = 0;
            gameEngine.f6377bR.m2390a(c.x, c.y, this.f3440b.f7175eq, this.f3440b.f1654cL[i].f1717a);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public int mo3419b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3420a(AbstractC0483c abstractC0483c) {
        this.f3440b.f1638cv += 900.0f;
        this.f3440b.f1637cu += 900.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3423a(float f) {
        if (this.f3440b.f1637cu < this.f3440b.f1638cv) {
            this.f3440b.f1637cu += 0.15f * f;
            if (this.f3440b.f1637cu > this.f3440b.f1638cv) {
                this.f3440b.f1637cu = this.f3440b.f1638cv;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: e */
    public float mo3428e(int i) {
        return 11.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: f */
    public float mo3427f(int i) {
        return 2.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: g */
    public float mo3414g(int i) {
        return 18.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: h */
    public float mo3426h(int i) {
        return 0.0f;
    }
}