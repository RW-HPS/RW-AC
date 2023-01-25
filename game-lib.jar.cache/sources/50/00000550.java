package com.corrodinggames.rts.gameFramework.p043k;

/* renamed from: com.corrodinggames.rts.gameFramework.k.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/g.class */
public class C0938g {

    /* renamed from: a */
    int f6162a;

    /* renamed from: b */
    int f6163b;

    /* renamed from: c */
    int f6164c;

    /* renamed from: d */
    int f6165d;

    /* renamed from: e */
    byte[] f6166e;

    /* renamed from: f */
    byte[] f6167f;

    public C0938g(int i, int i2) {
        this.f6162a = i;
        this.f6163b = i2;
        this.f6166e = new byte[i * i2];
        this.f6167f = new byte[i * i2];
    }

    /* renamed from: a */
    public final byte m1224a(int i, int i2) {
        return this.f6166e[(i * this.f6163b) + i2];
    }

    /* renamed from: a */
    public final byte m1223a(C0947p c0947p) {
        return this.f6166e[(c0947p.f6289a * this.f6163b) + c0947p.f6290b];
    }

    /* renamed from: b */
    public boolean m1220b(C0947p c0947p) {
        return m1223a(c0947p) <= 0;
    }

    /* renamed from: a */
    public void m1222a(C0947p c0947p, byte b) {
        this.f6166e[(c0947p.f6289a * this.f6163b) + c0947p.f6290b] = b;
    }

    /* renamed from: a */
    public void m1221a(C0947p c0947p, boolean z) {
        this.f6167f[(c0947p.f6289a * this.f6163b) + c0947p.f6290b] = (byte) (z ? 1 : 0);
    }

    /* renamed from: c */
    public boolean m1219c(C0947p c0947p) {
        return this.f6167f[(c0947p.f6289a * this.f6163b) + c0947p.f6290b] == 1;
    }
}