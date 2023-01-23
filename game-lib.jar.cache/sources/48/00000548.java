package com.corrodinggames.rts.gameFramework;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k.class */
public class k extends Thread {

    /* renamed from: a  reason: collision with root package name */
    boolean f598a = true;

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.f598a) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
            FileChangeEngine.b();
        }
    }
}