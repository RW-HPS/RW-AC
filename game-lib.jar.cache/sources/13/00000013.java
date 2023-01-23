package a.a;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/i.class */
public class i {

    /* renamed from: a  reason: collision with root package name */
    private int f16a;
    private int b;
    private int c;
    private int d;
    private int e;

    public synchronized int a() {
        int b;
        b = h.b(this.f16a);
        this.f16a = b;
        return b;
    }

    public synchronized int a(int i) {
        this.f16a = i;
        return this.f16a;
    }

    public synchronized int b(int i) {
        this.b = i;
        return this.b;
    }

    public synchronized int b() {
        return this.b;
    }

    public synchronized void c() {
        this.c++;
    }

    public synchronized int d() {
        return this.c;
    }

    public synchronized int e() {
        int i = this.c;
        this.c = 0;
        return i;
    }

    public synchronized void f() {
        this.d++;
    }

    public synchronized int g() {
        return this.d;
    }

    public synchronized int h() {
        int i = this.d;
        this.d = 0;
        return i;
    }

    public synchronized void i() {
        this.e++;
    }

    public synchronized int j() {
        return this.e;
    }

    public synchronized int k() {
        int i = this.e;
        this.e = 0;
        return i;
    }

    public synchronized void l() {
        this.d = 0;
        this.e = 0;
        this.c = 0;
    }
}