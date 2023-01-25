package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/o.class */
public final class C0980o extends AbstractC1059u {

    /* renamed from: b */
    int f6682b;

    /* renamed from: a */
    InterfaceC0977l f6681a = new C0975j(null);

    /* renamed from: c */
    final C1136m f6683c = new C1136m();

    /* renamed from: d */
    final C1055q f6684d = new C1055q(Paint.class);

    /* renamed from: e */
    final C1055q f6685e = new C1055q(Rect.class);

    /* renamed from: f */
    final C1055q f6686f = new C1055q(RectF.class);

    /* renamed from: g */
    final C1055q f6687g = new C1055q(Matrix.class);

    /* renamed from: h */
    final C1055q f6688h = new C1055q(C1056r.class);

    /* renamed from: i */
    final C1058t f6689i = new C1058t(200);

    /* renamed from: j */
    int f6690j = 0;

    /* renamed from: k */
    volatile boolean f6691k = false;

    public C0980o() {
        this.f6683c.add(this.f6684d);
        this.f6683c.add(this.f6685e);
        this.f6683c.add(this.f6686f);
        this.f6683c.add(this.f6687g);
        this.f6683c.add(this.f6688h);
    }

    /* renamed from: a */
    public final C1057s m852a(EnumC0982p enumC0982p, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        C1058t c1058t = this.f6689i;
        int i = this.f6690j;
        if (i >= c1058t.f6775a) {
            c1058t.m840a(new C1057s(this));
        }
        C1057s c1057s = c1058t.f6776b[i];
        c1057s.f6768a = enumC0982p;
        Object[] objArr = c1057s.f6769b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = obj5;
        objArr[5] = obj6;
        objArr[6] = obj7;
        objArr[7] = obj8;
        this.f6690j++;
        return c1057s;
    }

    /* renamed from: a */
    public final void m853a(EnumC0982p enumC0982p, Object obj, Object obj2, Object obj3, Object obj4) {
        C1058t c1058t = this.f6689i;
        int i = this.f6690j;
        if (i >= c1058t.f6775a) {
            c1058t.m840a(new C1057s(this));
        }
        C1057s c1057s = c1058t.f6776b[i];
        c1057s.f6768a = enumC0982p;
        Object[] objArr = c1057s.f6769b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        this.f6690j++;
    }

    /* renamed from: a */
    public final void m854a(EnumC0982p enumC0982p, Object obj, Object obj2) {
        C1058t c1058t = this.f6689i;
        int i = this.f6690j;
        if (i >= c1058t.f6775a) {
            c1058t.m840a(new C1057s(this));
        }
        C1057s c1057s = c1058t.f6776b[i];
        c1057s.f6768a = enumC0982p;
        Object[] objArr = c1057s.f6769b;
        objArr[0] = obj;
        objArr[1] = obj2;
        this.f6690j++;
    }

    /* renamed from: a */
    public final C1057s m855a(EnumC0982p enumC0982p) {
        C1058t c1058t = this.f6689i;
        int i = this.f6690j;
        if (i >= c1058t.f6775a) {
            c1058t.m840a(new C1057s(this));
        }
        C1057s c1057s = c1058t.f6776b[i];
        c1057s.f6768a = enumC0982p;
        this.f6690j++;
        return c1057s;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo849a(boolean z) {
        this.f6691k = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: c */
    public boolean mo844c() {
        return this.f6691k;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo865a(Rect rect) {
        m852a(EnumC0982p.clipRect_Rect, this.f6685e.m842a(rect), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo863a(RectF rectF) {
        m852a(EnumC0982p.clipRect_RectF, this.f6686f.m841a(rectF), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo859a(C0970e c0970e, float f, float f2, Paint paint) {
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        C1057s m855a = m855a(EnumC0982p.drawBitmap_Bitmap_float_float_Paint);
        m855a.f6769b[0] = c0970e;
        m855a.f6769b[1] = paint;
        m855a.f6770c = f;
        m855a.f6771d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo858a(C0970e c0970e, Rect rect, Rect rect2, Paint paint) {
        Rect m842a = this.f6685e.m842a(rect);
        Rect m842a2 = this.f6685e.m842a(rect2);
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m853a(EnumC0982p.drawBitmap_Bitmap_Rect_Rect_Paint, c0970e, m842a, m842a2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo857a(C0970e c0970e, Rect rect, RectF rectF, Paint paint) {
        Rect m842a = this.f6685e.m842a(rect);
        RectF m841a = this.f6686f.m841a(rectF);
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m853a(EnumC0982p.drawBitmap_Bitmap_Rect_RectF_Paint, c0970e, m842a, m841a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo869a(float f, float f2, float f3, Paint paint) {
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m853a(EnumC0982p.drawCircle_float_float_float_Paint, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo867a(int i, PorterDuff.Mode mode) {
        m854a(EnumC0982p.drawColor_int_Mode, Integer.valueOf(i), mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo868a(int i) {
        m852a(EnumC0982p.drawColor_int, Integer.valueOf(i), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo870a(float f, float f2, float f3, float f4, Paint paint) {
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        C1057s m855a = m855a(EnumC0982p.drawLine_float_float_float_float_Paint);
        m855a.f6770c = f;
        m855a.f6771d = f2;
        m855a.f6772e = f3;
        m855a.f6773f = f4;
        m855a.f6769b[0] = paint;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo848a(float[] fArr, int i, int i2, Paint paint) {
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m852a(EnumC0982p.drawPoints_floatarray_int_int_Paint, fArr, Integer.valueOf(i), Integer.valueOf(i2), paint, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo864a(Rect rect, Paint paint) {
        Rect m842a = this.f6685e.m842a(rect);
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m854a(EnumC0982p.drawRect_Rect_Paint, m842a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo862a(RectF rectF, Paint paint) {
        RectF m841a = this.f6686f.m841a(rectF);
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m854a(EnumC0982p.drawRect_RectF_Paint, m841a, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo851a(String str, float f, float f2, Paint paint) {
        if (!(paint instanceof C0966ag)) {
            paint = this.f6684d.m843a(paint);
        }
        m852a(EnumC0982p.drawText_String_float_float_Paint, str, Float.valueOf(f), Float.valueOf(f2), paint, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo874a() {
        m855a(EnumC0982p.restore);
        this.f6682b--;
        if (this.f6682b < 0) {
            GameEngine.m990g("saveStackSize: " + this.f6682b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo872a(float f, float f2, float f3) {
        C1057s m855a = m855a(EnumC0982p.rotate_float_float_float);
        m855a.f6770c = f;
        m855a.f6771d = f2;
        m855a.f6772e = f3;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo847b() {
        m855a(EnumC0982p.save);
        this.f6682b++;
        if (this.f6682b <= 0) {
            GameEngine.m990g("saveStackSize (on save): " + this.f6682b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo873a(float f, float f2) {
        C1057s m855a = m855a(EnumC0982p.scale_float_float);
        m855a.f6770c = f;
        m855a.f6771d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo871a(float f, float f2, float f3, float f4) {
        C1057s m855a = m855a(EnumC0982p.scale_float_float_float_float);
        m855a.f6770c = f;
        m855a.f6771d = f2;
        m855a.f6772e = f3;
        m855a.f6773f = f4;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo860a(C0970e c0970e) {
        m852a(EnumC0982p.setBitmap_Bitmap, c0970e, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo846b(float f, float f2) {
        C1057s m855a = m855a(EnumC0982p.translate_float_float);
        m855a.f6770c = f;
        m855a.f6771d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo856a(AbstractC0978m abstractC0978m) {
        m854a(EnumC0982p.runDrawTimeCallback_DrawTimeCallback, this, abstractC0978m);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo866a(Bitmap bitmap) {
        m854a(EnumC0982p.flushBitmap, bitmap, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public void mo850a(Lock lock) {
        m854a(EnumC0982p.enterLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: b */
    public void mo845b(Lock lock) {
        m854a(EnumC0982p.leaveLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.InterfaceC0977l
    /* renamed from: a */
    public boolean mo861a(C0964ae c0964ae) {
        m854a(EnumC0982p.compileShader_object, c0964ae, (Object) null);
        return true;
    }
}