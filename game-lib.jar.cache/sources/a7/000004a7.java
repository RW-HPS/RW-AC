package com.corrodinggames.rts.gameFramework.file;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;

/* renamed from: com.corrodinggames.rts.gameFramework.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/e.class */
public class C0769e extends FileLoader {

    /* renamed from: g */
    FileLoader f4963g;

    /* renamed from: h */
    FileLoader f4964h;

    /* renamed from: i */
    String f4965i;

    /* renamed from: j */
    String f4966j;

    public C0769e(FileLoader fileLoader, String str, FileLoader fileLoader2, String str2) {
        this.f4963g = fileLoader;
        this.f4965i = str;
        this.f4964h = fileLoader2;
        this.f4966j = str2;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: a */
    public String mo2259a() {
        String mo2259a = this.f4963g.mo2259a();
        String mo2259a2 = this.f4964h.mo2259a();
        if (mo2259a != null) {
            return mo2259a;
        }
        return mo2259a2;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: a */
    public void mo2258a(String str) {
        this.f4963g.mo2258a(str);
        this.f4964h.mo2258a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: a */
    public String mo2257a(String str, String str2) {
        return m2242s(str).mo2257a(str, str2);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: b */
    public boolean mo2254b(String str) {
        return m2242s(str).mo2254b(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: c */
    public boolean mo2253c(String str) {
        return m2242s(str).mo2253c(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: d */
    public String mo2252d(String str) {
        return m2242s(str).mo2252d(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: f */
    public String mo2250f(String str) {
        return m2242s(str).mo2250f(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: e */
    public String mo2251e(String str) {
        return m2242s(str).mo2251e(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: a */
    public boolean mo2255a(String str, boolean z) {
        FileLoader m2243r = m2243r(str);
        String m2244q = m2244q(str);
        if (m2243r != null) {
            return m2243r.mo2255a(m2244q(m2244q), z);
        }
        boolean mo2255a = this.f4963g.mo2255a(m2244q(m2244q), z);
        if (this.f4964h.mo2255a(m2244q(m2244q), z)) {
            mo2255a = true;
        }
        return mo2255a;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: g */
    public boolean mo2249g(String str) {
        return m2242s(str).mo2249g(m2244q(str));
    }

    /* renamed from: q */
    private String m2244q(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf(this.f4965i) != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + this.f4965i.length());
            if (str2.contains(this.f4965i) || str2.contains(this.f4966j)) {
                GameEngine.m5460e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf(this.f4966j) != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + this.f4966j.length());
            if (str3.contains(this.f4965i) || str3.contains(this.f4966j)) {
                GameEngine.m5460e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: r */
    private FileLoader m2243r(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(this.f4965i)) {
            return this.f4963g;
        }
        if (str.contains(this.f4966j)) {
            return this.f4964h;
        }
        return null;
    }

    /* renamed from: s */
    private FileLoader m2242s(String str) {
        FileLoader m2243r = m2243r(str);
        if (m2243r != null) {
            return m2243r;
        }
        return this.f4963g;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: b */
    public String[] mo2240b(String str, boolean z) {
        FileLoader m2243r = m2243r(str);
        String m2244q = m2244q(str);
        if (m2243r != null) {
            return m2243r.mo2240b(m2244q, z);
        }
        String[] mo2240b = this.f4963g.mo2240b(m2244q, z);
        String[] mo2240b2 = this.f4964h.mo2240b(m2244q, z);
        if (mo2240b == null && mo2240b2 == null) {
            return null;
        }
        if (mo2240b == null) {
            mo2240b = new String[0];
        }
        if (mo2240b2 == null) {
            mo2240b2 = new String[0];
        }
        String[] strArr = new String[mo2240b.length + mo2240b2.length];
        for (int i = 0; i < mo2240b.length; i++) {
            strArr[i] = this.f4965i + mo2240b[i];
        }
        for (int i2 = 0; i2 < mo2240b2.length; i2++) {
            strArr[i2 + mo2240b.length] = this.f4966j + mo2240b2[i2];
        }
        return strArr;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: i */
    public C1133j mo2248i(String str) {
        return this.f4963g.mo2248i(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: j */
    public C1133j mo2247j(String str) {
        return m2242s(str).mo2247j(m2244q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: b */
    public String mo2241b() {
        return this.f4963g.mo2241b();
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: a */
    public File mo2256a(String str, String str2, boolean z) {
        return m2242s(str).mo2256a(m2244q(str), str2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: m */
    public String mo2246m(String str) {
        return m2242s(str).mo2246m(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: d */
    public String mo2239d() {
        String mo2239d = this.f4963g.mo2239d();
        if (this.f4964h.mo2239d() != null) {
            mo2239d = mo2239d + " and " + this.f4964h.mo2239d();
        }
        return mo2239d;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: e */
    public boolean mo2238e() {
        return this.f4963g.mo2238e() || this.f4964h.mo2238e();
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: o */
    public String mo2245o(String str) {
        if (str.startsWith("/") && this.f4965i.endsWith("/")) {
            return "/" + this.f4965i + str.substring(1);
        }
        return this.f4965i + str;
    }
}