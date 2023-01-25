package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.C0859b;

/* renamed from: com.corrodinggames.rts.game.units.custom.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ab.class */
public class C0344ab {

    /* renamed from: a */
    String f2167a;

    /* renamed from: b */
    String f2168b;

    /* renamed from: c */
    int f2169c;

    /* renamed from: d */
    int f2170d;

    /* renamed from: e */
    String f2171e;

    /* renamed from: f */
    C0458l f2172f;

    /* renamed from: a */
    public String m4047a() {
        String str = "from internal units";
        if (this.f2167a != null) {
            str = "from mod:'" + this.f2167a + "'";
        }
        C0859b m1684f = GameEngine.getGameEngine().f6385bZ.m1684f(this.f2167a);
        if (m1684f != null) {
            if (!m1684f.m1655m()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (this.f2172f != null && this.f2171e != null) {
            if (this.f2172f.f2967I == null) {
                str2 = " (Extra debug not enabled)";
            } else {
                String[] split = this.f2171e.split("\n");
                String[] split2 = this.f2172f.f2967I.split("\n");
                int m2147c = C0773f.m2147c(split.length, split2.length);
                if (split.length != split2.length) {
                    str2 = str2 + "Line length difference: " + split.length + " vs " + split2.length;
                }
                int i = 0;
                while (true) {
                    if (i >= m2147c) {
                        break;
                    } else if (split[i].equals(split2[i])) {
                        i++;
                    } else {
                        str2 = str2 + "Difference on line " + i + ": '" + split[i] + "' vs '" + split2[i] + "'";
                        break;
                    }
                }
            }
        }
        if (this.f2170d == -1) {
            return "The server requires the unit:" + this.f2168b + " that was not found " + str + str2;
        }
        return "Found unit:" + this.f2168b + " but it does not match the server's copy " + str + str2 + " (checksum c:" + this.f2170d + " s:" + this.f2169c + ")";
    }
}