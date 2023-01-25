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
    public GZIPOutputStream f5949a;

    /* renamed from: b */
    public BufferedOutputStream f5950b;

    /* renamed from: c */
    public String f5951c;

    /* renamed from: e */
    public DataOutputStream f5952e;

    /* renamed from: f */
    public boolean f5953f = false;

    /* renamed from: d */
    public ByteArrayOutputStream f5954d = new ByteArrayOutputStream();

    /* renamed from: a */
    public void m1393a() {
        this.f5952e.flush();
        if (this.f5950b != null) {
            this.f5950b.flush();
        }
        if (this.f5949a != null) {
            this.f5949a.finish();
        }
    }

    /* renamed from: b */
    public void m1392b() {
        if (!this.f5953f) {
            this.f5952e.close();
        } else {
            GameEngine.m990g("TODO: Cannot yet close wrapped stream");
        }
    }

    public GzipDataOutStream(boolean z) {
        OutputStream outputStream;
        if (z) {
            this.f5949a = new GZIPOutputStream(this.f5954d);
            this.f5950b = new BufferedOutputStream(this.f5949a);
            outputStream = this.f5950b;
        } else {
            outputStream = this.f5954d;
        }
        this.f5952e = new DataOutputStream(outputStream);
    }
}