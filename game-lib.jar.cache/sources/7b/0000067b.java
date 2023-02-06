package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
class f {
    int a;
    boolean b;
    boolean c;
    Font d;
    int e;
    String[] f = new String[30];
    final /* synthetic */ e g;

    f(e eVar) {
        this.g = eVar;
    }

    /* renamed from: a */
    public f clone() {
        f fVar = new f(this.g);
        fVar.a = this.a;
        fVar.b = this.b;
        fVar.c = this.c;
        return fVar;
    }

    public String toString() {
        return "FontKey:(size:" + this.a + ",  bold:" + this.b + " fallback:" + this.c + ")";
    }

    boolean a(String str) {
        if (str == null || !e.a(str)) {
            return true;
        }
        for (int i = 0; i < this.f.length; i++) {
            String str2 = this.f[i];
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    void b(String str) {
        this.f[this.e] = str;
        this.e++;
        if (this.e >= this.f.length) {
            this.e = 0;
        }
    }
}