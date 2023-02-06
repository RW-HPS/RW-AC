package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
class aa {
    public long a = a(true);
    public String b;

    public aa(String str) {
        this.b = str;
    }

    public long a(boolean z) {
        if (GameEngine.au()) {
            return 0L;
        }
        long a = FileChangeEngine.a(this.b, z);
        if (z && a == 0) {
            GameEngine.m5e("Failed to watch: " + this.b);
        }
        return a;
    }
}