package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public class C0736bl {

    /* renamed from: a */
    C1136m f4631a = new C1136m();

    /* renamed from: a */
    public void m2454a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2) {
        if (this.f4631a.f7109a > 0) {
            Iterator it = this.f4631a.iterator();
            while (it.hasNext()) {
                ((AbstractC0735bk) it.next()).m2455a(abstractC0244am, abstractC0244am2, null);
            }
        }
    }
}