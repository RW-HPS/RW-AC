package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.m.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/l.class */
public interface l {
    void a(boolean z);

    boolean c();

    void a(Rect rect);

    void a(RectF rectF);

    void a(e eVar, float f, float f2, Paint paint);

    void a(e eVar, Rect rect, Rect rect2, Paint paint);

    void a(e eVar, Rect rect, RectF rectF, Paint paint);

    void a(float f, float f2, float f3, Paint paint);

    void a(int i, PorterDuff.Mode mode);

    void a(int i);

    void a(float f, float f2, float f3, float f4, Paint paint);

    void a(float[] fArr, int i, int i2, Paint paint);

    void a(Rect rect, Paint paint);

    void a(RectF rectF, Paint paint);

    void a(String str, float f, float f2, Paint paint);

    void a();

    void a(float f, float f2, float f3);

    void b();

    void a(float f, float f2);

    void a(float f, float f2, float f3, float f4);

    void a(e eVar);

    void b(float f, float f2);

    void a(m mVar);

    void a(Bitmap bitmap);

    void a(Lock lock);

    void b(Lock lock);

    boolean a(ae aeVar);
}