package com.corrodinggames.rts.game.units.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/d.class */
public class d extends s {
    int a;
    com.corrodinggames.rts.game.units.a b;

    public d() {
        super("c_7");
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: n */
    public ar mo3i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.directToAction;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.none;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Attack Mode";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        com.corrodinggames.rts.game.units.a q = q();
        if (q != null) {
            return q.name();
        }
        return "NA";
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public void c(am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.a a = a(r());
        SyncPacket b = gameEngine.cf.b(amVar.bX);
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar2 = (am) it.next();
            if (amVar2 instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar2;
                if (yVar.cG) {
                    b.a(yVar);
                }
            }
        }
        b.a(a);
        this.a = gameEngine.bS.Y;
        this.b = a;
    }

    public com.corrodinggames.rts.game.units.a a(com.corrodinggames.rts.game.units.a aVar) {
        if (aVar == com.corrodinggames.rts.game.units.a.onlyInRange) {
            return com.corrodinggames.rts.game.units.a.guardArea;
        }
        if (aVar == com.corrodinggames.rts.game.units.a.onlyInRange) {
            return com.corrodinggames.rts.game.units.a.aggressive;
        }
        return com.corrodinggames.rts.game.units.a.onlyInRange;
    }

    public com.corrodinggames.rts.game.units.a q() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.units.a r = r();
        this.a = gameEngine.bS.Y;
        this.b = r;
        return r;
    }

    public com.corrodinggames.rts.game.units.a r() {
        if (this.a == GameEngine.getGameEngine().bS.Y && this.b != null) {
            return this.b;
        }
        com.corrodinggames.rts.game.units.a aVar = null;
        Iterator it = am.bE.iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (yVar.cG) {
                    if (aVar == null || aVar == yVar.P) {
                        aVar = yVar.P;
                    } else {
                        aVar = com.corrodinggames.rts.game.units.a.mixed;
                    }
                }
            }
        }
        return aVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean b(am amVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String d() {
        return b();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return true;
    }
}