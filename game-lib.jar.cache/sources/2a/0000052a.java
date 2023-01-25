package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ax */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ax.class */
public class C0900ax {

    /* renamed from: a */
    public BufferedOutputStream f5967a;

    /* renamed from: b */
    public String f5968b;

    /* renamed from: d */
    public PrintStream f5969d;

    /* renamed from: e */
    public boolean f5970e = false;

    /* renamed from: c */
    public ByteArrayOutputStream f5971c = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1364a() {
        this.f5969d.flush();
        if (this.f5967a != null) {
            this.f5967a.flush();
        }
    }

    /* renamed from: b */
    public void m1363b() {
        if (!this.f5970e) {
            this.f5969d.close();
        } else {
            GameEngine.m990g("TODO: Cannot yet close wrapped stream");
        }
    }

    public C0900ax(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5967a = new BufferedOutputStream(this.f5971c);
            outputStream = this.f5967a;
        } else {
            outputStream = this.f5971c;
        }
        this.f5969d = new PrintStream(outputStream);
    }
}