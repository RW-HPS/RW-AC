package com.corrodinggames.rts.java.audio.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/h.class */
public class h {

    /* renamed from: a  reason: collision with root package name */
    public boolean f716a;
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
            this.f716a = true;
        } else {
            c();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void c() {
        this.f716a = false;
        int[] iArr = this.b.b;
        int i = this.b.d + this.b.e;
        do {
            int i2 = this.c + 1;
            this.c = i2;
            if (i2 >= i) {
                return;
            }
        } while (iArr[this.c] == 0);
        this.f716a = true;
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
        this.b.f714a--;
    }
}