package com.corrodinggames.rts.gameFramework.file;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1112ag;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* renamed from: com.corrodinggames.rts.gameFramework.e.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/g.class */
public class C0771g {

    /* renamed from: a */
    public static boolean f4967a = true;

    /* renamed from: a */
    public static final String m2237a(char c) {
        return String.valueOf((int) c);
    }

    /* renamed from: a */
    public static String m2235a(String str, char c) {
        if (C0773f.m2158b(str, c)) {
            str = C0773f.m2181a(str, String.valueOf(c), "%" + m2237a(c));
        }
        return str;
    }

    /* renamed from: a */
    public static String m2236a(String str) {
        if (str == null) {
            return "null";
        }
        String m2235a = m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(m2235a(C0773f.m2181a(str, "%", "%%"), '/'), '\\'), ':'), '\"'), '\''), '|'), '?'), '*'), '<'), '>'), (char) 0);
        if (m2235a.contains("/")) {
            throw new IllegalArgumentException();
        }
        if (m2235a.contains("\\")) {
            throw new IllegalArgumentException();
        }
        return m2235a;
    }

    /* renamed from: a */
    public static String m2231a(String str, String str2, boolean z) {
        String str3 = C0765a.m2284e() + m2236a(str) + ".cachedata";
        if (z) {
            File file = new File(str3);
            if (!file.isDirectory() && !file.mkdirs()) {
                GameEngine.m5460e("Failed to create folder for:" + file.getAbsolutePath());
            }
        }
        return str3 + "/" + m2236a(str2);
    }

    /* renamed from: a */
    public static boolean m2232a(String str, String str2, String str3) {
        try {
            return m2233a(str, str2, new ByteArrayInputStream(str3.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static boolean m2233a(String str, String str2, InputStream inputStream) {
        try {
            String m2231a = m2231a(str, str2, true);
            File file = new File(m2231a);
            File file2 = new File(m2231a + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            C0773f.m2192a(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!C0765a.m2301a(file2, file)) {
                GameEngine.print("AddToCache: Failed to rename to final file: " + m2231a);
                return false;
            } else if (f4967a) {
                GameEngine.m5460e("Wrote cache file at: " + file.getAbsolutePath());
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: a */
    public static FileInputStream m2234a(String str, String str2) {
        try {
            File file = new File(m2231a(str, str2, false));
            if (!file.exists()) {
                return null;
            }
            file.setLastModified(System.currentTimeMillis());
            return new FileInputStream(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    /* renamed from: b */
    public static String m2230b(String str, String str2) {
        FileInputStream m2234a = m2234a(str, str2);
        if (m2234a == null) {
            return null;
        }
        return C0773f.m2193a(m2234a);
    }

    /* renamed from: c */
    public static void m2228c(String str, String str2) {
        String m2231a = m2231a(str, str2, false);
        File file = new File(m2231a);
        if (file.exists() && !file.delete()) {
            GameEngine.m990g("Failed to delete: " + m2231a);
        }
    }

    /* renamed from: b */
    private static C0772h m2229b(String str, String str2, String str3) {
        String[] m576b;
        String str4 = str2 + ".data";
        String m2230b = m2230b(str, str2 + ".meta");
        if (m2230b != null && (m576b = C1118al.m576b(m2230b, ":")) != null) {
            Long m2103m = C0773f.m2103m(m576b[0]);
            long m2274m = C0765a.m2274m(str2);
            String str5 = m576b[1];
            if (m2103m == null) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Bad meta data for: " + str2);
                    return null;
                }
                return null;
            } else if (m2103m.longValue() != m2274m) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Stale timestamp for: " + str2 + " (" + m2103m + "!=" + m2274m + ")");
                    return null;
                }
                return null;
            } else if (str5.startsWith("null")) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Cache hit (null-type) for: " + str2 + " (" + m2103m + "!=" + m2274m + ")");
                }
                return new C0772h(null);
            } else if (!str5.startsWith(str3)) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Unsupported type " + str5 + " for: " + str2 + " expected: " + str3);
                }
                return new C0772h(null);
            } else {
                FileInputStream m2234a = m2234a(str, str4);
                if (m2234a != null) {
                    if (f4967a) {
                        GameEngine.m5460e("openAssetCached: Cache hit for: " + str2);
                    }
                    return new C0772h(m2234a);
                } else if (f4967a) {
                    GameEngine.m5460e("openAssetCached: meta file but not data for: " + str2);
                    return null;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    /* renamed from: d */
    public static String[] m2227d(String str, String str2) {
        String str3;
        long m2274m;
        if (!C1112ag.m611i(str2)) {
            return C0765a.m2279h(str2);
        }
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0772h m2229b = m2229b(str, str2, "list");
        if (m2229b != null) {
            if (m2229b.f4968a == null) {
                return null;
            }
            String m2193a = C0773f.m2193a(m2229b.f4968a);
            m2229b.m2224a();
            return C1118al.m570e(m2193a);
        }
        String[] m2279h = C0765a.m2279h(str2);
        if (m2279h != null) {
            if (f4967a) {
                GameEngine.m5460e("listDirCached: Listing count: " + m2279h.length);
            }
            str3 = "list";
            m2274m = C0765a.m2274m(str2);
            if (m2274m == 0) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2279h;
            }
            m2232a(str, str4, C1118al.m580a(m2279h));
        } else {
            if (f4967a) {
                GameEngine.m5460e("listDirCached: Null");
            }
            str3 = "null";
            m2274m = C0765a.m2274m(str2);
        }
        m2232a(str, str5, m2274m + ":" + str3);
        return m2279h;
    }

    /* renamed from: e */
    public static InputStream m2226e(String str, String str2) {
        String str3;
        long m2274m;
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        C0772h m2229b = m2229b(str, str2, "data");
        if (m2229b != null) {
            return m2229b.f4968a;
        }
        if (f4967a) {
            GameEngine.m5460e("openAssetCached: Cache miss for: " + str2);
        }
        C1133j m2276k = C0765a.m2276k(str2);
        if (m2276k != null) {
            if (f4967a) {
                GameEngine.m5460e("openAssetCached: Reading: " + str2);
            }
            str3 = "data";
            m2274m = C0765a.m2274m(str2);
            if (m2274m == 0) {
                if (f4967a) {
                    GameEngine.m5460e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return m2276k;
            } else if (!m2233a(str, str4, m2276k)) {
            }
        } else {
            if (f4967a) {
                GameEngine.m5460e("openAssetCached: Got null for: " + str2);
            }
            str3 = "null";
            m2274m = C0765a.m2274m(str2);
        }
        m2232a(str, str5, m2274m + ":" + str3);
        if (m2276k == null) {
            return null;
        }
        try {
            m2276k.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream m2234a = m2234a(str, str4);
        if (m2234a == null) {
            GameEngine.print("openAssetCached: Error. Failed to reopen cache: " + str2);
            return C0765a.m2276k(str2);
        }
        return m2234a;
    }

    /* renamed from: f */
    public static boolean m2225f(String str, String str2) {
        InputStream m2226e = m2226e(str, str2);
        if (m2226e == null) {
            return false;
        }
        try {
            m2226e.close();
            return true;
        } catch (IOException e) {
            e.printStackTrace();
            return true;
        }
    }
}