package com.corrodinggames.rts.gameFramework.Interface.a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/c.class */
public class c {
    public int a;
    public int b;
    public d c;
    public int d = -1;

    public static c a(int i, int i2) {
        c cVar = new c();
        cVar.a = i;
        cVar.b = i2;
        cVar.c = d.mouseClick;
        cVar.d = 1;
        return cVar;
    }

    public static c b(int i, int i2) {
        c cVar = new c();
        cVar.a = i;
        cVar.b = i2;
        cVar.c = d.mouseMove;
        cVar.d = 1;
        return cVar;
    }

    public boolean a() {
        return this.c == d.mouseClick;
    }

    public boolean b() {
        return this.c == d.mouseMove;
    }
}