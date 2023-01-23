package com.corrodinggames.rts.game.units.d.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/a/c.class */
public abstract class c {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ b f327a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract float a();

    public abstract float a(int i);

    public abstract float b(int i);

    public abstract void a(am amVar, int i);

    public abstract com.corrodinggames.rts.gameFramework.m.e d(int i);

    public abstract int b();

    public abstract String c();

    public abstract void a(c cVar);

    public abstract int d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(b bVar) {
        this.f327a = bVar;
    }

    public PointF c(int i) {
        PointF E;
        E = super/*com.corrodinggames.rts.game.units.d.i*/.E(i);
        return E;
    }

    public boolean a(String str) {
        return c().equals(str);
    }

    public void a(float f) {
    }

    public float e(int i) {
        return 5.0f;
    }

    public float f(int i) {
        return 0.5f;
    }

    public float g(int i) {
        return 23.0f;
    }

    public float h(int i) {
        return -1.0f;
    }
}