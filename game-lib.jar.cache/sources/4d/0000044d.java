package com.corrodinggames.rts.gameFramework.b.a.a;

import com.corrodinggames.rts.gameFramework.b.a.f;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/b.class */
public abstract class b {
    private int a;
    private int b;
    private int c;
    private boolean d = false;

    public void a() {
        a(null, null, null);
    }

    public void a(String str, String str2, com.corrodinggames.rts.gameFramework.b.a.a[] aVarArr) {
        this.b = f.a(35633, str);
        this.c = f.a(35632, str2);
        this.a = f.a(this.b, this.c, aVarArr);
        this.d = true;
    }

    public int b() {
        return this.a;
    }
}