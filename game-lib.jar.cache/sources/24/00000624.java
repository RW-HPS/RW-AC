package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/s.class */
public final class s extends AbstractList implements Serializable, Cloneable, RandomAccess {
    public static final com.corrodinggames.rts.gameFramework.w[] a = new com.corrodinggames.rts.gameFramework.w[0];
    int b;
    transient com.corrodinggames.rts.gameFramework.w[] c = a;
    String d;

    static /* synthetic */ int f(s sVar) {
        int i = sVar.modCount + 1;
        sVar.modCount = i;
        return i;
    }

    public s(String str) {
        this.d = str;
    }

    public com.corrodinggames.rts.gameFramework.w[] a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(com.corrodinggames.rts.gameFramework.w wVar) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i = this.b;
        if (i == wVarArr.length) {
            com.corrodinggames.rts.gameFramework.w[] wVarArr2 = new com.corrodinggames.rts.gameFramework.w[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(wVarArr, 0, wVarArr2, 0, i);
            wVarArr = wVarArr2;
            this.c = wVarArr2;
        }
        wVarArr[i] = wVar;
        this.b = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, com.corrodinggames.rts.gameFramework.w wVar) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i2 = this.b;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        if (i2 < wVarArr.length) {
            System.arraycopy(wVarArr, i, wVarArr, i + 1, i2 - i);
        } else {
            com.corrodinggames.rts.gameFramework.w[] wVarArr2 = new com.corrodinggames.rts.gameFramework.w[c(i2)];
            System.arraycopy(wVarArr, 0, wVarArr2, 0, i);
            System.arraycopy(wVarArr, i, wVarArr2, i + 1, i2 - i);
            wVarArr = wVarArr2;
            this.c = wVarArr2;
        }
        wVarArr[i] = wVar;
        this.b = i2 + 1;
        this.modCount++;
    }

    private static int c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = (com.corrodinggames.rts.gameFramework.w[]) collection.toArray();
        int length = wVarArr.length;
        if (length == 0) {
            return false;
        }
        com.corrodinggames.rts.gameFramework.w[] wVarArr2 = this.c;
        int i = this.b;
        int i2 = i + length;
        if (i2 > wVarArr2.length) {
            com.corrodinggames.rts.gameFramework.w[] wVarArr3 = new com.corrodinggames.rts.gameFramework.w[c(i2 - 1)];
            System.arraycopy(wVarArr2, 0, wVarArr3, 0, i);
            wVarArr2 = wVarArr3;
            this.c = wVarArr3;
        }
        System.arraycopy(wVarArr, 0, wVarArr2, i, length);
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
        com.corrodinggames.rts.gameFramework.w[] wVarArr = (com.corrodinggames.rts.gameFramework.w[]) collection.toArray();
        int length = wVarArr.length;
        if (length == 0) {
            return false;
        }
        com.corrodinggames.rts.gameFramework.w[] wVarArr2 = this.c;
        int i3 = i2 + length;
        if (i3 <= wVarArr2.length) {
            System.arraycopy(wVarArr2, i, wVarArr2, i + length, i2 - i);
        } else {
            com.corrodinggames.rts.gameFramework.w[] wVarArr3 = new com.corrodinggames.rts.gameFramework.w[c(i3 - 1)];
            System.arraycopy(wVarArr2, 0, wVarArr3, 0, i);
            System.arraycopy(wVarArr2, i, wVarArr3, i + length, i2 - i);
            wVarArr2 = wVarArr3;
            this.c = wVarArr3;
        }
        System.arraycopy(wVarArr, 0, wVarArr2, i, length);
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

    public void b() {
        if (this.b != 0) {
            this.b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            s sVar = (s) super.clone();
            sVar.c = (com.corrodinggames.rts.gameFramework.w[]) this.c.clone();
            return sVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public com.corrodinggames.rts.gameFramework.w get(int i) {
        if (i >= this.b) {
            a(i, this.b);
        }
        return this.c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (wVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (wVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        if (obj != null) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (obj.equals(wVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (wVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public com.corrodinggames.rts.gameFramework.w remove(int i) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i2 = this.b;
        if (i >= i2) {
            a(i, i2);
        }
        com.corrodinggames.rts.gameFramework.w wVar = wVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(wVarArr, i + 1, wVarArr, i, i3 - i);
        wVarArr[i3] = null;
        this.b = i3;
        this.modCount++;
        return wVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(wVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(wVarArr, i2 + 1, wVarArr, i2, i3 - i2);
                    wVarArr[i3] = null;
                    this.b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (wVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(wVarArr, i4 + 1, wVarArr, i4, i5 - i4);
                wVarArr[i5] = null;
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
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
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
        System.arraycopy(wVarArr, i2, wVarArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(wVarArr, i3 - i4, i3, (Object) null);
        this.b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public com.corrodinggames.rts.gameFramework.w set(int i, com.corrodinggames.rts.gameFramework.w wVar) {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        if (i >= this.b) {
            a(i, this.b);
        }
        com.corrodinggames.rts.gameFramework.w wVar2 = wVarArr[i];
        wVarArr[i] = wVar;
        return wVar2;
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
        return new t(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        int i = 1;
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            com.corrodinggames.rts.gameFramework.w wVar = wVarArr[i3];
            i = (31 * i) + (wVar == null ? 0 : wVar.hashCode());
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
        com.corrodinggames.rts.gameFramework.w[] wVarArr = this.c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                com.corrodinggames.rts.gameFramework.w wVar = wVarArr[i2];
                Object obj2 = list.get(i2);
                if (wVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!wVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            com.corrodinggames.rts.gameFramework.w wVar2 = wVarArr[i3];
            Object next = it.next();
            if (wVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!wVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}