package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.bb */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bb.class */
public class C0404bb {

    /* renamed from: a */
    public static final C0404bb f2505a = m3912a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public C0405bc[] f2506b;

    /* renamed from: c */
    public String f2507c;

    /* renamed from: d */
    public int f2508d = -1;

    /* renamed from: e */
    public String f2509e;

    /* renamed from: a */
    public static C0404bb m3912a(String str) {
        C0404bb c0404bb = new C0404bb();
        ArrayList arrayList = new ArrayList();
        C0405bc c0405bc = new C0405bc();
        c0405bc.f2510a = null;
        c0405bc.f2511b = str;
        arrayList.add(c0405bc);
        c0404bb.f2506b = (C0405bc[]) arrayList.toArray(new C0405bc[0]);
        c0404bb.m3910b();
        return c0404bb;
    }

    /* renamed from: b */
    public static C0404bb m3909b(String str) {
        C0404bb c0404bb = new C0404bb();
        c0404bb.f2509e = str;
        c0404bb.m3910b();
        return c0404bb;
    }

    public C0404bb() {
    }

    public C0404bb(C0405bc[] c0405bcArr) {
        this.f2506b = c0405bcArr;
    }

    /* renamed from: a */
    public boolean m3913a() {
        C0405bc[] c0405bcArr;
        if (this.f2506b != null) {
            for (C0405bc c0405bc : this.f2506b) {
                if (c0405bc.f2511b != null && !VariableScope.nullOrMissingString.equals(c0405bc.f2511b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m3911a(String str, String str2) {
        if (this.f2506b != null) {
            for (C0405bc c0405bc : this.f2506b) {
                c0405bc.m3908a(str, str2);
            }
        } else {
            GameEngine.print("LocaleString: replaceAll with null strings");
        }
        this.f2508d = -1;
    }

    /* renamed from: b */
    public String m3910b() {
        C0405bc[] c0405bcArr;
        C0405bc[] c0405bcArr2;
        if (this.f2508d == C0855a.f5615c) {
            return this.f2507c;
        }
        if (this.f2509e != null) {
            this.f2508d = C0855a.f5615c;
            this.f2507c = C0855a.m1714a(this.f2509e, new Object[0]);
            return this.f2507c;
        }
        String m1711c = C0855a.m1711c();
        for (C0405bc c0405bc : this.f2506b) {
            if (m1711c.equals(c0405bc.f2510a)) {
                this.f2508d = C0855a.f5615c;
                this.f2507c = c0405bc.f2511b;
                return this.f2507c;
            }
        }
        for (C0405bc c0405bc2 : this.f2506b) {
            if (c0405bc2.f2510a == null) {
                this.f2508d = C0855a.f5615c;
                this.f2507c = c0405bc2.f2511b;
                return this.f2507c;
            }
        }
        this.f2508d = C0855a.f5615c;
        this.f2507c = "<NO DEFAULT TEXT FOUND>";
        return this.f2507c;
    }
}