package com.corrodinggames.rts.java.steam;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.java.c.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/l.class */
public class SteamSocketInStream extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f7354a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f7355b = true;

    /* renamed from: c */
    byte[] f7356c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ SteamSocket f7357d;

    public SteamSocketInStream(SteamSocket steamSocket) {
        this.f7357d = steamSocket;
    }

    /* renamed from: a */
    public void m257a(byte[] bArr) {
        this.f7354a.add(ByteBuffer.wrap(bArr));
    }

    @Override // java.io.InputStream
    public int read() {
        do {
        } while (read(this.f7356c, 0, 1) <= 0);
        return this.f7356c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f7357d.f7350b) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f7357d.f7350b) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f7354a.take();
                if (byteBuffer != null) {
                    if (this.f7355b) {
                        this.f7355b = false;
                        GameEngine.m5460e("First packet from:" + this.f7357d.f7353e);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f7354a.addFirst(byteBuffer);
                    }
                    i4 += i3;
                    i5 -= i3;
                    i6 += i3;
                    if (i5 < 0) {
                        throw new IOException("bytesNeeded<0:" + i5);
                    }
                    if (i5 == 0) {
                        return i4;
                    }
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
                return i4;
            }
        }
        throw new IOException("Closed");
    }
}