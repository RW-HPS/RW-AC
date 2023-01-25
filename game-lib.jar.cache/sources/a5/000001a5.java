package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.gameFramework.p035d.C0758c;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/j.class */
public class C0215j extends AbstractC0224s {

    /* renamed from: a */
    public EnumC0216k f1447a;

    /* renamed from: b */
    static ArrayList f1448b = new ArrayList();

    /* renamed from: c */
    static Rect f1449c;

    public C0215j() {
        this(EnumC0216k.normal);
    }

    public C0215j(EnumC0216k enumC0216k) {
        super("c_6_" + enumC0216k.name());
        this.f1447a = enumC0216k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3094b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3093c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: w */
    public EnumC0249ar mo3087i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3092e() {
        return EnumC0226u.pingMap;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3091f() {
        return EnumC0225t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3090g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3099a() {
        return "Ping Map" + this.f1447a.m4318a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3096b() {
        return this.f1447a.m4317b();
    }

    /* renamed from: K */
    public String m4321K() {
        return this.f1447a.m4316c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: h_ */
    public boolean mo3088h_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo4278s() {
        return true;
    }

    static {
        for (EnumC0216k enumC0216k : EnumC0216k.values()) {
            f1448b.add(new C0215j(enumC0216k));
        }
        f1449c = new Rect();
    }

    /* renamed from: a */
    public static C0215j m4320a(C0208c c0208c) {
        Iterator it = f1448b.iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.m4298d(c0208c)) {
                return (C0215j) abstractC0224s;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: q */
    public ArrayList mo4295q(AbstractC0244am abstractC0244am) {
        return f1448b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0970e mo3151j() {
        return C0758c.f4783s[9].f4908i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo4293v() {
        int ordinal = 7 + this.f1447a.ordinal();
        f1449c.m5166a(29 * ordinal, 0, (29 * ordinal) + 28, 28);
        return f1449c;
    }
}