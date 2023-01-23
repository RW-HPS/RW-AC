package com.corrodinggames.rts.game.units.custom.a;

import com.corrodinggames.rts.game.units.am;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/b.class */
public class b extends com.corrodinggames.rts.game.units.a.a {
    public com.corrodinggames.rts.game.units.a.a b;
    public com.corrodinggames.rts.game.units.custom.d.b c;
    public com.corrodinggames.rts.game.units.custom.d.b d;

    public b(com.corrodinggames.rts.game.units.a.a aVar) {
        this.b = aVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean b(am amVar) {
        return this.b.b(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public String c(am amVar) {
        return this.b.c(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean a(am amVar, boolean z) {
        return this.b.a(amVar, z);
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public boolean d(am amVar) {
        return this.b.d(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public com.corrodinggames.rts.game.units.custom.d.b a() {
        if (this.c != null) {
            return this.c;
        }
        return this.b.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public com.corrodinggames.rts.game.units.custom.d.b b() {
        if (this.d != null) {
            return this.d;
        }
        return this.b.b();
    }

    @Override // com.corrodinggames.rts.game.units.a.a
    public void a(am amVar, am amVar2) {
        this.b.a(amVar, amVar2);
    }
}