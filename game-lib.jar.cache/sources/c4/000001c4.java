package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ao.class */
public enum ao {
    NONE,
    LAND,
    BUILDING,
    AIR,
    WATER,
    HOVER,
    OVER_CLIFF,
    OVER_CLIFF_WATER;

    public static ao a(String str, String str2) {
        ao[] values;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            String str3 = VariableScope.nullOrMissingString;
            for (int i2 = 0; i2 < values().length; i2++) {
                str3 = str3 + ", " + values[i2].toString();
            }
            throw new IllegalArgumentException("Unknown movement type:'" + str + "' possible type:" + str3 + " on key:" + str2);
        }
    }
}