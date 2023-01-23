package com.corrodinggames.rts.appFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/m.class */
public class m {

    /* renamed from: a  reason: collision with root package name */
    private int f110a;
    private float[] b = new float[10];
    private float[] c = new float[10];
    private float[] d = new float[10];
    private int[] e = new int[10];
    private float f;
    private float g;
    private float h;
    private float i;
    private float j;
    private boolean k;
    private boolean l;
    private boolean m;
    private int n;
    private boolean o;
    private boolean p;
    private boolean q;
    private int r;

    public m() {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = 40.0f;
        }
        for (int i2 = 0; i2 < this.c.length; i2++) {
            this.c[i2] = 40.0f;
        }
    }

    public int a() {
        return this.n;
    }

    public boolean b() {
        return this.m;
    }

    public void c() {
        this.m = this.k;
        this.n = this.f110a;
    }

    public void a(float f, float f2) {
        this.b[0] = f;
        this.c[0] = f2;
        this.f = this.b[0];
        this.g = this.c[0];
        this.j = 0.0f;
        this.i = 0.0f;
    }

    public void a(float f, float f2, boolean z, int i) {
        int[] iArr;
        this.r = 0;
        this.f110a = z ? 1 : 0;
        if (i != -1) {
            iArr = l.r;
            iArr[0] = i;
        }
        this.b[0] = f;
        this.c[0] = f2;
        this.d[0] = 0.0f;
        this.e[0] = 0;
        this.k = z;
        this.l = false;
        if (this.k) {
            this.m = this.k;
        }
        if (this.f110a > 0) {
            this.n = this.f110a;
        }
        this.f = this.b[0];
        this.g = this.c[0];
        this.h = this.d[0];
        this.j = 0.0f;
        this.i = 0.0f;
        this.q = false;
        this.p = false;
        this.o = false;
    }

    public float[] d() {
        return this.b;
    }

    public int[] e() {
        int[] iArr;
        iArr = l.r;
        return iArr;
    }

    public float[] f() {
        return this.c;
    }
}