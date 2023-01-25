package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* renamed from: com.corrodinggames.rts.java.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
class C1209f {

    /* renamed from: a */
    int f7423a;

    /* renamed from: b */
    boolean f7424b;

    /* renamed from: c */
    boolean f7425c;

    /* renamed from: d */
    Font f7426d;

    /* renamed from: e */
    int f7427e;

    /* renamed from: f */
    String[] f7428f = new String[30];

    /* renamed from: g */
    final /* synthetic */ C1208e f7429g;

    C1209f(C1208e c1208e) {
        this.f7429g = c1208e;
    }

    /* renamed from: a */
    public C1209f clone() {
        C1209f c1209f = new C1209f(this.f7429g);
        c1209f.f7423a = this.f7423a;
        c1209f.f7424b = this.f7424b;
        c1209f.f7425c = this.f7425c;
        return c1209f;
    }

    public String toString() {
        return "FontKey:(size:" + this.f7423a + ",  bold:" + this.f7424b + " fallback:" + this.f7425c + ")";
    }

    /* renamed from: a */
    boolean m119a(String str) {
        if (str == null || !C1208e.m183a(str)) {
            return true;
        }
        for (int i = 0; i < this.f7428f.length; i++) {
            String str2 = this.f7428f[i];
            if (str2 != null && str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    void m118b(String str) {
        this.f7428f[this.f7427e] = str;
        this.f7427e++;
        if (this.f7427e >= this.f7428f.length) {
            this.f7427e = 0;
        }
    }
}