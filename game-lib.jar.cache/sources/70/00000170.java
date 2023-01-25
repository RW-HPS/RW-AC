package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.p029h.AbstractC0596f;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.AbstractList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/g.class */
public class C0162g extends AbstractC0163h {

    /* renamed from: a */
    boolean f657a;

    /* renamed from: b */
    String f658b;

    /* renamed from: c */
    boolean f659c;

    /* renamed from: d */
    boolean f660d;

    /* renamed from: e */
    boolean f661e;

    /* renamed from: f */
    boolean f662f;

    /* renamed from: g */
    AbstractC0629y f663g;

    /* renamed from: h */
    boolean f664h;

    /* renamed from: i */
    int f665i;

    /* renamed from: j */
    int f666j;

    /* renamed from: k */
    C0164i f667k;

    /* renamed from: l */
    float f668l;

    /* renamed from: m */
    float f669m;

    /* renamed from: n */
    float f670n;

    /* renamed from: o */
    float f671o;

    /* renamed from: p */
    float f672p;

    /* renamed from: q */
    boolean f673q;

    /* renamed from: r */
    boolean f674r;

    /* renamed from: s */
    boolean f675s;

    /* renamed from: t */
    float f676t;

    /* renamed from: u */
    float f677u;

    /* renamed from: v */
    boolean f678v;

    /* renamed from: w */
    AbstractC0244am f679w;

    /* renamed from: x */
    float f680x;

    /* renamed from: y */
    float f681y;

    /* renamed from: z */
    float f682z;

    /* renamed from: A */
    int f683A;

    /* renamed from: B */
    boolean f684B;

    /* renamed from: C */
    public int f685C;

    /* renamed from: D */
    public AbstractC0244am f686D;

    /* renamed from: E */
    EnumC0246ao f687E;

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: a */
    public boolean mo4755a() {
        return this.f657a;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: b */
    public boolean mo4753b() {
        if (!this.f664h) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static C0162g m4772a(C0136a c0136a, AbstractC0629y abstractC0629y) {
        C0162g c0162g = new C0162g(c0136a, false);
        c0162g.f657a = true;
        c0162g.f659c = true;
        c0162g.f660d = true;
        c0162g.f661e = true;
        c0162g.f663g = abstractC0629y;
        c0162g.mo4754a(abstractC0629y);
        c0162g.f683A = 0;
        c0162g.m4756k();
        return c0162g;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f664h);
        gameOutputStream.writeInt(this.f665i);
        gameOutputStream.writeInt(this.f666j);
        gameOutputStream.writeInt(this.f688F.size());
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it.next());
        }
        gameOutputStream.writeByte(7);
        gameOutputStream.writeBoolean(false);
        gameOutputStream.writeBoolean(this.f675s);
        gameOutputStream.writeFloat(this.f671o);
        gameOutputStream.writeInt(this.f689G.size());
        Iterator it2 = this.f689G.iterator();
        while (it2.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it2.next());
        }
        gameOutputStream.writeBoolean(this.f684B);
        gameOutputStream.writeBoolean(this.f657a);
        gameOutputStream.writeBoolean(this.f659c);
        gameOutputStream.writeBoolean(this.f660d);
        gameOutputStream.writeBoolean(this.f661e);
        gameOutputStream.writeBoolean(this.f662f);
        gameOutputStream.mo1385a(this.f663g);
        gameOutputStream.writeInt(this.f683A);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o
    /* renamed from: a */
    public void mo4684a(GameInputStream gameInputStream) {
        this.f664h = gameInputStream.readBoolean();
        this.f665i = gameInputStream.readInt();
        this.f666j = gameInputStream.readInt();
        m4746q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0629y m1292p = gameInputStream.m1292p();
            if (m1292p != null) {
                mo4754a(m1292p);
            }
        }
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            gameInputStream.readBoolean();
        }
        if (readByte >= 2) {
            this.f675s = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.f671o = gameInputStream.readFloat();
        }
        if (readByte >= 4) {
            this.f689G.clear();
            int readInt2 = gameInputStream.readInt();
            for (int i2 = 0; i2 < readInt2; i2++) {
                AbstractC0629y m1292p2 = gameInputStream.m1292p();
                if (m1292p2 != null) {
                    this.f689G.add(m1292p2);
                }
            }
        }
        if (readByte >= 5) {
            this.f684B = gameInputStream.readBoolean();
        }
        if (readByte >= 6) {
            this.f657a = gameInputStream.readBoolean();
            this.f659c = gameInputStream.readBoolean();
            this.f660d = gameInputStream.readBoolean();
            this.f661e = gameInputStream.readBoolean();
            this.f662f = gameInputStream.readBoolean();
            this.f663g = gameInputStream.m1292p();
        }
        if (readByte >= 7) {
            this.f683A = gameInputStream.readInt();
        }
        if (!this.f684B) {
            Iterator it = this.f688F.iterator();
            while (it.hasNext()) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
                if (abstractC0629y instanceof AbstractC0596f) {
                    if (abstractC0629y != null && abstractC0629y.f3979aB == this) {
                        abstractC0629y.f3979aB = null;
                    }
                    if (abstractC0629y != null) {
                        this.f689G.remove(abstractC0629y);
                    }
                    it.remove();
                }
            }
        }
        super.mo4684a(gameInputStream);
    }

    public C0162g(C0136a c0136a) {
        super(c0136a);
        this.f664h = true;
        this.f668l = 1000.0f;
        this.f669m = 100.0f;
        this.f670n = 4000.0f;
        this.f671o = 0.0f;
        this.f672p = 1000.0f;
        this.f673q = false;
        this.f674r = false;
        this.f675s = false;
        this.f676t = 0.0f;
        this.f677u = 0.0f;
        this.f685C = -9999;
        this.f686D = null;
        this.f687E = EnumC0246ao.f1708a;
    }

    public C0162g(C0136a c0136a, boolean z) {
        this(c0136a);
        this.f664h = z;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: a */
    protected void mo4754a(AbstractC0629y abstractC0629y) {
        super.mo4754a(abstractC0629y);
        this.f687E = m4757j();
    }

    /* renamed from: c */
    public void m4766c() {
        Iterator it = AbstractC0244am.f1594bE.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.f1612bV && abstractC0244am.f1614bX == this.f761R && this.f683A > this.f688F.size() && (abstractC0244am instanceof AbstractC0629y)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (!abstractC0629y.f1603bM && !abstractC0629y.f1604bN && abstractC0629y.f3979aB == null && this.f761R.m4818h(abstractC0629y) && this.f761R.m4816i(abstractC0629y)) {
                    if (this.f684B) {
                        if (abstractC0244am.mo3069h() != EnumC0246ao.f1709b) {
                            if (!this.f761R.m4869a(abstractC0629y, this.f762S, this.f763T) || (!mo4753b() && C0773f.rand(0, 100) <= 2)) {
                                mo4754a(abstractC0629y);
                            }
                        }
                    } else if (abstractC0244am.mo3069h() != EnumC0246ao.f1712e) {
                        if (!this.f761R.m4869a(abstractC0629y, this.f762S, this.f763T)) {
                        }
                        mo4754a(abstractC0629y);
                    }
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m4765d() {
        if (this.f683A <= this.f688F.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public AbstractC0244am m4774a(float f) {
        if (GameEngine.getGameEngine().f6315by - (f * 1000.0f) < this.f685C) {
            return this.f686D;
        }
        return null;
    }

    /* renamed from: e */
    public AbstractC0244am m4763e() {
        AbstractC0244am m4774a = m4774a(6.0f);
        if (m4774a != null) {
            return m4774a;
        }
        return null;
    }

    /* renamed from: f */
    public AbstractC0244am m4761f() {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0244am m2959ab = ((AbstractC0629y) it.next()).m2959ab();
            if (m2959ab != null) {
                return m2959ab;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m4769a(SyncPacket syncPacket, boolean z, AbstractC0244am abstractC0244am) {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (!z || abstractC0629y.m2944aq()) {
                if (abstractC0244am == null || this.f761R.m4867a(abstractC0629y, abstractC0244am)) {
                    syncPacket.m2327a(abstractC0629y);
                }
            }
        }
    }

    /* renamed from: a */
    public void m4768a(String str) {
        this.f658b = str;
    }

    /* renamed from: a */
    public PointF m4771a(AbstractC0244am abstractC0244am) {
        PointF pointF = new PointF();
        pointF.x = this.f762S;
        pointF.y = this.f763T;
        float random = (float) (Math.random() * 360.0d);
        float m2151c = C0773f.m2151c(50.0f, 100.0f);
        pointF.x += C0773f.m2107k(random) * m2151c;
        pointF.y += C0773f.m2110j(random) * m2151c;
        if (abstractC0244am != null) {
            float m2138d = C0773f.m2138d(pointF.x, pointF.y, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
            float m2151c2 = C0773f.m2151c(100.0f, 200.0f);
            pointF.x += C0773f.m2107k(m2138d) * (-m2151c2);
            pointF.y += C0773f.m2110j(m2138d) * (-m2151c2);
        }
        return pointF;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: b */
    public void mo4752b(float f) {
        AbstractC0244am m4763e;
        super.mo4752b(f);
        m4748n();
        this.f687E = m4757j();
        if (!this.f662f && (m4763e = m4763e()) != null && m4761f() == null) {
            if (m4770a(m4763e, false)) {
                m4768a("fighting attacker");
                SyncPacket m2422a = GameEngine.getGameEngine().f6343cf.m2422a(this.f761R);
                m4769a(m2422a, true, m4763e);
                m2422a.m2335a(m4763e.f7172eo, m4763e.f7173ep, false);
                return;
            }
            m4768a("flight from attacker");
            PointF m4771a = m4771a(m4763e);
            this.f762S = m4771a.x;
            this.f763T = m4771a.y;
            if (this.f682z > 200.0f) {
                this.f682z = 200.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: c */
    public void mo4690c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f680x += f;
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y != null && this.f685C < abstractC0629y.f1582bs) {
                this.f685C = abstractC0629y.f1582bs;
                this.f686D = abstractC0629y.f1583bt;
            }
        }
        m4748n();
        if (m4765d()) {
            this.f668l = C0773f.m2218a(this.f668l, f);
        } else if (this.f678v) {
        }
        this.f681y = C0773f.m2218a(this.f681y, f);
        this.f682z = C0773f.m2218a(this.f682z, f);
        this.f672p = C0773f.m2218a(this.f672p, f);
        if (!this.f678v && !this.f674r && !m4765d() && this.f681y == 0.0f) {
            this.f681y = 200 + C0773f.m2148c(200);
            m4766c();
        }
        if (!this.f678v || this.f673q) {
            if (!this.f673q) {
                this.f670n = C0773f.m2218a(this.f670n, f);
                if (this.f670n == 0.0f) {
                    if (this.f667k == null) {
                        this.f667k = m4760g();
                    }
                    if (this.f667k != null) {
                        PointF w = this.f667k.m4677w();
                        if (!m4773a(w.x, w.y)) {
                            this.f670n = 100.0f;
                            m4768a("random move: bad target");
                        } else {
                            this.f670n = 4000.0f;
                            this.f762S = w.x;
                            this.f763T = w.y;
                            m4768a("random move");
                        }
                    } else {
                        m4768a("random move: no linked base");
                    }
                }
            }
            if (this.f682z == 0.0f) {
                this.f682z = 800.0f;
                SyncPacket m2422a = gameEngine.f6343cf.m2422a(this.f761R);
                Iterator it2 = this.f688F.iterator();
                while (it2.hasNext()) {
                    AbstractC0629y abstractC0629y2 = (AbstractC0629y) it2.next();
                    boolean z = true;
                    if (m4681c(abstractC0629y2) < 28900.0f) {
                        z = false;
                    }
                    if (!this.f662f && abstractC0629y2.mo2951aj() && !abstractC0629y2.m2944aq()) {
                        z = false;
                    }
                    if (z) {
                        m2422a.m2327a(abstractC0629y2);
                    }
                }
                if (this.f662f) {
                    m2422a.m2337a(this.f762S, this.f763T);
                } else {
                    m2422a.m2322b(this.f762S, this.f763T);
                }
            }
        }
        if (this.f664h) {
            m4762e(f);
        } else {
            m4764d(f);
        }
        if (this.f683A == 0 && this.f688F.size() == 0) {
            mo4678p();
        }
        if (this.f659c) {
            if (this.f663g == null || this.f663g.f1612bV) {
                mo4678p();
            }
        }
    }

    /* renamed from: g */
    C0164i m4760g() {
        float f = -1.0f;
        C0164i c0164i = null;
        Iterator it = this.f761R.f601bn.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (m4767b(c0164i2.f762S, c0164i2.f763T)) {
                    float d = c0164i2.m4680d(this.f762S, this.f763T);
                    if (c0164i == null || d < f) {
                        f = d;
                        c0164i = c0164i2;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: d */
    public void m4764d(float f) {
        if (this.f667k == null || this.f667k.f765V) {
            m4756k();
        }
        if (this.f659c && this.f663g != null) {
            if (this.f661e && !this.f662f) {
                if (this.f663g.f1637cu / this.f663g.f1638cv < 0.5d) {
                    this.f662f = true;
                    if (this.f682z > 100.0f) {
                        this.f682z = 100.0f;
                    }
                }
                if (this.f679w == null) {
                    m4756k();
                }
            } else {
                if (this.f663g.f1637cu / this.f663g.f1638cv > 0.6d) {
                    this.f662f = false;
                }
                boolean z = false;
                if (this.f667k != null && !this.f667k.f709t) {
                    z = true;
                }
                if (!z) {
                    C0164i m4866a = this.f761R.m4866a(this.f663g.mo3069h(), this.f663g.f7172eo, this.f663g.f7173ep, true);
                    if (m4866a != null) {
                        this.f667k = m4866a;
                    }
                    if (this.f667k != null) {
                        PointF w = this.f667k.m4677w();
                        this.f762S = w.x;
                        this.f763T = w.y;
                        if (this.f682z > 100.0f) {
                            this.f682z = 100.0f;
                        }
                        m4768a("moving to new base");
                    }
                }
            }
        }
        if (this.f667k != null) {
            for (int i = 0; i < 2; i++) {
                if (this.f672p == 0.0f) {
                    AbstractC0244am m4714g = this.f667k.m4714g();
                    if (m4714g == null) {
                        break;
                    } else if (m4770a(m4714g, false)) {
                        this.f679w = m4714g;
                        this.f672p = 500.0f;
                        this.f670n = 2000.0f;
                        if (!this.f662f) {
                            this.f762S = m4714g.f7172eo;
                            this.f763T = m4714g.f7173ep;
                        }
                        if (this.f682z > 100.0f) {
                            this.f682z = 100.0f;
                        }
                        m4768a("defending base");
                    }
                }
            }
            if (this.f672p == 0.0f) {
                this.f662f = false;
                this.f679w = null;
            }
        }
    }

    /* renamed from: e */
    public void m4762e(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!this.f678v) {
            if (this.f668l == 0.0f) {
                this.f678v = true;
                this.f673q = true;
            }
        } else {
            if (this.f679w == null || !this.f679w.m4226bT() || this.f679w.f1612bV || !this.f674r) {
                this.f679w = this.f761R.m4838as();
                if (this.f679w != null && !m4770a(this.f679w, true)) {
                    this.f679w = null;
                }
            }
            if (this.f679w != null) {
                if (this.f673q) {
                    this.f677u += f;
                    if (!this.f674r) {
                        this.f676t = C0773f.m2218a(this.f676t, f);
                        if (this.f676t == 0.0f) {
                            this.f676t = 20.0f;
                            m4759h();
                        }
                    } else {
                        boolean z = false;
                        Iterator it = this.f688F.iterator();
                        while (it.hasNext()) {
                            if (m4681c((AbstractC0629y) it.next()) > 28900.0f) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f673q = false;
                        }
                        Iterator it2 = this.f688F.iterator();
                        while (it2.hasNext()) {
                            if (((AbstractC0629y) it2.next()).f1582bs > gameEngine.f6315by - 1000) {
                                this.f673q = false;
                                m4768a("Not staging due to damage");
                            }
                        }
                    }
                    if (this.f677u > 17000.0f) {
                        this.f673q = false;
                        m4768a("attacking target");
                    }
                } else {
                    this.f671o += f;
                    if (this.f682z == 0.0f) {
                        this.f682z = 800.0f;
                        boolean z2 = false;
                        AbstractList c1136m = new C1136m();
                        Iterator it3 = this.f688F.iterator();
                        while (it3.hasNext()) {
                            AbstractC0629y abstractC0629y = (AbstractC0629y) it3.next();
                            boolean z3 = true;
                            if (this.f679w != null) {
                                if (!this.f761R.m4867a(abstractC0629y, this.f679w)) {
                                    z3 = false;
                                }
                                if (z3 && !C0248aq.m4181a(abstractC0629y, this.f679w)) {
                                    z3 = false;
                                }
                            }
                            if (z3) {
                                z2 = true;
                                c1136m.add(abstractC0629y);
                            }
                        }
                        if (!z2) {
                            this.f673q = false;
                            m4768a("cannot reach main target");
                        } else {
                            SyncPacket m2422a = gameEngine.f6343cf.m2422a(this.f761R);
                            m2422a.m2324a(c1136m);
                            if (this.f679w != null && C0773f.rand(0, 100) < 80) {
                                m2422a.m2335a(this.f679w.f7172eo, this.f679w.f7173ep, true);
                            } else {
                                m2422a.m2328a(this.f679w, true);
                            }
                            m4768a("attacking main target");
                        }
                    }
                }
            }
        }
        if (this.f678v) {
            if (this.f688F.size() == 0) {
                mo4678p();
            }
            if (this.f671o > 1000.0f && this.f688F.size() < 3) {
                mo4678p();
            }
            if (this.f671o > 11000.0f) {
                mo4678p();
            }
        }
    }

    /* renamed from: h */
    public void m4759h() {
        float f = this.f679w.f7172eo;
        float f2 = this.f679w.f7173ep;
        float m2138d = C0773f.m2138d(f, f2, this.f762S, this.f763T);
        float m2170b = C0773f.m2170b(f, f2, this.f762S, this.f763T);
        if (C0773f.rand(0, 100) < 80) {
            m2138d += C0773f.rand(-110, 110);
        }
        int i = (int) (m2170b * 0.6d);
        if (i < 720) {
            i = 720;
        }
        float rand = C0773f.rand(50, i);
        if (C0773f.rand(0, 100) < 80 && rand < 450.0f) {
            rand = C0773f.rand(450, i);
        }
        float m2107k = f + (C0773f.m2107k(m2138d) * rand);
        float m2110j = f2 + (C0773f.m2110j(m2138d) * rand);
        boolean z = true;
        if (!m4773a(m2107k, m2110j)) {
            z = false;
        }
        boolean z2 = false;
        boolean z3 = false;
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (abstractC0629y.mo3069h() == EnumC0246ao.f1709b) {
                z2 = true;
            }
            if (abstractC0629y.mo3069h() == EnumC0246ao.f1712e) {
                z3 = true;
            }
        }
        if (z2) {
            if (this.f761R.f568aG == 0 && !m4767b(m2107k, m2110j)) {
                z = false;
            }
            if (!this.f761R.m4879a(m2107k, m2110j, this.f679w.f7172eo, this.f679w.f7173ep, EnumC0246ao.f1709b) && C0773f.rand(0, 100) < 98) {
                z = false;
            }
        }
        if (z3) {
            if (!m4767b(m2107k, m2110j)) {
                z = false;
            }
            if (!this.f761R.m4879a(m2107k, m2110j, this.f679w.f7172eo, this.f679w.f7173ep, EnumC0246ao.f1712e)) {
                z = false;
            }
        }
        if (z) {
            this.f762S = m2107k;
            this.f763T = m2110j;
            this.f682z = 0.0f;
            this.f674r = true;
            this.f689G.clear();
            Iterator it2 = this.f688F.iterator();
            while (it2.hasNext()) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) it2.next();
                if (abstractC0629y2.mo3069h() != EnumC0246ao.f1712e && !this.f761R.m4869a(abstractC0629y2, this.f762S, this.f763T)) {
                    this.f689G.add(abstractC0629y2);
                }
            }
        }
    }

    /* renamed from: i */
    public EnumC0246ao m4758i() {
        return this.f687E;
    }

    /* renamed from: j */
    public EnumC0246ao m4757j() {
        if (this.f688F.size() == 0) {
            if (this.f684B) {
                return EnumC0246ao.f1712e;
            }
            return EnumC0246ao.f1709b;
        }
        boolean z = true;
        Iterator it = this.f688F.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            } else if (((AbstractC0629y) it.next()).mo3069h() != EnumC0246ao.f1711d) {
                z = false;
                break;
            }
        }
        if (z) {
            return EnumC0246ao.f1711d;
        }
        if (this.f684B) {
            boolean z2 = true;
            Iterator it2 = this.f688F.iterator();
            while (it2.hasNext()) {
                if (((AbstractC0629y) it2.next()).mo3069h() == EnumC0246ao.f1712e) {
                    z2 = false;
                }
            }
            if (z2) {
                return EnumC0246ao.f1713f;
            }
            return EnumC0246ao.f1712e;
        }
        boolean z3 = true;
        Iterator it3 = this.f688F.iterator();
        while (it3.hasNext()) {
            EnumC0246ao h = ((AbstractC0629y) it3.next()).mo3069h();
            if (h == EnumC0246ao.f1709b || h == EnumC0246ao.f1714g) {
                z3 = false;
            }
        }
        if (z3) {
            return EnumC0246ao.f1713f;
        }
        return EnumC0246ao.f1709b;
    }

    /* renamed from: a */
    public boolean m4773a(float f, float f2) {
        return !C1152y.m477a(f, f2, m4758i());
    }

    /* renamed from: b */
    public boolean m4767b(float f, float f2) {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            if (!this.f761R.m4869a((AbstractC0629y) it.next(), f, f2)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public boolean m4770a(AbstractC0244am abstractC0244am, boolean z) {
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
            if (z || this.f761R.m4869a(abstractC0629y, abstractC0244am.f7172eo, abstractC0244am.f7173ep)) {
                if (C0248aq.m4181a(abstractC0629y, abstractC0244am)) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: k */
    public void m4756k() {
        PointF pointF = null;
        if (this.f659c && this.f663g != null) {
            this.f762S = this.f663g.f7172eo;
            this.f763T = this.f663g.f7173ep;
            this.f667k = this.f761R.m4829c(this.f663g.f7172eo, this.f663g.f7173ep);
            return;
        }
        if (1 != 0) {
            int i = 0;
            while (i < 7) {
                boolean z = i > 3;
                if (pointF == null) {
                    Iterator it = this.f761R.f601bn.iterator();
                    while (it.hasNext()) {
                        AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
                        if (abstractC0170o instanceof C0164i) {
                            C0164i c0164i = (C0164i) abstractC0170o;
                            if (c0164i.f691b == EnumC0165j.Active && (c0164i.m4700u() > 2 || z)) {
                                if (pointF == null || C0773f.m2148c(this.f761R.f560ay + 2) == 0) {
                                    for (int i2 = 0; i2 < 10; i2++) {
                                        if (pointF == null) {
                                            PointF w = c0164i.m4677w();
                                            if (m4773a(w.x, w.y)) {
                                                pointF = w;
                                            }
                                        }
                                    }
                                    this.f667k = c0164i;
                                }
                            }
                        }
                    }
                }
                i++;
            }
        }
        if (pointF == null) {
            pointF = this.f761R.m4844am();
            this.f667k = null;
        }
        this.f762S = pointF.x;
        this.f763T = pointF.y;
    }
}