package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Point;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.game.maps.Layer;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.ak;
import com.corrodinggames.rts.gameFramework.utility.g;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.k.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/i.class */
public final class i {
    private final PathEngine q;
    ao a;
    public final int b;
    public final int c;
    public byte[] d;
    public byte[] e;
    public byte[] f;
    public short[] g;
    public HashMap h;
    public int i;
    public byte[] j;
    public boolean m;
    public boolean o;
    public int p;
    public int k = -99;
    public int l = 0;
    Point n = new Point();

    i(PathEngine pathEngine, ao aoVar, int i, int i2) {
        this.b = i;
        this.c = i2;
        this.q = pathEngine;
        this.a = aoVar;
        this.d = new byte[i * i2];
        this.q.u.add(this);
        this.q.v = (i[]) this.q.u.toArray(new i[0]);
        a();
    }

    void a() {
        d();
        c(null);
        e();
    }

    void a(y yVar) {
        double a;
        if (yVar != null) {
            this.l++;
            if (this.l > 50) {
                if (!this.m) {
                    GameEngine.m5e("buildAndReplaceClearanceCost being skipped");
                }
                this.m = true;
                return;
            }
        }
        if (yVar != null) {
            b(yVar);
            return;
        }
        long j = 0;
        if (yVar == null) {
            j = Unit.loadAllUnitsTook();
        }
        b bVar = this.q.q;
        byte[] bArr = this.j;
        if (this.j == null) {
            yVar = null;
        }
        this.j = new byte[this.b * this.c];
        short s = 0;
        short s2 = 0;
        short s3 = this.q.s;
        short s4 = this.q.t;
        if (yVar != null) {
            if (bArr != null) {
                f.a(bArr, this.j);
            }
            bVar.a(yVar.eo, yVar.ep);
            Rect cc = yVar.cc();
            short s5 = (short) bVar.T;
            short s6 = (short) bVar.U;
            s = (short) ((s5 - 5) + cc.a);
            s2 = (short) ((s6 - 5) + cc.b);
            s3 = (short) (s5 + 5 + cc.c);
            s4 = (short) (s6 + 5 + cc.d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.q.s) {
            s3 = this.q.s;
        }
        if (s4 > this.q.t) {
            s4 = this.q.t;
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
                    if (this.d[(s8 * this.c) + s10] == -1) {
                        z = true;
                    }
                    if (this.e[(s8 * this.c) + s10] == -1) {
                        z = true;
                    }
                    if (z) {
                        this.j[(s8 * this.c) + s10] = 0;
                    } else {
                        this.j[(s8 * this.c) + s10] = 4;
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
                    if (this.j[(s12 * this.c) + s14] == 0) {
                        a(bVar, s12, s14, this.j);
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
            a(bVar, s16, (short) -1, this.j);
            a(bVar, s16, (short) (this.q.t + 1), this.j);
            s15 = (short) (s16 + 1);
        }
        short s17 = s2;
        while (true) {
            short s18 = s17;
            if (s18 >= s4) {
                break;
            }
            a(bVar, (short) -1, s18, this.j);
            a(bVar, (short) (this.q.s + 1), s18, this.j);
            s17 = (short) (s18 + 1);
        }
        if (yVar == null) {
            if (Unit.a(j) > 30.0d) {
                GameEngine.m5e("buildAndReplaceClearanceCostNew took:" + Unit.a(a) + " for:" + this.a);
            }
        }
    }

    final void a(b bVar, short s, short s2, byte[] bArr) {
        int a;
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
        if (i3 > bVar.width - 1) {
            i3 = bVar.width - 1;
        }
        if (i4 > bVar.height - 1) {
            i4 = bVar.height - 1;
        }
        for (int i5 = i; i5 <= i3; i5++) {
            for (int i6 = i2; i6 <= i4; i6++) {
                byte b = bArr[(i5 * this.c) + i6];
                if (b != 0 && (a = f.a((int) s, (int) s2, i5, i6)) < b) {
                    bArr[(i5 * this.c) + i6] = (byte) a;
                }
            }
        }
    }

    void b(y yVar) {
        long j = 0;
        if (yVar == null) {
            j = Unit.loadAllUnitsTook();
        }
        b bVar = this.q.q;
        byte[] bArr = this.j;
        if (this.j == null) {
            yVar = null;
        }
        this.j = new byte[this.b * this.c];
        short s = 0;
        short s2 = 0;
        short s3 = this.q.s;
        short s4 = this.q.t;
        if (yVar != null) {
            if (bArr != null) {
                f.a(bArr, this.j);
            }
            bVar.a(yVar.eo, yVar.ep);
            Rect cc = yVar.cc();
            short s5 = (short) bVar.T;
            short s6 = (short) bVar.U;
            s = (short) ((s5 - 5) + cc.a);
            s2 = (short) ((s6 - 5) + cc.b);
            s3 = (short) (s5 + 5 + cc.c);
            s4 = (short) (s6 + 5 + cc.d);
        }
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s3 > this.q.s) {
            s3 = this.q.s;
        }
        if (s4 > this.q.t) {
            s4 = this.q.t;
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
                    this.j[(s8 * this.c) + s10] = a(bVar, s8, s10);
                    s9 = (short) (s10 + 1);
                }
            }
            s7 = (short) (s8 + 1);
        }
        if (yVar == null) {
            GameEngine.m5e("buildAndReplaceClearanceCost took:" + Unit.a(Unit.a(j)) + " for:" + this.a);
        }
    }

    final byte a(b bVar, short s, short s2) {
        int a;
        if (this.d[(s * this.c) + s2] == -1) {
            return (byte) 0;
        }
        int i = s2 - 3;
        int i2 = s + 3;
        int i3 = s2 + 3;
        int i4 = 4;
        for (int i5 = s - 3; i5 <= i2; i5++) {
            for (int i6 = i; i6 <= i3; i6++) {
                boolean z = false;
                if (bVar.c(i5, i6)) {
                    if (this.d[(i5 * this.c) + i6] == -1) {
                        z = true;
                    }
                    if (this.e[(i5 * this.c) + i6] == -1) {
                        z = true;
                    }
                } else {
                    z = true;
                }
                if (z && (a = f.a((int) s, (int) s2, i5, i6)) < i4) {
                    i4 = a;
                }
            }
        }
        return (byte) i4;
    }

    void b() {
        int i = this.b;
        int i2 = this.c;
        this.g = new short[i * i2];
        this.h = new HashMap();
        short s = 1;
        short s2 = 0;
        while (true) {
            short s3 = s2;
            if (s3 < i) {
                short s4 = 0;
                while (true) {
                    short s5 = s4;
                    if (s5 < i2) {
                        if (this.g[(s3 * i2) + s5] == 0) {
                            if (s <= 0) {
                                Log.d("RustedWarfare", "warning buildIsolatedGroups looped, ending");
                                return;
                            }
                            int a = a(s3, s5, s);
                            if (a > 0) {
                                this.h.put(Short.valueOf(s), Integer.valueOf(a));
                                if (this.i < a) {
                                    this.i = a;
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

    int a(short s, short s2, short s3) {
        int i = this.c;
        b bVar = this.q.q;
        short[] sArr = this.g;
        byte[] bArr = this.d;
        if (bArr[(s * i) + s2] == -1) {
            sArr[(s * i) + s2] = -1;
            return 0;
        } else if (s3 == 0) {
            throw new RuntimeException("id cannot be 0 is will cause can endless loop");
        } else {
            int i2 = 0;
            g gVar = new g();
            gVar.add(new ak(s, s2));
            while (!gVar.isEmpty()) {
                ak akVar = (ak) gVar.a();
                short s4 = akVar.a;
                short s5 = akVar.b;
                if (bVar.c((int) s4, (int) s5)) {
                    int i3 = (s4 * i) + s5;
                    if (sArr[i3] == 0 && bArr[i3] != -1) {
                        sArr[i3] = s3;
                        i2++;
                        gVar.add(new ak((short) (s4 - 1), s5));
                        gVar.add(new ak((short) (s4 + 1), s5));
                        gVar.add(new ak(s4, (short) (s5 - 1)));
                        gVar.add(new ak(s4, (short) (s5 + 1)));
                    }
                }
            }
            return i2;
        }
    }

    boolean c() {
        return (this.a.equals(ao.AIR) || this.a.equals(ao.NONE)) ? false : true;
    }

    public static int a(b bVar) {
        Layer layer = bVar.u;
        int i = 0;
        for (int i2 = 0; i2 < layer.n; i2++) {
            for (int i3 = 0; i3 < layer.o; i3++) {
                com.corrodinggames.rts.game.maps.g a = layer.a(i2, i3);
                if (a != null) {
                    i += (0 + (a.e ? 1 : 0) + (a.h ? 2 : 0) + (a.k ? 4 : 0) + (a.g ? 8 : 0) + (a.f ? 16 : 0)) * (i2 + i3);
                }
            }
        }
        return i;
    }

    void d() {
        b bVar = this.q.q;
        byte[] bArr = this.d;
        short[] a = bVar.u.a();
        com.corrodinggames.rts.game.maps.g[] gVarArr = bVar.B;
        ao aoVar = this.a;
        int i = this.b;
        int i2 = this.c;
        if (!c()) {
            return;
        }
        boolean z = aoVar.equals(ao.WATER) || aoVar.equals(ao.HOVER) || aoVar.equals(ao.OVER_CLIFF_WATER);
        boolean z2 = aoVar.equals(ao.HOVER) || aoVar.equals(ao.OVER_CLIFF) || aoVar.equals(ao.OVER_CLIFF_WATER);
        boolean z3 = aoVar.equals(ao.OVER_CLIFF) || aoVar.equals(ao.OVER_CLIFF_WATER);
        for (int i3 = 0; i3 < i; i3++) {
            for (int i4 = 0; i4 < i2; i4++) {
                int i5 = (i3 * i2) + i4;
                bArr[i5] = 0;
                com.corrodinggames.rts.game.maps.g gVar = gVarArr[a[i5]];
                if (gVar != null) {
                    if (gVar.e && !z) {
                        bArr[i5] = -1;
                    }
                    if (gVar.h && !z2) {
                        bArr[i5] = -1;
                    }
                    if (gVar.k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (gVar.g && 0 == 0) {
                        bArr[i5] = -1;
                    }
                    if (aoVar == ao.WATER && !gVar.e && !gVar.f) {
                        bArr[i5] = -1;
                    }
                }
                com.corrodinggames.rts.game.maps.g e = bVar.e(i3, i4);
                if (e != null) {
                    if (aoVar == ao.LAND && e.i) {
                        bArr[i5] = -1;
                    }
                    if (e.k && !z3) {
                        bArr[i5] = -1;
                    }
                    if (bArr[i5] == 0) {
                        bArr[i5] = e.j;
                    }
                }
                if (gVar != null && bArr[i5] == 0) {
                    bArr[i5] = gVar.j;
                }
            }
        }
        if (bVar.x != null) {
            for (int i6 = 0; i6 < i; i6++) {
                for (int i7 = 0; i7 < i2; i7++) {
                    com.corrodinggames.rts.game.maps.g a2 = bVar.x.a(i6, i7);
                    if (a2 != null) {
                        bArr[(i6 * i2) + i7] = 0;
                        if (a2.e && !z) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (a2.h && !z2) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (a2.k && !z3) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (a2.g && 0 == 0) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                        if (bArr[(i6 * i2) + i7] == 0) {
                            bArr[(i6 * i2) + i7] = a2.j;
                        }
                        if (aoVar == ao.WATER && !a2.e && !a2.f) {
                            bArr[(i6 * i2) + i7] = -1;
                        }
                    }
                }
            }
        }
    }

    public void c(y yVar) {
        Rect cc;
        if (yVar != null) {
            this.p++;
            if (this.p > 50) {
                this.o = true;
                return;
            }
        }
        GameEngine.V();
        this.e = new byte[this.b * this.c];
        byte[] bArr = this.e;
        if (this.a.equals(ao.AIR)) {
            return;
        }
        b bVar = this.q.q;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i = 0; i < size; i++) {
            am amVar = a[i];
            if (amVar.bI() && !amVar.bV) {
                Point a2 = amVar.a(bVar, this.n);
                int i2 = a2.a;
                int i3 = a2.b;
                if (this.a.equals(ao.BUILDING)) {
                    cc = amVar.cd();
                } else {
                    cc = amVar.cc();
                }
                for (int i4 = i2 + cc.a; i4 <= i2 + cc.c; i4++) {
                    for (int i5 = i3 + cc.b; i5 <= i3 + cc.d; i5++) {
                        if (bVar.c(i4, i5)) {
                            bArr[(i4 * this.c) + i5] = -1;
                        }
                    }
                }
            }
        }
    }

    public void e() {
        byte[] bArr;
        GameEngine.V();
        int i = this.c;
        this.f = new byte[this.b * i];
        if (this.a.equals(ao.AIR)) {
            return;
        }
        b bVar = this.q.q;
        int i2 = bVar.p;
        int i3 = bVar.q;
        am[] a = am.bE.a();
        int size = am.bE.size();
        for (int i4 = 0; i4 < size; i4++) {
            am amVar = a[i4];
            if (amVar.bT && !amVar.bI() && !amVar.cK && !(amVar instanceof al) && !amVar.bV && !amVar.i() && amVar.cN == null && !amVar.Q()) {
                int i5 = 2;
                bVar.a(amVar.eo, amVar.ep);
                int i6 = bVar.T;
                int i7 = bVar.U;
                float f = amVar.cj + 5.0f;
                float f2 = amVar.cj + 10.0f;
                if (f2 < 10.0f) {
                    i5 = 0;
                } else if (f2 < 20.0f) {
                    i5 = 1;
                }
                for (int i8 = i6 - i5; i8 <= i6 + i5; i8++) {
                    for (int i9 = i7 - i5; i9 <= i7 + i5; i9++) {
                        if (bVar.c(i8, i9)) {
                            bVar.a(i8, i9);
                            float a2 = f.a(bVar.T + i2, bVar.U + i3, amVar.eo, amVar.ep);
                            int i10 = (i8 * i) + i9;
                            if (a2 < f * f) {
                                byte[] bArr2 = this.f;
                                bArr2[i10] = (byte) (bArr2[i10] + 6);
                            } else if (a2 < f2 * f2) {
                                this.f[i10] = (byte) (bArr[i10] + (6 * 0.333d));
                            }
                            if (this.f[i10] < -1) {
                                this.f[i10] = Byte.MAX_VALUE;
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(boolean z) {
        if (!z) {
            return;
        }
        if (this.m) {
            this.l = 0;
            this.m = false;
            c(null);
            if (this.j != null) {
                a((y) null);
            }
        }
        this.l = 0;
    }
}