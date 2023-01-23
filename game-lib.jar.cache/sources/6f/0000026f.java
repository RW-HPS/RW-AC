package com.corrodinggames.rts.game.units.custom;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bo.class */
public class bo extends Exception {
    public String b;
    public String c;
    public String d;

    public bo(String str, String str2) {
        super(str);
        this.b = str2;
    }

    public bo(String str) {
        super(str);
    }

    public bo(String str, String str2, String str3) {
        super(str);
        this.c = str2;
        this.d = str3;
    }

    public bo(String str, Exception exc) {
        super(str, exc);
    }
}