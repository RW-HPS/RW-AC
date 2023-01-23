package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/k.class */
public class k extends l {
    public com.corrodinggames.rts.gameFramework.k.n a(int i) {
        com.corrodinggames.rts.gameFramework.k.n nVar = new com.corrodinggames.rts.gameFramework.k.n();
        nVar.a((short) i, (short) 0);
        nVar.a(0, 0, 0);
        return nVar;
    }

    public void a() {
        GameEngine.m328e("== Testing FastNodeQueue ==");
        a(new com.corrodinggames.rts.gameFramework.k.d());
        GameEngine.m328e("== Testing FastNodeQueue2 ==");
        a(new com.corrodinggames.rts.gameFramework.k.e());
    }

    public void a(com.corrodinggames.rts.gameFramework.k.j jVar) {
        com.corrodinggames.rts.gameFramework.k.n a2 = a(1);
        com.corrodinggames.rts.gameFramework.k.n a3 = a(2);
        com.corrodinggames.rts.gameFramework.k.n a4 = a(3);
        com.corrodinggames.rts.gameFramework.k.n a5 = a(4);
        GameEngine.m328e("sequential");
        jVar.b();
        jVar.a(a2);
        jVar.a(a3);
        jVar.a(a4);
        jVar.a(a5);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        n.a(jVar.a(), a5);
        GameEngine.m328e("reverse sequence");
        jVar.b();
        jVar.a(a5);
        jVar.a(a4);
        jVar.a(a3);
        jVar.a(a2);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        n.a(jVar.a(), a5);
        GameEngine.m328e("sequential with noise");
        jVar.b();
        jVar.a(a2);
        for (int i = 0; i < 1000; i++) {
            jVar.a(a(100 + i));
        }
        n.a(jVar.a(), a2);
        jVar.a(a3);
        jVar.a(a4);
        for (int i2 = 0; i2 < 1000; i2++) {
            jVar.a(a(100 + i2));
        }
        n.a(jVar.a(), a3);
        jVar.a(a5);
        n.a(jVar.a(), a4);
        n.a(jVar.a(), a5);
        GameEngine.m328e("reverse sequence with noise");
        jVar.b();
        jVar.a(a5);
        jVar.a(a4);
        for (int i3 = 0; i3 < 1000; i3++) {
            jVar.a(a(100 + i3));
        }
        jVar.a(a3);
        for (int i4 = 0; i4 < 1000; i4++) {
            jVar.a(a(100 + i4));
        }
        jVar.a(a2);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        n.a(jVar.a(), a5);
    }
}