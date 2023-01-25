package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag.class */
public class C1112ag extends AbstractC1111af {

    /* renamed from: a */
    static HashMap f7056a = new HashMap();

    /* renamed from: h */
    public static void m612h(String str) {
        GameEngine.m5460e("Zip: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public boolean mo625a(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1114ah m617d = m617d(str, true);
        if (m617d == null) {
            return false;
        }
        return m617d.m601c(m608l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: f */
    public String mo614f(String str) {
        return str;
    }

    /* renamed from: i */
    public static boolean m611i(String str) {
        if (str.contains(".rwmod/") || str.contains(".rwmod\\") || str.endsWith(".rwmod")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: d */
    public boolean mo618d(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        C1114ah m617d = m617d(str, true);
        if (m617d == null) {
            return false;
        }
        return m617d.m600d(m608l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: e */
    public boolean mo616e(String str) {
        m612h("createDirectory not supported in zip files: " + str);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: b */
    public String[] mo622b(String str) {
        C1114ah m617d = m617d(str, true);
        if (m617d == null) {
            return null;
        }
        return m617d.m599e(m608l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public long mo623a(String str, boolean z) {
        C1114ah m617d = m617d(str, z);
        if (m617d == null) {
            return -1L;
        }
        return m617d.m596h(m608l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: b */
    public C1133j mo621b(String str, boolean z) {
        C1114ah m617d = m617d(str, z);
        if (m617d == null) {
            return null;
        }
        return m617d.m595i(m608l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: g */
    public long mo613g(String str) {
        String m610j = m610j(str);
        AbstractC1111af m628b = C1110ae.m628b(m610j);
        if (m628b != null) {
            return m628b.mo613g(m610j);
        }
        return new File(m610j).lastModified();
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: c */
    public OutputStream mo619c(String str, boolean z) {
        m612h("writableOutputSteam not supported in zip files: " + str);
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public boolean mo624a(String str, String str2) {
        m612h("Rename not supported in zip files: " + str + " to " + str2);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: c */
    public boolean mo620c(String str) {
        m612h("Delete not supported in zip files: " + str);
        return false;
    }

    /* renamed from: j */
    public static String m610j(String str) {
        int indexOf = str.indexOf(".rwmod/");
        int indexOf2 = str.indexOf(".rwmod\\");
        if (indexOf2 != -1 && (indexOf2 < indexOf || indexOf == -1)) {
            indexOf = indexOf2;
        }
        if (indexOf == -1 && str.endsWith(".rwmod")) {
            indexOf = str.length() - ".rwmod".length();
        }
        if (indexOf == -1) {
            throw new RuntimeException("Could not find .rwmod in path: " + str);
        }
        return str.substring(0, indexOf + ".rwmod".length());
    }

    /* renamed from: d */
    public static C1114ah m617d(String str, boolean z) {
        C1114ah c1114ah;
        String m2283e;
        String m610j = m610j(str);
        synchronized (f7056a) {
            C1114ah c1114ah2 = (C1114ah) f7056a.get(m610j);
            if (c1114ah2 == null) {
                if (z) {
                    m2283e = m610j;
                } else {
                    m2283e = C0765a.m2283e(m610j);
                }
                try {
                    try {
                        c1114ah2 = new C1114ah(m610j, m2283e);
                        f7056a.put(m610j, c1114ah2);
                    } catch (IOException e) {
                        m612h("Failed to open source zip: '" + m2283e + "'");
                        e.printStackTrace();
                        String str2 = "Failed to open zip, " + e.getMessage();
                        if (C0765a.m2280g(m610j)) {
                            m612h("isDirectory: " + m610j);
                            str2 = "Failed to open .rwmod file (Appears to be a directory!). Please remove .rwmod from any folder names.";
                        }
                        C0765a.m2291b(str2 + VariableScope.nullOrMissingString);
                        return null;
                    }
                } catch (IllegalArgumentException e2) {
                    m612h("Failed to open source zip: '" + m2283e + "'");
                    e2.printStackTrace();
                    C0765a.m2291b("Failed to open zip, " + e2.getMessage());
                    return null;
                }
            }
            c1114ah = c1114ah2;
        }
        return c1114ah;
    }

    /* renamed from: e */
    public static void m615e(String str, boolean z) {
        final String m610j = m610j(str);
        synchronized (f7056a) {
            final C1114ah c1114ah = (C1114ah) f7056a.remove(m610j);
            if (c1114ah != null) {
                GameEngine.m5460e("Closing zip file: " + m610j);
                new Thread(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.ag.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Thread.sleep(1500L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        GameEngine.m5460e("Running delayed close of zip: " + m610j);
                        c1114ah.m607a();
                    }
                }).start();
            }
        }
    }

    /* renamed from: k */
    public void m609k(String str) {
        m615e(str, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.AbstractC1111af
    /* renamed from: a */
    public void mo626a() {
    }

    /* renamed from: l */
    public static String m608l(String str) {
        String substring = str.substring(m610j(str).length());
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
                m612h("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = C0773f.m2191a("/", arrayList);
        }
        return substring;
    }
}