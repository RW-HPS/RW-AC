package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.ar;
import com.corrodinggames.rts.java.audio.Music;

/* renamed from: com.corrodinggames.rts.java.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/m.class */
public class LoadMusic extends ar {

    /* renamed from: a */
    l f751a;
    Music c;

    public LoadMusic(String str, l lVar) {
        super(str, lVar);
        this.f751a = lVar;
        synchronized (lVar.f()) {
            this.f751a = lVar;
            String e = com.corrodinggames.rts.gameFramework.file.a.e(str);
            if (e.contains(".rwmod")) {
                this.c = lVar.b.newMusic(new com.corrodinggames.rts.java.audio.a.a(com.corrodinggames.rts.gameFramework.file.a.k(str), e));
            } else {
                this.c = lVar.b.newMusic(new com.corrodinggames.rts.java.audio.a.a(e));
            }
        }
    }
}