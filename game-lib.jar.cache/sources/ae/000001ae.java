package com.corrodinggames.rts.game.units.a;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.ae;
import com.corrodinggames.rts.gameFramework.ad;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/s.class */
public abstract class s implements Comparable {
    public float g = -999.0f;
    public a h = a.a;
    public static final c i = c.a;
    private c a;
    private com.corrodinggames.rts.game.units.custom.d.b b;

    public abstract String b();

    public abstract String a();

    public abstract int c();

    public abstract int b(am amVar, boolean z);

    /* renamed from: i */
    public abstract as mo3i();

    public abstract boolean g();

    public abstract u e();

    public abstract t f();

    public float m_() {
        if (this instanceof o) {
            return -100.0f;
        }
        if (this.g != -999.0f) {
            return this.g;
        }
        as mo3i = mo3i();
        if (mo3i != null && g()) {
            return mo3i.g();
        }
        return 1.0f;
    }

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(s sVar) {
        if (sVar == null) {
            return 0;
        }
        float m_ = m_() - sVar.m_();
        if (m_ < 0.0f) {
            return -1;
        }
        return m_ > 0.0f ? 1 : 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || obj.getClass() != getClass() || !this.a.equals(((s) obj).a)) {
            return false;
        }
        return true;
    }

    public static final boolean b(c cVar) {
        if (cVar == null || cVar == i) {
            return true;
        }
        return false;
    }

    public static final boolean c(c cVar) {
        return !b(cVar);
    }

    public static boolean a(s sVar, s sVar2) {
        return sVar == sVar2;
    }

    public final boolean d(c cVar) {
        return this.a == cVar;
    }

    public s(int i2) {
        a(String.valueOf(i2));
    }

    public s(String str) {
        a(str);
    }

    public s(c cVar) {
        e(cVar);
    }

    public final void a(String str) {
        this.a = c.a(str);
    }

    public final void e(c cVar) {
        this.a = cVar;
    }

    public final c N() {
        return this.a;
    }

    public c z() {
        return N();
    }

    public final String O() {
        if (this.a == null) {
            return "<null index>";
        }
        return this.a.a();
    }

    public com.corrodinggames.rts.game.units.custom.h P() {
        return null;
    }

    public String d(am amVar) {
        return b();
    }

    public String e(am amVar) {
        return a();
    }

    public com.corrodinggames.rts.game.units.custom.d.b B() {
        com.corrodinggames.rts.game.units.custom.d.b a = this.h.a();
        if (a != null) {
            return a;
        }
        int c = c();
        if (c == 0) {
            return com.corrodinggames.rts.game.units.custom.d.b.a;
        }
        if (this.b == null || this.b.a() != c) {
            this.b = com.corrodinggames.rts.game.units.custom.d.b.a(c);
        }
        return this.b;
    }

    public com.corrodinggames.rts.game.units.custom.d.b r_() {
        if (this.h.b() != null) {
            return this.h.b();
        }
        return null;
    }

    public boolean n_() {
        return false;
    }

    public boolean g(am amVar) {
        return this.h.b(amVar);
    }

    public String j(am amVar) {
        return this.h.c(amVar);
    }

    public void a(am amVar, am amVar2) {
        this.h.a(amVar, amVar2);
    }

    public boolean d(am amVar, boolean z) {
        return true;
    }

    public boolean k(am amVar) {
        return false;
    }

    public boolean l(am amVar) {
        return false;
    }

    public boolean a(am amVar, boolean z) {
        if (g(amVar) || com.corrodinggames.rts.game.units.g.e.a(amVar, N()) > 0) {
            return false;
        }
        if (z) {
            return B().c(amVar, Q());
        }
        return B().b(amVar);
    }

    public boolean r(am amVar) {
        return b(amVar);
    }

    public boolean u(am amVar) {
        return this.h.a(amVar);
    }

    public boolean b(am amVar) {
        return this.h.a(amVar, false);
    }

    public boolean a(am amVar, PlayerData playerData) {
        return false;
    }

    public boolean u() {
        return false;
    }

    public boolean h() {
        return false;
    }

    public boolean C() {
        return false;
    }

    public boolean D() {
        return true;
    }

    public boolean A() {
        return false;
    }

    public as y() {
        return null;
    }

    public as E() {
        return null;
    }

    public boolean F() {
        return false;
    }

    public int t() {
        return 1;
    }

    public boolean o() {
        return false;
    }

    public boolean m(am amVar) {
        return false;
    }

    public boolean n(am amVar) {
        return false;
    }

    public com.corrodinggames.rts.game.units.custom.a.e v(am amVar) {
        return null;
    }

    public String d() {
        String str = null;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i2 = 0;
        am[] a = gameEngine.bS.bZ.a();
        int size = gameEngine.bS.bZ.size();
        for (int i3 = 0; i3 < size; i3++) {
            am amVar = a[i3];
            if (amVar instanceof com.corrodinggames.rts.game.units.y) {
                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) amVar;
                if (str == null) {
                    str = d(yVar);
                }
                int b = b(yVar, true);
                if (b != -1 && b != 0) {
                    i2 += b;
                }
            }
        }
        if (str == null) {
            str = b();
        }
        if (i2 != -1 && i2 != 0) {
            str = str + " (" + i2 + ")";
        }
        return str;
    }

    public boolean h_() {
        return true;
    }

    public String w(am amVar) {
        return d(amVar);
    }

    public void a(am amVar, ae aeVar, Paint paint, Paint paint2) {
        String w;
        Paint paint3 = aeVar.g;
        if (paint != null) {
            aeVar.a(paint);
        }
        if (h_() && (w = w(amVar)) != null && !w.equals(VariableScope.nullOrMissingString)) {
            aeVar.b(w);
        }
        if (paint != null) {
            aeVar.a(paint3);
        }
        t f = f();
        com.corrodinggames.rts.game.units.custom.d.b B = B();
        if (!B.c() && f != t.infoOnlyStockpile) {
            aeVar.b(" (");
            am amVar2 = null;
            int i2 = 0;
            if (paint2 != null) {
                amVar2 = amVar;
                i2 = paint2.e();
            }
            B.a(aeVar, false, true, 5, true, amVar2, i2);
            aeVar.b(")");
        }
        com.corrodinggames.rts.game.units.custom.d.b r_ = r_();
        if (r_ != null && !r_.c() && f != t.infoOnlyStockpile) {
            aeVar.b(" (");
            r_.a(aeVar, false, true, 5, true, null, 0);
            aeVar.b(")");
        }
    }

    public void a(am amVar, ae aeVar) {
        String a = com.corrodinggames.rts.gameFramework.Interface.a.a(this, false);
        if (a != null && !VariableScope.nullOrMissingString.equals(a)) {
            aeVar.b("\n" + a.trim());
        }
        String e = e(amVar);
        if (e != null && !VariableScope.nullOrMissingString.equals(e)) {
            aeVar.b("\n" + e.trim());
        }
    }

    public boolean c(am amVar, boolean z) {
        return false;
    }

    public void f(am amVar) {
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e j() {
        if (f() == t.upgrade) {
            return GameEngine.getGameEngine().bS.bk;
        }
        return null;
    }

    public com.corrodinggames.rts.gameFramework.unitAction.e h(am amVar) {
        return null;
    }

    public int J() {
        return Color.a(100, 255, 255, 255);
    }

    public Rect v() {
        return null;
    }

    public am i(am amVar) {
        return null;
    }

    public boolean s(am amVar) {
        return true;
    }

    public boolean t(am amVar) {
        return true;
    }

    public boolean a(am amVar) {
        return this.h.d(amVar);
    }

    public boolean s() {
        return false;
    }

    public boolean o(am amVar) {
        return true;
    }

    public boolean G() {
        return false;
    }

    public void c(am amVar) {
    }

    public float l() {
        return 1.0f;
    }

    public int m() {
        return -1;
    }

    public boolean H() {
        return false;
    }

    public boolean I() {
        return false;
    }

    public boolean x() {
        return false;
    }

    public float p(am amVar) {
        return -1.0f;
    }

    public ArrayList q(am amVar) {
        return null;
    }

    public ad M() {
        return null;
    }

    public boolean o_() {
        return false;
    }

    public boolean Q() {
        return false;
    }

    public void a(com.corrodinggames.rts.game.units.y yVar) {
    }

    public boolean a(float f, float f2) {
        return false;
    }

    public boolean p() {
        return false;
    }
}