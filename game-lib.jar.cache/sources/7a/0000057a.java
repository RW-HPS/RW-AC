package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.locks.Lock;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/o.class */
public final class o extends u {
    int b;

    /* renamed from: a  reason: collision with root package name */
    l f636a = new j(null);
    final com.corrodinggames.rts.gameFramework.utility.m c = new com.corrodinggames.rts.gameFramework.utility.m();
    final q d = new q(Paint.class);
    final q e = new q(Rect.class);
    final q f = new q(RectF.class);
    final q g = new q(Matrix.class);
    final q h = new q(r.class);
    final t i = new t(200);
    int j = 0;
    volatile boolean k = false;

    public o() {
        this.c.add(this.d);
        this.c.add(this.e);
        this.c.add(this.f);
        this.c.add(this.g);
        this.c.add(this.h);
    }

    public final s a(p pVar, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, Object obj8) {
        t tVar = this.i;
        int i = this.j;
        if (i >= tVar.f640a) {
            tVar.a(new s(this));
        }
        s sVar = tVar.b[i];
        sVar.f639a = pVar;
        Object[] objArr = sVar.b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        objArr[4] = obj5;
        objArr[5] = obj6;
        objArr[6] = obj7;
        objArr[7] = obj8;
        this.j++;
        return sVar;
    }

    public final void a(p pVar, Object obj, Object obj2, Object obj3, Object obj4) {
        t tVar = this.i;
        int i = this.j;
        if (i >= tVar.f640a) {
            tVar.a(new s(this));
        }
        s sVar = tVar.b[i];
        sVar.f639a = pVar;
        Object[] objArr = sVar.b;
        objArr[0] = obj;
        objArr[1] = obj2;
        objArr[2] = obj3;
        objArr[3] = obj4;
        this.j++;
    }

    public final void a(p pVar, Object obj, Object obj2) {
        t tVar = this.i;
        int i = this.j;
        if (i >= tVar.f640a) {
            tVar.a(new s(this));
        }
        s sVar = tVar.b[i];
        sVar.f639a = pVar;
        Object[] objArr = sVar.b;
        objArr[0] = obj;
        objArr[1] = obj2;
        this.j++;
    }

    public final s a(p pVar) {
        t tVar = this.i;
        int i = this.j;
        if (i >= tVar.f640a) {
            tVar.a(new s(this));
        }
        s sVar = tVar.b[i];
        sVar.f639a = pVar;
        this.j++;
        return sVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(boolean z) {
        this.k = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public boolean c() {
        return this.k;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Rect rect) {
        a(p.clipRect_Rect, this.e.a(rect), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(RectF rectF) {
        a(p.clipRect_RectF, this.f.a(rectF), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, float f, float f2, Paint paint) {
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        s a2 = a(p.drawBitmap_Bitmap_float_float_Paint);
        a2.b[0] = eVar;
        a2.b[1] = paint;
        a2.c = f;
        a2.d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, Rect rect, Rect rect2, Paint paint) {
        Rect a2 = this.e.a(rect);
        Rect a3 = this.e.a(rect2);
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawBitmap_Bitmap_Rect_Rect_Paint, eVar, a2, a3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, Rect rect, RectF rectF, Paint paint) {
        Rect a2 = this.e.a(rect);
        RectF a3 = this.f.a(rectF);
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawBitmap_Bitmap_Rect_RectF_Paint, eVar, a2, a3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, Paint paint) {
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawCircle_float_float_float_Paint, Float.valueOf(f), Float.valueOf(f2), Float.valueOf(f3), paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(int i, PorterDuff.Mode mode) {
        a(p.drawColor_int_Mode, Integer.valueOf(i), mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(int i) {
        a(p.drawColor_int, Integer.valueOf(i), null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, float f4, Paint paint) {
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        s a2 = a(p.drawLine_float_float_float_float_Paint);
        a2.c = f;
        a2.d = f2;
        a2.e = f3;
        a2.f = f4;
        a2.b[0] = paint;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float[] fArr, int i, int i2, Paint paint) {
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawPoints_floatarray_int_int_Paint, fArr, Integer.valueOf(i), Integer.valueOf(i2), paint, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Rect rect, Paint paint) {
        Rect a2 = this.e.a(rect);
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawRect_Rect_Paint, a2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(RectF rectF, Paint paint) {
        RectF a2 = this.f.a(rectF);
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawRect_RectF_Paint, a2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(String str, float f, float f2, Paint paint) {
        if (!(paint instanceof ag)) {
            paint = this.d.a(paint);
        }
        a(p.drawText_String_float_float_Paint, str, Float.valueOf(f), Float.valueOf(f2), paint, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a() {
        a(p.restore);
        this.b--;
        if (this.b < 0) {
            GameEngine.g("saveStackSize: " + this.b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3) {
        s a2 = a(p.rotate_float_float_float);
        a2.c = f;
        a2.d = f2;
        a2.e = f3;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b() {
        a(p.save);
        this.b++;
        if (this.b <= 0) {
            GameEngine.g("saveStackSize (on save): " + this.b);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2) {
        s a2 = a(p.scale_float_float);
        a2.c = f;
        a2.d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, float f4) {
        s a2 = a(p.scale_float_float_float_float);
        a2.c = f;
        a2.d = f2;
        a2.e = f3;
        a2.f = f4;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar) {
        a(p.setBitmap_Bitmap, eVar, null, null, null, null, null, null, null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b(float f, float f2) {
        s a2 = a(p.translate_float_float);
        a2.c = f;
        a2.d = f2;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(m mVar) {
        a(p.runDrawTimeCallback_DrawTimeCallback, this, mVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Bitmap bitmap) {
        a(p.flushBitmap, bitmap, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Lock lock) {
        a(p.enterLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b(Lock lock) {
        a(p.leaveLock_object, lock, (Object) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public boolean a(ae aeVar) {
        a(p.compileShader_object, aeVar, (Object) null);
        return true;
    }
}