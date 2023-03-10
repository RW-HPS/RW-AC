package com.corrodinggames.rts.game.a.a;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.u;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/c.class */
public abstract class c extends a {
    u a = new u();

    public abstract boolean c(com.corrodinggames.rts.game.a.a aVar, y yVar);

    @Override // com.corrodinggames.rts.game.a.a.a
    public void a(GameInputStream gameInputStream) {
        super.a(gameInputStream);
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            y p = gameInputStream.p();
            if (p != null) {
                this.a.add(p);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.a.a.a
    public void a(GameOutputStream gameOutputStream) {
        super.a(gameOutputStream);
        gameOutputStream.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((y) it.next());
        }
    }

    @Override // com.corrodinggames.rts.game.a.a.a
    public void a(com.corrodinggames.rts.game.a.a aVar, y yVar) {
        if (c(aVar, yVar) && !this.a.contains(yVar)) {
            this.a.add(yVar);
        }
    }

    @Override // com.corrodinggames.rts.game.a.a.a
    public void b(com.corrodinggames.rts.game.a.a aVar, y yVar) {
    }
}