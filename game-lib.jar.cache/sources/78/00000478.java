package com.corrodinggames.rts.gameFramework.p031b;

import android.util.Log;

/* renamed from: com.corrodinggames.rts.gameFramework.b.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/x.class */
public class C0722x extends AbstractC0699b {

    /* renamed from: m */
    private final boolean f4508m;

    /* renamed from: n */
    private int f4509n;

    /* renamed from: l */
    protected boolean f4510l;

    public C0722x(int i, int i2, boolean z) {
        this(i, i2, z, 3553);
    }

    public C0722x(int i, int i2, boolean z, int i3) {
        this.f4509n = 3553;
        this.f4508m = z;
        m2643a(i, i2);
        this.f4509n = i3;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2521b(InterfaceC0709k interfaceC0709k) {
        this.f4412a = interfaceC0709k.mo2604a().mo2530a();
        if (this.f4509n == 3553) {
            interfaceC0709k.mo2585a(this, 6408, 5121, 6408);
        }
        interfaceC0709k.mo2553d(this);
        this.f4413b = 1;
        m2640a(interfaceC0709k);
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: c */
    protected boolean mo2520c(InterfaceC0709k interfaceC0709k) {
        if (m2633i()) {
            return true;
        }
        Log.m5071c("RawTexture", "lost the content due to context change");
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: g */
    public int mo2519g() {
        return this.f4509n;
    }

    /* renamed from: k */
    public boolean m2517k() {
        return this.f4510l;
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: b */
    public void mo2522b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p031b.AbstractC0699b
    /* renamed from: h */
    public int mo2518h() {
        return 9729;
    }
}