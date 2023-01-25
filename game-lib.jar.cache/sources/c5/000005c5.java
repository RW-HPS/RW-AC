package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.gameFramework.m.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/q.class */
public final class C1055q {

    /* renamed from: a */
    public final C1136m f6765a = new C1136m();

    /* renamed from: b */
    public int f6766b;

    /* renamed from: c */
    public Class f6767c;

    public C1055q(Class cls) {
        this.f6767c = cls;
    }

    /* renamed from: a */
    public final Rect m842a(Rect rect) {
        if (this.f6766b >= this.f6765a.f7109a) {
            this.f6765a.add(new Rect());
        }
        Rect rect2 = (Rect) this.f6765a.m534a(this.f6766b);
        rect2.f231b = rect.f231b;
        rect2.f233d = rect.f233d;
        rect2.f230a = rect.f230a;
        rect2.f232c = rect.f232c;
        this.f6766b++;
        return rect2;
    }

    /* renamed from: a */
    public final RectF m841a(RectF rectF) {
        if (this.f6766b >= this.f6765a.f7109a) {
            this.f6765a.add(new RectF());
        }
        RectF rectF2 = (RectF) this.f6765a.m534a(this.f6766b);
        rectF2.f235b = rectF.f235b;
        rectF2.f237d = rectF.f237d;
        rectF2.f234a = rectF.f234a;
        rectF2.f236c = rectF.f236c;
        this.f6766b++;
        return rectF2;
    }

    /* renamed from: a */
    public final Paint m843a(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (this.f6766b >= this.f6765a.f7109a) {
            this.f6765a.add(new Paint());
        }
        Paint paint2 = (Paint) this.f6765a.m534a(this.f6766b);
        paint2.m5220a(paint);
        this.f6766b++;
        return paint2;
    }
}