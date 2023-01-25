package com.corrodinggames.rts.gameFramework.status;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/i.class */
class C1088i {

    /* renamed from: a */
    boolean f6930a;

    /* renamed from: b */
    C1136m f6931b = new C1136m();

    /* renamed from: c */
    final /* synthetic */ C1085f f6932c;

    C1088i(C1085f c1085f) {
        this.f6932c = c1085f;
    }

    /* renamed from: a */
    public void m760a(InterfaceC0303as interfaceC0303as, int i) {
        InterfaceC0303as m3527c = C0458l.m3527c(interfaceC0303as);
        if (m3527c != null) {
            interfaceC0303as = m3527c;
        }
        m759b(interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m759b(InterfaceC0303as interfaceC0303as, int i) {
        Iterator it = this.f6931b.iterator();
        while (it.hasNext()) {
            C1089j c1089j = (C1089j) it.next();
            if (c1089j.f6933a == interfaceC0303as) {
                c1089j.f6934b += i;
                return;
            }
        }
        C1089j c1089j2 = new C1089j(this);
        c1089j2.f6933a = interfaceC0303as;
        c1089j2.f6934b = i;
        this.f6931b.add(c1089j2);
    }

    /* renamed from: a */
    public void m761a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = 0;
        C0136a m4365k = PlayerData.m4365k(1);
        if (m4365k == null) {
            GameEngine.m5460e("Warning: Creating missing wave team AI");
            m4365k = new C0136a(1);
            m4365k.team = 100;
            m4365k.f1346U = true;
        }
        Iterator it = this.f6931b.iterator();
        while (it.hasNext()) {
            C1089j c1089j = (C1089j) it.next();
            for (int i2 = 0; i2 < c1089j.f6934b; i2++) {
                AbstractC0244am mo3564a = c1089j.f6933a.mo3564a();
                mo3564a.f7172eo = f + C0773f.m2208a(-85, 85, i + 0);
                mo3564a.f7173ep = f2 + C0773f.m2208a(-85, 85, i + 1);
                mo3564a.f1623cg = C0773f.m2208a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                mo3564a.mo2928b(m4365k);
                if (mo3564a.f7172eo < 0.0f) {
                    mo3564a.f7172eo = 0.0f;
                }
                if (mo3564a.f7173ep < 0.0f) {
                    mo3564a.f7173ep = 0.0f;
                }
                if (mo3564a.f7172eo > gameEngine.f6323bL.m4601i()) {
                    mo3564a.f7172eo = gameEngine.f6323bL.m4601i();
                }
                if (mo3564a.f7173ep > gameEngine.f6323bL.m4600j()) {
                    mo3564a.f7173ep = gameEngine.f6323bL.m4600j();
                }
                if (i2 == 0) {
                    gameEngine.f6334bW.m1768a(mo3564a);
                }
            }
        }
    }

    public String toString() {
        if (this.f6931b.size() == 0) {
            return "No units";
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = this.f6931b.iterator();
        while (it.hasNext()) {
            C1089j c1089j = (C1089j) it.next();
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = (str + c1089j.f6934b + "x ") + c1089j.f6933a.mo3521e();
        }
        return str;
    }
}