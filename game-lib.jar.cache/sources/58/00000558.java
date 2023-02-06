package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.maps.b;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.k.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/o.class */
public final class o implements Runnable {
    private final PathEngine C;
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
    boolean a = true;
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
        while (this.a) {
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

    o(PathEngine pathEngine) {
        this.C = pathEngine;
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

    public void a(b bVar) {
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
        i a = this.C.a(aoVar);
        if (a == null) {
            throw new RuntimeException("Could not get costs for:" + aoVar.toString());
        }
        this.n = a;
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
        if (PathEngine.a) {
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
        if (PathEngine.a) {
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
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.a == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0691, code lost:
        android.util.Log.d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
        r27 = r0.a;
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
        android.util.Log.d("RustedWarfare", "currentNode:" + ((int) r0.a) + "," + ((int) r0.b));
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
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.a == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x073f, code lost:
        android.util.Log.d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0747, code lost:
        r29 = r0.a;
        r30 = r0.b;
        r27 = r0.a;
        r28 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.a == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x076c, code lost:
        android.util.Log.d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0774, code lost:
        r29 = r0.a;
        r30 = r0.b;
        r27 = r0.a;
        r28 = r0.b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0790, code lost:
        r25 = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedList e() {
        m mVar;
        byte b;
        byte b2;
        int a;
        int i;
        if (PathEngine.l && !GameEngine.getGameEngine().bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        k kVar = this.D;
        int i2 = kVar.p ? 7 : 1;
        int i3 = kVar.q;
        if (PathEngine.a) {
            Log.d("RustedWarfare", "starting path for:" + this.n.a.toString());
        }
        p pVar = this.r;
        p pVar2 = this.q;
        int i4 = this.h;
        int i5 = this.g;
        this.y = GameEngine.V();
        short s = kVar.h;
        short s2 = kVar.i;
        boolean z = kVar.k;
        d();
        a(kVar.o, kVar.h, kVar.i, kVar.j);
        short s3 = kVar.l;
        short s4 = kVar.m;
        short s5 = kVar.n;
        LinkedList linkedList = new LinkedList();
        if (s == s3 && s2 == s4) {
            if (PathEngine.a) {
                Log.d("RustedWarfare", "no point pathing when start=end");
            }
            linkedList.clear();
            linkedList.add(new p(s3, s4));
            return linkedList;
        } else if (this.n.a.equals(ao.NONE)) {
            if (PathEngine.a) {
                Log.d("RustedWarfare", "no point pathing for none");
            }
            linkedList.clear();
            return linkedList;
        } else {
            int i6 = 0;
            short s6 = s3;
            short s7 = s4;
            short s8 = s5;
            if (this.e != null) {
                short[] sArr = this.e;
                short s9 = sArr[(s * i4) + s2];
                boolean z2 = true;
                if (s9 == -1) {
                    z2 = false;
                } else {
                    int i7 = s3 - s5;
                    while (true) {
                        short s10 = (short) i7;
                        if (s10 > s3 + s5) {
                            break;
                        }
                        int i8 = s4 - s5;
                        while (true) {
                            short s11 = (short) i8;
                            if (s11 <= s4 + s5) {
                                if (s10 >= 0 && s10 < i5 && s11 >= 0 && s11 < i4 && s9 == sArr[(s10 * i4) + s11]) {
                                    z2 = false;
                                }
                                i8 = s11 + 1;
                            }
                        }
                        i7 = s10 + 1;
                    }
                }
                if (z2) {
                    if (PathEngine.a) {
                        Log.d("RustedWarfare", "end is blocked on isolated groups");
                    }
                    short s12 = s6;
                    short s13 = s7;
                    float f = -1.0f;
                    int i9 = s3 - 25;
                    while (true) {
                        short s14 = (short) i9;
                        if (s14 > s3 + 25) {
                            break;
                        }
                        int i10 = s4 - 25;
                        while (true) {
                            short s15 = (short) i10;
                            if (s15 <= s4 + 25) {
                                if (s14 >= 0 && s14 < i5 && s15 >= 0 && s15 < i4 && (s9 == sArr[(s14 * i4) + s15] || sArr[(s14 * i4) + s15] == 0)) {
                                    float a2 = f.a(s14, s15, s3, s4);
                                    if (f == -1.0f || a2 < f) {
                                        f = a2;
                                        s12 = s14;
                                        s13 = s15;
                                        s8 = 0;
                                    }
                                }
                                i10 = s15 + 1;
                            }
                        }
                        i9 = s14 + 1;
                    }
                    if (f == -1.0f) {
                        short s16 = 0;
                        while (true) {
                            short s17 = s16;
                            if (s17 >= i5) {
                                break;
                            }
                            short s18 = 0;
                            while (true) {
                                short s19 = s18;
                                if (s19 < i4) {
                                    if (s9 == sArr[(s17 * i4) + s19] || sArr[(s17 * i4) + s19] == 0) {
                                        float a3 = f.a(s17, s19, s3, s4);
                                        if (f == -1.0f || a3 < f) {
                                            f = a3;
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
                    if (PathEngine.a) {
                        Log.d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.y));
                    }
                }
            }
            boolean z3 = true;
            int i11 = s6 - s8;
            loop6: while (true) {
                short s20 = (short) i11;
                if (s20 > s6 + s8) {
                    break;
                }
                int i12 = s7 - s8;
                while (true) {
                    short s21 = (short) i12;
                    if (s21 <= s7 + s8) {
                        if (s20 < 0 || s20 >= i5 || s21 < 0 || s21 >= i4 || a(s20, s21) == -1) {
                            i12 = s21 + 1;
                        } else {
                            z3 = false;
                            break loop6;
                        }
                    }
                }
                i11 = s20 + 1;
            }
            if (z3) {
                short s22 = s6;
                short s23 = s7;
                float f2 = -1.0f;
                if (PathEngine.a) {
                    Log.d("RustedWarfare", "end is blocked on non isolated groups");
                }
                int i13 = s6 - 9;
                while (true) {
                    short s24 = (short) i13;
                    if (s24 > s6 + 9) {
                        break;
                    }
                    int i14 = s7 - 9;
                    while (true) {
                        short s25 = (short) i14;
                        if (s25 <= s7 + 9) {
                            if (s24 >= 0 && s24 < i5 && s25 >= 0 && s25 < i4 && a(s24, s25) != -1) {
                                float a4 = f.a(s24, s25, s6, s7);
                                if (f2 == -1.0f || a4 < f2) {
                                    f2 = a4;
                                    s22 = s24;
                                    s23 = s25;
                                    s8 = 0;
                                }
                            }
                            i14 = s25 + 1;
                        }
                    }
                    i13 = s24 + 1;
                }
                if (f2 == -1.0f) {
                    short s26 = 0;
                    while (true) {
                        short s27 = s26;
                        if (s27 >= i5) {
                            break;
                        }
                        short s28 = 0;
                        while (true) {
                            short s29 = s28;
                            if (s29 < i4) {
                                if (a(s27, s29) != -1) {
                                    float a5 = f.a(s27, s29, s6, s7);
                                    if (f2 == -1.0f || a5 < f2) {
                                        f2 = a5;
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
                if (PathEngine.a) {
                    Log.d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.y));
                }
            }
            if (PathEngine.a && (s6 != s3 || s7 != s4)) {
                Log.d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
            }
            this.o.a(s6, s7);
            this.o.a(0, s, s2);
            this.p.a(s, s2);
            a(s6, s7, s8);
            this.p.a(0, s6, s7);
            boolean z4 = false;
            boolean z5 = false;
            short s30 = -1;
            short s31 = -1;
            short s32 = -1;
            short s33 = -1;
            int i15 = 400;
            int i16 = 0;
            while (true) {
                if (0 != 0) {
                    break;
                }
                i16++;
                if (kVar.w) {
                    linkedList.clear();
                    return linkedList;
                }
                i6++;
                if (i15 > 0) {
                    i15--;
                } else {
                    z5 = !z5;
                }
                byte b3 = 0;
                if (z5) {
                    b3 = 1;
                }
                if (!z5) {
                    mVar = this.o;
                } else {
                    mVar = this.p;
                }
                n c = mVar.c();
                if (c == null) {
                    if (!z5) {
                        if (PathEngine.a) {
                            Log.d("RustedWarfare", "listNode==null for normal side ending path");
                        }
                    }
                } else {
                    p a6 = pVar2.a(c);
                    int a7 = a6.a(this, b3);
                    byte c2 = a6.c(this, b3);
                    boolean d = a6.d(this, b3);
                    boolean z6 = false;
                    if (!z5) {
                        if (a6.a == s6 && a6.b == s7) {
                            if (PathEngine.a) {
                                Log.d("RustedWarfare", "Over goal: fakeEnd");
                            }
                            z6 = true;
                        }
                        if (f.d(a6.a - s3) <= s5 && f.d(a6.b - s4) <= s5) {
                            if (PathEngine.a) {
                                Log.d("RustedWarfare", "Over goal: real end");
                            }
                            z6 = true;
                        }
                    }
                    boolean b4 = a6.b(this, (byte) (1 - b3));
                    if (b4 || z6) {
                        break;
                    }
                    a6.a(this, b3, true);
                    if (d) {
                        b = 0;
                        b2 = 7;
                    } else {
                        byte b5 = 2;
                        if (this.f != null && this.f[(a6.a * i4) + a6.b] > 1) {
                            b5 = 1;
                        }
                        b = (byte) (c2 - b5);
                        b2 = (byte) (c2 + b5);
                    }
                    byte b6 = b;
                    while (true) {
                        byte b7 = b6;
                        if (b7 <= b2) {
                            pVar.a(a6);
                            byte b8 = b7;
                            if (b8 > 7) {
                                b8 = (byte) (b8 - 8);
                            }
                            if (b8 < 0) {
                                b8 = (byte) (b8 + 8);
                            }
                            if (b8 == 0) {
                                pVar.a = (short) (pVar.a + 1);
                            }
                            if (b8 == 1) {
                                pVar.a = (short) (pVar.a + 1);
                                pVar.b = (short) (pVar.b + 1);
                            }
                            if (b8 == 2) {
                                pVar.b = (short) (pVar.b + 1);
                            }
                            if (b8 == 3) {
                                pVar.b = (short) (pVar.b + 1);
                                pVar.a = (short) (pVar.a - 1);
                            }
                            if (b8 == 4) {
                                pVar.a = (short) (pVar.a - 1);
                            }
                            if (b8 == 5) {
                                pVar.a = (short) (pVar.a - 1);
                                pVar.b = (short) (pVar.b - 1);
                            }
                            if (b8 == 6) {
                                pVar.b = (short) (pVar.b - 1);
                            }
                            if (b8 == 7) {
                                pVar.b = (short) (pVar.b - 1);
                                pVar.a = (short) (pVar.a + 1);
                            }
                            if (pVar.a >= 0 && pVar.a < i5 && pVar.b >= 0 && pVar.b < i4 && (a = pVar.a(this)) != -1) {
                                int a8 = pVar.a(this, b3);
                                if (!pVar.b(this, b3)) {
                                    if (pVar.a != a6.a && pVar.b != a6.b) {
                                        if (a(pVar.a, a6.b) != -1 && a(a6.a, pVar.b) != -1) {
                                            i = a7 + 14 + a + 1;
                                        }
                                    } else {
                                        i = a7 + 10 + a + 1;
                                    }
                                    if (c2 != b8) {
                                        if (!d) {
                                            i += b(c2, b8);
                                        } else if (!z5) {
                                            if (z) {
                                                i += c(c2, b8);
                                            } else {
                                                i += b(c2, b8);
                                            }
                                        }
                                    }
                                    if (this.f != null) {
                                        i += (4 - this.f[(pVar.a * i4) + pVar.b]) * i2;
                                    }
                                    if (i3 > 0 && this.f != null && this.f[(pVar.a * i4) + pVar.b] <= i3) {
                                        i += 100;
                                    }
                                    if (a8 < this.i || i < a8) {
                                        pVar.a(this, b3, b8);
                                        pVar.a(this, b3, false);
                                        pVar.a(this, b3, i);
                                        mVar.a(i - this.i, pVar.a, pVar.b);
                                    }
                                }
                            }
                            b6 = (byte) (b7 + 1);
                        }
                    }
                }
            }
            if (PathEngine.a) {
                Log.d("RustedWarfare", "grid path finshed in :" + i16 + " ticks");
                Log.d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.y));
            }
            System.currentTimeMillis();
            if (!z4) {
                if (PathEngine.a) {
                    Log.d("RustedWarfare", "could not find end node");
                }
                long currentTimeMillis = System.currentTimeMillis();
                float f3 = -1.0f;
                p pVar3 = new p();
                short s34 = 0;
                while (true) {
                    short s35 = s34;
                    if (s35 >= i5) {
                        break;
                    }
                    short s36 = 0;
                    while (true) {
                        short s37 = s36;
                        if (s37 < i4) {
                            pVar3.a(s35, s37);
                            if (pVar3.e(this, (byte) 0)) {
                                float a9 = f.a(s35, s37, s3, s4);
                                if (f3 == -1.0f || a9 < f3) {
                                    f3 = a9;
                                    s30 = s35;
                                    s31 = s37;
                                }
                            }
                            s36 = (short) (s37 + 1);
                        }
                    }
                    s34 = (short) (s35 + 1);
                }
                if (PathEngine.a) {
                    Log.d("RustedWarfare", "got closest node in:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
            linkedList.clear();
            if (s30 != -1 && s31 != -1) {
                linkedList.addAll(a(a((byte) 0, s30, s31)));
            }
            if (s32 != -1 && s33 != -1) {
                linkedList.addAll(a((byte) 1, s32, s33));
            }
            if (linkedList.size() > 1) {
                linkedList.remove(0);
            }
            this.z = GameEngine.V();
            if (PathEngine.a) {
                Log.d("RustedWarfare", "path(" + kVar.e + ") finished in:" + (this.z - this.y));
            }
            if (PathEngine.l && !GameEngine.getGameEngine().bH) {
                Debug.stopMethodTracing();
                PathEngine.l = false;
            }
            return linkedList;
        }
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
        int a;
        int i;
        f fVar = (f) this.D;
        g gVar = new g(this.g, this.h);
        if (PathEngine.l && !GameEngine.getGameEngine().bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (PathEngine.a) {
            Log.d("RustedWarfare", "starting path for:" + this.n.a.toString());
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
        if (this.n.a.equals(ao.NONE)) {
            if (PathEngine.a) {
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
                if (PathEngine.a) {
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
                                float a2 = f.a(s14, s15, s3, s4);
                                if (f == -1.0f || a2 < f) {
                                    f = a2;
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
                                    float a3 = f.a(s17, s19, s3, s4);
                                    if (f == -1.0f || a3 < f) {
                                        f = a3;
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
                if (PathEngine.a) {
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
            if (PathEngine.a) {
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
                            float a4 = f.a(s24, s25, s6, s7);
                            if (f2 == -1.0f || a4 < f2) {
                                f2 = a4;
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
                                float a5 = f.a(s27, s29, s6, s7);
                                if (f2 == -1.0f || a5 < f2) {
                                    f2 = a5;
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
            if (PathEngine.a) {
                Log.d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.y));
            }
        }
        if (PathEngine.a && (s6 != s3 || s7 != s4)) {
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
            p a6 = pVar2.a(c);
            int a7 = a6.a(this, (byte) 1);
            byte a8 = (byte) (gVar.a(a6) - 1);
            boolean b3 = gVar.b(a6);
            gVar.a(a6, true);
            if (b3) {
                b = 0;
                b2 = 7;
            } else {
                byte b4 = 2;
                if (this.f != null && this.f[(a6.a * i2) + a6.b] > 1) {
                    b4 = 1;
                }
                b = (byte) (a8 - b4);
                b2 = (byte) (a8 + b4);
            }
            byte b5 = b;
            while (true) {
                byte b6 = b5;
                if (b6 <= b2) {
                    pVar.a(a6);
                    byte b7 = b6;
                    if (b7 > 7) {
                        b7 = (byte) (b7 - 8);
                    }
                    if (b7 < 0) {
                        b7 = (byte) (b7 + 8);
                    }
                    if (b7 == 0) {
                        pVar.a = (short) (pVar.a + 1);
                    }
                    if (b7 == 1) {
                        pVar.a = (short) (pVar.a + 1);
                        pVar.b = (short) (pVar.b + 1);
                    }
                    if (b7 == 2) {
                        pVar.b = (short) (pVar.b + 1);
                    }
                    if (b7 == 3) {
                        pVar.b = (short) (pVar.b + 1);
                        pVar.a = (short) (pVar.a - 1);
                    }
                    if (b7 == 4) {
                        pVar.a = (short) (pVar.a - 1);
                    }
                    if (b7 == 5) {
                        pVar.a = (short) (pVar.a - 1);
                        pVar.b = (short) (pVar.b - 1);
                    }
                    if (b7 == 6) {
                        pVar.b = (short) (pVar.b - 1);
                    }
                    if (b7 == 7) {
                        pVar.b = (short) (pVar.b - 1);
                        pVar.a = (short) (pVar.a + 1);
                    }
                    if (pVar.a >= 0 && pVar.a < i3 && pVar.b >= 0 && pVar.b < i2 && (a = pVar.a(this)) != -1) {
                        int a9 = pVar.a(this, (byte) 1);
                        if (!gVar.c(pVar)) {
                            if (pVar.a != a6.a && pVar.b != a6.b) {
                                if (a(pVar.a, a6.b) != -1 && a(a6.a, pVar.b) != -1) {
                                    i = a7 + 14 + a + 1;
                                }
                            } else {
                                i = a7 + 10 + a + 1;
                            }
                            if (a8 != b7 && !b3) {
                                i += b(a8, b7);
                            }
                            if (this.f != null) {
                                i += (4 - this.f[(pVar.a * i2) + pVar.b]) * 7;
                            }
                            if (0 > 0 && this.f != null && this.f[(pVar.a * i2) + pVar.b] <= 0) {
                                i += 100;
                            }
                            if (a9 < this.i || i < a9) {
                                gVar.a(pVar, (byte) (b7 + 1));
                                gVar.a(pVar, false);
                                pVar.a(this, (byte) 1, i);
                                mVar.a(i - this.i, pVar.a, pVar.b);
                            }
                        }
                    }
                    b5 = (byte) (b6 + 1);
                }
            }
        }
        if (PathEngine.a) {
            Log.d("RustedWarfare", "grid path finshed in :" + i13 + " ticks");
            Log.d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.y));
        }
        System.currentTimeMillis();
        gVar.c = s6;
        gVar.d = s7;
        fVar.b = gVar;
        PathEngine.e = fVar;
        this.z = GameEngine.V();
        if (PathEngine.a) {
            Log.d("RustedWarfare", "path(" + fVar.e + ") finished in:" + (this.z - this.y));
        }
        if (PathEngine.l && !GameEngine.getGameEngine().bH) {
            Debug.stopMethodTracing();
            PathEngine.l = false;
        }
    }
}