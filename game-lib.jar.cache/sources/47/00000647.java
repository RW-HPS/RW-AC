package com.corrodinggames.rts.java.audio.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
class h {
    public boolean a;
    final e b;
    int c;
    int d;
    boolean e = true;

    public h(e eVar) {
        this.b = eVar;
        b();
    }

    public void b() {
        this.d = -2;
        this.c = -1;
        if (this.b.g) {
            this.a = true;
        } else {
            c();
        }
    }

    void c() {
        this.a = false;
        int[] iArr = this.b.b;
        int i = this.b.d + this.b.e;
        do {
            int i2 = this.c + 1;
            this.c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.c] == 0);
        this.a = true;
    }

    public void remove() {
        if (this.d == -1 && this.b.g) {
            this.b.f = null;
            this.b.g = false;
        } else if (this.d < 0) {
            throw new IllegalStateException("next must be called before remove.");
        } else {
            if (this.d >= this.b.d) {
                this.b.d(this.d);
                this.c = this.d - 1;
                c();
            } else {
                this.b.b[this.d] = 0;
                this.b.c[this.d] = null;
            }
        }
        this.d = -2;
        this.b.a--;
    }
}