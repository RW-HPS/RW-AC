package com.corrodinggames.rts.gameFramework;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/br.class */
public final class br {

    /* renamed from: a  reason: collision with root package name */
    GameEngine f458a;
    public static int c = 40;
    public int b = 0;
    public int d = 0;
    bu e = new bu(this);
    Paint f = new Paint();
    Rect g = new Rect();
    int h = -1;

    public br(GameEngine gameEngine) {
        this.f458a = gameEngine;
    }

    public static final long a() {
        return System.nanoTime();
    }

    public static final float a(long j) {
        return ((float) (System.nanoTime() - j)) / 1000000.0f;
    }

    public static final double a(long j, long j2) {
        return (j2 - j) / 1000000.0d;
    }

    public static final void a(String str, long j) {
        GameEngine.m328e(str + VariableScope.nullOrMissingString + a(a(j)));
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