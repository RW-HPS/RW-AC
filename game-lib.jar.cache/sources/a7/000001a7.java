package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.p037f.C0775a;

/* renamed from: com.corrodinggames.rts.game.units.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/l.class */
public class C0217l extends AbstractC0228w {

    /* renamed from: a */
    InterfaceC0303as f1462a;

    public C0217l(InterfaceC0303as interfaceC0303as) {
        this(interfaceC0303as, -999.0f);
    }

    public C0217l(InterfaceC0303as interfaceC0303as, float f) {
        super("u_" + interfaceC0303as.mo3489v());
        InterfaceC0303as m3527c = C0458l.m3527c(interfaceC0303as);
        if (m3527c != null) {
            interfaceC0303as = m3527c;
            m4302a("u_" + interfaceC0303as.mo3489v());
        }
        this.f1464g = f;
        this.f1462a = interfaceC0303as;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return this.f1462a.mo3519f() + "\n\n" + C0775a.m2082a(AbstractC0244am.m4223c(this.f1462a), false, false, true);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return this.f1462a.mo3521e();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return mo4078B().m3852a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0429b mo4078B() {
        C0429b mo4091a = this.f1465h.mo4091a();
        if (mo4091a != null) {
            return mo4091a;
        }
        return this.f1462a.mo3490u();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r_ */
    public C0429b mo4054r_() {
        C0429b mo4084b = this.f1465h.mo4084b();
        if (mo4084b != null) {
            return mo4084b;
        }
        return this.f1462a.mo3569B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo3087i() {
        return this.f1462a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3292K() {
        return this.f1462a.mo3567D();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        return EnumC0225t.queueUnit;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n_ */
    public boolean mo4289n_() {
        return !this.f1462a.mo3568C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo4063g(AbstractC0244am abstractC0244am) {
        if (mo3087i().mo3488w()) {
            return true;
        }
        return super.mo4063g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return true;
    }
}