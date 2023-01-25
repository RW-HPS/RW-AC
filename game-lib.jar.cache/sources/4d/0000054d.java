package com.corrodinggames.rts.gameFramework.p043k;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;
import java.util.PriorityQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.k.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/d.class */
public final class C0935d extends AbstractC0941j {

    /* renamed from: a */
    public static int f6133a;

    /* renamed from: b */
    public static int f6134b;

    /* renamed from: c */
    public static int f6135c;

    /* renamed from: d */
    public static int f6136d;

    /* renamed from: e */
    public static int f6137e;

    /* renamed from: f */
    public static int f6138f;

    /* renamed from: g */
    public static int f6139g;

    /* renamed from: h */
    public static double f6140h;

    /* renamed from: i */
    public static double f6141i;

    /* renamed from: j */
    int f6142j;

    /* renamed from: k */
    int f6143k;

    /* renamed from: l */
    int f6144l;

    /* renamed from: m */
    int f6145m;

    /* renamed from: n */
    int f6146n;

    /* renamed from: o */
    C0945n[] f6147o = new C0945n[975];

    /* renamed from: p */
    C1136m f6148p = new C1136m(100);

    /* renamed from: q */
    final PriorityQueue f6149q = new PriorityQueue();

    /* renamed from: r */
    final C1136m f6150r = new C1136m(300);

    /* renamed from: s */
    int f6151s;

    /* renamed from: t */
    int f6152t;

    /* renamed from: u */
    public static int f6153u;

    /* renamed from: c */
    private void m1347c() {
        if (this.f6143k == this.f6145m) {
            m1345d();
            return;
        }
        int i = this.f6146n;
        C0945n[] c0945nArr = this.f6147o;
        if (this.f6142j == -2) {
            for (int i2 = 0; i2 <= i; i2++) {
                int i3 = c0945nArr[i2].f6258c;
                if (this.f6143k == i3) {
                    this.f6142j = i2;
                    this.f6143k = i3;
                    return;
                }
            }
        }
        int i4 = -1;
        int i5 = Integer.MAX_VALUE;
        for (int i6 = 0; i6 <= i; i6++) {
            int i7 = c0945nArr[i6].f6258c;
            if (i5 > i7) {
                i4 = i6;
                i5 = i7;
            }
        }
        if (this.f6143k != i5) {
            f6139g++;
        }
        this.f6142j = i4;
        this.f6143k = i5;
    }

    /* renamed from: a */
    private void m1350a(int i, C0945n c0945n) {
        this.f6147o[i] = c0945n;
        int i2 = c0945n.f6258c;
        if (this.f6142j == -1 || this.f6143k >= i2) {
            if (this.f6143k > i2) {
            }
            if (this.f6143k != i2) {
                f6139g++;
            }
            this.f6142j = i;
            this.f6143k = i2;
        }
        if (this.f6144l == -1 || this.f6145m < i2) {
            this.f6144l = i;
            this.f6145m = i2;
        }
    }

    /* renamed from: d */
    private void m1345d() {
        this.f6142j = -1;
        this.f6143k = Integer.MAX_VALUE;
        this.f6144l = -1;
        this.f6145m = Integer.MIN_VALUE;
        for (int i = 0; i <= this.f6146n; i++) {
            C0945n c0945n = this.f6147o[i];
            if (c0945n == null) {
                GameEngine.m5907e("n:" + i);
                GameEngine.m5907e("lowestBufferLastIndex:" + this.f6146n);
                throw new RuntimeException("null with n:" + i + ", lowestBufferLastIndex:" + this.f6146n);
            }
            int i2 = c0945n.f6258c;
            if (this.f6143k > i2) {
                this.f6142j = i;
                this.f6143k = i2;
            }
            if (this.f6145m < i2) {
                this.f6144l = i;
                this.f6145m = i2;
            }
        }
    }

    /* renamed from: e */
    private void m1344e() {
        if (this.f6146n < 30) {
            C0945n c0945n = (C0945n) this.f6149q.poll();
            if (c0945n != null) {
                m1348b(c0945n);
            }
            C0945n c0945n2 = (C0945n) this.f6149q.peek();
            if (c0945n2 != null) {
                this.f6151s = c0945n2.f6258c;
                return;
            }
            return;
        }
        this.f6151s = Integer.MAX_VALUE;
        C0945n c0945n3 = (C0945n) this.f6149q.peek();
        if (c0945n3 != null) {
            this.f6151s = c0945n3.f6258c;
        }
    }

    public C0935d() {
        m1343f();
    }

    /* renamed from: b */
    private void m1348b(C0945n c0945n) {
        this.f6146n++;
        m1350a(this.f6146n, c0945n);
        if (this.f6146n > f6133a) {
            f6133a = this.f6146n;
        }
    }

    /* renamed from: c */
    private void m1346c(C0945n c0945n) {
        this.f6149q.offer(c0945n);
        if (c0945n.f6258c < this.f6151s) {
            this.f6151s = c0945n.f6258c;
        }
        if (this.f6149q.size() > f6134b) {
            f6134b = this.f6149q.size();
        }
    }

    /* renamed from: a */
    public void mo1305a(C0945n c0945n) {
        f6136d++;
        boolean z = false;
        if (this.f6146n < this.f6147o.length - 1) {
            z = true;
        }
        if (z) {
            if (c0945n.f6258c <= this.f6151s) {
                m1348b(c0945n);
            } else {
                m1346c(c0945n);
            }
        } else if (c0945n.f6258c < this.f6145m) {
            C0945n c0945n2 = this.f6147o[this.f6144l];
            this.f6147o[this.f6144l] = c0945n;
            m1345d();
            m1346c(c0945n2);
        } else {
            m1346c(c0945n);
        }
    }

    /* renamed from: a */
    public C0945n mo1306a() {
        if (this.f6142j == -2) {
            int i = this.f6143k;
            m1347c();
            this.f6152t++;
            if (f6153u < this.f6152t) {
                f6153u = this.f6152t;
            }
            f6137e++;
            if (i == this.f6143k) {
                f6138f++;
            }
        } else {
            this.f6152t = 0;
        }
        if (this.f6143k < this.f6151s && this.f6142j != -1) {
            C0945n[] c0945nArr = this.f6147o;
            C0945n c0945n = c0945nArr[this.f6142j];
            if (this.f6146n != this.f6142j) {
                c0945nArr[this.f6142j] = c0945nArr[this.f6146n];
                c0945nArr[this.f6146n] = null;
            } else {
                c0945nArr[this.f6146n] = null;
            }
            this.f6146n--;
            this.f6142j = -2;
            return c0945n;
        }
        C0945n c0945n2 = (C0945n) this.f6149q.poll();
        m1344e();
        return c0945n2;
    }

    /* renamed from: b */
    public void mo1304b() {
        m1349a((C0944m) null);
    }

    /* renamed from: a */
    public void m1349a(C0944m c0944m) {
        for (int i = 0; i < this.f6147o.length; i++) {
            if (this.f6147o[i] != null) {
                if (c0944m != null) {
                    c0944m.m1254a(this.f6147o[i]);
                }
                this.f6147o[i] = null;
            }
        }
        this.f6146n = -1;
        Iterator it = this.f6149q.iterator();
        while (it.hasNext()) {
            C0945n c0945n = (C0945n) it.next();
            if (c0944m != null) {
                c0944m.m1254a(c0945n);
            }
        }
        this.f6149q.clear();
        m1343f();
    }

    /* renamed from: f */
    private void m1343f() {
        this.f6142j = -1;
        this.f6143k = Integer.MAX_VALUE;
        this.f6144l = -1;
        this.f6145m = Integer.MIN_VALUE;
        this.f6151s = Integer.MAX_VALUE;
    }
}