package com.corrodinggames.rts.game.units.custom.f;

import com.corrodinggames.rts.game.units.custom.bo;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/e.class */
public class e {
    public static void a(String str) {
        if (str.length() == 0) {
            throw new bo("name cannot be empty");
        }
        if (str.contains(" ") || str.contains("}") || str.contains("$") || str.contains(".") || str.contains("{") || str.contains("-") || str.contains("+") || str.contains(":") || str.contains("(")) {
            throw new bo("invalid character in name");
        }
        if (Character.isDigit(str.charAt(0))) {
            throw new bo("name cannot start with a digit");
        }
    }
}