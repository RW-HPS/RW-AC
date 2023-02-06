package com.corrodinggames.rts.gameFramework.file;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;

/* renamed from: com.corrodinggames.rts.gameFramework.e.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/e.class */
public class e extends FileLoader {
    FileLoader g;
    FileLoader h;
    String i;
    String j;

    public e(FileLoader fileLoader, String str, FileLoader fileLoader2, String str2) {
        this.g = fileLoader;
        this.i = str;
        this.h = fileLoader2;
        this.j = str2;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String a() {
        String a = this.g.a();
        String a2 = this.h.a();
        if (a != null) {
            return a;
        }
        return a2;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public void a(String str) {
        this.g.a(str);
        this.h.a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String a(String str, String str2) {
        return s(str).a(str, str2);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean b(String str) {
        return s(str).b(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean c(String str) {
        return s(str).c(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String d(String str) {
        return s(str).d(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String f(String str) {
        return s(str).f(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String e(String str) {
        return s(str).e(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean a(String str, boolean z) {
        FileLoader r = r(str);
        String q = q(str);
        if (r != null) {
            return r.a(q(q), z);
        }
        boolean a = this.g.a(q(q), z);
        if (this.h.a(q(q), z)) {
            a = true;
        }
        return a;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean g(String str) {
        return s(str).g(q(str));
    }

    private String q(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf(this.i) != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + this.i.length());
            if (str2.contains(this.i) || str2.contains(this.j)) {
                GameEngine.m5e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf(this.j) != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + this.j.length());
            if (str3.contains(this.i) || str3.contains(this.j)) {
                GameEngine.m5e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    private FileLoader r(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains(this.i)) {
            return this.g;
        }
        if (str.contains(this.j)) {
            return this.h;
        }
        return null;
    }

    private FileLoader s(String str) {
        FileLoader r = r(str);
        if (r != null) {
            return r;
        }
        return this.g;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String[] b(String str, boolean z) {
        FileLoader r = r(str);
        String q = q(str);
        if (r != null) {
            return r.b(q, z);
        }
        String[] b = this.g.b(q, z);
        String[] b2 = this.h.b(q, z);
        if (b == null && b2 == null) {
            return null;
        }
        if (b == null) {
            b = new String[0];
        }
        if (b2 == null) {
            b2 = new String[0];
        }
        String[] strArr = new String[b.length + b2.length];
        for (int i = 0; i < b.length; i++) {
            strArr[i] = this.i + b[i];
        }
        for (int i2 = 0; i2 < b2.length; i2++) {
            strArr[i2 + b.length] = this.j + b2[i2];
        }
        return strArr;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public j i(String str) {
        return this.g.i(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public j j(String str) {
        return s(str).j(q(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String b() {
        return this.g.b();
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public File a(String str, String str2, boolean z) {
        return s(str).a(q(str), str2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String m(String str) {
        return s(str).m(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String d() {
        String d = this.g.d();
        if (this.h.d() != null) {
            d = d + " and " + this.h.d();
        }
        return d;
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public boolean e() {
        return this.g.e() || this.h.e();
    }

    @Override // com.corrodinggames.rts.gameFramework.file.FileLoader
    public String o(String str) {
        if (str.startsWith("/") && this.i.endsWith("/")) {
            return "/" + this.i + str.substring(1);
        }
        return this.i + str;
    }
}