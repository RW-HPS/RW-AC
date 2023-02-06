package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/h.class */
public final class h {
    public final g[] a;

    public h(g[] gVarArr) {
        this.a = gVarArr;
    }

    public boolean a() {
        return this.a.length == 0;
    }

    public boolean a(h hVar) {
        g[] gVarArr;
        if (hVar == null) {
            if (a()) {
                return true;
            }
            return false;
        } else if (this.a.length != hVar.a.length) {
            return false;
        } else {
            for (g gVar : this.a) {
                boolean z = false;
                g[] gVarArr2 = hVar.a;
                int length = gVarArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (gVar != gVarArr2[i]) {
                            i++;
                        } else {
                            z = true;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
            return true;
        }
    }

    public int b() {
        return this.a.length;
    }

    public String toString() {
        g[] gVarArr;
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        for (g gVar : this.a) {
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = str + gVar.a;
        }
        return "{" + str + "}";
    }
}