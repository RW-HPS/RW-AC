package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.p049a.C1103a;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ae.class */
public class C1110ae {

    /* renamed from: a */
    static Object f7053a = new Object();

    /* renamed from: b */
    static C1112ag f7054b = new C1112ag();

    /* renamed from: c */
    static AbstractC1111af f7055c;

    /* renamed from: a */
    public static boolean m631a() {
        if (GameEngine.m1030at()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static AbstractC1111af m630a(String str) {
        if (C1112ag.m611i(str)) {
            return f7054b;
        }
        if (m631a() && C1103a.m730l(str)) {
            if (f7055c == null) {
                synchronized (f7053a) {
                    if (f7055c == null) {
                        f7055c = new C1103a();
                    }
                }
            }
            return f7055c;
        }
        return null;
    }

    /* renamed from: b */
    public static AbstractC1111af m628b(String str) {
        if (m631a() && C1103a.m730l(str)) {
            if (f7055c == null) {
                synchronized (f7053a) {
                    if (f7055c == null) {
                        f7055c = new C1103a();
                    }
                }
            }
            return f7055c;
        }
        return null;
    }

    /* renamed from: c */
    public static void m627c(String str) {
        if (f7054b != null && C1112ag.m611i(str)) {
            f7054b.m609k(str);
        }
    }

    /* renamed from: b */
    public static void m629b() {
        if (f7054b != null) {
            f7054b.mo626a();
        }
        if (f7055c != null) {
            f7055c.mo626a();
        }
    }
}