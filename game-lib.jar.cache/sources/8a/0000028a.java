package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.p037f.C0795ae;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Collections;
import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f.class */
public final class C0444f {

    /* renamed from: a */
    public static final C0444f f2829a = new C0444f().m3752a();

    /* renamed from: b */
    public final C1136m f2830b = new C1136m();

    /* renamed from: c */
    boolean f2831c;

    /* renamed from: a */
    public C0444f m3752a() {
        this.f2831c = true;
        return this;
    }

    /* renamed from: b */
    public void m3733b() {
        this.f2830b.clear();
    }

    /* renamed from: c */
    public boolean m3723c() {
        if (this.f2830b.f7109a == 0) {
            return true;
        }
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0443e) m535a[i2]).f2828b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public double m3746a(C0433a c0433a) {
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a == c0433a) {
                return c0443e.f2828b;
            }
        }
        return 0.0d;
    }

    /* renamed from: b */
    public double m3731b(C0433a c0433a) {
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            C0443e c0443e = (C0443e) m535a[i3];
            if (c0443e.f2827a == c0433a) {
                i2 = (int) (i2 + c0443e.f2828b);
            }
            if (c0443e.f2827a.f2778v == c0433a) {
                i2 = (int) (i2 + c0443e.f2828b);
            }
        }
        return i2;
    }

    /* renamed from: a */
    public void m3744a(C0444f c0444f) {
        m3733b();
        m3729b(c0444f);
    }

    /* renamed from: a */
    public void m3745a(C0433a c0433a, double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a == c0433a) {
                c0443e.f2828b = d;
                return;
            }
        }
        C0443e c0443e2 = new C0443e(c0433a);
        c0443e2.f2828b = d;
        this.f2830b.add(c0443e2);
    }

    /* renamed from: a */
    public void m3751a(double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            ((C0443e) m535a[i2]).f2828b *= d;
        }
    }

    /* renamed from: b */
    public void m3730b(C0433a c0433a, double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1136m c1136m = this.f2830b;
        int i = c1136m.f7109a;
        Object[] m535a = c1136m.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a == c0433a) {
                c0443e.f2828b += d;
                return;
            }
        }
        C0443e c0443e2 = new C0443e(c0433a);
        c0443e2.f2828b = d;
        c1136m.add(c0443e2);
    }

    /* renamed from: c */
    public void m3721c(C0433a c0433a, double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        C1136m c1136m = this.f2830b;
        int i = c1136m.f7109a;
        Object[] m535a = c1136m.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a == c0433a) {
                c0443e.f2828b += d;
                return;
            }
        }
        C0443e c0443e2 = new C0443e(c0433a);
        c0443e2.f2828b = d;
        c1136m.add(c0443e2);
    }

    /* renamed from: d */
    public void m3716d(C0433a c0433a, double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        m3730b(c0433a, -d);
    }

    /* renamed from: a */
    public void m3747a(C0429b c0429b, double d, double d2) {
        if (c0429b.f2723b >= d && c0429b.f2723b <= d2) {
            m3721c(C0433a.f2786D, c0429b.f2723b);
        }
        m3742a(c0429b.f2732k, d, d2);
    }

    /* renamed from: b */
    public void m3732b(C0429b c0429b, double d, double d2) {
        if (c0429b.f2723b >= d && c0429b.f2723b <= d2) {
            m3721c(C0433a.f2786D, -c0429b.f2723b);
        }
        m3727b(c0429b.f2732k, d, d2);
    }

    /* renamed from: a */
    public void m3748a(C0429b c0429b) {
        m3721c(C0433a.f2786D, c0429b.f2723b);
        m3729b(c0429b.f2732k);
    }

    /* renamed from: b */
    public void m3729b(C0444f c0444f) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            m3730b(c0443e.f2827a, c0443e.f2828b);
        }
    }

    /* renamed from: a */
    public void m3742a(C0444f c0444f, double d, double d2) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2828b >= d && c0443e.f2828b <= d2) {
                m3730b(c0443e.f2827a, c0443e.f2828b);
            }
        }
    }

    /* renamed from: a */
    public void m3743a(C0444f c0444f, double d) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            m3730b(c0443e.f2827a, c0443e.f2828b * d);
        }
    }

    /* renamed from: c */
    public void m3720c(C0444f c0444f) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            m3716d(c0443e.f2827a, c0443e.f2828b);
        }
    }

    /* renamed from: b */
    public void m3727b(C0444f c0444f, double d, double d2) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2828b >= d && c0443e.f2828b <= d2) {
                m3716d(c0443e.f2827a, c0443e.f2828b);
            }
        }
    }

    /* renamed from: a */
    public static C0444f m3738a(C0444f c0444f, C0444f c0444f2) {
        C0444f c0444f3 = new C0444f();
        c0444f3.m3729b(c0444f);
        c0444f3.m3729b(c0444f2);
        return c0444f3;
    }

    /* renamed from: b */
    public static C0444f m3724b(C0444f c0444f, C0444f c0444f2) {
        C0444f c0444f3 = new C0444f();
        c0444f3.m3729b(c0444f);
        c0444f3.m3720c(c0444f2);
        return c0444f3;
    }

    /* renamed from: b */
    public static C0444f m3728b(C0444f c0444f, double d) {
        C0444f c0444f2 = new C0444f();
        c0444f2.m3743a(c0444f, d);
        return c0444f2;
    }

    /* renamed from: d */
    public static C0444f m3715d(C0444f c0444f) {
        C0444f c0444f2 = new C0444f();
        c0444f2.m3729b(c0444f);
        return c0444f2;
    }

    /* renamed from: a */
    public static int m3741a(C0444f c0444f, AbstractC0244am abstractC0244am) {
        double m4242a;
        int i = 9999;
        int i2 = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i3 = 0; i3 < i2; i3++) {
            C0443e c0443e = (C0443e) m535a[i3];
            if (c0443e.f2828b > 0.0d) {
                if (c0443e.f2827a.f2776t) {
                    m4242a = abstractC0244am.f1614bX.m4400c(c0443e.f2827a);
                } else {
                    m4242a = abstractC0244am.m4242a(c0443e.f2827a);
                }
                i = C0773f.m2147c(i, (int) (m4242a / c0443e.f2828b));
            }
        }
        return i;
    }

    /* renamed from: b */
    public static boolean m3726b(C0444f c0444f, AbstractC0244am abstractC0244am) {
        double m4242a;
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                m4242a = abstractC0244am.f1614bX.m4400c(c0443e.f2827a);
            } else {
                m4242a = abstractC0244am.m4242a(c0443e.f2827a);
            }
            if (c0443e.f2828b > m4242a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3740a(C0444f c0444f, AbstractC0244am abstractC0244am, double d) {
        double m4242a;
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                m4242a = abstractC0244am.f1614bX.m4400c(c0443e.f2827a);
            } else {
                m4242a = abstractC0244am.m4242a(c0443e.f2827a);
            }
            if (c0443e.f2828b * d > m4242a) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: c */
    public static void m3719c(C0444f c0444f, AbstractC0244am abstractC0244am) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                abstractC0244am.f1614bX.m4450V().m3716d(c0443e.f2827a, c0443e.f2828b);
            } else {
                abstractC0244am.mo1748df().m3716d(c0443e.f2827a, c0443e.f2828b);
            }
        }
    }

    /* renamed from: b */
    public static void m3725b(C0444f c0444f, AbstractC0244am abstractC0244am, double d) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                abstractC0244am.f1614bX.m4450V().m3716d(c0443e.f2827a, c0443e.f2828b * d);
            } else {
                abstractC0244am.mo1748df().m3716d(c0443e.f2827a, c0443e.f2828b * d);
            }
        }
    }

    /* renamed from: d */
    public static void m3714d(C0444f c0444f, AbstractC0244am abstractC0244am) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                abstractC0244am.f1614bX.m4450V().m3730b(c0443e.f2827a, c0443e.f2828b);
            } else {
                abstractC0244am.mo1748df().m3730b(c0443e.f2827a, c0443e.f2828b);
            }
        }
    }

    /* renamed from: c */
    public static void m3718c(C0444f c0444f, AbstractC0244am abstractC0244am, double d) {
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                abstractC0244am.f1614bX.m4450V().m3730b(c0443e.f2827a, c0443e.f2828b * d);
            } else {
                abstractC0244am.mo1748df().m3730b(c0443e.f2827a, c0443e.f2828b * d);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3739a(C0444f c0444f, AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        boolean z = false;
        int i = c0444f.f2830b.f7109a;
        Object[] m535a = c0444f.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            C0433a c0433a = c0443e.f2827a;
            double d = c0443e.f2828b;
            if (d != 0.0d) {
                double mo3763a = c0433a.mo3763a(abstractC0244am);
                double mo3763a2 = c0433a.mo3763a(abstractC0244am2);
                if (d >= 0.0d) {
                    if (mo3763a > 0.0d) {
                        double m2221a = C0773f.m2221a(mo3763a, d);
                        c0433a.mo3761b(abstractC0244am, -m2221a);
                        c0433a.mo3761b(abstractC0244am2, m2221a);
                        z = true;
                    }
                } else if (mo3763a2 > 0.0d) {
                    double m2221a2 = C0773f.m2221a(mo3763a2, -d);
                    c0433a.mo3761b(abstractC0244am2, -m2221a2);
                    c0433a.mo3761b(abstractC0244am, m2221a2);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: a */
    public String m3734a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        C0795ae c0795ae = new C0795ae();
        m3737a(c0795ae, z, z2, i, z3, z4, null, 0);
        return c0795ae.m1984a();
    }

    /* renamed from: a */
    public void m3737a(C0795ae c0795ae, boolean z, boolean z2, int i, boolean z3, boolean z4, AbstractC0244am abstractC0244am, int i2) {
        String str;
        int i3 = this.f2830b.f7109a;
        if (i3 == 0) {
            return;
        }
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i4 = 0;
        Object[] m535a = this.f2830b.m535a();
        for (int i5 = 0; i5 < i3; i5++) {
            C0443e c0443e = (C0443e) m535a[i5];
            if ((c0443e.f2828b > 0.0d || z4) && i4 < i) {
                C0433a c0433a = c0443e.f2827a;
                if (z3 || !c0433a.m3785a()) {
                    boolean z5 = false;
                    if (c0433a.f2781y != null && c0433a.f2782z) {
                        z5 = true;
                        int m1972c = c0795ae.m1972c() - 2;
                        if (m1972c < 2) {
                            m1972c = 2;
                        }
                        c0795ae.m1980a(c0433a.f2781y, m1972c * 3, m1972c);
                    }
                    String str2 = c0433a.m3782a(c0443e.f2828b, false, z5) + str;
                    boolean z6 = false;
                    int i6 = 0;
                    if (c0433a.f2770m != null && c0433a.f2771n) {
                        z6 = true;
                        i6 = c0433a.f2770m.intValue();
                    }
                    if (abstractC0244am != null && c0433a.mo3763a(abstractC0244am) < c0443e.f2828b) {
                        z6 = true;
                        i6 = i2;
                    }
                    if (z6) {
                        c0795ae.m1978a(str2, i6);
                    } else {
                        c0795ae.m1973b(str2);
                    }
                    i4++;
                }
            }
        }
    }

    /* renamed from: a */
    public void m3736a(GameOutputStream gameOutputStream) {
        if (this.f2830b.f7109a == 0) {
            gameOutputStream.writeByte(-1);
            return;
        }
        gameOutputStream.writeByte(0);
        gameOutputStream.mo1331a((short) this.f2830b.f7109a);
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            gameOutputStream.writeString(c0443e.f2827a.f2760b);
            gameOutputStream.writeDouble(c0443e.f2828b);
        }
    }

    /* renamed from: a */
    public void m3735a(GameInputStream gameInputStream) {
        if (this.f2831c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (gameInputStream.readByte() == -1) {
            return;
        }
        int readShort = gameInputStream.readShort();
        this.f2830b.clear();
        for (int i = 0; i < readShort; i++) {
            C0433a m3775b = C0433a.m3775b(gameInputStream.readString());
            double readDouble = gameInputStream.readDouble();
            if (m3775b != null && readDouble != 0.0d) {
                this.f2830b.add(new C0443e(m3775b, readDouble));
            }
        }
    }

    /* renamed from: d */
    public int m3717d() {
        int i = 0;
        int i2 = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((C0443e) m535a[i3]).f2828b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: e */
    public boolean m3712e(C0444f c0444f) {
        if (m3717d() != c0444f.m3717d()) {
            return false;
        }
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (!C0773f.m2175b(c0443e.f2828b, c0444f.m3746a(c0443e.f2827a))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: f */
    public boolean m3711f(C0444f c0444f) {
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2828b > 0.0d && c0444f.m3731b(c0443e.f2827a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public C0444f m3750a(AbstractC0244am abstractC0244am) {
        double m4242a;
        C0444f c0444f = new C0444f();
        int i = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0443e c0443e = (C0443e) m535a[i2];
            if (c0443e.f2827a.f2776t) {
                m4242a = abstractC0244am.f1614bX.m4400c(c0443e.f2827a);
            } else {
                m4242a = abstractC0244am.m4242a(c0443e.f2827a);
            }
            if (m4242a < c0443e.f2828b) {
                c0444f.m3730b(c0443e.f2827a, c0443e.f2828b - m4242a);
            }
        }
        if (c0444f.m3723c()) {
            return f2829a;
        }
        return c0444f;
    }

    /* renamed from: a */
    public String m3749a(AbstractC0244am abstractC0244am, String str, int i, boolean z) {
        double m4242a;
        String str2 = null;
        int i2 = 0;
        int i3 = this.f2830b.f7109a;
        Object[] m535a = this.f2830b.m535a();
        for (int i4 = 0; i4 < i3; i4++) {
            C0443e c0443e = (C0443e) m535a[i4];
            if (z || !c0443e.f2827a.m3785a()) {
                if (c0443e.f2827a.f2776t) {
                    m4242a = abstractC0244am.f1614bX.m4400c(c0443e.f2827a);
                } else {
                    m4242a = abstractC0244am.m4242a(c0443e.f2827a);
                }
                if (m4242a < c0443e.f2828b) {
                    double d = c0443e.f2828b - m4242a;
                    String m3767i = c0443e.f2827a.m3767i();
                    if (str2 == null) {
                        str2 = m3767i;
                    } else {
                        str2 = str2 + str + m3767i;
                    }
                    i2++;
                    if (i2 > i) {
                        break;
                    }
                } else {
                    continue;
                }
            }
        }
        return str2;
    }

    /* renamed from: g */
    public void m3710g(C0444f c0444f) {
        m3733b();
        m3729b(c0444f);
    }

    /* renamed from: c */
    public void m3722c(C0433a c0433a) {
        C1136m c1136m = this.f2830b;
        int i = c1136m.f7109a;
        Object[] m535a = c1136m.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((C0443e) m535a[i2]).f2827a == c0433a) {
                return;
            }
        }
        C0443e c0443e = new C0443e(c0433a);
        c0443e.f2828b = 0.0d;
        c1136m.add(c0443e);
    }

    /* renamed from: e */
    public void m3713e() {
        Collections.sort(this.f2830b, new Comparator() { // from class: com.corrodinggames.rts.game.units.custom.e.f.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo3709a(C0443e c0443e, C0443e c0443e2) {
                if (c0443e.f2827a == null || c0443e2.f2827a == null) {
                    return 0;
                }
                return Float.compare(c0443e.f2827a.f2780x, c0443e2.f2827a.f2780x);
            }
        });
    }
}