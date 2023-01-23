package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.y;
import com.corrodinggames.rts.gameFramework.w;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/l.class */
public class l extends w {

    /* renamed from: a  reason: collision with root package name */
    int f164a;
    int b;
    m e;
    int f;
    static final Rect h = new Rect();
    static final Rect i = new Rect();
    static final Paint j = y.b();
    static com.corrodinggames.rts.gameFramework.m.e k = null;
    static com.corrodinggames.rts.gameFramework.m.e l = null;
    static com.corrodinggames.rts.gameFramework.m.e m = null;
    static final RectF n = new RectF();
    int c = 50;
    int d = 40;
    int g = -1;

    public static void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        k = gameEngine.bO.a(R.drawable.scorch_mark, true);
        k.m = true;
        l = gameEngine.bO.a(R.drawable.scorch_mark_nuke, true);
        l.m = true;
        m = gameEngine.bO.a(R.drawable.blood_mark, true);
        m.m = true;
    }

    public l() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        S(-1);
        this.f = gameEngine.by;
    }

    public static void a(float f, float f2) {
        a(f, f2, m.normal);
    }

    public static void a(float f, float f2, m mVar) {
        if (!b(f, f2, mVar)) {
            return;
        }
        l lVar = new l();
        lVar.eo = f;
        lVar.ep = f2;
        if (mVar == m.normal) {
            lVar.f164a = 0;
            lVar.b = com.corrodinggames.rts.gameFramework.f.a(lVar, 0, 3, 0);
        } else {
            lVar.f164a = 2;
        }
        if (lVar.f164a == 2) {
            lVar.c = l.m();
            lVar.d = l.l();
        }
        lVar.e = mVar;
        lVar.d();
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar, int i2) {
        if (!yVar.cJ()) {
            m mVar = i2 == 2 ? m.nuke : m.normal;
            if (!b(yVar.eo, yVar.ep, mVar)) {
                return;
            }
            l lVar = new l();
            lVar.f164a = i2;
            if (lVar.f164a == 2) {
                lVar.c = l.m();
                lVar.d = l.l();
            }
            lVar.eo = yVar.eo;
            lVar.ep = yVar.ep;
            lVar.e = mVar;
            lVar.b = com.corrodinggames.rts.gameFramework.f.a(lVar, 0, 3, 0);
            lVar.d();
        }
    }

    public static boolean b(float f, float f2, m mVar) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 25;
        if (mVar == m.nuke) {
            i4 = 45;
        }
        w[] a2 = w.er.a();
        int size = w.er.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = a2[i5];
            if (wVar instanceof l) {
                l lVar = (l) wVar;
                if (com.corrodinggames.rts.gameFramework.f.c(lVar.eo - f) < i4 && com.corrodinggames.rts.gameFramework.f.c(lVar.ep - f2) < i4 && lVar.e == mVar) {
                    i2++;
                    if (com.corrodinggames.rts.gameFramework.f.c(lVar.eo - f) < 5 && com.corrodinggames.rts.gameFramework.f.c(lVar.ep - f2) < 5) {
                        i3++;
                    }
                }
            }
        }
        if (i2 >= 3 || i3 >= 1) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean a(GameEngine gameEngine) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean f(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public boolean c(float f) {
        return true;
    }

    public RectF c() {
        n.f48a = this.eo - (this.c * 0.5f);
        n.c = this.eo + (this.c * 0.5f);
        n.b = this.ep - (this.d * 0.5f);
        n.d = this.ep + (this.d * 0.5f);
        return n;
    }

    public void a(com.corrodinggames.rts.gameFramework.m.y yVar, int i2, int i3, float f) {
        int i4;
        int i5 = this.b * this.c;
        com.corrodinggames.rts.gameFramework.m.e eVar = null;
        int i6 = this.c;
        int i7 = this.d;
        if (this.f164a == 0) {
            eVar = k;
        } else if (this.f164a == 1) {
            eVar = m;
        } else if (this.f164a == 2) {
            eVar = l;
        }
        Rect rect = h;
        Rect rect2 = i;
        rect2.f47a = i5;
        rect2.b = 0;
        rect2.c = i5 + i6;
        rect2.d = 0 + i7;
        int i8 = ((int) this.eo) - i2;
        int i9 = i6 >> 1;
        int i10 = i7 >> 1;
        float f2 = i8 - i9;
        rect.f47a = (int) (f2 * f);
        rect.b = (int) (((((int) this.ep) - i3) - i10) * f);
        rect.c = (int) ((i8 + i9) * f);
        rect.d = (int) ((i4 + i10) * f);
        yVar.b(eVar, rect2, rect, j);
    }

    private void d() {
        GameEngine.getGameEngine().bL.a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.eo);
        gameOutputStream.writeFloat(this.ep);
        gameOutputStream.writeInt(this.f164a);
        gameOutputStream.writeInt(this.b);
        gameOutputStream.writeInt(this.c);
        gameOutputStream.writeInt(this.d);
        gameOutputStream.writeEnum(this.e);
        gameOutputStream.writeInt(this.f);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        this.eo = gameInputStream.readFloat();
        this.ep = gameInputStream.readFloat();
        this.f164a = gameInputStream.readInt();
        this.b = gameInputStream.readInt();
        this.c = gameInputStream.readInt();
        this.d = gameInputStream.readInt();
        if (gameInputStream.b() >= 87) {
            this.e = (m) gameInputStream.b(m.class);
            this.f = gameInputStream.readInt();
        } else {
            this.e = this.f164a == 2 ? m.nuke : m.normal;
            if (this.f164a == 2) {
                this.c = l.m();
                this.d = l.l();
            }
        }
        super.a(gameInputStream);
    }
}