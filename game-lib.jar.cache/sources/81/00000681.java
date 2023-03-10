package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.awt.Toolkit;
import org.lwjgl.Sys;
import org.lwjgl.opengl.Display;
import org.lwjgl.opengl.DisplayMode;
import org.lwjgl.opengl.GL11;
import org.newdawn.slick.SlickException;

/* renamed from: com.corrodinggames.rts.java.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/j.class */
class StartLwjgl implements Runnable {
    final /* synthetic */ Main a;

    StartLwjgl(Main main) {
        this.a = main;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        try {
            this.a.k.start();
        } catch (SlickException e) {
            if (!"Failed to initialise the LWJGL display".equals(e.getMessage())) {
                throw new RuntimeException((Throwable) e);
            }
            GameEngine.a("Error starting display", (Throwable) e);
            String str = "\nFailed to get opengl version";
            try {
                System.setProperty("org.lwjgl.opengl.Display.allowSoftwareOpenGL", "true");
                Display.setDisplayMode(new DisplayMode(100, 100));
                Display.create();
                String glGetString = GL11.glGetString(7938);
                Display.destroy();
                GameEngine.m5e("OpenGL version: " + glGetString);
                str = "\nOpenGL version detected: " + glGetString;
                if (glGetString.startsWith("1.0") || glGetString.startsWith("1.1")) {
                    str = str + "\n---\nOpenGL 1.1 is over 20 years old you might be using a fallback microsoft driver. Try updating your graphics drivers from the manufacturer.";
                }
            } catch (Exception e2) {
                GameEngine.a("Failed to get opengl info", (Throwable) e2);
            }
            Toolkit.getDefaultToolkit();
            Sys.alert("Error", "Failed to create display." + str);
            System.exit(1);
        }
        GameEngine.m5e("Game stopped running shutting down");
        GameEngine.getGameEngine().ca.b("lastgame", false);
        this.a.a(true);
    }
}