package com.corrodinggames.rts.gameFramework.mod;

import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.file.C0771g;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.i.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/b.class */
public class C0859b implements Comparable {

    /* renamed from: a */
    public int f5627a;

    /* renamed from: c */
    public String f5628c;

    /* renamed from: d */
    public String f5629d;

    /* renamed from: e */
    public String f5630e;

    /* renamed from: f */
    public boolean f5631f;

    /* renamed from: g */
    public boolean f5632g;

    /* renamed from: h */
    public boolean f5633h;

    /* renamed from: i */
    public boolean f5634i;

    /* renamed from: j */
    public boolean f5635j;

    /* renamed from: k */
    public long f5636k;

    /* renamed from: l */
    boolean f5637l;

    /* renamed from: m */
    public boolean f5638m;

    /* renamed from: n */
    public String f5639n;

    /* renamed from: o */
    public String f5640o;

    /* renamed from: p */
    public String f5641p;

    /* renamed from: q */
    public String f5642q;

    /* renamed from: r */
    public boolean f5643r;

    /* renamed from: s */
    public String f5644s;

    /* renamed from: t */
    public String f5645t;

    /* renamed from: u */
    public String f5646u;

    /* renamed from: v */
    public String f5647v;

    /* renamed from: w */
    public int f5648w;

    /* renamed from: x */
    public int f5649x;

    /* renamed from: y */
    public boolean f5650y;

    /* renamed from: z */
    public boolean f5651z;

    /* renamed from: A */
    public boolean f5652A = false;

    /* renamed from: B */
    public boolean f5653B = true;

    /* renamed from: C */
    public boolean f5654C;

    /* renamed from: D */
    public boolean f5655D;

    /* renamed from: E */
    public int f5656E;

    /* renamed from: F */
    public int f5657F;

    /* renamed from: G */
    public long f5658G;

    /* renamed from: H */
    public long f5659H;

    /* renamed from: I */
    public int f5660I;

    /* renamed from: J */
    public int f5661J;

    /* renamed from: L */
    public int f5662L;

    /* renamed from: M */
    public String f5663M;

    /* renamed from: N */
    public boolean f5664N;

    /* renamed from: O */
    public boolean f5665O;

    /* renamed from: P */
    public int f5666P;

    /* renamed from: Q */
    ArrayList f5667Q;

    /* renamed from: R */
    public String f5668R;

    /* renamed from: S */
    public String f5669S;

    /* renamed from: T */
    public String f5670T;

    /* renamed from: U */
    public ArrayList f5671U;

    /* renamed from: V */
    public ArrayList f5672V;

    /* renamed from: b */
    public static int f5673b = 1;

    /* renamed from: K */
    public static int f5674K = 1;

    public C0859b() {
        int i = f5674K;
        f5674K = i + 1;
        this.f5662L = i;
        this.f5667Q = new ArrayList();
        this.f5671U = new ArrayList();
        this.f5672V = new ArrayList();
        this.f5627a = f5673b;
        f5673b++;
    }

    /* renamed from: a */
    public String m1673a() {
        if (this.f5644s != null) {
            return this.f5644s;
        }
        if (this.f5645t != null) {
            return this.f5645t;
        }
        return this.f5628c;
    }

    /* renamed from: b */
    public String m1668b() {
        return C0773f.m2184a(m1673a(), 25);
    }

    /* renamed from: c */
    public String m1666c() {
        return C0773f.m2184a(m1673a(), 40);
    }

    /* renamed from: d */
    public int m1664d() {
        return this.f5662L;
    }

    /* renamed from: e */
    public String m1663e() {
        return m1662f();
    }

    /* renamed from: f */
    public String m1662f() {
        String str = VariableScope.nullOrMissingString;
        if (this.f5646u != null) {
            str = str + this.f5646u;
        }
        String str2 = "RAM:" + m1649s();
        if (this.f5639n != null) {
            str2 = str2 + " Storage: slow external unpacked";
        }
        if (GameEngine.m1030at() && this.f5642q != null && C0765a.m2299a(this.f5642q) && !this.f5635j) {
            str2 = str2 + " Warning: slow external storage";
        }
        return str + "\n (" + str2 + ")";
    }

    /* renamed from: g */
    public String m1661g() {
        if (this.f5650y) {
            return this.f5642q;
        }
        return C0765a.m2283e(this.f5642q);
    }

    /* renamed from: h */
    public String m1660h() {
        if (this.f5650y) {
            return this.f5641p;
        }
        return C0765a.m2283e(this.f5641p);
    }

    /* renamed from: i */
    public String m1659i() {
        return new File(m1661g()).getAbsolutePath();
    }

    /* renamed from: j */
    public String m1658j() {
        return this.f5642q;
    }

    /* renamed from: k */
    public String m1657k() {
        return new File(m1661g()).getCanonicalPath();
    }

    /* renamed from: l */
    public String m1656l() {
        String str = this.f5669S;
        if (this.f5670T != null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + this.f5670T;
        }
        if (str == null && this.f5671U.size() > 0) {
            str = VariableScope.nullOrMissingString;
            int i = 0;
            int i2 = 0;
            Iterator it = this.f5671U.iterator();
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
        if ((!this.f5654C || str != null) && !this.f5655D && str == null) {
            if (str == null) {
                str = VariableScope.nullOrMissingString;
            }
            str = str + "Not yet loaded, reload needed";
        }
        return str;
    }

    /* renamed from: m */
    public boolean m1655m() {
        return !this.f5631f && this.f5668R == null;
    }

    /* renamed from: a */
    public void m1670a(String str) {
        GameEngine.print("Adding error for mod: " + m1668b() + (m1655m() ? VariableScope.nullOrMissingString : "(disabled)") + ": " + str);
        if (this.f5668R == null) {
            if (!this.f5631f) {
                GameEngine gameEngine = GameEngine.getGameEngine();
                String str2 = str;
                if (str2 != null && (!str2.contains(m1673a()) || str2.contains(m1668b()))) {
                    str2 = "Error loading mod '" + m1668b() + "': " + str2;
                }
                int m1688d = gameEngine.f6337bZ.m1688d(m1668b());
                if (m1688d > 1) {
                    str2 = str2 + " (NOTE: You have " + m1688d + " mods with the same title: '" + m1668b() + "' this might make debugging tricky)";
                }
                gameEngine.m986i(str2);
            }
            GameEngine.m5460e("Disabling mod due to error: " + m1668b() + " path:" + m1659i());
            this.f5668R = str;
        }
        this.f5672V.add(str);
    }

    /* renamed from: b */
    public void m1667b(String str) {
        if (this.f5671U.contains(str)) {
            return;
        }
        this.f5671U.add(str);
    }

    /* renamed from: a */
    public String m1669a(String str, int i) {
        String[] m2279h;
        String m1669a;
        if (i > 4 || (m2279h = C0765a.m2279h(str)) == null) {
            return null;
        }
        for (String str2 : m2279h) {
            if (str2.equalsIgnoreCase("mod-info.txt")) {
                return str + "/mod-info.txt";
            }
        }
        if (m2279h.length > 5) {
            return null;
        }
        int length = m2279h.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = str + "/" + m2279h[i2];
            if (C0765a.m2281f(str3) && (m1669a = m1669a(str3, i + 1)) != null) {
                return m1669a;
            }
        }
        return null;
    }

    /* renamed from: n */
    public void m1654n() {
        if (GameEngine.getGameEngine().mo1005d()) {
            GameEngine.m5460e("SAFE MODE: skipping setSourceFolder");
        } else if (!C0771g.m2225f("mods-info", this.f5642q + "/mod-info.txt")) {
            String str = this.f5642q;
            if (str == null) {
                GameEngine.m5460e("setSourceFolder: sourceFolder==null");
                return;
            }
            String[] m2227d = C0771g.m2227d("mods-dir-search", str);
            if (m2227d != null && m2227d.length == 1) {
                String str2 = str + "/" + m2227d[0];
                String str3 = str2 + "/mod-info.txt";
                if (C0765a.m2281f(str2) && C0765a.m2278i(str3)) {
                    GameEngine.m5460e("Changing mod sourceFolder to:" + str2);
                    this.f5642q = str2;
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v61, types: [java.io.InputStream] */
    /* renamed from: o */
    public C1107ab m1653o() {
        C1133j m2276k;
        String m1669a;
        if (this.f5642q == null) {
            GameEngine.m5460e("No source yet for mod: " + this.f5628c);
            return null;
        }
        String str = this.f5642q + "/mod-info.txt";
        try {
            if (this.f5635j) {
                m2276k = C0771g.m2226e("mods-info", str);
            } else {
                m2276k = C0765a.m2276k(str);
            }
            if (m2276k == null && (m1669a = m1669a(this.f5642q, 1)) != null) {
                C1133j m2276k2 = C0765a.m2276k(str);
                if (m2276k2 != null) {
                    GameEngine.m1066a("mod-info.txt cache seems to be invalid for: " + str);
                    C0771g.m2228c("mods-info", str);
                    m2276k = m2276k2;
                } else {
                    m1670a("No mod info at " + C0765a.m2285d(str) + " but found one nested at: " + C0765a.m2285d(m1669a) + " (Hint: This mod might have been extracted with an extra folder)");
                }
            }
            if (m2276k == null) {
                GameEngine.m5460e("No mod info for: " + this.f5628c + " at " + str);
                return null;
            }
            try {
                return new C1107ab(m2276k, str);
            } catch (IOException e) {
                GameEngine.m5460e("Error loading mod info for: " + this.f5628c + " at " + str);
                e.printStackTrace();
                m1667b("Error loading mod-info.txt: " + e.getMessage());
                return null;
            }
        } catch (Exception e2) {
            GameEngine.m5460e("Error loading mod info for: " + this.f5628c + " at " + str);
            e2.printStackTrace();
            m1667b("Error loading mod-info.txt: " + e2.getMessage());
            return null;
        }
    }

    /* renamed from: p */
    public String m1652p() {
        String m1665c = m1665c("thumbnail");
        if (m1665c != null) {
            return m1659i() + "/" + m1665c;
        }
        return null;
    }

    /* renamed from: q */
    public ArrayList m1651q() {
        return this.f5667Q;
    }

    /* renamed from: c */
    public String m1665c(String str) {
        C1107ab m1653o = m1653o();
        if (m1653o == null) {
            return null;
        }
        return m1653o.m666b("mod", str, (String) null);
    }

    /* renamed from: r */
    public void m1650r() {
        if (GameEngine.getGameEngine().mo1005d()) {
            GameEngine.m5460e("SAFE MODE: refreshData: Skipping mod read");
            this.f5646u = "<< SAFE MODE ACTIVE: MOD DATA SKIPPED. RESTART IN NORMAL MODE. >>";
            return;
        }
        C1107ab m1653o = m1653o();
        if (m1653o != null) {
            this.f5644s = m1653o.m666b("mod", "title", (String) null);
            this.f5646u = m1653o.m666b("mod", "description", (String) null);
            if (this.f5646u != null && this.f5646u.contains("\\n")) {
                this.f5646u = this.f5646u.replace("\\n", "\n");
            }
            this.f5647v = m1653o.m666b("mod", "minVersion", (String) null);
            if (this.f5647v != null && !this.f5647v.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    C0858a.m1702a(this.f5647v);
                } catch (C0417bo e) {
                    m1670a(e.getMessage());
                }
            }
            this.f5663M = m1653o.m666b("music", "sourceFolder", (String) null);
            this.f5664N = m1653o.m685a("music", "whenUsingUnitsFromThisMod_playExclusively", (Boolean) false).booleanValue();
            this.f5665O = m1653o.m685a("music", "addToNormalPlaylist", (Boolean) false).booleanValue();
            if (this.f5663M != null && m1655m()) {
                GameEngine.m5460e("Loading music for: " + m1673a());
                String m2156b = C0773f.m2156b(this.f5642q, this.f5663M);
                String[] m2227d = C0771g.m2227d("mods-dir-music", m2156b);
                if (m2227d == null) {
                    m1667b("Could not read target music folder: " + C0765a.m2283e(m2156b));
                } else {
                    ArrayList arrayList = new ArrayList();
                    for (String str : m2227d) {
                        if (str.toLowerCase().endsWith(".ogg")) {
                            String m2156b2 = C0773f.m2156b(m2156b, str);
                            if (!this.f5667Q.contains(m2156b2)) {
                                GameEngine.m5460e("Found music track: " + str);
                            }
                            arrayList.add(m2156b2);
                        }
                    }
                    this.f5667Q = arrayList;
                    if (this.f5667Q.size() == 0) {
                        m1667b("Could not find any .ogg files in music folder: " + C0765a.m2283e(m2156b));
                    }
                }
            }
            this.f5643r = true;
        }
        String m1645w = m1645w();
        File file = new File(m1645w);
        if (file.exists() && !file.isDirectory()) {
            C1107ab c1107ab = null;
            try {
                c1107ab = new C1107ab(m1645w);
            } catch (IOException e2) {
                e2.printStackTrace();
                m1667b("IO error reading: " + C0765a.m2283e(m1645w));
            }
            if (c1107ab != null) {
                this.f5636k = c1107ab.m690a("steam", "id", 0L);
            }
        }
    }

    /* renamed from: w */
    private String m1645w() {
        return m1661g() + "/steam.dat";
    }

    /* renamed from: a */
    public boolean m1672a(long j) {
        this.f5636k = j;
        String m1645w = m1645w();
        try {
            PrintWriter printWriter = new PrintWriter(m1645w);
            printWriter.println("[steam]");
            printWriter.println("id: " + j);
            printWriter.close();
            return true;
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            GameEngine.getGameEngine().m986i("IO error: Failed to save workshop id for mod at: " + m1645w);
            return false;
        }
    }

    /* renamed from: s */
    public String m1649s() {
        return VariableScope.nullOrMissingString + String.format("%.2f", Float.valueOf((float) (((this.f5658G + this.f5659H) / 1000.0d) / 1000.0d))) + " mb" + (this.f5654C ? " - disabled" : VariableScope.nullOrMissingString);
    }

    /* renamed from: t */
    public void m1648t() {
        GameEngine.m5460e("Mod: '" + m1673a() + "' - Memory use:" + m1649s() + " " + (m1655m() ? VariableScope.nullOrMissingString : " (disabled)"));
    }

    /* renamed from: u */
    public boolean m1647u() {
        GameEngine.m5460e("Trying to delete mod: '" + m1673a() + "'");
        String m1660h = m1660h();
        GameEngine.m5460e("sourceFolder: '" + m1660h + "'");
        if (!m1646v()) {
            GameEngine.m5460e("Mod: '" + m1673a() + "' - Cannot be deleted");
            return false;
        }
        File file = new File(m1660h);
        if (!C0765a.m2278i(file.getAbsolutePath())) {
            GameEngine.m5460e("Mod: '" + m1673a() + "' - cannot delete: Not a file");
            return false;
        }
        boolean m2293b = C0765a.m2293b(file);
        GameEngine.m5460e("Delete result: " + m2293b);
        return m2293b;
    }

    /* renamed from: v */
    public boolean m1646v() {
        if (this.f5651z) {
            return false;
        }
        if (GameEngine.f6423aZ && this.f5635j) {
            return true;
        }
        if (GameEngine.m1030at() && this.f5635j) {
            return true;
        }
        return false;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int mo1671a(C0859b c0859b) {
        if (c0859b == null) {
            return 0;
        }
        int i = this.f5649x;
        int i2 = c0859b.f5649x;
        if (i != i2) {
            return i - i2;
        }
        String m1673a = m1673a();
        String m1673a2 = c0859b.m1673a();
        if (m1673a == null) {
            m1673a = VariableScope.nullOrMissingString;
        }
        if (m1673a2 == null) {
            m1673a2 = VariableScope.nullOrMissingString;
        }
        return m1673a.compareTo(m1673a2);
    }
}