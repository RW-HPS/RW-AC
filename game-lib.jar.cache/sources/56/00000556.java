package com.corrodinggames.rts.gameFramework.path;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.k.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/m.class */
public final class m {
    int a;
    int b;
    public static int c;
    final e e = new e();
    final a d = new a(1000 + 100);

    m() {
        for (int i = 0; i < 1000; i++) {
            this.d.add(new n());
        }
    }

    n a() {
        if (this.d.b == 0) {
            c++;
            return new n();
        }
        return this.d.b();
    }

    final void a(n nVar) {
        if (nVar != null) {
            this.d.b(nVar);
        }
    }

    void b() {
        if (this.d.size() > 50000) {
            GameEngine.m5e("PathOpenList: resetPool:memoryPool over 50000 clearing");
            this.d.clear();
        }
        this.e.a(this);
    }

    public void a(int i, int i2) {
        b();
        this.a = i;
        this.b = i2;
    }

    public final void a(int i, short s, short s2) {
        n a = a();
        a.a(s, s2);
        a.a(i, this.a, this.b);
        this.e.a(a);
    }

    public final n c() {
        n a = this.e.a();
        if (a != null) {
            a(a);
        }
        return a;
    }
}