package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.gameFramework.f.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/au.class */
abstract class au implements Comparable {
    long c;
    long d = 5000;
    float e;
    float f;
    String g;
    boolean h;
    boolean i;

    public abstract void b(au auVar);

    public abstract String a();

    public au(float f, float f2) {
        this.e = f;
        this.f = f2;
    }

    @Override // java.lang.Comparable
    /* renamed from: c */
    public int compareTo(au auVar) {
        return (int) (auVar.c - this.c);
    }

    public boolean a(au auVar) {
        if (this.c + b() < System.currentTimeMillis() || f.a(this.e, this.f, auVar.e, auVar.f) > 90000.0f) {
            return false;
        }
        return true;
    }

    protected long b() {
        return 5000L;
    }
}