package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bi */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bi.class */
public class C0411bi {

    /* renamed from: a */
    C1136m f2541a;

    /* renamed from: b */
    public static final C0412bj f2542b = new C0412bj();

    /* renamed from: a */
    public static C0411bi m3892a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0411bi c0411bi) {
        String m666b = c1107ab.m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0411bi;
        }
        return m3891a(c0458l, m666b, str, str2, false);
    }

    /* renamed from: a */
    public static C0411bi m3891a(C0458l c0458l, String str, String str2, String str3, boolean z) {
        if (c0458l == null) {
            throw new RuntimeException("meta==null");
        }
        return m3890b(c0458l, str, str2, str3, z);
    }

    /* renamed from: b */
    public static C0411bi m3890b(C0458l c0458l, String str, String str2, String str3, boolean z) {
        int m3895a;
        String[] split;
        C0411bi c0411bi = new C0411bi();
        if (str == null || VariableScope.nullOrMissingString.equals(str) || "NONE".equalsIgnoreCase(str)) {
            return c0411bi;
        }
        if (c0458l == null) {
            throw new C0417bo("meta required");
        }
        Iterator it = C1118al.m582a(str, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] split2 = trim.split("\\(");
                    if (split2.length != 2) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " UnitList: Unexpected format for '" + trim + "' of " + str);
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
                C0413bk c0413bk = new C0413bk(c0458l.m3530b(str5, str3, str2));
                if (c0411bi.f2541a == null) {
                    c0411bi.f2541a = new C1136m();
                }
                c0413bk.f2549b = i;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0417bo("[" + str2 + "]" + str3 + " UnitList: Expected ')' in '" + trim + "' of " + str);
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
                                c0413bk.f2550c = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("maxSpawnLimit")) {
                                c0413bk.f2551d = C1107ab.m642i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("recursionLimit")) {
                                c0413bk.f2561n = C1107ab.m642i(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetX") || trim2.equalsIgnoreCase("xOffsetAbsolute")) {
                                c0413bk.f2552e = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetY") || trim2.equalsIgnoreCase("yOffsetAbsolute")) {
                                c0413bk.f2553f = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("xOffsetRelative")) {
                                c0413bk.f2556i = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("yOffsetRelative")) {
                                c0413bk.f2557j = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomXY")) {
                                float m644h = C1107ab.m644h(str2, str3, trim3);
                                c0413bk.f2558k = m644h;
                                c0413bk.f2559l = m644h;
                            } else if (trim2.equalsIgnoreCase("offsetRandomX")) {
                                c0413bk.f2558k = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomY")) {
                                c0413bk.f2559l = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetHeight")) {
                                c0413bk.f2554g = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetRandomDir")) {
                                c0413bk.f2560m = C1107ab.m644h(str2, str3, trim3);
                            } else if (trim2.equalsIgnoreCase("offsetDir")) {
                                c0413bk.f2555h = C1107ab.m644h(str2, str3, trim3);
                            } else {
                                throw new C0417bo("[" + str2 + "]" + str3 + " ProjectileList: Unknown parameter '" + trim2 + "' for '" + trim + "' of " + str);
                            }
                        }
                    }
                }
                c0411bi.f2541a.add(c0413bk);
            }
        }
        if (z && (m3895a = c0411bi.m3895a()) > 1) {
            throw new C0417bo("[" + str2 + "]" + str3 + " Too many units: " + m3895a + ", only single unit is allowed here");
        }
        return c0411bi;
    }

    /* renamed from: a */
    public int m3895a() {
        if (this.f2541a == null || this.f2541a.size() == 0) {
            return 0;
        }
        int i = 0;
        Iterator it = this.f2541a.iterator();
        while (it.hasNext()) {
            i += ((C0413bk) it.next()).f2549b;
        }
        return i;
    }

    /* renamed from: a */
    public void m3894a(float f, float f2, float f3, float f4, AbstractC0244am abstractC0244am, C1136m c1136m, boolean z, int i, C0188f c0188f, AbstractC0244am abstractC0244am2) {
        if (this.f2541a == null || this.f2541a.size() == 0) {
            return;
        }
        int i2 = 0;
        int i3 = 0;
        if (abstractC0244am == null) {
            GameEngine.m5777e("projectile spawn At: Skipping, source unit required");
            return;
        }
        Iterator it = this.f2541a.iterator();
        while (it.hasNext()) {
            C0413bk c0413bk = (C0413bk) it.next();
            C0410bh m3467f = c0413bk.f2548a.m3467f();
            if (m3467f == null) {
                GameEngine.m5777e("projectile spawn At: Skipping, projectileType==null");
            } else {
                for (int i4 = 0; i4 < c0413bk.f2549b; i4++) {
                    i3++;
                    if ((c0413bk.f2550c >= 1.0f || C0773f.m2197a(abstractC0244am, 0.0f, 1.0f, i3) <= c0413bk.f2550c) && i2 < c0413bk.f2551d && i <= c0413bk.f2561n) {
                        float f5 = f + c0413bk.f2552e;
                        float f6 = f2 + c0413bk.f2553f;
                        float f7 = f3 + c0413bk.f2554g;
                        float f8 = f4 + c0413bk.f2555h;
                        if (c0413bk.f2560m != 0.0f) {
                            f8 += C0773f.m2197a(abstractC0244am, -c0413bk.f2560m, c0413bk.f2560m, (i3 * 4) + 3);
                        }
                        if (c0413bk.f2558k != 0.0f) {
                            f5 += C0773f.m2197a(abstractC0244am, -c0413bk.f2558k, c0413bk.f2558k, (i3 * 2) + 1);
                        }
                        if (c0413bk.f2559l != 0.0f) {
                            f6 += C0773f.m2197a(abstractC0244am, -c0413bk.f2559l, c0413bk.f2559l, (i3 * 3) + 2);
                        }
                        if (c0413bk.f2556i != 0.0f || c0413bk.f2557j != 0.0f) {
                            float m2107k = C0773f.m2107k(f4);
                            float m2110j = C0773f.m2110j(f4);
                            float f9 = c0413bk.f2556i;
                            float f10 = c0413bk.f2557j;
                            f5 += (m2107k * f10) - (m2110j * f9);
                            f6 += (m2110j * f10) + (m2107k * f9);
                        }
                        C0188f m3651a = C0456j.m3651a(abstractC0244am, -1, m3467f, f5, f6, f7, f8);
                        m3651a.f1064aD = i;
                        if (c0188f != null && abstractC0244am != null) {
                            m3467f.m3899a(abstractC0244am, m3651a, c0188f.f994l, c0188f.f996n, c0188f.f997o, -1.0f);
                        }
                        m3893a(m3651a, c0413bk, abstractC0244am, c0188f, abstractC0244am2);
                        i2++;
                        if (c1136m != null) {
                            c1136m.add(m3651a);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3893a(C0188f c0188f, C0413bk c0413bk, AbstractC0244am abstractC0244am, C0188f c0188f2, AbstractC0244am abstractC0244am2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f2542b.f2543a = c0188f;
        f2542b.f2544b = c0413bk;
        f2542b.f2545c = abstractC0244am;
        f2542b.f2546d = c0188f2;
        f2542b.f2547e = abstractC0244am2;
        gameEngine.f6388cc.m3209a(c0188f.f7173eo, c0188f.f7174ep, 100.0f, null, 0.0f, f2542b);
    }
}