package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.path.d;
import com.corrodinggames.rts.gameFramework.path.e;
import com.corrodinggames.rts.gameFramework.path.j;
import com.corrodinggames.rts.gameFramework.path.n;

/* renamed from: com.corrodinggames.rts.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/k.class */
public class TestFastNodeQueue extends AbstractScriptTest {
    public n a(int i) {
        n nVar = new n();
        nVar.a((short) i, (short) 0);
        nVar.a(0, 0, 0);
        return nVar;
    }

    public void a() {
        GameEngine.m5e("== Testing FastNodeQueue ==");
        a(new d());
        GameEngine.m5e("== Testing FastNodeQueue2 ==");
        a(new e());
    }

    public void a(j jVar) {
        n a = a(1);
        n a2 = a(2);
        n a3 = a(3);
        n a4 = a(4);
        GameEngine.m5e("sequential");
        jVar.b();
        jVar.a(a);
        jVar.a(a2);
        jVar.a(a3);
        jVar.a(a4);
        n.a(jVar.a(), a);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        GameEngine.m5e("reverse sequence");
        jVar.b();
        jVar.a(a4);
        jVar.a(a3);
        jVar.a(a2);
        jVar.a(a);
        n.a(jVar.a(), a);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        GameEngine.m5e("sequential with noise");
        jVar.b();
        jVar.a(a);
        for (int i = 0; i < 1000; i++) {
            jVar.a(a(100 + i));
        }
        n.a(jVar.a(), a);
        jVar.a(a2);
        jVar.a(a3);
        for (int i2 = 0; i2 < 1000; i2++) {
            jVar.a(a(100 + i2));
        }
        n.a(jVar.a(), a2);
        jVar.a(a4);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
        GameEngine.m5e("reverse sequence with noise");
        jVar.b();
        jVar.a(a4);
        jVar.a(a3);
        for (int i3 = 0; i3 < 1000; i3++) {
            jVar.a(a(100 + i3));
        }
        jVar.a(a2);
        for (int i4 = 0; i4 < 1000; i4++) {
            jVar.a(a(100 + i4));
        }
        jVar.a(a);
        n.a(jVar.a(), a);
        n.a(jVar.a(), a2);
        n.a(jVar.a(), a3);
        n.a(jVar.a(), a4);
    }
}