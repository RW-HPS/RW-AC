package com.corrodinggames.rts.game.units.p026e;

import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.e.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/i.class */
public class C0531i extends AbstractC0530h implements InterfaceC0242ak {

    /* renamed from: e */
    float f3671e;

    /* renamed from: f */
    float f3672f;

    /* renamed from: g */
    boolean f3673g;

    /* renamed from: h */
    C1136m f3674h;

    /* renamed from: a */
    static C0970e f3667a = null;

    /* renamed from: b */
    static C0970e f3668b = null;

    /* renamed from: c */
    static C0970e f3669c = null;

    /* renamed from: d */
    static C0970e[] f3670d = new C0970e[10];

    /* renamed from: i */
    public static final AbstractC0224s f3675i = new AbstractC0229x(109) { // from class: com.corrodinggames.rts.game.units.e.i.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Will unload all units when stopped";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.unload", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0229x, com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public int mo3093b(AbstractC0244am abstractC0244am, boolean z) {
            return ((InterfaceC0242ak) abstractC0244am).mo2916bB();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return !((InterfaceC0242ak) abstractC0244am).mo2917bA() && ((InterfaceC0242ak) abstractC0244am).mo3240f() && ((InterfaceC0242ak) abstractC0244am).mo2916bB() > 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            return ((InterfaceC0242ak) abstractC0244am).mo3238j();
        }
    };

    /* renamed from: j */
    public static final AbstractC0224s f3676j = new AbstractC0229x(110) { // from class: com.corrodinggames.rts.game.units.e.i.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public String mo3098a() {
            return "-Stop unloading";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public String mo3095b() {
            return C0855a.m1714a("gui.actions.cancel", new Object[0]);
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: a */
        public boolean mo3096a(AbstractC0244am abstractC0244am, boolean z) {
            return ((InterfaceC0242ak) abstractC0244am).mo2917bA();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
        /* renamed from: b */
        public boolean mo3094b(AbstractC0244am abstractC0244am) {
            return mo3096a(abstractC0244am, false);
        }
    };

    /* renamed from: k */
    static ArrayList f3677k = new ArrayList();

    static {
        f3677k.add(f3675i);
        f3677k.add(f3676j);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3671e);
        gameOutputStream.writeFloat(this.f3672f);
        gameOutputStream.writeBoolean(this.f3673g);
        gameOutputStream.writeInt(this.f3674h.size());
        Iterator it = this.f3674h.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1334a((AbstractC0244am) it.next());
        }
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        this.f3671e = gameInputStream.readFloat();
        this.f3672f = gameInputStream.readFloat();
        this.f3673g = gameInputStream.readBoolean();
        this.f3674h.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0244am m1293o = gameInputStream.m1293o();
            if (m1293o != null) {
                this.f3674h.add(m1293o);
            }
        }
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo5458r() {
        return EnumC0249ar.hovercraft;
    }

    /* renamed from: L */
    public static void m3255L() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        f3667a = gameEngine.f6326bO.mo222a(C0067R.drawable.hovercraft);
        f3669c = gameEngine.f6326bO.mo222a(C0067R.drawable.hovercraft_shadow);
        f3668b = gameEngine.f6326bO.mo222a(C0067R.drawable.hovercraft_dead);
        f3670d = PlayerData.m4432a(f3667a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2879d() {
        if (this.f1612bV) {
            return f3668b;
        }
        return f3670d[this.f1614bX.m4454R()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: k */
    public C0970e mo2853k() {
        return f3669c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: d */
    public C0970e mo2876d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3071e() {
        this.f3917M = f3668b;
        m448S(0);
        this.f1610bT = false;
        m3239f(true);
        m3014a(EnumC0233ab.small);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0673ay, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo447a() {
        m3239f(true);
        super.mo447a();
    }

    /* renamed from: f */
    public void m3239f(boolean z) {
        Iterator it = this.f3674h.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            abstractC0244am.f1656cN = null;
            abstractC0244am.f7172eo = this.f7172eo + (C0773f.m2107k(this.f1623cg) * (-9.0f));
            abstractC0244am.f7173ep = this.f7173ep + (C0773f.m2110j(this.f1623cg) * (-9.0f));
            if (z) {
                abstractC0244am.m4209cj();
            }
        }
        this.f3674h.clear();
    }

    public C0531i(boolean z) {
        super(z);
        this.f3671e = 0.0f;
        this.f3674h = new C1136m();
        m2729T(20);
        m2728U(32);
        this.f1626cj = 15.0f;
        this.f1627ck = this.f1626cj;
        this.f1638cv = 450.0f;
        this.f1637cu = this.f1638cv;
        this.f3917M = f3667a;
        this.f3918N = f3669c;
    }

    /* renamed from: a */
    public static int m3251a(C1136m c1136m) {
        int i = 0;
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            i += ((AbstractC0244am) it.next()).mo3268cw();
        }
        return i;
    }

    /* renamed from: a */
    public static boolean m3250a(C1136m c1136m, int i, AbstractC0244am abstractC0244am) {
        if (m3251a(c1136m) + abstractC0244am.mo3268cw() <= i) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bY */
    public int mo3248bY() {
        return m3251a(this.f3674h);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bZ */
    public int mo3247bZ() {
        return 4;
    }

    /* renamed from: a */
    public static boolean m3253a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z) {
        return m3252a(abstractC0244am, abstractC0244am2, z, 9.0f, -180.0f, 70.0f, 0.0f, 7.0f);
    }

    /* renamed from: a */
    public static boolean m3252a(AbstractC0244am abstractC0244am, AbstractC0244am abstractC0244am2, boolean z, float f, float f2, float f3, float f4, float f5) {
        float m2107k = (abstractC0244am.f7172eo + (C0773f.m2107k(abstractC0244am.f1623cg + f2) * f5)) - (C0773f.m2110j(abstractC0244am.f1623cg + f2) * f4);
        float m2110j = abstractC0244am.f7173ep + (C0773f.m2110j(abstractC0244am.f1623cg + f2) * f5) + (C0773f.m2107k(abstractC0244am.f1623cg + f2) * f4);
        float m2107k2 = m2107k + (C0773f.m2107k(abstractC0244am.f1623cg + 90.0f) * (z ? -f : f));
        float m2110j2 = m2110j + (C0773f.m2110j(abstractC0244am.f1623cg + 90.0f) * (z ? -f : f));
        if (!C1152y.m470a(abstractC0244am2, m2107k2, m2110j2)) {
            m2107k2 += 10.0f;
        }
        if (!C1152y.m470a(abstractC0244am2, m2107k2, m2110j2)) {
            m2107k2 -= 20.0f;
        }
        if (!C1152y.m470a(abstractC0244am2, m2107k2, m2110j2)) {
            m2107k2 -= 10.0f;
            m2110j2 += 10.0f;
        }
        if (!C1152y.m470a(abstractC0244am2, m2107k2, m2110j2)) {
            m2110j2 -= 20.0f;
        }
        if (!C1152y.m470a(abstractC0244am2, m2107k2, m2110j2)) {
            return false;
        }
        abstractC0244am2.f1656cN = null;
        abstractC0244am2.f7172eo = m2107k2;
        abstractC0244am2.f7173ep = m2110j2;
        abstractC0244am2.f1616bZ += 0.1f;
        abstractC0244am2.f1623cg = abstractC0244am.f1623cg + f2;
        abstractC0244am2.f1608bR = abstractC0244am;
        abstractC0244am2.f1609bS = 45.0f;
        if (abstractC0244am2 instanceof AbstractC0629y) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am2;
            abstractC0629y.m2856j(abstractC0244am2.f1623cg);
            abstractC0629y.m2935az();
            abstractC0629y.m2878d(abstractC0244am2.f7172eo + (C0773f.m2107k(abstractC0244am2.f1623cg + (z ? -f : f)) * f3), abstractC0244am2.f7173ep + (C0773f.m2110j(abstractC0244am2.f1623cg + (z ? -f : f)) * f3));
            abstractC0629y.f3952ac = 0;
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0530h, com.corrodinggames.rts.game.units.p026e.AbstractC0534j, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        if (this.f1612bV || !m4226bT()) {
            return;
        }
        if (this.f1628cl == 0.0f && this.f7170em != 3) {
            m448S(3);
        }
        if (this.f3673g && !m4215cK() && !this.f1653cK) {
            this.f3672f = C0773f.m2218a(this.f3672f, f);
            if (this.f3672f == 0.0f) {
                this.f3672f = 30.0f;
                if (this.f3674h.size() == 0) {
                    this.f3673g = false;
                } else {
                    boolean z = this.f3674h.size() % 2 == 0;
                    AbstractC0244am abstractC0244am = (AbstractC0244am) this.f3674h.remove(this.f3674h.size() - 1);
                    if (!m3253a(this, abstractC0244am, z)) {
                        this.f3674h.add(abstractC0244am);
                    }
                    if (this.f3674h.size() == 0) {
                        this.f3673g = false;
                    }
                }
            }
        }
        this.f3671e += 4.0f * f;
        if (this.f3671e > 360.0f) {
            this.f3671e -= 360.0f;
        }
        if (!this.f3673g) {
            this.f7174eq = C0773f.m2217a(this.f7174eq, 3.0f + (C0773f.m2110j(this.f3671e) * 1.5f), 0.1f * f);
        } else {
            this.f7174eq = C0773f.m2217a(this.f7174eq, 0.0f, 0.1f * f);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: a */
    public void mo3008a(AbstractC0244am abstractC0244am, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: m */
    public float mo2846m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: b */
    public float mo2930b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: z */
    public float mo2822z() {
        if (m4215cK()) {
            return 1.2f;
        }
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: A */
    public float mo3065A() {
        if (m4215cK()) {
            return 1.8f;
        }
        return 1.4f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: B */
    public float mo3063B() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: C */
    public float mo3061C() {
        return 0.03f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: D */
    public float mo3059D() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: c */
    public float mo2883c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: l */
    public boolean mo3067l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: d */
    public boolean mo3244d(AbstractC0244am abstractC0244am, boolean z) {
        if (this.f3673g || !m3250a(this.f3674h, 4, abstractC0244am) || abstractC0244am == this) {
            return false;
        }
        if (this.f1614bX != abstractC0244am.f1614bX && !z) {
            return false;
        }
        return C1152y.m464a(abstractC0244am, true, true);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: e */
    public boolean mo3241e(AbstractC0244am abstractC0244am, boolean z) {
        if (!mo3244d(abstractC0244am, z)) {
            return false;
        }
        m3256C(abstractC0244am);
        return true;
    }

    /* renamed from: C */
    public void m3256C(AbstractC0244am abstractC0244am) {
        abstractC0244am.f1656cN = this;
        this.f3674h.add(abstractC0244am);
        GameEngine.getGameEngine().f6330bS.m1808l(abstractC0244am);
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: e */
    public void mo3242e(AbstractC0244am abstractC0244am) {
        if (abstractC0244am.f1656cN == this) {
            this.f3674h.remove(abstractC0244am);
            abstractC0244am.f1656cN = null;
            return;
        }
        GameEngine.m990g("Unit is not being transported");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: bN */
    public float mo3136bN() {
        return 12000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bA */
    public boolean mo2917bA() {
        return this.f3673g;
    }

    /* renamed from: M */
    public void m3254M() {
        this.f3673g = true;
        this.f3672f = 30.0f;
    }

    /* renamed from: ds */
    public void m3243ds() {
        this.f3673g = false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: a */
    public void mo3130a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s == f3675i) {
            m3254M();
        }
        if (abstractC0224s == f3676j) {
            m3243ds();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cr */
    public boolean mo3245cr() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: bB */
    public int mo2916bB() {
        return this.f3674h.size();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: cp */
    public C0208c mo3246cp() {
        return f3675i.m4309N();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: N */
    public ArrayList mo3131N() {
        return f3677k;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: f */
    public boolean mo3240f() {
        return !m4215cK();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0242ak
    /* renamed from: j */
    public boolean mo3238j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: bz */
    public C1136m mo2886bz() {
        return this.f3674h;
    }
}