package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/n.class */
public class n {
    String a;
    String b;
    long c;
    String d;
    public int e = -1;
    public int f = -1;

    public int a() {
        return (int) (System.currentTimeMillis() - this.c);
    }

    public boolean b() {
        if (GameEngine.getGameEngine().a() || this.c + 14000 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}