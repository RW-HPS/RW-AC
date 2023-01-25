package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.s */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/s.class */
public final class C1144s extends AbstractList implements Serializable, Cloneable, RandomAccess {

    /* renamed from: a */
    public static final AbstractC1155w[] f7128a = new AbstractC1155w[0];

    /* renamed from: b */
    int f7129b;

    /* renamed from: c */
    transient AbstractC1155w[] f7130c = f7128a;

    /* renamed from: d */
    String f7131d;

    /* renamed from: f */
    static /* synthetic */ int m501f(C1144s c1144s) {
        int i = c1144s.modCount + 1;
        c1144s.modCount = i;
        return i;
    }

    public C1144s(String str) {
        this.f7131d = str;
    }

    /* renamed from: a */
    public AbstractC1155w[] m515a() {
        return this.f7130c;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    /* renamed from: a */
    public boolean mo510a(AbstractC1155w abstractC1155w) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i = this.f7129b;
        if (i == abstractC1155wArr.length) {
            AbstractC1155w[] abstractC1155wArr2 = new AbstractC1155w[i + (i < 6 ? 12 : i >> 1)];
            System.arraycopy(abstractC1155wArr, 0, abstractC1155wArr2, 0, i);
            abstractC1155wArr = abstractC1155wArr2;
            this.f7130c = abstractC1155wArr2;
        }
        abstractC1155wArr[i] = abstractC1155w;
        this.f7129b = i + 1;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public void mo512a(int i, AbstractC1155w abstractC1155w) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i2 = this.f7129b;
        if (i > i2 || i < 0) {
            m513a(i, i2);
        }
        if (i2 < abstractC1155wArr.length) {
            System.arraycopy(abstractC1155wArr, i, abstractC1155wArr, i + 1, i2 - i);
        } else {
            AbstractC1155w[] abstractC1155wArr2 = new AbstractC1155w[m505c(i2)];
            System.arraycopy(abstractC1155wArr, 0, abstractC1155wArr2, 0, i);
            System.arraycopy(abstractC1155wArr, i, abstractC1155wArr2, i + 1, i2 - i);
            abstractC1155wArr = abstractC1155wArr2;
            this.f7130c = abstractC1155wArr2;
        }
        abstractC1155wArr[i] = abstractC1155w;
        this.f7129b = i2 + 1;
        this.modCount++;
    }

    /* renamed from: c */
    private static int m505c(int i) {
        return i + (i < 6 ? 12 : i >> 1);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean addAll(Collection collection) {
        AbstractC1155w[] abstractC1155wArr = (AbstractC1155w[]) collection.toArray();
        int length = abstractC1155wArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC1155w[] abstractC1155wArr2 = this.f7130c;
        int i = this.f7129b;
        int i2 = i + length;
        if (i2 > abstractC1155wArr2.length) {
            AbstractC1155w[] abstractC1155wArr3 = new AbstractC1155w[m505c(i2 - 1)];
            System.arraycopy(abstractC1155wArr2, 0, abstractC1155wArr3, 0, i);
            abstractC1155wArr2 = abstractC1155wArr3;
            this.f7130c = abstractC1155wArr3;
        }
        System.arraycopy(abstractC1155wArr, 0, abstractC1155wArr2, i, length);
        this.f7129b = i2;
        this.modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.List
    public boolean addAll(int i, Collection collection) {
        int i2 = this.f7129b;
        if (i > i2 || i < 0) {
            m513a(i, i2);
        }
        AbstractC1155w[] abstractC1155wArr = (AbstractC1155w[]) collection.toArray();
        int length = abstractC1155wArr.length;
        if (length == 0) {
            return false;
        }
        AbstractC1155w[] abstractC1155wArr2 = this.f7130c;
        int i3 = i2 + length;
        if (i3 <= abstractC1155wArr2.length) {
            System.arraycopy(abstractC1155wArr2, i, abstractC1155wArr2, i + length, i2 - i);
        } else {
            AbstractC1155w[] abstractC1155wArr3 = new AbstractC1155w[m505c(i3 - 1)];
            System.arraycopy(abstractC1155wArr2, 0, abstractC1155wArr3, 0, i);
            System.arraycopy(abstractC1155wArr2, i, abstractC1155wArr3, i + length, i2 - i);
            abstractC1155wArr2 = abstractC1155wArr3;
            this.f7130c = abstractC1155wArr3;
        }
        System.arraycopy(abstractC1155wArr, 0, abstractC1155wArr2, i, length);
        this.f7129b = i3;
        this.modCount++;
        return true;
    }

    /* renamed from: a */
    static IndexOutOfBoundsException m513a(int i, int i2) {
        throw new IndexOutOfBoundsException("Invalid index " + i + ", size is " + i2);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public void clear() {
        if (this.f7129b != 0) {
            Arrays.fill(this.f7130c, 0, this.f7129b, (Object) null);
            this.f7129b = 0;
            this.modCount++;
        }
    }

    /* renamed from: b */
    public void m509b() {
        if (this.f7129b != 0) {
            this.f7129b = 0;
            this.modCount++;
        }
    }

    public Object clone() {
        try {
            C1144s c1144s = (C1144s) super.clone();
            c1144s.f7130c = (AbstractC1155w[]) this.f7130c.clone();
            return c1144s;
        } catch (CloneNotSupportedException e) {
            throw new AssertionError();
        }
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: a */
    public AbstractC1155w mo514a(int i) {
        if (i >= this.f7129b) {
            m513a(i, this.f7129b);
        }
        return this.f7130c[i];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public int size() {
        return this.f7129b;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean isEmpty() {
        return this.f7129b == 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean contains(Object obj) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i = this.f7129b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1155wArr[i2])) {
                    return true;
                }
            }
            return false;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC1155wArr[i3] == null) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractList, java.util.List
    public int indexOf(Object obj) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i = this.f7129b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1155wArr[i2])) {
                    return i2;
                }
            }
            return -1;
        }
        for (int i3 = 0; i3 < i; i3++) {
            if (abstractC1155wArr[i3] == null) {
                return i3;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    public int lastIndexOf(Object obj) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        if (obj != null) {
            for (int i = this.f7129b - 1; i >= 0; i--) {
                if (obj.equals(abstractC1155wArr[i])) {
                    return i;
                }
            }
            return -1;
        }
        for (int i2 = this.f7129b - 1; i2 >= 0; i2--) {
            if (abstractC1155wArr[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC1155w mo508b(int i) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i2 = this.f7129b;
        if (i >= i2) {
            m513a(i, i2);
        }
        AbstractC1155w abstractC1155w = abstractC1155wArr[i];
        int i3 = i2 - 1;
        System.arraycopy(abstractC1155wArr, i + 1, abstractC1155wArr, i, i3 - i);
        abstractC1155wArr[i3] = null;
        this.f7129b = i3;
        this.modCount++;
        return abstractC1155w;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public boolean remove(Object obj) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i = this.f7129b;
        if (obj != null) {
            for (int i2 = 0; i2 < i; i2++) {
                if (obj.equals(abstractC1155wArr[i2])) {
                    int i3 = i - 1;
                    System.arraycopy(abstractC1155wArr, i2 + 1, abstractC1155wArr, i2, i3 - i2);
                    abstractC1155wArr[i3] = null;
                    this.f7129b = i3;
                    this.modCount++;
                    return true;
                }
            }
            return false;
        }
        for (int i4 = 0; i4 < i; i4++) {
            if (abstractC1155wArr[i4] == null) {
                int i5 = i - 1;
                System.arraycopy(abstractC1155wArr, i4 + 1, abstractC1155wArr, i4, i5 - i4);
                abstractC1155wArr[i5] = null;
                this.f7129b = i5;
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
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i3 = this.f7129b;
        if (i >= i3) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " >= size " + this.f7129b);
        }
        if (i2 > i3) {
            throw new IndexOutOfBoundsException("toIndex " + i2 + " > size " + this.f7129b);
        }
        if (i > i2) {
            throw new IndexOutOfBoundsException("fromIndex " + i + " > toIndex " + i2);
        }
        System.arraycopy(abstractC1155wArr, i2, abstractC1155wArr, i, i3 - i2);
        int i4 = i2 - i;
        Arrays.fill(abstractC1155wArr, i3 - i4, i3, (Object) null);
        this.f7129b = i3 - i4;
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    /* renamed from: b */
    public AbstractC1155w mo507b(int i, AbstractC1155w abstractC1155w) {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        if (i >= this.f7129b) {
            m513a(i, this.f7129b);
        }
        AbstractC1155w abstractC1155w2 = abstractC1155wArr[i];
        abstractC1155wArr[i] = abstractC1155w;
        return abstractC1155w2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray() {
        int i = this.f7129b;
        Object[] objArr = new Object[i];
        System.arraycopy(this.f7130c, 0, objArr, 0, i);
        return objArr;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public Object[] toArray(Object[] objArr) {
        int i = this.f7129b;
        if (objArr.length < i) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), i);
        }
        System.arraycopy(this.f7130c, 0, objArr, 0, i);
        if (objArr.length > i) {
            objArr[i] = null;
        }
        return objArr;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public Iterator iterator() {
        return new C1146t(this);
    }

    @Override // java.util.AbstractList, java.util.Collection, java.util.List
    public int hashCode() {
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        int i = 1;
        int i2 = this.f7129b;
        for (int i3 = 0; i3 < i2; i3++) {
            AbstractC1155w abstractC1155w = abstractC1155wArr[i3];
            i = (31 * i) + (abstractC1155w == null ? 0 : abstractC1155w.hashCode());
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
        int i = this.f7129b;
        if (list.size() != i) {
            return false;
        }
        AbstractC1155w[] abstractC1155wArr = this.f7130c;
        if (list instanceof RandomAccess) {
            for (int i2 = 0; i2 < i; i2++) {
                AbstractC1155w abstractC1155w = abstractC1155wArr[i2];
                Object obj2 = list.get(i2);
                if (abstractC1155w == null) {
                    if (obj2 != null) {
                        return false;
                    }
                } else if (!abstractC1155w.equals(obj2)) {
                    return false;
                }
            }
            return true;
        }
        Iterator it = list.iterator();
        for (int i3 = 0; i3 < i; i3++) {
            AbstractC1155w abstractC1155w2 = abstractC1155wArr[i3];
            Object next = it.next();
            if (abstractC1155w2 == null) {
                if (next != null) {
                    return false;
                }
            } else if (!abstractC1155w2.equals(next)) {
                return false;
            }
        }
        return true;
    }
}