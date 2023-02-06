package com.corrodinggames.rts.game.units.custom.b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.ba;
import com.corrodinggames.rts.game.units.custom.bn;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.aa;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.ai;
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
    static Paint a = new Paint();
    static ag b = new ag();
    static final PointF i = new PointF();
    static final g j = new g(VariableScope.nullOrMissingString);
    static final Rect k = new Rect();
    static final RectF l = new RectF();

    /* JADX INFO: Access modifiers changed from: private */
    public static d c(com.corrodinggames.rts.game.units.custom.l lVar, String str) {
        Iterator it = lVar.q.iterator();
        while (it.hasNext()) {
            d dVar = (d) it.next();
            if (str.equalsIgnoreCase(dVar.a)) {
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
            dVar.a = substring;
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
            com.corrodinggames.rts.gameFramework.unitAction.e a2 = lVar.a(abVar, str2, "image");
            if (a2 != null) {
                e eVar = new e();
                eVar.a = a2;
                if (eVar.a != null && booleanValue) {
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
                    eVar2.a = lVar.a(lVar.F, str5, lVar.ab, str2, "imageStack");
                    if (eVar2.a == null) {
                        throw new bo("[" + str2 + "]failed to load image " + str5);
                    }
                    if (z2) {
                        eVar2.b = lVar.a(eVar2.a, lVar.ac);
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

    public static Rect a(d dVar, e eVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar2, int i2) {
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
        rect.a = i5;
        rect.b = i6;
        rect.c = i5 + i3;
        rect.d = i6 + i4;
        return rect;
    }

    public static RectF a(d dVar, e eVar, com.corrodinggames.rts.gameFramework.unitAction.e eVar2, float f, float f2) {
        int i2 = eVar.c;
        int i3 = eVar.d;
        float f3 = f - (i2 / 2);
        float f4 = f2 - (i3 / 2);
        RectF rectF = l;
        rectF.a = f3;
        rectF.c = f3 + i2;
        rectF.b = f4;
        rectF.d = f4 + i3;
        return rectF;
    }

    public final void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, f fVar, com.corrodinggames.rts.gameFramework.utility.m mVar) {
        a(jVar, f, fVar, mVar, (PointF) null);
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x0405  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0410  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0443  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x0459  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0471  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x04c6  */
    /* JADX WARN: Removed duplicated region for block: B:171:0x0539  */
    /* JADX WARN: Removed duplicated region for block: B:263:0x08ad  */
    /* JADX WARN: Removed duplicated region for block: B:266:0x08bd  */
    /* JADX WARN: Removed duplicated region for block: B:289:0x096e A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void a(com.corrodinggames.rts.game.units.custom.j jVar, float f, f fVar, com.corrodinggames.rts.gameFramework.utility.m mVar, PointF pointF) {
        com.corrodinggames.rts.game.units.custom.j readUnit;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        am amVar;
        int i2;
        com.corrodinggames.rts.gameFramework.unitAction.e eVar;
        com.corrodinggames.rts.gameFramework.unitAction.e eVar2;
        int i3 = mVar.a;
        if (i3 == 0) {
            return;
        }
        boolean z = jVar.cG;
        boolean z2 = false;
        am dr = jVar.dr();
        if (dr != null) {
            if (dr.cG) {
                z2 = true;
            }
            am dr2 = dr.dr();
            if (dr2 != null && dr2.cG) {
                z2 = true;
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f9 = gameEngine.cX;
        boolean z3 = fVar == f.shadow;
        Object[] a2 = mVar.a();
        for (int i4 = 0; i4 < i3; i4++) {
            d dVar = (d) a2[i4];
            if ((!dVar.b || z || z2) && dVar.j <= f9 && ((!dVar.k || jVar.bT()) && (!dVar.l || !jVar.bV))) {
                if (dVar.b) {
                    boolean z4 = z;
                    if (dVar.g && z2) {
                        z4 = true;
                    }
                    if (z4) {
                        PlayerData playerData = gameEngine.playerTeam;
                        PlayerData playerData2 = jVar.bX;
                        if (playerData != null) {
                            if (dVar.c) {
                                if (playerData2 != playerData) {
                                    continue;
                                }
                            }
                            if (dVar.d) {
                                if (!playerData2.c(gameEngine.playerTeam)) {
                                    continue;
                                }
                            }
                            if (dVar.e) {
                                if (!playerData2.d(gameEngine.playerTeam)) {
                                    continue;
                                } else if (playerData2 == playerData) {
                                    continue;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
                if ((dVar.F == null || dVar.F.read(jVar)) && ((dVar.o < 0 || jVar.a == dVar.o) && ((!dVar.i || gameEngine.bS.m(jVar)) && ((dVar.h == q.any || dVar.h == null || gameEngine.playerTeam == null || gameEngine.playerTeam.a(dVar.h, jVar.bX)) && ((!dVar.m || jVar.cp) && (!dVar.n || !jVar.cp)))))) {
                    if (dVar.ae != -1) {
                        i[] iVarArr = jVar.dT;
                        ba[] baVarArr = jVar.x.ax;
                        if (iVarArr != null && iVarArr.length > dVar.ae && baVarArr != null && baVarArr.length > dVar.ae) {
                            i iVar = iVarArr[dVar.ae];
                            ba baVar = baVarArr[dVar.ae];
                            f2 = jVar.eo + iVar.b;
                            f3 = jVar.ep + iVar.c;
                            f4 = jVar.eq + iVar.d;
                            f5 = iVar.i + iVar.r + baVar.R + 90.0f;
                            f6 = iVar.i + iVar.r + baVar.R;
                            if (dVar.af) {
                                float f10 = jVar.cg;
                                if (jVar.x.dE) {
                                    f10 = jVar.cL[jVar.x.dG].a;
                                }
                                float k2 = com.corrodinggames.rts.gameFramework.f.k(f10);
                                float j2 = com.corrodinggames.rts.gameFramework.f.j(f10);
                                float f11 = (k2 * baVar.k) - (j2 * baVar.j);
                                float f12 = (j2 * baVar.k) + (k2 * baVar.j);
                                float d = com.corrodinggames.rts.gameFramework.f.d(iVar.b, iVar.c, f11, f12);
                                com.corrodinggames.rts.gameFramework.f.a(iVar.b, iVar.c, f11, f12);
                                f5 = d + 90.0f;
                                f6 = d + 90.0f;
                            }
                            if (dVar.Y) {
                                f5 = 0.0f;
                            }
                            if (dVar.Z) {
                                f4 = 0.0f;
                            }
                            float f13 = f6 + dVar.ab;
                            float f14 = f5 + dVar.aa;
                            f7 = f2 + dVar.T;
                            f8 = f3 + dVar.U;
                            if (dVar.W != null) {
                                f7 += dVar.W.readNumber(jVar);
                            }
                            if (dVar.X != null) {
                                f8 += dVar.X.readNumber(jVar);
                            }
                            if (dVar.R == 0.0f || dVar.S != 0.0f) {
                                float k3 = com.corrodinggames.rts.gameFramework.f.k(f13);
                                float j3 = com.corrodinggames.rts.gameFramework.f.j(f13);
                                float f15 = dVar.R;
                                float f16 = dVar.S;
                                f7 += (k3 * f16) - (j3 * f15);
                                f8 += (j3 * f16) + (k3 * f15);
                            }
                            float f17 = f4 + dVar.V;
                            if (!z3 && dVar.C != null) {
                                y yVar = gameEngine.bO;
                                float f18 = (f7 - gameEngine.cw) + dVar.D;
                                float f19 = (f8 - gameEngine.cx) + dVar.E;
                                Paint R = jVar.R();
                                com.corrodinggames.rts.gameFramework.unitAction.e eVar3 = dVar.C;
                                yVar.k();
                                yVar.a(f14, f18, f19);
                                yVar.a(eVar3, f18, f19, R);
                                yVar.l();
                                return;
                            }
                            if (dVar.u) {
                                y yVar2 = gameEngine.bO;
                                float f20 = f7 - gameEngine.cw;
                                float f21 = (f8 - gameEngine.cx) - f17;
                                ag agVar = dVar.ah;
                                ag agVar2 = agVar;
                                if (agVar == null) {
                                    agVar2 = jVar.aN();
                                }
                                if (dVar.ai != null) {
                                    float readNumber = dVar.ai.readNumber(jVar);
                                    if (readNumber != 1.0f) {
                                        Paint paint = a;
                                        paint.b(agVar2.e());
                                        paint.a(agVar2.c());
                                        int f22 = (int) (agVar2.f() * readNumber);
                                        if (f22 < 0) {
                                            f22 = 0;
                                        }
                                        if (f22 > 255) {
                                            f22 = 255;
                                        }
                                        paint.c(f22);
                                        agVar2 = paint;
                                    }
                                }
                                if (dVar.N != null) {
                                    i2 = (int) dVar.N.readNumber(jVar);
                                } else {
                                    i2 = 0;
                                }
                                int i5 = i2 + (jVar.a * dVar.O);
                                if (dVar.v != null) {
                                    e eVar4 = dVar.v;
                                    if (eVar4.b != null) {
                                        eVar2 = eVar4.b[jVar.bX.R()];
                                    } else {
                                        eVar2 = eVar4.a;
                                    }
                                    yVar2.k();
                                    yVar2.a(f14, f20, f21);
                                    float f23 = dVar.p;
                                    float f24 = dVar.p;
                                    if (dVar.q) {
                                        if (dVar.r != null) {
                                            float readNumber2 = dVar.r.readNumber(jVar);
                                            f23 = readNumber2;
                                            f24 = readNumber2;
                                        }
                                        if (dVar.s != null) {
                                            f23 *= dVar.s.readNumber(jVar);
                                        }
                                        if (dVar.t != null) {
                                            f24 *= dVar.t.readNumber(jVar);
                                        }
                                    }
                                    if (f23 != 1.0f || f24 != 1.0f) {
                                        yVar2.a(f23, f24, f20, f21);
                                    }
                                    if (!dVar.I) {
                                        yVar2.a(eVar2, f20, f21, agVar2);
                                    } else {
                                        yVar2.a(eVar2, a(dVar, eVar4, eVar2, i5), a(dVar, eVar4, eVar2, f20, f21), agVar2);
                                    }
                                    yVar2.l();
                                }
                                if (dVar.w != null) {
                                    float f25 = dVar.p;
                                    float f26 = dVar.p;
                                    if (dVar.q) {
                                        if (dVar.r != null) {
                                            float readNumber3 = dVar.r.readNumber(jVar);
                                            f25 = readNumber3;
                                            f26 = readNumber3;
                                        }
                                        if (dVar.s != null) {
                                            f25 *= dVar.s.readNumber(jVar);
                                        }
                                        if (dVar.t != null) {
                                            f26 *= dVar.t.readNumber(jVar);
                                        }
                                    }
                                    e[] eVarArr = dVar.w;
                                    int i6 = 0;
                                    int length = eVarArr.length;
                                    if (dVar.A != null) {
                                        i6 = (int) dVar.A.readNumber(jVar);
                                        if (i6 < 0) {
                                            i6 = 0;
                                        }
                                        if (i6 >= eVarArr.length) {
                                            i6 = eVarArr.length;
                                        }
                                    }
                                    if (dVar.B != null) {
                                        length = i6 + ((int) dVar.B.readNumber(jVar));
                                        if (length < 0) {
                                            length = 0;
                                        }
                                        if (length >= eVarArr.length) {
                                            length = eVarArr.length;
                                        }
                                    }
                                    for (int i7 = i6; i7 < length; i7++) {
                                        int i8 = i7;
                                        if (dVar.z) {
                                            i8 = (dVar.w.length - 1) - i8;
                                        }
                                        e eVar5 = eVarArr[i8];
                                        if (eVar5.b != null) {
                                            eVar = eVar5.b[jVar.bX.R()];
                                        } else {
                                            eVar = eVar5.a;
                                        }
                                        float f27 = i8 * dVar.x;
                                        yVar2.k();
                                        yVar2.a(f14, f20, f21 - f27);
                                        if (f25 != 1.0f || f26 != 1.0f) {
                                            yVar2.a(f25, f26, f20, f21 - f27);
                                        }
                                        yVar2.a(eVar, a(dVar, eVar5, eVar, i5 + (i8 * dVar.y)), a(dVar, eVar5, eVar, f20, f21 - f27), agVar2);
                                        yVar2.l();
                                    }
                                }
                            }
                            amVar = null;
                            if (dVar.ad != null) {
                                amVar = dVar.ad.readUnit(jVar);
                            }
                            if (amVar != null) {
                                float f28 = f7 - gameEngine.cw;
                                float f29 = (f8 - gameEngine.cx) - f17;
                                float f30 = amVar.eo - gameEngine.cw;
                                float f31 = (amVar.ep - gameEngine.cx) - amVar.eq;
                                Paint paint2 = dVar.ah;
                                if (paint2 == null) {
                                    paint2 = b;
                                }
                                if (dVar.ai != null) {
                                    float readNumber4 = dVar.ai.readNumber(jVar);
                                    if (readNumber4 != 1.0f) {
                                        Paint paint3 = a;
                                        paint3.b(paint2.e());
                                        int f32 = (int) (paint2.f() * readNumber4);
                                        if (f32 < 0) {
                                            f32 = 0;
                                        }
                                        if (f32 > 255) {
                                            f32 = 255;
                                        }
                                        paint3.c(f32);
                                        paint2 = paint3;
                                    }
                                }
                                gameEngine.bO.a(f28, f29, f30, f31, paint2);
                            }
                        }
                    } else if (dVar.ag != -1) {
                        if (dVar.ag >= jVar.cL.length) {
                            continue;
                        } else {
                            int i9 = dVar.ag;
                            ai F = jVar.F(i9);
                            f2 = F.a;
                            f3 = F.b;
                            f4 = jVar.eq + F.c;
                            f5 = jVar.cL[i9].a + 90.0f;
                            f6 = jVar.cL[i9].a;
                            if (dVar.Y) {
                            }
                            if (dVar.Z) {
                            }
                            float f132 = f6 + dVar.ab;
                            float f142 = f5 + dVar.aa;
                            f7 = f2 + dVar.T;
                            f8 = f3 + dVar.U;
                            if (dVar.W != null) {
                            }
                            if (dVar.X != null) {
                            }
                            if (dVar.R == 0.0f) {
                            }
                            float k32 = com.corrodinggames.rts.gameFramework.f.k(f132);
                            float j32 = com.corrodinggames.rts.gameFramework.f.j(f132);
                            float f152 = dVar.R;
                            float f162 = dVar.S;
                            f7 += (k32 * f162) - (j32 * f152);
                            f8 += (j32 * f162) + (k32 * f152);
                            float f172 = f4 + dVar.V;
                            if (!z3) {
                            }
                            if (dVar.u) {
                            }
                            amVar = null;
                            if (dVar.ad != null) {
                            }
                            if (amVar != null) {
                            }
                        }
                    } else {
                        if (dVar.ac == null) {
                            readUnit = jVar;
                        } else {
                            readUnit = dVar.ac.readUnit(jVar);
                            if (readUnit == null) {
                                continue;
                            }
                        }
                        f2 = readUnit.eo;
                        f3 = readUnit.ep;
                        f4 = readUnit.eq;
                        if (pointF != null && dVar.ac == null) {
                            f2 = pointF.x;
                            f3 = pointF.y;
                        }
                        f5 = readUnit.cg + 90.0f;
                        f6 = readUnit.cg;
                        if (dVar.ac == null && jVar.x.dC) {
                            float f33 = jVar.cL[jVar.x.dG].a;
                            f5 = f33 + 90.0f;
                            f6 = f33;
                        }
                        if (dVar.Y) {
                        }
                        if (dVar.Z) {
                        }
                        float f1322 = f6 + dVar.ab;
                        float f1422 = f5 + dVar.aa;
                        f7 = f2 + dVar.T;
                        f8 = f3 + dVar.U;
                        if (dVar.W != null) {
                        }
                        if (dVar.X != null) {
                        }
                        if (dVar.R == 0.0f) {
                        }
                        float k322 = com.corrodinggames.rts.gameFramework.f.k(f1322);
                        float j322 = com.corrodinggames.rts.gameFramework.f.j(f1322);
                        float f1522 = dVar.R;
                        float f1622 = dVar.S;
                        f7 += (k322 * f1622) - (j322 * f1522);
                        f8 += (j322 * f1622) + (k322 * f1522);
                        float f1722 = f4 + dVar.V;
                        if (!z3) {
                        }
                        if (dVar.u) {
                        }
                        amVar = null;
                        if (dVar.ad != null) {
                        }
                        if (amVar != null) {
                        }
                    }
                }
            }
        }
    }
}