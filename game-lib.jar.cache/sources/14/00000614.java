package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/g.class */
public class C1128g extends AbstractCollection implements Serializable, Cloneable {

    /* renamed from: b */
    private transient Object[] f7085b = new Object[16];

    /* renamed from: c */
    private transient int f7086c;

    /* renamed from: d */
    private transient int f7087d;

    /* renamed from: a */
    static final /* synthetic */ boolean f7088a;

    static {
        f7088a = !C1128g.class.desiredAssertionStatus();
    }

    /* renamed from: c */
    private void m553c() {
        if (!f7088a && this.f7086c != this.f7087d) {
            throw new AssertionError();
        }
        int i = this.f7086c;
        int length = this.f7085b.length;
        int i2 = length - i;
        int i3 = length << 1;
        if (i3 < 0) {
            throw new IllegalStateException("Sorry, deque too big");
        }
        Object[] objArr = new Object[i3];
        System.arraycopy(this.f7085b, i, objArr, 0, i2);
        System.arraycopy(this.f7085b, 0, objArr, i2, i);
        this.f7085b = objArr;
        this.f7086c = 0;
        this.f7087d = length;
    }

    /* renamed from: a */
    private Object[] m557a(Object[] objArr) {
        if (this.f7086c < this.f7087d) {
            System.arraycopy(this.f7085b, this.f7086c, objArr, 0, size());
        } else if (this.f7086c > this.f7087d) {
            int length = this.f7085b.length - this.f7086c;
            System.arraycopy(this.f7085b, this.f7086c, objArr, 0, length);
            System.arraycopy(this.f7085b, 0, objArr, length, this.f7087d);
        }
        return objArr;
    }

    /* renamed from: a */
    public void m558a(Object obj) {
        if (obj == null) {
            throw new NullPointerException();
        }
        this.f7085b[this.f7087d] = obj;
        int length = (this.f7087d + 1) & (this.f7085b.length - 1);
        this.f7087d = length;
        if (length == this.f7086c) {
            m553c();
        }
    }

    /* renamed from: a */
    public Object m562a() {
        int i = this.f7086c;
        Object obj = this.f7085b[i];
        if (obj == null) {
            return null;
        }
        this.f7085b[i] = null;
        this.f7086c = (i + 1) & (this.f7085b.length - 1);
        return obj;
    }

    /* renamed from: b */
    public boolean m554b(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f7085b.length - 1;
        int i = this.f7086c;
        while (true) {
            int i2 = i;
            Object obj2 = this.f7085b[i2];
            if (obj2 != null) {
                if (obj.equals(obj2)) {
                    m561a(i2);
                    return true;
                }
                i = (i2 + 1) & length;
            } else {
                return false;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean add(Object obj) {
        m558a(obj);
        return true;
    }

    /* renamed from: d */
    private void m551d() {
        if (!f7088a && this.f7085b[this.f7087d] != null) {
            throw new AssertionError();
        }
        if (!f7088a && (this.f7086c != this.f7087d ? this.f7085b[this.f7086c] == null || this.f7085b[(this.f7087d - 1) & (this.f7085b.length - 1)] == null : this.f7085b[this.f7086c] != null)) {
            throw new AssertionError();
        }
        if (!f7088a && this.f7085b[(this.f7086c - 1) & (this.f7085b.length - 1)] != null) {
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: a */
    public boolean m561a(int i) {
        m551d();
        Object[] objArr = this.f7085b;
        int length = objArr.length - 1;
        int i2 = this.f7086c;
        int i3 = this.f7087d;
        int i4 = (i - i2) & length;
        int i5 = (i3 - i) & length;
        if (i4 >= ((i3 - i2) & length)) {
            throw new ConcurrentModificationException();
        }
        if (i4 < i5) {
            if (i2 <= i) {
                System.arraycopy(objArr, i2, objArr, i2 + 1, i4);
            } else {
                System.arraycopy(objArr, 0, objArr, 1, i);
                objArr[0] = objArr[length];
                System.arraycopy(objArr, i2, objArr, i2 + 1, length - i2);
            }
            objArr[i2] = null;
            this.f7086c = (i2 + 1) & length;
            return false;
        } else if (i < i3) {
            System.arraycopy(objArr, i + 1, objArr, i, i5);
            this.f7087d = i3 - 1;
            return true;
        } else {
            System.arraycopy(objArr, i + 1, objArr, i, length - i);
            objArr[length] = objArr[0];
            System.arraycopy(objArr, 1, objArr, 0, i3);
            this.f7087d = (i3 - 1) & length;
            return true;
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public int size() {
        return (this.f7087d - this.f7086c) & (this.f7085b.length - 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean isEmpty() {
        return this.f7086c == this.f7087d;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public Iterator iterator() {
        return new C1130h(this);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean contains(Object obj) {
        if (obj == null) {
            return false;
        }
        int length = this.f7085b.length - 1;
        int i = this.f7086c;
        while (true) {
            int i2 = i;
            Object obj2 = this.f7085b[i2];
            if (obj2 != null) {
                if (obj.equals(obj2)) {
                    return true;
                }
                i = (i2 + 1) & length;
            } else {
                return false;
            }
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public boolean remove(Object obj) {
        return m554b(obj);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public void clear() {
        int i = this.f7086c;
        int i2 = this.f7087d;
        if (i != i2) {
            this.f7087d = 0;
            this.f7086c = 0;
            int i3 = i;
            int length = this.f7085b.length - 1;
            do {
                this.f7085b[i3] = null;
                i3 = (i3 + 1) & length;
            } while (i3 != i2);
        }
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray() {
        return m557a(new Object[size()]);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public Object[] toArray(Object[] objArr) {
        int size = size();
        if (objArr.length < size) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), size);
        }
        m557a(objArr);
        if (objArr.length > size) {
            objArr[size] = null;
        }
        return objArr;
    }

    /* renamed from: b */
    public C1128g clone() {
        try {
            C1128g c1128g = (C1128g) super.clone();
            c1128g.f7085b = (Object[]) this.f7085b.clone();
            return c1128g;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }
}