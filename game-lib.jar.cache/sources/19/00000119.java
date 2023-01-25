package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class C0075d extends AbstractScriptTest {

    /* renamed from: a */
    int f394a;

    /* renamed from: a */
    public void m5438a() {
        GameEngine.m5924e("Running unit tests - maths (v3)");
        C0773f.m2246i(100.0f, 100.0f);
        C0773f.m2246i(0.0f, 100.0f);
        C0773f.m2246i(100.0f, 0.0f);
        C0773f.m2246i(0.0f, -100.0f);
        C0773f.m2246i(-100.0f, 0.0f);
        C0773f.m2246i(0.0f, 0.0f);
        GameEngine.m5924e("fast_atan2 - NaN");
        C0773f.m2246i(Float.NaN, 0.0f);
        C0773f.m2246i(0.0f, Float.NaN);
        C0773f.m2246i(Float.NaN, Float.NaN);
        GameEngine.m5924e("fast_atan2 - Max");
        C0773f.m2246i(Float.MAX_VALUE, 0.0f);
        C0773f.m2246i(Float.MIN_VALUE, 0.0f);
        C0773f.m2246i(0.0f, Float.MAX_VALUE);
        C0773f.m2246i(0.0f, Float.MIN_VALUE);
        GameEngine.m5924e("fast_atan2 - NaN+Max");
        C0773f.m2246i(Float.MAX_VALUE, Float.NaN);
        C0773f.m2246i(Float.MIN_VALUE, Float.MAX_VALUE);
        C0773f.m2246i(Float.MAX_VALUE, Float.MIN_VALUE);
        C0773f.m2246i(900000.0f, 900000.0f);
        C0773f.m2246i(3.4028236E33f, 3.4028236E33f);
        C0773f.m2246i(3.4028236E34f, 3.4028236E34f);
        C0773f.m2246i(3.4028234E35f, 3.4028234E35f);
        C0773f.m2246i(3.4028236E36f, 3.4028236E36f);
        C0773f.m2246i(3.4028235E37f, 3.4028235E37f);
        C0773f.m2246i(Float.MAX_VALUE, Float.MAX_VALUE);
        GameEngine.m5924e("fast_atan2 - max,max");
        C0773f.m2246i(Float.MAX_VALUE, Float.MAX_VALUE);
        C0773f.m2246i(Float.MIN_VALUE, Float.MIN_VALUE);
        GameEngine.m5924e("cos/sin");
        C0085n.m5420a(C0773f.m2241k(0.0f), 1.0f);
        C0085n.m5420a(C0773f.m2241k(360.0f), 1.0f);
        C0085n.m5420a(C0773f.m2241k(10800.0f), 1.0f);
        C0085n.m5420a(C0773f.m2241k(45.0f), 0.70710677f);
        C0085n.m5420a(C0773f.m2241k(90.0f), 0.0f);
        C0085n.m5420a(C0773f.m2241k(450.0f), 0.0f);
        C0085n.m5420a(C0773f.m2241k(10890.0f), 0.0f);
        C0085n.m5420a(C0773f.m2244j(0.0f), 0.0f);
        C0085n.m5420a(C0773f.m2244j(90.0f), 1.0f);
        C0773f.m2241k(-999999.0f);
        C0773f.m2241k(999999.0f);
        C0773f.m2241k(Float.MAX_VALUE);
        C0773f.m2241k(Float.MIN_VALUE);
        C0773f.m2244j(Float.MAX_VALUE);
        C0773f.m2244j(Float.MIN_VALUE);
        GameEngine.m5924e("diff sin(0):  " + String.format("%.12f", Float.valueOf(C0773f.m2244j(0.0f) - ((float) StrictMath.sin(0.0d)))));
        GameEngine.m5924e("diff sin(45): " + String.format("%.12f", Float.valueOf(C0773f.m2244j(45.0f) - ((float) StrictMath.sin(0.7853981633974483d)))));
        GameEngine.m5924e("diff sin(90): " + String.format("%.12f", Float.valueOf(C0773f.m2244j(90.0f) - ((float) StrictMath.sin(1.5707963267948966d)))));
        GameEngine.m5924e("diff sin(180):" + String.format("%.12f", Float.valueOf(C0773f.m2244j(180.0f) - ((float) StrictMath.sin(3.141592653589793d)))));
        GameEngine.m5924e("diff sin(360):" + String.format("%.12f", Float.valueOf(C0773f.m2244j(360.0f) - ((float) StrictMath.sin(6.283185307179586d)))));
        GameEngine.m5924e("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            C0085n.m5420a(C0773f.m2345a(i), C0773f.m2275d(C0773f.m2353a(i)));
        }
        int i2 = 0;
        GameEngine.m5924e("=== cos/sin tests (runs:5)");
        Long valueOf = Long.valueOf(C0742br.m2574a());
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 2000; i4++) {
                if (C0773f.m2241k(i4) == 0.0f) {
                    i2++;
                }
                if (C0773f.m2244j(i4) == 0.0f) {
                    i2++;
                }
            }
        }
        double m2571a = C0742br.m2571a(valueOf.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
        this.f394a += i2;
        GameEngine.m5924e("Took: " + m2571a);
    }
}