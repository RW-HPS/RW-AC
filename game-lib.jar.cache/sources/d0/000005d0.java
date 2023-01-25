package com.corrodinggames.rts.gameFramework.status;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.status.p047a.AbstractC1067a;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a.class */
public class C1066a {

    /* renamed from: a */
    public String f6812a;

    /* renamed from: b */
    public String f6813b;

    /* renamed from: c */
    public String f6814c;

    /* renamed from: g */
    public EnumC1073e f6815g;

    /* renamed from: h */
    public boolean f6816h;

    /* renamed from: i */
    public boolean f6817i;

    /* renamed from: j */
    public boolean f6818j;

    /* renamed from: k */
    public int f6819k;

    /* renamed from: l */
    public int f6820l;

    /* renamed from: m */
    public boolean f6821m;

    /* renamed from: p */
    public int f6822p;

    /* renamed from: t */
    public C0172a f6823t;

    /* renamed from: v */
    public C0418bp f6824v;

    /* renamed from: w */
    public float f6825w;

    /* renamed from: x */
    public float f6826x;

    /* renamed from: y */
    public PlayerData f6827y;

    /* renamed from: z */
    public C0404bb f6828z;

    /* renamed from: A */
    public C0404bb f6829A;

    /* renamed from: B */
    public Paint f6830B;

    /* renamed from: C */
    public boolean f6831C;

    /* renamed from: d */
    public C1070b f6832d = new C1070b();

    /* renamed from: e */
    public C1070b f6833e = new C1070b();

    /* renamed from: f */
    public C1136m f6834f = new C1136m();

    /* renamed from: n */
    public int f6835n = -1;

    /* renamed from: o */
    public int f6836o = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f6837q = -1;

    /* renamed from: r */
    public int f6838r = -1;

    /* renamed from: s */
    public int f6839s = -1;

    /* renamed from: u */
    public boolean f6840u = false;

    /* renamed from: a */
    public void m828a(AbstractC1067a abstractC1067a) {
        this.f6834f.add(abstractC1067a);
    }

    /* renamed from: a */
    public void m827a(String str) {
        this.f6823t.m4669b(str);
    }

    /* renamed from: b */
    public String m817b(String str) {
        return this.f6823t.m4669b(str);
    }

    /* renamed from: a */
    public String m822a(String str, String str2) {
        return this.f6823t.m4672a(str, str2);
    }

    /* renamed from: c */
    public boolean m814c(String str) {
        return this.f6823t.m4669b(str) != null;
    }

    /* renamed from: a */
    public int m825a(String str, int i) {
        String m822a = m822a(str, (String) null);
        if (m822a == null) {
            return i;
        }
        try {
            return Integer.parseInt(m822a);
        } catch (NumberFormatException e) {
            throw m809f(str + ": Unexpected integer value:'" + m822a + "'");
        }
    }

    /* renamed from: b */
    public int m816b(String str, int i) {
        double d;
        String m817b = m817b(str);
        if (m817b == null) {
            return i;
        }
        if (m817b.endsWith("ms")) {
            m817b = m817b.substring(0, m817b.length() - 2);
            d = 1.0d;
        } else if (m817b.endsWith("s")) {
            m817b = m817b.substring(0, m817b.length() - 1);
            d = 1000.0d;
        } else {
            d = 1.0d;
        }
        try {
            return (int) (Double.parseDouble(m817b) * d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw m809f(str + ": Unexpected time:'" + m817b + "'");
        }
    }

    /* renamed from: a */
    public float m826a(String str, float f) {
        String m822a = m822a(str, (String) null);
        if (m822a == null) {
            return f;
        }
        try {
            return Float.parseFloat(m822a);
        } catch (NumberFormatException e) {
            throw m809f(str + ": Unexpected float value:'" + m822a + "'");
        }
    }

    /* renamed from: d */
    public Integer m811d(String str) {
        String m822a = m822a(str, (String) null);
        if (m822a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m822a));
        } catch (NumberFormatException e) {
            throw m809f(str + ": Unexpected integer value:'" + m822a + "'");
        }
    }

    /* renamed from: e */
    public Boolean m810e(String str) {
        String m822a = m822a(str, (String) null);
        if (m822a == null) {
            return null;
        }
        if (m822a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m822a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m809f(str + ": Unexpected boolean value:'" + m822a + "'");
    }

    /* renamed from: a */
    public boolean m821a(String str, String str2, boolean z) {
        Boolean m810e = m810e(str);
        if (m810e != null) {
            return m810e.booleanValue();
        }
        Boolean m810e2 = m810e(str2);
        if (m810e2 != null) {
            return m810e2.booleanValue();
        }
        return z;
    }

    /* renamed from: a */
    public boolean m820a(String str, boolean z) {
        String m822a = m822a(str, (String) null);
        if (m822a == null) {
            return z;
        }
        if (m822a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m822a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m809f(str + ": Unexpected boolean value:'" + m822a + "'");
    }

    /* renamed from: c */
    public int m813c(String str, int i) {
        String m817b = m817b(str);
        if (m817b == null) {
            return i;
        }
        if (m817b.equals(VariableScope.nullOrMissingString)) {
            throw m809f(str + ": Unknown color:" + m817b);
        }
        try {
            return Color.m5242a(m817b);
        } catch (IllegalArgumentException e) {
            throw m809f(str + ": Unknown color:" + m817b);
        }
    }

    /* renamed from: a */
    public C0404bb m824a(String str, C0404bb c0404bb) {
        return this.f6823t.m4673a(str, c0404bb);
    }

    /* renamed from: a */
    public boolean m829a(AbstractC0244am abstractC0244am) {
        return this.f6823t.m4675a(abstractC0244am);
    }

    /* renamed from: f */
    public C0179f m809f(String str) {
        return m823a(str, (Exception) null);
    }

    /* renamed from: a */
    public C0179f m823a(String str, Exception exc) {
        String str2 = "MapTrigger-Error (" + this.f6812a + " id:" + this.f6813b + "): " + str;
        GameNetEngine.m1468g(str2);
        if (exc == null) {
            return new C0179f(str2);
        }
        return new C0179f(str2, exc);
    }

    /* renamed from: g */
    public void m808g(String str) {
        GameNetEngine.m1468g("MapTrigger-Error (" + this.f6812a + " id:" + this.f6813b + " type:" + this.f6815g + "): " + str);
    }

    /* renamed from: h */
    public void m807h(String str) {
        GameEngine.m5460e("MapTrigger-Debug (" + this.f6813b + " type:" + this.f6815g + "): " + str);
    }

    /* renamed from: a */
    public PlayerData m830a() {
        return this.f6827y;
    }

    /* renamed from: b */
    public int m819b() {
        return (int) this.f6823t.f777j.m5147d();
    }

    /* renamed from: c */
    public int m815c() {
        return (int) this.f6823t.f777j.m5146e();
    }

    /* renamed from: b */
    public boolean m818b(AbstractC0244am abstractC0244am) {
        PlayerData m830a = m830a();
        if (m830a != null && abstractC0244am.f1614bX != m830a) {
            return false;
        }
        if (m814c("onlyIfEmpty") && abstractC0244am.mo3245cr() && (abstractC0244am instanceof InterfaceC0242ak) && ((InterfaceC0242ak) abstractC0244am).mo2916bB() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m812d() {
        boolean z;
        int i = GameEngine.getGameEngine().f6315by;
        boolean z2 = true;
        boolean z3 = false;
        if (!this.f6821m && this.f6838r != -1) {
            if (this.f6838r <= i) {
                z3 = true;
                this.f6821m = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6832d.m800a()) {
            if (this.f6832d.m798b()) {
                z3 = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6834f.f7109a > 0) {
            Iterator it = this.f6834f.iterator();
            while (it.hasNext()) {
                AbstractC1067a abstractC1067a = (AbstractC1067a) it.next();
                if (abstractC1067a.m806a(this)) {
                    if (abstractC1067a.mo803b(this)) {
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.f6816h) {
            z = z3 && z2;
        } else {
            z = z3;
            if (z2) {
                z = true;
            }
        }
        if (z) {
            if (this.f6835n == -1) {
                this.f6835n = i;
            }
            if (this.f6839s <= 0 || i >= this.f6835n + this.f6839s) {
                return true;
            }
            return false;
        }
        this.f6835n = -1;
        return false;
    }
}