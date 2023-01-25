package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g.class */
public final class C0846g {

    /* renamed from: a */
    protected static SystemType f5586a;

    /* renamed from: a */
    public static SystemType m1737a() {
        if (f5586a == null) {
            String lowerCase = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (lowerCase.indexOf("mac") >= 0 || lowerCase.indexOf("darwin") >= 0) {
                f5586a = SystemType.MacOS;
            } else if (lowerCase.indexOf("win") >= 0) {
                f5586a = SystemType.Windows;
            } else if (lowerCase.indexOf("nux") >= 0) {
                f5586a = SystemType.Linux;
            } else {
                f5586a = SystemType.Other;
            }
        }
        return f5586a;
    }
}