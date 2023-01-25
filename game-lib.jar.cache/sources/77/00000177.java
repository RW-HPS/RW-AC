package com.corrodinggames.rts.game.p010a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncPacket;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/n.class */
public class C0169n extends AbstractC0163h {

    /* renamed from: a */
    boolean f741a;

    /* renamed from: b */
    int f742b;

    /* renamed from: c */
    int f743c;

    /* renamed from: d */
    C0164i f744d;

    /* renamed from: e */
    float f745e;

    /* renamed from: f */
    float f746f;

    /* renamed from: g */
    float f747g;

    /* renamed from: h */
    float f748h;

    /* renamed from: i */
    float f749i;

    /* renamed from: j */
    float f750j;

    /* renamed from: k */
    float f751k;

    /* renamed from: l */
    int f752l;

    /* renamed from: m */
    AbstractC0163h f753m;

    /* renamed from: n */
    AbstractC0629y f754n;

    /* renamed from: o */
    float f755o;

    /* renamed from: p */
    boolean f756p;

    /* renamed from: q */
    boolean f757q;

    /* renamed from: r */
    float f758r;

    /* renamed from: s */
    float f759s;

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f741a);
        gameOutputStream.writeInt(this.f742b);
        gameOutputStream.writeInt(this.f743c);
        gameOutputStream.writeInt(this.f688F.size());
        Iterator it = this.f688F.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1385a((AbstractC0629y) it.next());
        }
        gameOutputStream.writeByte(5);
        gameOutputStream.writeInt(this.f761R.m4872a(this.f753m));
        gameOutputStream.writeBoolean(this.f757q);
        gameOutputStream.mo1385a(this.f754n);
        gameOutputStream.writeFloat(this.f755o);
        gameOutputStream.writeBoolean(this.f756p);
        gameOutputStream.writeFloat(this.f758r);
        gameOutputStream.writeFloat(this.f759s);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0170o
    /* renamed from: a */
    public void mo4684a(GameInputStream gameInputStream) {
        this.f741a = gameInputStream.readBoolean();
        this.f742b = gameInputStream.readInt();
        this.f743c = gameInputStream.readInt();
        m4746q();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0629y m1292p = gameInputStream.m1292p();
            if (m1292p != null) {
                if (!this.f761R.m4819g(m1292p)) {
                    GameEngine.print("TransporterGroup:readIn: Unit is not transporterUnit");
                } else {
                    mo4754a(m1292p);
                }
            }
        }
        byte readByte = gameInputStream.readByte();
        if (readByte >= 1) {
            this.f753m = (AbstractC0163h) this.f761R.m4809m(gameInputStream.readInt());
        }
        if (readByte >= 2) {
            this.f757q = gameInputStream.readBoolean();
        }
        if (readByte >= 3) {
            this.f754n = gameInputStream.m1292p();
        }
        if (readByte >= 4) {
            this.f755o = gameInputStream.readFloat();
            this.f756p = gameInputStream.readBoolean();
        }
        if (readByte >= 5) {
            this.f758r = gameInputStream.readFloat();
            this.f759s = gameInputStream.readFloat();
        }
        super.mo4684a(gameInputStream);
    }

    public C0169n(C0136a c0136a) {
        super(c0136a);
        this.f745e = 100.0f;
        this.f746f = 4000.0f;
        this.f747g = 100.0f;
        this.f755o = 0.0f;
        this.f756p = false;
    }

    /* renamed from: c */
    public void m4691c() {
        Iterator it = AbstractC0244am.f1594bE.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (!abstractC0244am.f1612bV && abstractC0244am.f1614bX == this.f761R && this.f752l > this.f688F.size() && (abstractC0244am instanceof AbstractC0629y)) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
                if (!abstractC0629y.f1604bN && abstractC0629y.f3979aB == null && this.f761R.m4819g(abstractC0629y) && this.f761R.m4816i(abstractC0629y)) {
                    mo4754a(abstractC0629y);
                }
            }
        }
    }

    /* renamed from: d */
    public boolean m4689d() {
        return this.f753m != null;
    }

    @Override // com.corrodinggames.rts.game.p010a.AbstractC0163h
    /* renamed from: c */
    public void mo4690c(float f) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.f748h += f;
        m4748n();
        if (this.f752l <= this.f688F.size()) {
        }
        this.f749i = C0773f.m2218a(this.f749i, f);
        this.f750j = C0773f.m2218a(this.f750j, f);
        this.f751k = C0773f.m2218a(this.f751k, f);
        if (!m4689d() && !this.f757q && this.f752l > this.f688F.size() && this.f749i == 0.0f) {
            this.f749i = 300.0f;
            m4691c();
        }
        if (!m4689d() && this.f688F.size() != 0) {
            if (!m4689d()) {
                this.f746f = C0773f.m2218a(this.f746f, f);
                if (this.f746f == 0.0f) {
                    this.f746f = 4000.0f;
                    if (this.f744d != null) {
                        PointF w = this.f744d.m4677w();
                        this.f762S = w.x;
                        this.f763T = w.y;
                    }
                }
            }
            if (this.f750j == 0.0f) {
                this.f750j = 400.0f;
                SyncPacket m2422a = gameEngine.f6343cf.m2422a(this.f761R);
                Iterator it = this.f688F.iterator();
                while (it.hasNext()) {
                    AbstractC0629y abstractC0629y = (AbstractC0629y) it.next();
                    if (m4681c(abstractC0629y) > 28900.0f && !abstractC0629y.m2938aw()) {
                        m2422a.m2327a(abstractC0629y);
                    } else if (((InterfaceC0242ak) abstractC0629y).mo2916bB() != 0) {
                        C0208c cp = abstractC0629y.mo3246cp();
                        SyncPacket m2422a2 = gameEngine.f6343cf.m2422a(this.f761R);
                        m2422a2.m2327a(abstractC0629y);
                        m2422a2.m2332a(cp);
                    }
                }
                m2422a.m2337a(this.f762S, this.f763T);
            }
            if (this.f753m == null) {
                this.f747g = C0773f.m2218a(this.f747g, f);
                if (this.f747g == 0.0f) {
                    this.f747g = 100.0f;
                    if (C0773f.rand(0, 100) < 80) {
                        m4693a(f, true);
                    }
                    if (this.f753m == null) {
                        m4693a(f, false);
                    }
                }
            }
        }
        if (this.f753m != null && this.f753m.f765V) {
            this.f753m = null;
        }
        if (!this.f757q) {
            if (this.f753m != null) {
                ArrayList arrayList = this.f753m.f689G;
                if (this.f754n != null && (this.f754n.f1612bV || this.f754n.f1656cN != null || this.f754n.f1657cO != null)) {
                    arrayList.remove(this.f754n);
                    this.f754n = null;
                }
                if (this.f754n == null) {
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        AbstractC0629y abstractC0629y2 = (AbstractC0629y) it2.next();
                        if (abstractC0629y2.f1656cN == null) {
                            Iterator it3 = this.f688F.iterator();
                            while (true) {
                                if (!it3.hasNext()) {
                                    break;
                                } else if (((AbstractC0629y) it3.next()).mo3244d((AbstractC0244am) abstractC0629y2, false)) {
                                    this.f754n = abstractC0629y2;
                                    break;
                                }
                            }
                        }
                    }
                    if (this.f754n == null) {
                        this.f757q = true;
                        this.f750j = 0.0f;
                        this.f751k = 0.0f;
                        this.f758r = this.f753m.f762S;
                        this.f759s = this.f753m.f763T;
                    }
                }
                if (this.f754n != null) {
                    if (this.f750j == 0.0f) {
                        this.f750j = 400.0f;
                        SyncPacket m2422a3 = gameEngine.f6343cf.m2422a(this.f761R);
                        Iterator it4 = this.f688F.iterator();
                        while (it4.hasNext()) {
                            m2422a3.m2327a((AbstractC0629y) it4.next());
                        }
                        m2422a3.m2337a(this.f754n.f7172eo, this.f754n.f7173ep);
                    }
                    if (this.f751k == 0.0f) {
                        this.f751k = 80.0f;
                        Iterator it5 = arrayList.iterator();
                        while (it5.hasNext()) {
                            AbstractC0629y abstractC0629y3 = (AbstractC0629y) it5.next();
                            Iterator it6 = this.f688F.iterator();
                            while (true) {
                                if (it6.hasNext()) {
                                    AbstractC0629y abstractC0629y4 = (AbstractC0629y) it6.next();
                                    if (abstractC0629y4.mo3244d((AbstractC0244am) abstractC0629y3, false) && C0773f.m2216a(abstractC0629y4.f7172eo, abstractC0629y4.f7173ep, abstractC0629y3.f7172eo, abstractC0629y3.f7173ep) < 14400.0f) {
                                        SyncPacket m2422a4 = gameEngine.f6343cf.m2422a(this.f761R);
                                        m2422a4.m2327a(abstractC0629y3);
                                        m2422a4.m2314e(abstractC0629y4);
                                        break;
                                    }
                                }
                            }
                        }
                        boolean z = false;
                        Iterator it7 = this.f688F.iterator();
                        while (it7.hasNext()) {
                            if (((AbstractC0629y) it7.next()).mo3244d((AbstractC0244am) this.f754n, false)) {
                                z = true;
                            }
                        }
                        if (!z) {
                            this.f754n = null;
                        }
                    }
                }
            }
        } else if (this.f753m == null) {
            m4688e();
        } else {
            if (this.f750j == 0.0f) {
                this.f750j = 400.0f;
                float m2151c = this.f753m.f762S + C0773f.m2151c(-40.0f, 40.0f);
                float m2151c2 = this.f753m.f763T + C0773f.m2151c(-40.0f, 40.0f);
                if (this.f755o > 600.0f) {
                    m2151c += C0773f.m2151c(-300.0f, 300.0f);
                    m2151c2 += C0773f.m2151c(-300.0f, 300.0f);
                }
                if (this.f755o > 1200.0f) {
                    m2151c += C0773f.m2151c(-300.0f, 300.0f);
                    m2151c2 += C0773f.m2151c(-300.0f, 300.0f);
                }
                if (C1152y.m477a(m2151c, m2151c2, EnumC0246ao.f1709b)) {
                    m2151c += C0773f.m2151c(-100.0f, 100.0f);
                    m2151c2 += C0773f.m2151c(-100.0f, 100.0f);
                }
                if (C1152y.m477a(m2151c, m2151c2, EnumC0246ao.f1709b)) {
                    m2151c += C0773f.m2151c(-200.0f, 200.0f);
                    m2151c2 += C0773f.m2151c(-200.0f, 200.0f);
                }
                if (C1152y.m477a(m2151c, m2151c2, EnumC0246ao.f1709b)) {
                    m2151c += C0773f.m2151c(-200.0f, 200.0f);
                    m2151c2 += C0773f.m2151c(-200.0f, 200.0f);
                }
                if (C1152y.m477a(m2151c, m2151c2, EnumC0246ao.f1709b)) {
                    this.f750j = 30.0f;
                } else {
                    this.f758r = m2151c;
                    this.f759s = m2151c2;
                    SyncPacket m2422a5 = gameEngine.f6343cf.m2422a(this.f761R);
                    Iterator it8 = this.f688F.iterator();
                    while (it8.hasNext()) {
                        AbstractC0629y abstractC0629y5 = (AbstractC0629y) it8.next();
                        if (((InterfaceC0242ak) abstractC0629y5).mo2916bB() != 0) {
                            if (C0773f.m2216a(abstractC0629y5.f7172eo, abstractC0629y5.f7173ep, this.f758r, this.f759s) > 1600.0f) {
                                m2422a5.m2327a(abstractC0629y5);
                            }
                        } else {
                            SyncPacket m2422a6 = gameEngine.f6343cf.m2422a(this.f761R);
                            m2422a6.m2327a(abstractC0629y5);
                            m2422a6.m2337a(this.f762S, this.f763T);
                        }
                    }
                    m2422a5.m2337a(this.f758r, this.f759s);
                }
            }
            if (this.f751k == 0.0f) {
                this.f751k = 100.0f;
                Iterator it9 = this.f688F.iterator();
                while (it9.hasNext()) {
                    AbstractC0629y abstractC0629y6 = (AbstractC0629y) it9.next();
                    if (C0773f.m2216a(abstractC0629y6.f7172eo, abstractC0629y6.f7173ep, this.f758r, this.f759s) < 6400.0f) {
                        this.f756p = true;
                        C0208c cp2 = abstractC0629y6.mo3246cp();
                        SyncPacket m2422a7 = gameEngine.f6343cf.m2422a(this.f761R);
                        m2422a7.m2327a(abstractC0629y6);
                        m2422a7.m2332a(cp2);
                    }
                }
            }
            if (this.f756p) {
                this.f753m.m4747o();
                this.f755o += f;
            }
            boolean z2 = false;
            Iterator it10 = this.f688F.iterator();
            while (it10.hasNext()) {
                AbstractC0629y abstractC0629y7 = (AbstractC0629y) it10.next();
                if (!abstractC0629y7.f1612bV && ((InterfaceC0242ak) abstractC0629y7).mo2916bB() != 0) {
                    z2 = true;
                }
            }
            if (!z2 || this.f755o > 1700.0f) {
                m4688e();
            }
        }
        if (this.f748h > 1500.0f && this.f688F.size() == 0) {
            mo4678p();
        }
    }

    /* renamed from: e */
    public void m4688e() {
        this.f757q = false;
        this.f753m = null;
        this.f755o = 0.0f;
        this.f750j = 0.0f;
        this.f751k = 0.0f;
        this.f756p = false;
        m4687f();
    }

    /* renamed from: a */
    public void m4693a(float f, boolean z) {
        Iterator it = this.f761R.f601bn.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if ((abstractC0170o instanceof AbstractC0163h) && !(abstractC0170o instanceof C0169n) && (!z || (abstractC0170o instanceof C0167l))) {
                AbstractC0163h abstractC0163h = (AbstractC0163h) abstractC0170o;
                if (abstractC0163h.f689G.size() != 0 && !abstractC0163h.m4749m()) {
                    this.f753m = abstractC0163h;
                    this.f754n = null;
                    return;
                }
            }
        }
    }

    /* renamed from: a */
    public C0164i m4692a(boolean z) {
        C0164i c0164i = null;
        Iterator it = this.f761R.f601bn.iterator();
        while (it.hasNext()) {
            AbstractC0170o abstractC0170o = (AbstractC0170o) it.next();
            if (abstractC0170o instanceof C0164i) {
                C0164i c0164i2 = (C0164i) abstractC0170o;
                if (!c0164i2.f708s || !z) {
                    if (c0164i2.f691b == EnumC0165j.Active) {
                        c0164i = c0164i2;
                        if (C0773f.m2148c(3) == 0) {
                            return c0164i;
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        return c0164i;
    }

    /* renamed from: f */
    public void m4687f() {
        PointF pointF = null;
        if (1 != 0) {
            this.f744d = m4692a(true);
            if (this.f744d == null) {
                this.f744d = m4692a(false);
            }
            if (this.f744d != null) {
                pointF = this.f744d.m4677w();
            }
        }
        if (pointF == null) {
            pointF = this.f761R.m4844am();
            this.f744d = null;
        }
        this.f762S = pointF.x;
        this.f763T = pointF.y;
    }
}