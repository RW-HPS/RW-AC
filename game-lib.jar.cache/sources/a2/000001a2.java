package com.corrodinggames.rts.game.units.a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.ae;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class g extends s {
    public s a;
    public com.corrodinggames.rts.game.units.y b;
    public b c;
    static com.corrodinggames.rts.gameFramework.utility.u d;
    static final com.corrodinggames.rts.gameFramework.utility.u e = new com.corrodinggames.rts.gameFramework.utility.u();

    private void K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        d = gameEngine.bS.bZ;
        e.clear();
        e.add(this.b);
        gameEngine.bS.bZ = e;
    }

    private void L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        gameEngine.bS.bZ = d;
        d = null;
        e.clear();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float m_() {
        return super.m_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(s sVar) {
        return super.compareTo(sVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return this.a.b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        return this.a.d(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return this.a.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String e(am amVar) {
        return this.a.e(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return this.a.c();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return this.a.b(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return this.a.n_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        return this.a.a(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int t() {
        return this.a.t();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void f(am amVar) {
        this.a.f(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        return this.a.g(this.b);
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
        K();
        String d2 = this.a.d();
        L();
        return d2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return this.a.h_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar, Paint paint, Paint paint2) {
        K();
        this.a.a(this.b, aeVar, paint, paint2);
        L();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar) {
        K();
        this.a.a(this.b, aeVar);
        L();
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
        return this.a.i(this.b);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return this.a.toString();
    }

    public g(s sVar, com.corrodinggames.rts.game.units.y yVar, c cVar) {
        super(cVar);
        this.c = b.emptyActionFilter;
        this.a = sVar;
        this.b = yVar;
        this.g = this.a.g;
    }

    public s p_() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean x() {
        return this.a.x();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return this.a.s();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        return this.a.y();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public c z() {
        return this.a.N();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, am amVar2) {
        super.a(amVar, amVar2);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, PlayerData playerData) {
        return this.a.a(this.b, playerData);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean A() {
        return this.a.A();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar) {
        return this.a.a((am) this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        return this.a.B();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String j(am amVar) {
        return this.a.j(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean d(am amVar, boolean z) {
        return this.a.d(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean k(am amVar) {
        return this.a.k(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean l(am amVar) {
        return this.a.l(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean C() {
        return this.a.C();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean D() {
        return this.a.D();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as E() {
        return this.a.E();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean F() {
        return this.a.F();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean m(am amVar) {
        return this.a.m(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n(am amVar) {
        return this.a.n(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        return this.a.c(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o(am amVar) {
        return this.a.o(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean G() {
        return this.a.G();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void c(am amVar) {
        this.a.c(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        return this.a.l();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int m() {
        return this.a.m();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean H() {
        return this.a.H();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean I() {
        return this.a.I();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float p(am amVar) {
        return this.a.p(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public ArrayList q(am amVar) {
        return this.a.q(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean r(am amVar) {
        if (!this.c.isAvailable(this, amVar)) {
            return false;
        }
        return this.a.r(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        if (!this.c.isAvailable(this, amVar)) {
            return false;
        }
        return this.a.b(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int J() {
        return this.a.J();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s(am amVar) {
        return this.a.s(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean t(am amVar) {
        return this.a.t(this.b);
    }

    public boolean a(g gVar) {
        return this.a == gVar.a && this.b == gVar.b && N() == gVar.N() && this.c == gVar.c;
    }
}