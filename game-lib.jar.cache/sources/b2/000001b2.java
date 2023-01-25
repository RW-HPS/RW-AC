package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.p024d.C0504j;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0506l;

/* renamed from: com.corrodinggames.rts.game.units.a.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/w.class */
public abstract class AbstractC0228w extends AbstractC0224s {
    public AbstractC0228w(int i) {
        super(i);
    }

    public AbstractC0228w(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
        if (!(abstractC0244am instanceof InterfaceC0506l)) {
            return 99;
        }
        return ((InterfaceC0506l) abstractC0244am).mo3337a(m4309N(), z);
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: p */
    public float mo4287p(AbstractC0244am abstractC0244am) {
        C0504j mo3333dw;
        if (!(abstractC0244am instanceof InterfaceC0506l) || (mo3333dw = ((InterfaceC0506l) abstractC0244am).mo3333dw()) == null || !m4298d(mo3333dw.f3527j)) {
            return -1.0f;
        }
        float f = mo3333dw.f3528m;
        if (f < 0.0f) {
            return 0.0f;
        }
        if (f > 1.0f) {
            return 1.0f;
        }
        return f;
    }

    /* renamed from: K */
    public float mo3291K() {
        return 0.01f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: u */
    public boolean mo4051u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3091e() {
        return EnumC0226u.popupQueue;
    }
}