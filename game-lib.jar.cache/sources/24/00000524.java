package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ar.class */
public class C0894ar {
    /* renamed from: a */
    public static int m1402a(int i) {
        return i + 5;
    }

    /* renamed from: a */
    public static String m1403a() {
        if (!GameEngine.m1030at()) {
            return null;
        }
        return ((C0191i) GameEngine.getGameEngine()).m4485o();
    }
}