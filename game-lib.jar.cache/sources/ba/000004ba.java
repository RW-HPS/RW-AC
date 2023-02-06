package com.corrodinggames.rts.gameFramework.Interface.a;

import android.graphics.PointF;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/l.class */
public abstract class l {
    float g;
    float h;
    float k;
    float l;
    float m;
    float n;
    float o;
    float p;
    float q;
    float r;
    boolean u;
    l v;
    float y;
    float z;
    k B;
    static final PointF e = new PointF();
    static final RectF f = new RectF();
    static final PointF A = new PointF();
    float i = 50.0f;
    float j = 50.0f;
    boolean s = false;
    boolean t = false;
    m w = new m();
    m x = m.vertical;

    public String a() {
        return getClass().getSimpleName();
    }

    public y d() {
        return GameEngine.getGameEngine().bO;
    }

    public RectF a(RectF rectF, float f2, float f3) {
        rectF.a = 0.0f + f2;
        rectF.b = 0.0f + f3;
        rectF.c = 0.0f + this.i + f2;
        rectF.d = 0.0f + this.j + f3;
        return rectF;
    }

    public RectF a(RectF rectF) {
        A.x = this.g;
        A.y = this.h;
        if (this.v != null) {
            this.v.a(A);
        }
        rectF.a = 0.0f + A.x;
        rectF.b = 0.0f + A.y;
        rectF.c = 0.0f + this.i + A.x;
        rectF.d = 0.0f + this.j + A.y;
        return rectF;
    }

    public void b() {
        Iterator it = this.w.iterator();
        while (it.hasNext()) {
            ((l) it.next()).b();
        }
        this.y = 0.0f;
        this.z = 0.0f;
        if (this.x != m.none) {
            if (this.x == m.vertical) {
                float f2 = 0.0f;
                float f3 = 0.0f;
                Iterator it2 = this.w.iterator();
                while (it2.hasNext()) {
                    l lVar = (l) it2.next();
                    if (lVar.i > f2) {
                        f2 = lVar.g();
                    }
                    f3 += lVar.h();
                }
                this.y = f3;
                this.z = f2;
                b(this.z * 0.5f, this.y * 0.5f, this.w);
            } else if (this.x == m.horizontal) {
                float f4 = 0.0f;
                float f5 = 0.0f;
                Iterator it3 = this.w.iterator();
                while (it3.hasNext()) {
                    l lVar2 = (l) it3.next();
                    if (lVar2.j > f4) {
                        f4 = lVar2.h();
                    }
                    f5 += lVar2.g();
                }
                this.y = f4;
                this.z = f5;
                a(this.z * 0.5f, this.y * 0.5f, this.w);
            } else {
                throw new RuntimeException("Unknown layout style:" + this.x);
            }
        }
        this.s = false;
    }

    public static void a(float f2, float f3, m mVar) {
        float f4 = 0.0f;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            f4 += ((l) it.next()).g();
        }
        float f5 = f2 - (f4 * 0.5f);
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            float f6 = f5 + lVar.q;
            lVar.g = f6;
            f5 = f6 + lVar.i + lVar.r;
            lVar.d(f3);
        }
    }

    public static void b(float f2, float f3, m mVar) {
        float f4 = 0.0f;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            f4 += ((l) it.next()).h();
        }
        float f5 = f3 - (f4 * 0.5f);
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            l lVar = (l) it2.next();
            float f6 = f5 + lVar.o;
            lVar.h = f6;
            f5 = f6 + lVar.j + lVar.p;
            lVar.c(f2);
        }
    }

    public void a(PointF pointF) {
        if (this.v != null) {
            this.v.a(pointF);
        }
        pointF.x += this.g;
        pointF.y += this.h;
    }

    public void a(l lVar) {
        lVar.b(this);
    }

    public void b(l lVar) {
        a(lVar, false);
    }

    public void a(l lVar, boolean z) {
        if (this.v == lVar) {
            return;
        }
        if (this.v != null) {
            this.v.w.remove(this);
        }
        this.v = lVar;
        if (lVar != null) {
            if (!z) {
                lVar.w.add(this);
            } else {
                lVar.w.add(0, this);
            }
        }
        e();
    }

    public void e() {
        this.s = true;
        if (this.v != null) {
            this.v.e();
        }
    }

    public void b(float f2) {
        if (this.w.size() > 0) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((l) it.next()).b(f2);
            }
        }
    }

    public void f() {
        A.x = this.g;
        A.y = this.h;
        if (this.v != null) {
            this.v.a(A);
        }
        a(A.x, A.y);
        if (this.w.size() > 0) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                ((l) it.next()).f();
            }
        }
    }

    public void a(float f2, float f3) {
        if (this.t) {
            h.m.a(d(), a(new RectF(), f2, f3));
        }
    }

    public void a(k kVar) {
        this.B = kVar;
    }

    public boolean a(c cVar) {
        if (cVar.a() && c(cVar)) {
            GameEngine.m5e("UI click " + a());
            if (this.B != null) {
                return this.B.a(cVar);
            }
            return false;
        } else if (cVar.b()) {
            if (c(cVar)) {
                this.u = true;
                return false;
            }
            this.u = false;
            return false;
        } else {
            return false;
        }
    }

    public boolean b(c cVar) {
        if (this.w.size() > 0) {
            Iterator it = this.w.iterator();
            while (it.hasNext()) {
                if (((l) it.next()).b(cVar)) {
                    return true;
                }
            }
        }
        if (a(cVar)) {
            return true;
        }
        return false;
    }

    public boolean c(c cVar) {
        a(f);
        return f.b(cVar.a, cVar.b);
    }

    public void c(float f2) {
        this.g = f2 - (this.i * 0.5f);
    }

    public void d(float f2) {
        this.h = f2 - (this.j * 0.5f);
    }

    public void e(float f2) {
        this.o = f2;
        this.p = f2;
        this.q = f2;
        this.r = f2;
    }

    public void f(float f2) {
        this.k = f2;
        this.l = f2;
        this.m = f2;
        this.n = f2;
    }

    public float g() {
        return this.q + this.i + this.r;
    }

    public float h() {
        return this.o + this.j + this.p;
    }

    public void i() {
        b((l) null);
    }
}