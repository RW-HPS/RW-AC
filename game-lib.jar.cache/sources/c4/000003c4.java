package com.corrodinggames.rts.game.units.p027f;

import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1147u;

/* renamed from: com.corrodinggames.rts.game.units.f.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f/c.class */
public final class C0543c {

    /* renamed from: a */
    int f3743a;

    /* renamed from: b */
    int f3744b;

    /* renamed from: c */
    float f3745c;

    /* renamed from: d */
    float f3746d;

    /* renamed from: e */
    public C0541a[][] f3747e = null;

    /* renamed from: f */
    C0544d f3748f = new C0544d();

    /* renamed from: g */
    C0547g f3749g = new C0547g();

    /* renamed from: h */
    C0548h f3750h = new C0548h();

    /* renamed from: i */
    final C1147u f3751i = new C1147u();

    /* renamed from: j */
    final C0546f f3752j = new C0546f();

    /* renamed from: k */
    final Rect f3753k = new Rect();

    /* renamed from: l */
    final int f3754l = 32;

    /* renamed from: m */
    int f3755m;

    /* renamed from: a */
    public void m3209a(float f, float f2, float f3, AbstractC0629y abstractC0629y, float f4, AbstractC0549i abstractC0549i) {
        this.f3749g.m3196a(f - f3, f2 - f3, f + f3, f2 + f3);
        m3207a(this.f3749g.f3766a, this.f3749g, abstractC0629y, f4, abstractC0549i);
    }

    /* renamed from: a */
    public final C0546f m3210a(float f, float f2, float f3) {
        C1147u c1147u = this.f3751i;
        c1147u.clear();
        m3208a(f, f2, f3, c1147u);
        this.f3752j.m3197a(c1147u);
        return this.f3752j;
    }

    /* renamed from: a */
    public final void m3208a(float f, float f2, float f3, C1147u c1147u) {
        C0541a[][] c0541aArr = this.f3747e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3211a = m3211a(f4);
        int m3211a2 = m3211a(f5);
        int m3202b = m3202b(f6);
        int m3202b2 = m3202b(f7);
        for (int i = m3211a; i <= m3211a2; i++) {
            for (int i2 = m3202b; i2 <= m3202b2; i2++) {
                C0542b c0542b = c0541aArr[i][i2].f3735a;
                AbstractC0244am[] m3215a = c0542b.m3215a();
                int i3 = c0542b.f3741b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0244am abstractC0244am = m3215a[i4];
                    float f8 = abstractC0244am.f7172eo;
                    float f9 = abstractC0244am.f7173ep;
                    if (f4 <= f8 && f8 <= f5 && f6 <= f9 && f9 <= f7) {
                        c1147u.add(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final C0546f m3201b(float f, float f2, float f3) {
        C1147u c1147u = this.f3751i;
        c1147u.clear();
        m3200b(f, f2, f3, c1147u);
        this.f3752j.m3197a(c1147u);
        return this.f3752j;
    }

    /* renamed from: b */
    public final void m3200b(float f, float f2, float f3, C1147u c1147u) {
        C0541a[][] c0541aArr = this.f3747e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3211a = m3211a(f4 - 50.0f);
        int m3211a2 = m3211a(f5 + 50.0f);
        int m3202b = m3202b(f6 - 50.0f);
        int m3202b2 = m3202b(f7 + 50.0f);
        for (int i = m3211a; i <= m3211a2; i++) {
            for (int i2 = m3202b; i2 <= m3202b2; i2++) {
                C0542b c0542b = c0541aArr[i][i2].f3735a;
                AbstractC0244am[] m3215a = c0542b.m3215a();
                int i3 = c0542b.f3741b;
                for (int i4 = 0; i4 < i3; i4++) {
                    AbstractC0244am abstractC0244am = m3215a[i4];
                    float f8 = abstractC0244am.f7172eo;
                    float f9 = abstractC0244am.f7173ep;
                    float f10 = abstractC0244am.f1626cj;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1147u.m491b(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void m3205a(PlayerData playerData, float f, float f2, float f3, C1147u c1147u) {
        C0541a[][] c0541aArr = this.f3747e;
        float f4 = f - f3;
        float f5 = f + f3;
        float f6 = f2 - f3;
        float f7 = f2 + f3;
        int m3211a = m3211a(f4 - 50.0f);
        int m3211a2 = m3211a(f5 + 50.0f);
        int m3202b = m3202b(f6 - 50.0f);
        int m3202b2 = m3202b(f7 + 50.0f);
        int i = playerData.site;
        for (int i2 = m3211a; i2 <= m3211a2; i2++) {
            for (int i3 = m3202b; i3 <= m3202b2; i3++) {
                C0542b c0542b = c0541aArr[i2][i3].f3736b[i];
                AbstractC0244am[] m3215a = c0542b.m3215a();
                int i4 = c0542b.f3741b;
                for (int i5 = 0; i5 < i4; i5++) {
                    AbstractC0244am abstractC0244am = m3215a[i5];
                    float f8 = abstractC0244am.f7172eo;
                    float f9 = abstractC0244am.f7173ep;
                    float f10 = abstractC0244am.f1626cj;
                    if (f4 - f10 <= f8 && f8 <= f5 + f10 && f6 - f10 <= f9 && f9 <= f7 + f10) {
                        c1147u.m491b(abstractC0244am);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3207a(RectF rectF, AbstractC0545e abstractC0545e, AbstractC0629y abstractC0629y, float f, AbstractC0549i abstractC0549i) {
        C0541a[][] c0541aArr = this.f3747e;
        int m3211a = m3211a(rectF.f234a);
        int m3211a2 = m3211a(rectF.f236c);
        int m3202b = m3202b(rectF.f235b);
        int m3202b2 = m3202b(rectF.f237d);
        PlayerData playerData = null;
        int excludeTeam = abstractC0549i.excludeTeam(abstractC0629y);
        if (excludeTeam != -2 && excludeTeam != -3) {
            playerData = PlayerData.getPlayerData(excludeTeam);
        }
        PlayerData onlyEnemiesOfTeam = abstractC0549i.onlyEnemiesOfTeam(abstractC0629y);
        PlayerData onlyTeam = abstractC0549i.onlyTeam(abstractC0629y);
        abstractC0549i.setup(abstractC0629y, f);
        if (onlyEnemiesOfTeam == null && onlyTeam == null) {
            for (int i = m3211a; i <= m3211a2; i++) {
                for (int i2 = m3202b; i2 <= m3202b2; i2++) {
                    C0542b c0542b = c0541aArr[i][i2].f3735a;
                    AbstractC0244am[] m3215a = c0542b.m3215a();
                    int i3 = c0542b.f3741b;
                    for (int i4 = 0; i4 < i3; i4++) {
                        AbstractC0244am abstractC0244am = m3215a[i4];
                        if ((playerData == null || abstractC0244am.f1614bX != playerData) && abstractC0545e.mo3195a(abstractC0244am)) {
                            abstractC0549i.callback(abstractC0629y, f, abstractC0244am);
                        }
                    }
                }
            }
        } else if (onlyTeam != null) {
            int i5 = onlyTeam.site;
            if (i5 == -1) {
                for (int i6 = m3211a; i6 <= m3211a2; i6++) {
                    for (int i7 = m3202b; i7 <= m3202b2; i7++) {
                        C0542b c0542b2 = c0541aArr[i6][i7].f3738d;
                        if (c0542b2.f3741b > 0) {
                            AbstractC0244am[] m3215a2 = c0542b2.m3215a();
                            int i8 = c0542b2.f3741b;
                            for (int i9 = 0; i9 < i8; i9++) {
                                AbstractC0244am abstractC0244am2 = m3215a2[i9];
                                if (abstractC0545e.mo3195a(abstractC0244am2)) {
                                    abstractC0549i.callback(abstractC0629y, f, abstractC0244am2);
                                }
                            }
                        }
                    }
                }
            } else if (i5 == -2) {
                for (int i10 = m3211a; i10 <= m3211a2; i10++) {
                    for (int i11 = m3202b; i11 <= m3202b2; i11++) {
                        C0542b c0542b3 = c0541aArr[i10][i11].f3737c;
                        if (c0542b3.f3741b > 0) {
                            AbstractC0244am[] m3215a3 = c0542b3.m3215a();
                            int i12 = c0542b3.f3741b;
                            for (int i13 = 0; i13 < i12; i13++) {
                                AbstractC0244am abstractC0244am3 = m3215a3[i13];
                                if (abstractC0545e.mo3195a(abstractC0244am3)) {
                                    abstractC0549i.callback(abstractC0629y, f, abstractC0244am3);
                                }
                            }
                        }
                    }
                }
            } else {
                for (int i14 = m3211a; i14 <= m3211a2; i14++) {
                    for (int i15 = m3202b; i15 <= m3202b2; i15++) {
                        C0542b c0542b4 = c0541aArr[i14][i15].f3736b[i5];
                        if (c0542b4.f3741b > 0) {
                            AbstractC0244am[] m3215a4 = c0542b4.m3215a();
                            int i16 = c0542b4.f3741b;
                            for (int i17 = 0; i17 < i16; i17++) {
                                AbstractC0244am abstractC0244am4 = m3215a4[i17];
                                if (abstractC0545e.mo3195a(abstractC0244am4)) {
                                    abstractC0549i.callback(abstractC0629y, f, abstractC0244am4);
                                }
                            }
                        }
                    }
                }
            }
        } else {
            if (onlyEnemiesOfTeam != PlayerData.f1372h) {
                for (int i18 = m3211a; i18 <= m3211a2; i18++) {
                    for (int i19 = m3202b; i19 <= m3202b2; i19++) {
                        C0542b c0542b5 = c0541aArr[i18][i19].f3737c;
                        if (c0542b5.f3741b > 0) {
                            AbstractC0244am[] m3215a5 = c0542b5.m3215a();
                            int i20 = c0542b5.f3741b;
                            for (int i21 = 0; i21 < i20; i21++) {
                                AbstractC0244am abstractC0244am5 = m3215a5[i21];
                                if (abstractC0545e.mo3195a(abstractC0244am5)) {
                                    abstractC0549i.callback(abstractC0629y, f, abstractC0244am5);
                                }
                            }
                        }
                    }
                }
            }
            int i22 = this.f3755m;
            for (int i23 = 0; i23 <= i22; i23++) {
                PlayerData playerData2 = PlayerData.getPlayerData(i23);
                if (playerData2 != null && onlyEnemiesOfTeam != playerData2 && onlyEnemiesOfTeam.m4402c(playerData2)) {
                    for (int i24 = m3211a; i24 <= m3211a2; i24++) {
                        for (int i25 = m3202b; i25 <= m3202b2; i25++) {
                            C0542b c0542b6 = c0541aArr[i24][i25].f3736b[i23];
                            int i26 = c0542b6.f3741b;
                            if (i26 > 0) {
                                AbstractC0244am[] m3215a6 = c0542b6.m3215a();
                                for (int i27 = 0; i27 < i26; i27++) {
                                    AbstractC0244am abstractC0244am6 = m3215a6[i27];
                                    if (abstractC0545e.mo3195a(abstractC0244am6)) {
                                        abstractC0549i.callback(abstractC0629y, f, abstractC0244am6);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m3211a(float f) {
        int i = (int) (f * this.f3745c);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: b */
    public final int m3202b(float f) {
        int i = (int) (f * this.f3746d);
        if (i < 0) {
            i = 0;
        }
        if (i >= 32) {
            i = 31;
        }
        return i;
    }

    /* renamed from: a */
    public void m3212a() {
        float f = this.f3745c;
        float f2 = this.f3746d;
        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am.f1612bV || ((int) (abstractC0244am.f7172eo * f)) != abstractC0244am.f1680dl || ((int) (abstractC0244am.f7173ep * f2)) != abstractC0244am.f1681dm || abstractC0244am.f1614bX == null || abstractC0244am.f1682dn != abstractC0244am.f1614bX.site) {
                m3204a(abstractC0244am);
            }
        }
    }

    /* renamed from: a */
    public void m3204a(AbstractC0244am abstractC0244am) {
        if (this.f3747e == null) {
            if (GameEngine.getGameEngine().tick != 0) {
                GameEngine.print("updateUnitGeoIndex: areaList not active");
            }
            abstractC0244am.f1680dl = -1;
            abstractC0244am.f1681dm = -1;
        } else if (abstractC0244am.f1612bV) {
            if (abstractC0244am.f1680dl != -1 && abstractC0244am.f1681dm != -1) {
                this.f3747e[abstractC0244am.f1680dl][abstractC0244am.f1681dm].m3216b(abstractC0244am);
                abstractC0244am.f1680dl = -1;
                abstractC0244am.f1681dm = -1;
            }
        } else {
            int m3211a = m3211a(abstractC0244am.f7172eo);
            int m3202b = m3202b(abstractC0244am.f7173ep);
            int i = -2;
            if (abstractC0244am.f1614bX != null) {
                i = abstractC0244am.f1614bX.site;
            }
            if (abstractC0244am.f1680dl == m3211a && abstractC0244am.f1681dm == m3202b && abstractC0244am.f1682dn == i) {
                return;
            }
            if (abstractC0244am.f1680dl != -1 && abstractC0244am.f1681dm != -1) {
                this.f3747e[abstractC0244am.f1680dl][abstractC0244am.f1681dm].m3216b(abstractC0244am);
            }
            abstractC0244am.f1680dl = m3211a;
            abstractC0244am.f1681dm = m3202b;
            abstractC0244am.f1682dn = i;
            if (i > this.f3755m && this.f3755m < PlayerData.f1367c) {
                this.f3755m = i;
            }
            this.f3747e[abstractC0244am.f1680dl][abstractC0244am.f1681dm].m3217a(abstractC0244am);
        }
    }

    /* renamed from: a */
    public void m3206a(C0173b c0173b) {
        this.f3747e = new C0541a[32][32];
        this.f3755m = 0;
        for (int i = 0; i < 32; i++) {
            for (int i2 = 0; i2 < 32; i2++) {
                this.f3747e[i][i2] = new C0541a();
            }
        }
        this.f3743a = (c0173b.f793C * c0173b.f786n) / 32;
        this.f3744b = (c0173b.f794D * c0173b.f787o) / 32;
        this.f3745c = 1.0f / this.f3743a;
        this.f3746d = 1.0f / this.f3744b;
    }

    /* renamed from: b */
    public void m3203b() {
        this.f3747e = null;
    }

    /* renamed from: c */
    public void m3199c(float f) {
    }
}