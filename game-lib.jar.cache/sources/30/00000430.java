package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ai.class */
public class ai {
    public boolean a(int i, int i2, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.a(i2, z)) {
            return false;
        }
        return gameEngine.h(i);
    }

    public boolean a(int i, int i2) {
        return false;
    }

    public int a() {
        return 0;
    }

    public float b(int i, int i2) {
        return 0.0f;
    }

    public String c(int i, int i2) {
        return "<abstract>";
    }
}