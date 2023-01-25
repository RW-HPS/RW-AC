package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.units.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/c.class */
public class C0208c {

    /* renamed from: c */
    private static final HashMap f1431c = new HashMap();

    /* renamed from: a */
    public static final C0208c f1432a = m4336a("-1");

    /* renamed from: b */
    String f1433b;

    /* renamed from: a */
    public static C0208c m4336a(String str) {
        C0208c c0208c = (C0208c) f1431c.get(str);
        if (c0208c != null) {
            return c0208c;
        }
        C0208c c0208c2 = new C0208c(str);
        f1431c.put(str, c0208c2);
        return c0208c2;
    }

    /* renamed from: a */
    public String m4340a() {
        return this.f1433b;
    }

    private C0208c(String str) {
        this.f1433b = str;
    }

    /* renamed from: a */
    public static void m4338a(GameOutputStream gameOutputStream, C0208c c0208c) {
        String str = null;
        if (c0208c != null) {
            str = c0208c.f1433b;
        }
        gameOutputStream.writeIsString(str);
    }

    /* renamed from: a */
    public static C0208c m4337a(GameInputStream gameInputStream) {
        String isReadString = gameInputStream.isReadString();
        if (isReadString != null) {
            return m4336a(isReadString);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return this.f1433b.hashCode();
    }

    public String toString() {
        return "ActionId(" + this.f1433b + ")";
    }

    /* renamed from: a */
    public final boolean m4339a(C0208c c0208c) {
        return this == c0208c;
    }
}