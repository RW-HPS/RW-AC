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
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC1100u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.File;
import java.io.InputStream;
import java.nio.IntBuffer;
import java.util.Iterator;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/x.class */
public class C1062x implements InterfaceC1063y {

    /* renamed from: a */
    static C1062x f6782a;

    /* renamed from: b */
    static C0970e f6783b;

    /* renamed from: c */
    static int[] f6784c;

    /* renamed from: d */
    static Bitmap f6785d;

    /* renamed from: x */
    private Context f6789x;

    /* renamed from: y */
    private InterfaceC0977l f6790y;

    /* renamed from: z */
    private InterfaceC0977l f6791z;

    /* renamed from: A */
    private C0959a f6792A;

    /* renamed from: h */
    public boolean f6793h;

    /* renamed from: i */
    public Bitmap f6794i;

    /* renamed from: j */
    public C0970e f6795j;

    /* renamed from: k */
    public int f6796k;

    /* renamed from: l */
    public int f6797l;

    /* renamed from: B */
    private C1062x f6798B;

    /* renamed from: s */
    C0970e f6805s;

    /* renamed from: e */
    static IntBuffer f6786e = IntBuffer.allocate(0);

    /* renamed from: f */
    static IntBuffer f6787f = IntBuffer.allocate(0);

    /* renamed from: t */
    static final RectF f6806t = new RectF();

    /* renamed from: u */
    static final RectF f6807u = new RectF();

    /* renamed from: w */
    static Rect f6809w = new Rect();

    /* renamed from: g */
    boolean f6788g = false;

    /* renamed from: m */
    final Rect f6799m = new Rect();

    /* renamed from: n */
    final Rect f6800n = new Rect();

    /* renamed from: o */
    final RectF f6801o = new RectF();

    /* renamed from: p */
    final RectF f6802p = new RectF();

    /* renamed from: q */
    final Matrix f6803q = new Matrix();

    /* renamed from: r */
    final RectF f6804r = new RectF();

    /* renamed from: v */
    C1136m f6808v = new C1136m();

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public InterfaceC1063y mo202a(C0970e c0970e) {
        C1062x c1062x = (C1062x) mo161b(c0970e);
        c1062x.f6793h = true;
        return c1062x;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public InterfaceC1063y mo161b(C0970e c0970e) {
        if (this.f6798B != null) {
            return this.f6798B.mo161b(c0970e);
        }
        C1062x c1062x = new C1062x();
        c1062x.mo215a(this.f6789x);
        Canvas canvas = new Canvas();
        Bitmap mo391b = c0970e.mo391b();
        canvas.m5252a(mo391b);
        c1062x.f6790y = new C0975j(canvas);
        c1062x.f6791z = c1062x.f6790y;
        c1062x.f6794i = mo391b;
        c1062x.f6795j = c0970e;
        c1062x.f6798B = this;
        if (c0970e != null) {
            c1062x.f6796k = c0970e.mo387m();
            c1062x.f6797l = c0970e.mo388l();
        }
        return c1062x;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public boolean mo231a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo215a(Context context) {
        this.f6789x = context;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo170b() {
        this.f6805s = new C0963ad(mo222a(C0067R.drawable.error_outmem));
    }

    /* renamed from: t */
    private void m832t() {
        C1062x c1062x;
        if (f6782a != this) {
            f6782a = this;
            if (this.f6798B != null) {
                c1062x = this.f6798B;
            } else {
                c1062x = this;
            }
            if (c1062x.m834c()) {
                InterfaceC0977l interfaceC0977l = this.f6790y;
                if (this.f6798B != null) {
                    interfaceC0977l = this.f6798B.f6790y;
                }
                if (!this.f6793h) {
                    if (f6783b != null) {
                        interfaceC0977l.mo860a((C0970e) null);
                        f6783b = null;
                    }
                    if (this.f6798B != null) {
                        this.f6790y = this.f6791z;
                        return;
                    }
                    return;
                }
                if (this.f6798B != null) {
                    this.f6790y = interfaceC0977l;
                }
                if (this.f6795j != f6783b) {
                    this.f6790y.mo860a(this.f6795j);
                    f6783b = this.f6795j;
                    return;
                }
                return;
            }
            if (f6783b != null) {
                InterfaceC0977l interfaceC0977l2 = this.f6790y;
                if (this.f6798B != null) {
                    interfaceC0977l2 = this.f6798B.f6790y;
                }
                interfaceC0977l2.mo860a((C0970e) null);
                f6783b = null;
            }
            if (this.f6798B != null) {
                this.f6790y = this.f6791z;
            }
        }
    }

    /* renamed from: a */
    private void m837a(Paint paint, String str) {
        m836a(paint, true, str, (C0970e) null);
    }

    /* renamed from: b */
    private void m835b(Paint paint) {
        m836a(paint, false, (String) null, (C0970e) null);
    }

    /* renamed from: a */
    private void m838a(Paint paint, C0970e c0970e) {
        m836a(paint, false, (String) null, c0970e);
    }

    /* renamed from: c */
    public boolean m834c() {
        if ((this.f6790y instanceof C0980o) || (this.f6790y instanceof C0976k)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private void m836a(Paint paint, boolean z, String str, C0970e c0970e) {
        m832t();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: d */
    public InterfaceC0977l mo148d() {
        return this.f6790y;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo190a(InterfaceC0977l interfaceC0977l) {
        this.f6790y = interfaceC0977l;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo205a(C0959a c0959a) {
        this.f6792A = c0959a;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo222a(int i) {
        return mo216a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo216a(int i, boolean z) {
        BitmapFactory.Options options = new BitmapFactory.Options();
        if (z) {
            options.inPreferredConfig = Bitmap.Config.ARGB_8888;
        } else {
            options.inPreferredConfig = Bitmap.Config.RGB_565;
        }
        options.inScaled = false;
        Bitmap decodeResource = BitmapFactory.decodeResource(this.f6789x.mo5301e(), i, options);
        if (decodeResource == null) {
            throw new RuntimeException("Could not load image with resId:" + i);
        }
        return m839a(decodeResource);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo184a(InputStream inputStream, boolean z) {
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
                GameEngine.m990g("Could not load image from steam");
                return null;
            }
            Log.m5063d("RustedWarfare", "load a:" + z + " as " + decodeStream.m5264d());
            return m839a(decodeStream);
        } catch (OutOfMemoryError e) {
            GameEngine.m1068a(EnumC1100u.gameImage, e);
            if (this.f6805s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6805s;
        }
    }

    /* renamed from: a */
    public C0970e m839a(Bitmap bitmap) {
        C0970e c0970e = new C0970e();
        c0970e.mo394a(bitmap);
        return c0970e;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public C0970e mo219a(int i, int i2, boolean z) {
        return mo166b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public C0970e mo166b(int i, int i2, boolean z) {
        Bitmap.Config config;
        if (z) {
            config = Bitmap.Config.ARGB_8888;
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        try {
            Bitmap m5278a = Bitmap.m5278a(i, i2, config);
            if (m5278a != null && !z && config == Bitmap.Config.ARGB_8888 && Build.VERSION.SDK_INT >= 12) {
                m5278a.m5271a(false);
            }
            if (m5278a == null) {
                OutOfMemoryError outOfMemoryError = new OutOfMemoryError("createBitmap returned null, possible out of memory");
                GameEngine.m1068a(EnumC1100u.gameImageCreate, outOfMemoryError);
                if (this.f6805s == null) {
                    throw new RuntimeException("outOfMemoryErrorImage==null", outOfMemoryError);
                }
                return this.f6805s;
            }
            return m839a(m5278a);
        } catch (OutOfMemoryError e) {
            GameEngine.m1068a(EnumC1100u.gameImageCreate, e);
            if (this.f6805s == null) {
                throw new RuntimeException("outOfMemoryErrorImage==null", e);
            }
            return this.f6805s;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: e */
    public void mo145e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo200a(C0970e c0970e, float f, float f2, float f3, Paint paint) {
        InterfaceC0977l interfaceC0977l = this.f6790y;
        interfaceC0977l.mo847b();
        interfaceC0977l.mo872a(f3 + 90.0f, f, f2);
        mo160b(c0970e, f - c0970e.f6626t, f2 - c0970e.f6627u, paint);
        interfaceC0977l.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo197a(C0970e c0970e, Rect rect, float f, float f2, float f3, Paint paint) {
        InterfaceC0977l interfaceC0977l = this.f6790y;
        interfaceC0977l.mo847b();
        int m5164b = rect.m5164b() >> 1;
        int m5160c = rect.m5160c() >> 1;
        this.f6802p.m5152a(f - m5164b, f2 - m5160c, f + m5164b, f2 + m5160c);
        interfaceC0977l.mo872a(f3 + 90.0f, f, f2);
        mo193a(c0970e, rect, this.f6802p, paint);
        interfaceC0977l.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo194a(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        if (m833c(c0970e) != null) {
            this.f6790y.mo858a(c0970e, rect, rect2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    /* renamed from: c */
    public Bitmap m833c(C0970e c0970e) {
        Bitmap mo391b = c0970e.mo391b();
        if (c0970e.f6612f != c0970e.f6611e) {
            c0970e.f6612f = c0970e.f6611e;
            mo148d().mo866a(mo391b);
        }
        return mo391b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo159b(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        if (!this.f6788g) {
            mo194a(c0970e, rect, rect2, paint);
            return;
        }
        Bitmap m833c = m833c(c0970e);
        boolean m899f = c0970e.m899f();
        if (paint.m5186f() < 255) {
            m899f = true;
        }
        int m5269b = this.f6794i.m5269b();
        int m5266c = this.f6794i.m5266c();
        int m5269b2 = m833c.m5269b();
        m833c.m5266c();
        c0970e.mo54i();
        int[] iArr = c0970e.f6616j;
        if (f6785d != this.f6794i) {
            mo173a(false);
        }
        int[] iArr2 = f6784c;
        int i = rect2.f231b;
        int i2 = rect2.f233d;
        int i3 = rect2.f230a;
        int i4 = rect2.f232c;
        int i5 = rect.f231b;
        int i6 = rect.f233d;
        int i7 = rect.f230a;
        float f = 1.0f;
        float f2 = 1.0f;
        int i8 = rect.f232c - i7;
        int i9 = i6 - i5;
        int i10 = i4 - i3;
        int i11 = i2 - i;
        if (i11 != 0) {
            f = i9 / i11;
        }
        if (i10 != 0) {
            f2 = i8 / i10;
        }
        if (i < 0) {
            i5 = (int) (i5 + ((-i) * f));
            i = 0;
        }
        if (i2 > m5266c - 1) {
            i2 = m5266c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i7 = (int) (i7 + ((-i3) * f2));
            i3 = 0;
        }
        if (i4 > m5269b - 1) {
            i4 = m5269b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i12 = i * m5269b;
        int i13 = i5 * m5269b2;
        int i14 = i2 * m5269b;
        float f3 = 0.0f;
        int i15 = i3;
        int i16 = i7;
        int i17 = i4;
        if (!m899f) {
            while (i12 < i14) {
                int i18 = i12 + i15;
                int i19 = i13 + (((int) f3) * m5269b2) + i16;
                float f4 = 0.0f;
                int i20 = i12 + i17;
                int i21 = i20 - 4;
                while (i18 < i21) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    float f5 = f4 + f2;
                    int i22 = i18 + 1;
                    iArr2[i22] = iArr[i19 + ((int) f5)];
                    float f6 = f5 + f2;
                    int i23 = i22 + 1;
                    iArr2[i23] = iArr[i19 + ((int) f6)];
                    float f7 = f6 + f2;
                    int i24 = i23 + 1;
                    iArr2[i24] = iArr[i19 + ((int) f7)];
                    f4 = f7 + f2;
                    i18 = i24 + 1;
                }
                while (i18 < i20) {
                    iArr2[i18] = iArr[i19 + ((int) f4)];
                    i18++;
                    f4 += f2;
                }
                i12 += m5269b;
                f3 += f;
            }
            return;
        }
        int m5188e = paint.m5188e() >>> 24;
        while (i12 < i14) {
            int i25 = i12 + i15;
            int i26 = i13 + (((int) f3) * m5269b2) + i16;
            float f8 = 0.0f;
            int i27 = i12 + i17;
            int i28 = -1;
            int i29 = 0;
            int i30 = 0;
            int i31 = 0;
            while (i25 < i27) {
                int i32 = i26 + ((int) f8);
                if (i32 != i28) {
                    int i33 = iArr[i32];
                    i29 = ((i33 >>> 24) * m5188e) >> 8;
                    i30 = i33 & 16711935;
                    i31 = i33 & 65280;
                    if (i29 == 0) {
                        i25++;
                        f8 += f2;
                    } else {
                        i28 = i32;
                    }
                }
                int i34 = iArr2[i25];
                int i35 = i34 & 16711935;
                int i36 = i34 & 65280;
                iArr2[i25] = (-16777216) | ((i35 + (((i30 - i35) * i29) >> 8)) & 16711935) | ((i36 + (((i31 - i36) * i29) >> 8)) & 65280);
                i25++;
                f8 += f2;
            }
            i12 += m5269b;
            f3 += f;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo208a(Rect rect, Paint paint) {
        if (!this.f6788g) {
            mo163b(rect, paint);
            return;
        }
        if (f6785d != this.f6794i) {
            mo173a(false);
        }
        int m5269b = this.f6794i.m5269b();
        int m5266c = this.f6794i.m5266c();
        int[] iArr = f6784c;
        int i = rect.f231b;
        int i2 = rect.f233d;
        int i3 = rect.f230a;
        int i4 = rect.f232c;
        if (i < 0) {
            i = 0;
        }
        if (i2 > m5266c - 1) {
            i2 = m5266c - 1;
        }
        if (i > i2) {
            return;
        }
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 > m5269b - 1) {
            i4 = m5269b - 1;
        }
        if (i3 > i4) {
            return;
        }
        int i5 = i * m5269b;
        int i6 = i2 * m5269b;
        int i7 = i3;
        int i8 = i4;
        int m5188e = paint.m5188e();
        int i9 = m5188e >>> 24;
        if (!(i9 < 255)) {
            while (i5 < i6) {
                int i10 = i5 + i8;
                for (int i11 = i5 + i7; i11 < i10; i11++) {
                    iArr[i11] = m5188e;
                }
                i5 += m5269b;
            }
            return;
        }
        int i12 = (m5188e >> 16) & 255;
        int i13 = (m5188e >> 8) & 255;
        int i14 = m5188e & 255;
        float f = i9 * 0.003921569f;
        int i15 = (int) (i12 * f);
        int i16 = (int) (i13 * f);
        int i17 = (int) (i14 * f);
        int i18 = 255 - i9;
        int i19 = (-16777216) | (i15 << 16) | (i16 << 8) | i17;
        while (i5 < i6) {
            int i20 = i5 + i8;
            for (int i21 = i5 + i7; i21 < i20; i21++) {
                int i22 = iArr[i21];
                iArr[i21] = (((((i22 & 16711935) * i18) >> 8) & 16711935) | ((((i22 & 65280) * i18) >> 8) & 65280)) + i19;
            }
            i5 += m5269b;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo173a(boolean z) {
        this.f6788g = true;
        if (f6785d == this.f6794i) {
            return;
        }
        int m5269b = this.f6794i.m5269b();
        int m5266c = this.f6794i.m5266c();
        int i = m5269b * m5266c;
        if (f6784c == null || f6784c.length < i) {
            f6784c = new int[i];
        }
        if (!z) {
            this.f6794i.m5270a(f6784c, 0, m5269b, 0, 0, m5269b, m5266c);
        }
        f6785d = this.f6794i;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: f */
    public void mo142f() {
        this.f6788g = false;
        if (f6785d == this.f6794i) {
            int m5269b = this.f6794i.m5269b();
            this.f6794i.m5267b(f6784c, 0, m5269b, 0, 0, m5269b, this.f6794i.m5266c());
            f6785d = null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo193a(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
        if (m833c(c0970e) != null) {
            m838a(paint, c0970e);
            this.f6790y.mo857a(c0970e, rect, rectF, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo199a(C0970e c0970e, float f, float f2, Paint paint) {
        mo160b(c0970e, f - c0970e.f6626t, f2 - c0970e.f6627u, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo198a(C0970e c0970e, float f, float f2, Paint paint, float f3, float f4) {
        InterfaceC0977l interfaceC0977l = this.f6790y;
        interfaceC0977l.mo847b();
        if (f3 != 0.0f) {
            interfaceC0977l.mo872a(f3 + 90.0f, f, f2);
        }
        interfaceC0977l.mo871a(f4, f4, f, f2);
        m833c(c0970e);
        interfaceC0977l.mo859a(c0970e, f, f2, paint);
        interfaceC0977l.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo160b(C0970e c0970e, float f, float f2, Paint paint) {
        if (m833c(c0970e) != null) {
            this.f6790y.mo859a(c0970e, f, f2, paint);
            return;
        }
        throw new RuntimeException("bitmap was not drawn");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo196a(C0970e c0970e, Rect rect, Paint paint) {
        mo195a(c0970e, rect, paint, 0, 0, 0, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo195a(C0970e c0970e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
        C0960aa.m946a(this, c0970e, rect, paint, i, i2, i3, i4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo192a(C0970e c0970e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
        C0960aa.m944a(this, c0970e, rectF, paint, f, f2, i, i2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo167b(int i) {
        m832t();
        this.f6790y.mo868a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo218a(int i, PorterDuff.Mode mode) {
        m832t();
        this.f6790y.mo867a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo181a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
        float m5210a = paint.m5210a(str);
        f6807u.m5152a(f, f2, f + m5210a, f2 + mo180a(str, paint));
        f6806t.m5150a(f6807u);
        if (paint.m5181j() == Paint.Align.CENTER) {
            f6806t.m5153a(-(m5210a / 2.0f), 0.0f);
        }
        C0773f.m2199a(f6806t, f3);
        m835b(paint2);
        this.f6790y.mo862a(f6806t, paint2);
        mo182a(str, f6807u.f234a + (f3 / 2.0f), f6807u.f237d - (f3 / 2.0f), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo182a(String str, float f, float f2, Paint paint) {
        m837a(paint, str);
        this.f6790y.mo851a(str, f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo163b(Rect rect, Paint paint) {
        m835b(paint);
        this.f6790y.mo864a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo206a(RectF rectF, Paint paint) {
        m835b(paint);
        this.f6790y.mo862a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: g */
    public void mo140g() {
        if (this.f6808v.size() > 0) {
            synchronized (this.f6808v) {
                Iterator it = this.f6808v.iterator();
                while (it.hasNext()) {
                    this.f6790y.mo861a((C0964ae) it.next());
                }
                this.f6808v.clear();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: h */
    public void mo139h() {
        m832t();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: c */
    public void mo152c(Rect rect, Paint paint) {
        this.f6800n.m5166a(rect.f230a, rect.f231b, rect.f230a + rect.f232c, rect.f231b + rect.f233d);
        m835b(paint);
        mo148d().mo864a(this.f6800n, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo209a(Rect rect) {
        if (this.f6794i != null) {
            rect = new Rect(rect);
            int m5266c = this.f6794i.m5266c() - this.f6797l;
        }
        mo148d().mo865a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo207a(RectF rectF) {
        if (this.f6794i != null) {
            rectF = new RectF(rectF);
            int m5266c = this.f6794i.m5266c() - this.f6797l;
        }
        mo148d().mo863a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo224a(float f, float f2, float f3, Paint paint) {
        if (f3 < 50.0f) {
            C0960aa.m947a(this, f, f2, f3, paint, 1.0f);
            return;
        }
        m835b(paint);
        this.f6790y.mo869a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo168b(float f, float f2, float f3, Paint paint) {
        m835b(paint);
        this.f6790y.mo869a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo171a(float[] fArr, int i, int i2, Paint paint) {
        m835b(paint);
        mo148d().mo848a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: i */
    public void mo138i() {
        m832t();
        this.f6790y.mo847b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: j */
    public void mo137j() {
        m832t();
        this.f6790y.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: k */
    public void mo136k() {
        m832t();
        this.f6790y.mo847b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: l */
    public void mo135l() {
        m832t();
        this.f6790y.mo874a();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo228a(float f, float f2, float f3) {
        this.f6790y.mo872a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo229a(float f, float f2) {
        this.f6790y.mo873a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo227a(float f, float f2, float f3, float f4) {
        this.f6790y.mo871a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo169b(float f, float f2) {
        this.f6790y.mo846b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo226a(float f, float f2, float f3, float f4, Paint paint) {
        m835b(paint);
        mo148d().mo870a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo189a(AbstractC0978m abstractC0978m) {
        mo148d().mo856a(abstractC0978m);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: m */
    public int mo134m() {
        if (this.f6794i != null) {
            return this.f6796k;
        }
        return (int) GameEngine.getGameEngine().f6397cl;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: n */
    public int mo133n() {
        if (this.f6794i != null) {
            return this.f6797l;
        }
        return (int) GameEngine.getGameEngine().f6398cm;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo221a(int i, int i2) {
        this.f6796k = i;
        this.f6797l = i2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: o */
    public void mo132o() {
        m835b((Paint) null);
        mo218a(0, PorterDuff.Mode.CLEAR);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo214a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo204a(C0964ae c0964ae) {
        if (c0964ae != null) {
            synchronized (this.f6808v) {
                this.f6808v.add(c0964ae);
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: p */
    public void mo131p() {
        m832t();
        if (this.f6794i != null && (this.f6790y instanceof C0975j)) {
            mo148d().mo866a(this.f6794i);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: q */
    public void mo130q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public int mo180a(String str, Paint paint) {
        return (int) paint.m5180k();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public int mo158b(String str, Paint paint) {
        paint.m5208a(str, 0, str.length(), f6809w);
        return f6809w.f230a + f6809w.m5164b();
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: r */
    public C0970e mo129r() {
        return this.f6805s;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo191a(C0970e c0970e, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: a */
    public void mo179a(Lock lock) {
        m832t();
        this.f6790y.mo850a(lock);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: b */
    public void mo157b(Lock lock) {
        m832t();
        this.f6790y.mo845b(lock);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y
    /* renamed from: s */
    public float mo128s() {
        return 1.0f;
    }
}