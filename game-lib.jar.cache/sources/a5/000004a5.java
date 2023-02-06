package com.corrodinggames.rts.gameFramework.file;

import android.content.res.AssetManager;
import android.os.Environment;
import com.corrodinggames.rts.appFramework.c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.mod.b;
import com.corrodinggames.rts.gameFramework.utility.a.a;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.j;
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
    public String a = "FileLoader: ";
    public boolean b = false;
    public boolean c = false;
    public boolean d = false;
    String e;
    String f;

    public String a() {
        String str = this.e;
        this.e = null;
        return str;
    }

    public void a(String str) {
        this.e = str;
    }

    public String a(String str, String str2) {
        File[] listFiles = new File(str).listFiles();
        if (listFiles == null) {
            GameEngine.m5e(this.a + "findFileExtension('" + str + "','" + str2 + "'): path is not a folder");
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
        GameEngine.m5e(this.a + "Could not find file with path: " + str + " file:" + str2);
        return null;
    }

    public boolean b(String str) {
        if (GameEngine.aU || str.startsWith("/") || str.startsWith("/SD/")) {
            return false;
        }
        return true;
    }

    public boolean c(String str) {
        if (str.startsWith("/") || str.startsWith("\\")) {
            return true;
        }
        if (GameEngine.aU) {
            if (str.startsWith("mods")) {
                return true;
            }
            if (GameEngine.aZ && str.startsWith("converted-sounds")) {
                return true;
            }
        }
        if (str.split("\\\\")[0].endsWith(":")) {
            return true;
        }
        return false;
    }

    public String d(String str) {
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
                        b c = gameEngine.bZ.c(substring);
                        if (c == null) {
                            GameEngine.m5e(this.a + "Failed to find mod with hash:" + substring);
                        } else {
                            str2 = f.b(c.g(), str2);
                            GameEngine.m5e(this.a + "Path changed to mod path:" + str2);
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
                GameEngine.m5e(this.a + "Path still contains prefix: " + str);
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
                        GameEngine.m5e(this.a + "Path changed to maps2 path:" + str4);
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

    public String e(String str) {
        if (str == null) {
            return "<null>";
        }
        String f = f(str);
        af b = ae.b(f);
        if (b != null) {
            return b.f(f);
        }
        return f;
    }

    public String f(String str) {
        String d = d(str);
        if (GameEngine.aU) {
            if (d.startsWith("/SD/rusted_warfare_maps")) {
                d = "/SD/mods/maps" + d.substring("/SD/rusted_warfare_maps".length());
                GameEngine.m5e(this.a + "convertAbstractPath: Changing to:" + d);
            }
            if (d.startsWith("/SD/rustedWarfare/maps")) {
                d = "/SD/mods/maps" + d.substring("/SD/rustedWarfare/maps".length());
                GameEngine.m5e(this.a + "convertAbstractPath2: Changing to:" + d);
            }
            if (d.startsWith("/SD/") || d.startsWith("\\SD\\")) {
                String substring = d.substring("/SD/".length());
                if (substring.startsWith("rustedWarfare/")) {
                    substring = substring.substring("rustedWarfare/".length());
                }
                return b() + substring;
            } else if (c(d)) {
                return d;
            } else {
                return "assets/" + d;
            }
        } else if (d.startsWith("/SD/")) {
            String substring2 = d.substring("/SD/".length());
            if (substring2.startsWith("rustedWarfare/")) {
                substring2 = substring2.substring("rustedWarfare/".length());
            }
            return b() + substring2;
        } else {
            return d;
        }
    }

    private String f() {
        if (this.f == null) {
            this.f = Environment.getExternalStorageDirectory() + VariableScope.nullOrMissingString;
        }
        return this.f;
    }

    public boolean a(String str, boolean z) {
        af a;
        String f = f(str);
        if (z) {
            a = ae.b(f);
        } else {
            a = ae.a(f);
        }
        if (a != null) {
            return a.d(f);
        }
        if (b(str)) {
            if (this.d) {
                return false;
            }
            if (!GameEngine.getGameEngine().bK.a(f)) {
                GameEngine.m5e(this.a + "isDirectory: asset file doesn't exist:" + f);
                return false;
            } else if (f.k(str).contains(".")) {
                return false;
            } else {
                return true;
            }
        }
        File file = new File(f);
        if (!file.exists()) {
            GameEngine.m5e(this.a + "isDirectory: file doesn't exist:" + f);
            return false;
        }
        return file.isDirectory();
    }

    public boolean g(String str) {
        String f = f(str);
        af a = ae.a(f);
        if (a != null) {
            boolean a2 = a.a(f);
            if (this.c) {
                GameEngine.m5e("fileExists: " + a2 + " with reader: " + a + " convertedDir:" + f);
            }
            return a2;
        } else if (b(str)) {
            if (this.d) {
                if (this.c) {
                    GameEngine.m5e("fileExists: false with disableAssets");
                    return false;
                }
                return false;
            }
            boolean a3 = GameEngine.getGameEngine().bK.a(f);
            if (this.c) {
                GameEngine.m5e("fileExists: " + a3 + " with abstractPathAsset convertedDir:" + f);
            }
            return a3;
        } else {
            File file = new File(f);
            if (file == null || !file.exists()) {
                if (this.c) {
                    GameEngine.m5e("fileExists: false with normal file convertedDir:" + f);
                    return false;
                }
                return false;
            }
            return true;
        }
    }

    public String[] b(String str, boolean z) {
        String[] list;
        String[] strArr;
        try {
            String f = f(str);
            af a = ae.a(f);
            if (a != null) {
                list = a.b(f);
            } else if (b(str)) {
                if (this.d) {
                    return null;
                }
                list = GameEngine.getGameEngine().bK.b(f);
            } else {
                File file = new File(f);
                if (file == null || !file.exists()) {
                    String str2 = "listDir: path doesn't exist:" + f;
                    GameEngine.print(str2);
                    a.b(str2);
                    return null;
                }
                list = file.list();
                if (list == null) {
                    if (file != null && !file.isDirectory()) {
                        a.b("path is not a directory, .rwmod or .zip");
                        return null;
                    }
                    return null;
                }
            }
            if (list == null) {
                GameEngine.m5e(this.a + "listDir baseList==null:" + str + " (non folder?)");
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
            a.b(e.getMessage());
            return null;
        }
    }

    public File h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        File file = new File(str);
        if (file.exists()) {
            return file;
        }
        File parentFile = file.getParentFile();
        if (parentFile == null || !parentFile.isDirectory()) {
            parentFile = h(parentFile.getAbsolutePath());
            if (parentFile == null || !parentFile.isDirectory()) {
                GameEngine.m5e(this.a + "createFileCaseInsensitive: did not find parent for: " + str);
                return null;
            }
        }
        File[] listFiles = parentFile.listFiles();
        if (listFiles == null) {
            GameEngine.m5e(this.a + "createFileCaseInsensitive: Failed to list files for: " + str + " in " + parentFile);
            return null;
        }
        for (File file2 : listFiles) {
            if (file2.getName().equalsIgnoreCase(file.getName())) {
                return file2;
            }
        }
        return null;
    }

    public j i(String str) {
        if (str.startsWith("assets/") || str.startsWith("assets\\")) {
            str = str.substring("assets/".length());
        }
        String str2 = str;
        String str3 = "assets/" + str;
        AssetManager d = c.a().d();
        if (GameEngine.aY) {
        }
        try {
            try {
                return new j(d.a(str2), str3, str2);
            } catch (FileNotFoundException e) {
                return null;
            }
        } catch (IOException e2) {
            GameEngine.m5e(this.a + "Could not find asset:" + str3);
            return null;
        }
    }

    public j j(String str) {
        j jVar;
        String f = f(str);
        af a = ae.a(f);
        if (a != null && !f.endsWith(".rwmod")) {
            return a.b(f, true);
        }
        if (str.startsWith("/SD/") || str.startsWith("\\SD\\")) {
            String substring = str.substring("/SD/".length());
            String str2 = substring;
            if (str2.startsWith("rustedWarfare/")) {
                str2 = str2.substring("rustedWarfare/".length());
            }
            String str3 = b() + str2;
            if (this.b) {
                GameEngine.m5e(this.a + "openAssetSteam converted:" + substring + " to: " + str3);
            }
            try {
                File h = h(str3);
                if (h == null) {
                    return null;
                }
                jVar = new j(new FileInputStream(h), h.getAbsolutePath());
            } catch (FileNotFoundException e) {
                return null;
            }
        } else if (c(str)) {
            try {
                File h2 = h(str);
                if (h2 == null) {
                    return null;
                }
                jVar = new j(new FileInputStream(h2), h2.getAbsolutePath());
            } catch (FileNotFoundException e2) {
                return null;
            }
        } else {
            jVar = i(str);
        }
        return jVar;
    }

    public OutputStream c(String str, boolean z) {
        String f = f(str);
        af a = ae.a(f);
        if (a != null && !f.endsWith(".rwmod")) {
            return a.c(f, z);
        }
        return new FileOutputStream(f, z);
    }

    public boolean k(String str) {
        String f = f(str);
        af a = ae.a(f);
        if (a != null && !f.endsWith(".rwmod")) {
            boolean e = a.e(f);
            if (!e) {
                GameEngine.m5e("Failed to create directory: " + f + " using reader:" + a);
            }
            return e;
        }
        boolean mkdirs = new File(f).mkdirs();
        if (!mkdirs) {
            GameEngine.m5e("Failed to create directory: " + f);
        }
        return mkdirs;
    }

    public String b() {
        if (GameEngine.aU) {
            return VariableScope.nullOrMissingString;
        }
        return f() + "/rustedWarfare/";
    }

    public String c() {
        if (GameEngine.at()) {
            String absolutePath = c.a().i().getAbsolutePath();
            if (!absolutePath.endsWith("/")) {
                absolutePath = absolutePath + "/";
            }
            return absolutePath;
        }
        String b = b();
        if (b.equals(VariableScope.nullOrMissingString)) {
            return "cache/";
        }
        return b + "/cache/";
    }

    public long l(String str) {
        String f = f(str);
        af a = ae.a(f);
        if (a != null) {
            return a.g(f);
        }
        File file = new File(f);
        if (!file.exists()) {
        }
        return file.lastModified();
    }

    public void a(File file) {
        if (GameEngine.at()) {
        }
    }

    public File a(String str, String str2, boolean z) {
        File file = new File(b() + str2 + str);
        if (z) {
            File parentFile = file.getParentFile();
            if (!a.i(parentFile.getAbsolutePath())) {
                GameEngine.m5e("Making missing parent dir: " + parentFile.getAbsolutePath());
                if (!a.l(parentFile.getAbsolutePath())) {
                    GameEngine.print("getRWFile: Could not create parent directory");
                }
            }
            if (GameEngine.at()) {
            }
        }
        return file;
    }

    public String d() {
        return "external";
    }

    public String m(String str) {
        return d();
    }

    public boolean e() {
        return true;
    }

    public String n(String str) {
        int indexOf;
        int indexOf2;
        if (str == null) {
            return null;
        }
        if (str.indexOf("[INTERNAL-PATH]/") != -1) {
            String str2 = str.substring(0, indexOf) + str.substring(indexOf + "[INTERNAL-PATH]/".length());
            if (str2.contains("[INTERNAL-PATH]/") || str2.contains("[EXTERNAL-PATH]/")) {
                GameEngine.m5e("fixPath: double tag for: " + str);
            }
            return str2;
        }
        if (str.indexOf("[EXTERNAL-PATH]/") != -1) {
            String str3 = str.substring(0, indexOf2) + str.substring(indexOf2 + "[EXTERNAL-PATH]/".length());
            if (str3.contains("[INTERNAL-PATH]/") || str3.contains("[EXTERNAL-PATH]/")) {
                GameEngine.m5e("fixPath: double tag for: " + str);
            }
            return str3;
        }
        return str;
    }

    public String o(String str) {
        return str;
    }

    public boolean b(File file) {
        GameEngine.m5e("deleteFile: " + file.getAbsolutePath());
        af b = ae.b(file.getAbsolutePath());
        if (b != null) {
            GameEngine.m5e("Mapped delete");
            return b.c(file.getAbsolutePath());
        }
        GameEngine.m5e("Native delete");
        return file.delete();
    }

    public boolean a(File file, File file2) {
        GameEngine.m5e("renameFile: " + file.getAbsolutePath() + " to:" + file2.getAbsolutePath());
        af b = ae.b(file.getAbsolutePath());
        if (b != null) {
            try {
                boolean a = b.a(file.getAbsolutePath(), file2.getAbsolutePath());
                ae.c(file2.getAbsolutePath());
                return a;
            } catch (Exception e) {
                e.printStackTrace();
                return false;
            }
        }
        boolean renameTo = file.renameTo(file2);
        ae.c(file2.getAbsolutePath());
        return renameTo;
    }

    public boolean p(String str) {
        af b = ae.b(f(str));
        if (b != null && (b instanceof a)) {
            return true;
        }
        return false;
    }
}