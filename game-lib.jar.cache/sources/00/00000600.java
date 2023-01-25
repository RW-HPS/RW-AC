package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class C1108ac {

    /* renamed from: a */
    String f7048a;

    /* renamed from: b */
    String f7049b;

    public C1108ac(String str, String str2) {
        this.f7048a = str;
        this.f7049b = str2;
    }

    public String toString() {
        return "[" + this.f7048a + "]" + this.f7049b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1108ac)) {
            return false;
        }
        C1108ac c1108ac = (C1108ac) obj;
        return this.f7049b.equals(c1108ac.f7049b) && this.f7048a.equals(c1108ac.f7048a);
    }

    /* renamed from: a */
    public String m635a() {
        return this.f7048a;
    }

    /* renamed from: b */
    public String m634b() {
        return this.f7049b;
    }
}