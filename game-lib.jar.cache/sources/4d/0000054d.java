package com.corrodinggames.rts.gameFramework.path;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.k.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/d.class */
public final class d extends j {
    public static int a;
    public static int b;
    public static int c;
    public static int d;
    public static int e;
    public static int f;
    public static int g;
    public static double h;
    public static double i;
    int j;
    int k;
    int l;
    int m;
    int n;
    n[] o = new n[975];
    m p = new m(100);
    final PriorityQueue q = new PriorityQueue();
    final m r = new m(300);
    int s;
    int t;
    public static int u;

    private void c() {
        if (this.k == this.m) {
            d();
            return;
        }
        int i2 = this.n;
        n[] nVarArr = this.o;
        if (this.j == -2) {
            for (int i3 = 0; i3 <= i2; i3++) {
                int i4 = nVarArr[i3].c;
                if (this.k == i4) {
                    this.j = i3;
                    this.k = i4;
                    return;
                }
            }
        }
        int i5 = -1;
        int i6 = Integer.MAX_VALUE;
        for (int i7 = 0; i7 <= i2; i7++) {
            int i8 = nVarArr[i7].c;
            if (i6 > i8) {
                i5 = i7;
                i6 = i8;
            }
        }
        if (this.k != i6) {
            g++;
        }
        this.j = i5;
        this.k = i6;
    }

    private void a(int i2, n nVar) {
        this.o[i2] = nVar;
        int i3 = nVar.c;
        if (this.j == -1 || this.k >= i3) {
            if (this.k > i3) {
            }
            if (this.k != i3) {
                g++;
            }
            this.j = i2;
            this.k = i3;
        }
        if (this.l == -1 || this.m < i3) {
            this.l = i2;
            this.m = i3;
        }
    }

    private void d() {
        this.j = -1;
        this.k = Integer.MAX_VALUE;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        for (int i2 = 0; i2 <= this.n; i2++) {
            n nVar = this.o[i2];
            if (nVar == null) {
                GameEngine.m5e("n:" + i2);
                GameEngine.m5e("lowestBufferLastIndex:" + this.n);
                throw new RuntimeException("null with n:" + i2 + ", lowestBufferLastIndex:" + this.n);
            }
            int i3 = nVar.c;
            if (this.k > i3) {
                this.j = i2;
                this.k = i3;
            }
            if (this.m < i3) {
                this.l = i2;
                this.m = i3;
            }
        }
    }

    private void e() {
        if (this.n < 30) {
            n nVar = (n) this.q.poll();
            if (nVar != null) {
                b(nVar);
            }
            n nVar2 = (n) this.q.peek();
            if (nVar2 != null) {
                this.s = nVar2.c;
                return;
            }
            return;
        }
        this.s = Integer.MAX_VALUE;
        n nVar3 = (n) this.q.peek();
        if (nVar3 != null) {
            this.s = nVar3.c;
        }
    }

    public d() {
        f();
    }

    private void b(n nVar) {
        this.n++;
        a(this.n, nVar);
        if (this.n > a) {
            a = this.n;
        }
    }

    private void c(n nVar) {
        this.q.offer(nVar);
        if (nVar.c < this.s) {
            this.s = nVar.c;
        }
        if (this.q.size() > b) {
            b = this.q.size();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.path.j
    public void a(n nVar) {
        d++;
        boolean z = false;
        if (this.n < this.o.length - 1) {
            z = true;
        }
        if (z) {
            if (nVar.c <= this.s) {
                b(nVar);
            } else {
                c(nVar);
            }
        } else if (nVar.c < this.m) {
            n nVar2 = this.o[this.l];
            this.o[this.l] = nVar;
            d();
            c(nVar2);
        } else {
            c(nVar);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.path.j
    public n a() {
        if (this.j == -2) {
            int i2 = this.k;
            c();
            this.t++;
            if (u < this.t) {
                u = this.t;
            }
            e++;
            if (i2 == this.k) {
                f++;
            }
        } else {
            this.t = 0;
        }
        if (this.k < this.s && this.j != -1) {
            n[] nVarArr = this.o;
            n nVar = nVarArr[this.j];
            if (this.n != this.j) {
                nVarArr[this.j] = nVarArr[this.n];
                nVarArr[this.n] = null;
            } else {
                nVarArr[this.n] = null;
            }
            this.n--;
            this.j = -2;
            return nVar;
        }
        n nVar2 = (n) this.q.poll();
        e();
        return nVar2;
    }

    @Override // com.corrodinggames.rts.gameFramework.path.j
    public void b() {
        a((m) null);
    }

    public void a(m mVar) {
        for (int i2 = 0; i2 < this.o.length; i2++) {
            if (this.o[i2] != null) {
                if (mVar != null) {
                    mVar.a(this.o[i2]);
                }
                this.o[i2] = null;
            }
        }
        this.n = -1;
        Iterator it = this.q.iterator();
        while (it.hasNext()) {
            n nVar = (n) it.next();
            if (mVar != null) {
                mVar.a(nVar);
            }
        }
        this.q.clear();
        f();
    }

    private void f() {
        this.j = -1;
        this.k = Integer.MAX_VALUE;
        this.l = -1;
        this.m = Integer.MIN_VALUE;
        this.s = Integer.MAX_VALUE;
    }
}