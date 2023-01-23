package com.corrodinggames.rts.game.units.f;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.u;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/c.class */
public final class c {

    /* renamed from: a  reason: collision with root package name */
    int f360a;
    int b;
    float c;
    float d;
    public a[][] e = null;
    d f = new d();
    g g = new g();
    h h = new h();
    final u i = new u();
    final f j = new f();
    final Rect k = new Rect();
    final int l = 32;
    int m;

    public void a(float f, float f2, float f3, y yVar, float f4, i iVar) {
        this.g.a(f - f3, f2 - f3, f + f3, f2 + f3);
        a(this.g.f363a, this.g, yVar, f4, iVar);
    }

    public final f a(float f, float f2, float f3) {
        u uVar = this.i;
        uVar.clear();
        a(f, f2, f3, uVar);
        this.j.a(uVar);
        return this.j;
    }

    public final void a(float f, float f2, float f3, u uVar) {
        a[][] aVarArr = this.e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int a2 = a(f4);
        int a3 = a(f5);
        int b = b(f6);
        int b2 = b(f7);
        for (int i = a2; i <= a3; i++) {
            for (int i2 = b; i2 <= b2; i2++) {
                b bVar = aVarArr[i][i2].f358a;
                am[] a4 = bVar.a();
                int i3 = bVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    am amVar = a4[i4];
                    float f8 = amVar.eo;
                    float f9 = amVar.ep;
                    if (f4 <= f8 && f8 <= f5 && f6 <= f9 && f9 <= f7) {
                        uVar.add(amVar);
                    }
                }
            }
        }
    }

    public final f b(float f, float f2, float f3) {
        u uVar = this.i;
        uVar.clear();
        b(f, f2, f3, uVar);
        this.j.a(uVar);
        return this.j;
    }

    public final void b(float f, float f2, float f3, u uVar) {
        a[][] aVarArr = this.e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int a2 = a(f4 - 50.0f);
        int a3 = a(f5 + 50.0f);
        int b = b(f6 - 50.0f);
        int b2 = b(f7 + 50.0f);
        for (int i = a2; i <= a3; i++) {
            for (int i2 = b; i2 <= b2; i2++) {
                b bVar = aVarArr[i][i2].f358a;
                am[] a4 = bVar.a();
                int i3 = bVar.b;
                for (int i4 = 0; i4 < i3; i4++) {
                    am amVar = a4[i4];
                    float f8 = amVar.eo;
                    float f9 = amVar.ep;
                    float f10 = amVar.cj;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        uVar.b(amVar);
                    }
                }
            }
        }
    }

    public final void a(PlayerData playerData, float f, float f2, float f3, u uVar) {
        a[][] aVarArr = this.e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int a2 = a(f4 - 50.0f);
        int a3 = a(f5 + 50.0f);
        int b = b(f6 - 50.0f);
        int b2 = b(f7 + 50.0f);
        int i = playerData.k;
        for (int i2 = a2; i2 <= a3; i2++) {
            for (int i3 = b; i3 <= b2; i3++) {
                b bVar = aVarArr[i2][i3].b[i];
                am[] a4 = bVar.a();
                int i4 = bVar.b;
                for (int i5 = 0; i5 < i4; i5++) {
                    am amVar = a4[i5];
                    float f8 = amVar.eo;
                    float f9 = amVar.ep;
                    float f10 = amVar.cj;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        uVar.b(amVar);
                    }
                }
            }
        }
    }

    public void a(RectF rectF, e eVar, y yVar, float f, i iVar) {
        a[][] aVarArr = this.e;
        int a2 = a(rectF.f48a);
        int a3 = a(rectF.c);
        int b = b(rectF.b);
        int b2 = b(rectF.d);
        PlayerData playerData = null;
        int excludeTeam = iVar.excludeTeam(yVar);
        if (excludeTeam != -2 && excludeTeam != -3) {
            playerData = PlayerData.k(excludeTeam);
        }
        PlayerData onlyEnemiesOfTeam = iVar.onlyEnemiesOfTeam(yVar);
        PlayerData onlyTeam = iVar.onlyTeam(yVar);
        iVar.setup(yVar, f);
        if (onlyEnemiesOfTeam == null && onlyTeam == null) {
            for (int i = a2; i <= a3; i++) {
                for (int i2 = b; i2 <= b2; i2++) {
                    b bVar = aVarArr[i][i2].f358a;
                    am[] a4 = bVar.a();
                    int i3 = bVar.b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        am amVar = a4[i4];
                        if ((playerData == null || amVar.bX != playerData) && eVar.a(amVar)) {
                            iVar.callback(yVar, f, amVar);
                        }
                    }
                }
            }
        } else if (onlyTeam != null) {
            int i5 = onlyTeam.k;
            if (i5 == -1) {
                for (int i6 = a2; i6 <= a3; i6++) {
                    for (int i7 = b; i7 <= b2; i7++) {
                        b bVar2 = aVarArr[i6][i7].d;
                        if (bVar2.b > 0) {
                            am[] a5 = bVar2.a();
                            int i8 = bVar2.b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                am amVar2 = a5[i9];
                                if (eVar.a(amVar2)) {
                                    iVar.callback(yVar, f, amVar2);
                                }
                            }
                        }
                    }
                }
            } else if (i5 == -2) {
                for (int i10 = a2; i10 <= a3; i10++) {
                    for (int i11 = b; i11 <= b2; i11++) {
                        b bVar3 = aVarArr[i10][i11].c;
                        if (bVar3.b > 0) {
                            am[] a6 = bVar3.a();
                            int i12 = bVar3.b;
                            for (int i13 = 0; i13 < i12; i13++) {
                                am amVar3 = a6[i13];
                                if (eVar.a(amVar3)) {
                                    iVar.callback(yVar, f, amVar3);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i14 = a2; i14 <= a3; i14++) {
                    for (int i15 = b; i15 <= b2; i15++) {
                        b bVar4 = aVarArr[i14][i15].b[i5];
                        if (bVar4.b > 0) {
                            am[] a7 = bVar4.a();
                            int i16 = bVar4.b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                am amVar4 = a7[i17];
                                if (eVar.a(amVar4)) {
                                    iVar.callback(yVar, f, amVar4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (onlyEnemiesOfTeam != PlayerData.h) {
                for (int i18 = a2; i18 <= a3; i18++) {
                    for (int i19 = b; i19 <= b2; i19++) {
                        b bVar5 = aVarArr[i18][i19].c;
                        if (bVar5.b > 0) {
                            am[] a8 = bVar5.a();
                            int i20 = bVar5.b;
                            for (int i21 = 0; i21 < i20; i21++) {
                                am amVar5 = a8[i21];
                                if (eVar.a(amVar5)) {
                                    iVar.callback(yVar, f, amVar5);
                                }
                            }
                        }
                    }
                }
            }
            int i22 = this.m;
            for (int i23 = 0; i23 <= i22; i23++) {
                PlayerData k = PlayerData.k(i23);
                if (k != null && onlyEnemiesOfTeam != k && onlyEnemiesOfTeam.c(k)) {
                    for (int i24 = a2; i24 <= a3; i24++) {
                        for (int i25 = b; i25 <= b2; i25++) {
                            b bVar6 = aVarArr[i24][i25].b[i23];
                            int i26 = bVar6.b;
                            if (i26 > 0) {
                                am[] a9 = bVar6.a();
                                for (int i27 = 0; i27 < i26; i27++) {
                                    am amVar6 = a9[i27];
                                    if (eVar.a(amVar6)) {
                                        iVar.callback(yVar, f, amVar6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    public final int a(float f) {
        int i = (int) (f * this.c);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    public final int b(float f) {
        int i = (int) (f * this.d);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    public void a() {
        float f = this.c;
        float f2 = this.d;
        am[] a2 = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a2[i];
            if (amVar.bV || ((int) (amVar.eo * f)) != amVar.dl || ((int) (amVar.ep * f2)) != amVar.dm || amVar.bX == null || amVar.dn != amVar.bX.k) {
                a(amVar);
            }
        }
    }

    public void a(am amVar) {
        if (this.e == null) {
            if (GameEngine.getGameEngine().tick != 0) {
                GameEngine.print("updateUnitGeoIndex: areaList not active");
            }
            amVar.dl = -1;
            amVar.dm = -1;
        } else if (amVar.bV) {
            if (amVar.dl != -1 && amVar.dm != -1) {
                this.e[amVar.dl][amVar.dm].b(amVar);
                amVar.dl = -1;
                amVar.dm = -1;
            }
        } else {
            int a2 = a(amVar.eo);
            int b = b(amVar.ep);
            int i = -2;
            if (amVar.bX != null) {
                i = amVar.bX.k;
            }
            if (amVar.dl == a2 && amVar.dm == b && amVar.dn == i) {
                return;
            }
            if (amVar.dl != -1 && amVar.dm != -1) {
                this.e[amVar.dl][amVar.dm].b(amVar);
            }
            amVar.dl = a2;
            amVar.dm = b;
            amVar.dn = i;
            if (i > this.m && this.m < PlayerData.c) {
                this.m = i;
            }
            this.e[amVar.dl][amVar.dm].a(amVar);
        }
    }

    public void a(com.corrodinggames.rts.game.b.b bVar) {
        this.e = new a[32][32];
        this.m = 0;
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                this.e[i][i2] = new a();
            }
        }
        this.f360a = (bVar.C * bVar.n) / 32;
        this.b = (bVar.D * bVar.o) / 32;
        this.c = 1.0f / this.f360a;
        this.d = 1.0f / this.b;
    }

    public void b() {
        this.e = null;
    }

    public void c(float f) {
    }
}