package android.util;

/* loaded from: game-lib.jar:android/util/SparseArray.class */
public class SparseArray implements Cloneable {

    /* renamed from: a  reason: collision with root package name */
    private static final Object f61a = new Object();
    private boolean b;
    private int[] c;
    private Object[] d;
    private int e;

    public SparseArray() {
        this(10);
    }

    public SparseArray(int i) {
        this.b = false;
        if (i == 0) {
            this.c = a.b;
            this.d = a.d;
        } else {
            int c = com.a.a.a.a.c(i);
            this.c = new int[c];
            this.d = new Object[c];
        }
        this.e = 0;
    }

    /* renamed from: a */
    public SparseArray clone() {
        SparseArray sparseArray = null;
        try {
            sparseArray = (SparseArray) super.clone();
            sparseArray.c = (int[]) this.c.clone();
            sparseArray.d = (Object[]) this.d.clone();
        } catch (CloneNotSupportedException e) {
        }
        return sparseArray;
    }

    public Object a(int i) {
        return a(i, null);
    }

    public Object a(int i, Object obj) {
        int a2 = a.a(this.c, this.e, i);
        if (a2 < 0 || this.d[a2] == f61a) {
            return obj;
        }
        return this.d[a2];
    }

    private void c() {
        int i = this.e;
        int i2 = 0;
        int[] iArr = this.c;
        Object[] objArr = this.d;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f61a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.b = false;
        this.e = i2;
    }

    public void b(int i, Object obj) {
        int a2 = a.a(this.c, this.e, i);
        if (a2 >= 0) {
            this.d[a2] = obj;
            return;
        }
        int i2 = a2 ^ (-1);
        if (i2 < this.e && this.d[i2] == f61a) {
            this.c[i2] = i;
            this.d[i2] = obj;
            return;
        }
        if (this.b && this.e >= this.c.length) {
            c();
            i2 = a.a(this.c, this.e, i) ^ (-1);
        }
        if (this.e >= this.c.length) {
            int c = com.a.a.a.a.c(this.e + 1);
            int[] iArr = new int[c];
            Object[] objArr = new Object[c];
            System.arraycopy(this.c, 0, iArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = iArr;
            this.d = objArr;
        }
        if (this.e - i2 != 0) {
            System.arraycopy(this.c, i2, this.c, i2 + 1, this.e - i2);
            System.arraycopy(this.d, i2, this.d, i2 + 1, this.e - i2);
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e++;
    }

    public int b() {
        if (this.b) {
            c();
        }
        return this.e;
    }

    public int b(int i) {
        if (this.b) {
            c();
        }
        return this.c[i];
    }

    public Object c(int i) {
        if (this.b) {
            c();
        }
        return this.d[i];
    }

    public void c(int i, Object obj) {
        if (this.e != 0 && i <= this.c[this.e - 1]) {
            b(i, obj);
            return;
        }
        if (this.b && this.e >= this.c.length) {
            c();
        }
        int i2 = this.e;
        if (i2 >= this.c.length) {
            int c = com.a.a.a.a.c(i2 + 1);
            int[] iArr = new int[c];
            Object[] objArr = new Object[c];
            System.arraycopy(this.c, 0, iArr, 0, this.c.length);
            System.arraycopy(this.d, 0, objArr, 0, this.d.length);
            this.c = iArr;
            this.d = objArr;
        }
        this.c[i2] = i;
        this.d[i2] = obj;
        this.e = i2 + 1;
    }

    public String toString() {
        if (b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.e * 28);
        sb.append('{');
        for (int i = 0; i < this.e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(b(i));
            sb.append('=');
            Object c = c(i);
            if (c != this) {
                sb.append(c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}