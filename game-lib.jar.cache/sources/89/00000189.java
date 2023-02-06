package com.corrodinggames.rts.game;

/* renamed from: com.corrodinggames.rts.game.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/e.class */
public class Player extends PlayerData {
    public Player(int i) {
        super(i);
    }

    public Player(int i, boolean z) {
        super(i, z);
    }

    public Player(int i, boolean z, String name) {
        super(i, z);
        this.name = name;
    }

    @Override // com.corrodinggames.rts.game.PlayerData
    public void a(float f) {
        super.a(f);
    }
}