package com.corrodinggames.rts.gameFramework.p043k;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.k.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/a.class */
public final class C0931a extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final C0945n[] f6126a = new C0945n[0];

    /* renamed from: b */
    public int f6127b;

    /* renamed from: c */
    transient C0945n[] f6128c;

    /* renamed from: d */
    static /* synthetic */ int m1240d(C0931a c0931a) {
        int i = c0931a.modCount + 1;
        c0931a.modCount = i;
        return i;
    }

    public C0931a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.f6128c = i == 0 ? f6126a : new C0945n[i];
    }

    public C0931a() {
        this.f6128c = f6126a;
    }

    /* renamed from: a */
    public C0945n[] m1253a() {
        return this.f6128c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(C0945n c0945n) {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b;
        if (i == c0945nArr.length) {
            C0945n[] c0945nArr2 = new C0945n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c0945nArr, 0, c0945nArr2, 0, i);
            c0945nArr = c0945nArr2;
            this.f6128c = c0945nArr2;
        }
        c0945nArr[i] = c0945n;
        this.f6127b = i + 1;
        this.modCount++;
        return true;
    }

    /* renamed from: b */
    public void m1243b(C0945n c0945n) {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b;
        if (i == c0945nArr.length) {
            C0945n[] c0945nArr2 = new C0945n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(c0945nArr, 0, c0945nArr2, 0, i);
            c0945nArr = c0945nArr2;
            this.f6128c = c0945nArr2;
        }
        c0945nArr[i] = c0945n;
        this.f6127b = i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, C0945n c0945n) {
        C0945n[] c0945nArr = this.f6128c;
        int i2 = this.f6127b;
        if (i > i2 || i < 0) {
            m1251a(i, i2);
        }
        if (i2 < c0945nArr.length) {
            System.arraycopy(c0945nArr, i, c0945nArr, i + 1, i2 - i);
        } else {
            C0945n[] c0945nArr2 = new C0945n[m1242c(i2)];
            System.arraycopy(c0945nArr, 0, c0945nArr2, 0, i);
            System.arraycopy(c0945nArr, i, c0945nArr2, i + 1, i2 - i);
            c0945nArr = c0945nArr2;
            this.f6128c = c0945nArr2;
        }
        c0945nArr[i] = c0945n;
        this.f6127b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m1242c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        C0945n[] c0945nArr = (C0945n[]) collection.toArray();
        int length = c0945nArr.length;
        if (length == 0) {
            return false;
        }
        C0945n[] c0945nArr2 = this.f6128c;
        int i = this.f6127b;
        int i2 = i + length;
        if (i2 > c0945nArr2.length) {
            C0945n[] c0945nArr3 = new C0945n[m1242c(i2 - 1)];
            System.arraycopy(c0945nArr2, 0, c0945nArr3, 0, i);
            c0945nArr2 = c0945nArr3;
            this.f6128c = c0945nArr3;
        }
        System.arraycopy(c0945nArr, 0, c0945nArr2, i, length);
        this.f6127b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f6127b;
        if (i > i2 || i < 0) {
            m1251a(i, i2);
        }
        C0945n[] c0945nArr = (C0945n[]) collection.toArray();
        int length = c0945nArr.length;
        if (length == 0) {
            return false;
        }
        C0945n[] c0945nArr2 = this.f6128c;
        int i3 = i2 + length;
        if (i3 <= c0945nArr2.length) {
            System.arraycopy(c0945nArr2, i, c0945nArr2, i + length, i2 - i);
        } else {
            C0945n[] c0945nArr3 = new C0945n[m1242c(i3 - 1)];
            System.arraycopy(c0945nArr2, 0, c0945nArr3, 0, i);
            System.arraycopy(c0945nArr2, i, c0945nArr3, i + length, i2 - i);
            c0945nArr2 = c0945nArr3;
            this.f6128c = c0945nArr3;
        }
        System.arraycopy(c0945nArr, 0, c0945nArr2, i, length);
        this.f6127b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m1251a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f6127b != 0) {
            Arrays.fill(this.f6128c, 0, this.f6127b, (Object) null);
            this.f6127b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C0931a c0931a = (C0931a) super.clone();
            c0931a.f6128c = (C0945n[]) this.f6128c.clone();
            return c0931a;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public C0945n get(int i) {
        if (i >= this.f6127b) {
            m1251a(i, this.f6127b);
        }
        return this.f6128c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f6127b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.f6127b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0945nArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (c0945nArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0945nArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (c0945nArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        C0945n[] c0945nArr = this.f6128c;
        if (obj != null) {
            for (int i = this.f6127b - 1; i >= 0; i--) {
                if (obj.equals(c0945nArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f6127b - 1; i2 >= 0; i2--) {
            if (c0945nArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public C0945n remove(int i) {
        C0945n[] c0945nArr = this.f6128c;
        int i2 = this.f6127b;
        if (i >= i2) {
            m1251a(i, i2);
        }
        C0945n c0945n = c0945nArr[i];
        int i3 = i2 - 1;
        System.arraycopy(c0945nArr, i + 1, c0945nArr, i, i3 - i);
        c0945nArr[i3] = null;
        this.f6127b = i3;
        this.modCount++;
        return c0945n;
    }

    /* renamed from: b */
    public C0945n m1247b() {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b - 1;
        C0945n c0945n = c0945nArr[i];
        c0945nArr[i] = null;
        this.f6127b = i;
        return c0945n;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        C0945n[] c0945nArr = this.f6128c;
        int i = this.f6127b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(c0945nArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(c0945nArr, i2 + 1, c0945nArr, i2, i3 - i2);
                    c0945nArr[i3] = null;
                    this.f6127b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (c0945nArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(c0945nArr, i4 + 1, c0945nArr, i4, i5 - i4);
                c0945nArr[i5] = null;
                this.f6127b = i5;
                this.modCount++;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList
    protected void removeRange(int i, int i2) {
        if (i == i2) {
            return;
        }
        C0945n[] c0945nArr = this.f6128c;
        int i3 = this.f6127b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f6127b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f6127b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(c0945nArr, i2, c0945nArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(c0945nArr, i3 - i4, i3, (Object) null);
        this.f6127b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public C0945n set(int i, C0945n c0945n) {
        C0945n[] c0945nArr = this.f6128c;
        if (i >= this.f6127b) {
            m1251a(i, this.f6127b);
        }
        C0945n c0945n2 = c0945nArr[i];
        c0945nArr[i] = c0945n;
        return c0945n2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f6127b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f6128c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f6127b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f6128c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C0933b(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        C0945n[] c0945nArr = this.f6128c;
        int i = 1;
        int i2 = this.f6127b;
        for (int i3 = 0; i3 < i2; i3++) {
            C0945n c0945n = c0945nArr[i3];
            i = (31 * i) + (c0945n == null ? 0 : c0945n.hashCode());
        }
        return i;
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        List list = (List) obj;
        int i = this.f6127b;
        if (list.size() != i) {
            return false;
        }
        C0945n[] c0945nArr = this.f6128c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                C0945n c0945n = c0945nArr[i2];
                Object obj2 = list.get(i2);
                if (c0945n == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!c0945n.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            C0945n c0945n2 = c0945nArr[i3];
            Object next = it.next();
            if (c0945n2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!c0945n2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}