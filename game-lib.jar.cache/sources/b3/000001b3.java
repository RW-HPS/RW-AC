package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/x.class */
public abstract class x extends s {
    public x(int i) {
        super(i);
    }

    public x(String str) {
        super(str);
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: K */
    public ar i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.none;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.none;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h() {
        return true;
    }
}