package com.corrodinggames.rts.game.units.custom.b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.m.aa;
import com.corrodinggames.rts.gameFramework.m.ag;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/c.class */
public class c extends a {
    com.corrodinggames.rts.gameFramework.utility.m c = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m d = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m e = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m f = new com.corrodinggames.rts.gameFramework.utility.m();
    com.corrodinggames.rts.gameFramework.utility.m g = new com.corrodinggames.rts.gameFramework.utility.m();
    boolean h;

    /* renamed from: a */
    static Paint f254a = new Paint();
    static ag b = new ag();
    static final PointF i = new PointF();
    static final g j = new g(VariableScope.nullOrMissingString);
    static final Rect k = new Rect();
    static final RectF l = new RectF();

    public static d c(com.corrodinggames.rts.game.units.custom.l lVar, String str) {
        Iterator it = lVar.q.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (str.equalsIgnoreCase(dVar.f255a)) {
                return dVar;
            }
        }
        return null;
    }

    public static g a(com.corrodinggames.rts.game.units.custom.l lVar, String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return null;
        }
        g gVar = new g(str);
        lVar.a(gVar);
        return gVar;
    }

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar) {
        String str;
        com.corrodinggames.rts.gameFramework.utility.m mVar;
        c cVar = null;
        Iterator it = abVar.e("decal_").iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            lVar.a("1.15p9", 115009, str2, "decals");
            String substring = str2.substring("decal_".length());
            d dVar = new d();
            dVar.f255a = substring;
            if (substring.contains(",")) {
                throw new bo("[" + str2 + "]Decal name: '" + substring + "' cannot have ','");
            }
            if (substring.contains(" ")) {
                throw new bo("[" + str2 + "]Decal name: '" + substring + "' cannot have spaces");
            }
            if (substring.contains("(")) {
                throw new bo("[" + str2 + "]Decal name: '" + substring + "' cannot have '('");
            }
            dVar.G = (f) abVar.a(str2, "layer", f.onTop, f.class);
            dVar.H = abVar.a(str2, "order", Float.valueOf(0.0f)).floatValue();
            dVar.c = abVar.a(str2, "onlyWhenSelectedByOwnPlayer", (Boolean) false).booleanValue();
            dVar.d = abVar.a(str2, "onlyWhenSelectedByEnemyPlayer", (Boolean) false).booleanValue();
            dVar.e = abVar.a(str2, "onlyWhenSelectedByAllyNotOwnPlayer", (Boolean) false).booleanValue();
            dVar.f = abVar.a(str2, "onlyWhenSelectedByAnyPlayer", (Boolean) false).booleanValue();
            int i2 = dVar.c ? 0 + 1 : 0;
            if (dVar.d) {
                i2++;
            }
            if (dVar.e) {
                i2++;
            }
            if (dVar.f) {
                i2++;
            }
            if (i2 >= 2) {
                throw new bo("[" + str2 + "]Doesn't make sense to set more than one onlyWhenSelectedBy* to true at a time.");
            }
            if (i2 > 0) {
                dVar.b = true;
            } else {
                dVar.b = false;
            }
            dVar.g = abVar.a(str2, "includeParentsSelection", (Boolean) false).booleanValue();
            dVar.h = (q) abVar.a(str2, "onlyTeam", q.any, q.class);
            dVar.i = abVar.a(str2, "onlyPlayersWithUnitControl", (Boolean) false).booleanValue();
            dVar.j = abVar.a(str2, "onlyWithZoomLevelOrMore", Float.valueOf(0.0f)).floatValue();
            boolean z = false;
            if (dVar.G == f.beforeUI) {
                z = true;
            }
            dVar.k = abVar.a(str2, "onlyWhileActive", (Boolean) false).booleanValue();
            dVar.l = abVar.a(str2, "onlyWhileAlive", Boolean.valueOf(z)).booleanValue();
            dVar.m = abVar.a(str2, "onlyInPreview", (Boolean) false).booleanValue();
            dVar.n = abVar.a(str2, "onlyOnNonPreview", (Boolean) false).booleanValue();
            if (dVar.m && dVar.n) {
                throw new bo("[" + str2 + "]decal with both onlyInPreview and onlyOnNonPreview will never be visible");
            }
            if (dVar.j > 5.0f) {
                throw new bo("[" + str2 + "]decal with onlyWithZoomLevelOrMore:" + dVar.j + " will never be visible");
            }
            if (dVar.j < 0.0f) {
                throw new bo("[" + str2 + "]onlyWithZoomLevelOrMore:" + dVar.j + " cannot be less than zero");
            }
            Integer b2 = abVar.b(str2, "onlyOnBodyFrameOf", (Integer) null);
            if (b2 != null) {
                dVar.o = b2.intValue();
                if (dVar.o < 0) {
                    throw new bo("[" + str2 + "]onlyOnBodyFrameOf cannot be: " + dVar.o);
                }
            }
            LogicBoolean c = abVar.c(lVar, str2, "imageScale", null);
            if (c != null) {
                if (LogicBoolean.isStaticNumber(c)) {
                    dVar.p = LogicBoolean.getKnownStaticNumber(c);
                } else {
                    dVar.q = true;
                    dVar.r = c;
                }
            }
            LogicBoolean c2 = abVar.c(lVar, str2, "imageScaleX", null);
            LogicBoolean c3 = abVar.c(lVar, str2, "imageScaleY", null);
            if (c2 != null || c3 != null) {
                dVar.q = true;
                dVar.s = c2;
                dVar.t = c3;
            }
            Integer b3 = abVar.b(str2, "total_frames", (Integer) null);
            if (b3 != null) {
                dVar.J = b3.intValue();
                if (dVar.J < 1) {
                    throw new bo("[" + str2 + "] TOTAL_FRAMES cannot be: " + dVar.J + " (must be 1 or more)");
                }
            }
            dVar.M = abVar.a(str2, "frame_verticalOrdering", (Boolean) false).booleanValue();
            dVar.K = abVar.b(str2, "frame_width", (Integer) (-1)).intValue();
            dVar.L = abVar.b(str2, "frame_height", (Integer) (-1)).intValue();
            if (dVar.K != -1 && dVar.J != -1) {
                throw new bo("[" + str2 + "]TOTAL_FRAMES and frame_width cannot be both set");
            }
            if (dVar.L != -1 && dVar.L <= 0) {
                throw new bo("[" + str2 + "]frame_height cannot be: " + dVar.L);
            }
            if (dVar.K != -1 && dVar.K <= 0) {
                throw new bo("[" + str2 + "]frame_width cannot be: " + dVar.K);
            }
            if (dVar.J != -1 && dVar.J <= 0) {
                throw new bo("[" + str2 + "]TOTAL_FRAMES cannot be: " + dVar.J);
            }
            if (dVar.L != -1 || dVar.K != -1 || dVar.J != -1) {
                dVar.I = true;
            }
            boolean booleanValue = abVar.a(str2, "teamColors", (Boolean) false).booleanValue();
            com.corrodinggames.rts.gameFramework.m.e a2 = lVar.a(abVar, str2, "image");
            if (a2 != null) {
                e eVar = new e();
                eVar.f256a = a2;
                if (eVar.f256a != null && booleanValue) {
                    eVar.b = lVar.a(a2, lVar.ac);
                }
                eVar.a(dVar);
                dVar.v = eVar;
                dVar.u = true;
            }
            String b4 = abVar.b(str2, "imageStack", (String) null);
            if (b4 != null && !b4.equals(VariableScope.nullOrMissingString)) {
                dVar.u = true;
                ArrayList arrayList = new ArrayList();
                for (String str3 : b4.split(",")) {
                    String trim = str3.trim();
                    boolean z2 = booleanValue;
                    String str4 = null;
                    if (trim.contains("(") && trim.contains(")")) {
                        String[] b5 = al.b(trim, "(");
                        if (b5 == null) {
                            throw new bo("[" + str2 + "]imageStack: Unexpected format for: " + b4);
                        }
                        trim = b5[0];
                        str4 = b5[1].trim();
                    }
                    String[] split = trim.split("\\*");
                    String str5 = split[0];
                    int i3 = 1;
                    if (split.length >= 2) {
                        i3 = Integer.parseInt(split[1]);
                    }
                    if (str4 != null) {
                        if (!str4.endsWith(")")) {
                            throw new bo("[" + str2 + "]imageStack: Missing ')' in: " + b4);
                        }
                        Iterator it2 = al.a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                        while (it2.hasNext()) {
                            String str6 = (String) it2.next();
                            if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                                String[] b6 = al.b(str6, "=");
                                if (b6 == null) {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unexpected key format for: " + b4);
                                }
                                String trim2 = b6[0].trim();
                                String trim3 = b6[1].trim();
                                if (trim2.equalsIgnoreCase("teamColors")) {
                                    z2 = ab.g(str2, "imageStack", trim3);
                                } else if (trim2.equalsIgnoreCase("teamColor")) {
                                    z2 = ab.g(str2, "imageStack", trim3);
                                } else {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unknown parameter: " + trim2);
                                }
                            }
                        }
                    }
                    e eVar2 = new e();
                    eVar2.f256a = lVar.a(lVar.F, str5, lVar.ab, str2, "imageStack");
                    if (eVar2.f256a == null) {
                        throw new bo("[" + str2 + "]failed to load image " + str5);
                    }
                    if (z2) {
                        eVar2.b = lVar.a(eVar2.f256a, lVar.ac);
                    }
                    eVar2.a(dVar);
                    for (int i4 = 0; i4 < i3; i4++) {
                        arrayList.add(eVar2);
                    }
                }
                if (arrayList.size() > 0) {
                    dVar.w = (e[]) arrayList.toArray(new e[0]);
                }
            }
            dVar.x = abVar.a(str2, "stack_hOffset", Float.valueOf(1.0f)).floatValue();
            dVar.y = abVar.b(str2, "stack_frameOffset", (Integer) 0).intValue();
            dVar.A = abVar.c(lVar, str2, "stack_indexStart", null);
            dVar.B = abVar.c(lVar, str2, "stack_indexCount", null);
            Boolean a3 = abVar.a(str2, "stack_drawInReverseOrder", (Boolean) null);
            if ((a3 != null && a3.booleanValue()) || (a3 == null && dVar.x < 0.0f)) {
                dVar.z = true;
            }
            dVar.N = abVar.a(lVar, str2, "frame", (LogicBoolean) null, LogicBoolean.ReturnType.number);
            dVar.O = abVar.b(str2, "addBodyFrameMultipliedBy", (Integer) 0).intValue();
            dVar.F = abVar.a(lVar, str2, "isVisible", (LogicBoolean) null);
            dVar.R = abVar.a(str2, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
            dVar.S = abVar.a(str2, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
            dVar.W = abVar.c(lVar, str2, "xOffsetAbsolute", null);
            dVar.X = abVar.c(lVar, str2, "yOffsetAbsolute", null);
            if (LogicBoolean.isStaticNumber(dVar.W)) {
                dVar.T = LogicBoolean.getKnownStaticNumber(dVar.W);
                dVar.W = null;
            }
            if (LogicBoolean.isStaticNumber(dVar.X)) {
                dVar.U = LogicBoolean.getKnownStaticNumber(dVar.X);
                dVar.X = null;
            }
            dVar.V = abVar.a(str2, "hOffset", Float.valueOf(0.0f)).floatValue();
            dVar.aa = abVar.a(str2, "dirOffset", Float.valueOf(0.0f)).floatValue();
            dVar.ab = abVar.a(str2, "pivotOffset", Float.valueOf(0.0f)).floatValue();
            dVar.Y = abVar.a(str2, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
            dVar.Z = abVar.a(str2, "alwaysStartHeightAtZero", (Boolean) false).booleanValue();
            if (dVar.R != 0.0f) {
            }
            dVar.ac = abVar.b(lVar, str2, "basePosition", null);
            dVar.ad = abVar.b(lVar, str2, "drawLineTo", null);
            String b7 = abVar.b(str2, "basePositionFromLegEnd", (String) null);
            if (b7 != null || 0 != 0) {
                if (b7 != null && 0 != 0) {
                    throw new bo("[" + str2 + "]basePositionFromLegEnd and basePositionFromLegMiddle cannot be used at the same time");
                }
                if (0 != 0) {
                    str = null;
                    dVar.af = true;
                } else {
                    str = b7;
                }
                dVar.ae = lVar.b(str);
                if (dVar.ae == -1) {
                    throw new bo("[" + str2 + "]basePositionFromLeg* failed to find: " + str);
                }
            }
            String b8 = abVar.b(str2, "basePositionFromTurret", (String) null);
            if (b8 != null) {
                bn e = lVar.e(b8);
                if (e == null) {
                    throw new bo("[" + str2 + "]basePositionFromTurret failed to find: " + b8);
                }
                dVar.ag = e.e;
            }
            if (dVar.ae != -1 && dVar.ag != -1) {
                throw new bo("[" + str2 + "]basePositionFromTurret and basePositionFromLeg cannot be used at the same time");
            }
            if ((dVar.ae != -1 || dVar.ag != -1) && dVar.ac != null) {
                throw new bo("[" + str2 + "]basePositionFromTurret/basePositionFromLeg cannot be used at the same time as basePosition");
            }
            dVar.C = lVar.a(abVar, str2, "image_shadow");
            dVar.D = abVar.a(str2, "shadowOffsetX", Float.valueOf(1.0f)).floatValue();
            dVar.E = abVar.a(str2, "shadowOffsetY", Float.valueOf(1.0f)).floatValue();
            dVar.P = abVar.a(str2, "color", (Integer) (-1)).intValue();
            dVar.Q = abVar.a(str2, "lineWidth", Float.valueOf(1.0f)).floatValue();
            float f = 1.0f;
            LogicBoolean c4 = abVar.c(lVar, str2, "alpha", null);
            if (c4 != null) {
                if (LogicBoolean.isStaticNumber(c4)) {
                    float knownStaticNumber = LogicBoolean.getKnownStaticNumber(c4);
                    if (knownStaticNumber < 0.0f || knownStaticNumber > 1.0f) {
                        throw new bo("[" + str2 + "]alpha should be between 0-1");
                    }
                    f = knownStaticNumber;
                } else {
                    dVar.ai = c4;
                }
            }
            if (dVar.P != -1 || dVar.Q != 1.0f || f != 1.0f) {
                dVar.ah = new ag();
                dVar.ah.b(dVar.P);
                if (dVar.P != -1) {
                    aa.a(dVar.ah);
                }
                int f2 = (int) (dVar.ah.f() * f);
                if (f2 < 0) {
                    f2 = 0;
                }
                if (f2 > 255) {
                    f2 = 255;
                }
                dVar.ah.c(f2);
                dVar.ah.a(dVar.Q);
            }
            boolean z3 = true;
            if (LogicBoolean.isStaticFalse(dVar.F)) {
                z3 = false;
            }
            if (dVar.ad == null && !dVar.u) {
                z3 = false;
            }
            if (f == 0.0f) {
                z3 = false;
            }
            lVar.q.add(dVar);
            if (z3) {
                if (cVar == null) {
                    cVar = new c();
                    lVar.b(cVar);
                }
                if (!dVar.b) {
                    cVar.h = true;
                }
                if (dVar.C != null && dVar.G != f.shadow) {
                    cVar.c.add(dVar);
                }
                if (dVar.G == f.afterBody) {
                    mVar = cVar.f;
                } else if (dVar.G == f.beforeBody) {
                    mVar = cVar.e;
                } else if (dVar.G == f.beforeUI) {
                    mVar = cVar.g;
                } else if (dVar.G == f.shadow) {
                    mVar = cVar.c;
                } else if (dVar.G == f.inactive) {
                    mVar = null;
                } else {
                    mVar = cVar.d;
                }
                if (mVar != null) {
                    mVar.add(dVar);
                    Collections.sort(mVar);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void b(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        GameEngine.getGameEngine();
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void a(com.corrodinggames.rts.game.units.custom.j jVar) {
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void d(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        a(jVar, f, f.shadow, this.c);
        a(jVar, f, f.beforeBody, this.e);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void e(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        a(jVar, f, f.afterBody, this.f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void c(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        a(jVar, f, f.onTop, this.d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.b.a
    public void f(com.corrodinggames.rts.game.units.custom.j jVar, float f) {
        a(jVar, f, f.beforeUI, this.g);
    }

    public static Rect a(d dVar, e eVar, com.corrodinggames.rts.gameFramework.m.e eVar2, int i2) {
        int i3 = eVar.c;
        int i4 = eVar.d;
        int i5 = 0;
        int i6 = 0;
        if (i2 > 0) {
            if (!dVar.M) {
                int i7 = 0;
                int i8 = i2;
                int i9 = eVar.f;
                if (i2 >= i9) {
                    i7 = 0 + (i2 / i9);
                    i8 = i2 % i9;
                }
                i5 = i8 * i3;
                i6 = i7 * i4;
            } else {
                int i10 = i2;
                int i11 = 0;
                int i12 = eVar.e;
                if (i2 >= i12) {
                    i11 = 0 + (i2 / i12);
                    i10 = i2 % i12;
                }
                i5 = i11 * i3;
                i6 = i10 * i4;
            }
        }
        Rect rect = k;
        rect.f47a = i5;
        rect.b = i6;
        rect.c = i5 + i3;
        rect.d = i6 + i4;
        return rect;
    }

    public static RectF a(d dVar, e eVar, com.corrodinggames.rts.gameFramework.m.e eVar2, float f, float f2) {
        int i2 = eVar.c;
        int i3 = eVar.d;
        float f3 = f - (i2 / 2);
        float f4 = f2 - (i3 / 2);
        RectF rectF = l;
        rectF.f48a = f3;
        rectF.c = f3 + i2;
        rectF.b = f4;
        rectF.d = f4 + i3;
        return rectF;
    }

    public final void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, f fVar, com.corrodinggames.rts.gameFramework.utility.m mVar) {
        a(jVar, f, fVar, mVar, (PointF) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:459:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:462:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:465:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:468:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:471:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:476:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:482:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:574:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:577:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x096e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final void a(com.corrodinggames.rts.game.units.custom.j r7, float r8, com.corrodinggames.rts.game.units.custom.b.f r9, com.corrodinggames.rts.gameFramework.utility.m r10, android.graphics.PointF r11) {
        /*
            Method dump skipped, instructions count: 2421
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.b.c.a(com.corrodinggames.rts.game.units.custom.j, float, com.corrodinggames.rts.game.units.custom.b.f, com.corrodinggames.rts.gameFramework.utility.m, android.graphics.PointF):void");
    }
}