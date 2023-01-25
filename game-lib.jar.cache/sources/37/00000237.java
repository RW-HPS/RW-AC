package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/as.class */
public class C0361as implements Cloneable {

    /* renamed from: a */
    public boolean f2254a;

    /* renamed from: b */
    public float f2255b;

    /* renamed from: c */
    public int f2256c;

    /* renamed from: d */
    public float f2257d;

    /* renamed from: e */
    public float f2258e = 1.0f;

    /* renamed from: f */
    public float f2259f = 1.0f;

    /* renamed from: g */
    public int f2260g;

    /* renamed from: h */
    public float f2261h;

    /* renamed from: i */
    public float f2262i;

    /* renamed from: j */
    public float f2263j;

    /* renamed from: k */
    public float f2264k;

    /* renamed from: l */
    public float f2265l;

    /* renamed from: m */
    public boolean f2266m;

    /* renamed from: n */
    public int f2267n;

    /* renamed from: o */
    public int f2268o;

    /* renamed from: p */
    public float f2269p;

    /* renamed from: q */
    public float f2270q;

    /* renamed from: r */
    public float f2271r;

    /* renamed from: s */
    static LinkedHashMap f2272s = new LinkedHashMap();

    /* renamed from: t */
    static LinkedHashMap f2273t;

    public C0361as(boolean z) {
        this.f2254a = z;
    }

    /* renamed from: a */
    public static VariableScope.CachedWriter m3971a(String str, C0458l c0458l, String str2, String str3) {
        try {
            return VariableScope.CachedWriter.create(str, new C0382au(c0458l));
        } catch (C0417bo e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0361as clone() {
        try {
            C0361as c0361as = (C0361as) super.clone();
            c0361as.f2254a = false;
            return c0361as;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m3969a(LinkedHashMap linkedHashMap, AbstractC0381at abstractC0381at) {
        linkedHashMap.put(abstractC0381at.f2275b, abstractC0381at);
    }

    static {
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "mass") { // from class: com.corrodinggames.rts.game.units.custom.as.1
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2255b;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2255b = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "maxenergy") { // from class: com.corrodinggames.rts.game.units.custom.as.12
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2257d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2257d = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0385ax(f2272s.size(), "energy") { // from class: com.corrodinggames.rts.game.units.custom.as.13
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: a */
            public double mo3963a(C0456j c0456j) {
                return c0456j.f1644cB;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: b */
            public void mo3959b(C0456j c0456j, double d) {
                c0456j.f1644cB = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.f1644cB = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "maxhp") { // from class: com.corrodinggames.rts.game.units.custom.as.14
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2256c;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2256c = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.f1638cv = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0385ax(f2272s.size(), "hp") { // from class: com.corrodinggames.rts.game.units.custom.as.15
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: a */
            public double mo3963a(C0456j c0456j) {
                return c0456j.f1637cu;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: b */
            public void mo3959b(C0456j c0456j, double d) {
                c0456j.f1637cu = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.m4195o((float) d);
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "maxshield") { // from class: com.corrodinggames.rts.game.units.custom.as.16
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2260g;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2260g = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.f1643cA = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0385ax(f2272s.size(), "shield") { // from class: com.corrodinggames.rts.game.units.custom.as.17
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: a */
            public double mo3963a(C0456j c0456j) {
                return c0456j.f1640cx;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax
            /* renamed from: b */
            public void mo3959b(C0456j c0456j, double d) {
                c0456j.f1640cx = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0385ax, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.f1640cx = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "shieldregen") { // from class: com.corrodinggames.rts.game.units.custom.as.18
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2261h;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2261h = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "armour") { // from class: com.corrodinggames.rts.game.units.custom.as.19
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2265l;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2265l = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "maxattackrange") { // from class: com.corrodinggames.rts.game.units.custom.as.2
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2262i;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2262i = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "shootdelaymultiplier") { // from class: com.corrodinggames.rts.game.units.custom.as.3
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2258e;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2258e = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                super.mo3962a(c0456j, d);
                c0456j.m2965aW();
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "shootdamagemultiplier") { // from class: com.corrodinggames.rts.game.units.custom.as.4
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2259f;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2259f = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "movespeed") { // from class: com.corrodinggames.rts.game.units.custom.as.5
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2263j;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2263j = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "maxturnspeed") { // from class: com.corrodinggames.rts.game.units.custom.as.6
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2264k;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2264k = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "fogofwarsightrange") { // from class: com.corrodinggames.rts.game.units.custom.as.7
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2267n;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2267n = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw, com.corrodinggames.rts.game.units.custom.AbstractC0381at
            /* renamed from: a */
            public void mo3962a(C0456j c0456j, double d) {
                int mo2831s = c0456j.mo2831s();
                super.mo3962a(c0456j, d);
                if (c0456j.mo2831s() > mo2831s && !c0456j.f3978ax) {
                    c0456j.mo2880c(false);
                }
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "nanorange") { // from class: com.corrodinggames.rts.game.units.custom.as.8
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2268o;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2268o = (int) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "selfregenrate") { // from class: com.corrodinggames.rts.game.units.custom.as.9
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2269p;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2269p = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "targetHeight") { // from class: com.corrodinggames.rts.game.units.custom.as.10
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2270q;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2270q = (float) d;
            }
        });
        m3969a(f2272s, new AbstractC0384aw(f2272s.size(), "nanoFactorySpeed") { // from class: com.corrodinggames.rts.game.units.custom.as.11
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public double mo3965a(C0361as c0361as) {
                return c0361as.f2271r;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0384aw
            /* renamed from: a */
            public void mo3964a(C0361as c0361as, double d) {
                c0361as.f2271r = (float) d;
            }
        });
        f2273t = new LinkedHashMap();
        for (String str : f2272s.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            AbstractC0381at abstractC0381at = (AbstractC0381at) f2272s.get(str);
            if (!abstractC0381at.mo3960b()) {
                f2273t.put(str, abstractC0381at);
            }
        }
    }

    /* renamed from: b */
    public C0361as m3968b() {
        C0361as clone = clone();
        clone.f2254a = false;
        return clone;
    }

    /* renamed from: a */
    public static AbstractC0381at m3977a(int i) {
        for (AbstractC0381at abstractC0381at : f2272s.values()) {
            if (i == abstractC0381at.f2274a) {
                return abstractC0381at;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m3974a(C0456j c0456j, C0361as c0361as, AbstractC0381at[] abstractC0381atArr) {
        for (AbstractC0381at abstractC0381at : abstractC0381atArr) {
            double mo3961a = abstractC0381at.mo3961a(c0456j, c0456j.f2892y);
            double mo3961a2 = abstractC0381at.mo3961a(c0456j, c0361as);
            if (mo3961a != mo3961a2) {
                c0456j.m3601dJ();
                abstractC0381at.mo3962a(c0456j, mo3961a2);
            }
        }
    }

    /* renamed from: a */
    public static void m3975a(C0456j c0456j, C0361as c0361as, C0458l c0458l) {
        if (!(c0361as != c0458l.f3126cL)) {
            return;
        }
        for (String str : f2273t.keySet()) {
            AbstractC0381at abstractC0381at = (AbstractC0381at) f2273t.get(str);
            double mo3961a = abstractC0381at.mo3961a(c0456j, c0458l.f3126cL);
            double mo3961a2 = abstractC0381at.mo3961a(c0456j, c0361as);
            if (mo3961a != mo3961a2) {
                c0456j.m3601dJ();
                abstractC0381at.mo3962a(c0456j, mo3961a2);
            }
        }
    }

    /* renamed from: a */
    public static void m3976a(C0361as c0361as, C0456j c0456j, GameOutputStream gameOutputStream) {
        C0458l c0458l = c0456j.f2891x;
        if (!(c0361as != c0458l.f3126cL)) {
            gameOutputStream.writeBoolean(true);
            return;
        }
        gameOutputStream.writeBoolean(false);
        short s = 0;
        for (String str : f2273t.keySet()) {
            AbstractC0381at abstractC0381at = (AbstractC0381at) f2273t.get(str);
            if (abstractC0381at.mo3961a(c0456j, c0458l.f3126cL) != abstractC0381at.mo3961a(c0456j, c0361as)) {
                s = (short) (s + 1);
            }
        }
        gameOutputStream.mo1331a(s);
        int i = 0;
        for (String str2 : f2273t.keySet()) {
            AbstractC0381at abstractC0381at2 = (AbstractC0381at) f2273t.get(str2);
            double mo3961a = abstractC0381at2.mo3961a(c0456j, c0458l.f3126cL);
            double mo3961a2 = abstractC0381at2.mo3961a(c0456j, c0361as);
            if (mo3961a != mo3961a2) {
                i++;
                if (s < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s) + ">" + i);
                }
                gameOutputStream.mo1331a((short) abstractC0381at2.f2274a);
                gameOutputStream.writeDouble(mo3961a2);
                gameOutputStream.writeDouble(mo3961a);
            }
        }
    }

    /* renamed from: a */
    public static void m3973a(C0456j c0456j, GameInputStream gameInputStream, int i) {
        C0458l c0458l = c0456j.f2891x;
        if (gameInputStream.readBoolean()) {
            return;
        }
        int readShort = gameInputStream.readShort();
        for (int i2 = 0; i2 < readShort; i2++) {
            short readShort2 = gameInputStream.readShort();
            double readDouble = gameInputStream.readDouble();
            gameInputStream.readDouble();
            AbstractC0381at m3977a = m3977a(readShort2);
            if (m3977a == null) {
                throw new IOException("Field " + ((int) readShort2) + " doesn't exist");
            }
            c0456j.m3601dJ();
            m3977a.mo3962a(c0456j, readDouble);
        }
    }

    /* renamed from: a */
    public static AbstractC0381at[] m3972a(C1107ab c1107ab, String str, String str2, AbstractC0381at[] abstractC0381atArr) {
        try {
            return m3970a(c1107ab.m666b(str, str2, (String) null), abstractC0381atArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static AbstractC0381at[] m3970a(String str, AbstractC0381at[] abstractC0381atArr) {
        if (str == null) {
            return abstractC0381atArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : C0773f.m2145c(str, ',')) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            AbstractC0381at abstractC0381at = (AbstractC0381at) f2273t.get(lowerCase);
            if (arrayList.contains(abstractC0381at)) {
                throw new RuntimeException("Value: " + lowerCase + " is repeated");
            }
            if (abstractC0381at == null) {
                String str3 = VariableScope.nullOrMissingString;
                for (String str4 : f2273t.keySet()) {
                    if (!str3.equals(VariableScope.nullOrMissingString)) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + str4;
                }
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + C0773f.m2157b(str3, 100) + ")");
            }
            arrayList.add(abstractC0381at);
        }
        return (AbstractC0381at[]) arrayList.toArray(new AbstractC0381at[0]);
    }
}