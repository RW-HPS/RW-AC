package com.corrodinggames.rts.gameFramework.e;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ag;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.UnsupportedEncodingException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/g.class */
public class g {

    /* renamed from: a  reason: collision with root package name */
    public static boolean f479a = true;

    public static final String a(char c) {
        return String.valueOf((int) c);
    }

    public static String a(String str, char c) {
        if (com.corrodinggames.rts.gameFramework.f.b(str, c)) {
            str = com.corrodinggames.rts.gameFramework.f.a(str, String.valueOf(c), "%" + a(c));
        }
        return str;
    }

    public static String a(String str) {
        if (str == null) {
            return "null";
        }
        String a2 = a(a(a(a(a(a(a(a(a(a(a(com.corrodinggames.rts.gameFramework.f.a(str, "%", "%%"), '/'), '\\'), ':'), '\"'), '\''), '|'), '?'), '*'), '<'), '>'), (char) 0);
        if (a2.contains("/")) {
            throw new IllegalArgumentException();
        }
        if (a2.contains("\\")) {
            throw new IllegalArgumentException();
        }
        return a2;
    }

    public static String a(String str, String str2, boolean z) {
        String str3 = a.e() + a(str) + ".cachedata";
        if (z) {
            File file = new File(str3);
            if (!file.isDirectory() && !file.mkdirs()) {
                GameEngine.m328e("Failed to create folder for:" + file.getAbsolutePath());
            }
        }
        return str3 + "/" + a(str2);
    }

    public static boolean a(String str, String str2, String str3) {
        try {
            return a(str, str2, new ByteArrayInputStream(str3.getBytes("UTF-8")));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        }
    }

    public static boolean a(String str, String str2, InputStream inputStream) {
        try {
            String a2 = a(str, str2, true);
            File file = new File(a2);
            File file2 = new File(a2 + ".tmp");
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            com.corrodinggames.rts.gameFramework.f.a(inputStream, fileOutputStream);
            fileOutputStream.close();
            if (!a.a(file2, file)) {
                GameEngine.print("AddToCache: Failed to rename to final file: " + a2);
                return false;
            } else if (f479a) {
                GameEngine.m328e("Wrote cache file at: " + file.getAbsolutePath());
                return true;
            } else {
                return true;
            }
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public static FileInputStream a(String str, String str2) {
        try {
            File file = new File(a(str, str2, false));
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

    public static String b(String str, String str2) {
        FileInputStream a2 = a(str, str2);
        if (a2 == null) {
            return null;
        }
        return com.corrodinggames.rts.gameFramework.f.a(a2);
    }

    public static void c(String str, String str2) {
        String a2 = a(str, str2, false);
        File file = new File(a2);
        if (file.exists() && !file.delete()) {
            GameEngine.g("Failed to delete: " + a2);
        }
    }

    private static h b(String str, String str2, String str3) {
        String[] b;
        String str4 = str2 + ".data";
        String b2 = b(str, str2 + ".meta");
        if (b2 != null && (b = al.b(b2, ":")) != null) {
            Long m = com.corrodinggames.rts.gameFramework.f.m(b[0]);
            long m2 = a.m(str2);
            String str5 = b[1];
            if (m == null) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Bad meta data for: " + str2);
                    return null;
                }
                return null;
            } else if (m.longValue() != m2) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Stale timestamp for: " + str2 + " (" + m + "!=" + m2 + ")");
                    return null;
                }
                return null;
            } else if (str5.startsWith("null")) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Cache hit (null-type) for: " + str2 + " (" + m + "!=" + m2 + ")");
                }
                return new h(null);
            } else if (!str5.startsWith(str3)) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Unsupported type " + str5 + " for: " + str2 + " expected: " + str3);
                }
                return new h(null);
            } else {
                FileInputStream a2 = a(str, str4);
                if (a2 != null) {
                    if (f479a) {
                        GameEngine.m328e("openAssetCached: Cache hit for: " + str2);
                    }
                    return new h(a2);
                } else if (f479a) {
                    GameEngine.m328e("openAssetCached: meta file but not data for: " + str2);
                    return null;
                } else {
                    return null;
                }
            }
        }
        return null;
    }

    public static String[] d(String str, String str2) {
        String str3;
        long m;
        if (!ag.i(str2)) {
            return a.h(str2);
        }
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        h b = b(str, str2, "list");
        if (b != null) {
            if (b.f480a == null) {
                return null;
            }
            String a2 = com.corrodinggames.rts.gameFramework.f.a(b.f480a);
            b.a();
            return al.e(a2);
        }
        String[] h = a.h(str2);
        if (h != null) {
            if (f479a) {
                GameEngine.m328e("listDirCached: Listing count: " + h.length);
            }
            str3 = "list";
            m = a.m(str2);
            if (m == 0) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return h;
            }
            a(str, str4, al.a(h));
        } else {
            if (f479a) {
                GameEngine.m328e("listDirCached: Null");
            }
            str3 = "null";
            m = a.m(str2);
        }
        a(str, str5, m + ":" + str3);
        return h;
    }

    public static InputStream e(String str, String str2) {
        String str3;
        long m;
        String str4 = str2 + ".data";
        String str5 = str2 + ".meta";
        h b = b(str, str2, "data");
        if (b != null) {
            return b.f480a;
        }
        if (f479a) {
            GameEngine.m328e("openAssetCached: Cache miss for: " + str2);
        }
        j k = a.k(str2);
        if (k != null) {
            if (f479a) {
                GameEngine.m328e("openAssetCached: Reading: " + str2);
            }
            str3 = "data";
            m = a.m(str2);
            if (m == 0) {
                if (f479a) {
                    GameEngine.m328e("openAssetCached: Got 0 timestamp for: " + str2 + " cannot cache");
                }
                return k;
            } else if (!a(str, str4, k)) {
            }
        } else {
            if (f479a) {
                GameEngine.m328e("openAssetCached: Got null for: " + str2);
            }
            str3 = "null";
            m = a.m(str2);
        }
        a(str, str5, m + ":" + str3);
        if (k == null) {
            return null;
        }
        try {
            k.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        FileInputStream a2 = a(str, str4);
        if (a2 == null) {
            GameEngine.print("openAssetCached: Error. Failed to reopen cache: " + str2);
            return a.k(str2);
        }
        return a2;
    }

    public static boolean f(String str, String str2) {
        InputStream e = e(str, str2);
        if (e == null) {
            return false;
        }
        try {
            e.close();
            return true;
        } catch (IOException e2) {
            e2.printStackTrace();
            return true;
        }
    }
}