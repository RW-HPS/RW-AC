package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bn.class */
public class bn {
    public String a;
    public String b;
    public boolean c;
    public boolean d;
    public int e;
    public float f;
    public float g;
    public float h;
    public float j;
    public float k;
    public boolean l;
    public float t;
    public com.corrodinggames.rts.game.units.custom.d.b v;
    public bn y;
    public bn z;
    public boolean A;
    public LogicBoolean C;
    public bl D;
    public z E;
    public z F;
    public Integer G;
    public boolean H;
    public boolean I;
    public LogicBoolean J;
    public LogicBoolean K;
    public LogicBoolean L;
    public LogicBoolean M;
    public LogicBoolean N;
    public h O;
    public h P;
    public LogicBoolean T;
    public Float U;
    public float X;
    public float Y;
    public float aa;
    public Boolean ac;
    public float ad;
    public float ae;
    public float af;
    public Float aj;
    public h ak;
    public bn ao;
    public float au;
    public LogicBoolean av;
    public float ax;
    public boolean ay;
    public int az;
    public o aA;
    public float aB;
    public u aC;
    public com.corrodinggames.rts.gameFramework.unitAction.e aD;
    public com.corrodinggames.rts.gameFramework.unitAction.e[] aE;
    public com.corrodinggames.rts.gameFramework.unitAction.e aF;
    public float aG;
    public float aH;
    public int aI;
    public h aJ;
    public float i = 1.0f;
    public float m = -1.0f;
    public float n = 0.0f;
    public float o = 4.0f;
    public float p = 0.0f;
    public float q = 4.0f;
    public float r = 7.0f;
    public boolean s = false;
    public float u = 0.0f;
    public int w = -1;
    public int x = -1;
    public boolean B = true;
    public float Q = 5.0f;
    public int R = 0;
    public int S = -1;
    public float V = -1.0f;
    public float W = -1.0f;
    public float Z = 0.0f;
    public float ab = 99999.0f;
    public float ag = -1.0f;
    public float ah = -1.0f;
    public float ai = -1.0f;
    public float al = -1.0f;
    public float am = 2000.0f;
    public float an = -999.0f;
    public int ap = -1;
    public boolean aq = true;
    public float ar = 0.0f;
    public float as = 0.0f;
    public float at = 10.0f;
    public float aw = -1.0f;

    public int a(j jVar) {
        if (this.S >= 0 && this.T.read(jVar)) {
            return this.S;
        }
        return this.R;
    }

    public void a(bn bnVar) {
        this.f = bnVar.f;
        this.g = bnVar.g;
        this.h = bnVar.h;
        this.j = bnVar.j;
        this.k = bnVar.k;
        this.l = bnVar.l;
        this.m = bnVar.m;
        this.n = bnVar.n;
        this.o = bnVar.o;
        this.u = bnVar.u;
        this.v = bnVar.v;
        this.aI = bnVar.aI;
        this.aJ = bnVar.aJ;
        this.s = bnVar.s;
        this.t = bnVar.t;
        this.p = bnVar.p;
        this.q = bnVar.q;
        this.r = bnVar.r;
        this.y = bnVar.y;
        this.A = bnVar.A;
        this.B = bnVar.B;
        this.C = bnVar.C;
        this.D = bnVar.D;
        this.E = bnVar.E;
        this.G = bnVar.G;
        this.F = bnVar.F;
        this.J = bnVar.J;
        this.K = bnVar.K;
        this.L = bnVar.L;
        this.M = bnVar.M;
        this.N = bnVar.N;
        this.O = bnVar.O;
        this.P = bnVar.P;
        this.Q = bnVar.Q;
        this.aD = bnVar.aD;
        this.aE = bnVar.aE;
        this.aF = bnVar.aF;
        this.R = bnVar.R;
        this.S = bnVar.S;
        this.T = bnVar.T;
        this.U = bnVar.U;
        this.V = bnVar.V;
        this.W = bnVar.W;
        this.X = bnVar.X;
        this.Y = bnVar.Y;
        this.Z = bnVar.Z;
        this.aa = bnVar.aa;
        this.ao = bnVar.ao;
        this.aq = bnVar.aq;
        this.as = bnVar.as;
        this.at = bnVar.at;
        this.au = bnVar.au;
        this.av = bnVar.av;
        this.aw = bnVar.aw;
        this.ax = bnVar.ax;
        this.ab = bnVar.ab;
        this.ag = bnVar.ag;
        this.ai = bnVar.ai;
        this.af = bnVar.af;
        this.ay = bnVar.ay;
        this.az = bnVar.az;
        this.ak = bnVar.ak;
        this.al = bnVar.al;
        this.am = bnVar.am;
        this.an = bnVar.an;
        this.aA = bnVar.aA;
        this.aG = bnVar.aG;
        this.aH = bnVar.aH;
    }

    public static void a(bn bnVar, l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str) {
        bnVar.c = true;
        if (bnVar.d) {
            return;
        }
        Float valueOf = Float.valueOf(abVar.i(str, "x"));
        Float valueOf2 = Float.valueOf(abVar.i(str, "y"));
        String b = abVar.b(str, "copyFrom", (String) null);
        if (b != null) {
            bn e = lVar.e(b);
            if (e == null) {
                throw new RuntimeException("[" + str + "] Could not find copy turret target with name:" + b);
            }
            if (e.c && !e.d) {
                throw new RuntimeException("[" + str + "] Infinite loop detected with turret copies:" + b);
            }
            if (!e.d) {
                a(e, lVar, abVar, e.b);
            }
            bnVar.a(e);
        } else {
            bnVar.af = lVar.ez;
            bnVar.X = lVar.ea;
        }
        bnVar.f = valueOf.floatValue();
        bnVar.g = valueOf2.floatValue();
        bnVar.h = abVar.a(str, "height", Float.valueOf(0.0f)).floatValue();
        bnVar.i = abVar.a(str, "yAxisScaling", Float.valueOf(1.0f)).floatValue();
        String b2 = abVar.b(str, "linkDelayWithTurret", (String) null);
        if (b2 != null) {
            bnVar.ao = lVar.e(b2);
            if (bnVar.ao == null) {
                throw new RuntimeException("[" + str + "] Could not find 'linkDelayWithTurret' turret target with name:" + b2);
            }
            bnVar.m = 9000.0f;
        }
        Float b3 = abVar.b(str, "delay", (Float) null);
        if (b3 != null) {
            bnVar.m = b3.floatValue();
        }
        if (bnVar.m == -1.0f) {
            bnVar.m = lVar.dM;
        }
        Float b4 = abVar.b(str, "warmup", (Float) null);
        if (b4 != null) {
            bnVar.n = b4.floatValue();
        }
        Float a = abVar.a(str, "warmupCallDownRate", (Float) null);
        if (a != null) {
            bnVar.o = a.floatValue();
        }
        Boolean a2 = abVar.a(str, "warmupNoReset", (Boolean) null);
        if (a2 != null) {
            bnVar.s = a2.booleanValue();
        }
        Float a3 = abVar.a(str, "warmupShootDelayTransfer", (Float) null);
        if (a3 != null) {
            bnVar.t = a3.floatValue();
        }
        bnVar.p = abVar.a(str, "recoilOffset", Float.valueOf(bnVar.p)).floatValue();
        bnVar.q = abVar.a(str, "recoilOutTime", Float.valueOf(bnVar.q)).floatValue();
        bnVar.r = abVar.b(str, "recoilReturnTime", Float.valueOf(bnVar.r)).floatValue();
        Float a4 = abVar.a(str, "energyUsage", (Float) null);
        if (a4 != null) {
            bnVar.u = a4.floatValue();
        }
        bnVar.aI = abVar.b(str, "unloadUpToXUnitsAndGiveAttackOrder", Integer.valueOf(bnVar.aI)).intValue();
        com.corrodinggames.rts.game.units.custom.d.b a5 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, "resourceUsage", true);
        if (a5 != null && a5.d()) {
            bnVar.v = a5;
            lVar.a(a5);
        }
        String b5 = abVar.b(str, "attachedTo", (String) null);
        if (b5 != null) {
            bnVar.y = lVar.e(b5);
            if (bnVar.y == null) {
                throw new RuntimeException("[" + str + "] Could not find attachedTo turret target:" + b5);
            }
            if (bnVar.y == bnVar) {
                throw new RuntimeException("Turret cannot be attachedTo self");
            }
            lVar.fU = true;
        }
        Float a6 = abVar.a(str, "idleDir", (Float) null);
        if (a6 != null) {
            bnVar.j = a6.floatValue();
        }
        Float a7 = abVar.a(str, "idleDirReversing", (Float) null);
        if (a7 != null) {
            bnVar.k = a7.floatValue();
            bnVar.l = true;
        } else if (!bnVar.l) {
            if (bnVar.y != null) {
                bnVar.k = 0.0f;
            } else {
                bnVar.k = bnVar.j + 180.0f;
            }
        }
        Boolean a8 = abVar.a(str, "canShoot", (Boolean) null);
        Boolean a9 = abVar.a(str, "canAttack", (Boolean) null);
        if (a8 != null && a9 != null) {
            throw new RuntimeException("[" + str + "] Cannot use canShoot and canAttack at the same time, they have the same meaning");
        }
        if (a8 != null) {
            bnVar.B = a8.booleanValue();
        } else if (a9 != null) {
            bnVar.B = a9.booleanValue();
        }
        bnVar.D = bl.a(lVar, abVar.b(str, "shoot_sound", (String) null), bnVar.D);
        Float a10 = abVar.a(str, "shoot_sound_vol", (Float) null);
        if (a10 != null) {
            bnVar.D.a(a10.floatValue());
        }
        bnVar.E = lVar.a(abVar.b(str, "shoot_flame", (String) null), bnVar.E);
        bnVar.G = abVar.a(str, "shoot_light", bnVar.G);
        bnVar.F = lVar.a(abVar.b(str, "warmupStartEffect", (String) null), bnVar.F);
        bnVar.A = abVar.a(str, "slave", Boolean.valueOf(bnVar.A)).booleanValue();
        if (bnVar.A) {
            if (bnVar.y == null) {
                throw new RuntimeException("Turret cannot be a slave without being 'attachedTo' to another turret");
            }
            bnVar.z = bnVar.y;
        }
        bnVar.C = abVar.a(lVar, str, "invisible", bnVar.C);
        bnVar.J = abVar.a(lVar, str, "canAttackFlyingUnits", bnVar.J);
        bnVar.K = abVar.a(lVar, str, "canAttackLandUnits", bnVar.K);
        bnVar.L = abVar.a(lVar, str, "canAttackUnderwaterUnits", bnVar.L);
        bnVar.M = abVar.a(lVar, str, "canAttackNotTouchingWaterUnits", bnVar.M);
        bnVar.N = abVar.a(lVar, str, "canAttackCondition", bnVar.N);
        bnVar.O = abVar.a(lVar, str, "canOnlyAttackUnitsWithTags", bnVar.O);
        bnVar.P = abVar.a(lVar, str, "canOnlyAttackUnitsWithoutTags", bnVar.P);
        String b6 = abVar.b(str, "projectile", (String) null);
        if (b6 != null) {
            bh f = lVar.f(b6);
            if (f == null) {
                if ("0".equals(b6) && lVar.fT.size() == 1 && lVar.f("1") != null) {
                    bnVar.R = 0;
                } else {
                    throw new RuntimeException("[" + str + "] Could not find projectile with name:" + b6);
                }
            } else {
                bnVar.R = f.bi;
            }
        }
        String b7 = abVar.b(str, "altProjectile", (String) null);
        if (b7 != null) {
            bh f2 = lVar.f(b7);
            if (f2 == null) {
                throw new RuntimeException("[" + str + "]altProjectile: Could not find projectile with name:" + b7);
            }
            bnVar.S = f2.bi;
        }
        bnVar.T = abVar.a(lVar, str, "altProjectileCondition", bnVar.T);
        if (bnVar.S >= 0 && bnVar.T == null) {
            throw new RuntimeException("[" + str + "]altProjectileCondition is required with altProjectile");
        }
        bnVar.Q = abVar.a(str, "canAttackMaxAngle", Float.valueOf(bnVar.Q)).floatValue();
        bnVar.U = abVar.a(str, "turnSpeed", bnVar.U);
        bnVar.V = abVar.a(str, "turnSpeedAcceleration", Float.valueOf(bnVar.V)).floatValue();
        bnVar.W = abVar.a(str, "turnSpeedDeceleration", Float.valueOf(bnVar.W)).floatValue();
        Float a11 = abVar.a(str, "barrelY", (Float) null);
        Float a12 = abVar.a(str, "size", (Float) null);
        if (a11 != null && a12 != null) {
            throw new RuntimeException("Turret [" + str + "]: barrelY and size can not both be used at the same time as they have the same meaning");
        }
        if (a11 != null) {
            bnVar.X = a11.floatValue();
        }
        if (a12 != null) {
            bnVar.X = a12.floatValue();
        }
        bnVar.Y = abVar.a(str, "barrelX", Float.valueOf(bnVar.Y)).floatValue();
        bnVar.Z = abVar.a(str, "barrelOffsetX_onOddShots", Float.valueOf(bnVar.Z)).floatValue();
        bnVar.aa = abVar.a(str, "barrelHeight", Float.valueOf(bnVar.aa)).floatValue();
        bnVar.ab = abVar.a(str, "limitingRange", Float.valueOf(bnVar.ab)).floatValue();
        bnVar.ai = abVar.a(str, "limitingAngle", Float.valueOf(bnVar.ai)).floatValue();
        bnVar.ag = abVar.a(str, "limitingMinRange", Float.valueOf(bnVar.ag)).floatValue();
        bnVar.af = abVar.a(str, "aimOffsetSpread", Float.valueOf(bnVar.af)).floatValue();
        if (bnVar.ai >= 0.0f) {
            lVar.bG = true;
        }
        if (bnVar.ab < 99999.0f) {
            bnVar.ad = bnVar.ab;
        } else {
            bnVar.ad = lVar.cL.i;
        }
        bnVar.ae = bnVar.ad * bnVar.ad;
        if (bnVar.ag > 0.0f) {
            bnVar.ah = bnVar.ag * bnVar.ag;
        } else {
            bnVar.ah = -1.0f;
        }
        bnVar.ac = abVar.a(str, "showRangeUIGuide", (Boolean) null);
        bnVar.aj = abVar.a(str, "laserDefenceEnergyUse", bnVar.aj);
        if (bnVar.aj != null) {
            lVar.bE = true;
            lVar.a(com.corrodinggames.rts.game.units.custom.b.k.a);
        }
        bnVar.ak = g.a(abVar.b(str, "interceptProjectiles_withTags", (String) null), bnVar.ak);
        if (bnVar.ak != null) {
            lVar.bF = true;
            lVar.a(com.corrodinggames.rts.game.units.custom.b.k.a);
            bnVar.al = abVar.a(str, "interceptProjectiles_andTargetingGroundUnderDistance", Float.valueOf(bnVar.al)).floatValue();
            bnVar.am = abVar.a(str, "interceptProjectiles_andUnderDistance", Float.valueOf(bnVar.am)).floatValue();
            bnVar.an = abVar.a(str, "interceptProjectiles_andOverHeight", Float.valueOf(bnVar.an)).floatValue();
        }
        bnVar.aq = abVar.a(str, "shouldResetTurret", Boolean.valueOf(bnVar.aq)).booleanValue();
        bnVar.ar = abVar.a(str, "idleSpin", Float.valueOf(bnVar.ar)).floatValue();
        bnVar.as = abVar.a(str, "idleSweepAngle", Float.valueOf(bnVar.as)).floatValue();
        bnVar.at = abVar.a(str, "idleSweepDelay", Float.valueOf(bnVar.at)).floatValue();
        bnVar.au = abVar.a(str, "idleSweepSpeed", Float.valueOf(bnVar.au)).floatValue();
        bnVar.av = abVar.a(lVar, str, "idleSweepCondition", bnVar.av);
        bnVar.av = LogicBoolean.convertAlwaysTrueToNull(bnVar.av);
        bnVar.aw = abVar.a(str, "idleSweepAddRandomDelay", Float.valueOf(bnVar.aw)).floatValue();
        if (bnVar.aw < 0.0f) {
            float f3 = 1.0f;
            if (bnVar.at > 200.0f) {
                f3 = 20.0f;
            } else if (bnVar.at > 50.0f) {
                f3 = 5.0f;
            }
            bnVar.aw = f3;
        }
        bnVar.ax = abVar.a(str, "idleSweepAddRandomAngle", Float.valueOf(bnVar.ax)).floatValue();
        if (bnVar.ax < 0.0f) {
            throw new RuntimeException("Turret [" + str + "]: idleSweepAddRandomAngle must be >= 0");
        }
        if (bnVar.as < 0.0f) {
            throw new RuntimeException("Turret [" + str + "]: idleSweepAngle must be >= 0");
        }
        bnVar.ay = abVar.a(str, "clearTurretTargetAfterFiring", Boolean.valueOf(bnVar.ay)).booleanValue();
        bnVar.aA = lVar.a(abVar.b(str, "onShoot_playAnimation", (String) null), bnVar.aA);
        bnVar.aB = abVar.b(str, "onShoot_freezeBodyMovementFor", Float.valueOf(bnVar.aB)).floatValue();
        bnVar.aC = abVar.a(lVar, str, "onShoot_triggerActions", bnVar.aC);
        if (abVar.a(str, "isMainNanoTurret", (Boolean) false).booleanValue()) {
            lVar.fV = bnVar;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a13 = lVar.a(abVar, str, "image");
        if (a13 != null) {
            bnVar.aD = a13;
            boolean z = lVar.s;
            Boolean a14 = abVar.a(str, "image_applyTeamColors", (Boolean) null);
            if (a14 != null) {
                z = a14.booleanValue();
            }
            if (z) {
                bnVar.aE = lVar.a(bnVar.aD, lVar.ac);
            } else {
                bnVar.aE = null;
            }
        }
        bnVar.aG = abVar.a(str, "image_drawOffsetX", Float.valueOf(bnVar.aG)).floatValue();
        bnVar.aH = abVar.a(str, "image_drawOffsetY", Float.valueOf(bnVar.aH)).floatValue();
        com.corrodinggames.rts.gameFramework.unitAction.e a15 = lVar.a(abVar, str, "chargeEffectImage");
        if (a15 != null) {
            bnVar.aF = a15;
            lVar.fP = true;
        }
        if (lVar.fR[bnVar.R] == null) {
            throw new RuntimeException("Turret [" + str + "]: cannot find linked projectile:" + bnVar.R);
        }
        if (bnVar.S >= 0 && lVar.fR[bnVar.S] == null) {
            throw new RuntimeException("Turret [" + str + "]altProjectile: cannot find linked projectile");
        }
        bnVar.J = LogicBoolean.convertAlwaysTrueToNull(bnVar.J);
        bnVar.K = LogicBoolean.convertAlwaysTrueToNull(bnVar.K);
        bnVar.L = LogicBoolean.convertAlwaysTrueToNull(bnVar.L);
        bnVar.M = LogicBoolean.convertAlwaysTrueToNull(bnVar.M);
        bnVar.N = LogicBoolean.convertAlwaysTrueToNull(bnVar.N);
        if (bnVar.ai != -1.0f || bnVar.J != null || bnVar.K != null || bnVar.L != null || bnVar.M != null || bnVar.N != null) {
            bnVar.H = true;
        }
        if (bnVar.ab < 99999.0f || bnVar.ag > 0.0f) {
            bnVar.H = true;
            bnVar.I = true;
        }
        if (bnVar.O != null || bnVar.P != null) {
            bnVar.H = true;
        }
        bnVar.d = true;
    }
}