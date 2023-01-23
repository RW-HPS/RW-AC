package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/q.class */
public final class q {

    /* renamed from: a  reason: collision with root package name */
    public final com.corrodinggames.rts.gameFramework.utility.m f638a = new com.corrodinggames.rts.gameFramework.utility.m();
    public int b;
    public Class c;

    public q(Class cls) {
        this.c = cls;
    }

    public final Rect a(Rect rect) {
        if (this.b >= this.f638a.f689a) {
            this.f638a.add(new Rect());
        }
        Rect rect2 = (Rect) this.f638a.a(this.b);
        rect2.b = rect.b;
        rect2.d = rect.d;
        rect2.f47a = rect.f47a;
        rect2.c = rect.c;
        this.b++;
        return rect2;
    }

    public final RectF a(RectF rectF) {
        if (this.b >= this.f638a.f689a) {
            this.f638a.add(new RectF());
        }
        RectF rectF2 = (RectF) this.f638a.a(this.b);
        rectF2.b = rectF.b;
        rectF2.d = rectF.d;
        rectF2.f48a = rectF.f48a;
        rectF2.c = rectF.c;
        this.b++;
        return rectF2;
    }

    public final Paint a(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (this.b >= this.f638a.f689a) {
            this.f638a.add(new Paint());
        }
        Paint paint2 = (Paint) this.f638a.a(this.b);
        paint2.a(paint);
        this.b++;
        return paint2;
    }
}