package com.corrodinggames.rts.game.units.p027f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;

/* renamed from: com.corrodinggames.rts.game.units.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/a.class */
public class C0541a {

    /* renamed from: a */
    public final C0542b f3735a = new C0542b();

    /* renamed from: b */
    public final C0542b[] f3736b = new C0542b[PlayerData.f1369e];

    /* renamed from: c */
    public final C0542b f3737c = new C0542b();

    /* renamed from: d */
    public final C0542b f3738d = new C0542b();

    /* renamed from: e */
    float f3739e;

    public C0541a() {
        for (int i = 0; i < this.f3736b.length; i++) {
            this.f3736b[i] = new C0542b();
        }
    }

    /* renamed from: a */
    public void m3216a(AbstractC0244am abstractC0244am) {
        this.f3735a.m3213a(abstractC0244am);
        int i = abstractC0244am.f1682dn;
        if (i >= 0) {
            this.f3736b[i].m3213a(abstractC0244am);
        } else if (i == -1) {
            this.f3738d.m3213a(abstractC0244am);
        } else if (i == -2) {
            this.f3737c.m3213a(abstractC0244am);
        }
        if (abstractC0244am.f1626cj > this.f3739e) {
            this.f3739e = abstractC0244am.f1626cj;
        }
    }

    /* renamed from: b */
    public void m3215b(AbstractC0244am abstractC0244am) {
        this.f3735a.m3212b(abstractC0244am);
        int i = abstractC0244am.f1682dn;
        if (i >= 0) {
            this.f3736b[i].m3212b(abstractC0244am);
        } else if (i == -1) {
            this.f3738d.m3212b(abstractC0244am);
        } else if (i == -2) {
            this.f3737c.m3212b(abstractC0244am);
        }
        if (this.f3735a.f3741b == 0) {
            this.f3739e = 0.0f;
        }
    }
}