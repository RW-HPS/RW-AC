package com.corrodinggames.rts.gameFramework.p037f;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ad.class */
public class C0794ad {

    /* renamed from: a */
    private int f5162a;

    /* renamed from: b */
    private int[] f5163b;

    /* renamed from: c */
    private int f5164c;

    /* renamed from: a */
    static /* synthetic */ int m1985a(C0794ad c0794ad) {
        return c0794ad.f5162a;
    }

    public C0794ad(int i) {
        this.f5164c = -1;
        this.f5162a = 0;
        this.f5163b = new int[i];
    }

    public C0794ad(int i, C0794ad c0794ad) {
        this.f5164c = -1;
        this.f5162a = i;
        this.f5163b = new int[c0794ad.f5163b.length];
        for (int i2 = 0; i2 < this.f5163b.length; i2++) {
            this.f5163b[i2] = c0794ad.f5163b[i2];
        }
    }

    /* renamed from: a */
    public void m1986a(int i, int i2) {
        this.f5163b[i] = i2;
    }

    /* renamed from: a */
    public float m1987a(int i) {
        if (this.f5164c < 0) {
            this.f5164c = 0;
            for (int i2 = 0; i2 < this.f5163b.length; i2++) {
                if (this.f5163b[i2] > 0) {
                    this.f5164c += this.f5163b[i2];
                }
            }
        }
        if (this.f5164c == 0 || this.f5163b[i] <= 0) {
            return 0.0f;
        }
        return this.f5163b[i] / this.f5164c;
    }
}