package com.corrodinggames.rts.gameFramework.net;

import java.net.InetAddress;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.j.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ap.class */
public class ServerAcceptData {

    /* renamed from: a */
    InetAddress f570a;
    int b = 1;
    boolean c;
    boolean d;
    final /* synthetic */ ServerAcceptRunnable e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ServerAcceptData(ServerAcceptRunnable serverAcceptRunnable) {
        this.e = serverAcceptRunnable;
    }
}