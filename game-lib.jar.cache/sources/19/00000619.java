package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/j.class */
public class C1133j extends InputStream {

    /* renamed from: a */
    InputStream f7097a;

    /* renamed from: b */
    String f7098b;

    /* renamed from: c */
    String f7099c;

    /* renamed from: d */
    boolean f7100d;

    /* renamed from: e */
    String f7101e;

    /* renamed from: a */
    public boolean m544a() {
        if (this.f7097a instanceof FileInputStream) {
            return true;
        }
        if (!GameEngine.m1028av() && this.f7099c != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public FileDescriptor m543b() {
        if (this.f7097a instanceof FileInputStream) {
            return ((FileInputStream) this.f7097a).getFD();
        }
        if (!GameEngine.m1028av() && this.f7099c != null) {
            return C0090c.m4947a().mo5308d().m5293b(this.f7099c).getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.f7098b);
    }

    private C1133j() {
    }

    public C1133j(InputStream inputStream, String str, String str2) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f7097a = inputStream;
        this.f7098b = str;
        this.f7099c = str2;
        this.f7101e = GameEngine.m1088U();
    }

    public C1133j(FileInputStream fileInputStream, String str) {
        if (fileInputStream == null) {
            throw new FileNotFoundException();
        }
        this.f7097a = fileInputStream;
        this.f7098b = str;
        this.f7101e = GameEngine.m1088U();
    }

    public C1133j(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f7097a = inputStream;
        this.f7098b = str;
        this.f7101e = GameEngine.m1088U();
    }

    /* renamed from: c */
    public long m542c() {
        if (!GameEngine.m1028av()) {
            return -1L;
        }
        if (this.f7098b == null) {
            return -2L;
        }
        return new File(this.f7098b).lastModified();
    }

    /* renamed from: d */
    public String m541d() {
        return this.f7098b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f7097a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.f7100d = true;
        this.f7097a.close();
    }

    protected void finalize() {
        if (!this.f7100d) {
            GameEngine.print("AssetInputStream was finalized with being closed");
            GameEngine.print(this.f7101e);
        }
    }

    public boolean equals(Object obj) {
        return this.f7097a.equals(obj);
    }

    public int hashCode() {
        return this.f7097a.hashCode();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f7097a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f7097a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f7097a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f7097a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f7097a.read(bArr);
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f7097a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f7097a.skip(j);
    }

    public String toString() {
        return this.f7097a.toString();
    }
}