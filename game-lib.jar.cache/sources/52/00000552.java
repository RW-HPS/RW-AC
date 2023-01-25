package com.corrodinggames.rts.gameFramework.p043k;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1117ak;
import com.corrodinggames.rts.gameFramework.utility.C1128g;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.k.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/i.class */
public final class C0940i {

    /* renamed from: q */
    private final C0943l f6171q;

    /* renamed from: a */
    EnumC0246ao f6172a;

    /* renamed from: b */
    public final int f6173b;

    /* renamed from: c */
    public final int f6174c;

    /* renamed from: d */
    public byte[] f6175d;

    /* renamed from: e */
    public byte[] f6176e;

    /* renamed from: f */
    public byte[] f6177f;

    /* renamed from: g */
    public short[] f6178g;

    /* renamed from: h */
    public HashMap f6179h;

    /* renamed from: i */
    public int f6180i;

    /* renamed from: j */
    public byte[] f6181j;

    /* renamed from: m */
    public boolean f6184m;

    /* renamed from: o */
    public boolean f6186o;

    /* renamed from: p */
    public int f6187p;

    /* renamed from: k */
    public int f6182k = -99;

    /* renamed from: l */
    public int f6183l = 0;

    /* renamed from: n */
    Point f6185n = new Point();

    C0940i(C0943l c0943l, EnumC0246ao enumC0246ao, int i, int i2) {
        this.f6173b = i;
        this.f6174c = i2;
        this.f6171q = c0943l;
        this.f6172a = enumC0246ao;
        this.f6175d = new byte[i * i2];
        this.f6171q.f6234u.add(this);
        this.f6171q.f6235v = (C0940i[]) this.f6171q.f6234u.toArray(new C0940i[0]);
        m1212a();
    }

    /* renamed from: a */
    void m1212a() {
        m1201d();
        m1202c(null);
        m1200e();
    }

    /* renamed from: a */
    void m1208a(AbstractC0629y abstractC0629y) {
        double m2438a;
        if (abstractC0629y != null) {
            this.f6183l++;
            if (this.f6183l > 50) {
                if (!this.f6184m) {
                    GameEngine.m5777e("buildAndReplaceClearanceCost being skipped");
                }
                this.f6184m = true;
                return;
            }
        }
        if (abstractC0629y != null) {
            m1204b(abstractC0629y);
            return;
        }
        long j = 0;
        if (abstractC0629y == null) {
            j = C0742br.m2440a();
        }
        C0173b c0173b = this.f6171q.f6230q;
        byte[] bArr = this.f6181j;
        if (this.f6181j == null) {
            abstractC0629y = null;
        }
        this.f6181j = new byte[this.f6173b * this.f6174c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f6171q.f6232s;
        short s4 = this.f6171q.f6233t;
        if (abstractC0629y != null) {
            if (bArr != null) {
                C0773f.m2178a(bArr, this.f6181j);
            }
            c0173b.m4662a(abstractC0629y.f7173eo, abstractC0629y.f7174ep);
            Rect cc = abstractC0629y.mo3397cc();
            short s5 = (short) c0173b.f829T;
            short s6 = (short) c0173b.f830U;
            s = (short) ((s5 - 5) + cc.f230a);
            s2 = (short) ((s6 - 5) + cc.f231b);
            s3 = (short) (s5 + 5 + cc.f232c);
            s4 = (short) (s6 + 5 + cc.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f6171q.f6232s) {
            s3 = this.f6171q.f6232s;
        }
        if (s4 > this.f6171q.f6233t) {
            s4 = this.f6171q.f6233t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    boolean z = false;
                    if (this.f6175d[(s8 * this.f6174c) + s10] == -1) {
                        z = true;
                    }
                    if (this.f6176e[(s8 * this.f6174c) + s10] == -1) {
                        z = true;
                    }
                    if (z) {
                        this.f6181j[(s8 * this.f6174c) + s10] = 0;
                    } else {
                        this.f6181j[(s8 * this.f6174c) + s10] = 4;
                    }
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        short s11 = s;
        while (true) {
            short s12 = s11;
            if (s12 >= s3) {
                break;
            }
            short s13 = s2;
            while (true) {
                short s14 = s13;
                if (s14 < s4) {
                    if (this.f6181j[(s12 * this.f6174c) + s14] == 0) {
                        m1209a(c0173b, s12, s14, this.f6181j);
                    }
                    s13 = (short) (s14 + 1);
                }
            }
            s11 = (short) (s12 + 1);
        }
        short s15 = s;
        while (true) {
            short s16 = s15;
            if (s16 >= s3) {
                break;
            }
            m1209a(c0173b, s16, (short) -1, this.f6181j);
            m1209a(c0173b, s16, (short) (this.f6171q.f6233t + 1), this.f6181j);
            s15 = (short) (s16 + 1);
        }
        short s17 = s2;
        while (true) {
            short s18 = s17;
            if (s18 >= s4) {
                break;
            }
            m1209a(c0173b, (short) -1, s18, this.f6181j);
            m1209a(c0173b, (short) (this.f6171q.f6232s + 1), s18, this.f6181j);
            s17 = (short) (s18 + 1);
        }
        if (abstractC0629y == null) {
            if (C0742br.m2438a(j) > 30.0d) {
                GameEngine.m5777e("buildAndReplaceClearanceCostNew took:" + C0742br.m2439a(m2438a) + " for:" + this.f6172a);
            }
        }
    }

    /* renamed from: a */
    final void m1209a(C0173b c0173b, short s, short s2, byte[] bArr) {
        int m2207a;
        int i = s - 3;
        int i2 = s2 - 3;
        int i3 = s + 3;
        int i4 = s2 + 3;
        if (i < 0) {
            i = 0;
        }
        if (i2 < 0) {
            i2 = 0;
        }
        if (i3 > c0173b.f812C - 1) {
            i3 = c0173b.f812C - 1;
        }
        if (i4 > c0173b.f813D - 1) {
            i4 = c0173b.f813D - 1;
        }
        for (int i5 = i; i5 <= i3; i5++) {
            for (int i6 = i2; i6 <= i4; i6++) {
                byte b = bArr[(i5 * this.f6174c) + i6];
                if (b != 0 && (m2207a = C0773f.m2207a((int) s, (int) s2, i5, i6)) < b) {
                    bArr[(i5 * this.f6174c) + i6] = (byte) m2207a;
                }
            }
        }
    }

    /* renamed from: b */
    void m1204b(AbstractC0629y abstractC0629y) {
        long j = 0;
        if (abstractC0629y == null) {
            j = C0742br.m2440a();
        }
        C0173b c0173b = this.f6171q.f6230q;
        byte[] bArr = this.f6181j;
        if (this.f6181j == null) {
            abstractC0629y = null;
        }
        this.f6181j = new byte[this.f6173b * this.f6174c];
        short s = 0;
        short s2 = 0;
        short s3 = this.f6171q.f6232s;
        short s4 = this.f6171q.f6233t;
        if (abstractC0629y != null) {
            if (bArr != null) {
                C0773f.m2178a(bArr, this.f6181j);
            }
            c0173b.m4662a(abstractC0629y.f7173eo, abstractC0629y.f7174ep);
            Rect cc = abstractC0629y.mo3397cc();
            short s5 = (short) c0173b.f829T;
            short s6 = (short) c0173b.f830U;
            s = (short) ((s5 - 5) + cc.f230a);
            s2 = (short) ((s6 - 5) + cc.f231b);
            s3 = (short) (s5 + 5 + cc.f232c);
            s4 = (short) (s6 + 5 + cc.f233d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.f6171q.f6232s) {
            s3 = this.f6171q.f6232s;
        }
        if (s4 > this.f6171q.f6233t) {
            s4 = this.f6171q.f6233t;
        }
        short s7 = s;
        while (true) {
            short s8 = s7;
            if (s8 >= s3) {
                break;
            }
            short s9 = s2;
            while (true) {
                short s10 = s9;
                if (s10 < s4) {
                    this.f6181j[(s8 * this.f6174c) + s10] = m1210a(c0173b, s8, s10);
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        if (abstractC0629y == null) {
            GameEngine.m5777e("buildAndReplaceClearanceCost took:" + C0742br.m2439a(C0742br.m2438a(j)) + " for:" + this.f6172a);
        }
    }

    /* renamed from: a */
    final byte m1210a(C0173b c0173b, short s, short s2) {
        int m2207a;
        if (this.f6175d[(s * this.f6174c) + s2] == -1) {
            return (byte) 0;
        }
        int i = s2 - 3;
        int i2 = s + 3;
        int i3 = s2 + 3;
        int i4 = 4;
        for (int i5 = s - 3; i5 <= i2; i5++) {
            for (int i6 = i; i6 <= i3; i6++) {
                boolean z = false;
                if (c0173b.m4618c(i5, i6)) {
                    if (this.f6175d[(i5 * this.f6174c) + i6] == -1) {
                        z = true;
                    }
                    if (this.f6176e[(i5 * this.f6174c) + i6] == -1) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (z && (m2207a = C0773f.m2207a((int) s, (int) s2, i5, i6)) < i4) {
                    i4 = m2207a;
                }
            }
        }
        return (byte) i4;
    }

    /* renamed from: b */
    void m1205b() {
        int i = this.f6173b;
        int i2 = this.f6174c;
        this.f6178g = new short[i * i2];
        this.f6179h = new HashMap();
        short s = 1;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 < i) {
                short s4 = 0;
                while (true) {
                    short s5 = s4;
                    if (s5 < i2) {
                        if (this.f6178g[(s3 * i2) + s5] == 0) {
                            if (s <= 0) {
                                Log.m5063d("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                                return;
                            }
                            int m1207a = m1207a(s3, s5, s);
                            if (m1207a > 0) {
                                this.f6179h.put(Short.valueOf(s), Integer.valueOf(m1207a));
                                if (this.f6180i < m1207a) {
                                    this.f6180i = m1207a;
                                }
                                s = (short) (s + 1);
                            }
                        }
                        s4 = (short) (s5 + 1);
                    }
                }
            } else {
                return;
            }
            s2 = (short) (s3 + 1);
        }
    }

    /* renamed from: a */
    int m1207a(short s, short s2, short s3) {
        int i = this.f6174c;
        C0173b c0173b = this.f6171q.f6230q;
        short[] sArr = this.f6178g;
        byte[] bArr = this.f6175d;
        if (bArr[(s * i) + s2] == -1) {
            sArr[(s * i) + s2] = -1;
            return 0;
        } else if (s3 == 0) {
            throw new RuntimeException("id cannot be 0 is will cause can endless loop");
        } else {
            int i2 = 0;
            C1128g c1128g = new C1128g();
            c1128g.add(new C1117ak(s, s2));
            while (!c1128g.isEmpty()) {
                C1117ak c1117ak = (C1117ak) c1128g.m562a();
                short s4 = c1117ak.f7068a;
                short s5 = c1117ak.f7069b;
                if (c0173b.m4618c((int) s4, (int) s5)) {
                    int i3 = (s4 * i) + s5;
                    if (sArr[i3] == 0 && bArr[i3] != -1) {
                        sArr[i3] = s3;
                        i2++;
                        c1128g.add(new C1117ak((short) (s4 - 1), s5));
                        c1128g.add(new C1117ak((short) (s4 + 1), s5));
                        c1128g.add(new C1117ak(s4, (short) (s5 - 1)));
                        c1128g.add(new C1117ak(s4, (short) (s5 + 1)));
                    }
                }
            }
            return i2;
        }
    }

    /* renamed from: c */
    boolean m1203c() {
        return (this.f6172a.equals(EnumC0246ao.AIR) || this.f6172a.equals(EnumC0246ao.NONE)) ? false : true;
    }

    /* renamed from: a */
    public static int m1211a(C0173b c0173b) {
        C0178e c0178e = c0173b.f803u;
        int i = 0;
        for (int i2 = 0; i2 < c0178e.f905n; i2++) {
            for (int i3 = 0; i3 < c0178e.f906o; i3++) {
                C0180g m4570a = c0178e.m4570a(i2, i3);
                if (m4570a != null) {
                    i += (0 + (m4570a.f919e ? 1 : 0) + (m4570a.f922h ? 2 : 0) + (m4570a.f925k ? 4 : 0) + (m4570a.f921g ? 8 : 0) + (m4570a.f920f ? 16 : 0)) * (i2 + i3);
                }
            }
        }
        return i;
    }

    /* renamed from: d */
    void m1201d() {
        C0173b c0173b = this.f6171q.f6230q;
        byte[] bArr = this.f6175d;
        short[] m4571a = c0173b.f803u.m4571a();
        C0180g[] c0180gArr = c0173b.f811B;
        EnumC0246ao enumC0246ao = this.f6172a;
        int i = this.f6173b;
        int i2 = this.f6174c;
        if (!m1203c()) {
            return;
        }
        boolean z = enumC0246ao.equals(EnumC0246ao.WATER) || enumC0246ao.equals(EnumC0246ao.HOVER) || enumC0246ao.equals(EnumC0246ao.OVER_CLIFF_WATER);
        boolean z2 = enumC0246ao.equals(EnumC0246ao.HOVER) || enumC0246ao.equals(EnumC0246ao.OVER_CLIFF) || enumC0246ao.equals(EnumC0246ao.OVER_CLIFF_WATER);
        boolean z3 = enumC0246ao.equals(EnumC0246ao.OVER_CLIFF) || enumC0246ao.equals(EnumC0246ao.OVER_CLIFF_WATER);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                bArr[i5] = 0;
                C0180g c0180g = c0180gArr[m4571a[i5]];
                if (c0180g != null) {
                    if (c0180g.f919e && !z) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f922h && !z2) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f925k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (c0180g.f921g && 0 == 0) {
                        bArr[i5] = -1;
                    }
                    if (enumC0246ao == EnumC0246ao.WATER && !c0180g.f919e && !c0180g.f920f) {
                        bArr[i5] = -1;
                    }
                }
                C0180g m4608e = c0173b.m4608e(i3, i4);
                if (m4608e != null) {
                    if (enumC0246ao == EnumC0246ao.LAND && m4608e.f923i) {
                        bArr[i5] = -1;
                    }
                    if (m4608e.f925k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (bArr[i5] == 0) {
                        bArr[i5] = m4608e.f924j;
                    }
                }
                if (c0180g != null && bArr[i5] == 0) {
                    bArr[i5] = c0180g.f924j;
                }
            }
        }
        if (c0173b.f806x != null) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 < i2; i7++) {
                    C0180g m4570a = c0173b.f806x.m4570a(i6, i7);
                    if (m4570a != null) {
                        bArr[(i6 * i2) + i7] = 0;
                        if (m4570a.f919e && !z) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m4570a.f922h && !z2) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m4570a.f925k && !z3) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (m4570a.f921g && 0 == 0) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (bArr[(i6 * i2) + i7] == 0) {
                            bArr[(i6 * i2) + i7] = m4570a.f924j;
                        }
                        if (enumC0246ao == EnumC0246ao.WATER && !m4570a.f919e && !m4570a.f920f) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: c */
    public void m1202c(AbstractC0629y abstractC0629y) {
        Rect mo3397cc;
        if (abstractC0629y != null) {
            this.f6187p++;
            if (this.f6187p > 50) {
                this.f6186o = true;
                return;
            }
        }
        GameEngine.m1087V();
        this.f6176e = new byte[this.f6173b * this.f6174c];
        byte[] bArr = this.f6176e;
        if (this.f6172a.equals(EnumC0246ao.AIR)) {
            return;
        }
        C0173b c0173b = this.f6171q.f6230q;
        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i = 0; i < size; i++) {
            AbstractC0244am abstractC0244am = m499a[i];
            if (abstractC0244am.mo3398bI() && !abstractC0244am.f1612bV) {
                Point m4248a = abstractC0244am.m4248a(c0173b, this.f6185n);
                int i2 = m4248a.f224a;
                int i3 = m4248a.f225b;
                if (this.f6172a.equals(EnumC0246ao.BUILDING)) {
                    mo3397cc = abstractC0244am.mo3396cd();
                } else {
                    mo3397cc = abstractC0244am.mo3397cc();
                }
                for (int i4 = i2 + mo3397cc.f230a; i4 <= i2 + mo3397cc.f232c; i4++) {
                    for (int i5 = i3 + mo3397cc.f231b; i5 <= i3 + mo3397cc.f233d; i5++) {
                        if (c0173b.m4618c(i4, i5)) {
                            bArr[(i4 * this.f6174c) + i5] = -1;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: e */
    public void m1200e() {
        byte[] bArr;
        GameEngine.m1087V();
        int i = this.f6174c;
        this.f6177f = new byte[this.f6173b * i];
        if (this.f6172a.equals(EnumC0246ao.AIR)) {
            return;
        }
        C0173b c0173b = this.f6171q.f6230q;
        int i2 = c0173b.f798p;
        int i3 = c0173b.f799q;
        AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
        int size = AbstractC0244am.f1594bE.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0244am abstractC0244am = m499a[i4];
            if (abstractC0244am.f1610bT && !abstractC0244am.mo3398bI() && !abstractC0244am.f1653cK && !(abstractC0244am instanceof C0243al) && !abstractC0244am.f1612bV && !abstractC0244am.mo3068i() && abstractC0244am.f1656cN == null && !abstractC0244am.mo3074Q()) {
                int i5 = 2;
                c0173b.m4662a(abstractC0244am.f7173eo, abstractC0244am.f7174ep);
                int i6 = c0173b.f829T;
                int i7 = c0173b.f830U;
                float f = abstractC0244am.f1626cj + 5.0f;
                float f2 = abstractC0244am.f1626cj + 10.0f;
                if (f2 < 10.0f) {
                    i5 = 0;
                } else if (f2 < 20.0f) {
                    i5 = 1;
                }
                for (int i8 = i6 - i5; i8 <= i6 + i5; i8++) {
                    for (int i9 = i7 - i5; i9 <= i7 + i5; i9++) {
                        if (c0173b.m4618c(i8, i9)) {
                            c0173b.m4658a(i8, i9);
                            float m2216a = C0773f.m2216a(c0173b.f829T + i2, c0173b.f830U + i3, abstractC0244am.f7173eo, abstractC0244am.f7174ep);
                            int i10 = (i8 * i) + i9;
                            if (m2216a < f * f) {
                                byte[] bArr2 = this.f6177f;
                                bArr2[i10] = (byte) (bArr2[i10] + 6);
                            } else if (m2216a < f2 * f2) {
                                this.f6177f[i10] = (byte) (bArr[i10] + (6 * 0.333d));
                            }
                            if (this.f6177f[i10] < -1) {
                                this.f6177f[i10] = Byte.MAX_VALUE;
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m1206a(boolean z) {
        if (!z) {
            return;
        }
        if (this.f6184m) {
            this.f6183l = 0;
            this.f6184m = false;
            m1202c(null);
            if (this.f6181j != null) {
                m1208a((AbstractC0629y) null);
            }
        }
        this.f6183l = 0;
    }
}