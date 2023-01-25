package com.corrodinggames.rts.gameFramework.net;

import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.InputStream;
import java.util.zip.GZIPInputStream;

/* renamed from: com.corrodinggames.rts.gameFramework.j.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/l.class */
public class C0913l {

    /* renamed from: a */
    public String f6083a;

    /* renamed from: b */
    public ByteArrayInputStream f6084b;

    /* renamed from: c */
    public DataInputStream f6085c;

    public C0913l(byte[] bArr, boolean z, boolean z2) {
        InputStream inputStream;
        this.f6084b = new ByteArrayInputStream(bArr);
        if (z) {
            inputStream = new BufferedInputStream(new GZIPInputStream(this.f6084b));
        } else {
            inputStream = this.f6084b;
        }
        this.f6085c = new DataInputStream(inputStream);
    }
}