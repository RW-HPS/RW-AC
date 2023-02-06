package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/am.class */
public class am extends bq {
    private final a i;
    public ArrayList a = new ArrayList();
    public float b;
    public long c;
    public float d;
    public float e;
    public float f;
    public boolean g;
    public boolean h;

    public am(a aVar, boolean z) {
        this.i = aVar;
        this.g = z;
    }

    public void a() {
        com.corrodinggames.rts.game.units.am amVar = null;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar2 = (com.corrodinggames.rts.game.units.am) it.next();
            if (!amVar2.bV && amVar2.cN == null && this.i.a.j(amVar2) && amVar2.cf()) {
                amVar = amVar2;
            }
        }
        if (this.c > GameEngine.V() - 700 && amVar != null) {
            this.i.b.b(amVar.eo, amVar.ep);
        }
        this.c = GameEngine.V();
    }

    public void b() {
        this.a.clear();
    }

    public void c() {
        Iterator it = w.er.iterator();
        while (it.hasNext()) {
            w wVar = (w) it.next();
            if (wVar instanceof y) {
                y yVar = (y) wVar;
                if (yVar.cG && !this.a.contains(yVar)) {
                    this.a.add(yVar);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        d();
        gameOutputStream.writeFloat(this.b);
        gameOutputStream.writeLong(this.c);
        gameOutputStream.writeInt(this.a.size());
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((com.corrodinggames.rts.game.units.am) it.next());
        }
        gameOutputStream.writeByte(0);
    }

    public void a(GameInputStream gameInputStream) {
        this.b = gameInputStream.readFloat();
        this.c = gameInputStream.readLong();
        this.a.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            com.corrodinggames.rts.game.units.am o = gameInputStream.o();
            if (o != null) {
                this.a.add(o);
            }
        }
        gameInputStream.readByte();
    }

    public void d() {
        if (this.a.size() == 0) {
            return;
        }
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((com.corrodinggames.rts.game.units.am) it.next()).bV) {
                it.remove();
            }
        }
    }

    public void e() {
        if (this.a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am a = w.a(((com.corrodinggames.rts.game.units.am) it.next()).eh, true);
            if (a != null && !a.bV) {
                arrayList.add(a);
            }
        }
        this.a = arrayList;
    }
}