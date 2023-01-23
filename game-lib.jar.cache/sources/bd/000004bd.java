package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bn;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aa.class */
public class aa {

    /* renamed from: a  reason: collision with root package name */
    bn f491a;
    String b;
    int c;
    com.corrodinggames.rts.gameFramework.m.ag[] d = new com.corrodinggames.rts.gameFramework.m.ag[11];
    com.corrodinggames.rts.gameFramework.m.ag[] e = new com.corrodinggames.rts.gameFramework.m.ag[11];

    public com.corrodinggames.rts.gameFramework.m.ag a(int i, boolean z) {
        int i2 = i / 25;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 10) {
            i2 = 10;
        }
        if (z) {
            return this.e[i2];
        }
        return this.d[i2];
    }

    public aa(bn bnVar, String str, int i) {
        this.f491a = bnVar;
        this.b = str;
        this.c = i;
        int i2 = 0;
        while (i2 < 11) {
            int i3 = i2 == 10 ? 255 : i2 * 25;
            this.d[i2] = new com.corrodinggames.rts.gameFramework.m.ag();
            this.d[i2].a(2.0f);
            if (GameEngine.aZ) {
                this.d[i2].a(3.0f);
            }
            this.d[i2].a(Paint.Cap.ROUND);
            this.d[i2].b(i);
            this.d[i2].c(i3);
            this.e[i2] = new com.corrodinggames.rts.gameFramework.m.ag();
            this.e[i2].b(-13162713);
            this.e[i2].c(i3);
            this.e[i2].a(5.0f);
            this.e[i2].a(Paint.Cap.ROUND);
            i2++;
        }
    }
}