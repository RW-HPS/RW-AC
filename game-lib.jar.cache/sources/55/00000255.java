package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0403ba;
import com.corrodinggames.rts.game.units.custom.C0416bn;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0960aa;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1115ai;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/c.class */
public class C0391c extends AbstractC0389a {

    /* renamed from: c */
    C1136m f2297c = new C1136m();

    /* renamed from: d */
    C1136m f2298d = new C1136m();

    /* renamed from: e */
    C1136m f2299e = new C1136m();

    /* renamed from: f */
    C1136m f2300f = new C1136m();

    /* renamed from: g */
    C1136m f2301g = new C1136m();

    /* renamed from: h */
    boolean f2302h;

    /* renamed from: a */
    static Paint f2295a = new Paint();

    /* renamed from: b */
    static C0966ag f2296b = new C0966ag();

    /* renamed from: i */
    static final PointF f2303i = new PointF();

    /* renamed from: j */
    static final C0395g f2304j = new C0395g(VariableScope.nullOrMissingString);

    /* renamed from: k */
    static final Rect f2305k = new Rect();

    /* renamed from: l */
    static final RectF f2306l = new RectF();

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public static C0392d m3944c(C0458l c0458l, String str) {
        Iterator it = c0458l.f3236q.iterator();
        while (it.hasNext()) {
            C0392d c0392d = (C0392d) it.next();
            if (str.equalsIgnoreCase(c0392d.f2307a)) {
                return c0392d;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0395g m3947a(C0458l c0458l, String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return null;
        }
        C0395g c0395g = new C0395g(str);
        c0458l.m3551a(c0395g);
        return c0395g;
    }

    /* renamed from: a */
    public static void m3948a(C0458l c0458l, C1107ab c1107ab) {
        String str;
        C1136m c1136m;
        C0391c c0391c = null;
        Iterator it = c1107ab.m654e("decal_").iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            c0458l.m3544a("1.15p9", 115009, str2, "decals");
            String substring = str2.substring("decal_".length());
            C0392d c0392d = new C0392d();
            c0392d.f2307a = substring;
            if (substring.contains(",")) {
                throw new C0417bo("[" + str2 + "]Decal name: '" + substring + "' cannot have ','");
            }
            if (substring.contains(" ")) {
                throw new C0417bo("[" + str2 + "]Decal name: '" + substring + "' cannot have spaces");
            }
            if (substring.contains("(")) {
                throw new C0417bo("[" + str2 + "]Decal name: '" + substring + "' cannot have '('");
            }
            c0392d.f2339G = (EnumC0394f) c1107ab.m684a(str2, "layer", EnumC0394f.onTop, EnumC0394f.class);
            c0392d.f2340H = c1107ab.m683a(str2, "order", Float.valueOf(0.0f)).floatValue();
            c0392d.f2309c = c1107ab.m685a(str2, "onlyWhenSelectedByOwnPlayer", (Boolean) false).booleanValue();
            c0392d.f2310d = c1107ab.m685a(str2, "onlyWhenSelectedByEnemyPlayer", (Boolean) false).booleanValue();
            c0392d.f2311e = c1107ab.m685a(str2, "onlyWhenSelectedByAllyNotOwnPlayer", (Boolean) false).booleanValue();
            c0392d.f2312f = c1107ab.m685a(str2, "onlyWhenSelectedByAnyPlayer", (Boolean) false).booleanValue();
            int i = c0392d.f2309c ? 0 + 1 : 0;
            if (c0392d.f2310d) {
                i++;
            }
            if (c0392d.f2311e) {
                i++;
            }
            if (c0392d.f2312f) {
                i++;
            }
            if (i >= 2) {
                throw new C0417bo("[" + str2 + "]Doesn't make sense to set more than one onlyWhenSelectedBy* to true at a time.");
            }
            if (i > 0) {
                c0392d.f2308b = true;
            } else {
                c0392d.f2308b = false;
            }
            c0392d.f2313g = c1107ab.m685a(str2, "includeParentsSelection", (Boolean) false).booleanValue();
            c0392d.f2314h = (EnumC0200q) c1107ab.m684a(str2, "onlyTeam", EnumC0200q.f1397f, EnumC0200q.class);
            c0392d.f2315i = c1107ab.m685a(str2, "onlyPlayersWithUnitControl", (Boolean) false).booleanValue();
            c0392d.f2316j = c1107ab.m683a(str2, "onlyWithZoomLevelOrMore", Float.valueOf(0.0f)).floatValue();
            boolean z = false;
            if (c0392d.f2339G == EnumC0394f.beforeUI) {
                z = true;
            }
            c0392d.f2317k = c1107ab.m685a(str2, "onlyWhileActive", (Boolean) false).booleanValue();
            c0392d.f2318l = c1107ab.m685a(str2, "onlyWhileAlive", Boolean.valueOf(z)).booleanValue();
            c0392d.f2319m = c1107ab.m685a(str2, "onlyInPreview", (Boolean) false).booleanValue();
            c0392d.f2320n = c1107ab.m685a(str2, "onlyOnNonPreview", (Boolean) false).booleanValue();
            if (c0392d.f2319m && c0392d.f2320n) {
                throw new C0417bo("[" + str2 + "]decal with both onlyInPreview and onlyOnNonPreview will never be visible");
            }
            if (c0392d.f2316j > 5.0f) {
                throw new C0417bo("[" + str2 + "]decal with onlyWithZoomLevelOrMore:" + c0392d.f2316j + " will never be visible");
            }
            if (c0392d.f2316j < 0.0f) {
                throw new C0417bo("[" + str2 + "]onlyWithZoomLevelOrMore:" + c0392d.f2316j + " cannot be less than zero");
            }
            Integer m667b = c1107ab.m667b(str2, "onlyOnBodyFrameOf", (Integer) null);
            if (m667b != null) {
                c0392d.f2321o = m667b.intValue();
                if (c0392d.f2321o < 0) {
                    throw new C0417bo("[" + str2 + "]onlyOnBodyFrameOf cannot be: " + c0392d.f2321o);
                }
            }
            LogicBoolean m664c = c1107ab.m664c(c0458l, str2, "imageScale", null);
            if (m664c != null) {
                if (LogicBoolean.isStaticNumber(m664c)) {
                    c0392d.f2322p = LogicBoolean.getKnownStaticNumber(m664c);
                } else {
                    c0392d.f2323q = true;
                    c0392d.f2324r = m664c;
                }
            }
            LogicBoolean m664c2 = c1107ab.m664c(c0458l, str2, "imageScaleX", null);
            LogicBoolean m664c3 = c1107ab.m664c(c0458l, str2, "imageScaleY", null);
            if (m664c2 != null || m664c3 != null) {
                c0392d.f2323q = true;
                c0392d.f2325s = m664c2;
                c0392d.f2326t = m664c3;
            }
            Integer m667b2 = c1107ab.m667b(str2, "total_frames", (Integer) null);
            if (m667b2 != null) {
                c0392d.f2342J = m667b2.intValue();
                if (c0392d.f2342J < 1) {
                    throw new C0417bo("[" + str2 + "] TOTAL_FRAMES cannot be: " + c0392d.f2342J + " (must be 1 or more)");
                }
            }
            c0392d.f2345M = c1107ab.m685a(str2, "frame_verticalOrdering", (Boolean) false).booleanValue();
            c0392d.f2343K = c1107ab.m667b(str2, "frame_width", (Integer) (-1)).intValue();
            c0392d.f2344L = c1107ab.m667b(str2, "frame_height", (Integer) (-1)).intValue();
            if (c0392d.f2343K != -1 && c0392d.f2342J != -1) {
                throw new C0417bo("[" + str2 + "]TOTAL_FRAMES and frame_width cannot be both set");
            }
            if (c0392d.f2344L != -1 && c0392d.f2344L <= 0) {
                throw new C0417bo("[" + str2 + "]frame_height cannot be: " + c0392d.f2344L);
            }
            if (c0392d.f2343K != -1 && c0392d.f2343K <= 0) {
                throw new C0417bo("[" + str2 + "]frame_width cannot be: " + c0392d.f2343K);
            }
            if (c0392d.f2342J != -1 && c0392d.f2342J <= 0) {
                throw new C0417bo("[" + str2 + "]TOTAL_FRAMES cannot be: " + c0392d.f2342J);
            }
            if (c0392d.f2344L != -1 || c0392d.f2343K != -1 || c0392d.f2342J != -1) {
                c0392d.f2341I = true;
            }
            boolean booleanValue = c1107ab.m685a(str2, "teamColors", (Boolean) false).booleanValue();
            C0970e m3547a = c0458l.m3547a(c1107ab, str2, "image");
            if (m3547a != null) {
                C0393e c0393e = new C0393e();
                c0393e.f2368a = m3547a;
                if (c0393e.f2368a != null && booleanValue) {
                    c0393e.f2369b = c0458l.m3548a(m3547a, c0458l.f2963ac);
                }
                c0393e.m3939a(c0392d);
                c0392d.f2328v = c0393e;
                c0392d.f2327u = true;
            }
            String m666b = c1107ab.m666b(str2, "imageStack", (String) null);
            if (m666b != null && !m666b.equals(VariableScope.nullOrMissingString)) {
                c0392d.f2327u = true;
                ArrayList arrayList = new ArrayList();
                for (String str3 : m666b.split(",")) {
                    String trim = str3.trim();
                    boolean z2 = booleanValue;
                    String str4 = null;
                    if (trim.contains("(") && trim.contains(")")) {
                        String[] m576b = C1118al.m576b(trim, "(");
                        if (m576b == null) {
                            throw new C0417bo("[" + str2 + "]imageStack: Unexpected format for: " + m666b);
                        }
                        trim = m576b[0];
                        str4 = m576b[1].trim();
                    }
                    String[] split = trim.split("\\*");
                    String str5 = split[0];
                    int i2 = 1;
                    if (split.length >= 2) {
                        i2 = Integer.parseInt(split[1]);
                    }
                    if (str4 != null) {
                        if (!str4.endsWith(")")) {
                            throw new C0417bo("[" + str2 + "]imageStack: Missing ')' in: " + m666b);
                        }
                        Iterator it2 = C1118al.m581a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                        while (it2.hasNext()) {
                            String str6 = (String) it2.next();
                            if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                                String[] m576b2 = C1118al.m576b(str6, "=");
                                if (m576b2 == null) {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unexpected key format for: " + m666b);
                                }
                                String trim2 = m576b2[0].trim();
                                String trim3 = m576b2[1].trim();
                                if (trim2.equalsIgnoreCase("teamColors")) {
                                    z2 = C1107ab.m646g(str2, "imageStack", trim3);
                                } else if (trim2.equalsIgnoreCase("teamColor")) {
                                    z2 = C1107ab.m646g(str2, "imageStack", trim3);
                                } else {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unknown parameter: " + trim2);
                                }
                            }
                        }
                    }
                    C0393e c0393e2 = new C0393e();
                    c0393e2.f2368a = c0458l.m3540a(c0458l.f2946F, str5, c0458l.f2962ab, str2, "imageStack");
                    if (c0393e2.f2368a == null) {
                        throw new C0417bo("[" + str2 + "]failed to load image " + str5);
                    }
                    if (z2) {
                        c0393e2.f2369b = c0458l.m3548a(c0393e2.f2368a, c0458l.f2963ac);
                    }
                    c0393e2.m3939a(c0392d);
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList.add(c0393e2);
                    }
                }
                if (arrayList.size() > 0) {
                    c0392d.f2329w = (C0393e[]) arrayList.toArray(new C0393e[0]);
                }
            }
            c0392d.f2330x = c1107ab.m683a(str2, "stack_hOffset", Float.valueOf(1.0f)).floatValue();
            c0392d.f2331y = c1107ab.m667b(str2, "stack_frameOffset", (Integer) 0).intValue();
            c0392d.f2333A = c1107ab.m664c(c0458l, str2, "stack_indexStart", null);
            c0392d.f2334B = c1107ab.m664c(c0458l, str2, "stack_indexCount", null);
            Boolean m685a = c1107ab.m685a(str2, "stack_drawInReverseOrder", (Boolean) null);
            if ((m685a != null && m685a.booleanValue()) || (m685a == null && c0392d.f2330x < 0.0f)) {
                c0392d.f2332z = true;
            }
            c0392d.f2346N = c1107ab.m703a(c0458l, str2, "frame", (LogicBoolean) null, LogicBoolean.ReturnType.number);
            c0392d.f2347O = c1107ab.m667b(str2, "addBodyFrameMultipliedBy", (Integer) 0).intValue();
            c0392d.f2338F = c1107ab.m704a(c0458l, str2, "isVisible", (LogicBoolean) null);
            c0392d.f2350R = c1107ab.m683a(str2, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0392d.f2351S = c1107ab.m683a(str2, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0392d.f2355W = c1107ab.m664c(c0458l, str2, "xOffsetAbsolute", null);
            c0392d.f2356X = c1107ab.m664c(c0458l, str2, "yOffsetAbsolute", null);
            if (LogicBoolean.isStaticNumber(c0392d.f2355W)) {
                c0392d.f2352T = LogicBoolean.getKnownStaticNumber(c0392d.f2355W);
                c0392d.f2355W = null;
            }
            if (LogicBoolean.isStaticNumber(c0392d.f2356X)) {
                c0392d.f2353U = LogicBoolean.getKnownStaticNumber(c0392d.f2356X);
                c0392d.f2356X = null;
            }
            c0392d.f2354V = c1107ab.m683a(str2, "hOffset", Float.valueOf(0.0f)).floatValue();
            c0392d.f2359aa = c1107ab.m683a(str2, "dirOffset", Float.valueOf(0.0f)).floatValue();
            c0392d.f2360ab = c1107ab.m683a(str2, "pivotOffset", Float.valueOf(0.0f)).floatValue();
            c0392d.f2357Y = c1107ab.m678a(str2, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
            c0392d.f2358Z = c1107ab.m685a(str2, "alwaysStartHeightAtZero", (Boolean) false).booleanValue();
            if (c0392d.f2350R != 0.0f) {
            }
            c0392d.f2361ac = c1107ab.m671b(c0458l, str2, "basePosition", null);
            c0392d.f2362ad = c1107ab.m671b(c0458l, str2, "drawLineTo", null);
            String m666b2 = c1107ab.m666b(str2, "basePositionFromLegEnd", (String) null);
            if (m666b2 != null || 0 != 0) {
                if (m666b2 != null && 0 != 0) {
                    throw new C0417bo("[" + str2 + "]basePositionFromLegEnd and basePositionFromLegMiddle cannot be used at the same time");
                }
                if (0 != 0) {
                    str = null;
                    c0392d.f2364af = true;
                } else {
                    str = m666b2;
                }
                c0392d.f2363ae = c0458l.m3531b(str);
                if (c0392d.f2363ae == -1) {
                    throw new C0417bo("[" + str2 + "]basePositionFromLeg* failed to find: " + str);
                }
            }
            String m666b3 = c1107ab.m666b(str2, "basePositionFromTurret", (String) null);
            if (m666b3 != null) {
                C0416bn m3520e = c0458l.m3520e(m666b3);
                if (m3520e == null) {
                    throw new C0417bo("[" + str2 + "]basePositionFromTurret failed to find: " + m666b3);
                }
                c0392d.f2365ag = m3520e.f2571e;
            }
            if (c0392d.f2363ae != -1 && c0392d.f2365ag != -1) {
                throw new C0417bo("[" + str2 + "]basePositionFromTurret and basePositionFromLeg cannot be used at the same time");
            }
            if ((c0392d.f2363ae != -1 || c0392d.f2365ag != -1) && c0392d.f2361ac != null) {
                throw new C0417bo("[" + str2 + "]basePositionFromTurret/basePositionFromLeg cannot be used at the same time as basePosition");
            }
            c0392d.f2335C = c0458l.m3547a(c1107ab, str2, "image_shadow");
            c0392d.f2336D = c1107ab.m683a(str2, "shadowOffsetX", Float.valueOf(1.0f)).floatValue();
            c0392d.f2337E = c1107ab.m683a(str2, "shadowOffsetY", Float.valueOf(1.0f)).floatValue();
            c0392d.f2348P = c1107ab.m681a(str2, "color", (Integer) (-1)).intValue();
            c0392d.f2349Q = c1107ab.m683a(str2, "lineWidth", Float.valueOf(1.0f)).floatValue();
            float f = 1.0f;
            LogicBoolean m664c4 = c1107ab.m664c(c0458l, str2, "alpha", null);
            if (m664c4 != null) {
                if (LogicBoolean.isStaticNumber(m664c4)) {
                    float knownStaticNumber = LogicBoolean.getKnownStaticNumber(m664c4);
                    if (knownStaticNumber < 0.0f || knownStaticNumber > 1.0f) {
                        throw new C0417bo("[" + str2 + "]alpha should be between 0-1");
                    }
                    f = knownStaticNumber;
                } else {
                    c0392d.f2367ai = m664c4;
                }
            }
            if (c0392d.f2348P != -1 || c0392d.f2349Q != 1.0f || f != 1.0f) {
                c0392d.f2366ah = new C0966ag();
                c0392d.f2366ah.m5206b(c0392d.f2348P);
                if (c0392d.f2348P != -1) {
                    C0960aa.m951a(c0392d.f2366ah);
                }
                int f2 = (int) (c0392d.f2366ah.m5192f() * f);
                if (f2 < 0) {
                    f2 = 0;
                }
                if (f2 > 255) {
                    f2 = 255;
                }
                c0392d.f2366ah.m5201c(f2);
                c0392d.f2366ah.m5231a(c0392d.f2349Q);
            }
            boolean z3 = true;
            if (LogicBoolean.isStaticFalse(c0392d.f2338F)) {
                z3 = false;
            }
            if (c0392d.f2362ad == null && !c0392d.f2327u) {
                z3 = false;
            }
            if (f == 0.0f) {
                z3 = false;
            }
            c0458l.f3236q.add(c0392d);
            if (z3) {
                if (c0391c == null) {
                    c0391c = new C0391c();
                    c0458l.m3532b(c0391c);
                }
                if (!c0392d.f2308b) {
                    c0391c.f2302h = true;
                }
                if (c0392d.f2335C != null && c0392d.f2339G != EnumC0394f.shadow) {
                    c0391c.f2297c.add(c0392d);
                }
                if (c0392d.f2339G == EnumC0394f.afterBody) {
                    c1136m = c0391c.f2300f;
                } else if (c0392d.f2339G == EnumC0394f.beforeBody) {
                    c1136m = c0391c.f2299e;
                } else if (c0392d.f2339G == EnumC0394f.beforeUI) {
                    c1136m = c0391c.f2301g;
                } else if (c0392d.f2339G == EnumC0394f.shadow) {
                    c1136m = c0391c.f2297c;
                } else if (c0392d.f2339G == EnumC0394f.inactive) {
                    c1136m = null;
                } else {
                    c1136m = c0391c.f2298d;
                }
                if (c1136m != null) {
                    c1136m.add(c0392d);
                    Collections.sort(c1136m);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: b */
    public void mo3919b(C0456j c0456j, float f) {
        GameEngine.getGameEngine();
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: a */
    public void mo3929a(C0456j c0456j) {
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: d */
    public void mo3943d(C0456j c0456j, float f) {
        m3950a(c0456j, f, EnumC0394f.shadow, this.f2297c);
        m3950a(c0456j, f, EnumC0394f.beforeBody, this.f2299e);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: e */
    public void mo3942e(C0456j c0456j, float f) {
        m3950a(c0456j, f, EnumC0394f.afterBody, this.f2300f);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: c */
    public void mo3945c(C0456j c0456j, float f) {
        m3950a(c0456j, f, EnumC0394f.onTop, this.f2298d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p018b.AbstractC0389a
    /* renamed from: f */
    public void mo3941f(C0456j c0456j, float f) {
        m3950a(c0456j, f, EnumC0394f.beforeUI, this.f2301g);
    }

    /* renamed from: a */
    public static Rect m3951a(C0392d c0392d, C0393e c0393e, C0970e c0970e, int i) {
        int i2 = c0393e.f2370c;
        int i3 = c0393e.f2371d;
        int i4 = 0;
        int i5 = 0;
        if (i > 0) {
            if (!c0392d.f2345M) {
                int i6 = 0;
                int i7 = i;
                int i8 = c0393e.f2373f;
                if (i >= i8) {
                    i6 = 0 + (i / i8);
                    i7 = i % i8;
                }
                i4 = i7 * i2;
                i5 = i6 * i3;
            } else {
                int i9 = i;
                int i10 = 0;
                int i11 = c0393e.f2372e;
                if (i >= i11) {
                    i10 = 0 + (i / i11);
                    i9 = i % i11;
                }
                i4 = i10 * i2;
                i5 = i9 * i3;
            }
        }
        Rect rect = f2305k;
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + i2;
        rect.f233d = i5 + i3;
        return rect;
    }

    /* renamed from: a */
    public static RectF m3952a(C0392d c0392d, C0393e c0393e, C0970e c0970e, float f, float f2) {
        int i = c0393e.f2370c;
        int i2 = c0393e.f2371d;
        float f3 = f - (i / 2);
        float f4 = f2 - (i2 / 2);
        RectF rectF = f2306l;
        rectF.f234a = f3;
        rectF.f236c = f3 + i;
        rectF.f235b = f4;
        rectF.f237d = f4 + i2;
        return rectF;
    }

    /* renamed from: a */
    public final void m3950a(C0456j c0456j, float f, EnumC0394f enumC0394f, C1136m c1136m) {
        m3949a(c0456j, f, enumC0394f, c1136m, (PointF) null);
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
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void m3949a(C0456j c0456j, float f, EnumC0394f enumC0394f, C1136m c1136m, PointF pointF) {
        C0456j readUnit;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        float f7;
        float f8;
        AbstractC0244am abstractC0244am;
        int i;
        C0970e c0970e;
        C0970e c0970e2;
        int i2 = c1136m.f7109a;
        if (i2 == 0) {
            return;
        }
        boolean z = c0456j.f1649cG;
        boolean z2 = false;
        AbstractC0244am dr = c0456j.m4199dr();
        if (dr != null) {
            if (dr.f1649cG) {
                z2 = true;
            }
            AbstractC0244am m4199dr = dr.m4199dr();
            if (m4199dr != null && m4199dr.f1649cG) {
                z2 = true;
            }
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f9 = gameEngine.f6470cX;
        boolean z3 = enumC0394f == EnumC0394f.shadow;
        Object[] m535a = c1136m.m535a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0392d c0392d = (C0392d) m535a[i3];
            if ((!c0392d.f2308b || z || z2) && c0392d.f2316j <= f9 && ((!c0392d.f2317k || c0456j.m4226bT()) && (!c0392d.f2318l || !c0456j.f1612bV))) {
                if (c0392d.f2308b) {
                    boolean z4 = z;
                    if (c0392d.f2313g && z2) {
                        z4 = true;
                    }
                    if (z4) {
                        PlayerData playerData = gameEngine.f6312bs;
                        PlayerData playerData2 = c0456j.f1614bX;
                        if (playerData != null) {
                            if (c0392d.f2309c) {
                                if (playerData2 != playerData) {
                                    continue;
                                }
                            }
                            if (c0392d.f2310d) {
                                if (!playerData2.m4402c(gameEngine.f6312bs)) {
                                    continue;
                                }
                            }
                            if (c0392d.f2311e) {
                                if (!playerData2.m4390d(gameEngine.f6312bs)) {
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
                if ((c0392d.f2338F == null || c0392d.f2338F.read(c0456j)) && ((c0392d.f2321o < 0 || c0456j.f2868a == c0392d.f2321o) && ((!c0392d.f2315i || gameEngine.f6330bS.m1806m(c0456j)) && ((c0392d.f2314h == EnumC0200q.f1397f || c0392d.f2314h == null || gameEngine.f6312bs == null || gameEngine.f6312bs.m4440a(c0392d.f2314h, c0456j.f1614bX)) && ((!c0392d.f2319m || c0456j.f1632cp) && (!c0392d.f2320n || !c0456j.f1632cp)))))) {
                    if (c0392d.f2363ae != -1) {
                        C0397i[] c0397iArr = c0456j.f2910dT;
                        C0403ba[] c0403baArr = c0456j.f2891x.f3255ax;
                        if (c0397iArr != null && c0397iArr.length > c0392d.f2363ae && c0403baArr != null && c0403baArr.length > c0392d.f2363ae) {
                            C0397i c0397i = c0397iArr[c0392d.f2363ae];
                            C0403ba c0403ba = c0403baArr[c0392d.f2363ae];
                            f2 = c0456j.f7172eo + c0397i.f2388b;
                            f3 = c0456j.f7173ep + c0397i.f2389c;
                            f4 = c0456j.f7174eq + c0397i.f2390d;
                            f5 = c0397i.f2395i + c0397i.f2404r + c0403ba.f2502R + 90.0f;
                            f6 = c0397i.f2395i + c0397i.f2404r + c0403ba.f2502R;
                            if (c0392d.f2364af) {
                                float f10 = c0456j.f1623cg;
                                if (c0456j.f2891x.f3106dE) {
                                    f10 = c0456j.f1654cL[c0456j.f2891x.f3108dG].f1717a;
                                }
                                float m2107k = C0773f.m2107k(f10);
                                float m2110j = C0773f.m2110j(f10);
                                float f11 = (m2107k * c0403ba.f2469k) - (m2110j * c0403ba.f2468j);
                                float f12 = (m2110j * c0403ba.f2469k) + (m2107k * c0403ba.f2468j);
                                float m2138d = C0773f.m2138d(c0397i.f2388b, c0397i.f2389c, f11, f12);
                                C0773f.m2216a(c0397i.f2388b, c0397i.f2389c, f11, f12);
                                f5 = m2138d + 90.0f;
                                f6 = m2138d + 90.0f;
                            }
                            if (c0392d.f2357Y) {
                                f5 = 0.0f;
                            }
                            if (c0392d.f2358Z) {
                                f4 = 0.0f;
                            }
                            float f13 = f6 + c0392d.f2360ab;
                            float f14 = f5 + c0392d.f2359aa;
                            f7 = f2 + c0392d.f2352T;
                            f8 = f3 + c0392d.f2353U;
                            if (c0392d.f2355W != null) {
                                f7 += c0392d.f2355W.readNumber(c0456j);
                            }
                            if (c0392d.f2356X != null) {
                                f8 += c0392d.f2356X.readNumber(c0456j);
                            }
                            if (c0392d.f2350R == 0.0f || c0392d.f2351S != 0.0f) {
                                float m2107k2 = C0773f.m2107k(f13);
                                float m2110j2 = C0773f.m2110j(f13);
                                float f15 = c0392d.f2350R;
                                float f16 = c0392d.f2351S;
                                f7 += (m2107k2 * f16) - (m2110j2 * f15);
                                f8 += (m2110j2 * f16) + (m2107k2 * f15);
                            }
                            float f17 = f4 + c0392d.f2354V;
                            if (!z3 && c0392d.f2335C != null) {
                                InterfaceC1063y interfaceC1063y = gameEngine.f6326bO;
                                float f18 = (f7 - gameEngine.f6357cw) + c0392d.f2336D;
                                float f19 = (f8 - gameEngine.f6358cx) + c0392d.f2337E;
                                Paint R = c0456j.m3042R();
                                C0970e c0970e3 = c0392d.f2335C;
                                interfaceC1063y.mo136k();
                                interfaceC1063y.mo228a(f14, f18, f19);
                                interfaceC1063y.mo199a(c0970e3, f18, f19, R);
                                interfaceC1063y.mo135l();
                                return;
                            }
                            if (c0392d.f2327u) {
                                InterfaceC1063y interfaceC1063y2 = gameEngine.f6326bO;
                                float f20 = f7 - gameEngine.f6357cw;
                                float f21 = (f8 - gameEngine.f6358cx) - f17;
                                C0966ag c0966ag = c0392d.f2366ah;
                                C0966ag c0966ag2 = c0966ag;
                                if (c0966ag == null) {
                                    c0966ag2 = c0456j.mo2974aN();
                                }
                                if (c0392d.f2367ai != null) {
                                    float readNumber = c0392d.f2367ai.readNumber(c0456j);
                                    if (readNumber != 1.0f) {
                                        Paint paint = f2295a;
                                        paint.m5206b(c0966ag2.m5194e());
                                        paint.mo914a(c0966ag2.m5202c());
                                        int m5192f = (int) (c0966ag2.m5192f() * readNumber);
                                        if (m5192f < 0) {
                                            m5192f = 0;
                                        }
                                        if (m5192f > 255) {
                                            m5192f = 255;
                                        }
                                        paint.m5201c(m5192f);
                                        c0966ag2 = paint;
                                    }
                                }
                                if (c0392d.f2346N != null) {
                                    i = (int) c0392d.f2346N.readNumber(c0456j);
                                } else {
                                    i = 0;
                                }
                                int i4 = i + (c0456j.f2868a * c0392d.f2347O);
                                if (c0392d.f2328v != null) {
                                    C0393e c0393e = c0392d.f2328v;
                                    if (c0393e.f2369b != null) {
                                        c0970e2 = c0393e.f2369b[c0456j.f1614bX.m4454R()];
                                    } else {
                                        c0970e2 = c0393e.f2368a;
                                    }
                                    interfaceC1063y2.mo136k();
                                    interfaceC1063y2.mo228a(f14, f20, f21);
                                    float f22 = c0392d.f2322p;
                                    float f23 = c0392d.f2322p;
                                    if (c0392d.f2323q) {
                                        if (c0392d.f2324r != null) {
                                            float readNumber2 = c0392d.f2324r.readNumber(c0456j);
                                            f22 = readNumber2;
                                            f23 = readNumber2;
                                        }
                                        if (c0392d.f2325s != null) {
                                            f22 *= c0392d.f2325s.readNumber(c0456j);
                                        }
                                        if (c0392d.f2326t != null) {
                                            f23 *= c0392d.f2326t.readNumber(c0456j);
                                        }
                                    }
                                    if (f22 != 1.0f || f23 != 1.0f) {
                                        interfaceC1063y2.mo227a(f22, f23, f20, f21);
                                    }
                                    if (!c0392d.f2341I) {
                                        interfaceC1063y2.mo199a(c0970e2, f20, f21, c0966ag2);
                                    } else {
                                        interfaceC1063y2.mo193a(c0970e2, m3951a(c0392d, c0393e, c0970e2, i4), m3952a(c0392d, c0393e, c0970e2, f20, f21), c0966ag2);
                                    }
                                    interfaceC1063y2.mo135l();
                                }
                                if (c0392d.f2329w != null) {
                                    float f24 = c0392d.f2322p;
                                    float f25 = c0392d.f2322p;
                                    if (c0392d.f2323q) {
                                        if (c0392d.f2324r != null) {
                                            float readNumber3 = c0392d.f2324r.readNumber(c0456j);
                                            f24 = readNumber3;
                                            f25 = readNumber3;
                                        }
                                        if (c0392d.f2325s != null) {
                                            f24 *= c0392d.f2325s.readNumber(c0456j);
                                        }
                                        if (c0392d.f2326t != null) {
                                            f25 *= c0392d.f2326t.readNumber(c0456j);
                                        }
                                    }
                                    C0393e[] c0393eArr = c0392d.f2329w;
                                    int i5 = 0;
                                    int length = c0393eArr.length;
                                    if (c0392d.f2333A != null) {
                                        i5 = (int) c0392d.f2333A.readNumber(c0456j);
                                        if (i5 < 0) {
                                            i5 = 0;
                                        }
                                        if (i5 >= c0393eArr.length) {
                                            i5 = c0393eArr.length;
                                        }
                                    }
                                    if (c0392d.f2334B != null) {
                                        length = i5 + ((int) c0392d.f2334B.readNumber(c0456j));
                                        if (length < 0) {
                                            length = 0;
                                        }
                                        if (length >= c0393eArr.length) {
                                            length = c0393eArr.length;
                                        }
                                    }
                                    for (int i6 = i5; i6 < length; i6++) {
                                        int i7 = i6;
                                        if (c0392d.f2332z) {
                                            i7 = (c0392d.f2329w.length - 1) - i7;
                                        }
                                        C0393e c0393e2 = c0393eArr[i7];
                                        if (c0393e2.f2369b != null) {
                                            c0970e = c0393e2.f2369b[c0456j.f1614bX.m4454R()];
                                        } else {
                                            c0970e = c0393e2.f2368a;
                                        }
                                        float f26 = i7 * c0392d.f2330x;
                                        interfaceC1063y2.mo136k();
                                        interfaceC1063y2.mo228a(f14, f20, f21 - f26);
                                        if (f24 != 1.0f || f25 != 1.0f) {
                                            interfaceC1063y2.mo227a(f24, f25, f20, f21 - f26);
                                        }
                                        interfaceC1063y2.mo193a(c0970e, m3951a(c0392d, c0393e2, c0970e, i4 + (i7 * c0392d.f2331y)), m3952a(c0392d, c0393e2, c0970e, f20, f21 - f26), c0966ag2);
                                        interfaceC1063y2.mo135l();
                                    }
                                }
                            }
                            abstractC0244am = null;
                            if (c0392d.f2362ad != null) {
                                abstractC0244am = c0392d.f2362ad.readUnit(c0456j);
                            }
                            if (abstractC0244am != null) {
                                float f27 = f7 - gameEngine.f6357cw;
                                float f28 = (f8 - gameEngine.f6358cx) - f17;
                                float f29 = abstractC0244am.f7172eo - gameEngine.f6357cw;
                                float f30 = (abstractC0244am.f7173ep - gameEngine.f6358cx) - abstractC0244am.f7174eq;
                                Paint paint2 = c0392d.f2366ah;
                                if (paint2 == null) {
                                    paint2 = f2296b;
                                }
                                if (c0392d.f2367ai != null) {
                                    float readNumber4 = c0392d.f2367ai.readNumber(c0456j);
                                    if (readNumber4 != 1.0f) {
                                        Paint paint3 = f2295a;
                                        paint3.m5206b(paint2.m5194e());
                                        int m5192f2 = (int) (paint2.m5192f() * readNumber4);
                                        if (m5192f2 < 0) {
                                            m5192f2 = 0;
                                        }
                                        if (m5192f2 > 255) {
                                            m5192f2 = 255;
                                        }
                                        paint3.m5201c(m5192f2);
                                        paint2 = paint3;
                                    }
                                }
                                gameEngine.f6326bO.mo226a(f27, f28, f29, f30, paint2);
                            }
                        }
                    } else if (c0392d.f2365ag != -1) {
                        if (c0392d.f2365ag >= c0456j.f1654cL.length) {
                            continue;
                        } else {
                            int i8 = c0392d.f2365ag;
                            C1115ai mo3054F = c0456j.mo3054F(i8);
                            f2 = mo3054F.f7064a;
                            f3 = mo3054F.f7065b;
                            f4 = c0456j.f7174eq + mo3054F.f7066c;
                            f5 = c0456j.f1654cL[i8].f1717a + 90.0f;
                            f6 = c0456j.f1654cL[i8].f1717a;
                            if (c0392d.f2357Y) {
                            }
                            if (c0392d.f2358Z) {
                            }
                            float f132 = f6 + c0392d.f2360ab;
                            float f142 = f5 + c0392d.f2359aa;
                            f7 = f2 + c0392d.f2352T;
                            f8 = f3 + c0392d.f2353U;
                            if (c0392d.f2355W != null) {
                            }
                            if (c0392d.f2356X != null) {
                            }
                            if (c0392d.f2350R == 0.0f) {
                            }
                            float m2107k22 = C0773f.m2107k(f132);
                            float m2110j22 = C0773f.m2110j(f132);
                            float f152 = c0392d.f2350R;
                            float f162 = c0392d.f2351S;
                            f7 += (m2107k22 * f162) - (m2110j22 * f152);
                            f8 += (m2110j22 * f162) + (m2107k22 * f152);
                            float f172 = f4 + c0392d.f2354V;
                            if (!z3) {
                            }
                            if (c0392d.f2327u) {
                            }
                            abstractC0244am = null;
                            if (c0392d.f2362ad != null) {
                            }
                            if (abstractC0244am != null) {
                            }
                        }
                    } else {
                        if (c0392d.f2361ac == null) {
                            readUnit = c0456j;
                        } else {
                            readUnit = c0392d.f2361ac.readUnit(c0456j);
                            if (readUnit == null) {
                                continue;
                            }
                        }
                        f2 = readUnit.f7172eo;
                        f3 = readUnit.f7173ep;
                        f4 = readUnit.f7174eq;
                        if (pointF != null && c0392d.f2361ac == null) {
                            f2 = pointF.x;
                            f3 = pointF.y;
                        }
                        f5 = readUnit.f1623cg + 90.0f;
                        f6 = readUnit.f1623cg;
                        if (c0392d.f2361ac == null && c0456j.f2891x.f3104dC) {
                            float f31 = c0456j.f1654cL[c0456j.f2891x.f3108dG].f1717a;
                            f5 = f31 + 90.0f;
                            f6 = f31;
                        }
                        if (c0392d.f2357Y) {
                        }
                        if (c0392d.f2358Z) {
                        }
                        float f1322 = f6 + c0392d.f2360ab;
                        float f1422 = f5 + c0392d.f2359aa;
                        f7 = f2 + c0392d.f2352T;
                        f8 = f3 + c0392d.f2353U;
                        if (c0392d.f2355W != null) {
                        }
                        if (c0392d.f2356X != null) {
                        }
                        if (c0392d.f2350R == 0.0f) {
                        }
                        float m2107k222 = C0773f.m2107k(f1322);
                        float m2110j222 = C0773f.m2110j(f1322);
                        float f1522 = c0392d.f2350R;
                        float f1622 = c0392d.f2351S;
                        f7 += (m2107k222 * f1622) - (m2110j222 * f1522);
                        f8 += (m2110j222 * f1622) + (m2107k222 * f1522);
                        float f1722 = f4 + c0392d.f2354V;
                        if (!z3) {
                        }
                        if (c0392d.f2327u) {
                        }
                        abstractC0244am = null;
                        if (c0392d.f2362ad != null) {
                        }
                        if (abstractC0244am != null) {
                        }
                    }
                }
            }
        }
    }
}