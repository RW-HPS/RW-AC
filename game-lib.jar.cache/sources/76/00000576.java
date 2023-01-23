package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.locks.Lock;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/k.class */
public class k implements l {

    /* renamed from: a  reason: collision with root package name */
    public com.corrodinggames.rts.gameFramework.b.f f634a;
    public com.corrodinggames.rts.gameFramework.b.n b;
    com.corrodinggames.rts.gameFramework.b.v c;
    Rect e;
    RectF f;
    com.corrodinggames.rts.gameFramework.b.c g;
    RectF h;
    float[] i;
    static e j;
    e n;
    boolean o;
    public static boolean d = false;
    static Rect k = new Rect(0, 0, 1, 1);
    static Paint l = new Paint();
    static Rect m = new Rect();

    public void b(e eVar) {
        this.f634a.a(this.f634a.a(eVar.b(), eVar, this.g));
    }

    public void d() {
        this.f634a.a();
    }

    public com.corrodinggames.rts.gameFramework.b.v a(Paint paint) {
        this.b.a((ae) null);
        if (paint == null) {
            return null;
        }
        this.c.a(paint.d());
        this.c.a(paint.e());
        this.c.a(paint.g());
        return this.c;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Rect rect) {
        this.f634a.a(rect.f47a, rect.b, rect.c, rect.d);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(RectF rectF) {
        this.f634a.a((int) rectF.f48a, (int) rectF.b, (int) rectF.c, (int) rectF.d);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, float f, float f2, Paint paint) {
        this.e.a(0, 0, eVar.m(), eVar.l());
        this.f.a(f, f2, f + eVar.m(), f2 + eVar.l());
        b(eVar, this.e, this.f, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, Rect rect, Rect rect2, Paint paint) {
        this.f.a(rect2);
        b(eVar, rect, this.f, paint);
    }

    public com.corrodinggames.rts.gameFramework.b.b a(Bitmap bitmap, e eVar) {
        com.corrodinggames.rts.gameFramework.b.b a2;
        com.corrodinggames.rts.gameFramework.b.n nVar = this.b;
        if (nVar.f436a == null) {
            nVar.f436a = new com.corrodinggames.rts.gameFramework.b.ac(nVar, 1024, 1024);
        }
        if (bitmap.b() < 450 && bitmap.c() < 100 && (a2 = nVar.f436a.a(bitmap)) != null) {
            return a2;
        }
        return this.f634a.a(bitmap, eVar, this.g);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar, Rect rect, RectF rectF, Paint paint) {
        b(eVar, rect, rectF, paint);
    }

    public void b(e eVar, Rect rect, RectF rectF, Paint paint) {
        Bitmap a2 = aa.a(eVar);
        this.h.a(rect);
        if (a2 == null) {
            throw new RuntimeException("bitmap==null. sourceImage: " + eVar.a());
        }
        com.corrodinggames.rts.gameFramework.b.b a3 = a(a2, eVar);
        com.corrodinggames.rts.gameFramework.b.n nVar = this.b;
        boolean z = true;
        if (paint == null) {
            nVar.w = -1;
        } else {
            int e = paint.e();
            if (e != -1 && paint.h() == null) {
                e = Color.a(Color.a(e), 255, 255, 255);
            }
            nVar.w = e;
            if (paint instanceof ag) {
                z = ((ag) paint).p();
            } else {
                z = paint.c();
            }
        }
        nVar.a(a3, z ? 9729 : 9728);
        ae aeVar = null;
        if (paint instanceof ag) {
            aeVar = ((ag) paint).q();
        }
        if (eVar != null && aeVar == null) {
            aeVar = eVar.B();
        }
        if (aeVar != null) {
            boolean a4 = aeVar.a(paint, eVar);
            this.b.a(aeVar);
            if (a4) {
                this.b.e();
                this.b.o();
            }
        } else {
            this.b.a((ae) null);
        }
        nVar.a(a3, this.h, rectF, this.g, (com.corrodinggames.rts.gameFramework.b.l) null);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Bitmap bitmap) {
        this.f634a.a(bitmap);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, Paint paint) {
        this.f634a.a(f, f2, f3, a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(int i, PorterDuff.Mode mode) {
        this.b.a(b(i));
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(int i) {
        this.b.a(b(i));
    }

    float[] b(int i) {
        float f = ((i >>> 24) & 255) * 0.003921569f * 1.0f;
        float f2 = ((i >>> 16) & 255) * 0.003921569f * f;
        float f3 = ((i >>> 8) & 255) * 0.003921569f * f;
        this.i[0] = f;
        this.i[1] = f2;
        this.i[2] = f3;
        this.i[3] = (i & 255) * 0.003921569f * f;
        return this.i;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, float f4, Paint paint) {
        this.f634a.a(f, f2, f3, f4, a(paint));
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float[] fArr, int i, int i2, Paint paint) {
        this.f634a.a(fArr, i, i2, a(paint));
    }

    public void b(float f, float f2, float f3, float f4, Paint paint) {
        if (j == null) {
            Bitmap a2 = Bitmap.a(1, 1, Bitmap.Config.ARGB_8888);
            a2.a(0, 0, -1);
            e eVar = new e();
            eVar.a(a2);
            j = eVar;
            l.a(false);
            l.a(new LightingColorFilter(-1, -16777216));
        }
        l.b(paint.e());
        if (paint.d() == Paint.Style.STROKE) {
            float g = paint.g();
            if (g == 0.0f) {
                g = 1.0f;
            }
            this.f.a(f, f2, f3, f2 + g);
            b(j, k, this.f, l);
            this.f.a(f, f4, f3, f4 + g);
            b(j, k, this.f, l);
            this.f.a(f, f2, f + g, f4);
            b(j, k, this.f, l);
            this.f.a(f3, f2, f3 + g, f4);
            b(j, k, this.f, l);
            return;
        }
        this.f.a(f, f2, f3, f4);
        b(j, k, this.f, l);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Rect rect, Paint paint) {
        b(rect.f47a, rect.b, rect.c, rect.d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(RectF rectF, Paint paint) {
        b(rectF.f48a, rectF.b, rectF.c, rectF.d, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(String str, float f, float f2, Paint paint) {
        this.b.b((ae) null);
        com.corrodinggames.rts.gameFramework.b.n.E = this;
        this.f634a.a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f634a.equals(obj);
    }

    public int hashCode() {
        return this.f634a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a() {
        this.b.c();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3) {
        com.corrodinggames.rts.gameFramework.b.n nVar = this.b;
        nVar.a(f2, f3);
        nVar.a(f);
        nVar.a(-f2, -f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b() {
        this.b.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2, float f3, float f4) {
        com.corrodinggames.rts.gameFramework.b.n nVar = this.b;
        nVar.a(f3, f4);
        nVar.a(f, f2, 1.0f);
        nVar.a(-f3, -f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(float f, float f2) {
        this.b.a(f, f2, 1.0f);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(e eVar) {
        if (this.n != null) {
            d();
        }
        if (eVar != null) {
            b(eVar);
        }
        this.n = eVar;
    }

    public String toString() {
        return this.f634a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b(float f, float f2) {
        this.b.a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(boolean z) {
        this.o = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public boolean c() {
        return this.o;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(m mVar) {
        mVar.a(GameEngine.getGameEngine().bO);
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public void b(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.m.l
    public boolean a(ae aeVar) {
        return this.b.d(aeVar);
    }
}