package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/z.class */
public class C0473z {

    /* renamed from: a */
    public String f3390a;

    /* renamed from: b */
    public C0386ay[] f3391b;

    /* renamed from: c */
    final /* synthetic */ C0458l f3392c;

    /* renamed from: a */
    public boolean m3466a() {
        return (this.f3391b == null || this.f3391b.length == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m3463b() {
        return this.f3391b != null && (this.f3391b.length != 0 || this.f3391b == C0458l.f3226gf);
    }

    private C0473z(C0458l c0458l, String str) {
        this.f3392c = c0458l;
        this.f3390a = str;
        c0458l.f3308gc.add(this);
    }

    /* renamed from: c */
    public void m3462c() {
        if (this.f3390a == null || this.f3390a.equals(VariableScope.nullOrMissingString)) {
            this.f3391b = C0458l.f3225ge;
        } else if (this.f3390a.equalsIgnoreCase("NONE")) {
            this.f3391b = C0458l.f3226gf;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f3390a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0386ay m3522d = this.f3392c.m3522d(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(m3522d);
                }
            }
            this.f3391b = (C0386ay[]) arrayList.toArray(C0458l.f3225ge);
        }
    }

    /* renamed from: a */
    public C0760e m3465a(float f, float f2, float f3, float f4, AbstractC1155w abstractC1155w) {
        return m3464a(f, f2, f3, f4, abstractC1155w, 0, (short) 0);
    }

    /* renamed from: a */
    public C0760e m3464a(float f, float f2, float f3, float f4, AbstractC1155w abstractC1155w, int i, short s) {
        C0760e c0760e = null;
        for (C0386ay c0386ay : this.f3391b) {
            C0760e m3956a = c0386ay.m3956a(f, f2, f3, f4, abstractC1155w, i, s);
            if (m3956a != null && c0760e == null) {
                c0760e = m3956a;
            }
        }
        return c0760e;
    }
}