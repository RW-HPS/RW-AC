package com.corrodinggames.rts.gameFramework.utility.p049a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/b.class */
class C1104b {

    /* renamed from: a */
    Uri f7016a;

    /* renamed from: b */
    Uri f7017b;

    /* renamed from: c */
    String f7018c;

    /* renamed from: d */
    boolean f7019d;

    /* renamed from: e */
    C1105c f7020e;

    /* renamed from: f */
    boolean f7021f = false;

    /* renamed from: g */
    int f7022g = 1;

    public C1104b(Uri uri, boolean z) {
        this.f7016a = uri;
        this.f7017b = C1103a.f7013a.buildDocumentUriUsingTree(uri);
        this.f7018c = C1103a.f7013a.getReadablePath(m721c(), uri);
        this.f7019d = z;
        C1103a.m734h("== new SafLink write:" + z + " ==");
        C1103a.m734h("root:" + this.f7016a);
        C1103a.m734h("rootDocument:" + this.f7017b);
        C1103a.m734h("shownUrl:" + this.f7018c);
        this.f7020e = new C1105c(this, VariableScope.nullOrMissingString, this.f7017b, true);
    }

    /* renamed from: a */
    public void m727a() {
        this.f7021f = true;
        this.f7022g++;
    }

    /* renamed from: b */
    public void m723b() {
        C1103a.m734h("== testRoot ==");
        C1103a.f7013a.listWithDetails(m721c(), this.f7017b);
    }

    /* renamed from: c */
    public Context m721c() {
        return C0090c.m4947a();
    }

    /* renamed from: a */
    public boolean m726a(String str) {
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (z) {
            return C1103a.f7013a.exists(m721c(), m717f(str));
        }
        if (m712k(str) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public C1133j m722b(String str) {
        Uri m717f;
        boolean z = false;
        if ("mod-info.txt".equals(str)) {
            z = true;
        }
        if (!z) {
            C1105c m712k = m712k(str);
            if (m712k == null) {
                return null;
            }
            m717f = m712k.f7024b;
        } else {
            m717f = m717f(str);
        }
        if (m717f == null) {
            return null;
        }
        try {
            InputStream read = C1103a.f7013a.read(m721c(), m717f);
            if (read == null) {
                return null;
            }
            return new C1133j(read, this.f7016a + "/" + str);
        } catch (FileNotFoundException e) {
            C1103a.m732j("openAssetSteam: " + e.getMessage() + " (file: " + str + ")");
            return null;
        } catch (IllegalArgumentException e2) {
            C1103a.m732j("openAssetSteam: " + e2.getMessage() + " (file: " + str + ")");
            return null;
        }
    }

    /* renamed from: c */
    public long m720c(String str) {
        Uri m717f = m717f(str);
        if (m717f == null) {
            C1103a.m734h("getLastModified file missing: " + str);
            return 0L;
        }
        return C1103a.f7013a.getLastModified(m721c(), m717f);
    }

    /* renamed from: d */
    public long m719d(String str) {
        Uri m717f = m717f(str);
        if (m717f == null) {
            C1103a.m734h("getEntrySize file missing: " + str);
            return -1L;
        }
        return C1103a.f7013a.getFileSize(m721c(), m717f);
    }

    /* renamed from: a */
    public OutputStream m724a(String str, boolean z) {
        C1103a.m733i("writableOutputSteam:" + str);
        Uri m717f = m717f(str);
        if (m717f == null) {
            String name = new File(str).getName();
            Uri m714i = m714i(str);
            C1103a.m733i("writableOutputSteam creating: " + name + " in " + m714i);
            if (m714i == null) {
                C1103a.m732j("writableOutputSteam: Parent folder not found for: " + str);
                return null;
            }
            try {
                m717f = C1103a.f7013a.createFile(m721c(), m714i, VariableScope.nullOrMissingString, name);
                C1103a.m733i("newFileUri: " + m717f);
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
            OutputStream write = C1103a.f7013a.write(m721c(), m717f, str2);
            m727a();
            return write;
        } catch (FileNotFoundException e2) {
            e2.printStackTrace();
            return null;
        }
    }

    /* renamed from: e */
    public boolean m718e(String str) {
        if (!this.f7019d) {
            C1103a.m732j("deleteFile: Not open as writable");
            return false;
        }
        Uri m717f = m717f(str);
        if (m717f == null) {
            C1103a.m732j("deleteFile: fileUri==null for:" + str);
            return false;
        } else if (C1103a.f7013a.isDirectory(m721c(), m717f)) {
            throw new RuntimeException("Attempted to delete folder at: " + str + " url:" + m717f);
        } else {
            try {
                boolean deleteFile = C1103a.f7013a.deleteFile(m721c(), m717f);
                m727a();
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

    /* renamed from: a */
    public boolean m725a(String str, String str2) {
        if (!this.f7019d) {
            C1103a.m732j("renameFile: Not open as writable");
            return false;
        }
        Uri m717f = m717f(str);
        if (m717f == null) {
            C1103a.m732j("renameFile: fileUri==null for:" + str);
            return false;
        }
        String m2105k = C0773f.m2105k(str2);
        C1103a.m733i("Rename: " + m717f + " to " + m2105k);
        try {
            Uri renameFile = C1103a.f7013a.renameFile(m721c(), m717f, m2105k);
            m727a();
            return renameFile != null;
        } catch (IOException e) {
            e.printStackTrace();
            return false;
        }
    }

    /* renamed from: f */
    public Uri m717f(String str) {
        C1105c m712k = m712k(str);
        if (m712k == null) {
            return null;
        }
        return m712k.f7024b;
    }

    /* renamed from: g */
    public String[] m716g(String str) {
        C1105c m712k = m712k(str);
        if (m712k == null || !m712k.f7025c) {
            return null;
        }
        HashMap m710a = m712k.m710a();
        ArrayList arrayList = new ArrayList();
        for (String str2 : m710a.keySet()) {
            arrayList.add(str2);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: h */
    public boolean m715h(String str) {
        if (str.equals("/") || str.equals(VariableScope.nullOrMissingString)) {
            return true;
        }
        C1105c m712k = m712k(str);
        if (m712k == null) {
            return false;
        }
        return m712k.f7025c;
    }

    /* renamed from: i */
    public Uri m714i(String str) {
        String parent = new File(str).getParent();
        if (parent == null) {
            parent = VariableScope.nullOrMissingString;
        }
        Uri m717f = m717f(parent);
        if (m717f == null) {
            C1103a.m732j("createDirectory: Parent folder: " + parent + " not found");
        }
        return m717f;
    }

    /* renamed from: j */
    public boolean m713j(String str) {
        String name = new File(str).getName();
        Uri m714i = m714i(str);
        if (m714i == null) {
            return false;
        }
        Uri createDirectory = C1103a.f7013a.createDirectory(m721c(), m714i, name);
        m727a();
        return createDirectory != null;
    }

    /* renamed from: k */
    private C1105c m712k(String str) {
        return m711l(str);
    }

    /* renamed from: l */
    private C1105c m711l(String str) {
        String[] split = str.split("\\\\|\\/");
        C1105c c1105c = this.f7020e;
        for (String str2 : split) {
            if (!str2.trim().equals(VariableScope.nullOrMissingString)) {
                try {
                    C1105c c1105c2 = (C1105c) c1105c.m710a().get(str2);
                    if (c1105c2 != null) {
                        c1105c = c1105c2;
                    } else {
                        C1105c c1105c3 = (C1105c) c1105c.f7027e.get(str2.toLowerCase(Locale.ROOT));
                        if (c1105c3 != null) {
                            c1105c = c1105c3;
                        } else {
                            C1103a.m733i("child null for: " + str);
                            C1103a.m733i("element: " + str2);
                            return null;
                        }
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
        }
        return c1105c;
    }
}