package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bt.class */
public class bt {
    boolean a;
    int b;
    double c;
    double d;
    long e;
    String f;

    public bt(String str) {
        this.a = true;
        this.f = str;
    }

    public bt(String str, boolean z) {
        this.a = true;
        this.f = str;
        this.a = z;
    }

    public void a() {
        if (this.a) {
            if (this.e != 0) {
                this.e = Long.MIN_VALUE;
            } else {
                this.e = Unit.loadAllUnitsTook();
            }
        }
    }

    public void b() {
        if (this.a) {
            double a = Unit.a(this.e, Unit.loadAllUnitsTook());
            this.c += a;
            this.b++;
            if (a > this.d) {
                this.d = a;
            }
            this.e = 0L;
        }
    }

    public String c() {
        String str;
        if (this.a) {
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
        if (this.a) {
            b();
            e();
        }
    }

    public void e() {
        if (this.a && this.b > 0) {
            GameEngine.m5e(GameEngine.a(this.f + " - " + c(), "\u001b[36m"));
            f();
        }
    }

    public void f() {
        this.b = 0;
        this.c = 0.0d;
        this.d = 0.0d;
    }
}