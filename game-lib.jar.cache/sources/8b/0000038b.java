package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/f.class */
class C0486f extends AbstractC0483c {

    /* renamed from: b */
    final /* synthetic */ C0478b f3441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0486f(C0478b c0478b) {
        super(c0478b);
        this.f3441b = c0478b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: c */
    public String mo3417c() {
        return C0478b.f3419u;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public int mo3416d() {
        return EnumC0249ar.turret.mo3529c() + C0478b.f3433dL.mo3093c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public C0970e mo3415d(int i) {
        C0970e c0970e;
        c0970e = C0478b.f3409b;
        return c0970e;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    float mo3424a() {
        return 185.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public float mo3422a(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public float mo3418b(int i) {
        return 44.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: g */
    public float mo3414g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: c */
    public PointF mo3425c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.mo3056E(i);
        float f = (this.f3441b.mo3057E() ? this.f3441b.f1623cg : this.f3441b.f1654cL[i].f1717a) + (this.f3441b.f3416k == 1 ? -90 : 90);
        E.x += C0773f.m2107k(f) * 4.0f;
        E.y += C0773f.m2110j(f) * 4.0f;
        return E;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3421a(AbstractC0244am abstractC0244am, int i) {
        PointF mo3425c = mo3425c(i);
        C0188f m4523a = C0188f.m4523a(this.f3441b, mo3425c.x, mo3425c.y);
        PointF K = this.f3441b.mo3046K(i);
        m4523a.f1019K = K.x;
        m4523a.f1020L = K.y;
        m4523a.f994l = abstractC0244am;
        m4523a.f990h = 60.0f;
        m4523a.f1002t = 6.0f;
        m4523a.f1052ar = Color.m5237a(255, 40, 30, 110);
        m4523a.f1029U = mo3418b(i);
        m4523a.f1024P = (short) 5;
        m4523a.f1006x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6377bR.m2385a(mo3425c.x, mo3425c.y, this.f3441b.f7175eq, -1127220);
        gameEngine.f6377bR.m2390a(mo3425c.x, mo3425c.y, this.f3441b.f7175eq, this.f3441b.f1654cL[i].f1717a);
        gameEngine.f6372bM.m2811a(C0637e.f4086t, 0.3f, 1.0f + C0773f.m2151c(-0.07f, 0.07f), mo3425c.x, mo3425c.y);
        this.f3441b.f3416k = this.f3441b.f3416k == 1 ? 0 : 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public int mo3419b() {
        return 2;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3420a(AbstractC0483c abstractC0483c) {
        this.f3441b.f1638cv += 400.0f;
        this.f3441b.f1637cu += 400.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3423a(float f) {
        this.f3441b.mo3435s(f);
    }
}