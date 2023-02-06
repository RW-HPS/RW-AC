package com.corrodinggames.rts.gameFramework.net;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/l.class */
public class l {
    public String a;
    public ByteArrayInputStream b;
    public DataInputStream c;

    public l(byte[] bArr, boolean z, boolean z2) {
        InputStream inputStream;
        this.b = new ByteArrayInputStream(bArr);
        if (z) {
            inputStream = new BufferedInputStream(new GZIPInputStream(this.b));
        } else {
            inputStream = this.b;
        }
        this.c = new DataInputStream(inputStream);
    }
}