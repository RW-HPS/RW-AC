package a.a.a;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import java.io.IOException;

/* loaded from: game-lib.jar:a/a/a/h.class */
public abstract class h {

    /* renamed from: a  reason: collision with root package name */
    private int f7a;
    private int b;
    private int c;
    private int e = 0;
    private int d = -1;

    public abstract String a();

    public int m() {
        return this.c;
    }

    public int b() {
        return this.b;
    }

    public void a(int i) {
        this.f7a |= 64;
        this.d = i;
    }

    public int n() {
        if ((this.f7a & 64) == 64) {
            return this.d;
        }
        return -1;
    }

    public int o() {
        return this.e;
    }

    public void b(int i) {
        this.e = i;
    }

    public byte[] d() {
        byte[] bArr = new byte[b()];
        bArr[0] = (byte) (this.f7a & 255);
        bArr[1] = (byte) (this.b & 255);
        bArr[2] = (byte) (this.c & 255);
        bArr[3] = (byte) (this.d & 255);
        return bArr;
    }

    public String toString() {
        return a() + " [ SEQ = " + m() + ", ACK = " + (n() >= 0 ? VariableScope.nullOrMissingString + n() : "N/A") + ", LEN = " + b() + " ]";
    }

    public static h b(byte[] bArr, int i, int i2) {
        h hVar = null;
        if (i2 < 6) {
            throw new IOException("Invalid segment:" + i2);
        }
        byte b = bArr[i];
        if ((b & Byte.MIN_VALUE) != 0) {
            hVar = new g();
        } else if ((b & 8) != 0) {
            hVar = new e();
        } else if ((b & 32) != 0) {
            hVar = new c();
        } else if ((b & 16) != 0) {
            hVar = new f();
        } else if ((b & 2) != 0) {
            hVar = new d();
        } else if ((b & 64) != 0) {
            if (i2 == 6) {
                hVar = new a();
            } else {
                hVar = new b();
            }
        }
        if (hVar == null) {
            throw new IOException("Invalid segment");
        }
        hVar.a(bArr, i, i2);
        return hVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(int i, int i2, int i3) {
        this.f7a = i;
        this.c = i2;
        this.b = i3;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void a(byte[] bArr, int i, int i2) {
        this.f7a = bArr[i] & 255;
        this.b = bArr[i + 1] & 255;
        this.c = bArr[i + 2] & 255;
        this.d = bArr[i + 3] & 255;
    }
}