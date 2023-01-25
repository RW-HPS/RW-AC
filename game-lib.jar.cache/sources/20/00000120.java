package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p043k.AbstractC0941j;
import com.corrodinggames.rts.gameFramework.p043k.C0935d;
import com.corrodinggames.rts.gameFramework.p043k.C0936e;
import com.corrodinggames.rts.gameFramework.p043k.C0945n;

/* renamed from: com.corrodinggames.rts.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/k.class */
public class TestFastNodeQueue extends AbstractScriptTest {
    /* renamed from: a */
    public C0945n m5428a(int i) {
        C0945n c0945n = new C0945n();
        c0945n.m1256a((short) i, (short) 0);
        c0945n.m1258a(0, 0, 0);
        return c0945n;
    }

    /* renamed from: a */
    public void m5429a() {
        GameEngine.m5924e("== Testing FastNodeQueue ==");
        m5427a(new C0935d());
        GameEngine.m5924e("== Testing FastNodeQueue2 ==");
        m5427a(new C0936e());
    }

    /* renamed from: a */
    public void m5427a(AbstractC0941j abstractC0941j) {
        C0945n m5428a = m5428a(1);
        C0945n m5428a2 = m5428a(2);
        C0945n m5428a3 = m5428a(3);
        C0945n m5428a4 = m5428a(4);
        GameEngine.m5924e("sequential");
        abstractC0941j.mo1311b();
        abstractC0941j.mo1312a(m5428a);
        abstractC0941j.mo1312a(m5428a2);
        abstractC0941j.mo1312a(m5428a3);
        abstractC0941j.mo1312a(m5428a4);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a2);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a3);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a4);
        GameEngine.m5924e("reverse sequence");
        abstractC0941j.mo1311b();
        abstractC0941j.mo1312a(m5428a4);
        abstractC0941j.mo1312a(m5428a3);
        abstractC0941j.mo1312a(m5428a2);
        abstractC0941j.mo1312a(m5428a);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a2);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a3);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a4);
        GameEngine.m5924e("sequential with noise");
        abstractC0941j.mo1311b();
        abstractC0941j.mo1312a(m5428a);
        for (int i = 0; i < 1000; i++) {
            abstractC0941j.mo1312a(m5428a(100 + i));
        }
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a);
        abstractC0941j.mo1312a(m5428a2);
        abstractC0941j.mo1312a(m5428a3);
        for (int i2 = 0; i2 < 1000; i2++) {
            abstractC0941j.mo1312a(m5428a(100 + i2));
        }
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a2);
        abstractC0941j.mo1312a(m5428a4);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a3);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a4);
        GameEngine.m5924e("reverse sequence with noise");
        abstractC0941j.mo1311b();
        abstractC0941j.mo1312a(m5428a4);
        abstractC0941j.mo1312a(m5428a3);
        for (int i3 = 0; i3 < 1000; i3++) {
            abstractC0941j.mo1312a(m5428a(100 + i3));
        }
        abstractC0941j.mo1312a(m5428a2);
        for (int i4 = 0; i4 < 1000; i4++) {
            abstractC0941j.mo1312a(m5428a(100 + i4));
        }
        abstractC0941j.mo1312a(m5428a);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a2);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a3);
        C0085n.m5418a(abstractC0941j.mo1313a(), m5428a4);
    }
}