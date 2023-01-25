package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Typeface;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0732bh;
import com.corrodinggames.rts.gameFramework.C0733bi;
import com.corrodinggames.rts.gameFramework.C0737bm;
import com.corrodinggames.rts.gameFramework.C0739bo;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.EnumC0734bj;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.player.C0847a;
import com.corrodinggames.rts.gameFramework.player.EnumC0853f;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/y.class */
public class C0844y {

    /* renamed from: e */
    private ArrayList f5560e;

    /* renamed from: l */
    private ArrayList f5567l;

    /* renamed from: m */
    private C0792ab[] f5568m;

    /* renamed from: a */
    C0791aa f5569a;

    /* renamed from: n */
    private long f5570n;

    /* renamed from: o */
    private C0970e f5571o;

    /* renamed from: p */
    private C0970e[] f5572p;

    /* renamed from: q */
    private Rect f5573q;

    /* renamed from: r */
    private Rect f5574r;

    /* renamed from: c */
    Paint f5581c;

    /* renamed from: d */
    Paint f5582d;

    /* renamed from: f */
    private EnumC0793ac f5561f = EnumC0793ac.overallStats;

    /* renamed from: g */
    private EnumC0845z f5562g = EnumC0845z.absolute;

    /* renamed from: h */
    private ArrayList f5563h = new ArrayList();

    /* renamed from: i */
    private C0792ab[] f5564i = new C0792ab[EnumC0734bj.values().length];

    /* renamed from: j */
    private ArrayList f5565j = new ArrayList();

    /* renamed from: k */
    private C0792ab[] f5566k = new C0792ab[EnumC0734bj.values().length];

    /* renamed from: s */
    private ArrayList f5575s = new ArrayList();

    /* renamed from: t */
    private ArrayList f5576t = new ArrayList();

    /* renamed from: u */
    private int f5577u = -1;

    /* renamed from: v */
    private int f5578v = -1;

    /* renamed from: w */
    private int f5579w = -1;

    /* renamed from: b */
    Rect f5580b = new Rect();

    /* renamed from: a */
    public static C0844y m1744a() {
        return new C0844y(GameEngine.getGameEngine().f6336bY.m2458d(), C0821e.m1921a());
    }

    private C0844y(ArrayList arrayList, ArrayList arrayList2) {
        EnumC0734bj[] values;
        this.f5560e = arrayList2;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0739bo c0739bo = (C0739bo) it.next();
            PlayerData m4366k = PlayerData.m4366k(c0739bo.f4645l.m2444b());
            this.f5563h.add(new C0791aa(c0739bo.f4645l, m4366k.name, m4366k.m4462K()));
        }
        Iterator it2 = PlayerData.m4380f().iterator();
        while (it2.hasNext()) {
            Integer num = (Integer) it2.next();
            ArrayList arrayList3 = new ArrayList();
            Iterator it3 = arrayList.iterator();
            while (it3.hasNext()) {
                C0739bo c0739bo2 = (C0739bo) it3.next();
                if (PlayerData.m4366k(c0739bo2.f4645l.m2444b()).team == num.intValue()) {
                    arrayList3.add(c0739bo2);
                }
            }
            if (!arrayList3.isEmpty()) {
                this.f5565j.add(new C0791aa(new C0737bm(arrayList3).f4645l, "Team " + PlayerData.getTeamName(num.intValue()), PlayerData.m4370i(num.intValue())));
            }
        }
        for (EnumC0734bj enumC0734bj : EnumC0734bj.values()) {
            this.f5564i[enumC0734bj.ordinal()] = new C0792ab(enumC0734bj, this.f5563h);
            this.f5566k[enumC0734bj.ordinal()] = new C0792ab(enumC0734bj, this.f5565j);
        }
        this.f5567l = this.f5563h;
        this.f5568m = this.f5564i;
        m1739b();
    }

    /* renamed from: b */
    public void m1739b() {
        this.f5561f = EnumC0793ac.overallStats;
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f5581c = new Paint();
        this.f5581c.mo914a(true);
        this.f5581c.m5225a(Paint.Align.f195a);
        this.f5581c.m5229a(255, 0, 255, 0);
        gameEngine.m1017b(this.f5581c, 16.0f);
        this.f5582d = new Paint();
        this.f5582d.mo914a(true);
        this.f5582d.m5225a(Paint.Align.f197c);
        this.f5582d.m5229a(255, 0, 255, 0);
        gameEngine.m1017b(this.f5582d, 16.0f);
        m1738c();
    }

    /* renamed from: c */
    private void m1738c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f5572p = new C0970e[EnumC0793ac.values().length + 2];
        this.f5572p[0] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_button_info);
        this.f5572p[1] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_button_income);
        this.f5572p[2] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_button_armyvalue);
        this.f5572p[3] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_button_buildingvalue);
        this.f5572p[4] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_button_totalvalue);
        this.f5572p[5] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_toggle_relative);
        this.f5572p[6] = gameEngine.f6326bO.mo222a(C0067R.drawable.stats_toggle_teams);
        this.f5574r = new Rect(0, 0, this.f5572p[0].mo387m(), this.f5572p[0].mo388l());
    }

    /* renamed from: a */
    public void m1742a(Rect rect, Rect rect2, float f, boolean z, boolean z2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0825g c0825g = gameEngine.f6330bS;
        boolean z3 = true;
        if (z2) {
            int length = EnumC0793ac.values().length;
            int m1078a = gameEngine.m1078a(30);
            int i = m1078a * 2;
            int m1078a2 = gameEngine.m1078a(20);
            int i2 = (rect2.f233d - m1078a) - m1078a2;
            int i3 = c0825g.f5360c ? length + 2 : length - 1;
            int i4 = (int) ((gameEngine.f6366cF / 2.0f) - (((i * i3) + (m1078a2 * (i3 - 1))) / 2));
            Paint paint = new Paint();
            Paint paint2 = new Paint();
            paint2.m5229a(100, 255, 255, 255);
            for (int i5 = 0; i5 < length; i5++) {
                EnumC0793ac enumC0793ac = EnumC0793ac.values()[i5];
                if (c0825g.f5360c || enumC0793ac != EnumC0793ac.overallStats) {
                    if (c0825g.m1890a(i4, i2, i, m1078a, EnumC0827i.f5434a, false)) {
                        if (this.f5561f != enumC0793ac) {
                            this.f5561f = enumC0793ac;
                            this.f5570n = System.currentTimeMillis();
                            this.f5577u = -1;
                            this.f5578v = -1;
                            this.f5579w = -1;
                        }
                        if (this.f5561f != EnumC0793ac.overallStats) {
                            c0825g.f5360c = true;
                        }
                    }
                    this.f5580b.m5173a(i4, i2, i4 + i, i2 + m1078a);
                    gameEngine.f6326bO.mo194a(gameEngine.f6330bS.f5328bn, this.f5574r, this.f5580b, paint);
                    Paint paint3 = paint2;
                    if (!c0825g.f5360c || this.f5561f == enumC0793ac) {
                        paint3 = paint;
                    }
                    gameEngine.f6326bO.mo194a(this.f5572p[i5], this.f5574r, this.f5580b, paint3);
                    i4 += m1078a2 + i;
                }
            }
            int i6 = i4 + m1078a2;
            if (c0825g.f5360c) {
                boolean z4 = this.f5562g != EnumC0845z.absolute;
                if (c0825g.m1890a(i6, i2, i, m1078a, EnumC0827i.f5434a, false)) {
                    this.f5562g = !z4 ? EnumC0845z.relative : EnumC0845z.absolute;
                    this.f5570n = System.currentTimeMillis();
                }
                this.f5580b.m5173a(i6, i2, i6 + i, i2 + m1078a);
                Paint paint4 = paint;
                if (this.f5561f == EnumC0793ac.overallStats) {
                    paint4 = paint2;
                }
                gameEngine.f6326bO.mo194a(gameEngine.f6330bS.f5328bn, this.f5574r, this.f5580b, paint4);
                Paint paint5 = paint;
                if (!z4 || this.f5561f == EnumC0793ac.overallStats) {
                    paint5 = paint2;
                }
                gameEngine.f6326bO.mo194a(this.f5572p[5], this.f5574r, this.f5580b, paint5);
                int i7 = i6 + m1078a2 + i;
                boolean z5 = this.f5567l == this.f5565j;
                if (c0825g.m1890a(i7, i2, i, m1078a, EnumC0827i.f5434a, false)) {
                    if (!z5) {
                        this.f5567l = this.f5565j;
                        this.f5568m = this.f5566k;
                    } else {
                        this.f5567l = this.f5563h;
                        this.f5568m = this.f5564i;
                    }
                    this.f5570n = System.currentTimeMillis();
                }
                this.f5580b.m5173a(i7, i2, i7 + i, i2 + m1078a);
                Paint paint6 = paint;
                if (this.f5561f == EnumC0793ac.overallStats) {
                    paint6 = paint2;
                }
                gameEngine.f6326bO.mo194a(gameEngine.f6330bS.f5328bn, this.f5574r, this.f5580b, paint6);
                Paint paint7 = paint;
                if (!z5 || this.f5561f == EnumC0793ac.overallStats) {
                    paint7 = paint2;
                }
                gameEngine.f6326bO.mo194a(this.f5572p[6], this.f5574r, this.f5580b, paint7);
                int i8 = i7 + m1078a2 + i;
            }
            if (this.f5561f == EnumC0793ac.overallStats) {
                z3 = true;
            } else {
                z3 = false;
                rect.f233d = i2 - gameEngine.m1078a(10);
                if (z) {
                    m1741a(this.f5561f.m1988a(), this.f5562g, rect);
                }
            }
        }
        if (z3) {
            m1743a(rect, f);
        }
    }

    /* renamed from: a */
    private void m1743a(Rect rect, float f) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        float f2 = 1.5f;
        int m1078a = rect.f231b + gameEngine.m1078a(25);
        int m5166d = rect.m5166d();
        this.f5581c.m5215a("123|", 0, "123|".length(), this.f5580b);
        float m5167c = this.f5580b.m5167c() + 6;
        Iterator it = this.f5560e.iterator();
        while (it.hasNext()) {
            C0821e c0821e = (C0821e) it.next();
            if (c0821e.f5239d != 1.0f && f2 > 0.0f) {
                c0821e.f5239d = C0773f.m2217a(c0821e.f5239d, 1.0f, 0.01f * f2 * f);
                f2 -= 1.0f - c0821e.f5239d;
            }
            float m2171b = C0773f.m2171b(c0821e.f5239d, 0.0f, 1.0f);
            if (c0821e.f5237b != null) {
                str = c0821e.f5237b;
            } else {
                str = VariableScope.nullOrMissingString + ((int) (c0821e.f5238c * m2171b));
                if (m2171b <= 0.0f) {
                    str = " ";
                }
            }
            String str2 = c0821e.f5236a;
            float m2171b2 = C0773f.m2171b(c0821e.f5239d * 2.2f, 0.0f, 1.0f);
            int i = 0;
            if (m2171b2 > 0.0f) {
                i = (int) (str2.length() * m2171b2);
            }
            int m2166b = C0773f.m2166b(i, 0, str2.length());
            String str3 = VariableScope.nullOrMissingString;
            if (m2166b > 0 && m2166b < str2.length() - 1) {
                str3 = "_";
            }
            gameEngine.f6326bO.mo182a(str2.substring(0, m2166b) + str3 + C0773f.m2135d(" ", (str2.length() + str3.length()) - m2166b), m5166d - (8.0f * this.f5581c.m5187k()), m1078a, this.f5581c);
            gameEngine.f6326bO.mo182a(str, m5166d + (8.0f * this.f5581c.m5187k()), m1078a, this.f5582d);
            m1078a = (int) (m1078a + m5167c);
        }
    }

    /* renamed from: a */
    private void m1741a(EnumC0734bj enumC0734bj, EnumC0845z enumC0845z, Rect rect) {
        m1740a(GameEngine.getGameEngine().f6326bO, enumC0734bj, enumC0845z, rect);
    }

    /* JADX WARN: Removed duplicated region for block: B:60:0x03d7 A[LOOP:3: B:58:0x03cd->B:60:0x03d7, LOOP_END] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m1740a(InterfaceC1063y interfaceC1063y, EnumC0734bj enumC0734bj, EnumC0845z enumC0845z, Rect rect) {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList;
        int i5;
        int i6;
        int i7;
        int i8;
        EnumC0734bj enumC0734bj2;
        int i9;
        int i10;
        int i11;
        int i12;
        int i13;
        int i14;
        EnumC0734bj enumC0734bj3;
        int i15;
        EnumC0734bj enumC0734bj4;
        int i16;
        int i17;
        int i18;
        EnumC0734bj enumC0734bj5;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0825g c0825g = gameEngine.f6330bS;
        C0792ab c0792ab = this.f5568m[enumC0734bj.ordinal()];
        float currentTimeMillis = ((float) (System.currentTimeMillis() - this.f5570n)) / 250.0f;
        Paint paint = new Paint();
        paint.m5229a(255, 0, 255, 0);
        paint.mo914a(true);
        paint.m5200c(true);
        paint.mo916a(Typeface.m5138a(Typeface.f246c, 0));
        gameEngine.m1017b(paint, 14.0f);
        Paint paint2 = new Paint(paint);
        paint2.m5225a(Paint.Align.f196b);
        gameEngine.m1017b(paint2, 14.0f);
        Paint paint3 = new Paint();
        paint3.m5232a(2.0f);
        if (GameEngine.f6423aZ) {
            paint3.m5232a(3.0f);
        }
        paint3.m5224a(Paint.Cap.f201b);
        Rect rect2 = new Rect();
        Paint paint4 = c0825g.f5305aD;
        String m1714a = C0855a.m1714a("gui.leaderboard.type." + enumC0734bj.name(), new Object[0]);
        paint4.m5215a(m1714a, 0, m1714a.length(), this.f5580b);
        interfaceC1063y.mo182a(m1714a, rect.m5166d(), rect.f231b + this.f5580b.m5167c(), paint4);
        rect2.f231b = rect.f231b + this.f5580b.m5167c() + 3;
        rect2.f233d = (rect.f233d - this.f5580b.m5167c()) - 3;
        i = c0792ab.f5150b;
        i2 = c0792ab.f5151c;
        int max = Math.max(1, i - i2);
        float m5167c = rect2.m5167c() / max;
        String m2206a = C0773f.m2206a(0L);
        int mo158b = interfaceC1063y.mo158b(m2206a, paint2);
        interfaceC1063y.mo182a(m2206a, rect.f230a + (mo158b / 2), rect.f233d, paint2);
        rect2.f230a = rect.f230a + (mo158b / 2);
        paint.m5215a("123|", 0, "123|".length(), this.f5580b);
        int m5167c2 = this.f5580b.m5167c();
        if (enumC0845z != EnumC0845z.absolute) {
            rect2.f232c = rect.f232c - gameEngine.m1078a(10);
        } else {
            enumC0734bj3 = c0792ab.f5149a;
            EnumC0853f m2456a = enumC0734bj3.m2456a();
            i15 = c0792ab.f5150b;
            String m1734a = C0847a.m1734a(m2456a, i15);
            enumC0734bj4 = c0792ab.f5149a;
            EnumC0853f m2456a2 = enumC0734bj4.m2456a();
            i16 = c0792ab.f5151c;
            rect2.f232c = (rect.f232c - Math.max(interfaceC1063y.mo158b(m1734a, paint), interfaceC1063y.mo158b(C0847a.m1734a(m2456a2, i16), paint))) - 2;
            int i19 = m5167c2 / 2;
            interfaceC1063y.mo163b(rect2, c0825g.f5314aM);
            paint3.m5207b(-13619152);
            for (int i20 = 0; i20 <= 4; i20++) {
                i17 = c0792ab.f5151c;
                float f = i17 + ((max * i20) / 4.0f);
                i18 = c0792ab.f5151c;
                float f2 = rect2.f233d - ((f - i18) * m5167c);
                enumC0734bj5 = c0792ab.f5149a;
                interfaceC1063y.mo182a(C0847a.m1734a(enumC0734bj5.m2456a(), (int) f), rect2.f232c + 2, f2 + i19, paint);
                if (i20 > 0 && i20 < 4) {
                    interfaceC1063y.mo226a(rect2.f230a, f2, rect2.f232c, f2, paint3);
                }
            }
        }
        i3 = c0792ab.f5152d;
        String m2206a2 = C0773f.m2206a(i3 / 1000);
        interfaceC1063y.mo158b(m2206a2, paint2);
        interfaceC1063y.mo182a(m2206a2, rect2.f232c, rect.f233d, paint2);
        i4 = c0792ab.f5152d;
        float m5171b = rect2.m5171b() / i4;
        if (enumC0845z == EnumC0845z.absolute) {
            int i21 = 0;
            while (i21 <= 2) {
                Iterator it = this.f5567l.iterator();
                while (it.hasNext()) {
                    C0791aa c0791aa = (C0791aa) it.next();
                    C0733bi m2449a = c0791aa.f5144a.m2449a(enumC0734bj);
                    boolean z = i21 == 0;
                    if (!z) {
                        i10 = 220;
                        if (this.f5569a != null) {
                            if (c0791aa == this.f5569a) {
                                i10 = 255;
                            } else {
                                i10 = 50;
                            }
                        }
                    } else if (c0791aa.f5146c == -16777216) {
                        i10 = 255;
                        if (this.f5569a != null) {
                            if (c0791aa == this.f5569a) {
                                i10 = 255;
                            } else {
                                i10 = 50;
                            }
                        }
                    }
                    if (i21 == 2) {
                        if (c0791aa == this.f5569a) {
                            C0732bh c0732bh = (C0732bh) m2449a.get(0);
                            float f3 = rect2.f230a;
                            int i22 = c0732bh.f4624b;
                            i11 = c0792ab.f5151c;
                            float f4 = rect2.f233d - (m5167c * (i22 - i11));
                            for (i12 = 1; i12 < m2449a.size(); i12++) {
                                C0732bh c0732bh2 = (C0732bh) m2449a.get(i12);
                                float f5 = rect2.f230a + (m5171b * c0732bh2.f4623a);
                                int i23 = c0732bh2.f4624b;
                                i13 = c0792ab.f5151c;
                                float f6 = rect2.f233d - (m5167c * (i23 - i13));
                                i14 = c0792ab.f5152d;
                                C0966ag m1995a = c0791aa.m1995a((int) (i10 * Math.min(1.0f, Math.max(0.0f, currentTimeMillis - (c0732bh2.f4623a / i14)))), z);
                                interfaceC1063y.mo226a(f3, f4, f5, f4, m1995a);
                                interfaceC1063y.mo226a(f5, f4, f5, f6, m1995a);
                                f3 = f5;
                                f4 = f6;
                            }
                        }
                    } else {
                        if (i21 == 1 && c0791aa == this.f5569a) {
                        }
                        C0732bh c0732bh3 = (C0732bh) m2449a.get(0);
                        float f32 = rect2.f230a;
                        int i222 = c0732bh3.f4624b;
                        i11 = c0792ab.f5151c;
                        float f42 = rect2.f233d - (m5167c * (i222 - i11));
                        while (i12 < m2449a.size()) {
                        }
                    }
                }
                i21++;
            }
        } else {
            arrayList = c0792ab.f5153e;
            C0794ad c0794ad = (C0794ad) arrayList.get(0);
            for (int i24 = 1; i24 < arrayList.size(); i24++) {
                C0794ad c0794ad2 = (C0794ad) arrayList.get(i24);
                i5 = c0794ad.f5162a;
                float f7 = rect2.f230a + (m5171b * i5);
                i6 = c0794ad2.f5162a;
                float f8 = rect2.f230a + (m5171b * i6);
                float f9 = rect2.f233d;
                for (int i25 = 0; i25 < this.f5567l.size(); i25++) {
                    float m1987a = c0794ad.m1987a(i25);
                    float m5167c3 = f9 - (rect2.m5167c() * m1987a);
                    if (m1987a > 0.0f) {
                        i7 = c0794ad.f5162a;
                        i8 = c0792ab.f5152d;
                        C0966ag m1995a2 = ((C0791aa) this.f5567l.get(i25)).m1995a((int) (Math.min(1.0f, Math.max(0.0f, currentTimeMillis - (i7 / i8))) * 255.0f), false);
                        this.f5580b.m5173a((int) f7, (int) (m5167c3 + 0.5f), (int) f8, (int) (f9 + 0.5f));
                        if (this.f5571o != null) {
                            interfaceC1063y.mo194a(this.f5571o, this.f5573q, this.f5580b, m1995a2);
                        } else {
                            interfaceC1063y.mo163b(this.f5580b, m1995a2);
                        }
                    }
                    f9 = m5167c3;
                }
                c0794ad = c0794ad2;
            }
        }
        if (rect2.m5170b((int) c0825g.f5374x, (int) c0825g.f5375y)) {
            c0825g.m1898a(rect2.f230a, rect2.f231b, rect2.m5171b(), rect2.m5167c());
            paint3.m5207b(-1);
            interfaceC1063y.mo226a(c0825g.f5374x, rect2.f231b, c0825g.f5374x, rect2.f233d, paint3);
            int i26 = (int) c0825g.f5374x;
            int i27 = (int) c0825g.f5375y;
            int i28 = (int) ((c0825g.f5374x - rect2.f230a) / m5171b);
            if (this.f5578v != i26 || this.f5579w != i27) {
                this.f5578v = i26;
                this.f5579w = i27;
                this.f5577u = i28;
                this.f5575s.clear();
                this.f5576t.clear();
                this.f5575s.add(C0773f.m2206a(this.f5577u / 1000));
                this.f5576t.add(-1);
                C0791aa c0791aa2 = null;
                if (enumC0845z == EnumC0845z.absolute) {
                    float f10 = 30.0f;
                    Iterator it2 = this.f5567l.iterator();
                    while (it2.hasNext()) {
                        C0791aa c0791aa3 = (C0791aa) it2.next();
                        int m2448a = c0791aa3.f5144a.m2448a(enumC0734bj, this.f5577u);
                        i9 = c0792ab.f5151c;
                        float m2152c = C0773f.m2152c((rect2.f233d - (m5167c * (m2448a - i9))) - c0825g.f5375y);
                        if (m2152c < f10) {
                            f10 = m2152c;
                            c0791aa2 = c0791aa3;
                        }
                    }
                }
                this.f5569a = c0791aa2;
                Iterator it3 = this.f5567l.iterator();
                while (it3.hasNext()) {
                    C0791aa c0791aa4 = (C0791aa) it3.next();
                    int m2448a2 = c0791aa4.f5144a.m2448a(enumC0734bj, this.f5577u);
                    StringBuilder sb = new StringBuilder();
                    enumC0734bj2 = c0792ab.f5149a;
                    this.f5575s.add(sb.append(C0847a.m1734a(enumC0734bj2.m2456a(), m2448a2)).append(" ").append(c0791aa4.f5145b).toString());
                    int i29 = c0791aa4.f5146c;
                    if (this.f5569a != null && this.f5569a != c0791aa4) {
                        i29 = Color.m5244a(60, Color.m5242b(i29), Color.m5241c(i29), Color.m5240d(i29));
                    }
                    this.f5576t.add(Integer.valueOf(i29));
                }
            }
            this.f5580b.f230a = rect2.f230a + gameEngine.m1078a(5);
            this.f5580b.f231b = rect2.f231b + gameEngine.m1078a(5);
            this.f5580b.f233d = this.f5580b.f231b + gameEngine.m1078a(5) + (m5167c2 * this.f5575s.size());
            String str = VariableScope.nullOrMissingString;
            Iterator it4 = this.f5575s.iterator();
            while (it4.hasNext()) {
                String str2 = (String) it4.next();
                if (str.length() < str2.length()) {
                    str = str2;
                }
            }
            this.f5580b.f232c = this.f5580b.f230a + gameEngine.m1078a(10) + interfaceC1063y.mo158b(str, paint);
            interfaceC1063y.mo163b(this.f5580b, c0825g.f5313aL);
            int i30 = this.f5580b.f231b + m5167c2 + 3;
            for (int i31 = 0; i31 < this.f5575s.size(); i31++) {
                paint.m5207b(((Integer) this.f5576t.get(i31)).intValue());
                interfaceC1063y.mo182a((String) this.f5575s.get(i31), this.f5580b.f230a + 3, i30, paint);
                i30 += m5167c2;
            }
            return;
        }
        this.f5569a = null;
    }
}