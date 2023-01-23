package com.corrodinggames.rts.game.units.a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/j.class */
public class j extends s {

    /* renamed from: a  reason: collision with root package name */
    public k f179a;
    static ArrayList b = new ArrayList();
    static Rect c;

    public j() {
        this(k.normal);
    }

    public j(k kVar) {
        super("c_6_" + kVar.name());
        this.f179a = kVar;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int b(am amVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public int c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    /* renamed from: w */
    public ar i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public u e() {
        return u.pingMap;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public t f() {
        return t.none;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String a() {
        return "Ping Map" + this.f179a.a();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public String b() {
        return this.f179a.b();
    }

    public String K() {
        return this.f179a.c();
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public boolean s() {
        return true;
    }

    static {
        for (k kVar : k.values()) {
            b.add(new j(kVar));
        }
        c = new Rect();
    }

    public static j a(c cVar) {
        Iterator it = b.iterator();
        while (it.hasNext()) {
            s sVar = (s) it.next();
            if (sVar.d(cVar)) {
                return (j) sVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public ArrayList q(am amVar) {
        return b;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public com.corrodinggames.rts.gameFramework.m.e j() {
        return com.corrodinggames.rts.gameFramework.d.c.s[9].i;
    }

    @Override // com.corrodinggames.rts.game.units.a.s
    public Rect v() {
        int ordinal = 7 + this.f179a.ordinal();
        c.a(29 * ordinal, 0, (29 * ordinal) + 28, 28);
        return c;
    }
}