package com.corrodinggames.rts.java.b;

import com.corrodinggames.rts.java.Main;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b/a.class */
public class a extends com.corrodinggames.librocket.a {
    public Main f;
    boolean g = false;

    public static synchronized a p() {
        if (a != null) {
            throw new RuntimeException("CommonGuiEngine already exists");
        }
        a aVar = new a();
        a = aVar;
        return aVar;
    }

    @Override // com.corrodinggames.librocket.a
    public void g() {
        this.f.i();
    }

    @Override // com.corrodinggames.librocket.a
    public void h() {
        this.f.u = true;
    }

    @Override // com.corrodinggames.librocket.a
    public int i() {
        return this.f.j.e();
    }

    @Override // com.corrodinggames.librocket.a
    public void d(boolean z) {
        this.f.a(z);
    }
}