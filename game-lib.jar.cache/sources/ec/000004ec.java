package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.RectF;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/s.class */
public class s extends com.corrodinggames.rts.gameFramework.m.m {

    /* renamed from: a  reason: collision with root package name */
    float[] f525a;
    Paint c;
    int d;
    boolean e;
    int b = 0;
    private final RectF f = new RectF();

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(int i, Paint paint) {
        this.d = i;
        this.f525a = new float[i * 2];
        this.c = paint;
    }

    public final void a(float f, float f2) {
        this.f525a[this.b] = f;
        this.f525a[this.b + 1] = f2;
        this.b += 2;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.m
    public void a(com.corrodinggames.rts.gameFramework.m.y yVar) {
        if (!this.e) {
            yVar.a(this.f525a, 0, this.b, this.c);
        } else {
            RectF rectF = this.f;
            float g = this.c.g();
            for (int i = 0; i < this.b; i++) {
                float f = this.f525a[i];
                float f2 = this.f525a[i + 1];
                rectF.f48a = f;
                rectF.b = f2;
                rectF.c = f + g;
                rectF.d = f2 + g;
                yVar.a(rectF, this.c);
            }
        }
        o.a(this);
    }
}