package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ah.class */
public class GameMapData implements Cloneable {

    /* renamed from: l */
    public boolean sharedControl;
    public int q;

    /* renamed from: a */
    public MapType mapType = MapType.skirmishMap;

    /* renamed from: b */
    public String mapName = "[z;p10]Crossing Large (10p).tmx";

    /* renamed from: c */
    public int credits = 0;

    /* renamed from: d */
    public int fog = 2;
    public boolean e = true;

    /* renamed from: f */
    public int aidiff = 1;

    /* renamed from: g */
    public int initUnit = 1;

    /* renamed from: h */
    public float income = 1.0f;

    /* renamed from: i */
    public boolean nukes = false;
    public boolean j = false;
    public boolean k = false;
    public boolean m = false;
    public boolean n = false;

    /* renamed from: o */
    public boolean spectators = true;
    public boolean p = false;

    public void a() {
        this.mapType = MapType.skirmishMap;
        this.mapName = "[z;p10]Crossing Large (10p).tmx";
    }

    public String b() {
        return ((((((((((VariableScope.nullOrMissingString + "startingCredits: " + this.credits + "\n") + "fogMode: " + this.fog + "\n") + "revealedMap: " + this.e + "\n") + "aiDifficulty: " + this.aidiff + "\n") + "startingUnits: " + this.initUnit + "\n") + "incomeMultiplier: " + this.income + "\n") + "noNukes: " + this.nukes + "\n") + "sharedControl: " + this.sharedControl + "\n") + "allowSpectators: " + this.spectators + "\n") + "lockedRoom: " + this.p + "\n") + "randomSeed: " + this.q + "\n";
    }

    /* renamed from: c */
    public GameMapData m5clone() {
        try {
            return (GameMapData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(4);
        gameOutputStream.writeInt(this.fog);
        gameOutputStream.writeInt(this.credits);
        gameOutputStream.writeBoolean(this.e);
        gameOutputStream.writeInt(this.aidiff);
        gameOutputStream.writeInt(this.initUnit);
        gameOutputStream.writeFloat(this.income);
        gameOutputStream.writeBoolean(this.nukes);
        gameOutputStream.writeBoolean(this.j);
        gameOutputStream.writeBoolean(this.sharedControl);
        gameOutputStream.writeBoolean(this.m);
        gameOutputStream.writeBoolean(this.n);
        gameOutputStream.writeBoolean(this.spectators);
        gameOutputStream.writeBoolean(this.p);
        gameOutputStream.writeInt(this.q);
    }

    public void a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        this.fog = gameInputStream.readInt();
        this.credits = gameInputStream.readInt();
        this.e = gameInputStream.readBoolean();
        this.aidiff = gameInputStream.readInt();
        this.initUnit = gameInputStream.readInt();
        this.income = gameInputStream.readFloat();
        this.nukes = gameInputStream.readBoolean();
        this.j = gameInputStream.readBoolean();
        this.sharedControl = gameInputStream.readBoolean();
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