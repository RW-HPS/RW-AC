package android.util;

import com.p005a.p006a.p007a.C0042a;

/* loaded from: game-lib.jar:android/util/SparseArray.class */
public class SparseArray implements Cloneable {

    /* renamed from: a */
    private static final Object f303a = new Object();

    /* renamed from: b */
    private boolean f304b;

    /* renamed from: c */
    private int[] f305c;

    /* renamed from: d */
    private Object[] f306d;

    /* renamed from: e */
    private int f307e;

    public SparseArray() {
        this(10);
    }

    public SparseArray(int i) {
        this.f304b = false;
        if (i == 0) {
            this.f305c = C0040a.f309b;
            this.f306d = C0040a.f311d;
        } else {
            int m5047c = C0042a.m5047c(i);
            this.f305c = new int[m5047c];
            this.f306d = new Object[m5047c];
        }
        this.f307e = 0;
    }

    /* renamed from: a */
    public SparseArray clone() {
        SparseArray sparseArray = null;
        try {
            sparseArray = (SparseArray) super.clone();
            sparseArray.f305c = (int[]) this.f305c.clone();
            sparseArray.f306d = (Object[]) this.f306d.clone();
        } catch (CloneNotSupportedException e) {
        }
        return sparseArray;
    }

    /* renamed from: a */
    public Object m5066a(int i) {
        return m5065a(i, null);
    }

    /* renamed from: a */
    public Object m5065a(int i, Object obj) {
        int m5058a = C0040a.m5058a(this.f305c, this.f307e, i);
        if (m5058a < 0 || this.f306d[m5058a] == f303a) {
            return obj;
        }
        return this.f306d[m5058a];
    }

    /* renamed from: c */
    private void m5061c() {
        int i = this.f307e;
        int i2 = 0;
        int[] iArr = this.f305c;
        Object[] objArr = this.f306d;
        for (int i3 = 0; i3 < i; i3++) {
            Object obj = objArr[i3];
            if (obj != f303a) {
                if (i3 != i2) {
                    iArr[i2] = iArr[i3];
                    objArr[i2] = obj;
                    objArr[i3] = null;
                }
                i2++;
            }
        }
        this.f304b = false;
        this.f307e = i2;
    }

    /* renamed from: b */
    public void m5062b(int i, Object obj) {
        int m5058a = C0040a.m5058a(this.f305c, this.f307e, i);
        if (m5058a >= 0) {
            this.f306d[m5058a] = obj;
            return;
        }
        int i2 = m5058a ^ (-1);
        if (i2 < this.f307e && this.f306d[i2] == f303a) {
            this.f305c[i2] = i;
            this.f306d[i2] = obj;
            return;
        }
        if (this.f304b && this.f307e >= this.f305c.length) {
            m5061c();
            i2 = C0040a.m5058a(this.f305c, this.f307e, i) ^ (-1);
        }
        if (this.f307e >= this.f305c.length) {
            int m5047c = C0042a.m5047c(this.f307e + 1);
            int[] iArr = new int[m5047c];
            Object[] objArr = new Object[m5047c];
            System.arraycopy(this.f305c, 0, iArr, 0, this.f305c.length);
            System.arraycopy(this.f306d, 0, objArr, 0, this.f306d.length);
            this.f305c = iArr;
            this.f306d = objArr;
        }
        if (this.f307e - i2 != 0) {
            System.arraycopy(this.f305c, i2, this.f305c, i2 + 1, this.f307e - i2);
            System.arraycopy(this.f306d, i2, this.f306d, i2 + 1, this.f307e - i2);
        }
        this.f305c[i2] = i;
        this.f306d[i2] = obj;
        this.f307e++;
    }

    /* renamed from: b */
    public int m5064b() {
        if (this.f304b) {
            m5061c();
        }
        return this.f307e;
    }

    /* renamed from: b */
    public int m5063b(int i) {
        if (this.f304b) {
            m5061c();
        }
        return this.f305c[i];
    }

    /* renamed from: c */
    public Object m5060c(int i) {
        if (this.f304b) {
            m5061c();
        }
        return this.f306d[i];
    }

    /* renamed from: c */
    public void m5059c(int i, Object obj) {
        if (this.f307e != 0 && i <= this.f305c[this.f307e - 1]) {
            m5062b(i, obj);
            return;
        }
        if (this.f304b && this.f307e >= this.f305c.length) {
            m5061c();
        }
        int i2 = this.f307e;
        if (i2 >= this.f305c.length) {
            int m5047c = C0042a.m5047c(i2 + 1);
            int[] iArr = new int[m5047c];
            Object[] objArr = new Object[m5047c];
            System.arraycopy(this.f305c, 0, iArr, 0, this.f305c.length);
            System.arraycopy(this.f306d, 0, objArr, 0, this.f306d.length);
            this.f305c = iArr;
            this.f306d = objArr;
        }
        this.f305c[i2] = i;
        this.f306d[i2] = obj;
        this.f307e = i2 + 1;
    }

    public String toString() {
        if (m5064b() <= 0) {
            return "{}";
        }
        StringBuilder sb = new StringBuilder(this.f307e * 28);
        sb.append('{');
        for (int i = 0; i < this.f307e; i++) {
            if (i > 0) {
                sb.append(", ");
            }
            sb.append(m5063b(i));
            sb.append('=');
            Object m5060c = m5060c(i);
            if (m5060c != this) {
                sb.append(m5060c);
            } else {
                sb.append("(this Map)");
            }
        }
        sb.append('}');
        return sb.toString();
    }
}