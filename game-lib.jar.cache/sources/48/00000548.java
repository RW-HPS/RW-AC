package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k.class */
class AutoUpdateModLastModified extends Thread {
    boolean a = true;

    AutoUpdateModLastModified() {
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (this.a) {
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
            }
            FileChangeEngine.writeLastModified();
        }
    }
}