package com.corrodinggames.rts.java;

import org.newdawn.slick.Font;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/f.class */
public class f {

    /* renamed from: a  reason: collision with root package name */
    int f744a;
    boolean b;
    boolean c;
    Font d;
    int e;
    String[] f = new String[30];
    final /* synthetic */ e g;

    /* JADX INFO: Access modifiers changed from: package-private */
    public f(e eVar) {
        this.g = eVar;
    }

    /* renamed from: a */
    public f clone() {
        f fVar = new f(this.g);
        fVar.f744a = this.f744a;
        fVar.b = this.b;
        fVar.c = this.c;
        return fVar;
    }

    public String toString() {
        return "FontKey:(size:" + this.f744a + ",  bold:" + this.b + " fallback:" + this.c + ")";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public boolean a(String str) {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public void b(String str) {
        this.f[this.e] = str;
        this.e++;
        if (this.e >= this.f.length) {
            this.e = 0;
        }
    }
}