package com.corrodinggames.rts.game.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/o.class */
public abstract class o extends bq {
    public int Q;
    protected final a R;
    public float S;
    public float T;
    public float U;
    public boolean V;
    static final ArrayList W = new ArrayList();

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.S);
        gameOutputStream.writeFloat(this.T);
        gameOutputStream.writeFloat(this.U);
    }

    public void a(GameInputStream gameInputStream) {
        this.S = gameInputStream.readFloat();
        this.T = gameInputStream.readFloat();
        this.U = gameInputStream.readFloat();
    }

    public o(a aVar) {
        aVar.aI++;
        this.Q = aVar.aI;
        this.R = aVar;
        this.R.bm.add(this);
        this.R.bn.add(this);
    }

    public o(a aVar, float f, float f2) {
        this(aVar);
        this.S = f;
        this.T = f2;
    }

    public void p() {
        this.R.bm.remove(this);
        this.R.bn.remove(this);
        this.V = true;
    }

    public boolean c(float f, float f2) {
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, f, f2);
        float f3 = this.U;
        if (a2 < f3 * f3) {
            return true;
        }
        return false;
    }

    public boolean b(am amVar) {
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, amVar.eo, amVar.ep);
        float f = this.U + amVar.cj;
        if (a2 < f * f) {
            return true;
        }
        return false;
    }

    public boolean a(am amVar, float f) {
        float a2 = com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, amVar.eo, amVar.ep);
        float f2 = this.U + amVar.cj + f;
        if (a2 < f2 * f2) {
            return true;
        }
        return false;
    }

    public float c(am amVar) {
        return com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, amVar.eo, amVar.ep);
    }

    public float a(i iVar) {
        return com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, iVar.S, iVar.T);
    }

    public float d(float f, float f2) {
        return com.corrodinggames.rts.gameFramework.f.a(this.S, this.T, f, f2);
    }

    public PointF w() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.U);
        pointF.setSite(this.S + (com.corrodinggames.rts.gameFramework.f.k(random) * random2), this.T + (com.corrodinggames.rts.gameFramework.f.j(random) * random2));
        return pointF;
    }

    public PointF e(as asVar) {
        int c;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PointF pointF = new PointF();
        float f = this.U;
        ao aoVar = ao.LAND;
        w wVar = null;
        if (asVar == ar.seaFactory) {
            f = 600.0f;
            aoVar = ao.WATER;
        }
        for (int i = 0; i < 15; i++) {
            ar arVar = null;
            boolean z = false;
            boolean z2 = false;
            if (this instanceof i) {
                i iVar = (i) this;
                if (i < 6 && asVar == ar.fabricator) {
                    arVar = ar.fabricator;
                }
                if (arVar != null) {
                    y yVar = null;
                    if (wVar == null) {
                        wVar = am.c(asVar);
                    }
                    if (wVar instanceof y) {
                        yVar = (y) wVar;
                    }
                    int c2 = iVar.c(arVar);
                    if (yVar != null && c2 > 1) {
                        int i2 = -1;
                        int a2 = com.corrodinggames.rts.gameFramework.f.a(0, c2 - 1);
                        am[] a3 = am.bE.a();
                        int size = am.bE.size();
                        for (int i3 = 0; i3 < size; i3++) {
                            am amVar = a3[i3];
                            if (amVar.bX == this.R && iVar.a(amVar) && amVar.bT() && this.R.i(amVar) && amVar.r() == arVar) {
                                i2++;
                                if (i2 == a2) {
                                    float f2 = amVar.eo;
                                    float f3 = amVar.ep;
                                    float f4 = f2;
                                    float f5 = f3;
                                    if (com.corrodinggames.rts.gameFramework.f.a(0, 1) == 0) {
                                        f5 += com.corrodinggames.rts.gameFramework.f.c(-150.0f, 150.0f);
                                    } else {
                                        f4 += com.corrodinggames.rts.gameFramework.f.c(-150.0f, 150.0f);
                                    }
                                    W.clear();
                                    gameEngine.bS.a(yVar, f2, f3, f4, f5, false, W, (am) null);
                                    if (W.size() > 0) {
                                        PointF pointF2 = (PointF) W.get(0);
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
                    pointF.setSite(this.S + (com.corrodinggames.rts.gameFramework.f.k(random) * random2), this.T + (com.corrodinggames.rts.gameFramework.f.j(random) * random2));
                }
                gameEngine.bL.a(pointF.x, pointF.y);
                int i4 = gameEngine.bL.T;
                int i5 = gameEngine.bL.U;
                if (gameEngine.bL.c(i4, i5) && (((c = com.corrodinggames.rts.gameFramework.utility.y.c(i4, i5, aoVar)) > 5 || c == 0) && com.corrodinggames.rts.game.units.d.d.a(asVar, pointF.x, pointF.y, this.R))) {
                    return pointF;
                }
                if (asVar == ar.seaFactory) {
                    f += 100.0f;
                }
            }
        }
        return null;
    }
}