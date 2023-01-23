package com.corrodinggames.rts.gameFramework.m;

import android.graphics.Paint;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/i.class */
public class i extends ae {

    /* renamed from: a  reason: collision with root package name */
    int f632a;
    boolean b;

    public i(String str, boolean z) {
        super(str);
        this.f632a = -99;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.ae
    public boolean a() {
        return this.b;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.ae
    public boolean b() {
        boolean z = false;
        if (-16711936 != this.f632a) {
            a("teamColor", -16711936);
            z = true;
            this.f632a = -16711936;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.ae
    public boolean a(Paint paint, e eVar) {
        boolean z = false;
        if (eVar instanceof h) {
            h hVar = (h) eVar;
            if (hVar.D != this.f632a) {
                a("teamColor", hVar.D);
                z = true;
                this.f632a = hVar.D;
            }
        }
        super.a(paint, eVar);
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.m.ae
    public void c() {
        super.c();
    }
}