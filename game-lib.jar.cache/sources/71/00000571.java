package com.corrodinggames.rts.gameFramework.unitAction;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/f.class */
public class C0971f {

    /* renamed from: a */
    public C0970e f6630a;

    /* renamed from: b */
    public InterfaceC1063y f6631b;

    /* renamed from: c */
    public Paint f6632c;

    /* renamed from: e */
    boolean f6634e;

    /* renamed from: f */
    int f6635f;

    /* renamed from: d */
    int f6633d = 0;

    /* renamed from: g */
    boolean f6636g = false;

    /* renamed from: h */
    int f6637h = 0;

    /* renamed from: i */
    int f6638i = 0;

    /* renamed from: j */
    int f6639j = 0;

    /* renamed from: k */
    int f6640k = 1;

    /* renamed from: l */
    HashMap f6641l = new HashMap();

    /* renamed from: m */
    ArrayList f6642m = new ArrayList();

    public C0971f(int i, int i2) {
        m896a(i, i2);
    }

    /* renamed from: a */
    public void m896a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m5460e("Creating BitmapOrTextureAlias: " + i + "x" + i2);
        this.f6630a = gameEngine.f6326bO.mo219a(i, i2, true);
        this.f6631b = gameEngine.f6326bO.mo161b(this.f6630a);
        this.f6632c = new C0966ag();
        this.f6632c.m5225a(new C1060v(EnumC1061w.copy));
    }

    /* renamed from: a */
    public void m894a(C0970e c0970e, int i, int i2) {
        this.f6631b.mo160b(c0970e, i, i2, this.f6632c);
        this.f6631b.mo131p();
    }

    /* renamed from: a */
    public void m897a() {
        this.f6631b.mo218a(0, PorterDuff.Mode.CLEAR);
    }

    /* renamed from: b */
    public void m893b() {
        this.f6633d = 0;
        this.f6634e = false;
        this.f6635f = 0;
        this.f6637h = 0;
        this.f6638i = 0;
        this.f6639j = 0;
        this.f6641l.clear();
        m897a();
    }

    /* renamed from: c */
    public void m891c() {
        this.f6635f++;
        if (this.f6634e && this.f6635f > 600) {
            this.f6636g = true;
            this.f6642m.clear();
        }
    }

    /* renamed from: d */
    public void m890d() {
        if (this.f6636g) {
            this.f6636g = false;
            m893b();
            Iterator it = this.f6642m.iterator();
            while (it.hasNext()) {
                m895a((C0970e) it.next());
            }
            this.f6642m.clear();
        }
    }

    /* renamed from: a */
    public C0972g m895a(C0970e c0970e) {
        C0972g c0972g = (C0972g) this.f6641l.get(c0970e);
        if (c0972g != null) {
            if (this.f6636g) {
                this.f6642m.add(c0970e);
            }
            if (c0972g.f6648f != c0970e.f6611e) {
                GameEngine.m5460e("BitmapOrTextureAlias: Image was updated: " + c0970e.mo65a());
                this.f6641l.remove(c0970e);
            } else {
                return c0972g;
            }
        }
        C0972g m892b = m892b(c0970e);
        if (m892b != null) {
            return m892b;
        }
        return null;
    }

    /* renamed from: b */
    public C0972g m892b(C0970e c0970e) {
        int mo387m = c0970e.mo387m();
        int mo388l = c0970e.mo388l();
        int mo387m2 = this.f6630a.mo387m();
        int mo388l2 = this.f6630a.mo388l();
        if (this.f6637h + mo387m > mo387m2) {
            this.f6637h = 0;
            this.f6638i += this.f6639j + this.f6640k;
            this.f6639j = 0;
        }
        if (this.f6638i + mo388l > mo388l2) {
            if (!this.f6634e) {
                this.f6634e = true;
                return null;
            }
            return null;
        }
        C0972g c0972g = new C0972g();
        c0972g.f6643a = this.f6630a;
        int i = this.f6637h;
        int i2 = this.f6638i;
        this.f6637h += mo387m + this.f6640k;
        if (this.f6639j < mo388l) {
            this.f6639j = mo388l;
        }
        m894a(c0970e, i, i2);
        c0972g.f6644b = i;
        c0972g.f6645c = i2;
        c0972g.f6646d = mo387m;
        c0972g.f6647e = mo388l;
        c0972g.f6648f = c0970e.f6611e;
        this.f6633d++;
        this.f6641l.put(c0970e, c0972g);
        return c0972g;
    }
}