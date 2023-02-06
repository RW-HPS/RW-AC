package com.corrodinggames.rts.gameFramework.utility;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/u.class */
public final class u extends AbstractList implements Serializable, Cloneable, RandomAccess {
    public static final com.corrodinggames.rts.game.units.am[] a = new com.corrodinggames.rts.game.units.am[0];
    public int b;
    transient com.corrodinggames.rts.game.units.am[] c = a;

    static /* synthetic */ int d(u uVar) {
        int i = uVar.modCount + 1;
        uVar.modCount = i;
        return i;
    }

    public com.corrodinggames.rts.game.units.am[] a() {
        return this.c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean add(com.corrodinggames.rts.game.units.am amVar) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = this.b;
        if (i == amVarArr.length) {
            com.corrodinggames.rts.game.units.am[] amVarArr2 = new com.corrodinggames.rts.game.units.am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(amVarArr, 0, amVarArr2, 0, i);
            amVarArr = amVarArr2;
            this.c = amVarArr2;
        }
        amVarArr[i] = amVar;
        this.b = i + 1;
        this.modCount++;
        return true;
    }

    public final void b(com.corrodinggames.rts.game.units.am amVar) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = this.b;
        if (i == amVarArr.length) {
            com.corrodinggames.rts.game.units.am[] amVarArr2 = new com.corrodinggames.rts.game.units.am[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(amVarArr, 0, amVarArr2, 0, i);
            amVarArr = amVarArr2;
            this.c = amVarArr2;
        }
        amVarArr[i] = amVar;
        this.b = i + 1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void add(int i, com.corrodinggames.rts.game.units.am amVar) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i2 = this.b;
        if (i > i2 || i < 0) {
            a(i, i2);
        }
        if (i2 < amVarArr.length) {
            System.arraycopy(amVarArr, i, amVarArr, i + 1, i2 - i);
        } else {
            com.corrodinggames.rts.game.units.am[] amVarArr2 = new com.corrodinggames.rts.game.units.am[c(i2)];
            System.arraycopy(amVarArr, 0, amVarArr2, 0, i);
            System.arraycopy(amVarArr, i, amVarArr2, i + 1, i2 - i);
            amVarArr = amVarArr2;
            this.c = amVarArr2;
        }
        amVarArr[i] = amVar;
        this.b = i2 + 1;
        this.modCount++;
    }

    private static int c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        com.corrodinggames.rts.game.units.am[] amVarArr = (com.corrodinggames.rts.game.units.am[]) collection.toArray();
        int length = amVarArr.length;
        if (length == 0) {
            return false;
        }
        com.corrodinggames.rts.game.units.am[] amVarArr2 = this.c;
        int i = this.b;
        int i2 = i + length;
        if (i2 > amVarArr2.length) {
            com.corrodinggames.rts.game.units.am[] amVarArr3 = new com.corrodinggames.rts.game.units.am[c(i2 - 1)];
            System.arraycopy(amVarArr2, 0, amVarArr3, 0, i);
            amVarArr2 = amVarArr3;
            this.c = amVarArr3;
        }
        System.arraycopy(amVarArr, 0, amVarArr2, i, length);
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
        com.corrodinggames.rts.game.units.am[] amVarArr = (com.corrodinggames.rts.game.units.am[]) collection.toArray();
        int length = amVarArr.length;
        if (length == 0) {
            return false;
        }
        com.corrodinggames.rts.game.units.am[] amVarArr2 = this.c;
        int i3 = i2 + length;
        if (i3 <= amVarArr2.length) {
            System.arraycopy(amVarArr2, i, amVarArr2, i + length, i2 - i);
        } else {
            com.corrodinggames.rts.game.units.am[] amVarArr3 = new com.corrodinggames.rts.game.units.am[c(i3 - 1)];
            System.arraycopy(amVarArr2, 0, amVarArr3, 0, i);
            System.arraycopy(amVarArr2, i, amVarArr3, i + length, i2 - i);
            amVarArr2 = amVarArr3;
            this.c = amVarArr3;
        }
        System.arraycopy(amVarArr, 0, amVarArr2, i, length);
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
            u uVar = (u) super.clone();
            uVar.c = (com.corrodinggames.rts.game.units.am[]) this.c.clone();
            return uVar;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public com.corrodinggames.rts.game.units.am get(int i) {
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
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(amVarArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (amVarArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(amVarArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (amVarArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        if (obj != null) {
            for (int i = this.b - 1; i >= 0; i--) {
                if (obj.equals(amVarArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.b - 1; i2 >= 0; i2--) {
            if (amVarArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public com.corrodinggames.rts.game.units.am remove(int i) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i2 = this.b;
        if (i >= i2) {
            a(i, i2);
        }
        com.corrodinggames.rts.game.units.am amVar = amVarArr[i];
        int i3 = i2 - 1;
        System.arraycopy(amVarArr, i + 1, amVarArr, i, i3 - i);
        amVarArr[i3] = null;
        this.b = i3;
        this.modCount++;
        return amVar;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = this.b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(amVarArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(amVarArr, i2 + 1, amVarArr, i2, i3 - i2);
                    amVarArr[i3] = null;
                    this.b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (amVarArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(amVarArr, i4 + 1, amVarArr, i4, i5 - i4);
                amVarArr[i5] = null;
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
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
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
        System.arraycopy(amVarArr, i2, amVarArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(amVarArr, i3 - i4, i3, (Object) null);
        this.b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public com.corrodinggames.rts.game.units.am set(int i, com.corrodinggames.rts.game.units.am amVar) {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        if (i >= this.b) {
            a(i, this.b);
        }
        com.corrodinggames.rts.game.units.am amVar2 = amVarArr[i];
        amVarArr[i] = amVar;
        return amVar2;
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
        return new v(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        int i = 1;
        int i2 = this.b;
        for (int i3 = 0; i3 < i2; i3++) {
            com.corrodinggames.rts.game.units.am amVar = amVarArr[i3];
            i = (31 * i) + (amVar == null ? 0 : amVar.hashCode());
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
        com.corrodinggames.rts.game.units.am[] amVarArr = this.c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                com.corrodinggames.rts.game.units.am amVar = amVarArr[i2];
                Object obj2 = list.get(i2);
                if (amVar == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!amVar.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            com.corrodinggames.rts.game.units.am amVar2 = amVarArr[i3];
            Object next = it.next();
            if (amVar2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!amVar2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}