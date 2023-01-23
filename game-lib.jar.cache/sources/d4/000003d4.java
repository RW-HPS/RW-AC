package com.corrodinggames.rts.game.units.g;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/e.class */
public class e extends a {
    int b;
    com.corrodinggames.rts.game.units.a.c c;

    public e() {
        this.c = com.corrodinggames.rts.game.units.a.c.f175a;
    }

    public e(int i, com.corrodinggames.rts.game.units.a.c cVar) {
        super(i);
        this.c = com.corrodinggames.rts.game.units.a.c.f175a;
        this.c = cVar;
        this.b = GameEngine.getGameEngine().by;
    }

    @Override // com.corrodinggames.rts.game.units.g.a
    public b b() {
        return b.specialActionBlock;
    }

    public boolean a(com.corrodinggames.rts.game.units.a.c cVar) {
        return this.c == com.corrodinggames.rts.game.units.a.c.f175a || this.c == cVar;
    }

    public float c() {
        int i = this.f366a - this.b;
        if (i <= 0) {
            return 1.0f;
        }
        return (this.f366a - GameEngine.getGameEngine().by) / i;
    }

    public static void a(y yVar, com.corrodinggames.rts.game.units.a.c cVar, int i) {
        c.a(yVar, new e(GameEngine.getGameEngine().by + i, cVar));
    }

    public static int a(am amVar, com.corrodinggames.rts.game.units.a.c cVar) {
        e b;
        if (!(amVar instanceof y) || ((y) amVar).bp == null || (b = b(amVar, cVar)) == null) {
            return 0;
        }
        return b.d();
    }

    public int d() {
        return this.f366a - GameEngine.getGameEngine().by;
    }

    public static e b(am amVar, com.corrodinggames.rts.game.units.a.c cVar) {
        m mVar;
        if (!(amVar instanceof y) || (mVar = ((y) amVar).bp) == null) {
            return null;
        }
        int i = GameEngine.getGameEngine().by;
        e eVar = null;
        Object[] a2 = mVar.a();
        for (int i2 = mVar.f689a - 1; i2 >= 0; i2--) {
            a aVar = (a) a2[i2];
            if (aVar instanceof e) {
                e eVar2 = (e) aVar;
                if (eVar2.a(cVar) && eVar2.f366a > i) {
                    i = eVar2.f366a;
                    eVar = eVar2;
                }
            }
        }
        if (eVar == null) {
            return null;
        }
        return eVar;
    }

    @Override // com.corrodinggames.rts.game.units.g.a
    public void a(y yVar, GameOutputStream gameOutputStream) {
        com.corrodinggames.rts.game.units.a.c.a(gameOutputStream, this.c);
        gameOutputStream.writeInt(this.b);
        super.a(yVar, gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.g.a
    public void a(y yVar, GameInputStream gameInputStream) {
        this.c = com.corrodinggames.rts.game.units.a.c.a(gameInputStream);
        if (this.c == null) {
            this.c = com.corrodinggames.rts.game.units.a.c.f175a;
        }
        this.b = gameInputStream.readInt();
        super.a(yVar, gameInputStream);
    }

    public static void c(am amVar, com.corrodinggames.rts.game.units.a.c cVar) {
        m mVar;
        if (!(amVar instanceof y) || (mVar = ((y) amVar).bp) == null) {
            return;
        }
        int i = GameEngine.getGameEngine().by;
        Object[] a2 = mVar.a();
        for (int i2 = mVar.f689a - 1; i2 >= 0; i2--) {
            a aVar = (a) a2[i2];
            if (aVar instanceof e) {
                e eVar = (e) aVar;
                if (cVar == com.corrodinggames.rts.game.units.a.c.f175a || eVar.a(cVar)) {
                    eVar.f366a = i - 1;
                }
            }
        }
    }
}