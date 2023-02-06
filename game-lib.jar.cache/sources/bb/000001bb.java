package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public class af {
    public float a;
    public float b;

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.a);
        gameOutputStream.writeFloat(this.b);
    }

    public void a(GameInputStream gameInputStream) {
        this.a = gameInputStream.readFloat();
        this.b = gameInputStream.readFloat();
    }
}