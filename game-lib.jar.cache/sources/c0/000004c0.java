package com.corrodinggames.rts.gameFramework.f;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ad.class */
public class ad {

    /* renamed from: a  reason: collision with root package name */
    private int f494a;
    private int[] b;
    private int c;

    public ad(int i) {
        this.c = -1;
        this.f494a = 0;
        this.b = new int[i];
    }

    public ad(int i, ad adVar) {
        this.c = -1;
        this.f494a = i;
        this.b = new int[adVar.b.length];
        for (int i2 = 0; i2 < this.b.length; i2++) {
            this.b[i2] = adVar.b[i2];
        }
    }

    public void a(int i, int i2) {
        this.b[i] = i2;
    }

    public float a(int i) {
        if (this.c < 0) {
            this.c = 0;
            for (int i2 = 0; i2 < this.b.length; i2++) {
                if (this.b[i2] > 0) {
                    this.c += this.b[i2];
                }
            }
        }
        if (this.c == 0 || this.b[i] <= 0) {
            return 0.0f;
        }
        return this.b[i] / this.c;
    }
}