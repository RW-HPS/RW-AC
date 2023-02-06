package com.corrodinggames.rts.gameFramework.b;

import android.graphics.RectF;
import android.util.Log;
import java.util.WeakHashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/b.class */
public abstract class b implements ab {
    protected int a;
    protected int b;
    protected int c;
    protected int d;
    protected int e;
    protected int f;
    protected float g;
    protected float h;
    private boolean l;
    private boolean m;
    public int i;
    public boolean j;
    protected k k;
    private static WeakHashMap n = new WeakHashMap();
    private static ThreadLocal o = new ThreadLocal();

    public abstract void b(k kVar);

    protected abstract boolean c(k kVar);

    protected abstract int g();

    public abstract void b(int i);

    public abstract int h();

    protected b(k kVar, int i, int i2) {
        this.a = -1;
        this.c = -1;
        this.d = -1;
        this.k = null;
        a(kVar);
        this.a = i;
        this.b = i2;
        synchronized (n) {
            n.put(this, null);
        }
    }

    protected b() {
        this(null, 0, 0);
    }

    protected void a(k kVar) {
        this.k = kVar;
    }

    public void a(int i, int i2) {
        this.c = i;
        this.d = i2;
        this.e = i > 0 ? a(i) : 0;
        this.f = i2 > 0 ? a(i2) : 0;
        if (this.e == 0) {
            this.g = 0.0f;
        } else {
            this.g = 1.0f / this.e;
        }
        if (this.f == 0) {
            this.h = 0.0f;
        } else {
            this.h = 1.0f / this.f;
        }
        if (this.e > 4096 || this.f > 4096) {
            Log.a("BasicTexture", String.format("secondBitmap is too large: %d x %d", Integer.valueOf(this.e), Integer.valueOf(this.f)), new Exception());
        }
    }

    public static int a(int i) {
        if (i <= 0 || i > 1073741824) {
            throw new IllegalArgumentException("n is invalid: " + i);
        }
        int i2 = i - 1;
        int i3 = i2 | (i2 >> 16);
        int i4 = i3 | (i3 >> 8);
        int i5 = i4 | (i4 >> 4);
        int i6 = i5 | (i5 >> 2);
        return (i6 | (i6 >> 1)) + 1;
    }

    public int a() {
        return this.a;
    }

    public int b() {
        return this.c;
    }

    public int c() {
        return this.d;
    }

    public int d() {
        return this.e;
    }

    public int e() {
        return this.f;
    }

    public boolean f() {
        return this.l;
    }

    protected void a(boolean z) {
        this.l = z;
    }

    public boolean i() {
        return this.b == 1;
    }

    public void j() {
        this.m = true;
        k();
    }

    private void k() {
        k kVar = this.k;
        if (kVar != null && this.a != -1) {
            kVar.a(this);
            this.a = -1;
        }
        this.b = 0;
        a((k) null);
    }

    protected void finalize() {
        o.set(b.class);
        j();
        o.set(null);
    }

    public void a(RectF rectF) {
        int b = b();
        int c = c();
        int d = d();
        int e = e();
        rectF.a /= d;
        rectF.c /= d;
        rectF.b /= e;
        rectF.d /= e;
        float f = b / d;
        if (rectF.c > f) {
            rectF.c = f;
        }
        float f2 = c / e;
        if (rectF.d > f2) {
            rectF.d = f2;
        }
    }

    public void a(RectF rectF, RectF rectF2) {
        float c = c() / e();
        float b = b() / d();
        if (rectF.c > b) {
            rectF2.c = rectF2.a + ((rectF2.b() * (b - rectF.a)) / rectF.b());
        }
        if (rectF.d > c) {
            rectF2.d = rectF2.b + ((rectF2.c() * (c - rectF.b)) / rectF.c());
        }
    }
}