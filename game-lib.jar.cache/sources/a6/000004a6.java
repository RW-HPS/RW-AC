package com.corrodinggames.rts.gameFramework.file;

/* renamed from: com.corrodinggames.rts.gameFramework.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/d.class */
public class C0768d extends FileLoader {

    /* renamed from: g */
    String f4960g;

    /* renamed from: h */
    String f4961h;

    /* renamed from: i */
    String f4962i;

    public C0768d(String str, String str2) {
        this.f4960g = str;
        this.f4961h = str2;
        if (!this.f4960g.endsWith("/") && !this.f4960g.endsWith("\\")) {
            this.f4960g += "/";
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: b */
    public String mo2241b() {
        return this.f4960g;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: d */
    public String mo2239d() {
        return this.f4961h;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: e */
    public boolean mo2238e() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    /* renamed from: e */
    public String mo2251e(String str) {
        String mo2251e = super.mo2251e(str);
        if (this.f4962i != null && mo2251e != null && mo2251e.startsWith(this.f4960g)) {
            String substring = mo2251e.substring(this.f4960g.length());
            if (substring.startsWith("/") || substring.startsWith("\\")) {
                substring = substring.substring(1);
            }
            mo2251e = this.f4962i + substring;
        }
        return mo2251e;
    }
}