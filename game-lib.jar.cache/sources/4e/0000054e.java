package com.corrodinggames.rts.gameFramework.p043k;

/* renamed from: com.corrodinggames.rts.gameFramework.k.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/e.class */
public final class C0936e extends AbstractC0941j {

    /* renamed from: a */
    boolean f6154a;

    /* renamed from: b */
    int f6155b;

    /* renamed from: c */
    final C0931a f6156c = new C0931a(100);

    /* renamed from: d */
    final C0931a f6157d = new C0931a(900);

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0941j
    /* renamed from: a */
    public void mo1198a(C0945n c0945n) {
        int i = c0945n.f6258c;
        if (i <= this.f6155b) {
            if (i == this.f6155b) {
                this.f6156c.m1243b(c0945n);
                return;
            }
            m1229c();
            this.f6155b = i;
            this.f6156c.add(c0945n);
            return;
        }
        this.f6157d.m1243b(c0945n);
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0941j
    /* renamed from: a */
    public C0945n mo1199a() {
        if (this.f6156c.f6127b > 0) {
            return this.f6156c.m1247b();
        }
        if (this.f6157d.f6127b == 0) {
            this.f6155b = Integer.MAX_VALUE;
            return null;
        }
        m1228d();
        return this.f6156c.m1247b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p043k.AbstractC0941j
    /* renamed from: b */
    public void mo1197b() {
        m1230a((C0944m) null);
    }

    /* renamed from: a */
    public void m1230a(C0944m c0944m) {
        if (c0944m != null) {
            C0945n[] m1253a = this.f6156c.m1253a();
            for (int i = this.f6156c.f6127b - 1; i >= 0; i--) {
                c0944m.m1147a(m1253a[i]);
            }
            C0945n[] m1253a2 = this.f6157d.m1253a();
            for (int i2 = this.f6157d.f6127b - 1; i2 >= 0; i2--) {
                c0944m.m1147a(m1253a2[i2]);
            }
        }
        this.f6156c.clear();
        this.f6157d.clear();
        this.f6155b = Integer.MAX_VALUE;
        this.f6154a = true;
    }

    /* renamed from: c */
    private void m1229c() {
        C0945n[] m1253a = this.f6156c.m1253a();
        int i = this.f6156c.f6127b;
        for (int i2 = 0; i2 < i; i2++) {
            this.f6157d.add(m1253a[i2]);
        }
        this.f6156c.clear();
    }

    /* renamed from: d */
    private void m1228d() {
        int i = Integer.MAX_VALUE;
        C0931a c0931a = this.f6157d;
        C0945n[] m1253a = c0931a.m1253a();
        for (int i2 = c0931a.f6127b - 1; i2 >= 0; i2--) {
            int i3 = m1253a[i2].f6258c;
            if (i3 < i) {
                i = i3;
            }
        }
        for (int i4 = c0931a.f6127b - 1; i4 >= 0; i4--) {
            C0945n c0945n = m1253a[i4];
            if (c0945n.f6258c == i) {
                this.f6156c.add(c0945n);
                int i5 = c0931a.f6127b - 1;
                m1253a[i4] = m1253a[i5];
                m1253a[i5] = null;
                c0931a.f6127b = i5;
            }
        }
        this.f6155b = i;
    }
}