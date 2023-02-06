package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/Point.class */
public class Point implements Parcelable {
    public int a;
    public int b;
    public static final Parcelable.Creator c = new Parcelable.Creator() { // from class: android.graphics.Point.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Point createFromParcel(Parcel parcel) {
            Point point = new Point();
            point.a(parcel);
            return point;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Point[] newArray(int i) {
            return new Point[i];
        }
    };

    public Point() {
    }

    public Point(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public void a(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return this.a == point.a && this.b == point.b;
    }

    public int hashCode() {
        return (31 * this.a) + this.b;
    }

    public String toString() {
        return "Point(" + this.a + ", " + this.b + ")";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.a);
        parcel.writeInt(this.b);
    }

    public void a(Parcel parcel) {
        this.a = parcel.readInt();
        this.b = parcel.readInt();
    }
}