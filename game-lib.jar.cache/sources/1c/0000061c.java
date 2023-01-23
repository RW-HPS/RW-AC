package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/m.class */
public final class m extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a  reason: collision with root package name */
    public int f689a;
    transient Object[] b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ int d(m mVar) {
        int i = mVar.modCount + 1;
        mVar.modCount = i;
        return i;
    }

    public m(int i) {
        if (i < 0) {
            throw new IllegalArgumentException("capacity < 0: " + i);
        }
        this.b = i == 0 ? x.g : new Object[i];
    }

    public m() {
        this.b = x.g;
    }

    public Object[] a() {
        return this.b;
    }

    public m(Collection collection) {
        Object[] array = collection.toArray();
        if (array.getClass() != Object[].class) {
            Object[] objArr = new Object[array.length];
            System.arraycopy(array, 0, objArr, 0, array.length);
            array = objArr;
        }
        this.b = array;
        this.f689a = array.length;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        Object[] objArr = this.b;
        int i = this.f689a;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.b = objArr2;
        }
        objArr[i] = obj;
        this.f689a = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        Object[] objArr = this.b;
        int i2 = this.f689a;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[b(i2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + 1, i2 - i);
            objArr = objArr2;
            this.b = objArr2;
        }
        objArr[i] = obj;
        this.f689a = i2 + 1;
        this.modCount++;
    }

    private static int b(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.b;
        int i = this.f689a;
        int i2 = i + length;
        if (i2 > objArr.length) {
            Object[] objArr2 = new Object[b(i2 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.b = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f689a = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f689a;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.b;
        int i3 = i2 + length;
        if (i3 <= objArr.length) {
            System.arraycopy(objArr, i, objArr, i + length, i2 - i);
        } else {
            Object[] objArr2 = new Object[b(i3 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + length, i2 - i);
            objArr = objArr2;
            this.b = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.f689a = i3;
        this.modCount++;
        return true;
    }

    static IndexOutOfBoundsException a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f689a != 0) {
            Arrays.fill(this.b, 0, this.f689a, (Object) null);
            this.f689a = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            m mVar = (m) super.clone();
            mVar.b = (Object[]) this.b.clone();
            return mVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (i >= this.f689a) {
            a(i, this.f689a);
        }
        return this.b[i];
    }

    public final Object a(int i) {
        return this.b[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f689a;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f689a == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.b;
        int i = this.f689a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        Object[] objArr = this.b;
        int i = this.f689a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (objArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        Object[] objArr = this.b;
        if (obj != null) {
            for (int i = this.f689a - 1; i >= 0; i--) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f689a - 1; i2 >= 0; i2--) {
            if (objArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object[] objArr = this.b;
        int i2 = this.f689a;
        if (i >= i2) {
            a(i, i2);
        }
        Object obj = objArr[i];
        int i3 = i2 - 1;
        System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        objArr[i3] = null;
        this.f689a = i3;
        this.modCount++;
        return obj;
    }

    public Object b() {
        Object[] objArr = this.b;
        int i = this.f689a;
        int i2 = i - 1;
        if (i == 0) {
            a(i2, i);
        }
        Object obj = objArr[i2];
        int i3 = i - 1;
        objArr[i3] = null;
        this.f689a = i3;
        this.modCount++;
        return obj;
    }

    public Object c() {
        Object[] objArr = this.b;
        int i = this.f689a;
        Object obj = objArr[i - 1];
        int i2 = i - 1;
        objArr[i2] = null;
        this.f689a = i2;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = this.b;
        int i = this.f689a;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                    objArr[i3] = null;
                    this.f689a = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (objArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(objArr, i4 + 1, objArr, i4, i5 - i4);
                objArr[i5] = null;
                this.f689a = i5;
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
        Object[] objArr = this.b;
        int i3 = this.f689a;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f689a);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f689a);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(objArr, i2, objArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(objArr, i3 - i4, i3, (Object) null);
        this.f689a = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Object[] objArr = this.b;
        if (i >= this.f689a) {
            a(i, this.f689a);
        }
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f689a;
        Object[] objArr = new Object[i];
        System.arraycopy(this.b, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f689a;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.b, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new n(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        Object[] objArr = this.b;
        int i = 1;
        int i2 = this.f689a;
        for (int i3 = 0; i3 < i2; i3++) {
            Object obj = objArr[i3];
            i = (31 * i) + (obj == null ? 0 : obj.hashCode());
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
        int i = this.f689a;
        if (list.size() != i) {
            return false;
        }
        Object[] objArr = this.b;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                Object obj2 = objArr[i2];
                Object obj3 = list.get(i2);
                if (obj2 == null) {
                    if (obj3 != null) {
                        return false;
                    }
                } else if (!obj2.equals(obj3)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            Object obj4 = objArr[i3];
            Object next = it.next();
            if (obj4 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!obj4.equals(next)) {
                return false;
            }
        }
        return true;
    }
}