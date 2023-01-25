package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.m.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/i.class */
public class C0974i extends C0964ae {

    /* renamed from: a */
    int f6661a;

    /* renamed from: b */
    boolean f6662b;

    public C0974i(String str, boolean z) {
        super(str);
        this.f6661a = -99;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0964ae
    /* renamed from: a */
    public boolean mo886a() {
        return this.f6662b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0964ae
    /* renamed from: b */
    public boolean mo884b() {
        boolean z = false;
        if (-16711936 != this.f6661a) {
            m930a("teamColor", -16711936);
            z = true;
            this.f6661a = -16711936;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0964ae
    /* renamed from: a */
    public boolean mo885a(Paint paint, C0970e c0970e) {
        boolean z = false;
        if (c0970e instanceof C0973h) {
            C0973h c0973h = (C0973h) c0970e;
            if (c0973h.f6657D != this.f6661a) {
                m930a("teamColor", c0973h.f6657D);
                z = true;
                this.f6661a = c0973h.f6657D;
            }
        }
        super.mo885a(paint, c0970e);
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.C0964ae
    /* renamed from: c */
    public void mo883c() {
        super.mo883c();
    }
}