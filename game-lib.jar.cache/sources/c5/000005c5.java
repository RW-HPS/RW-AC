package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.utility.m;

/* renamed from: com.corrodinggames.rts.gameFramework.m.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/q.class */
public final class q {
    public final m a = new m();
    public int b;
    public Class c;

    public q(Class cls) {
        this.c = cls;
    }

    public final Rect a(Rect rect) {
        if (this.b >= this.a.a) {
            this.a.add(new Rect());
        }
        Rect rect2 = (Rect) this.a.a(this.b);
        rect2.b = rect.b;
        rect2.d = rect.d;
        rect2.a = rect.a;
        rect2.c = rect.c;
        this.b++;
        return rect2;
    }

    public final RectF a(RectF rectF) {
        if (this.b >= this.a.a) {
            this.a.add(new RectF());
        }
        RectF rectF2 = (RectF) this.a.a(this.b);
        rectF2.b = rectF.b;
        rectF2.d = rectF.d;
        rectF2.a = rectF.a;
        rectF2.c = rectF.c;
        this.b++;
        return rectF2;
    }

    public final Paint a(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (this.b >= this.a.a) {
            this.a.add(new Paint());
        }
        Paint paint2 = (Paint) this.a.a(this.b);
        paint2.a(paint);
        this.b++;
        return paint2;
    }
}