package com.corrodinggames.rts.game.maps;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.u;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.unitAction.z;
import com.corrodinggames.rts.gameFramework.w;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/c.class */
public final class c {
    int f;
    int g;
    int h;
    int i;
    int j;
    int k;
    float l;
    boolean n;
    int a = 7;
    public e b = null;
    public y c = null;
    d[][] d = null;
    public ag e = new ag();
    float m = 1.0f;
    Rect o = new Rect();
    int p = 0;

    public void a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.m = g();
        if (this.m > 1.0f) {
        }
        this.i = (int) (this.h / this.m);
        this.k = (int) (this.j / this.m);
        this.l = 1.0f / this.k;
        this.f = gameEngine.cu - (this.i / 2);
        this.g = gameEngine.cv - (this.i / 2);
        float f = 1.0f / 20;
        this.f = ((int) (this.f * f)) * 20;
        this.g = ((int) (this.g * f)) * 20;
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                d dVar = this.d[i][i2];
                dVar.k = true;
                dVar.n = false;
            }
        }
    }

    public void b() {
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                d dVar = this.d[i][i2];
                dVar.i = i;
                dVar.j = i2;
            }
        }
    }

    public void a(int i) {
        d[] dVarArr = new d[this.a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                dVarArr[i2] = this.d[i2][0];
            }
            for (int i3 = 1; i3 < this.a; i3++) {
                for (int i4 = 0; i4 < this.a; i4++) {
                    this.d[i4][i3 - 1] = this.d[i4][i3];
                }
            }
            for (int i5 = 0; i5 < this.a; i5++) {
                this.d[i5][this.a - 1] = dVarArr[i5];
            }
            for (int i6 = 0; i6 < this.a; i6++) {
                this.d[i6][this.a - 1].k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.a; i7++) {
                dVarArr[i7] = this.d[i7][this.a - 1];
            }
            for (int i8 = this.a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.a; i9++) {
                    this.d[i9][i8 + 1] = this.d[i9][i8];
                }
            }
            for (int i10 = 0; i10 < this.a; i10++) {
                this.d[i10][0] = dVarArr[i10];
            }
            for (int i11 = 0; i11 < this.a; i11++) {
                this.d[i11][0].k = true;
            }
        }
        b();
    }

    public void b(int i) {
        d[] dVarArr = new d[this.a];
        if (i > 0) {
            for (int i2 = 0; i2 < this.a; i2++) {
                dVarArr[i2] = this.d[0][i2];
            }
            for (int i3 = 1; i3 < this.a; i3++) {
                for (int i4 = 0; i4 < this.a; i4++) {
                    this.d[i3 - 1][i4] = this.d[i3][i4];
                }
            }
            for (int i5 = 0; i5 < this.a; i5++) {
                this.d[this.a - 1][i5] = dVarArr[i5];
            }
            for (int i6 = 0; i6 < this.a; i6++) {
                this.d[this.a - 1][i6].k = true;
            }
        } else {
            for (int i7 = 0; i7 < this.a; i7++) {
                dVarArr[i7] = this.d[this.a - 1][i7];
            }
            for (int i8 = this.a - 2; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < this.a; i9++) {
                    this.d[i8 + 1][i9] = this.d[i8][i9];
                }
            }
            for (int i10 = 0; i10 < this.a; i10++) {
                this.d[0][i10] = dVarArr[i10];
            }
            for (int i11 = 0; i11 < this.a; i11++) {
                this.d[0][i11].k = true;
            }
        }
        b();
    }

    public d a(int i, int i2) {
        if (i < 0 || i >= this.a || i2 < 0 || i2 >= this.a || this.d == null) {
            return null;
        }
        return this.d[i][i2];
    }

    public void a(int i, int i2, boolean z) {
        b bVar = GameEngine.getGameEngine().bL;
        int i3 = bVar.n;
        int i4 = bVar.o;
        int i5 = i * i3;
        int i6 = i2 * i4;
        a((i5 - this.f) - i3, (i6 - this.g) - i4, 3 * i3, 3 * i4, z);
    }

    public void c() {
        if (this.d != null) {
            for (int i = 0; i < this.a; i++) {
                for (int i2 = 0; i2 < this.a; i2++) {
                    this.d[i][i2].k = true;
                }
            }
        }
    }

    public void a(int i, int i2, int i3, int i4, boolean z) {
        d a;
        d a2;
        d a3;
        int i5 = (int) (i * this.l);
        int i6 = (int) (i2 * this.l);
        d a4 = a(i5, i6);
        if (a4 != null) {
            if (z) {
                a4.l = true;
            } else {
                a4.k = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 >= (a4.i * this.k) + this.i) {
                z2 = true;
            }
            if (i2 + i4 >= (a4.j * this.k) + this.i) {
                z3 = true;
            }
            if (z2 && (a3 = a(i5 + 1, i6)) != null) {
                if (z) {
                    a3.l = true;
                } else {
                    a3.k = true;
                }
            }
            if (z3 && (a2 = a(i5, i6 + 1)) != null) {
                if (z) {
                    a2.l = true;
                } else {
                    a2.k = true;
                }
            }
            if (z2 && z3 && (a = a(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    a.l = true;
                } else {
                    a.k = true;
                }
            }
        }
    }

    public void a(ScorchMark scorchMark) {
        RectF c = scorchMark.c();
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                if (this.d != null) {
                    d dVar = this.d[i][i2];
                    if (f.a(dVar.b(), c)) {
                        boolean z = this.m != 1.0f;
                        if (z) {
                        }
                        scorchMark.a(dVar.a, dVar.c(), dVar.d(), this.m);
                        dVar.d.p();
                        if (z) {
                        }
                    }
                }
            }
        }
    }

    public void a(int i, int i2, y yVar) {
        d dVar = this.d[i][i2];
        boolean z = this.m != 1.0f;
        if (z) {
        }
        Rect b = dVar.b();
        f.a(b, 95.0f);
        w[] a = w.er.a();
        int size = w.er.size();
        for (int i3 = 0; i3 < size; i3++) {
            w wVar = a[i3];
            if (wVar instanceof ScorchMark) {
                ScorchMark scorchMark = (ScorchMark) wVar;
                if (b.b((int) scorchMark.eo, (int) scorchMark.ep)) {
                    scorchMark.a(yVar, dVar.c(), dVar.d(), this.m);
                }
            }
        }
        if (z) {
        }
    }

    public void b(int i, int i2, y yVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        if (gameEngine.bS.F()) {
            int i3 = this.f + (i * this.k);
            int i4 = this.g + (i2 * this.k);
            int i5 = this.i;
            int i6 = this.i;
            int i7 = bVar.u.n;
            int i8 = bVar.u.o;
            if (((int) (i3 * bVar.r)) < 0) {
            }
            if (((int) (i4 * bVar.s)) < 0) {
            }
            if (((int) ((i3 + i5) * bVar.r)) > i7 - 1) {
                int i9 = i7 - 1;
            }
            if (((int) ((i4 + i6) * bVar.s)) > i8 - 1) {
                int i10 = i8 - 1;
            }
            if (this.m < 0.4d) {
                return;
            }
            boolean z = this.m != 1.0f;
            if (z) {
                yVar.i();
                yVar.a(this.m, this.m);
            }
            if (z) {
                yVar.j();
            }
        }
    }

    public void b(int i, int i2) {
        d dVar = b.al.d[i][i2];
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        dVar.n = true;
        this.c.b(-16777216);
        e eVar = gameEngine.bW.J;
        if (eVar != null) {
            Rect rect = new Rect();
            RectF rectF = new RectF();
            rect.a((int) (((this.f + (i * this.k)) / (bVar.n * bVar.width)) * eVar.p), (int) (((this.g + (i2 * this.k)) / (bVar.o * bVar.height)) * eVar.q), (int) (((this.f + ((i + 1) * this.k)) / (bVar.n * bVar.width)) * eVar.p), (int) (((this.g + ((i2 + 1) * this.k)) / (bVar.o * bVar.height)) * eVar.q));
            rectF.a(0.0f, 0.0f, this.h, this.h);
            this.c.a(eVar, rect, rectF, this.e);
        }
        this.c.p();
        if (GameEngine.aW) {
            dVar.a.a(0, PorterDuff.Mode.CLEAR);
        }
        dVar.a.b(this.b, 0.0f, 0.0f, (Paint) null);
        dVar.d.p();
    }

    public void c(int i, int i2) {
        c(i, i2, this.c);
    }

    public void c(int i, int i2, y yVar) {
        d dVar = b.al.d[i][i2];
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        boolean z = false;
        if (gameEngine.settingsEngine.renderFancyWater) {
            z = true;
        }
        if (GameEngine.C() || GameEngine.D()) {
            z = true;
        }
        if (z) {
            yVar.a(0, PorterDuff.Mode.CLEAR);
        } else {
            boolean z2 = false;
            if (GameEngine.C()) {
                z2 = true;
            }
            if (GameEngine.aX) {
                z2 = true;
            }
            if (InterfaceEngine.bO) {
            }
            if (bVar.E) {
            }
            if (z2) {
                yVar.b(-16777216);
            }
        }
        if (GameEngine.aX) {
            yVar.a(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.f + (i * this.k);
        int i4 = this.g + (i2 * this.k);
        boolean z3 = false;
        boolean z4 = false;
        if (!bVar.u.w) {
            z3 = true;
        }
        if (bVar.E) {
            z4 = true;
        }
        if (b.d) {
            z3 = false;
            z4 = false;
        }
        if (z3) {
            yVar.a(true);
        }
        bVar.u.a(yVar, i3, i4, i3, i4, this.i, this.i, this.m, this.m, bVar.E, false, false);
        if (bVar.v != null) {
            if (z3 && bVar.v.w) {
                yVar.f();
                GameEngine.m328e("Ending blit early");
            }
            bVar.v.a(yVar, i3, i4, i3, i4, this.i, this.i, this.m, this.m, bVar.E, false, false);
        }
        if (bVar.w != null) {
            if (z3 && bVar.w.w) {
                yVar.f();
                GameEngine.m328e("Ending blit early");
            }
            bVar.w.a(yVar, i3, i4, i3, i4, this.i, this.i, this.m, this.m, bVar.E, false, false);
        }
        Iterator it = bVar.z.iterator();
        while (it.hasNext()) {
            Layer layer = (Layer) it.next();
            if (layer.m) {
                if (z3 && layer.w) {
                    yVar.f();
                    GameEngine.m328e("Ending blit early");
                }
                layer.a(yVar, i3, i4, i3, i4, this.i, this.i, this.m, this.m, bVar.E, false, false);
            }
        }
        a(i, i2, yVar);
        if (bVar.E) {
            if (z4) {
                yVar.a(false);
            }
            bVar.u.a(yVar, i3, i4, i3, i4, this.i, this.i, this.m, this.m, bVar.E, true, true);
        }
        if (z3 || z4) {
            yVar.f();
        }
        if (gameEngine.bS.F()) {
            b(i, i2, yVar);
        }
        dVar.k = false;
        dVar.l = false;
        dVar.m = 0;
        dVar.n = false;
        yVar.p();
        if (z || GameEngine.aW) {
            dVar.a.a(0, PorterDuff.Mode.CLEAR);
        }
        dVar.a.b(this.b, 0.0f, 0.0f, (Paint) null);
        dVar.d.p();
        if (b.c) {
            dVar.a.a(VariableScope.nullOrMissingString + dVar.c, 40.0f, 40.0f, b.h);
        }
        dVar.c++;
    }

    public void d() {
        if (GameEngine.aU && !GameEngine.aX && !GameEngine.aY) {
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        int max = Math.max((int) gameEngine.cF, (int) gameEngine.cH) + 3;
        if (this.d != null && this.h * this.a < max + this.h + 1) {
            GameEngine.b("map", "screen must have changed size, layerBufferSize too small at " + this.a + ", adding to LayerBitmapBuffer");
            GameEngine.b("map", "new viewpoint:" + gameEngine.cF + ", " + gameEngine.cH);
            c(this.a + 1);
        }
        if (this.d == null) {
            GameEngine.b("map", "setupLayerBuffers for size:" + max);
            long nanoTime = System.nanoTime();
            if (GameEngine.aX || GameEngine.aY) {
                this.h = 1024;
                this.a = (int) ((max / this.h) + 1.5f);
            } else {
                max = Math.max(600, max);
                this.h = (max / (this.a - 2)) + 7 + 4;
                this.h = ((int) ((this.h * (1.0f / 20)) + 0.5f)) * 20;
            }
            if (this.h * this.a < max + this.h + 1) {
                GameEngine.print("layerBufferSize is too small");
                GameEngine.print("layerBufferCount:" + this.a);
                GameEngine.print("(layerBufferSize*(layerBufferCount):" + (this.h * this.a));
                GameEngine.print("longest+layerBufferSize+1:" + (max + this.h + 1));
                GameEngine.print("longest:" + max);
                if (GameEngine.aX || GameEngine.aY) {
                    this.a++;
                } else {
                    this.h += 100;
                }
            }
            GameEngine.m328e("layerBufferSize:" + this.h);
            this.j = this.h - 4;
            GameEngine.print("layerBuffer:" + this.a + "x" + this.a + " = " + (this.a * this.a) + (b.I ? " x2 for soft fade " : VariableScope.nullOrMissingString));
            this.d = new d[this.a][this.a];
            boolean z = false;
            if (gameEngine.settingsEngine.renderFancyWater) {
                z = true;
            }
            if (GameEngine.C() || GameEngine.D()) {
                z = true;
            }
            if (this.h <= 0) {
                GameEngine.print("layerBuffer buffer size was too small at: " + this.h);
                this.h = 512;
            }
            if (z) {
                this.b = gameEngine.bO.a(this.h, this.h, true);
            } else {
                this.b = gameEngine.bO.a(this.h, this.h, false);
            }
            this.b.b(true);
            this.c = gameEngine.bO.b(this.b);
            f();
            GameEngine.m328e("----- layerBuffers create in:" + ((System.nanoTime() - nanoTime) / 1000000.0d) + " ms");
        }
    }

    public void c(int i) {
        if (i < this.a) {
            GameEngine.g("newLayerBufferCount:" + i);
            return;
        }
        d[][] dVarArr = new d[i][i];
        for (int i2 = 0; i2 < this.a; i2++) {
            for (int i3 = 0; i3 < this.a; i3++) {
                dVarArr[i2][i3] = this.d[i2][i3];
            }
        }
        this.d = dVarArr;
        this.a = i;
        f();
    }

    public void e() {
        b.I = false;
        b.J = true;
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                d dVar = this.d[i][i2];
                if (dVar != null) {
                    if (dVar.f != null) {
                        dVar.f.q();
                        dVar.f = null;
                    }
                    if (dVar.e != null) {
                        dVar.e.o();
                        dVar.e = null;
                    }
                }
            }
        }
    }

    public void f() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = null;
        boolean z = false;
        for (int i = 0; i < this.a; i++) {
            for (int i2 = 0; i2 < this.a; i2++) {
                if (this.d[i][i2] == null) {
                    d dVar = new d(this, i, i2);
                    dVar.b = this.p;
                    this.p++;
                    this.d[i][i2] = dVar;
                    if (this.h <= 0) {
                        GameEngine.print("initMissingLayerBufferImages: layerBuffer buffer size was too small at: " + this.h);
                        this.h = 512;
                    }
                    if (z) {
                        dVar.d = gameEngine.bO.r();
                    } else if (gameEngine.settingsEngine.renderFancyWater) {
                        dVar.d = gameEngine.bO.a(this.h, this.h, true);
                    } else {
                        dVar.d = gameEngine.bO.a(this.h, this.h, false);
                    }
                    dVar.d.b(true);
                    if (dVar.d.A()) {
                        if (!z) {
                            GameEngine.print("initMissingLayerBufferImages: Failed to create map buffer at :" + this.h + "px");
                        }
                        dVar.a = new z();
                    } else {
                        try {
                            dVar.a = gameEngine.bO.b(dVar.d);
                        } catch (OutOfMemoryError e) {
                            if (!z) {
                                GameEngine.a(u.gameImageCreate, e);
                            }
                            z = true;
                            dVar.a = new z();
                        }
                    }
                    if (arrayList == null) {
                        arrayList = new ArrayList();
                    }
                    arrayList.add(dVar);
                }
            }
        }
        if (z && b.I) {
            e();
        }
        if (arrayList != null) {
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                d dVar2 = (d) it.next();
                if (b.I) {
                    try {
                        dVar2.a();
                    } catch (OutOfMemoryError e2) {
                        e();
                        GameEngine.print("Not enough free memory to enable smooth fog fading");
                        System.gc();
                    }
                }
            }
        }
        a();
    }

    public float g() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.cX > 1.0f) {
            return 1.0f;
        }
        return gameEngine.cX;
    }

    public void a(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        Long l = null;
        boolean z = false;
        float g = g();
        boolean z2 = false;
        float f2 = g / this.m;
        if (f.c(f2 - 1.0f) < 0.01f) {
            f2 = 1.0f;
        }
        if (g > 0.6d) {
            float f3 = 0.3f;
            if (GameEngine.av()) {
                f3 = 0.1f;
            }
            if (g - this.m > f3) {
                z2 = true;
            }
            if (g == 1.0f && this.m != 1.0f) {
                z2 = true;
            }
        }
        if (f2 != 1.0f) {
            int i = 10;
            float f4 = 0.03f;
            if (g < 0.3f) {
                i = 20;
                f4 = 0.09f;
            } else if (g < 0.5f) {
                i = 20;
                f4 = 0.07f;
            }
            if (g > 1.3f) {
                i = 7;
            }
            if (!GameEngine.av()) {
                i += 10;
            }
            if (f.c(bVar.aj - g) > 0.03f) {
                bVar.aj = gameEngine.cX;
                bVar.ak = 0;
            } else {
                bVar.ak++;
            }
            if (bVar.ak < 3) {
                bVar.ai = 0.0f;
            } else if (f.c(g - this.m) > f4) {
                bVar.ai += 1.0f;
            }
            if (bVar.ai > i) {
                bVar.ai = 0.0f;
                z2 = true;
            }
        }
        if (gameEngine.cu + gameEngine.cA + 4.0f > this.f + (this.a * this.k)) {
            this.f += this.k;
            b(1);
        }
        if (gameEngine.cu - 1 < this.f) {
            this.f -= this.k;
            b(-1);
        }
        if (gameEngine.cv + gameEngine.cB + 4.0f > this.g + (this.a * this.k)) {
            this.g += this.k;
            a(1);
        }
        if (gameEngine.cv - 1 < this.g) {
            this.g -= this.k;
            a(-1);
        }
        if (gameEngine.cu + gameEngine.cA + 4.0f > this.f + (this.a * this.k)) {
            z2 = true;
        }
        if (gameEngine.cu - 1 < this.f) {
            z2 = true;
        }
        if (gameEngine.cv + gameEngine.cB + 4.0f > this.g + (this.a * this.k)) {
            z2 = true;
        }
        if (gameEngine.cv - 1 < this.g) {
            z2 = true;
        }
        if (z2) {
            a();
        }
        float f5 = gameEngine.cX / this.m;
        if (f.c(f5 - 1.0f) < 1.0E-4f) {
            f5 = 1.0f;
        }
        float f6 = (gameEngine.cF / f5) + 2.0f;
        float f7 = (gameEngine.cH / f5) + 2.0f;
        if (f5 != 1.0f) {
            gameEngine.bO.k();
            gameEngine.bO.a(f5, f5);
            bVar.ao.a(gameEngine.cK);
            bVar.ao.c = ((int) (bVar.ao.a + (bVar.ao.b() / f5))) + 2;
            bVar.ao.d = ((int) (bVar.ao.b + (bVar.ao.c() / f5))) + 2;
            gameEngine.bO.a(bVar.ao);
        }
        float f8 = (this.f - gameEngine.cw) * this.m;
        float f9 = (this.g - gameEngine.cx) * this.m;
        float f10 = (int) f8;
        float f11 = (int) f9;
        int i2 = 0;
        boolean z3 = false;
        if (GameEngine.av() && gameEngine.cX < 0.3d) {
            z3 = true;
        }
        this.e.a(z3);
        this.e.d(z3);
        this.e.b(z3);
        boolean z4 = false;
        for (int i3 = 0; i3 < this.a; i3++) {
            try {
                for (int i4 = 0; i4 < this.a; i4++) {
                    d dVar = this.d[i3][i4];
                    int i5 = (int) (f10 + (i3 * this.k * this.m));
                    int i6 = (int) (f11 + (i4 * this.k * this.m));
                    if (dVar.l && !this.n) {
                        dVar.m++;
                    }
                    dVar.p.a(i5 + 1, i6 + 1, (i5 + this.h) - 2, (i6 + this.h) - 2);
                    if (dVar.p.a <= f6 && dVar.p.b <= f7) {
                        if (dVar.p.c > f6) {
                            dVar.p.c = (int) f6;
                        }
                        if (dVar.p.d > f7) {
                            dVar.p.d = (int) f7;
                        }
                        int i7 = (int) ((0.0f - gameEngine.cw) * this.m);
                        int i8 = (int) ((0.0f - gameEngine.cx) * this.m);
                        int i9 = (int) ((bVar.i() - gameEngine.cw) * this.m);
                        int j = (int) ((bVar.j() - gameEngine.cx) * this.m);
                        if (dVar.p.a < i7) {
                            dVar.p.a = i7;
                        }
                        if (dVar.p.b < i8) {
                            dVar.p.b = i8;
                        }
                        if (dVar.p.c > i9) {
                            dVar.p.c = i9;
                        }
                        if (dVar.p.d > j) {
                            dVar.p.d = j;
                        }
                        if (!dVar.p.a()) {
                            boolean z5 = false;
                            boolean z6 = true;
                            if (dVar.k) {
                                z5 = true;
                                z6 = false;
                            }
                            if (dVar.l) {
                                int i10 = 10;
                                if (i2 > 3) {
                                    i10 = 10 + 2;
                                }
                                if (i2 > 6) {
                                    i10 += 2;
                                }
                                if (dVar.m > i10) {
                                    dVar.m = 0;
                                    z5 = true;
                                    i2++;
                                }
                            }
                            if (z5) {
                                z = true;
                                boolean z7 = false;
                                long loadAllUnitsTook = Unit.loadAllUnitsTook();
                                if (l == null) {
                                    l = Long.valueOf(loadAllUnitsTook);
                                } else {
                                    int i11 = 200;
                                    if (this.n) {
                                        i11 = 30;
                                    }
                                    if (Unit.a(l.longValue(), loadAllUnitsTook) > i11) {
                                        z7 = true;
                                        this.n = true;
                                    }
                                }
                                if (z7 && dVar.k && !dVar.n) {
                                    b(i3, i4);
                                }
                                if (!z7) {
                                    if (b.I) {
                                        if (dVar.e != null && dVar.e.p != dVar.d.p) {
                                            GameEngine.m328e("wrong sized fadeOutBitmap width:" + dVar.e.p + " vs " + dVar.d.p);
                                            dVar.e.o();
                                            dVar.e = null;
                                        }
                                        if (dVar.e == null) {
                                            try {
                                                dVar.a();
                                            } catch (OutOfMemoryError e) {
                                                e.printStackTrace();
                                                GameEngine.a(u.gameImageCreate, e);
                                                e();
                                                GameEngine.print("Not enough free memory to keep smooth fog fading");
                                                System.gc();
                                            }
                                            if (b.I && dVar.e == null) {
                                                gameEngine.i("Disabling smooth fog fading due to error");
                                                e();
                                                GameEngine.print("fadeOutBitmap == null");
                                                System.gc();
                                            }
                                        }
                                    }
                                    if (b.I) {
                                        if (dVar.g > 0.0f) {
                                        }
                                        e eVar = dVar.d;
                                        dVar.d = dVar.e;
                                        dVar.e = eVar;
                                        y yVar = dVar.a;
                                        dVar.a = dVar.f;
                                        dVar.f = yVar;
                                        if (z6) {
                                            dVar.g = 1.0f;
                                        } else {
                                            dVar.g = 0.0f;
                                        }
                                    } else {
                                        dVar.g = 0.0f;
                                    }
                                    if (GameEngine.at() && !z4) {
                                        b.a();
                                        z4 = true;
                                    }
                                    gameEngine.bO.i();
                                    c(i3, i4);
                                    gameEngine.bO.j();
                                    if (b.a) {
                                        Unit.a("re-drawTile", loadAllUnitsTook);
                                    }
                                }
                            }
                            dVar.o.a(dVar.p);
                            dVar.o.a(-i5, -i6);
                            dVar.q.a(dVar.p);
                            dVar.q.a(-f10, -f11);
                            dVar.q.a(f8, f9);
                            if (dVar.g > 0.0f) {
                                dVar.h.a(z3);
                                dVar.h.c((int) ((1.0f - dVar.g) * 255.0f));
                                gameEngine.bO.a(dVar.e, dVar.o, dVar.q, this.e);
                                if (dVar.g < 0.98d) {
                                    gameEngine.bO.a(dVar.d, dVar.o, dVar.q, dVar.h);
                                }
                                dVar.g -= 0.1f * f;
                            } else if (dVar.d.A()) {
                                gameEngine.bO.a(dVar.d, dVar.q, this.e, 0.0f, 0.0f, 0, 0);
                            } else {
                                gameEngine.bO.a(dVar.d, dVar.o, dVar.q, this.e);
                            }
                        }
                    }
                }
            } finally {
                if (z4) {
                    b.b();
                }
            }
        }
        if (f5 != 1.0f) {
            gameEngine.bO.l();
        }
        if (!z) {
            this.n = false;
        }
    }
}