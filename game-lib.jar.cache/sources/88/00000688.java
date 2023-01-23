package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.Sound;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class q extends com.corrodinggames.rts.gameFramework.a.i {

    /* renamed from: a  reason: collision with root package name */
    Sound f755a;
    final /* synthetic */ o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(o oVar, String str, com.corrodinggames.rts.gameFramework.a.h hVar) {
        super(str, hVar);
        this.b = oVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.a.i
    public void a(float f, float f2, int i, int i2, float f3) {
        p pVar = (p) this.b.c.a();
        if (pVar == null) {
            return;
        }
        pVar.b = f;
        pVar.c = f2;
        pVar.d = i;
        pVar.e = i2;
        pVar.f = f3;
        pVar.f754a = this;
        this.b.b.offer(pVar);
    }

    public void b(float f, float f2, int i, int i2, float f3) {
        if (this.f755a == null) {
            GameEngine.m328e("Sound not loaded");
            return;
        }
        synchronized (this.b.b()) {
            this.f755a.play(com.corrodinggames.rts.gameFramework.f.f(f, f2), f3, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.a.i
    public int a() {
        return this.f755a.getBytesUsed();
    }
}