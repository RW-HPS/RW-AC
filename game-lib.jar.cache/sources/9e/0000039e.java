package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0228w;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0741bq;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.game.units.d.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/k.class */
public class C0505k {

    /* renamed from: a */
    AbstractC0629y f3530a;

    /* renamed from: b */
    public PointF f3531b = null;

    /* renamed from: c */
    public final C1136m f3532c = new C1136m();

    /* renamed from: d */
    final C1136m f3533d = new C1136m();

    /* renamed from: e */
    public float f3534e;

    /* renamed from: f */
    C0504j f3535f;

    public C0505k(AbstractC0629y abstractC0629y) {
        this.f3530a = abstractC0629y;
    }

    /* renamed from: a */
    public void m3351a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeFloat(this.f3534e);
        gameOutputStream.writeInt(this.f3532c.size());
        Iterator it = this.f3532c.iterator();
        while (it.hasNext()) {
            ((AbstractC0741bq) it.next()).mo442a(gameOutputStream);
        }
        gameOutputStream.writeBoolean(this.f3531b != null);
        if (this.f3531b != null) {
            gameOutputStream.writeFloat(this.f3531b.x);
            gameOutputStream.writeFloat(this.f3531b.y);
        }
    }

    /* renamed from: a */
    public void m3350a(GameInputStream gameInputStream) {
        this.f3534e = gameInputStream.readFloat();
        int readInt = gameInputStream.readInt();
        this.f3532c.clear();
        for (int i = 0; i < readInt; i++) {
            C0504j c0504j = new C0504j();
            c0504j.m3367a(gameInputStream);
            if (AbstractC0224s.m4300c(c0504j.f3525j)) {
                if (this.f3530a.mo3655a(c0504j.f3525j) == null) {
                    GameEngine.m1015b("Factory", this.f3530a.mo5458r() + " no longer has the action:" + c0504j.f3525j);
                } else {
                    this.f3532c.add(c0504j);
                }
            } else {
                GameEngine.m1015b("Factory", "buildQueue has uIndex of -1, skipping");
            }
        }
        if (gameInputStream.m1311b() >= 5) {
            if (gameInputStream.readBoolean()) {
                if (this.f3531b == null) {
                    this.f3531b = new PointF();
                }
                this.f3531b.x = gameInputStream.readFloat();
                this.f3531b.y = gameInputStream.readFloat();
                return;
            }
            this.f3531b = null;
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3352a(C0504j c0504j, float f, boolean z, float f2) {
        AbstractC0224s a = this.f3530a.mo3655a(c0504j.f3525j);
        if (a == null) {
            GameNetEngine.m1563a("specialAction=null on completeQueueItem for item.uIndex:" + c0504j.f3525j + " id:" + this.f3530a.f7166eh, true);
            return null;
        }
        InterfaceC0303as mo5457i = a.mo5457i();
        if (mo5457i == null) {
            GameNetEngine.m1563a("unitType=null on completeQueueItem for item.uIndex:" + c0504j.f3525j + " id:" + this.f3530a.f7166eh, false);
            return null;
        }
        return m3355a(mo5457i, f, z, f2);
    }

    /* renamed from: a */
    public void m3357a(AbstractC0244am abstractC0244am, float f, boolean z) {
        abstractC0244am.f1628cl = 30.0f;
        if (this.f3530a instanceof C0495f) {
            abstractC0244am.f1628cl += 40.0f;
        }
        if (abstractC0244am instanceof AbstractC0629y) {
            AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
            abstractC0629y.m2856j(90.0f);
            if (abstractC0629y.mo2822z() < 0.75d) {
                abstractC0244am.f1628cl += 30.0f;
            }
            if (abstractC0629y.mo2822z() < 0.55d) {
                abstractC0244am.f1628cl += 20.0f;
            }
            float f2 = z ? 0.0f : 1.0f;
            float m2107k = this.f3530a.f7172eo + (C0773f.m2107k(abstractC0244am.f1623cg) * f);
            float m2110j = this.f3530a.f7173ep + (C0773f.m2110j(abstractC0244am.f1623cg) * f);
            if (this.f3531b != null) {
                if (f != 0.0f) {
                    abstractC0629y.m2878d(m2107k, m2110j);
                }
                abstractC0629y.m2878d(this.f3531b.x + f2, this.f3531b.y);
                return;
            }
            float m2110j2 = m2107k - (C0773f.m2110j(abstractC0244am.f1623cg) * f2);
            float m2107k2 = m2110j + (C0773f.m2107k(abstractC0244am.f1623cg) * f2);
            if (f != 0.0f) {
                abstractC0629y.m2878d(m2110j2, m2107k2);
            }
        }
    }

    /* renamed from: a */
    public AbstractC0244am m3355a(InterfaceC0303as interfaceC0303as, float f, boolean z, float f2) {
        AbstractC0244am mo3564a = interfaceC0303as.mo3564a();
        mo3564a.f7172eo = this.f3530a.f7172eo;
        mo3564a.f7173ep = this.f3530a.f7173ep + 5.0f;
        mo3564a.f1623cg = 90.0f + f2;
        mo3564a.mo3583f(this.f3530a.f1614bX);
        mo3564a.mo3669B(this.f3530a);
        m3357a(mo3564a, f, z);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (mo3564a.f1614bX == gameEngine.f6312bs) {
            gameEngine.f6330bS.f5265i.m1946a(mo3564a);
        }
        return mo3564a;
    }

    /* renamed from: a */
    public final boolean m3366a() {
        return this.f3532c.f7109a == 0;
    }

    /* renamed from: a */
    public C0504j m3359a(AbstractC0228w abstractC0228w, boolean z) {
        return m3358a(abstractC0228w, z, (PointF) null, (AbstractC0244am) null);
    }

    /* renamed from: a */
    public C0504j m3358a(AbstractC0228w abstractC0228w, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        C0504j c0504j = new C0504j();
        c0504j.f3525j = abstractC0228w.m4309N();
        c0504j.f3523h = pointF;
        c0504j.f3524i = abstractC0244am;
        if (c0504j.f3525j == null) {
            throw new RuntimeException("item.uIndex==null??");
        }
        c0504j.f3516a = 1;
        c0504j.f3517b = abstractC0228w.mo3291K();
        c0504j.f3518c = abstractC0228w.mo4078B();
        c0504j.f3519d = abstractC0228w.mo4054r_();
        c0504j.f3520e = abstractC0228w.mo4071P();
        c0504j.f3521f = abstractC0228w.mo3089g();
        c0504j.f3522g = abstractC0228w.mo5457i();
        c0504j.f3527l = abstractC0228w.mo4075H();
        if (!z) {
            PlayerData.m4417b((AbstractC0244am) this.f3530a);
            if (c0504j.f3527l) {
                int i = 0;
                for (int i2 = 0; i2 < this.f3532c.size() && ((C0504j) this.f3532c.get(i2)).f3527l; i2++) {
                    i = i2 + 1;
                }
                if (i != 0 || this.f3532c.size() != 0) {
                }
                this.f3532c.add(i, c0504j);
            } else {
                this.f3532c.add(c0504j);
            }
            PlayerData.m4401c(this.f3530a);
        } else {
            this.f3533d.add(c0504j);
        }
        return c0504j;
    }

    /* renamed from: b */
    public C0504j m3347b(AbstractC0228w abstractC0228w, boolean z) {
        if (z) {
            if (m3364a(abstractC0228w.m4309N(), true) > 0) {
                C0504j m3359a = m3359a(abstractC0228w, true);
                m3359a.f3526k = true;
                return m3359a;
            }
            return null;
        }
        C1136m c1136m = this.f3532c;
        ListIterator listIterator = c1136m.listIterator(c1136m.size());
        while (listIterator.hasPrevious()) {
            C0504j c0504j = (C0504j) listIterator.previous();
            if (c0504j.f3525j.equals(abstractC0228w.m4309N())) {
                PlayerData.m4417b((AbstractC0244am) this.f3530a);
                listIterator.remove();
                PlayerData.m4401c(this.f3530a);
                return c0504j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m3353a(C0504j c0504j) {
        this.f3535f = c0504j;
        this.f3530a.mo2915bC();
    }

    /* renamed from: b */
    public C0504j m3348b() {
        return this.f3535f;
    }

    /* renamed from: c */
    public C0429b m3344c() {
        if (this.f3535f == null || this.f3535f.f3519d == null) {
            return null;
        }
        return C0429b.m3843a(this.f3535f.f3519d, -(this.f3535f.f3517b * this.f3530a.mo3611cx() * 60.0f));
    }

    /* renamed from: d */
    public AbstractC0224s m3342d() {
        if (this.f3535f != null) {
            return this.f3530a.mo3655a(this.f3535f.f3525j);
        }
        return null;
    }

    /* renamed from: a */
    public void m3365a(float f) {
        if (!m3366a()) {
            C0504j c0504j = (C0504j) m3340f().get(0);
            if (this.f3535f != c0504j) {
                if (c0504j.f3528m < 0.0f) {
                    c0504j.f3528m = 0.0f;
                    ((InterfaceC0506l) this.f3530a).mo3336b(c0504j);
                }
                if (this.f3535f != null) {
                    this.f3534e = c0504j.f3528m;
                }
                m3353a(c0504j);
            }
            float cx = c0504j.f3517b * this.f3530a.mo3611cx() * f;
            boolean z = false;
            if (c0504j.f3519d != null) {
                if (this.f3534e + cx > 1.0f) {
                    cx = 1.0f - this.f3534e;
                    z = true;
                }
                double d = (this.f3534e + cx) - c0504j.f3529n;
                double d2 = 0.0d;
                if (z) {
                    d2 = 1.0d - c0504j.f3529n;
                } else if (d >= 0.009999999776482582d) {
                    d2 = ((int) (d / 0.009999999776482582d)) * 0.009999999776482582d;
                }
                boolean z2 = false;
                if (d2 > 0.0d && this.f3530a.f1614bX.f1361am.m3759a(c0504j.f3519d)) {
                    z2 = true;
                }
                if (!z2 && (d2 <= 0.0d || c0504j.f3519d.m3853c(this.f3530a, d2))) {
                    c0504j.f3529n += d2;
                } else {
                    if (!z2) {
                        this.f3530a.f1614bX.f1361am.m3758a(c0504j.f3519d, this.f3530a, d2);
                    }
                    cx = 0.0f;
                    z = false;
                }
            }
            this.f3534e += cx;
            if (z) {
                this.f3534e = 1.0f;
            }
            c0504j.f3528m = this.f3534e;
            if (this.f3534e >= 1.0f) {
                if (c0504j.f3521f && ((InterfaceC0506l) this.f3530a).mo3334dA()) {
                    this.f3534e = 1.0f;
                    return;
                }
                PlayerData.m4417b((AbstractC0244am) this.f3530a);
                this.f3534e = 0.0f;
                c0504j.f3516a--;
                if (c0504j.f3516a <= 0) {
                    List m3340f = m3340f();
                    if (m3340f.size() == 0) {
                        GameEngine.print("-------------buildQueue empty for:" + c0504j.f3525j);
                        GameEngine.print("-------------");
                    } else {
                        m3340f.remove(0);
                    }
                }
                PlayerData.m4401c(this.f3530a);
                ((InterfaceC0506l) this.f3530a).mo3294a(c0504j);
                return;
            }
            return;
        }
        m3353a((C0504j) null);
        this.f3534e = 0.0f;
        if (this.f3533d.f7109a > 0) {
            C0504j c0504j2 = (C0504j) this.f3533d.get(0);
            if (c0504j2.f3517b > 10.0f && c0504j2.f3528m <= 0.0f) {
                c0504j2.f3528m = 1.0f;
                AbstractC0224s a = this.f3530a.mo3655a(c0504j2.f3525j);
                if (a != null && a.mo4070Q()) {
                    a.mo4067a(this.f3530a);
                }
            }
        }
    }

    /* renamed from: e */
    public void m3341e() {
        Iterator it = this.f3532c.iterator();
        while (it.hasNext()) {
            C0504j c0504j = (C0504j) it.next();
            if (this.f3530a.mo3655a(c0504j.f3525j) == null) {
                m3345b(c0504j);
                m3343c(c0504j);
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public void m3349a(boolean z) {
        Iterator it = this.f3532c.iterator();
        while (it.hasNext()) {
            C0504j c0504j = (C0504j) it.next();
            if (z) {
                m3345b(c0504j);
            }
            m3343c(c0504j);
            it.remove();
        }
    }

    /* renamed from: b */
    private void m3345b(C0504j c0504j) {
        if (((InterfaceC0506l) this.f3530a).mo3335c(c0504j)) {
            if (c0504j.f3519d != null && c0504j.f3529n > 0.0d) {
                c0504j.f3519d.m3848a((AbstractC0244am) this.f3530a, c0504j.f3529n, true);
            }
            c0504j.f3518c.m3809h(this.f3530a);
        }
    }

    /* renamed from: c */
    private void m3343c(C0504j c0504j) {
    }

    /* renamed from: a */
    public int m3356a(InterfaceC0303as interfaceC0303as) {
        int i = 0;
        int i2 = this.f3532c.f7109a;
        if (i2 != 0) {
            Object[] m535a = this.f3532c.m535a();
            for (int i3 = 0; i3 < i2; i3++) {
                C0504j c0504j = (C0504j) m535a[i3];
                if (c0504j.f3521f && c0504j.f3522g == interfaceC0303as) {
                    i += c0504j.f3516a;
                }
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3364a(C0208c c0208c, boolean z) {
        return m3363a(c0208c, z, false);
    }

    /* renamed from: a */
    public int m3354a(C0453g c0453g) {
        if (c0453g == null) {
            return this.f3532c.f7109a;
        }
        int i = 0;
        Iterator it = this.f3532c.iterator();
        while (it.hasNext()) {
            if (C0453g.m3685a(c0453g, ((C0504j) it.next()).f3520e)) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: a */
    public int m3363a(C0208c c0208c, boolean z, boolean z2) {
        int i = 0;
        if (this.f3532c.f7109a != 0) {
            Iterator it = this.f3532c.iterator();
            while (it.hasNext()) {
                C0504j c0504j = (C0504j) it.next();
                if (AbstractC0224s.f1466i == c0208c || c0504j.f3525j.equals(c0208c)) {
                    if (!z2 || c0504j.f3521f) {
                        i += c0504j.f3516a;
                    }
                }
            }
        }
        if (z && this.f3533d.f7109a != 0) {
            Iterator it2 = this.f3533d.iterator();
            while (it2.hasNext()) {
                C0504j c0504j2 = (C0504j) it2.next();
                if (AbstractC0224s.f1466i == c0208c || c0504j2.f3525j.equals(c0208c)) {
                    if (!z2 || c0504j2.f3521f) {
                        if (!c0504j2.f3526k) {
                            i += c0504j2.f3516a;
                        } else {
                            i -= c0504j2.f3516a;
                        }
                    }
                }
            }
        }
        return i;
    }

    /* renamed from: b */
    public AbstractC0224s m3346b(InterfaceC0303as interfaceC0303as) {
        ArrayList N = this.f3530a.mo3131N();
        int size = N.size();
        for (int i = 0; i < size; i++) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) N.get(i);
            if (abstractC0224s != null && (abstractC0224s instanceof AbstractC0228w)) {
                AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
                if (abstractC0228w.mo5457i() == interfaceC0303as) {
                    return abstractC0228w;
                }
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0504j m3360a(AbstractC0224s abstractC0224s, boolean z, PointF pointF, AbstractC0244am abstractC0244am) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3096a((AbstractC0244am) this.f3530a, false) && abstractC0224s.mo3094b(this.f3530a)) {
                    if ((!abstractC0228w.mo3089g() || this.f3530a.f1614bX.m4353w() < this.f3530a.f1614bX.m4352x()) && abstractC0228w.mo4078B().m3854c(this.f3530a)) {
                        return m3358a(abstractC0228w, false, pointF, abstractC0244am);
                    }
                    return null;
                }
                return null;
            }
            C0504j m3347b = m3347b(abstractC0228w, false);
            if (m3347b != null) {
                m3345b(m3347b);
                m3343c(m3347b);
                return m3347b;
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public void m3361a(AbstractC0224s abstractC0224s, boolean z) {
        if (abstractC0224s instanceof AbstractC0228w) {
            AbstractC0228w abstractC0228w = (AbstractC0228w) abstractC0224s;
            if (!z) {
                if (abstractC0224s.mo3096a((AbstractC0244am) this.f3530a, true)) {
                    if ((!abstractC0228w.mo3089g() || this.f3530a.f1614bX.m4353w() < this.f3530a.f1614bX.m4352x()) && abstractC0228w.mo4078B().m3829b(this.f3530a, abstractC0224s.mo4070Q())) {
                        m3359a(abstractC0228w, true);
                    }
                }
            } else if (m3347b(abstractC0228w, true) != null) {
                abstractC0228w.mo4078B().m3812e(this.f3530a, abstractC0224s.mo4070Q());
            }
        }
    }

    /* renamed from: a */
    public void m3362a(AbstractC0224s abstractC0224s) {
        if (this.f3533d.size() != 0) {
            C0504j c0504j = null;
            Iterator it = this.f3533d.iterator();
            while (it.hasNext()) {
                C0504j c0504j2 = (C0504j) it.next();
                if (c0504j2.f3525j.equals(abstractC0224s.m4309N())) {
                    c0504j = c0504j2;
                }
            }
            if (c0504j != null) {
                if (!c0504j.f3526k) {
                    c0504j.f3518c.m3812e(this.f3530a, abstractC0224s.mo4070Q());
                } else {
                    c0504j.f3518c.m3815d(this.f3530a, abstractC0224s.mo4070Q());
                }
                this.f3533d.remove(c0504j);
            }
        }
    }

    /* renamed from: f */
    public List m3340f() {
        return this.f3532c;
    }

    /* renamed from: g */
    public C1136m m3339g() {
        return this.f3532c;
    }
}