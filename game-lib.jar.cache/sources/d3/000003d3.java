package com.corrodinggames.rts.game.units.g;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/d.class */
public class d extends a {
    float b;

    @Override // com.corrodinggames.rts.game.units.g.a
    public b b() {
        return b.movementSpeed;
    }

    @Override // com.corrodinggames.rts.game.units.g.a
    public void a(y yVar, GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.b);
        super.a(yVar, gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.g.a
    public void a(y yVar, GameInputStream gameInputStream) {
        this.b = gameInputStream.readFloat();
        super.a(yVar, gameInputStream);
    }
}