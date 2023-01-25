package com.corrodinggames.rts.gameFramework.p031b.p032a.p033a;

import com.corrodinggames.rts.gameFramework.p031b.p032a.C0684f;
import com.corrodinggames.rts.gameFramework.p031b.p032a.EnumC0677a;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/b.class */
public abstract class AbstractC0679b {

    /* renamed from: a */
    private int f4274a;

    /* renamed from: b */
    private int f4275b;

    /* renamed from: c */
    private int f4276c;

    /* renamed from: d */
    private boolean f4277d = false;

    /* renamed from: a */
    public void mo2720a() {
        m2719a(null, null, null);
    }

    /* renamed from: a */
    public void m2719a(String str, String str2, EnumC0677a[] enumC0677aArr) {
        this.f4275b = C0684f.m2687a(35633, str);
        this.f4276c = C0684f.m2687a(35632, str2);
        this.f4274a = C0684f.m2688a(this.f4275b, this.f4276c, enumC0677aArr);
        this.f4277d = true;
    }

    /* renamed from: b */
    public int m2718b() {
        return this.f4274a;
    }
}