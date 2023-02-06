package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bj.class */
public class bj extends com.corrodinggames.rts.game.units.f.i {
    Projectile a;
    bk b;
    com.corrodinggames.rts.game.units.am c;
    Projectile d;
    com.corrodinggames.rts.game.units.am e;

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(com.corrodinggames.rts.game.units.y yVar, float f) {
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(com.corrodinggames.rts.game.units.y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(com.corrodinggames.rts.game.units.y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyTeam(com.corrodinggames.rts.game.units.y yVar) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(com.corrodinggames.rts.game.units.y yVar, float f, com.corrodinggames.rts.game.units.am amVar) {
    }
}