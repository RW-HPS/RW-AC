package com.corrodinggames.rts.java.audio.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/l.class */
class l {
    public boolean a;
    final i b;
    int c;
    int d;
    boolean e = true;

    public l(i iVar) {
        this.b = iVar;
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
        long[] jArr = this.b.b;
        int i = this.b.d + this.b.e;
        do {
            int i2 = this.c + 1;
            this.c = i2;
            if (i2 >= i) {
                return;
            }
        } while (jArr[this.c] == 0);
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
                this.b.a(this.d);
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