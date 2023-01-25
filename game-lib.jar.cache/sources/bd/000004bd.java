package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import com.corrodinggames.rts.gameFramework.C0738bn;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;

/* renamed from: com.corrodinggames.rts.gameFramework.f.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aa.class */
public class C0791aa {

    /* renamed from: a */
    C0738bn f5144a;

    /* renamed from: b */
    String f5145b;

    /* renamed from: c */
    int f5146c;

    /* renamed from: d */
    C0966ag[] f5147d = new C0966ag[11];

    /* renamed from: e */
    C0966ag[] f5148e = new C0966ag[11];

    /* renamed from: a */
    public C0966ag m1995a(int i, boolean z) {
        int i2 = i / 25;
        if (i2 < 0) {
            i2 = 0;
        }
        if (i2 > 10) {
            i2 = 10;
        }
        if (z) {
            return this.f5148e[i2];
        }
        return this.f5147d[i2];
    }

    public C0791aa(C0738bn c0738bn, String str, int i) {
        this.f5144a = c0738bn;
        this.f5145b = str;
        this.f5146c = i;
        int i2 = 0;
        while (i2 < 11) {
            int i3 = i2 == 10 ? 255 : i2 * 25;
            this.f5147d[i2] = new C0966ag();
            this.f5147d[i2].m5231a(2.0f);
            if (GameEngine.f6423aZ) {
                this.f5147d[i2].m5231a(3.0f);
            }
            this.f5147d[i2].m5223a(Paint.Cap.ROUND);
            this.f5147d[i2].m5206b(i);
            this.f5147d[i2].m5201c(i3);
            this.f5148e[i2] = new C0966ag();
            this.f5148e[i2].m5206b(-13162713);
            this.f5148e[i2].m5201c(i3);
            this.f5148e[i2].m5231a(5.0f);
            this.f5148e[i2].m5223a(Paint.Cap.ROUND);
            i2++;
        }
    }
}