package com.corrodinggames.rts.game.units.custom.p020d;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.d.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/d/c.class */
public class C0430c extends AbstractC0428a {

    /* renamed from: a */
    public final C1136m f2736a = new C1136m();

    /* renamed from: b */
    boolean f2737b;

    /* renamed from: c */
    public int f2738c;

    /* renamed from: d */
    public int f2739d;

    /* renamed from: e */
    public int f2740e;

    /* renamed from: f */
    public int f2741f;

    /* renamed from: a */
    public static C0430c m3804a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0430c c0430c) {
        String m666b = c1107ab.m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0430c;
        }
        try {
            return m3803a(c0458l, m666b);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public static C0430c m3803a(C0458l c0458l, String str) {
        return m3802a(c0458l, str, false);
    }

    /* renamed from: a */
    public static C0430c m3802a(C0458l c0458l, String str, boolean z) {
        String trim;
        String substring;
        C0430c c0430c = new C0430c();
        Iterator it = C1118al.m583a(str, ",", "|", false).iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            int m584a = C1118al.m584a(str2, "=", ":");
            if (m584a == -1) {
                if (!z) {
                    throw new C0417bo("Unknown price format:" + str);
                }
                trim = "credits";
                substring = str2;
            } else {
                trim = str2.substring(0, m584a).trim();
                substring = str2.substring(m584a + 1);
            }
            if (trim.equals("hasFlag")) {
                c0430c.f2740e = C0429b.m3849a(c0430c.f2740e, substring);
            } else if (trim.equals("hasMissingFlag")) {
                c0430c.f2741f = C0429b.m3849a(c0430c.f2741f, substring);
            } else if (trim.equals("setFlag")) {
                c0430c.f2738c = C0429b.m3849a(c0430c.f2738c, substring);
            } else if (trim.equals("unsetFlag")) {
                c0430c.f2739d = C0429b.m3849a(c0430c.f2739d, substring);
            } else {
                C0433a m3510j = c0458l.m3510j(trim);
                if (m3510j == null) {
                    throw new C0417bo("Could not find resource type:" + trim + " from [" + str + "]");
                }
                LogicBoolean parseNumberBlock = LogicBooleanLoader.parseNumberBlock(c0458l, substring);
                if (parseNumberBlock == null) {
                    throw new C0417bo("Value missing for:" + trim + " from [" + str + "]");
                }
                if (!(parseNumberBlock instanceof LogicBoolean.StaticValueBoolean)) {
                    c0430c.f2737b = true;
                }
                c0430c.f2736a.add(new C0431d(m3510j, parseNumberBlock));
            }
        }
        return c0430c;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: b */
    public boolean mo3800b(AbstractC0244am abstractC0244am) {
        return mo3799b(abstractC0244am, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: b */
    public boolean mo3799b(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            return false;
        }
        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
        int i = this.f2736a.f7109a;
        Object[] m535a = this.f2736a.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0431d c0431d = (C0431d) m535a[i2];
            if (c0431d.f2744c != null) {
                d2 = c0431d.f2744c.readNumber(abstractC0629y) * d;
            } else {
                d2 = c0431d.f2743b * d;
            }
            if (d2 > 0.0d && c0431d.f2742a.mo3763a(abstractC0629y) < d2) {
                return false;
            }
        }
        if (!m3795g(abstractC0629y)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public void m3798d(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            GameEngine.m976n("DynamicResourcePrice doesn't work on: " + abstractC0244am.mo3079c());
            return;
        }
        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
        int i = this.f2736a.f7109a;
        Object[] m535a = this.f2736a.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0431d c0431d = (C0431d) m535a[i2];
            if (c0431d.f2744c != null) {
                d = c0431d.f2744c.readNumber(abstractC0629y);
            } else {
                d = c0431d.f2743b;
            }
            c0431d.f2742a.mo3762a(abstractC0629y, d);
        }
        m3796f(abstractC0629y);
        C0429b.m3816d(abstractC0629y);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: a */
    public void mo3806a(AbstractC0244am abstractC0244am) {
        mo3805a(abstractC0244am, 1.0d);
    }

    @Override // com.corrodinggames.rts.game.units.custom.p020d.AbstractC0428a
    /* renamed from: a */
    public void mo3805a(AbstractC0244am abstractC0244am, double d) {
        double d2;
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            GameEngine.m976n("DynamicResourcePrice doesn't work on: " + abstractC0244am.mo3079c());
            return;
        }
        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
        int i = this.f2736a.f7109a;
        Object[] m535a = this.f2736a.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0431d c0431d = (C0431d) m535a[i2];
            if (c0431d.f2744c != null) {
                d2 = c0431d.f2744c.readNumber(abstractC0629y);
            } else {
                d2 = c0431d.f2743b;
            }
            c0431d.f2742a.mo3761b(abstractC0629y, (-d2) * d);
        }
        m3796f(abstractC0629y);
        C0429b.m3816d(abstractC0629y);
    }

    /* renamed from: e */
    public void m3797e(AbstractC0244am abstractC0244am) {
        double d;
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            GameEngine.m976n("DynamicResourcePrice doesn't work on: " + abstractC0244am.mo3079c());
            return;
        }
        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
        int i = this.f2736a.f7109a;
        Object[] m535a = this.f2736a.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0431d c0431d = (C0431d) m535a[i2];
            if (c0431d.f2744c != null) {
                d = c0431d.f2744c.readNumber(abstractC0629y);
            } else {
                d = c0431d.f2743b;
            }
            c0431d.f2742a.mo3761b(abstractC0629y, d);
        }
        m3796f(abstractC0629y);
        C0429b.m3816d(abstractC0629y);
    }

    /* renamed from: f */
    public void m3796f(AbstractC0244am abstractC0244am) {
        if (this.f2739d != 0) {
            abstractC0244am.f1648cF &= this.f2739d ^ (-1);
        }
        if (this.f2738c != 0) {
            abstractC0244am.f1648cF |= this.f2738c;
        }
    }

    /* renamed from: g */
    public boolean m3795g(AbstractC0244am abstractC0244am) {
        if (this.f2740e != 0 && !m3807a(abstractC0244am.f1648cF, this.f2740e)) {
            return false;
        }
        if (this.f2741f != 0 && m3801b(abstractC0244am.f1648cF, this.f2741f)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static boolean m3807a(int i, int i2) {
        return (i2 & i) == i2;
    }

    /* renamed from: b */
    public static boolean m3801b(int i, int i2) {
        return (i2 & i) != 0;
    }
}