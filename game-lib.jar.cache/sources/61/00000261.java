package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ba.class */
public class ba {
    int a;
    String b;
    boolean c;
    public float d;
    public float e;
    public float i;
    public float j;
    public float k;
    public boolean l;
    public boolean p;
    public LogicBoolean q;
    public float w;
    public com.corrodinggames.rts.gameFramework.unitAction.e x;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] y;
    public boolean z;
    public float A;
    public com.corrodinggames.rts.gameFramework.unitAction.e B;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] C;
    public com.corrodinggames.rts.gameFramework.unitAction.e D;
    public boolean E;
    public boolean H;
    public int[] S;
    public float T;
    public float f = 2.0f;
    public float g = 0.0f;
    public boolean h = true;
    public float m = 1.0f;
    public boolean n = true;
    public boolean o = false;
    public float r = 1.0f;
    public float s = 1.0f;
    public float t = 0.0f;
    public float u = 3.0f;
    public float v = 0.3f;
    public boolean F = true;
    public boolean G = true;
    public boolean I = true;
    public boolean J = true;
    public float K = 7.0f;
    public int L = 3;
    public boolean M = true;
    public float N = 16.0f;
    public float O = 50.0f;
    public boolean P = false;
    public boolean Q = false;
    public float R = 0.0f;

    public void a(ba baVar) {
        this.d = baVar.d;
        this.e = baVar.e;
        this.i = baVar.i;
        this.j = baVar.j;
        this.k = baVar.k;
        this.f = baVar.f;
        this.g = baVar.g;
        this.h = baVar.h;
        this.l = baVar.l;
        this.m = baVar.m;
        this.n = baVar.n;
        this.o = baVar.o;
        this.t = baVar.t;
        this.p = baVar.p;
        this.r = baVar.r;
        this.s = baVar.s;
        this.u = baVar.u;
        this.w = baVar.w;
        this.x = baVar.x;
        this.y = baVar.y;
        this.A = baVar.A;
        this.z = baVar.z;
        this.B = baVar.B;
        this.C = baVar.C;
        this.D = baVar.D;
        this.E = baVar.E;
        this.F = baVar.F;
        this.G = baVar.G;
        this.v = baVar.v;
        this.H = baVar.H;
        this.I = baVar.I;
        this.J = baVar.J;
        this.K = baVar.K;
        this.L = baVar.L;
        this.M = baVar.M;
        this.N = baVar.N;
        this.O = baVar.O;
        this.P = baVar.P;
        this.Q = baVar.Q;
        this.R = baVar.R;
        this.T = baVar.T;
    }

    public static void a(ba baVar, l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, boolean z, ArrayList arrayList) {
        if (!z) {
            baVar.l = true;
            baVar.J = false;
        }
        int intValue = abVar.b(str, "copyFrom", (Integer) 0).intValue();
        if (intValue != 0) {
            if (intValue - 1 >= arrayList.size()) {
                throw new RuntimeException("copyFrom: Leg/Arm copy target not loaded yet: " + intValue);
            }
            baVar.a((ba) arrayList.get(intValue - 1));
        }
        baVar.d = abVar.i(str, "x");
        baVar.e = abVar.i(str, "y");
        baVar.b = str.replace("_", VariableScope.nullOrMissingString);
        baVar.c = z;
        Float a = abVar.a(str, "attach_x", (Float) null);
        if (a != null) {
            baVar.j = a.floatValue();
        }
        Float a2 = abVar.a(str, "attach_y", (Float) null);
        if (a2 != null) {
            baVar.k = a2.floatValue();
        }
        baVar.f = abVar.a(str, "liftingHeightOffset", Float.valueOf(baVar.f)).floatValue();
        baVar.g = abVar.a(str, "targetHeight", Float.valueOf(baVar.g)).floatValue();
        baVar.h = abVar.a(str, "targetHeightRelative", Boolean.valueOf(baVar.h)).booleanValue();
        baVar.i = abVar.a(str, "endDirOffset", Float.valueOf(0.0f)).floatValue();
        baVar.l = abVar.a(str, "lockMovement", Boolean.valueOf(baVar.l)).booleanValue();
        baVar.m = abVar.a(str, "estimatingPositionMultiplier", Float.valueOf(baVar.m)).floatValue();
        baVar.q = abVar.a(lVar, str, "hidden", baVar.q);
        baVar.p = baVar.q == LogicBoolean.trueBoolean;
        baVar.r = abVar.a(str, "alpha", Float.valueOf(baVar.r)).floatValue();
        Float a3 = abVar.a(str, "moveSpeed", (Float) null);
        if (a3 != null) {
            baVar.s = a3.floatValue();
        }
        baVar.t = abVar.b(str, "moveWarmUp", Float.valueOf(baVar.t)).floatValue();
        baVar.u = abVar.a(str, "rotateSpeed", Float.valueOf(baVar.u)).floatValue();
        Float a4 = abVar.a(str, "resetAngle", (Float) null);
        if (a4 != null) {
            baVar.w = a4.floatValue();
        }
        boolean booleanValue = abVar.a(str, "image_end_teamColors", (Boolean) false).booleanValue();
        com.corrodinggames.rts.gameFramework.unitAction.e a5 = lVar.a(abVar, str, "image_foot");
        if (a5 != null) {
            baVar.B = a5;
            if (booleanValue) {
                baVar.C = lVar.a(baVar.B, lVar.ac);
            } else {
                baVar.C = null;
            }
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a6 = lVar.a(abVar, str, "image_end");
        if (a6 != null) {
            baVar.B = a6;
            if (booleanValue) {
                baVar.C = lVar.a(baVar.B, lVar.ac);
            } else {
                baVar.C = null;
            }
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a7 = lVar.a(abVar, str, "image_foot_shadow");
        if (a7 != null) {
            baVar.D = a7;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a8 = lVar.a(abVar, str, "image_end_shadow");
        if (a8 != null) {
            baVar.D = a8;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a9 = lVar.a(abVar, str, "image_leg");
        if (a9 != null) {
            baVar.x = a9;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a10 = lVar.a(abVar, str, "image_middle");
        if (a10 != null) {
            baVar.x = a10;
        }
        boolean booleanValue2 = abVar.a(str, "image_middle_teamColors", (Boolean) false).booleanValue();
        if (baVar.x != null && booleanValue2) {
            baVar.y = lVar.a(baVar.x, lVar.ac);
        } else {
            baVar.y = null;
        }
        Float a11 = abVar.a(str, "heightSpeed", (Float) null);
        if (a11 != null) {
            baVar.v = a11.floatValue();
        }
        Boolean a12 = abVar.a(str, "draw_foot_on_top", (Boolean) null);
        if (a12 != null) {
            baVar.H = a12.booleanValue();
        }
        Boolean a13 = abVar.a(str, "dust_effect", (Boolean) null);
        if (a13 != null) {
            baVar.I = a13.booleanValue();
        }
        Boolean a14 = abVar.a(str, "drawLegWhenZoomedOut", (Boolean) null);
        if (a14 != null) {
            baVar.F = a14.booleanValue();
            baVar.E = true;
        }
        Boolean a15 = abVar.a(str, "drawFootWhenZoomedOut", (Boolean) null);
        if (a15 != null) {
            baVar.G = a15.booleanValue();
            baVar.E = true;
        }
        if (!baVar.E && !baVar.l && !baVar.P) {
            if (lVar.cW < 30) {
                baVar.F = false;
            }
            if (lVar.cW < 20) {
                baVar.G = false;
            }
        }
        Boolean a16 = abVar.a(str, "explodeOnDeath", (Boolean) null);
        if (a16 != null) {
            baVar.J = a16.booleanValue();
        }
        Float a17 = abVar.a(str, "holdDisMin", (Float) null);
        if (a17 != null) {
            baVar.K = a17.floatValue();
        }
        baVar.L = abVar.b(str, "holdDisMin_maxMovingLegs", Integer.valueOf(baVar.L)).intValue();
        baVar.M = abVar.a(str, "hold_moveOnlyIfFurthest", Boolean.valueOf(baVar.M)).booleanValue();
        baVar.n = abVar.a(str, "holdDisMin_checkNeighbours", Boolean.valueOf(baVar.n)).booleanValue();
        baVar.o = abVar.a(str, "favourOppositeSideNeighbours", Boolean.valueOf(baVar.o)).booleanValue();
        Float a18 = abVar.a(str, "holdDisMax", (Float) null);
        if (a18 != null) {
            baVar.N = a18.floatValue();
        }
        Float a19 = abVar.a(str, "hardLimit", (Float) null);
        if (a19 != null) {
            baVar.O = a19.floatValue();
        }
        baVar.P = abVar.a(str, "drawOverBody", Boolean.valueOf(baVar.P)).booleanValue();
        if (baVar.P) {
            lVar.ay = true;
        }
        baVar.Q = abVar.a(str, "drawUnderAllUnits", Boolean.valueOf(baVar.Q)).booleanValue();
        if (baVar.Q) {
            lVar.az = true;
        }
        if (baVar.Q && baVar.P) {
            throw new RuntimeException("Both drawUnderAllUnits and drawOverBody can not be set true at the same time in leg/arm");
        }
        baVar.R = abVar.a(str, "drawDirOffset", Float.valueOf(baVar.R)).floatValue();
        baVar.T = abVar.a(str, "spinRate", Float.valueOf(baVar.T)).floatValue();
    }
}