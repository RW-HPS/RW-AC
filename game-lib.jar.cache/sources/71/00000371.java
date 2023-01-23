package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/m.class */
public class m {

    /* renamed from: a  reason: collision with root package name */
    public boolean f314a;
    public float b;
    public int c;
    public int d;
    public float e;

    public static m a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, boolean z) {
        m mVar = new m();
        mVar.f314a = abVar.a(str, str2 + "direction_useMainTurret", (Boolean) false).booleanValue();
        mVar.b = abVar.a(str, str2 + "direction_units", Float.valueOf(0.0f)).floatValue();
        mVar.c = abVar.b(str, str2 + "direction_strideX", (Integer) (-1)).intValue();
        mVar.d = abVar.b(str, str2 + "direction_strideY", (Integer) (-1)).intValue();
        mVar.e = abVar.a(str, str2 + "direction_starting", Float.valueOf(0.0f)).floatValue();
        if (mVar.b == 0.0f) {
            return null;
        }
        return mVar;
    }
}