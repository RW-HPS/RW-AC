package com.corrodinggames.rts.gameFramework.utility;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class ac {
    String a;
    String b;

    public ac(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public String toString() {
        return "[" + this.a + "]" + this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.b.equals(acVar.b) && this.a.equals(acVar.a);
    }

    public String a() {
        return this.a;
    }

    public String b() {
        return this.b;
    }
}