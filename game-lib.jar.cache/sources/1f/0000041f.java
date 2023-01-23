package com.corrodinggames.rts.gameFramework.a;

import android.content.Context;
import android.media.SoundPool;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ad;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.LinkedBlockingQueue;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/a.class */
public class a extends h {
    d d;
    Context f;
    SoundPool g;

    /* renamed from: a  reason: collision with root package name */
    LinkedBlockingQueue f393a = new LinkedBlockingQueue();
    final int b = 15;
    ad c = new ad(15);
    int e = 1000;

    public a() {
        for (int i = 0; i < 15; i++) {
            this.c.a(new c());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public void a(Context context) {
        if (this.f != null) {
            GameEngine.m328e("AndroidSoundFactory:setContext context already set");
            return;
        }
        this.f = context;
        this.g = new SoundPool(16, 3, 0);
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public void a() {
        if (this.d != null) {
            throw new RuntimeException("soundThread!=null");
        }
        this.d = new d(this);
        this.d.start();
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public i a(int i) {
        b bVar = new b(this, com.corrodinggames.rts.gameFramework.f.a(R.raw.class, i), this);
        bVar.f394a = this;
        bVar.b = this.g.load(this.f, i, 1);
        return bVar;
    }

    @Override // com.corrodinggames.rts.gameFramework.a.h
    public i a(String str, j jVar, boolean z) {
        int load;
        a aVar = this;
        if (!z) {
            aVar = null;
        }
        if (!jVar.a()) {
            try {
                File a2 = com.corrodinggames.rts.gameFramework.e.a.a(this.f, "audio", "ogg");
                FileOutputStream fileOutputStream = new FileOutputStream(a2);
                com.corrodinggames.rts.gameFramework.f.a(jVar, fileOutputStream);
                fileOutputStream.close();
                try {
                    jVar.close();
                } catch (Exception e) {
                    e.printStackTrace();
                }
                FileInputStream fileInputStream = new FileInputStream(a2);
                try {
                    load = this.g.load(fileInputStream.getFD(), 0L, fileInputStream.available(), 1);
                    fileInputStream.close();
                    a2.delete();
                } catch (Throwable th) {
                    fileInputStream.close();
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                return null;
            }
        } else {
            try {
                load = this.g.load(jVar.b(), 0L, jVar.available(), 1);
                try {
                    jVar.close();
                } catch (Exception e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                e4.printStackTrace();
                return null;
            }
        }
        b bVar = new b(this, str, aVar);
        bVar.f394a = this;
        bVar.b = load;
        return bVar;
    }
}