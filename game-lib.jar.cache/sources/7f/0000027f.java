package com.corrodinggames.rts.game.units.custom.e;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/a.class */
public class a {
    public boolean a;
    protected String b;
    protected bb c;
    protected bb d;
    protected boolean e;
    protected boolean f;
    protected bb g;
    protected bb h;
    public a i;
    public boolean j;
    public boolean k;
    Integer m;
    public boolean n;
    public boolean o;
    public boolean p;
    boolean r;
    float s;
    protected boolean t;
    protected boolean u;
    a v;
    public boolean w;
    public float x;
    public com.corrodinggames.rts.gameFramework.unitAction.e y;
    public boolean z;
    static ArrayList A = new ArrayList();
    static ArrayList B = new ArrayList();
    public static ArrayList C = new ArrayList();
    public static final a D = a(new com.corrodinggames.rts.game.units.custom.e.a.c());
    public static final a E = a(new com.corrodinggames.rts.game.units.custom.e.a.d());
    public static final a F = a(new com.corrodinggames.rts.game.units.custom.e.a.b());
    public static final a H = a(new com.corrodinggames.rts.game.units.custom.e.a.f());
    public static final a G = a(new com.corrodinggames.rts.game.units.custom.e.a.e());
    public boolean l = true;
    public b q = b.none;

    public boolean a() {
        return this.r;
    }

    public float b() {
        return this.s;
    }

    public boolean c() {
        return this.u;
    }

    public boolean d() {
        return this.t;
    }

    public static void e() {
        Iterator it = A.iterator();
        while (it.hasNext()) {
            ((a) it.next()).g();
        }
        ArrayList arrayList = new ArrayList();
        Iterator it2 = A.iterator();
        while (it2.hasNext()) {
            a aVar = (a) it2.next();
            if (aVar.a) {
                arrayList.add(aVar);
            }
        }
        B = arrayList;
    }

    public static ArrayList f() {
        return B;
    }

    public void g() {
        if (this.u) {
            this.a = true;
            return;
        }
        d dVar = null;
        Iterator it = l.d.iterator();
        while (it.hasNext()) {
            d a = ((l) it.next()).a(this);
            if (a != null && (dVar == null || dVar.c < a.c)) {
                dVar = a;
            }
        }
        this.a = dVar != null;
        if (dVar != null) {
            this.c = dVar.g;
            this.d = dVar.h;
            this.e = dVar.i;
            this.f = dVar.j;
            this.m = dVar.d;
            this.n = dVar.e;
            this.o = dVar.o;
            this.p = dVar.p;
            this.q = dVar.r;
            this.g = dVar.t;
            this.h = dVar.u;
            this.i = dVar.w;
            this.j = dVar.y;
            this.l = dVar.q;
            this.k = dVar.x;
            this.r = dVar.l;
            this.s = dVar.m;
            this.v = dVar.A;
            this.w = dVar.k;
            this.x = dVar.s;
            this.y = dVar.B;
            this.z = dVar.C;
        }
    }

    public Integer h() {
        return this.m;
    }

    public String i() {
        if (this.c == null) {
            return this.b;
        }
        return this.c.b();
    }

    public String j() {
        if (this.d != null) {
            return this.d.b();
        }
        return i();
    }

    public String a(double d, boolean z) {
        String c;
        if (this.o) {
            c = VariableScope.nullOrMissingString + ((int) d);
        } else {
            c = com.corrodinggames.rts.gameFramework.f.c(d);
        }
        return a(z) + a(c, this.q) + b(z);
    }

    public static String a(String str, b bVar) {
        String str2;
        if (bVar == b.none) {
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
        if (bVar == b.space) {
            str2 = " ";
        } else if (bVar == b.comma) {
            str2 = ",";
        } else {
            throw new RuntimeException("Unhandled grouping style: " + bVar);
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

    public static String a(long j, b bVar) {
        if (bVar == b.none) {
            return VariableScope.nullOrMissingString + j;
        }
        if (bVar == b.space) {
            return String.format(Locale.US, "%,d", Long.valueOf(j)).replace(",", " ");
        }
        if (bVar == b.comma) {
            return String.format(Locale.US, "%,d", Long.valueOf(j));
        }
        throw new RuntimeException("Unhandled grouping style: " + bVar);
    }

    public String a(boolean z) {
        if (this.g != null) {
            return this.g.b();
        }
        if (z && this.e) {
            return VariableScope.nullOrMissingString;
        }
        return i() + ": ";
    }

    public String b(boolean z) {
        if (this.h != null) {
            return this.h.b();
        }
        return VariableScope.nullOrMissingString;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e k() {
        return this.y;
    }

    protected a() {
    }

    public static a a(String str) {
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        Iterator it = C.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.b.equalsIgnoreCase(lowerCase)) {
                return aVar;
            }
        }
        return null;
    }

    public static a a(a aVar) {
        Iterator it = A.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).b.equals(aVar.b)) {
                throw new RuntimeException("Built in resource already exists:" + aVar.b);
            }
        }
        A.add(aVar);
        C.add(aVar);
        return aVar;
    }

    public static a a(String str, boolean z, boolean z2) {
        Iterator it = A.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.b.equals(str)) {
                return aVar;
            }
        }
        a aVar2 = new a();
        aVar2.b = str;
        aVar2.u = z;
        aVar2.t = z2;
        A.add(aVar2);
        return aVar2;
    }

    public static a b(String str) {
        Iterator it = A.iterator();
        while (it.hasNext()) {
            a aVar = (a) it.next();
            if (aVar.b.equals(str)) {
                return aVar;
            }
        }
        return null;
    }

    private String a(double d) {
        return a(com.corrodinggames.rts.gameFramework.f.a(d, 1), this.q);
    }

    public String a(double d, boolean z, boolean z2) {
        String str;
        if (z2 && this.f) {
            str = VariableScope.nullOrMissingString;
        } else {
            str = j() + ": ";
        }
        if (this == D) {
            str = "$";
        }
        if (z) {
            if (d > 0.0d) {
                return "+" + str + a(d);
            }
            return "-" + str + a(-d);
        } else if (d > 0.0d) {
            return str + a(d);
        } else {
            return str + a(d);
        }
    }

    public String toString() {
        return "resource(" + this.b + ")";
    }

    public double a(am amVar) {
        if (this.t) {
            return amVar.bX.c(this);
        }
        return amVar.a(this);
    }

    public void a(am amVar, double d) {
        if (this.t) {
            amVar.bX.V().a(this, d);
        } else {
            amVar.df().a(this, d);
        }
    }

    public void b(am amVar, double d) {
        if (this.t) {
            amVar.bX.V().b(this, d);
        } else {
            amVar.df().b(this, d);
        }
    }
}