package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/av.class */
public class av extends aq {

    /* renamed from: a  reason: collision with root package name */
    boolean f413a = false;

    @Override // com.corrodinggames.rts.gameFramework.aq
    public ar a(String str) {
        return new aw(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public as a() {
        return new ax(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void a(am amVar) {
        GameEngine.m328e("Null musicFactory - load");
        this.e = amVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void b() {
    }
}