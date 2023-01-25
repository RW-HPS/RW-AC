package com.corrodinggames.rts.java.p052b;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.rts.java.Main;

/* renamed from: com.corrodinggames.rts.java.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b/a.class */
public class C1188a extends AbstractC0043a {

    /* renamed from: f */
    public Main f7300f;

    /* renamed from: g */
    boolean f7301g = false;

    /* renamed from: p */
    public static synchronized C1188a m297p() {
        if (f343a != null) {
            throw new RuntimeException("CommonGuiEngine already exists");
        }
        C1188a c1188a = new C1188a();
        f343a = c1188a;
        return c1188a;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: g */
    public void mo300g() {
        this.f7300f.m396i();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: h */
    public void mo299h() {
        this.f7300f.f7205u = true;
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: i */
    public int mo298i() {
        return this.f7300f.f7194j.m22e();
    }

    @Override // com.corrodinggames.librocket.AbstractC0043a
    /* renamed from: d */
    public void mo301d(boolean z) {
        this.f7300f.m408a(z);
    }
}