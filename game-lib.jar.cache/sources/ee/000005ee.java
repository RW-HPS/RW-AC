package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/q.class */
public class C1096q {

    /* renamed from: a */
    C1136m f6951a = new C1136m();

    /* renamed from: a */
    public void m752a(Runnable runnable) {
        this.f6951a.add(runnable);
    }

    /* renamed from: a */
    public void m753a() {
        if (this.f6951a.f7109a > 0) {
            Iterator it = this.f6951a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* renamed from: b */
    public void m751b() {
        if (this.f6951a.f7109a > 0) {
            Iterator it = this.f6951a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f6951a.clear();
        }
    }
}