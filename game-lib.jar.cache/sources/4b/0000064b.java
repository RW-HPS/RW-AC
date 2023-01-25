package com.corrodinggames.rts.java.audio.p051a;

/* renamed from: com.corrodinggames.rts.java.audio.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/l.class */
class C1176l {

    /* renamed from: a */
    public boolean f7268a;

    /* renamed from: b */
    final C1173i f7269b;

    /* renamed from: c */
    int f7270c;

    /* renamed from: d */
    int f7271d;

    /* renamed from: e */
    boolean f7272e = true;

    public C1176l(C1173i c1173i) {
        this.f7269b = c1173i;
        mo334b();
    }

    /* renamed from: b */
    public void mo334b() {
        this.f7271d = -2;
        this.f7270c = -1;
        if (this.f7269b.f7256g) {
            this.f7268a = true;
        } else {
            m333c();
        }
    }

    /* renamed from: c */
    void m333c() {
        this.f7268a = false;
        long[] jArr = this.f7269b.f7251b;
        int i = this.f7269b.f7253d + this.f7269b.f7254e;
        do {
            int i2 = this.f7270c + 1;
            this.f7270c = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.f7270c] == 0);
        this.f7268a = true;
    }

    public void remove() {
        if (this.f7271d == -1 && this.f7269b.f7256g) {
            this.f7269b.f7255f = null;
            this.f7269b.f7256g = false;
        } else if (this.f7271d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.f7271d >= this.f7269b.f7253d) {
                this.f7269b.m350a(this.f7271d);
                this.f7270c = this.f7271d - 1;
                m333c();
            } else {
                this.f7269b.f7251b[this.f7271d] = 0;
                this.f7269b.f7252c[this.f7271d] = null;
            }
        }
        this.f7271d = -2;
        this.f7269b.f7250a--;
    }
}