package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Rect.class */
public final class Rect {

    /* renamed from: a  reason: collision with root package name */
    public int f47a;
    public int b;
    public int c;
    public int d;

    public Rect() {
    }

    public Rect(int i, int i2, int i3, int i4) {
        this.f47a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public Rect(Rect rect) {
        this.f47a = rect.f47a;
        this.b = rect.b;
        this.c = rect.c;
        this.d = rect.d;
    }

    public boolean equals(Object obj) {
        Rect rect = (Rect) obj;
        return rect != null && this.f47a == rect.f47a && this.b == rect.b && this.c == rect.c && this.d == rect.d;
    }

    public String toString() {
        return "Rect(" + this.f47a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public final boolean a() {
        return this.f47a >= this.c || this.b >= this.d;
    }

    public final int b() {
        return this.c - this.f47a;
    }

    public final int c() {
        return this.d - this.b;
    }

    public final int d() {
        return (this.f47a + this.c) >> 1;
    }

    public final int e() {
        return (this.b + this.d) >> 1;
    }

    public final float f() {
        return (this.f47a + this.c) * 0.5f;
    }

    public final float g() {
        return (this.b + this.d) * 0.5f;
    }

    public void h() {
        this.d = 0;
        this.b = 0;
        this.c = 0;
        this.f47a = 0;
    }

    public void a(int i, int i2, int i3, int i4) {
        this.f47a = i;
        this.b = i2;
        this.c = i3;
        this.d = i4;
    }

    public void a(Rect rect) {
        this.f47a = rect.f47a;
        this.b = rect.b;
        this.c = rect.c;
        this.d = rect.d;
    }

    public void a(int i, int i2) {
        this.f47a += i;
        this.b += i2;
        this.c += i;
        this.d += i2;
    }

    public boolean b(int i, int i2) {
        return this.f47a < this.c && this.b < this.d && i >= this.f47a && i < this.c && i2 >= this.b && i2 < this.d;
    }

    public boolean b(Rect rect) {
        return this.f47a < this.c && this.b < this.d && this.f47a <= rect.f47a && this.b <= rect.b && this.c >= rect.c && this.d >= rect.d;
    }

    public boolean b(int i, int i2, int i3, int i4) {
        return this.f47a < i3 && i < this.c && this.b < i4 && i2 < this.d;
    }
}