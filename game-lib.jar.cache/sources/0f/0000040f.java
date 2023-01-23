package com.corrodinggames.rts.game.units;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/r.class */
public enum r {
    grass { // from class: com.corrodinggames.rts.game.units.r.1
        @Override // com.corrodinggames.rts.game.units.r
        public String b() {
            return "terrain/Long Grass.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.r
        public String a() {
            return null;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.r.2
        @Override // com.corrodinggames.rts.game.units.r
        public String b() {
            return "terrain/Water.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.r
        public String a() {
            return null;
        }
    },
    sand { // from class: com.corrodinggames.rts.game.units.r.3
        @Override // com.corrodinggames.rts.game.units.r
        public String b() {
            return "terrain/Sand.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.r
        public String a() {
            return "ridges/Sand Nothing - Flat.tsx";
        }
    },
    dust { // from class: com.corrodinggames.rts.game.units.r.4
        @Override // com.corrodinggames.rts.game.units.r
        public String b() {
            return "terrain/Dust.tsx";
        }

        @Override // com.corrodinggames.rts.game.units.r
        public String a() {
            return "ridges/Nothing Dust - Flat.tsx";
        }
    };

    public abstract String a();

    public abstract String b();
}