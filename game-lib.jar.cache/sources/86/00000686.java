package com.corrodinggames.rts.java;

import android.content.Context;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ad;
import com.corrodinggames.rts.java.audio.lwjgl.OpenALAudio;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/o.class */
public class o extends com.corrodinggames.rts.gameFramework.a.h {
    final int a = 15;
    LinkedBlockingQueue b = new LinkedBlockingQueue();
    ad c = new ad(15);
    r d;
    Context e;
    public OpenALAudio f;

    public Object b() {
        return this.f;
    }

    public o(OpenALAudio openALAudio) {
        for (int i = 0; i < 15; i++) {
            this.c.a(new p());
        }
        this.f = openALAudio;
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public void a(Context context) {
        if (this.e != null) {
            GameEngine.m5e("SlickSoundFactory:setContext context already set");
        } else {
            this.e = context;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public com.corrodinggames.rts.gameFramework.a.i a(int i) {
        q qVar = new q(this, com.corrodinggames.rts.gameFramework.f.f(i), this);
        String f = com.corrodinggames.rts.gameFramework.f.f(i);
        if (f == null) {
            throw new RuntimeException("Failed to find sound for res id:" + i);
        }
        synchronized (b()) {
            qVar.a = this.f.newSound(new com.corrodinggames.rts.java.audio.a.a(f));
        }
        return qVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public com.corrodinggames.rts.gameFramework.a.i a(String str, com.corrodinggames.rts.gameFramework.utility.j jVar, boolean z) {
        o oVar = this;
        if (!z) {
            oVar = null;
        }
        q qVar = new q(this, str, oVar);
        try {
            synchronized (b()) {
                qVar.a = this.f.newSound(new com.corrodinggames.rts.java.audio.a.a(jVar, jVar.d()));
            }
            return qVar;
        } catch (com.corrodinggames.rts.java.audio.a.c e) {
            e.printStackTrace();
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public void a() {
        if (this.d != null) {
            throw new RuntimeException("startThreads: soundThread!=null");
        }
        this.d = new r(this);
        this.d.start();
    }
}