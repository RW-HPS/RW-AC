package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.y;
import com.corrodinggames.rts.gameFramework.w;

/* renamed from: com.corrodinggames.rts.game.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/l.class */
public class ScorchMark extends w {
    int a;
    int b;
    m e;
    int f;
    static final Rect h = new Rect();
    static final Rect i = new Rect();
    static final Paint j = y.b();
    static com.corrodinggames.rts.gameFramework.unitAction.e k = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e l = null;
    static com.corrodinggames.rts.gameFramework.unitAction.e m = null;
    static final RectF n = new RectF();
    int c = 50;
    int d = 40;
    int g = -1;

    /* renamed from: b */
    public static void load() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        k = gameEngine.bO.a(AssetsID.drawable.scorch_mark, true);
        k.m = true;
        l = gameEngine.bO.a(AssetsID.drawable.scorch_mark_nuke, true);
        l.m = true;
        m = gameEngine.bO.a(AssetsID.drawable.blood_mark, true);
        m.m = true;
    }

    public ScorchMark() {
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
        ScorchMark scorchMark = new ScorchMark();
        scorchMark.eo = f;
        scorchMark.ep = f2;
        if (mVar == m.normal) {
            scorchMark.a = 0;
            scorchMark.b = com.corrodinggames.rts.gameFramework.f.a(scorchMark, 0, 3, 0);
        } else {
            scorchMark.a = 2;
        }
        if (scorchMark.a == 2) {
            scorchMark.c = l.m();
            scorchMark.d = l.l();
        }
        scorchMark.e = mVar;
        scorchMark.d();
    }

    public static void a(com.corrodinggames.rts.game.units.y yVar, int i2) {
        if (!yVar.cJ()) {
            m mVar = i2 == 2 ? m.nuke : m.normal;
            if (!b(yVar.eo, yVar.ep, mVar)) {
                return;
            }
            ScorchMark scorchMark = new ScorchMark();
            scorchMark.a = i2;
            if (scorchMark.a == 2) {
                scorchMark.c = l.m();
                scorchMark.d = l.l();
            }
            scorchMark.eo = yVar.eo;
            scorchMark.ep = yVar.ep;
            scorchMark.e = mVar;
            scorchMark.b = com.corrodinggames.rts.gameFramework.f.a(scorchMark, 0, 3, 0);
            scorchMark.d();
        }
    }

    public static boolean b(float f, float f2, m mVar) {
        int i2 = 0;
        int i3 = 0;
        int i4 = 25;
        if (mVar == m.nuke) {
            i4 = 45;
        }
        w[] a = w.er.a();
        int size = w.er.size();
        for (int i5 = 0; i5 < size; i5++) {
            w wVar = a[i5];
            if (wVar instanceof ScorchMark) {
                ScorchMark scorchMark = (ScorchMark) wVar;
                if (com.corrodinggames.rts.gameFramework.f.c(scorchMark.eo - f) < i4 && com.corrodinggames.rts.gameFramework.f.c(scorchMark.ep - f2) < i4 && scorchMark.e == mVar) {
                    i2++;
                    if (com.corrodinggames.rts.gameFramework.f.c(scorchMark.eo - f) < 5 && com.corrodinggames.rts.gameFramework.f.c(scorchMark.ep - f2) < 5) {
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
        n.a = this.eo - (this.c * 0.5f);
        n.c = this.eo + (this.c * 0.5f);
        n.b = this.ep - (this.d * 0.5f);
        n.d = this.ep + (this.d * 0.5f);
        return n;
    }

    public void a(com.corrodinggames.rts.gameFramework.unitAction.y yVar, int i2, int i3, float f) {
        int i4;
        int i5 = this.b * this.c;
        com.corrodinggames.rts.gameFramework.unitAction.e eVar = null;
        int i6 = this.c;
        int i7 = this.d;
        if (this.a == 0) {
            eVar = k;
        } else if (this.a == 1) {
            eVar = m;
        } else if (this.a == 2) {
            eVar = l;
        }
        Rect rect = h;
        Rect rect2 = i;
        rect2.a = i5;
        rect2.b = 0;
        rect2.c = i5 + i6;
        rect2.d = 0 + i7;
        int i8 = ((int) this.eo) - i2;
        int i9 = i6 >> 1;
        int i10 = i7 >> 1;
        float f2 = i8 - i9;
        rect.a = (int) (f2 * f);
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
        gameOutputStream.writeInt(this.a);
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
        this.a = gameInputStream.readInt();
        this.b = gameInputStream.readInt();
        this.c = gameInputStream.readInt();
        this.d = gameInputStream.readInt();
        if (gameInputStream.b() >= 87) {
            this.e = (m) gameInputStream.b(m.class);
            this.f = gameInputStream.readInt();
        } else {
            this.e = this.a == 2 ? m.nuke : m.normal;
            if (this.a == 2) {
                this.c = l.m();
                this.d = l.l();
            }
        }
        super.a(gameInputStream);
    }
}