package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/j.class */
public class RFSOutStream extends OutputStream {

    /* renamed from: a */
    boolean f6074a = true;

    /* renamed from: b */
    final /* synthetic */ RelayForwardedSocket f6075b;

    public RFSOutStream(RelayForwardedSocket relayForwardedSocket) {
        this.f6075b = relayForwardedSocket;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        GameEngine.m990g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f6075b.f6067c) {
            GameEngine.m5460e("cannot write steam socket closed");
        } else {
            GameEngine.m5460e("Forwarded message to client: " + this.f6075b.f6066b + " with old method");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}