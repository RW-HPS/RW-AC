package com.corrodinggames.rts.gameFramework.p037f.p038a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/c.class */
public class C0778c {

    /* renamed from: a */
    public int f5072a;

    /* renamed from: b */
    public int f5073b;

    /* renamed from: c */
    public EnumC0779d f5074c;

    /* renamed from: d */
    public int f5075d = -1;

    /* renamed from: a */
    public static C0778c m2047a(int i, int i2) {
        C0778c c0778c = new C0778c();
        c0778c.f5072a = i;
        c0778c.f5073b = i2;
        c0778c.f5074c = EnumC0779d.mouseClick;
        c0778c.f5075d = 1;
        return c0778c;
    }

    /* renamed from: b */
    public static C0778c m2045b(int i, int i2) {
        C0778c c0778c = new C0778c();
        c0778c.f5072a = i;
        c0778c.f5073b = i2;
        c0778c.f5074c = EnumC0779d.mouseMove;
        c0778c.f5075d = 1;
        return c0778c;
    }

    /* renamed from: a */
    public boolean m2048a() {
        return this.f5074c == EnumC0779d.mouseClick;
    }

    /* renamed from: b */
    public boolean m2046b() {
        return this.f5074c == EnumC0779d.mouseMove;
    }
}