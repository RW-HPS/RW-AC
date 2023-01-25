package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0349ag;
import com.corrodinggames.rts.game.units.custom.C0352aj;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class C0327f extends AbstractC0321a {

    /* renamed from: a */
    C0352aj f1966a;

    /* renamed from: b */
    C0352aj f1967b;

    /* renamed from: c */
    C0352aj f1968c;

    /* renamed from: d */
    C0352aj f1969d;

    /* renamed from: e */
    C0352aj f1970e;

    /* renamed from: f */
    C0352aj f1971f;

    /* renamed from: g */
    static final Pattern f1972g = Pattern.compile("%\\{([^\\]]*?)\\}");

    /* renamed from: a */
    public static void m4102a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        C0352aj m4038a = C0349ag.m4038a(c0458l, c1107ab, str, "showMessageToPlayer", (String) null);
        C0352aj m4038a2 = C0349ag.m4038a(c0458l, c1107ab, str, "showMessageToAllPlayers", (String) null);
        C0352aj m4038a3 = C0349ag.m4038a(c0458l, c1107ab, str, "showMessageToAllEnemyPlayers", (String) null);
        C0352aj m4038a4 = C0349ag.m4038a(c0458l, c1107ab, str, "showQuickWarLogToPlayer", (String) null);
        C0352aj m4038a5 = C0349ag.m4038a(c0458l, c1107ab, str, "showQuickWarLogToAllPlayers", (String) null);
        C0352aj m4038a6 = C0349ag.m4038a(c0458l, c1107ab, str, "debugMessage", (String) null);
        if (m4038a != null || m4038a2 != null || m4038a3 != null || m4038a4 != null || m4038a5 != null || m4038a6 != null) {
            C0327f c0327f = new C0327f();
            c0327f.f1966a = m4038a;
            c0327f.f1967b = m4038a2;
            c0327f.f1968c = m4038a3;
            c0327f.f1969d = m4038a4;
            c0327f.f1970e = m4038a5;
            c0327f.f1971f = m4038a6;
            c0339d.f2112ac.add(c0327f);
        }
    }

    /* renamed from: a */
    public String m4103a(C0456j c0456j, String str) {
        if (str == null) {
            str = null;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.f1966a != null && c0456j.f1614bX == gameEngine.f6312bs) {
            GameNetEngine.m1564a((String) null, m4103a(c0456j, this.f1966a.m3982b(c0456j)));
        }
        if (this.f1967b != null) {
            GameNetEngine.m1564a((String) null, m4103a(c0456j, this.f1967b.m3982b(c0456j)));
        }
        if (this.f1968c != null && gameEngine.f6312bs != null && c0456j.f1614bX.m4402c(gameEngine.f6312bs)) {
            GameNetEngine.m1564a((String) null, m4103a(c0456j, this.f1968c.m3982b(c0456j)));
        }
        if (this.f1969d != null && c0456j.f1614bX == gameEngine.f6312bs) {
            gameEngine.f6330bS.f5265i.m1944a(m4103a(c0456j, this.f1969d.m3982b(c0456j)));
        }
        if (this.f1970e != null) {
            gameEngine.f6330bS.f5265i.m1944a(m4103a(c0456j, this.f1970e.m3982b(c0456j)));
        }
        if (this.f1971f != null && gameEngine.f6313bv && gameEngine.f6444bl) {
            GameNetEngine.m1564a((String) null, c0456j.mo3589dt().mo3513i() + "(" + c0456j.f7166eh + ") Debug: " + m4103a(c0456j, this.f1971f.m3982b(c0456j)));
            return true;
        }
        return true;
    }
}