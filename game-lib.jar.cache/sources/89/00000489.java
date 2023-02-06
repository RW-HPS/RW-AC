package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.bo */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bo.class */
public class TeamStats {
    public int a;
    public int b;

    /* renamed from: c */
    public int unitsKilled;

    /* renamed from: d */
    public int buildingsKilled;

    /* renamed from: e */
    public int experimentalsKilled;

    /* renamed from: f */
    public int unitsLost;

    /* renamed from: g */
    public int buildingsLost;

    /* renamed from: h */
    public int experimentalsLost;
    public int i;
    public int j;
    public long k;
    public bn l = new bn();
    private static final byte m = (byte) bp.v220911_added_history.ordinal();

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(m);
        gameOutputStream.e();
        gameOutputStream.writeInt(this.a);
        gameOutputStream.writeInt(this.b);
        gameOutputStream.writeInt(this.unitsKilled);
        gameOutputStream.writeInt(this.buildingsKilled);
        gameOutputStream.writeInt(this.experimentalsKilled);
        gameOutputStream.writeInt(this.unitsLost);
        gameOutputStream.writeInt(this.buildingsLost);
        gameOutputStream.writeInt(this.experimentalsLost);
        gameOutputStream.writeInt(this.i);
        gameOutputStream.writeInt(this.j);
        gameOutputStream.writeLong(this.k);
        this.l.a(gameOutputStream);
    }

    public void a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        gameInputStream.checkMark("stats start");
        this.a = gameInputStream.readInt();
        this.b = gameInputStream.readInt();
        this.unitsKilled = gameInputStream.readInt();
        this.buildingsKilled = gameInputStream.readInt();
        this.experimentalsKilled = gameInputStream.readInt();
        this.unitsLost = gameInputStream.readInt();
        this.buildingsLost = gameInputStream.readInt();
        this.experimentalsLost = gameInputStream.readInt();
        this.i = gameInputStream.readInt();
        this.j = gameInputStream.readInt();
        this.k = gameInputStream.readLong();
        if (readByte >= bp.v220911_added_history.ordinal()) {
            this.l.a(gameInputStream);
        }
    }
}