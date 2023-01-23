package com.corrodinggames.rts.gameFramework.utility;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class ac {

    /* renamed from: a  reason: collision with root package name */
    String f669a;
    String b;

    public ac(String str, String str2) {
        this.f669a = str;
        this.b = str2;
    }

    public String toString() {
        return "[" + this.f669a + "]" + this.b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof ac)) {
            return false;
        }
        ac acVar = (ac) obj;
        return this.b.equals(acVar.b) && this.f669a.equals(acVar.f669a);
    }

    public String a() {
        return this.f669a;
    }

    public String b() {
        return this.b;
    }
}