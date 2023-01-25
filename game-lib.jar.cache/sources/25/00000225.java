package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.custom.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aa.class */
class C0343aa {

    /* renamed from: a */
    public long f2165a = m4048a(true);

    /* renamed from: b */
    public String f2166b;

    public C0343aa(String str) {
        this.f2166b = str;
    }

    /* renamed from: a */
    public long m4048a(boolean z) {
        if (GameEngine.m1029au()) {
            return 0L;
        }
        long m1642a = FileChangeEngine.m1642a(this.f2166b, z);
        if (z && m1642a == 0) {
            GameEngine.m5460e("Failed to watch: " + this.f2166b);
        }
        return m1642a;
    }
}