package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public enum o {
    land { // from class: com.corrodinggames.rts.game.units.o.1
        @Override // com.corrodinggames.rts.game.units.o
        public boolean a(as asVar) {
            if (asVar == null) {
                return false;
            }
            am c = am.c(asVar);
            return (c.bO() || asVar.j() || c.h() == ao.AIR || c.h() == ao.WATER) ? false : true;
        }
    },
    air { // from class: com.corrodinggames.rts.game.units.o.2
        @Override // com.corrodinggames.rts.game.units.o
        public boolean a(as asVar) {
            if (asVar == null) {
                return false;
            }
            am c = am.c(asVar);
            return (c.bO() || asVar.j() || c.h() != ao.AIR) ? false : true;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.o.3
        @Override // com.corrodinggames.rts.game.units.o
        public boolean a(as asVar) {
            if (asVar == null) {
                return false;
            }
            am c = am.c(asVar);
            return (c.bO() || asVar.j() || c.h() != ao.WATER) ? false : true;
        }
    },
    buildings { // from class: com.corrodinggames.rts.game.units.o.4
        @Override // com.corrodinggames.rts.game.units.o
        public boolean a(as asVar) {
            return (asVar == null || am.c(asVar).bO() || !asVar.j()) ? false : true;
        }
    },
    bio { // from class: com.corrodinggames.rts.game.units.o.5
        @Override // com.corrodinggames.rts.game.units.o
        public boolean a(as asVar) {
            if (asVar == null) {
                return false;
            }
            return am.c(asVar).bO();
        }
    };

    public abstract boolean a(as asVar);

    public String a() {
        return name();
    }

    public o a(boolean z) {
        if (!z) {
            return a(1, 0);
        }
        return a(-1, 0);
    }

    public o a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        o oVar = values()[ordinal];
        if (!oVar.b()) {
            if (i2 > 30) {
                GameEngine.m328e("jumpBy recursion limit hit");
                return oVar;
            }
            oVar = oVar.a(i, i2 + 1);
        }
        return oVar;
    }

    public boolean b() {
        return true;
    }
}