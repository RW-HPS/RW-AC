package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.OutputStream;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/at.class */
public class GzipDataOutStream {

    /* renamed from: a */
    public GZIPOutputStream f572a;
    public BufferedOutputStream b;
    public String c;
    public DataOutputStream e;
    public boolean f = false;
    public ByteArrayOutputStream d = new ByteArrayOutputStream();

    public void a() {
        this.e.flush();
        if (this.b != null) {
            this.b.flush();
        }
        if (this.f572a != null) {
            this.f572a.finish();
        }
    }

    public void b() {
        if (!this.f) {
            this.e.close();
        } else {
            GameEngine.g("TODO: Cannot yet close wrapped stream");
        }
    }

    public GzipDataOutStream(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f572a = new GZIPOutputStream(this.d);
            this.b = new BufferedOutputStream(this.f572a);
            outputStream = this.b;
        } else {
            outputStream = this.d;
        }
        this.e = new DataOutputStream(outputStream);
    }
}