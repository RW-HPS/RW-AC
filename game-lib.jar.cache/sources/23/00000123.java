package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/n.class */
public class C0085n {
    /* renamed from: a */
    public void m5421a() {
        GameEngine.m5924e("Running unit tests");
        new C0074c().m5453a();
        new C0075d().m5438a();
        new TestFastNodeQueue().m5429a();
        new C0076e().m5437a();
        new C0072a().m5456a();
        new TestMiscPerformance().m5432a();
        new TestUnitReference().m5426a();
    }

    /* renamed from: a */
    public static void m5416a(boolean z) {
        if (!z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: b */
    public static void m5414b(boolean z) {
        if (z) {
            throw new RuntimeException("Asset failed");
        }
    }

    /* renamed from: a */
    public static void m5419a(int i, int i2) {
        if (i != i2) {
            throw new RuntimeException("Asset failed (int):" + i + "!=" + i2);
        }
    }

    /* renamed from: a */
    public static void m5420a(float f, float f2) {
        if (C0773f.m2286c(f - f2) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f + "!=" + f2);
        }
    }

    /* renamed from: a */
    public static void m5417a(String str, String str2) {
        if (!str.equals(str2)) {
            throw new RuntimeException("Asset failed:" + str + "!=" + str2);
        }
    }

    /* renamed from: b */
    public static void m5415b(String str, String str2) {
        GameEngine.m5924e("assertEqualDebug:'" + str + "' vs '" + str2 + "'");
        m5417a(str, str2);
    }

    /* renamed from: c */
    public static void m5413c(String str, String str2) {
        m5420a(Float.valueOf(Float.parseFloat(str)).floatValue(), Float.valueOf(Float.parseFloat(str2)).floatValue());
    }

    /* renamed from: a */
    public static void m5418a(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new RuntimeException("Asset failed:" + obj + "!=" + obj2);
        }
    }
}