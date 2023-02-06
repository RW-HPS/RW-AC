package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ai;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/v.class */
public class v extends ai {
    @Override // com.corrodinggames.rts.gameFramework.ai
    public boolean a(int i, int i2, boolean z) {
        return super.a(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.ai
    public boolean a(int i, int i2) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.ai
    public int a() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.ai
    public float b(int i, int i2) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.gameFramework.ai
    public String c(int i, int i2) {
        return GameEngine.j(i2) + SlickToAndroidKeycodes.a(i);
    }
}