package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.game.units.custom.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/h.class */
public final class C0454h {

    /* renamed from: a */
    public final C0453g[] f2866a;

    public C0454h(C0453g[] c0453gArr) {
        this.f2866a = c0453gArr;
    }

    /* renamed from: a */
    public boolean m3676a() {
        return this.f2866a.length == 0;
    }

    /* renamed from: a */
    public boolean m3675a(C0454h c0454h) {
        C0453g[] c0453gArr;
        if (c0454h == null) {
            if (m3676a()) {
                return true;
            }
            return false;
        } else if (this.f2866a.length != c0454h.f2866a.length) {
            return false;
        } else {
            for (C0453g c0453g : this.f2866a) {
                boolean z = false;
                C0453g[] c0453gArr2 = c0454h.f2866a;
                int length = c0453gArr2.length;
                int i = 0;
                while (true) {
                    if (i < length) {
                        if (c0453g != c0453gArr2[i]) {
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

    /* renamed from: b */
    public int m3674b() {
        return this.f2866a.length;
    }

    public String toString() {
        C0453g[] c0453gArr;
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        for (C0453g c0453g : this.f2866a) {
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = str + c0453g.f2862a;
        }
        return "{" + str + "}";
    }
}