package com.corrodinggames.rts.gameFramework.utility;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ad.class */
public class ad {

    /* renamed from: a  reason: collision with root package name */
    private final Object[] f670a;
    private int b;
    private final boolean c = false;

    public ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f670a = new Object[i];
    }

    public Object a() {
        if (this.b > 0) {
            int i = this.b - 1;
            Object obj = this.f670a[i];
            this.f670a[i] = null;
            this.b--;
            return obj;
        }
        return null;
    }

    public boolean a(Object obj) {
        if (this.b < this.f670a.length) {
            this.f670a[this.b] = obj;
            this.b++;
            return true;
        }
        return false;
    }
}