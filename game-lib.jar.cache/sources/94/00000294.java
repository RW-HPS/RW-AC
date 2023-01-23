package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/h.class */
public final class h {

    /* renamed from: a  reason: collision with root package name */
    public final g[] f306a;

    public h(g[] gVarArr) {
        this.f306a = gVarArr;
    }

    public boolean a() {
        return this.f306a.length == 0;
    }

    public boolean a(h hVar) {
        g[] gVarArr;
        if (hVar == null) {
            if (a()) {
                return true;
            }
            return false;
        } else if (this.f306a.length != hVar.f306a.length) {
            return false;
        } else {
            for (g gVar : this.f306a) {
                boolean z = false;
                g[] gVarArr2 = hVar.f306a;
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
        return this.f306a.length;
    }

    public String toString() {
        g[] gVarArr;
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        for (g gVar : this.f306a) {
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = str + gVar.f305a;
        }
        return "{" + str + "}";
    }
}