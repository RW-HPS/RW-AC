package com.corrodinggames.rts.gameFramework.f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bj;
import com.corrodinggames.rts.gameFramework.bm;
import com.corrodinggames.rts.gameFramework.bo;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/y.class */
public class y {
    private ArrayList e;
    private ArrayList l;
    private ab[] m;

    /* renamed from: a  reason: collision with root package name */
    aa f531a;
    private long n;
    private com.corrodinggames.rts.gameFramework.m.e o;
    private com.corrodinggames.rts.gameFramework.m.e[] p;
    private Rect q;
    private Rect r;
    Paint c;
    Paint d;
    private ac f = ac.overallStats;
    private z g = z.absolute;
    private ArrayList h = new ArrayList();
    private ab[] i = new ab[bj.values().length];
    private ArrayList j = new ArrayList();
    private ab[] k = new ab[bj.values().length];
    private ArrayList s = new ArrayList();
    private ArrayList t = new ArrayList();
    private int u = -1;
    private int v = -1;
    private int w = -1;
    Rect b = new Rect();

    public static y a() {
        return new y(GameEngine.getGameEngine().bY.d(), e.a());
    }

    private y(ArrayList arrayList, ArrayList arrayList2) {
        bj[] values;
        this.e = arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bo boVar = (bo) it.next();
            PlayerData k = PlayerData.k(boVar.l.b());
            this.h.add(new aa(boVar.l, k.name, k.K()));
        }
        Iterator it2 = PlayerData.f().iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                bo boVar2 = (bo) it3.next();
                if (PlayerData.k(boVar2.l.b()).r == num.intValue()) {
                    arrayList3.add(boVar2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.j.add(new aa(new bm(arrayList3).l, "Team " + PlayerData.a(num.intValue()), PlayerData.i(num.intValue())));
            }
        }
        for (bj bjVar : bj.values()) {
            this.i[bjVar.ordinal()] = new ab(bjVar, this.h);
            this.k[bjVar.ordinal()] = new ab(bjVar, this.j);
        }
        this.l = this.h;
        this.m = this.i;
        b();
    }

    public void b() {
        this.f = ac.overallStats;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.c = new Paint();
        this.c.a(true);
        this.c.a(Paint.Align.LEFT);
        this.c.a(255, 0, 255, 0);
        gameEngine.b(this.c, 16.0f);
        this.d = new Paint();
        this.d.a(true);
        this.d.a(Paint.Align.RIGHT);
        this.d.a(255, 0, 255, 0);
        gameEngine.b(this.d, 16.0f);
        c();
    }

    private void c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.p = new com.corrodinggames.rts.gameFramework.m.e[ac.values().length + 2];
        this.p[0] = gameEngine.bO.a(R.drawable.stats_button_info);
        this.p[1] = gameEngine.bO.a(R.drawable.stats_button_income);
        this.p[2] = gameEngine.bO.a(R.drawable.stats_button_armyvalue);
        this.p[3] = gameEngine.bO.a(R.drawable.stats_button_buildingvalue);
        this.p[4] = gameEngine.bO.a(R.drawable.stats_button_totalvalue);
        this.p[5] = gameEngine.bO.a(R.drawable.stats_toggle_relative);
        this.p[6] = gameEngine.bO.a(R.drawable.stats_toggle_teams);
        this.r = new Rect(0, 0, this.p[0].m(), this.p[0].l());
    }

    public void a(Rect rect, Rect rect2, float f, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        g gVar = gameEngine.bS;
        boolean z3 = true;
        if (z2) {
            int length = ac.values().length;
            int a2 = gameEngine.a(30);
            int i = a2 * 2;
            int a3 = gameEngine.a(20);
            int i2 = (rect2.d - a2) - a3;
            int i3 = gVar.c ? length + 2 : length - 1;
            int i4 = (int) ((gameEngine.cF / 2.0f) - (((i * i3) + (a3 * (i3 - 1))) / 2));
            Paint paint = new Paint();
            Paint paint2 = new Paint();
            paint2.a(100, 255, 255, 255);
            for (int i5 = 0; i5 < length; i5++) {
                ac acVar = ac.values()[i5];
                if (gVar.c || acVar != ac.overallStats) {
                    if (gVar.a(i4, i2, i, a2, i.none, false)) {
                        if (this.f != acVar) {
                            this.f = acVar;
                            this.n = System.currentTimeMillis();
                            this.u = -1;
                            this.v = -1;
                            this.w = -1;
                        }
                        if (this.f != ac.overallStats) {
                            gVar.c = true;
                        }
                    }
                    this.b.a(i4, i2, i4 + i, i2 + a2);
                    gameEngine.bO.a(gameEngine.bS.bn, this.r, this.b, paint);
                    Paint paint3 = paint2;
                    if (!gVar.c || this.f == acVar) {
                        paint3 = paint;
                    }
                    gameEngine.bO.a(this.p[i5], this.r, this.b, paint3);
                    i4 += a3 + i;
                }
            }
            int i6 = i4 + a3;
            if (gVar.c) {
                boolean z4 = this.g != z.absolute;
                if (gVar.a(i6, i2, i, a2, i.none, false)) {
                    this.g = !z4 ? z.relative : z.absolute;
                    this.n = System.currentTimeMillis();
                }
                this.b.a(i6, i2, i6 + i, i2 + a2);
                Paint paint4 = paint;
                if (this.f == ac.overallStats) {
                    paint4 = paint2;
                }
                gameEngine.bO.a(gameEngine.bS.bn, this.r, this.b, paint4);
                Paint paint5 = paint;
                if (!z4 || this.f == ac.overallStats) {
                    paint5 = paint2;
                }
                gameEngine.bO.a(this.p[5], this.r, this.b, paint5);
                int i7 = i6 + a3 + i;
                boolean z5 = this.l == this.j;
                if (gVar.a(i7, i2, i, a2, i.none, false)) {
                    if (!z5) {
                        this.l = this.j;
                        this.m = this.k;
                    } else {
                        this.l = this.h;
                        this.m = this.i;
                    }
                    this.n = System.currentTimeMillis();
                }
                this.b.a(i7, i2, i7 + i, i2 + a2);
                Paint paint6 = paint;
                if (this.f == ac.overallStats) {
                    paint6 = paint2;
                }
                gameEngine.bO.a(gameEngine.bS.bn, this.r, this.b, paint6);
                Paint paint7 = paint;
                if (!z5 || this.f == ac.overallStats) {
                    paint7 = paint2;
                }
                gameEngine.bO.a(this.p[6], this.r, this.b, paint7);
                int i8 = i7 + a3 + i;
            }
            if (this.f == ac.overallStats) {
                z3 = true;
            } else {
                z3 = false;
                rect.d = i2 - gameEngine.a(10);
                if (z) {
                    a(this.f.a(), this.g, rect);
                }
            }
        }
        if (z3) {
            a(rect, f);
        }
    }

    private void a(Rect rect, float f) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = 1.5f;
        int a2 = rect.b + gameEngine.a(25);
        int d = rect.d();
        this.c.a("123|", 0, "123|".length(), this.b);
        float c = this.b.c() + 6;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            e eVar = (e) it.next();
            if (eVar.d != 1.0f && f2 > 0.0f) {
                eVar.d = com.corrodinggames.rts.gameFramework.f.a(eVar.d, 1.0f, 0.01f * f2 * f);
                f2 -= 1.0f - eVar.d;
            }
            float b = com.corrodinggames.rts.gameFramework.f.b(eVar.d, 0.0f, 1.0f);
            if (eVar.b != null) {
                str = eVar.b;
            } else {
                str = VariableScope.nullOrMissingString + ((int) (eVar.c * b));
                if (b <= 0.0f) {
                    str = " ";
                }
            }
            String str2 = eVar.f510a;
            float b2 = com.corrodinggames.rts.gameFramework.f.b(eVar.d * 2.2f, 0.0f, 1.0f);
            int i = 0;
            if (b2 > 0.0f) {
                i = (int) (str2.length() * b2);
            }
            int b3 = com.corrodinggames.rts.gameFramework.f.b(i, 0, str2.length());
            String str3 = VariableScope.nullOrMissingString;
            if (b3 > 0 && b3 < str2.length() - 1) {
                str3 = "_";
            }
            gameEngine.bO.a(str2.substring(0, b3) + str3 + com.corrodinggames.rts.gameFramework.f.d(" ", (str2.length() + str3.length()) - b3), d - (8.0f * this.c.k()), a2, this.c);
            gameEngine.bO.a(str, d + (8.0f * this.c.k()), a2, this.d);
            a2 = (int) (a2 + c);
        }
    }

    private void a(bj bjVar, z zVar, Rect rect) {
        a(GameEngine.getGameEngine().bO, bjVar, zVar, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x03d7 A[LOOP:3: B:58:0x03cd->B:60:0x03d7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.corrodinggames.rts.gameFramework.m.y r8, com.corrodinggames.rts.gameFramework.bj r9, com.corrodinggames.rts.gameFramework.f.z r10, android.graphics.Rect r11) {
        /*
            Method dump skipped, instructions count: 2181
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.f.y.a(com.corrodinggames.rts.gameFramework.m.y, com.corrodinggames.rts.gameFramework.bj, com.corrodinggames.rts.gameFramework.f.z, android.graphics.Rect):void");
    }
}