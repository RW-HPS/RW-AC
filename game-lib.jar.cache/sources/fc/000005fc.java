package com.corrodinggames.rts.gameFramework.utility.a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/b.class */
public class b {

    /* renamed from: a  reason: collision with root package name */
    Uri f665a;
    Uri b;
    String c;
    boolean d;
    c e;
    boolean f = false;
    int g = 1;

    public b(Uri uri, boolean z) {
        this.f665a = uri;
        this.b = a.f664a.buildDocumentUriUsingTree(uri);
        this.c = a.f664a.getReadablePath(c(), uri);
        this.d = z;
        a.h("== new SafLink write:" + z + " ==");
        a.h("root:" + this.f665a);
        a.h("rootDocument:" + this.b);
        a.h("shownUrl:" + this.c);
        this.e = new c(this, VariableScope.nullOrMissingString, this.b, true);
    }

    public void a() {
        this.f = true;
        this.g++;
    }

    public void b() {
        a.h("== testRoot ==");
        a.f664a.listWithDetails(c(), this.b);
    }

    public Context c() {
        return com.corrodinggames.rts.appFramework.c.a();
    }

    public boolean a(String str) {
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (z) {
            return a.f664a.exists(c(), f(str));
        }
        if (k(str) == null) {
            return false;
        }
        return true;
    }

    public j b(String str) {
        Uri f;
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (!z) {
            c k = k(str);
            if (k == null) {
                return null;
            }
            f = k.b;
        } else {
            f = f(str);
        }
        if (f == null) {
            return null;
        }
        try {
            InputStream read = a.f664a.read(c(), f);
            if (read == null) {
                return null;
            }
            return new j(read, this.f665a + "/" + str);
        } catch (FileNotFoundException e) {
            a.j("openAssetSteam: " + e.getMessage() + " (file: " + str + ")");
            return null;
        } catch (IllegalArgumentException e2) {
            a.j("openAssetSteam: " + e2.getMessage() + " (file: " + str + ")");
            return null;
        }
    }

    public long c(String str) {
        Uri f = f(str);
        if (f == null) {
            a.h("getLastModified file missing: " + str);
            return 0L;
        }
        return a.f664a.getLastModified(c(), f);
    }

    public long d(String str) {
        Uri f = f(str);
        if (f == null) {
            a.h("getEntrySize file missing: " + str);
            return -1L;
        }
        return a.f664a.getFileSize(c(), f);
    }

    public OutputStream a(String str, boolean z) {
        a.i("writableOutputSteam:" + str);
        Uri f = f(str);
        if (f == null) {
            String name = new File(str).getName();
            Uri i = i(str);
            a.i("writableOutputSteam creating: " + name + " in " + i);
            if (i == null) {
                a.j("writableOutputSteam: Parent folder not found for: " + str);
                return null;
            }
            try {
                f = a.f664a.createFile(c(), i, VariableScope.nullOrMissingString, name);
                a.i("newFileUri: " + f);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        }
        String str2 = "w";
        if (z) {
            str2 = "wa";
        }
        try {
            OutputStream write = a.f664a.write(c(), f, str2);
            a();
            return write;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    public boolean e(String str) {
        if (!this.d) {
            a.j("deleteFile: Not open as writable");
            return false;
        }
        Uri f = f(str);
        if (f == null) {
            a.j("deleteFile: fileUri==null for:" + str);
            return false;
        } else if (a.f664a.isDirectory(c(), f)) {
            throw new RuntimeException("Attempted to delete folder at: " + str + " url:" + f);
        } else {
            try {
                boolean deleteFile = a.f664a.deleteFile(c(), f);
                a();
                return deleteFile;
            } catch (IOException e) {
                e.printStackTrace();
                return false;
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return false;
            }
        }
    }

    public boolean a(String str, String str2) {
        if (!this.d) {
            a.j("renameFile: Not open as writable");
            return false;
        }
        Uri f = f(str);
        if (f == null) {
            a.j("renameFile: fileUri==null for:" + str);
            return false;
        }
        String k = f.k(str2);
        a.i("Rename: " + f + " to " + k);
        try {
            Uri renameFile = a.f664a.renameFile(c(), f, k);
            a();
            return renameFile != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    public Uri f(String str) {
        c k = k(str);
        if (k == null) {
            return null;
        }
        return k.b;
    }

    public String[] g(String str) {
        c k = k(str);
        if (k == null || !k.c) {
            return null;
        }
        HashMap a2 = k.a();
        ArrayList arrayList = new ArrayList();
        for (String str2 : a2.keySet()) {
            arrayList.add(str2);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public boolean h(String str) {
        if (str.equals("/") || str.equals(VariableScope.nullOrMissingString)) {
            return true;
        }
        c k = k(str);
        if (k == null) {
            return false;
        }
        return k.c;
    }

    public Uri i(String str) {
        String parent = new File(str).getParent();
        if (parent == null) {
            parent = VariableScope.nullOrMissingString;
        }
        Uri f = f(parent);
        if (f == null) {
            a.j("createDirectory: Parent folder: " + parent + " not found");
        }
        return f;
    }

    public boolean j(String str) {
        String name = new File(str).getName();
        Uri i = i(str);
        if (i == null) {
            return false;
        }
        Uri createDirectory = a.f664a.createDirectory(c(), i, name);
        a();
        return createDirectory != null;
    }

    private c k(String str) {
        return l(str);
    }

    private c l(String str) {
        String[] split = str.split("\\\\|\\/");
        c cVar = this.e;
        for (String str2 : split) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    c cVar2 = (c) cVar.a().get(str2);
                    if (cVar2 != null) {
                        cVar = cVar2;
                    } else {
                        c cVar3 = (c) cVar.e.get(str2.toLowerCase(Locale.ROOT));
                        if (cVar3 != null) {
                            cVar = cVar3;
                        } else {
                            a.i("child null for: " + str);
                            a.i("element: " + str2);
                            return null;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return cVar;
    }
}