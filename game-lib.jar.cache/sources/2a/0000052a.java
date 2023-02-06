package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ax */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ax.class */
public class ax {
    public BufferedOutputStream a;
    public String b;
    public PrintStream d;
    public boolean e = false;
    public ByteArrayOutputStream c = new ByteArrayOutputStream();

    public void a() {
        this.d.flush();
        if (this.a != null) {
            this.a.flush();
        }
    }

    public void b() {
        if (!this.e) {
            this.d.close();
        } else {
            GameEngine.g("TODO: Cannot yet close wrapped stream");
        }
    }

    public ax(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.a = new BufferedOutputStream(this.c);
            outputStream = this.a;
        } else {
            outputStream = this.c;
        }
        this.d = new PrintStream(outputStream);
    }
}