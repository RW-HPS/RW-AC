package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.ao */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ao.class */
public enum EnumC0246ao {
    f1708a,
    f1709b,
    f1710c,
    f1711d,
    f1712e,
    f1713f,
    f1714g,
    f1715h;

    /* renamed from: a */
    public static EnumC0246ao m4190a(String str, String str2) {
        EnumC0246ao[] values;
        try {
            return valueOf(str.toUpperCase(Locale.ROOT));
        } catch (IllegalArgumentException e) {
            String str3 = VariableScope.nullOrMissingString;
            for (int i = 0; i < values().length; i++) {
                str3 = str3 + ", " + values[i].toString();
            }
            throw new IllegalArgumentException("Unknown movement type:'" + str + "' possible type:" + str3 + " on key:" + str2);
        }
    }
}