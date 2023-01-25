package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.aj */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aj.class */
public class C0352aj {

    /* renamed from: a */
    public static final C0352aj f2244a = m3986a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public AbstractC0353ak[] f2245b;

    /* renamed from: c */
    public C0405bc[] f2246c;

    /* renamed from: d */
    public String f2247d;

    /* renamed from: e */
    public int f2248e = -1;

    /* renamed from: f */
    public String f2249f;

    /* renamed from: g */
    public String f2250g;

    /* renamed from: h */
    C0458l f2251h;

    /* renamed from: a */
    public static C0352aj m3986a(String str) {
        C0352aj c0352aj = new C0352aj();
        ArrayList arrayList = new ArrayList();
        C0405bc c0405bc = new C0405bc();
        c0405bc.f2510a = null;
        c0405bc.f2511b = str;
        arrayList.add(c0405bc);
        c0352aj.f2246c = (C0405bc[]) arrayList.toArray(new C0405bc[0]);
        c0352aj.m3989a();
        return c0352aj;
    }

    /* renamed from: a */
    public static C0352aj m3987a(C0404bb c0404bb) {
        if (c0404bb == null) {
            return null;
        }
        C0352aj c0352aj = new C0352aj();
        c0352aj.f2251h = C0458l.f2934b;
        c0352aj.f2246c = c0404bb.f2506b;
        c0352aj.f2249f = c0404bb.f2509e;
        if (c0352aj.f2246c != null) {
            C0405bc[] c0405bcArr = c0352aj.f2246c;
            int length = c0405bcArr.length;
            int i = 0;
            while (i < length) {
                C0405bc c0405bc = c0405bcArr[i];
                i = (c0405bc.f2511b == null || c0405bc.f2511b.contains("%{")) ? i + 1 : i + 1;
            }
        }
        c0352aj.m3981c();
        return c0352aj;
    }

    public C0352aj() {
    }

    public C0352aj(C0458l c0458l, C0404bb c0404bb) {
        C0405bc[] c0405bcArr;
        this.f2251h = c0458l;
        this.f2246c = c0404bb.f2506b;
        this.f2249f = c0404bb.f2509e;
        if (this.f2246c != null) {
            for (C0405bc c0405bc : this.f2246c) {
                if (c0405bc.f2511b != null && c0405bc.f2511b.contains("%{")) {
                    m3985a(c0405bc.f2511b, true);
                }
            }
        }
        m3989a();
    }

    /* renamed from: a */
    public void m3989a() {
        m3984a(true);
    }

    /* renamed from: a */
    public void m3984a(boolean z) {
        m3981c();
        if (this.f2247d != null && this.f2247d.contains("%{")) {
            this.f2245b = m3985a(this.f2247d, z);
        } else {
            this.f2245b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x012f, code lost:
        return (com.corrodinggames.rts.game.units.custom.AbstractC0353ak[]) r0.toArray(new com.corrodinggames.rts.game.units.custom.AbstractC0353ak[0]);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AbstractC0353ak[] m3985a(String str, boolean z) {
        ArrayList arrayList = new ArrayList();
        int i = 0;
        boolean z2 = false;
        while (true) {
            if (!z2) {
                int indexOf = str.indexOf("%{", i);
                if (indexOf == -1) {
                    String substring = str.substring(i, str.length());
                    if (!substring.equals(VariableScope.nullOrMissingString)) {
                        arrayList.add(new C0360ar(substring));
                    }
                } else {
                    String substring2 = str.substring(i, indexOf);
                    if (!substring2.equals(VariableScope.nullOrMissingString)) {
                        arrayList.add(new C0360ar(substring2));
                    }
                    z2 = true;
                    i = indexOf + 2;
                }
            } else {
                int indexOf2 = str.indexOf("}", i);
                if (indexOf2 == -1) {
                    arrayList.add(new C0360ar("< %{ NOT CLOSED >"));
                    break;
                }
                String substring3 = str.substring(i, indexOf2);
                try {
                    arrayList.add(AbstractC0359aq.m3980a(LogicBooleanLoader.parseBooleanBlock(this.f2251h, substring3, false)));
                } catch (RuntimeException e) {
                    String str2 = "Error: " + e.getMessage() + ", [parsing: '" + substring3 + "']";
                    this.f2250g = str2;
                    arrayList.add(new C0360ar("Error:< " + str2 + " >"));
                    if (z) {
                        throw e;
                    }
                }
                i = indexOf2 + 1;
                z2 = false;
            }
        }
    }

    /* renamed from: a */
    public String m3988a(AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            return "<No unit>:" + this.f2247d;
        }
        AbstractC0629y abstractC0629y = (AbstractC0629y) abstractC0244am;
        StringBuffer stringBuffer = new StringBuffer();
        for (AbstractC0353ak abstractC0353ak : this.f2245b) {
            stringBuffer.append(abstractC0353ak.mo3979a(abstractC0629y));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m3982b(AbstractC0244am abstractC0244am) {
        if (this.f2248e == C0855a.f5614c) {
            if (this.f2245b != null) {
                return m3988a(abstractC0244am);
            }
            return this.f2247d;
        }
        m3984a(false);
        if (this.f2245b != null) {
            return m3988a(abstractC0244am);
        }
        return this.f2247d;
    }

    /* renamed from: b */
    public String m3983b() {
        if (this.f2248e == C0855a.f5614c) {
            return this.f2247d;
        }
        m3984a(false);
        return this.f2247d;
    }

    /* renamed from: c */
    public void m3981c() {
        C0405bc[] c0405bcArr;
        C0405bc[] c0405bcArr2;
        if (this.f2249f != null) {
            this.f2248e = C0855a.f5614c;
            this.f2247d = C0855a.m1714a(this.f2249f, new Object[0]);
            return;
        }
        String m1711c = C0855a.m1711c();
        for (C0405bc c0405bc : this.f2246c) {
            if (m1711c.equals(c0405bc.f2510a)) {
                this.f2248e = C0855a.f5614c;
                this.f2247d = c0405bc.f2511b;
                return;
            }
        }
        for (C0405bc c0405bc2 : this.f2246c) {
            if (c0405bc2.f2510a == null) {
                this.f2248e = C0855a.f5614c;
                this.f2247d = c0405bc2.f2511b;
                return;
            }
        }
        this.f2248e = C0855a.f5614c;
        this.f2247d = "<NO DEFAULT TEXT FOUND>";
    }
}