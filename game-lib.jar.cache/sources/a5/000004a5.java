package com.corrodinggames.rts.gameFramework.file;

import android.content.res.AssetManager;
import android.os.Environment;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.C0859b;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1111af;
import com.corrodinggames.rts.gameFramework.utility.C1110ae;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import com.corrodinggames.rts.gameFramework.utility.p049a.C1103a;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.e.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/c.class */
public class FileLoader {

    /* renamed from: a */
    public String f4954a = "FileLoader: ";

    /* renamed from: b */
    public boolean f4955b = false;

    /* renamed from: c */
    public boolean f4956c = false;

    /* renamed from: d */
    public boolean f4957d = false;

    /* renamed from: e */
    String f4958e;

    /* renamed from: f */
    String f4959f;

    /* renamed from: a */
    public String mo2259a() {
        String str = this.f4958e;
        this.f4958e = null;
        return str;
    }

    /* renamed from: a */
    public void mo2258a(String str) {
        this.f4958e = str;
    }

    /* renamed from: a */
    public String mo2257a(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            GameEngine.m5460e(this.f4954a + "findFileExtension('" + str + "','" + str2 + "'): path is not a folder");
            return null;
        }
        for (File file : listFiles) {
            String name = file.getName();
            if (name.contains(".")) {
                name = name.substring(0, name.lastIndexOf(46));
            }
            if (name.equals(str2)) {
                return str + "/" + file.getName();
            }
        }
        GameEngine.m5460e(this.f4954a + "Could not find file with path: " + str + " file:" + str2);
        return null;
    }

    /* renamed from: b */
    public boolean mo2254b(String str) {
        if (GameEngine.f6418aU || str.startsWith("/") || str.startsWith("/SD/")) {
            return false;
        }
        return true;
    }

    /* renamed from: c */
    public boolean mo2253c(String str) {
        if (str.startsWith("/") || str.startsWith("\\")) {
            return true;
        }
        if (GameEngine.f6418aU) {
            if (str.startsWith("mods")) {
                return true;
            }
            if (GameEngine.f6423aZ && str.startsWith("converted-sounds")) {
                return true;
            }
        }
        if (str.split("\\\\")[0].endsWith(":")) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public String mo2252d(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                String str2 = split[split.length - 1];
                boolean z = false;
                int length = split.length - 2;
                while (true) {
                    if (length < 0) {
                        break;
                    }
                    String str3 = split[length];
                    if (str3.startsWith("MOD|")) {
                        String substring = str3.substring("MOD|".length());
                        C0859b m1690c = gameEngine.f6337bZ.m1690c(substring);
                        if (m1690c == null) {
                            GameEngine.m5460e(this.f4954a + "Failed to find mod with hash:" + substring);
                        } else {
                            str2 = C0773f.m2156b(m1690c.m1661g(), str2);
                            GameEngine.m5460e(this.f4954a + "Path changed to mod path:" + str2);
                            z = true;
                            break;
                        }
                    }
                    str2 = str3 + File.separator + str2;
                    length--;
                }
                if (z) {
                    str = str2;
                }
            }
            if (str.contains("MOD|")) {
                GameEngine.m5460e(this.f4954a + "Path still contains prefix: " + str);
            }
        }
        if (str.contains("NEW_PATH|")) {
            String[] split2 = str.split("/");
            if (split2.length >= 2) {
                String str4 = split2[split2.length - 1];
                boolean z2 = false;
                int length2 = split2.length - 2;
                while (true) {
                    if (length2 < 0) {
                        break;
                    }
                    String str5 = split2[length2];
                    if (str5.startsWith("NEW_PATH|") && str5.substring("NEW_PATH|".length()).equals("maps2")) {
                        str4 = "/SD/rustedWarfare/maps" + File.separator + str4;
                        GameEngine.m5460e(this.f4954a + "Path changed to maps2 path:" + str4);
                        z2 = true;
                        break;
                    }
                    str4 = str5 + File.separator + str4;
                    length2--;
                }
                if (z2) {
                    str = str4;
                }
            }
        }
        return str;
    }

    /* renamed from: e */
    public String mo2251e(String str) {
        if (str == null) {
            return "<null>";
        }
        String mo2250f = mo2250f(str);
        AbstractC1111af m628b = C1110ae.m628b(mo2250f);
        if (m628b != null) {
            return m628b.mo614f(mo2250f);
        }
        return mo2250f;
    }

    /* renamed from: f */
    public String mo2250f(String str) {
        String mo2252d = mo2252d(str);
        if (GameEngine.f6418aU) {
            if (mo2252d.startsWith("/SD/rusted_warfare_maps")) {
                mo2252d = "/SD/mods/maps" + mo2252d.substring("/SD/rusted_warfare_maps".length());
                GameEngine.m5460e(this.f4954a + "convertAbstractPath: Changing to:" + mo2252d);
            }
            if (mo2252d.startsWith("/SD/rustedWarfare/maps")) {
                mo2252d = "/SD/mods/maps" + mo2252d.substring("/SD/rustedWarfare/maps".length());
                GameEngine.m5460e(this.f4954a + "convertAbstractPath2: Changing to:" + mo2252d);
            }
            if (mo2252d.startsWith("/SD/") || mo2252d.startsWith("\\SD\\")) {
                String substring = mo2252d.substring("/SD/".length());
                if (substring.startsWith("rustedWarfare/")) {
                    substring = substring.substring("rustedWarfare/".length());
                }
                return mo2241b() + substring;
            } else if (mo2253c(mo2252d)) {
                return mo2252d;
            } else {
                return "assets/" + mo2252d;
            }
        } else if (mo2252d.startsWith("/SD/")) {
            String substring2 = mo2252d.substring("/SD/".length());
            if (substring2.startsWith("rustedWarfare/")) {
                substring2 = substring2.substring("rustedWarfare/".length());
            }
            return mo2241b() + substring2;
        } else {
            return mo2252d;
        }
    }

    /* renamed from: f */
    private String m2265f() {
        if (this.f4959f == null) {
            this.f4959f = Environment.getExternalStorageDirectory() + VariableScope.nullOrMissingString;
        }
        return this.f4959f;
    }

    /* renamed from: a */
    public boolean mo2255a(String str, boolean z) {
        AbstractC1111af m630a;
        String mo2250f = mo2250f(str);
        if (z) {
            m630a = C1110ae.m628b(mo2250f);
        } else {
            m630a = C1110ae.m630a(mo2250f);
        }
        if (m630a != null) {
            return m630a.mo618d(mo2250f);
        }
        if (mo2254b(str)) {
            if (this.f4957d) {
                return false;
            }
            if (!GameEngine.getGameEngine().f6322bK.m548a(mo2250f)) {
                GameEngine.m5460e(this.f4954a + "isDirectory: asset file doesn't exist:" + mo2250f);
                return false;
            } else if (C0773f.m2105k(str).contains(".")) {
                return false;
            } else {
                return true;
            }
        }
        File file = new File(mo2250f);
        if (!file.exists()) {
            GameEngine.m5460e(this.f4954a + "isDirectory: file doesn't exist:" + mo2250f);
            return false;
        }
        return file.isDirectory();
    }

    /* renamed from: g */
    public boolean mo2249g(String str) {
        String mo2250f = mo2250f(str);
        AbstractC1111af m630a = C1110ae.m630a(mo2250f);
        if (m630a != null) {
            boolean mo625a = m630a.mo625a(mo2250f);
            if (this.f4956c) {
                GameEngine.m5460e("fileExists: " + mo625a + " with reader: " + m630a + " convertedDir:" + mo2250f);
            }
            return mo625a;
        } else if (mo2254b(str)) {
            if (this.f4957d) {
                if (this.f4956c) {
                    GameEngine.m5460e("fileExists: false with disableAssets");
                    return false;
                }
                return false;
            }
            boolean m548a = GameEngine.getGameEngine().f6322bK.m548a(mo2250f);
            if (this.f4956c) {
                GameEngine.m5460e("fileExists: " + m548a + " with abstractPathAsset convertedDir:" + mo2250f);
            }
            return m548a;
        } else {
            File file = new File(mo2250f);
            if (file == null || !file.exists()) {
                if (this.f4956c) {
                    GameEngine.m5460e("fileExists: false with normal file convertedDir:" + mo2250f);
                    return false;
                }
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public String[] mo2240b(String str, boolean z) {
        String[] list;
        String[] strArr;
        try {
            String mo2250f = mo2250f(str);
            AbstractC1111af m630a = C1110ae.m630a(mo2250f);
            if (m630a != null) {
                list = m630a.mo622b(mo2250f);
            } else if (mo2254b(str)) {
                if (this.f4957d) {
                    return null;
                }
                list = GameEngine.getGameEngine().f6322bK.m546b(mo2250f);
            } else {
                File file = new File(mo2250f);
                if (file == null || !file.exists()) {
                    String str2 = "listDir: path doesn't exist:" + mo2250f;
                    GameEngine.print(str2);
                    C0765a.m2291b(str2);
                    return null;
                }
                list = file.list();
                if (list == null) {
                    if (file != null && !file.isDirectory()) {
                        C0765a.m2291b("path is not a directory, .rwmod or .zip");
                        return null;
                    }
                    return null;
                }
            }
            if (list == null) {
                GameEngine.m5460e(this.f4954a + "listDir baseList==null:" + str + " (non folder?)");
                return null;
            }
            ArrayList arrayList = new ArrayList();
            if (z) {
                for (String str3 : list) {
                    if (str3.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                        arrayList.add(str3);
                    }
                }
            } else {
                for (String str4 : list) {
                    arrayList.add(str4);
                }
            }
            Collections.sort(arrayList);
            return (String[]) arrayList.toArray(new String[0]);
        } catch (OutOfMemoryError e) {
            C0765a.m2291b(e.getMessage());
            return null;
        }
    }

    /* renamed from: h */
    public File m2264h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.isDirectory()) {
            parentFile = m2264h(parentFile.getAbsolutePath());
            if (parentFile == null || !parentFile.isDirectory()) {
                GameEngine.m5460e(this.f4954a + "createFileCaseInsensitive: did not find parent for: " + str);
                return null;
            }
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null) {
            GameEngine.m5460e(this.f4954a + "createFileCaseInsensitive: Failed to list files for: " + str + " in " + parentFile);
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equalsIgnoreCase(file.getName())) {
                return file2;
            }
        }
        return null;
    }

    /* renamed from: i */
    public C1133j mo2248i(String str) {
        if (str.startsWith("assets/") || str.startsWith("assets\\")) {
            str = str.substring("assets/".length());
        }
        String str2 = str;
        String str3 = "assets/" + str;
        AssetManager mo5308d = C0090c.m4947a().mo5308d();
        if (GameEngine.f6422aY) {
        }
        try {
            try {
                return new C1133j(mo5308d.m5296a(str2), str3, str2);
            } catch (FileNotFoundException e) {
                return null;
            }
        } catch (IOException e2) {
            GameEngine.m5460e(this.f4954a + "Could not find asset:" + str3);
            return null;
        }
    }

    /* renamed from: j */
    public C1133j mo2247j(String str) {
        C1133j c1133j;
        String mo2250f = mo2250f(str);
        AbstractC1111af m630a = C1110ae.m630a(mo2250f);
        if (m630a != null && !mo2250f.endsWith(".rwmod")) {
            return m630a.mo621b(mo2250f, true);
        }
        if (str.startsWith("/SD/") || str.startsWith("\\SD\\")) {
            String substring = str.substring("/SD/".length());
            String str2 = substring;
            if (str2.startsWith("rustedWarfare/")) {
                str2 = str2.substring("rustedWarfare/".length());
            }
            String str3 = mo2241b() + str2;
            if (this.f4955b) {
                GameEngine.m5460e(this.f4954a + "openAssetSteam converted:" + substring + " to: " + str3);
            }
            try {
                File m2264h = m2264h(str3);
                if (m2264h == null) {
                    return null;
                }
                c1133j = new C1133j(new FileInputStream(m2264h), m2264h.getAbsolutePath());
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (mo2253c(str)) {
            try {
                File m2264h2 = m2264h(str);
                if (m2264h2 == null) {
                    return null;
                }
                c1133j = new C1133j(new FileInputStream(m2264h2), m2264h2.getAbsolutePath());
            } catch (FileNotFoundException e2) {
                return null;
            }
        } else {
            c1133j = mo2248i(str);
        }
        return c1133j;
    }

    /* renamed from: c */
    public OutputStream m2266c(String str, boolean z) {
        String mo2250f = mo2250f(str);
        AbstractC1111af m630a = C1110ae.m630a(mo2250f);
        if (m630a != null && !mo2250f.endsWith(".rwmod")) {
            return m630a.mo619c(mo2250f, z);
        }
        return new FileOutputStream(mo2250f, z);
    }

    /* renamed from: k */
    public boolean m2263k(String str) {
        String mo2250f = mo2250f(str);
        AbstractC1111af m630a = C1110ae.m630a(mo2250f);
        if (m630a != null && !mo2250f.endsWith(".rwmod")) {
            boolean mo616e = m630a.mo616e(mo2250f);
            if (!mo616e) {
                GameEngine.m5460e("Failed to create directory: " + mo2250f + " using reader:" + m630a);
            }
            return mo616e;
        }
        boolean mkdirs = new File(mo2250f).mkdirs();
        if (!mkdirs) {
            GameEngine.m5460e("Failed to create directory: " + mo2250f);
        }
        return mkdirs;
    }

    /* renamed from: b */
    public String mo2241b() {
        if (GameEngine.f6418aU) {
            return VariableScope.nullOrMissingString;
        }
        return m2265f() + "/rustedWarfare/";
    }

    /* renamed from: c */
    public String m2267c() {
        if (GameEngine.m1030at()) {
            String absolutePath = C0090c.m4947a().mo5303i().getAbsolutePath();
            if (!absolutePath.endsWith("/")) {
                absolutePath = absolutePath + "/";
            }
            return absolutePath;
        }
        String mo2241b = mo2241b();
        if (mo2241b.equals(VariableScope.nullOrMissingString)) {
            return "cache/";
        }
        return mo2241b + "/cache/";
    }

    /* renamed from: l */
    public long m2262l(String str) {
        String mo2250f = mo2250f(str);
        AbstractC1111af m630a = C1110ae.m630a(mo2250f);
        if (m630a != null) {
            return m630a.mo613g(mo2250f);
        }
        File file = new File(mo2250f);
        if (!file.exists()) {
        }
        return file.lastModified();
    }

    /* renamed from: a */
    public void m2270a(File file) {
        if (GameEngine.m1030at()) {
        }
    }

    /* renamed from: a */
    public File mo2256a(String str, String str2, boolean z) {
        File file = new File(mo2241b() + str2 + str);
        if (z) {
            File parentFile = file.getParentFile();
            if (!C0765a.m2278i(parentFile.getAbsolutePath())) {
                GameEngine.m5460e("Making missing parent dir: " + parentFile.getAbsolutePath());
                if (!C0765a.m2275l(parentFile.getAbsolutePath())) {
                    GameEngine.print("getRWFile: Could not create parent directory");
                }
            }
            if (GameEngine.m1030at()) {
            }
        }
        return file;
    }

    /* renamed from: d */
    public String mo2239d() {
        return "external";
    }

    /* renamed from: m */
    public String mo2246m(String str) {
        return mo2239d();
    }

    /* renamed from: e */
    public boolean mo2238e() {
        return true;
    }

    /* renamed from: n */
    public String m2261n(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf("[INTERNAL-PATH]/") != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + "[INTERNAL-PATH]/".length());
            if (str2.contains("[INTERNAL-PATH]/") || str2.contains("[EXTERNAL-PATH]/")) {
                GameEngine.m5460e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf("[EXTERNAL-PATH]/") != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + "[EXTERNAL-PATH]/".length());
            if (str3.contains("[INTERNAL-PATH]/") || str3.contains("[EXTERNAL-PATH]/")) {
                GameEngine.m5460e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    /* renamed from: o */
    public String mo2245o(String str) {
        return str;
    }

    /* renamed from: b */
    public boolean m2268b(File file) {
        GameEngine.m5460e("deleteFile: " + file.getAbsolutePath());
        AbstractC1111af m628b = C1110ae.m628b(file.getAbsolutePath());
        if (m628b != null) {
            GameEngine.m5460e("Mapped delete");
            return m628b.mo620c(file.getAbsolutePath());
        }
        GameEngine.m5460e("Native delete");
        return file.delete();
    }

    /* renamed from: a */
    public boolean m2269a(File file, File file2) {
        GameEngine.m5460e("renameFile: " + file.getAbsolutePath() + " to:" + file2.getAbsolutePath());
        AbstractC1111af m628b = C1110ae.m628b(file.getAbsolutePath());
        if (m628b != null) {
            try {
                boolean mo624a = m628b.mo624a(file.getAbsolutePath(), file2.getAbsolutePath());
                C1110ae.m627c(file2.getAbsolutePath());
                return mo624a;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        boolean renameTo = file.renameTo(file2);
        C1110ae.m627c(file2.getAbsolutePath());
        return renameTo;
    }

    /* renamed from: p */
    public boolean m2260p(String str) {
        AbstractC1111af m628b = C1110ae.m628b(mo2250f(str));
        if (m628b != null && (m628b instanceof C1103a)) {
            return true;
        }
        return false;
    }
}