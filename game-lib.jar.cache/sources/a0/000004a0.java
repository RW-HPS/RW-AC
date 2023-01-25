package com.corrodinggames.rts.gameFramework.p035d;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;

/* renamed from: com.corrodinggames.rts.gameFramework.d.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/g.class */
public final class C0762g {

    /* renamed from: a */
    public String f4900a;

    /* renamed from: b */
    public int f4901b = 25;

    /* renamed from: c */
    public int f4902c = 25;

    /* renamed from: d */
    public int f4903d = 1;

    /* renamed from: e */
    public int f4904e = 1;

    /* renamed from: f */
    public int f4905f = 26;

    /* renamed from: g */
    public int f4906g = 26;

    /* renamed from: h */
    public int f4907h = Integer.MAX_VALUE;

    /* renamed from: i */
    public C0970e f4908i = null;

    /* renamed from: j */
    public C0970e f4909j = null;

    /* renamed from: k */
    public boolean f4910k = false;

    /* renamed from: l */
    static final Rect f4911l = new Rect();

    /* renamed from: m */
    static final RectF f4912m = new RectF();

    /* renamed from: a */
    public void m2341a() {
        this.f4909j = this.f4908i.mo55h();
        this.f4909j.mo53j();
        for (int i = 0; i < this.f4909j.mo387m(); i++) {
            for (int i2 = 0; i2 < this.f4909j.mo388l(); i2++) {
                this.f4909j.mo63a(i, i2, Color.m5243a(Color.m5245a(this.f4909j.mo64a(i, i2)), 0, 0, 0));
            }
        }
        this.f4909j.mo49p();
        this.f4909j.mo46s();
    }

    /* renamed from: a */
    public void m2340a(int i, float f, float f2, Paint paint) {
        Rect rect = f4911l;
        RectF rectF = f4912m;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i2 = i;
        int i3 = 0;
        if (i2 >= this.f4907h) {
            i3 = 0 + (i2 / this.f4907h);
            i2 %= this.f4907h;
        }
        int i4 = this.f4903d + (i2 * this.f4905f);
        int i5 = this.f4904e + (i3 * this.f4906g);
        f4911l.m5172a(i4, i5, i4 + this.f4901b, i5 + this.f4902c);
        rectF.m5158a(f, f2, f + rect.m5170b(), f2 + rect.m5166c());
        if (1 != 0) {
            rectF.m5159a((-rectF.m5153b()) / 2.0f, (-rectF.m5149c()) / 2.0f);
        }
        gameEngine.f6326bO.mo193a(this.f4908i, rect, rectF, paint);
    }
}