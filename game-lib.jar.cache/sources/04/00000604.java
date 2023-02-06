package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ag.class */
public class ag extends af {
    static HashMap a = new HashMap();

    public static void h(String str) {
        GameEngine.m5e("Zip: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean a(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        ah d = d(str, true);
        if (d == null) {
            return false;
        }
        return d.c(l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public String f(String str) {
        return str;
    }

    public static boolean i(String str) {
        if (str.contains(".rwmod/") || str.contains(".rwmod\\") || str.endsWith(".rwmod")) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean d(String str) {
        if (str.endsWith(".rwmod") || str.endsWith(".rwmod/") || str.endsWith(".rwmod\\")) {
            return true;
        }
        ah d = d(str, true);
        if (d == null) {
            return false;
        }
        return d.d(l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean e(String str) {
        h("createDirectory not supported in zip files: " + str);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public String[] b(String str) {
        ah d = d(str, true);
        if (d == null) {
            return null;
        }
        return d.e(l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public long a(String str, boolean z) {
        ah d = d(str, z);
        if (d == null) {
            return -1L;
        }
        return d.h(l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public j b(String str, boolean z) {
        ah d = d(str, z);
        if (d == null) {
            return null;
        }
        return d.i(l(str));
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public long g(String str) {
        String j = j(str);
        af b = ae.b(j);
        if (b != null) {
            return b.g(j);
        }
        return new File(j).lastModified();
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public OutputStream c(String str, boolean z) {
        h("writableOutputSteam not supported in zip files: " + str);
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean a(String str, String str2) {
        h("Rename not supported in zip files: " + str + " to " + str2);
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public boolean c(String str) {
        h("Delete not supported in zip files: " + str);
        return false;
    }

    public static String j(String str) {
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

    public static ah d(String str, boolean z) {
        ah ahVar;
        String e;
        String j = j(str);
        synchronized (a) {
            ah ahVar2 = (ah) a.get(j);
            if (ahVar2 == null) {
                if (z) {
                    e = j;
                } else {
                    e = com.corrodinggames.rts.gameFramework.file.a.e(j);
                }
                try {
                    try {
                        ahVar2 = new ah(j, e);
                        a.put(j, ahVar2);
                    } catch (IOException e2) {
                        h("Failed to open source zip: '" + e + "'");
                        e2.printStackTrace();
                        String str2 = "Failed to open zip, " + e2.getMessage();
                        if (com.corrodinggames.rts.gameFramework.file.a.g(j)) {
                            h("isDirectory: " + j);
                            str2 = "Failed to open .rwmod file (Appears to be a directory!). Please remove .rwmod from any folder names.";
                        }
                        com.corrodinggames.rts.gameFramework.file.a.b(str2 + VariableScope.nullOrMissingString);
                        return null;
                    }
                } catch (IllegalArgumentException e3) {
                    h("Failed to open source zip: '" + e + "'");
                    e3.printStackTrace();
                    com.corrodinggames.rts.gameFramework.file.a.b("Failed to open zip, " + e3.getMessage());
                    return null;
                }
            }
            ahVar = ahVar2;
        }
        return ahVar;
    }

    public static void e(String str, boolean z) {
        final String j = j(str);
        synchronized (a) {
            final ah ahVar = (ah) a.remove(j);
            if (ahVar != null) {
                GameEngine.m5e("Closing zip file: " + j);
                new Thread(new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.ag.1
                    @Override // java.lang.Runnable
                    public void run() {
                        try {
                            Thread.sleep(1500L);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                        GameEngine.m5e("Running delayed close of zip: " + j);
                        ahVar.a();
                    }
                }).start();
            }
        }
    }

    public void k(String str) {
        e(str, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.utility.af
    public void a() {
    }

    public static String l(String str) {
        String substring = str.substring(j(str).length());
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
            String[] c = com.corrodinggames.rts.gameFramework.f.c(substring, '/');
            ArrayList arrayList = new ArrayList(c.length);
            int i = 0;
            for (int length = c.length - 1; length >= 0; length--) {
                if (c[length].equals("..")) {
                    i++;
                } else if (i > 0) {
                    i--;
                } else {
                    arrayList.add(0, c[length]);
                }
            }
            if (i != 0) {
                h("getPathInZip: Backtracking attempt out of zip: " + substring);
            }
            substring = com.corrodinggames.rts.gameFramework.f.a("/", arrayList);
        }
        return substring;
    }
}