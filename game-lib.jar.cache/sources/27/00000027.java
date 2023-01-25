package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import java.io.OutputStream;

/* loaded from: game-lib.jar:android/graphics/Bitmap.class */
public final class Bitmap implements Parcelable {

    /* renamed from: a */
    public final int f126a;

    /* renamed from: d */
    private final boolean f127d;

    /* renamed from: e */
    private boolean f128e;

    /* renamed from: f */
    private int f129f;

    /* renamed from: g */
    private int f130g;

    /* renamed from: h */
    private boolean f131h;

    /* renamed from: b */
    int f132b;

    /* renamed from: i */
    private static volatile int f133i = -1;

    /* renamed from: c */
    public static final Parcelable.Creator f134c = new Parcelable.Creator() { // from class: android.graphics.Bitmap.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Bitmap mo5268a(Parcel parcel) {
            Bitmap nativeCreateFromParcel = Bitmap.nativeCreateFromParcel(parcel);
            if (nativeCreateFromParcel == null) {
                throw new RuntimeException("Failed to unparcel Bitmap");
            }
            return nativeCreateFromParcel;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Bitmap[] mo5269a(int i) {
            return new Bitmap[i];
        }
    };

    private static native Bitmap nativeCreate(int[] iArr, int i, int i2, int i3, int i4, int i5, boolean z);

    private static native Bitmap nativeCopy(int i, int i2, boolean z);

    private static native boolean nativeCompress(int i, int i2, int i3, OutputStream outputStream, byte[] bArr);

    private static native void nativeErase(int i, int i2);

    private static native int nativeConfig(int i);

    private static native int nativeGetPixel(int i, int i2, int i3, boolean z);

    private static native void nativeGetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    private static native void nativeSetPixel(int i, int i2, int i3, int i4, boolean z);

    private static native void nativeSetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Bitmap nativeCreateFromParcel(Parcel parcel);

    private static native boolean nativeWriteToParcel(int i, boolean z, int i2, Parcel parcel);

    private static native void nativeSetHasAlpha(int i, boolean z);

    /* renamed from: a */
    private void m5278a(String str) {
        if (this.f131h) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    private static void m5274b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("x must be >= 0");
        }
        if (i2 < 0) {
            throw new IllegalArgumentException("y must be >= 0");
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$Config.class */
    public enum Config {
        f142a(2),
        f143b(4),
        f144c(5),
        f145d(6);
        

        /* renamed from: e */
        final int f140e;

        /* renamed from: f */
        private static Config[] f146f = {null, null, f142a, null, f143b, f144c, f145d};

        Config(int i) {
            this.f140e = i;
        }

        /* renamed from: a */
        static Config m5267a(int i) {
            return f146f[i];
        }
    }

    /* renamed from: a */
    public Bitmap m5281a(Config config, boolean z) {
        m5278a("Can't copy a recycled bitmap");
        Bitmap nativeCopy = nativeCopy(this.f126a, config.f140e, z);
        if (nativeCopy != null) {
            nativeCopy.f128e = this.f128e;
            nativeCopy.f132b = this.f132b;
        }
        return nativeCopy;
    }

    /* renamed from: a */
    public static Bitmap m5284a(int i, int i2, Config config) {
        return m5283a(i, i2, config, true);
    }

    /* renamed from: a */
    private static Bitmap m5283a(int i, int i2, Config config, boolean z) {
        return m5279a(null, i, i2, config, z);
    }

    /* renamed from: a */
    private static Bitmap m5279a(DisplayMetrics displayMetrics, int i, int i2, Config config, boolean z) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        Bitmap nativeCreate = nativeCreate(null, 0, i, i, i2, config.f140e, true);
        if (displayMetrics != null) {
            nativeCreate.f132b = displayMetrics.densityDpi;
        }
        if (config == Config.f145d && !z) {
            nativeErase(nativeCreate.f126a, -16777216);
            nativeSetHasAlpha(nativeCreate.f126a, z);
        }
        return nativeCreate;
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$CompressFormat.class */
    public enum CompressFormat {
        f135a(0),
        f136b(1),
        f137c(2);
        

        /* renamed from: d */
        final int f138d;

        CompressFormat(int i) {
            this.f138d = i;
        }
    }

    /* renamed from: a */
    public boolean m5282a(CompressFormat compressFormat, int i, OutputStream outputStream) {
        m5278a("Can't compress a recycled bitmap");
        if (outputStream == null) {
            throw new NullPointerException();
        }
        if (i < 0 || i > 100) {
            throw new IllegalArgumentException("quality must be 0..100");
        }
        return nativeCompress(this.f126a, compressFormat.f138d, i, outputStream, new byte[4096]);
    }

    /* renamed from: a */
    public final boolean m5289a() {
        return this.f127d;
    }

    /* renamed from: b */
    public final int m5275b() {
        return this.f129f;
    }

    /* renamed from: c */
    public final int m5272c() {
        return this.f130g;
    }

    /* renamed from: d */
    public final Config m5270d() {
        return Config.m5267a(nativeConfig(this.f126a));
    }

    /* renamed from: a */
    public void m5277a(boolean z) {
        nativeSetHasAlpha(this.f126a, z);
    }

    /* renamed from: a */
    public void m5288a(int i) {
        m5278a("Can't erase a recycled bitmap");
        if (!m5289a()) {
            throw new IllegalStateException("cannot erase immutable bitmaps");
        }
        nativeErase(this.f126a, i);
    }

    /* renamed from: a */
    public int m5287a(int i, int i2) {
        m5278a("Can't call getPixel() on a recycled bitmap");
        m5271c(i, i2);
        return nativeGetPixel(this.f126a, i, i2, this.f128e);
    }

    /* renamed from: a */
    public void m5276a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m5278a("Can't call getPixels() on a recycled bitmap");
        if (i5 == 0 || i6 == 0) {
            return;
        }
        m5285a(i3, i4, i5, i6, i, i2, iArr);
        nativeGetPixels(this.f126a, iArr, i, i2, i3, i4, i5, i6, this.f128e);
    }

    /* renamed from: c */
    private void m5271c(int i, int i2) {
        m5274b(i, i2);
        if (i >= m5275b()) {
            throw new IllegalArgumentException("x must be < bitmap.width()");
        }
        if (i2 >= m5272c()) {
            throw new IllegalArgumentException("y must be < bitmap.height()");
        }
    }

    /* renamed from: a */
    private void m5285a(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m5274b(i, i2);
        if (i3 < 0) {
            throw new IllegalArgumentException("width must be >= 0");
        }
        if (i4 < 0) {
            throw new IllegalArgumentException("height must be >= 0");
        }
        if (i + i3 > m5275b()) {
            throw new IllegalArgumentException("x + width must be <= bitmap.width()");
        }
        if (i2 + i4 > m5272c()) {
            throw new IllegalArgumentException("y + height must be <= bitmap.height()");
        }
        if (Math.abs(i6) < i3) {
            throw new IllegalArgumentException("abs(stride) must be >= width");
        }
        int i7 = i5 + ((i4 - 1) * i6);
        int length = iArr.length;
        if (i5 < 0 || i5 + i3 > length || i7 < 0 || i7 + i3 > length) {
            throw new ArrayIndexOutOfBoundsException();
        }
    }

    /* renamed from: a */
    public void m5286a(int i, int i2, int i3) {
        m5278a("Can't call setPixel() on a recycled bitmap");
        if (!m5289a()) {
            throw new IllegalStateException();
        }
        m5271c(i, i2);
        nativeSetPixel(this.f126a, i, i2, i3, this.f128e);
    }

    /* renamed from: b */
    public void m5273b(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m5278a("Can't call setPixels() on a recycled bitmap");
        if (!m5289a()) {
            throw new IllegalStateException();
        }
        if (i5 == 0 || i6 == 0) {
            return;
        }
        m5285a(i3, i4, i5, i6, i, i2, iArr);
        nativeSetPixels(this.f126a, iArr, i, i2, i3, i4, i5, i6, this.f128e);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        m5278a("Can't parcel a recycled bitmap");
        if (!nativeWriteToParcel(this.f126a, this.f127d, this.f132b, parcel)) {
            throw new RuntimeException("native writeToParcel failed");
        }
    }
}