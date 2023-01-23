package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ab.class */
public class ab {

    /* renamed from: a  reason: collision with root package name */
    String f237a;
    String b;
    int c;
    int d;
    String e;
    l f;

    public String a() {
        String str = "from internal units";
        if (this.f237a != null) {
            str = "from mod:'" + this.f237a + "'";
        }
        com.corrodinggames.rts.gameFramework.i.b f = GameEngine.getGameEngine().bZ.f(this.f237a);
        if (f != null) {
            if (!f.m()) {
                str = str + " (You seem to have this mod but it is not enabled)";
            } else {
                str = str + " (You seem to have this mod but it might be a different version)";
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (this.f != null && this.e != null) {
            if (this.f.I == null) {
                str2 = " (Extra debug not enabled)";
            } else {
                String[] split = this.e.split("\n");
                String[] split2 = this.f.I.split("\n");
                int c = com.corrodinggames.rts.gameFramework.f.c(split.length, split2.length);
                if (split.length != split2.length) {
                    str2 = str2 + "Line length difference: " + split.length + " vs " + split2.length;
                }
                int i = 0;
                while (true) {
                    if (i >= c) {
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
        if (this.d == -1) {
            return "The server requires the unit:" + this.b + " that was not found " + str + str2;
        }
        return "Found unit:" + this.b + " but it does not match the server's copy " + str + str2 + " (checksum c:" + this.d + " s:" + this.c + ")";
    }
}