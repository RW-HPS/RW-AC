package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.gameFramework.as;
import com.corrodinggames.rts.java.audio.Music;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/n.class */
public class n extends as {
    LoadMusic a;
    l b;
    Music c;
    boolean d = false;
    boolean e = false;
    boolean f = false;

    public n(l lVar) {
        this.b = lVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(ar arVar) {
        this.a = (LoadMusic) arVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(boolean z) {
        synchronized (this.b.f()) {
            this.d = true;
            this.e = z;
            this.f = false;
            GameEngine.m5e("Queued:" + this.a.b);
            if (this.c != null) {
                GameEngine.m5e("startPlaying: Stopping old music");
                this.c.stop();
            }
            this.c = this.a.c;
        }
    }

    public void f() {
        if (this.f) {
            return;
        }
        synchronized (this.b.f()) {
            if (this.c != null) {
                GameEngine.m5e("Now playing:" + this.a.b);
                if (this.e) {
                    this.c.setVolume(this.c.getVolume());
                    this.c.setLooping(true);
                    this.c.play();
                } else {
                    this.c.setVolume(this.c.getVolume());
                    this.c.play();
                }
                this.f = true;
            } else {
                GameEngine.m5e("realPlay: playingMusic==null");
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a() {
        synchronized (this.b.f()) {
            if (this.c != null) {
                this.c.pause();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void b() {
        synchronized (this.b.f()) {
            if (this.c != null && !this.c.isPlaying()) {
                this.c.play();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void d() {
        synchronized (this.b.f()) {
            if (this.c != null) {
                this.c.stop();
                this.f = false;
                this.d = false;
                this.c = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void e() {
        synchronized (this.b.f()) {
            if (this.c != null) {
                this.c.stop();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public boolean c() {
        synchronized (this.b.f()) {
            if (this.f && this.c != null) {
                return this.c.isPlaying();
            }
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.as
    public void a(float f) {
        synchronized (this.b.f()) {
            if (this.c != null) {
                if (f > 0.05f && !this.f && this.d) {
                    f();
                }
                this.c.setVolume(f);
            } else {
                GameEngine.m5e("setVolume: playingMusic==null");
            }
        }
    }
}