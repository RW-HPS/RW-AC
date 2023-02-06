package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a.class */
public class CollisionEngine {
    ArrayList n = new ArrayList();
    public b a = a((byte) 1);
    public b b = a((byte) 2);
    public b c = a((byte) 3);
    public b d = a((byte) 4);
    public b e = a((byte) 10);
    public b f = a((byte) 11);
    public b g = a((byte) 13);
    public b h = a((byte) 21);
    public b i = a((byte) 35);
    public b j = a((byte) 40);
    public b k = a((byte) 45);
    public b l = a((byte) 52);
    public b m = a((byte) 60);

    public CollisionEngine() {
        b bVar = this.a;
        bVar.a(bVar);
        bVar.a(a((byte) 3));
        bVar.a(a((byte) 4));
        bVar.a(a((byte) 10));
        bVar.a(a((byte) 11));
        bVar.a(a((byte) 13));
        bVar.a(a((byte) 21));
        this.k.a(a((byte) 52));
        b bVar2 = this.m;
        bVar2.a(bVar2);
        bVar2.a(a((byte) 3));
        bVar2.a(a((byte) 4));
        bVar2.a(a((byte) 10));
        bVar2.a(a((byte) 11));
        bVar2.a(a((byte) 13));
        bVar2.a(a((byte) 21));
        b a = a((byte) 10);
        a.a(a((byte) 3));
        a.a(a((byte) 4));
        a.a(a((byte) 10));
        a.a(a((byte) 13));
        a.a(a((byte) 40));
        b a2 = a((byte) 11);
        a2.a(a((byte) 3));
        a2.a(a((byte) 10));
        a2.a(a((byte) 13));
        a2.a(a((byte) 40));
        b a3 = a((byte) 3);
        a3.a(a((byte) 3));
        a3.a(a((byte) 4));
        a3.a(a((byte) 10));
        a3.a(a((byte) 13));
        b a4 = a((byte) 4);
        a4.a(a((byte) 3));
        a4.a(a((byte) 4));
        a4.a(a((byte) 10));
        a4.a(a((byte) 13));
        b a5 = a((byte) 13);
        a5.a(a((byte) 3));
        a5.a(a((byte) 4));
        a5.a(a((byte) 10));
        a5.a(a((byte) 13));
        b a6 = a((byte) 21);
        a6.a(a((byte) 3));
        a6.a(a((byte) 4));
        a6.a(a((byte) 10));
        a6.a(a((byte) 13));
        b bVar3 = this.i;
        bVar3.a(a((byte) 10));
        bVar3.a(a((byte) 13));
    }

    public b a(byte b) {
        Iterator it = this.n.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a == b) {
                return bVar;
            }
        }
        b bVar2 = new b();
        bVar2.a = b;
        this.n.add(bVar2);
        return bVar2;
    }
}