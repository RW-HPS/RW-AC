package com.corrodinggames.rts.gameFramework.unitAction;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/y.class */
public interface y {
    /* renamed from: b */
    y mo10b(e eVar);

    /* renamed from: a */
    y mo9a(e eVar);

    boolean a();

    void a(Context context);

    void b();

    l d();

    void a(l lVar);

    void a(a aVar);

    e a(int i);

    e a(int i, boolean z);

    e a(InputStream inputStream, boolean z);

    e a(int i, int i2, boolean z);

    e b(int i, int i2, boolean z);

    void e();

    void a(e eVar, float f, float f2, float f3, Paint paint);

    void a(e eVar, Rect rect, float f, float f2, float f3, Paint paint);

    void a(e eVar, Rect rect, Rect rect2, Paint paint);

    void a(e eVar, Rect rect, RectF rectF, Paint paint);

    void a(e eVar, float f, float f2, Paint paint);

    void a(e eVar, float f, float f2, Paint paint, float f3, float f4);

    void b(e eVar, float f, float f2, Paint paint);

    void b(e eVar, Rect rect, Rect rect2, Paint paint);

    void a(Rect rect, Paint paint);

    void a(boolean z);

    void f();

    void a(e eVar, Rect rect, Paint paint);

    void a(e eVar, Rect rect, Paint paint, int i, int i2, int i3, int i4);

    void a(e eVar, RectF rectF, Paint paint, float f, float f2, int i, int i2);

    void b(int i);

    void a(int i, PorterDuff.Mode mode);

    void a(String str, float f, float f2, Paint paint, Paint paint2, float f3);

    void a(String str, float f, float f2, Paint paint);

    void b(Rect rect, Paint paint);

    void a(RectF rectF, Paint paint);

    void g();

    void h();

    void c(Rect rect, Paint paint);

    void a(Rect rect);

    void a(RectF rectF);

    void a(float f, float f2, float f3, Paint paint);

    void b(float f, float f2, float f3, Paint paint);

    void a(float[] fArr, int i, int i2, Paint paint);

    void i();

    void j();

    void k();

    void l();

    void a(float f, float f2, float f3);

    void a(float f, float f2);

    void a(float f, float f2, float f3, float f4);

    void b(float f, float f2);

    void a(m mVar);

    void a(float f, float f2, float f3, float f4, Paint paint);

    int m();

    int n();

    void a(int i, int i2);

    void o();

    void a(Paint paint);

    void p();

    void q();

    int a(String str, Paint paint);

    int b(String str, Paint paint);

    e r();

    void a(e eVar, File file);

    void a(Lock lock);

    void b(Lock lock);

    void a(ae aeVar);

    float s();
}