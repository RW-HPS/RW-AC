package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.a.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/n.class */
public class n {
    public void a() {
        GameEngine.m5e("Running unit tests");
        new c().a();
        new d().a();
        new TestFastNodeQueue().a();
        new TestRegex().a();
        new a().a();
        new TestMiscPerformance().a();
        new TestUnitReference().a();
    }

    public static void a(boolean z) {
        if (!z) {
            throw new RuntimeException("Asset failed");
        }
    }

    public static void b(boolean z) {
        if (z) {
            throw new RuntimeException("Asset failed");
        }
    }

    public static void a(int i, int i2) {
        if (i != i2) {
            throw new RuntimeException("Asset failed (int):" + i + "!=" + i2);
        }
    }

    public static void a(float f, float f2) {
        if (f.c(f - f2) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + f + "!=" + f2);
        }
    }

    public static void a(String str, String str2) {
        if (!str.equals(str2)) {
            throw new RuntimeException("Asset failed:" + str + "!=" + str2);
        }
    }

    public static void b(String str, String str2) {
        GameEngine.m5e("assertEqualDebug:'" + str + "' vs '" + str2 + "'");
        a(str, str2);
    }

    public static void c(String str, String str2) {
        a(Float.valueOf(Float.parseFloat(str)).floatValue(), Float.valueOf(Float.parseFloat(str2)).floatValue());
    }

    public static void a(Object obj, Object obj2) {
        if (obj != obj2) {
            throw new RuntimeException("Asset failed:" + obj + "!=" + obj2);
        }
    }
}