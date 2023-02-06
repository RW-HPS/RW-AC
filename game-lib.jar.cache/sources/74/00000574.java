package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.m.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/i.class */
public class i extends ae {
    int a;
    boolean b;

    public i(String str, boolean z) {
        super(str);
        this.a = -99;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.ae
    public boolean a() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.ae
    public boolean b() {
        boolean z = false;
        if (-16711936 != this.a) {
            a("teamColor", -16711936);
            z = true;
            this.a = -16711936;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.ae
    public boolean a(Paint paint, e eVar) {
        boolean z = false;
        if (eVar instanceof h) {
            h hVar = (h) eVar;
            if (hVar.D != this.a) {
                a("teamColor", hVar.D);
                z = true;
                this.a = hVar.D;
            }
        }
        super.a(paint, eVar);
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.unitAction.ae
    public void c() {
        super.c();
    }
}