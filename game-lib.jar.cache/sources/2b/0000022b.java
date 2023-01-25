package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.EnumC0198o;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.EnumC0307b;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.C0337b;
import com.corrodinggames.rts.game.units.custom.p016a.C0338c;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p016a.C0342g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0341f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0322a;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0323b;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0325d;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0326e;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0327f;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0328g;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0329h;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0330i;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0331j;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0332k;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0333l;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0334m;
import com.corrodinggames.rts.game.units.custom.p016a.p017a.C0336o;
import com.corrodinggames.rts.game.units.custom.p018b.C0390b;
import com.corrodinggames.rts.game.units.custom.p018b.C0391c;
import com.corrodinggames.rts.game.units.custom.p018b.C0396h;
import com.corrodinggames.rts.game.units.custom.p018b.C0398j;
import com.corrodinggames.rts.game.units.custom.p018b.C0400l;
import com.corrodinggames.rts.game.units.custom.p018b.C0401m;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.custom.p021e.C0442d;
import com.corrodinggames.rts.game.units.custom.p021e.C0443e;
import com.corrodinggames.rts.game.units.custom.p021e.C0444f;
import com.corrodinggames.rts.game.units.custom.p023f.C0447a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0217l;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p013a.C0220o;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p014b.AbstractC0309b;
import com.corrodinggames.rts.game.units.p024d.AbstractC0493d;
import com.corrodinggames.rts.game.units.p026e.AbstractC0530h;
import com.corrodinggames.rts.game.units.p026e.AbstractC0534j;
import com.corrodinggames.rts.game.units.p026e.C0524b;
import com.corrodinggames.rts.game.units.p026e.C0525c;
import com.corrodinggames.rts.game.units.p029h.AbstractC0596f;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.mod.C0859b;
import com.corrodinggames.rts.gameFramework.p030a.AbstractC0641i;
import com.corrodinggames.rts.gameFramework.p037f.C0825g;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.C0973h;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1108ac;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ag.class */
public class C0349ag {

    /* renamed from: b */
    static int f2208b;

    /* renamed from: c */
    static int f2209c;

    /* renamed from: d */
    public static int f2210d;

    /* renamed from: e */
    static C0859b f2211e;

    /* renamed from: f */
    static boolean f2212f;

    /* renamed from: i */
    static int f2215i;

    /* renamed from: j */
    static int f2216j;

    /* renamed from: k */
    static boolean f2217k;

    /* renamed from: l */
    static int f2218l;

    /* renamed from: a */
    static boolean f2207a = false;

    /* renamed from: g */
    public static HashMap f2213g = new HashMap();

    /* renamed from: h */
    public static HashMap f2214h = new HashMap();

    /* renamed from: m */
    public static C1136m f2219m = new C1136m();

    /* renamed from: n */
    static HashMap f2220n = new HashMap();

    /* renamed from: o */
    static final Object f2221o = new Object();

    /* renamed from: p */
    public static float f2222p = 50.0f;

    /* renamed from: q */
    public static float f2223q = 50.0f;

    /* renamed from: r */
    static C0859b f2224r = null;

    /* renamed from: s */
    static String f2225s = null;

    /* renamed from: a */
    public static void m4045a(int i) {
        if (f2211e != null) {
            f2211e.f5659G += i;
        }
    }

    /* renamed from: a */
    public static void m4046a() {
        m3996i();
        m3995j();
    }

    /* renamed from: a */
    public static void m4032a(C0970e c0970e) {
        if (c0970e != null && !c0970e.f6628v) {
            if (GameEngine.m1024az() && (c0970e instanceof C0973h)) {
                return;
            }
            c0970e.f6628v = true;
            m4045a(c0970e.mo386u());
        }
    }

    /* renamed from: a */
    public static void m4014a(C0970e[] c0970eArr) {
        if (c0970eArr != null) {
            C0970e c0970e = null;
            for (C0970e c0970e2 : c0970eArr) {
                if (c0970e2 != c0970e) {
                    m4032a(c0970e2);
                }
                if (c0970e == null) {
                    c0970e = c0970e2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4034a(AbstractC0641i abstractC0641i) {
        if (!abstractC0641i.f4103g) {
            abstractC0641i.f4103g = true;
            if (f2211e != null) {
                f2211e.f5660H += abstractC0641i.mo76a();
            }
        }
    }

    /* renamed from: a */
    public static boolean m4030a(C1136m c1136m) {
        C0458l c0458l;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(C0458l.f2935c);
        ArrayList arrayList2 = new ArrayList(C0458l.f2936d);
        C1136m c1136m2 = new C1136m();
        String str = null;
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            C0458l m4041a = m4041a((C0458l) it.next());
            if (m4041a == null) {
                GameEngine.m5777e("Failed to apply changes to unit type: " + c0458l.f2971M);
                z = true;
                if (str == null && f2225s != null) {
                    str = f2225s;
                }
            } else {
                GameEngine.m5777e("Changes applied to unit type: " + c0458l.f2971M);
                z2 = true;
                c1136m2.add(m4041a);
            }
        }
        if (str != null && GameEngine.m1030at()) {
            gameEngine.m1008c("Unit errors", str);
        }
        if (z2 && !m4002c(false)) {
            z = true;
        }
        if (z2 && !z) {
            C0458l.f2937e = null;
            m4000e();
            f2225s = null;
            PlayerData.m4454P();
            C0825g.m1903K();
            z3 = true;
            if (!z) {
                Iterator it2 = c1136m2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0458l c0458l2 = (C0458l) it2.next();
                    if (c0458l2.f3316gt.size() > 0) {
                        gameEngine.m1065a(c0458l2.f3316gt.size() + " Warning(s) loading: " + c0458l2.m3535b() + " \n" + ((String) c0458l2.f3316gt.get(0)), 1);
                        c0458l2.f3316gt.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            GameEngine.m5777e("Failed to load some units, keeping old config");
            synchronized (C0458l.f2935c) {
                C0458l.f2935c.clear();
                C0458l.f2935c.addAll(arrayList);
            }
            C0458l.f2936d = arrayList2;
        }
        return z3;
    }

    /* renamed from: b */
    public static void m4013b() {
        C1136m c1136m = new C1136m();
        f2208b = 0;
        f2209c = 0;
        f2210d = 0;
        Iterator it = AbstractC0244am.m4235bF().iterator();
        while (it.hasNext()) {
            InterfaceC0303as mo1747r = ((AbstractC0244am) it.next()).mo1747r();
            if ((mo1747r instanceof C0458l) && !c1136m.contains(mo1747r)) {
                c1136m.add((C0458l) mo1747r);
            }
        }
        if (c1136m.size() > 0) {
            m4030a(c1136m);
        }
    }

    /* renamed from: c */
    public static void m4005c() {
        boolean z = false;
        C1136m c1136m = new C1136m();
        Iterator it = C0458l.f2935c.iterator();
        while (it.hasNext()) {
            C0458l c0458l = (C0458l) it.next();
            boolean z2 = false;
            Iterator it2 = c0458l.f2943k.iterator();
            while (it2.hasNext()) {
                C0343aa c0343aa = (C0343aa) it2.next();
                long m4048a = c0343aa.m4048a(false);
                if (m4048a != c0343aa.f2165a) {
                    z2 = true;
                    c0343aa.f2165a = m4048a;
                }
            }
            if (z2) {
                if (!z) {
                    GameEngine.m5777e("Detected unit changes");
                    z = true;
                }
                c1136m.add(c0458l);
            }
        }
        if (c1136m.size() > 0) {
            m4030a(c1136m);
        }
    }

    /* renamed from: d */
    public static void m4001d() {
        if (C0458l.f2937e != null) {
            GameEngine.m5777e("applyPendingNetworkUnits: Applying new network units from server (" + C0458l.f2937e.size() + " units)");
            C0458l.f2936d = C0458l.f2937e;
            C0458l.f2937e = null;
            m4000e();
            return;
        }
        GameEngine.m5777e("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m4015a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (C0458l.f2935c) {
            Iterator it = C0458l.f2935c.iterator();
            while (it.hasNext()) {
                C0458l c0458l = (C0458l) it.next();
                if (c0458l.f2968J == null || (c0458l.f2968J.m1655m() && z)) {
                    arrayList.add(c0458l);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static C1107ab m4029a(String str) {
        synchronized (f2220n) {
            C1107ab c1107ab = (C1107ab) f2220n.get(str);
            if (c1107ab != null) {
                return c1107ab;
            }
            C1133j m4010b = m4010b(str);
            if (m4010b == null) {
                return null;
            }
            try {
                C1107ab c1107ab2 = new C1107ab(new BufferedInputStream(m4010b), str);
                c1107ab2.m708a();
                c1107ab2.f7047f = m4010b.m541d();
                f2220n.put(str, c1107ab2);
                return c1107ab2;
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0417bo("Load of '" + str + "' failed: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m4036a(C0458l c0458l, C1107ab c1107ab, String str, String str2, boolean z) {
        C1107ab m4029a = m4029a(str);
        if (m4029a == null) {
            if (z) {
                return;
            }
            throw new C0417bo("[" + str2 + "] Could not find conf target:" + str);
        }
        c0458l.m3500o(m4029a.f7047f);
        c1107ab.m700a(m4029a);
        m4040a(c0458l, c1107ab, m4029a, str, 1);
    }

    /* renamed from: a */
    public static void m4040a(C0458l c0458l, C1107ab c1107ab, C1107ab c1107ab2, String str, int i) {
        String m4022a;
        String str2;
        if (i > 10) {
            throw new C0417bo("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String m666b = c1107ab2.m666b("core", "copyFrom", (String) null);
        if (m666b != null) {
            String[] split = m666b.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new C0417bo("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (c0458l.f2968J == null) {
                            str2 = "units/common.ini";
                        } else {
                            str2 = c0458l.f2968J.f5643q + "/common.ini";
                        }
                        m4022a = m4022a(C0773f.m2114h(str2), substring);
                    } else if (trim.startsWith("CORE:")) {
                        m4022a = m4022a(C0773f.m2114h("units/common.ini"), trim.substring("CORE:".length()));
                    } else {
                        m4022a = m4022a(C0773f.m2114h(str), trim);
                    }
                    C1107ab m4029a = m4029a(m4022a);
                    if (m4029a == null) {
                        String str4 = "Could not find copyFrom target:" + m4022a;
                        if (i != 0) {
                            str4 = str4 + " (while loading: " + str + ")";
                        }
                        throw new C0417bo(str4);
                    }
                    c0458l.m3500o(m4029a.f7047f);
                    c1107ab.m700a(m4029a);
                    m4040a(c0458l, c1107ab, m4029a, m4022a, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m4039a(C0458l c0458l, C1107ab c1107ab, String str, String str2, int i) {
        if (i > 10) {
            throw new C0417bo("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String m666b = c1107ab.m666b(str2, "@copyFromSection", (String) null);
        if (m666b == null || m666b.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = m666b.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C1136m m639k = c1107ab.m639k(trim, VariableScope.nullOrMissingString);
                if (m639k.size() == 0) {
                    throw new C0417bo("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = m639k.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String m669b = c1107ab.m669b(trim, str4);
                    if (m669b != null) {
                        c1107ab.m655d(str, str4, m669b);
                    }
                }
                m4039a(c0458l, c1107ab, str, trim, i + 1);
            }
        }
    }

    /* renamed from: a */
    public static C0404bb m4031a(C1107ab c1107ab, String str, String str2, String str3) {
        return c1107ab.m676a(str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0352aj m4038a(C0458l c0458l, C1107ab c1107ab, String str, String str2, String str3) {
        return c1107ab.m701a(c0458l, str, str2, str3);
    }

    /* renamed from: a */
    public static C0458l m4041a(C0458l c0458l) {
        String str = c0458l.f2962D;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0458l c0458l2 = null;
        String str2 = null;
        if (c0458l.f2968J != null) {
            str2 = c0458l.f2968J.f5670R;
        }
        synchronized (f2220n) {
            f2220n.clear();
        }
        f2225s = null;
        try {
            c0458l2 = m4027a(str, c0458l.f2968J, c0458l.f2969K, c0458l.f2970L);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f2225s == null) {
                gameEngine.m1065a("Error loading unit:" + m4033a(c0458l.f2968J, str, true) + "\n" + e.getMessage(), 1);
            }
        }
        if (c0458l2 == null && c0458l.f2968J != null) {
            c0458l.f2968J.f5670R = str2;
        }
        if (c0458l2 != null) {
            synchronized (C0458l.f2935c) {
                C0458l.f2935c.remove(c0458l);
            }
            m4042a((InterfaceC0303as) c0458l, c0458l2, true);
            if (C0458l.f2936d.remove(c0458l)) {
                C0458l.f2936d.add(c0458l2);
                if (c0458l.f2966H != c0458l2.f2966H) {
                    f2210d++;
                }
            } else {
                GameEngine.m5777e("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            PlayerData.m4454P();
            C0825g.m1903K();
        }
        return c0458l2;
    }

    /* renamed from: a */
    public static void m4042a(InterfaceC0303as interfaceC0303as, C0458l c0458l, boolean z) {
        Iterator it = AbstractC0244am.m4235bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof C0456j) {
                C0456j c0456j = (C0456j) abstractC0244am;
                if (c0456j.f2891x == interfaceC0303as) {
                    PlayerData.m4415b((AbstractC0244am) c0456j);
                    c0456j.m3642a(c0458l, false, z);
                    c0456j.mo3041S();
                    if (c0456j.m4202dg() != null) {
                        c0456j.m4202dg().m3857a(c0458l);
                    }
                    PlayerData.m4399c(c0456j);
                }
                if (c0456j.f2893z == interfaceC0303as) {
                    c0456j.f2893z = c0458l;
                }
            }
        }
    }

    /* renamed from: a */
    public static String m4016a(ArrayList arrayList) {
        int valueOf;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            C0859b c0859b = ((C0458l) it.next()).f2968J;
            if (c0859b != null) {
                Integer num = (Integer) hashMap.get(c0859b);
                if (num == null) {
                    valueOf = 1;
                } else {
                    valueOf = Integer.valueOf(num.intValue() + 1);
                }
                hashMap.put(c0859b, valueOf);
            }
        }
        String str = VariableScope.nullOrMissingString;
        for (C0859b c0859b2 : hashMap.keySet()) {
            str = str + c0859b2.m1673a() + "(unitCount: " + ((Integer) hashMap.get(c0859b2)) + (c0859b2.m1655m() ? VariableScope.nullOrMissingString : "[disabled]") + "), ";
        }
        return str;
    }

    /* renamed from: b */
    public static String m4006b(boolean z) {
        ArrayList m4015a = m4015a(z);
        C0458l.f2937e = null;
        C0458l.f2936d = m4015a;
        f2225s = null;
        GameEngine.m5777e("enableAll: " + m4016a(C0458l.f2936d));
        m4000e();
        return f2225s;
    }

    /* renamed from: c */
    public static boolean m4002c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = C0458l.f2936d;
        if (z) {
            arrayList = m4015a(true);
        } else {
            arrayList = C0458l.f2936d;
        }
        boolean z2 = true;
        f2225s = null;
        C0458l.f2936d = arrayList;
        m3998g();
        if (f2225s != null) {
            z2 = false;
        }
        C0458l.f2936d = arrayList2;
        m3998g();
        return z2;
    }

    /* renamed from: e */
    public static void m4000e() {
        synchronized (f2221o) {
            m3991n();
        }
    }

    /* renamed from: n */
    private static void m3991n() {
        C0458l c0458l = null;
        ArrayList arrayList = new ArrayList();
        if (GameEngine.getGameEngine().m1031as()) {
            for (EnumC0249ar enumC0249ar : EnumC0249ar.values()) {
                arrayList.add(enumC0249ar);
            }
        }
        Iterator it = C0458l.f2936d.iterator();
        while (it.hasNext()) {
            C0458l c0458l2 = (C0458l) it.next();
            arrayList.add(c0458l2);
            if (c0458l2.f2971M.equals("missing") && c0458l2.f2968J == null) {
                c0458l = c0458l2;
            }
        }
        EnumC0249ar.f1796ae = arrayList;
        AbstractC0244am.m4231bL();
        m3998g();
        m3999f();
        C0433a.m3771e();
        if (c0458l == null) {
            GameEngine.m5777e("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = C0458l.f2936d.iterator();
            while (it2.hasNext()) {
                C0458l c0458l3 = (C0458l) it2.next();
                if (c0458l3.f2971M.equals("missing")) {
                    GameEngine.m5777e("Found a missing placeholder");
                    c0458l = c0458l3;
                }
            }
        }
        C0458l.f2934b = c0458l;
    }

    /* renamed from: f */
    public static void m3999f() {
        float f = 50.0f;
        float f2 = 50.0f;
        Iterator it = C0458l.f2936d.iterator();
        while (it.hasNext()) {
            C0458l c0458l = (C0458l) it.next();
            float f3 = c0458l.f3137cW;
            if (f3 > 250.0f) {
                f3 = 250.0f;
            }
            if (f < f3) {
                f = f3;
            }
            if (c0458l.f3018aH && f2 < f3) {
                f2 = f3;
            }
        }
        f2222p = f;
        f2223q = f2;
    }

    /* renamed from: b */
    public static C1133j m4010b(String str) {
        return C0765a.m2276k(VariableScope.nullOrMissingString + str);
    }

    /* renamed from: b */
    public static void m4007b(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.corrodinggames.rts.game.units.a.v] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.corrodinggames.rts.game.units.a.l] */
    /* JADX WARN: Type inference failed for: r0v260, types: [com.corrodinggames.rts.game.units.a.l] */
    /* renamed from: a */
    public static void m4043a(InterfaceC0303as interfaceC0303as) {
        C0342g c0342g;
        C0227v c0227v;
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            interfaceC0303as.mo3515h();
            if (interfaceC0303as instanceof C0458l) {
                C0458l c0458l = (C0458l) interfaceC0303as;
                if (c0458l.f3279fI != null) {
                    InterfaceC0303as m3492s = C0458l.m3492s(c0458l.f3279fI);
                    if (m3492s == null) {
                        throw new C0417bo("Could not find [ai]upgradedFrom target:" + c0458l.f3279fI);
                    }
                    c0458l.m3533b(m3492s);
                }
                Iterator it = c0458l.f2948p.iterator();
                while (it.hasNext()) {
                    ((C0469v) it.next()).mo3469a();
                }
                if (c0458l.f3226eH) {
                    C0458l.f2939g.add(c0458l);
                }
            }
            Iterator it2 = C0458l.f2936d.iterator();
            while (it2.hasNext()) {
                C0458l c0458l2 = (C0458l) it2.next();
                if (interfaceC0303as instanceof C0458l) {
                    C0458l c0458l3 = (C0458l) interfaceC0303as;
                    if (c0458l2.f3279fI != null && c0458l2.f3279fI.equalsIgnoreCase(c0458l3.mo3513i())) {
                        c0458l3.m3533b(c0458l2);
                    }
                }
                Iterator it3 = c0458l2.f3303gg.iterator();
                while (it3.hasNext()) {
                    C0463p c0463p = (C0463p) it3.next();
                    if (c0463p.f3362a.equalsIgnoreCase(interfaceC0303as.mo3513i())) {
                        c0463p.f3366e = true;
                        boolean z = false;
                        for (int i = c0458l2.f3100cl; i <= 3; i++) {
                            ArrayList mo3563a = interfaceC0303as.mo3563a(i);
                            if (c0458l2.f3018aH || c0463p.f3364c) {
                                c0227v = new C0227v(c0458l2);
                            } else {
                                c0227v = new C0217l(c0458l2);
                            }
                            if (c0463p.f3363b != -999.0f) {
                                c0227v.f1464g = c0463p.f3363b;
                            }
                            if (c0463p.f3367f != null) {
                                boolean z2 = false;
                                if (!(interfaceC0303as instanceof C0458l) && !(AbstractC0244am.m4245a(interfaceC0303as) instanceof AbstractC0629y)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    c0227v.f1465h = C0338c.m4085a(c0463p);
                                } else if (!z) {
                                    z = true;
                                    c0458l2.m3494r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + interfaceC0303as.mo3513i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = mo3563a.iterator();
                            while (it4.hasNext()) {
                                if (c0227v.equals((AbstractC0224s) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                mo3563a.add(c0227v);
                            }
                            m4007b(mo3563a);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0458l) {
                C0458l c0458l4 = (C0458l) interfaceC0303as;
                Iterator it5 = c0458l4.f3304gh.iterator();
                while (it5.hasNext()) {
                    C0339d c0339d = (C0339d) it5.next();
                    if (c0339d.f2068k != null && c0339d.f2068k.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList mo3563a2 = interfaceC0303as.mo3563a(i2);
                            C0220o c0220o = new C0220o();
                            if (c0339d.f2073p != -999.0f) {
                                c0220o.f1464g = c0339d.f2073p;
                            }
                            mo3563a2.add(c0220o);
                            c0458l4.f3143dc = true;
                            m4007b(mo3563a2);
                        }
                    } else if (c0339d.f2068k != null && c0339d.f2068k.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList mo3563a3 = interfaceC0303as.mo3563a(i3);
                            C0218m c0218m = new C0218m(true);
                            if (c0339d.f2073p != -999.0f) {
                                c0218m.f1464g = c0339d.f2073p;
                            }
                            mo3563a3.add(c0218m);
                            m4007b(mo3563a3);
                        }
                    } else if (c0339d.f2068k != null && c0339d.f2068k.equalsIgnoreCase("repair")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList mo3563a4 = interfaceC0303as.mo3563a(i4);
                            C0219n c0219n = new C0219n();
                            if (c0339d.f2073p != -999.0f) {
                                c0219n.f1464g = c0339d.f2073p;
                            }
                            mo3563a4.add(c0219n);
                            m4007b(mo3563a4);
                        }
                    } else {
                        InterfaceC0303as interfaceC0303as2 = null;
                        if (c0339d.f2068k != null) {
                            interfaceC0303as2 = EnumC0249ar.m4174a(c0339d.f2068k);
                            if (interfaceC0303as2 == null) {
                                throw new C0417bo("Could not find canBuild target:" + c0339d.f2068k);
                            }
                        } else if (c0339d.f2148aM != EnumC0341f.convert) {
                            throw new C0417bo("'Target' required for action:" + c0339d.m4080a());
                        }
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList mo3563a5 = interfaceC0303as.mo3563a(i5);
                            if (c0339d.f2148aM == EnumC0341f.build) {
                                if (interfaceC0303as2.mo3511j() || c0339d.f2146aK) {
                                    c0342g = new C0227v(interfaceC0303as2, c0339d.f2145aJ, null);
                                    c0342g.f1465h = C0338c.m4086a(c0339d);
                                } else {
                                    c0342g = new C0217l(interfaceC0303as2);
                                    c0342g.f1465h = C0338c.m4086a(c0339d);
                                }
                            } else if (c0339d.f2148aM == EnumC0341f.convert) {
                                c0342g = new C0342g(c0339d, C0458l.m3560a(interfaceC0303as2));
                            } else {
                                throw new C0417bo("Could not find actionType:" + c0339d.f2148aM);
                            }
                            if (c0339d.f2073p != -999.0f) {
                                c0342g.f1464g = c0339d.f2073p;
                            }
                            boolean z4 = false;
                            Iterator it6 = mo3563a5.iterator();
                            while (it6.hasNext()) {
                                if (c0342g.equals((AbstractC0224s) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                mo3563a5.add(c0342g);
                            }
                            m4007b(mo3563a5);
                        }
                    }
                }
            }
            if (interfaceC0303as instanceof C0458l) {
                C0458l c0458l5 = (C0458l) interfaceC0303as;
                c0458l5.f3265fu = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = interfaceC0303as.mo3563a(i6).iterator();
                    while (it7.hasNext()) {
                        AbstractC0224s abstractC0224s = (AbstractC0224s) it7.next();
                        if (!(abstractC0224s instanceof C0342g) && abstractC0224s.mo3087i() != null) {
                            c0458l5.f3265fu = true;
                        }
                    }
                }
                Iterator it8 = c0458l5.f2948p.iterator();
                while (it8.hasNext()) {
                    ((C0469v) it8.next()).mo3468b();
                }
            }
            boolean z5 = gameEngine.m1094O() && gameEngine.netEngine.gameMapData.f5860k;
            for (int i7 = 1; i7 <= 3; i7++) {
                Iterator it9 = interfaceC0303as.mo3563a(i7).iterator();
                while (it9.hasNext()) {
                    AbstractC0224s abstractC0224s2 = (AbstractC0224s) it9.next();
                    if (abstractC0224s2.f1465h instanceof C0337b) {
                        GameEngine.m1066a("=== ChainedActionConfig already on: " + interfaceC0303as.mo3513i() + " action:" + abstractC0224s2.mo3096b());
                        abstractC0224s2.f1465h = ((C0337b) abstractC0224s2.f1465h).f2043b;
                    }
                    if (z5) {
                        C0429b mo4078B = abstractC0224s2.mo4078B();
                        C0429b mo4054r_ = abstractC0224s2.mo4054r_();
                        if (!mo4078B.m3822c() && mo4054r_ == null) {
                            C0337b c0337b = new C0337b(abstractC0224s2.f1465h);
                            abstractC0224s2.f1465h = c0337b;
                            c0337b.f2044c = C0429b.f2724a;
                            c0337b.f2045d = mo4078B;
                        }
                    }
                }
            }
        } catch (C0417bo e) {
            m4024a(interfaceC0303as.mo3513i(), e, interfaceC0303as);
        } catch (RuntimeException e2) {
            m4024a(interfaceC0303as.mo3513i(), e2, interfaceC0303as);
        }
    }

    /* renamed from: g */
    public static void m3998g() {
        synchronized (f2221o) {
            m3990o();
        }
    }

    /* renamed from: o */
    private static void m3990o() {
        C0463p c0463p;
        String str;
        C0458l.f2939g.clear();
        C0458l.f2938f.clear();
        Iterator it = C0458l.f2936d.iterator();
        while (it.hasNext()) {
            C0458l c0458l = (C0458l) it.next();
            if (c0458l.f2968J != null && (str = c0458l.f2968J.f5670R) != null) {
                GameEngine.print(c0458l.mo3513i() + "(mod:" + c0458l.m3491t() + "): Getting setup while mod has error: " + str);
            }
            Iterator it2 = c0458l.f3303gg.iterator();
            while (it2.hasNext()) {
                ((C0463p) it2.next()).f3366e = false;
            }
            c0458l.f3282fL.clear();
        }
        Iterator it3 = C0458l.f2936d.iterator();
        while (it3.hasNext()) {
            C0458l c0458l2 = (C0458l) it3.next();
            try {
                if (c0458l2.f2975Q != null) {
                    for (String str2 : c0458l2.f2975Q.split(",")) {
                        String trim = str2.trim();
                        InterfaceC0303as m3539a = C0458l.m3539a(trim, false);
                        if (m3539a == null) {
                            throw new C0417bo("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (m3539a instanceof C0458l) {
                            GameEngine.m5777e("Replacing:" + m3539a.mo3513i() + " with " + c0458l2.mo3513i());
                        }
                        C0458l.f2938f.put(m3539a, c0458l2);
                    }
                }
            } catch (C0417bo e) {
                m4024a(c0458l2.mo3513i(), e, c0458l2);
            }
        }
        for (EnumC0249ar enumC0249ar : EnumC0249ar.values()) {
            m4043a(enumC0249ar);
        }
        Iterator it4 = C0458l.f2936d.iterator();
        while (it4.hasNext()) {
            m4043a((InterfaceC0303as) ((C0458l) it4.next()));
        }
        Iterator it5 = C0458l.f2936d.iterator();
        while (it5.hasNext()) {
            C0458l c0458l3 = (C0458l) it5.next();
            Iterator it6 = c0458l3.f3303gg.iterator();
            while (it6.hasNext()) {
                if (!((C0463p) it6.next()).f3366e) {
                    String str3 = c0463p.f3365d + " failed to find target:" + c0463p.f3362a;
                    c0458l3.m3496q(str3);
                    if (c0458l3.f2976R >= 1) {
                        GameEngine.m5777e("Converting warning to error (meta.strictLevel=" + c0458l3.f2976R + ")");
                        c0458l3.m3498p(str3);
                    }
                }
            }
            if (c0458l3.f3312gp != null && c0458l3.f3312gp.size() > 0) {
                Iterator it7 = c0458l3.f3312gp.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0468u) it7.next()).m3473b(c0458l3);
                    } catch (C0417bo e2) {
                        m4024a(c0458l3.mo3513i(), e2, c0458l3);
                    }
                }
            }
        }
        Iterator it8 = C0458l.f2936d.iterator();
        while (it8.hasNext()) {
            ((C0458l) it8.next()).m3495r();
        }
        Collections.sort(C0458l.f2939g, new C0464q());
    }

    /* renamed from: a */
    public static C0458l m4027a(String str, C0859b c0859b, String str2, String str3) {
        try {
            long m2440a = C0742br.m2440a();
            C1133j m4010b = m4010b(str);
            if (m4010b == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m4010b);
            m4044a(m2440a, EnumC0350ah.iniOpen);
            f2208b++;
            if (c0859b != null) {
                f2209c++;
            }
            GameEngine gameEngine = GameEngine.getGameEngine();
            String str4 = "core units";
            if (c0859b != null) {
                str4 = c0859b.m1673a();
            }
            gameEngine.m988h("Loading units - " + f2208b + " (" + str4 + ")");
            C0458l m4025a = m4025a(str, bufferedInputStream, m4010b.m542c(), c0859b, m4010b, str2, str3);
            long m2440a2 = C0742br.m2440a();
            try {
                bufferedInputStream.close();
                m4010b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            m4044a(m2440a2, EnumC0350ah.iniClose);
            return m4025a;
        } catch (RuntimeException e2) {
            m4023a(str, e2, c0859b);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v163, types: [byte[]] */
    /* renamed from: h */
    public static void m3997h() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList m1677k = gameEngine.f6385bZ.m1677k();
        f2216j = 0;
        f2215i = 0;
        f2218l = 0;
        f2217k = false;
        long m2440a = C0742br.m2440a();
        for (C0970e c0970e : f2213g.values()) {
            c0970e.f6628v = false;
            if (c0970e.f6606a != null) {
                for (C0970e c0970e2 : c0970e.f6606a) {
                    c0970e2.f6628v = false;
                }
            }
            if (c0970e.f6607b != null) {
                for (C0970e c0970e3 : c0970e.f6607b) {
                    c0970e3.f6628v = false;
                }
            }
            if (c0970e.f6608c != null) {
                for (C0970e c0970e4 : c0970e.f6608c) {
                    c0970e4.f6628v = false;
                }
            }
        }
        for (AbstractC0641i abstractC0641i : f2214h.values()) {
            abstractC0641i.f4103g = false;
        }
        byte[] bArr = null;
        byte[][] bArr2 = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = gameEngine.f6494dZ;
            gameEngine.f6495ea = bArr[1];
            bArr2 = new byte[]{new byte[3000000], new byte[3000000]};
            bArr2[0][0] = gameEngine.f6494dZ;
            bArr2[1][0] = gameEngine.f6494dZ;
            if (!GameEngine.m1030at()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            GameEngine.m5777e("Failed to reserve memory pre-mod load");
        }
        synchronized (C0458l.f2935c) {
            C0458l.f2935c.clear();
        }
        C0458l.f2936d.clear();
        C0458l.f2937e = null;
        C0458l.f2938f.clear();
        gameEngine.f6385bZ.m1674n();
        f2208b = 0;
        f2209c = 0;
        synchronized (f2220n) {
            f2220n.clear();
        }
        m4028a(C0765a.m2271p("units"), 1, false, (C0859b) null, C0765a.m2271p("units"), (String) null);
        if (!GameEngine.f6317aJ && !gameEngine.f6299ar) {
            String m3992m = m3992m();
            if (!C0765a.m2281f(m3992m)) {
                GameEngine.m5777e("Modded Custom '" + m3992m + "' directory not found");
            }
            Iterator it = m1677k.iterator();
            while (it.hasNext()) {
                C0859b c0859b = (C0859b) it.next();
                if (!c0859b.f5651y && c0859b.f5643q != null) {
                    String m1658j = c0859b.m1658j();
                    if (c0859b.f5639m) {
                        m1658j = C0765a.m2271p(m1658j);
                    }
                    if (c0859b.f5632f) {
                        GameEngine.m5777e("Disabled mod at:" + m1658j + " (name:" + c0859b.m1673a() + ")");
                    } else {
                        GameEngine.m5777e("Loading mod at:" + m1658j + " (name:" + c0859b.m1673a() + ")");
                    }
                    m4028a(m1658j, 2, true, c0859b, m1658j, (String) null);
                }
            }
            Iterator it2 = m1677k.iterator();
            while (it2.hasNext()) {
                C0859b c0859b2 = (C0859b) it2.next();
                if (c0859b2.f5651y && c0859b2.f5643q != null) {
                    String m1659i = c0859b2.m1659i();
                    if (c0859b2.f5632f) {
                        GameEngine.m5777e("Disabled workshop mod at:" + m1659i + " (name:" + c0859b2.m1673a() + ")");
                    } else {
                        GameEngine.m5777e("Loading workshop mod at:" + m1659i + " (name:" + c0859b2.m1673a() + ")");
                    }
                    m4028a(m1659i, 2, true, c0859b2, m1659i, (String) null);
                }
            }
        }
        m4046a();
        m4006b(true);
        GameEngine.m5777e("Done loading custom units. image cacheHits:" + f2216j + " image cacheMisses:" + f2215i + " (in: " + C0742br.m2438a(m2440a) + "ms)");
        GameEngine.m5777e("========= Mods data loaded ===========");
        GameEngine.m5777e("Number of mods:" + m1677k.size());
        Iterator it3 = m1677k.iterator();
        while (it3.hasNext()) {
            ((C0859b) it3.next()).m1648t();
        }
        GameEngine.m5777e("================================");
        if (byteBufferArr != null) {
            byteBufferArr[0] = null;
            byteBufferArr[1] = null;
            byteBufferArr[2] = null;
            byteBufferArr[3] = null;
        }
        if (bArr2 != null) {
            bArr2[0] = null;
            bArr2[1] = null;
        }
        if (bArr != null) {
            bArr[1] = gameEngine.f6494dZ;
            gameEngine.f6495ea = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m4028a(String str, int i, boolean z, C0859b c0859b, String str2, String str3) {
        boolean z2 = z && i == 1;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (c0859b != null) {
            if (c0859b.f5632f && !gameEngine.settingsEngine.loadDisabledModData) {
                c0859b.f5655C = true;
                return;
            }
            c0859b.f5655C = false;
        }
        if (c0859b != null && c0859b.f5632f) {
            GameEngine.m5777e("Note: Loading disabled mod: " + str);
        }
        C0765a.m2289c();
        String[] m2279h = C0765a.m2279h(str);
        if (m2279h == null) {
            String m2289c = C0765a.m2289c();
            GameEngine.print("readAllCustomUnitConfigs: ERROR");
            GameEngine.print("readAllCustomUnitConfigs: Failed to load:" + str);
            if (c0859b != null) {
                if (!c0859b.f5656D) {
                    if (m2289c == null) {
                        c0859b.f5670R = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        c0859b.f5670R = "Failed to list directory: " + m2289c;
                        return;
                    }
                }
                c0859b.f5671S = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (m2289c != null) {
                    c0859b.f5671S += ": " + m2289c;
                    return;
                }
                return;
            }
            return;
        }
        if (c0859b != null) {
            c0859b.f5656D = true;
        }
        if (!z2) {
            for (String str4 : m2279h) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : m2279h) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                C0859b c0859b2 = c0859b;
                if (z && i == 1 && c0859b2 == null) {
                    c0859b2 = gameEngine.f6385bZ.m1686e(str5);
                    if (c0859b2 == null) {
                        GameEngine.print("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        c0859b2 = gameEngine.f6385bZ.f5623c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (f2224r != c0859b2 && c0859b2 != null) {
                        f2224r = c0859b2;
                        m4046a();
                        GameEngine.m5777e("Loading units from mod: " + c0859b2.f5629c);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        GameEngine.m5777e("Skipping possible system file: " + str6);
                    } else {
                        long m2440a = C0742br.m2440a();
                        m4027a(str6, c0859b2, str2, str3);
                        m4044a(m2440a, EnumC0350ah.unitParse);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    GameEngine.m5777e("Found map: " + str7);
                    if (c0859b2 != null && c0859b2.f5654B) {
                        gameEngine.f6385bZ.m1700a(str7, c0859b2);
                    } else {
                        GameEngine.m5777e("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i < 10) {
                        if (C0765a.m2281f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j = -1;
                            if (z3) {
                                j = C0742br.m2440a();
                                GameEngine.m5777e("============");
                                GameEngine.m5777e(">>> Mod '" + c0859b2.m1666c() + "'" + (c0859b2.m1655m() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            m4028a(str8, i + 1, z, c0859b2, str9, str3);
                            if (z3 && c0859b2 != null && c0859b2.m1655m()) {
                                GameEngine.m5777e("Mod '" + c0859b2.m1666c() + "' load took:" + C0742br.m2439a(C0742br.m2438a(j)));
                            }
                        }
                    } else {
                        GameEngine.m5777e("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static C0458l m4025a(String str, InputStream inputStream, long j, C0859b c0859b, C1133j c1133j, String str2, String str3) {
        boolean z;
        C0361as c0361as;
        String substring;
        boolean z2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            if (f2207a) {
                String str4 = "CORE";
                if (c0859b != null) {
                    str4 = c0859b.m1658j();
                }
                GameEngine.m5777e("Loading unit config: " + str + " [" + str4 + "]");
            }
            gameEngine.f6374bO.mo145e();
            long m2440a = C0742br.m2440a();
            try {
                C1107ab c1107ab = new C1107ab(inputStream, str);
                m4044a(m2440a, EnumC0350ah.iniParse);
                C0458l c0458l = new C0458l();
                if (c1107ab.m685a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                c0458l.f2962D = str;
                c0458l.f2963E = c1133j.m541d();
                c0458l.f2964F = c0458l.f2962D;
                c0458l.f2968J = c0859b;
                c0458l.f2969K = str2;
                c0458l.f2970L = str3;
                f2211e = c0859b;
                f2212f = false;
                if (c0458l.f2968J != null) {
                }
                long m2440a2 = C0742br.m2440a();
                m4040a(c0458l, c1107ab, c1107ab, str, 0);
                if (c0458l.f2970L != null) {
                    m4036a(c0458l, c1107ab, c0458l.f2970L + "/all-units.template", "AUTO units.template", true);
                }
                c1107ab.m692a("core", "copyFrom");
                c0458l.f2976R = c1107ab.m667b("core", "strictLevel", (Integer) 0).intValue();
                if (c0458l.f2976R < 0) {
                    throw new C0417bo("[core]strictLevel cannot be < 0");
                }
                if (c0458l.f2976R > 1) {
                    throw new C0417bo("[core]strictLevel cannot yet be > 1");
                }
                c0458l.f3315gs = c1107ab.m685a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                c1107ab.m692a("core", "dont_load");
                c1107ab.m666b("core", "class", "CustomUnitMetadata");
                Iterator it = c1107ab.m663c("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    c1107ab.m692a((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = c1107ab.m663c("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    m4039a(c0458l, c1107ab, str5, str5, 0);
                }
                C0447a.m3702a(c0458l, c1107ab);
                String m666b = c1107ab.m666b("core", "overrideResourceLoadPath", (String) null);
                if (m666b != null) {
                    c0458l.f2964F = m4035a(c0458l, str, m666b);
                }
                m4044a(m2440a2, EnumC0350ah.iniSetup);
                c0458l.f2971M = c1107ab.m653e("core", "name");
                c0458l.f2966H = c1107ab.m665c();
                if (c0458l.f2971M.equals("self")) {
                    throw new C0417bo("Unit name: " + c0458l.f2971M + " is reserved");
                }
                if (c0458l.f2971M.startsWith("self.")) {
                    throw new C0417bo("Unit name cannot start with self.");
                }
                String m666b2 = c1107ab.m666b("core", "altNames", (String) null);
                if (m666b2 != null && !m666b2.equalsIgnoreCase("NONE")) {
                    for (String str6 : m666b2.split(",")) {
                        c0458l.f2972N.add(str6.trim());
                    }
                }
                c0458l.f2973O = C0453g.m3681a(c1107ab.m666b("core", "tags", (String) null));
                if (c0458l.f2976R >= 1 && c0458l.f2973O != null) {
                    for (C0453g c0453g : c0458l.f2973O.f2866a) {
                        if (c0453g.f2862a.contains(" ")) {
                            throw new C0417bo("(strictLevel 1) [core]tags: space in tag: '" + c0453g.f2862a + "'");
                        }
                    }
                }
                c0458l.f2975Q = c1107ab.m666b("core", "overrideAndReplace", (String) null);
                if (c0458l.f2975Q != null && c0458l.f2975Q.equalsIgnoreCase("NONE")) {
                    c0458l.f2975Q = null;
                }
                String m666b3 = c1107ab.m666b("core", "defineUnitMemory", (String) null);
                if (m666b3 != null) {
                    c0458l.f2950r.addDefineValue(c0458l, "core", "defineUnitMemory", m666b3);
                    if (c0458l.f2950r.hasArrays()) {
                        c0458l.m3544a("1.15p11", 115011, "core", "Memory arrays (in defineUnitMemory)");
                    }
                }
                Iterator it3 = c1107ab.m639k("core", "@memory ").iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String trim = str7.substring("@memory ".length()).trim();
                    String m666b4 = c1107ab.m666b("core", str7, (String) null);
                    if (m666b4 != null) {
                        if (!m666b4.contains(",")) {
                            c0458l.f2950r.addSingleDefine(c0458l, trim, m666b4, "core", str7);
                            if (c0458l.f2950r.hasArrays()) {
                                c0458l.m3544a("1.15p11", 115011, "core", "Memory arrays (in " + str7 + ")");
                            }
                        } else {
                            throw new C0417bo("[core]" + str7 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                c0458l.f2978T = (EnumC0346ad) c1107ab.m684a("core", "onNewMapSpawn", (Enum) null, EnumC0346ad.class);
                c0458l.f3017aG = c1107ab.m683a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                c0458l.m3500o(c0458l.f2963E);
                if (c0458l.f2971M.equals("missing")) {
                    if (c0859b == null) {
                        GameEngine.m5777e("Setting missingPlaceHolder");
                        C0458l.f2934b = c0458l;
                    } else {
                        GameEngine.m5777e("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                c0458l.f3015aE = c1107ab.m666b("core", "displayLocaleKey", (String) null);
                c0458l.f3013aC = m4031a(c1107ab, "core", "displayText", (String) null);
                c0458l.f3014aD = m4031a(c1107ab, "core", "displayDescription", (String) null);
                c0458l.f3222eD = c1107ab.m685a("core", "isBio", (Boolean) false).booleanValue();
                c0458l.f3223eE = c1107ab.m685a("core", "isBug", (Boolean) false).booleanValue();
                c0458l.f3226eH = c1107ab.m685a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                c0458l.f3227eI = c1107ab.m685a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                c0458l.f3113cy = c1107ab.m685a("core", "stayNeutral", (Boolean) false).booleanValue();
                c0458l.f3114cz = c1107ab.m685a("core", "createNeutral", (Boolean) false).booleanValue();
                c0458l.f3115cA = c1107ab.m685a("core", "allowCaptureWhenNeutralByAI", (Boolean) false).booleanValue();
                if (c1107ab.m685a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    c0458l.f3114cz = true;
                }
                c0458l.f3116cB = c1107ab.m685a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                c0458l.f3117cC = c1107ab.m685a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                c0458l.f3118cD = c1107ab.m685a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (c0458l.f3118cD) {
                    c0458l.f3113cy = true;
                }
                c0458l.f3119cE = c1107ab.m685a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                c0458l.f3016aF = c1107ab.m685a("core", "showInEditor", (Boolean) true).booleanValue();
                c0458l.f2979U = c1107ab.m667b("graphics", "total_frames", (Integer) 1).intValue();
                if (c0458l.f2979U < 1) {
                    throw new C0417bo("TOTAL_FRAMES cannot be: " + c0458l.f2979U + " (must be 1 or more)");
                }
                c0458l.f2981W = c1107ab.m667b("graphics", "frame_width", (Integer) (-1)).intValue();
                c0458l.f2982X = c1107ab.m667b("graphics", "frame_height", (Integer) (-1)).intValue();
                c0458l.f2983Y = c1107ab.m667b("graphics", "default_frame", (Integer) 0).intValue();
                c0458l.f2992ah = c1107ab.m667b("graphics", "image_offsetX", (Integer) 0).intValue();
                c0458l.f2993ai = c1107ab.m667b("graphics", "image_offsetY", (Integer) 0).intValue();
                c0458l.f2994aj = c1107ab.m683a("graphics", "image_offsetH", Float.valueOf(0.0f)).floatValue();
                if (c0458l.f2992ah != 0 || c0458l.f2993ai != 0 || c0458l.f2994aj != 0.0f) {
                    c0458l.f2995ak = true;
                }
                c0458l.f2987ac = EnumC0198o.pureGreen;
                if (c1107ab.m685a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    c0458l.f2987ac = EnumC0198o.hueAdd;
                }
                String m666b5 = c1107ab.m666b("graphics", "teamColoringMode", (String) null);
                if (m666b5 != null) {
                    if (c1107ab.m685a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new C0417bo("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (m666b5.equalsIgnoreCase("pureGreen")) {
                        c0458l.f2987ac = EnumC0198o.pureGreen;
                    } else if (m666b5.equalsIgnoreCase("hueAdd")) {
                        c0458l.f2987ac = EnumC0198o.hueAdd;
                    } else if (m666b5.equalsIgnoreCase("hueShift")) {
                        c0458l.f2987ac = EnumC0198o.hueShift;
                    } else if (m666b5.equalsIgnoreCase("disabled")) {
                        c0458l.f2987ac = EnumC0198o.disabled;
                    } else {
                        throw new C0417bo("Unknown teamColoringMode:" + m666b5);
                    }
                }
                c0458l.f2986ab = c1107ab.m685a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                c0458l.f2985aa = c1107ab.m685a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                c0458l.f2984Z = c1107ab.m704a(c0458l, "graphics", "isVisible", (LogicBoolean) null);
                if (c0458l.f2984Z == LogicBoolean.trueBoolean) {
                    c0458l.f2984Z = null;
                }
                c0458l.f3126cL.f2266m = c1107ab.m685a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                c0458l.f2988ad = c0458l.m3540a(c0458l.f2964F, c1107ab.m653e("graphics", "image"), c0458l.f2986ab, "graphics", "image");
                if (c0458l.f2988ad == null) {
                    throw new C0417bo("Main unit image must be set on custom unit");
                }
                c0458l.f2989ae = c1107ab.m685a("graphics", "image_floatingPointSize", (Boolean) false).booleanValue();
                c0458l.f2990af = c0458l.f2988ad.mo387m() / c0458l.f2979U;
                c0458l.f2991ag = c0458l.f2988ad.mo388l();
                if (c0458l.f2990af < 1) {
                    c0458l.f2990af = 1;
                }
                if (c0458l.f2981W > 0) {
                    c0458l.f2990af = c0458l.f2981W;
                }
                if (c0458l.f2982X > 0) {
                    c0458l.f2991ag = c0458l.f2982X;
                    if (c0458l.f2991ag < c0458l.f2988ad.mo388l()) {
                        c0458l.f2980V = c0458l.f2988ad.mo387m() / c0458l.f2990af;
                        if (c0458l.f2980V < 1) {
                            c0458l.f2980V = 1;
                        }
                    }
                }
                c0458l.f2996al = c0458l.m3547a(c1107ab, "graphics", "image_back");
                c0458l.f2997am = c1107ab.m685a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                c0458l.f2998an = c0458l.m3547a(c1107ab, "graphics", "image_wreak");
                c0458l.f2999ao = c0458l.m3547a(c1107ab, "graphics", "image_turret");
                c0458l.f3003as = AbstractC0534j.f3681dN;
                String m666b6 = c1107ab.m666b("graphics", "image_shadow", "NONE");
                if (m666b6.equalsIgnoreCase("AUTO")) {
                    String str8 = "[autoShadow:" + c0458l.f2990af + "," + c0458l.f2991ag + "]" + c0458l.f2988ad.f6610d + "-" + c0458l.f2988ad.f6611e;
                    C0970e m4004c = m4004c(str8);
                    if (m4004c != null) {
                        c0458l.f3000ap = m4004c;
                    } else {
                        c0458l.f3000ap = AbstractC0244am.m4240a(c0458l.f2988ad, c0458l.f2990af, c0458l.f2991ag);
                        m4032a(c0458l.f3000ap);
                        if (c0458l.f3000ap != null) {
                            m4026a(str8, c0458l.f3000ap);
                        }
                    }
                } else if (m666b6.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str9 = "[autoShadowAnimated:" + c0458l.f2990af + "," + c0458l.f2991ag + "]" + c0458l.f2988ad.f6610d + "-" + c0458l.f2988ad.f6611e;
                    C0970e m4004c2 = m4004c(str9);
                    if (m4004c2 != null) {
                        c0458l.f3000ap = m4004c2;
                    } else {
                        c0458l.f3000ap = AbstractC0244am.m4240a(c0458l.f2988ad, c0458l.f2988ad.mo387m(), c0458l.f2988ad.mo388l());
                        m4032a(c0458l.f3000ap);
                        if (c0458l.f3000ap != null) {
                            m4026a(str9, c0458l.f3000ap);
                        }
                    }
                    c0458l.f3001aq = true;
                } else {
                    c0458l.f3000ap = c0458l.m3540a(c0458l.f2964F, m666b6, c0458l.f2986ab, "graphics", "image_shadow");
                }
                if (c1107ab.m685a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    c0458l.f3001aq = true;
                }
                c0458l.f3002ar = c0458l.m3548a(c0458l.f2988ad, c0458l.f2987ac);
                c0458l.f2951s = c1107ab.m685a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (c0458l.f2951s && c0458l.f2999ao != null) {
                    c0458l.f3004at = c0458l.m3548a(c0458l.f2999ao, c0458l.f2987ac);
                }
                float floatValue = c1107ab.m683a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    c0458l.f3070bH = (floatValue * c0458l.f3017aG) / c0458l.f2990af;
                }
                float floatValue2 = c1107ab.m683a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    c0458l.f3070bH *= floatValue2;
                }
                float floatValue3 = c1107ab.m683a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f = floatValue3 * c0458l.f3017aG;
                    if (c0458l.f2999ao == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    c0458l.f3071bI = f / c0458l.f2999ao.f6622p;
                }
                float floatValue4 = c1107ab.m683a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    c0458l.f3071bI *= floatValue4;
                }
                c0458l.f3005au = C0525c.f3630e;
                C0970e m3547a = c0458l.m3547a(c1107ab, "graphics", "image_shield");
                if (m3547a != null) {
                    c0458l.f3005au = m3547a;
                    c0458l.f3006av = true;
                }
                c0458l.f3007aw = c0458l.m3546a(c1107ab, "graphics", "icon_build", false);
                float mo387m = c0458l.f2988ad.mo387m() * c0458l.f3070bH;
                float mo388l = c0458l.f2988ad.mo388l() * c0458l.f3070bH;
                if (mo387m / 2.0f > 90.0f || mo388l / 2.0f > 90.0f) {
                    c0458l.f2961C = new Rect();
                    c0458l.f2961C.f230a = (int) ((-mo387m) / 2.0f);
                    c0458l.f2961C.f232c = (int) (mo387m / 2.0f);
                    c0458l.f2961C.f231b = (int) ((-mo388l) / 2.0f);
                    c0458l.f2961C.f233d = (int) (mo388l / 2.0f);
                    c0458l.f2960B = true;
                }
                Iterator it4 = c1107ab.m637m("resource_", "global_resource_").iterator();
                while (it4.hasNext()) {
                    String str10 = (String) it4.next();
                    if (str10.startsWith("resource_")) {
                        substring = str10.substring("resource_".length());
                        z2 = false;
                    } else {
                        substring = str10.substring("global_resource_".length());
                        z2 = true;
                    }
                    String trim2 = substring.trim();
                    if (trim2.contains(" ")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain a space");
                    }
                    if (trim2.contains("=") || trim2.contains("|") || trim2.contains(":") || trim2.contains(",") || trim2.contains("(") || trim2.contains(")") || trim2.contains("<") || trim2.contains(">") || trim2.contains("$")) {
                        throw new RuntimeException("[" + str10 + "] resource codename cannot contain the symbols: =|:,()<>$");
                    }
                    C0442d c0442d = new C0442d(z2);
                    c0442d.m3753a(c0458l, c1107ab, str10, trim2);
                    if (c0458l.m3508k(c0442d.f2798a) != null) {
                        throw new RuntimeException("[" + str10 + "] resource with name:" + c0442d.f2798a + " already exists in this file");
                    }
                    c0458l.f2942j.add(c0442d);
                }
                Iterator it5 = c0458l.f2942j.iterator();
                while (it5.hasNext()) {
                    ((C0442d) it5.next()).m3754a(c0458l);
                }
                if (gameEngine.mo974p()) {
                    C0400l.m3932a(c0458l, c1107ab);
                    C0398j.m3936a(c0458l, c1107ab);
                }
                C0401m.m3921a(c0458l, c1107ab);
                c0458l.f3089ca = c1107ab.m668b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (c0458l.f3089ca < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (c0458l.f3089ca > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!c1107ab.m685a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && c0458l.f3089ca < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                c0458l.f3090cb = (EnumC0466s) c1107ab.m684a("core", "autoTriggerCheckRate", EnumC0466s.everyFrame, EnumC0466s.class);
                c0458l.f3092cd = c1107ab.m685a("core", "autoTriggerCheckWhileNotBuilt", (Boolean) false).booleanValue();
                c0458l.f3126cL.f2255b = c1107ab.m647g("core", "mass");
                c0458l.f3093ce = c1107ab.m685a("core", "availableInDemo", (Boolean) true).booleanValue();
                c0458l.f3094cf = c1107ab.m685a("core", "isLocked", (Boolean) false).booleanValue();
                c0458l.f3095cg = c1107ab.m685a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                c0458l.f3096ch = C0429b.m3840a(c0458l, c1107ab, "core", "price", false);
                c0458l.f3097ci = C0429b.m3841a(c0458l, c1107ab, "core", "reclaimPrice", (C0429b) null);
                c0458l.f3098cj = C0429b.m3826b(c0458l, c1107ab, "core", "streamingCost", null);
                boolean booleanValue = c1107ab.m685a("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (c0458l.f3098cj != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    c0458l.f3098cj = C0429b.m3826b(c0458l, c1107ab, "core", "price", null);
                    c0458l.f3096ch = C0429b.f2724a;
                }
                c0458l.f3099ck = c1107ab.m656d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                c0458l.f3100cl = c1107ab.m667b("core", "techLevel", (Integer) 1).intValue();
                if (c0458l.f3100cl > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (c0458l.f3100cl < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + c0458l.f3100cl);
                }
                c0458l.f3101cm = c1107ab.m685a("core", "experimental", (Boolean) false).booleanValue();
                c0458l.f3110cv = C0429b.m3840a(c0458l, c1107ab, "core", "borrowResourcesWhileAlive", true);
                c0458l.f3111cw = C0429b.m3840a(c0458l, c1107ab, "core", "borrowResourcesWhileBuilt", true);
                c0458l.f3103co = C0429b.m3840a(c0458l, c1107ab, "core", "generation_resources", true);
                int intValue = c1107ab.m667b("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    c0458l.f3103co = C0429b.m3842a(c0458l.f3103co, C0429b.m3851a(intValue));
                }
                c0458l.f3106cr = c1107ab.m667b("core", "generation_delay", (Integer) 40).intValue();
                if (c0458l.f3106cr == 0) {
                    c0458l.f3106cr = 1;
                }
                if (c0458l.f3106cr < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                c0458l.f3107cs = 40.0f / c0458l.f3106cr;
                if (!c0458l.f3103co.m3822c()) {
                    c0458l.f3104cp = new C0444f();
                    c0458l.f3104cp.m3748a(c0458l.f3103co);
                    c0458l.f3104cp.m3751a(c0458l.f3107cs);
                    c0458l.f3102cn = true;
                }
                if (!c0458l.f3104cp.m3723c()) {
                    Iterator it6 = c0458l.f3104cp.f2830b.iterator();
                    while (it6.hasNext()) {
                        C0443e c0443e = (C0443e) it6.next();
                        if (!c0443e.f2827a.m3773c() && c0443e.f2827a.m3772d()) {
                            if (c0458l.f3105cq == C0444f.f2829a) {
                                c0458l.f3105cq = new C0444f();
                            }
                            c0458l.f3105cq.m3730b(c0443e.f2827a, c0443e.f2828b);
                        }
                    }
                }
                c0458l.f3112cx = c1107ab.m704a(c0458l, "core", "generation_active", LogicBoolean.trueBoolean);
                c0458l.m3557a(c0458l.f3103co);
                c0458l.f3120cF = c1107ab.m683a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && c0458l.f3120cF != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                String m666b7 = c1107ab.m666b("core", "updateUnitMemory", (String) null);
                if (m666b7 != null) {
                    c0458l.f3108ct = VariableScope.createMemoryWriter(m666b7, c0458l, "core", "updateUnitMemory");
                }
                c0458l.f3109cu = c1107ab.m668b("core", "updateUnitMemoryRate", Float.valueOf(60.0f)).floatValue();
                c0458l.f3121cG = c1107ab.m667b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                c0458l.f3122cH = c1107ab.m705a(c0458l, "core", "similarResourcesHaveTag", (C0454h) null);
                c0458l.f3155do = C0414bl.m3885a(c0458l, c1107ab.m666b("core", "soundOnAttackOrder", (String) null));
                c0458l.f3156dp = C0414bl.m3885a(c0458l, c1107ab.m666b("core", "soundOnMoveOrder", (String) null));
                c0458l.f3157dq = C0414bl.m3885a(c0458l, c1107ab.m666b("core", "soundOnNewSelection", (String) null));
                String m666b8 = c1107ab.m666b("graphics", "drawLayer", (String) null);
                if (m666b8 != null) {
                    if (m666b8.equals("experimentals")) {
                        c0458l.f3123cI = 4;
                    } else if (m666b8.equals("underwater")) {
                        c0458l.f3123cI = 1;
                    } else if (m666b8.equals("bottom")) {
                        c0458l.f3123cI = 1;
                    } else if (m666b8.equals("ground")) {
                        c0458l.f3123cI = 2;
                    } else if (m666b8.equals("ground2")) {
                        c0458l.f3123cI = 3;
                    } else if (m666b8.equals("air")) {
                        c0458l.f3123cI = 5;
                    } else if (m666b8.equals("top")) {
                        c0458l.f3123cI = 10;
                    } else if (m666b8.equals("wreaks")) {
                        c0458l.f3123cI = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + m666b8);
                    }
                }
                c0458l.f3124cJ = c1107ab.m683a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                c0458l.f3125cK = c1107ab.m683a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                c0458l.f3168dB = c1107ab.m685a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                c0458l.f3169dC = c1107ab.m685a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0458l.f3170dD = c1107ab.m685a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(c0458l.f3169dC)).booleanValue();
                c0458l.f3171dE = c1107ab.m685a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                c0458l.f3174dH = c1107ab.m683a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                c0458l.f3175dI = C0460m.m3483a(c0458l, c1107ab, "graphics", "animation_", false);
                Iterator it7 = c1107ab.m654e("effect_").iterator();
                while (it7.hasNext()) {
                    String str11 = (String) it7.next();
                    C0386ay c0386ay = new C0386ay(str11.substring("effect_".length()));
                    c0386ay.m3955a(c0458l, c1107ab, str11);
                    c0458l.f3300gd.add(c0386ay);
                }
                Iterator it8 = c0458l.f3300gd.iterator();
                while (it8.hasNext()) {
                    C0386ay c0386ay2 = (C0386ay) it8.next();
                    if (c0386ay2.alsoEmitEffects != null) {
                        c0386ay2.alsoEmitEffects.m3462c();
                    }
                    if (c0386ay2.alsoEmitEffectsOnDeath != null) {
                        c0386ay2.alsoEmitEffectsOnDeath.m3462c();
                    }
                    if (c0386ay2.ifSpawnFailsEmitEffects != null) {
                        c0386ay2.ifSpawnFailsEmitEffects.m3462c();
                    }
                    if (c0386ay2.trailEffect != null) {
                        c0386ay2.trailEffect.m3462c();
                    }
                }
                c0458l.f3072bJ = c1107ab.m685a("graphics", "splastEffect", (Boolean) false).booleanValue();
                c0458l.f3075bM = c1107ab.m685a("graphics", "dustEffect", (Boolean) false).booleanValue();
                c0458l.f3073bK = c1107ab.m685a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                c0458l.f3076bN = c1107ab.m685a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                c0458l.f3074bL = c0458l.f3075bM || c0458l.f3072bJ;
                String m666b9 = c1107ab.m666b("graphics", "movementEffect", (String) null);
                if (m666b9 != null) {
                    c0458l.f3077bO = c0458l.m3542a(m666b9, (C0473z) null);
                    if (c0458l.f3077bO != null && c0458l.f3077bO.m3466a()) {
                        c0458l.f3074bL = true;
                    }
                }
                String m666b10 = c1107ab.m666b("graphics", "movementEffectReverse", (String) null);
                if (m666b10 != null) {
                    c0458l.f3078bP = c0458l.m3542a(m666b10, (C0473z) null);
                    if (c0458l.f3078bP != null && c0458l.f3078bP.m3466a()) {
                        c0458l.f3074bL = true;
                    }
                }
                c0458l.f3080bR = c1107ab.m683a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                c0458l.f3079bQ = c1107ab.m685a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                c0458l.f3082bT = c1107ab.m683a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String m666b11 = c1107ab.m666b("graphics", "repairEffect", (String) null);
                if (m666b11 != null) {
                    c0458l.f3083bU = c0458l.m3542a(m666b11, (C0473z) null);
                    if (c0458l.f3083bU != null && c0458l.f3083bU.m3463b()) {
                        c0458l.f3081bS = true;
                    }
                }
                String m666b12 = c1107ab.m666b("graphics", "repairEffectAtTarget", (String) null);
                if (m666b12 != null) {
                    c0458l.f3084bV = c0458l.m3542a(m666b12, (C0473z) null);
                    if (c0458l.f3084bV != null && c0458l.f3084bV.m3463b()) {
                        c0458l.f3081bS = true;
                    }
                }
                c0458l.f3086bX = c1107ab.m683a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String m666b13 = c1107ab.m666b("graphics", "reclaimEffect", (String) null);
                if (m666b13 != null) {
                    c0458l.f3087bY = c0458l.m3542a(m666b13, (C0473z) null);
                    if (c0458l.f3087bY != null && c0458l.f3087bY.m3463b()) {
                        c0458l.f3085bW = true;
                    }
                }
                String m666b14 = c1107ab.m666b("graphics", "reclaimEffectAtTarget", (String) null);
                if (m666b14 != null) {
                    c0458l.f3088bZ = c0458l.m3542a(m666b14, (C0473z) null);
                    if (c0458l.f3088bZ != null && c0458l.f3088bZ.m3463b()) {
                        c0458l.f3085bW = true;
                    }
                }
                c0458l.f3159ds.m3706a(c0458l, c1107ab, "graphics", "animation_" + c0458l.f3159ds.f2833a + "_");
                c0458l.f3160dt.m3706a(c0458l, c1107ab, "graphics", "animation_" + c0458l.f3160dt.f2833a + "_");
                c0458l.f3161du.m3706a(c0458l, c1107ab, "graphics", "animation_" + c0458l.f3161du.f2833a + "_");
                Iterator it9 = c1107ab.m654e("animation_").iterator();
                while (it9.hasNext()) {
                    String str12 = (String) it9.next();
                    C0446f c0446f = new C0446f(str12.substring("animation_".length()));
                    c0446f.m3706a(c0458l, c1107ab, str12, VariableScope.nullOrMissingString);
                    c0458l.f3158dr.add(c0446f);
                }
                c0458l.f3159ds = c0458l.m3552a(EnumC0461n.move, c0458l.f3159ds, true);
                c0458l.f3160dt = c0458l.m3552a(EnumC0461n.idle, c0458l.f3160dt, true);
                c0458l.f3161du = c0458l.m3552a(EnumC0461n.attack, c0458l.f3161du, true);
                c0458l.f3163dw = c0458l.m3553a(EnumC0461n.underConstruction);
                c0458l.f3164dx = c0458l.m3553a(EnumC0461n.underConstructionWithLinkedBuiltTime);
                if (c0458l.f3163dw != null && c0458l.f3164dx != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                c0458l.f3162dv = c0458l.m3553a(EnumC0461n.created);
                c0458l.f3165dy = c0458l.m3553a(EnumC0461n.queuedUnits);
                if (c0458l.f3165dy != null) {
                    c0458l.f3043bg = true;
                }
                c0458l.f3166dz = c0458l.m3553a(EnumC0461n.repair);
                c0458l.f3167dA = c0458l.m3553a(EnumC0461n.reclaim);
                c0458l.f3126cL.f2256c = c1107ab.m647g("core", "maxHp");
                c0458l.f3126cL.f2260g = c1107ab.m667b("core", "maxShield", (Integer) 0).intValue();
                c0458l.f3127cM = c1107ab.m685a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                c0458l.f3126cL.f2261h = c1107ab.m683a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                c0458l.f3135cU = c1107ab.m685a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                c0458l.f3136cV = c1107ab.m683a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                c0458l.f3126cL.f2265l = c1107ab.m683a("core", "armour", Float.valueOf(0.0f)).floatValue();
                c0458l.f3128cN = c1107ab.m683a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                c0458l.f3126cL.f2257d = c1107ab.m683a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                c0458l.f3129cO = c1107ab.m685a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                c0458l.f3130cP = c1107ab.m683a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                c0458l.f3133cS = c1107ab.m683a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                c0458l.f3132cR = c1107ab.m685a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                c0458l.f3131cQ = c1107ab.m683a("core", "energyRegenWhenRecharging", Float.valueOf(c0458l.f3130cP)).floatValue();
                c0458l.f3134cT = m4031a(c1107ab, "core", "energyDisplayName", (String) null);
                c0458l.f3137cW = c1107ab.m647g("core", "radius");
                c0458l.f3144dd = c1107ab.m667b("core", "displayRadius", Integer.valueOf(c0458l.f3137cW)).intValue();
                float f2 = c0458l.f3137cW;
                if (f2 < 6.0f) {
                    f2 = 6.0f;
                }
                c0458l.f3145de = c1107ab.m683a("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                c0458l.f3146df = c1107ab.m667b("core", "shieldRenderRadius", Integer.valueOf(c0458l.f3137cW)).intValue();
                c0458l.f3147dg = c1107ab.m667b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                c0458l.f3138cX = c1107ab.m688a("core", "footprint", c0458l.f3138cX);
                c0458l.f3139cY = c1107ab.m688a("core", "constructionFootprint", c0458l.f3139cY);
                c0458l.f3140cZ.m5165a(c0458l.f3138cX);
                c0458l.f3140cZ = c1107ab.m688a("core", "displayFootprint", c0458l.f3140cZ);
                c0458l.f3141da = c1107ab.m683a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                c0458l.f3142db = c1107ab.m683a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                c0458l.f3137cW = (int) (c0458l.f3137cW * c0458l.f3017aG);
                c0458l.f3144dd = (int) (c0458l.f3144dd * c0458l.f3017aG);
                c0458l.f3126cL.f2267n = c1107ab.m667b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                c0458l.f3148dh = c1107ab.m667b("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                c0458l.f3149di = c1107ab.m683a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                c0458l.f3150dj = c1107ab.m683a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                c0458l.f3151dk = c1107ab.m683a("core", "exit_dirOffset", (Float) null);
                c0458l.f3152dl = c1107ab.m683a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                c0458l.f3153dm = c1107ab.m685a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                c0458l.f3154dn = c1107ab.m683a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                c0458l.f3220eB = c1107ab.m667b("core", "softCollisionOnAll", (Integer) 0).intValue();
                c0458l.f3221eC = c1107ab.m685a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (c0458l.f3221eC) {
                    c0458l.f3138cX.m5166a(0, 0, -1, -1);
                }
                c0458l.f3228eJ = c1107ab.m685a("core", "hideScorchMark", (Boolean) false).booleanValue();
                c0458l.f3229eK = c1107ab.m685a("graphics", "disableLowHpFire", Boolean.valueOf(c0458l.f3222eD)).booleanValue();
                c0458l.f3230eL = c1107ab.m685a("graphics", "disableLowHpSmoke", Boolean.valueOf(c0458l.f3222eD)).booleanValue();
                c0458l.f3018aH = c1107ab.m685a("core", "isBuilding", (Boolean) false).booleanValue();
                c0458l.f3019aI = c1107ab.m685a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(c0458l.f3018aH)).booleanValue();
                c0458l.f3020aJ = c1107ab.m685a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                c0458l.f3021aK = c1107ab.m685a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                c0458l.f3022aL = c1107ab.m683a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                c0458l.f3023aM = c1107ab.m685a("core", "isUnselectable", (Boolean) false).booleanValue();
                c0458l.f3024aN = c1107ab.m685a("core", "isUnselectableAsTarget", Boolean.valueOf(c0458l.f3023aM)).booleanValue();
                c0458l.f3285fO = c1107ab.m705a(c0458l, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (C0454h) null);
                c0458l.f3025aO = c1107ab.m685a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                c0458l.f3026aP = c1107ab.m685a("core", "canNotBeDamaged", Boolean.valueOf(c0458l.f3025aO)).booleanValue();
                c0458l.f3027aQ = c1107ab.m685a("core", "showOnMinimap", (Boolean) true).booleanValue();
                c0458l.f3028aR = c1107ab.m685a("core", "showOnMinimapToEnemies", Boolean.valueOf(c0458l.f3126cL.f2266m)).booleanValue();
                c0458l.f3029aS = c1107ab.m705a(c0458l, "core", "canOnlyBeAttackedByUnitsWithTags", (C0454h) null);
                if (c0458l.f3025aO && c0458l.f3029aS != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                c0458l.f3030aT = c1107ab.m685a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                c0458l.f3031aU = c1107ab.m685a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                c0458l.f3032aV = c1107ab.m685a("core", "canRepairUnits", (Boolean) false).booleanValue();
                c0458l.f3033aW = c1107ab.m685a("core", "autoRepair", (Boolean) false).booleanValue();
                if (c0458l.f3033aW) {
                    c0458l.m3558a(C0390b.f2294a);
                }
                c0458l.f3126cL.f2268o = c1107ab.m667b("core", "nanoRange", (Integer) (-1)).intValue();
                if (c0458l.f3126cL.f2268o != -1) {
                    c0458l.f3126cL.f2268o = (int) (c0361as.f2268o * c0458l.f3017aG);
                }
                c0458l.f3035aY = c1107ab.m685a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (c0458l.f3035aY) {
                    c0458l.f3034aX = 5;
                }
                int intValue2 = c1107ab.m667b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    c0458l.f3034aX = intValue2;
                    c0458l.f3034aX = (int) (c0458l.f3034aX * c0458l.f3017aG);
                }
                c0458l.f3037ba = c1107ab.m685a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (c0458l.f3037ba) {
                    c0458l.f3036aZ = 5;
                }
                int intValue3 = c1107ab.m667b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    c0458l.f3036aZ = intValue3;
                    c0458l.f3036aZ = (int) (c0458l.f3036aZ * c0458l.f3017aG);
                }
                c0458l.f3038bb = c1107ab.m683a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                c0458l.f3039bc = c1107ab.m683a("core", "nanoReclaimSpeed", Float.valueOf(c0458l.f3038bb * 5.1f)).floatValue();
                c0458l.f3040bd = c1107ab.m683a("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                c0458l.f3041be = c1107ab.m683a("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                c0458l.f3042bf = c1107ab.m683a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                c0458l.f3126cL.f2271r = c1107ab.m683a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                c0458l.f3126cL.f2269p = c1107ab.m683a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                c0458l.f3044bh = c1107ab.m656d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                c0458l.f3045bi = c1107ab.m685a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                c0458l.f3047bk = c1107ab.m685a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i = 4;
                if (c0458l.f3126cL.f2255b > 30000.0f) {
                    i = 8;
                }
                if (c0458l.f3018aH) {
                    i = 7;
                }
                c0458l.f3053bq = c1107ab.m667b("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                c0458l.f3050bn = c1107ab.m685a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                c0458l.f3051bo = c1107ab.m683a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                c0458l.f3052bp = c1107ab.m683a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                c0458l.f3054br = c1107ab.m685a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                c0458l.f3049bm = c1107ab.m667b("core", "fireOnDeath", (Integer) 0).intValue();
                c0458l.f3056bt = (EnumC0233ab) c1107ab.m684a("core", "explodeTypeOnDeath", (Enum) null, EnumC0233ab.class);
                c0458l.f3057bu = c1107ab.m685a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                c0458l.f3055bs = c1107ab.m685a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                c0458l.f3058bv = c1107ab.m685a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(c1107ab.m685a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                c0458l.f3061by = c0458l.m3542a(c1107ab.m666b("core", "effectOnDeath", (String) null), (C0473z) null);
                c0458l.f3060bx = c0458l.m3542a(c1107ab.m666b("core", "effectOnDeathIfUnbuilt", (String) null), (C0473z) null);
                c0458l.f3062bz = C0414bl.m3885a(c0458l, c1107ab.m666b("core", "soundOnDeath", (String) null));
                c0458l.f3059bw = c0458l.m3542a(c1107ab.m666b("core", "effectOnDeathGroundCollision", c1107ab.m666b("core", "effectOnDeathGroundCollosion", (String) null)), (C0473z) null);
                c0458l.f3065bC = C0418bp.m3877a(c0458l, c1107ab, "core", "unitsSpawnedOnDeath");
                c0458l.f3066bD = c1107ab.m685a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                c0458l.f3255fk = c1107ab.m685a("core", "canReclaimResources", (Boolean) false).booleanValue();
                c0458l.f3256fl = c1107ab.m705a(c0458l, "core", "canReclaimResourcesOnlyWithTags", (C0454h) null);
                c0458l.f3257fm = c1107ab.m667b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                c0458l.f3258fn = c1107ab.m705a(c0458l, "core", "canReclaimUnitsOnlyWithTags", (C0454h) null);
                c0458l.f3259fo = c1107ab.m705a(c0458l, "core", "canRepairUnitsOnlyWithTags", (C0454h) null);
                if (c0458l.f3258fn != null && !c0458l.f3032aV && !c0458l.f3031aU) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (c0458l.f3259fo != null && !c0458l.f3032aV && !c0458l.f3031aU) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                c0458l.f3231eM = c1107ab.m667b("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (c0458l.f3231eM < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                c0458l.f3232eN = c1107ab.m668b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                c0458l.f3234eP = C0453g.m3681a(c1107ab.m666b("core", "transportUnitsRequireTag", (String) null));
                String m666b15 = c1107ab.m666b("core", "transportUnitsRequireMovementType", (String) null);
                if (m666b15 != null) {
                    for (String str13 : m666b15.split(",")) {
                        c0458l.f3235eQ.add(EnumC0246ao.m4190a(str13.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                c0458l.f3233eO = c1107ab.m685a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                c0458l.f3236eR = c1107ab.m685a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(c0458l.f3235eQ.size() == 0)).booleanValue();
                c0458l.f3237eS = c1107ab.m685a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                c0458l.f3239eU = c1107ab.m704a(c0458l, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                c0458l.f3240eV = c1107ab.m704a(c0458l, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                c0458l.f3241eW = c1107ab.m704a(c0458l, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                c0458l.f3243eY = c1107ab.m683a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                c0458l.f3247fc = c1107ab.m704a(c0458l, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (c0458l.f3247fc != null) {
                    c0458l.f3248fd = c0458l.f3247fc;
                } else {
                    c0458l.f3247fc = C0458l.f3245fa;
                    c0458l.f3248fd = C0458l.f3246fb;
                }
                c0458l.f3238eT = c1107ab.m685a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(c0458l.f3247fc != LogicBoolean.falseBoolean)).booleanValue();
                c0458l.f3242eX = c1107ab.m685a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(c0458l.f3242eX)).booleanValue();
                c0458l.f3244eZ = c1107ab.m667b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i2 = -1; i2 <= 29; i2++) {
                    String str14 = "builtFrom_" + i2 + "_";
                    if (i2 == -1) {
                        str14 = "builtFrom_";
                    }
                    String str15 = str14 + "name";
                    String m666b16 = c1107ab.m666b("core", str15, (String) null);
                    if (m666b16 != null) {
                        for (String str16 : m666b16.split(",")) {
                            String trim3 = str16.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                C0463p c0463p = new C0463p();
                                c0463p.f3362a = trim3;
                                c0463p.f3363b = c1107ab.m683a("core", str14 + "pos", Float.valueOf(999.0f)).floatValue();
                                c0463p.f3364c = c1107ab.m685a("core", str14 + "forceNano", (Boolean) false).booleanValue();
                                c0463p.f3365d = "[core]" + str15;
                                c0463p.f3367f = c1107ab.m704a(c0458l, "core", str14 + "isLocked", (LogicBoolean) null);
                                c0463p.f3368g = m4031a(c1107ab, "core", str14 + "isLockedMessage", (String) null);
                                if (c0463p.f3367f == LogicBoolean.falseBoolean) {
                                    c0463p.f3367f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    c0458l.f3303gg.add(c0463p);
                                }
                            }
                        }
                    }
                }
                for (int i3 = 0; i3 <= 50; i3++) {
                    if (c1107ab.m666b("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                        m4011b(c0458l, c1107ab, "core", "canBuild_" + i3 + "_", false);
                    }
                }
                Iterator it10 = c1107ab.m654e("canBuild_").iterator();
                while (it10.hasNext()) {
                    m4011b(c0458l, c1107ab, (String) it10.next(), VariableScope.nullOrMissingString, true);
                }
                c0458l.f3250ff = C0407be.m3907a(c0458l, c1107ab);
                c0458l.f3251fg = EnumC0246ao.m4190a(c1107ab.m653e("movement", "movementType"), "movementType");
                if (!c0458l.f3018aH) {
                    c0458l.f3252fh = c0458l.f3251fg;
                } else {
                    c0458l.f3252fh = EnumC0246ao.NONE;
                }
                Boolean m685a = c1107ab.m685a("ai", "useAsBuilder", (Boolean) null);
                c0458l.f3263fs = c1107ab.m685a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean m685a2 = c1107ab.m685a("core", "isBuilder", (Boolean) null);
                if (m685a2 == null) {
                    m685a2 = m685a == null ? false : m685a;
                } else if (m685a == null) {
                    m685a = m685a2;
                }
                if (m685a == null) {
                    m685a = false;
                }
                c0458l.f3260fp = m685a2.booleanValue();
                c0458l.f3261fq = m685a.booleanValue();
                if (!c0458l.f3260fp && c0458l.f3261fq) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + c0458l.f3261fq + " [core]isBuilder:" + c0458l.f3260fp);
                }
                if (c0458l.f3255fk) {
                    c0458l.f3262fr = true;
                }
                Boolean m685a3 = c1107ab.m685a("ai", "useAsHarvester", (Boolean) null);
                if (m685a3 != null) {
                    c0458l.f3262fr = m685a3.booleanValue();
                }
                Boolean m685a4 = c1107ab.m685a("ai", "useAsTransport", (Boolean) null);
                if (m685a4 == null) {
                    m685a4 = Boolean.valueOf((c0458l.f3231eM <= 0 || c0458l.f3261fq || c0458l.f3018aH) ? false : true);
                    if (!c0458l.f3238eT) {
                        m685a4 = false;
                    }
                }
                c0458l.f3264ft = m685a4.booleanValue();
                if (c0458l.f3018aH) {
                    c0458l.f3003as = AbstractC0493d.f3460q;
                } else if (c0458l.f3251fg == EnumC0246ao.AIR) {
                    c0458l.f3003as = AbstractC0309b.f1852n;
                } else if (c0458l.f3251fg == EnumC0246ao.WATER) {
                    c0458l.f3003as = AbstractC0596f.f3881q;
                } else if (c0458l.f3251fg == EnumC0246ao.HOVER) {
                    if (c0458l.f3101cm) {
                        c0458l.f3003as = AbstractC0534j.f3682dO;
                    } else if (c0458l.mo3507l()) {
                        c0458l.f3003as = C0524b.f3619h;
                    } else {
                        c0458l.f3003as = AbstractC0530h.f3666n;
                    }
                } else if (c0458l.f3101cm) {
                    c0458l.f3003as = AbstractC0534j.f3682dO;
                } else if (c0458l.mo3507l()) {
                    c0458l.f3003as = C0524b.f3619h;
                } else {
                    c0458l.f3003as = AbstractC0534j.f3681dN;
                }
                C0970e m3546a = c0458l.m3546a(c1107ab, "graphics", "icon_zoomed_out", false);
                if (m3546a != null) {
                    c0458l.f3003as = c0458l.m3548a(m3546a, c0458l.f2987ac);
                }
                if (c1107ab.m685a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    c0458l.f3003as = null;
                }
                c0458l.f2952t = c1107ab.m685a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                c0458l.f2953u = c1107ab.m685a("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                c0458l.f2954v = c1107ab.m685a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                c0458l.f2955w = c1107ab.m685a("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                c0458l.f2956x = c1107ab.m685a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                c0458l.f2957y = c1107ab.m685a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                c0458l.f2958z = c1107ab.m685a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                c0458l.f2959A = c1107ab.m685a("graphics", "showSelectionIndicator", (Boolean) true).booleanValue();
                c0458l.f3253fi = c1107ab.m685a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                c0458l.f3254fj = c1107ab.m685a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                c0458l.f3126cL.f2263j = c1107ab.m683a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * c0458l.f3017aG;
                c0458l.f3180dN = c1107ab.m683a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0458l.f3017aG;
                c0458l.f3181dO = c1107ab.m683a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * c0458l.f3017aG;
                Boolean m685a5 = c1107ab.m685a("movement", "ignoreMoveOrders", (Boolean) null);
                if (c0458l.f3018aH) {
                    c0458l.f3182dP = true;
                }
                if (m685a5 != null) {
                    if (m685a5.booleanValue()) {
                        c0458l.f3182dP = true;
                        if (c0458l.f3126cL.f2263j > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (c0458l.f3018aH) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                c0458l.f3202ej = c1107ab.m683a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (c0458l.f3202ej <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                c0458l.f3203ek = 1.0f / c0458l.f3202ej;
                c0458l.f3204el = c1107ab.m683a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String m666b17 = c1107ab.m666b("movement", "landOnGround", "false");
                if (m666b17.equalsIgnoreCase("false")) {
                    c0458l.f3183dQ = false;
                } else if (m666b17.equalsIgnoreCase("onlyIdle")) {
                    c0458l.f3183dQ = true;
                    c0458l.f3184dR = true;
                } else if (m666b17.equalsIgnoreCase("true")) {
                    c0458l.f3183dQ = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + m666b17);
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (c0458l.f3251fg == EnumC0246ao.AIR) {
                    f3 = 35.0f;
                    f4 = 1.5f;
                }
                c0458l.f3185dS = c1107ab.m683a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                c0458l.f3126cL.f2270q = c1107ab.m683a("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                c0458l.f3186dT = c1107ab.m683a("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                if (c0458l.f3126cL.f2270q > 80.0f) {
                    c0458l.f2960B = true;
                }
                c0458l.f3187dU = c1107ab.m683a("movement", "heightChangeRate", Float.valueOf(c0458l.f3187dU)).floatValue();
                c0458l.f3188dV = c1107ab.m683a("movement", "fallingAcceleration", Float.valueOf(c0458l.f3188dV)).floatValue();
                c0458l.f3189dW = c1107ab.m683a("movement", "fallingAccelerationDead", Float.valueOf(c0458l.f3189dW)).floatValue();
                c0458l.f3126cL.f2264k = c1107ab.m683a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                c0458l.f3207eo = c1107ab.m683a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                c0458l.f3190dX = c1107ab.m685a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                c0458l.f3191dY = c1107ab.m685a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                c0458l.f3192dZ = c1107ab.m667b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                c0458l.f3201ei = c1107ab.m685a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                c0458l.f3193ea = c1107ab.m683a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * c0458l.f3017aG;
                c0458l.f3194eb = c1107ab.m683a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                c0458l.f3178dL = c1107ab.m685a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String m666b18 = c1107ab.m666b("attack", "attackMovement", "normal");
                c0458l.f3195ec = EnumC0307b.normal;
                if (m666b18.equalsIgnoreCase("normal")) {
                    c0458l.f3195ec = EnumC0307b.normal;
                }
                if (m666b18.equalsIgnoreCase("strafing")) {
                    c0458l.f3195ec = EnumC0307b.strafing;
                }
                if (m666b18.equalsIgnoreCase("bomber")) {
                    c0458l.f3195ec = EnumC0307b.bomber;
                }
                c0458l.f3198ef = c1107ab.m685a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                c0458l.f3199eg = c1107ab.m685a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                c0458l.f3200eh = c1107ab.m685a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                c0458l.f3196ed = c1107ab.m683a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                c0458l.f3197ee = c1107ab.m683a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float m683a = c1107ab.m683a("attack", "maxAttackRange", (Float) null);
                if (m683a != null) {
                    z = true;
                    c0458l.f3126cL.f2262i = m683a.floatValue() * c0458l.f3017aG;
                } else {
                    z = false;
                    c0458l.f3126cL.f2262i = 100.0f * c0458l.f3017aG;
                }
                c0458l.f3218ez = c1107ab.m683a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                c0458l.f3179dM = c1107ab.m668b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                c0458l.f3126cL.f2258e = c1107ab.m683a("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                c0458l.f3126cL.f2259f = c1107ab.m683a("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                c0458l.f3177dK = c1107ab.m685a("attack", "showRangeUIGuide", (Boolean) null);
                c0458l.f3224eF = c1107ab.m685a("attack", "isMelee", (Boolean) false).booleanValue();
                c0458l.f3225eG = 0.0f;
                Float m683a2 = c1107ab.m683a("attack", "meleeEngangementDistance", (Float) null);
                if (c0458l.f3224eF) {
                    c0458l.f3225eG = 250.0f;
                    if (m683a2 != null) {
                        c0458l.f3225eG = m683a2.floatValue();
                    }
                } else if (m683a2 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                m4044a(m2440a, EnumC0350ah.unitParsePartA);
                Iterator it11 = c1107ab.m654e("projectile_").iterator();
                while (it11.hasNext()) {
                    String str17 = (String) it11.next();
                    String substring2 = str17.substring("projectile_".length());
                    if (c0458l.m3518f(substring2) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring2);
                    }
                    C0410bh c0410bh = new C0410bh();
                    c0410bh.f2538bh = substring2;
                    c0410bh.f2540bj = c0458l;
                    C0410bh.m3898a(c0410bh, c0458l, c1107ab, str17);
                }
                int size = c0458l.f3290fT.size();
                if (size < 1) {
                    size = 1;
                }
                c0458l.f3288fR = new C0410bh[size];
                for (int i4 = 0; i4 < c0458l.f3290fT.size(); i4++) {
                    C0410bh c0410bh2 = (C0410bh) c0458l.f3290fT.get(i4);
                    c0410bh2.f2539bi = i4;
                    c0458l.f3288fR[i4] = c0410bh2;
                }
                for (int i5 = 0; i5 < c0458l.f3288fR.length; i5++) {
                    C0410bh c0410bh3 = c0458l.f3288fR[i5];
                    if (c0410bh3 != null) {
                        c0410bh3.f1122w *= c0458l.f3017aG;
                        c0410bh3.f1172au *= c0458l.f3017aG;
                        c0410bh3.f1183aF *= c0458l.f3017aG;
                    }
                }
                if (c0458l.f3288fR[0] == null) {
                    C0410bh c0410bh4 = new C0410bh();
                    c0410bh4.f2539bi = 0;
                    c0410bh4.f2538bh = "1";
                    c0410bh4.f1101b = 10;
                    c0458l.f3290fT.add(c0410bh4);
                    c0458l.f3288fR[0] = c0410bh4;
                }
                ArrayList arrayList = c0458l.f3289fS;
                Iterator it12 = c1107ab.m654e("turret_").iterator();
                while (it12.hasNext()) {
                    String str18 = (String) it12.next();
                    String substring3 = str18.substring("turret_".length());
                    if (c0458l.m3520e(substring3) != null) {
                        throw new RuntimeException("Two turrets found with the same name:" + substring3);
                    }
                    C0416bn c0416bn = new C0416bn();
                    c0416bn.f2567a = substring3;
                    c0416bn.f2568b = str18;
                    arrayList.add(c0416bn);
                }
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    C0416bn c0416bn2 = (C0416bn) it13.next();
                    C0416bn.m3882a(c0416bn2, c0458l, c1107ab, c0416bn2.f2568b);
                }
                if (arrayList.size() == 0) {
                    C0416bn c0416bn3 = new C0416bn();
                    c0416bn3.f2572f = 0.0f;
                    c0416bn3.f2573g = 0.0f;
                    c0416bn3.f2567a = "1";
                    c0416bn3.f2579m = c0458l.f3179dM;
                    arrayList.add(c0416bn3);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.get(size2) != null) {
                        ((C0416bn) arrayList.get(size2)).f2571e = size2;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    if (arrayList.get(size3) != null) {
                        C0416bn c0416bn4 = (C0416bn) arrayList.get(size3);
                        if (c0416bn4.f2591y != null) {
                            c0416bn4.f2589w = c0416bn4.f2591y.f2571e;
                            if (c0416bn4.f2591y.f2591y != null) {
                                throw new RuntimeException(c0416bn4.f2567a + ": Turret can not be attached to turret that is also attached to a turret");
                            }
                        }
                        if (c0416bn4.f2592z != null) {
                            c0416bn4.f2590x = c0416bn4.f2592z.f2571e;
                        }
                        if (c0416bn4.f2615W < 0.0f) {
                            c0416bn4.f2615W = c0416bn4.f2614V;
                        }
                    }
                }
                if (arrayList.size() > 31) {
                    throw new RuntimeException("Turret max count per unit is: 31");
                }
                c0458l.f3287fQ = (C0416bn[]) arrayList.toArray(new C0416bn[0]);
                c0458l.f3176dJ = c0458l.f3126cL.f2262i;
                float f5 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    C0416bn c0416bn5 = (C0416bn) it14.next();
                    c0416bn5.f2616X *= c0458l.f3017aG;
                    c0416bn5.f2572f *= c0458l.f3017aG;
                    c0416bn5.f2573g *= c0458l.f3017aG;
                    c0416bn5.f2617Y *= c0458l.f3017aG;
                    c0416bn5.f2618Z *= c0458l.f3017aG;
                    boolean z5 = false;
                    if (c0416bn5.f2594B) {
                        if (c0416bn5.f2620ab >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (c0458l.f3176dJ > c0416bn5.f2620ab) {
                                c0458l.f3176dJ = c0416bn5.f2620ab;
                            }
                            if (f5 < c0416bn5.f2620ab) {
                                f5 = c0416bn5.f2620ab;
                            }
                            if (C0773f.m2152c(c0416bn5.f2620ab - c0458l.f3126cL.f2262i) > 5.0f) {
                                boolean z6 = false;
                                Iterator it15 = c0458l.f2947o.iterator();
                                while (it15.hasNext()) {
                                    if (C0773f.m2152c(c0416bn5.f2620ab - ((C0472y) it15.next()).f3389a) < 5.0f) {
                                        z6 = true;
                                    }
                                }
                                if (!z6) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (c0416bn5.f2621ac != null) {
                        z5 = c0416bn5.f2621ac.booleanValue();
                    }
                    if (z5) {
                        C0472y c0472y = new C0472y();
                        c0472y.f3389a = c0416bn5.f2620ab;
                        c0458l.f2947o.add(c0472y);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        c0458l.f3126cL.f2262i = f5;
                    } else if (f5 < c0458l.f3126cL.f2262i) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String m666b19 = c1107ab.m666b("attack", "setMainTurretAs", (String) null);
                if (m666b19 != null) {
                    c0458l.f3172dF = c0458l.m3520e(m666b19);
                    if (c0458l.f3172dF == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + m666b19);
                    }
                } else {
                    c0458l.f3172dF = c0458l.m3520e("1");
                    if (c0458l.f3172dF == null) {
                        c0458l.f3172dF = c0458l.f3287fQ[0];
                    }
                }
                c0458l.f3173dG = c0458l.f3172dF.f2571e;
                m4044a(m2440a, EnumC0350ah.unitParsePartB);
                long m2440a3 = C0742br.m2440a();
                if (c1107ab.m638l("core", "action_")) {
                    for (int i6 = 0; i6 <= 50; i6++) {
                        m4037a(c0458l, c1107ab, "core", "action_" + i6 + "_", VariableScope.nullOrMissingString + i6, false, false);
                    }
                }
                Iterator it16 = c1107ab.m654e("action_").iterator();
                while (it16.hasNext()) {
                    String str19 = (String) it16.next();
                    String substring4 = str19.substring("action_".length());
                    if (c0458l.m3516g(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    m4037a(c0458l, c1107ab, str19, VariableScope.nullOrMissingString, substring4, true, false);
                }
                Iterator it17 = c1107ab.m654e("hiddenAction_").iterator();
                while (it17.hasNext()) {
                    String str20 = (String) it17.next();
                    String substring5 = str20.substring("hiddenAction_".length());
                    if (c0458l.m3516g(substring5) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring5);
                    }
                    m4037a(c0458l, c1107ab, str20, VariableScope.nullOrMissingString, substring5, true, true);
                }
                m4044a(m2440a3, EnumC0350ah.actionParse);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 <= 1) {
                    boolean z7 = i7 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i8 = 1; i8 < 21; i8++) {
                        String str21 = z7 ? "leg_" + i8 : "arm_" + i8;
                        if (c1107ab.m648g(str21)) {
                            C0403ba c0403ba = new C0403ba();
                            C0403ba.m3914a(c0403ba, c0458l, c1107ab, str21, z7, arrayList4);
                            arrayList4.add(c0403ba);
                        } else {
                            arrayList4.add(null);
                        }
                    }
                    i7++;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it18 = arrayList2.iterator();
                while (it18.hasNext()) {
                    C0403ba c0403ba2 = (C0403ba) it18.next();
                    if (c0403ba2 != null) {
                        arrayList5.add(c0403ba2);
                    }
                }
                Iterator it19 = arrayList3.iterator();
                while (it19.hasNext()) {
                    C0403ba c0403ba3 = (C0403ba) it19.next();
                    if (c0403ba3 != null) {
                        arrayList5.add(c0403ba3);
                    }
                }
                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                    ((C0403ba) arrayList5.get(size4)).f2459a = size4;
                }
                c0458l.f3008ax = (C0403ba[]) arrayList5.toArray(new C0403ba[0]);
                if (c0458l.f3008ax.length > 0) {
                    c0458l.m3558a(C0396h.f2383a);
                }
                Iterator it20 = c0458l.f3158dr.iterator();
                while (it20.hasNext()) {
                    ((C0446f) it20.next()).m3707a(c0458l);
                }
                m4012b(c0458l);
                String m666b20 = c1107ab.m666b("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (m666b20 != null && !"NONE".equalsIgnoreCase(m666b20)) {
                    C0416bn m3520e = c0458l.m3520e(m666b20);
                    if (m3520e == null) {
                        throw new RuntimeException("Cannot find turret:" + m666b20 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    c0458l.f3064bB = m3520e.f2571e;
                }
                C0391c.m3948a(c0458l, c1107ab);
                c0458l.f3046bj = c1107ab.m685a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                c0458l.f3048bl = c1107ab.m685a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                c0458l.f3208ep = c1107ab.m657d("attack", "canAttack");
                if (c0458l.f3208ep) {
                    c0458l.f3209eq = c1107ab.m707a(c0458l, "attack", "canAttackFlyingUnits");
                    c0458l.f3210er = c1107ab.m707a(c0458l, "attack", "canAttackLandUnits");
                    c0458l.f3211es = c1107ab.m707a(c0458l, "attack", "canAttackUnderwaterUnits");
                } else {
                    c0458l.f3209eq = c1107ab.m704a(c0458l, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    c0458l.f3210er = c1107ab.m704a(c0458l, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    c0458l.f3211es = c1107ab.m704a(c0458l, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                c0458l.f3212et = c1107ab.m704a(c0458l, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(c0458l.f3212et)) {
                    c0458l.f3212et = null;
                }
                c0458l.f3214ev = c1107ab.m705a(c0458l, "attack", "canOnlyAttackUnitsWithTags", (C0454h) null);
                c0458l.f3215ew = c1107ab.m705a(c0458l, "attack", "canOnlyAttackUnitsWithoutTags", (C0454h) null);
                if (c0458l.f3214ev != null || c0458l.f3215ew != null) {
                    c0458l.f3213eu = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it21 = arrayList.iterator();
                while (it21.hasNext()) {
                    C0416bn c0416bn6 = (C0416bn) it21.next();
                    if (c0416bn6.f2607O != null && c0416bn6.f2607O.m3675a(c0458l.f3214ev)) {
                        c0416bn6.f2607O = null;
                    }
                    if (c0416bn6.f2608P != null && c0416bn6.f2608P.m3675a(c0458l.f3215ew)) {
                        c0416bn6.f2608P = null;
                    }
                    if (c0416bn6.f2594B) {
                        if (c0416bn6.f2607O != null || c0416bn6.f2608P != null) {
                            z8 = true;
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (z8 && !z9) {
                    c0458l.f3216ex = true;
                    c0458l.f3213eu = true;
                }
                c0458l.f3217ey = c1107ab.m685a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                c0458l.f3283fM = c1107ab.m685a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                c0458l.f3284fN = c1107ab.m685a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (c0458l.f3208ep && c0458l.f3284fN) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                c0458l.f3266fv = c1107ab.m705a(c0458l, "ai", "aiTags", (C0454h) null);
                c0458l.f3267fw = c1107ab.m685a("ai", "disableUse", (Boolean) false).booleanValue();
                c0458l.f3270fz = c1107ab.m683a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                c0458l.f3271fA = c1107ab.m667b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                c0458l.f3272fB = c1107ab.m683a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                c0458l.f3269fy = c1107ab.m667b("ai", "maxEachBase", Integer.valueOf(C0773f.m2167b(2, c0458l.f3271fA))).intValue();
                c0458l.f3268fx = c1107ab.m667b("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (c0458l.f3269fy < c0458l.f3271fA) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!c0458l.f3018aH) {
                    if (c1107ab.m636n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (c1107ab.m636n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                c0458l.f3275fE = c1107ab.m667b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                c0458l.f3276fF = c1107ab.m667b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                c0458l.f3277fG = c1107ab.m685a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                c0458l.f3278fH = c1107ab.m705a(c0458l, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (C0454h) null);
                c0458l.f3273fC = c1107ab.m683a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                c0458l.f3273fC = c1107ab.m683a("ai", "noneInBaseExtraPriority", Float.valueOf(c0458l.f3273fC)).floatValue();
                c0458l.f3274fD = c1107ab.m683a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                c0458l.f3274fD = c1107ab.m683a("ai", "noneGlobalExtraPriority", Float.valueOf(c0458l.f3274fD)).floatValue();
                c0458l.f3279fI = c1107ab.m666b("ai", "upgradedFrom", (String) null);
                Float m683a3 = c1107ab.m683a("ai", "ai_upgradePriority", (Float) null);
                if (m683a3 != null && m683a3.floatValue() != -1.0f) {
                    if (m683a3.floatValue() >= 0.0f && m683a3.floatValue() <= 1.0f) {
                        c0458l.f3281fK = m683a3.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + c0458l.f3281fK + " must be between 0-1 or -1 for default");
                    }
                }
                if (c0458l.f3208ep) {
                    for (int i9 = 0; i9 < c0458l.f3287fQ.length; i9++) {
                        C0416bn c0416bn7 = c0458l.f3287fQ[i9];
                        if (c0416bn7.f2594B && c0416bn7.f2633ao == null && c0458l.f2955w) {
                            if (c0416bn7.f2579m > 140.0f && (c0458l.f3205em == -1 || c0458l.f3287fQ[c0458l.f3205em].f2579m < c0416bn7.f2579m)) {
                                c0458l.f3205em = i9;
                            }
                            if (c0416bn7.f2580n > 80.0f) {
                                c0458l.f3206en = i9;
                            }
                        }
                    }
                }
                if (c0458l.f3123cI == -2) {
                    if (c0458l.f3251fg == EnumC0246ao.AIR) {
                        c0458l.f3123cI = 5;
                    } else if (c0458l.mo3511j()) {
                        if (c0458l.f2996al != null) {
                            c0458l.f3123cI = 3;
                        } else {
                            c0458l.f3123cI = 2;
                        }
                    } else if (c0458l.f3126cL.f2270q < -2.0f) {
                        c0458l.f3123cI = 1;
                    } else if (c0458l.f3231eM > 0) {
                        c0458l.f3123cI = 3;
                    } else {
                        c0458l.f3123cI = 2;
                    }
                }
                if (c0458l.f3293fW.size() > 0) {
                    c0458l.f3294fX = true;
                    C1136m c1136m = new C1136m();
                    C1136m c1136m2 = new C1136m();
                    C1136m c1136m3 = new C1136m();
                    Iterator it22 = c0458l.f3293fW.iterator();
                    while (it22.hasNext()) {
                        C0465r c0465r = (C0465r) it22.next();
                        if (c0465r.f3371c == EnumC0466s.everyFrame) {
                            c1136m.add(c0465r);
                        } else if (c0465r.f3371c == EnumC0466s.every4Frames) {
                            c1136m2.add(c0465r);
                        } else if (c0465r.f3371c == EnumC0466s.every8Frames) {
                            c1136m3.add(c0465r);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + c0465r.f3371c);
                        }
                    }
                    c0458l.f3295fY = (C0465r[]) c1136m.toArray(new C0465r[0]);
                    c0458l.f3296fZ = (C0465r[]) c1136m2.toArray(new C0465r[0]);
                    c0458l.f3297ga = (C0465r[]) c1136m3.toArray(new C0465r[0]);
                }
                if (c0458l.f3312gp != null && c0458l.f3312gp.size() > 0) {
                    Iterator it23 = c0458l.f3312gp.iterator();
                    while (it23.hasNext()) {
                        ((C0468u) it23.next()).m3474a(c0458l);
                    }
                }
                if (c0458l.f3298gb.f7109a > 0) {
                    Iterator it24 = c0458l.f3298gb.iterator();
                    while (it24.hasNext()) {
                        ((AbstractC0467t) it24.next()).mo3478a(c0458l);
                    }
                    c0458l.f3298gb.clear();
                }
                m4044a(m2440a, EnumC0350ah.unitParsePartC);
                c1107ab.m672b();
                Iterator it25 = c1107ab.f7044d.iterator();
                while (it25.hasNext()) {
                    C1108ac c1108ac = (C1108ac) it25.next();
                    if (c1108ac.m635a() != null && (c1108ac.m635a().startsWith("hiddenAction_") || c1108ac.m635a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + c1108ac.m635a() + "]" + c1108ac.m634b() + " has been repeated");
                    }
                    String str22 = "Repeated key " + c1108ac;
                    c0458l.m3494r(str22);
                    if (c0458l.f2976R >= 1) {
                        GameEngine.m5777e("Converting warning to error (meta.strictLevel=" + c0458l.f2976R + ")");
                        throw new C0417bo(str22);
                    }
                }
                Iterator it26 = c1107ab.f7045e.iterator();
                while (it26.hasNext()) {
                    String str23 = "Skipping line, unexpected format: '" + ((String) it26.next()) + "'";
                    c0458l.m3494r(str23);
                    if (c0458l.f2976R >= 1) {
                        GameEngine.m5777e("Converting warning to error (meta.strictLevel=" + c0458l.f2976R + ")");
                        throw new C0417bo(str23);
                    }
                }
                if (c0859b != null) {
                    c0859b.f5657E++;
                }
                synchronized (C0458l.f2935c) {
                    C0458l.f2935c.add(c0458l);
                }
                m4044a(m2440a, EnumC0350ah.unitParsePartD);
                return c0458l;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0417bo e2) {
            m4023a(str, e2, c0859b);
            return null;
        } catch (OutOfMemoryError e3) {
            f2218l++;
            m4023a(str, new RuntimeException(e3), c0859b);
            return null;
        } catch (RuntimeException e4) {
            m4023a(str, e4, c0859b);
            return null;
        }
    }

    /* renamed from: a */
    public static void m4024a(String str, Exception exc, InterfaceC0303as interfaceC0303as) {
        C0859b c0859b = null;
        if (interfaceC0303as instanceof C0458l) {
            c0859b = ((C0458l) interfaceC0303as).f2968J;
        }
        m4023a(str, exc, c0859b);
    }

    /* renamed from: a */
    public static String m4033a(C0859b c0859b, String str, boolean z) {
        if (c0859b != null) {
            String m2272o = C0765a.m2272o(c0859b.f5643q);
            str = C0765a.m2272o(str);
            if (str.startsWith(m2272o)) {
                str = str.substring(m2272o.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + c0859b.m1673a() + ")";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m4023a(String str, Exception exc, C0859b c0859b) {
        String m2160b;
        String str2;
        GameEngine.print("Error while loading unit:" + str);
        GameEngine.m1007c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0417bo) {
            m2160b = exc.getMessage();
        } else {
            m2160b = C0773f.m2160b(exc);
        }
        if (m2160b == null) {
            m2160b = "<No error cause>";
        }
        if (!m2160b.contains("unit config file")) {
            m2160b = m2160b.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String m4033a = m4033a(c0859b, str, true);
        if (c0859b != null) {
            str2 = "Error loading unit: " + m4033a + ": \n" + m2160b;
        } else if (m2160b.contains("Error loading core unit")) {
            str2 = m2160b;
        } else {
            str2 = "Error loading core unit: " + m4033a + ": \n" + m2160b + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof C0417bo) {
            C0417bo c0417bo = (C0417bo) exc;
            if (c0417bo.f2656c != null || c0417bo.f2657d != null) {
                str2 = str2 + " (section:" + c0417bo.f2656c + ", key:" + c0417bo.f2657d + ")";
            }
        }
        boolean z = false;
        if (c0859b != null) {
            z = c0859b.f5632f;
        }
        if (!z) {
        }
        if (f2225s != null) {
            f2225s = str2;
        }
        if (c0859b != null) {
            c0859b.m1670a(str2);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str2, exc);
        }
    }

    /* renamed from: b */
    public static void m4011b(C0458l c0458l, C1107ab c1107ab, String str, String str2, boolean z) {
        String m666b = c1107ab.m666b(str, str2 + "name", (String) null);
        if (m666b == null) {
            return;
        }
        for (String str3 : m666b.split(",")) {
            String trim = str3.trim();
            C0339d c0339d = new C0339d();
            c0339d.f2068k = trim;
            c0339d.f2072o = c1107ab.m685a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2073p = c1107ab.m683a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2145aJ = c1107ab.m667b(str, str2 + "tech", (Integer) 1).intValue();
            c0339d.f2146aK = c1107ab.m685a(str, str2 + "forceNano", (Boolean) false).booleanValue();
            c0339d.f2147aL = c1107ab.m666b(str, str2 + "type", (String) null);
            c0339d.f2074q = C0429b.m3841a(c0458l, c1107ab, str, str2 + "price", (C0429b) null);
            c0339d.f2141aF = c1107ab.m704a(c0458l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2079v = c1107ab.m704a(c0458l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2083z = c1107ab.m704a(c0458l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2084A = m4038a(c0458l, c1107ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2083z != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2083z == LogicBoolean.falseBoolean) {
                c0339d.f2083z = null;
            }
            c0339d.f2085B = c1107ab.m704a(c0458l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2086C = m4038a(c0458l, c1107ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2085B != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2085B == LogicBoolean.falseBoolean) {
                c0339d.f2085B = null;
            }
            c0339d.f2087D = c1107ab.m704a(c0458l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2088E = m4038a(c0458l, c1107ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2087D != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2087D == LogicBoolean.falseBoolean) {
                c0339d.f2087D = null;
            }
            C0429b m3840a = C0429b.m3840a(c0458l, c1107ab, str, str2 + "addResources", true);
            if (m3840a != null && m3840a.m3817d()) {
                c0339d.f2114ae = m3840a;
            }
            c0339d.f2148aM = EnumC0341f.build;
            if (!"NONE".equalsIgnoreCase(trim)) {
                c0458l.f3304gh.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static void m4037a(C0458l c0458l, C1107ab c1107ab, String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList m4020a;
        C0339d c0339d = new C0339d();
        String m666b = c1107ab.m666b(str, str2 + "convertTo", (String) null);
        String m666b2 = c1107ab.m666b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        AbstractC0381at[] m3972a = C0361as.m3972a(c1107ab, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (AbstractC0381at[]) null);
        Float m683a = c1107ab.m683a(str, str2 + "addEnergy", (Float) null);
        C0429b m3840a = C0429b.m3840a(c0458l, c1107ab, str, str2 + "addResources", true);
        c0458l.m3557a(m3840a);
        C0429b m3840a2 = C0429b.m3840a(c0458l, c1107ab, str, str2 + "addResourcesScaledByAIHandicaps", true);
        c0458l.m3557a(m3840a2);
        String m666b3 = c1107ab.m666b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean m704a = c1107ab.m704a(c0458l, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String m666b4 = c1107ab.m666b(str, str2 + "alsoTriggerAction", (String) null);
        LogicBoolean m664c = c1107ab.m664c(c0458l, str, str2 + "alsoTriggerActionRepeat", null);
        String m666b5 = c1107ab.m666b(str, str2 + "alsoQueueAction", (String) null);
        String m666b6 = c1107ab.m666b(str, str2 + "spawnEffects", (String) null);
        String m666b7 = c1107ab.m666b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String m666b8 = c1107ab.m666b(str, str2 + "playSoundAtUnit", (String) null);
        String m666b9 = c1107ab.m666b(str, str2 + "playSoundGlobally", (String) null);
        String m666b10 = c1107ab.m666b(str, str2 + "playSoundToPlayer", (String) null);
        String m666b11 = c1107ab.m666b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0336o.m4092a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0326e.m4104a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0329h.m4099a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0322a.m4108a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0332k.m4096a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0323b.m4106a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0325d.m4105a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0333l.m4095a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0328g.m4101a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0334m.m4094a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0327f.m4102a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0331j.m4097a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        C0330i.m4098a(c0458l, c1107ab, str, str2, c0339d, str3, z);
        LogicBoolean m704a2 = c1107ab.m704a(c0458l, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            z3 = (m666b == null && m666b2 == null && m683a == null && m666b3 == null) ? true : true;
            z3 = (m3840a.m3817d() || m3840a2.m3817d()) ? true : true;
            z3 = (m666b4 == null && m666b5 == null && m666b6 == null && 0 == 0) ? true : true;
            z3 = (m666b8 == null && m666b9 == null && m666b10 == null && m666b11 == null) ? true : true;
            if (c0339d.f2112ac.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(m666b)) {
                m666b = null;
            }
            if ("NONE".equalsIgnoreCase(m666b2)) {
                m666b2 = null;
            }
            if (m666b3 != null && m666b3.equalsIgnoreCase("NONE")) {
                m666b3 = null;
            }
            c0339d.f2058a = c0458l.f3304gh.size();
            String m666b12 = c1107ab.m666b(str, str2 + "id", (String) null);
            if (m666b12 != null) {
                c0339d.f2059b = "c" + m666b12;
                if (c0339d.f2059b.contains(" ")) {
                    throw new RuntimeException("[" + str + "]id cannot contain space");
                }
                if (c0339d.f2059b.contains(",")) {
                    throw new RuntimeException("[" + str + "]id cannot contain ,");
                }
                if (c0339d.f2059b.contains(":")) {
                    throw new RuntimeException("[" + str + "]id cannot contain :");
                }
                if (c0339d.f2059b.contains("(")) {
                    throw new RuntimeException("[" + str + "]id cannot contain (");
                }
                if (c0339d.f2059b.contains("\ufffd\ufffd")) {
                    throw new RuntimeException("[" + str + "]id cannot contain null");
                }
                if (c0339d.f2059b.length() > 15) {
                    throw new RuntimeException("[" + str + "]id cannot be longer than 15 characters");
                }
                Iterator it = c0458l.f3304gh.iterator();
                while (it.hasNext()) {
                    if (c0339d.f2059b.equalsIgnoreCase(((C0339d) it.next()).f2059b)) {
                        throw new RuntimeException("[" + str + "]id more than one action exists with id: " + m666b12);
                    }
                }
            }
            c0339d.f2060c = str3;
            c0339d.f2072o = c1107ab.m685a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0339d.f2076s = C0453g.m3681a(c1107ab.m666b(str, str2 + "tags", (String) null));
            c0339d.f2073p = c1107ab.m683a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0339d.f2074q = C0429b.m3840a(c0458l, c1107ab, str, str2 + "price", true);
            c0339d.f2075r = C0429b.m3826b(c0458l, c1107ab, str, str2 + "streamingCost", null);
            if (c1107ab.m685a(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (c0339d.f2075r != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                c0339d.f2075r = C0429b.m3826b(c0458l, c1107ab, str, str2 + "price", null);
                c0339d.f2074q = C0429b.f2724a;
            }
            c0458l.m3557a(c0339d.f2074q);
            if (c0339d.f2075r != null) {
                c0458l.m3557a(c0339d.f2075r);
            }
            c0339d.f2094K = c1107ab.m685a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            c0339d.f2095L = c1107ab.m685a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            c0339d.f2096M = c1107ab.m685a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            c0339d.f2098O = c1107ab.m685a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            c0339d.f2097N = c1107ab.m685a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!c0339d.f2096M && !c0339d.f2097N && c0339d.f2098O) {
                c0339d.f2099P = true;
            }
            if (!c0339d.f2096M) {
                c0339d.f2067j = EnumC0226u.none;
            } else {
                c0339d.f2067j = EnumC0226u.popupQueue;
            }
            c0339d.f2077t = c1107ab.m704a(c0458l, str, str2 + "requireConditional", (LogicBoolean) null);
            c0339d.f2078u = c1107ab.m704a(c0458l, str, str2 + "isActive", (LogicBoolean) null);
            c0339d.f2079v = c1107ab.m704a(c0458l, str, str2 + "isVisible", (LogicBoolean) null);
            c0339d.f2081x = c1107ab.m685a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            c0339d.f2080w = c1107ab.m685a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(c0339d.f2081x)).booleanValue();
            if (z2) {
                if (c0339d.f2079v != null && !LogicBoolean.isStaticFalse(c0339d.f2079v)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                c0339d.f2079v = LogicBoolean.falseBoolean;
            }
            c0339d.f2083z = c1107ab.m704a(c0458l, str, str2 + "isLocked", (LogicBoolean) null);
            c0339d.f2084A = m4038a(c0458l, c1107ab, str, str2 + "isLockedMessage", (String) null);
            if (c0339d.f2083z != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2083z == LogicBoolean.falseBoolean) {
                c0339d.f2083z = null;
            }
            c0339d.f2085B = c1107ab.m704a(c0458l, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0339d.f2086C = m4038a(c0458l, c1107ab, str, str2 + "isLockedAltMessage", (String) null);
            if (c0339d.f2085B != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2085B == LogicBoolean.falseBoolean) {
                c0339d.f2085B = null;
            }
            c0339d.f2087D = c1107ab.m704a(c0458l, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0339d.f2088E = m4038a(c0458l, c1107ab, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0339d.f2087D != null) {
                c0339d.f2082y = true;
            }
            if (c0339d.f2087D == LogicBoolean.falseBoolean) {
                c0339d.f2087D = null;
            }
            c0339d.f2089F = LogicBoolean.create(c0458l, c1107ab.m666b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (c0339d.f2089F == LogicBoolean.falseBoolean) {
                c0339d.f2089F = null;
            }
            if (c0339d.f2089F != null) {
                c0458l.f3280fJ = true;
            }
            c0339d.f2090G = c1107ab.m704a(c0458l, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            c0339d.f2149aN = (EnumC0340e) c1107ab.m684a(str, str2 + "aiUse", c0339d.f2149aN, EnumC0340e.class);
            c0339d.f2093J = c0458l.m3541a(c1107ab.m666b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (c0339d.f2093J != null) {
                c0339d.f2067j = EnumC0226u.placeBuilding;
                if (m666b != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            c0339d.f2092I = c0458l.m3541a(c1107ab.m666b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            c0339d.f2141aF = c1107ab.m704a(c0458l, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0339d.f2134ay = m4017a(c0458l.f2964F, c1107ab.m666b(str, str2 + "iconImage", "NONE"), c0458l.f2986ab, c0458l, str, str2 + "iconImage");
            c0339d.f2137aB = c1107ab.m704a(c0458l, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (c0339d.f2137aB == LogicBoolean.trueBoolean) {
                c0339d.f2137aB = null;
            }
            c0339d.f2135az = c0458l.m3547a(c1107ab, str, str2 + "iconExtraImage");
            c0339d.f2136aA = c1107ab.m681a(str, str2 + "iconExtraColor", Integer.valueOf(Color.m5237a(100, 255, 255, 255))).intValue();
            c0339d.f2138aC = UnitReference.parseUnitTypeOrReferenceFromConf(c0458l, c1107ab, str, str2 + "unitShownInUI", null);
            if (c0339d.f2138aC != null && c0339d.f2134ay != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            c0339d.f2139aD = c1107ab.m685a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            c0339d.f2140aE = c1107ab.m685a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            c0339d.f2142aG = (EnumC0225t) c1107ab.m684a(str, str2 + "displayType", c0339d.f2142aG, EnumC0225t.class);
            c0339d.f2144aI = c1107ab.m685a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            c0339d.f2061d = m4038a(c0458l, c1107ab, str, str2 + "text", VariableScope.nullOrMissingString);
            c0339d.f2062e = UnitReference.parseUnitTypeOrReferenceFromConf(c0458l, c1107ab, str, str2 + "textAddUnitName", null);
            c0339d.f2065h = m4031a(c1107ab, str, str2 + "textPostFix", (String) null);
            c0339d.f2063f = UnitReference.parseUnitTypeOrReferenceFromConf(c0458l, c1107ab, str, str2 + "descriptionAddFromUnit", null);
            c0339d.f2064g = UnitReference.parseUnitTypeOrReferenceFromConf(c0458l, c1107ab, str, str2 + "descriptionAddUnitStats", null);
            c0339d.f2066i = m4038a(c0458l, c1107ab, str, str2 + "description", VariableScope.nullOrMissingString);
            c0339d.f2102S = c1107ab.m656d(str, str2 + "buildSpeed", Float.valueOf(c0339d.f2102S)).floatValue();
            if (c0339d.f2102S == 0.0f) {
                c0339d.f2102S = 50.0f;
            }
            c0339d.f2103T = c1107ab.m685a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c0339d.f2103T)).booleanValue();
            boolean z4 = false;
            c0339d.f2104U = c1107ab.m685a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(c0339d.f2104U)).booleanValue();
            c0339d.f2105V = c0458l.m3543a(c1107ab.m666b(str, str2 + "whenBuilding_playAnimation", (String) null), c0339d.f2105V);
            c0339d.f2106W = c1107ab.m683a(str, str2 + "whenBuilding_rotateTo", c0339d.f2106W);
            c0339d.f2107X = c1107ab.m685a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c0339d.f2107X)).booleanValue();
            c0339d.f2108Y = c1107ab.m685a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c0339d.f2108Y)).booleanValue();
            c0339d.f2109Z = c1107ab.m685a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c0339d.f2109Z)).booleanValue();
            String m666b13 = c1107ab.m666b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (m666b13 != null) {
                c0339d.f2110aa = c0458l.m3520e(m666b13);
                if (c0339d.f2110aa == null) {
                    throw new RuntimeException("Cannot find turret:" + m666b13 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (c0339d.f2107X) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (c0339d.f2109Z && c0339d.f2106W == null) {
                c0339d.f2106W = Float.valueOf(0.0f);
            }
            c0339d.f2111ab = c1107ab.m702a(c0458l, str, str2 + "whenBuilding_triggerAction", (C0468u) null);
            c0339d.f2100Q = c1107ab.m685a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(c0339d.f2100Q)).booleanValue();
            c0339d.f2101R = C0361as.m3972a(c1107ab, str, str2 + "convertTo_keepCurrentFields", (AbstractC0381at[]) null);
            if (m666b2 != null && !"NONE".equalsIgnoreCase(m666b2)) {
                c0339d.f2069l = c0458l.m3541a(m666b2, str2 + "whenBuilding_temporarilyConvertTo", str);
                c0339d.f2070m = m3972a;
                z4 = true;
            }
            if (c0339d.f2104U || c0339d.f2105V != null || c0339d.f2106W != null || c0339d.f2069l != null || c0339d.f2111ab != null) {
                c0458l.f3043bg = true;
            }
            c0339d.f2148aM = EnumC0341f.convert;
            if (m666b != null && !"NONE".equalsIgnoreCase(m666b)) {
                c0339d.f2091H = c0458l.m3541a(m666b, str2 + "convertTo", str);
                c0339d.f2068k = m666b;
                c0339d.f2097N = false;
                z4 = true;
            }
            if (m683a != null) {
                c0339d.f2113ad = m683a;
                z4 = true;
            }
            if (m3840a != null && m3840a.m3817d()) {
                c0339d.f2114ae = m3840a;
                z4 = true;
            }
            if (m3840a2 != null && m3840a2.m3817d()) {
                c0339d.f2115af = m3840a2;
                z4 = true;
            }
            c0339d.f2117ah = c1107ab.m689a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            c0339d.f2118ai = c1107ab.m671b(c0458l, str, str2 + "fireTurretXAtGround_withTarget", null);
            c0339d.f2120ak = c1107ab.m667b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            c0339d.f2122am = C0391c.m3947a(c0458l, c1107ab.m666b(str, "fireTurretXAtGround_showGuideDecals", (String) null));
            if (c0339d.f2118ai != null && c0339d.f2117ah == null) {
                c0339d.f2117ah = new PointF(0.0f, 0.0f);
            }
            String m666b14 = c1107ab.m666b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (m666b14 != null) {
                c0339d.f2119aj = c0458l.m3518f(m666b14);
                if (c0339d.f2119aj == null) {
                    throw new RuntimeException("Cannot find projectile:" + m666b14 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String m666b15 = c1107ab.m666b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (m666b15 != null) {
                c0339d.f2121al = EnumC0246ao.m4190a(m666b15, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (m666b3 != null) {
                C0416bn m3520e = c0458l.m3520e(m666b3);
                if (m3520e == null) {
                    throw new RuntimeException("Cannot find turret:" + m666b3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                c0339d.f2116ag = Integer.valueOf(m3520e.f2571e);
                if (c0339d.f2117ah == null) {
                    c0339d.f2067j = EnumC0226u.targetGround;
                    if (c0339d.f2093J != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            c0339d.f2123an = m671b;
            c0339d.f2124ao = m704a;
            if (m666b4 != null && !"NONE".equalsIgnoreCase(m666b4)) {
                c0339d.f2125ap = c0458l.m3525c(m666b4, "alsoTriggerAction", str);
                if (m664c != null) {
                    if (LogicBoolean.isStaticNumber(m664c)) {
                        float knownStaticNumber = LogicBoolean.getKnownStaticNumber(m664c);
                        if (knownStaticNumber == 0.0f) {
                            c0339d.f2125ap = null;
                        } else if (knownStaticNumber != 1.0f) {
                            c0339d.f2127ar = m664c;
                        }
                    } else {
                        c0339d.f2127ar = m664c;
                    }
                }
                z4 = true;
            }
            if (m666b5 != null && !"NONE".equalsIgnoreCase(m666b5)) {
                c0339d.f2126aq = c0458l.m3525c(m666b5, "alsoQueueAction", str);
                z4 = true;
            }
            if (m666b6 != null) {
                c0339d.f2128as = c0458l.m3542a(m666b6, (C0473z) null);
                z4 = true;
            }
            if (m666b7 != null) {
                c0339d.f2129at = c0458l.m3542a(m666b7, (C0473z) null);
                z4 = true;
            }
            if (m666b8 != null) {
                c0339d.f2130au = C0414bl.m3885a(c0458l, m666b8);
                z4 = true;
            }
            if (m666b9 != null) {
                c0339d.f2131av = C0414bl.m3885a(c0458l, m666b9);
                z4 = true;
            }
            if (m666b10 != null) {
                c0339d.f2132aw = C0414bl.m3885a(c0458l, m666b10);
                z4 = true;
            }
            if (m666b11 != null) {
                c0339d.f2133ax = C0414bl.m3885a(c0458l, m666b11);
                z4 = true;
            }
            if (m704a2 != null) {
                c0339d.f2143aH = m704a2;
                z4 = true;
            }
            if (c0339d.f2112ac.size() > 0) {
                z4 = true;
            }
            ArrayList arrayList = null;
            String m666b16 = c1107ab.m666b(str, str2 + "autoTriggerOnEvent", (String) null);
            Integer m667b = c1107ab.m667b(str, str2 + "autoTriggerOnEventRecursionLimit", (Integer) null);
            if (m667b != null) {
                if (m667b.intValue() < 0) {
                    throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEventRecursionLimit: Cannot be < 0");
                }
                if (m667b.intValue() > 50) {
                    throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEventRecursionLimit: Cannot be > 100");
                }
            }
            if (m666b16 != null && (m4020a = m4020a(str, str2 + "autoTriggerOnEvent", m666b16)) != null) {
                if (m4020a.size() < 1) {
                    throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 or more options, got:" + m4020a.size());
                }
                Iterator it2 = m4020a.iterator();
                while (it2.hasNext()) {
                    C0351ai c0351ai = (C0351ai) it2.next();
                    try {
                        EnumC0348af enumC0348af = (EnumC0348af) C1107ab.m693a(c0351ai.f2242a, (Enum) null, EnumC0348af.class);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        C0347ae c0347ae = new C0347ae();
                        c0347ae.f2183a = enumC0348af;
                        if (m667b != null) {
                            c0347ae.f2187e = m667b.intValue();
                        } else if (c0347ae.f2183a == EnumC0348af.newMessage) {
                            c0347ae.f2187e = 4;
                        }
                        if (c0351ai.f2243b != null) {
                            for (String str4 : c0351ai.f2243b.keySet()) {
                                String str5 = (String) c0351ai.f2243b.get(str4);
                                boolean z5 = false;
                                if (str4.equalsIgnoreCase("withtag")) {
                                    if (c0347ae.f2183a != EnumC0348af.tookDamage && c0347ae.f2183a != EnumC0348af.newMessage) {
                                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0347ae.f2183a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withprojectiletag")) {
                                    if (c0347ae.f2183a != EnumC0348af.tookDamage) {
                                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0347ae.f2183a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withactiontag")) {
                                    if (c0347ae.f2183a != EnumC0348af.queueItemAdded && c0347ae.f2183a != EnumC0348af.queueItemCancelled) {
                                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0347ae.f2183a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (z5) {
                                    String m2100p = C0773f.m2100p(str5);
                                    if (m2100p == null) {
                                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0347ae.f2183a.name() + " expected quoted string, got: " + str5);
                                    }
                                    if (c0347ae.f2186d != null) {
                                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0347ae.f2183a.name() + " tag was set twice");
                                    }
                                    c0347ae.f2186d = C1107ab.m640j(str, str2 + "autoTriggerOnEvent", m2100p);
                                } else {
                                    throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: Unknown parameter: " + str4);
                                }
                            }
                            continue;
                        }
                        arrayList.add(c0347ae);
                    } catch (C0417bo e) {
                        throw new C0417bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + e.getMessage(), e);
                    }
                }
            }
            LogicBoolean m704a3 = c1107ab.m704a(c0458l, str, str2 + "autoTrigger", (LogicBoolean) null);
            String m666b17 = c1107ab.m666b(str, str2 + "autoTrigger", (String) null);
            EnumC0466s enumC0466s = (EnumC0466s) c1107ab.m684a(str, str2 + "autoTriggerCheckRate", c0458l.f3090cb, EnumC0466s.class);
            c0339d.f2071n = z4;
            if (z4 || c0339d.f2079v != null) {
                if (m704a3 != null && z4) {
                    C0465r c0465r = new C0465r();
                    c0465r.f3369a = m704a3;
                    c0465r.f3370b = m666b17;
                    c0465r.f3371c = enumC0466s;
                    c0465r.f3372d = new C0342g(c0339d, c0458l.m3541a(c0339d.f2068k, "[" + str + "]" + str2, str));
                    c0458l.f3293fW.add(c0465r);
                }
                if (arrayList != null && z4) {
                    C0342g c0342g = new C0342g(c0339d, c0458l.m3541a(c0339d.f2068k, "[" + str + "]" + str2, str));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        C0347ae c0347ae2 = (C0347ae) it3.next();
                        c0347ae2.f2184b = c0342g;
                        c0347ae2.f2185c = c0458l;
                        c0458l.f3313gq.add(c0347ae2);
                    }
                }
                if (c0339d.f2068k != null && c0339d.f2074q != null && c0339d.f2074q.f2725b > 0) {
                    c0458l.f3305gi = true;
                }
                c0458l.f3304gh.add(c0339d);
            }
        }
    }

    /* renamed from: a */
    public static String m4035a(C0458l c0458l, String str, String str2) {
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0458l.f2968J == null) {
                str = "units/common.ini";
            } else {
                str = c0458l.f2968J.f5643q + "/common.ini";
            }
        }
        String str3 = C0773f.m2114h(str) + "/";
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str3 + str2;
            }
        }
    }

    /* renamed from: a */
    public static void m4044a(long j, EnumC0350ah enumC0350ah) {
        enumC0350ah.f2240o += C0742br.m2438a(j);
    }

    /* renamed from: i */
    public static void m3996i() {
        EnumC0350ah[] values;
        GameEngine.m5777e("==Timing==");
        for (EnumC0350ah enumC0350ah : EnumC0350ah.values()) {
            GameEngine.m5777e(enumC0350ah.name() + ": " + C0742br.m2439a(enumC0350ah.f2240o));
        }
    }

    /* renamed from: j */
    public static void m3995j() {
        for (EnumC0350ah enumC0350ah : EnumC0350ah.values()) {
            enumC0350ah.f2240o = 0.0d;
        }
    }

    /* renamed from: a */
    public static C0970e m4017a(String str, String str2, boolean z, C0458l c0458l, String str3, String str4) {
        try {
            return m4018a(str, str2, z, c0458l);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static C0970e m4018a(String str, String str2, boolean z, C0458l c0458l) {
        long m2440a = C0742br.m2440a();
        C0970e m4008b = m4008b(str, str2, z, c0458l);
        m4044a(m2440a, EnumC0350ah.imageLoadOrGet);
        return m4008b;
    }

    /* renamed from: b */
    public static C0970e m4008b(String str, String str2, boolean z, C0458l c0458l) {
        C0970e mo184a;
        if (str2 == null || str2.equalsIgnoreCase("NONE") || str2.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        boolean z2 = false;
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0458l.f2968J == null) {
                str = "units/common.ini";
            } else {
                str = c0458l.f2968J.f5643q + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str3 = C0773f.m2114h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        C0970e m4004c = m4004c(str4);
        if (m4004c != null) {
            return m4004c;
        }
        C1133j m4003c = m4003c(str3, str2, c0458l);
        int i = 0;
        if (f2211e != null) {
            i = f2211e.f5661I;
        }
        if (i > 5) {
            GameEngine.m5777e("Fast failing to oom image for this mod");
            mo184a = gameEngine.f6374bO.mo129r();
        } else {
            long m2440a = C0742br.m2440a();
            try {
                mo184a = gameEngine.f6374bO.mo184a((InputStream) m4003c, true);
                m4044a(m2440a, EnumC0350ah.imageLoad);
                if (mo184a.mo395A()) {
                    GameEngine.m5777e("oomErrors:" + f2218l);
                    f2218l++;
                    if (f2211e != null) {
                        f2211e.f5661I++;
                        f2211e.f5662J++;
                    }
                } else if (f2211e != null && !f2211e.f5652z && GameEngine.f6333aZ) {
                    mo184a.m898z();
                }
            } catch (RuntimeException e) {
                GameEngine.m5777e("imageStream:" + m4003c);
                throw new RuntimeException("Error decode image from: " + C0765a.m2285d(str3 + str2), e);
            }
        }
        try {
            m4003c.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (mo184a == null) {
            throw new RuntimeException("Failed to decode image: " + C0765a.m2283e(str3 + str2));
        }
        mo184a.mo392a(z);
        if (z2) {
            mo184a = AbstractC0244am.m4240a(mo184a, mo184a.f6622p, mo184a.f6623q);
        }
        m4032a(mo184a);
        m4026a(str4, mo184a);
        return mo184a;
    }

    /* renamed from: a */
    public static void m4026a(String str, C0970e c0970e) {
        f2213g.put(str, c0970e);
    }

    /* renamed from: c */
    public static C0970e m4004c(String str) {
        C0970e c0970e = (C0970e) f2213g.get(str);
        if (c0970e != null) {
            f2216j++;
            m4032a(c0970e);
            c0970e.mo45t();
            return c0970e;
        }
        if (f2217k) {
            GameEngine.m5777e("loadImageInConf: cache miss: " + str);
        }
        f2215i++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0641i m4021a(String str, String str2, C0458l c0458l) {
        long m2440a = C0742br.m2440a();
        AbstractC0641i m4009b = m4009b(str, str2, c0458l);
        m4044a(m2440a, EnumC0350ah.soundLoadOrGet);
        return m4009b;
    }

    /* renamed from: b */
    public static AbstractC0641i m4009b(String str, String str2, C0458l c0458l) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!str2.contains(".")) {
            return gameEngine.f6372bM.m2810a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (c0458l.f2968J == null) {
                str = "units/common.ini";
            } else {
                str = c0458l.f2968J.f5643q + "/common.ini";
            }
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        String str3 = C0773f.m2114h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0641i abstractC0641i = (AbstractC0641i) f2214h.get(str4);
        if (abstractC0641i != null) {
            m4034a(abstractC0641i);
            return abstractC0641i;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            C1133j m4003c = m4003c(str3, str2, c0458l);
            long m2440a = C0742br.m2440a();
            AbstractC0641i m2809a = gameEngine.f6372bM.m2809a(str2, m4003c, false);
            try {
                m4003c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m4044a(m2440a, EnumC0350ah.soundLoad);
            if (m2809a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                c0458l.m3494r(str5);
                return gameEngine.f6372bM.m2805b("Failed to load");
            }
            m4034a(m2809a);
            f2214h.put(str4, m2809a);
            return m2809a;
        }
    }

    /* renamed from: a */
    public static boolean m4019a(String str, String str2, String str3, C0859b c0859b) {
        if (str2 == null || !str2.contains("..") || GameEngine.m1030at()) {
            return true;
        }
        String canonicalPath = new File(C0765a.m2283e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0765a.m2283e("units")).getCanonicalPath())) {
            return true;
        }
        String m1657k = c0859b.m1657k();
        boolean startsWith = canonicalPath.startsWith(m1657k);
        if (!startsWith) {
            GameEngine.print("File: '" + canonicalPath + "' is not within mod: '" + m1657k + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m4022a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str + str2;
            }
        }
    }

    /* renamed from: c */
    public static C1133j m4003c(String str, String str2, C0458l c0458l) {
        String m4022a = m4022a(str, str2);
        C0859b c0859b = null;
        if (c0458l != null) {
            c0859b = c0458l.f2968J;
        } else {
            GameEngine.m990g("findAssetSteam meta==null");
        }
        if (c0859b != null) {
            try {
                if (!m4019a(str, str2, m4022a, c0859b)) {
                    throw new RuntimeException("File is outside mod: " + m4022a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C1133j m2276k = C0765a.m2276k(m4022a);
        if (m2276k == null) {
            GameEngine.m5777e("Orginal path: " + m4022a);
            throw new RuntimeException("IO Error: Failed to open: " + m4033a(c0859b, m4022a, true));
        }
        return m2276k;
    }

    /* renamed from: b */
    public static void m4012b(C0458l c0458l) {
        C0403ba[] c0403baArr = c0458l.f3008ax;
        for (C0403ba c0403ba : c0403baArr) {
            float f = -1.0f;
            C0403ba c0403ba2 = null;
            float f2 = 1.0f;
            if (c0403ba.f2473o) {
                f2 = 0.1f;
            }
            for (C0403ba c0403ba3 : c0403baArr) {
                if (c0403ba != c0403ba3 && !c0403ba3.f2470l) {
                    float m2216a = C0773f.m2216a(c0403ba.f2462d * f2, c0403ba.f2463e, c0403ba3.f2462d * f2, c0403ba3.f2463e);
                    if (c0403ba2 == null || m2216a < f) {
                        f = m2216a;
                        c0403ba2 = c0403ba3;
                    }
                }
            }
            float m2219a = C0773f.m2219a(f) + 2.0f;
            float f3 = m2219a * m2219a;
            ArrayList arrayList = new ArrayList();
            for (C0403ba c0403ba4 : c0403baArr) {
                if (c0403ba != c0403ba4 && !c0403ba4.f2470l && C0773f.m2216a(c0403ba.f2462d * f2, c0403ba.f2463e, c0403ba4.f2462d * f2, c0403ba4.f2463e) <= f3) {
                    arrayList.add(Integer.valueOf(c0403ba4.f2459a));
                }
            }
            c0403ba.f2503S = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                c0403ba.f2503S[i] = ((Integer) arrayList.get(i)).intValue();
            }
        }
    }

    /* renamed from: k */
    public static String m3994k() {
        return "builtin_mods";
    }

    /* renamed from: l */
    public static String m3993l() {
        return "builtin_mods_enabled";
    }

    /* renamed from: m */
    public static String m3992m() {
        String str;
        if (GameEngine.f6328aU) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList m4020a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = C1118al.m582a(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m576b = C1118al.m576b(trim, "(");
                    if (m576b == null) {
                        throw new C0417bo("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = m576b[0];
                    str4 = m576b[1].trim();
                }
                C0351ai c0351ai = new C0351ai();
                c0351ai.f2242a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0417bo("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = C1118al.m581a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m576b2 = C1118al.m576b(str5, "=");
                            if (m576b2 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = m576b2[0].trim();
                            String trim3 = m576b2[1].trim();
                            if (c0351ai.f2243b == null) {
                                c0351ai.f2243b = new HashMap();
                            }
                            c0351ai.f2243b.put(trim2, trim3);
                        }
                    }
                }
                arrayList.add(c0351ai);
            }
        }
        return arrayList;
    }
}