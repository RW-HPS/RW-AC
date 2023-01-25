package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.bc */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bc.class */
public class C0405bc {

    /* renamed from: a */
    public String f2510a;

    /* renamed from: b */
    public String f2511b;

    public C0405bc() {
    }

    public C0405bc(String str, String str2) {
        this.f2510a = str;
        this.f2511b = str2;
    }

    /* renamed from: a */
    public void m3908a(String str, String str2) {
        if (this.f2511b != null) {
            this.f2511b = this.f2511b.replaceAll(str, str2);
        }
    }
}