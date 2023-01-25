package com.corrodinggames.rts.game.units.p024d;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.game.units.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/b.class */
class C0489b extends AbstractC0228w {
    public C0489b() {
        super(C0475a.f3400h.m4338a());
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "-Allows factory to build Tech 2 units";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return C0855a.m1714a("gui.actions.upgradeT2", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return EnumC0249ar.airFactory.mo4166c(2);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0228w
    /* renamed from: K */
    public float mo3292K() {
        return 4.0E-4f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public boolean mo3097a(AbstractC0244am abstractC0244am, boolean z) {
        C0475a c0475a = (C0475a) abstractC0244am;
        if (c0475a.f3398f != 1 || c0475a.mo3338a(m4309N(), z) > 0) {
            return false;
        }
        return super.mo3097a(abstractC0244am, z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: L */
    public EnumC0249ar mo3087i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        return EnumC0225t.upgrade;
    }
}