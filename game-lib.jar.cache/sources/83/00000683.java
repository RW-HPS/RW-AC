package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.am;
import com.corrodinggames.rts.gameFramework.aq;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/l.class */
public class l extends aq {
    volatile boolean a;
    public OpenALAudio b;
    boolean c = false;

    public Object f() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void a(float f) {
        double a;
        synchronized (f()) {
            if (this.a) {
                return;
            }
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            this.b.update();
            if (Unit.a(loadAllUnitsTook) > 16.0d) {
                GameEngine.m5e("music poll took:" + Unit.a(a));
            }
            super.a(f);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void a(int i) {
    }

    public l(OpenALAudio openALAudio) {
        this.b = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public ar a(String str) {
        return new LoadMusic(str, this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public as a() {
        return new n(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void a(am amVar) {
        this.e = amVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public void b() {
        synchronized (f()) {
            this.a = true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public boolean c() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public boolean d() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.aq
    public int e() {
        return 100;
    }
}