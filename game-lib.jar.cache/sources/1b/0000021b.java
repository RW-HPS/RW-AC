package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/l.class */
public class C0333l extends AbstractC0321a {

    /* renamed from: a */
    boolean f2005a;

    /* renamed from: b */
    C0454h f2006b;

    /* renamed from: c */
    C0454h f2007c;

    /* renamed from: d */
    C0454h f2008d;

    /* renamed from: e */
    C0454h f2009e;

    /* renamed from: a */
    public static void m4095a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1107ab.m685a(str, str2 + "resetToDefaultTags", (Boolean) false).booleanValue();
        C0454h m705a = c1107ab.m705a(c0458l, str, str2 + "temporarilyAddTags", (C0454h) null);
        C0454h m705a2 = c1107ab.m705a(c0458l, str, str2 + "temporarilyRemoveTags", (C0454h) null);
        if (booleanValue || m705a != null || m705a2 != null) {
            C0333l c0333l = new C0333l();
            c0333l.f2005a = booleanValue;
            c0333l.f2006b = m705a;
            c0333l.f2007c = m705a2;
            c0339d.f2112ac.add(c0333l);
        }
        C0454h m705a3 = c1107ab.m705a(c0458l, str, str2 + "addGlobalTeamTags", (C0454h) null);
        C0454h m705a4 = c1107ab.m705a(c0458l, str, str2 + "removeGlobalTeamTags", (C0454h) null);
        if (m705a3 != null || m705a4 != null) {
            C0333l c0333l2 = new C0333l();
            c0333l2.f2008d = m705a3;
            c0333l2.f2009e = m705a4;
            c0339d.f2112ac.add(c0333l2);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f2005a) {
            c0456j.m3578j(false);
        }
        if (this.f2007c != null) {
            c0456j.m3636b(this.f2007c);
        }
        if (this.f2006b != null) {
            c0456j.m3644a(this.f2006b);
        }
        if (this.f2008d != null) {
            c0456j.f1614bX.m4414b(this.f2008d);
        }
        if (this.f2009e != null) {
            c0456j.f1614bX.m4398c(this.f2009e);
            return true;
        }
        return true;
    }
}