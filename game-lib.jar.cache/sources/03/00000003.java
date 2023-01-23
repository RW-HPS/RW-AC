package a.a.a;

/* loaded from: game-lib.jar:a/a/a/c.class */
public class c extends a {

    /* renamed from: a  reason: collision with root package name */
    private int[] f5a;

    /* JADX INFO: Access modifiers changed from: protected */
    public c() {
    }

    public c(int i, int i2, int[] iArr) {
        a(32, i, 6 + iArr.length);
        a(i2);
        this.f5a = iArr;
    }

    @Override // a.a.a.a, a.a.a.h
    public String a() {
        return "EAK";
    }

    public int[] c() {
        return this.f5a;
    }

    @Override // a.a.a.h
    public byte[] d() {
        byte[] d = super.d();
        for (int i = 0; i < this.f5a.length; i++) {
            d[4 + i] = (byte) (this.f5a[i] & 255);
        }
        return d;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // a.a.a.h
    public void a(byte[] bArr, int i, int i2) {
        super.a(bArr, i, i2);
        this.f5a = new int[i2 - 6];
        for (int i3 = 0; i3 < this.f5a.length; i3++) {
            this.f5a[i3] = bArr[i + 4 + i3] & 255;
        }
    }
}