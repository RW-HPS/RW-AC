package com.corrodinggames.rts.gameFramework.utility.p049a;

import android.net.Uri;
import com.corrodinggames.rts.appFramework.android.AndroidSAF;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1111af;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/a.class */
public class C1103a extends AbstractC1111af {

    /* renamed from: a */
    static AndroidSAF f7013a = AndroidSAF.getInstance();

    /* renamed from: b */
    static HashMap f7014b = new HashMap();

    /* renamed from: c */
    public static int f7015c = 1;

    /* renamed from: h */
    public static void m734h(String str) {
        GameEngine.m5460e("Saf: " + str);
    }

    /* renamed from: i */
    public static void m733i(String str) {
    }

    /* renamed from: j */
    public static void m732j(String str) {
        GameEngine.m5460e("Saf: " + str);
    }

    /* renamed from: k */
    public static void m731k(String str) {
    }

    /* renamed from: l */
    public static boolean m730l(String str) {
        if (str.contains(".[saflink]/") || str.contains(".[saflink]\\") || str.endsWith(".[saflink]")) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public static String m729m(String str) {
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

    /* renamed from: d */
    public static C1104b m735d(String str, boolean z) {
        String m729m = m729m(str);
        synchronized (f7014b) {
            C1104b c1104b = (C1104b) f7014b.get(m729m);
            if (c1104b == null) {
                C0765a.m2291b("Folder link no longer open");
                return null;
            }
            return c1104b;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public void mo626a() {
        synchronized (f7014b) {
            for (C1104b c1104b : f7014b.values()) {
                c1104b.m727a();
            }
        }
    }

    /* renamed from: a */
    public static String m737a(Uri uri, boolean z) {
        GameEngine.m5460e("createSAFLink: " + uri);
        synchronized (f7014b) {
            String str = "/saf-virtual/" + f7015c + ".[saflink]";
            f7015c++;
            if (m736a(uri, z, str) == null) {
                return null;
            }
            return str;
        }
    }

    /* renamed from: a */
    public static C1104b m736a(Uri uri, boolean z, String str) {
        C1104b c1104b;
        GameEngine.m5460e("createSAFLink: " + uri + " to " + str);
        synchronized (f7014b) {
            if (((C1104b) f7014b.get(str)) != null) {
                GameEngine.print("createSAFLink: Already open");
            }
            c1104b = new C1104b(uri, z);
            try {
                c1104b.m723b();
                f7014b.put(str, c1104b);
            } catch (IOException e) {
                e.printStackTrace();
                C0765a.m2291b("Failed to list files: " + e.getMessage());
                return null;
            }
        }
        return c1104b;
    }

    /* renamed from: n */
    public static String m728n(String str) {
        String substring = str.substring(m729m(str).length());
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
            String[] m2145c = C0773f.m2145c(substring, '/');
            ArrayList arrayList = new ArrayList(m2145c.length);
            int i = 0;
            for (int length = m2145c.length - 1; length >= 0; length--) {
                if (m2145c[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, m2145c[length]);
                }
            }
            if (i != 0) {
                m732j("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0773f.m2191a("/", arrayList);
        }
        return substring;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public boolean mo625a(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            m734h("fileExists failed to open for: " + str);
            return false;
        }
        try {
            return m735d.m726a(m728n(str));
        } catch (IOException e) {
            m733i("fileExists failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: f */
    public String mo614f(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return str;
        }
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            m732j("convertAbstractPathForDebug failed for: " + str);
            return str;
        }
        return m735d.f7018c + "/" + m728n(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: d */
    public boolean mo618d(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            return true;
        }
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            return false;
        }
        try {
            return m735d.m715h(m728n(str));
        } catch (IOException e) {
            m733i("isDirectory failed for: " + str);
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: e */
    public boolean mo616e(String str) {
        if (str.endsWith(".[saflink]") || str.endsWith(".[saflink]/") || str.endsWith(".[saflink]\\")) {
            m733i("createDirectory on root path: " + str);
            return false;
        }
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            m732j("createDirectory failed for: " + str);
            return false;
        }
        try {
            return m735d.m713j(m728n(str));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return false;
        } catch (IllegalArgumentException e2) {
            e2.printStackTrace();
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: b */
    public String[] mo622b(String str) {
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            return null;
        }
        try {
            return m735d.m716g(m728n(str));
        } catch (IOException e) {
            e.printStackTrace();
            C0765a.m2291b("Failed to open saf, " + e.getMessage());
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public long mo623a(String str, boolean z) {
        C1104b m735d = m735d(str, z);
        if (m735d == null) {
            m732j("saf==null: for '" + str + "'");
            return -1L;
        }
        return m735d.m719d(m728n(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: b */
    public C1133j mo621b(String str, boolean z) {
        C1104b m735d = m735d(str, z);
        if (m735d == null) {
            m732j("openAssetSteam: saf==null: for '" + str + "'");
            return null;
        }
        String m728n = m728n(str);
        try {
            C1133j m722b = m735d.m722b(m728n);
            if (m722b == null) {
                m731k("openAssetSteam: Failed to find: '" + m728n + "' in: '" + str + "'");
            }
            return m722b;
        } catch (IOException e) {
            e.printStackTrace();
            m732j("Error opening: '" + m728n + "' in: '" + str + "'");
            return null;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: g */
    public long mo613g(String str) {
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            m734h("saf==null: for '" + str + "'");
            return 0L;
        }
        try {
            return m735d.m720c(m728n(str));
        } catch (IOException e) {
            e.printStackTrace();
            return 0L;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: c */
    public OutputStream mo619c(String str, boolean z) {
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            return null;
        }
        String m728n = m728n(str);
        OutputStream m724a = m735d.m724a(m728n, z);
        if (m724a == null) {
            m732j("Failed to find: '" + m728n + "' in: '" + str + "'");
        }
        return m724a;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public boolean mo624a(String str, String str2) {
        m734h("Rename: " + str + " to " + str2);
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            return false;
        }
        String m728n = m728n(str);
        String m728n2 = m728n(str2);
        m733i("Relative path: " + m728n + " to " + m728n2);
        return m735d.m725a(m728n, m728n2);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: c */
    public boolean mo620c(String str) {
        m734h("deleteFile: " + str);
        C1104b m735d = m735d(str, true);
        if (m735d == null) {
            m732j("saf==null: for deleteFile: '" + str + "'");
            return false;
        }
        return m735d.m718e(m728n(str));
    }
}