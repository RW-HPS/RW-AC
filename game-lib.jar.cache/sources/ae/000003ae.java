package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/w.class */
public class w extends i {

    /* renamed from: a  reason: collision with root package name */
    static com.corrodinggames.rts.gameFramework.m.e f342a = null;
    static com.corrodinggames.rts.gameFramework.m.e[] b = new com.corrodinggames.rts.gameFramework.m.e[10];
    static com.corrodinggames.rts.gameFramework.m.e c = null;

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f342a = gameEngine.bO.a(R.drawable.wall_v);
        c = gameEngine.bO.a(R.drawable.wall_v);
        b = PlayerData.a(f342a);
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e d() {
        if (this.bV) {
            return c;
        }
        if (this.bX == null) {
            return b[b.length - 1];
        }
        return b[this.bX.R()];
    }

    @Override // com.corrodinggames.rts.game.units.y
    public com.corrodinggames.rts.gameFramework.m.e k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.d.d, com.corrodinggames.rts.game.units.y
    public void a(int i) {
    }

    public w(boolean z) {
        super(z);
        b(f342a);
        this.cj = 15.0f;
        this.ck = this.cj;
        this.cv = 700.0f;
        this.cu = this.cv;
        this.M = f342a;
        this.n.a(0, 0, 1, 0);
        this.o.a(0, 0, 1, 0);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: K */
    public ar r() {
        return ar.wall_v;
    }
}