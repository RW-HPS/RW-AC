package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am.class */
public class am {
    au e;
    as k;
    boolean l;
    String m;
    boolean n;
    boolean o;
    float p;
    float q;
    float r;
    public boolean s;
    public String t;
    public boolean u;
    String v;
    Context w;
    boolean x;
    boolean y;
    int z;
    as A;
    boolean B;
    boolean C;
    float D;
    float H;
    boolean L;
    boolean M;

    /* renamed from: a */
    public static aq f403a = new an();
    static HashMap J = new HashMap();
    static int K = 0;
    Object b = new Object();
    Object c = new Object();
    volatile float d = 1.0f;
    volatile boolean f = false;
    volatile boolean g = true;
    float h = 0.0f;
    int i = 0;
    boolean j = false;
    boolean E = false;
    public boolean F = false;
    boolean G = false;
    ArrayList I = new ArrayList();
    long N = -1;

    public float a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        return gameEngine.settingsEngine.musicVolume * gameEngine.settingsEngine.masterVolume;
    }

    public boolean b() {
        return (GameEngine.ax() || this.u || a() <= 0.01f) ? false : true;
    }

    public void a(Context context) {
        this.w = context;
        if (GameEngine.ax()) {
            return;
        }
        f403a.a(this);
        this.k = f403a.a();
        this.A = f403a.a();
        at.c();
        if (f403a.d()) {
            this.e = new au(this);
            this.e.start();
        }
    }

    public void c() {
        if (!GameEngine.av()) {
            this.l = false;
            this.m = null;
            this.x = true;
            this.B = false;
        }
        this.y = true;
        this.u = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ar a(String str, boolean z) {
        ar arVar = (ar) J.get(str);
        if (arVar != null) {
            return arVar;
        }
        try {
            ar a2 = f403a.a(str);
            if (z) {
                J.put(str, a2);
            }
            return a2;
        } catch (ArithmeticException e) {
            K++;
            GameEngine.a("Error loading:" + str, (Throwable) e);
            if (K > 2 && K <= 4) {
                GameEngine.getGameEngine().i("Failed to load music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e);
            }
            return null;
        } catch (Exception e2) {
            K++;
            GameEngine.a("Exception loading:" + str, (Throwable) e2);
            if (K > 2 && K <= 4) {
                GameEngine.getGameEngine().i("Unknown error loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e2);
            }
            return null;
        } catch (OutOfMemoryError e3) {
            K++;
            GameEngine.a("OutOfMemoryError loading:" + str, e3);
            GameEngine.aC();
            System.gc();
            GameEngine.aC();
            if (K < 3) {
                GameEngine.getGameEngine().i("Ran out of memory loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e3);
            }
            return null;
        }
    }

    public ArrayList d() {
        ArrayList arrayList = new ArrayList();
        for (String str : at.starting.b()) {
            arrayList.add(str);
        }
        for (String str2 : at.buildup.b()) {
            arrayList.add(str2);
        }
        for (String str3 : at.starting.b()) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    public String a(at atVar) {
        return a(atVar, atVar);
    }

    public String a(at atVar, at atVar2) {
        at atVar3;
        GameEngine.getGameEngine();
        if (f.c(atVar.b().length + atVar2.b().length) < atVar.b().length) {
            atVar3 = atVar;
        } else {
            atVar3 = atVar2;
        }
        String[] b = atVar3.b();
        return atVar3.a(b[f.c(b.length)]);
    }

    public synchronized void e() {
        this.s = true;
        this.u = false;
        this.t = null;
    }

    public synchronized void a(String str) {
        this.s = true;
        this.u = false;
        this.t = str;
    }

    public synchronized void a(float f) {
        if (GameEngine.ax()) {
            return;
        }
        if (!f403a.d()) {
            if (!this.L) {
                b(f);
            }
            this.g = true;
        }
        this.N = GameEngine.V();
        if (GameEngine.getGameEngine().bT.H.a()) {
            e();
        }
        if (this.v != null) {
            GameNetEngine.a((String) null, this.v);
            this.v = null;
        }
        if (this.p != a()) {
            this.p = a();
            this.o = true;
        }
        synchronized (this.c) {
            this.d = f;
            if (this.L) {
                if (!this.M) {
                    this.M = true;
                    GameEngine.n("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                }
                return;
            }
            if (!this.g) {
                this.h += f;
                this.i++;
                if (this.h > 320.0f && this.i > 80 && !this.j) {
                    this.j = true;
                    GameEngine.n("Lockup detected in music subsystem");
                }
            } else {
                this.h = 0.0f;
                this.i = 0;
            }
            this.g = false;
            this.f = true;
            this.c.notifyAll();
        }
    }

    public String b(String str) {
        return f.g(f.k(str)).replace("[noloop]", VariableScope.nullOrMissingString).replace("_", " ");
    }

    public boolean b(float f) {
        try {
            c(f);
            return true;
        } catch (Exception e) {
            GameEngine.a("Music system crashed", (Throwable) e);
            this.L = true;
            GameEngine.m3e("Stopping music");
            try {
                g();
                return false;
            } catch (Exception e2) {
                GameEngine.a("crash stopping music", (Throwable) e2);
                return false;
            }
        }
    }

    public void c(float f) {
        float a2;
        float a3;
        if (GameEngine.ax()) {
            return;
        }
        f403a.a(f);
        if (!b()) {
            if (this.l && this.k.c()) {
                g();
                this.l = false;
                this.B = false;
                return;
            }
            return;
        }
        boolean z = false;
        if (!this.l) {
            z = true;
        }
        if (this.n) {
            if (!this.C) {
                this.q += f;
            }
            if (this.q > 600.0f) {
                this.r += f;
                if (this.r > 100.0f) {
                    this.r = 0.0f;
                    if (!this.l || !this.k.c()) {
                        z = true;
                        this.q = 0.0f;
                    }
                }
            }
        } else {
            this.q += f;
            if (this.q > 3600.0f) {
                GameEngine.m3e("Next music track, timer:" + this.q);
                z = true;
                this.q = 0.0f;
            }
        }
        if (this.y) {
            com.corrodinggames.rts.gameFramework.mod.b z2 = com.corrodinggames.rts.gameFramework.f.g.z();
            if (z2 != null && z2.N) {
                z = true;
            }
            this.y = false;
        }
        if (z || this.s) {
            boolean z3 = this.s;
            String str = this.t;
            if (this.s) {
                GameEngine.m3e("Next music track requested");
                this.s = false;
                this.q = 0.0f;
                this.t = null;
            }
            String str2 = null;
            boolean z4 = false;
            com.corrodinggames.rts.gameFramework.mod.b bVar = null;
            if (str != null) {
                ArrayList i = GameEngine.getGameEngine().bZ.i();
                i.addAll(d());
                if (str.endsWith(".ogg") || str.endsWith(".wav")) {
                    b(str);
                }
                Iterator it = i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (b(str3).equalsIgnoreCase(str)) {
                        z4 = true;
                        str2 = str3;
                        break;
                    }
                }
                if (str2 == null) {
                    GameEngine.m3e("Failed to find requested music: " + str);
                }
            }
            com.corrodinggames.rts.gameFramework.mod.b z5 = com.corrodinggames.rts.gameFramework.f.g.z();
            if (str2 == null && z5 != null && z5.P < 10 && z5.N) {
                ArrayList q = z5.q();
                if (q.size() > 0) {
                    z4 = true;
                    bVar = z5;
                    str2 = (String) q.get(f.a(0, q.size() - 1));
                    if (z3 || this.I.contains(str2)) {
                        for (int i2 = 0; i2 < 30 && (str2.equals(this.m) || this.I.contains(str2)); i2++) {
                            str2 = (String) q.get(f.a(0, q.size() - 1));
                            if (i2 > 20) {
                                this.I.clear();
                            }
                        }
                    }
                    GameEngine.m3e("Playing music from mod:" + z5.a() + " - '" + str2 + "'");
                }
            }
            if (str2 == null) {
                if (this.x) {
                    str2 = a(at.starting);
                } else {
                    str2 = a(at.buildup, at.starting);
                }
                if (z3 || this.I.contains(str2)) {
                    for (int i3 = 0; i3 < 30 && (str2.equals(this.m) || this.I.contains(str2)); i3++) {
                        str2 = a(at.buildup, at.starting);
                        if (i3 > 20) {
                            this.I.clear();
                        }
                    }
                }
            }
            if (!str2.equals(this.m)) {
                this.m = str2;
                this.x = false;
                this.q = 0.0f;
                this.n = z4 || str2.contains("[noloop]");
                this.I.add(str2);
                if (this.I.size() > 4) {
                    this.I.remove(0);
                }
                if (z3) {
                    this.v = "Now playing: " + b(str2);
                }
                as asVar = this.k;
                this.k = this.A;
                this.A = asVar;
                try {
                    try {
                        this.k.a(a(str2, false));
                        this.k.a(!this.n);
                        this.E = false;
                        if (!z3 && this.B) {
                            this.E = true;
                        }
                        if (this.l) {
                            this.B = true;
                        }
                        this.C = true;
                        this.G = false;
                        this.D = 1.0f;
                        this.l = true;
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        if (this.z < 3) {
                            this.v = "Failed to play music track: " + str2;
                            this.z++;
                        }
                        if (bVar != null) {
                            bVar.P++;
                            return;
                        }
                        return;
                    }
                } catch (RuntimeException e2) {
                    e2.printStackTrace();
                    if (this.z < 3) {
                        this.v = "Failed to open music track: " + str2;
                        this.z++;
                    }
                    if (bVar != null) {
                        bVar.P++;
                        return;
                    }
                    return;
                }
            } else if (z3) {
                GameEngine.m3e("Same music found");
            }
        }
        if (this.C || this.o) {
            boolean c = f403a.c();
            if (!c) {
                if (this.F) {
                    this.D -= f * 0.1f;
                } else {
                    this.D -= f * 0.006f;
                }
            } else if (this.F) {
                this.D -= f * 0.1f;
            } else if (this.E) {
                this.D -= f * 0.003f;
            } else {
                this.D -= f * 0.008f;
            }
            if (!c) {
                a2 = this.D * a();
                a3 = (1.0f - this.D) * a();
            } else {
                a2 = ((this.D * 2.0f) - 1.0f) * a();
                a3 = (1.0f - (this.D * 2.0f)) * a();
            }
            float b = f.b(a2, 0.0f, 1.0f);
            float b2 = f.b(a3, 0.0f, 1.0f);
            if (this.C) {
                if (this.D <= 0.0f) {
                    this.C = false;
                    this.E = false;
                    if (this.B && !this.G) {
                        this.G = true;
                        this.A.d();
                    }
                    if (this.l) {
                        this.k.a(a(), a());
                    }
                } else {
                    this.H += f;
                    if (this.H > 10.0f) {
                        this.H = 0.0f;
                        if (this.B && !this.G) {
                            this.A.a(b, b);
                            if (b < 0.02f) {
                                this.G = true;
                                this.A.d();
                            }
                        }
                        if (this.l) {
                            this.k.a(b2, b2);
                        }
                    }
                }
            } else if (this.l) {
                this.k.a(b2, b2);
            }
        }
        this.o = false;
    }

    public void f() {
        Log.a("RustedWarfare", "Music:pause()");
        new AnonymousClass1().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$1.class */
    public class AnonymousClass1 extends Thread {
        AnonymousClass1() {
        }

        public void run() {
            if (am.this.j) {
                Log.a("RustedWarfare", "Music:pause() unsynchronized");
                am.this.g();
                return;
            }
            synchronized (am.this.b) {
                Log.a("RustedWarfare", "Music:pause() synchronized");
                am.this.g();
            }
        }
    }

    public void g() {
        if (this.l) {
            this.k.a();
        }
        if (this.B) {
            this.A.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$2.class */
    public class AnonymousClass2 extends Thread {
        AnonymousClass2() {
        }

        public void run() {
            synchronized (am.this.b) {
                if (am.this.l) {
                    am.this.k.b();
                    if (!am.this.C) {
                        am.this.k.a(am.this.a(), am.this.a());
                    }
                }
                if (am.this.B) {
                    am.this.A.b();
                }
            }
        }
    }

    public void h() {
        new AnonymousClass2().start();
    }

    public void i() {
        f403a.b();
        if (this.B) {
            this.A.d();
            this.A.e();
        }
        if (this.k != null) {
            this.k.d();
            this.k.e();
        }
        this.k = null;
        this.m = null;
        this.l = false;
    }

    public boolean j() {
        if (this.C) {
            return true;
        }
        return false;
    }
}