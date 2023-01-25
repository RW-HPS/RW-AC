package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ah.class */
public class C1114ah {

    /* renamed from: a */
    String f7059a = VariableScope.nullOrMissingString;

    /* renamed from: b */
    String f7060b;

    /* renamed from: c */
    ZipFile f7061c;

    /* renamed from: d */
    String[] f7062d;

    /* renamed from: e */
    boolean f7063e;

    public C1114ah(String str, String str2) {
        this.f7060b = str;
        GameEngine.m990g("Opening new zip at: " + str2);
        AbstractC1111af m628b = C1110ae.m628b(str2);
        if (m628b != null) {
            GameEngine.m5777e("Temp file needed for zip with SAF interface");
            if (!GameEngine.m1030at()) {
                throw new IOException("Failed to open source zip with mapper: " + str2);
            }
            long m2440a = C0742br.m2440a();
            C1133j mo621b = m628b.mo621b(str2, true);
            if (mo621b == null) {
                throw new IOException("Failed to open file of zip: " + str2);
            }
            this.f7061c = m606a(mo621b, (Charset) null);
            GameEngine.m5777e("Streamed zip open took:" + C0742br.m2439a(C0742br.m2438a(m2440a)));
        } else {
            this.f7061c = new ZipFile(str2);
        }
        try {
            m603b();
        } catch (IllegalArgumentException e) {
            C1112ag.m612h("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset forName = Charset.forName("ISO-8859-1");
            try {
                if (m628b != null) {
                    GameEngine.m5777e("Temp file needed for zip with SAF interface");
                    if (!GameEngine.m1030at()) {
                        throw new IOException("Failed to open source zip with mapper: " + str2);
                    }
                    long m2440a2 = C0742br.m2440a();
                    this.f7061c = m606a(m628b.mo621b(str2, true), forName);
                    GameEngine.m5777e("Streamed zip open took:" + C0742br.m2439a(C0742br.m2438a(m2440a2)));
                } else {
                    this.f7061c = m604a(str2, forName);
                }
                m603b();
            } catch (RuntimeException e2) {
                e.printStackTrace();
                throw new IOException("Failed to open source zip with unicode and ISO-8859-1 encoding", e2);
            }
        }
    }

    /* renamed from: a */
    public void m607a() {
        if (!this.f7063e) {
            this.f7063e = true;
            if (this.f7061c != null) {
                try {
                    this.f7061c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    /* renamed from: a */
    public static ZipFile m606a(InputStream inputStream, Charset charset) {
        File m2303a = C0765a.m2303a(C0090c.m4941a(), "safMod", "zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(m2303a);
            C0773f.m2192a(inputStream, fileOutputStream);
            fileOutputStream.close();
            inputStream.close();
            if (charset == null) {
                ZipFile zipFile = new ZipFile(m2303a);
                m2303a.delete();
                return zipFile;
            }
            ZipFile m604a = m604a(m2303a.getAbsolutePath(), charset);
            m2303a.delete();
            return m604a;
        } catch (Throwable th) {
            m2303a.delete();
            throw th;
        }
    }

    /* renamed from: a */
    public static ZipFile m604a(String str, Charset charset) {
        Constructor constructor = null;
        try {
            constructor = ZipFile.class.getDeclaredConstructor(String.class, Charset.class);
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (SecurityException e2) {
            e2.printStackTrace();
        }
        if (constructor == null) {
            throw new IOException("Failed to open source zip with unicode encoding, and no method for ISO-8859-1");
        }
        try {
            return (ZipFile) constructor.newInstance(str, charset);
        } catch (IllegalAccessException e3) {
            throw new IOException(e3);
        } catch (IllegalArgumentException e4) {
            throw new IOException(e4);
        } catch (InstantiationException e5) {
            throw new IOException(e5);
        } catch (InvocationTargetException e6) {
            throw new IOException(e6);
        }
    }

    /* renamed from: b */
    public void m603b() {
        double m2438a;
        long m2440a = C0742br.m2440a();
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> entries = this.f7061c.entries();
        while (entries.hasMoreElements()) {
            String name = entries.nextElement().getName();
            if (name == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add(name);
        }
        this.f7062d = (String[]) arrayList.toArray(new String[0]);
        this.f7059a = VariableScope.nullOrMissingString;
        String[] m599e = m599e(VariableScope.nullOrMissingString);
        if (m599e.length == 1 && m600d(m599e[0])) {
            this.f7059a = m599e[0] + "/";
            for (int i = 0; i < this.f7062d.length; i++) {
                if (this.f7062d[i].startsWith(this.f7059a)) {
                    this.f7062d[i] = this.f7062d[i].substring(this.f7059a.length());
                }
            }
        }
        if (C0742br.m2438a(m2440a) > 3.0d) {
            GameEngine.m5777e("zip: buildCache for: " + this.f7060b + ", took:" + C0742br.m2439a(m2438a));
        }
    }

    /* renamed from: a */
    public void m605a(String str) {
        GameEngine.m5777e("Zip: " + str);
    }

    /* renamed from: b */
    public boolean m602b(String str) {
        for (String str2 : this.f7062d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public boolean m601c(String str) {
        for (String str2 : this.f7062d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : this.f7062d) {
            if (str3.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: d */
    public boolean m600d(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (str.equals("/")) {
            return true;
        }
        for (String str2 : this.f7062d) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: e */
    public String[] m599e(String str) {
        String[] strArr;
        if (str.equals(VariableScope.nullOrMissingString) || str.equals("/") || str.equals("\\")) {
            str = VariableScope.nullOrMissingString;
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.f7062d) {
            if (str.equals(VariableScope.nullOrMissingString) || str2.startsWith(str)) {
                String substring = str2.substring(str.length());
                if (substring.length() != 0 && !substring.equals("..")) {
                    if (substring.contains("/")) {
                        String substring2 = substring.substring(0, substring.indexOf("/"));
                        if (!arrayList.contains(substring2)) {
                            arrayList.add(substring2);
                        }
                    } else {
                        arrayList.add(substring);
                    }
                }
            }
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: f */
    public ZipEntry m598f(String str) {
        ZipEntry nextElement;
        String str2 = this.f7059a + str;
        ZipEntry zipEntry = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry = this.f7061c.getEntry(str2);
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        if (zipEntry == null && m602b(str) && !m600d(str)) {
            Enumeration<? extends ZipEntry> entries = this.f7061c.entries();
            while (entries.hasMoreElements()) {
                try {
                    nextElement = entries.nextElement();
                } catch (IllegalArgumentException e2) {
                    e2.printStackTrace();
                }
                if (nextElement.getName().equals(str2)) {
                    return nextElement;
                }
            }
            m605a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException != null) {
            throw new RuntimeException("Failed to decode data in zip: " + str + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
        }
        return zipEntry;
    }

    /* renamed from: g */
    public String m597g(String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2 = str;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        for (String str3 : this.f7062d) {
            if (str3.equals(str)) {
                return str3;
            }
        }
        for (String str4 : this.f7062d) {
            if (str4.equals(str2)) {
                return str4;
            }
        }
        for (String str5 : this.f7062d) {
            if (str5.equalsIgnoreCase(str)) {
                return str5;
            }
        }
        for (String str6 : this.f7062d) {
            if (str6.equalsIgnoreCase(str2)) {
                return str6;
            }
        }
        return str;
    }

    /* renamed from: h */
    public long m596h(String str) {
        ZipEntry m598f = m598f(str);
        if (m598f == null) {
            m605a("getEntrySize: File not found: " + str);
            return -1L;
        }
        return m598f.getSize();
    }

    /* renamed from: i */
    public C1133j m595i(String str) {
        ZipEntry m598f = m598f(str);
        if (m598f == null) {
            m598f = m598f(m597g(str));
        }
        if (m598f == null) {
            return null;
        }
        try {
            try {
                return new C1133j(this.f7061c.getInputStream(m598f), this.f7060b + "/" + str);
            } catch (FileNotFoundException e) {
                e.printStackTrace();
                return null;
            }
        } catch (IOException e2) {
            e2.printStackTrace();
            return null;
        }
    }
}