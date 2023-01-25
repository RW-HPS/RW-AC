package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.C0650ai;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.java.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/v.class */
public class C1228v extends C0650ai {
    @Override // com.corrodinggames.rts.gameFramework.C0650ai
    /* renamed from: a */
    public boolean mo17a(int i, int i2, boolean z) {
        return super.mo17a(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.C0650ai
    /* renamed from: a */
    public boolean mo18a(int i, int i2) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.C0650ai
    /* renamed from: a */
    public int mo19a() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.C0650ai
    /* renamed from: b */
    public float mo16b(int i, int i2) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.gameFramework.C0650ai
    /* renamed from: c */
    public String mo15c(int i, int i2) {
        return GameEngine.m985j(i2) + SlickToAndroidKeycodes.m749a(i);
    }
}