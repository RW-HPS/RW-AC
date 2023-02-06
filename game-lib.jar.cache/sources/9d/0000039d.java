package com.corrodinggames.rts.game.units.d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/j.class */
public class j extends bq {
    public int a;
    public float b;
    public com.corrodinggames.rts.game.units.custom.h e;
    public boolean f;
    public as g;
    public PointF h;
    public am i;
    public boolean k;
    public boolean l;
    public com.corrodinggames.rts.game.units.custom.d.b c = com.corrodinggames.rts.game.units.custom.d.b.a;
    public com.corrodinggames.rts.game.units.custom.d.b d = null;
    public com.corrodinggames.rts.game.units.a.c j = com.corrodinggames.rts.game.units.a.s.i;
    public float m = -1.0f;
    public double n = 0.0d;

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(-1);
        gameOutputStream.writeInt(this.a);
        gameOutputStream.writeFloat(this.b);
        gameOutputStream.writeInt(-1);
        gameOutputStream.writeInt(this.c.a());
        gameOutputStream.writeBoolean(this.f);
        gameOutputStream.writeString(this.j.a());
        gameOutputStream.writeString(this.j.a());
        gameOutputStream.b(this.i);
        gameOutputStream.writeIsPointF(this.h);
        gameOutputStream.writeBoolean(this.l);
        gameOutputStream.writeFloat(this.m);
        gameOutputStream.a(this.g);
        this.c.a(gameOutputStream);
        com.corrodinggames.rts.game.units.custom.d.b.a(gameOutputStream, this.d);
        com.corrodinggames.rts.game.units.custom.g.a(this.e, gameOutputStream);
    }

    public void a(GameInputStream gameInputStream) {
        String.valueOf(gameInputStream.readInt());
        this.a = gameInputStream.readInt();
        this.b = gameInputStream.readFloat();
        int i = 0;
        if (gameInputStream.b() >= 4) {
            this.j = com.corrodinggames.rts.game.units.a.c.a(String.valueOf(gameInputStream.readInt()));
        }
        if (gameInputStream.b() >= 6) {
            i = gameInputStream.readInt();
        }
        if (gameInputStream.b() >= 25) {
            this.f = gameInputStream.readBoolean();
        }
        if (gameInputStream.b() >= 33) {
            gameInputStream.readString();
            this.j = com.corrodinggames.rts.game.units.a.c.a(gameInputStream.readString());
        }
        if (gameInputStream.b() >= 61) {
            this.i = gameInputStream.o();
            this.h = gameInputStream.getPointF();
        }
        if (gameInputStream.b() >= 64) {
            this.l = gameInputStream.readBoolean();
            this.m = gameInputStream.readFloat();
        }
        if (gameInputStream.b() >= 71) {
            this.g = gameInputStream.q();
        }
        if (gameInputStream.b() >= 73) {
            this.c = com.corrodinggames.rts.game.units.custom.d.b.b(gameInputStream);
        } else {
            this.c = com.corrodinggames.rts.game.units.custom.d.b.a(i);
        }
        if (gameInputStream.b() >= 91) {
            this.d = com.corrodinggames.rts.game.units.custom.d.b.a(gameInputStream);
        }
        if (gameInputStream.b() >= 95) {
            this.e = com.corrodinggames.rts.game.units.custom.g.a(gameInputStream);
        }
    }
}