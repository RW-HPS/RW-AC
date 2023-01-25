package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.p037f.C0795ae;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.game.units.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/h.class */
public class C0213h extends AbstractC0224s {

    /* renamed from: a */
    AbstractC0224s f1441a;

    /* renamed from: b */
    C0207b f1442b;

    /* renamed from: c */
    boolean f1443c;

    /* renamed from: d */
    public int f1444d;

    /* renamed from: e */
    public boolean f1445e;

    /* renamed from: f */
    public final int f1446f;

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: m_ */
    public float mo4280m_() {
        return this.f1441a.mo4280m_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s, java.lang.Comparable
    /* renamed from: a */
    public int compareTo(AbstractC0224s abstractC0224s) {
        return this.f1441a.compareTo(abstractC0224s);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return this.f1441a.mo3096b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo4066d(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo4066d(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return this.f1441a.mo3099a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public String mo4064e(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo4064e(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3094b(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1441a.mo3094b(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n_ */
    public boolean mo4289n_() {
        return this.f1441a.mo4289n_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3097a(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f1443c) {
            return this.f1441a.mo3097a(abstractC0244am, z);
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4288t() {
        return this.f1441a.mo4288t();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public void mo3430f(AbstractC0244am abstractC0244am) {
        this.f1441a.mo3430f(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        if (obj instanceof C0213h) {
            return this.f1441a.equals(((C0213h) obj).f1441a);
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo4063g(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo4063g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3095b(AbstractC0244am abstractC0244am) {
        if (!this.f1442b.isAvailable(this, abstractC0244am)) {
            return false;
        }
        return this.f1441a.mo3095b(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        return this.f1441a.mo4051u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo3089h() {
        return this.f1441a.mo3089h();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo3087i() {
        return this.f1441a.mo3087i();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return this.f1441a.mo3090g();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        return this.f1441a.mo3092e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        return this.f1441a.mo3091f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: d */
    public String mo3124d() {
        return this.f1441a.mo3124d();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3088h_() {
        return this.f1441a.mo3088h_();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4303a(AbstractC0244am abstractC0244am, C0795ae c0795ae, Paint paint, Paint paint2) {
        this.f1441a.mo4303a(abstractC0244am, c0795ae, paint, paint2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public void mo4304a(AbstractC0244am abstractC0244am, C0795ae c0795ae) {
        this.f1441a.mo4304a(abstractC0244am, c0795ae);
        InterfaceC0303as mo3087i = this.f1441a.mo3087i();
        if (mo3087i != null && (mo3087i instanceof C0458l)) {
            C0458l c0458l = (C0458l) mo3087i;
            if (c0458l.f2968J != null) {
                c0795ae.m1977a("\n(mod: " + C0773f.m2184a(c0458l.f2968J.m1673a(), 30) + ")", this.f1446f, true);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0970e mo3151j() {
        return this.f1441a.mo3151j();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public C0970e mo4062h(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo4062h(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4293v() {
        return this.f1441a.mo4293v();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public AbstractC0244am mo4061i(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo4061i(abstractC0244am);
    }

    public int hashCode() {
        return this.f1441a.hashCode();
    }

    public String toString() {
        return this.f1441a.toString();
    }

    public C0213h(AbstractC0224s abstractC0224s, C0207b c0207b) {
        this(abstractC0224s, c0207b, false);
    }

    public C0213h(AbstractC0224s abstractC0224s, C0207b c0207b, boolean z) {
        super(abstractC0224s.m4309N());
        this.f1442b = C0207b.emptyActionFilter;
        this.f1444d = 0;
        this.f1446f = Color.m5237a(255, 50, 50, 50);
        this.f1441a = abstractC0224s;
        this.f1442b = c0207b;
        m4297e(this.f1441a.m4309N());
        this.f1464g = this.f1441a.f1464g;
        this.f1443c = z;
    }

    /* renamed from: q_ */
    public AbstractC0224s m4323q_() {
        return this.f1441a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: x */
    public boolean mo4292x() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        if (!this.f1442b.isAvailable(this, null)) {
            return false;
        }
        if (this.f1443c) {
            return this.f1441a.mo4278s();
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo4049y() {
        return this.f1441a.mo4049y();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public boolean mo3152c(AbstractC0244am abstractC0244am, boolean z) {
        return this.f1441a.mo3152c(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3153a(AbstractC0244am abstractC0244am) {
        return this.f1441a.mo3153a(abstractC0244am);
    }
}