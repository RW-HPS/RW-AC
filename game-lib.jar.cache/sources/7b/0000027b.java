package com.corrodinggames.rts.game.units.custom.d;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.e.e;
import com.corrodinggames.rts.game.units.custom.e.f;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.f.ae;
import com.corrodinggames.rts.gameFramework.f.an;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/b.class */
public class b extends a implements Comparable {
    public int b;
    public float c;
    public float d;
    public float e;
    public int f;
    public int g;
    public int h;
    public int i;
    public int j;
    public f k = m;
    private static final f m = new f().a();

    /* renamed from: a  reason: collision with root package name */
    public static final b f288a = a(0);
    static final int l = Color.a(255, 0, 100, 0);

    public int a() {
        return this.b;
    }

    public int b() {
        if (this.k == m) {
            return this.b;
        }
        int i = this.b;
        int i2 = this.k.b.f689a;
        Object[] a2 = this.k.b.a();
        for (int i3 = 0; i3 < i2; i3++) {
            e eVar = (e) a2[i3];
            if (eVar.b > 0.0d) {
                float b = eVar.f296a.b();
                if (b != 0.0f) {
                    i += (int) (b * eVar.b);
                }
            }
        }
        return i;
    }

    public static b a(b bVar, b bVar2) {
        b bVar3 = new b();
        bVar3.b = bVar.b + bVar2.b;
        bVar3.c = bVar.c + bVar2.c;
        bVar3.d = bVar.d + bVar2.d;
        bVar3.e = bVar.e + bVar2.e;
        bVar3.f = bVar.f + bVar2.f;
        if (!bVar.k.c() || !bVar2.k.c()) {
            bVar3.k = f.a(bVar.k, bVar2.k);
        }
        return bVar3;
    }

    public static b a(b bVar, float f) {
        b bVar2 = new b();
        bVar2.b = (int) (bVar.b * f);
        bVar2.c = bVar.c * f;
        bVar2.d = bVar.d * f;
        bVar2.e = bVar.e * f;
        bVar2.f = (int) (bVar.f * f);
        if (!bVar.k.c()) {
            bVar2.k = f.b(bVar.k, f);
        }
        return bVar2;
    }

    public static b a(int i) {
        b bVar = new b();
        bVar.b = i;
        return bVar;
    }

    public static b a(l lVar, ab abVar, String str, String str2, boolean z) {
        String b = abVar.b(str, str2, (String) null);
        if (b == null && !z) {
            throw new RuntimeException("Could not find " + str2 + " in configuration file under:" + str);
        }
        try {
            return b(lVar, b);
        } catch (bo e) {
            throw new bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    public static b a(l lVar, ab abVar, String str, String str2, b bVar) {
        String b = abVar.b(str, str2, (String) null);
        if (b == null) {
            return bVar;
        }
        try {
            return b(lVar, b);
        } catch (bo e) {
            throw new bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    public static b b(l lVar, ab abVar, String str, String str2, b bVar) {
        String b = abVar.b(str, str2, (String) null);
        if (b == null) {
            return bVar;
        }
        try {
            return a(lVar, b);
        } catch (bo e) {
            throw new bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    public static void b(int i) {
        if (i < 0 || i > 31) {
            throw new bo("Flag id must be between 0-31 (is:" + i + ")");
        }
    }

    public static int a(int i, String str) {
        if (str.contains("-")) {
            String[] c = com.corrodinggames.rts.gameFramework.f.c(str, '-');
            if (c.length != 2) {
                throw new bo("Unexpected flag id: " + str);
            }
            int parseInt = Integer.parseInt(c[0]);
            int parseInt2 = Integer.parseInt(c[1]);
            b(parseInt);
            b(parseInt2);
            if (parseInt2 < parseInt) {
                throw new bo("end<start in flag id: " + str);
            }
            for (int i2 = parseInt; i2 <= parseInt2; i2++) {
                i |= 1 << i2;
            }
            return i;
        }
        int parseInt3 = Integer.parseInt(str);
        b(parseInt3);
        return i | (1 << parseInt3);
    }

    public static b a(l lVar, String str) {
        b b = b(lVar, str);
        if (b != null && b.f != 0) {
            throw new bo("Ammo not supported on streaming price:" + str);
        }
        return b;
    }

    public static b b(l lVar, String str) {
        String trim;
        String trim2;
        if (str == null) {
            return f288a;
        }
        b bVar = new b();
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
                    throw new bo("Unknown price format:" + str);
                }
                try {
                    if (trim.equals("credits")) {
                        bVar.b = Integer.parseInt(trim2);
                    } else if (trim.equals("energy")) {
                        bVar.c = Float.parseFloat(trim2);
                    } else if (trim.equals("hp")) {
                        bVar.d = Float.parseFloat(trim2);
                    } else if (trim.equals("shield")) {
                        bVar.e = Float.parseFloat(trim2);
                    } else if (trim.equals("ammo")) {
                        bVar.f = Integer.parseInt(trim2);
                    } else if (trim.equals("hasFlag")) {
                        bVar.i = a(bVar.i, trim2);
                    } else if (trim.equals("hasMissingFlag")) {
                        bVar.j = a(bVar.j, trim2);
                    } else if (trim.equals("setFlag")) {
                        bVar.g = a(bVar.g, trim2);
                    } else if (trim.equals("unsetFlag")) {
                        bVar.h = a(bVar.h, trim2);
                    } else {
                        com.corrodinggames.rts.game.units.custom.e.a k = lVar.k(trim);
                        if (k != null) {
                            float parseFloat = Float.parseFloat(trim2);
                            if (bVar.k == m) {
                                bVar.k = new f();
                            }
                            bVar.k.a(k, parseFloat);
                        } else {
                            throw new bo("Unknown price type:" + trim);
                        }
                    }
                } catch (NumberFormatException e) {
                    e.printStackTrace();
                    String str3 = "Bad price number:" + trim2 + " in " + str;
                    if (0 != 0) {
                        str3 = str3 + " (Hint: A whole number was expected)";
                    }
                    throw new bo(str3);
                }
            }
        }
        if (bVar.k != m) {
            bVar.k.a();
        }
        if (!bVar.d()) {
            return f288a;
        }
        return bVar;
    }

    public int a(am amVar, boolean z) {
        int i = 9999;
        if (!z && this.b > 0) {
            i = com.corrodinggames.rts.gameFramework.f.c(9999, (int) (amVar.bX.o / this.b));
        }
        if (this.c > 0.0f) {
            i = com.corrodinggames.rts.gameFramework.f.c(i, (int) (amVar.cB / this.c));
        }
        if (this.d > 0.0f) {
            i = com.corrodinggames.rts.gameFramework.f.c(i, (int) (amVar.cu / this.d));
        }
        if (this.e > 0.0f) {
            i = com.corrodinggames.rts.gameFramework.f.c(i, (int) (amVar.cx / this.e));
        }
        if (this.f > 0) {
            i = com.corrodinggames.rts.gameFramework.f.c(i, amVar.cE / this.f);
        }
        if (!this.k.c()) {
            i = com.corrodinggames.rts.gameFramework.f.c(i, f.a(this.k, amVar));
        }
        if (!f(amVar)) {
            i = 0;
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public boolean b(am amVar, double d) {
        if (this.b > 0 && !amVar.bX.a(this.b * d)) {
            return false;
        }
        if (this.c > 0.0f && amVar.cB < this.c * d) {
            return false;
        }
        if (this.d > 0.0f && amVar.cu < this.d * d) {
            return false;
        }
        if (this.e > 0.0f && amVar.cx < this.e * d) {
            return false;
        }
        if ((this.f > 0 && amVar.cE < this.f * d) || !f(amVar)) {
            return false;
        }
        if (!this.k.c() && !f.a(this.k, amVar, d)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public boolean b(am amVar) {
        if (this.b > 0 && !amVar.bX.a(this.b)) {
            return false;
        }
        if (this.c > 0.0f && amVar.cB < this.c) {
            return false;
        }
        if (this.d > 0.0f && amVar.cu < this.d) {
            return false;
        }
        if (this.e > 0.0f && amVar.cx < this.e) {
            return false;
        }
        if ((this.f > 0 && amVar.cE < this.f) || !f(amVar)) {
            return false;
        }
        if (!this.k.c() && !f.b(this.k, amVar)) {
            return false;
        }
        return true;
    }

    public boolean a(am amVar, am amVar2) {
        boolean z = false;
        if (!this.k.c() && f.a(this.k, amVar, amVar2)) {
            z = true;
        }
        return z;
    }

    public static void d(am amVar) {
        if (amVar.cB < 0.0f) {
            amVar.cB = 0.0f;
        }
        if (amVar.cB > amVar.bd()) {
            amVar.cB = amVar.bd();
        }
        if (amVar.cx < 0.0f) {
            amVar.cx = 0.0f;
        }
        if (amVar.cx > amVar.cA) {
            amVar.cx = amVar.cA;
        }
        if (amVar.cu > amVar.cv) {
            amVar.cu = amVar.cv;
        }
        if (amVar.cE < 0) {
            amVar.cE = 0;
        }
    }

    public void e(am amVar) {
        if (this.h != 0) {
            amVar.cF &= this.h ^ (-1);
        }
        if (this.g != 0) {
            amVar.cF |= this.g;
        }
    }

    public int c(int i) {
        if (this.h != 0) {
            i &= this.h ^ (-1);
        }
        if (this.g != 0) {
            i |= this.g;
        }
        return i;
    }

    public static boolean a(int i, int i2) {
        return (i & (1 << i2)) != 0;
    }

    public boolean f(am amVar) {
        if (this.i != 0 && !b(amVar.cF, this.i)) {
            return false;
        }
        if (this.j != 0 && c(amVar.cF, this.j)) {
            return false;
        }
        return true;
    }

    public static boolean b(int i, int i2) {
        return (i2 & i) == i2;
    }

    public static boolean c(int i, int i2) {
        return (i2 & i) != 0;
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public void a(am amVar) {
        amVar.bX.o -= this.b;
        amVar.cB -= this.c;
        amVar.cu -= this.d;
        amVar.cx -= this.e;
        amVar.cE -= this.f;
        e(amVar);
        if (!this.k.c()) {
            f.c(this.k, amVar);
        }
        d(amVar);
    }

    @Override // com.corrodinggames.rts.game.units.custom.d.a
    public void a(am amVar, double d) {
        amVar.bX.o -= this.b * d;
        amVar.cB = (float) (amVar.cB - (this.c * d));
        amVar.cu = (float) (amVar.cu - (this.d * d));
        amVar.cx = (float) (amVar.cx - (this.e * d));
        amVar.cE = (int) (amVar.cE - (this.f * d));
        e(amVar);
        if (!this.k.c()) {
            f.b(this.k, amVar, d);
        }
        d(amVar);
    }

    public void g(am amVar) {
        if (this.b > 0) {
            amVar.bX.b(this.b);
        } else {
            amVar.bX.o += this.b;
        }
        amVar.cB += this.c;
        amVar.cu += this.d;
        amVar.cx += this.e;
        amVar.cE += this.f;
        e(amVar);
        if (!this.k.c()) {
            f.d(this.k, amVar);
        }
        d(amVar);
    }

    public void h(am amVar) {
        amVar.bX.o += this.b;
        amVar.cB += this.c;
        amVar.cu += this.d;
        amVar.cx += this.e;
        amVar.cE += this.f;
        e(amVar);
        if (!this.k.c()) {
            f.d(this.k, amVar);
        }
        d(amVar);
    }

    public void a(am amVar, double d, boolean z) {
        if (z) {
            amVar.bX.o += this.b * d;
        }
        amVar.cB = (float) (amVar.cB + (this.c * d));
        amVar.cu = (float) (amVar.cu + (this.d * d));
        amVar.cx = (float) (amVar.cx + (this.e * d));
        amVar.cE = (int) (amVar.cE + (this.f * d));
        e(amVar);
        if (!this.k.c()) {
            f.c(this.k, amVar, d);
        }
        d(amVar);
    }

    public boolean c() {
        if (this == f288a) {
            return true;
        }
        if (this.b != 0 || this.c != 0.0f || this.d != 0.0f || this.e != 0.0f || this.f != 0 || !this.k.c()) {
            return false;
        }
        return true;
    }

    public boolean d() {
        if (this == f288a) {
            return false;
        }
        if (this.b != 0 || this.c != 0.0f || this.d != 0.0f || this.e != 0.0f || this.f != 0 || this.g != 0 || this.h != 0 || this.i != 0 || this.j != 0 || !this.k.c()) {
            return true;
        }
        return false;
    }

    public boolean e() {
        if (this == f288a) {
            return false;
        }
        if (this.b != 0 || this.c != 0.0f || this.d != 0.0f || this.e != 0.0f || this.f != 0 || this.g != 0 || this.h != 0) {
            return true;
        }
        return false;
    }

    public String a(boolean z, boolean z2, int i, boolean z3) {
        ae aeVar = new ae();
        a(aeVar, z, z2, i, z3);
        return aeVar.a();
    }

    public void a(ae aeVar, boolean z, boolean z2, int i, boolean z3, am amVar, int i2) {
        b(aeVar, z, z2, i, z3, amVar, i2);
    }

    private void a(ae aeVar, boolean z, boolean z2, int i, boolean z3) {
        b(aeVar, z, z2, i, z3, null, 0);
    }

    private void b(ae aeVar, boolean z, boolean z2, int i, boolean z3, am amVar, int i2) {
        String str;
        if (z) {
            str = "\n";
        } else {
            str = " | ";
        }
        int i3 = 0;
        if (this.b > 0 && 0 < i) {
            int i4 = l;
            if (amVar != null && amVar.bX.o < this.b) {
                i4 = i2;
            }
            aeVar.a("$" + this.b + str, i4);
            i3 = 0 + 1;
        }
        if (z2) {
            if (this.c > 0.0f && i3 < i) {
                aeVar.b(com.corrodinggames.rts.gameFramework.f.g(this.c) + " energy" + str);
                i3++;
            }
            if (this.d > 0.0f && i3 < i) {
                aeVar.b(com.corrodinggames.rts.gameFramework.f.g(this.d) + " hp" + str);
                i3++;
            }
            if (this.e > 0.0f && i3 < i) {
                aeVar.b(com.corrodinggames.rts.gameFramework.f.g(this.e) + " shield" + str);
                i3++;
            }
            if (this.f > 0 && i3 < i) {
                aeVar.b(com.corrodinggames.rts.gameFramework.f.g(this.f) + " ammo" + str);
                i3++;
            }
        }
        if (!this.k.c()) {
            this.k.a(aeVar, z, z2, i - i3, z3, false, amVar, i2);
        }
        aeVar.a(str);
    }

    public b i(am amVar) {
        b bVar = new b();
        if (this.b > 0 && amVar.bX.o < this.b) {
            bVar.b = this.b - ((int) amVar.bX.o);
        }
        if (!this.k.c()) {
            bVar.k = this.k.a(amVar);
        }
        return bVar;
    }

    public String a(am amVar, int i, boolean z) {
        String a2;
        String str = null;
        if (this.b > 0 && 0 < i && amVar.bX.o < this.b) {
            if (0 == 0) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "credits, ";
            int i2 = 0 + 1;
        }
        if (!this.k.c() && (a2 = this.k.a(amVar, ", ", i, z)) != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + a2;
        }
        if (str != null) {
            return com.corrodinggames.rts.gameFramework.f.a(str, ", ");
        }
        return null;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(b bVar) {
        return this.b - bVar.b;
    }

    public static void a(GameOutputStream gameOutputStream, b bVar) {
        gameOutputStream.writeBoolean(bVar != null);
        if (bVar != null) {
            bVar.a(gameOutputStream);
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        boolean z = false;
        boolean z2 = false;
        if (this.c != 0.0f || this.d != 0.0f || this.e != 0.0f || this.f != 0) {
            z = true;
        }
        if (this.g != 0 || this.h != 0 || this.i != 0 || this.j != 0) {
            z = true;
        }
        if (!this.k.c()) {
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
        gameOutputStream.writeInt(this.b);
        if (z) {
            gameOutputStream.writeFloat(this.c);
            gameOutputStream.writeFloat(this.d);
            gameOutputStream.writeFloat(this.e);
            gameOutputStream.writeInt(this.f);
            gameOutputStream.writeInt(this.g);
            gameOutputStream.writeInt(this.h);
            gameOutputStream.writeInt(this.i);
            gameOutputStream.writeInt(this.j);
        }
        if (z2) {
            this.k.a(gameOutputStream);
        }
    }

    public static b a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            return b(gameInputStream);
        }
        return null;
    }

    public static b b(GameInputStream gameInputStream) {
        b bVar = new b();
        byte readByte = gameInputStream.readByte();
        boolean b = b(readByte, 1);
        boolean b2 = b(readByte, 2);
        bVar.b = gameInputStream.readInt();
        if (b) {
            bVar.c = gameInputStream.readFloat();
            bVar.d = gameInputStream.readFloat();
            bVar.e = gameInputStream.readFloat();
            bVar.f = gameInputStream.readInt();
            bVar.g = gameInputStream.readInt();
            bVar.h = gameInputStream.readInt();
            bVar.i = gameInputStream.readInt();
            bVar.j = gameInputStream.readInt();
        }
        if (b2) {
            bVar.k = new f();
            bVar.k.a(gameInputStream);
        }
        return bVar;
    }

    public boolean b(am amVar, boolean z) {
        if (c(amVar, z)) {
            d(amVar, z);
            return true;
        }
        return false;
    }

    public boolean c(am amVar, boolean z) {
        if (this.b > 0 && !amVar.bX.g(this.b)) {
            return false;
        }
        if (z) {
            return an.c(amVar, this);
        }
        return b(amVar);
    }

    public void d(am amVar, boolean z) {
        amVar.bX.p -= this.b;
        amVar.bX.q = 0;
        if (z) {
            an.a(amVar, this);
        }
    }

    public void e(am amVar, boolean z) {
        amVar.bX.p += this.b;
        amVar.bX.q = 0;
        if (z) {
            an.b(amVar, this);
        }
    }

    public static boolean b(b bVar, b bVar2) {
        if (bVar2 == bVar) {
            return true;
        }
        if (bVar2 == null || bVar == null) {
            return false;
        }
        return bVar2.b(bVar);
    }

    public boolean b(b bVar) {
        if (this.b != bVar.b || this.d != bVar.d || this.e != bVar.e || this.f != bVar.f || this.k.c() != bVar.k.c()) {
            return false;
        }
        if (!this.k.c() && !bVar.k.c() && !this.k.e(bVar.k)) {
            return false;
        }
        return true;
    }

    public boolean c(b bVar) {
        if (this.b > 0 && bVar.b > 0) {
            return true;
        }
        if (this.d > 0.0f && bVar.d > 0.0f) {
            return true;
        }
        if (this.e > 0.0f && bVar.e > 0.0f) {
            return true;
        }
        if (this.f > 0 && bVar.f > 0) {
            return true;
        }
        if (!this.k.c() && !bVar.k.c() && this.k.f(bVar.k)) {
            return true;
        }
        return false;
    }
}