package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0637e;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.d.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/d.class */
class C0484d extends AbstractC0483c {

    /* renamed from: b */
    final /* synthetic */ C0478b f3439b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C0484d(C0478b c0478b) {
        super(c0478b);
        this.f3439b = c0478b;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: c */
    public String mo3417c() {
        return C0478b.f3421w;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public int mo3416d() {
        return EnumC0249ar.turret.mo3529c() + C0478b.f3435dN.mo3093c();
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: d */
    public C0970e mo3415d(int i) {
        C0970e c0970e;
        c0970e = C0478b.f3411d;
        return c0970e;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    float mo3424a() {
        return 350.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public float mo3422a(int i) {
        return 220.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: b */
    public float mo3418b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: a */
    public void mo3421a(AbstractC0244am abstractC0244am, int i) {
        PointF c = mo3425c(i);
        C0188f m4523a = C0188f.m4523a(this.f3439b, c.x, c.y);
        PointF K = this.f3439b.mo3046K(i);
        m4523a.f1019K = K.x;
        m4523a.f1020L = K.y;
        m4523a.f990h = 150.0f;
        m4523a.f1002t = 4.0f;
        m4523a.f1077aQ = true;
        m4523a.f1052ar = Color.m5237a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m4523a.f1026R = (short) 2;
        m4523a.f1024P = (short) 0;
        m4523a.f1006x = 0.9f;
        PointF m4252a = abstractC0244am.m4252a(c.x, c.y, m4523a.f1002t, m4523a.f990h, mo3424a());
        m4523a.f1063aC = true;
        m4523a.f995m = true;
        m4523a.f996n = m4252a.x;
        m4523a.f997o = m4252a.y;
        m4523a.f1033Y = mo3418b(i);
        m4523a.f1034Z = 55.0f;
        m4523a.f1035aa = true;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6372bM.m2812a(C0637e.f4084r, 0.3f, c.x, c.y);
        gameEngine.f6377bR.m2390a(c.x, c.y, this.f3439b.f7175eq, this.f3439b.f1654cL[i].f1717a);
        gameEngine.f6377bR.m2377a(m4523a, -1118482);
        C0760e m2385a = gameEngine.f6377bR.m2385a(c.x, c.y, this.f3439b.f7175eq, -1118482);
        if (m2385a != null) {
            m2385a.f4847V = 15.0f;
            m2385a.f4848W = m2385a.f4847V;
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
        this.f3439b.f1638cv += 300.0f;
        this.f3439b.f1637cu += 300.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: e */
    public float mo3428e(int i) {
        return 2.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: f */
    public float mo3427f(int i) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.p025a.AbstractC0483c
    /* renamed from: h */
    public float mo3426h(int i) {
        return -2.0f;
    }
}