package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bp */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bp.class */
public class C0418bp {

    /* renamed from: a */
    C1136m f2658a;

    /* renamed from: a */
    public static C0418bp m3873a(String str, String str2, String str3) {
        return m3870b(null, str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0418bp m3877a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        return m3876a(c0458l, c1107ab.m666b(str, str2, (String) null), str, str2, false);
    }

    /* renamed from: b */
    public static C0418bp m3871b(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        return m3876a(c0458l, c1107ab.m666b(str, str2, (String) null), str, str2, true);
    }

    /* renamed from: a */
    public static C0418bp m3876a(C0458l c0458l, String str, String str2, String str3, boolean z) {
        if (c0458l == null) {
            throw new RuntimeException("meta==null");
        }
        return m3870b(c0458l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0418bp m3870b(C0458l c0458l, String str, String str2, String str3, boolean z) {
        int m3880a;
        C0418bp c0418bp = new C0418bp();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0418bp;
        }
        Iterator it = C1118al.m582a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m576b = C1118al.m576b(trim, "(");
                    if (m576b == null) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = m576b[0];
                    str4 = m576b[1].trim();
                }
                String[] split = trim.split("\\*");
                String str5 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0469v c0469v = new C0469v();
                c0469v.f3381a = str3;
                c0469v.f3382b = str2;
                c0469v.f3383c = str5;
                if (c0458l != null) {
                    c0458l.f3235p.add(c0469v);
                } else {
                    c0469v.mo3469a();
                }
                C0419bq c0419bq = new C0419bq(c0469v);
                if (c0418bp.f2658a == null) {
                    c0418bp.f2658a = new C1136m();
                }
                c0419bq.f2662d = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    Iterator it2 = C1118al.m581a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m576b2 = C1118al.m576b(str6, "=");
                            if (m576b2 == null) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = m576b2[0].trim();
                            String trim3 = m576b2[1].trim();
                            if (trim2.equalsIgnoreCase("neutralTeam")) {
                                c0419bq.f2663e = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                c0419bq.f2665g = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("aggressiveTeam")) {
                                c0419bq.f2664f = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                c0419bq.f2666h = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0419bq.f2667i = C1107ab.m642i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("techLevel")) {
                                c0419bq.f2671m = C1107ab.m642i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                c0419bq.f2668j = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                c0419bq.f2669k = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("falling")) {
                                c0419bq.f2670l = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                c0419bq.f2681w = (short) C1107ab.m642i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwaysStartDirAtZero")) {
                                c0419bq.f2672n = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                c0419bq.f2672n = C1107ab.m646g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX")) {
                                c0419bq.f2673o = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY")) {
                                c0419bq.f2674p = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m644h = C1107ab.m644h(str2, str3, trim3);
                                c0419bq.f2677s = m644h;
                                c0419bq.f2678t = m644h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0419bq.f2677s = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0419bq.f2678t = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0419bq.f2675q = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0419bq.f2679u = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0419bq.f2676r = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("addResources")) {
                                if (c0458l == null) {
                                    throw new C0417bo("[" + str2 + "]" + str3 + " addResources not supported from here");
                                }
                                try {
                                    c0419bq.f2680v = C0429b.m3825b(c0458l, trim3);
                                } catch (C0417bo e) {
                                    e.printStackTrace();
                                    throw new C0417bo("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                }
                            } else if (trim2.equalsIgnoreCase("spawnSource")) {
                                c0419bq.f2660b = C1107ab.m696a(trim3, c0458l, str2, str3, (LogicBoolean) null);
                            } else if (trim2.equalsIgnoreCase("copyWaypointsFrom")) {
                                c0419bq.f2661c = C1107ab.m696a(trim3, c0458l, str2, str3, (LogicBoolean) null);
                            } else {
                                throw new C0417bo("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                    if (c0419bq.f2665g && c0419bq.f2663e) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                    }
                    if (c0419bq.f2664f && c0419bq.f2663e) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and neutralTeam at same time in " + str);
                    }
                    if (c0419bq.f2664f && c0419bq.f2665g) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and setToTeamOfLastAttacker at same time in " + str);
                    }
                }
                c0418bp.f2658a.add(c0419bq);
            }
        }
        if (z && (m3880a = c0418bp.m3880a()) > 1) {
            throw new C0417bo("[" + str2 + "]" + str3 + " Too many units: " + m3880a + ", only single unit is allowed here");
        }
        return c0418bp;
    }

    /* renamed from: a */
    public int m3880a() {
        if (this.f2658a == null || this.f2658a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2658a.iterator();
        while (it.hasNext()) {
            i += ((C0419bq) it.next()).f2662d;
        }
        return i;
    }

    /* renamed from: b */
    public boolean m3872b() {
        if (this.f2658a == null || this.f2658a.size() == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3874a(C1136m c1136m, PlayerData playerData, AbstractC0244am abstractC0244am, boolean z) {
        m3878a(0.0f, 0.0f, 0.0f, 0.0f, playerData, false, abstractC0244am, c1136m, z);
    }

    /* renamed from: a */
    public void m3879a(float f, float f2, float f3, float f4, PlayerData playerData, boolean z, AbstractC0244am abstractC0244am) {
        m3878a(f, f2, f3, f4, playerData, z, abstractC0244am, null, false);
    }

    /* renamed from: a */
    public void m3878a(float f, float f2, float f3, float f4, PlayerData playerData, boolean z, AbstractC0244am abstractC0244am, C1136m c1136m, boolean z2) {
        if (this.f2658a == null || this.f2658a.size() == 0) {
            return;
        }
        boolean z3 = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        int i2 = 0;
        Iterator it = this.f2658a.iterator();
        while (it.hasNext()) {
            C0419bq c0419bq = (C0419bq) it.next();
            PlayerData playerData2 = playerData;
            AbstractC0244am abstractC0244am2 = abstractC0244am;
            float f5 = f;
            float f6 = f2;
            float f7 = f3;
            float f8 = f4;
            if (c0419bq.f2660b != null) {
                if (!(abstractC0244am2 instanceof AbstractC0629y)) {
                    GameEngine.print("spawnUnitsAt: sourceUnit!=OrderableUnit is:" + AbstractC0244am.m4256A(abstractC0244am2));
                } else {
                    AbstractC0244am readUnit = c0419bq.f2660b.readUnit((AbstractC0629y) abstractC0244am);
                    if (readUnit == null) {
                        GameEngine.print("spawnUnitsAt: spawnSource==null");
                    } else {
                        playerData2 = readUnit.f1614bX;
                        abstractC0244am2 = readUnit;
                        f5 = readUnit.f7172eo;
                        f6 = readUnit.f7173ep;
                        f7 = readUnit.f7174eq;
                        f8 = readUnit.f1623cg;
                        if (playerData2 == null) {
                            GameEngine.print("spawnUnitsAt: newSpawnSource.team==null");
                        }
                    }
                }
            }
            if (!z2) {
                if (playerData2.m4353w() > playerData2.m4352x() + 300) {
                    z3 = true;
                }
            } else if (playerData2.m4425a(true, false) > playerData2.m4352x() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str = str + "source:" + abstractC0244am2.m4221cB();
                }
                GameEngine.print("spawnUnitsAt: Skipping, too many units already on team:" + playerData2.site + " count:" + playerData2.m4353w() + " " + str);
                if (GameEngine.getGameEngine().f6444bl) {
                    playerData2.m4449W();
                }
            } else if (playerData2.m4357s() > playerData2.m4352x() + 25000) {
                String str2 = VariableScope.nullOrMissingString;
                if (abstractC0244am2 != null) {
                    str2 = str2 + "source:" + abstractC0244am2.m4221cB();
                }
                GameEngine.print("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + playerData2.site + " total count:" + playerData2.m4357s() + " " + str2);
                if (GameEngine.getGameEngine().f6444bl) {
                    playerData2.m4449W();
                }
            } else {
                InterfaceC0303as mo3471c = c0419bq.f2659a.mo3471c();
                if (mo3471c != null) {
                    for (int i3 = 0; i3 < c0419bq.f2662d; i3++) {
                        i2++;
                        PlayerData playerData3 = playerData2;
                        if (c0419bq.f2666h >= 1.0f || C0773f.m2197a(abstractC0244am2, 0.0f, 1.0f, i2) <= c0419bq.f2666h) {
                            if (c0419bq.f2665g) {
                                if (abstractC0244am2 != null && abstractC0244am2.f1583bt != null) {
                                    playerData3 = abstractC0244am2.f1583bt.f1614bX;
                                    if (playerData3 == null) {
                                        throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                    }
                                }
                            }
                            if (i >= c0419bq.f2667i) {
                                continue;
                            } else {
                                AbstractC0244am mo3564a = mo3471c.mo3564a();
                                if (c0419bq.f2663e) {
                                    playerData3 = PlayerData.f1373i;
                                }
                                if (c0419bq.f2664f) {
                                    playerData3 = PlayerData.f1372h;
                                }
                                if (playerData3 == null) {
                                    throw new RuntimeException("Team==null");
                                }
                                mo3564a.mo3583f(playerData3);
                                mo3564a.mo3669B(abstractC0244am2);
                                mo3564a.f7172eo = f5;
                                mo3564a.f7173ep = f6;
                                mo3564a.f7174eq = f7;
                                if (!mo3564a.mo3397bI() && !c0419bq.f2672n) {
                                    mo3564a.f1623cg = f8;
                                }
                                mo3564a.f7174eq += c0419bq.f2675q;
                                if (c0419bq.f2671m != -1 && (mo3564a instanceof AbstractC0629y)) {
                                    ((AbstractC0629y) mo3564a).mo3021a(c0419bq.f2671m);
                                }
                                float f9 = c0419bq.f2676r;
                                if (c0419bq.f2679u != 0.0f) {
                                    f9 += C0773f.m2197a(abstractC0244am2, -c0419bq.f2679u, c0419bq.f2679u, (i2 * 4) + 3);
                                }
                                if (f9 != 0.0f) {
                                    if (mo3564a instanceof AbstractC0629y) {
                                        ((AbstractC0629y) mo3564a).mo2860i(f9);
                                    } else {
                                        mo3564a.f1623cg += f9;
                                    }
                                }
                                mo3564a.f7172eo += i3;
                                if (c0419bq.f2677s != 0.0f) {
                                    mo3564a.f7172eo += C0773f.m2197a(abstractC0244am2, -c0419bq.f2677s, c0419bq.f2677s, (i2 * 2) + 1);
                                }
                                if (c0419bq.f2678t != 0.0f) {
                                    mo3564a.f7173ep += C0773f.m2197a(abstractC0244am2, -c0419bq.f2678t, c0419bq.f2678t, (i2 * 3) + 2);
                                }
                                if (c0419bq.f2668j) {
                                    gameEngine.f6323bL.m4629b(mo3564a.f7172eo, mo3564a.f7173ep);
                                    mo3564a.f7172eo = gameEngine.f6323bL.f802T;
                                    mo3564a.f7173ep = gameEngine.f6323bL.f803U;
                                    mo3564a.f7172eo += mo3564a.mo3319cZ();
                                    mo3564a.f7173ep += mo3564a.mo3318da();
                                }
                                mo3564a.f7172eo += c0419bq.f2673o;
                                mo3564a.f7173ep += c0419bq.f2674p;
                                i++;
                                if (c0419bq.f2669k && (mo3564a instanceof AbstractC0629y) && !((AbstractC0629y) mo3564a).mo2882c((PlayerData) null)) {
                                    mo3564a.m4210ci();
                                } else {
                                    if (c0419bq.f2670l && (mo3564a instanceof AbstractC0629y)) {
                                        mo3564a.mo3600dc();
                                    }
                                    if (c0419bq.f2680v != null) {
                                        c0419bq.f2680v.m3809h(mo3564a);
                                    }
                                    if (c0419bq.f2681w > 0 && abstractC0244am2 != null && (abstractC0244am2 instanceof C0456j)) {
                                        C0456j c0456j = (C0456j) abstractC0244am2;
                                        if (c0456j.f2895B != null) {
                                            for (int i4 = c0419bq.f2681w; i4 > 0; i4--) {
                                                int i5 = -1;
                                                int size = c0456j.f2895B.size() - 1;
                                                while (true) {
                                                    if (size >= 0) {
                                                        if (mo3564a.m4224c((AbstractC0244am) c0456j.f2895B.get(size), true)) {
                                                            i5 = size;
                                                            break;
                                                        } else {
                                                            size--;
                                                        }
                                                    } else {
                                                        break;
                                                    }
                                                }
                                                if (i5 == -1) {
                                                    break;
                                                }
                                                AbstractC0244am abstractC0244am3 = (AbstractC0244am) c0456j.f2895B.remove(i5);
                                                C1152y.m465a(abstractC0244am3, c0456j);
                                                c0456j.m3667D(abstractC0244am3);
                                                abstractC0244am3.f7172eo = mo3564a.f7172eo;
                                                abstractC0244am3.f7173ep = mo3564a.f7173ep;
                                                abstractC0244am3.f1623cg = mo3564a.f1623cg;
                                                if (abstractC0244am3 instanceof AbstractC0629y) {
                                                    ((AbstractC0629y) abstractC0244am3).m2935az();
                                                }
                                                if (!mo3564a.mo3241e(abstractC0244am3, true)) {
                                                    GameEngine.print("transportedUnitsToTransfer failed for: " + abstractC0244am3.m4221cB() + " to: " + mo3564a.m4221cB());
                                                    abstractC0244am3.m4210ci();
                                                }
                                            }
                                        }
                                    }
                                    PlayerData.m4401c(mo3564a);
                                    if (mo3564a.mo3397bI() && (mo3564a instanceof AbstractC0629y)) {
                                        gameEngine.f6332bU.m1176a((AbstractC0629y) mo3564a);
                                    }
                                    if (z && !mo3564a.mo1745u()) {
                                        GameEngine.getGameEngine().f6330bS.m1810k(mo3564a);
                                    }
                                    if (c0419bq.f2661c != null) {
                                        if (!(mo3564a instanceof AbstractC0629y)) {
                                            GameEngine.print("copyWaypointsFrom: spawnedUnit!=OrderableUnit is:" + AbstractC0244am.m4256A(abstractC0244am2));
                                        } else {
                                            AbstractC0244am readUnit2 = c0419bq.f2661c.readUnit((AbstractC0629y) abstractC0244am);
                                            if (readUnit2 != null) {
                                                if (!(readUnit2 instanceof AbstractC0629y)) {
                                                    GameEngine.print("copyWaypointsFrom: copyWaypointsFrom!=OrderableUnit is:" + AbstractC0244am.m4256A(abstractC0244am2));
                                                } else {
                                                    AbstractC0629y.m2995a((AbstractC0629y) readUnit2, (AbstractC0629y) mo3564a);
                                                }
                                            }
                                        }
                                    }
                                    if (c1136m != null) {
                                        c1136m.add(mo3564a);
                                    }
                                }
                            }
                        }
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
    }

    @Deprecated
    /* renamed from: a */
    public static C0418bp m3875a(GameInputStream gameInputStream, boolean z) {
        int readInt = gameInputStream.readInt();
        if (z && readInt == 0) {
            return null;
        }
        C0418bp c0418bp = new C0418bp();
        for (int i = 0; i < readInt; i++) {
            C0419bq c0419bq = new C0419bq(null);
            InterfaceC0303as m1291q = gameInputStream.m1291q();
            if (m1291q != null) {
                if (c0418bp.f2658a == null) {
                    c0418bp.f2658a = new C1136m();
                }
                c0419bq.f2659a = C0458l.m3560a(m1291q);
            }
            if (gameInputStream.m1311b() >= 75 && gameInputStream.readBoolean()) {
                c0419bq.f2662d = gameInputStream.readInt();
                c0419bq.f2663e = gameInputStream.readBoolean();
                c0419bq.f2665g = gameInputStream.readBoolean();
                if (gameInputStream.m1311b() >= 76) {
                    c0419bq.f2666h = gameInputStream.readFloat();
                }
            }
            if (m1291q != null) {
                c0418bp.f2658a.add(c0419bq);
            }
        }
        return c0418bp;
    }
}