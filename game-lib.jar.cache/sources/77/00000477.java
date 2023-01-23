package com.corrodinggames.rts.gameFramework.b;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/w.class */
public class w {

    /* renamed from: a  reason: collision with root package name */
    private int[] f442a;
    private int b;

    public void a(int i) {
        if (this.f442a.length == this.b) {
            int[] iArr = new int[this.b + this.b];
            System.arraycopy(this.f442a, 0, iArr, 0, this.b);
            this.f442a = iArr;
        }
        int[] iArr2 = this.f442a;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr2[i2] = i;
    }
}