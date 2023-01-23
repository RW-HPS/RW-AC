package com.corrodinggames.rts.gameFramework.d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/g.class */
public final class g {

    /* renamed from: a */
    public String f473a;
    public int b = 25;
    public int c = 25;
    public int d = 1;
    public int e = 1;
    public int f = 26;
    public int g = 26;
    public int h = Integer.MAX_VALUE;
    public com.corrodinggames.rts.gameFramework.unitAction.e i = null;
    public com.corrodinggames.rts.gameFramework.unitAction.e j = null;
    public boolean k = false;
    static final Rect l = new Rect();
    static final RectF m = new RectF();

    public void a() {
        this.j = this.i.mo15clone();
        this.j.j();
        for (int i = 0; i < this.j.m(); i++) {
            for (int i2 = 0; i2 < this.j.l(); i2++) {
                this.j.a(i, i2, Color.a(Color.a(this.j.a(i, i2)), 0, 0, 0));
            }
        }
        this.j.p();
        this.j.s();
    }

    public void a(int i, float f, float f2, Paint paint) {
        Rect rect = l;
        RectF rectF = m;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.h) {
            i3 = 0 + (i2 / this.h);
            i2 %= this.h;
        }
        int i4 = this.d + (i2 * this.f);
        int i5 = this.e + (i3 * this.g);
        l.a(i4, i5, i4 + this.b, i5 + this.c);
        rectF.a(f, f2, f + rect.b(), f2 + rect.c());
        if (1 != 0) {
            rectF.a((-rectF.b()) / 2.0f, (-rectF.c()) / 2.0f);
        }
        gameEngine.bO.a(this.i, rect, rectF, paint);
    }
}