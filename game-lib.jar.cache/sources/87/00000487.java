package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.bm */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bm.class */
public class C0737bm extends C0739bo {
    public C0737bm(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0739bo c0739bo = (C0739bo) it.next();
            this.f4634a += c0739bo.f4634a;
            this.f4635b += c0739bo.f4635b;
            this.f4636c += c0739bo.f4636c;
            this.f4637d += c0739bo.f4637d;
            this.f4638e += c0739bo.f4638e;
            this.f4639f += c0739bo.f4639f;
            this.f4640g += c0739bo.f4640g;
            this.f4641h += c0739bo.f4641h;
            this.f4642i += c0739bo.f4642i;
            this.f4643j = Math.max(this.f4643j, c0739bo.f4643j);
            this.f4644k += c0739bo.f4644k;
            this.f4645l.m2447a(c0739bo.f4645l);
        }
    }
}