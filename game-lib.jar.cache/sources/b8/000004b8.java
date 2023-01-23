package com.corrodinggames.rts.gameFramework.f.a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.m.y;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/j.class */
public class j extends l {

    /* renamed from: a  reason: collision with root package name */
    String f489a;
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

    @Override // com.corrodinggames.rts.gameFramework.f.a.l
    public String a() {
        return super.a() + " (text:" + this.f489a + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.f.a.l
    public void a(float f, float f2) {
        int a2;
        super.a(f, f2);
        y d = d();
        RectF a3 = a(new RectF(), f, f2);
        this.c.a(d, a3);
        if (this.f489a == null) {
            return;
        }
        if (this.d == null) {
            d.a(this.f489a, a3.d(), a3.d - this.l, this.b);
            return;
        }
        int i = 0;
        Iterator it = this.d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint = this.b;
            d.a(str, a3.d(), a3.b + this.k + com.corrodinggames.rts.gameFramework.f.d.a(paint) + (i * a2), paint);
            i++;
        }
    }

    public void a(String str) {
        this.f489a = str;
        e();
    }

    public Rect c() {
        RectF a2 = a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.d = (int) a2.d;
        rect.b = (int) a2.b;
        rect.f47a = (int) a2.f48a;
        rect.c = (int) a2.c;
        rect.c = 10000;
        return rect;
    }

    @Override // com.corrodinggames.rts.gameFramework.f.a.l
    public void b() {
        Rect c;
        super.b();
        d();
        this.d = new ArrayList(com.corrodinggames.rts.gameFramework.f.d.a(this.f489a, c(), this.b, this.b, true));
        this.i = c.b();
        this.j = c.c();
        this.i += this.m + this.n;
        this.j += this.k + this.l;
    }
}