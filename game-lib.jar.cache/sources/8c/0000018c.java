package com.corrodinggames.rts.game;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0473z;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;

/* renamed from: com.corrodinggames.rts.game.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/h.class */
public class C0190h {

    /* renamed from: a */
    public C0454h f1211a;

    /* renamed from: b */
    public C0454h f1212b;

    /* renamed from: c */
    public float f1213c;

    /* renamed from: d */
    public float f1214d;

    /* renamed from: e */
    public C0429b f1215e;

    /* renamed from: f */
    public C0429b f1216f;

    /* renamed from: g */
    public C0473z f1217g;

    /* renamed from: a */
    public boolean m4510a(AbstractC0244am abstractC0244am) {
        if (this.f1212b != null && C0453g.m3684a(this.f1212b, abstractC0244am.mo3599de())) {
            return false;
        }
        if (this.f1211a != null && !C0453g.m3684a(this.f1211a, abstractC0244am.mo3599de())) {
            return false;
        }
        return true;
    }
}