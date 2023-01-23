package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.OutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/j.class */
public class j extends OutputStream {

    /* renamed from: a */
    boolean f584a = true;
    final /* synthetic */ RelayForwardedSocket b;

    public j(RelayForwardedSocket relayForwardedSocket) {
        this.b = relayForwardedSocket;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        GameEngine.g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.b.c) {
            GameEngine.m2e("cannot write steam socket closed");
        } else {
            GameEngine.m2e("Forwarded message to client: " + this.b.b + " with old method");
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}