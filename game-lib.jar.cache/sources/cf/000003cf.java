package com.corrodinggames.rts.game.units.g;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/b.class */
enum b {
    movementSpeed { // from class: com.corrodinggames.rts.game.units.g.b.1
        @Override // com.corrodinggames.rts.game.units.g.b
        a a() {
            return new d();
        }
    },
    specialActionBlock { // from class: com.corrodinggames.rts.game.units.g.b.2
        @Override // com.corrodinggames.rts.game.units.g.b
        a a() {
            return new e();
        }
    };

    abstract a a();
}