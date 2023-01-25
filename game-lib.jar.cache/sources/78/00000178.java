package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.gameFramework.AbstractC0741bq;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/o.class */
public abstract class AbstractC0170o extends AbstractC0741bq {

    /* renamed from: Q */
    public int f760Q;

    /* renamed from: R */
    protected final C0136a f761R;

    /* renamed from: S */
    public float f762S;

    /* renamed from: T */
    public float f763T;

    /* renamed from: U */
    public float f764U;

    /* renamed from: V */
    public boolean f765V;

    /* renamed from: W */
    static final ArrayList f766W = new ArrayList();

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f762S);
        gameOutputStream.writeFloat(this.f763T);
        gameOutputStream.writeFloat(this.f764U);
    }

    /* renamed from: a */
    public void mo4684a(GameInputStream gameInputStream) {
        this.f762S = gameInputStream.readFloat();
        this.f763T = gameInputStream.readFloat();
        this.f764U = gameInputStream.readFloat();
    }

    public AbstractC0170o(C0136a c0136a) {
        c0136a.f570aI++;
        this.f760Q = c0136a.f570aI;
        this.f761R = c0136a;
        this.f761R.f600bm.add(this);
        this.f761R.f601bn.add(this);
    }

    public AbstractC0170o(C0136a c0136a, float f, float f2) {
        this(c0136a);
        this.f762S = f;
        this.f763T = f2;
    }

    /* renamed from: p */
    public void mo4678p() {
        this.f761R.f600bm.remove(this);
        this.f761R.f601bn.remove(this);
        this.f765V = true;
    }

    /* renamed from: c */
    public boolean m4682c(float f, float f2) {
        float m2216a = C0773f.m2216a(this.f762S, this.f763T, f, f2);
        float f3 = this.f764U;
        if (m2216a < f3 * f3) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m4683b(AbstractC0244am abstractC0244am) {
        float m2216a = C0773f.m2216a(this.f762S, this.f763T, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
        float f = this.f764U + abstractC0244am.f1626cj;
        if (m2216a < f * f) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public boolean m4685a(AbstractC0244am abstractC0244am, float f) {
        float m2216a = C0773f.m2216a(this.f762S, this.f763T, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
        float f2 = this.f764U + abstractC0244am.f1626cj + f;
        if (m2216a < f2 * f2) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public float m4681c(AbstractC0244am abstractC0244am) {
        return C0773f.m2216a(this.f762S, this.f763T, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
    }

    /* renamed from: a */
    public float m4686a(C0164i c0164i) {
        return C0773f.m2216a(this.f762S, this.f763T, c0164i.f762S, c0164i.f763T);
    }

    /* renamed from: d */
    public float m4680d(float f, float f2) {
        return C0773f.m2216a(this.f762S, this.f763T, f, f2);
    }

    /* renamed from: w */
    public PointF m4677w() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.f764U);
        pointF.setSite(this.f762S + (C0773f.m2107k(random) * random2), this.f763T + (C0773f.m2110j(random) * random2));
        return pointF;
    }

    /* renamed from: e */
    public PointF m4679e(InterfaceC0303as interfaceC0303as) {
        int m451c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF pointF = new PointF();
        float f = this.f764U;
        EnumC0246ao enumC0246ao = EnumC0246ao.f1709b;
        AbstractC1155w abstractC1155w = null;
        if (interfaceC0303as == EnumC0249ar.f1743d) {
            f = 600.0f;
            enumC0246ao = EnumC0246ao.f1712e;
        }
        for (int i = 0; i < 15; i++) {
            EnumC0249ar enumC0249ar = null;
            boolean z = false;
            boolean z2 = false;
            if (this instanceof C0164i) {
                C0164i c0164i = (C0164i) this;
                if (i < 6 && interfaceC0303as == EnumC0249ar.f1775J) {
                    enumC0249ar = EnumC0249ar.f1775J;
                }
                if (enumC0249ar != null) {
                    AbstractC0629y abstractC0629y = null;
                    if (abstractC1155w == null) {
                        abstractC1155w = AbstractC0244am.m4223c(interfaceC0303as);
                    }
                    if (abstractC1155w instanceof AbstractC0629y) {
                        abstractC0629y = (AbstractC0629y) abstractC1155w;
                    }
                    int m4721c = c0164i.m4721c(enumC0249ar);
                    if (abstractC0629y != null && m4721c > 1) {
                        int i2 = -1;
                        int rand = C0773f.rand(0, m4721c - 1);
                        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
                        int size = AbstractC0244am.f1594bE.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            AbstractC0244am abstractC0244am = m499a[i3];
                            if (abstractC0244am.f1614bX == this.f761R && c0164i.m4740a(abstractC0244am) && abstractC0244am.m4226bT() && this.f761R.m4816i(abstractC0244am) && abstractC0244am.mo5458r() == enumC0249ar) {
                                i2++;
                                if (i2 == rand) {
                                    float f2 = abstractC0244am.f7172eo;
                                    float f3 = abstractC0244am.f7173ep;
                                    float f4 = f2;
                                    float f5 = f3;
                                    if (C0773f.rand(0, 1) == 0) {
                                        f5 += C0773f.m2151c(-150.0f, 150.0f);
                                    } else {
                                        f4 += C0773f.m2151c(-150.0f, 150.0f);
                                    }
                                    f766W.clear();
                                    gameEngine.f6330bS.m1868a(abstractC0629y, f2, f3, f4, f5, false, f766W, (AbstractC0244am) null);
                                    if (f766W.size() > 0) {
                                        PointF pointF2 = (PointF) f766W.get(0);
                                        pointF.setSite(pointF2.x, pointF2.y);
                                        z = true;
                                    } else {
                                        z2 = true;
                                    }
                                }
                            }
                        }
                    }
                }
            }
            if (!z2) {
                if (!z) {
                    float random = (float) (Math.random() * 360.0d);
                    float random2 = (float) (Math.random() * f);
                    pointF.setSite(this.f762S + (C0773f.m2107k(random) * random2), this.f763T + (C0773f.m2110j(random) * random2));
                }
                gameEngine.f6323bL.m4664a(pointF.x, pointF.y);
                int i4 = gameEngine.f6323bL.f802T;
                int i5 = gameEngine.f6323bL.f803U;
                if (gameEngine.f6323bL.m4620c(i4, i5) && (((m451c = C1152y.m451c(i4, i5, enumC0246ao)) > 5 || m451c == 0) && AbstractC0493d.m3402a(interfaceC0303as, pointF.x, pointF.y, this.f761R))) {
                    return pointF;
                }
                if (interfaceC0303as == EnumC0249ar.f1743d) {
                    f += 100.0f;
                }
            }
        }
        return null;
    }
}