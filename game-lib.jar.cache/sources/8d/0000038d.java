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

/* renamed from: com.corrodinggames.rts.game.units.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/h.class */
class C0488h extends AbstractC0483c {

    /* renamed from: b */
    final /* synthetic */ C0478b f3443b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0488h(C0478b c0478b) {
        super(c0478b);
        this.f3443b = c0478b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: c */
    public String mo3417c() {
        return C0478b.f3418t;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public int mo3416d() {
        return EnumC0249ar.turret.mo3529c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public C0970e mo3415d(int i) {
        C0970e c0970e;
        c0970e = C0478b.f3408a;
        return c0970e;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    float mo3424a() {
        return 165.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public float mo3418b(int i) {
        return 41.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public float mo3422a(int i) {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: g */
    public float mo3414g(int i) {
        return 21.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3421a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3425c(i);
        C0188f m4523a = C0188f.m4523a(this.f3443b, c.x, c.y);
        PointF K = this.f3443b.mo3046K(i);
        m4523a.f1019K = K.x;
        m4523a.f1020L = K.y;
        m4523a.f994l = abstractC0244am;
        m4523a.f990h = 60.0f;
        m4523a.f1002t = 5.0f;
        m4523a.f1052ar = Color.m5237a(255, 100, 30, 30);
        m4523a.f1029U = mo3418b(i);
        m4523a.f1024P = (short) 5;
        m4523a.f1006x = 1.0f;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6377bR.m2385a(c.x, c.y, this.f3443b.f7175eq, -1127220);
        gameEngine.f6377bR.m2390a(c.x, c.y, this.f3443b.f7175eq, this.f3443b.f1654cL[i].f1717a);
        gameEngine.f6372bM.m2811a(C0637e.f4086t, 0.3f, 1.0f + C0773f.m2151c(-0.07f, 0.07f), c.x, c.y);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public int mo3419b() {
        return 1;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3420a(AbstractC0483c abstractC0483c) {
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3423a(float f) {
        this.f3443b.mo3435s(f);
    }
}