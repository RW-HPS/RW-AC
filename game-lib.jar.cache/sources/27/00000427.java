package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.C0773f;

/* renamed from: com.corrodinggames.rts.gameFramework.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/i.class */
public abstract class AbstractC0641i {

    /* renamed from: e */
    public String f4100e;

    /* renamed from: g */
    public boolean f4101g;

    /* renamed from: d */
    public float f4102d = 1.0f;

    /* renamed from: f */
    public boolean f4103f = false;

    /* renamed from: a */
    public abstract void mo75a(float f, float f2, int i, int i2, float f3);

    /* renamed from: a */
    public abstract int mo76a();

    public AbstractC0641i(String str, AbstractC0640h abstractC0640h) {
        this.f4100e = C0773f.m2118g(str);
        if (abstractC0640h != null) {
            abstractC0640h.f4099h.put(this.f4100e, this);
        }
    }
}