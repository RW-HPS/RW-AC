package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ad.class */
public class C1109ad {

    /* renamed from: a */
    private final Object[] f7050a;

    /* renamed from: b */
    private int f7051b;

    /* renamed from: c */
    private final boolean f7052c = false;

    public C1109ad(int i) {
        if (i <= 0) {
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        this.f7050a = new Object[i];
    }

    /* renamed from: a */
    public Object m633a() {
        if (this.f7051b > 0) {
            int i = this.f7051b - 1;
            Object obj = this.f7050a[i];
            this.f7050a[i] = null;
            this.f7051b--;
            return obj;
        }
        return null;
    }

    /* renamed from: a */
    public boolean m632a(Object obj) {
        if (this.f7051b < this.f7050a.length) {
            this.f7050a[this.f7051b] = obj;
            this.f7051b++;
            return true;
        }
        return false;
    }
}