package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bp.class */
public class bp {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.gameFramework.utility.m f279a;

    public static bp a(String str, String str2, String str3) {
        return b(null, str, str2, str3, false);
    }

    public static bp a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2) {
        return a(lVar, abVar.b(str, str2, (String) null), str, str2, false);
    }

    public static bp b(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2) {
        return a(lVar, abVar.b(str, str2, (String) null), str, str2, true);
    }

    public static bp a(l lVar, String str, String str2, String str3, boolean z) {
        if (lVar == null) {
            throw new RuntimeException("meta==null");
        }
        return b(lVar, str, str2, str3, z);
    }

    public static bp b(l lVar, String str, String str2, String str3, boolean z) {
        int a2;
        bp bpVar = new bp();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return bpVar;
        }
        Iterator it = com.corrodinggames.rts.gameFramework.utility.al.a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] b = com.corrodinggames.rts.gameFramework.utility.al.b(trim, "(");
                    if (b == null) {
                        throw new bo("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = b[0];
                    str4 = b[1].trim();
                }
                String[] split = trim.split("\\*");
                String str5 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                v vVar = new v();
                vVar.f321a = str3;
                vVar.b = str2;
                vVar.c = str5;
                if (lVar != null) {
                    lVar.p.add(vVar);
                } else {
                    vVar.a();
                }
                bq bqVar = new bq(vVar);
                if (bpVar.f279a == null) {
                    bpVar.f279a = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bqVar.d = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new bo("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    Iterator it2 = com.corrodinggames.rts.gameFramework.utility.al.a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str6 = (String) it2.next();
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] b2 = com.corrodinggames.rts.gameFramework.utility.al.b(str6, "=");
                            if (b2 == null) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = b2[0].trim();
                            String trim3 = b2[1].trim();
                            if (trim2.equalsIgnoreCase("neutralTeam")) {
                                bqVar.e = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("setToTeamOfLastAttacker")) {
                                bqVar.g = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("aggressiveTeam")) {
                                bqVar.f = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("spawnChance")) {
                                bqVar.h = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                bqVar.i = com.corrodinggames.rts.gameFramework.utility.ab.i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("techLevel")) {
                                bqVar.m = com.corrodinggames.rts.gameFramework.utility.ab.i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("gridAlign")) {
                                bqVar.j = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("skipIfOverlapping")) {
                                bqVar.k = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("falling")) {
                                bqVar.l = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("transportedUnitsToTransfer")) {
                                bqVar.w = (short) com.corrodinggames.rts.gameFramework.utility.ab.i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwaysStartDirAtZero")) {
                                bqVar.n = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("alwayStartDirAtZero")) {
                                bqVar.n = com.corrodinggames.rts.gameFramework.utility.ab.g(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX")) {
                                bqVar.o = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY")) {
                                bqVar.p = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float h = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                                bqVar.s = h;
                                bqVar.t = h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                bqVar.s = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                bqVar.t = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                bqVar.q = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                bqVar.u = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                bqVar.r = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("addResources")) {
                                if (lVar == null) {
                                    throw new bo("[" + str2 + "]" + str3 + " addResources not supported from here");
                                }
                                try {
                                    bqVar.v = com.corrodinggames.rts.game.units.custom.d.b.b(lVar, trim3);
                                } catch (bo e) {
                                    e.printStackTrace();
                                    throw new bo("[" + str2 + "]" + str3 + " addResources:" + e.getMessage());
                                }
                            } else if (trim2.equalsIgnoreCase("spawnSource")) {
                                bqVar.b = com.corrodinggames.rts.gameFramework.utility.ab.a(trim3, lVar, str2, str3, (LogicBoolean) null);
                            } else if (trim2.equalsIgnoreCase("copyWaypointsFrom")) {
                                bqVar.c = com.corrodinggames.rts.gameFramework.utility.ab.a(trim3, lVar, str2, str3, (LogicBoolean) null);
                            } else {
                                throw new bo("[" + str2 + "]" + str3 + " UnitList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                    if (bqVar.g && bqVar.e) {
                        throw new bo("[" + str2 + "]" + str3 + " Cannot set setToTeamOfLastAttacker and neutralTeam at same time in " + str);
                    }
                    if (bqVar.f && bqVar.e) {
                        throw new bo("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and neutralTeam at same time in " + str);
                    }
                    if (bqVar.f && bqVar.g) {
                        throw new bo("[" + str2 + "]" + str3 + " Cannot set aggressiveTeam and setToTeamOfLastAttacker at same time in " + str);
                    }
                }
                bpVar.f279a.add(bqVar);
            }
        }
        if (z && (a2 = bpVar.a()) > 1) {
            throw new bo("[" + str2 + "]" + str3 + " Too many units: " + a2 + ", only single unit is allowed here");
        }
        return bpVar;
    }

    public int a() {
        if (this.f279a == null || this.f279a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f279a.iterator();
        while (it.hasNext()) {
            i += ((bq) it.next()).d;
        }
        return i;
    }

    public boolean b() {
        if (this.f279a == null || this.f279a.size() == 0) {
            return true;
        }
        return false;
    }

    public void a(com.corrodinggames.rts.gameFramework.utility.m mVar, PlayerData playerData, com.corrodinggames.rts.game.units.am amVar, boolean z) {
        a(0.0f, 0.0f, 0.0f, 0.0f, playerData, false, amVar, mVar, z);
    }

    public void a(float f, float f2, float f3, float f4, PlayerData playerData, boolean z, com.corrodinggames.rts.game.units.am amVar) {
        a(f, f2, f3, f4, playerData, z, amVar, null, false);
    }

    public void a(float f, float f2, float f3, float f4, PlayerData playerData, boolean z, com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.gameFramework.utility.m mVar, boolean z2) {
        if (this.f279a == null || this.f279a.size() == 0) {
            return;
        }
        boolean z3 = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        int i2 = 0;
        Iterator it = this.f279a.iterator();
        while (it.hasNext()) {
            bq bqVar = (bq) it.next();
            PlayerData playerData2 = playerData;
            com.corrodinggames.rts.game.units.am amVar2 = amVar;
            float f5 = f;
            float f6 = f2;
            float f7 = f3;
            float f8 = f4;
            if (bqVar.b != null) {
                if (!(amVar2 instanceof com.corrodinggames.rts.game.units.y)) {
                    GameEngine.print("spawnUnitsAt: sourceUnit!=OrderableUnit is:" + com.corrodinggames.rts.game.units.am.A(amVar2));
                } else {
                    com.corrodinggames.rts.game.units.am readUnit = bqVar.b.readUnit((com.corrodinggames.rts.game.units.y) amVar);
                    if (readUnit == null) {
                        GameEngine.print("spawnUnitsAt: spawnSource==null");
                    } else {
                        playerData2 = readUnit.bX;
                        amVar2 = readUnit;
                        f5 = readUnit.eo;
                        f6 = readUnit.ep;
                        f7 = readUnit.eq;
                        f8 = readUnit.cg;
                        if (playerData2 == null) {
                            GameEngine.print("spawnUnitsAt: newSpawnSource.team==null");
                        }
                    }
                }
            }
            if (!z2) {
                if (playerData2.w() > playerData2.x() + 300) {
                    z3 = true;
                }
            } else if (playerData2.a(true, false) > playerData2.x() + 20000) {
                z3 = true;
            }
            if (z3) {
                String str = VariableScope.nullOrMissingString;
                if (amVar2 != null) {
                    str = str + "source:" + amVar2.cB();
                }
                GameEngine.print("spawnUnitsAt: Skipping, too many units already on team:" + playerData2.k + " count:" + playerData2.w() + " " + str);
                if (GameEngine.getGameEngine().bl) {
                    playerData2.W();
                }
            } else if (playerData2.s() > playerData2.x() + 25000) {
                String str2 = VariableScope.nullOrMissingString;
                if (amVar2 != null) {
                    str2 = str2 + "source:" + amVar2.cB();
                }
                GameEngine.print("spawnUnitsAt: Failsafe, too many units already on team (including ignored):" + playerData2.k + " total count:" + playerData2.s() + " " + str2);
                if (GameEngine.getGameEngine().bl) {
                    playerData2.W();
                }
            } else {
                com.corrodinggames.rts.game.units.as c = bqVar.f280a.c();
                if (c != null) {
                    for (int i3 = 0; i3 < bqVar.d; i3++) {
                        i2++;
                        PlayerData playerData3 = playerData2;
                        if (bqVar.h >= 1.0f || com.corrodinggames.rts.gameFramework.f.a(amVar2, 0.0f, 1.0f, i2) <= bqVar.h) {
                            if (bqVar.g) {
                                if (amVar2 != null && amVar2.bt != null) {
                                    playerData3 = amVar2.bt.bX;
                                    if (playerData3 == null) {
                                        throw new RuntimeException("setToTeamOfLastAttacker targetTeam==null");
                                    }
                                }
                            }
                            if (i >= bqVar.i) {
                                continue;
                            } else {
                                com.corrodinggames.rts.game.units.am a2 = c.a();
                                if (bqVar.e) {
                                    playerData3 = PlayerData.i;
                                }
                                if (bqVar.f) {
                                    playerData3 = PlayerData.h;
                                }
                                if (playerData3 == null) {
                                    throw new RuntimeException("Team==null");
                                }
                                a2.f(playerData3);
                                a2.B(amVar2);
                                a2.eo = f5;
                                a2.ep = f6;
                                a2.eq = f7;
                                if (!a2.bI() && !bqVar.n) {
                                    a2.cg = f8;
                                }
                                a2.eq += bqVar.q;
                                if (bqVar.m != -1 && (a2 instanceof com.corrodinggames.rts.game.units.y)) {
                                    ((com.corrodinggames.rts.game.units.y) a2).a(bqVar.m);
                                }
                                float f9 = bqVar.r;
                                if (bqVar.u != 0.0f) {
                                    f9 += com.corrodinggames.rts.gameFramework.f.a(amVar2, -bqVar.u, bqVar.u, (i2 * 4) + 3);
                                }
                                if (f9 != 0.0f) {
                                    if (a2 instanceof com.corrodinggames.rts.game.units.y) {
                                        ((com.corrodinggames.rts.game.units.y) a2).i(f9);
                                    } else {
                                        a2.cg += f9;
                                    }
                                }
                                a2.eo += i3;
                                if (bqVar.s != 0.0f) {
                                    a2.eo += com.corrodinggames.rts.gameFramework.f.a(amVar2, -bqVar.s, bqVar.s, (i2 * 2) + 1);
                                }
                                if (bqVar.t != 0.0f) {
                                    a2.ep += com.corrodinggames.rts.gameFramework.f.a(amVar2, -bqVar.t, bqVar.t, (i2 * 3) + 2);
                                }
                                if (bqVar.j) {
                                    gameEngine.bL.b(a2.eo, a2.ep);
                                    a2.eo = gameEngine.bL.T;
                                    a2.ep = gameEngine.bL.U;
                                    a2.eo += a2.cZ();
                                    a2.ep += a2.da();
                                }
                                a2.eo += bqVar.o;
                                a2.ep += bqVar.p;
                                i++;
                                if (bqVar.k && (a2 instanceof com.corrodinggames.rts.game.units.y) && !((com.corrodinggames.rts.game.units.y) a2).c((PlayerData) null)) {
                                    a2.ci();
                                } else {
                                    if (bqVar.l && (a2 instanceof com.corrodinggames.rts.game.units.y)) {
                                        a2.dc();
                                    }
                                    if (bqVar.v != null) {
                                        bqVar.v.h(a2);
                                    }
                                    if (bqVar.w > 0 && amVar2 != null && (amVar2 instanceof j)) {
                                        j jVar = (j) amVar2;
                                        if (jVar.B != null) {
                                            for (int i4 = bqVar.w; i4 > 0; i4--) {
                                                int i5 = -1;
                                                int size = jVar.B.size() - 1;
                                                while (true) {
                                                    if (size >= 0) {
                                                        if (a2.c((com.corrodinggames.rts.game.units.am) jVar.B.get(size), true)) {
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
                                                com.corrodinggames.rts.game.units.am amVar3 = (com.corrodinggames.rts.game.units.am) jVar.B.remove(i5);
                                                com.corrodinggames.rts.gameFramework.utility.y.a(amVar3, jVar);
                                                jVar.D(amVar3);
                                                amVar3.eo = a2.eo;
                                                amVar3.ep = a2.ep;
                                                amVar3.cg = a2.cg;
                                                if (amVar3 instanceof com.corrodinggames.rts.game.units.y) {
                                                    ((com.corrodinggames.rts.game.units.y) amVar3).az();
                                                }
                                                if (!a2.e(amVar3, true)) {
                                                    GameEngine.print("transportedUnitsToTransfer failed for: " + amVar3.cB() + " to: " + a2.cB());
                                                    amVar3.ci();
                                                }
                                            }
                                        }
                                    }
                                    PlayerData.c(a2);
                                    if (a2.bI() && (a2 instanceof com.corrodinggames.rts.game.units.y)) {
                                        gameEngine.bU.a((com.corrodinggames.rts.game.units.y) a2);
                                    }
                                    if (z && !a2.u()) {
                                        GameEngine.getGameEngine().bS.k(a2);
                                    }
                                    if (bqVar.c != null) {
                                        if (!(a2 instanceof com.corrodinggames.rts.game.units.y)) {
                                            GameEngine.print("copyWaypointsFrom: spawnedUnit!=OrderableUnit is:" + com.corrodinggames.rts.game.units.am.A(amVar2));
                                        } else {
                                            com.corrodinggames.rts.game.units.am readUnit2 = bqVar.c.readUnit((com.corrodinggames.rts.game.units.y) amVar);
                                            if (readUnit2 != null) {
                                                if (!(readUnit2 instanceof com.corrodinggames.rts.game.units.y)) {
                                                    GameEngine.print("copyWaypointsFrom: copyWaypointsFrom!=OrderableUnit is:" + com.corrodinggames.rts.game.units.am.A(amVar2));
                                                } else {
                                                    com.corrodinggames.rts.game.units.y.a((com.corrodinggames.rts.game.units.y) readUnit2, (com.corrodinggames.rts.game.units.y) a2);
                                                }
                                            }
                                        }
                                    }
                                    if (mVar != null) {
                                        mVar.add(a2);
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
    public static bp a(GameInputStream gameInputStream, boolean z) {
        int readInt = gameInputStream.readInt();
        if (z && readInt == 0) {
            return null;
        }
        bp bpVar = new bp();
        for (int i = 0; i < readInt; i++) {
            bq bqVar = new bq(null);
            com.corrodinggames.rts.game.units.as q = gameInputStream.q();
            if (q != null) {
                if (bpVar.f279a == null) {
                    bpVar.f279a = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bqVar.f280a = l.a(q);
            }
            if (gameInputStream.b() >= 75 && gameInputStream.readBoolean()) {
                bqVar.d = gameInputStream.readInt();
                bqVar.e = gameInputStream.readBoolean();
                bqVar.g = gameInputStream.readBoolean();
                if (gameInputStream.b() >= 76) {
                    bqVar.h = gameInputStream.readFloat();
                }
            }
            if (q != null) {
                bpVar.f279a.add(bqVar);
            }
        }
        return bpVar;
    }
}