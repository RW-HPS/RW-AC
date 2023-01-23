package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/o.class */
public final class o extends AbstractList implements Serializable, Cloneable, RandomAccess {
    public int c;

    /* renamed from: a */
    public m f691a = new m();
    public m b = new m();
    transient Object[] d = x.g;

    public static /* synthetic */ int d(o oVar) {
        int i = oVar.modCount + 1;
        oVar.modCount = i;
        return i;
    }

    public void a(Object obj) {
        r rVar;
        if (this.b.f689a != 0) {
            rVar = (r) this.b.b();
        } else {
            rVar = new r();
        }
        rVar.f694a = q.add;
        rVar.b = obj;
        this.f691a.add(rVar);
    }

    public void b(Object obj) {
        r rVar;
        if (this.b.f689a != 0) {
            rVar = (r) this.b.b();
        } else {
            rVar = new r();
        }
        rVar.f694a = q.remove;
        rVar.b = obj;
        this.f691a.add(rVar);
    }

    public void a() {
        this.modCount++;
        if (this.f691a.f689a != 0) {
            Iterator it = this.f691a.iterator();
            while (it.hasNext()) {
                r rVar = (r) it.next();
                if (rVar.f694a == q.add) {
                    Object obj = rVar.b;
                    if (obj == null) {
                        throw new RuntimeException("Trying to insert null into array");
                    }
                    add(obj);
                } else if (rVar.f694a == q.remove) {
                    remove(rVar.b);
                } else {
                    throw new RuntimeException("Unknown operationType:" + rVar.f694a);
                }
                rVar.b = null;
            }
            if (this.f691a.size() < 100) {
                this.b.addAll(this.f691a);
            }
            this.f691a.clear();
        }
    }

    public Object[] b() {
        return this.d;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean add(Object obj) {
        Object[] objArr = this.d;
        int i = this.c;
        if (i == objArr.length) {
            Object[] objArr2 = new Object[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.d = objArr2;
        }
        objArr[i] = obj;
        this.c = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public void add(int i, Object obj) {
        Object[] objArr = this.d;
        int i2 = this.c;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        if (i2 < objArr.length) {
            System.arraycopy(objArr, i, objArr, i + 1, i2 - i);
        } else {
            Object[] objArr2 = new Object[a(i2)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + 1, i2 - i);
            objArr = objArr2;
            this.d = objArr2;
        }
        objArr[i] = obj;
        this.c = i2 + 1;
        this.modCount++;
    }

    private static int a(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.d;
        int i = this.c;
        int i2 = i + length;
        if (i2 > objArr.length) {
            Object[] objArr2 = new Object[a(i2 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            objArr = objArr2;
            this.d = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.c = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.c;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        Object[] array = collection.toArray();
        int length = array.length;
        if (length == 0) {
            return false;
        }
        Object[] objArr = this.d;
        int i3 = i2 + length;
        if (i3 <= objArr.length) {
            System.arraycopy(objArr, i, objArr, i + length, i2 - i);
        } else {
            Object[] objArr2 = new Object[a(i3 - 1)];
            System.arraycopy(objArr, 0, objArr2, 0, i);
            System.arraycopy(objArr, i, objArr2, i + length, i2 - i);
            objArr = objArr2;
            this.d = objArr2;
        }
        System.arraycopy(array, 0, objArr, i, length);
        this.c = i3;
        this.modCount++;
        return true;
    }

    static IndexOutOfBoundsException a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public synchronized void clear() {
        this.f691a.clear();
        if (this.c != 0) {
            Arrays.fill(this.d, 0, this.c, (Object) null);
            this.c = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            o oVar = (o) super.clone();
            oVar.d = (Object[]) this.d.clone();
            return oVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    public Object get(int i) {
        if (i >= this.c) {
            a(i, this.c);
        }
        return this.d[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.c;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.c == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        Object[] objArr = this.d;
        int i = this.c;
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
        Object[] objArr = this.d;
        int i = this.c;
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
        Object[] objArr = this.d;
        if (obj != null) {
            for (int i = this.c - 1; i >= 0; i--) {
                if (obj.equals(objArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.c - 1; i2 >= 0; i2--) {
            if (objArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object remove(int i) {
        Object[] objArr = this.d;
        int i2 = this.c;
        if (i >= i2) {
            a(i, i2);
        }
        Object obj = objArr[i];
        int i3 = i2 - 1;
        System.arraycopy(objArr, i + 1, objArr, i, i3 - i);
        objArr[i3] = null;
        this.c = i3;
        this.modCount++;
        return obj;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        Object[] objArr = this.d;
        int i = this.c;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(objArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(objArr, i2 + 1, objArr, i2, i3 - i2);
                    objArr[i3] = null;
                    this.c = i3;
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
                this.c = i5;
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
        Object[] objArr = this.d;
        int i3 = this.c;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.c);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.c);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(objArr, i2, objArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(objArr, i3 - i4, i3, (Object) null);
        this.c = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public Object set(int i, Object obj) {
        Object[] objArr = this.d;
        if (i >= this.c) {
            a(i, this.c);
        }
        Object obj2 = objArr[i];
        objArr[i] = obj;
        return obj2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.c;
        Object[] objArr = new Object[i];
        System.arraycopy(this.d, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.c;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.d, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new p(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        Object[] objArr = this.d;
        int i = 1;
        int i2 = this.c;
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
        int i = this.c;
        if (list.size() != i) {
            return false;
        }
        Object[] objArr = this.d;
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