package com.corrodinggames.rts.gameFramework.unitAction;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import android.util.Log;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.u;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.io.File;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/x.class */
public class x implements y {
    static x a;
    static e b;
    static int[] c;
    static Bitmap d;
    private Context x;
    private l y;
    private l z;
    private a A;
    public boolean h;
    public Bitmap i;
    public e j;
    public int k;
    public int l;
    private x B;
    e s;
    static IntBuffer e = IntBuffer.allocate(0);
    static IntBuffer f = IntBuffer.allocate(0);
    static final RectF t = new RectF();
    static final RectF u = new RectF();
    static Rect w = new Rect();
    boolean g = false;
    final Rect m = new Rect();
    final Rect n = new Rect();
    final RectF o = new RectF();
    final RectF p = new RectF();
    final Matrix q = new Matrix();
    final RectF r = new RectF();
    m v = new m();

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: a */
    public y mo9a(e eVar) {
        x xVar = (x) mo10b(eVar);
        xVar.h = true;
        return xVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    /* renamed from: b */
    public y mo10b(e eVar) {
        if (this.B != null) {
            return this.B.mo10b(eVar);
        }
        x xVar = new x();
        xVar.a(this.x);
        Canvas canvas = new Canvas();
        Bitmap b2 = eVar.b();
        canvas.a(b2);
        xVar.y = new j(canvas);
        xVar.z = xVar.y;
        xVar.i = b2;
        xVar.j = eVar;
        xVar.B = this;
        if (eVar != null) {
            xVar.k = eVar.m();
            xVar.l = eVar.l();
        }
        return xVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public boolean a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Context context) {
        this.x = context;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b() {
        this.s = new ad(a(AssetsID.drawable.error_outmem));
    }

    private void t() {
        x xVar;
        if (a != this) {
            a = this;
            if (this.B != null) {
                xVar = this.B;
            } else {
                xVar = this;
            }
            if (xVar.c()) {
                l lVar = this.y;
                if (this.B != null) {
                    lVar = this.B.y;
                }
                if (!this.h) {
                    if (b != null) {
                        lVar.a((e) null);
                        b = null;
                    }
                    if (this.B != null) {
                        this.y = this.z;
                        return;
                    }
                    return;
                }
                if (this.B != null) {
                    this.y = lVar;
                }
                if (this.j != b) {
                    this.y.a(this.j);
                    b = this.j;
                    return;
                }
                return;
            }
            if (b != null) {
                l lVar2 = this.y;
                if (this.B != null) {
                    lVar2 = this.B.y;
                }
                lVar2.a((e) null);
                b = null;
            }
            if (this.B != null) {
                this.y = this.z;
            }
        }
    }

    private void a(Paint paint, String str) {
        a(paint, true, str, (e) null);
    }

    private void b(Paint paint) {
        a(paint, false, (String) null, (e) null);
    }

    private void a(Paint paint, e eVar) {
        a(paint, false, (String) null, eVar);
    }

    public boolean c() {
        if ((this.y instanceof o) || (this.y instanceof k)) {
            return true;
        }
        return false;
    }

    private void a(Paint paint, boolean z, String str, e eVar) {
        t();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public l d() {
        return this.y;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(l lVar) {
        this.y = lVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(a aVar) {
        this.A = aVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i) {
        return a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.x.e(), i, options);
        if (decodeResource == null) {
            throw new RuntimeException("Could not load image with resId:" + i);
        }
        return a(decodeResource);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(InputStream inputStream, boolean z) {
        if (inputStream == null) {
            throw new RuntimeException("loadImage: steam is null");
        }
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        try {
            Bitmap decodeStream = BitmapFactory.decodeStream(inputStream, null, options);
            if (decodeStream == null) {
                GameEngine.g("Could not load image from steam");
                return null;
            }
            Log.d("RustedWarfare", "load a:" + z + " as " + decodeStream.d());
            return a(decodeStream);
        } catch (OutOfMemoryError e2) {
            GameEngine.a(u.gameImage, e2);
            if (this.s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return this.s;
        }
    }

    public e a(Bitmap bitmap) {
        e eVar = new e();
        eVar.a(bitmap);
        return eVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e a(int i, int i2, boolean z) {
        return b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e b(int i, int i2, boolean z) {
        Bitmap.Config config;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        try {
            Bitmap a2 = Bitmap.a(i, i2, config);
            if (a2 != null && !z && config == Bitmap.Config.ARGB_8888 && Build.VERSION.SDK_INT >= 12) {
                a2.a(false);
            }
            if (a2 == null) {
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
                GameEngine.a(u.gameImageCreate, outOfMemoryError);
                if (this.s == null) {
                    throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
                }
                return this.s;
            }
            return a(a2);
        } catch (OutOfMemoryError e2) {
            GameEngine.a(u.gameImageCreate, e2);
            if (this.s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e2);
            }
            return this.s;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f2, float f3, float f4, Paint paint) {
        l lVar = this.y;
        lVar.b();
        lVar.a(f4 + 90.0f, f2, f3);
        b(eVar, f2 - eVar.t, f3 - eVar.u, paint);
        lVar.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, float f2, float f3, float f4, Paint paint) {
        l lVar = this.y;
        lVar.b();
        int b2 = rect.b() >> 1;
        int c2 = rect.c() >> 1;
        this.p.a(f2 - b2, f3 - c2, f2 + b2, f3 + c2);
        lVar.a(f4 + 90.0f, f2, f3);
        a(eVar, rect, this.p, paint);
        lVar.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Rect rect2, Paint paint) {
        if (c(eVar) != null) {
            this.y.a(eVar, rect, rect2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    public Bitmap c(e eVar) {
        Bitmap b2 = eVar.b();
        if (eVar.f != eVar.e) {
            eVar.f = eVar.e;
            d().a(b2);
        }
        return b2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(e eVar, Rect rect, Rect rect2, Paint paint) {
        if (!this.g) {
            a(eVar, rect, rect2, paint);
            return;
        }
        Bitmap c2 = c(eVar);
        boolean f2 = eVar.f();
        if (paint.f() < 255) {
            f2 = true;
        }
        int b2 = this.i.b();
        int c3 = this.i.c();
        int b3 = c2.b();
        c2.c();
        eVar.i();
        int[] iArr = eVar.j;
        if (d != this.i) {
            a(false);
        }
        int[] iArr2 = c;
        int i = rect2.b;
        int i2 = rect2.d;
        int i3 = rect2.a;
        int i4 = rect2.c;
        int i5 = rect.b;
        int i6 = rect.d;
        int i7 = rect.a;
        float f3 = 1.0f;
        float f4 = 1.0f;
        int i8 = rect.c - i7;
        int i9 = i6 - i5;
        int i10 = i4 - i3;
        int i11 = i2 - i;
        if (i11 != 0) {
            f3 = i9 / i11;
        }
        if (i10 != 0) {
            f4 = i8 / i10;
        }
        if (i < 0) {
            i5 = (int) (i5 + ((-i) * f3));
            i = 0;
        }
        if (i2 > c3 - 1) {
            i2 = c3 - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i7 = (int) (i7 + ((-i3) * f4));
            i3 = 0;
        }
        if (i4 > b2 - 1) {
            i4 = b2 - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i12 = i * b2;
        int i13 = i5 * b3;
        int i14 = i2 * b2;
        float f5 = 0.0f;
        int i15 = i3;
        int i16 = i7;
        int i17 = i4;
        if (!f2) {
            while (i12 < i14) {
                int i18 = i12 + i15;
                int i19 = i13 + (((int) f5) * b3) + i16;
                float f6 = 0.0f;
                int i20 = i12 + i17;
                int i21 = i20 - 4;
                while (i18 < i21) {
                    iArr2[i18] = iArr[i19 + ((int) f6)];
                    float f7 = f6 + f4;
                    int i22 = i18 + 1;
                    iArr2[i22] = iArr[i19 + ((int) f7)];
                    float f8 = f7 + f4;
                    int i23 = i22 + 1;
                    iArr2[i23] = iArr[i19 + ((int) f8)];
                    float f9 = f8 + f4;
                    int i24 = i23 + 1;
                    iArr2[i24] = iArr[i19 + ((int) f9)];
                    f6 = f9 + f4;
                    i18 = i24 + 1;
                }
                while (i18 < i20) {
                    iArr2[i18] = iArr[i19 + ((int) f6)];
                    i18++;
                    f6 += f4;
                }
                i12 += b2;
                f5 += f3;
            }
            return;
        }
        int e2 = paint.e() >>> 24;
        while (i12 < i14) {
            int i25 = i12 + i15;
            int i26 = i13 + (((int) f5) * b3) + i16;
            float f10 = 0.0f;
            int i27 = i12 + i17;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i25 < i27) {
                int i32 = i26 + ((int) f10);
                if (i32 != i28) {
                    int i33 = iArr[i32];
                    i29 = ((i33 >>> 24) * e2) >> 8;
                    i30 = i33 & 16711935;
                    i31 = i33 & 65280;
                    if (i29 == 0) {
                        i25++;
                        f10 += f4;
                    } else {
                        i28 = i32;
                    }
                }
                int i34 = iArr2[i25];
                int i35 = i34 & 16711935;
                int i36 = i34 & 65280;
                iArr2[i25] = (-16777216) | ((i35 + (((i30 - i35) * i29) >> 8)) & 16711935) | ((i36 + (((i31 - i36) * i29) >> 8)) & 65280);
                i25++;
                f10 += f4;
            }
            i12 += b2;
            f5 += f3;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect, Paint paint) {
        if (!this.g) {
            b(rect, paint);
            return;
        }
        if (d != this.i) {
            a(false);
        }
        int b2 = this.i.b();
        int c2 = this.i.c();
        int[] iArr = c;
        int i = rect.b;
        int i2 = rect.d;
        int i3 = rect.a;
        int i4 = rect.c;
        if (i < 0) {
            i = 0;
        }
        if (i2 > c2 - 1) {
            i2 = c2 - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 > b2 - 1) {
            i4 = b2 - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i5 = i * b2;
        int i6 = i2 * b2;
        int i7 = i3;
        int i8 = i4;
        int e2 = paint.e();
        int i9 = e2 >>> 24;
        if (!(i9 < 255)) {
            while (i5 < i6) {
                int i10 = i5 + i8;
                for (int i11 = i5 + i7; i11 < i10; i11++) {
                    iArr[i11] = e2;
                }
                i5 += b2;
            }
            return;
        }
        int i12 = (e2 >> 16) & 255;
        int i13 = (e2 >> 8) & 255;
        int i14 = e2 & 255;
        float f2 = i9 * 0.003921569f;
        int i15 = (int) (i12 * f2);
        int i16 = (int) (i13 * f2);
        int i17 = (int) (i14 * f2);
        int i18 = 255 - i9;
        int i19 = (-16777216) | (i15 << 16) | (i16 << 8) | i17;
        while (i5 < i6) {
            int i20 = i5 + i8;
            for (int i21 = i5 + i7; i21 < i20; i21++) {
                int i22 = iArr[i21];
                iArr[i21] = (((((i22 & 16711935) * i18) >> 8) & 16711935) | ((((i22 & 65280) * i18) >> 8) & 65280)) + i19;
            }
            i5 += b2;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(boolean z) {
        this.g = true;
        if (d == this.i) {
            return;
        }
        int b2 = this.i.b();
        int c2 = this.i.c();
        int i = b2 * c2;
        if (c == null || c.length < i) {
            c = new int[i];
        }
        if (!z) {
            this.i.a(c, 0, b2, 0, 0, b2, c2);
        }
        d = this.i;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void f() {
        this.g = false;
        if (d == this.i) {
            int b2 = this.i.b();
            this.i.b(c, 0, b2, 0, 0, b2, this.i.c());
            d = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, RectF rectF, Paint paint) {
        if (c(eVar) != null) {
            a(paint, eVar);
            this.y.a(eVar, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f2, float f3, Paint paint) {
        b(eVar, f2 - eVar.t, f3 - eVar.u, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, float f2, float f3, Paint paint, float f4, float f5) {
        l lVar = this.y;
        lVar.b();
        if (f4 != 0.0f) {
            lVar.a(f4 + 90.0f, f2, f3);
        }
        lVar.a(f5, f5, f2, f3);
        c(eVar);
        lVar.a(eVar, f2, f3, paint);
        lVar.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(e eVar, float f2, float f3, Paint paint) {
        if (c(eVar) != null) {
            this.y.a(eVar, f2, f3, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Paint paint) {
        a(eVar, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        aa.a(this, eVar, rect, paint, i, i2, i3, i4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, RectF rectF, Paint paint, float f2, float f3, int i, int i2) {
        aa.a(this, eVar, rectF, paint, f2, f3, i, i2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(int i) {
        t();
        this.y.a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, PorterDuff.Mode mode) {
        t();
        this.y.a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f2, float f3, Paint paint, Paint paint2, float f4) {
        float a2 = paint.a(str);
        u.a(f2, f3, f2 + a2, f3 + a(str, paint));
        t.a(u);
        if (paint.j() == Paint.Align.CENTER) {
            t.a(-(a2 / 2.0f), 0.0f);
        }
        f.a(t, f4);
        b(paint2);
        this.y.a(t, paint2);
        a(str, u.a + (f4 / 2.0f), u.d - (f4 / 2.0f), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(String str, float f2, float f3, Paint paint) {
        a(paint, str);
        this.y.a(str, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Rect rect, Paint paint) {
        b(paint);
        this.y.a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF, Paint paint) {
        b(paint);
        this.y.a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void g() {
        if (this.v.size() > 0) {
            synchronized (this.v) {
                Iterator it = this.v.iterator();
                while (it.hasNext()) {
                    this.y.a((ae) it.next());
                }
                this.v.clear();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void h() {
        t();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void c(Rect rect, Paint paint) {
        this.n.a(rect.a, rect.b, rect.a + rect.c, rect.b + rect.d);
        b(paint);
        d().a(this.n, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Rect rect) {
        if (this.i != null) {
            rect = new Rect(rect);
            int c2 = this.i.c() - this.l;
        }
        d().a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(RectF rectF) {
        if (this.i != null) {
            rectF = new RectF(rectF);
            int c2 = this.i.c() - this.l;
        }
        d().a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f2, float f3, float f4, Paint paint) {
        if (f4 < 50.0f) {
            aa.a(this, f2, f3, f4, paint, 1.0f);
            return;
        }
        b(paint);
        this.y.a(f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f2, float f3, float f4, Paint paint) {
        b(paint);
        this.y.a(f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float[] fArr, int i, int i2, Paint paint) {
        b(paint);
        d().a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void i() {
        t();
        this.y.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void j() {
        t();
        this.y.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void k() {
        t();
        this.y.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void l() {
        t();
        this.y.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f2, float f3, float f4) {
        this.y.a(f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f2, float f3) {
        this.y.a(f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f2, float f3, float f4, float f5) {
        this.y.a(f2, f3, f4, f5);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(float f2, float f3) {
        this.y.b(f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(float f2, float f3, float f4, float f5, Paint paint) {
        b(paint);
        d().a(f2, f3, f4, f5, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(m mVar) {
        d().a(mVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int m() {
        if (this.i != null) {
            return this.k;
        }
        return (int) GameEngine.getGameEngine().cl;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int n() {
        if (this.i != null) {
            return this.l;
        }
        return (int) GameEngine.getGameEngine().cm;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(int i, int i2) {
        this.k = i;
        this.l = i2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void o() {
        b((Paint) null);
        a(0, PorterDuff.Mode.CLEAR);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(ae aeVar) {
        if (aeVar != null) {
            synchronized (this.v) {
                this.v.add(aeVar);
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void p() {
        t();
        if (this.i != null && (this.y instanceof j)) {
            d().a(this.i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int a(String str, Paint paint) {
        return (int) paint.k();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public int b(String str, Paint paint) {
        paint.a(str, 0, str.length(), w);
        return w.a + w.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public e r() {
        return this.s;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(e eVar, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void a(Lock lock) {
        t();
        this.y.a(lock);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public void b(Lock lock) {
        t();
        this.y.b(lock);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.y
    public float s() {
        return 1.0f;
    }
}