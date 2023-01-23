package com.corrodinggames.rts.gameFramework.k;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/e.class */
public final class e extends j {

    /* renamed from: a  reason: collision with root package name */
    boolean f602a;
    int b;
    final a c = new a(100);
    final a d = new a(900);

    @Override // com.corrodinggames.rts.gameFramework.k.j
    public void a(n nVar) {
        int i = nVar.c;
        if (i <= this.b) {
            if (i == this.b) {
                this.c.b(nVar);
                return;
            }
            c();
            this.b = i;
            this.c.add(nVar);
            return;
        }
        this.d.b(nVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.k.j
    public n a() {
        if (this.c.b > 0) {
            return this.c.b();
        }
        if (this.d.b == 0) {
            this.b = Integer.MAX_VALUE;
            return null;
        }
        d();
        return this.c.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.k.j
    public void b() {
        a((m) null);
    }

    public void a(m mVar) {
        if (mVar != null) {
            n[] a2 = this.c.a();
            for (int i = this.c.b - 1; i >= 0; i--) {
                mVar.a(a2[i]);
            }
            n[] a3 = this.d.a();
            for (int i2 = this.d.b - 1; i2 >= 0; i2--) {
                mVar.a(a3[i2]);
            }
        }
        this.c.clear();
        this.d.clear();
        this.b = Integer.MAX_VALUE;
        this.f602a = true;
    }

    private void c() {
        n[] a2 = this.c.a();
        int i = this.c.b;
        for (int i2 = 0; i2 < i; i2++) {
            this.d.add(a2[i2]);
        }
        this.c.clear();
    }

    private void d() {
        int i = Integer.MAX_VALUE;
        a aVar = this.d;
        n[] a2 = aVar.a();
        for (int i2 = aVar.b - 1; i2 >= 0; i2--) {
            int i3 = a2[i2].c;
            if (i3 < i) {
                i = i3;
            }
        }
        for (int i4 = aVar.b - 1; i4 >= 0; i4--) {
            n nVar = a2[i4];
            if (nVar.c == i) {
                this.c.add(nVar);
                int i5 = aVar.b - 1;
                a2[i4] = a2[i5];
                a2[i5] = null;
                aVar.b = i5;
            }
        }
        this.b = i;
    }
}