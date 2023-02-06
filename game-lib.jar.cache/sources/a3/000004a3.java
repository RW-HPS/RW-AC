package com.corrodinggames.rts.gameFramework.file;

import android.content.Context;
import android.os.Build;
import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/a.class */
public class a {
    public static final FileLoader a = new FileLoader();
    public static FileLoader b = a;
    public static Boolean c;
    public static String d;
    public static String e;

    protected static String a() {
        File b2 = c.a().b(null);
        if (b2 != null) {
            return b2.getAbsolutePath();
        }
        GameEngine.print("Failed to get an internal path.");
        return null;
    }

    public static void b() {
        e = null;
        if (GameEngine.at()) {
            if (Build.VERSION.SDK_INT < 19) {
                e = "Android version too old for new file system support";
                GameEngine.m5e("FileLoader: SDK too old, not changing FileLoader");
                return;
            }
            int i = GameEngine.getGameEngine().settingsEngine.storageType;
            GameEngine.m5e("FileLoader: storageBehaviour:" + i);
            FileLoader a2 = a(i);
            GameEngine.m5e("Using file loader: " + a2.d());
            b = a2;
        }
    }

    public static boolean a(String str) {
        return b.p(str);
    }

    public static b a(boolean z) {
        b bVar = new b();
        if (!GameEngine.at()) {
            bVar.b = false;
            bVar.c = true;
            return bVar;
        } else if (Build.VERSION.SDK_INT < 19) {
            bVar.b = false;
            bVar.c = true;
            return bVar;
        } else {
            bVar.b = true;
            bVar.a = false;
            if (d != null) {
                bVar.a = true;
            }
            if (c != null && !c.booleanValue()) {
                bVar.c = true;
                bVar.b = false;
                bVar.a = false;
            }
            if (Build.VERSION.SDK_INT <= 28 && c == null) {
                GameEngine.print("FileLoader using direct external access due to sdk: " + Build.VERSION.SDK_INT);
                bVar.c = true;
                bVar.b = false;
                bVar.a = false;
            }
            return bVar;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v39, types: [com.corrodinggames.rts.gameFramework.e.c] */
    public static FileLoader a(int i) {
        d dVar;
        e eVar;
        if (!GameEngine.at()) {
            return new FileLoader();
        }
        if (Build.VERSION.SDK_INT >= 19) {
            String a2 = a();
            d dVar2 = null;
            if (a2 == null) {
                e = "Failed to get internal app path (is it unmounted?).";
                i = 3;
            } else {
                dVar2 = new d(a2, "internal");
                dVar2.i = "Internal: ";
            }
            b a3 = a(false);
            if (!a3.a) {
                if (!a3.c) {
                    GameEngine.print("Not using direct external backend: As direct reads will cause problems");
                    dVar = null;
                    i = 0;
                } else {
                    GameEngine.print("FileLoader using direct external file access! SDK:" + Build.VERSION.SDK_INT);
                    dVar = new FileLoader();
                }
            } else {
                GameEngine.m5e("FileLoader using overriddenExternalPath:" + d);
                dVar = new d(d, "external");
            }
            f fVar = new f();
            if (i != 3 && dVar2 == null) {
                GameEngine.print("No available file backends!!");
                return fVar;
            }
            if (i == 1) {
                eVar = new e(dVar2, "[INTERNAL-PATH]/", dVar, "[EXTERNAL-PATH]/");
            } else if (i == 2) {
                eVar = new e(dVar, "[EXTERNAL-PATH]/", dVar2, "[INTERNAL-PATH]/");
            } else if (i == 3) {
                eVar = new e(dVar, "[EXTERNAL-PATH]/", fVar, "[NULL-PATH]/");
            } else {
                eVar = new e(dVar2, "[INTERNAL-PATH]/", fVar, "[NULL-PATH]/");
            }
            eVar.h.d = true;
            return eVar;
        }
        GameEngine.m5e("FileLoader: SDK too old, not changing FileLoader");
        return new FileLoader();
    }

    public static String c() {
        return b.a();
    }

    public static void b(String str) {
        b.a(str);
    }

    public static String a(String str, String str2) {
        return b.a(str, str2);
    }

    public static boolean c(String str) {
        return b.b(str);
    }

    public static String d(String str) {
        return b.e(str);
    }

    public static String e(String str) {
        return b.f(str);
    }

    public static boolean f(String str) {
        return b.a(str, false);
    }

    public static boolean g(String str) {
        return b.a(str, true);
    }

    public static String[] h(String str) {
        return b.b(str, false);
    }

    public static String[] a(String str, boolean z) {
        return b.b(str, z);
    }

    public static boolean i(String str) {
        return b.g(str);
    }

    public static j j(String str) {
        return b.i(str);
    }

    public static j a(File file) {
        return b.j(file.getAbsolutePath());
    }

    public static j k(String str) {
        return b.j(str);
    }

    public static OutputStream a(File file, boolean z) {
        return b.c(file.getAbsolutePath(), z);
    }

    public static OutputStream b(String str, boolean z) {
        return b.c(str, z);
    }

    public static boolean l(String str) {
        return b.k(str);
    }

    public static String d() {
        return b.b();
    }

    public static String e() {
        return b.c();
    }

    public static long m(String str) {
        return b.l(str);
    }

    public static File a(String str, String str2, boolean z) {
        return b.a(str, str2, z);
    }

    public static boolean a(File file, File file2) {
        if (GameEngine.av() && file2.exists()) {
            file2.delete();
        }
        if (!file.renameTo(file2)) {
            return false;
        }
        return true;
    }

    public static boolean b(File file, File file2) {
        return b.a(file, file2);
    }

    public static boolean b(File file) {
        return b.b(file);
    }

    public static String n(String str) {
        return b.m(str);
    }

    public static boolean f() {
        return b.e();
    }

    public static String o(String str) {
        return b.n(str);
    }

    public static String p(String str) {
        return b.o(str);
    }

    public static File a(Context context, String str, String str2) {
        try {
            return File.createTempFile(str, str2, context.i());
        } catch (IOException e2) {
            try {
                return File.createTempFile(str, str2, context.j());
            } catch (IOException e3) {
                e2.printStackTrace();
                throw e3;
            }
        }
    }

    public static void c(File file) {
        b.a(file);
    }
}