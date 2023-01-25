package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/m.class */
public class C0460m {

    /* renamed from: a */
    public boolean f3344a;

    /* renamed from: b */
    public float f3345b;

    /* renamed from: c */
    public int f3346c;

    /* renamed from: d */
    public int f3347d;

    /* renamed from: e */
    public float f3348e;

    /* renamed from: a */
    public static C0460m m3483a(C0458l c0458l, C1107ab c1107ab, String str, String str2, boolean z) {
        C0460m c0460m = new C0460m();
        c0460m.f3344a = c1107ab.m685a(str, str2 + "direction_useMainTurret", (Boolean) false).booleanValue();
        c0460m.f3345b = c1107ab.m683a(str, str2 + "direction_units", Float.valueOf(0.0f)).floatValue();
        c0460m.f3346c = c1107ab.m667b(str, str2 + "direction_strideX", (Integer) (-1)).intValue();
        c0460m.f3347d = c1107ab.m667b(str, str2 + "direction_strideY", (Integer) (-1)).intValue();
        c0460m.f3348e = c1107ab.m683a(str, str2 + "direction_starting", Float.valueOf(0.0f)).floatValue();
        if (c0460m.f3345b == 0.0f) {
            return null;
        }
        return c0460m;
    }
}