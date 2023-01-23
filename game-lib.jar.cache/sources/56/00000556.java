package com.corrodinggames.rts.gameFramework.k;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/m.class */
public final class m {

    /* renamed from: a  reason: collision with root package name */
    int f609a;
    int b;
    public static int c;
    final e e = new e();
    final a d = new a(1000 + 100);

    /* JADX INFO: Access modifiers changed from: package-private */
    public m() {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(n nVar) {
        if (nVar != null) {
            this.d.b(nVar);
        }
    }

    void b() {
        if (this.d.size() > 50000) {
            GameEngine.m328e("PathOpenList: resetPool:memoryPool over 50000 clearing");
            this.d.clear();
        }
        this.e.a(this);
    }

    public void a(int i, int i2) {
        b();
        this.f609a = i;
        this.b = i2;
    }

    public final void a(int i, short s, short s2) {
        n a2 = a();
        a2.a(s, s2);
        a2.a(i, this.f609a, this.b);
        this.e.a(a2);
    }

    public final n c() {
        n a2 = this.e.a();
        if (a2 != null) {
            a(a2);
        }
        return a2;
    }
}