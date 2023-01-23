package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bt.class */
public class bt {

    /* renamed from: a  reason: collision with root package name */
    boolean f460a;
    int b;
    double c;
    double d;
    long e;
    String f;

    public bt(String str) {
        this.f460a = true;
        this.f = str;
    }

    public bt(String str, boolean z) {
        this.f460a = true;
        this.f = str;
        this.f460a = z;
    }

    public void a() {
        if (this.f460a) {
            if (this.e != 0) {
                this.e = Long.MIN_VALUE;
            } else {
                this.e = br.a();
            }
        }
    }

    public void b() {
        if (this.f460a) {
            double a2 = br.a(this.e, br.a());
            this.c += a2;
            this.b++;
            if (a2 > this.d) {
                this.d = a2;
            }
            this.e = 0L;
        }
    }

    public String c() {
        String str;
        if (this.f460a) {
            if (this.b > 0) {
                str = ((("{ #" + this.b + " = ") + "peak:" + f.a(this.d, 2) + "ms ") + "avg:" + f.a(this.c / this.b, 2) + "ms ") + "total:" + f.a(this.c, 2) + "ms ";
            } else {
                str = "{ #0 = NA";
            }
            return str + "}";
        }
        return "{ Not enabled }";
    }

    public void d() {
        if (this.f460a) {
            b();
            e();
        }
    }

    public void e() {
        if (this.f460a && this.b > 0) {
            GameEngine.m328e(GameEngine.a(this.f + " - " + c(), "\u001b[36m"));
            f();
        }
    }

    public void f() {
        this.b = 0;
        this.c = 0.0d;
        this.d = 0.0d;
    }
}