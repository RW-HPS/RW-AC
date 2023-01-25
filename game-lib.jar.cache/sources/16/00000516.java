package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ah.class */
public class GameMapData implements Cloneable {

    /* renamed from: l */
    public boolean sharedControl;

    /* renamed from: q */
    public int f5851q;

    /* renamed from: a */
    public MapType f5852a = MapType.f5867a;

    /* renamed from: b */
    public String f5853b = "[z;p10]Crossing Large (10p).tmx";

    /* renamed from: c */
    public int credits = 0;

    /* renamed from: d */
    public int fog = 2;

    /* renamed from: e */
    public boolean f5856e = true;

    /* renamed from: f */
    public int aidiff = 1;

    /* renamed from: g */
    public int initUnit = 1;

    /* renamed from: h */
    public float income = 1.0f;

    /* renamed from: i */
    public boolean nukes = false;

    /* renamed from: j */
    public boolean f5861j = false;

    /* renamed from: k */
    public boolean f5862k = false;

    /* renamed from: m */
    public boolean f5863m = false;

    /* renamed from: n */
    public boolean f5864n = false;

    /* renamed from: o */
    public boolean spectators = true;

    /* renamed from: p */
    public boolean f5866p = false;

    /* renamed from: a */
    public void m1438a() {
        this.f5852a = MapType.f5867a;
        this.f5853b = "[z;p10]Crossing Large (10p).tmx";
    }

    /* renamed from: b */
    public String m1435b() {
        return ((((((((((VariableScope.nullOrMissingString + "startingCredits: " + this.credits + "\n") + "fogMode: " + this.fog + "\n") + "revealedMap: " + this.f5856e + "\n") + "aiDifficulty: " + this.aidiff + "\n") + "startingUnits: " + this.initUnit + "\n") + "incomeMultiplier: " + this.income + "\n") + "noNukes: " + this.nukes + "\n") + "sharedControl: " + this.sharedControl + "\n") + "allowSpectators: " + this.spectators + "\n") + "lockedRoom: " + this.f5866p + "\n") + "randomSeed: " + this.f5851q + "\n";
    }

    /* renamed from: c */
    public GameMapData clone() {
        try {
            return (GameMapData) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1437a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(4);
        gameOutputStream.writeInt(this.fog);
        gameOutputStream.writeInt(this.credits);
        gameOutputStream.writeBoolean(this.f5856e);
        gameOutputStream.writeInt(this.aidiff);
        gameOutputStream.writeInt(this.initUnit);
        gameOutputStream.writeFloat(this.income);
        gameOutputStream.writeBoolean(this.nukes);
        gameOutputStream.writeBoolean(this.f5861j);
        gameOutputStream.writeBoolean(this.sharedControl);
        gameOutputStream.writeBoolean(this.f5863m);
        gameOutputStream.writeBoolean(this.f5864n);
        gameOutputStream.writeBoolean(this.spectators);
        gameOutputStream.writeBoolean(this.f5866p);
        gameOutputStream.writeInt(this.f5851q);
    }

    /* renamed from: a */
    public void m1436a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        this.fog = gameInputStream.readInt();
        this.credits = gameInputStream.readInt();
        this.f5856e = gameInputStream.readBoolean();
        this.aidiff = gameInputStream.readInt();
        this.initUnit = gameInputStream.readInt();
        this.income = gameInputStream.readFloat();
        this.nukes = gameInputStream.readBoolean();
        this.f5861j = gameInputStream.readBoolean();
        this.sharedControl = gameInputStream.readBoolean();
        if (readByte >= 1) {
            this.f5863m = gameInputStream.readBoolean();
        }
        if (readByte >= 2) {
            this.f5864n = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.spectators = gameInputStream.readBoolean();
            this.f5866p = gameInputStream.readBoolean();
        }
        if (readByte >= 4) {
            this.f5851q = gameInputStream.readInt();
        }
    }
}