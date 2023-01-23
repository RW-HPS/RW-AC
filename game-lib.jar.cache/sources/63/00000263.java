package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bc.class */
public class bc {

    /* renamed from: a  reason: collision with root package name */
    public String f268a;
    public String b;

    public bc() {
    }

    public bc(String str, String str2) {
        this.f268a = str;
        this.b = str2;
    }

    public void a(String str, String str2) {
        if (this.b != null) {
            this.b = this.b.replaceAll(str, str2);
        }
    }
}