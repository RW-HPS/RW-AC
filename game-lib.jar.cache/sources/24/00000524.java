package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.i;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ar.class */
public class ar {
    public static int a(int i) {
        return i + 5;
    }

    public static String a() {
        if (!GameEngine.at()) {
            return null;
        }
        return ((i) GameEngine.getGameEngine()).o();
    }
}