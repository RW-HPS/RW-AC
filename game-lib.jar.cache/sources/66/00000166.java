package com.corrodinggames.rts.game.a.a;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/b.class */
public enum b {
    unknown { // from class: com.corrodinggames.rts.game.a.a.b.1
        @Override // com.corrodinggames.rts.game.a.a.b
        public a a() {
            return null;
        }
    },
    nuking { // from class: com.corrodinggames.rts.game.a.a.b.2
        @Override // com.corrodinggames.rts.game.a.a.b
        public a a() {
            return new d();
        }
    };

    public abstract a a();
}