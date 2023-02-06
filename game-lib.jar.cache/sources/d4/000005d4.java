package com.corrodinggames.rts.gameFramework.status;

import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/b.class */
public class b {
    m a = new m();
    boolean b;

    public void a(a aVar) {
        this.a.add(aVar);
    }

    public boolean a() {
        return this.a.a > 0;
    }

    public boolean b() {
        boolean z = false;
        boolean z2 = true;
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            if (((a) it.next()).j) {
                z = true;
            } else {
                z2 = false;
            }
        }
        if (this.b && !z2) {
            z = false;
        }
        return z;
    }
}