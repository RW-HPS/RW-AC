package com.corrodinggames.rts.game.units.f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/a.class */
public class a {

    /* renamed from: a  reason: collision with root package name */
    public final b f358a = new b();
    public final b[] b = new b[PlayerData.e];
    public final b c = new b();
    public final b d = new b();
    float e;

    public a() {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = new b();
        }
    }

    public void a(am amVar) {
        this.f358a.a(amVar);
        int i = amVar.dn;
        if (i >= 0) {
            this.b[i].a(amVar);
        } else if (i == -1) {
            this.d.a(amVar);
        } else if (i == -2) {
            this.c.a(amVar);
        }
        if (amVar.cj > this.e) {
            this.e = amVar.cj;
        }
    }

    public void b(am amVar) {
        this.f358a.b(amVar);
        int i = amVar.dn;
        if (i >= 0) {
            this.b[i].b(amVar);
        } else if (i == -1) {
            this.d.b(amVar);
        } else if (i == -2) {
            this.c.b(amVar);
        }
        if (this.f358a.b == 0) {
            this.e = 0.0f;
        }
    }
}