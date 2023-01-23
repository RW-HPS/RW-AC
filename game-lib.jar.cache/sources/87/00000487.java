package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bm.class */
public class bm extends bo {
    public bm(ArrayList arrayList) {
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bo boVar = (bo) it.next();
            this.f456a += boVar.f456a;
            this.b += boVar.b;
            this.c += boVar.c;
            this.d += boVar.d;
            this.e += boVar.e;
            this.f += boVar.f;
            this.g += boVar.g;
            this.h += boVar.h;
            this.i += boVar.i;
            this.j = Math.max(this.j, boVar.j);
            this.k += boVar.k;
            this.l.a(boVar.l);
        }
    }
}