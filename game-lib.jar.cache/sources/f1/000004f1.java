package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/x.class */
public class x extends com.corrodinggames.rts.game.units.x {

    /* renamed from: a  reason: collision with root package name */
    com.corrodinggames.rts.game.units.custom.e.f f530a;

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public com.corrodinggames.rts.game.units.ar r() {
        return com.corrodinggames.rts.game.units.ar.fogRevealer;
    }

    public x() {
        super(true);
        this.f530a = new com.corrodinggames.rts.game.units.custom.e.f();
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
    public com.corrodinggames.rts.game.units.custom.e.f df() {
        return this.f530a;
    }

    public void a(com.corrodinggames.rts.game.units.custom.e.f fVar) {
        this.f530a = fVar;
    }
}