package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public enum n {
    all { // from class: com.corrodinggames.rts.game.units.n.1
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            return true;
        }
    },
    types { // from class: com.corrodinggames.rts.game.units.n.2
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            h L = h.L();
            if (L != null && L.F != null) {
                return L.F.a(asVar);
            }
            return false;
        }
    },
    terrain { // from class: com.corrodinggames.rts.game.units.n.3
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.n
        public boolean b() {
            return false;
        }
    },
    modded { // from class: com.corrodinggames.rts.game.units.n.4
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            if (asVar != null && (asVar instanceof com.corrodinggames.rts.game.units.custom.l)) {
                com.corrodinggames.rts.game.units.custom.l lVar = (com.corrodinggames.rts.game.units.custom.l) asVar;
                if (lVar.J == null) {
                    return false;
                }
                h L = h.L();
                if (L != null && L.E != null && lVar.J != L.E) {
                    return false;
                }
                return true;
            }
            return false;
        }
    },
    search { // from class: com.corrodinggames.rts.game.units.n.5
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            h L = h.L();
            if (L == null || L.H == null) {
                return false;
            }
            if (L.I) {
                L.I = false;
                L.J = L.H.toLowerCase().trim();
            }
            if (asVar == null) {
                return false;
            }
            if (asVar.i() != null && asVar.i().toLowerCase(Locale.ROOT).contains(L.J)) {
                return true;
            }
            if (asVar.i() != null && asVar.e().toLowerCase(Locale.ROOT).contains(L.J)) {
                return true;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.n
        public boolean b() {
            h L = h.L();
            return (L == null || L.H == null) ? false : true;
        }
    },
    actions { // from class: com.corrodinggames.rts.game.units.n.6
        @Override // com.corrodinggames.rts.game.units.n
        public boolean a(as asVar) {
            return asVar == null;
        }
    };

    public abstract boolean a(as asVar);

    public String a() {
        return name();
    }

    public boolean b() {
        return true;
    }

    public n a(boolean z) {
        if (!z) {
            return a(1, 0);
        }
        return a(-1, 0);
    }

    public n a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        n nVar = values()[ordinal];
        if (!nVar.b()) {
            if (i2 > 30) {
                GameEngine.m5e("jumpBy recursion limit hit");
                return nVar;
            }
            nVar = nVar.a(i, i2 + 1);
        }
        return nVar;
    }
}