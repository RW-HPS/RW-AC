package com.corrodinggames.rts.java;

import org.lwjgl.opengl.Display;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c.class */
public class c extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RWAppGameContainer f727a;

    public c(RWAppGameContainer rWAppGameContainer) {
        this.f727a = rWAppGameContainer;
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