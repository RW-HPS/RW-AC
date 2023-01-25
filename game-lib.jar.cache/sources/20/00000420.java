package com.corrodinggames.rts.gameFramework.p030a;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/b.class */
public class C0634b extends AbstractC0641i {

    /* renamed from: a */
    C0633a f4057a;

    /* renamed from: b */
    int f4058b;

    /* renamed from: c */
    final /* synthetic */ C0633a f4059c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0634b(C0633a c0633a, String str, AbstractC0640h abstractC0640h) {
        super(str, abstractC0640h);
        this.f4059c = c0633a;
        this.f4058b = -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i
    /* renamed from: a */
    public void mo75a(float f, float f2, int i, int i2, float f3) {
        C0635c c0635c = (C0635c) this.f4059c.f4052c.m633a();
        if (c0635c == null) {
            return;
        }
        c0635c.f4061b = f;
        c0635c.f4062c = f2;
        c0635c.f4064e = i2;
        c0635c.f4065f = f3;
        c0635c.f4060a = this;
        boolean z = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.settingsEngine != null && gameEngine.settingsEngine.androidNoSoundPrioritiesDebug) {
            z = true;
        }
        if (z) {
            c0635c.f4063d = 0;
        } else {
            this.f4059c.f4054e--;
            if (this.f4059c.f4054e <= 1) {
                this.f4059c.f4054e = 1000;
            }
            c0635c.f4063d = this.f4059c.f4054e;
        }
        this.f4059c.f4050a.offer(c0635c);
    }

    /* renamed from: b */
    public void m2818b(float f, float f2, int i, int i2, float f3) {
        if (this.f4058b == 0) {
            Log.m5069d("RustedWarfare", "Sound not loaded");
        } else {
            if (this.f4057a.f4056g.play(this.f4058b, f, f2, i, i2, f3) == 0) {
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i
    /* renamed from: a */
    public int mo76a() {
        return 0;
    }
}