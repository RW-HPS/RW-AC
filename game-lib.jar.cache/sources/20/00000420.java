package com.corrodinggames.rts.gameFramework.a;

import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/b.class */
public class b extends i {

    /* renamed from: a  reason: collision with root package name */
    a f394a;
    int b;
    final /* synthetic */ a c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(a aVar, String str, h hVar) {
        super(str, hVar);
        this.c = aVar;
        this.b = -1;
    }

    @Override // com.corrodinggames.rts.gameFramework.a.i
    public void a(float f, float f2, int i, int i2, float f3) {
        c cVar = (c) this.c.c.a();
        if (cVar == null) {
            return;
        }
        cVar.b = f;
        cVar.c = f2;
        cVar.e = i2;
        cVar.f = f3;
        cVar.f395a = this;
        boolean z = false;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.settingsEngine != null && gameEngine.settingsEngine.androidNoSoundPrioritiesDebug) {
            z = true;
        }
        if (z) {
            cVar.d = 0;
        } else {
            this.c.e--;
            if (this.c.e <= 1) {
                this.c.e = 1000;
            }
            cVar.d = this.c.e;
        }
        this.c.f393a.offer(cVar);
    }

    public void b(float f, float f2, int i, int i2, float f3) {
        if (this.b == 0) {
            Log.d("RustedWarfare", "Sound not loaded");
        } else {
            if (this.f394a.g.play(this.b, f, f2, i, i2, f3) == 0) {
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.a.i
    public int a() {
        return 0;
    }
}