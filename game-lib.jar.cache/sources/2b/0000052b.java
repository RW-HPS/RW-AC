package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ay.class */
public class Unk_Packet extends Packet {
    public Packet f;
    public int g;

    public Unk_Packet(int i, Packet packet) {
        super(175);
        this.g = i;
        this.f = packet;
    }
}