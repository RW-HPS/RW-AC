package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.br */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/br.class */
public final class Unit {
    GameEngine a;
    public static int c = 40;
    public int b = 0;
    public int d = 0;
    bu e = new bu(this);
    Paint f = new Paint();
    Rect g = new Rect();
    int h = -1;

    public Unit(GameEngine gameEngine) {
        this.a = gameEngine;
    }

    /* renamed from: a */
    public static final long loadAllUnitsTook() {
        return System.nanoTime();
    }

    public static final float a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    public static final double a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    public static final void a(String str, long j) {
        GameEngine.m5e(str + VariableScope.nullOrMissingString + a(a(j)));
    }

    public final void a(bs bsVar) {
    }

    public final void b(bs bsVar) {
    }

    public static final String a(double d) {
        return VariableScope.nullOrMissingString + f.a(d, 3) + "ms";
    }

    public static final String b(double d) {
        return VariableScope.nullOrMissingString + (d / 1000000.0d) + "ms";
    }

    public final void b() {
    }

    public final void c() {
    }

    public final void a(boolean z, boolean z2) {
    }
}