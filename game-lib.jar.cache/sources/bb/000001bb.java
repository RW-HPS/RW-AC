package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public class af {

    /* renamed from: a  reason: collision with root package name */
    public float f194a;
    public float b;

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f194a);
        gameOutputStream.writeFloat(this.b);
    }

    public void a(GameInputStream gameInputStream) {
        this.f194a = gameInputStream.readFloat();
        this.b = gameInputStream.readFloat();
    }
}