package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f.class */
public class C0446f {

    /* renamed from: a */
    public String f2833a;

    /* renamed from: b */
    public int f2834b;

    /* renamed from: c */
    public int f2835c;

    /* renamed from: d */
    public float f2836d;

    /* renamed from: e */
    public float f2837e;

    /* renamed from: f */
    public float f2838f;

    /* renamed from: g */
    public boolean f2839g;

    /* renamed from: h */
    public float f2840h;

    /* renamed from: i */
    public float f2841i;

    /* renamed from: j */
    public LogicBoolean f2842j;

    /* renamed from: k */
    public C0460m f2843k;

    /* renamed from: n */
    public float f2844n;

    /* renamed from: o */
    public boolean f2845o;

    /* renamed from: q */
    public float f2846q;

    /* renamed from: l */
    public C1136m f2847l = new C1136m();

    /* renamed from: m */
    public boolean f2848m = true;

    /* renamed from: p */
    public ArrayList f2849p = new ArrayList();

    public C0446f(String str) {
        this.f2833a = str;
    }

    /* renamed from: a */
    public void m3707a(C0458l c0458l) {
        Iterator it = this.f2847l.iterator();
        while (it.hasNext()) {
            C0420c c0420c = (C0420c) it.next();
            if (c0420c.f2682a == EnumC0427d.legX || c0420c.f2682a == EnumC0427d.legY || c0420c.f2682a == EnumC0427d.legHeight || c0420c.f2682a == EnumC0427d.legDir || c0420c.f2682a == EnumC0427d.legAlpha) {
                boolean z = false;
                C0403ba[] c0403baArr = c0458l.f3255ax;
                int length = c0403baArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    C0403ba c0403ba = c0403baArr[i];
                    if (!c0420c.f2684c.equals(c0403ba.f2460b)) {
                        i++;
                    } else {
                        c0420c.f2683b = c0403ba.f2459a;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new C0417bo("Cannot find leg:" + c0420c.f2684c + " for animation:" + this.f2833a);
                }
            }
            if (c0420c.f2683b < 0) {
                throw new C0417bo("Cannot find target for:" + c0420c.f2684c + " for animation:" + this.f2833a);
            }
        }
    }

    /* renamed from: a */
    public boolean m3704a(EnumC0461n enumC0461n) {
        Iterator it = this.f2849p.iterator();
        while (it.hasNext()) {
            if (((EnumC0461n) it.next()) == enumC0461n) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public boolean m3708a() {
        return this.f2845o;
    }

    /* renamed from: a */
    public void m3706a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        C0446f m3553a;
        boolean z = false;
        String str3 = null;
        String m666b = c1107ab.m666b(str, str2 + "onActions", (String) null);
        if (m666b != null) {
            for (String str4 : m666b.split(",")) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    EnumC0461n m3482a = EnumC0461n.m3482a(trim);
                    if (m3482a == null) {
                        throw new C0417bo("Unknown action type: " + trim + " on animation:" + this.f2833a);
                    }
                    if (c0458l.m3553a(m3482a) != null) {
                        throw new C0417bo("Cannot add action: " + trim + " to:" + this.f2833a + " it already exists on:" + m3553a.f2833a);
                    }
                    this.f2849p.add(m3482a);
                }
            }
        }
        this.f2846q = c1107ab.m683a(str, str2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0f)).floatValue();
        this.f2834b = c1107ab.m667b(str, str2 + "start", (Integer) 0).intValue();
        this.f2835c = c1107ab.m667b(str, str2 + "end", (Integer) (-1)).intValue();
        if (this.f2835c != -1 && this.f2835c < this.f2834b) {
            throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.f2833a);
        }
        this.f2843k = C0460m.m3483a(c0458l, c1107ab, str, VariableScope.nullOrMissingString, true);
        this.f2840h = c1107ab.m656d(str, str2 + "blendIn", Float.valueOf(-1.0f)).floatValue();
        this.f2841i = c1107ab.m656d(str, str2 + "blendOut", Float.valueOf(-1.0f)).floatValue();
        this.f2842j = c1107ab.m703a(c0458l, str, str2 + "playbackRate", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        this.f2836d = c1107ab.m683a(str, str2 + "scale_start", Float.valueOf(1.0f)).floatValue();
        this.f2837e = c1107ab.m683a(str, str2 + "scale_end", Float.valueOf(1.0f)).floatValue();
        Float m683a = c1107ab.m683a(str, str2 + "speed", (Float) null);
        if (m683a != null) {
            this.f2838f = m683a.floatValue();
            z = true;
            str3 = "speed";
        } else {
            this.f2838f = 40.0f;
        }
        this.f2839g = c1107ab.m685a(str, str2 + "pingPong", (Boolean) false).booleanValue();
        float f = 1.0f * this.f2838f;
        float floatValue = c1107ab.m683a(str, str2 + "KeyframeTimeScale", Float.valueOf(1.0f)).floatValue();
        if (this.f2835c != -1) {
            z = true;
            str3 = "animationEnd";
            C0420c c0420c = new C0420c();
            c0420c.f2682a = EnumC0427d.frame;
            this.f2847l.add(c0420c);
            f *= (this.f2835c - this.f2834b) + 1;
            c0420c.m3867a(0.0f, this.f2834b);
            c0420c.m3867a(f, this.f2835c + 0.99f);
        }
        if (this.f2836d != 1.0f || this.f2837e != 1.0f) {
            z = true;
            str3 = "animationScaleX";
            C0420c c0420c2 = new C0420c();
            c0420c2.f2682a = EnumC0427d.scale;
            this.f2847l.add(c0420c2);
            c0420c2.m3867a(0.0f, this.f2836d);
            c0420c2.m3867a(f, this.f2837e);
        }
        if (z) {
            this.f2844n = f;
        }
        C1136m m649f = c1107ab.m649f(str, str2 + "leg", str2 + "arm");
        m649f.addAll(c1107ab.m639k(str, str2 + "turret"));
        m649f.addAll(c1107ab.m639k(str, str2 + "body"));
        m649f.addAll(c1107ab.m639k(str, str2 + "effect"));
        Iterator it = m649f.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (0 == 0) {
                if (z) {
                    throw new C0417bo("Cannot mix new (" + str5 + ") and old style (" + str3 + ") animations on:" + this.f2833a);
                }
                m3705a(c0458l, c1107ab, str, str2, str5);
            }
        }
        C1136m c1136m = new C1136m();
        this.f2848m = false;
        Iterator it2 = this.f2847l.iterator();
        while (it2.hasNext()) {
            C0420c c0420c3 = (C0420c) it2.next();
            c0420c3.m3868a(floatValue);
            c0420c3.m3862c();
            if (this.f2844n < c0420c3.f2685d) {
                this.f2844n = c0420c3.f2685d;
            }
            if (c0420c3.f2686e.length > 0) {
                this.f2845o = true;
                if (c0420c3.f2682a != EnumC0427d.frame && c0420c3.f2682a != EnumC0427d.scale) {
                    this.f2848m = true;
                }
                c1136m.add(c0420c3);
            }
        }
        this.f2847l = c1136m;
    }

    /* renamed from: a */
    public C0420c m3703a(String str, String str2) {
        int i;
        EnumC0427d enumC0427d;
        if (str2.startsWith("leg") || str2.startsWith("arm")) {
            i = -1;
            if (str.equalsIgnoreCase("x")) {
                enumC0427d = EnumC0427d.legX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0427d = EnumC0427d.legY;
            } else if (str.equalsIgnoreCase("dir")) {
                enumC0427d = EnumC0427d.legDir;
            } else if (str.equalsIgnoreCase("height")) {
                enumC0427d = EnumC0427d.legHeight;
            } else if (str.equalsIgnoreCase("alpha")) {
                enumC0427d = EnumC0427d.legAlpha;
            } else {
                throw new C0417bo("Unknown leg/arm animation type:" + str + " on animation:" + this.f2833a);
            }
        } else if (str2.startsWith("turret")) {
            i = Integer.parseInt(str2.substring("turret".length())) - 1;
            if (str.equalsIgnoreCase("x")) {
                enumC0427d = EnumC0427d.turretX;
            } else if (str.equalsIgnoreCase("y")) {
                enumC0427d = EnumC0427d.turretY;
            } else {
                throw new C0417bo("Unknown turret animation type:" + str + " on animation:" + this.f2833a);
            }
        } else if (str2.startsWith("body")) {
            i = 0;
            if (str.equalsIgnoreCase("scale")) {
                enumC0427d = EnumC0427d.scale;
            } else if (str.equalsIgnoreCase("frame")) {
                enumC0427d = EnumC0427d.frame;
            } else {
                throw new C0417bo("Unknown body animation type:" + str + " on animation:" + this.f2833a);
            }
        } else if (str2.startsWith("effect")) {
            i = 0;
            enumC0427d = EnumC0427d.event;
            str2 = "event";
        } else {
            throw new C0417bo("Unknown animation target:" + str2 + " on animation:" + this.f2833a);
        }
        Iterator it = this.f2847l.iterator();
        while (it.hasNext()) {
            C0420c c0420c = (C0420c) it.next();
            if (c0420c.f2682a == enumC0427d && str2.equals(c0420c.f2684c)) {
                return c0420c;
            }
        }
        C0420c c0420c2 = new C0420c();
        c0420c2.f2682a = enumC0427d;
        c0420c2.f2683b = i;
        c0420c2.f2684c = str2;
        this.f2847l.add(c0420c2);
        return c0420c2;
    }

    /* renamed from: a */
    public void m3705a(C0458l c0458l, C1107ab c1107ab, String str, String str2, String str3) {
        String[] split;
        String str4 = str3.substring(str2.length()).split("_")[0];
        String substring = str3.substring((str2 + str4 + "_").length());
        try {
            float m673a = C1107ab.m673a(substring, false, str, str3);
            String m653e = c1107ab.m653e(str, str3);
            if (!m653e.startsWith("{") || !m653e.endsWith("}")) {
                throw new C0417bo("Unknown format:" + m653e, str, str3);
            }
            String substring2 = m653e.substring(1, m653e.length() - 1);
            C0420c c0420c = null;
            for (String str5 : substring2.split(",")) {
                String[] split2 = str5.split(":");
                if (split2.length != 2) {
                    throw new C0417bo("Unknown format on part:" + str5 + " of: " + substring2, str, str3);
                }
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                C0420c m3703a = m3703a(trim, str4);
                if (c0420c != m3703a) {
                    if (c0420c != null) {
                        c0420c.m3864b();
                    }
                    c0420c = m3703a;
                }
                try {
                    m3703a.m3865a(c0458l, m673a, trim, trim2);
                } catch (C0417bo e) {
                    throw new C0417bo(e.getMessage() + " (as part of key:" + str3 + " section:" + str + ")", e);
                }
            }
            if (c0420c != null) {
                c0420c.m3864b();
            }
        } catch (NumberFormatException e2) {
            throw new C0417bo("Failed to read time:" + substring + " in key:" + str3 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }
}