package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0417bo;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/e.class */
public class C0452e {
    /* renamed from: a */
    public static void m3686a(String str) {
        if (str.length() == 0) {
            throw new C0417bo("name cannot be empty");
        }
        if (str.contains(" ") || str.contains("}") || str.contains("$") || str.contains(".") || str.contains("{") || str.contains("-") || str.contains("+") || str.contains(":") || str.contains("(")) {
            throw new C0417bo("invalid character in name");
        }
        if (Character.isDigit(str.charAt(0))) {
            throw new C0417bo("name cannot start with a digit");
        }
    }
}