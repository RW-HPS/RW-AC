package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamException;
import com.codedisaster.steamworks.SteamNetworking;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;

/* renamed from: com.corrodinggames.rts.java.c.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/m.class */
public class SteamSocketOutStream extends OutputStream {

    /* renamed from: a */
    boolean f7358a = true;

    /* renamed from: b */
    final /* synthetic */ SteamSocket f7359b;

    public SteamSocketOutStream(SteamSocket steamSocket) {
        this.f7359b = steamSocket;
    }

    @Override // java.io.OutputStream
    public void write(int i) {
        GameEngine.m990g("SteamSocketOutputStream: Slow write: " + i);
        write(new byte[]{(byte) i});
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr, int i, int i2) {
        if (this.f7359b.f7350b) {
            GameEngine.m5460e("cannot write steam socket closed");
        } else if (i2 > 307200) {
            GameEngine.m5460e("Steam spliting large packet to:" + this.f7359b.f7353e + " len:" + i2);
            int i3 = i2;
            do {
                int i4 = i3;
                if (i4 > 256000) {
                    i4 = 256000;
                }
                write(bArr, i, i4);
                i += i4;
                i3 -= i4;
            } while (i3 > 0);
        } else {
            ByteBuffer allocateDirect = ByteBuffer.allocateDirect(i2);
            allocateDirect.put(bArr, i, i2);
            allocateDirect.flip();
            synchronized (this.f7359b.f7349a) {
                try {
                    if (this.f7358a) {
                        this.f7358a = false;
                        GameEngine.m5460e("First packet to:" + this.f7359b.f7353e);
                    }
                    if (!this.f7359b.f7349a.f7316h.sendP2PPacket(this.f7359b.f7353e, allocateDirect, SteamNetworking.P2PSend.Reliable, 0)) {
                        GameEngine.m5460e("steam sendP2PPacket failed (size: " + i2 + " to:" + this.f7359b.f7353e + ")");
                    }
                } catch (SteamException e) {
                    throw new IOException(e);
                }
            }
        }
    }

    @Override // java.io.OutputStream
    public void write(byte[] bArr) {
        write(bArr, 0, bArr.length);
    }
}