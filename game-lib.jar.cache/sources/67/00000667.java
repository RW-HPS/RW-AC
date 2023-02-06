package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c.class */
public class c extends Thread {
    final /* synthetic */ RWAppGameContainer a;

    public c(RWAppGameContainer rWAppGameContainer) {
        this.a = rWAppGameContainer;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        while (true) {
            try {
                Thread.sleep(1L);
            } catch (InterruptedException e) {
            }
            Display.processMessages();
        }
    }
}