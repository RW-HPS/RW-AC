package com.corrodinggames.rts.gameFramework.k;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/p.class */
public final class p {

    /* renamed from: a  reason: collision with root package name */
    public short f612a;
    public short b;

    public p() {
    }

    public p(short s, short s2) {
        a(s, s2);
    }

    public final p a(short s, short s2) {
        this.f612a = s;
        this.b = s2;
        return this;
    }

    public final p a(p pVar) {
        this.f612a = pVar.f612a;
        this.b = pVar.b;
        return this;
    }

    public final p a(n nVar) {
        this.f612a = nVar.f610a;
        this.b = nVar.b;
        return this;
    }

    public final int a(o oVar) {
        short s = this.f612a;
        short s2 = this.b;
        if (oVar.b[(s * oVar.h) + s2] == -1 || oVar.c[(s * oVar.h) + s2] == -1 || oVar.d[(s * oVar.h) + s2] == -1) {
            return -1;
        }
        return oVar.b[(s * oVar.h) + s2] + oVar.c[(s * oVar.h) + s2] + (oVar.d[(s * oVar.h) + s2] * 10);
    }

    public final int a(o oVar, byte b) {
        return oVar.l[b][(this.f612a * oVar.h) + this.b];
    }

    public final void a(o oVar, byte b, int i) {
        oVar.l[b][(this.f612a * oVar.h) + this.b] = i;
    }

    public final void a(o oVar, byte b, boolean z) {
        if (z) {
            byte[] bArr = oVar.m[b];
            int i = (this.f612a * oVar.h) + this.b;
            bArr[i] = (byte) (bArr[i] | 16);
            return;
        }
        byte[] bArr2 = oVar.m[b];
        int i2 = (this.f612a * oVar.h) + this.b;
        bArr2[i2] = (byte) (bArr2[i2] & (-17));
    }

    public final boolean b(o oVar, byte b) {
        return oVar.l[b][(this.f612a * oVar.h) + this.b] >= oVar.i && (oVar.m[b][(this.f612a * oVar.h) + this.b] & 16) != 0;
    }

    public final byte c(o oVar, byte b) {
        return (byte) (oVar.m[b][(this.f612a * oVar.h) + this.b] & 7);
    }

    public final boolean d(o oVar, byte b) {
        return (oVar.m[b][(this.f612a * oVar.h) + this.b] & 8) != 0;
    }

    public final void b(o oVar, byte b, boolean z) {
        if (z) {
            byte[] bArr = oVar.m[b];
            int i = (this.f612a * oVar.h) + this.b;
            bArr[i] = (byte) (bArr[i] | 8);
            return;
        }
        byte[] bArr2 = oVar.m[b];
        int i2 = (this.f612a * oVar.h) + this.b;
        bArr2[i2] = (byte) (bArr2[i2] & (-9));
    }

    public final void a(o oVar, byte b, byte b2) {
        byte[] bArr = oVar.m[b];
        int i = (this.f612a * oVar.h) + this.b;
        bArr[i] = (byte) (bArr[i] & (-16));
        byte[] bArr2 = oVar.m[b];
        int i2 = (this.f612a * oVar.h) + this.b;
        bArr2[i2] = (byte) (bArr2[i2] | (b2 & 15));
    }

    public final void a(o oVar, byte b, float f) {
        int i = (int) (((f / 360.0f) * 8.0f) + 0.5f);
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0) {
            i += 8;
        }
        if (i > 7) {
            i -= 8;
        }
        if (i < 0 || i > 7) {
            GameEngine.m328e("setCurrentDirectionFromAngle: dir:" + i + " direction:" + f);
            i = 0;
        }
        a(oVar, b, (byte) i);
    }

    public final boolean e(o oVar, byte b) {
        if (oVar.l[b][(this.f612a * oVar.h) + this.b] >= oVar.i) {
            return true;
        }
        return false;
    }

    public final p f(o oVar, byte b) {
        p pVar = new p();
        if (a(oVar, b, pVar)) {
            return pVar;
        }
        return null;
    }

    public final boolean a(o oVar, byte b, p pVar) {
        if (!e(oVar, b)) {
            pVar.a((short) -1, (short) -1);
            return false;
        }
        byte c = c(oVar, b);
        if (d(oVar, b)) {
            pVar.a((short) -1, (short) -1);
            return false;
        }
        int i = 0;
        int i2 = 0;
        if (c == 0) {
            i = 0 + 1;
        }
        if (c == 1) {
            i++;
            i2 = 0 + 1;
        }
        if (c == 2) {
            i2++;
        }
        if (c == 3) {
            i2++;
            i--;
        }
        if (c == 4) {
            i--;
        }
        if (c == 5) {
            i--;
            i2--;
        }
        if (c == 6) {
            i2--;
        }
        if (c == 7) {
            i2--;
            i++;
        }
        pVar.a((short) (this.f612a - i), (short) (this.b - i2));
        return true;
    }
}