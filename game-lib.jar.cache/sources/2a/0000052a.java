package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ax */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ax.class */
public class ax {

    /* renamed from: a  reason: collision with root package name */
    public BufferedOutputStream f575a;
    public String b;
    public PrintStream d;
    public boolean e = false;
    public ByteArrayOutputStream c = new ByteArrayOutputStream();

    public void a() {
        this.d.flush();
        if (this.f575a != null) {
            this.f575a.flush();
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
            this.f575a = new BufferedOutputStream(this.c);
            outputStream = this.f575a;
        } else {
            outputStream = this.c;
        }
        this.d = new PrintStream(outputStream);
    }
}