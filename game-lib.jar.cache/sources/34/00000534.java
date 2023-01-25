package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.LinkedBlockingDeque;

/* renamed from: com.corrodinggames.rts.gameFramework.j.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/i.class */
public class RFSInStream extends InputStream {

    /* renamed from: a */
    LinkedBlockingDeque f6070a = new LinkedBlockingDeque();

    /* renamed from: b */
    boolean f6071b = true;

    /* renamed from: c */
    byte[] f6072c = new byte[1];

    /* renamed from: d */
    final /* synthetic */ RelayForwardedSocket f6073d;

    public RFSInStream(RelayForwardedSocket relayForwardedSocket) {
        this.f6073d = relayForwardedSocket;
    }

    /* renamed from: a */
    public void m1321a(byte[] bArr) {
        this.f6070a.add(ByteBuffer.wrap(bArr));
    }

    @Override // java.io.InputStream
    public int read() {
        do {
        } while (read(this.f6072c, 0, 1) <= 0);
        return this.f6072c[0] & 255;
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr) {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public int read(byte[] bArr, int i, int i2) {
        int i3;
        if (this.f6073d.f6067c) {
            throw new IOException("closed");
        }
        int i4 = 0;
        int i5 = i2;
        int i6 = i;
        while (!this.f6073d.f6067c) {
            try {
                ByteBuffer byteBuffer = (ByteBuffer) this.f6070a.take();
                if (byteBuffer != null) {
                    if (this.f6071b) {
                        this.f6071b = false;
                        GameEngine.m5460e("First packet from forwarded:" + this.f6073d.f6066b);
                    }
                    if (byteBuffer.remaining() <= i5) {
                        i3 = byteBuffer.remaining();
                        byteBuffer.get(bArr, i6, i3);
                    } else {
                        i3 = i5;
                        byteBuffer.get(bArr, i6, i5);
                        this.f6070a.addFirst(byteBuffer);
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