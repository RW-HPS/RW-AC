package com.corrodinggames.rts.appFramework;

/* renamed from: com.corrodinggames.rts.appFramework.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/m.class */
public class C0121m {

    /* renamed from: a */
    private int f497a;

    /* renamed from: b */
    private float[] f498b = new float[10];

    /* renamed from: c */
    private float[] f499c = new float[10];

    /* renamed from: d */
    private float[] f500d = new float[10];

    /* renamed from: e */
    private int[] f501e = new int[10];

    /* renamed from: f */
    private float f502f;

    /* renamed from: g */
    private float f503g;

    /* renamed from: h */
    private float f504h;

    /* renamed from: i */
    private float f505i;

    /* renamed from: j */
    private float f506j;

    /* renamed from: k */
    private boolean f507k;

    /* renamed from: l */
    private boolean f508l;

    /* renamed from: m */
    private boolean f509m;

    /* renamed from: n */
    private int f510n;

    /* renamed from: o */
    private boolean f511o;

    /* renamed from: p */
    private boolean f512p;

    /* renamed from: q */
    private boolean f513q;

    /* renamed from: r */
    private int f514r;

    public C0121m() {
        for (int i = 0; i < this.f498b.length; i++) {
            this.f498b[i] = 40.0f;
        }
        for (int i2 = 0; i2 < this.f499c.length; i2++) {
            this.f499c[i2] = 40.0f;
        }
    }

    /* renamed from: a */
    public int m4910a() {
        return this.f510n;
    }

    /* renamed from: b */
    public boolean m4907b() {
        return this.f509m;
    }

    /* renamed from: c */
    public void m4906c() {
        this.f509m = this.f507k;
        this.f510n = this.f497a;
    }

    /* renamed from: a */
    public void m4909a(float f, float f2) {
        this.f498b[0] = f;
        this.f499c[0] = f2;
        this.f502f = this.f498b[0];
        this.f503g = this.f499c[0];
        this.f506j = 0.0f;
        this.f505i = 0.0f;
    }

    /* renamed from: a */
    public void m4908a(float f, float f2, boolean z, int i) {
        this.f514r = 0;
        this.f497a = z ? 1 : 0;
        if (i != -1) {
            C0120l.m4911a()[0] = i;
        }
        this.f498b[0] = f;
        this.f499c[0] = f2;
        this.f500d[0] = 0.0f;
        this.f501e[0] = 0;
        this.f507k = z;
        this.f508l = false;
        if (this.f507k) {
            this.f509m = this.f507k;
        }
        if (this.f497a > 0) {
            this.f510n = this.f497a;
        }
        this.f502f = this.f498b[0];
        this.f503g = this.f499c[0];
        this.f504h = this.f500d[0];
        this.f506j = 0.0f;
        this.f505i = 0.0f;
        this.f513q = false;
        this.f512p = false;
        this.f511o = false;
    }

    /* renamed from: d */
    public float[] m4905d() {
        return this.f498b;
    }

    /* renamed from: e */
    public int[] m4904e() {
        return C0120l.m4911a();
    }

    /* renamed from: f */
    public float[] m4903f() {
        return this.f499c;
    }
}