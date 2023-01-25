package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

/* renamed from: com.corrodinggames.rts.java.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c.class */
public class C1189c extends Thread {

    /* renamed from: a */
    final /* synthetic */ RWAppGameContainer f7302a;

    public C1189c(RWAppGameContainer rWAppGameContainer) {
        this.f7302a = rWAppGameContainer;
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