package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bo.class */
public class bo {

    /* renamed from: a  reason: collision with root package name */
    public int f456a;
    public int b;
    public int c;
    public int d;
    public int e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public long k;
    public bn l = new bn();
    private static final byte m = (byte) bp.v220911_added_history.ordinal();

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(m);
        gameOutputStream.e();
        gameOutputStream.writeInt(this.f456a);
        gameOutputStream.writeInt(this.b);
        gameOutputStream.writeInt(this.c);
        gameOutputStream.writeInt(this.d);
        gameOutputStream.writeInt(this.e);
        gameOutputStream.writeInt(this.f);
        gameOutputStream.writeInt(this.g);
        gameOutputStream.writeInt(this.h);
        gameOutputStream.writeInt(this.i);
        gameOutputStream.writeInt(this.j);
        gameOutputStream.writeLong(this.k);
        this.l.a(gameOutputStream);
    }

    public void a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        gameInputStream.checkMark("stats start");
        this.f456a = gameInputStream.readInt();
        this.b = gameInputStream.readInt();
        this.c = gameInputStream.readInt();
        this.d = gameInputStream.readInt();
        this.e = gameInputStream.readInt();
        this.f = gameInputStream.readInt();
        this.g = gameInputStream.readInt();
        this.h = gameInputStream.readInt();
        this.i = gameInputStream.readInt();
        this.j = gameInputStream.readInt();
        this.k = gameInputStream.readLong();
        if (readByte >= bp.v220911_added_history.ordinal()) {
            this.l.a(gameInputStream);
        }
    }
}