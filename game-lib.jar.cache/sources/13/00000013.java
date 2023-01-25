package net.rudp;

/* renamed from: a.a.i */
/* loaded from: game-lib.jar:a/a/i.class */
class C0019i {

    /* renamed from: a */
    private int f83a;

    /* renamed from: b */
    private int f84b;

    /* renamed from: c */
    private int f85c;

    /* renamed from: d */
    private int f86d;

    /* renamed from: e */
    private int f87e;

    /* renamed from: a */
    public synchronized int m5359a() {
        int m5395b;
        m5395b = ReliableSocket.m5395b(this.f83a);
        this.f83a = m5395b;
        return m5395b;
    }

    /* renamed from: a */
    public synchronized int m5358a(int i) {
        this.f83a = i;
        return this.f83a;
    }

    /* renamed from: b */
    public synchronized int m5356b(int i) {
        this.f84b = i;
        return this.f84b;
    }

    /* renamed from: b */
    public synchronized int m5357b() {
        return this.f84b;
    }

    /* renamed from: c */
    public synchronized void m5355c() {
        this.f85c++;
    }

    /* renamed from: d */
    public synchronized int m5354d() {
        return this.f85c;
    }

    /* renamed from: e */
    public synchronized int m5353e() {
        int i = this.f85c;
        this.f85c = 0;
        return i;
    }

    /* renamed from: f */
    public synchronized void m5352f() {
        this.f86d++;
    }

    /* renamed from: g */
    public synchronized int m5351g() {
        return this.f86d;
    }

    /* renamed from: h */
    public synchronized int m5350h() {
        int i = this.f86d;
        this.f86d = 0;
        return i;
    }

    /* renamed from: i */
    public synchronized void m5349i() {
        this.f87e++;
    }

    /* renamed from: j */
    public synchronized int m5348j() {
        return this.f87e;
    }

    /* renamed from: k */
    public synchronized int m5347k() {
        int i = this.f87e;
        this.f87e = 0;
        return i;
    }

    /* renamed from: l */
    public synchronized void m5346l() {
        this.f86d = 0;
        this.f87e = 0;
        this.f85c = 0;
    }
}