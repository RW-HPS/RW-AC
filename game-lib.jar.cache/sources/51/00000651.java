package com.corrodinggames.rts.java.audio.p051a;

import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.audio.a.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/r.class */
abstract class AbstractC1182r implements Iterable, Iterator {

    /* renamed from: b */
    public boolean f7291b;

    /* renamed from: c */
    final C1179o f7292c;

    /* renamed from: d */
    int f7293d;

    /* renamed from: e */
    int f7294e;

    /* renamed from: f */
    boolean f7295f = true;

    public AbstractC1182r(C1179o c1179o) {
        this.f7292c = c1179o;
        mo309c();
    }

    /* renamed from: c */
    public void mo309c() {
        this.f7294e = -1;
        this.f7293d = -1;
        m308d();
    }

    /* renamed from: d */
    void m308d() {
        this.f7291b = false;
        Object[] objArr = this.f7292c.f7276b;
        int i = this.f7292c.f7278d + this.f7292c.f7279e;
        do {
            int i2 = this.f7293d + 1;
            this.f7293d = i2;
            if (i2 >= i) {
                return;
            }
        } while (objArr[this.f7293d] == null);
        this.f7291b = true;
    }

    public void remove() {
        if (this.f7294e < 0) {
            throw new IllegalStateException("next must be called before remove.");
        }
        if (this.f7294e >= this.f7292c.f7278d) {
            this.f7292c.m326a(this.f7294e);
            this.f7293d = this.f7294e - 1;
            m308d();
        } else {
            this.f7292c.f7276b[this.f7294e] = null;
            this.f7292c.f7277c[this.f7294e] = null;
        }
        this.f7294e = -1;
        this.f7292c.f7275a--;
    }
}