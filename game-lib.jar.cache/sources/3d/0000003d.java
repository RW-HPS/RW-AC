package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/PointF.class */
public class PointF implements Parcelable {

    /* renamed from: a */
    public float x;

    /* renamed from: b */
    public float y;

    public PointF() {
    }

    public PointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* renamed from: a */
    public final void setSite(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* renamed from: a */
    public final void setSite(PointF pointF) {
        this.x = pointF.x;
        this.y = pointF.y;
    }

    /* renamed from: b */
    public final void moveAdd(float f, float f2) {
        this.x += f;
        this.y += f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
    }
}