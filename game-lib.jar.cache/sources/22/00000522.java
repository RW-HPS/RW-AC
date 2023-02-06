package com.corrodinggames.rts.gameFramework.net;

import java.net.InetAddress;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ap.class */
class ServerAcceptData {
    InetAddress a;
    int b = 1;
    boolean c;
    boolean d;
    final /* synthetic */ ServerAcceptRunnable e;

    ServerAcceptData(ServerAcceptRunnable serverAcceptRunnable) {
        this.e = serverAcceptRunnable;
    }
}