package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.TeamStats;
import com.corrodinggames.rts.gameFramework.bh;
import com.corrodinggames.rts.gameFramework.bi;
import com.corrodinggames.rts.gameFramework.bj;
import com.corrodinggames.rts.gameFramework.bm;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.translations.a;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/y.class */
public class y {
    private ArrayList e;
    private ArrayList l;
    private ab[] m;
    aa a;
    private long n;
    private e o;
    private e[] p;
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
        return new y(GameEngine.getGameEngine().stats.d(), DisplayedStat.a());
    }

    private y(ArrayList arrayList, ArrayList arrayList2) {
        bj[] values;
        this.e = arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TeamStats teamStats = (TeamStats) it.next();
            PlayerData playerData = PlayerData.getPlayerData(teamStats.l.b());
            this.h.add(new aa(teamStats.l, playerData.name, playerData.K()));
        }
        Iterator it2 = PlayerData.f().iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                TeamStats teamStats2 = (TeamStats) it3.next();
                if (PlayerData.getPlayerData(teamStats2.l.b()).team == num.intValue()) {
                    arrayList3.add(teamStats2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.j.add(new aa(new bm(arrayList3).l, "Team " + PlayerData.getTeamName(num.intValue()), PlayerData.i(num.intValue())));
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
        this.p = new e[ac.values().length + 2];
        this.p[0] = gameEngine.bO.a(AssetsID.drawable.stats_button_info);
        this.p[1] = gameEngine.bO.a(AssetsID.drawable.stats_button_income);
        this.p[2] = gameEngine.bO.a(AssetsID.drawable.stats_button_armyvalue);
        this.p[3] = gameEngine.bO.a(AssetsID.drawable.stats_button_buildingvalue);
        this.p[4] = gameEngine.bO.a(AssetsID.drawable.stats_button_totalvalue);
        this.p[5] = gameEngine.bO.a(AssetsID.drawable.stats_toggle_relative);
        this.p[6] = gameEngine.bO.a(AssetsID.drawable.stats_toggle_teams);
        this.r = new Rect(0, 0, this.p[0].m(), this.p[0].l());
    }

    public void a(Rect rect, Rect rect2, float f, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceEngine interfaceEngine = gameEngine.bS;
        boolean z3 = true;
        if (z2) {
            int length = ac.values().length;
            int a = gameEngine.a(30);
            int i = a * 2;
            int a2 = gameEngine.a(20);
            int i2 = (rect2.d - a) - a2;
            int i3 = interfaceEngine.c ? length + 2 : length - 1;
            int i4 = (int) ((gameEngine.cF / 2.0f) - (((i * i3) + (a2 * (i3 - 1))) / 2));
            Paint paint = new Paint();
            Paint paint2 = new Paint();
            paint2.a(100, 255, 255, 255);
            for (int i5 = 0; i5 < length; i5++) {
                ac acVar = ac.values()[i5];
                if (interfaceEngine.c || acVar != ac.overallStats) {
                    if (interfaceEngine.a(i4, i2, i, a, i.none, false)) {
                        if (this.f != acVar) {
                            this.f = acVar;
                            this.n = System.currentTimeMillis();
                            this.u = -1;
                            this.v = -1;
                            this.w = -1;
                        }
                        if (this.f != ac.overallStats) {
                            interfaceEngine.c = true;
                        }
                    }
                    this.b.a(i4, i2, i4 + i, i2 + a);
                    gameEngine.bO.a(gameEngine.bS.bn, this.r, this.b, paint);
                    Paint paint3 = paint2;
                    if (!interfaceEngine.c || this.f == acVar) {
                        paint3 = paint;
                    }
                    gameEngine.bO.a(this.p[i5], this.r, this.b, paint3);
                    i4 += a2 + i;
                }
            }
            int i6 = i4 + a2;
            if (interfaceEngine.c) {
                boolean z4 = this.g != z.absolute;
                if (interfaceEngine.a(i6, i2, i, a, i.none, false)) {
                    this.g = !z4 ? z.relative : z.absolute;
                    this.n = System.currentTimeMillis();
                }
                this.b.a(i6, i2, i6 + i, i2 + a);
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
                int i7 = i6 + a2 + i;
                boolean z5 = this.l == this.j;
                if (interfaceEngine.a(i7, i2, i, a, i.none, false)) {
                    if (!z5) {
                        this.l = this.j;
                        this.m = this.k;
                    } else {
                        this.l = this.h;
                        this.m = this.i;
                    }
                    this.n = System.currentTimeMillis();
                }
                this.b.a(i7, i2, i7 + i, i2 + a);
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
                int i8 = i7 + a2 + i;
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
        int a = rect.b + gameEngine.a(25);
        int d = rect.d();
        this.c.a("123|", 0, "123|".length(), this.b);
        float c = this.b.c() + 6;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            DisplayedStat displayedStat = (DisplayedStat) it.next();
            if (displayedStat.d != 1.0f && f2 > 0.0f) {
                displayedStat.d = f.a(displayedStat.d, 1.0f, 0.01f * f2 * f);
                f2 -= 1.0f - displayedStat.d;
            }
            float b = f.b(displayedStat.d, 0.0f, 1.0f);
            if (displayedStat.b != null) {
                str = displayedStat.b;
            } else {
                str = VariableScope.nullOrMissingString + ((int) (displayedStat.c * b));
                if (b <= 0.0f) {
                    str = " ";
                }
            }
            String str2 = displayedStat.a;
            float b2 = f.b(displayedStat.d * 2.2f, 0.0f, 1.0f);
            int i = 0;
            if (b2 > 0.0f) {
                i = (int) (str2.length() * b2);
            }
            int b3 = f.b(i, 0, str2.length());
            String str3 = VariableScope.nullOrMissingString;
            if (b3 > 0 && b3 < str2.length() - 1) {
                str3 = "_";
            }
            gameEngine.bO.a(str2.substring(0, b3) + str3 + f.d(" ", (str2.length() + str3.length()) - b3), d - (8.0f * this.c.k()), a, this.c);
            gameEngine.bO.a(str, d + (8.0f * this.c.k()), a, this.d);
            a = (int) (a + c);
        }
    }

    private void a(bj bjVar, z zVar, Rect rect) {
        a(GameEngine.getGameEngine().bO, bjVar, zVar, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x03d7 A[LOOP:3: B:58:0x03cd->B:60:0x03d7, LOOP_END] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(com.corrodinggames.rts.gameFramework.unitAction.y yVar, bj bjVar, z zVar, Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        bj bjVar2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        bj bjVar3;
        int i15;
        bj bjVar4;
        int i16;
        int i17;
        int i18;
        bj bjVar5;
        GameEngine gameEngine = GameEngine.getGameEngine();
        InterfaceEngine interfaceEngine = gameEngine.bS;
        ab abVar = this.m[bjVar.ordinal()];
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.n)) / 250.0f;
        Paint paint = new Paint();
        paint.a(255, 0, 255, 0);
        paint.a(true);
        paint.c(true);
        paint.a(Typeface.a(Typeface.c, 0));
        gameEngine.b(paint, 14.0f);
        Paint paint2 = new Paint(paint);
        paint2.a(Paint.Align.CENTER);
        gameEngine.b(paint2, 14.0f);
        Paint paint3 = new Paint();
        paint3.a(2.0f);
        if (GameEngine.aZ) {
            paint3.a(3.0f);
        }
        paint3.a(Paint.Cap.ROUND);
        Rect rect2 = new Rect();
        Paint paint4 = interfaceEngine.aD;
        String a = a.a("gui.leaderboard.type." + bjVar.name(), new Object[0]);
        paint4.a(a, 0, a.length(), this.b);
        yVar.a(a, rect.d(), rect.b + this.b.c(), paint4);
        rect2.b = rect.b + this.b.c() + 3;
        rect2.d = (rect.d - this.b.c()) - 3;
        i = abVar.b;
        i2 = abVar.c;
        int max = Math.max(1, i - i2);
        float c = rect2.c() / max;
        String a2 = f.a(0L);
        int b = yVar.b(a2, paint2);
        yVar.a(a2, rect.a + (b / 2), rect.d, paint2);
        rect2.a = rect.a + (b / 2);
        paint.a("123|", 0, "123|".length(), this.b);
        int c2 = this.b.c();
        if (zVar != z.absolute) {
            rect2.c = rect.c - gameEngine.a(10);
        } else {
            bjVar3 = abVar.a;
            com.corrodinggames.rts.gameFramework.player.f a3 = bjVar3.a();
            i15 = abVar.b;
            String a4 = com.corrodinggames.rts.gameFramework.player.a.a(a3, i15);
            bjVar4 = abVar.a;
            com.corrodinggames.rts.gameFramework.player.f a5 = bjVar4.a();
            i16 = abVar.c;
            rect2.c = (rect.c - Math.max(yVar.b(a4, paint), yVar.b(com.corrodinggames.rts.gameFramework.player.a.a(a5, i16), paint))) - 2;
            int i19 = c2 / 2;
            yVar.b(rect2, interfaceEngine.aM);
            paint3.b(-13619152);
            for (int i20 = 0; i20 <= 4; i20++) {
                i17 = abVar.c;
                float f = i17 + ((max * i20) / 4.0f);
                i18 = abVar.c;
                float f2 = rect2.d - ((f - i18) * c);
                bjVar5 = abVar.a;
                yVar.a(com.corrodinggames.rts.gameFramework.player.a.a(bjVar5.a(), (int) f), rect2.c + 2, f2 + i19, paint);
                if (i20 > 0 && i20 < 4) {
                    yVar.a(rect2.a, f2, rect2.c, f2, paint3);
                }
            }
        }
        i3 = abVar.d;
        String a6 = f.a(i3 / 1000);
        yVar.b(a6, paint2);
        yVar.a(a6, rect2.c, rect.d, paint2);
        i4 = abVar.d;
        float b2 = rect2.b() / i4;
        if (zVar == z.absolute) {
            int i21 = 0;
            while (i21 <= 2) {
                Iterator it = this.l.iterator();
                while (it.hasNext()) {
                    aa aaVar = (aa) it.next();
                    bi a7 = aaVar.a.a(bjVar);
                    boolean z = i21 == 0;
                    if (!z) {
                        i10 = 220;
                        if (this.a != null) {
                            if (aaVar == this.a) {
                                i10 = 255;
                            } else {
                                i10 = 50;
                            }
                        }
                    } else if (aaVar.c == -16777216) {
                        i10 = 255;
                        if (this.a != null) {
                            if (aaVar == this.a) {
                                i10 = 255;
                            } else {
                                i10 = 50;
                            }
                        }
                    }
                    if (i21 == 2) {
                        if (aaVar == this.a) {
                            bh bhVar = (bh) a7.get(0);
                            float f3 = rect2.a;
                            int i22 = bhVar.b;
                            i11 = abVar.c;
                            float f4 = rect2.d - (c * (i22 - i11));
                            for (i12 = 1; i12 < a7.size(); i12++) {
                                bh bhVar2 = (bh) a7.get(i12);
                                float f5 = rect2.a + (b2 * bhVar2.a);
                                int i23 = bhVar2.b;
                                i13 = abVar.c;
                                float f6 = rect2.d - (c * (i23 - i13));
                                i14 = abVar.d;
                                ag a8 = aaVar.a((int) (i10 * Math.min(1.0f, Math.max(0.0f, currentTimeMillis - (bhVar2.a / i14)))), z);
                                yVar.a(f3, f4, f5, f4, a8);
                                yVar.a(f5, f4, f5, f6, a8);
                                f3 = f5;
                                f4 = f6;
                            }
                        }
                    } else {
                        if (i21 == 1 && aaVar == this.a) {
                        }
                        bh bhVar3 = (bh) a7.get(0);
                        float f32 = rect2.a;
                        int i222 = bhVar3.b;
                        i11 = abVar.c;
                        float f42 = rect2.d - (c * (i222 - i11));
                        while (i12 < a7.size()) {
                        }
                    }
                }
                i21++;
            }
        } else {
            arrayList = abVar.e;
            ad adVar = (ad) arrayList.get(0);
            for (int i24 = 1; i24 < arrayList.size(); i24++) {
                ad adVar2 = (ad) arrayList.get(i24);
                i5 = adVar.a;
                float f7 = rect2.a + (b2 * i5);
                i6 = adVar2.a;
                float f8 = rect2.a + (b2 * i6);
                float f9 = rect2.d;
                for (int i25 = 0; i25 < this.l.size(); i25++) {
                    float a9 = adVar.a(i25);
                    float c3 = f9 - (rect2.c() * a9);
                    if (a9 > 0.0f) {
                        i7 = adVar.a;
                        i8 = abVar.d;
                        ag a10 = ((aa) this.l.get(i25)).a((int) (Math.min(1.0f, Math.max(0.0f, currentTimeMillis - (i7 / i8))) * 255.0f), false);
                        this.b.a((int) f7, (int) (c3 + 0.5f), (int) f8, (int) (f9 + 0.5f));
                        if (this.o != null) {
                            yVar.a(this.o, this.q, this.b, a10);
                        } else {
                            yVar.b(this.b, a10);
                        }
                    }
                    f9 = c3;
                }
                adVar = adVar2;
            }
        }
        if (rect2.b((int) interfaceEngine.x, (int) interfaceEngine.y)) {
            interfaceEngine.a(rect2.a, rect2.b, rect2.b(), rect2.c());
            paint3.b(-1);
            yVar.a(interfaceEngine.x, rect2.b, interfaceEngine.x, rect2.d, paint3);
            int i26 = (int) interfaceEngine.x;
            int i27 = (int) interfaceEngine.y;
            int i28 = (int) ((interfaceEngine.x - rect2.a) / b2);
            if (this.v != i26 || this.w != i27) {
                this.v = i26;
                this.w = i27;
                this.u = i28;
                this.s.clear();
                this.t.clear();
                this.s.add(f.a(this.u / 1000));
                this.t.add(-1);
                aa aaVar2 = null;
                if (zVar == z.absolute) {
                    float f10 = 30.0f;
                    Iterator it2 = this.l.iterator();
                    while (it2.hasNext()) {
                        aa aaVar3 = (aa) it2.next();
                        int a11 = aaVar3.a.a(bjVar, this.u);
                        i9 = abVar.c;
                        float c4 = f.c((rect2.d - (c * (a11 - i9))) - interfaceEngine.y);
                        if (c4 < f10) {
                            f10 = c4;
                            aaVar2 = aaVar3;
                        }
                    }
                }
                this.a = aaVar2;
                Iterator it3 = this.l.iterator();
                while (it3.hasNext()) {
                    aa aaVar4 = (aa) it3.next();
                    int a12 = aaVar4.a.a(bjVar, this.u);
                    StringBuilder sb = new StringBuilder();
                    bjVar2 = abVar.a;
                    this.s.add(sb.append(com.corrodinggames.rts.gameFramework.player.a.a(bjVar2.a(), a12)).append(" ").append(aaVar4.b).toString());
                    int i29 = aaVar4.c;
                    if (this.a != null && this.a != aaVar4) {
                        i29 = Color.a(60, Color.b(i29), Color.c(i29), Color.d(i29));
                    }
                    this.t.add(Integer.valueOf(i29));
                }
            }
            this.b.a = rect2.a + gameEngine.a(5);
            this.b.b = rect2.b + gameEngine.a(5);
            this.b.d = this.b.b + gameEngine.a(5) + (c2 * this.s.size());
            String str = VariableScope.nullOrMissingString;
            Iterator it4 = this.s.iterator();
            while (it4.hasNext()) {
                String str2 = (String) it4.next();
                if (str.length() < str2.length()) {
                    str = str2;
                }
            }
            this.b.c = this.b.a + gameEngine.a(10) + yVar.b(str, paint);
            yVar.b(this.b, interfaceEngine.aL);
            int i30 = this.b.b + c2 + 3;
            for (int i31 = 0; i31 < this.s.size(); i31++) {
                paint.b(((Integer) this.t.get(i31)).intValue());
                yVar.a((String) this.s.get(i31), this.b.a + 3, i30, paint);
                i30 += c2;
            }
            return;
        }
        this.a = null;
    }
}