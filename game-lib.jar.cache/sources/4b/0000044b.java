package com.corrodinggames.rts.gameFramework.b.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a.class */
public enum a {
    A_Position(1, "a_Position"),
    A_TexCoordinate(2, "a_TexCoordinate");
    
    private int c;
    private String d;

    a(int i, String str) {
        this.c = i;
        this.d = str;
    }

    public int a() {
        return this.c;
    }

    public String b() {
        return this.d;
    }
}