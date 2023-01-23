package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/d.class */
public class d extends l {

    /* renamed from: a  reason: collision with root package name */
    int f77a;

    public void a() {
        GameEngine.m328e("Running unit tests - maths (v3)");
        com.corrodinggames.rts.gameFramework.f.i(100.0f, 100.0f);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, 100.0f);
        com.corrodinggames.rts.gameFramework.f.i(100.0f, 0.0f);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, -100.0f);
        com.corrodinggames.rts.gameFramework.f.i(-100.0f, 0.0f);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, 0.0f);
        GameEngine.m328e("fast_atan2 - NaN");
        com.corrodinggames.rts.gameFramework.f.i(Float.NaN, 0.0f);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, Float.NaN);
        com.corrodinggames.rts.gameFramework.f.i(Float.NaN, Float.NaN);
        GameEngine.m328e("fast_atan2 - Max");
        com.corrodinggames.rts.gameFramework.f.i(Float.MAX_VALUE, 0.0f);
        com.corrodinggames.rts.gameFramework.f.i(Float.MIN_VALUE, 0.0f);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, Float.MAX_VALUE);
        com.corrodinggames.rts.gameFramework.f.i(0.0f, Float.MIN_VALUE);
        GameEngine.m328e("fast_atan2 - NaN+Max");
        com.corrodinggames.rts.gameFramework.f.i(Float.MAX_VALUE, Float.NaN);
        com.corrodinggames.rts.gameFramework.f.i(Float.MIN_VALUE, Float.MAX_VALUE);
        com.corrodinggames.rts.gameFramework.f.i(Float.MAX_VALUE, Float.MIN_VALUE);
        com.corrodinggames.rts.gameFramework.f.i(900000.0f, 900000.0f);
        com.corrodinggames.rts.gameFramework.f.i(3.4028236E33f, 3.4028236E33f);
        com.corrodinggames.rts.gameFramework.f.i(3.4028236E34f, 3.4028236E34f);
        com.corrodinggames.rts.gameFramework.f.i(3.4028234E35f, 3.4028234E35f);
        com.corrodinggames.rts.gameFramework.f.i(3.4028236E36f, 3.4028236E36f);
        com.corrodinggames.rts.gameFramework.f.i(3.4028235E37f, 3.4028235E37f);
        com.corrodinggames.rts.gameFramework.f.i(Float.MAX_VALUE, Float.MAX_VALUE);
        GameEngine.m328e("fast_atan2 - max,max");
        com.corrodinggames.rts.gameFramework.f.i(Float.MAX_VALUE, Float.MAX_VALUE);
        com.corrodinggames.rts.gameFramework.f.i(Float.MIN_VALUE, Float.MIN_VALUE);
        GameEngine.m328e("cos/sin");
        n.a(com.corrodinggames.rts.gameFramework.f.k(0.0f), 1.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(360.0f), 1.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(10800.0f), 1.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(45.0f), 0.70710677f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(90.0f), 0.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(450.0f), 0.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.k(10890.0f), 0.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.j(0.0f), 0.0f);
        n.a(com.corrodinggames.rts.gameFramework.f.j(90.0f), 1.0f);
        com.corrodinggames.rts.gameFramework.f.k(-999999.0f);
        com.corrodinggames.rts.gameFramework.f.k(999999.0f);
        com.corrodinggames.rts.gameFramework.f.k(Float.MAX_VALUE);
        com.corrodinggames.rts.gameFramework.f.k(Float.MIN_VALUE);
        com.corrodinggames.rts.gameFramework.f.j(Float.MAX_VALUE);
        com.corrodinggames.rts.gameFramework.f.j(Float.MIN_VALUE);
        GameEngine.m328e("diff sin(0):  " + String.format("%.12f", Float.valueOf(com.corrodinggames.rts.gameFramework.f.j(0.0f) - ((float) StrictMath.sin(0.0d)))));
        GameEngine.m328e("diff sin(45): " + String.format("%.12f", Float.valueOf(com.corrodinggames.rts.gameFramework.f.j(45.0f) - ((float) StrictMath.sin(0.7853981633974483d)))));
        GameEngine.m328e("diff sin(90): " + String.format("%.12f", Float.valueOf(com.corrodinggames.rts.gameFramework.f.j(90.0f) - ((float) StrictMath.sin(1.5707963267948966d)))));
        GameEngine.m328e("diff sin(180):" + String.format("%.12f", Float.valueOf(com.corrodinggames.rts.gameFramework.f.j(180.0f) - ((float) StrictMath.sin(3.141592653589793d)))));
        GameEngine.m328e("diff sin(360):" + String.format("%.12f", Float.valueOf(com.corrodinggames.rts.gameFramework.f.j(360.0f) - ((float) StrictMath.sin(6.283185307179586d)))));
        GameEngine.m328e("Testing squareroot");
        for (int i = 0; i < 1005; i++) {
            n.a(com.corrodinggames.rts.gameFramework.f.a(i), com.corrodinggames.rts.gameFramework.f.d(com.corrodinggames.rts.gameFramework.f.a(i)));
        }
        int i2 = 0;
        GameEngine.m328e("=== cos/sin tests (runs:5)");
        Long valueOf = Long.valueOf(br.a());
        for (int i3 = 0; i3 < 5; i3++) {
            for (int i4 = 0; i4 < 2000; i4++) {
                if (com.corrodinggames.rts.gameFramework.f.k(i4) == 0.0f) {
                    i2++;
                }
                if (com.corrodinggames.rts.gameFramework.f.j(i4) == 0.0f) {
                    i2++;
                }
            }
        }
        double a2 = br.a(valueOf.longValue(), Long.valueOf(br.a()).longValue());
        this.f77a += i2;
        GameEngine.m328e("Took: " + a2);
    }
}