package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bh.class */
public class bh extends com.corrodinggames.rts.game.g {
    public String bh;
    public int bi;
    public l bj;

    public static void a(bh bhVar, l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str) {
        Integer b = abVar.b(str, "directDamage", (Integer) null);
        Integer b2 = abVar.b(str, "areaDamage", (Integer) null);
        if (b == null && b2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        bhVar.s = abVar.a(str, "targetGround", Boolean.valueOf(bhVar.s)).booleanValue();
        bhVar.t = abVar.a(str, "targetGround_includeTargetHeight", Boolean.valueOf(bhVar.t)).booleanValue();
        Integer b3 = abVar.b(str, "areaRadius", (Integer) null);
        if (b3 != null) {
            bhVar.i = b3.intValue();
        }
        bhVar.b = abVar.b(str, "directDamage", Integer.valueOf(bhVar.b)).intValue();
        bhVar.c = abVar.b(str, "areaDamage", Integer.valueOf(bhVar.c)).intValue();
        bhVar.d = abVar.a(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(bhVar.d)).booleanValue();
        bhVar.g = abVar.a(str, "areaDamageNoFalloff", Boolean.valueOf(bhVar.g)).booleanValue();
        bhVar.j = abVar.a(str, "areaIgnoreUnitsCloserThan", Float.valueOf(bhVar.j)).floatValue();
        bhVar.h = abVar.a(str, "areaRadiusFromEdge", Boolean.valueOf(bhVar.h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(abVar.b(str, "friendlyFire", (String) null))) {
            bhVar.l = true;
        } else {
            Boolean a = abVar.a(str, "friendlyFire", (Boolean) null);
            if (a != null) {
                bhVar.l = false;
                bhVar.k = a.booleanValue();
            }
        }
        bhVar.m = abVar.a(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(bhVar.m)).booleanValue();
        bhVar.n = abVar.a(str, "areaHitUnderwaterAlways", Boolean.valueOf(bhVar.n)).booleanValue();
        bhVar.o = abVar.a(str, "deflectionPower", Float.valueOf(bhVar.o)).floatValue();
        bhVar.p = abVar.a(str, "nukeWeapon", Boolean.valueOf(bhVar.p)).booleanValue();
        bhVar.q = abVar.a(str, "shouldRevealFog", Boolean.valueOf(bhVar.q)).booleanValue();
        bhVar.r = abVar.a(str, "alwaysVisibleInFog", Boolean.valueOf(bhVar.r)).booleanValue();
        bhVar.v = abVar.h(str, "life").floatValue();
        bhVar.u = abVar.b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        bhVar.w = abVar.a(str, "speed", Float.valueOf(bhVar.w)).floatValue();
        bhVar.x = abVar.a(str, "frame", Short.valueOf(bhVar.x)).shortValue();
        bhVar.y = abVar.a(str, "drawType", Short.valueOf(bhVar.y)).shortValue();
        bhVar.z = abVar.a(str, "shadowFrame", Short.valueOf(bhVar.z)).shortValue();
        com.corrodinggames.rts.gameFramework.unitAction.e a2 = lVar.a(abVar, str, "image");
        if (a2 != null) {
            bhVar.B = a2;
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a3 = lVar.a(abVar, str, "shadowImage");
        if (a3 != null) {
            bhVar.C = a3;
        }
        bhVar.ad = abVar.a(str, "beamImageOffsetRate", Float.valueOf(bhVar.ad)).floatValue();
        com.corrodinggames.rts.gameFramework.unitAction.e a4 = lVar.a(abVar, str, "beamImage");
        if (a4 != null) {
            bhVar.Y = a4;
            bhVar.X = true;
            if (a4.q < 20 && !GameEngine.ax()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a5 = lVar.a(abVar, str, "beamImageStart");
        if (a5 != null) {
            bhVar.Z = a5;
            if (a4 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        bhVar.aa = abVar.a(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        com.corrodinggames.rts.gameFramework.unitAction.e a6 = lVar.a(abVar, str, "beamImageEnd");
        if (a6 != null) {
            bhVar.ab = a6;
            if (a4 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        bhVar.ac = abVar.a(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        bhVar.A = abVar.a(str, "invisible", Boolean.valueOf(bhVar.A)).booleanValue();
        bhVar.D = abVar.a(str, "initialUnguidedSpeedHeight", Float.valueOf(bhVar.D)).floatValue();
        bhVar.E = abVar.a(str, "initialUnguidedSpeedX", Float.valueOf(bhVar.E)).floatValue();
        bhVar.F = abVar.a(str, "initialUnguidedSpeedY", Float.valueOf(bhVar.F)).floatValue();
        bhVar.G = abVar.a(str, "gravity", Float.valueOf(bhVar.G)).floatValue();
        bhVar.H = abVar.a(str, "trueGravity", Float.valueOf(bhVar.H)).floatValue();
        bhVar.I = abVar.a(str, "instant", Boolean.valueOf(bhVar.I)).booleanValue();
        bhVar.L = abVar.a(str, "instantReuseLast", Boolean.valueOf(bhVar.L)).booleanValue();
        bhVar.M = abVar.a(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(bhVar.M)).booleanValue();
        if (bhVar.M) {
            if (!bhVar.L) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            lVar.eA = true;
        }
        bhVar.N = abVar.a(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(bhVar.N)).booleanValue();
        bhVar.T = abVar.a(str, "moveWithParent", Boolean.valueOf(bhVar.T)).booleanValue();
        bhVar.J = abVar.a(str, "disableLeadTargeting", Boolean.valueOf(bhVar.J)).booleanValue();
        bhVar.K = abVar.a(str, "leadTargetingSpeedCalculation", Float.valueOf(bhVar.K)).floatValue();
        bhVar.ae = abVar.a(str, "ballistic", Boolean.valueOf(bhVar.ae)).booleanValue();
        String b4 = abVar.b(str, "trailEffect", (String) null);
        if (b4 != null) {
            if (b4.equalsIgnoreCase("true")) {
                bhVar.af = true;
            } else if (b4.equalsIgnoreCase("false")) {
                bhVar.af = false;
            } else {
                bhVar.af = false;
                bhVar.ah = lVar.a(b4, (z) null);
            }
        }
        String b5 = abVar.b(str, "effectOnCreate", (String) null);
        if (b5 != null) {
            bhVar.ai = lVar.a(b5, (z) null);
        }
        bhVar.ag = abVar.a(str, "trailEffectRate", Float.valueOf(bhVar.ag)).floatValue();
        if (bhVar.af) {
            bhVar.ao = -1118720;
        }
        bhVar.am = abVar.a(str, "wobbleAmplitude", Float.valueOf(bhVar.am)).floatValue();
        bhVar.an = abVar.b(str, "wobbleFrequency", Float.valueOf(bhVar.an)).floatValue();
        if (bhVar.an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        bhVar.ak = bi.a(lVar, abVar, str, "spawnProjectilesOnEndOfLife", (bi) null);
        bhVar.aj = bi.a(lVar, abVar, str, "spawnProjectilesOnExplode", (bi) null);
        bhVar.al = bi.a(lVar, abVar, str, "spawnProjectilesOnCreate", (bi) null);
        bhVar.ao = abVar.a(str, "lightColor", Integer.valueOf(bhVar.ao)).intValue();
        bhVar.ap = abVar.a(str, "lightSize", Float.valueOf(bhVar.ap)).floatValue();
        bhVar.aq = abVar.a(str, "lightCastOnGround", Boolean.valueOf(bhVar.aq)).booleanValue();
        bhVar.ar = abVar.a(str, "largeHitEffect", Boolean.valueOf(bhVar.ar)).booleanValue();
        bhVar.O = abVar.a(str, "turnSpeed", Float.valueOf(bhVar.O)).floatValue();
        bhVar.P = abVar.a(str, "turnSpeedWhenNear", Float.valueOf(bhVar.P)).floatValue();
        bhVar.Q = abVar.a(str, "sweepSpeed", Float.valueOf(bhVar.Q)).floatValue();
        bhVar.R = abVar.a(str, "sweepOffset", Float.valueOf(bhVar.R)).floatValue();
        bhVar.S = abVar.a(str, "sweepOffsetFromTargetRadius", Float.valueOf(bhVar.S)).floatValue();
        bhVar.U = abVar.a(str, "drawUnderUnits", Boolean.valueOf(bhVar.U)).booleanValue();
        bhVar.V = abVar.a(str, "lightingEffect", Boolean.valueOf(bhVar.V)).booleanValue();
        bhVar.W = abVar.a(str, "laserEffect", Boolean.valueOf(bhVar.W)).booleanValue();
        if (bhVar.W && bhVar.Y == null) {
            bhVar.aE = Color.a(80, 255, 0, 0);
        }
        if (bhVar.V && bhVar.s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (bhVar.W && bhVar.s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        bhVar.as = abVar.a(str, "ballistic_delaymove_height", Float.valueOf(bhVar.as)).floatValue();
        bhVar.at = abVar.a(str, "ballistic_height", Float.valueOf(bhVar.at)).floatValue();
        bhVar.au = abVar.a(str, "targetSpeed", Float.valueOf(bhVar.au)).floatValue();
        bhVar.av = abVar.a(str, "targetSpeedAcceleration", Float.valueOf(bhVar.av)).floatValue();
        bhVar.aw = abVar.a(str, "autoTargetingOnDeadTarget", Boolean.valueOf(bhVar.aw)).booleanValue();
        bhVar.ax = abVar.a(str, "autoTargetingOnDeadTargetRange", Float.valueOf(bhVar.ax)).floatValue();
        bhVar.ay = abVar.a(str, "autoTargetingOnDeadTargetLead", Float.valueOf(bhVar.ay)).floatValue();
        bhVar.az = abVar.a(str, "retargetingInFlight", Boolean.valueOf(bhVar.az)).booleanValue();
        bhVar.aA = abVar.a(str, "retargetingInFlightSearchDelay", Float.valueOf(bhVar.aA)).floatValue();
        bhVar.aB = abVar.a(str, "retargetingInFlightSearchRange", Float.valueOf(bhVar.aB)).floatValue();
        bhVar.aC = abVar.a(str, "retargetingInFlightSearchLead", Float.valueOf(bhVar.aC)).floatValue();
        bhVar.aD = abVar.a(lVar, str, "retargetingInFlightSearchOnlyTags", (h) null);
        if (bhVar.ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (bhVar.aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        bhVar.aE = abVar.a(str, "color", Integer.valueOf(bhVar.aE)).intValue();
        bhVar.aG = abVar.a(str, "teamColorRatio", Float.valueOf(bhVar.aG)).floatValue();
        if (bhVar.aG < 0.0f || bhVar.aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + bhVar.aG);
        }
        bhVar.aH = abVar.a(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - bhVar.aG)).floatValue();
        if (bhVar.aH < 0.0f || bhVar.aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + bhVar.aH);
        }
        if (bhVar.aG == 0.0f && bhVar.aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        bhVar.aF = abVar.a(str, "drawSize", Float.valueOf(bhVar.aF)).floatValue();
        bhVar.aI = abVar.a(str, "flameWeapon", Boolean.valueOf(bhVar.aI)).booleanValue();
        bhVar.aJ = abVar.a(str, "hitSound", Boolean.valueOf(bhVar.aJ)).booleanValue();
        bhVar.aL = abVar.a(str, "targetGroundHeightOffset", Float.valueOf(bhVar.aL)).floatValue();
        bhVar.aK = abVar.a(str, "targetGroundSpread", Float.valueOf(bhVar.aK)).floatValue();
        bhVar.aM = abVar.a(str, "speedSpread", Float.valueOf(bhVar.aM)).floatValue();
        bhVar.aO = abVar.a(str, "explodeOnEndOfLife", Boolean.valueOf(bhVar.aO)).booleanValue();
        bhVar.aN = abVar.a(str, "ignoreParentShootDamageMultiplier", Boolean.valueOf(bhVar.aN)).booleanValue();
        bhVar.aP = abVar.a(str, "pushForce", Float.valueOf(bhVar.aP)).floatValue();
        bhVar.aQ = abVar.a(str, "pushVelocity", Float.valueOf(bhVar.aQ)).floatValue();
        bhVar.aR = abVar.a(str, "buildingDamageMultiplier", Float.valueOf(bhVar.aR)).floatValue();
        bhVar.aS = abVar.a(str, "shieldDamageMultiplier", Float.valueOf(bhVar.aS)).floatValue();
        bhVar.aT = abVar.a(str, "shieldDefectionMultiplier", Float.valueOf(bhVar.aT)).floatValue();
        bhVar.aU = abVar.a(str, "hullDamageMultiplier", Float.valueOf(bhVar.aU)).floatValue();
        bhVar.aV = abVar.a(str, "armourIgnoreAmount", Float.valueOf(bhVar.aV)).floatValue();
        bhVar.aW = abVar.a(str, "areaExpandTime", Float.valueOf(bhVar.aW)).floatValue();
        String b6 = abVar.b(str, "explodeEffect", (String) null);
        if (b6 != null) {
            bhVar.aX = lVar.a(b6, (z) null);
        }
        String b7 = abVar.b(str, "explodeEffectOnShield", (String) null);
        if (b7 != null) {
            bhVar.aY = lVar.a(b7, (z) null);
        }
        bp a7 = bp.a(lVar, abVar, str, "spawnUnit");
        if (a7 != null && !a7.b()) {
            bhVar.aZ = a7;
        }
        bhVar.ba = abVar.b(str, "unloadUpToXUnitsFromSource", Integer.valueOf(bhVar.ba)).intValue();
        bhVar.bb = abVar.a(str, "teleportSource", Boolean.valueOf(bhVar.bb)).booleanValue();
        bhVar.bc = abVar.a(str, "convertHitToSourceTeam", Boolean.valueOf(bhVar.bc)).booleanValue();
        bhVar.bd = g.a(abVar.b(str, "tags", (String) null));
        com.corrodinggames.rts.gameFramework.utility.m k = abVar.k(str, "mutator");
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        Iterator it = k.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split("_");
            if (split.length > 1) {
                String str2 = split[0];
                String str3 = str2 + "_";
                if (!mVar.contains(str3) && str2.length() > "mutator".length()) {
                    mVar.add(str3);
                }
            }
        }
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            com.corrodinggames.rts.game.h hVar = new com.corrodinggames.rts.game.h();
            hVar.a = g.a(abVar.b(str, str4 + "ifUnitWithTags", (String) null));
            hVar.b = g.a(abVar.b(str, str4 + "ifUnitWithoutTags", (String) null));
            if (hVar.a == null && hVar.b == null) {
                throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
            }
            hVar.c = abVar.a(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            hVar.d = abVar.a(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            com.corrodinggames.rts.game.units.custom.d.b a8 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str4 + "addResourcesDirectHit", true);
            if (a8 != null && a8.d()) {
                hVar.e = a8;
                if (bhVar.s) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            com.corrodinggames.rts.game.units.custom.d.b a9 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str4 + "addResourcesAreaHit", true);
            if (a9 != null && a9.d()) {
                hVar.f = a9;
                if (b3 == null) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            String b8 = abVar.b(str, str4 + "changedExplodeEffect", (String) null);
            if (b8 != null) {
                hVar.g = lVar.a(b8, (z) null);
                if (hVar.g != null && !hVar.g.a()) {
                    hVar.g = null;
                }
            }
            boolean z = false;
            boolean z2 = false;
            if (!com.corrodinggames.rts.gameFramework.f.k(hVar.c, 1.0f)) {
                z = true;
            }
            if (!com.corrodinggames.rts.gameFramework.f.k(hVar.d, 1.0f) && bhVar.c != 0 && bhVar.i > 0) {
                z2 = true;
            }
            if (hVar.e != null) {
                z = true;
            }
            if (hVar.f != null) {
                z2 = true;
            }
            if (z) {
                if (bhVar.be == null) {
                    bhVar.be = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bhVar.be.add(hVar);
            }
            if (z2) {
                if (bhVar.bf == null) {
                    bhVar.bf = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bhVar.e = true;
                bhVar.bf.add(hVar);
            }
            if (hVar.g != null) {
                if (bhVar.bg == null) {
                    bhVar.bg = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bhVar.bg.add(hVar);
            }
        }
        if (bhVar.c != 0 && bhVar.i > 0) {
            bhVar.e = true;
        }
        if ((bhVar.aP != 0.0f || bhVar.aQ != 0.0f) && bhVar.i > 0) {
            bhVar.e = true;
        }
        bhVar.f = !bhVar.e;
        lVar.fT.add(bhVar);
    }

    public static void a(bh bhVar, GameOutputStream gameOutputStream) {
        gameOutputStream.a(bhVar.bj);
        gameOutputStream.writeString(bhVar.bh);
    }

    public static com.corrodinggames.rts.game.g b(GameInputStream gameInputStream) {
        com.corrodinggames.rts.game.units.as q = gameInputStream.q();
        String readString = gameInputStream.readString();
        if (q == null) {
            return null;
        }
        if (!(q instanceof l)) {
            GameEngine.print("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + q.i() + " loading real_meta");
            return null;
        }
        bh f = ((l) q).f(readString);
        if (f == null) {
            GameEngine.print("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + readString);
            return null;
        }
        return f;
    }

    public void a(com.corrodinggames.rts.game.units.am amVar, Projectile projectile, com.corrodinggames.rts.game.units.am amVar2, float f, float f2, float f3) {
        if (amVar2 == null) {
            projectile.aC = true;
            projectile.n = f;
            projectile.o = f2;
            if (this.aK != 0.0f) {
                projectile.n += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar, (int) ((-this.aK) * 100.0f), (int) (this.aK * 100.0f), 2) / 100.0f;
                amVar.bC = (int) (amVar.bC + projectile.n);
                projectile.o += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar, (int) ((-this.aK) * 100.0f), (int) (this.aK * 100.0f), 3) / 100.0f;
                amVar.bC = (int) (amVar.bC + projectile.o);
            }
            projectile.p = 0.0f;
            projectile.p += this.aL;
        } else if (projectile.m) {
            projectile.aC = true;
            if (!this.J) {
                float f4 = projectile.t;
                if (this.au != -1.0f) {
                    f4 = this.au;
                }
                if (this.K >= 0.0f) {
                    f4 = this.K;
                }
                PointF a = amVar2.a(projectile.eo, projectile.ep, f4, projectile.h, f3);
                projectile.n = a.x;
                projectile.o = a.y;
            } else {
                projectile.n = amVar2.eo;
                projectile.o = amVar2.ep;
            }
            if (this.t) {
                projectile.p = amVar2.eq;
            } else {
                projectile.p = 0.0f;
            }
            projectile.p += this.aL;
            if (this.aK != 0.0f) {
                projectile.n += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar, (int) ((-this.aK) * 100.0f), (int) (this.aK * 100.0f), 2) / 100.0f;
                projectile.o += com.corrodinggames.rts.gameFramework.f.a((com.corrodinggames.rts.gameFramework.w) amVar, (int) ((-this.aK) * 100.0f), (int) (this.aK * 100.0f), 7) / 100.0f;
            }
        } else {
            projectile.l = amVar2;
        }
    }
}