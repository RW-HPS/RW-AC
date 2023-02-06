package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.custom.e.f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/x.class */
public class x extends com.corrodinggames.rts.game.units.x {
    f a;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.fogRevealer;
    }

    public x() {
        super(true);
        this.a = new f();
        this.bX = PlayerData.i;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        GameEngine.a("PlaceholderUnit was updated");
        ci();
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public f df() {
        return this.a;
    }

    public void a(f fVar) {
        this.a = fVar;
    }
}