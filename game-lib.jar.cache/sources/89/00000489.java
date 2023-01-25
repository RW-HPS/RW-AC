package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.bo */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bo.class */
public class C0739bo {

    /* renamed from: a */
    public int f4634a;

    /* renamed from: b */
    public int f4635b;

    /* renamed from: c */
    public int f4636c;

    /* renamed from: d */
    public int f4637d;

    /* renamed from: e */
    public int f4638e;

    /* renamed from: f */
    public int f4639f;

    /* renamed from: g */
    public int f4640g;

    /* renamed from: h */
    public int f4641h;

    /* renamed from: i */
    public int f4642i;

    /* renamed from: j */
    public int f4643j;

    /* renamed from: k */
    public long f4644k;

    /* renamed from: l */
    public C0738bn f4645l = new C0738bn();

    /* renamed from: m */
    private static final byte f4646m = (byte) EnumC0740bp.v220911_added_history.ordinal();

    /* renamed from: a */
    public void m2442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(f4646m);
        gameOutputStream.mo1367e();
        gameOutputStream.writeInt(this.f4634a);
        gameOutputStream.writeInt(this.f4635b);
        gameOutputStream.writeInt(this.f4636c);
        gameOutputStream.writeInt(this.f4637d);
        gameOutputStream.writeInt(this.f4638e);
        gameOutputStream.writeInt(this.f4639f);
        gameOutputStream.writeInt(this.f4640g);
        gameOutputStream.writeInt(this.f4641h);
        gameOutputStream.writeInt(this.f4642i);
        gameOutputStream.writeInt(this.f4643j);
        gameOutputStream.writeLong(this.f4644k);
        this.f4645l.m2446a(gameOutputStream);
    }

    /* renamed from: a */
    public void m2441a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        gameInputStream.checkMark("stats start");
        this.f4634a = gameInputStream.readInt();
        this.f4635b = gameInputStream.readInt();
        this.f4636c = gameInputStream.readInt();
        this.f4637d = gameInputStream.readInt();
        this.f4638e = gameInputStream.readInt();
        this.f4639f = gameInputStream.readInt();
        this.f4640g = gameInputStream.readInt();
        this.f4641h = gameInputStream.readInt();
        this.f4642i = gameInputStream.readInt();
        this.f4643j = gameInputStream.readInt();
        this.f4644k = gameInputStream.readLong();
        if (readByte >= EnumC0740bp.v220911_added_history.ordinal()) {
            this.f4645l.m2445a(gameInputStream);
        }
    }
}