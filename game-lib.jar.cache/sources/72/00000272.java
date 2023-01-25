package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c.class */
public final class C0420c {

    /* renamed from: a */
    EnumC0427d f2682a;

    /* renamed from: b */
    int f2683b;

    /* renamed from: c */
    String f2684c;

    /* renamed from: d */
    float f2685d;

    /* renamed from: e */
    public C0320a[] f2686e;

    /* renamed from: g */
    private C1136m f2687g = new C1136m();

    /* renamed from: f */
    public final boolean f2688f = false;

    /* renamed from: a */
    public C0388b m3869a() {
        C0388b c0388b = null;
        if (this.f2687g.size() > 0) {
            c0388b = (C0388b) this.f2687g.get(this.f2687g.size() - 1);
            if (c0388b.f2293h) {
                c0388b = null;
            }
        }
        return c0388b;
    }

    /* renamed from: a */
    public void m3866a(C0456j c0456j, float f, float f2, boolean z) {
        if (z || f2 <= f) {
            return;
        }
        C0320a[] c0320aArr = this.f2686e;
        int length = c0320aArr.length;
        int i = -1;
        while (i + 1 < length && f > c0320aArr[i + 1].f1912a) {
            i++;
        }
        int i2 = i;
        while (i2 + 1 < length && f2 > c0320aArr[i2 + 1].f1912a) {
            i2++;
        }
        if (i2 <= i) {
            return;
        }
        for (int i3 = i + 1; i3 <= i2; i3++) {
            ((C0388b) c0320aArr[i3]).m3954a(c0456j);
        }
    }

    /* renamed from: b */
    public void m3864b() {
        C0388b m3869a;
        if (this.f2682a == EnumC0427d.event && (m3869a = m3869a()) != null) {
            m3869a.finalize();
        }
    }

    /* renamed from: a */
    public void m3865a(C0458l c0458l, float f, String str, String str2) {
        if (this.f2682a == EnumC0427d.event) {
            C0388b m3869a = m3869a();
            if (m3869a == null) {
                m3869a = new C0388b(f, 0.0f);
                this.f2687g.add(m3869a);
            }
            m3869a.m3953a(c0458l, str, str2);
            return;
        }
        try {
            m3867a(f, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            throw new C0417bo("Failed to parse float:" + str2);
        }
    }

    /* renamed from: a */
    public void m3867a(float f, float f2) {
        if (this.f2682a == EnumC0427d.event) {
            throw new C0417bo("Adding key frame value to event set");
        }
        if (this.f2687g.size() == 0 && f > 0.0f && f2 != 0.0f) {
            this.f2687g.add(new C0320a(0.0f, 0.0f));
        }
        this.f2687g.add(new C0320a(f, f2));
    }

    /* renamed from: a */
    public void m3868a(float f) {
        Iterator it = this.f2687g.iterator();
        while (it.hasNext()) {
            ((C0320a) it.next()).f1912a *= f;
        }
    }

    /* renamed from: c */
    public void m3862c() {
        Collections.sort(this.f2687g);
        C0320a c0320a = null;
        Iterator it = this.f2687g.iterator();
        while (it.hasNext()) {
            C0320a c0320a2 = (C0320a) it.next();
            if (c0320a != null) {
                c0320a2.f1914c = 1.0f / (c0320a2.f1912a - c0320a.f1912a);
                c0320a2.f1915d = c0320a2.f1913b - c0320a.f1913b;
            }
            c0320a = c0320a2;
            this.f2685d = c0320a2.f1912a;
        }
        this.f2686e = (C0320a[]) this.f2687g.toArray(new C0320a[0]);
        this.f2687g = null;
    }

    /* renamed from: b */
    public float m3863b(float f) {
        C0320a[] c0320aArr = this.f2686e;
        int length = c0320aArr.length;
        if (length == 1 || f <= c0320aArr[0].f1912a) {
            return c0320aArr[0].f1913b;
        }
        if (f >= this.f2685d) {
            return c0320aArr[length - 1].f1913b;
        }
        int i = 1;
        while (f > c0320aArr[i].f1912a) {
            i++;
            if (i >= length) {
                return c0320aArr[length - 1].f1913b;
            }
        }
        C0320a c0320a = c0320aArr[i - 1];
        C0320a c0320a2 = c0320aArr[i];
        return c0320a.f1913b + (c0320a2.f1915d * (f - c0320a.f1912a) * c0320a2.f1914c);
    }
}