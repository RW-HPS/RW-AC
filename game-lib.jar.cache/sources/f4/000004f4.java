package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g.class */
public final class g {
    protected static SystemType a;

    public static SystemType a() {
        if (a == null) {
            String lowerCase = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (lowerCase.indexOf("mac") >= 0 || lowerCase.indexOf("darwin") >= 0) {
                a = SystemType.MacOS;
            } else if (lowerCase.indexOf("win") >= 0) {
                a = SystemType.Windows;
            } else if (lowerCase.indexOf("nux") >= 0) {
                a = SystemType.Linux;
            } else {
                a = SystemType.Other;
            }
        }
        return a;
    }
}