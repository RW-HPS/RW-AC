package com.corrodinggames.rts.gameFramework.status;

import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/b.class */
public class C1070b {

    /* renamed from: a */
    C1136m f6859a = new C1136m();

    /* renamed from: b */
    boolean f6860b;

    /* renamed from: a */
    public void m799a(C1066a c1066a) {
        this.f6859a.add(c1066a);
    }

    /* renamed from: a */
    public boolean m800a() {
        return this.f6859a.f7109a > 0;
    }

    /* renamed from: b */
    public boolean m798b() {
        boolean z = false;
        boolean z2 = true;
        Iterator it = this.f6859a.iterator();
        while (it.hasNext()) {
            if (((C1066a) it.next()).f6818j) {
                z = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6860b && !z2) {
            z = false;
        }
        return z;
    }
}