package com.corrodinggames.rts.game.units.p024d.p025a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/c.class */
abstract class AbstractC0483c {

    /* renamed from: a */
    final /* synthetic */ C0478b f3438a;

    /* renamed from: a */
    abstract float mo3423a();

    /* renamed from: a */
    public abstract float mo3421a(int i);

    /* renamed from: b */
    public abstract float mo3417b(int i);

    /* renamed from: a */
    public abstract void mo3420a(AbstractC0244am abstractC0244am, int i);

    /* renamed from: d */
    public abstract C0970e mo3414d(int i);

    /* renamed from: b */
    public abstract int mo3418b();

    /* renamed from: c */
    public abstract String mo3416c();

    /* renamed from: a */
    public abstract void mo3419a(AbstractC0483c abstractC0483c);

    /* renamed from: d */
    public abstract int mo3415d();

    AbstractC0483c(C0478b c0478b) {
        this.f3438a = c0478b;
    }

    /* renamed from: c */
    public PointF mo3424c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.mo3056E(i);
        return E;
    }

    /* renamed from: a */
    public boolean m3428a(String str) {
        return mo3416c().equals(str);
    }

    /* renamed from: a */
    public void mo3422a(float f) {
    }

    /* renamed from: e */
    public float mo3427e(int i) {
        return 5.0f;
    }

    /* renamed from: f */
    public float mo3426f(int i) {
        return 0.5f;
    }

    /* renamed from: g */
    public float mo3413g(int i) {
        return 23.0f;
    }

    /* renamed from: h */
    public float mo3425h(int i) {
        return -1.0f;
    }
}