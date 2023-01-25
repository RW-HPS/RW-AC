package com.corrodinggames.rts.game.units.custom.p020d;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.custom.p021e.C0443e;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p037f.C0795ae;
import com.corrodinggames.rts.gameFramework.p037f.C0810an;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class C0429b extends AbstractC0428a implements Comparable {

    /* renamed from: b */
    public int f2723b;

    /* renamed from: c */
    public float f2724c;

    /* renamed from: d */
    public float f2725d;

    /* renamed from: e */
    public float f2726e;

    /* renamed from: f */
    public int f2727f;

    /* renamed from: g */
    public int f2728g;

    /* renamed from: h */
    public int f2729h;

    /* renamed from: i */
    public int f2730i;

    /* renamed from: j */
    public int f2731j;

    /* renamed from: k */
    public C0444f f2732k = f2733m;

    /* renamed from: m */
    private static final C0444f f2733m = new C0444f().m3752a();

    /* renamed from: a */
    public static final C0429b f2734a = m3851a(0);

    /* renamed from: l */
    static final int f2735l = Color.m5243a(255, 0, 100, 0);

    /* renamed from: a */
    public int m3852a() {
        return this.f2723b;
    }

    /* renamed from: b */
    public int m3832b() {
        if (this.f2732k == f2733m) {
            return this.f2723b;
        }
        int i = this.f2723b;
        int i2 = this.f2732k.f2830b.f7109a;
        Object[] m535a = this.f2732k.f2830b.m535a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0443e c0443e = (C0443e) m535a[i3];
            if (c0443e.f2828b > 0.0d) {
                float m3776b = c0443e.f2827a.m3776b();
                if (m3776b != 0.0f) {
                    i += (int) (m3776b * c0443e.f2828b);
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public static C0429b m3842a(C0429b c0429b, C0429b c0429b2) {
        C0429b c0429b3 = new C0429b();
        c0429b3.f2723b = c0429b.f2723b + c0429b2.f2723b;
        c0429b3.f2724c = c0429b.f2724c + c0429b2.f2724c;
        c0429b3.f2725d = c0429b.f2725d + c0429b2.f2725d;
        c0429b3.f2726e = c0429b.f2726e + c0429b2.f2726e;
        c0429b3.f2727f = c0429b.f2727f + c0429b2.f2727f;
        if (!c0429b.f2732k.m3723c() || !c0429b2.f2732k.m3723c()) {
            c0429b3.f2732k = C0444f.m3738a(c0429b.f2732k, c0429b2.f2732k);
        }
        return c0429b3;
    }

    /* renamed from: a */
    public static C0429b m3843a(C0429b c0429b, float f) {
        C0429b c0429b2 = new C0429b();
        c0429b2.f2723b = (int) (c0429b.f2723b * f);
        c0429b2.f2724c = c0429b.f2724c * f;
        c0429b2.f2725d = c0429b.f2725d * f;
        c0429b2.f2726e = c0429b.f2726e * f;
        c0429b2.f2727f = (int) (c0429b.f2727f * f);
        if (!c0429b.f2732k.m3723c()) {
            c0429b2.f2732k = C0444f.m3728b(c0429b.f2732k, f);
        }
        return c0429b2;
    }

    /* renamed from: a */
    public static C0429b m3851a(int i) {
        C0429b c0429b = new C0429b();
        c0429b.f2723b = i;
        return c0429b;
    }

    /* renamed from: a */
    public static C0429b m3840a(C0458l c0458l, C1107ab c1107ab, String str, String str2, boolean z) {
        String m666b = c1107ab.m666b(str, str2, (String) null);
        if (m666b == null && !z) {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
        try {
            return m3825b(c0458l, m666b);
        } catch (C0417bo e) {
            throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0429b m3841a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0429b c0429b) {
        String m666b = c1107ab.m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0429b;
        }
        try {
            return m3825b(c0458l, m666b);
        } catch (C0417bo e) {
            throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static C0429b m3826b(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0429b c0429b) {
        String m666b = c1107ab.m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0429b;
        }
        try {
            return m3839a(c0458l, m666b);
        } catch (C0417bo e) {
            throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: b */
    public static void m3831b(int i) {
        if (i < 0 || i > 31) {
            throw new C0417bo("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    /* renamed from: a */
    public static int m3849a(int i, String str) {
        if (str.contains("-")) {
            String[] m2145c = C0773f.m2145c(str, '-');
            if (m2145c.length != 2) {
                throw new C0417bo("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(m2145c[0]);
            int parseInt2 = Integer.parseInt(m2145c[1]);
            m3831b(parseInt);
            m3831b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new C0417bo("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        m3831b(parseInt3);
        return i | (1 << parseInt3);
    }

    /* renamed from: a */
    public static C0429b m3839a(C0458l c0458l, String str) {
        C0429b m3825b = m3825b(c0458l, str);
        if (m3825b != null && m3825b.f2727f != 0) {
            throw new C0417bo("Ammo not supported on streaming price:" + str);
        }
        return m3825b;
    }

    /* renamed from: b */
    public static C0429b m3825b(C0458l c0458l, String str) {
        String trim;
        String trim2;
        if (str == null) {
            return f2734a;
        }
        C0429b c0429b = new C0429b();
        for (String str2 : str.split(",|\\|")) {
            String trim3 = str2.trim();
            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                String[] split = trim3.split("=|:");
                if (split.length == 1) {
                    trim = "credits";
                    trim2 = split[0];
                } else if (split.length == 2) {
                    trim = split[0].trim();
                    trim2 = split[1].trim();
                } else {
                    throw new C0417bo("Unknown price format:" + str);
                }
                try {
                    if (trim.equals("credits")) {
                        c0429b.f2723b = Integer.parseInt(trim2);
                    } else if (trim.equals("energy")) {
                        c0429b.f2724c = Float.parseFloat(trim2);
                    } else if (trim.equals("hp")) {
                        c0429b.f2725d = Float.parseFloat(trim2);
                    } else if (trim.equals("shield")) {
                        c0429b.f2726e = Float.parseFloat(trim2);
                    } else if (trim.equals("ammo")) {
                        c0429b.f2727f = Integer.parseInt(trim2);
                    } else if (trim.equals("hasFlag")) {
                        c0429b.f2730i = m3849a(c0429b.f2730i, trim2);
                    } else if (trim.equals("hasMissingFlag")) {
                        c0429b.f2731j = m3849a(c0429b.f2731j, trim2);
                    } else if (trim.equals("setFlag")) {
                        c0429b.f2728g = m3849a(c0429b.f2728g, trim2);
                    } else if (trim.equals("unsetFlag")) {
                        c0429b.f2729h = m3849a(c0429b.f2729h, trim2);
                    } else {
                        C0433a m3508k = c0458l.m3508k(trim);
                        if (m3508k != null) {
                            float parseFloat = Float.parseFloat(trim2);
                            if (c0429b.f2732k == f2733m) {
                                c0429b.f2732k = new C0444f();
                            }
                            c0429b.f2732k.m3745a(m3508k, parseFloat);
                        } else {
                            throw new C0417bo("Unknown price type:" + trim);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str3 = "Bad price number:" + trim2 + " in " + str;
                    if (0 != 0) {
                        str3 = str3 + " (Hint: A whole number was expected)";
                    }
                    throw new C0417bo(str3);
                }
            }
        }
        if (c0429b.f2732k != f2733m) {
            c0429b.f2732k.m3752a();
        }
        if (!c0429b.m3817d()) {
            return f2734a;
        }
        return c0429b;
    }

    /* renamed from: a */
    public int m3845a(AbstractC0244am abstractC0244am, boolean z) {
        int i = 9999;
        if (!z && this.f2723b > 0) {
            i = C0773f.m2147c(9999, (int) (abstractC0244am.f1614bX.credits / this.f2723b));
        }
        if (this.f2724c > 0.0f) {
            i = C0773f.m2147c(i, (int) (abstractC0244am.f1644cB / this.f2724c));
        }
        if (this.f2725d > 0.0f) {
            i = C0773f.m2147c(i, (int) (abstractC0244am.f1637cu / this.f2725d));
        }
        if (this.f2726e > 0.0f) {
            i = C0773f.m2147c(i, (int) (abstractC0244am.f1640cx / this.f2726e));
        }
        if (this.f2727f > 0) {
            i = C0773f.m2147c(i, abstractC0244am.f1647cE / this.f2727f);
        }
        if (!this.f2732k.m3723c()) {
            i = C0773f.m2147c(i, C0444f.m3741a(this.f2732k, abstractC0244am));
        }
        if (!m3811f(abstractC0244am)) {
            i = 0;
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: b */
    public boolean mo3799b(AbstractC0244am abstractC0244am, double d) {
        if (this.f2723b > 0 && !abstractC0244am.f1614bX.m4444a(this.f2723b * d)) {
            return false;
        }
        if (this.f2724c > 0.0f && abstractC0244am.f1644cB < this.f2724c * d) {
            return false;
        }
        if (this.f2725d > 0.0f && abstractC0244am.f1637cu < this.f2725d * d) {
            return false;
        }
        if (this.f2726e > 0.0f && abstractC0244am.f1640cx < this.f2726e * d) {
            return false;
        }
        if ((this.f2727f > 0 && abstractC0244am.f1647cE < this.f2727f * d) || !m3811f(abstractC0244am)) {
            return false;
        }
        if (!this.f2732k.m3723c() && !C0444f.m3740a(this.f2732k, abstractC0244am, d)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: b */
    public boolean mo3800b(AbstractC0244am abstractC0244am) {
        if (this.f2723b > 0 && !abstractC0244am.f1614bX.m4444a(this.f2723b)) {
            return false;
        }
        if (this.f2724c > 0.0f && abstractC0244am.f1644cB < this.f2724c) {
            return false;
        }
        if (this.f2725d > 0.0f && abstractC0244am.f1637cu < this.f2725d) {
            return false;
        }
        if (this.f2726e > 0.0f && abstractC0244am.f1640cx < this.f2726e) {
            return false;
        }
        if ((this.f2727f > 0 && abstractC0244am.f1647cE < this.f2727f) || !m3811f(abstractC0244am)) {
            return false;
        }
        if (!this.f2732k.m3723c() && !C0444f.m3726b(this.f2732k, abstractC0244am)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m3846a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        boolean z = false;
        if (!this.f2732k.m3723c() && C0444f.m3739a(this.f2732k, abstractC0244am, abstractC0244am2)) {
            z = true;
        }
        return z;
    }

    /* renamed from: d */
    public static void m3816d(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1644cB < 0.0f) {
            abstractC0244am.f1644cB = 0.0f;
        }
        if (abstractC0244am.f1644cB > abstractC0244am.mo2908bd()) {
            abstractC0244am.f1644cB = abstractC0244am.mo2908bd();
        }
        if (abstractC0244am.f1640cx < 0.0f) {
            abstractC0244am.f1640cx = 0.0f;
        }
        if (abstractC0244am.f1640cx > abstractC0244am.f1643cA) {
            abstractC0244am.f1640cx = abstractC0244am.f1643cA;
        }
        if (abstractC0244am.f1637cu > abstractC0244am.f1638cv) {
            abstractC0244am.f1637cu = abstractC0244am.f1638cv;
        }
        if (abstractC0244am.f1647cE < 0) {
            abstractC0244am.f1647cE = 0;
        }
    }

    /* renamed from: e */
    public void m3813e(AbstractC0244am abstractC0244am) {
        if (this.f2729h != 0) {
            abstractC0244am.f1648cF &= this.f2729h ^ (-1);
        }
        if (this.f2728g != 0) {
            abstractC0244am.f1648cF |= this.f2728g;
        }
    }

    /* renamed from: c */
    public int m3821c(int i) {
        if (this.f2729h != 0) {
            i &= this.f2729h ^ (-1);
        }
        if (this.f2728g != 0) {
            i |= this.f2728g;
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3850a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    /* renamed from: f */
    public boolean m3811f(AbstractC0244am abstractC0244am) {
        if (this.f2730i != 0 && !m3830b(abstractC0244am.f1648cF, this.f2730i)) {
            return false;
        }
        if (this.f2731j != 0 && m3820c(abstractC0244am.f1648cF, this.f2731j)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static boolean m3830b(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: c */
    public static boolean m3820c(int i, int i2) {
        return (i2 & i) != 0;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: a */
    public void mo3806a(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1614bX.credits -= this.f2723b;
        abstractC0244am.f1644cB -= this.f2724c;
        abstractC0244am.f1637cu -= this.f2725d;
        abstractC0244am.f1640cx -= this.f2726e;
        abstractC0244am.f1647cE -= this.f2727f;
        m3813e(abstractC0244am);
        if (!this.f2732k.m3723c()) {
            C0444f.m3719c(this.f2732k, abstractC0244am);
        }
        m3816d(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: a */
    public void mo3805a(AbstractC0244am abstractC0244am, double d) {
        abstractC0244am.f1614bX.credits -= this.f2723b * d;
        abstractC0244am.f1644cB = (float) (abstractC0244am.f1644cB - (this.f2724c * d));
        abstractC0244am.f1637cu = (float) (abstractC0244am.f1637cu - (this.f2725d * d));
        abstractC0244am.f1640cx = (float) (abstractC0244am.f1640cx - (this.f2726e * d));
        abstractC0244am.f1647cE = (int) (abstractC0244am.f1647cE - (this.f2727f * d));
        m3813e(abstractC0244am);
        if (!this.f2732k.m3723c()) {
            C0444f.m3725b(this.f2732k, abstractC0244am, d);
        }
        m3816d(abstractC0244am);
    }

    /* renamed from: g */
    public void m3810g(AbstractC0244am abstractC0244am) {
        if (this.f2723b > 0) {
            abstractC0244am.f1614bX.m4421b(this.f2723b);
        } else {
            abstractC0244am.f1614bX.credits += this.f2723b;
        }
        abstractC0244am.f1644cB += this.f2724c;
        abstractC0244am.f1637cu += this.f2725d;
        abstractC0244am.f1640cx += this.f2726e;
        abstractC0244am.f1647cE += this.f2727f;
        m3813e(abstractC0244am);
        if (!this.f2732k.m3723c()) {
            C0444f.m3714d(this.f2732k, abstractC0244am);
        }
        m3816d(abstractC0244am);
    }

    /* renamed from: h */
    public void m3809h(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1614bX.credits += this.f2723b;
        abstractC0244am.f1644cB += this.f2724c;
        abstractC0244am.f1637cu += this.f2725d;
        abstractC0244am.f1640cx += this.f2726e;
        abstractC0244am.f1647cE += this.f2727f;
        m3813e(abstractC0244am);
        if (!this.f2732k.m3723c()) {
            C0444f.m3714d(this.f2732k, abstractC0244am);
        }
        m3816d(abstractC0244am);
    }

    /* renamed from: a */
    public void m3848a(AbstractC0244am abstractC0244am, double d, boolean z) {
        if (z) {
            abstractC0244am.f1614bX.credits += this.f2723b * d;
        }
        abstractC0244am.f1644cB = (float) (abstractC0244am.f1644cB + (this.f2724c * d));
        abstractC0244am.f1637cu = (float) (abstractC0244am.f1637cu + (this.f2725d * d));
        abstractC0244am.f1640cx = (float) (abstractC0244am.f1640cx + (this.f2726e * d));
        abstractC0244am.f1647cE = (int) (abstractC0244am.f1647cE + (this.f2727f * d));
        m3813e(abstractC0244am);
        if (!this.f2732k.m3723c()) {
            C0444f.m3718c(this.f2732k, abstractC0244am, d);
        }
        m3816d(abstractC0244am);
    }

    /* renamed from: c */
    public boolean m3822c() {
        if (this == f2734a) {
            return true;
        }
        if (this.f2723b != 0 || this.f2724c != 0.0f || this.f2725d != 0.0f || this.f2726e != 0.0f || this.f2727f != 0 || !this.f2732k.m3723c()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m3817d() {
        if (this == f2734a) {
            return false;
        }
        if (this.f2723b != 0 || this.f2724c != 0.0f || this.f2725d != 0.0f || this.f2726e != 0.0f || this.f2727f != 0 || this.f2728g != 0 || this.f2729h != 0 || this.f2730i != 0 || this.f2731j != 0 || !this.f2732k.m3723c()) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public boolean m3814e() {
        if (this == f2734a) {
            return false;
        }
        if (this.f2723b != 0 || this.f2724c != 0.0f || this.f2725d != 0.0f || this.f2726e != 0.0f || this.f2727f != 0 || this.f2728g != 0 || this.f2729h != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public String m3833a(boolean z, boolean z2, int i, boolean z3) {
        C0795ae c0795ae = new C0795ae();
        m3838a(c0795ae, z, z2, i, z3);
        return c0795ae.m1984a();
    }

    /* renamed from: a */
    public void m3837a(C0795ae c0795ae, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am, int i2) {
        m3824b(c0795ae, z, z2, i, z3, abstractC0244am, i2);
    }

    /* renamed from: a */
    private void m3838a(C0795ae c0795ae, boolean z, boolean z2, int i, boolean z3) {
        m3824b(c0795ae, z, z2, i, z3, null, 0);
    }

    /* renamed from: b */
    private void m3824b(C0795ae c0795ae, boolean z, boolean z2, int i, boolean z3, AbstractC0244am abstractC0244am, int i2) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        if (this.f2723b > 0 && 0 < i) {
            int i4 = f2735l;
            if (abstractC0244am != null && abstractC0244am.f1614bX.credits < this.f2723b) {
                i4 = i2;
            }
            c0795ae.m1978a("$" + this.f2723b + str, i4);
            i3 = 0 + 1;
        }
        if (z2) {
            if (this.f2724c > 0.0f && i3 < i) {
                c0795ae.m1973b(C0773f.m2121g(this.f2724c) + " energy" + str);
                i3++;
            }
            if (this.f2725d > 0.0f && i3 < i) {
                c0795ae.m1973b(C0773f.m2121g(this.f2725d) + " hp" + str);
                i3++;
            }
            if (this.f2726e > 0.0f && i3 < i) {
                c0795ae.m1973b(C0773f.m2121g(this.f2726e) + " shield" + str);
                i3++;
            }
            if (this.f2727f > 0 && i3 < i) {
                c0795ae.m1973b(C0773f.m2121g(this.f2727f) + " ammo" + str);
                i3++;
            }
        }
        if (!this.f2732k.m3723c()) {
            this.f2732k.m3737a(c0795ae, z, z2, i - i3, z3, false, abstractC0244am, i2);
        }
        c0795ae.m1979a(str);
    }

    /* renamed from: i */
    public C0429b m3808i(AbstractC0244am abstractC0244am) {
        C0429b c0429b = new C0429b();
        if (this.f2723b > 0 && abstractC0244am.f1614bX.credits < this.f2723b) {
            c0429b.f2723b = this.f2723b - ((int) abstractC0244am.f1614bX.credits);
        }
        if (!this.f2732k.m3723c()) {
            c0429b.f2732k = this.f2732k.m3750a(abstractC0244am);
        }
        return c0429b;
    }

    /* renamed from: a */
    public String m3847a(AbstractC0244am abstractC0244am, int i, boolean z) {
        String m3749a;
        String str = null;
        if (this.f2723b > 0 && 0 < i && abstractC0244am.f1614bX.credits < this.f2723b) {
            if (0 == 0) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "credits, ";
            int i2 = 0 + 1;
        }
        if (!this.f2732k.m3723c() && (m3749a = this.f2732k.m3749a(abstractC0244am, ", ", i, z)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + m3749a;
        }
        if (str != null) {
            return C0773f.m2182a(str, ", ");
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo3844a(C0429b c0429b) {
        return this.f2723b - c0429b.f2723b;
    }

    /* renamed from: a */
    public static void m3835a(GameOutputStream gameOutputStream, C0429b c0429b) {
        gameOutputStream.writeBoolean(c0429b != null);
        if (c0429b != null) {
            c0429b.m3836a(gameOutputStream);
        }
    }

    /* renamed from: a */
    public void m3836a(GameOutputStream gameOutputStream) {
        boolean z = false;
        boolean z2 = false;
        if (this.f2724c != 0.0f || this.f2725d != 0.0f || this.f2726e != 0.0f || this.f2727f != 0) {
            z = true;
        }
        if (this.f2728g != 0 || this.f2729h != 0 || this.f2730i != 0 || this.f2731j != 0) {
            z = true;
        }
        if (!this.f2732k.m3723c()) {
            z2 = true;
        }
        byte b = 0;
        if (z) {
            b = (byte) (0 | 1);
        }
        if (z2) {
            b = (byte) (b | 2);
        }
        gameOutputStream.writeByte(b);
        gameOutputStream.writeInt(this.f2723b);
        if (z) {
            gameOutputStream.writeFloat(this.f2724c);
            gameOutputStream.writeFloat(this.f2725d);
            gameOutputStream.writeFloat(this.f2726e);
            gameOutputStream.writeInt(this.f2727f);
            gameOutputStream.writeInt(this.f2728g);
            gameOutputStream.writeInt(this.f2729h);
            gameOutputStream.writeInt(this.f2730i);
            gameOutputStream.writeInt(this.f2731j);
        }
        if (z2) {
            this.f2732k.m3736a(gameOutputStream);
        }
    }

    /* renamed from: a */
    public static C0429b m3834a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            return m3823b(gameInputStream);
        }
        return null;
    }

    /* renamed from: b */
    public static C0429b m3823b(GameInputStream gameInputStream) {
        C0429b c0429b = new C0429b();
        byte readByte = gameInputStream.readByte();
        boolean m3830b = m3830b(readByte, 1);
        boolean m3830b2 = m3830b(readByte, 2);
        c0429b.f2723b = gameInputStream.readInt();
        if (m3830b) {
            c0429b.f2724c = gameInputStream.readFloat();
            c0429b.f2725d = gameInputStream.readFloat();
            c0429b.f2726e = gameInputStream.readFloat();
            c0429b.f2727f = gameInputStream.readInt();
            c0429b.f2728g = gameInputStream.readInt();
            c0429b.f2729h = gameInputStream.readInt();
            c0429b.f2730i = gameInputStream.readInt();
            c0429b.f2731j = gameInputStream.readInt();
        }
        if (m3830b2) {
            c0429b.f2732k = new C0444f();
            c0429b.f2732k.m3735a(gameInputStream);
        }
        return c0429b;
    }

    /* renamed from: b */
    public boolean m3829b(AbstractC0244am abstractC0244am, boolean z) {
        if (m3819c(abstractC0244am, z)) {
            m3815d(abstractC0244am, z);
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public boolean m3819c(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f2723b > 0 && !abstractC0244am.f1614bX.m4374g(this.f2723b)) {
            return false;
        }
        if (z) {
            return C0810an.m1949c(abstractC0244am, this);
        }
        return mo3800b(abstractC0244am);
    }

    /* renamed from: d */
    public void m3815d(AbstractC0244am abstractC0244am, boolean z) {
        abstractC0244am.f1614bX.f1312p -= this.f2723b;
        abstractC0244am.f1614bX.f1313q = 0;
        if (z) {
            C0810an.m1953a(abstractC0244am, this);
        }
    }

    /* renamed from: e */
    public void m3812e(AbstractC0244am abstractC0244am, boolean z) {
        abstractC0244am.f1614bX.f1312p += this.f2723b;
        abstractC0244am.f1614bX.f1313q = 0;
        if (z) {
            C0810an.m1950b(abstractC0244am, this);
        }
    }

    /* renamed from: b */
    public static boolean m3827b(C0429b c0429b, C0429b c0429b2) {
        if (c0429b2 == c0429b) {
            return true;
        }
        if (c0429b2 == null || c0429b == null) {
            return false;
        }
        return c0429b2.m3828b(c0429b);
    }

    /* renamed from: b */
    public boolean m3828b(C0429b c0429b) {
        if (this.f2723b != c0429b.f2723b || this.f2725d != c0429b.f2725d || this.f2726e != c0429b.f2726e || this.f2727f != c0429b.f2727f || this.f2732k.m3723c() != c0429b.f2732k.m3723c()) {
            return false;
        }
        if (!this.f2732k.m3723c() && !c0429b.f2732k.m3723c() && !this.f2732k.m3712e(c0429b.f2732k)) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean m3818c(C0429b c0429b) {
        if (this.f2723b > 0 && c0429b.f2723b > 0) {
            return true;
        }
        if (this.f2725d > 0.0f && c0429b.f2725d > 0.0f) {
            return true;
        }
        if (this.f2726e > 0.0f && c0429b.f2726e > 0.0f) {
            return true;
        }
        if (this.f2727f > 0 && c0429b.f2727f > 0) {
            return true;
        }
        if (!this.f2732k.m3723c() && !c0429b.f2732k.m3723c() && this.f2732k.m3711f(c0429b.f2732k)) {
            return true;
        }
        return false;
    }
}