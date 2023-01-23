package com.corrodinggames.rts.gameFramework.file;

/* renamed from: com.corrodinggames.rts.gameFramework.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/d.class */
public class d extends FileLoader {
    String g;
    String h;
    String i;

    public d(String str, String str2) {
        this.g = str;
        this.h = str2;
        if (!this.g.endsWith("/") && !this.g.endsWith("\\")) {
            this.g += "/";
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String b() {
        return this.g;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String d() {
        return this.h;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean e() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String e(String str) {
        String e = super.e(str);
        if (this.i != null && e != null && e.startsWith(this.g)) {
            String substring = e.substring(this.g.length());
            if (substring.startsWith("/") || substring.startsWith("\\")) {
                substring = substring.substring(1);
            }
            e = this.i + substring;
        }
        return e;
    }
}