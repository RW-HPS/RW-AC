package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.unitAction.m;
import com.corrodinggames.rts.gameFramework.unitAction.y;

/* renamed from: com.corrodinggames.rts.gameFramework.f.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/s.class */
public class s extends m {
    float[] a;
    Paint c;
    int d;
    boolean e;
    int b = 0;
    private final RectF f = new RectF();

    s(int i, Paint paint) {
        this.d = i;
        this.a = new float[i * 2];
        this.c = paint;
    }

    public final void a(float f, float f2) {
        this.a[this.b] = f;
        this.a[this.b + 1] = f2;
        this.b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.m
    public void a(y yVar) {
        if (!this.e) {
            yVar.a(this.a, 0, this.b, this.c);
        } else {
            RectF rectF = this.f;
            float g = this.c.g();
            for (int i = 0; i < this.b; i++) {
                float f = this.a[i];
                float f2 = this.a[i + 1];
                rectF.a = f;
                rectF.b = f2;
                rectF.c = f + g;
                rectF.d = f2 + g;
                yVar.a(rectF, this.c);
            }
        }
        o.a(this);
    }
}