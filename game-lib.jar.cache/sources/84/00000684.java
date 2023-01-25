package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0663ar;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.p051a.C1165a;

/* renamed from: com.corrodinggames.rts.java.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/m.class */
public class LoadMusic extends AbstractC0663ar {

    /* renamed from: a */
    C1217l f7448a;

    /* renamed from: c */
    Music f7449c;

    public LoadMusic(String str, C1217l c1217l) {
        super(str, c1217l);
        this.f7448a = c1217l;
        synchronized (c1217l.m92f()) {
            this.f7448a = c1217l;
            String m2283e = C0765a.m2283e(str);
            if (m2283e.contains(".rwmod")) {
                this.f7449c = c1217l.f7446b.newMusic(new C1165a(C0765a.m2276k(str), m2283e));
            } else {
                this.f7449c = c1217l.f7446b.newMusic(new C1165a(m2283e));
            }
        }
    }
}