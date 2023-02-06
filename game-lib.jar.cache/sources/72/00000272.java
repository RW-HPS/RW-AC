package com.corrodinggames.rts.game.units.custom;

import java.util.Collections;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c.class */
public final class c {
    d a;
    int b;
    String c;
    float d;
    public a[] e;
    private com.corrodinggames.rts.gameFramework.utility.m g = new com.corrodinggames.rts.gameFramework.utility.m();
    public final boolean f = false;

    public b a() {
        b bVar = null;
        if (this.g.size() > 0) {
            bVar = (b) this.g.get(this.g.size() - 1);
            if (bVar.h) {
                bVar = null;
            }
        }
        return bVar;
    }

    public void a(j jVar, float f, float f2, boolean z) {
        if (z || f2 <= f) {
            return;
        }
        a[] aVarArr = this.e;
        int length = aVarArr.length;
        int i = -1;
        while (i + 1 < length && f > aVarArr[i + 1].a) {
            i++;
        }
        int i2 = i;
        while (i2 + 1 < length && f2 > aVarArr[i2 + 1].a) {
            i2++;
        }
        if (i2 <= i) {
            return;
        }
        for (int i3 = i + 1; i3 <= i2; i3++) {
            ((b) aVarArr[i3]).a(jVar);
        }
    }

    public void b() {
        b a;
        if (this.a == d.event && (a = a()) != null) {
            a.finalize();
        }
    }

    public void a(l lVar, float f, String str, String str2) {
        if (this.a == d.event) {
            b a = a();
            if (a == null) {
                a = new b(f, 0.0f);
                this.g.add(a);
            }
            a.a(lVar, str, str2);
            return;
        }
        try {
            a(f, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            throw new bo("Failed to parse float:" + str2);
        }
    }

    public void a(float f, float f2) {
        if (this.a == d.event) {
            throw new bo("Adding key frame value to event set");
        }
        if (this.g.size() == 0 && f > 0.0f && f2 != 0.0f) {
            this.g.add(new a(0.0f, 0.0f));
        }
        this.g.add(new a(f, f2));
    }

    public void a(float f) {
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            ((a) it.next()).a *= f;
        }
    }

    public void c() {
        Collections.sort(this.g);
        a aVar = null;
        Iterator it = this.g.iterator();
        while (it.hasNext()) {
            a aVar2 = (a) it.next();
            if (aVar != null) {
                aVar2.c = 1.0f / (aVar2.a - aVar.a);
                aVar2.d = aVar2.b - aVar.b;
            }
            aVar = aVar2;
            this.d = aVar2.a;
        }
        this.e = (a[]) this.g.toArray(new a[0]);
        this.g = null;
    }

    public float b(float f) {
        a[] aVarArr = this.e;
        int length = aVarArr.length;
        if (length == 1 || f <= aVarArr[0].a) {
            return aVarArr[0].b;
        }
        if (f >= this.d) {
            return aVarArr[length - 1].b;
        }
        int i = 1;
        while (f > aVarArr[i].a) {
            i++;
            if (i >= length) {
                return aVarArr[length - 1].b;
            }
        }
        a aVar = aVarArr[i - 1];
        a aVar2 = aVarArr[i];
        return aVar.b + (aVar2.d * (f - aVar.a) * aVar2.c);
    }
}