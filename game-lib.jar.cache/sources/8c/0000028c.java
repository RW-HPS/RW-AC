package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f.class */
public class f {
    public String a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public float h;
    public float i;
    public LogicBoolean j;
    public m k;
    public float n;
    public boolean o;
    public float q;
    public com.corrodinggames.rts.gameFramework.utility.m l = new com.corrodinggames.rts.gameFramework.utility.m();
    public boolean m = true;
    public ArrayList p = new ArrayList();

    public f(String str) {
        this.a = str;
    }

    public void a(l lVar) {
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a == d.legX || cVar.a == d.legY || cVar.a == d.legHeight || cVar.a == d.legDir || cVar.a == d.legAlpha) {
                boolean z = false;
                ba[] baVarArr = lVar.ax;
                int length = baVarArr.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    ba baVar = baVarArr[i];
                    if (!cVar.c.equals(baVar.b)) {
                        i++;
                    } else {
                        cVar.b = baVar.a;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    throw new bo("Cannot find leg:" + cVar.c + " for animation:" + this.a);
                }
            }
            if (cVar.b < 0) {
                throw new bo("Cannot find target for:" + cVar.c + " for animation:" + this.a);
            }
        }
    }

    public boolean a(n nVar) {
        Iterator it = this.p.iterator();
        while (it.hasNext()) {
            if (((n) it.next()) == nVar) {
                return true;
            }
        }
        return false;
    }

    public boolean a() {
        return this.o;
    }

    public void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2) {
        f a;
        boolean z = false;
        String str3 = null;
        String b = abVar.b(str, str2 + "onActions", (String) null);
        if (b != null) {
            for (String str4 : b.split(",")) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    n a2 = n.a(trim);
                    if (a2 == null) {
                        throw new bo("Unknown action type: " + trim + " on animation:" + this.a);
                    }
                    if (lVar.a(a2) != null) {
                        throw new bo("Cannot add action: " + trim + " to:" + this.a + " it already exists on:" + a.a);
                    }
                    this.p.add(a2);
                }
            }
        }
        this.q = abVar.a(str, str2 + "onActionsQueuedUnitPlayAt", Float.valueOf(0.0f)).floatValue();
        this.b = abVar.b(str, str2 + "start", (Integer) 0).intValue();
        this.c = abVar.b(str, str2 + "end", (Integer) (-1)).intValue();
        if (this.c != -1 && this.c < this.b) {
            throw new RuntimeException("animationEnd cannot before animationStart on animation:" + this.a);
        }
        this.k = m.a(lVar, abVar, str, VariableScope.nullOrMissingString, true);
        this.h = abVar.d(str, str2 + "blendIn", Float.valueOf(-1.0f)).floatValue();
        this.i = abVar.d(str, str2 + "blendOut", Float.valueOf(-1.0f)).floatValue();
        this.j = abVar.a(lVar, str, str2 + "playbackRate", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        this.d = abVar.a(str, str2 + "scale_start", Float.valueOf(1.0f)).floatValue();
        this.e = abVar.a(str, str2 + "scale_end", Float.valueOf(1.0f)).floatValue();
        Float a3 = abVar.a(str, str2 + "speed", (Float) null);
        if (a3 != null) {
            this.f = a3.floatValue();
            z = true;
            str3 = "speed";
        } else {
            this.f = 40.0f;
        }
        this.g = abVar.a(str, str2 + "pingPong", (Boolean) false).booleanValue();
        float f = 1.0f * this.f;
        float floatValue = abVar.a(str, str2 + "KeyframeTimeScale", Float.valueOf(1.0f)).floatValue();
        if (this.c != -1) {
            z = true;
            str3 = "animationEnd";
            c cVar = new c();
            cVar.a = d.frame;
            this.l.add(cVar);
            f *= (this.c - this.b) + 1;
            cVar.a(0.0f, this.b);
            cVar.a(f, this.c + 0.99f);
        }
        if (this.d != 1.0f || this.e != 1.0f) {
            z = true;
            str3 = "animationScaleX";
            c cVar2 = new c();
            cVar2.a = d.scale;
            this.l.add(cVar2);
            cVar2.a(0.0f, this.d);
            cVar2.a(f, this.e);
        }
        if (z) {
            this.n = f;
        }
        com.corrodinggames.rts.gameFramework.utility.m f2 = abVar.f(str, str2 + "leg", str2 + "arm");
        f2.addAll(abVar.k(str, str2 + "turret"));
        f2.addAll(abVar.k(str, str2 + "body"));
        f2.addAll(abVar.k(str, str2 + "effect"));
        Iterator it = f2.iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            if (0 == 0) {
                if (z) {
                    throw new bo("Cannot mix new (" + str5 + ") and old style (" + str3 + ") animations on:" + this.a);
                }
                a(lVar, abVar, str, str2, str5);
            }
        }
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        this.m = false;
        Iterator it2 = this.l.iterator();
        while (it2.hasNext()) {
            c cVar3 = (c) it2.next();
            cVar3.a(floatValue);
            cVar3.c();
            if (this.n < cVar3.d) {
                this.n = cVar3.d;
            }
            if (cVar3.e.length > 0) {
                this.o = true;
                if (cVar3.a != d.frame && cVar3.a != d.scale) {
                    this.m = true;
                }
                mVar.add(cVar3);
            }
        }
        this.l = mVar;
    }

    public c a(String str, String str2) {
        int i;
        d dVar;
        if (str2.startsWith("leg") || str2.startsWith("arm")) {
            i = -1;
            if (str.equalsIgnoreCase("x")) {
                dVar = d.legX;
            } else if (str.equalsIgnoreCase("y")) {
                dVar = d.legY;
            } else if (str.equalsIgnoreCase("dir")) {
                dVar = d.legDir;
            } else if (str.equalsIgnoreCase("height")) {
                dVar = d.legHeight;
            } else if (str.equalsIgnoreCase("alpha")) {
                dVar = d.legAlpha;
            } else {
                throw new bo("Unknown leg/arm animation type:" + str + " on animation:" + this.a);
            }
        } else if (str2.startsWith("turret")) {
            i = Integer.parseInt(str2.substring("turret".length())) - 1;
            if (str.equalsIgnoreCase("x")) {
                dVar = d.turretX;
            } else if (str.equalsIgnoreCase("y")) {
                dVar = d.turretY;
            } else {
                throw new bo("Unknown turret animation type:" + str + " on animation:" + this.a);
            }
        } else if (str2.startsWith("body")) {
            i = 0;
            if (str.equalsIgnoreCase("scale")) {
                dVar = d.scale;
            } else if (str.equalsIgnoreCase("frame")) {
                dVar = d.frame;
            } else {
                throw new bo("Unknown body animation type:" + str + " on animation:" + this.a);
            }
        } else if (str2.startsWith("effect")) {
            i = 0;
            dVar = d.event;
            str2 = "event";
        } else {
            throw new bo("Unknown animation target:" + str2 + " on animation:" + this.a);
        }
        Iterator it = this.l.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            if (cVar.a == dVar && str2.equals(cVar.c)) {
                return cVar;
            }
        }
        c cVar2 = new c();
        cVar2.a = dVar;
        cVar2.b = i;
        cVar2.c = str2;
        this.l.add(cVar2);
        return cVar2;
    }

    public void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, String str3) {
        String[] split;
        String str4 = str3.substring(str2.length()).split("_")[0];
        String substring = str3.substring((str2 + str4 + "_").length());
        try {
            float a = com.corrodinggames.rts.gameFramework.utility.ab.a(substring, false, str, str3);
            String e = abVar.e(str, str3);
            if (!e.startsWith("{") || !e.endsWith("}")) {
                throw new bo("Unknown format:" + e, str, str3);
            }
            String substring2 = e.substring(1, e.length() - 1);
            c cVar = null;
            for (String str5 : substring2.split(",")) {
                String[] split2 = str5.split(":");
                if (split2.length != 2) {
                    throw new bo("Unknown format on part:" + str5 + " of: " + substring2, str, str3);
                }
                String trim = split2[0].trim();
                String trim2 = split2[1].trim();
                c a2 = a(trim, str4);
                if (cVar != a2) {
                    if (cVar != null) {
                        cVar.b();
                    }
                    cVar = a2;
                }
                try {
                    a2.a(lVar, a, trim, trim2);
                } catch (bo e2) {
                    throw new bo(e2.getMessage() + " (as part of key:" + str3 + " section:" + str + ")", e2);
                }
            }
            if (cVar != null) {
                cVar.b();
            }
        } catch (NumberFormatException e3) {
            throw new bo("Failed to read time:" + substring + " in key:" + str3 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }
}