package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.am;
import org.lwjgl.opengl.Display;
import org.newdawn.slick.AppGameContainer;
import org.newdawn.slick.Game;
import org.newdawn.slick.Graphics;
import org.newdawn.slick.Music;

/* renamed from: com.corrodinggames.rts.java.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/b.class */
public class RWAppGameContainer extends AppGameContainer {
    boolean a;
    Object b;
    c c;

    public RWAppGameContainer(Game game, int i, int i2, boolean z) {
        super(game, i, i2, z);
        this.a = false;
        this.b = new Object();
    }

    public Graphics a() {
        Graphics graphics = getGraphics();
        this.input.poll(this.width, this.height);
        Music.poll(1);
        if (am.a != null) {
            am.a.a(1);
        }
        GL.glClear(16640);
        GL.glLoadIdentity();
        graphics.resetTransform();
        graphics.resetFont();
        graphics.resetLineWidth();
        graphics.setAntiAlias(false);
        return graphics;
    }

    public void a(Graphics graphics) {
        graphics.resetTransform();
        GL.flush();
        Display.update();
    }

    protected void gameLoop() {
        int delta = getDelta();
        if (!Display.isVisible() && this.updateOnlyOnVisible) {
            try {
                Thread.sleep(100L);
            } catch (Exception e) {
            }
        } else {
            updateAndRender(delta);
        }
        updateFPS();
        Display.update(false);
        if (!this.a) {
            Display.processMessages();
        } else if (this.c == null) {
            this.c = new c(this);
            this.c.start();
        }
        if (Display.isCloseRequested() && this.game.closeRequested()) {
            this.running = false;
        }
    }

    protected void updateAndRender(int i) {
        if (this.smoothDeltas && getFPS() != 0) {
            i = 1000 / getFPS();
        }
        this.input.poll(this.width, this.height);
        Music.poll(i);
        if (am.a != null) {
            am.a.a(i);
        }
        if (!this.paused) {
            this.storedDelta += i;
            if (this.storedDelta >= this.minimumLogicInterval) {
                if (this.maximumLogicInterval != 0) {
                    long j = this.storedDelta / this.maximumLogicInterval;
                    for (int i2 = 0; i2 < j; i2++) {
                        this.game.update(this, (int) this.maximumLogicInterval);
                    }
                    int i3 = (int) (this.storedDelta % this.maximumLogicInterval);
                    if (i3 > this.minimumLogicInterval) {
                        this.game.update(this, (int) (i3 % this.maximumLogicInterval));
                        this.storedDelta = 0L;
                    } else {
                        this.storedDelta = i3;
                    }
                } else {
                    this.game.update(this, (int) this.storedDelta);
                    this.storedDelta = 0L;
                }
            }
        } else {
            this.game.update(this, 0);
        }
        if (hasFocus() || getAlwaysRender()) {
            if (this.clearEachFrame) {
                GL.glClear(16640);
            }
            GL.glLoadIdentity();
            Graphics graphics = getGraphics();
            graphics.resetTransform();
            graphics.resetFont();
            graphics.resetLineWidth();
            graphics.setAntiAlias(false);
            this.game.render(this, graphics);
            graphics.resetTransform();
            if (isShowingFPS()) {
                getDefaultFont().drawString(10.0f, 10.0f, "FPS: " + this.recordedFPS);
            }
            GL.flush();
        }
        if (this.targetFPS != -1) {
            Display.sync(this.targetFPS);
        }
    }

    public void destroy() {
        try {
            Display.destroy();
        } catch (Exception e) {
            GameEngine.a("Error on Display.destroy in destroy", (Throwable) e);
        }
    }
}