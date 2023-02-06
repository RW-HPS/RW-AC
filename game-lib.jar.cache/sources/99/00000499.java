package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d.class */
public class d {
    public com.corrodinggames.rts.gameFramework.path.k a;
    public long b;
    public float c;
    public float d;
    public float e;
    public float f;
    public int g;
    public com.corrodinggames.rts.game.units.ao h;

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeLong(this.b);
        gameOutputStream.writeFloat(this.c);
        gameOutputStream.writeFloat(this.d);
        gameOutputStream.writeFloat(this.e);
        gameOutputStream.writeFloat(this.f);
        gameOutputStream.writeInt(this.g);
        gameOutputStream.writeEnum(this.h);
        gameOutputStream.writeBoolean(this.a != null);
        if (this.a != null) {
            this.a.a(gameOutputStream);
        }
    }

    public void a(GameInputStream gameInputStream) {
        this.b = gameInputStream.readLong();
        this.c = gameInputStream.readFloat();
        this.d = gameInputStream.readFloat();
        this.e = gameInputStream.readFloat();
        this.f = gameInputStream.readFloat();
        this.g = gameInputStream.readInt();
        this.h = (com.corrodinggames.rts.game.units.ao) gameInputStream.b(com.corrodinggames.rts.game.units.ao.class);
        if (gameInputStream.readBoolean()) {
            this.a = new com.corrodinggames.rts.gameFramework.path.k(null, false);
            this.a.a(gameInputStream);
        }
    }
}