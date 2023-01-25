package com.corrodinggames.rts.game.units.custom;

/* renamed from: com.corrodinggames.rts.game.units.custom.bo */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bo.class */
public class C0417bo extends Exception {

    /* renamed from: b */
    public String f2655b;

    /* renamed from: c */
    public String f2656c;

    /* renamed from: d */
    public String f2657d;

    public C0417bo(String str, String str2) {
        super(str);
        this.f2655b = str2;
    }

    public C0417bo(String str) {
        super(str);
    }

    public C0417bo(String str, String str2, String str3) {
        super(str);
        this.f2656c = str2;
        this.f2657d = str3;
    }

    public C0417bo(String str, Exception exc) {
        super(str, exc);
    }
}