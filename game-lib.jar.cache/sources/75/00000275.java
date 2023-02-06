package com.corrodinggames.rts.game.units.custom.c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/c.class */
public class c {
    m d = new m();
    public static f f;
    static final Rect a = new Rect();
    static final RectF b = new RectF();
    static final Paint c = new Paint();
    static Paint e = new Paint();

    static {
        e.a(255, 0, 0, 200);
        f = new f();
    }

    public void a(l lVar) {
        Object[] a2 = this.d.a();
        for (int i = this.d.a - 1; i >= 0; i--) {
            e eVar = (e) a2[i];
            a a3 = lVar.a(eVar.a.g);
            if (a3 != null) {
                eVar.a = a3;
                while (eVar.b.size() > eVar.a.d) {
                    eVar.b.remove(eVar.b.size() - 1);
                }
            } else {
                this.d.remove(i);
            }
        }
    }

    public e a(a aVar, boolean z) {
        int i = this.d.a;
        Object[] a2 = this.d.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.a == aVar) {
                return eVar;
            }
        }
        if (z) {
            e eVar2 = new e(aVar);
            this.d.add(eVar2);
            return eVar2;
        }
        return null;
    }

    public int a(a aVar) {
        e a2 = a(aVar, false);
        if (a2 == null) {
            return 0;
        }
        return a2.b.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.graphics.Paint] */
    public void a(float f2, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = this.d.a;
        if (i == 0) {
            return;
        }
        Object[] a2 = this.d.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            a aVar = eVar.a;
            int i3 = eVar.b.a;
            Object[] a3 = eVar.b.a();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                d dVar = (d) a3[i4];
                if (dVar.c) {
                    am amVar2 = dVar.a;
                    if (aVar.e != null) {
                        com.corrodinggames.rts.gameFramework.unitAction.e eVar2 = aVar.e;
                        float f3 = amVar.eo - GameEngine.getGameEngine().cw;
                        float f4 = ((amVar.ep - GameEngine.getGameEngine().cx) - amVar.eq) - 10.0f;
                        float f5 = eVar2.u;
                        float d = com.corrodinggames.rts.gameFramework.f.d(amVar.eo, amVar.ep - amVar.eq, amVar2.eo, amVar2.ep - amVar2.eq);
                        float a4 = com.corrodinggames.rts.gameFramework.f.a(amVar.eo, amVar.ep - amVar.eq, amVar2.eo, amVar2.ep - amVar2.eq);
                        if (a4 < (eVar2.q - 2) * (eVar2.q - 2)) {
                            f5 = com.corrodinggames.rts.gameFramework.f.a((int) a4);
                        }
                        gameEngine.bO.k();
                        gameEngine.bO.a(d + 90.0f, f3, f4);
                        a.a(0, (int) (eVar2.q - f5), eVar2.p, eVar2.q);
                        b.a(f3 - eVar2.r, f4 - f5, f3 + eVar2.r, f4);
                        ag agVar = ag.r;
                        if (dVar.d != 0.0f) {
                            agVar = c;
                            int abs = (int) Math.abs(dVar.d * 5.0f);
                            if (abs > 250) {
                                abs = 250;
                            }
                            agVar.a(255, 255, 255 - abs, 255 - abs);
                        }
                        gameEngine.bO.a(eVar2, a, b, agVar);
                        gameEngine.bO.l();
                    }
                    if (aVar.f != null) {
                        gameEngine.bO.a(amVar.eo - gameEngine.cw, (amVar.ep - gameEngine.cx) - amVar.eq, amVar2.eo - gameEngine.cw, (amVar2.ep - gameEngine.cx) - amVar2.eq, aVar.f);
                    }
                }
            }
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        if (this.d.a == 0) {
            gameOutputStream.writeByte(-1);
            return;
        }
        gameOutputStream.writeByte(0);
        short size = (short) this.d.size();
        gameOutputStream.a(size);
        Object[] a2 = this.d.a();
        for (int i = 0; i < size; i++) {
            e eVar = (e) a2[i];
            gameOutputStream.a(eVar.a.g);
            gameOutputStream.a((short) eVar.b.size());
            Iterator it = eVar.b.iterator();
            while (it.hasNext()) {
                d dVar = (d) it.next();
                gameOutputStream.a(dVar.a);
                gameOutputStream.writeBoolean(dVar.b);
                gameOutputStream.writeBoolean(dVar.c);
            }
        }
    }

    public void a(am amVar, GameInputStream gameInputStream) {
        if (gameInputStream.readByte() == -1) {
            return;
        }
        int readShort = gameInputStream.readShort();
        this.d.clear();
        for (int i = 0; i < readShort; i++) {
            g m = gameInputStream.m();
            a aVar = null;
            if (amVar instanceof j) {
                aVar = ((j) amVar).x.a(m);
            }
            e eVar = null;
            if (aVar != null) {
                eVar = new e(aVar);
                this.d.add(eVar);
            }
            int readShort2 = gameInputStream.readShort();
            for (int i2 = 0; i2 < readShort2; i2++) {
                d dVar = new d();
                dVar.a = gameInputStream.a(com.corrodinggames.rts.gameFramework.net.m.expected);
                dVar.b = gameInputStream.readBoolean();
                dVar.c = gameInputStream.readBoolean();
                if (dVar.a != null && eVar != null) {
                    eVar.b.add(dVar);
                }
            }
        }
    }
}