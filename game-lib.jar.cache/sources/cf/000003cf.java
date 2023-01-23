package com.corrodinggames.rts.game.units.g;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/b.class */
public enum b {
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

    /* JADX INFO: Access modifiers changed from: package-private */
    public abstract a a();
}