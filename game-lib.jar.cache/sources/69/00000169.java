package com.corrodinggames.rts.game.p010a.p011a;

import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1147u;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/c.class */
public abstract class AbstractC0155c extends AbstractC0150a {

    /* renamed from: a */
    C1147u f641a = new C1147u();

    /* renamed from: c */
    public abstract boolean mo4796c(C0136a c0136a, AbstractC0629y abstractC0629y);

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4801a(GameInputStream gameInputStream) {
        super.mo4801a(gameInputStream);
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0629y m1292p = gameInputStream.m1292p();
            if (m1292p != null) {
                this.f641a.add(m1292p);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4802a(GameOutputStream gameOutputStream) {
        super.mo4802a(gameOutputStream);
        gameOutputStream.writeInt(this.f641a.size());
        Iterator it = this.f641a.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it.next());
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public void mo4803a(C0136a c0136a, AbstractC0629y abstractC0629y) {
        if (mo4796c(c0136a, abstractC0629y) && !this.f641a.contains(abstractC0629y)) {
            this.f641a.add(abstractC0629y);
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo4800b(C0136a c0136a, AbstractC0629y abstractC0629y) {
    }
}