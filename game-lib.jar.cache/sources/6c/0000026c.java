package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bl.class */
public class C0414bl {

    /* renamed from: a */
    ArrayList f2562a = new ArrayList();

    /* renamed from: b */
    int f2563b;

    /* renamed from: a */
    public void m3888a(float f) {
        Iterator it = this.f2562a.iterator();
        while (it.hasNext()) {
            ((C0415bm) it.next()).f2565b = f;
        }
    }

    /* renamed from: a */
    public boolean m3889a() {
        return m3886a(0.0f, 0.0f, 1.0f, true);
    }

    /* renamed from: a */
    public boolean m3887a(float f, float f2, float f3) {
        return m3886a(f, f2, f3, false);
    }

    /* renamed from: a */
    public boolean m3886a(float f, float f2, float f3, boolean z) {
        if (this.f2562a.size() == 0) {
            return false;
        }
        if (this.f2563b >= this.f2562a.size()) {
            this.f2563b = 0;
        }
        C0415bm c0415bm = (C0415bm) this.f2562a.get(this.f2563b);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (z) {
            gameEngine.f6324bM.m2804c(c0415bm.f2564a, c0415bm.f2565b);
        } else {
            gameEngine.f6324bM.m2812a(c0415bm.f2564a, c0415bm.f2565b, f, f2);
        }
        this.f2563b++;
        return true;
    }

    /* renamed from: a */
    public static C0414bl m3885a(C0458l c0458l, String str) {
        return m3884a(c0458l, str, (C0414bl) null);
    }

    /* renamed from: a */
    public static C0414bl m3884a(C0458l c0458l, String str, C0414bl c0414bl) {
        if ((str == null || str.equals(VariableScope.nullOrMissingString)) && c0414bl != null) {
            return c0414bl;
        }
        return new C0414bl(c0458l, str);
    }

    public C0414bl() {
    }

    public C0414bl(C0458l c0458l, String str) {
        String[] split;
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return;
        }
        for (String str2 : str.split(",")) {
            C0415bm c0415bm = new C0415bm(this);
            String trim = str2.trim();
            String str3 = VariableScope.nullOrMissingString;
            if (trim.startsWith("ROOT:")) {
                trim = trim.substring("ROOT:".length());
                str3 = str3 + "ROOT:";
            }
            if (trim.startsWith("SHARED:")) {
                trim = trim.substring("SHARED:".length());
                str3 = str3 + "SHARED:";
            }
            String[] split2 = trim.split(":");
            String str4 = null;
            String trim2 = split2[0].trim();
            if (split2.length != 1) {
                if (split2.length == 2) {
                    str4 = split2[1].trim();
                } else {
                    throw new RuntimeException("Unknown sound format:" + trim);
                }
            }
            if (str4 != null) {
                try {
                    c0415bm.f2565b = Float.parseFloat(str4);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Failed to parse volume float: '" + str4 + "' of sound: '" + trim + "'");
                }
            }
            c0415bm.f2564a = C0349ag.m4021a(c0458l.f2946F, str3 + trim2, c0458l);
            if (c0415bm.f2564a != null) {
                this.f2562a.add(c0415bm);
            }
        }
    }
}