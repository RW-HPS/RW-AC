package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.utility.w;
import java.io.BufferedOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.j.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/e.class */
public final class SendSocketOutStream implements Runnable {
    OutputStream b;
    BufferedOutputStream c;
    DataOutputStream d;
    final /* synthetic */ PlayerConnect f;

    /* renamed from: a */
    Boolean f579a = true;
    w e = new w();

    public synchronized void a(Packet packet) {
        if (this.f.f577a) {
            return;
        }
        this.f.f.add(packet);
        notifyAll();
    }

    public synchronized void a() {
        notifyAll();
    }

    public synchronized void b() {
        try {
            if (this.f.f.isEmpty() && !this.f.f577a && !this.f.b) {
                wait(10000L);
            }
        } catch (InterruptedException e) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public SendSocketOutStream(PlayerConnect playerConnect) {
        this.f = playerConnect;
        this.b = playerConnect.d.getOutputStream();
        this.c = new BufferedOutputStream(this.b);
        this.d = new DataOutputStream(this.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:44:0x01e7, code lost:
        r6.f.f577a = true;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void run() {
        /*
            Method dump skipped, instructions count: 532
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.net.SendSocketOutStream.run():void");
    }
}