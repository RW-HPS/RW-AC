package com.corrodinggames.rts.gameFramework;

import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g.class */
public final class g {

    /* renamed from: a  reason: collision with root package name */
    protected static h f533a;

    public static h a() {
        if (f533a == null) {
            String lowerCase = System.getProperty("os.name", "generic").toLowerCase(Locale.ENGLISH);
            if (lowerCase.indexOf("mac") >= 0 || lowerCase.indexOf("darwin") >= 0) {
                f533a = h.MacOS;
            } else if (lowerCase.indexOf("win") >= 0) {
                f533a = h.Windows;
            } else if (lowerCase.indexOf("nux") >= 0) {
                f533a = h.Linux;
            } else {
                f533a = h.Other;
            }
        }
        return f533a;
    }
}