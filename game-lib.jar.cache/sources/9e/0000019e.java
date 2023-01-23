package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/c.class */
public class c {
    private static final HashMap c = new HashMap();

    /* renamed from: a  reason: collision with root package name */
    public static final c f175a = a("-1");
    String b;

    public static c a(String str) {
        c cVar = (c) c.get(str);
        if (cVar != null) {
            return cVar;
        }
        c cVar2 = new c(str);
        c.put(str, cVar2);
        return cVar2;
    }

    public String a() {
        return this.b;
    }

    private c(String str) {
        this.b = str;
    }

    public static void a(GameOutputStream gameOutputStream, c cVar) {
        String str = null;
        if (cVar != null) {
            str = cVar.b;
        }
        gameOutputStream.writeIsString(str);
    }

    public static c a(GameInputStream gameInputStream) {
        String isReadString = gameInputStream.isReadString();
        if (isReadString != null) {
            return a(isReadString);
        }
        return null;
    }

    public boolean equals(Object obj) {
        return this == obj;
    }

    public int hashCode() {
        return this.b.hashCode();
    }

    public String toString() {
        return "ActionId(" + this.b + ")";
    }

    public final boolean a(c cVar) {
        return this == cVar;
    }
}