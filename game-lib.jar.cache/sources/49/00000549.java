package com.corrodinggames.rts.gameFramework.k;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/a.class */
public final class a extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final n[] f599a = new n[0];
    public int b;
    transient n[] c;

    public static /* synthetic */ int a(a aVar) {
        return aVar.modCount;
    }

    public static /* synthetic */ int b(a aVar) {
        return aVar.modCount;
    }

    public static /* synthetic */ int c(a aVar) {
        return aVar.modCount;
    }

    public static /* synthetic */ int d(a aVar) {
        int i = aVar.modCount + 1;
        aVar.modCount = i;
        return i;
    }

    public a(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.c = i == 0 ? f599a : new n[i];
    }

    public a() {
        this.c = f599a;
    }

    public n[] a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(n nVar) {
        n[] nVarArr = this.c;
        int i = this.b;
        if (i == nVarArr.length) {
            n[] nVarArr2 = new n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(nVarArr, 0, nVarArr2, 0, i);
            nVarArr = nVarArr2;
            this.c = nVarArr2;
        }
        nVarArr[i] = nVar;
        this.b = i + 1;
        this.modCount++;
        return true;
    }

    public void b(n nVar) {
        n[] nVarArr = this.c;
        int i = this.b;
        if (i == nVarArr.length) {
            n[] nVarArr2 = new n[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(nVarArr, 0, nVarArr2, 0, i);
            nVarArr = nVarArr2;
            this.c = nVarArr2;
        }
        nVarArr[i] = nVar;
        this.b = i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, n nVar) {
        n[] nVarArr = this.c;
        int i2 = this.b;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        if (i2 < nVarArr.length) {
            System.arraycopy(nVarArr, i, nVarArr, i + 1, i2 - i);
        } else {
            n[] nVarArr2 = new n[c(i2)];
            System.arraycopy(nVarArr, 0, nVarArr2, 0, i);
            System.arraycopy(nVarArr, i, nVarArr2, i + 1, i2 - i);
            nVarArr = nVarArr2;
            this.c = nVarArr2;
        }
        nVarArr[i] = nVar;
        this.b = i2 + 1;
        this.modCount++;
    }

    private static int c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        n[] nVarArr = (n[]) collection.toArray();
        int length = nVarArr.length;
        if (length == 0) {
            return false;
        }
        n[] nVarArr2 = this.c;
        int i = this.b;
        int i2 = i + length;
        if (i2 > nVarArr2.length) {
            n[] nVarArr3 = new n[c(i2 - 1)];
            System.arraycopy(nVarArr2, 0, nVarArr3, 0, i);
            nVarArr2 = nVarArr3;
            this.c = nVarArr3;
        }
        System.arraycopy(nVarArr, 0, nVarArr2, i, length);
        this.b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.b;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        n[] nVarArr = (n[]) collection.toArray();
        int length = nVarArr.length;
        if (length == 0) {
            return false;
        }
        n[] nVarArr2 = this.c;
        int i3 = i2 + length;
        if (i3 <= nVarArr2.length) {
            System.arraycopy(nVarArr2, i, nVarArr2, i + length, i2 - i);
        } else {
            n[] nVarArr3 = new n[c(i3 - 1)];
            System.arraycopy(nVarArr2, 0, nVarArr3, 0, i);
            System.arraycopy(nVarArr2, i, nVarArr3, i + length, i2 - i);
            nVarArr2 = nVarArr3;
            this.c = nVarArr3;
        }
        System.arraycopy(nVarArr, 0, nVarArr2, i, length);
        this.b = i3;
        this.modCount++;
        return true;
    }

    static IndexOutOfBoundsException a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.b != 0) {
            Arrays.fill(this.c, 0, this.b, (Object) null);
            this.b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            a aVar = (a) super.clone();
            aVar.c = (n[]) this.c.clone();
            return aVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public n get(int i) {
        if (i >= this.b) {
            a(i, this.b);
        }
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        n[] nVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(nVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (nVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        n[] nVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(nVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (nVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        n[] nVarArr = this.c;
        if (obj != null) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (obj.equals(nVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (nVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public n remove(int i) {
        n[] nVarArr = this.c;
        int i2 = this.b;
        if (i >= i2) {
            a(i, i2);
        }
        n nVar = nVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(nVarArr, i + 1, nVarArr, i, i3 - i);
        nVarArr[i3] = null;
        this.b = i3;
        this.modCount++;
        return nVar;
    }

    public n b() {
        n[] nVarArr = this.c;
        int i = this.b - 1;
        n nVar = nVarArr[i];
        nVarArr[i] = null;
        this.b = i;
        return nVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        n[] nVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(nVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(nVarArr, i2 + 1, nVarArr, i2, i3 - i2);
                    nVarArr[i3] = null;
                    this.b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (nVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(nVarArr, i4 + 1, nVarArr, i4, i5 - i4);
                nVarArr[i5] = null;
                this.b = i5;
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
        n[] nVarArr = this.c;
        int i3 = this.b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(nVarArr, i2, nVarArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(nVarArr, i3 - i4, i3, (Object) null);
        this.b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public n set(int i, n nVar) {
        n[] nVarArr = this.c;
        if (i >= this.b) {
            a(i, this.b);
        }
        n nVar2 = nVarArr[i];
        nVarArr[i] = nVar;
        return nVar2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new b(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        n[] nVarArr = this.c;
        int i = 1;
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            n nVar = nVarArr[i3];
            i = (31 * i) + (nVar == null ? 0 : nVar.hashCode());
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
        int i = this.b;
        if (list.size() != i) {
            return false;
        }
        n[] nVarArr = this.c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                n nVar = nVarArr[i2];
                Object obj2 = list.get(i2);
                if (nVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!nVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            n nVar2 = nVarArr[i3];
            Object next = it.next();
            if (nVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!nVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}