package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/w.class */
public class w {
    public String a;
    public String b;
    public GameConnectStatusType c;

    public void a(String str) {
        this.a = str;
    }

    public void a(String str, GameConnectStatusType gameConnectStatusType, Exception exc) {
        this.b = str;
        this.c = gameConnectStatusType;
    }
}