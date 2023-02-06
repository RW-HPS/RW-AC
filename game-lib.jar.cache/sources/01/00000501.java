package com.corrodinggames.rts.gameFramework.mod;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.file.g;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.i.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/b.class */
public class b implements Comparable {
    public int a;
    public String c;
    public String d;
    public String e;
    public boolean f;
    public boolean g;
    public boolean h;
    public boolean i;
    public boolean j;
    public long k;
    boolean l;
    public boolean m;
    public String n;
    public String o;
    public String p;
    public String q;
    public boolean r;
    public String s;
    public String t;
    public String u;
    public String v;
    public int w;
    public int x;
    public boolean y;
    public boolean z;
    public boolean A = false;
    public boolean B = true;
    public boolean C;
    public boolean D;
    public int E;
    public int F;
    public long G;
    public long H;
    public int I;
    public int J;
    public int L;
    public String M;
    public boolean N;
    public boolean O;
    public int P;
    ArrayList Q;
    public String R;
    public String S;
    public String T;
    public ArrayList U;
    public ArrayList V;
    public static int b = 1;
    public static int K = 1;

    public b() {
        int i = K;
        K = i + 1;
        this.L = i;
        this.Q = new ArrayList();
        this.U = new ArrayList();
        this.V = new ArrayList();
        this.a = b;
        b++;
    }

    public String a() {
        if (this.s != null) {
            return this.s;
        }
        if (this.t != null) {
            return this.t;
        }
        return this.c;
    }

    public String b() {
        return f.a(a(), 25);
    }

    public String c() {
        return f.a(a(), 40);
    }

    public int d() {
        return this.L;
    }

    public String e() {
        return f();
    }

    public String f() {
        String str = VariableScope.nullOrMissingString;
        if (this.u != null) {
            str = str + this.u;
        }
        String str2 = "RAM:" + s();
        if (this.n != null) {
            str2 = str2 + " Storage: slow external unpacked";
        }
        if (GameEngine.at() && this.q != null && a.a(this.q) && !this.j) {
            str2 = str2 + " Warning: slow external storage";
        }
        return str + "\n (" + str2 + ")";
    }

    public String g() {
        if (this.y) {
            return this.q;
        }
        return a.e(this.q);
    }

    public String h() {
        if (this.y) {
            return this.p;
        }
        return a.e(this.p);
    }

    public String i() {
        return new File(g()).getAbsolutePath();
    }

    public String j() {
        return this.q;
    }

    public String k() {
        return new File(g()).getCanonicalPath();
    }

    public String l() {
        String str = this.S;
        if (this.T != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + this.T;
        }
        if (str == null && this.U.size() > 0) {
            str = VariableScope.nullOrMissingString;
            int i = 0;
            int i2 = 0;
            Iterator it = this.U.iterator();
            while (it.hasNext()) {
                String str2 = (String) it.next();
                if (i2 <= 2) {
                    if (str == null) {
                        str = str2;
                    } else {
                        str = str + "\n" + str2;
                    }
                } else {
                    i++;
                }
                i2++;
            }
            if (i > 0) {
                str = str + "\n" + i + " more warnings...";
            }
        }
        if ((!this.C || str != null) && !this.D && str == null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "Not yet loaded, reload needed";
        }
        return str;
    }

    public boolean m() {
        return !this.f && this.R == null;
    }

    public void a(String str) {
        GameEngine.print("Adding error for mod: " + b() + (m() ? VariableScope.nullOrMissingString : "(disabled)") + ": " + str);
        if (this.R == null) {
            if (!this.f) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                String str2 = str;
                if (str2 != null && (!str2.contains(a()) || str2.contains(b()))) {
                    str2 = "Error loading mod '" + b() + "': " + str2;
                }
                int d = gameEngine.bZ.d(b());
                if (d > 1) {
                    str2 = str2 + " (NOTE: You have " + d + " mods with the same title: '" + b() + "' this might make debugging tricky)";
                }
                gameEngine.i(str2);
            }
            GameEngine.m5e("Disabling mod due to error: " + b() + " path:" + i());
            this.R = str;
        }
        this.V.add(str);
    }

    public void b(String str) {
        if (this.U.contains(str)) {
            return;
        }
        this.U.add(str);
    }

    public String a(String str, int i) {
        String[] h;
        String a;
        if (i > 4 || (h = a.h(str)) == null) {
            return null;
        }
        for (String str2 : h) {
            if (str2.equalsIgnoreCase("mod-info.txt")) {
                return str + "/mod-info.txt";
            }
        }
        if (h.length > 5) {
            return null;
        }
        int length = h.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = str + "/" + h[i2];
            if (a.f(str3) && (a = a(str3, i + 1)) != null) {
                return a;
            }
        }
        return null;
    }

    public void n() {
        if (GameEngine.getGameEngine().d()) {
            GameEngine.m5e("SAFE MODE: skipping setSourceFolder");
        } else if (!g.f("mods-info", this.q + "/mod-info.txt")) {
            String str = this.q;
            if (str == null) {
                GameEngine.m5e("setSourceFolder: sourceFolder==null");
                return;
            }
            String[] d = g.d("mods-dir-search", str);
            if (d != null && d.length == 1) {
                String str2 = str + "/" + d[0];
                String str3 = str2 + "/mod-info.txt";
                if (a.f(str2) && a.i(str3)) {
                    GameEngine.m5e("Changing mod sourceFolder to:" + str2);
                    this.q = str2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.io.InputStream] */
    public ab o() {
        j k;
        String a;
        if (this.q == null) {
            GameEngine.m5e("No source yet for mod: " + this.c);
            return null;
        }
        String str = this.q + "/mod-info.txt";
        try {
            if (this.j) {
                k = g.e("mods-info", str);
            } else {
                k = a.k(str);
            }
            if (k == null && (a = a(this.q, 1)) != null) {
                j k2 = a.k(str);
                if (k2 != null) {
                    GameEngine.a("mod-info.txt cache seems to be invalid for: " + str);
                    g.c("mods-info", str);
                    k = k2;
                } else {
                    a("No mod info at " + a.d(str) + " but found one nested at: " + a.d(a) + " (Hint: This mod might have been extracted with an extra folder)");
                }
            }
            if (k == null) {
                GameEngine.m5e("No mod info for: " + this.c + " at " + str);
                return null;
            }
            try {
                return new ab(k, str);
            } catch (IOException e) {
                GameEngine.m5e("Error loading mod info for: " + this.c + " at " + str);
                e.printStackTrace();
                b("Error loading mod-info.txt: " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            GameEngine.m5e("Error loading mod info for: " + this.c + " at " + str);
            e2.printStackTrace();
            b("Error loading mod-info.txt: " + e2.getMessage());
            return null;
        }
    }

    public String p() {
        String c = c("thumbnail");
        if (c != null) {
            return i() + "/" + c;
        }
        return null;
    }

    public ArrayList q() {
        return this.Q;
    }

    public String c(String str) {
        ab o = o();
        if (o == null) {
            return null;
        }
        return o.b("mod", str, (String) null);
    }

    public void r() {
        if (GameEngine.getGameEngine().d()) {
            GameEngine.m5e("SAFE MODE: refreshData: Skipping mod read");
            this.u = "<< SAFE MODE ACTIVE: MOD DATA SKIPPED. RESTART IN NORMAL MODE. >>";
            return;
        }
        ab o = o();
        if (o != null) {
            this.s = o.b("mod", "title", (String) null);
            this.u = o.b("mod", "description", (String) null);
            if (this.u != null && this.u.contains("\\n")) {
                this.u = this.u.replace("\\n", "\n");
            }
            this.v = o.b("mod", "minVersion", (String) null);
            if (this.v != null && !this.v.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    ModEngine.a(this.v);
                } catch (bo e) {
                    a(e.getMessage());
                }
            }
            this.M = o.b("music", "sourceFolder", (String) null);
            this.N = o.a("music", "whenUsingUnitsFromThisMod_playExclusively", (Boolean) false).booleanValue();
            this.O = o.a("music", "addToNormalPlaylist", (Boolean) false).booleanValue();
            if (this.M != null && m()) {
                GameEngine.m5e("Loading music for: " + a());
                String b2 = f.b(this.q, this.M);
                String[] d = g.d("mods-dir-music", b2);
                if (d == null) {
                    b("Could not read target music folder: " + a.e(b2));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str : d) {
                        if (str.toLowerCase().endsWith(".ogg")) {
                            String b3 = f.b(b2, str);
                            if (!this.Q.contains(b3)) {
                                GameEngine.m5e("Found music track: " + str);
                            }
                            arrayList.add(b3);
                        }
                    }
                    this.Q = arrayList;
                    if (this.Q.size() == 0) {
                        b("Could not find any .ogg files in music folder: " + a.e(b2));
                    }
                }
            }
            this.r = true;
        }
        String w = w();
        File file = new File(w);
        if (file.exists() && !file.isDirectory()) {
            ab abVar = null;
            try {
                abVar = new ab(w);
            } catch (IOException e2) {
                e2.printStackTrace();
                b("IO error reading: " + a.e(w));
            }
            if (abVar != null) {
                this.k = abVar.a("steam", "id", 0L);
            }
        }
    }

    private String w() {
        return g() + "/steam.dat";
    }

    public boolean a(long j) {
        this.k = j;
        String w = w();
        try {
            PrintWriter printWriter = new PrintWriter(w);
            printWriter.println("[steam]");
            printWriter.println("id: " + j);
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            GameEngine.getGameEngine().i("IO error: Failed to save workshop id for mod at: " + w);
            return false;
        }
    }

    public String s() {
        return VariableScope.nullOrMissingString + String.format("%.2f", Float.valueOf((float) (((this.G + this.H) / 1000.0d) / 1000.0d))) + " mb" + (this.C ? " - disabled" : VariableScope.nullOrMissingString);
    }

    public void t() {
        GameEngine.m5e("Mod: '" + a() + "' - Memory use:" + s() + " " + (m() ? VariableScope.nullOrMissingString : " (disabled)"));
    }

    public boolean u() {
        GameEngine.m5e("Trying to delete mod: '" + a() + "'");
        String h = h();
        GameEngine.m5e("sourceFolder: '" + h + "'");
        if (!v()) {
            GameEngine.m5e("Mod: '" + a() + "' - Cannot be deleted");
            return false;
        }
        File file = new File(h);
        if (!a.i(file.getAbsolutePath())) {
            GameEngine.m5e("Mod: '" + a() + "' - cannot delete: Not a file");
            return false;
        }
        boolean b2 = a.b(file);
        GameEngine.m5e("Delete result: " + b2);
        return b2;
    }

    public boolean v() {
        if (this.z) {
            return false;
        }
        if (GameEngine.aZ && this.j) {
            return true;
        }
        if (GameEngine.at() && this.j) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(b bVar) {
        if (bVar == null) {
            return 0;
        }
        int i = this.x;
        int i2 = bVar.x;
        if (i != i2) {
            return i - i2;
        }
        String a = a();
        String a2 = bVar.a();
        if (a == null) {
            a = VariableScope.nullOrMissingString;
        }
        if (a2 == null) {
            a2 = VariableScope.nullOrMissingString;
        }
        return a.compareTo(a2);
    }
}