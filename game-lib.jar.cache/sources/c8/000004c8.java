package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/al.class */
public abstract class al {

    /* renamed from: a  reason: collision with root package name */
    static al f500a = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.1
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.aj() && !yVar.u() && yVar.cN == null && yVar.aq()) {
                return true;
            }
            return false;
        }
    };
    static al b = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.2
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.aj() && !yVar.u() && yVar.cN == null) {
                return true;
            }
            return false;
        }
    };
    static al c = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.3
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.r() != null && yVar.r().p() && yVar.cN == null) {
                return true;
            }
            return false;
        }
    };
    static al d = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.4
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.r() == com.corrodinggames.rts.game.units.ar.fabricator && yVar.V() < 3 && yVar.cN == null) {
                return true;
            }
            return false;
        }
    };
    static al e = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.5
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.r() == com.corrodinggames.rts.game.units.ar.landFactory && yVar.cN == null) {
                return true;
            }
            return false;
        }
    };
    static al f = new al() { // from class: com.corrodinggames.rts.gameFramework.f.al.6
        @Override // com.corrodinggames.rts.gameFramework.f.al
        public boolean a(com.corrodinggames.rts.game.units.y yVar) {
            if (yVar.r() == com.corrodinggames.rts.game.units.ar.airFactory && yVar.cN == null) {
                return true;
            }
            return false;
        }
    };

    public abstract boolean a(com.corrodinggames.rts.game.units.y yVar);

    al() {
    }

    public static void a(ArrayList arrayList, al alVar, al alVar2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.bS.q() != 1) {
            arrayList.clear();
        }
        com.corrodinggames.rts.game.units.y t = gameEngine.bS.t();
        if (t != null) {
            if (alVar.a(t) || (alVar2 != null && alVar2.a(t))) {
                if (!arrayList.contains(t)) {
                    arrayList.add(t);
                }
            } else {
                arrayList.clear();
            }
        }
        com.corrodinggames.rts.game.units.y a2 = a(arrayList, alVar);
        if (a2 == null && alVar2 != null) {
            a2 = a(arrayList, alVar2);
        }
        if (a2 == null) {
            arrayList.clear();
            if (t != null) {
                arrayList.add(t);
            }
            a2 = a(arrayList, alVar);
            if (a2 == null && alVar2 != null) {
                a2 = a(arrayList, alVar2);
            }
        }
        if (a2 != null) {
            gameEngine.bS.y();
            gameEngine.bS.j(a2);
            gameEngine.b(a2.eo, a2.ep);
            arrayList.add(a2);
        }
    }

    public static com.corrodinggames.rts.game.units.y a(ArrayList arrayList, al alVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.y yVar = null;
        float f2 = -1.0f;
        Iterator it = com.corrodinggames.rts.game.units.am.bE.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) amVar;
                if (gameEngine.bS.m(yVar2) && alVar.a(yVar2) && !arrayList.contains(yVar2)) {
                    float a2 = com.corrodinggames.rts.gameFramework.f.a(gameEngine.cy + gameEngine.cI, gameEngine.cz + gameEngine.cJ, yVar2.eo, yVar2.ep);
                    if (yVar == null || a2 < f2) {
                        f2 = a2;
                        yVar = yVar2;
                    }
                }
            }
        }
        return yVar;
    }
}