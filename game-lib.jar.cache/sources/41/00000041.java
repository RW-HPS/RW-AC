package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/RectF.class */
public class RectF implements Parcelable {

    /* renamed from: a  reason: collision with root package name */
    public float f48a;
    public float b;
    public float c;
    public float d;
    public static final Parcelable.Creator e = new Parcelable.Creator() { // from class: android.graphics.RectF.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF createFromParcel(Parcel parcel) {
            RectF rectF = new RectF();
            rectF.a(parcel);
            return rectF;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF[] newArray(int i) {
            return new RectF[i];
        }
    };

    public RectF() {
    }

    public RectF(float f, float f2, float f3, float f4) {
        this.f48a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public RectF(RectF rectF) {
        this.f48a = rectF.f48a;
        this.b = rectF.b;
        this.c = rectF.c;
        this.d = rectF.d;
    }

    public RectF(Rect rect) {
        this.f48a = rect.f47a;
        this.b = rect.b;
        this.c = rect.c;
        this.d = rect.d;
    }

    public String toString() {
        return "RectF(" + this.f48a + ", " + this.b + ", " + this.c + ", " + this.d + ")";
    }

    public final boolean a() {
        return this.f48a >= this.c || this.b >= this.d;
    }

    public final float b() {
        return this.c - this.f48a;
    }

    public final float c() {
        return this.d - this.b;
    }

    public final float d() {
        return (this.f48a + this.c) * 0.5f;
    }

    public final float e() {
        return (this.b + this.d) * 0.5f;
    }

    public void f() {
        this.d = 0.0f;
        this.b = 0.0f;
        this.c = 0.0f;
        this.f48a = 0.0f;
    }

    public void a(float f, float f2, float f3, float f4) {
        this.f48a = f;
        this.b = f2;
        this.c = f3;
        this.d = f4;
    }

    public void a(RectF rectF) {
        this.f48a = rectF.f48a;
        this.b = rectF.b;
        this.c = rectF.c;
        this.d = rectF.d;
    }

    public void a(Rect rect) {
        this.f48a = rect.f47a;
        this.b = rect.b;
        this.c = rect.c;
        this.d = rect.d;
    }

    public void a(float f, float f2) {
        this.f48a += f;
        this.b += f2;
        this.c += f;
        this.d += f2;
    }

    public boolean b(float f, float f2) {
        return this.f48a < this.c && this.b < this.d && f >= this.f48a && f < this.c && f2 >= this.b && f2 < this.d;
    }

    public boolean b(float f, float f2, float f3, float f4) {
        if (this.f48a < f3 && f < this.c && this.b < f4 && f2 < this.d) {
            if (this.f48a < f) {
                this.f48a = f;
            }
            if (this.b < f2) {
                this.b = f2;
            }
            if (this.c > f3) {
                this.c = f3;
            }
            if (this.d > f4) {
                this.d = f4;
                return true;
            }
            return true;
        }
        return false;
    }

    public boolean b(RectF rectF) {
        return b(rectF.f48a, rectF.b, rectF.c, rectF.d);
    }

    public static boolean a(RectF rectF, RectF rectF2) {
        return rectF.f48a < rectF2.c && rectF2.f48a < rectF.c && rectF.b < rectF2.d && rectF2.b < rectF.d;
    }

    public void c(float f, float f2) {
        if (f < this.f48a) {
            this.f48a = f;
        } else if (f > this.c) {
            this.c = f;
        }
        if (f2 < this.b) {
            this.b = f2;
        } else if (f2 > this.d) {
            this.d = f2;
        }
    }

    public void g() {
        if (this.f48a > this.c) {
            float f = this.f48a;
            this.f48a = this.c;
            this.c = f;
        }
        if (this.b > this.d) {
            float f2 = this.b;
            this.b = this.d;
            this.d = f2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f48a);
        parcel.writeFloat(this.b);
        parcel.writeFloat(this.c);
        parcel.writeFloat(this.d);
    }

    public void a(Parcel parcel) {
        this.f48a = parcel.readFloat();
        this.b = parcel.readFloat();
        this.c = parcel.readFloat();
        this.d = parcel.readFloat();
    }
}