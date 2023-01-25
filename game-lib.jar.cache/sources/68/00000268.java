package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.C0189g;
import com.corrodinggames.rts.game.C0190h;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bh */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bh.class */
public class C0410bh extends C0189g {

    /* renamed from: bh */
    public String f2538bh;

    /* renamed from: bi */
    public int f2539bi;

    /* renamed from: bj */
    public C0458l f2540bj;

    /* renamed from: a */
    public static void m3898a(C0410bh c0410bh, C0458l c0458l, C1107ab c1107ab, String str) {
        Integer m667b = c1107ab.m667b(str, "directDamage", (Integer) null);
        Integer m667b2 = c1107ab.m667b(str, "areaDamage", (Integer) null);
        if (m667b == null && m667b2 == null) {
            throw new RuntimeException("[" + str + "]: directDamage or areaDamage must be set");
        }
        c0410bh.f1118s = c1107ab.m685a(str, "targetGround", Boolean.valueOf(c0410bh.f1118s)).booleanValue();
        c0410bh.f1119t = c1107ab.m685a(str, "targetGround_includeTargetHeight", Boolean.valueOf(c0410bh.f1119t)).booleanValue();
        Integer m667b3 = c1107ab.m667b(str, "areaRadius", (Integer) null);
        if (m667b3 != null) {
            c0410bh.f1108i = m667b3.intValue();
        }
        c0410bh.f1101b = c1107ab.m667b(str, "directDamage", Integer.valueOf(c0410bh.f1101b)).intValue();
        c0410bh.f1102c = c1107ab.m667b(str, "areaDamage", Integer.valueOf(c0410bh.f1102c)).intValue();
        c0410bh.f1103d = c1107ab.m685a(str, "interceptProjectile_removeTargetLifeOnly", Boolean.valueOf(c0410bh.f1103d)).booleanValue();
        c0410bh.f1106g = c1107ab.m685a(str, "areaDamageNoFalloff", Boolean.valueOf(c0410bh.f1106g)).booleanValue();
        c0410bh.f1109j = c1107ab.m683a(str, "areaIgnoreUnitsCloserThan", Float.valueOf(c0410bh.f1109j)).floatValue();
        c0410bh.f1107h = c1107ab.m685a(str, "areaRadiusFromEdge", Boolean.valueOf(c0410bh.f1107h)).booleanValue();
        if ("only-ignoreEnemy".equalsIgnoreCase(c1107ab.m666b(str, "friendlyFire", (String) null))) {
            c0410bh.f1111l = true;
        } else {
            Boolean m685a = c1107ab.m685a(str, "friendlyFire", (Boolean) null);
            if (m685a != null) {
                c0410bh.f1111l = false;
                c0410bh.f1110k = m685a.booleanValue();
            }
        }
        c0410bh.f1112m = c1107ab.m685a(str, "areaHitAirAndLandAtSameTime", Boolean.valueOf(c0410bh.f1112m)).booleanValue();
        c0410bh.f1113n = c1107ab.m685a(str, "areaHitUnderwaterAlways", Boolean.valueOf(c0410bh.f1113n)).booleanValue();
        c0410bh.f1114o = c1107ab.m683a(str, "deflectionPower", Float.valueOf(c0410bh.f1114o)).floatValue();
        c0410bh.f1115p = c1107ab.m685a(str, "nukeWeapon", Boolean.valueOf(c0410bh.f1115p)).booleanValue();
        c0410bh.f1116q = c1107ab.m685a(str, "shouldRevealFog", Boolean.valueOf(c0410bh.f1116q)).booleanValue();
        c0410bh.f1117r = c1107ab.m685a(str, "alwaysVisibleInFog", Boolean.valueOf(c0410bh.f1117r)).booleanValue();
        c0410bh.f1121v = c1107ab.m645h(str, "life").floatValue();
        c0410bh.f1120u = c1107ab.m668b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        c0410bh.f1122w = c1107ab.m683a(str, "speed", Float.valueOf(c0410bh.f1122w)).floatValue();
        c0410bh.f1123x = c1107ab.m680a(str, "frame", Short.valueOf(c0410bh.f1123x)).shortValue();
        c0410bh.f1124y = c1107ab.m680a(str, "drawType", Short.valueOf(c0410bh.f1124y)).shortValue();
        c0410bh.f1125z = c1107ab.m680a(str, "shadowFrame", Short.valueOf(c0410bh.f1125z)).shortValue();
        C0970e m3547a = c0458l.m3547a(c1107ab, str, "image");
        if (m3547a != null) {
            c0410bh.f1127B = m3547a;
        }
        C0970e m3547a2 = c0458l.m3547a(c1107ab, str, "shadowImage");
        if (m3547a2 != null) {
            c0410bh.f1128C = m3547a2;
        }
        c0410bh.f1155ad = c1107ab.m683a(str, "beamImageOffsetRate", Float.valueOf(c0410bh.f1155ad)).floatValue();
        C0970e m3547a3 = c0458l.m3547a(c1107ab, str, "beamImage");
        if (m3547a3 != null) {
            c0410bh.f1150Y = m3547a3;
            c0410bh.f1149X = true;
            if (m3547a3.f6623q < 20 && !GameEngine.m1026ax()) {
                throw new RuntimeException("beamImage height must currently be 20 pixels or greater (performance when tiling)");
            }
        }
        C0970e m3547a4 = c0458l.m3547a(c1107ab, str, "beamImageStart");
        if (m3547a4 != null) {
            c0410bh.f1151Z = m3547a4;
            if (m3547a3 == null) {
                throw new RuntimeException("beamImageStart requires beamImage to be set");
            }
        }
        c0410bh.f1152aa = c1107ab.m685a(str, "beamImageStartRotated", (Boolean) false).booleanValue();
        C0970e m3547a5 = c0458l.m3547a(c1107ab, str, "beamImageEnd");
        if (m3547a5 != null) {
            c0410bh.f1153ab = m3547a5;
            if (m3547a3 == null) {
                throw new RuntimeException("beamImageEnd requires beamImage to be set");
            }
        }
        c0410bh.f1154ac = c1107ab.m685a(str, "beamImageEndRotated", (Boolean) false).booleanValue();
        c0410bh.f1126A = c1107ab.m685a(str, "invisible", Boolean.valueOf(c0410bh.f1126A)).booleanValue();
        c0410bh.f1129D = c1107ab.m683a(str, "initialUnguidedSpeedHeight", Float.valueOf(c0410bh.f1129D)).floatValue();
        c0410bh.f1130E = c1107ab.m683a(str, "initialUnguidedSpeedX", Float.valueOf(c0410bh.f1130E)).floatValue();
        c0410bh.f1131F = c1107ab.m683a(str, "initialUnguidedSpeedY", Float.valueOf(c0410bh.f1131F)).floatValue();
        c0410bh.f1132G = c1107ab.m683a(str, "gravity", Float.valueOf(c0410bh.f1132G)).floatValue();
        c0410bh.f1133H = c1107ab.m683a(str, "trueGravity", Float.valueOf(c0410bh.f1133H)).floatValue();
        c0410bh.f1134I = c1107ab.m685a(str, "instant", Boolean.valueOf(c0410bh.f1134I)).booleanValue();
        c0410bh.f1137L = c1107ab.m685a(str, "instantReuseLast", Boolean.valueOf(c0410bh.f1137L)).booleanValue();
        c0410bh.f1138M = c1107ab.m685a(str, "instantReuseLast_alsoChangeTurretAim", Boolean.valueOf(c0410bh.f1138M)).booleanValue();
        if (c0410bh.f1138M) {
            if (!c0410bh.f1137L) {
                throw new RuntimeException("[" + str + "]instantReuseLast_alsoChangeTurretAim also requires instantReuseLast");
            }
            c0458l.f3219eA = true;
        }
        c0410bh.f1139N = c1107ab.m685a(str, "instantReuseLast_keepAreaDamageList", Boolean.valueOf(c0410bh.f1139N)).booleanValue();
        c0410bh.f1145T = c1107ab.m685a(str, "moveWithParent", Boolean.valueOf(c0410bh.f1145T)).booleanValue();
        c0410bh.f1135J = c1107ab.m685a(str, "disableLeadTargeting", Boolean.valueOf(c0410bh.f1135J)).booleanValue();
        c0410bh.f1136K = c1107ab.m683a(str, "leadTargetingSpeedCalculation", Float.valueOf(c0410bh.f1136K)).floatValue();
        c0410bh.f1156ae = c1107ab.m685a(str, "ballistic", Boolean.valueOf(c0410bh.f1156ae)).booleanValue();
        String m666b = c1107ab.m666b(str, "trailEffect", (String) null);
        if (m666b != null) {
            if (m666b.equalsIgnoreCase("true")) {
                c0410bh.f1157af = true;
            } else if (m666b.equalsIgnoreCase("false")) {
                c0410bh.f1157af = false;
            } else {
                c0410bh.f1157af = false;
                c0410bh.f1159ah = c0458l.m3542a(m666b, (C0473z) null);
            }
        }
        String m666b2 = c1107ab.m666b(str, "effectOnCreate", (String) null);
        if (m666b2 != null) {
            c0410bh.f1160ai = c0458l.m3542a(m666b2, (C0473z) null);
        }
        c0410bh.f1158ag = c1107ab.m683a(str, "trailEffectRate", Float.valueOf(c0410bh.f1158ag)).floatValue();
        if (c0410bh.f1157af) {
            c0410bh.f1166ao = -1118720;
        }
        c0410bh.f1164am = c1107ab.m683a(str, "wobbleAmplitude", Float.valueOf(c0410bh.f1164am)).floatValue();
        c0410bh.f1165an = c1107ab.m668b(str, "wobbleFrequency", Float.valueOf(c0410bh.f1165an)).floatValue();
        if (c0410bh.f1165an <= 0.0f) {
            throw new RuntimeException("wobbleFrequency must be greater than 0");
        }
        c0410bh.f1162ak = C0411bi.m3892a(c0458l, c1107ab, str, "spawnProjectilesOnEndOfLife", (C0411bi) null);
        c0410bh.f1161aj = C0411bi.m3892a(c0458l, c1107ab, str, "spawnProjectilesOnExplode", (C0411bi) null);
        c0410bh.f1163al = C0411bi.m3892a(c0458l, c1107ab, str, "spawnProjectilesOnCreate", (C0411bi) null);
        c0410bh.f1166ao = c1107ab.m681a(str, "lightColor", Integer.valueOf(c0410bh.f1166ao)).intValue();
        c0410bh.f1167ap = c1107ab.m683a(str, "lightSize", Float.valueOf(c0410bh.f1167ap)).floatValue();
        c0410bh.f1168aq = c1107ab.m685a(str, "lightCastOnGround", Boolean.valueOf(c0410bh.f1168aq)).booleanValue();
        c0410bh.f1169ar = c1107ab.m685a(str, "largeHitEffect", Boolean.valueOf(c0410bh.f1169ar)).booleanValue();
        c0410bh.f1140O = c1107ab.m683a(str, "turnSpeed", Float.valueOf(c0410bh.f1140O)).floatValue();
        c0410bh.f1141P = c1107ab.m683a(str, "turnSpeedWhenNear", Float.valueOf(c0410bh.f1141P)).floatValue();
        c0410bh.f1142Q = c1107ab.m683a(str, "sweepSpeed", Float.valueOf(c0410bh.f1142Q)).floatValue();
        c0410bh.f1143R = c1107ab.m683a(str, "sweepOffset", Float.valueOf(c0410bh.f1143R)).floatValue();
        c0410bh.f1144S = c1107ab.m683a(str, "sweepOffsetFromTargetRadius", Float.valueOf(c0410bh.f1144S)).floatValue();
        c0410bh.f1146U = c1107ab.m685a(str, "drawUnderUnits", Boolean.valueOf(c0410bh.f1146U)).booleanValue();
        c0410bh.f1147V = c1107ab.m685a(str, "lightingEffect", Boolean.valueOf(c0410bh.f1147V)).booleanValue();
        c0410bh.f1148W = c1107ab.m685a(str, "laserEffect", Boolean.valueOf(c0410bh.f1148W)).booleanValue();
        if (c0410bh.f1148W && c0410bh.f1150Y == null) {
            c0410bh.f1182aE = Color.m5237a(80, 255, 0, 0);
        }
        if (c0410bh.f1147V && c0410bh.f1118s) {
            throw new RuntimeException("lightingEffect must be targeted, cannot be targetGround");
        }
        if (c0410bh.f1148W && c0410bh.f1118s) {
            throw new RuntimeException("laserEffect must be targeted, cannot be targetGround");
        }
        c0410bh.f1170as = c1107ab.m683a(str, "ballistic_delaymove_height", Float.valueOf(c0410bh.f1170as)).floatValue();
        c0410bh.f1171at = c1107ab.m683a(str, "ballistic_height", Float.valueOf(c0410bh.f1171at)).floatValue();
        c0410bh.f1172au = c1107ab.m683a(str, "targetSpeed", Float.valueOf(c0410bh.f1172au)).floatValue();
        c0410bh.f1173av = c1107ab.m683a(str, "targetSpeedAcceleration", Float.valueOf(c0410bh.f1173av)).floatValue();
        c0410bh.f1174aw = c1107ab.m685a(str, "autoTargetingOnDeadTarget", Boolean.valueOf(c0410bh.f1174aw)).booleanValue();
        c0410bh.f1175ax = c1107ab.m683a(str, "autoTargetingOnDeadTargetRange", Float.valueOf(c0410bh.f1175ax)).floatValue();
        c0410bh.f1176ay = c1107ab.m683a(str, "autoTargetingOnDeadTargetLead", Float.valueOf(c0410bh.f1176ay)).floatValue();
        c0410bh.f1177az = c1107ab.m685a(str, "retargetingInFlight", Boolean.valueOf(c0410bh.f1177az)).booleanValue();
        c0410bh.f1178aA = c1107ab.m683a(str, "retargetingInFlightSearchDelay", Float.valueOf(c0410bh.f1178aA)).floatValue();
        c0410bh.f1179aB = c1107ab.m683a(str, "retargetingInFlightSearchRange", Float.valueOf(c0410bh.f1179aB)).floatValue();
        c0410bh.f1180aC = c1107ab.m683a(str, "retargetingInFlightSearchLead", Float.valueOf(c0410bh.f1180aC)).floatValue();
        c0410bh.f1181aD = c1107ab.m705a(c0458l, str, "retargetingInFlightSearchOnlyTags", (C0454h) null);
        if (c0410bh.f1175ax > 1500.0f) {
            throw new RuntimeException("for performance autoTargetingOnDeadTargetRange cannot be >1500");
        }
        if (c0410bh.f1179aB > 1500.0f) {
            throw new RuntimeException("for performance retargetingInFlightSearchRange cannot be >1500");
        }
        c0410bh.f1182aE = c1107ab.m681a(str, "color", Integer.valueOf(c0410bh.f1182aE)).intValue();
        c0410bh.f1184aG = c1107ab.m683a(str, "teamColorRatio", Float.valueOf(c0410bh.f1184aG)).floatValue();
        if (c0410bh.f1184aG < 0.0f || c0410bh.f1184aG > 1.0f) {
            throw new RuntimeException("teamColorRatio should be between 0-1 got:" + c0410bh.f1184aG);
        }
        c0410bh.f1185aH = c1107ab.m683a(str, "teamColorRatio_sourceRatio", Float.valueOf(1.0f - c0410bh.f1184aG)).floatValue();
        if (c0410bh.f1185aH < 0.0f || c0410bh.f1185aH > 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio should be between 0-1 got:" + c0410bh.f1185aH);
        }
        if (c0410bh.f1184aG == 0.0f && c0410bh.f1185aH != 1.0f) {
            throw new RuntimeException("teamColorRatio_sourceRatio requires teamColorRatio");
        }
        c0410bh.f1183aF = c1107ab.m683a(str, "drawSize", Float.valueOf(c0410bh.f1183aF)).floatValue();
        c0410bh.f1186aI = c1107ab.m685a(str, "flameWeapon", Boolean.valueOf(c0410bh.f1186aI)).booleanValue();
        c0410bh.f1187aJ = c1107ab.m685a(str, "hitSound", Boolean.valueOf(c0410bh.f1187aJ)).booleanValue();
        c0410bh.f1189aL = c1107ab.m683a(str, "targetGroundHeightOffset", Float.valueOf(c0410bh.f1189aL)).floatValue();
        c0410bh.f1188aK = c1107ab.m683a(str, "targetGroundSpread", Float.valueOf(c0410bh.f1188aK)).floatValue();
        c0410bh.f1190aM = c1107ab.m683a(str, "speedSpread", Float.valueOf(c0410bh.f1190aM)).floatValue();
        c0410bh.f1192aO = c1107ab.m685a(str, "explodeOnEndOfLife", Boolean.valueOf(c0410bh.f1192aO)).booleanValue();
        c0410bh.f1191aN = c1107ab.m685a(str, "ignoreParentShootDamageMultiplier", Boolean.valueOf(c0410bh.f1191aN)).booleanValue();
        c0410bh.f1193aP = c1107ab.m683a(str, "pushForce", Float.valueOf(c0410bh.f1193aP)).floatValue();
        c0410bh.f1194aQ = c1107ab.m683a(str, "pushVelocity", Float.valueOf(c0410bh.f1194aQ)).floatValue();
        c0410bh.f1195aR = c1107ab.m683a(str, "buildingDamageMultiplier", Float.valueOf(c0410bh.f1195aR)).floatValue();
        c0410bh.f1196aS = c1107ab.m683a(str, "shieldDamageMultiplier", Float.valueOf(c0410bh.f1196aS)).floatValue();
        c0410bh.f1197aT = c1107ab.m683a(str, "shieldDefectionMultiplier", Float.valueOf(c0410bh.f1197aT)).floatValue();
        c0410bh.f1198aU = c1107ab.m683a(str, "hullDamageMultiplier", Float.valueOf(c0410bh.f1198aU)).floatValue();
        c0410bh.f1199aV = c1107ab.m683a(str, "armourIgnoreAmount", Float.valueOf(c0410bh.f1199aV)).floatValue();
        c0410bh.f1200aW = c1107ab.m683a(str, "areaExpandTime", Float.valueOf(c0410bh.f1200aW)).floatValue();
        String m666b3 = c1107ab.m666b(str, "explodeEffect", (String) null);
        if (m666b3 != null) {
            c0410bh.f1201aX = c0458l.m3542a(m666b3, (C0473z) null);
        }
        String m666b4 = c1107ab.m666b(str, "explodeEffectOnShield", (String) null);
        if (m666b4 != null) {
            c0410bh.f1202aY = c0458l.m3542a(m666b4, (C0473z) null);
        }
        C0418bp m3877a = C0418bp.m3877a(c0458l, c1107ab, str, "spawnUnit");
        if (m3877a != null && !m3877a.m3872b()) {
            c0410bh.f1203aZ = m3877a;
        }
        c0410bh.f1204ba = c1107ab.m667b(str, "unloadUpToXUnitsFromSource", Integer.valueOf(c0410bh.f1204ba)).intValue();
        c0410bh.f1205bb = c1107ab.m685a(str, "teleportSource", Boolean.valueOf(c0410bh.f1205bb)).booleanValue();
        c0410bh.f1206bc = c1107ab.m685a(str, "convertHitToSourceTeam", Boolean.valueOf(c0410bh.f1206bc)).booleanValue();
        c0410bh.f1207bd = C0453g.m3681a(c1107ab.m666b(str, "tags", (String) null));
        C1136m m639k = c1107ab.m639k(str, "mutator");
        C1136m c1136m = new C1136m();
        Iterator it = m639k.iterator();
        while (it.hasNext()) {
            String[] split = ((String) it.next()).split("_");
            if (split.length > 1) {
                String str2 = split[0];
                String str3 = str2 + "_";
                if (!c1136m.contains(str3) && str2.length() > "mutator".length()) {
                    c1136m.add(str3);
                }
            }
        }
        Iterator it2 = c1136m.iterator();
        while (it2.hasNext()) {
            String str4 = (String) it2.next();
            C0190h c0190h = new C0190h();
            c0190h.f1211a = C0453g.m3681a(c1107ab.m666b(str, str4 + "ifUnitWithTags", (String) null));
            c0190h.f1212b = C0453g.m3681a(c1107ab.m666b(str, str4 + "ifUnitWithoutTags", (String) null));
            if (c0190h.f1211a == null && c0190h.f1212b == null) {
                throw new RuntimeException("[" + str + "]" + str4 + " requires: unitWithTags and/or unitWithoutTags");
            }
            c0190h.f1213c = c1107ab.m683a(str, str4 + "directDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            c0190h.f1214d = c1107ab.m683a(str, str4 + "areaDamageMultiplier", Float.valueOf(1.0f)).floatValue();
            C0429b m3840a = C0429b.m3840a(c0458l, c1107ab, str, str4 + "addResourcesDirectHit", true);
            if (m3840a != null && m3840a.m3817d()) {
                c0190h.f1215e = m3840a;
                if (c0410bh.f1118s) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesDirectHit doesn't work with targetGround, as it will never get direct hits (use addResourcesAreaHit)");
                }
            }
            C0429b m3840a2 = C0429b.m3840a(c0458l, c1107ab, str, str4 + "addResourcesAreaHit", true);
            if (m3840a2 != null && m3840a2.m3817d()) {
                c0190h.f1216f = m3840a2;
                if (m667b3 == null) {
                    throw new RuntimeException("[" + str + "]" + str4 + "addResourcesAreaHit requires areaRadius to be set");
                }
            }
            String m666b5 = c1107ab.m666b(str, str4 + "changedExplodeEffect", (String) null);
            if (m666b5 != null) {
                c0190h.f1217g = c0458l.m3542a(m666b5, (C0473z) null);
                if (c0190h.f1217g != null && !c0190h.f1217g.m3466a()) {
                    c0190h.f1217g = null;
                }
            }
            boolean z = false;
            boolean z2 = false;
            if (!C0773f.m2106k(c0190h.f1213c, 1.0f)) {
                z = true;
            }
            if (!C0773f.m2106k(c0190h.f1214d, 1.0f) && c0410bh.f1102c != 0 && c0410bh.f1108i > 0) {
                z2 = true;
            }
            if (c0190h.f1215e != null) {
                z = true;
            }
            if (c0190h.f1216f != null) {
                z2 = true;
            }
            if (z) {
                if (c0410bh.f1208be == null) {
                    c0410bh.f1208be = new C1136m();
                }
                c0410bh.f1208be.add(c0190h);
            }
            if (z2) {
                if (c0410bh.f1209bf == null) {
                    c0410bh.f1209bf = new C1136m();
                }
                c0410bh.f1104e = true;
                c0410bh.f1209bf.add(c0190h);
            }
            if (c0190h.f1217g != null) {
                if (c0410bh.f1210bg == null) {
                    c0410bh.f1210bg = new C1136m();
                }
                c0410bh.f1210bg.add(c0190h);
            }
        }
        if (c0410bh.f1102c != 0 && c0410bh.f1108i > 0) {
            c0410bh.f1104e = true;
        }
        if ((c0410bh.f1193aP != 0.0f || c0410bh.f1194aQ != 0.0f) && c0410bh.f1108i > 0) {
            c0410bh.f1104e = true;
        }
        c0410bh.f1105f = !c0410bh.f1104e;
        c0458l.f3290fT.add(c0410bh);
    }

    /* renamed from: a */
    public static void m3897a(C0410bh c0410bh, GameOutputStream gameOutputStream) {
        gameOutputStream.mo1386a(c0410bh.f2540bj);
        gameOutputStream.writeString(c0410bh.f2538bh);
    }

    /* renamed from: b */
    public static C0189g m3896b(GameInputStream gameInputStream) {
        InterfaceC0303as m1291q = gameInputStream.m1291q();
        String readString = gameInputStream.readString();
        if (m1291q == null) {
            return null;
        }
        if (!(m1291q instanceof C0458l)) {
            GameEngine.print("ProjectileTemplate:readInLinkCustom: Got non CustomUnitMetadata object of:" + m1291q.mo3513i() + " loading real_meta");
            return null;
        }
        C0410bh m3518f = ((C0458l) m1291q).m3518f(readString);
        if (m3518f == null) {
            GameEngine.print("ProjectileTemplate:readInLinkCustom: Could not find projectile with name:" + readString);
            return null;
        }
        return m3518f;
    }

    /* renamed from: a */
    public void m3899a(AbstractC0244am abstractC0244am, C0188f c0188f, AbstractC0244am abstractC0244am2, float f, float f2, float f3) {
        if (abstractC0244am2 == null) {
            c0188f.f1063aC = true;
            c0188f.f996n = f;
            c0188f.f997o = f2;
            if (this.f1188aK != 0.0f) {
                c0188f.f996n += C0773f.m2195a((AbstractC1155w) abstractC0244am, (int) ((-this.f1188aK) * 100.0f), (int) (this.f1188aK * 100.0f), 2) / 100.0f;
                abstractC0244am.f1592bC = (int) (abstractC0244am.f1592bC + c0188f.f996n);
                c0188f.f997o += C0773f.m2195a((AbstractC1155w) abstractC0244am, (int) ((-this.f1188aK) * 100.0f), (int) (this.f1188aK * 100.0f), 3) / 100.0f;
                abstractC0244am.f1592bC = (int) (abstractC0244am.f1592bC + c0188f.f997o);
            }
            c0188f.f998p = 0.0f;
            c0188f.f998p += this.f1189aL;
        } else if (c0188f.f995m) {
            c0188f.f1063aC = true;
            if (!this.f1135J) {
                float f4 = c0188f.f1002t;
                if (this.f1172au != -1.0f) {
                    f4 = this.f1172au;
                }
                if (this.f1136K >= 0.0f) {
                    f4 = this.f1136K;
                }
                PointF m4252a = abstractC0244am2.m4252a(c0188f.f7173eo, c0188f.f7174ep, f4, c0188f.f990h, f3);
                c0188f.f996n = m4252a.x;
                c0188f.f997o = m4252a.y;
            } else {
                c0188f.f996n = abstractC0244am2.f7173eo;
                c0188f.f997o = abstractC0244am2.f7174ep;
            }
            if (this.f1119t) {
                c0188f.f998p = abstractC0244am2.f7175eq;
            } else {
                c0188f.f998p = 0.0f;
            }
            c0188f.f998p += this.f1189aL;
            if (this.f1188aK != 0.0f) {
                c0188f.f996n += C0773f.m2195a((AbstractC1155w) abstractC0244am, (int) ((-this.f1188aK) * 100.0f), (int) (this.f1188aK * 100.0f), 2) / 100.0f;
                c0188f.f997o += C0773f.m2195a((AbstractC1155w) abstractC0244am, (int) ((-this.f1188aK) * 100.0f), (int) (this.f1188aK * 100.0f), 7) / 100.0f;
            }
        } else {
            c0188f.f994l = abstractC0244am2;
        }
    }
}