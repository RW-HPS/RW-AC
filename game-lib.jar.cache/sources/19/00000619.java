package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.io.FileDescriptor;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/j.class */
public class j extends InputStream {

    /* renamed from: a  reason: collision with root package name */
    InputStream f686a;
    String b;
    String c;
    boolean d;
    String e;

    public boolean a() {
        if (this.f686a instanceof FileInputStream) {
            return true;
        }
        if (!GameEngine.av() && this.c != null) {
            return true;
        }
        return false;
    }

    public FileDescriptor b() {
        if (this.f686a instanceof FileInputStream) {
            return ((FileInputStream) this.f686a).getFD();
        }
        if (!GameEngine.av() && this.c != null) {
            return com.corrodinggames.rts.appFramework.c.a().d().b(this.c).getFileDescriptor();
        }
        throw new RuntimeException("AssetInputStream: unexpected stream for: " + this.b);
    }

    private j() {
    }

    public j(InputStream inputStream, String str, String str2) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f686a = inputStream;
        this.b = str;
        this.c = str2;
        this.e = GameEngine.U();
    }

    public j(FileInputStream fileInputStream, String str) {
        if (fileInputStream == null) {
            throw new FileNotFoundException();
        }
        this.f686a = fileInputStream;
        this.b = str;
        this.e = GameEngine.U();
    }

    public j(InputStream inputStream, String str) {
        if (inputStream == null) {
            throw new FileNotFoundException();
        }
        this.f686a = inputStream;
        this.b = str;
        this.e = GameEngine.U();
    }

    public long c() {
        if (!GameEngine.av()) {
            return -1L;
        }
        if (this.b == null) {
            return -2L;
        }
        return new File(this.b).lastModified();
    }

    public String d() {
        return this.b;
    }

    @Override // java.io.InputStream
    public int available() {
        return this.f686a.available();
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        this.d = true;
        this.f686a.close();
    }

    protected void finalize() {
        if (!this.d) {
            GameEngine.print("AssetInputStream was finalized with being closed");
            GameEngine.print(this.e);
        }
    }

    public boolean equals(Object obj) {
        return this.f686a.equals(obj);
    }

    public int hashCode() {
        return this.f686a.hashCode();
    }

    @Override // java.io.InputStream
    public void mark(int i) {
        this.f686a.mark(i);
    }

    @Override // java.io.InputStream
    public boolean markSupported() {
        return this.f686a.markSupported();
    }

    @Override // java.io.InputStream
    public int read() {
        return this.f686a.read();
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        return this.f686a.read(bArr, i, i2);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return this.f686a.read(bArr);
    }

    @Override // java.io.InputStream
    public void reset() {
        this.f686a.reset();
    }

    @Override // java.io.InputStream
    public long skip(long j) {
        return this.f686a.skip(j);
    }

    public String toString() {
        return this.f686a.toString();
    }
}