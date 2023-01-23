package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bi.class */
public class bi {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.gameFramework.utility.m f273a;
    public static final bj b = new bj();

    public static bi a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, bi biVar) {
        String b2 = abVar.b(str, str2, (String) null);
        if (b2 == null) {
            return biVar;
        }
        return a(lVar, b2, str, str2, false);
    }

    public static bi a(l lVar, String str, String str2, String str3, boolean z) {
        if (lVar == null) {
            throw new RuntimeException("meta==null");
        }
        return b(lVar, str, str2, str3, z);
    }

    public static bi b(l lVar, String str, String str2, String str3, boolean z) {
        int a2;
        String[] split;
        bi biVar = new bi();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return biVar;
        }
        if (lVar == null) {
            throw new bo("meta required");
        }
        Iterator it = com.corrodinggames.rts.gameFramework.utility.al.a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new bo("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
                    }
                    trim = split2[0];
                    str4 = split2[1].trim();
                }
                String[] split3 = trim.split("\\*");
                String str5 = split3[0];
                int i = 1;
                if (split3.length >= 2) {
                    i = Integer.parseInt(split3[1]);
                }
                bk bkVar = new bk(lVar.b(str5, str3, str2));
                if (biVar.f273a == null) {
                    biVar.f273a = new com.corrodinggames.rts.gameFramework.utility.m();
                }
                bkVar.b = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new bo("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
                    }
                    for (String str6 : str4.substring(0, str4.length() - 1).split("\\,")) {
                        if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] split4 = str6.split("\\=");
                            if (split4.length != 2) {
                                throw new RuntimeException("[" + str2 + "]" + str3 + " UnitList: Unexpected key format for '" + trim + "' of " + str);
                            }
                            String trim2 = split4[0].trim();
                            String trim3 = split4[1].trim();
                            if (trim2.equalsIgnoreCase("spawnChance")) {
                                bkVar.c = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                bkVar.d = com.corrodinggames.rts.gameFramework.utility.ab.i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("recursionLimit")) {
                                bkVar.n = com.corrodinggames.rts.gameFramework.utility.ab.i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX") || trim2.equalsIgnoreCase("xOffsetAbsolute")) {
                                bkVar.e = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY") || trim2.equalsIgnoreCase("yOffsetAbsolute")) {
                                bkVar.f = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("xOffsetRelative")) {
                                bkVar.i = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("yOffsetRelative")) {
                                bkVar.j = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float h = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                                bkVar.k = h;
                                bkVar.l = h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                bkVar.k = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                bkVar.l = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                bkVar.g = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                bkVar.m = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                bkVar.h = com.corrodinggames.rts.gameFramework.utility.ab.h(str2, str3, trim3);
                            } else {
                                throw new bo("[" + str2 + "]" + str3 + " ProjectileList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                }
                biVar.f273a.add(bkVar);
            }
        }
        if (z && (a2 = biVar.a()) > 1) {
            throw new bo("[" + str2 + "]" + str3 + " Too many units: " + a2 + ", only single unit is allowed here");
        }
        return biVar;
    }

    public int a() {
        if (this.f273a == null || this.f273a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f273a.iterator();
        while (it.hasNext()) {
            i += ((bk) it.next()).b;
        }
        return i;
    }

    public void a(float f, float f2, float f3, float f4, com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.gameFramework.utility.m mVar, boolean z, int i, com.corrodinggames.rts.game.f fVar, com.corrodinggames.rts.game.units.am amVar2) {
        if (this.f273a == null || this.f273a.size() == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        if (amVar == null) {
            GameEngine.m328e("projectile spawn At: Skipping, source unit required");
            return;
        }
        Iterator it = this.f273a.iterator();
        while (it.hasNext()) {
            bk bkVar = (bk) it.next();
            bh f5 = bkVar.f275a.f();
            if (f5 == null) {
                GameEngine.m328e("projectile spawn At: Skipping, projectileType==null");
            } else {
                for (int i4 = 0; i4 < bkVar.b; i4++) {
                    i3++;
                    if ((bkVar.c >= 1.0f || com.corrodinggames.rts.gameFramework.f.a(amVar, 0.0f, 1.0f, i3) <= bkVar.c) && i2 < bkVar.d && i <= bkVar.n) {
                        float f6 = f + bkVar.e;
                        float f7 = f2 + bkVar.f;
                        float f8 = f3 + bkVar.g;
                        float f9 = f4 + bkVar.h;
                        if (bkVar.m != 0.0f) {
                            f9 += com.corrodinggames.rts.gameFramework.f.a(amVar, -bkVar.m, bkVar.m, (i3 * 4) + 3);
                        }
                        if (bkVar.k != 0.0f) {
                            f6 += com.corrodinggames.rts.gameFramework.f.a(amVar, -bkVar.k, bkVar.k, (i3 * 2) + 1);
                        }
                        if (bkVar.l != 0.0f) {
                            f7 += com.corrodinggames.rts.gameFramework.f.a(amVar, -bkVar.l, bkVar.l, (i3 * 3) + 2);
                        }
                        if (bkVar.i != 0.0f || bkVar.j != 0.0f) {
                            float k = com.corrodinggames.rts.gameFramework.f.k(f4);
                            float j = com.corrodinggames.rts.gameFramework.f.j(f4);
                            float f10 = bkVar.i;
                            float f11 = bkVar.j;
                            f6 += (k * f11) - (j * f10);
                            f7 += (j * f11) + (k * f10);
                        }
                        com.corrodinggames.rts.game.f a2 = j.a(amVar, -1, f5, f6, f7, f8, f9);
                        a2.aD = i;
                        if (fVar != null && amVar != null) {
                            f5.a(amVar, a2, fVar.l, fVar.n, fVar.o, -1.0f);
                        }
                        a(a2, bkVar, amVar, fVar, amVar2);
                        i2++;
                        if (mVar != null) {
                            mVar.add(a2);
                        }
                    }
                }
            }
        }
    }

    public void a(com.corrodinggames.rts.game.f fVar, bk bkVar, com.corrodinggames.rts.game.units.am amVar, com.corrodinggames.rts.game.f fVar2, com.corrodinggames.rts.game.units.am amVar2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b.f274a = fVar;
        b.b = bkVar;
        b.c = amVar;
        b.d = fVar2;
        b.e = amVar2;
        gameEngine.cc.a(fVar.eo, fVar.ep, 100.0f, null, 0.0f, b);
    }
}