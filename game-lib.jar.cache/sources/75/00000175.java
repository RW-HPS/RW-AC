package com.corrodinggames.rts.game.a;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/l.class */
public class l extends h {
    float a;

    @Override // com.corrodinggames.rts.game.a.o, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.F.size());
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((y) it.next());
        }
        gameOutputStream.writeByte(1);
        gameOutputStream.writeInt(this.G.size());
        Iterator it2 = this.G.iterator();
        while (it2.hasNext()) {
            gameOutputStream.a((y) it2.next());
        }
        gameOutputStream.writeFloat(this.a);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.a.o
    public void a(GameInputStream gameInputStream) {
        q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            y p = gameInputStream.p();
            if (p != null) {
                a(p);
            }
        }
        if (gameInputStream.readByte() >= 1) {
            this.G.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                y p2 = gameInputStream.p();
                if (p2 != null) {
                    this.G.add(p2);
                }
            }
            this.a = gameInputStream.readFloat();
        }
        super.a(gameInputStream);
    }

    public l(a aVar) {
        super(aVar);
        this.a = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.a.h
    public void c(float f) {
        n();
        if (!m()) {
            this.a += f;
        }
        Iterator it = this.F.iterator();
        while (it.hasNext()) {
            y yVar = (y) it.next();
            if (c((am) yVar) < 3600.0f && yVar.cN == null) {
                if (yVar.aB == this) {
                    yVar.aB = null;
                }
                it.remove();
            }
        }
        if (this.F.size() == 0 || this.a > 5000.0f) {
            p();
        }
    }

    public void c(y yVar) {
        a(yVar);
        this.G.add(yVar);
    }
}