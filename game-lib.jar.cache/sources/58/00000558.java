package com.corrodinggames.rts.gameFramework.p043k;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.k.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/o.class */
public final class RunnableC0946o implements Runnable {

    /* renamed from: C */
    private final C0943l f6259C;

    /* renamed from: b */
    public byte[] f6261b;

    /* renamed from: c */
    public byte[] f6262c;

    /* renamed from: d */
    public byte[] f6263d;

    /* renamed from: e */
    public short[] f6264e;

    /* renamed from: f */
    public byte[] f6265f;

    /* renamed from: D */
    private C0942k f6266D;

    /* renamed from: g */
    int f6267g;

    /* renamed from: h */
    int f6268h;

    /* renamed from: l */
    int[][] f6272l;

    /* renamed from: m */
    byte[][] f6273m;

    /* renamed from: n */
    C0940i f6274n;

    /* renamed from: t */
    static LinkedList f6280t = new LinkedList();

    /* renamed from: u */
    static int f6281u;

    /* renamed from: v */
    int f6282v;

    /* renamed from: w */
    Thread f6283w;

    /* renamed from: y */
    long f6285y;

    /* renamed from: z */
    long f6286z;

    /* renamed from: a */
    boolean f6260a = true;

    /* renamed from: i */
    int f6269i = 5;

    /* renamed from: j */
    int f6270j = 0;

    /* renamed from: k */
    int f6271k = 0;

    /* renamed from: o */
    final C0944m f6275o = new C0944m();

    /* renamed from: p */
    final C0944m f6276p = new C0944m();

    /* renamed from: q */
    final C0947p f6277q = new C0947p();

    /* renamed from: r */
    final C0947p f6278r = new C0947p();

    /* renamed from: s */
    volatile boolean f6279s = true;

    /* renamed from: x */
    Object f6284x = new Object();

    /* renamed from: A */
    Object f6287A = new Object();

    /* renamed from: B */
    Paint f6288B = new Paint();

    /* renamed from: a */
    public void m1135a(C0942k c0942k) {
        if (!this.f6279s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.f6279s = false;
        m1137a(c0942k.f6199o, c0942k);
        c0942k.f6206v = true;
        this.f6266D = c0942k;
    }

    /* renamed from: a */
    public void m1141a() {
        if (this.f6283w == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.f6284x) {
            this.f6284x.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m1033aq();
        while (this.f6260a) {
            synchronized (this.f6284x) {
                if (this.f6266D == null) {
                    try {
                        this.f6284x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f6266D != null) {
                m1132b();
            }
        }
    }

    static {
        f6280t.add(new C0947p((short) -9, (short) -9));
        f6280t.add(new C0947p((short) -9, (short) -9));
        f6280t.add(new C0947p((short) -9, (short) -9));
        f6281u = 0;
    }

    /* renamed from: b */
    public void m1132b() {
        LinkedList m1127e;
        if (this.f6266D instanceof C0937f) {
            m1126f();
            m1127e = f6280t;
        } else {
            m1127e = m1127e();
        }
        synchronized (this.f6259C.f6246G) {
            this.f6266D.m1185f();
            this.f6261b = null;
            this.f6262c = null;
            this.f6263d = null;
            this.f6264e = null;
            this.f6265f = null;
            this.f6266D.m1190a(m1127e);
            this.f6266D = null;
            this.f6279s = true;
            this.f6259C.f6246G.notifyAll();
        }
    }

    RunnableC0946o(C0943l c0943l) {
        this.f6259C = c0943l;
        int i = f6281u;
        f6281u = i + 1;
        this.f6282v = i;
    }

    /* renamed from: c */
    public synchronized void m1130c() {
        if (this.f6283w != null) {
            throw new RuntimeException("thread!=null");
        }
        this.f6283w = new Thread(this);
        this.f6283w.setName("PathSolver-" + this.f6282v);
        this.f6283w.setPriority(10);
        this.f6283w.setDaemon(true);
        this.f6283w.start();
    }

    /* renamed from: a */
    public void m1138a(C0173b c0173b) {
        this.f6267g = c0173b.f803u.f905n;
        this.f6268h = c0173b.f803u.f906o;
        this.f6272l = new int[2][this.f6267g * this.f6268h];
        this.f6273m = new byte[2][this.f6267g * this.f6268h];
        m1128d();
    }

    /* renamed from: d */
    public void m1128d() {
        int i = (this.f6267g * this.f6268h * 42) + 1;
        this.f6269i += i;
        if (this.f6269i > Integer.MAX_VALUE - i || this.f6269i < 0 || 0 != 0) {
            this.f6269i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.f6267g; i3++) {
                    for (int i4 = 0; i4 < this.f6268h; i4++) {
                        this.f6272l[i2][(i3 * this.f6268h) + i4] = -1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m1139a(int i, int i2) {
        if (this.f6261b[(i * this.f6268h) + i2] == -1 || this.f6262c[(i * this.f6268h) + i2] == -1 || this.f6263d[(i * this.f6268h) + i2] == -1) {
            return -1;
        }
        return this.f6261b[(i * this.f6268h) + i2] + this.f6262c[(i * this.f6268h) + i2] + (this.f6263d[(i * this.f6268h) + i2] * 10);
    }

    /* renamed from: a */
    public void m1137a(EnumC0246ao enumC0246ao, C0942k c0942k) {
        if (enumC0246ao == null) {
            throw new RuntimeException("MovementType is null");
        }
        C0940i m1178a = this.f6259C.m1178a(enumC0246ao);
        if (m1178a == null) {
            throw new RuntimeException("Could not get costs for:" + enumC0246ao.toString());
        }
        this.f6274n = m1178a;
        this.f6261b = c0942k.f6209y;
        this.f6262c = c0942k.f6210z;
        this.f6263d = c0942k.f6211A;
        this.f6264e = c0942k.f6212B;
        this.f6265f = c0942k.f6213C;
        if (this.f6261b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        }
        if (this.f6262c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        }
        if (this.f6263d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    /* renamed from: a */
    public void m1136a(EnumC0246ao enumC0246ao, short s, short s2, Float f) {
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        C0947p c0947p = new C0947p(s, s2);
        c0947p.m1119a(this, (byte) 0, this.f6269i);
        if (f == null) {
            c0947p.m1121a(this, (byte) 0, (byte) 0);
            c0947p.m1113b(this, (byte) 0, true);
        } else {
            c0947p.m1120a(this, (byte) 0, f.floatValue());
            c0947p.m1113b(this, (byte) 0, true);
        }
        c0947p.m1117a(this, (byte) 0, false);
    }

    /* renamed from: a */
    public void m1133a(short s, short s2, short s3) {
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        C0947p c0947p = new C0947p(s, s2);
        c0947p.m1121a(this, (byte) 1, (byte) 0);
        c0947p.m1113b(this, (byte) 1, true);
        c0947p.m1119a(this, (byte) 1, this.f6269i);
        c0947p.m1117a(this, (byte) 1, false);
    }

    /* renamed from: b */
    static int m1131b(int i, int i2) {
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

    /* renamed from: c */
    static int m1129c(int i, int i2) {
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
        r0.m1116a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0688, code lost:
        if (r0 != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x068e, code lost:
        if (com.corrodinggames.rts.gameFramework.p043k.C0943l.f6214a == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0691, code lost:
        android.util.Log.m5063d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
        r27 = r0.f6289a;
        r28 = r0.f6290b;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ad, code lost:
        r0 = r0.m1109f(r6, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06b9, code lost:
        if (r0 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06bc, code lost:
        android.util.Log.m5063d("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.m5063d("RustedWarfare", "currentNode:" + ((int) r0.f6289a) + "," + ((int) r0.f6290b));
        android.util.Log.m5063d("RustedWarfare", "currentNode cost normal:" + r0.m1122a(r6, (byte) 0));
        android.util.Log.m5063d("RustedWarfare", "currentNode cost opposite:" + r0.m1122a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0733, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0736, code lost:
        if (r26 != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x073c, code lost:
        if (com.corrodinggames.rts.gameFramework.p043k.C0943l.f6214a == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x073f, code lost:
        android.util.Log.m5063d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0747, code lost:
        r29 = r0.f6289a;
        r30 = r0.f6290b;
        r27 = r0.f6289a;
        r28 = r0.f6290b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.p043k.C0943l.f6214a == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x076c, code lost:
        android.util.Log.m5063d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0774, code lost:
        r29 = r0.f6289a;
        r30 = r0.f6290b;
        r27 = r0.f6289a;
        r28 = r0.f6290b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0790, code lost:
        r25 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedList m1127e() {
        C0944m c0944m;
        byte b;
        byte b2;
        int m1123a;
        int i;
        if (C0943l.f6225l && !GameEngine.getGameEngine().f6367bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        C0942k c0942k = this.f6266D;
        int i2 = c0942k.f6200p ? 7 : 1;
        int i3 = c0942k.f6201q;
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "starting path for:" + this.f6274n.f6172a.toString());
        }
        C0947p c0947p = this.f6278r;
        C0947p c0947p2 = this.f6277q;
        int i4 = this.f6268h;
        int i5 = this.f6267g;
        this.f6285y = GameEngine.m1087V();
        short s = c0942k.f6192h;
        short s2 = c0942k.f6193i;
        boolean z = c0942k.f6195k;
        m1128d();
        m1136a(c0942k.f6199o, c0942k.f6192h, c0942k.f6193i, c0942k.f6194j);
        short s3 = c0942k.f6196l;
        short s4 = c0942k.f6197m;
        short s5 = c0942k.f6198n;
        LinkedList linkedList = new LinkedList();
        if (s == s3 && s2 == s4) {
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "no point pathing when start=end");
            }
            linkedList.clear();
            linkedList.add(new C0947p(s3, s4));
            return linkedList;
        } else if (this.f6274n.f6172a.equals(EnumC0246ao.NONE)) {
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "no point pathing for none");
            }
            linkedList.clear();
            return linkedList;
        } else {
            int i6 = 0;
            short s6 = s3;
            short s7 = s4;
            short s8 = s5;
            if (this.f6264e != null) {
                short[] sArr = this.f6264e;
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
                    if (C0943l.f6214a) {
                        Log.m5063d("RustedWarfare", "end is blocked on isolated groups");
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
                                    float m2216a = C0773f.m2216a(s14, s15, s3, s4);
                                    if (f == -1.0f || m2216a < f) {
                                        f = m2216a;
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
                                        float m2216a2 = C0773f.m2216a(s17, s19, s3, s4);
                                        if (f == -1.0f || m2216a2 < f) {
                                            f = m2216a2;
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
                    if (C0943l.f6214a) {
                        Log.m5063d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6285y));
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
                        if (s20 < 0 || s20 >= i5 || s21 < 0 || s21 >= i4 || m1139a(s20, s21) == -1) {
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
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "end is blocked on non isolated groups");
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
                            if (s24 >= 0 && s24 < i5 && s25 >= 0 && s25 < i4 && m1139a(s24, s25) != -1) {
                                float m2216a3 = C0773f.m2216a(s24, s25, s6, s7);
                                if (f2 == -1.0f || m2216a3 < f2) {
                                    f2 = m2216a3;
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
                                if (m1139a(s27, s29) != -1) {
                                    float m2216a4 = C0773f.m2216a(s27, s29, s6, s7);
                                    if (f2 == -1.0f || m2216a4 < f2) {
                                        f2 = m2216a4;
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
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6285y));
                }
            }
            if (C0943l.f6214a && (s6 != s3 || s7 != s4)) {
                Log.m5063d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
            }
            this.f6275o.m1149a(s6, s7);
            this.f6275o.m1148a(0, s, s2);
            this.f6276p.m1149a(s, s2);
            m1133a(s6, s7, s8);
            this.f6276p.m1148a(0, s6, s7);
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
                if (c0942k.f6207w) {
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
                    c0944m = this.f6275o;
                } else {
                    c0944m = this.f6276p;
                }
                C0945n m1145c = c0944m.m1145c();
                if (m1145c == null) {
                    if (!z5) {
                        if (C0943l.f6214a) {
                            Log.m5063d("RustedWarfare", "listNode==null for normal side ending path");
                        }
                    }
                } else {
                    C0947p m1124a = c0947p2.m1124a(m1145c);
                    int m1122a = m1124a.m1122a(this, b3);
                    byte m1112c = m1124a.m1112c(this, b3);
                    boolean m1111d = m1124a.m1111d(this, b3);
                    boolean z6 = false;
                    if (!z5) {
                        if (m1124a.f6289a == s6 && m1124a.f6290b == s7) {
                            if (C0943l.f6214a) {
                                Log.m5063d("RustedWarfare", "Over goal: fakeEnd");
                            }
                            z6 = true;
                        }
                        if (C0773f.m2137d(m1124a.f6289a - s3) <= s5 && C0773f.m2137d(m1124a.f6290b - s4) <= s5) {
                            if (C0943l.f6214a) {
                                Log.m5063d("RustedWarfare", "Over goal: real end");
                            }
                            z6 = true;
                        }
                    }
                    boolean m1114b = m1124a.m1114b(this, (byte) (1 - b3));
                    if (m1114b || z6) {
                        break;
                    }
                    m1124a.m1117a(this, b3, true);
                    if (m1111d) {
                        b = 0;
                        b2 = 7;
                    } else {
                        byte b4 = 2;
                        if (this.f6265f != null && this.f6265f[(m1124a.f6289a * i4) + m1124a.f6290b] > 1) {
                            b4 = 1;
                        }
                        b = (byte) (m1112c - b4);
                        b2 = (byte) (m1112c + b4);
                    }
                    byte b5 = b;
                    while (true) {
                        byte b6 = b5;
                        if (b6 <= b2) {
                            c0947p.m1116a(m1124a);
                            byte b7 = b6;
                            if (b7 > 7) {
                                b7 = (byte) (b7 - 8);
                            }
                            if (b7 < 0) {
                                b7 = (byte) (b7 + 8);
                            }
                            if (b7 == 0) {
                                c0947p.f6289a = (short) (c0947p.f6289a + 1);
                            }
                            if (b7 == 1) {
                                c0947p.f6289a = (short) (c0947p.f6289a + 1);
                                c0947p.f6290b = (short) (c0947p.f6290b + 1);
                            }
                            if (b7 == 2) {
                                c0947p.f6290b = (short) (c0947p.f6290b + 1);
                            }
                            if (b7 == 3) {
                                c0947p.f6290b = (short) (c0947p.f6290b + 1);
                                c0947p.f6289a = (short) (c0947p.f6289a - 1);
                            }
                            if (b7 == 4) {
                                c0947p.f6289a = (short) (c0947p.f6289a - 1);
                            }
                            if (b7 == 5) {
                                c0947p.f6289a = (short) (c0947p.f6289a - 1);
                                c0947p.f6290b = (short) (c0947p.f6290b - 1);
                            }
                            if (b7 == 6) {
                                c0947p.f6290b = (short) (c0947p.f6290b - 1);
                            }
                            if (b7 == 7) {
                                c0947p.f6290b = (short) (c0947p.f6290b - 1);
                                c0947p.f6289a = (short) (c0947p.f6289a + 1);
                            }
                            if (c0947p.f6289a >= 0 && c0947p.f6289a < i5 && c0947p.f6290b >= 0 && c0947p.f6290b < i4 && (m1123a = c0947p.m1123a(this)) != -1) {
                                int m1122a2 = c0947p.m1122a(this, b3);
                                if (!c0947p.m1114b(this, b3)) {
                                    if (c0947p.f6289a != m1124a.f6289a && c0947p.f6290b != m1124a.f6290b) {
                                        if (m1139a(c0947p.f6289a, m1124a.f6290b) != -1 && m1139a(m1124a.f6289a, c0947p.f6290b) != -1) {
                                            i = m1122a + 14 + m1123a + 1;
                                        }
                                    } else {
                                        i = m1122a + 10 + m1123a + 1;
                                    }
                                    if (m1112c != b7) {
                                        if (!m1111d) {
                                            i += m1131b(m1112c, b7);
                                        } else if (!z5) {
                                            if (z) {
                                                i += m1129c(m1112c, b7);
                                            } else {
                                                i += m1131b(m1112c, b7);
                                            }
                                        }
                                    }
                                    if (this.f6265f != null) {
                                        i += (4 - this.f6265f[(c0947p.f6289a * i4) + c0947p.f6290b]) * i2;
                                    }
                                    if (i3 > 0 && this.f6265f != null && this.f6265f[(c0947p.f6289a * i4) + c0947p.f6290b] <= i3) {
                                        i += 100;
                                    }
                                    if (m1122a2 < this.f6269i || i < m1122a2) {
                                        c0947p.m1121a(this, b3, b7);
                                        c0947p.m1117a(this, b3, false);
                                        c0947p.m1119a(this, b3, i);
                                        c0944m.m1148a(i - this.f6269i, c0947p.f6289a, c0947p.f6290b);
                                    }
                                }
                            }
                            b5 = (byte) (b6 + 1);
                        }
                    }
                }
            }
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "grid path finshed in :" + i16 + " ticks");
                Log.m5063d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.f6285y));
            }
            System.currentTimeMillis();
            if (!z4) {
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "could not find end node");
                }
                long currentTimeMillis = System.currentTimeMillis();
                float f3 = -1.0f;
                C0947p c0947p3 = new C0947p();
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
                            c0947p3.m1115a(s35, s37);
                            if (c0947p3.m1110e(this, (byte) 0)) {
                                float m2216a5 = C0773f.m2216a(s35, s37, s3, s4);
                                if (f3 == -1.0f || m2216a5 < f3) {
                                    f3 = m2216a5;
                                    s30 = s35;
                                    s31 = s37;
                                }
                            }
                            s36 = (short) (s37 + 1);
                        }
                    }
                    s34 = (short) (s35 + 1);
                }
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "got closest node in:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
            linkedList.clear();
            if (s30 != -1 && s31 != -1) {
                linkedList.addAll(m1134a(m1140a((byte) 0, s30, s31)));
            }
            if (s32 != -1 && s33 != -1) {
                linkedList.addAll(m1140a((byte) 1, s32, s33));
            }
            if (linkedList.size() > 1) {
                linkedList.remove(0);
            }
            this.f6286z = GameEngine.m1087V();
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "path(" + c0942k.f6189e + ") finished in:" + (this.f6286z - this.f6285y));
            }
            if (C0943l.f6225l && !GameEngine.getGameEngine().f6367bH) {
                Debug.stopMethodTracing();
                C0943l.f6225l = false;
            }
            return linkedList;
        }
    }

    /* renamed from: a */
    public LinkedList m1140a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        C0947p c0947p = new C0947p(s, s2);
        linkedList.add(c0947p);
        while (true) {
            C0947p m1109f = c0947p.m1109f(this, b);
            if (m1109f != null) {
                linkedList.add(m1109f);
                c0947p = m1109f;
            } else {
                return linkedList;
            }
        }
    }

    /* renamed from: a */
    public LinkedList m1134a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((C0947p) it.next());
        }
        return linkedList2;
    }

    /* renamed from: f */
    public void m1126f() {
        m1125g();
    }

    /* renamed from: g */
    public void m1125g() {
        byte b;
        byte b2;
        int m1123a;
        int i;
        C0937f c0937f = (C0937f) this.f6266D;
        C0938g c0938g = new C0938g(this.f6267g, this.f6268h);
        if (C0943l.f6225l && !GameEngine.getGameEngine().f6367bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "starting path for:" + this.f6274n.f6172a.toString());
        }
        C0947p c0947p = this.f6278r;
        C0947p c0947p2 = this.f6277q;
        int i2 = this.f6268h;
        int i3 = this.f6267g;
        this.f6285y = GameEngine.m1087V();
        short s = c0937f.f6192h;
        short s2 = c0937f.f6193i;
        boolean z = c0937f.f6195k;
        m1128d();
        m1136a(c0937f.f6199o, c0937f.f6192h, c0937f.f6193i, c0937f.f6194j);
        short s3 = c0937f.f6196l;
        short s4 = c0937f.f6197m;
        short s5 = c0937f.f6198n;
        new LinkedList();
        if (this.f6274n.f6172a.equals(EnumC0246ao.NONE)) {
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "no point pathing for none");
                return;
            }
            return;
        }
        int i4 = 0;
        short s6 = s3;
        short s7 = s4;
        short s8 = s5;
        if (this.f6264e != null) {
            short[] sArr = this.f6264e;
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
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "end is blocked on isolated groups");
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
                                float m2216a = C0773f.m2216a(s14, s15, s3, s4);
                                if (f == -1.0f || m2216a < f) {
                                    f = m2216a;
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
                                    float m2216a2 = C0773f.m2216a(s17, s19, s3, s4);
                                    if (f == -1.0f || m2216a2 < f) {
                                        f = m2216a2;
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
                if (C0943l.f6214a) {
                    Log.m5063d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6285y));
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
                    if (s20 < 0 || s20 >= i3 || s21 < 0 || s21 >= i2 || m1139a(s20, s21) == -1) {
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
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "end is blocked on non isolated groups");
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
                        if (s24 >= 0 && s24 < i3 && s25 >= 0 && s25 < i2 && m1139a(s24, s25) != -1) {
                            float m2216a3 = C0773f.m2216a(s24, s25, s6, s7);
                            if (f2 == -1.0f || m2216a3 < f2) {
                                f2 = m2216a3;
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
                            if (m1139a(s27, s29) != -1) {
                                float m2216a4 = C0773f.m2216a(s27, s29, s6, s7);
                                if (f2 == -1.0f || m2216a4 < f2) {
                                    f2 = m2216a4;
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
            if (C0943l.f6214a) {
                Log.m5063d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6285y));
            }
        }
        if (C0943l.f6214a && (s6 != s3 || s7 != s4)) {
            Log.m5063d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
        }
        this.f6275o.m1149a(s6, s7);
        this.f6275o.m1148a(0, s, s2);
        this.f6276p.m1149a(s, s2);
        m1133a(s6, s7, s8);
        this.f6276p.m1148a(0, s6, s7);
        int i13 = 0;
        while (0 == 0) {
            i13++;
            if (c0937f.f6207w) {
                return;
            }
            i4++;
            C0944m c0944m = this.f6276p;
            C0945n m1145c = c0944m.m1145c();
            if (m1145c == null) {
                break;
            }
            C0947p m1124a = c0947p2.m1124a(m1145c);
            int m1122a = m1124a.m1122a(this, (byte) 1);
            byte m1223a = (byte) (c0938g.m1223a(m1124a) - 1);
            boolean m1220b = c0938g.m1220b(m1124a);
            c0938g.m1221a(m1124a, true);
            if (m1220b) {
                b = 0;
                b2 = 7;
            } else {
                byte b3 = 2;
                if (this.f6265f != null && this.f6265f[(m1124a.f6289a * i2) + m1124a.f6290b] > 1) {
                    b3 = 1;
                }
                b = (byte) (m1223a - b3);
                b2 = (byte) (m1223a + b3);
            }
            byte b4 = b;
            while (true) {
                byte b5 = b4;
                if (b5 <= b2) {
                    c0947p.m1116a(m1124a);
                    byte b6 = b5;
                    if (b6 > 7) {
                        b6 = (byte) (b6 - 8);
                    }
                    if (b6 < 0) {
                        b6 = (byte) (b6 + 8);
                    }
                    if (b6 == 0) {
                        c0947p.f6289a = (short) (c0947p.f6289a + 1);
                    }
                    if (b6 == 1) {
                        c0947p.f6289a = (short) (c0947p.f6289a + 1);
                        c0947p.f6290b = (short) (c0947p.f6290b + 1);
                    }
                    if (b6 == 2) {
                        c0947p.f6290b = (short) (c0947p.f6290b + 1);
                    }
                    if (b6 == 3) {
                        c0947p.f6290b = (short) (c0947p.f6290b + 1);
                        c0947p.f6289a = (short) (c0947p.f6289a - 1);
                    }
                    if (b6 == 4) {
                        c0947p.f6289a = (short) (c0947p.f6289a - 1);
                    }
                    if (b6 == 5) {
                        c0947p.f6289a = (short) (c0947p.f6289a - 1);
                        c0947p.f6290b = (short) (c0947p.f6290b - 1);
                    }
                    if (b6 == 6) {
                        c0947p.f6290b = (short) (c0947p.f6290b - 1);
                    }
                    if (b6 == 7) {
                        c0947p.f6290b = (short) (c0947p.f6290b - 1);
                        c0947p.f6289a = (short) (c0947p.f6289a + 1);
                    }
                    if (c0947p.f6289a >= 0 && c0947p.f6289a < i3 && c0947p.f6290b >= 0 && c0947p.f6290b < i2 && (m1123a = c0947p.m1123a(this)) != -1) {
                        int m1122a2 = c0947p.m1122a(this, (byte) 1);
                        if (!c0938g.m1219c(c0947p)) {
                            if (c0947p.f6289a != m1124a.f6289a && c0947p.f6290b != m1124a.f6290b) {
                                if (m1139a(c0947p.f6289a, m1124a.f6290b) != -1 && m1139a(m1124a.f6289a, c0947p.f6290b) != -1) {
                                    i = m1122a + 14 + m1123a + 1;
                                }
                            } else {
                                i = m1122a + 10 + m1123a + 1;
                            }
                            if (m1223a != b6 && !m1220b) {
                                i += m1131b(m1223a, b6);
                            }
                            if (this.f6265f != null) {
                                i += (4 - this.f6265f[(c0947p.f6289a * i2) + c0947p.f6290b]) * 7;
                            }
                            if (0 > 0 && this.f6265f != null && this.f6265f[(c0947p.f6289a * i2) + c0947p.f6290b] <= 0) {
                                i += 100;
                            }
                            if (m1122a2 < this.f6269i || i < m1122a2) {
                                c0938g.m1222a(c0947p, (byte) (b6 + 1));
                                c0938g.m1221a(c0947p, false);
                                c0947p.m1119a(this, (byte) 1, i);
                                c0944m.m1148a(i - this.f6269i, c0947p.f6289a, c0947p.f6290b);
                            }
                        }
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
        }
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "grid path finshed in :" + i13 + " ticks");
            Log.m5063d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.f6285y));
        }
        System.currentTimeMillis();
        c0938g.f6164c = s6;
        c0938g.f6165d = s7;
        c0937f.f6159b = c0938g;
        C0943l.f6218e = c0937f;
        this.f6286z = GameEngine.m1087V();
        if (C0943l.f6214a) {
            Log.m5063d("RustedWarfare", "path(" + c0937f.f6189e + ") finished in:" + (this.f6286z - this.f6285y));
        }
        if (C0943l.f6225l && !GameEngine.getGameEngine().f6367bH) {
            Debug.stopMethodTracing();
            C0943l.f6225l = false;
        }
    }
}