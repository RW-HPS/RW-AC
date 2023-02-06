package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class d extends AbstractScriptTest {
    int a;

    public void a() {
        GameEngine.m5e("Running unit tests - maths (v3)");
        f.i(100.0f, 100.0f);
        f.i(0.0f, 100.0f);
        f.i(100.0f, 0.0f);
        f.i(0.0f, -100.0f);
        f.i(-100.0f, 0.0f);
        f.i(0.0f, 0.0f);
        GameEngine.m5e("fast_atan2 - NaN");
        f.i(Float.NaN, 0.0f);
        f.i(0.0f, Float.NaN);
        f.i(Float.NaN, Float.NaN);
        GameEngine.m5e("fast_atan2 - Max");
        f.i(Float.MAX_VALUE, 0.0f);
        f.i(Float.MIN_VALUE, 0.0f);
        f.i(0.0f, Float.MAX_VALUE);
        f.i(0.0f, Float.MIN_VALUE);
        GameEngine.m5e("fast_atan2 - NaN+Max");
        f.i(Float.MAX_VALUE, Float.NaN);
        f.i(Float.MIN_VALUE, Float.MAX_VALUE);
        f.i(Float.MAX_VALUE, Float.MIN_VALUE);
        f.i(900000.0f, 900000.0f);
        f.i(3.4028236E33f, 3.4028236E33f);
        f.i(3.4028236E34f, 3.4028236E34f);
        f.i(3.4028234E35f, 3.4028234E35f);
        f.i(3.4028236E36f, 3.4028236E36f);
        f.i(3.4028235E37f, 3.4028235E37f);
        f.i(Float.MAX_VALUE, Float.MAX_VALUE);
        GameEngine.m5e("fast_atan2 - max,max");
        f.i(Float.MAX_VALUE, Float.MAX_VALUE);
        f.i(Float.MIN_VALUE, Float.MIN_VALUE);
        GameEngine.m5e("cos/sin");
        n.a(f.k(0.0f), 1.0f);
        n.a(f.k(360.0f), 1.0f);
        n.a(f.k(10800.0f), 1.0f);
        n.a(f.k(45.0f), 0.70710677f);
        n.a(f.k(90.0f), 0.0f);
        n.a(f.k(450.0f), 0.0f);
        n.a(f.k(10890.0f), 0.0f);
        n.a(f.j(0.0f), 0.0f);
        n.a(f.j(90.0f), 1.0f);
        f.k(-999999.0f);
        f.k(999999.0f);
        f.k(Float.MAX_VALUE);
        f.k(Float.MIN_VALUE);
        f.j(Float.MAX_VALUE);
        f.j(Float.MIN_VALUE);
        GameEngine.m5e("diff sin(0):  " + String.format("%.12f", Float.valueOf(f.j(0.0f) - ((float) StrictMath.sin(0.0d)))));
        GameEngine.m5e("diff sin(45): " + String.format("%.12f", Float.valueOf(f.j(45.0f) - ((float) StrictMath.sin(0.7853981633974483d)))));
        GameEngine.m5e("diff sin(90): " + String.format("%.12f", Float.valueOf(f.j(90.0f) - ((float) StrictMath.sin(1.5707963267948966d)))));
        GameEngine.m5e("diff sin(180):" + String.format("%.12f", Float.valueOf(f.j(180.0f) - ((float) StrictMath.sin(3.141592653589793d)))));
        GameEngine.m5e("diff sin(360):" + String.format("%.12f", Float.valueOf(f.j(360.0f) - ((float) StrictMath.sin(6.283185307179586d)))));
        GameEngine.m5e("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            n.a(f.a(i), f.d(f.a(i)));
        }
        int i2 = 0;
        GameEngine.m5e("=== cos/sin tests (runs:5)");
        Long valueOf = Long.valueOf(Unit.loadAllUnitsTook());
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 2000; i4++) {
                if (f.k(i4) == 0.0f) {
                    i2++;
                }
                if (f.j(i4) == 0.0f) {
                    i2++;
                }
            }
        }
        double a = Unit.a(valueOf.longValue(), Long.valueOf(Unit.loadAllUnitsTook()).longValue());
        this.a += i2;
        GameEngine.m5e("Took: " + a);
    }
}