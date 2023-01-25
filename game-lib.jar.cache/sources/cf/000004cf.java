package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.gameFramework.AbstractC0741bq;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/am.class */
public class C0809am extends AbstractC0741bq {

    /* renamed from: i */
    private final C0775a f5196i;

    /* renamed from: a */
    public ArrayList f5197a = new ArrayList();

    /* renamed from: b */
    public float f5198b;

    /* renamed from: c */
    public long f5199c;

    /* renamed from: d */
    public float f5200d;

    /* renamed from: e */
    public float f5201e;

    /* renamed from: f */
    public float f5202f;

    /* renamed from: g */
    public boolean f5203g;

    /* renamed from: h */
    public boolean f5204h;

    public C0809am(C0775a c0775a, boolean z) {
        this.f5196i = c0775a;
        this.f5203g = z;
    }

    /* renamed from: a */
    public void m1962a() {
        AbstractC0244am abstractC0244am = null;
        Iterator it = this.f5197a.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if (!abstractC0244am2.f1612bV && abstractC0244am2.f1656cN == null && this.f5196i.f4990a.m1812j(abstractC0244am2) && abstractC0244am2.m4211cf()) {
                abstractC0244am = abstractC0244am2;
            }
        }
        if (this.f5199c > GameEngine.m1087V() - 700 && abstractC0244am != null) {
            this.f5196i.f4991b.m1022b(abstractC0244am.f7173eo, abstractC0244am.f7174ep);
        }
        this.f5199c = GameEngine.m1087V();
    }

    /* renamed from: b */
    public void m1960b() {
        this.f5197a.clear();
    }

    /* renamed from: c */
    public void m1959c() {
        Iterator it = AbstractC1155w.f7177er.iterator();
        while (it.hasNext()) {
            AbstractC1155w abstractC1155w = (AbstractC1155w) it.next();
            if (abstractC1155w instanceof AbstractC0629y) {
                AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC1155w;
                if (abstractC0629y.f1649cG && !this.f5197a.contains(abstractC0629y)) {
                    this.f5197a.add(abstractC0629y);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        m1958d();
        gameOutputStream.writeFloat(this.f5198b);
        gameOutputStream.writeLong(this.f5199c);
        gameOutputStream.writeInt(this.f5197a.size());
        Iterator it = this.f5197a.iterator();
        while (it.hasNext()) {
            gameOutputStream.mo1334a((AbstractC0244am) it.next());
        }
        gameOutputStream.writeByte(0);
    }

    /* renamed from: a */
    public void m1961a(GameInputStream gameInputStream) {
        this.f5198b = gameInputStream.readFloat();
        this.f5199c = gameInputStream.readLong();
        this.f5197a.clear();
        int readInt = gameInputStream.readInt();
        for (int i = 0; i < readInt; i++) {
            AbstractC0244am m1293o = gameInputStream.m1293o();
            if (m1293o != null) {
                this.f5197a.add(m1293o);
            }
        }
        gameInputStream.readByte();
    }

    /* renamed from: d */
    public void m1958d() {
        if (this.f5197a.size() == 0) {
            return;
        }
        Iterator it = this.f5197a.iterator();
        while (it.hasNext()) {
            if (((AbstractC0244am) it.next()).f1612bV) {
                it.remove();
            }
        }
    }

    /* renamed from: e */
    public void m1957e() {
        if (this.f5197a.size() == 0) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f5197a.iterator();
        while (it.hasNext()) {
            AbstractC0244am m443a = AbstractC1155w.m443a(((AbstractC0244am) it.next()).f7166eh, true);
            if (m443a != null && !m443a.f1612bV) {
                arrayList.add(m443a);
            }
        }
        this.f5197a = arrayList;
    }
}