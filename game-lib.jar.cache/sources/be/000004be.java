package com.corrodinggames.rts.gameFramework.Interface;

import com.corrodinggames.rts.gameFramework.bh;
import com.corrodinggames.rts.gameFramework.bi;
import com.corrodinggames.rts.gameFramework.bj;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab.class */
public class ab {
    private bj a;
    private int b;
    private int c;
    private int d;
    private ArrayList e = new ArrayList();

    public ab(bj bjVar, ArrayList arrayList) {
        this.a = bjVar;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bi a = ((aa) it.next()).a.a(bjVar);
            arrayList2.add(a);
            Iterator it2 = a.iterator();
            while (it2.hasNext()) {
                bh bhVar = (bh) it2.next();
                if (bhVar.b > this.b) {
                    this.b = bhVar.b;
                }
                if (bhVar.b < this.c) {
                    this.c = bhVar.b;
                }
                if (bhVar.a > this.d) {
                    this.d = bhVar.a;
                }
            }
        }
        a(arrayList2);
    }

    private void a(ArrayList arrayList) {
        boolean z;
        int i;
        int size = arrayList.size();
        ad adVar = new ad(size);
        int[] iArr = new int[size];
        int i2 = 0;
        do {
            i2++;
            if (i2 > 1000000) {
                throw new RuntimeException("loopIndex: " + i2);
            }
            boolean z2 = true;
            for (int i3 = 0; i3 < size; i3++) {
                bi biVar = (bi) arrayList.get(i3);
                if (iArr[i3] < biVar.size()) {
                    bh bhVar = (bh) biVar.get(iArr[i3]);
                    int i4 = bhVar.a;
                    i = adVar.a;
                    if (i4 <= i) {
                        adVar.a(i3, bhVar.b);
                        int i5 = i3;
                        iArr[i5] = iArr[i5] + 1;
                        z2 = false;
                    }
                }
            }
            z = z2;
            int i6 = Integer.MAX_VALUE;
            if (z2) {
                this.e.add(adVar);
                for (int i7 = 0; i7 < size; i7++) {
                    bi biVar2 = (bi) arrayList.get(i7);
                    if (iArr[i7] < biVar2.size()) {
                        bh bhVar2 = (bh) biVar2.get(iArr[i7]);
                        if (bhVar2.a < i6) {
                            i6 = bhVar2.a;
                            z = false;
                        }
                    }
                }
                adVar = new ad(i6, adVar);
            }
        } while (!z);
    }
}