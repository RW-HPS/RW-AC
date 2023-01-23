package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    public long f236a = a(true);
    public String b;

    public aa(String str) {
        this.b = str;
    }

    public long a(boolean z) {
        if (GameEngine.au()) {
            return 0L;
        }
        long a2 = FileChangeEngine.a(this.b, z);
        if (z && a2 == 0) {
            GameEngine.m328e("Failed to watch: " + this.b);
        }
        return a2;
    }
}