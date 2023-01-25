package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ae.class */
public class C0690ae extends AbstractC0699b {

    /* renamed from: l */
    C0689ad f4364l;

    /* renamed from: m */
    public float f4365m;

    /* renamed from: n */
    public float f4366n;

    /* renamed from: o */
    public int f4367o;

    /* renamed from: p */
    public int f4368p;

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: c */
    protected boolean mo2520c(InterfaceC0709k interfaceC0709k) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: g */
    protected int mo2519g() {
        return 3553;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2522b(int i) {
        this.f4364l.mo2522b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: h */
    public int mo2518h() {
        return this.f4364l.mo2518h();
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: a */
    public void mo2642a(RectF rectF) {
        float f = this.f4418g;
        float f2 = this.f4419h;
        rectF.f234a = (rectF.f234a * f) + this.f4365m;
        rectF.f236c = (rectF.f236c * f) + this.f4365m;
        rectF.f235b = (rectF.f235b * f2) + this.f4366n;
        rectF.f237d = (rectF.f237d * f2) + this.f4366n;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: a */
    public void mo2641a(RectF rectF, RectF rectF2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2521b(InterfaceC0709k interfaceC0709k) {
        GameEngine.m5460e("SubTexture prepare TODO");
    }
}