package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p043k.C0942k;

/* renamed from: com.corrodinggames.rts.gameFramework.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d.class */
public class C0755d {

    /* renamed from: a */
    public C0942k f4719a;

    /* renamed from: b */
    public long f4720b;

    /* renamed from: c */
    public float f4721c;

    /* renamed from: d */
    public float f4722d;

    /* renamed from: e */
    public float f4723e;

    /* renamed from: f */
    public float f4724f;

    /* renamed from: g */
    public int f4725g;

    /* renamed from: h */
    public EnumC0246ao f4726h;

    /* renamed from: a */
    public void m2411a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeLong(this.f4720b);
        gameOutputStream.writeFloat(this.f4721c);
        gameOutputStream.writeFloat(this.f4722d);
        gameOutputStream.writeFloat(this.f4723e);
        gameOutputStream.writeFloat(this.f4724f);
        gameOutputStream.writeInt(this.f4725g);
        gameOutputStream.writeEnum(this.f4726h);
        gameOutputStream.writeBoolean(this.f4719a != null);
        if (this.f4719a != null) {
            this.f4719a.m1193a(gameOutputStream);
        }
    }

    /* renamed from: a */
    public void m2410a(GameInputStream gameInputStream) {
        this.f4720b = gameInputStream.readLong();
        this.f4721c = gameInputStream.readFloat();
        this.f4722d = gameInputStream.readFloat();
        this.f4723e = gameInputStream.readFloat();
        this.f4724f = gameInputStream.readFloat();
        this.f4725g = gameInputStream.readInt();
        this.f4726h = (EnumC0246ao) gameInputStream.m1309b(EnumC0246ao.class);
        if (gameInputStream.readBoolean()) {
            this.f4719a = new C0942k(null, false);
            this.f4719a.m1192a(gameInputStream);
        }
    }
}