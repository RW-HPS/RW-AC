package com.corrodinggames.rts.gameFramework.k;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;
import java.util.LinkedList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/o.class */
public final class o implements Runnable {
    private final l C;
    public byte[] b;
    public byte[] c;
    public byte[] d;
    public short[] e;
    public byte[] f;
    private k D;
    int g;
    int h;
    int[][] l;
    byte[][] m;
    i n;
    static LinkedList t = new LinkedList();
    static int u;
    int v;
    Thread w;
    long y;
    long z;

    /* renamed from: a  reason: collision with root package name */
    boolean f611a = true;
    int i = 5;
    int j = 0;
    int k = 0;
    final m o = new m();
    final m p = new m();
    final p q = new p();
    final p r = new p();
    volatile boolean s = true;
    Object x = new Object();
    Object A = new Object();
    Paint B = new Paint();

    public void a(k kVar) {
        if (!this.s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.s = false;
        a(kVar.o, kVar);
        kVar.v = true;
        this.D = kVar;
    }

    public void a() {
        if (this.w == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.x) {
            this.x.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        while (this.f611a) {
            synchronized (this.x) {
                if (this.D == null) {
                    try {
                        this.x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.D != null) {
                b();
            }
        }
    }

    static {
        t.add(new p((short) -9, (short) -9));
        t.add(new p((short) -9, (short) -9));
        t.add(new p((short) -9, (short) -9));
        u = 0;
    }

    public void b() {
        LinkedList e;
        if (this.D instanceof f) {
            f();
            e = t;
        } else {
            e = e();
        }
        synchronized (this.C.G) {
            this.D.f();
            this.b = null;
            this.c = null;
            this.d = null;
            this.e = null;
            this.f = null;
            this.D.a(e);
            this.D = null;
            this.s = true;
            this.C.G.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public o(l lVar) {
        this.C = lVar;
        int i = u;
        u = i + 1;
        this.v = i;
    }

    public synchronized void c() {
        if (this.w != null) {
            throw new RuntimeException("thread!=null");
        }
        this.w = new Thread(this);
        this.w.setName("PathSolver-" + this.v);
        this.w.setPriority(10);
        this.w.setDaemon(true);
        this.w.start();
    }

    public void a(com.corrodinggames.rts.game.b.b bVar) {
        this.g = bVar.u.n;
        this.h = bVar.u.o;
        this.l = new int[2][this.g * this.h];
        this.m = new byte[2][this.g * this.h];
        d();
    }

    public void d() {
        int i = (this.g * this.h * 42) + 1;
        this.i += i;
        if (this.i > Integer.MAX_VALUE - i || this.i < 0 || 0 != 0) {
            this.i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.g; i3++) {
                    for (int i4 = 0; i4 < this.h; i4++) {
                        this.l[i2][(i3 * this.h) + i4] = -1;
                    }
                }
            }
        }
    }

    public final int a(int i, int i2) {
        if (this.b[(i * this.h) + i2] == -1 || this.c[(i * this.h) + i2] == -1 || this.d[(i * this.h) + i2] == -1) {
            return -1;
        }
        return this.b[(i * this.h) + i2] + this.c[(i * this.h) + i2] + (this.d[(i * this.h) + i2] * 10);
    }

    public void a(ao aoVar, k kVar) {
        if (aoVar == null) {
            throw new RuntimeException("MovementType is null");
        }
        i a2 = this.C.a(aoVar);
        if (a2 == null) {
            throw new RuntimeException("Could not get costs for:" + aoVar.toString());
        }
        this.n = a2;
        this.b = kVar.y;
        this.c = kVar.z;
        this.d = kVar.A;
        this.e = kVar.B;
        this.f = kVar.C;
        if (this.b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        }
        if (this.c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        }
        if (this.d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    public void a(ao aoVar, short s, short s2, Float f) {
        if (l.f608a) {
            Log.d("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        p pVar = new p(s, s2);
        pVar.a(this, (byte) 0, this.i);
        if (f == null) {
            pVar.a(this, (byte) 0, (byte) 0);
            pVar.b(this, (byte) 0, true);
        } else {
            pVar.a(this, (byte) 0, f.floatValue());
            pVar.b(this, (byte) 0, true);
        }
        pVar.a(this, (byte) 0, false);
    }

    public void a(short s, short s2, short s3) {
        if (l.f608a) {
            Log.d("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        p pVar = new p(s, s2);
        pVar.a(this, (byte) 1, (byte) 0);
        pVar.b(this, (byte) 1, true);
        pVar.a(this, (byte) 1, this.i);
        pVar.a(this, (byte) 1, false);
    }

    static int b(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = -i3;
        }
        if (i3 > 4) {
            i3 = 8 - i3;
        }
        if (i3 == 1) {
            return 4;
        }
        return i3 == 2 ? 21 : 25;
    }

    static int c(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int abs = Math.abs(i - i2);
        if (abs > 4) {
            abs = 8 - abs;
        }
        if (abs == 1) {
            return 4;
        }
        if (abs == 2) {
            return 21;
        }
        if (abs == 3) {
            return 4;
        }
        return (abs == 4 || abs == 5) ? 0 : 25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x067e, code lost:
        r0.a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0688, code lost:
        if (r0 != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x068e, code lost:
        if (com.corrodinggames.rts.gameFramework.k.l.f608a == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0691, code lost:
        android.util.Log.d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
        r27 = r0.f612a;
        r28 = r0.b;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ad, code lost:
        r0 = r0.f(r6, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06b9, code lost:
        if (r0 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06bc, code lost:
        android.util.Log.d("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.d("RustedWarfare", "currentNode:" + ((int) r0.f612a) + "," + ((int) r0.b));
        android.util.Log.d("RustedWarfare", "currentNode cost normal:" + r0.a(r6, (byte) 0));
        android.util.Log.d("RustedWarfare", "currentNode cost opposite:" + r0.a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0733, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0736, code lost:
        if (r26 != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x073c, code lost:
        if (com.corrodinggames.rts.gameFramework.k.l.f608a == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x073f, code lost:
        android.util.Log.d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0747, code lost:
        r29 = r0.f612a;
        r30 = r0.b;
        r27 = r0.f612a;
        r28 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.k.l.f608a == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x076c, code lost:
        android.util.Log.d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0774, code lost:
        r29 = r0.f612a;
        r30 = r0.b;
        r27 = r0.f612a;
        r28 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0790, code lost:
        r25 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedList e() {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.k.o.e():java.util.LinkedList");
    }

    public LinkedList a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        p pVar = new p(s, s2);
        linkedList.add(pVar);
        while (true) {
            p f = pVar.f(this, b);
            if (f != null) {
                linkedList.add(f);
                pVar = f;
            } else {
                return linkedList;
            }
        }
    }

    public LinkedList a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((p) it.next());
        }
        return linkedList2;
    }

    public void f() {
        g();
    }

    public void g() {
        byte b;
        byte b2;
        int a2;
        int i;
        f fVar = (f) this.D;
        g gVar = new g(this.g, this.h);
        if (l.l && !GameEngine.getGameEngine().bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (l.f608a) {
            Log.d("RustedWarfare", "starting path for:" + this.n.f606a.toString());
        }
        p pVar = this.r;
        p pVar2 = this.q;
        int i2 = this.h;
        int i3 = this.g;
        this.y = GameEngine.V();
        short s = fVar.h;
        short s2 = fVar.i;
        boolean z = fVar.k;
        d();
        a(fVar.o, fVar.h, fVar.i, fVar.j);
        short s3 = fVar.l;
        short s4 = fVar.m;
        short s5 = fVar.n;
        new LinkedList();
        if (this.n.f606a.equals(ao.NONE)) {
            if (l.f608a) {
                Log.d("RustedWarfare", "no point pathing for none");
                return;
            }
            return;
        }
        int i4 = 0;
        short s6 = s3;
        short s7 = s4;
        short s8 = s5;
        if (this.e != null) {
            short[] sArr = this.e;
            short s9 = sArr[(s * i2) + s2];
            boolean z2 = true;
            if (s9 == -1) {
                z2 = false;
            } else {
                int i5 = s3 - s5;
                while (true) {
                    short s10 = (short) i5;
                    if (s10 > s3 + s5) {
                        break;
                    }
                    int i6 = s4 - s5;
                    while (true) {
                        short s11 = (short) i6;
                        if (s11 <= s4 + s5) {
                            if (s10 >= 0 && s10 < i3 && s11 >= 0 && s11 < i2 && s9 == sArr[(s10 * i2) + s11]) {
                                z2 = false;
                            }
                            i6 = s11 + 1;
                        }
                    }
                    i5 = s10 + 1;
                }
            }
            if (z2) {
                if (l.f608a) {
                    Log.d("RustedWarfare", "end is blocked on isolated groups");
                }
                short s12 = s6;
                short s13 = s7;
                float f = -1.0f;
                int i7 = s3 - 25;
                while (true) {
                    short s14 = (short) i7;
                    if (s14 > s3 + 25) {
                        break;
                    }
                    int i8 = s4 - 25;
                    while (true) {
                        short s15 = (short) i8;
                        if (s15 <= s4 + 25) {
                            if (s14 >= 0 && s14 < i3 && s15 >= 0 && s15 < i2 && (s9 == sArr[(s14 * i2) + s15] || sArr[(s14 * i2) + s15] == 0)) {
                                float a3 = com.corrodinggames.rts.gameFramework.f.a(s14, s15, s3, s4);
                                if (f == -1.0f || a3 < f) {
                                    f = a3;
                                    s12 = s14;
                                    s13 = s15;
                                    s8 = 0;
                                }
                            }
                            i8 = s15 + 1;
                        }
                    }
                    i7 = s14 + 1;
                }
                if (f == -1.0f) {
                    short s16 = 0;
                    while (true) {
                        short s17 = s16;
                        if (s17 >= i3) {
                            break;
                        }
                        short s18 = 0;
                        while (true) {
                            short s19 = s18;
                            if (s19 < i2) {
                                if (s9 == sArr[(s17 * i2) + s19] || sArr[(s17 * i2) + s19] == 0) {
                                    float a4 = com.corrodinggames.rts.gameFramework.f.a(s17, s19, s3, s4);
                                    if (f == -1.0f || a4 < f) {
                                        f = a4;
                                        s12 = s17;
                                        s13 = s19;
                                        s8 = 0;
                                    }
                                }
                                s18 = (short) (s19 + 1);
                            }
                        }
                        s16 = (short) (s17 + 1);
                    }
                }
                s6 = s12;
                s7 = s13;
                if (l.f608a) {
                    Log.d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.y));
                }
            }
        }
        boolean z3 = true;
        int i9 = s6 - s8;
        loop6: while (true) {
            short s20 = (short) i9;
            if (s20 > s6 + s8) {
                break;
            }
            int i10 = s7 - s8;
            while (true) {
                short s21 = (short) i10;
                if (s21 <= s7 + s8) {
                    if (s20 < 0 || s20 >= i3 || s21 < 0 || s21 >= i2 || a(s20, s21) == -1) {
                        i10 = s21 + 1;
                    } else {
                        z3 = false;
                        break loop6;
                    }
                }
            }
            i9 = s20 + 1;
        }
        if (z3) {
            short s22 = s6;
            short s23 = s7;
            float f2 = -1.0f;
            if (l.f608a) {
                Log.d("RustedWarfare", "end is blocked on non isolated groups");
            }
            int i11 = s6 - 9;
            while (true) {
                short s24 = (short) i11;
                if (s24 > s6 + 9) {
                    break;
                }
                int i12 = s7 - 9;
                while (true) {
                    short s25 = (short) i12;
                    if (s25 <= s7 + 9) {
                        if (s24 >= 0 && s24 < i3 && s25 >= 0 && s25 < i2 && a(s24, s25) != -1) {
                            float a5 = com.corrodinggames.rts.gameFramework.f.a(s24, s25, s6, s7);
                            if (f2 == -1.0f || a5 < f2) {
                                f2 = a5;
                                s22 = s24;
                                s23 = s25;
                                s8 = 0;
                            }
                        }
                        i12 = s25 + 1;
                    }
                }
                i11 = s24 + 1;
            }
            if (f2 == -1.0f) {
                short s26 = 0;
                while (true) {
                    short s27 = s26;
                    if (s27 >= i3) {
                        break;
                    }
                    short s28 = 0;
                    while (true) {
                        short s29 = s28;
                        if (s29 < i2) {
                            if (a(s27, s29) != -1) {
                                float a6 = com.corrodinggames.rts.gameFramework.f.a(s27, s29, s6, s7);
                                if (f2 == -1.0f || a6 < f2) {
                                    f2 = a6;
                                    s22 = s27;
                                    s23 = s29;
                                    s8 = 0;
                                }
                            }
                            s28 = (short) (s29 + 1);
                        }
                    }
                    s26 = (short) (s27 + 1);
                }
            }
            s6 = s22;
            s7 = s23;
            if (l.f608a) {
                Log.d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.y));
            }
        }
        if (l.f608a && (s6 != s3 || s7 != s4)) {
            Log.d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
        }
        this.o.a(s6, s7);
        this.o.a(0, s, s2);
        this.p.a(s, s2);
        a(s6, s7, s8);
        this.p.a(0, s6, s7);
        int i13 = 0;
        while (0 == 0) {
            i13++;
            if (fVar.w) {
                return;
            }
            i4++;
            m mVar = this.p;
            n c = mVar.c();
            if (c == null) {
                break;
            }
            p a7 = pVar2.a(c);
            int a8 = a7.a(this, (byte) 1);
            byte a9 = (byte) (gVar.a(a7) - 1);
            boolean b3 = gVar.b(a7);
            gVar.a(a7, true);
            if (b3) {
                b = 0;
                b2 = 7;
            } else {
                byte b4 = 2;
                if (this.f != null && this.f[(a7.f612a * i2) + a7.b] > 1) {
                    b4 = 1;
                }
                b = (byte) (a9 - b4);
                b2 = (byte) (a9 + b4);
            }
            byte b5 = b;
            while (true) {
                byte b6 = b5;
                if (b6 <= b2) {
                    pVar.a(a7);
                    byte b7 = b6;
                    if (b7 > 7) {
                        b7 = (byte) (b7 - 8);
                    }
                    if (b7 < 0) {
                        b7 = (byte) (b7 + 8);
                    }
                    if (b7 == 0) {
                        pVar.f612a = (short) (pVar.f612a + 1);
                    }
                    if (b7 == 1) {
                        pVar.f612a = (short) (pVar.f612a + 1);
                        pVar.b = (short) (pVar.b + 1);
                    }
                    if (b7 == 2) {
                        pVar.b = (short) (pVar.b + 1);
                    }
                    if (b7 == 3) {
                        pVar.b = (short) (pVar.b + 1);
                        pVar.f612a = (short) (pVar.f612a - 1);
                    }
                    if (b7 == 4) {
                        pVar.f612a = (short) (pVar.f612a - 1);
                    }
                    if (b7 == 5) {
                        pVar.f612a = (short) (pVar.f612a - 1);
                        pVar.b = (short) (pVar.b - 1);
                    }
                    if (b7 == 6) {
                        pVar.b = (short) (pVar.b - 1);
                    }
                    if (b7 == 7) {
                        pVar.b = (short) (pVar.b - 1);
                        pVar.f612a = (short) (pVar.f612a + 1);
                    }
                    if (pVar.f612a >= 0 && pVar.f612a < i3 && pVar.b >= 0 && pVar.b < i2 && (a2 = pVar.a(this)) != -1) {
                        int a10 = pVar.a(this, (byte) 1);
                        if (!gVar.c(pVar)) {
                            if (pVar.f612a != a7.f612a && pVar.b != a7.b) {
                                if (a(pVar.f612a, a7.b) != -1 && a(a7.f612a, pVar.b) != -1) {
                                    i = a8 + 14 + a2 + 1;
                                }
                            } else {
                                i = a8 + 10 + a2 + 1;
                            }
                            if (a9 != b7 && !b3) {
                                i += b(a9, b7);
                            }
                            if (this.f != null) {
                                i += (4 - this.f[(pVar.f612a * i2) + pVar.b]) * 7;
                            }
                            if (0 > 0 && this.f != null && this.f[(pVar.f612a * i2) + pVar.b] <= 0) {
                                i += 100;
                            }
                            if (a10 < this.i || i < a10) {
                                gVar.a(pVar, (byte) (b7 + 1));
                                gVar.a(pVar, false);
                                pVar.a(this, (byte) 1, i);
                                mVar.a(i - this.i, pVar.f612a, pVar.b);
                            }
                        }
                    }
                    b5 = (byte) (b6 + 1);
                }
            }
        }
        if (l.f608a) {
            Log.d("RustedWarfare", "grid path finshed in :" + i13 + " ticks");
            Log.d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.y));
        }
        System.currentTimeMillis();
        gVar.c = s6;
        gVar.d = s7;
        fVar.b = gVar;
        l.e = fVar;
        this.z = GameEngine.V();
        if (l.f608a) {
            Log.d("RustedWarfare", "path(" + fVar.e + ") finished in:" + (this.z - this.y));
        }
        if (l.l && !GameEngine.getGameEngine().bH) {
            Debug.stopMethodTracing();
            l.l = false;
        }
    }
}