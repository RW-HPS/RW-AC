package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aj.class */
public class aj {
    String a;
    long b;
    String c;

    public String a() {
        return this.c != null ? this.c : "Active ban";
    }

    public float b() {
        return ((float) (this.b - System.currentTimeMillis())) / 1000.0f;
    }
}