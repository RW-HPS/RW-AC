package com.corrodinggames.rts.game.units.custom.e;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.gameFramework.f.ae;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Collections;
import java.util.Comparator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e/f.class */
public final class f {

    /* renamed from: a  reason: collision with root package name */
    public static final f f297a = new f().a();
    public final m b = new m();
    boolean c;

    public f a() {
        this.c = true;
        return this;
    }

    public void b() {
        this.b.clear();
    }

    public boolean c() {
        if (this.b.f689a == 0) {
            return true;
        }
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((e) a2[i2]).b != 0.0d) {
                return false;
            }
        }
        return true;
    }

    public double a(a aVar) {
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a == aVar) {
                return eVar.b;
            }
        }
        return 0.0d;
    }

    public double b(a aVar) {
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            e eVar = (e) a2[i3];
            if (eVar.f296a == aVar) {
                i2 = (int) (i2 + eVar.b);
            }
            if (eVar.f296a.v == aVar) {
                i2 = (int) (i2 + eVar.b);
            }
        }
        return i2;
    }

    public void a(f fVar) {
        b();
        b(fVar);
    }

    public void a(a aVar, double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a == aVar) {
                eVar.b = d;
                return;
            }
        }
        e eVar2 = new e(aVar);
        eVar2.b = d;
        this.b.add(eVar2);
    }

    public void a(double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            ((e) a2[i2]).b *= d;
        }
    }

    public void b(a aVar, double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        m mVar = this.b;
        int i = mVar.f689a;
        Object[] a2 = mVar.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a == aVar) {
                eVar.b += d;
                return;
            }
        }
        e eVar2 = new e(aVar);
        eVar2.b = d;
        mVar.add(eVar2);
    }

    public void c(a aVar, double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (d == 0.0d) {
            return;
        }
        m mVar = this.b;
        int i = mVar.f689a;
        Object[] a2 = mVar.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a == aVar) {
                eVar.b += d;
                return;
            }
        }
        e eVar2 = new e(aVar);
        eVar2.b = d;
        mVar.add(eVar2);
    }

    public void d(a aVar, double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        b(aVar, -d);
    }

    public void a(com.corrodinggames.rts.game.units.custom.d.b bVar, double d, double d2) {
        if (bVar.b >= d && bVar.b <= d2) {
            c(a.D, bVar.b);
        }
        a(bVar.k, d, d2);
    }

    public void b(com.corrodinggames.rts.game.units.custom.d.b bVar, double d, double d2) {
        if (bVar.b >= d && bVar.b <= d2) {
            c(a.D, -bVar.b);
        }
        b(bVar.k, d, d2);
    }

    public void a(com.corrodinggames.rts.game.units.custom.d.b bVar) {
        c(a.D, bVar.b);
        b(bVar.k);
    }

    public void b(f fVar) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            b(eVar.f296a, eVar.b);
        }
    }

    public void a(f fVar, double d, double d2) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.b >= d && eVar.b <= d2) {
                b(eVar.f296a, eVar.b);
            }
        }
    }

    public void a(f fVar, double d) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            b(eVar.f296a, eVar.b * d);
        }
    }

    public void c(f fVar) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            d(eVar.f296a, eVar.b);
        }
    }

    public void b(f fVar, double d, double d2) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.b >= d && eVar.b <= d2) {
                d(eVar.f296a, eVar.b);
            }
        }
    }

    public static f a(f fVar, f fVar2) {
        f fVar3 = new f();
        fVar3.b(fVar);
        fVar3.b(fVar2);
        return fVar3;
    }

    public static f b(f fVar, f fVar2) {
        f fVar3 = new f();
        fVar3.b(fVar);
        fVar3.c(fVar2);
        return fVar3;
    }

    public static f b(f fVar, double d) {
        f fVar2 = new f();
        fVar2.a(fVar, d);
        return fVar2;
    }

    public static f d(f fVar) {
        f fVar2 = new f();
        fVar2.b(fVar);
        return fVar2;
    }

    public static int a(f fVar, am amVar) {
        double a2;
        int i = 9999;
        int i2 = fVar.b.f689a;
        Object[] a3 = fVar.b.a();
        for (int i3 = 0; i3 < i2; i3++) {
            e eVar = (e) a3[i3];
            if (eVar.b > 0.0d) {
                if (eVar.f296a.t) {
                    a2 = amVar.bX.c(eVar.f296a);
                } else {
                    a2 = amVar.a(eVar.f296a);
                }
                i = com.corrodinggames.rts.gameFramework.f.c(i, (int) (a2 / eVar.b));
            }
        }
        return i;
    }

    public static boolean b(f fVar, am amVar) {
        double a2;
        int i = fVar.b.f689a;
        Object[] a3 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a3[i2];
            if (eVar.f296a.t) {
                a2 = amVar.bX.c(eVar.f296a);
            } else {
                a2 = amVar.a(eVar.f296a);
            }
            if (eVar.b > a2) {
                return false;
            }
        }
        return true;
    }

    public static boolean a(f fVar, am amVar, double d) {
        double a2;
        int i = fVar.b.f689a;
        Object[] a3 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a3[i2];
            if (eVar.f296a.t) {
                a2 = amVar.bX.c(eVar.f296a);
            } else {
                a2 = amVar.a(eVar.f296a);
            }
            if (eVar.b * d > a2) {
                return false;
            }
        }
        return true;
    }

    public static void c(f fVar, am amVar) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a.t) {
                amVar.bX.V().d(eVar.f296a, eVar.b);
            } else {
                amVar.df().d(eVar.f296a, eVar.b);
            }
        }
    }

    public static void b(f fVar, am amVar, double d) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a.t) {
                amVar.bX.V().d(eVar.f296a, eVar.b * d);
            } else {
                amVar.df().d(eVar.f296a, eVar.b * d);
            }
        }
    }

    public static void d(f fVar, am amVar) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a.t) {
                amVar.bX.V().b(eVar.f296a, eVar.b);
            } else {
                amVar.df().b(eVar.f296a, eVar.b);
            }
        }
    }

    public static void c(f fVar, am amVar, double d) {
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.f296a.t) {
                amVar.bX.V().b(eVar.f296a, eVar.b * d);
            } else {
                amVar.df().b(eVar.f296a, eVar.b * d);
            }
        }
    }

    public static boolean a(f fVar, am amVar, am amVar2) {
        boolean z = false;
        int i = fVar.b.f689a;
        Object[] a2 = fVar.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            a aVar = eVar.f296a;
            double d = eVar.b;
            if (d != 0.0d) {
                double a3 = aVar.a(amVar);
                double a4 = aVar.a(amVar2);
                if (d >= 0.0d) {
                    if (a3 > 0.0d) {
                        double a5 = com.corrodinggames.rts.gameFramework.f.a(a3, d);
                        aVar.b(amVar, -a5);
                        aVar.b(amVar2, a5);
                        z = true;
                    }
                } else if (a4 > 0.0d) {
                    double a6 = com.corrodinggames.rts.gameFramework.f.a(a4, -d);
                    aVar.b(amVar2, -a6);
                    aVar.b(amVar, a6);
                    z = true;
                }
            }
        }
        return z;
    }

    public String a(boolean z, boolean z2, int i, boolean z3, boolean z4) {
        ae aeVar = new ae();
        a(aeVar, z, z2, i, z3, z4, null, 0);
        return aeVar.a();
    }

    public void a(ae aeVar, boolean z, boolean z2, int i, boolean z3, boolean z4, am amVar, int i2) {
        String str;
        int i3 = this.b.f689a;
        if (i3 == 0) {
            return;
        }
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i4 = 0;
        Object[] a2 = this.b.a();
        for (int i5 = 0; i5 < i3; i5++) {
            e eVar = (e) a2[i5];
            if ((eVar.b > 0.0d || z4) && i4 < i) {
                a aVar = eVar.f296a;
                if (z3 || !aVar.a()) {
                    boolean z5 = false;
                    if (aVar.y != null && aVar.z) {
                        z5 = true;
                        int c = aeVar.c() - 2;
                        if (c < 2) {
                            c = 2;
                        }
                        aeVar.a(aVar.y, c * 3, c);
                    }
                    String str2 = aVar.a(eVar.b, false, z5) + str;
                    boolean z6 = false;
                    int i6 = 0;
                    if (aVar.m != null && aVar.n) {
                        z6 = true;
                        i6 = aVar.m.intValue();
                    }
                    if (amVar != null && aVar.a(amVar) < eVar.b) {
                        z6 = true;
                        i6 = i2;
                    }
                    if (z6) {
                        aeVar.a(str2, i6);
                    } else {
                        aeVar.b(str2);
                    }
                    i4++;
                }
            }
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        if (this.b.f689a == 0) {
            gameOutputStream.writeByte(-1);
            return;
        }
        gameOutputStream.writeByte(0);
        gameOutputStream.a((short) this.b.f689a);
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            gameOutputStream.writeString(eVar.f296a.b);
            gameOutputStream.writeDouble(eVar.b);
        }
    }

    public void a(GameInputStream gameInputStream) {
        if (this.c) {
            throw new RuntimeException("StoredResources are locked");
        }
        if (gameInputStream.readByte() == -1) {
            return;
        }
        int readShort = gameInputStream.readShort();
        this.b.clear();
        for (int i = 0; i < readShort; i++) {
            a b = a.b(gameInputStream.readString());
            double readDouble = gameInputStream.readDouble();
            if (b != null && readDouble != 0.0d) {
                this.b.add(new e(b, readDouble));
            }
        }
    }

    public int d() {
        int i = 0;
        int i2 = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i3 = 0; i3 < i2; i3++) {
            if (((e) a2[i3]).b != 0.0d) {
                i++;
            }
        }
        return i;
    }

    public boolean e(f fVar) {
        if (d() != fVar.d()) {
            return false;
        }
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (!com.corrodinggames.rts.gameFramework.f.b(eVar.b, fVar.a(eVar.f296a))) {
                return false;
            }
        }
        return true;
    }

    public boolean f(f fVar) {
        int i = this.b.f689a;
        Object[] a2 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a2[i2];
            if (eVar.b > 0.0d && fVar.b(eVar.f296a) > 0.0d) {
                return true;
            }
        }
        return false;
    }

    public f a(am amVar) {
        double a2;
        f fVar = new f();
        int i = this.b.f689a;
        Object[] a3 = this.b.a();
        for (int i2 = 0; i2 < i; i2++) {
            e eVar = (e) a3[i2];
            if (eVar.f296a.t) {
                a2 = amVar.bX.c(eVar.f296a);
            } else {
                a2 = amVar.a(eVar.f296a);
            }
            if (a2 < eVar.b) {
                fVar.b(eVar.f296a, eVar.b - a2);
            }
        }
        if (fVar.c()) {
            return f297a;
        }
        return fVar;
    }

    public String a(am amVar, String str, int i, boolean z) {
        double a2;
        String str2 = null;
        int i2 = 0;
        int i3 = this.b.f689a;
        Object[] a3 = this.b.a();
        for (int i4 = 0; i4 < i3; i4++) {
            e eVar = (e) a3[i4];
            if (z || !eVar.f296a.a()) {
                if (eVar.f296a.t) {
                    a2 = amVar.bX.c(eVar.f296a);
                } else {
                    a2 = amVar.a(eVar.f296a);
                }
                if (a2 < eVar.b) {
                    double d = eVar.b - a2;
                    String i5 = eVar.f296a.i();
                    if (str2 == null) {
                        str2 = i5;
                    } else {
                        str2 = str2 + str + i5;
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

    public void g(f fVar) {
        b();
        b(fVar);
    }

    public void c(a aVar) {
        m mVar = this.b;
        int i = mVar.f689a;
        Object[] a2 = mVar.a();
        for (int i2 = 0; i2 < i; i2++) {
            if (((e) a2[i2]).f296a == aVar) {
                return;
            }
        }
        e eVar = new e(aVar);
        eVar.b = 0.0d;
        mVar.add(eVar);
    }

    public void e() {
        Collections.sort(this.b, new Comparator() { // from class: com.corrodinggames.rts.game.units.custom.e.f.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(e eVar, e eVar2) {
                if (eVar.f296a == null || eVar2.f296a == null) {
                    return 0;
                }
                return Float.compare(eVar.f296a.x, eVar2.f296a.x);
            }
        });
    }
}