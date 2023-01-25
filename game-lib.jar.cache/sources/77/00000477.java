package com.corrodinggames.rts.gameFramework.p031b;

/* renamed from: com.corrodinggames.rts.gameFramework.b.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/w.class */
public class C0721w {

    /* renamed from: a */
    private int[] f4506a;

    /* renamed from: b */
    private int f4507b;

    /* renamed from: a */
    public void m2523a(int i) {
        if (this.f4506a.length == this.f4507b) {
            int[] iArr = new int[this.f4507b + this.f4507b];
            System.arraycopy(this.f4506a, 0, iArr, 0, this.f4507b);
            this.f4506a = iArr;
        }
        int[] iArr2 = this.f4506a;
        int i2 = this.f4507b;
        this.f4507b = i2 + 1;
        iArr2[i2] = i;
    }
}