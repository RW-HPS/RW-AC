package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ai.class */
public class C0650ai {
    /* renamed from: a */
    public boolean mo17a(int i, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.m1077a(i2, z)) {
            return false;
        }
        return gameEngine.m989h(i);
    }

    /* renamed from: a */
    public boolean mo18a(int i, int i2) {
        return false;
    }

    /* renamed from: a */
    public int mo19a() {
        return 0;
    }

    /* renamed from: b */
    public float mo16b(int i, int i2) {
        return 0.0f;
    }

    /* renamed from: c */
    public String mo15c(int i, int i2) {
        return "<abstract>";
    }
}