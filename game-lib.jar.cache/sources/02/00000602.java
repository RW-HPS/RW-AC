package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ae.class */
public class ae {
    static Object a = new Object();
    static ag b = new ag();
    static af c;

    public static boolean a() {
        if (GameEngine.at()) {
            return true;
        }
        return false;
    }

    public static af a(String str) {
        if (ag.i(str)) {
            return b;
        }
        if (a() && com.corrodinggames.rts.gameFramework.utility.a.a.l(str)) {
            if (c == null) {
                synchronized (a) {
                    if (c == null) {
                        c = new com.corrodinggames.rts.gameFramework.utility.a.a();
                    }
                }
            }
            return c;
        }
        return null;
    }

    public static af b(String str) {
        if (a() && com.corrodinggames.rts.gameFramework.utility.a.a.l(str)) {
            if (c == null) {
                synchronized (a) {
                    if (c == null) {
                        c = new com.corrodinggames.rts.gameFramework.utility.a.a();
                    }
                }
            }
            return c;
        }
        return null;
    }

    public static void c(String str) {
        if (b != null && ag.i(str)) {
            b.k(str);
        }
    }

    public static void b() {
        if (b != null) {
            b.a();
        }
        if (c != null) {
            c.a();
        }
    }
}