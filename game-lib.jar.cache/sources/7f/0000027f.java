package com.corrodinggames.rts.game.units.custom.p021e;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0435b;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0436c;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0437d;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0438e;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0439f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a.class */
public class C0433a {

    /* renamed from: a */
    public boolean f2759a;

    /* renamed from: b */
    protected String f2760b;

    /* renamed from: c */
    protected C0404bb f2761c;

    /* renamed from: d */
    protected C0404bb f2762d;

    /* renamed from: e */
    protected boolean f2763e;

    /* renamed from: f */
    protected boolean f2764f;

    /* renamed from: g */
    protected C0404bb f2765g;

    /* renamed from: h */
    protected C0404bb f2766h;

    /* renamed from: i */
    public C0433a f2767i;

    /* renamed from: j */
    public boolean f2768j;

    /* renamed from: k */
    public boolean f2769k;

    /* renamed from: m */
    Integer f2770m;

    /* renamed from: n */
    public boolean f2771n;

    /* renamed from: o */
    public boolean f2772o;

    /* renamed from: p */
    public boolean f2773p;

    /* renamed from: r */
    boolean f2774r;

    /* renamed from: s */
    float f2775s;

    /* renamed from: t */
    protected boolean f2776t;

    /* renamed from: u */
    protected boolean f2777u;

    /* renamed from: v */
    C0433a f2778v;

    /* renamed from: w */
    public boolean f2779w;

    /* renamed from: x */
    public float f2780x;

    /* renamed from: y */
    public C0970e f2781y;

    /* renamed from: z */
    public boolean f2782z;

    /* renamed from: A */
    static ArrayList f2783A = new ArrayList();

    /* renamed from: B */
    static ArrayList f2784B = new ArrayList();

    /* renamed from: C */
    public static ArrayList f2785C = new ArrayList();

    /* renamed from: D */
    public static final C0433a f2786D = m3780a(new C0436c());

    /* renamed from: E */
    public static final C0433a f2787E = m3780a(new C0437d());

    /* renamed from: F */
    public static final C0433a f2788F = m3780a(new C0435b());

    /* renamed from: H */
    public static final C0433a f2789H = m3780a(new C0439f());

    /* renamed from: G */
    public static final C0433a f2790G = m3780a(new C0438e());

    /* renamed from: l */
    public boolean f2791l = true;

    /* renamed from: q */
    public EnumC0440b f2792q = EnumC0440b.none;

    /* renamed from: a */
    public boolean m3785a() {
        return this.f2774r;
    }

    /* renamed from: b */
    public float m3776b() {
        return this.f2775s;
    }

    /* renamed from: c */
    public boolean m3773c() {
        return this.f2777u;
    }

    /* renamed from: d */
    public boolean m3772d() {
        return this.f2776t;
    }

    /* renamed from: e */
    public static void m3771e() {
        Iterator it = f2783A.iterator();
        while (it.hasNext()) {
            ((C0433a) it.next()).m3769g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = f2783A.iterator();
        while (it2.hasNext()) {
            C0433a c0433a = (C0433a) it2.next();
            if (c0433a.f2759a) {
                arrayList.add(c0433a);
            }
        }
        f2784B = arrayList;
    }

    /* renamed from: f */
    public static ArrayList m3770f() {
        return f2784B;
    }

    /* renamed from: g */
    public void m3769g() {
        if (this.f2777u) {
            this.f2759a = true;
            return;
        }
        C0442d c0442d = null;
        Iterator it = C0458l.f3219d.iterator();
        while (it.hasNext()) {
            C0442d m3556a = ((C0458l) it.next()).m3556a(this);
            if (m3556a != null && (c0442d == null || c0442d.f2800c < m3556a.f2800c)) {
                c0442d = m3556a;
            }
        }
        this.f2759a = c0442d != null;
        if (c0442d != null) {
            this.f2761c = c0442d.f2804g;
            this.f2762d = c0442d.f2805h;
            this.f2763e = c0442d.f2806i;
            this.f2764f = c0442d.f2807j;
            this.f2770m = c0442d.f2801d;
            this.f2771n = c0442d.f2802e;
            this.f2772o = c0442d.f2812o;
            this.f2773p = c0442d.f2813p;
            this.f2792q = c0442d.f2815r;
            this.f2765g = c0442d.f2817t;
            this.f2766h = c0442d.f2818u;
            this.f2767i = c0442d.f2820w;
            this.f2768j = c0442d.f2822y;
            this.f2791l = c0442d.f2814q;
            this.f2769k = c0442d.f2821x;
            this.f2774r = c0442d.f2809l;
            this.f2775s = c0442d.f2810m;
            this.f2778v = c0442d.f2824A;
            this.f2779w = c0442d.f2808k;
            this.f2780x = c0442d.f2816s;
            this.f2781y = c0442d.f2825B;
            this.f2782z = c0442d.f2826C;
        }
    }

    /* renamed from: h */
    public Integer m3768h() {
        return this.f2770m;
    }

    /* renamed from: i */
    public String m3767i() {
        if (this.f2761c == null) {
            return this.f2760b;
        }
        return this.f2761c.m3910b();
    }

    /* renamed from: j */
    public String m3766j() {
        if (this.f2762d != null) {
            return this.f2762d.m3910b();
        }
        return m3767i();
    }

    /* renamed from: a */
    public String m3783a(double d, boolean z) {
        String m2153c;
        if (this.f2772o) {
            m2153c = VariableScope.nullOrMissingString + ((int) d);
        } else {
            m2153c = C0773f.m2153c(d);
        }
        return mo3764a(z) + m3778a(m2153c, this.f2792q) + m3774b(z);
    }

    /* renamed from: a */
    public static String m3778a(String str, EnumC0440b enumC0440b) {
        String str2;
        if (enumC0440b == EnumC0440b.none) {
            return str;
        }
        if (GameEngine.getGameEngine().settingsEngine.disableDigitGrouping) {
            return str;
        }
        String str3 = str;
        String str4 = VariableScope.nullOrMissingString;
        int indexOf = str3.indexOf(".");
        if (indexOf != -1) {
            str4 = str3.substring(indexOf);
            str3 = str3.substring(0, indexOf);
        }
        if (str3.length() <= 3) {
            return str;
        }
        if (enumC0440b == EnumC0440b.space) {
            str2 = " ";
        } else if (enumC0440b == EnumC0440b.comma) {
            str2 = ",";
        } else {
            throw new RuntimeException("Unhandled grouping style: " + enumC0440b);
        }
        StringBuilder sb = new StringBuilder();
        int length = str3.length() % 3;
        if (length != 0) {
            sb.append(str3.substring(0, length));
        }
        for (int i = length; i < str3.length(); i += 3) {
            if (i != 0) {
                sb.append(str2);
            }
            sb.append(str3.substring(i, i + 3));
        }
        if (str4 == VariableScope.nullOrMissingString) {
            return sb.toString();
        }
        return sb.toString() + str4;
    }

    /* renamed from: a */
    public static String m3781a(long j, EnumC0440b enumC0440b) {
        if (enumC0440b == EnumC0440b.none) {
            return VariableScope.nullOrMissingString + j;
        }
        if (enumC0440b == EnumC0440b.space) {
            return String.format(Locale.US, "%,d", Long.valueOf(j)).replace(",", " ");
        }
        if (enumC0440b == EnumC0440b.comma) {
            return String.format(Locale.US, "%,d", Long.valueOf(j));
        }
        throw new RuntimeException("Unhandled grouping style: " + enumC0440b);
    }

    /* renamed from: a */
    public String mo3764a(boolean z) {
        if (this.f2765g != null) {
            return this.f2765g.m3910b();
        }
        if (z && this.f2763e) {
            return VariableScope.nullOrMissingString;
        }
        return m3767i() + ": ";
    }

    /* renamed from: b */
    public String m3774b(boolean z) {
        if (this.f2766h != null) {
            return this.f2766h.m3910b();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: k */
    public C0970e m3765k() {
        return this.f2781y;
    }

    protected C0433a() {
    }

    /* renamed from: a */
    public static C0433a m3779a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator it = f2785C.iterator();
        while (it.hasNext()) {
            C0433a c0433a = (C0433a) it.next();
            if (c0433a.f2760b.equalsIgnoreCase(lowerCase)) {
                return c0433a;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static C0433a m3780a(C0433a c0433a) {
        Iterator it = f2783A.iterator();
        while (it.hasNext()) {
            if (((C0433a) it.next()).f2760b.equals(c0433a.f2760b)) {
                throw new RuntimeException("Built in resource already exists:" + c0433a.f2760b);
            }
        }
        f2783A.add(c0433a);
        f2785C.add(c0433a);
        return c0433a;
    }

    /* renamed from: a */
    public static C0433a m3777a(String str, boolean z, boolean z2) {
        Iterator it = f2783A.iterator();
        while (it.hasNext()) {
            C0433a c0433a = (C0433a) it.next();
            if (c0433a.f2760b.equals(str)) {
                return c0433a;
            }
        }
        C0433a c0433a2 = new C0433a();
        c0433a2.f2760b = str;
        c0433a2.f2777u = z;
        c0433a2.f2776t = z2;
        f2783A.add(c0433a2);
        return c0433a2;
    }

    /* renamed from: b */
    public static C0433a m3775b(String str) {
        Iterator it = f2783A.iterator();
        while (it.hasNext()) {
            C0433a c0433a = (C0433a) it.next();
            if (c0433a.f2760b.equals(str)) {
                return c0433a;
            }
        }
        return null;
    }

    /* renamed from: a */
    private String m3784a(double d) {
        return m3778a(C0773f.m2220a(d, 1), this.f2792q);
    }

    /* renamed from: a */
    public String m3782a(double d, boolean z, boolean z2) {
        String str;
        if (z2 && this.f2764f) {
            str = VariableScope.nullOrMissingString;
        } else {
            str = m3766j() + ": ";
        }
        if (this == f2786D) {
            str = "$";
        }
        if (z) {
            if (d > 0.0d) {
                return "+" + str + m3784a(d);
            }
            return "-" + str + m3784a(-d);
        } else if (d > 0.0d) {
            return str + m3784a(d);
        } else {
            return str + m3784a(d);
        }
    }

    public String toString() {
        return "resource(" + this.f2760b + ")";
    }

    /* renamed from: a */
    public double mo3763a(AbstractC0244am abstractC0244am) {
        if (this.f2776t) {
            return abstractC0244am.f1614bX.m4400c(this);
        }
        return abstractC0244am.m4242a(this);
    }

    /* renamed from: a */
    public void mo3762a(AbstractC0244am abstractC0244am, double d) {
        if (this.f2776t) {
            abstractC0244am.f1614bX.m4450V().m3745a(this, d);
        } else {
            abstractC0244am.mo1748df().m3745a(this, d);
        }
    }

    /* renamed from: b */
    public void mo3761b(AbstractC0244am abstractC0244am, double d) {
        if (this.f2776t) {
            abstractC0244am.f1614bX.m4450V().m3730b(this, d);
        } else {
            abstractC0244am.mo1748df().m3730b(this, d);
        }
    }
}