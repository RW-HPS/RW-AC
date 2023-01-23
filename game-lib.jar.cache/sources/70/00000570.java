package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Bitmap;
import com.corrodinggames.rts.game.o;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.m.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/e.class */
public class e {

    /* renamed from: a */
    public e[] f629a;
    public e[] b;
    public e[] c;
    private static int x;
    public int d;
    public int e;
    public int f;
    public String g;
    public Integer h;
    ae i;
    public int[] j;
    protected Bitmap k;
    public boolean m;
    public boolean n;
    public int p;
    public int q;
    public int r;
    public int s;
    public float t;
    public float u;
    public boolean v;
    public boolean l = true;
    public boolean o = false;
    boolean w = false;

    public e() {
        int i = x;
        x = i + 1;
        this.d = i;
        this.e = 1;
    }

    public e[] a(o oVar) {
        if (oVar == o.pureGreen) {
            return this.f629a;
        }
        if (oVar == o.hueAdd) {
            return this.b;
        }
        if (oVar == o.hueShift) {
            return this.c;
        }
        GameEngine.print("getTeamImageCache coloringMode:" + oVar);
        return this.f629a;
    }

    public void a(o oVar, e[] eVarArr) {
        if (oVar == o.pureGreen) {
            this.f629a = eVarArr;
        } else if (oVar == o.hueAdd) {
            this.b = eVarArr;
        } else if (oVar == o.hueShift) {
            this.c = eVarArr;
        } else {
            GameEngine.print("setTeamImageCache coloringMode:" + oVar);
            this.f629a = eVarArr;
        }
    }

    public void a(String str) {
        this.g = str;
    }

    public String a() {
        return this.g;
    }

    public Bitmap b() {
        return this.k;
    }

    public e c() {
        return this;
    }

    public void a(boolean z) {
        this.o = z;
        e();
    }

    public void b(boolean z) {
        this.w = z;
    }

    public boolean d() {
        return this.w;
    }

    protected void e() {
    }

    public boolean f() {
        return this.m;
    }

    public void a(Bitmap bitmap) {
        this.k = bitmap;
        this.p = this.k.b();
        this.q = this.k.c();
        g();
    }

    public void g() {
        this.r = this.p / 2;
        this.s = this.q / 2;
        this.t = this.p / 2.0f;
        this.u = this.q / 2.0f;
    }

    public void a(e eVar) {
        eVar.o = this.o;
        eVar.p = this.p;
        eVar.q = this.q;
        eVar.r = this.r;
        eVar.s = this.s;
        eVar.t = this.t;
        eVar.u = this.u;
    }

    /* renamed from: h */
    public e mo15clone() {
        e eVar = new e();
        eVar.o = this.o;
        if (this.k != null) {
            Bitmap a2 = this.k.a(this.k.d(), true);
            if (a2 == null) {
                throw new OutOfMemoryError("Failed to copy bitmap: " + this.k.d());
            }
            eVar.a(a2);
        }
        return eVar;
    }

    public e a(int i, int i2, boolean z) {
        e eVar = new e();
        eVar.o = this.o;
        if (this.k != null) {
            Bitmap a2 = Bitmap.a(i, i2, this.k.d());
            eVar.a(a2);
            if (z) {
                for (int i3 = 0; i3 < a2.b(); i3++) {
                    for (int i4 = 0; i4 < a2.c(); i4++) {
                        a2.a(i3, i4, this.k.a(i3, i4));
                    }
                }
            }
        }
        return eVar;
    }

    public void i() {
        if (this.j == null) {
            j();
        }
    }

    public void j() {
        if (this.k == null && GameEngine.aU && !GameEngine.aX) {
            return;
        }
        if (this.j == null) {
            this.j = new int[this.p * this.q];
        }
        this.k.a(this.j, 0, this.p, 0, 0, this.p, this.q);
    }

    public boolean k() {
        return true;
    }

    public int a(int i, int i2) {
        if (this.j != null) {
            return this.j[i + (i2 * this.p)];
        }
        return this.k.a(i, i2);
    }

    public void a(int i, int i2, int i3) {
        if (this.j != null) {
            this.j[i + (i2 * this.p)] = i3;
        } else {
            this.k.a(i, i2, i3);
        }
    }

    public int l() {
        return this.q;
    }

    public int m() {
        return this.p;
    }

    public void n() {
    }

    public void o() {
        if (this.k != null) {
            this.k = null;
        }
        if (this.w) {
            GameEngine.print("remove with keepInGPUMemory=true");
        }
    }

    public void p() {
        if (this.k == null && GameEngine.aU && !GameEngine.aW) {
            return;
        }
        if (this.j != null) {
            this.k.b(this.j, 0, this.p, 0, 0, this.p, this.q);
            this.j = null;
        }
        this.e++;
    }

    public void q() {
    }

    public void r() {
        this.j = null;
    }

    public void s() {
        r();
    }

    public void t() {
    }

    public int u() {
        return this.p * this.q * 8;
    }

    public void v() {
        this.f629a = null;
        this.b = null;
        this.c = null;
        this.e++;
    }

    public void w() {
    }

    public void x() {
    }

    public void y() {
    }

    public void z() {
    }

    public boolean A() {
        return false;
    }

    public ae B() {
        return this.i;
    }

    public void a(ae aeVar) {
        this.i = aeVar;
    }
}