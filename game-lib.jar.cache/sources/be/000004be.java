package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.C0732bh;
import com.corrodinggames.rts.gameFramework.C0733bi;
import com.corrodinggames.rts.gameFramework.EnumC0734bj;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab.class */
public class C0792ab {

    /* renamed from: a */
    private EnumC0734bj f5149a;

    /* renamed from: b */
    private int f5150b;

    /* renamed from: c */
    private int f5151c;

    /* renamed from: d */
    private int f5152d;

    /* renamed from: e */
    private ArrayList f5153e = new ArrayList();

    public C0792ab(EnumC0734bj enumC0734bj, ArrayList arrayList) {
        this.f5149a = enumC0734bj;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0733bi m2449a = ((C0791aa) it.next()).f5144a.m2449a(enumC0734bj);
            arrayList2.add(m2449a);
            Iterator it2 = m2449a.iterator();
            while (it2.hasNext()) {
                C0732bh c0732bh = (C0732bh) it2.next();
                if (c0732bh.f4624b > this.f5150b) {
                    this.f5150b = c0732bh.f4624b;
                }
                if (c0732bh.f4624b < this.f5151c) {
                    this.f5151c = c0732bh.f4624b;
                }
                if (c0732bh.f4623a > this.f5152d) {
                    this.f5152d = c0732bh.f4623a;
                }
            }
        }
        m1993a(arrayList2);
    }

    /* renamed from: a */
    private void m1993a(ArrayList arrayList) {
        boolean z;
        int size = arrayList.size();
        C0794ad c0794ad = new C0794ad(size);
        int[] iArr = new int[size];
        int i = 0;
        do {
            i++;
            if (i > 1000000) {
                throw new RuntimeException("loopIndex: " + i);
            }
            boolean z2 = true;
            for (int i2 = 0; i2 < size; i2++) {
                C0733bi c0733bi = (C0733bi) arrayList.get(i2);
                if (iArr[i2] < c0733bi.size()) {
                    C0732bh c0732bh = (C0732bh) c0733bi.get(iArr[i2]);
                    if (c0732bh.f4623a <= C0794ad.m1985a(c0794ad)) {
                        c0794ad.m1986a(i2, c0732bh.f4624b);
                        int i3 = i2;
                        iArr[i3] = iArr[i3] + 1;
                        z2 = false;
                    }
                }
            }
            z = z2;
            int i4 = Integer.MAX_VALUE;
            if (z2) {
                this.f5153e.add(c0794ad);
                for (int i5 = 0; i5 < size; i5++) {
                    C0733bi c0733bi2 = (C0733bi) arrayList.get(i5);
                    if (iArr[i5] < c0733bi2.size()) {
                        C0732bh c0732bh2 = (C0732bh) c0733bi2.get(iArr[i5]);
                        if (c0732bh2.f4623a < i4) {
                            i4 = c0732bh2.f4623a;
                            z = false;
                        }
                    }
                }
                c0794ad = new C0794ad(i4, c0794ad);
            }
        } while (!z);
    }
}