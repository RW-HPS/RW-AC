package com.corrodinggames.rts.java.audio.p051a;

/* renamed from: com.corrodinggames.rts.java.audio.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
class C1172h {

    /* renamed from: a */
    public boolean f7245a;

    /* renamed from: b */
    final C1169e f7246b;

    /* renamed from: c */
    int f7247c;

    /* renamed from: d */
    int f7248d;

    /* renamed from: e */
    boolean f7249e = true;

    public C1172h(C1169e c1169e) {
        this.f7246b = c1169e;
        mo353b();
    }

    /* renamed from: b */
    public void mo353b() {
        this.f7248d = -2;
        this.f7247c = -1;
        if (this.f7246b.f7233g) {
            this.f7245a = true;
        } else {
            m352c();
        }
    }

    /* renamed from: c */
    void m352c() {
        this.f7245a = false;
        int[] iArr = this.f7246b.f7228b;
        int i = this.f7246b.f7230d + this.f7246b.f7231e;
        do {
            int i2 = this.f7247c + 1;
            this.f7247c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.f7247c] == 0);
        this.f7245a = true;
    }

    public void remove() {
        if (this.f7248d == -1 && this.f7246b.f7233g) {
            this.f7246b.f7232f = null;
            this.f7246b.f7233g = false;
        } else if (this.f7248d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7248d >= this.f7246b.f7230d) {
                this.f7246b.m361d(this.f7248d);
                this.f7247c = this.f7248d - 1;
                m352c();
            } else {
                this.f7246b.f7228b[this.f7248d] = 0;
                this.f7246b.f7229c[this.f7248d] = null;
            }
        }
        this.f7248d = -2;
        this.f7246b.f7227a--;
    }
}