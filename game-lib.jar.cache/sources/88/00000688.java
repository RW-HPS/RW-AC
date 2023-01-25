package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0640h;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i;
import com.corrodinggames.rts.java.audio.Sound;

/* renamed from: com.corrodinggames.rts.java.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/q.class */
public class C1222q extends AbstractC0641i {

    /* renamed from: a */
    Sound f7468a;

    /* renamed from: b */
    final /* synthetic */ C1220o f7469b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1222q(C1220o c1220o, String str, AbstractC0640h abstractC0640h) {
        super(str, abstractC0640h);
        this.f7469b = c1220o;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i
    /* renamed from: a */
    public void mo75a(float f, float f2, int i, int i2, float f3) {
        C1221p c1221p = (C1221p) this.f7469b.f7458c.m633a();
        if (c1221p == null) {
            return;
        }
        c1221p.f7463b = f;
        c1221p.f7464c = f2;
        c1221p.f7465d = i;
        c1221p.f7466e = i2;
        c1221p.f7467f = f3;
        c1221p.f7462a = this;
        this.f7469b.f7457b.offer(c1221p);
    }

    /* renamed from: b */
    public void m74b(float f, float f2, int i, int i2, float f3) {
        if (this.f7468a == null) {
            GameEngine.m5460e("Sound not loaded");
            return;
        }
        synchronized (this.f7469b.m78b()) {
            this.f7468a.play(C0773f.m2126f(f, f2), f3, 0.0f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i
    /* renamed from: a */
    public int mo76a() {
        return this.f7468a.getBytesUsed();
    }
}