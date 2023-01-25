package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0663ar;
import com.corrodinggames.rts.gameFramework.AbstractC0664as;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.java.audio.Music;

/* renamed from: com.corrodinggames.rts.java.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/n.class */
public class C1219n extends AbstractC0664as {

    /* renamed from: a */
    LoadMusic f7450a;

    /* renamed from: b */
    C1217l f7451b;

    /* renamed from: c */
    Music f7452c;

    /* renamed from: d */
    boolean f7453d = false;

    /* renamed from: e */
    boolean f7454e = false;

    /* renamed from: f */
    boolean f7455f = false;

    public C1219n(C1217l c1217l) {
        this.f7451b = c1217l;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo89a(AbstractC0663ar abstractC0663ar) {
        this.f7450a = (LoadMusic) abstractC0663ar;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo88a(boolean z) {
        synchronized (this.f7451b.m92f()) {
            this.f7453d = true;
            this.f7454e = z;
            this.f7455f = false;
            GameEngine.m5460e("Queued:" + this.f7450a.f4249b);
            if (this.f7452c != null) {
                GameEngine.m5460e("startPlaying: Stopping old music");
                this.f7452c.stop();
            }
            this.f7452c = this.f7450a.f7449c;
        }
    }

    /* renamed from: f */
    public void m83f() {
        if (this.f7455f) {
            return;
        }
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null) {
                GameEngine.m5460e("Now playing:" + this.f7450a.f4249b);
                if (this.f7454e) {
                    this.f7452c.setVolume(this.f7452c.getVolume());
                    this.f7452c.setLooping(true);
                    this.f7452c.play();
                } else {
                    this.f7452c.setVolume(this.f7452c.getVolume());
                    this.f7452c.play();
                }
                this.f7455f = true;
            } else {
                GameEngine.m5460e("realPlay: playingMusic==null");
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo91a() {
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null) {
                this.f7452c.pause();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: b */
    public void mo87b() {
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null && !this.f7452c.isPlaying()) {
                this.f7452c.play();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: d */
    public void mo85d() {
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null) {
                this.f7452c.stop();
                this.f7455f = false;
                this.f7453d = false;
                this.f7452c = null;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: e */
    public void mo84e() {
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null) {
                this.f7452c.stop();
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: c */
    public boolean mo86c() {
        synchronized (this.f7451b.m92f()) {
            if (this.f7455f && this.f7452c != null) {
                return this.f7452c.isPlaying();
            }
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0664as
    /* renamed from: a */
    public void mo90a(float f) {
        synchronized (this.f7451b.m92f()) {
            if (this.f7452c != null) {
                if (f > 0.05f && !this.f7455f && this.f7453d) {
                    m83f();
                }
                this.f7452c.setVolume(f);
            } else {
                GameEngine.m5460e("setVolume: playingMusic==null");
            }
        }
    }
}