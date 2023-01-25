package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/c.class */
public class C0158c {

    /* renamed from: a */
    HashMap f647a = new HashMap();

    /* renamed from: b */
    HashMap f648b = new HashMap();

    /* renamed from: c */
    HashMap f649c = new HashMap();

    /* renamed from: a */
    public Integer m4789a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2) {
        if (z) {
            return (Integer) this.f649c.get(interfaceC0303as);
        }
        if (!z2) {
            return (Integer) this.f648b.get(interfaceC0303as);
        }
        return (Integer) this.f647a.get(interfaceC0303as);
    }

    /* renamed from: a */
    public void m4788a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2, Integer num) {
        if (z) {
            this.f649c.put(interfaceC0303as, num);
        } else if (!z2) {
            this.f648b.put(interfaceC0303as, num);
        } else {
            this.f647a.put(interfaceC0303as, num);
        }
    }

    /* renamed from: a */
    public void m4792a() {
        this.f647a.clear();
        this.f648b.clear();
    }

    /* renamed from: a */
    public void m4791a(InterfaceC0303as interfaceC0303as) {
        this.f647a.put(interfaceC0303as, null);
        this.f648b.put(interfaceC0303as, null);
    }

    /* renamed from: a */
    public void m4790a(AbstractC0629y abstractC0629y) {
        this.f649c.put(abstractC0629y.f1694dz, null);
    }

    /* renamed from: b */
    public void m4787b() {
        this.f649c.clear();
    }
}