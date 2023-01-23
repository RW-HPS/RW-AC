package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/au.class */
public class Packet {

    /* renamed from: b */
    public int type;

    /* renamed from: c */
    public byte[] bytes;
    public boolean e;

    /* renamed from: a */
    public PlayerConnect playerConnect = null;

    /* renamed from: d  reason: collision with other field name */
    public int f2d = -1;

    public Packet(int i) {
        this.type = i;
    }
}