package com.corrodinggames.rts.gameFramework.utility.a;

import android.net.Uri;
import com.corrodinggames.rts.appFramework.android.AndroidSAF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/a.class */
public class a extends af {
    static AndroidSAF a = AndroidSAF.getInstance();
    static HashMap b = new HashMap();
    public static int c = 1;

    public static void h(String str) {
        GameEngine.m5e("Saf: " + str);
    }

    public static void i(String str) {
    }

    public static void j(String str) {
        GameEngine.m5e("Saf: " + str);
    }

    public static void k(String str) {
    }

    public static boolean l(String str) {
        if (str.contains(".[saflink]/") || str.contains(".[saflink]\\") || str.endsWith(".[saflink]")) {
            return true;
        }
        return false;
    }

    public static String m(String str) {
        int indexOf = str.indexOf(".[saflink]/");
        int indexOf2 = str.indexOf(".[saflink]\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".[saflink]")) {
            indexOf = str.length() - ".[saflink]".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find saf link in path: " + str);
        }
        return str.substring(0, indexOf + ".[saflink]".length());
    }

    public static b d(String str, boolean z) {
        String m = m(str);
        synchronized (b) {
            b bVar = (b) b.get(m);
            if (bVar == null) {
                com.corrodinggames.rts.gameFramework.file.a.b("Folder link no longer open");
                return null;
            }
            return bVar;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public void a() {
        synchronized (b) {
            for (b bVar : b.values()) {
                bVar.a();
            }
        }
    }

    public static String a(Uri uri, boolean z) {
        GameEngine.m5e("createSAFLink: " + uri);
        synchronized (b) {
            String str = "/saf-virtual/" + c + ".[saflink]";
            c++;
            if (a(uri, z, str) == null) {
                return null;
            }
            return str;
        }
    }

    public static b a(Uri uri, boolean z, String str) {
        b bVar;
        GameEngine.m5e("createSAFLink: " + uri + " to " + str);
        synchronized (b) {
            if (((b) b.get(str)) != null) {
                GameEngine.print("createSAFLink: Already open");
            }
            bVar = new b(uri, z);
            try {
                bVar.b();
                b.put(str, bVar);
            } catch (IOException e) {
                e.printStackTrace();
                com.corrodinggames.rts.gameFramework.file.a.b("Failed to list files: " + e.getMessage());
                return null;
            }
        }
        return bVar;
    }

    public static String n(String str) {
        String substring = str.substring(m(str).length());
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.startsWith("/") || substring.startsWith("\\")) {
            substring = substring.substring(1);
        }
        if (substring.contains("\\")) {
            substring = substring.replace("\\", "/");
        }
        if (substring.contains("..")) {
            String[] c2 = f.c(substring, '/');
            ArrayList arrayList = new ArrayList(c2.length);
            int i = 0;
            for (int length = c2.length - 1; length >= 0; length--) {
                if (c2[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, c2[length]);
                }
            }
            if (i != 0) {
                j("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = f.a("/", arrayList);
        }
        return substring;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean a(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        b d = d(str, true);
        if (d == null) {
            h("fileExists failed to open for: " + str);
            return false;
        }
        try {
            return d.a(n(str));
        } catch (IOException e) {
            i("fileExists failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public String f(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return str;
        }
        b d = d(str, true);
        if (d == null) {
            j("convertAbstractPathForDebug failed for: " + str);
            return str;
        }
        return d.c + "/" + n(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean d(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        b d = d(str, true);
        if (d == null) {
            return false;
        }
        try {
            return d.h(n(str));
        } catch (IOException e) {
            i("isDirectory failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean e(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            i("createDirectory on root path: " + str);
            return false;
        }
        b d = d(str, true);
        if (d == null) {
            j("createDirectory failed for: " + str);
            return false;
        }
        try {
            return d.j(n(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public String[] b(String str) {
        b d = d(str, true);
        if (d == null) {
            return null;
        }
        try {
            return d.g(n(str));
        } catch (IOException e) {
            e.printStackTrace();
            com.corrodinggames.rts.gameFramework.file.a.b("Failed to open saf, " + e.getMessage());
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public long a(String str, boolean z) {
        b d = d(str, z);
        if (d == null) {
            j("saf==null: for '" + str + "'");
            return -1L;
        }
        return d.d(n(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public j b(String str, boolean z) {
        b d = d(str, z);
        if (d == null) {
            j("openAssetSteam: saf==null: for '" + str + "'");
            return null;
        }
        String n = n(str);
        try {
            j b2 = d.b(n);
            if (b2 == null) {
                k("openAssetSteam: Failed to find: '" + n + "' in: '" + str + "'");
            }
            return b2;
        } catch (IOException e) {
            e.printStackTrace();
            j("Error opening: '" + n + "' in: '" + str + "'");
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public long g(String str) {
        b d = d(str, true);
        if (d == null) {
            h("saf==null: for '" + str + "'");
            return 0L;
        }
        try {
            return d.c(n(str));
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public OutputStream c(String str, boolean z) {
        b d = d(str, true);
        if (d == null) {
            return null;
        }
        String n = n(str);
        OutputStream a2 = d.a(n, z);
        if (a2 == null) {
            j("Failed to find: '" + n + "' in: '" + str + "'");
        }
        return a2;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean a(String str, String str2) {
        h("Rename: " + str + " to " + str2);
        b d = d(str, true);
        if (d == null) {
            return false;
        }
        String n = n(str);
        String n2 = n(str2);
        i("Relative path: " + n + " to " + n2);
        return d.a(n, n2);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean c(String str) {
        h("deleteFile: " + str);
        b d = d(str, true);
        if (d == null) {
            j("saf==null: for deleteFile: '" + str + "'");
            return false;
        }
        return d.e(n(str));
    }
}