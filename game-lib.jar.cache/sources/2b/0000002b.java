package android.graphics;

import android.graphics.PorterDuff;

/* loaded from: game-lib.jar:android/graphics/Canvas.class */
public class Canvas {
    /* renamed from: a */
    public void m5258a(Bitmap bitmap) {
    }

    /* renamed from: a */
    public int m5266a() {
        return 0;
    }

    /* renamed from: b */
    public void m5247b() {
    }

    /* renamed from: a */
    public void m5265a(float f, float f2) {
    }

    /* renamed from: b */
    public void m5246b(float f, float f2) {
    }

    /* renamed from: a */
    public void m5263a(float f, float f2, float f3, float f4) {
    }

    /* renamed from: a */
    public void m5264a(float f, float f2, float f3) {
    }

    /* renamed from: a */
    public boolean m5252a(RectF rectF) {
        return false;
    }

    /* renamed from: a */
    public boolean m5254a(Rect rect) {
        return false;
    }

    /* renamed from: a */
    public void m5260a(int i) {
    }

    /* renamed from: a */
    public void m5259a(int i, PorterDuff.Mode mode) {
    }

    /* renamed from: a */
    public void m5248a(float[] fArr, int i, int i2, Paint paint) {
    }

    /* renamed from: a */
    public void m5262a(float f, float f2, float f3, float f4, Paint paint) {
    }

    /* renamed from: a */
    public void m5251a(RectF rectF, Paint paint) {
    }

    /* renamed from: a */
    public void m5253a(Rect rect, Paint paint) {
    }

    /* renamed from: a */
    public void m5261a(float f, float f2, float f3, Paint paint) {
    }

    /* renamed from: a */
    public void m5257a(Bitmap bitmap, float f, float f2, Paint paint) {
    }

    /* renamed from: a */
    public void m5255a(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
    }

    /* renamed from: a */
    public void m5256a(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
    }

    /* renamed from: a */
    public void m5249a(char[] cArr, int i, int i2, float f, float f2, Paint paint) {
    }

    /* renamed from: a */
    public void m5250a(String str, float f, float f2, Paint paint) {
    }

    /* loaded from: game-lib.jar:android/graphics/Canvas$EdgeType.class */
    public enum EdgeType {
        BW(0),
        AA(1);
        

        /* renamed from: c */
        public final int f149c;

        EdgeType(int i) {
            this.f149c = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Canvas$VertexMode.class */
    public enum VertexMode {
        TRIANGLES(0),
        TRIANGLE_STRIP(1),
        TRIANGLE_FAN(2);
        

        /* renamed from: d */
        public final int f154d;

        VertexMode(int i) {
            this.f154d = i;
        }
    }
}