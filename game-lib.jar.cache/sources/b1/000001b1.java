package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0775a;

/* renamed from: com.corrodinggames.rts.game.units.a.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/v.class */
public class C0227v extends AbstractC0224s {

    /* renamed from: a */
    InterfaceC0303as f1493a;

    /* renamed from: b */
    int f1494b;

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass()) {
            return false;
        }
        C0227v c0227v = (C0227v) obj;
        if (this.f1494b != c0227v.f1494b || this.f1493a != c0227v.f1493a) {
            return false;
        }
        return super.equals(obj);
    }

    public C0227v(InterfaceC0303as interfaceC0303as) {
        this(interfaceC0303as, 1, null);
    }

    public C0227v(InterfaceC0303as interfaceC0303as, int i, Integer num) {
        super("b_" + interfaceC0303as.mo4192v());
        this.f1494b = 1;
        InterfaceC0303as m3550c = C0458l.m3550c(interfaceC0303as);
        if (m3550c != null) {
            interfaceC0303as = m3550c;
            m4407a("b_" + interfaceC0303as.mo4192v());
        }
        if (i != 1) {
            m4407a(m4414N() + "_" + i);
        }
        this.f1493a = interfaceC0303as;
        this.f1494b = i;
        if (num != null) {
            this.f1464g = num.intValue();
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: i */
    public InterfaceC0303as mo5567i() {
        return this.f1493a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: y */
    public InterfaceC0303as mo4073y() {
        return this.f1493a;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: t */
    public int mo4398t() {
        return this.f1494b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3122a() {
        String mo4205f = mo5567i().mo4205f();
        AbstractC0244am m4322c = AbstractC0244am.m4322c(mo5567i());
        if (this.f1494b != 1 && (m4322c instanceof AbstractC0629y)) {
            ((AbstractC0629y) m4322c).mo3045a(this.f1494b);
        }
        String str = mo4205f + "\n\n" + C0775a.m2098a(m4322c, false, false, true);
        if (this.f1494b != 1 && (m4322c instanceof AbstractC0629y)) {
            ((AbstractC0629y) m4322c).mo3045a(1);
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3119b() {
        InterfaceC0303as mo5567i = mo5567i();
        String mo4206e = mo5567i().mo4206e();
        if (!(mo5567i instanceof C0458l)) {
            if (mo4398t() == 2) {
                mo4206e = mo4206e + " T-2";
            }
            if (mo4398t() == 3) {
                mo4206e = mo4206e + " T-3";
            }
        }
        return mo4206e;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3116c() {
        return mo4102B().m3876a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: B */
    public C0429b mo4102B() {
        C0429b mo4115a = this.f1465h.mo4115a();
        if (mo4115a != null) {
            return mo4115a;
        }
        return mo5567i().mo4207d(mo4398t());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r_ */
    public C0429b mo4078r_() {
        C0429b mo4108b = this.f1465h.mo4108b();
        if (mo4108b != null) {
            return mo4108b;
        }
        return mo5567i().mo4216B();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3117b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3115e() {
        return EnumC0226u.placeBuilding;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3114f() {
        return EnumC0225t.building;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: n_ */
    public boolean mo4401n_() {
        return !mo5567i().mo4215C();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo4087g(AbstractC0244am abstractC0244am) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (((mo5567i() == EnumC0249ar.AntiNukeLaucher || mo5567i() == EnumC0249ar.NukeLaucher) && gameEngine.m1102O() && gameEngine.netEngine.gameMapData.nukes) || mo5567i().mo4191w()) {
            return true;
        }
        return super.mo4087g(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3113g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4075u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: D */
    public boolean mo4416D() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4390p(AbstractC0244am abstractC0244am) {
        AbstractC0244am m3060X;
        if ((abstractC0244am instanceof AbstractC0629y) && (m3060X = ((AbstractC0629y) abstractC0244am).m3060X()) != null && m3060X.f1629cm < 1.0f && m3060X.mo5568r() == mo5567i()) {
            return m3060X.f1629cm;
        }
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: r */
    public boolean mo4079r(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4111a(abstractC0244am, true);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public boolean mo3118b(AbstractC0244am abstractC0244am) {
        return this.f1465h.mo4111a(abstractC0244am, false);
    }
}