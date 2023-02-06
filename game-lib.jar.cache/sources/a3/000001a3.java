package com.corrodinggames.rts.game.units.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.Interface.ae;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/h.class */
public class h extends s {
    s a;
    b b;
    boolean c;
    public int d;
    public boolean e;
    public final int f;

    @Override // com.corrodinggames.rts.game.units.a.s
    public float m_() {
        return this.a.m_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(s sVar) {
        return this.a.compareTo(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return this.a.b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        return this.a.d(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return this.a.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String e(am amVar) {
        return this.a.e(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return this.a.b(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return this.a.n_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        if (this.c) {
            return this.a.a(amVar, z);
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int t() {
        return this.a.t();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void f(am amVar) {
        this.a.f(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.a.equals(((h) obj).a);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        return this.a.g(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        if (!this.b.isAvailable(this, amVar)) {
            return false;
        }
        return this.a.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return this.a.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return this.a.h();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: i */
    public as mo3i() {
        return this.a.mo3i();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return this.a.g();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return this.a.e();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return this.a.f();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        return this.a.d();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return this.a.h_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar, Paint paint, Paint paint2) {
        this.a.a(amVar, aeVar, paint, paint2);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar) {
        this.a.a(amVar, aeVar);
        as mo3i = this.a.mo3i();
        if (mo3i != null && (mo3i instanceof com.corrodinggames.rts.game.units.custom.l)) {
            com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) mo3i;
            if (lVar.J != null) {
                aeVar.a("\n(mod: " + com.corrodinggames.rts.gameFramework.f.a(lVar.J.a(), 30) + ")", this.f, true);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.unitAction.e j() {
        return this.a.j();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.unitAction.e h(am amVar) {
        return this.a.h(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public Rect v() {
        return this.a.v();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public am i(am amVar) {
        return this.a.i(amVar);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public h(s sVar, b bVar) {
        this(sVar, bVar, false);
    }

    public h(s sVar, b bVar, boolean z) {
        super(sVar.N());
        this.b = b.emptyActionFilter;
        this.d = 0;
        this.f = Color.a(255, 50, 50, 50);
        this.a = sVar;
        this.b = bVar;
        e(this.a.N());
        this.g = this.a.g;
        this.c = z;
    }

    public s q_() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean x() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        if (!this.b.isAvailable(this, null)) {
            return false;
        }
        if (this.c) {
            return this.a.s();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        return this.a.y();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        return this.a.c(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar) {
        return this.a.a(amVar);
    }
}