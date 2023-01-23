package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;
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

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ah.class */
public class ah {

    /* renamed from: a  reason: collision with root package name */
    String f674a = VariableScope.nullOrMissingString;
    String b;
    ZipFile c;
    String[] d;
    boolean e;

    public ah(String str, String str2) {
        this.b = str;
        GameEngine.g("Opening new zip at: " + str2);
        af b = ae.b(str2);
        if (b != null) {
            GameEngine.m328e("Temp file needed for zip with SAF interface");
            if (!GameEngine.at()) {
                throw new IOException("Failed to open source zip with mapper: " + str2);
            }
            long a2 = br.a();
            j b2 = b.b(str2, true);
            if (b2 == null) {
                throw new IOException("Failed to open file of zip: " + str2);
            }
            this.c = a(b2, (Charset) null);
            GameEngine.m328e("Streamed zip open took:" + br.a(br.a(a2)));
        } else {
            this.c = new ZipFile(str2);
        }
        try {
            b();
        } catch (IllegalArgumentException e) {
            ag.h("Failed to open source zip with unicode encoding, attempting with ISO-8859-1");
            Charset forName = Charset.forName("ISO-8859-1");
            try {
                if (b != null) {
                    GameEngine.m328e("Temp file needed for zip with SAF interface");
                    if (!GameEngine.at()) {
                        throw new IOException("Failed to open source zip with mapper: " + str2);
                    }
                    long a3 = br.a();
                    this.c = a(b.b(str2, true), forName);
                    GameEngine.m328e("Streamed zip open took:" + br.a(br.a(a3)));
                } else {
                    this.c = a(str2, forName);
                }
                b();
            } catch (RuntimeException e2) {
                e.printStackTrace();
                throw new IOException("Failed to open source zip with unicode and ISO-8859-1 encoding", e2);
            }
        }
    }

    public void a() {
        if (!this.e) {
            this.e = true;
            if (this.c != null) {
                try {
                    this.c.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static ZipFile a(InputStream inputStream, Charset charset) {
        File a2 = com.corrodinggames.rts.gameFramework.e.a.a(com.corrodinggames.rts.appFramework.c.a(), "safMod", "zip");
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(a2);
            com.corrodinggames.rts.gameFramework.f.a(inputStream, fileOutputStream);
            fileOutputStream.close();
            inputStream.close();
            if (charset == null) {
                ZipFile zipFile = new ZipFile(a2);
                a2.delete();
                return zipFile;
            }
            ZipFile a3 = a(a2.getAbsolutePath(), charset);
            a2.delete();
            return a3;
        } catch (Throwable th) {
            a2.delete();
            throw th;
        }
    }

    public static ZipFile a(String str, Charset charset) {
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

    public void b() {
        double a2;
        long a3 = br.a();
        ArrayList arrayList = new ArrayList();
        Enumeration<? extends ZipEntry> entries = this.c.entries();
        while (entries.hasMoreElements()) {
            String name = entries.nextElement().getName();
            if (name == null) {
                throw new RuntimeException("filePath==null");
            }
            arrayList.add(name);
        }
        this.d = (String[]) arrayList.toArray(new String[0]);
        this.f674a = VariableScope.nullOrMissingString;
        String[] e = e(VariableScope.nullOrMissingString);
        if (e.length == 1 && d(e[0])) {
            this.f674a = e[0] + "/";
            for (int i = 0; i < this.d.length; i++) {
                if (this.d[i].startsWith(this.f674a)) {
                    this.d[i] = this.d[i].substring(this.f674a.length());
                }
            }
        }
        if (br.a(a3) > 3.0d) {
            GameEngine.m328e("zip: buildCache for: " + this.b + ", took:" + br.a(a2));
        }
    }

    public void a(String str) {
        GameEngine.m328e("Zip: " + str);
    }

    public boolean b(String str) {
        for (String str2 : this.d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean c(String str) {
        for (String str2 : this.d) {
            if (str2.equals(str)) {
                return true;
            }
        }
        for (String str3 : this.d) {
            if (str3.equalsIgnoreCase(str)) {
                return true;
            }
        }
        return false;
    }

    public boolean d(String str) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        if (str.equals("/")) {
            return true;
        }
        for (String str2 : this.d) {
            if (str2.contains(str)) {
                return true;
            }
        }
        return false;
    }

    public String[] e(String str) {
        String[] strArr;
        if (str.equals(VariableScope.nullOrMissingString) || str.equals("/") || str.equals("\\")) {
            str = VariableScope.nullOrMissingString;
        } else if (!str.endsWith("/")) {
            str = str + "/";
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : this.d) {
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

    public ZipEntry f(String str) {
        ZipEntry nextElement;
        String str2 = this.f674a + str;
        ZipEntry zipEntry = null;
        IllegalArgumentException illegalArgumentException = null;
        try {
            zipEntry = this.c.getEntry(str2);
        } catch (IllegalArgumentException e) {
            illegalArgumentException = e;
        }
        if (zipEntry == null && b(str) && !d(str)) {
            Enumeration<? extends ZipEntry> entries = this.c.entries();
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
            a("getEntry: Still did not find file after workaround");
        }
        if (illegalArgumentException != null) {
            throw new RuntimeException("Failed to decode data in zip: " + str + " (Check zip encoding, utf-8 is recommended)", illegalArgumentException);
        }
        return zipEntry;
    }

    public String g(String str) {
        String[] strArr;
        String[] strArr2;
        String[] strArr3;
        String[] strArr4;
        String str2 = str;
        if (!str2.endsWith("/")) {
            str2 = str2 + "/";
        }
        for (String str3 : this.d) {
            if (str3.equals(str)) {
                return str3;
            }
        }
        for (String str4 : this.d) {
            if (str4.equals(str2)) {
                return str4;
            }
        }
        for (String str5 : this.d) {
            if (str5.equalsIgnoreCase(str)) {
                return str5;
            }
        }
        for (String str6 : this.d) {
            if (str6.equalsIgnoreCase(str2)) {
                return str6;
            }
        }
        return str;
    }

    public long h(String str) {
        ZipEntry f = f(str);
        if (f == null) {
            a("getEntrySize: File not found: " + str);
            return -1L;
        }
        return f.getSize();
    }

    public j i(String str) {
        ZipEntry f = f(str);
        if (f == null) {
            f = f(g(str));
        }
        if (f == null) {
            return null;
        }
        try {
            try {
                return new j(this.c.getInputStream(f), this.b + "/" + str);
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