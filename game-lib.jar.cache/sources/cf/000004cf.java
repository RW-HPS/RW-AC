package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/am.class */
public class am extends bq {
    private final a i;

    /* renamed from: a  reason: collision with root package name */
    public ArrayList f501a = new ArrayList();
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
        Iterator it = this.f501a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar2 = (com.corrodinggames.rts.game.units.am) it.next();
            if (!amVar2.bV && amVar2.cN == null && this.i.f482a.j(amVar2) && amVar2.cf()) {
                amVar = amVar2;
            }
        }
        if (this.c > GameEngine.V() - 700 && amVar != null) {
            this.i.b.b(amVar.eo, amVar.ep);
        }
        this.c = GameEngine.V();
    }

    public void b() {
        this.f501a.clear();
    }

    public void c() {
        Iterator it = com.corrodinggames.rts.gameFramework.w.er.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.gameFramework.w wVar = (com.corrodinggames.rts.gameFramework.w) it.next();
            if (wVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) wVar;
                if (yVar.cG && !this.f501a.contains(yVar)) {
                    this.f501a.add(yVar);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        d();
        gameOutputStream.writeFloat(this.b);
        gameOutputStream.writeLong(this.c);
        gameOutputStream.writeInt(this.f501a.size());
        Iterator it = this.f501a.iterator();
        while (it.hasNext()) {
            gameOutputStream.a((com.corrodinggames.rts.game.units.am) it.next());
        }
        gameOutputStream.writeByte(0);
    }

    public void a(GameInputStream gameInputStream) {
        this.b = gameInputStream.readFloat();
        this.c = gameInputStream.readLong();
        this.f501a.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            com.corrodinggames.rts.game.units.am o = gameInputStream.o();
            if (o != null) {
                this.f501a.add(o);
            }
        }
        gameInputStream.readByte();
    }

    public void d() {
        if (this.f501a.size() == 0) {
            return;
        }
        Iterator it = this.f501a.iterator();
        while (it.hasNext()) {
            if (((com.corrodinggames.rts.game.units.am) it.next()).bV) {
                it.remove();
            }
        }
    }

    public void e() {
        if (this.f501a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f501a.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am a2 = com.corrodinggames.rts.gameFramework.w.a(((com.corrodinggames.rts.game.units.am) it.next()).eh, true);
            if (a2 != null && !a2.bV) {
                arrayList.add(a2);
            }
        }
        this.f501a = arrayList;
    }
}