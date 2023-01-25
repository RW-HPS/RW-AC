package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.gameFramework.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ay.class */
public abstract class AbstractC0673ay extends AbstractC0674az {

    /* renamed from: es */
    public int f4260es;

    /* renamed from: et */
    public int f4261et;

    /* renamed from: eu */
    public float f4262eu;

    /* renamed from: ev */
    public float f4263ev;

    /* renamed from: ew */
    public boolean f4264ew;

    /* renamed from: b */
    public void m2724b(C0970e c0970e) {
        m2729T(c0970e.f6620p);
        m2728U(c0970e.f6621q);
        this.f4264ew = true;
    }

    /* renamed from: a */
    public void m2725a(C0970e c0970e, int i) {
        m2729T(c0970e.f6620p / i);
        m2728U(c0970e.f6621q);
        this.f4264ew = false;
    }

    /* renamed from: T */
    public void m2729T(int i) {
        this.f4260es = i;
        this.f4262eu = i / 2;
    }

    /* renamed from: U */
    public void m2728U(int i) {
        this.f4261et = i;
        this.f4263ev = i / 2;
    }

    /* renamed from: V */
    public void m2727V(int i) {
        this.f4260es = i;
        this.f4262eu = i / 2.0f;
    }

    /* renamed from: W */
    public void m2726W(int i) {
        this.f4261et = i;
        this.f4263ev = i / 2.0f;
    }

    protected AbstractC0673ay(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo447a() {
        super.mo447a();
    }
}