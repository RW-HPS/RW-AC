package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.translations.C0855a;

/* renamed from: com.corrodinggames.rts.game.units.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/n.class */
public class C0219n extends AbstractC0224s {
    public C0219n() {
        super("c_3");
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return C0855a.m1714a("gui.actions.repairTarget", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return C0855a.m1714a("gui.actions.repairTarget", new Object[0]);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3094b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: K */
    public EnumC0249ar mo3087i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        return EnumC0226u.repairTarget;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3088h_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        return EnumC0225t.action;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h */
    public boolean mo3089h() {
        return true;
    }
}