package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/l.class */
public class C0167l extends AbstractC0163h {

    /* renamed from: a */
    float f740a;

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(this.f688F.size());
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it.next());
        }
        gameOutputStream.writeByte(1);
        gameOutputStream.writeInt(this.f689G.size());
        Iterator it2 = this.f689G.iterator();
        while (it2.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it2.next());
        }
        gameOutputStream.writeFloat(this.f740a);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o
    /* renamed from: a */
    public void mo4682a(GameInputStream gameInputStream) {
        m4744q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0629y m1292p = gameInputStream.m1292p();
            if (m1292p != null) {
                mo4752a(m1292p);
            }
        }
        if (gameInputStream.readByte() >= 1) {
            this.f689G.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                AbstractC0629y m1292p2 = gameInputStream.m1292p();
                if (m1292p2 != null) {
                    this.f689G.add(m1292p2);
                }
            }
            this.f740a = gameInputStream.readFloat();
        }
        super.mo4682a(gameInputStream);
    }

    public C0167l(C0136a c0136a) {
        super(c0136a);
        this.f740a = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: c */
    public void mo4688c(float f) {
        m4746n();
        if (!m4747m()) {
            this.f740a += f;
        }
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (m4679c((AbstractC0244am) abstractC0629y) < 3600.0f && abstractC0629y.f1656cN == null) {
                if (abstractC0629y.f3982aB == this) {
                    abstractC0629y.f3982aB = null;
                }
                it.remove();
            }
        }
        if (this.f688F.size() == 0 || this.f740a > 5000.0f) {
            mo4676p();
        }
    }

    /* renamed from: c */
    public void m4692c(AbstractC0629y abstractC0629y) {
        mo4752a(abstractC0629y);
        this.f689G.add(abstractC0629y);
    }
}