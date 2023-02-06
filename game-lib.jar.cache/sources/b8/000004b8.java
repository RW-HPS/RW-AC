package com.corrodinggames.rts.gameFramework.Interface.a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.d;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/j.class */
public class j extends l {
    String a;
    Paint b = new ag();
    h c = h.l;
    ArrayList d;

    public j() {
        this.b.a(Paint.Align.CENTER);
        this.b.b(-16777216);
        a(18.0f);
    }

    public void a(float f) {
        GameEngine.getGameEngine().b(this.b, f);
        e();
    }

    public void a(int i) {
        this.b.b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.l
    public String a() {
        return super.a() + " (text:" + this.a + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.l
    public void a(float f, float f2) {
        int a;
        super.a(f, f2);
        y d = d();
        RectF a2 = a(new RectF(), f, f2);
        this.c.a(d, a2);
        if (this.a == null) {
            return;
        }
        if (this.d == null) {
            d.a(this.a, a2.d(), a2.d - this.l, this.b);
            return;
        }
        int i = 0;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint = this.b;
            d.a(str, a2.d(), a2.b + this.k + d.a(paint) + (i * a), paint);
            i++;
        }
    }

    public void a(String str) {
        this.a = str;
        e();
    }

    public Rect c() {
        RectF a = a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.d = (int) a.d;
        rect.b = (int) a.b;
        rect.a = (int) a.a;
        rect.c = (int) a.c;
        rect.c = 10000;
        return rect;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.a.l
    public void b() {
        Rect c;
        super.b();
        d();
        this.d = new ArrayList(d.a(this.a, c(), this.b, this.b, true));
        this.i = c.b();
        this.j = c.c();
        this.i += this.m + this.n;
        this.j += this.k + this.l;
    }
}