package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ah.class */
public class GameMapData implements Cloneable {
    public boolean l;
    public int q;

    /* renamed from: a */
    public MapType f562a = MapType.skirmishMap;
    public String b = "[z;p10]Crossing Large (10p).tmx";
    public int c = 0;
    public int d = 2;
    public boolean e = true;
    public int f = 1;
    public int g = 1;
    public float h = 1.0f;
    public boolean i = false;
    public boolean j = false;
    public boolean k = false;
    public boolean m = false;
    public boolean n = false;

    /* renamed from: o */
    public boolean spectators = true;
    public boolean p = false;

    public void a() {
        this.f562a = MapType.skirmishMap;
        this.b = "[z;p10]Crossing Large (10p).tmx";
    }

    public String b() {
        return ((((((((((VariableScope.nullOrMissingString + "startingCredits: " + this.c + "\n") + "fogMode: " + this.d + "\n") + "revealedMap: " + this.e + "\n") + "aiDifficulty: " + this.f + "\n") + "startingUnits: " + this.g + "\n") + "incomeMultiplier: " + this.h + "\n") + "noNukes: " + this.i + "\n") + "sharedControl: " + this.l + "\n") + "allowSpectators: " + this.spectators + "\n") + "lockedRoom: " + this.p + "\n") + "randomSeed: " + this.q + "\n";
    }

    /* renamed from: c */
    public GameMapData m11clone() {
        try {
            return (GameMapData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(4);
        gameOutputStream.writeInt(this.d);
        gameOutputStream.writeInt(this.c);
        gameOutputStream.writeBoolean(this.e);
        gameOutputStream.writeInt(this.f);
        gameOutputStream.writeInt(this.g);
        gameOutputStream.writeFloat(this.h);
        gameOutputStream.writeBoolean(this.i);
        gameOutputStream.writeBoolean(this.j);
        gameOutputStream.writeBoolean(this.l);
        gameOutputStream.writeBoolean(this.m);
        gameOutputStream.writeBoolean(this.n);
        gameOutputStream.writeBoolean(this.spectators);
        gameOutputStream.writeBoolean(this.p);
        gameOutputStream.writeInt(this.q);
    }

    public void a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        this.d = gameInputStream.readInt();
        this.c = gameInputStream.readInt();
        this.e = gameInputStream.readBoolean();
        this.f = gameInputStream.readInt();
        this.g = gameInputStream.readInt();
        this.h = gameInputStream.readFloat();
        this.i = gameInputStream.readBoolean();
        this.j = gameInputStream.readBoolean();
        this.l = gameInputStream.readBoolean();
        if (readByte >= 1) {
            this.m = gameInputStream.readBoolean();
        }
        if (readByte >= 2) {
            this.n = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.spectators = gameInputStream.readBoolean();
            this.p = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.q = gameInputStream.readInt();
        }
    }
}