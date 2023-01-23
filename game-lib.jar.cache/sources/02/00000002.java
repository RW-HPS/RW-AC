package a.a.a;

/* loaded from: game-lib.jar:a/a/a/b.class */
public class b extends h {

    /* renamed from: a  reason: collision with root package name */
    private byte[] f4a;

    /* JADX INFO: Access modifiers changed from: protected */
    public b() {
    }

    public b(int i, int i2, byte[] bArr, int i3, int i4) {
        a(64, i, 6);
        a(i2);
        this.f4a = new byte[i4];
        System.arraycopy(bArr, i3, this.f4a, 0, i4);
    }

    @Override // a.a.a.h
    public int b() {
        return this.f4a.length + super.b();
    }

    @Override // a.a.a.h
    public String a() {
        return "DAT";
    }

    public byte[] c() {
        return this.f4a;
    }

    @Override // a.a.a.h
    public byte[] d() {
        byte[] d = super.d();
        System.arraycopy(this.f4a, 0, d, 6, this.f4a.length);
        return d;
    }

    @Override // a.a.a.h
    public void a(byte[] bArr, int i, int i2) {
        super.a(bArr, i, i2);
        this.f4a = new byte[i2 - 6];
        System.arraycopy(bArr, i + 6, this.f4a, 0, this.f4a.length);
    }
}