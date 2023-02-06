package com.corrodinggames.rts.game.units.g;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/a.class */
public abstract class a {
    int a;

    public abstract b b();

    public a() {
    }

    public a(int i) {
        this.a = i;
    }

    public int a() {
        return this.a;
    }

    public void a(y yVar, float f) {
    }

    public void a(y yVar, GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.a);
    }

    public void a(y yVar, GameInputStream gameInputStream) {
        this.a = gameInputStream.readInt();
    }
}