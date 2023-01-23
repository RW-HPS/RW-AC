package com.corrodinggames.rts.game.units.a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f.ae;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class g extends s {

    /* renamed from: a  reason: collision with root package name */
    public s f177a;
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
        return this.f177a.b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d(am amVar) {
        return this.f177a.d(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return this.f177a.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String e(am amVar) {
        return this.f177a.e(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return this.f177a.c();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return this.f177a.b(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n_() {
        return this.f177a.n_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, boolean z) {
        return this.f177a.a(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int t() {
        return this.f177a.t();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void f(am amVar) {
        this.f177a.f(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g(am amVar) {
        return this.f177a.g(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean u() {
        return this.f177a.u();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return this.f177a.h();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as i() {
        return this.f177a.i();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return this.f177a.g();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return this.f177a.e();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return this.f177a.f();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        K();
        String d2 = this.f177a.d();
        L();
        return d2;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return this.f177a.h_();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar, Paint paint, Paint paint2) {
        K();
        this.f177a.a(this.b, aeVar, paint, paint2);
        L();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, ae aeVar) {
        K();
        this.f177a.a(this.b, aeVar);
        L();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e j() {
        return this.f177a.j();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e h(am amVar) {
        return this.f177a.h(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public Rect v() {
        return this.f177a.v();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public am i(am amVar) {
        return this.f177a.i(this.b);
    }

    public int hashCode() {
        return this.f177a.hashCode();
    }

    public String toString() {
        return this.f177a.toString();
    }

    public g(s sVar, com.corrodinggames.rts.game.units.y yVar, c cVar) {
        super(cVar);
        this.c = b.emptyActionFilter;
        this.f177a = sVar;
        this.b = yVar;
        this.g = this.f177a.g;
    }

    public s p_() {
        return this.f177a;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean x() {
        return this.f177a.x();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return this.f177a.s();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as y() {
        return this.f177a.y();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public c z() {
        return this.f177a.N();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void a(am amVar, am amVar2) {
        super.a(amVar, amVar2);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar, PlayerData playerData) {
        return this.f177a.a(this.b, playerData);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean A() {
        return this.f177a.A();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean a(am amVar) {
        return this.f177a.a((am) this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        return this.f177a.B();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String j(am amVar) {
        return this.f177a.j(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean d(am amVar, boolean z) {
        return this.f177a.d(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean k(am amVar) {
        return this.f177a.k(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean l(am amVar) {
        return this.f177a.l(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean C() {
        return this.f177a.C();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean D() {
        return this.f177a.D();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public as E() {
        return this.f177a.E();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean F() {
        return this.f177a.F();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean m(am amVar) {
        return this.f177a.m(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean n(am amVar) {
        return this.f177a.n(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean c(am amVar, boolean z) {
        return this.f177a.c(this.b, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean o(am amVar) {
        return this.f177a.o(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean G() {
        return this.f177a.G();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void c(am amVar) {
        this.f177a.c(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float l() {
        return this.f177a.l();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int m() {
        return this.f177a.m();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean H() {
        return this.f177a.H();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean I() {
        return this.f177a.I();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public float p(am amVar) {
        return this.f177a.p(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public ArrayList q(am amVar) {
        return this.f177a.q(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean r(am amVar) {
        if (!this.c.isAvailable(this, amVar)) {
            return false;
        }
        return this.f177a.r(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        if (!this.c.isAvailable(this, amVar)) {
            return false;
        }
        return this.f177a.b(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int J() {
        return this.f177a.J();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s(am amVar) {
        return this.f177a.s(this.b);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean t(am amVar) {
        return this.f177a.t(this.b);
    }

    public boolean a(g gVar) {
        return this.f177a == gVar.f177a && this.b == gVar.b && N() == gVar.N() && this.c == gVar.c;
    }
}