package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0795ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1147u;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/g.class */
public class C0212g extends AbstractC0224s {

    /* renamed from: a */
    public AbstractC0224s f1436a;

    /* renamed from: b */
    public AbstractC0629y f1437b;

    /* renamed from: c */
    public C0207b f1438c;

    /* renamed from: d */
    static C1147u f1439d;

    /* renamed from: e */
    static final C1147u f1440e = new C1147u();

    /* renamed from: K */
    private void m4329K() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (f1439d != null) {
            throw new RuntimeException("savedSelectedUnitsCache!=null");
        }
        f1439d = gameEngine.f6330bS.f5427bZ;
        f1440e.clear();
        f1440e.mo495a(this.f1437b);
        gameEngine.f6330bS.f5427bZ = f1440e;
    }

    /* renamed from: L */
    private void m4328L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (f1439d == null) {
            throw new RuntimeException("savedSelectedUnitsCache==null");
        }
        gameEngine.f6330bS.f5427bZ = f1439d;
        f1439d = null;
        f1440e.clear();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m_ */
    public float mo4280m_() {
        return super.mo4280m_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s, java.lang.Comparable
    /* renamed from: a */
    public int mo4326a(AbstractC0224s abstractC0224s) {
        return super.mo4307a(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3095b() {
        return this.f1436a.mo3095b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo4066d(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4066d(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3098a() {
        return this.f1436a.mo3098a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo4064e(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4064e(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3092c() {
        return this.f1436a.mo3092c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1436a.mo3093b(this.f1437b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n_ */
    public boolean mo4289n_() {
        return this.f1436a.mo4289n_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1436a.mo3096a(this.f1437b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4288t() {
        return this.f1436a.mo4288t();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public void mo3429f(AbstractC0244am abstractC0244am) {
        this.f1436a.mo3429f(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo4063g(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4063g(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        return this.f1436a.mo4051u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo3088h() {
        return this.f1436a.mo3088h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo5457i() {
        return this.f1436a.mo5457i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3089g() {
        return this.f1436a.mo3089g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        return this.f1436a.mo3091e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3090f() {
        return this.f1436a.mo3090f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3123d() {
        m4329K();
        String mo3123d = this.f1436a.mo3123d();
        m4328L();
        return mo3123d;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3087h_() {
        return this.f1436a.mo3087h_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4303a(AbstractC0244am abstractC0244am, C0795ae c0795ae, Paint paint, Paint paint2) {
        m4329K();
        this.f1436a.mo4303a(this.f1437b, c0795ae, paint, paint2);
        m4328L();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4304a(AbstractC0244am abstractC0244am, C0795ae c0795ae) {
        m4329K();
        this.f1436a.mo4304a(this.f1437b, c0795ae);
        m4328L();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0970e mo3150j() {
        return this.f1436a.mo3150j();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0970e mo4062h(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4062h(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4293v() {
        return this.f1436a.mo4293v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo4061i(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4061i(this.f1437b);
    }

    public int hashCode() {
        return this.f1436a.hashCode();
    }

    public String toString() {
        return this.f1436a.toString();
    }

    public C0212g(AbstractC0224s abstractC0224s, AbstractC0629y abstractC0629y, C0208c c0208c) {
        super(c0208c);
        this.f1438c = C0207b.emptyActionFilter;
        this.f1436a = abstractC0224s;
        this.f1437b = abstractC0629y;
        this.f1464g = this.f1436a.f1464g;
    }

    /* renamed from: p_ */
    public AbstractC0224s m4325p_() {
        return this.f1436a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: x */
    public boolean mo4292x() {
        return this.f1436a.mo4292x();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        return this.f1436a.mo4278s();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo4049y() {
        return this.f1436a.mo4049y();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: z */
    public C0208c mo4291z() {
        return this.f1436a.m4309N();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4305a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        super.mo4305a(abstractC0244am, abstractC0244am2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo4068a(AbstractC0244am abstractC0244am, PlayerData playerData) {
        return this.f1436a.mo4068a(this.f1437b, playerData);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: A */
    public boolean mo4079A() {
        return this.f1436a.mo4079A();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3152a(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo3152a((AbstractC0244am) this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0429b mo4078B() {
        return this.f1436a.mo4078B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public String mo4060j(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4060j(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public boolean mo4065d(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1436a.mo4065d(this.f1437b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: k */
    public boolean mo4059k(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4059k(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public boolean mo4058l(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4058l(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: C */
    public boolean mo4283C() {
        return this.f1436a.mo4283C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: D */
    public boolean mo4290D() {
        return this.f1436a.mo4290D();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: E */
    public InterfaceC0303as mo4077E() {
        return this.f1436a.mo4077E();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: F */
    public boolean mo4076F() {
        return this.f1436a.mo4076F();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public boolean mo4057m(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4057m(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n */
    public boolean mo4056n(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4056n(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3151c(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1436a.mo3151c(this.f1437b, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: o */
    public boolean mo4296o(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4296o(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: G */
    public boolean mo4282G() {
        return this.f1436a.mo4282G();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public void mo4299c(AbstractC0244am abstractC0244am) {
        this.f1436a.mo4299c(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: l */
    public float mo3122l() {
        return this.f1436a.mo3122l();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m */
    public int mo3121m() {
        return this.f1436a.mo3121m();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: H */
    public boolean mo4075H() {
        return this.f1436a.mo4075H();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: I */
    public boolean mo4074I() {
        return this.f1436a.mo4074I();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4287p(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4287p(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: q */
    public ArrayList mo4295q(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4295q(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo4055r(AbstractC0244am abstractC0244am) {
        if (!this.f1438c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1436a.mo4055r(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3094b(AbstractC0244am abstractC0244am) {
        if (!this.f1438c.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1436a.mo3094b(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: J */
    public int mo4073J() {
        return this.f1436a.mo4073J();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4053s(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4053s(this.f1437b);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public boolean mo4052t(AbstractC0244am abstractC0244am) {
        return this.f1436a.mo4052t(this.f1437b);
    }

    /* renamed from: a */
    public boolean m4327a(C0212g c0212g) {
        return this.f1436a == c0212g.f1436a && this.f1437b == c0212g.f1437b && m4309N() == c0212g.m4309N() && this.f1438c == c0212g.f1438c;
    }
}