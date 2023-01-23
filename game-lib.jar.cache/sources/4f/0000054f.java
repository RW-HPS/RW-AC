package com.corrodinggames.rts.gameFramework.k;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.LinkedList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/f.class */
public class f extends k {

    /* renamed from: a  reason: collision with root package name */
    c f603a;
    g b;
    static Paint c = new Paint();
    static Point d = new Point();

    public f(l lVar, boolean z) {
        super(lVar, z);
        this.f603a = new h(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.k.k
    public c a(am amVar) {
        if (a() != null) {
            return this.f603a;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.k.k
    public LinkedList a() {
        return super.a();
    }

    @Override // com.corrodinggames.rts.gameFramework.k.k
    public boolean b() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.k.k
    public boolean a(k kVar) {
        if (this == kVar) {
            return true;
        }
        if (!(kVar instanceof f)) {
            return false;
        }
        f fVar = (f) kVar;
        if (this.l != fVar.l || this.m != fVar.m || this.o != fVar.o) {
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // com.corrodinggames.rts.gameFramework.k.k
    public boolean c() {
        return this.x != null;
    }

    public final byte a(int i, int i2) {
        if (this.b == null) {
            return (byte) -1;
        }
        return this.b.a(i, i2);
    }

    public static final void a(byte b, Point point) {
        int i = 0;
        int i2 = 0;
        byte b2 = (byte) (b - 1);
        if (b2 == 0) {
            i = 0 + 1;
        }
        if (b2 == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (b2 == 2) {
            i2++;
        }
        if (b2 == 3) {
            i2++;
            i--;
        }
        if (b2 == 4) {
            i--;
        }
        if (b2 == 5) {
            i--;
            i2--;
        }
        if (b2 == 6) {
            i2--;
        }
        if (b2 == 7) {
            i2--;
            i++;
        }
        point.f45a = i;
        point.b = i2;
    }

    public void d() {
        int i;
        int i2;
        int i3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.b.b bVar = gameEngine.bL;
        Rect rect = new Rect();
        float f = gameEngine.cw;
        float f2 = gameEngine.cx;
        float f3 = gameEngine.cA;
        float f4 = gameEngine.cB;
        com.corrodinggames.rts.game.b.e eVar = gameEngine.bL.u;
        int i4 = (int) ((f * bVar.r) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * bVar.s) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * bVar.r) + 1.0f);
        if (i6 > bVar.C - 1) {
            i6 = bVar.C - 1;
        }
        int i7 = (int) (((f2 + f4) * bVar.s) + 1.0f);
        if (i7 > bVar.D - 1) {
            i7 = bVar.D - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (eVar.a(i8, i9) != null) {
                    int i10 = i8 * bVar.n;
                    int i11 = i9 * bVar.o;
                    rect.a(i10, i11, i10 + bVar.n, i11 + bVar.o);
                    rect.a((int) (-f), (int) (-f2));
                    boolean b = rect.b((int) (gameEngine.bS.x / gameEngine.cX), (int) (gameEngine.bS.y / gameEngine.cX));
                    int i12 = 0;
                    if (50 == -1) {
                        i = 255;
                    } else {
                        i = 50 * 2;
                    }
                    if (0 == -1) {
                        i2 = 255;
                    } else {
                        i2 = 0 * 2;
                    }
                    if (0 == -1) {
                        i3 = 255;
                    } else {
                        if (0 != 0) {
                            i12 = 0 + 30;
                        }
                        i3 = i12 * 2;
                    }
                    c.a(128, i, i2, i3);
                    a(a(i8, i9), d);
                    float f5 = (i10 + bVar.p) - f;
                    float f6 = (i11 + bVar.q) - f2;
                    gameEngine.bO.a(f5, f6, f5 + (d.f45a * (bVar.n - 3)) + 1.0f, f6 + (d.b * (bVar.o - 3)) + 1.0f, c);
                    if (b) {
                    }
                }
            }
        }
    }
}