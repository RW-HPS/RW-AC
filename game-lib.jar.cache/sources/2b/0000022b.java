package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.Unit;
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

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ag.class */
public class ag {
    static int b;
    static int c;
    public static int d;
    static com.corrodinggames.rts.gameFramework.mod.b e;
    static boolean f;
    static int i;
    static int j;
    static boolean k;
    static int l;
    static boolean a = false;
    public static HashMap g = new HashMap();
    public static HashMap h = new HashMap();
    public static com.corrodinggames.rts.gameFramework.utility.m m = new com.corrodinggames.rts.gameFramework.utility.m();
    static HashMap n = new HashMap();
    static final Object o = new Object();
    public static float p = 50.0f;
    public static float q = 50.0f;
    static com.corrodinggames.rts.gameFramework.mod.b r = null;
    static String s = null;

    public static void a(int i2) {
        if (e != null) {
            e.G += i2;
        }
    }

    public static void a() {
        i();
        j();
    }

    public static void a(com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        if (eVar != null && !eVar.v) {
            if (GameEngine.az() && (eVar instanceof com.corrodinggames.rts.gameFramework.unitAction.h)) {
                return;
            }
            eVar.v = true;
            a(eVar.u());
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.unitAction.e[] eVarArr) {
        if (eVarArr != null) {
            com.corrodinggames.rts.gameFramework.unitAction.e eVar = null;
            for (com.corrodinggames.rts.gameFramework.unitAction.e eVar2 : eVarArr) {
                if (eVar2 != eVar) {
                    a(eVar2);
                }
                if (eVar == null) {
                    eVar = eVar2;
                }
            }
        }
    }

    public static void a(com.corrodinggames.rts.gameFramework.a.i iVar) {
        if (!iVar.g) {
            iVar.g = true;
            if (e != null) {
                e.H += iVar.a();
            }
        }
    }

    public static boolean a(com.corrodinggames.rts.gameFramework.utility.m mVar) {
        l lVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(l.c);
        ArrayList arrayList2 = new ArrayList(l.d);
        com.corrodinggames.rts.gameFramework.utility.m mVar2 = new com.corrodinggames.rts.gameFramework.utility.m();
        String str = null;
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            l a2 = a((l) it.next());
            if (a2 == null) {
                GameEngine.m328e("Failed to apply changes to unit type: " + lVar.M);
                z = true;
                if (str == null && s != null) {
                    str = s;
                }
            } else {
                GameEngine.m328e("Changes applied to unit type: " + lVar.M);
                z2 = true;
                mVar2.add(a2);
            }
        }
        if (str != null && GameEngine.at()) {
            gameEngine.c("Unit errors", str);
        }
        if (z2 && !c(false)) {
            z = true;
        }
        if (z2 && !z) {
            l.e = null;
            e();
            s = null;
            PlayerData.P();
            InterfaceEngine.K();
            z3 = true;
            if (!z) {
                Iterator it2 = mVar2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    l lVar2 = (l) it2.next();
                    if (lVar2.gt.size() > 0) {
                        gameEngine.a(lVar2.gt.size() + " Warning(s) loading: " + lVar2.b() + " \n" + ((String) lVar2.gt.get(0)), 1);
                        lVar2.gt.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            GameEngine.m328e("Failed to load some units, keeping old config");
            synchronized (l.c) {
                l.c.clear();
                l.c.addAll(arrayList);
            }
            l.d = arrayList2;
        }
        return z3;
    }

    public static void b() {
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        b = 0;
        c = 0;
        d = 0;
        Iterator it = com.corrodinggames.rts.game.units.am.bF().iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.as r2 = ((com.corrodinggames.rts.game.units.am) it.next()).r();
            if ((r2 instanceof l) && !mVar.contains(r2)) {
                mVar.add((l) r2);
            }
        }
        if (mVar.size() > 0) {
            a(mVar);
        }
    }

    public static void c() {
        boolean z = false;
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        Iterator it = l.c.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            boolean z2 = false;
            Iterator it2 = lVar.k.iterator();
            while (it2.hasNext()) {
                aa aaVar = (aa) it2.next();
                long a2 = aaVar.a(false);
                if (a2 != aaVar.a) {
                    z2 = true;
                    aaVar.a = a2;
                }
            }
            if (z2) {
                if (!z) {
                    GameEngine.m328e("Detected unit changes");
                    z = true;
                }
                mVar.add(lVar);
            }
        }
        if (mVar.size() > 0) {
            a(mVar);
        }
    }

    public static void d() {
        if (l.e != null) {
            GameEngine.m328e("applyPendingNetworkUnits: Applying new network units from server (" + l.e.size() + " units)");
            l.d = l.e;
            l.e = null;
            e();
            return;
        }
        GameEngine.m328e("applyPendingNetworkUnits: no server units list found");
    }

    public static ArrayList a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (l.c) {
            Iterator it = l.c.iterator();
            while (it.hasNext()) {
                l lVar = (l) it.next();
                if (lVar.J == null || (lVar.J.m() && z)) {
                    arrayList.add(lVar);
                }
            }
        }
        return arrayList;
    }

    public static com.corrodinggames.rts.gameFramework.utility.ab a(String str) {
        synchronized (n) {
            com.corrodinggames.rts.gameFramework.utility.ab abVar = (com.corrodinggames.rts.gameFramework.utility.ab) n.get(str);
            if (abVar != null) {
                return abVar;
            }
            com.corrodinggames.rts.gameFramework.utility.j b2 = b(str);
            if (b2 == null) {
                return null;
            }
            try {
                com.corrodinggames.rts.gameFramework.utility.ab abVar2 = new com.corrodinggames.rts.gameFramework.utility.ab(new BufferedInputStream(b2), str);
                abVar2.a();
                abVar2.f = b2.d();
                n.put(str, abVar2);
                return abVar2;
            } catch (IOException e2) {
                e2.printStackTrace();
                throw new bo("Load of '" + str + "' failed: " + e2.getMessage());
            }
        }
    }

    public static void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, boolean z) {
        com.corrodinggames.rts.gameFramework.utility.ab a2 = a(str);
        if (a2 == null) {
            if (z) {
                return;
            }
            throw new bo("[" + str2 + "] Could not find conf target:" + str);
        }
        lVar.o(a2.f);
        abVar.a(a2);
        a(lVar, abVar, a2, str, 1);
    }

    public static void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, com.corrodinggames.rts.gameFramework.utility.ab abVar2, String str, int i2) {
        String a2;
        String str2;
        if (i2 > 10) {
            throw new bo("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String b2 = abVar2.b("core", "copyFrom", (String) null);
        if (b2 != null) {
            String[] split = b2.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str3 : split) {
                String trim = str3.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new bo("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (lVar.J == null) {
                            str2 = "units/common.ini";
                        } else {
                            str2 = lVar.J.q + "/common.ini";
                        }
                        a2 = a(com.corrodinggames.rts.gameFramework.f.h(str2), substring);
                    } else if (trim.startsWith("CORE:")) {
                        a2 = a(com.corrodinggames.rts.gameFramework.f.h("units/common.ini"), trim.substring("CORE:".length()));
                    } else {
                        a2 = a(com.corrodinggames.rts.gameFramework.f.h(str), trim);
                    }
                    com.corrodinggames.rts.gameFramework.utility.ab a3 = a(a2);
                    if (a3 == null) {
                        String str4 = "Could not find copyFrom target:" + a2;
                        if (i2 != 0) {
                            str4 = str4 + " (while loading: " + str + ")";
                        }
                        throw new bo(str4);
                    }
                    lVar.o(a3.f);
                    abVar.a(a3);
                    a(lVar, abVar, a3, a2, i2 + 1);
                }
            }
        }
    }

    public static void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, int i2) {
        if (i2 > 10) {
            throw new bo("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String b2 = abVar.b(str2, "@copyFromSection", (String) null);
        if (b2 == null || b2.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = b2.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                com.corrodinggames.rts.gameFramework.utility.m k2 = abVar.k(trim, VariableScope.nullOrMissingString);
                if (k2.size() == 0) {
                    throw new bo("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = k2.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String b3 = abVar.b(trim, str4);
                    if (b3 != null) {
                        abVar.d(str, str4, b3);
                    }
                }
                a(lVar, abVar, str, trim, i2 + 1);
            }
        }
    }

    public static bb a(com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, String str3) {
        return abVar.a(str, str2, str3, false);
    }

    public static aj a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, String str3) {
        return abVar.a(lVar, str, str2, str3);
    }

    public static l a(l lVar) {
        String str = lVar.D;
        GameEngine gameEngine = GameEngine.getGameEngine();
        l lVar2 = null;
        String str2 = null;
        if (lVar.J != null) {
            str2 = lVar.J.R;
        }
        synchronized (n) {
            n.clear();
        }
        s = null;
        try {
            lVar2 = a(str, lVar.J, lVar.K, lVar.L);
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            if (s == null) {
                gameEngine.a("Error loading unit:" + a(lVar.J, str, true) + "\n" + e2.getMessage(), 1);
            }
        }
        if (lVar2 == null && lVar.J != null) {
            lVar.J.R = str2;
        }
        if (lVar2 != null) {
            synchronized (l.c) {
                l.c.remove(lVar);
            }
            a((com.corrodinggames.rts.game.units.as) lVar, lVar2, true);
            if (l.d.remove(lVar)) {
                l.d.add(lVar2);
                if (lVar.H != lVar2.H) {
                    d++;
                }
            } else {
                GameEngine.m328e("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            PlayerData.P();
            InterfaceEngine.K();
        }
        return lVar2;
    }

    public static void a(com.corrodinggames.rts.game.units.as asVar, l lVar, boolean z) {
        Iterator it = com.corrodinggames.rts.game.units.am.bF().iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) it.next();
            if (amVar instanceof j) {
                j jVar = (j) amVar;
                if (jVar.x == asVar) {
                    PlayerData.b((com.corrodinggames.rts.game.units.am) jVar);
                    jVar.a(lVar, false, z);
                    jVar.S();
                    if (jVar.dg() != null) {
                        jVar.dg().a(lVar);
                    }
                    PlayerData.c(jVar);
                }
                if (jVar.z == asVar) {
                    jVar.z = lVar;
                }
            }
        }
    }

    public static String a(ArrayList arrayList) {
        int valueOf;
        HashMap hashMap = new HashMap();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.gameFramework.mod.b bVar = ((l) it.next()).J;
            if (bVar != null) {
                Integer num = (Integer) hashMap.get(bVar);
                if (num == null) {
                    valueOf = 1;
                } else {
                    valueOf = Integer.valueOf(num.intValue() + 1);
                }
                hashMap.put(bVar, valueOf);
            }
        }
        String str = VariableScope.nullOrMissingString;
        for (com.corrodinggames.rts.gameFramework.mod.b bVar2 : hashMap.keySet()) {
            str = str + bVar2.a() + "(unitCount: " + ((Integer) hashMap.get(bVar2)) + (bVar2.m() ? VariableScope.nullOrMissingString : "[disabled]") + "), ";
        }
        return str;
    }

    public static String b(boolean z) {
        ArrayList a2 = a(z);
        l.e = null;
        l.d = a2;
        s = null;
        GameEngine.m328e("enableAll: " + a(l.d));
        e();
        return s;
    }

    public static boolean c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = l.d;
        if (z) {
            arrayList = a(true);
        } else {
            arrayList = l.d;
        }
        boolean z2 = true;
        s = null;
        l.d = arrayList;
        g();
        if (s != null) {
            z2 = false;
        }
        l.d = arrayList2;
        g();
        return z2;
    }

    public static void e() {
        synchronized (o) {
            n();
        }
    }

    private static void n() {
        l lVar = null;
        ArrayList arrayList = new ArrayList();
        if (GameEngine.getGameEngine().as()) {
            for (com.corrodinggames.rts.game.units.ar arVar : com.corrodinggames.rts.game.units.ar.values()) {
                arrayList.add(arVar);
            }
        }
        Iterator it = l.d.iterator();
        while (it.hasNext()) {
            l lVar2 = (l) it.next();
            arrayList.add(lVar2);
            if (lVar2.M.equals("missing") && lVar2.J == null) {
                lVar = lVar2;
            }
        }
        com.corrodinggames.rts.game.units.ar.ae = arrayList;
        com.corrodinggames.rts.game.units.am.bL();
        g();
        f();
        com.corrodinggames.rts.game.units.custom.e.a.e();
        if (lVar == null) {
            GameEngine.m328e("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = l.d.iterator();
            while (it2.hasNext()) {
                l lVar3 = (l) it2.next();
                if (lVar3.M.equals("missing")) {
                    GameEngine.m328e("Found a missing placeholder");
                    lVar = lVar3;
                }
            }
        }
        l.b = lVar;
    }

    public static void f() {
        float f2 = 50.0f;
        float f3 = 50.0f;
        Iterator it = l.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            float f4 = lVar.cW;
            if (f4 > 250.0f) {
                f4 = 250.0f;
            }
            if (f2 < f4) {
                f2 = f4;
            }
            if (lVar.aH && f3 < f4) {
                f3 = f4;
            }
        }
        p = f2;
        q = f3;
    }

    public static com.corrodinggames.rts.gameFramework.utility.j b(String str) {
        return com.corrodinggames.rts.gameFramework.file.a.k(VariableScope.nullOrMissingString + str);
    }

    public static void b(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v140, types: [com.corrodinggames.rts.game.units.a.v] */
    /* JADX WARN: Type inference failed for: r0v144, types: [com.corrodinggames.rts.game.units.a.l] */
    /* JADX WARN: Type inference failed for: r0v260, types: [com.corrodinggames.rts.game.units.a.l] */
    public static void a(com.corrodinggames.rts.game.units.as asVar) {
        com.corrodinggames.rts.game.units.custom.a.g gVar;
        com.corrodinggames.rts.game.units.a.v vVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            asVar.h();
            if (asVar instanceof l) {
                l lVar = (l) asVar;
                if (lVar.fI != null) {
                    com.corrodinggames.rts.game.units.as s2 = l.s(lVar.fI);
                    if (s2 == null) {
                        throw new bo("Could not find [ai]upgradedFrom target:" + lVar.fI);
                    }
                    lVar.b(s2);
                }
                Iterator it = lVar.p.iterator();
                while (it.hasNext()) {
                    ((v) it.next()).a();
                }
                if (lVar.eH) {
                    l.g.add(lVar);
                }
            }
            Iterator it2 = l.d.iterator();
            while (it2.hasNext()) {
                l lVar2 = (l) it2.next();
                if (asVar instanceof l) {
                    l lVar3 = (l) asVar;
                    if (lVar2.fI != null && lVar2.fI.equalsIgnoreCase(lVar3.i())) {
                        lVar3.b(lVar2);
                    }
                }
                Iterator it3 = lVar2.gg.iterator();
                while (it3.hasNext()) {
                    p pVar = (p) it3.next();
                    if (pVar.a.equalsIgnoreCase(asVar.i())) {
                        pVar.e = true;
                        boolean z = false;
                        for (int i2 = lVar2.cl; i2 <= 3; i2++) {
                            ArrayList a2 = asVar.a(i2);
                            if (lVar2.aH || pVar.c) {
                                vVar = new com.corrodinggames.rts.game.units.a.v(lVar2);
                            } else {
                                vVar = new com.corrodinggames.rts.game.units.a.l(lVar2);
                            }
                            if (pVar.b != -999.0f) {
                                vVar.g = pVar.b;
                            }
                            if (pVar.f != null) {
                                boolean z2 = false;
                                if (!(asVar instanceof l) && !(com.corrodinggames.rts.game.units.am.a(asVar) instanceof com.corrodinggames.rts.game.units.y)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    vVar.h = com.corrodinggames.rts.game.units.custom.a.c.a(pVar);
                                } else if (!z) {
                                    z = true;
                                    lVar2.r("builtFrom isLocked currently cannot be used when targeting old-style unit:" + asVar.i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = a2.iterator();
                            while (it4.hasNext()) {
                                if (vVar.equals((com.corrodinggames.rts.game.units.a.s) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                a2.add(vVar);
                            }
                            b(a2);
                        }
                    }
                }
            }
            if (asVar instanceof l) {
                l lVar4 = (l) asVar;
                Iterator it5 = lVar4.gh.iterator();
                while (it5.hasNext()) {
                    com.corrodinggames.rts.game.units.custom.a.d dVar = (com.corrodinggames.rts.game.units.custom.a.d) it5.next();
                    if (dVar.k != null && dVar.k.equalsIgnoreCase("setRally")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList a3 = asVar.a(i3);
                            com.corrodinggames.rts.game.units.a.o oVar = new com.corrodinggames.rts.game.units.a.o();
                            if (dVar.p != -999.0f) {
                                oVar.g = dVar.p;
                            }
                            a3.add(oVar);
                            lVar4.dc = true;
                            b(a3);
                        }
                    } else if (dVar.k != null && dVar.k.equalsIgnoreCase("reclaim")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList a4 = asVar.a(i4);
                            com.corrodinggames.rts.game.units.a.m mVar = new com.corrodinggames.rts.game.units.a.m(true);
                            if (dVar.p != -999.0f) {
                                mVar.g = dVar.p;
                            }
                            a4.add(mVar);
                            b(a4);
                        }
                    } else if (dVar.k != null && dVar.k.equalsIgnoreCase("repair")) {
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList a5 = asVar.a(i5);
                            com.corrodinggames.rts.game.units.a.n nVar = new com.corrodinggames.rts.game.units.a.n();
                            if (dVar.p != -999.0f) {
                                nVar.g = dVar.p;
                            }
                            a5.add(nVar);
                            b(a5);
                        }
                    } else {
                        com.corrodinggames.rts.game.units.as asVar2 = null;
                        if (dVar.k != null) {
                            asVar2 = com.corrodinggames.rts.game.units.ar.a(dVar.k);
                            if (asVar2 == null) {
                                throw new bo("Could not find canBuild target:" + dVar.k);
                            }
                        } else if (dVar.aM != com.corrodinggames.rts.game.units.custom.a.f.convert) {
                            throw new bo("'Target' required for action:" + dVar.a());
                        }
                        for (int i6 = 1; i6 <= 3; i6++) {
                            ArrayList a6 = asVar.a(i6);
                            if (dVar.aM == com.corrodinggames.rts.game.units.custom.a.f.build) {
                                if (asVar2.j() || dVar.aK) {
                                    gVar = new com.corrodinggames.rts.game.units.a.v(asVar2, dVar.aJ, null);
                                    gVar.h = com.corrodinggames.rts.game.units.custom.a.c.a(dVar);
                                } else {
                                    gVar = new com.corrodinggames.rts.game.units.a.l(asVar2);
                                    gVar.h = com.corrodinggames.rts.game.units.custom.a.c.a(dVar);
                                }
                            } else if (dVar.aM == com.corrodinggames.rts.game.units.custom.a.f.convert) {
                                gVar = new com.corrodinggames.rts.game.units.custom.a.g(dVar, l.a(asVar2));
                            } else {
                                throw new bo("Could not find actionType:" + dVar.aM);
                            }
                            if (dVar.p != -999.0f) {
                                gVar.g = dVar.p;
                            }
                            boolean z4 = false;
                            Iterator it6 = a6.iterator();
                            while (it6.hasNext()) {
                                if (gVar.equals((com.corrodinggames.rts.game.units.a.s) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                a6.add(gVar);
                            }
                            b(a6);
                        }
                    }
                }
            }
            if (asVar instanceof l) {
                l lVar5 = (l) asVar;
                lVar5.fu = false;
                for (int i7 = 1; i7 <= 3; i7++) {
                    Iterator it7 = asVar.a(i7).iterator();
                    while (it7.hasNext()) {
                        com.corrodinggames.rts.game.units.a.s sVar = (com.corrodinggames.rts.game.units.a.s) it7.next();
                        if (!(sVar instanceof com.corrodinggames.rts.game.units.custom.a.g) && sVar.i() != null) {
                            lVar5.fu = true;
                        }
                    }
                }
                Iterator it8 = lVar5.p.iterator();
                while (it8.hasNext()) {
                    ((v) it8.next()).b();
                }
            }
            boolean z5 = gameEngine.O() && gameEngine.netEngine.gameMapData.k;
            for (int i8 = 1; i8 <= 3; i8++) {
                Iterator it9 = asVar.a(i8).iterator();
                while (it9.hasNext()) {
                    com.corrodinggames.rts.game.units.a.s sVar2 = (com.corrodinggames.rts.game.units.a.s) it9.next();
                    if (sVar2.h instanceof com.corrodinggames.rts.game.units.custom.a.b) {
                        GameEngine.a("=== ChainedActionConfig already on: " + asVar.i() + " action:" + sVar2.b());
                        sVar2.h = ((com.corrodinggames.rts.game.units.custom.a.b) sVar2.h).b;
                    }
                    if (z5) {
                        com.corrodinggames.rts.game.units.custom.d.b B = sVar2.B();
                        com.corrodinggames.rts.game.units.custom.d.b r_ = sVar2.r_();
                        if (!B.c() && r_ == null) {
                            com.corrodinggames.rts.game.units.custom.a.b bVar = new com.corrodinggames.rts.game.units.custom.a.b(sVar2.h);
                            sVar2.h = bVar;
                            bVar.c = com.corrodinggames.rts.game.units.custom.d.b.a;
                            bVar.d = B;
                        }
                    }
                }
            }
        } catch (bo e2) {
            a(asVar.i(), e2, asVar);
        } catch (RuntimeException e3) {
            a(asVar.i(), e3, asVar);
        }
    }

    public static void g() {
        synchronized (o) {
            o();
        }
    }

    private static void o() {
        p pVar;
        String str;
        l.g.clear();
        l.f.clear();
        Iterator it = l.d.iterator();
        while (it.hasNext()) {
            l lVar = (l) it.next();
            if (lVar.J != null && (str = lVar.J.R) != null) {
                GameEngine.print(lVar.i() + "(mod:" + lVar.t() + "): Getting setup while mod has error: " + str);
            }
            Iterator it2 = lVar.gg.iterator();
            while (it2.hasNext()) {
                ((p) it2.next()).e = false;
            }
            lVar.fL.clear();
        }
        Iterator it3 = l.d.iterator();
        while (it3.hasNext()) {
            l lVar2 = (l) it3.next();
            try {
                if (lVar2.Q != null) {
                    for (String str2 : lVar2.Q.split(",")) {
                        String trim = str2.trim();
                        com.corrodinggames.rts.game.units.as a2 = l.a(trim, false);
                        if (a2 == null) {
                            throw new bo("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (a2 instanceof l) {
                            GameEngine.m328e("Replacing:" + a2.i() + " with " + lVar2.i());
                        }
                        l.f.put(a2, lVar2);
                    }
                }
            } catch (bo e2) {
                a(lVar2.i(), e2, lVar2);
            }
        }
        for (com.corrodinggames.rts.game.units.ar arVar : com.corrodinggames.rts.game.units.ar.values()) {
            a(arVar);
        }
        Iterator it4 = l.d.iterator();
        while (it4.hasNext()) {
            a((com.corrodinggames.rts.game.units.as) ((l) it4.next()));
        }
        Iterator it5 = l.d.iterator();
        while (it5.hasNext()) {
            l lVar3 = (l) it5.next();
            Iterator it6 = lVar3.gg.iterator();
            while (it6.hasNext()) {
                if (!((p) it6.next()).e) {
                    String str3 = pVar.d + " failed to find target:" + pVar.a;
                    lVar3.q(str3);
                    if (lVar3.R >= 1) {
                        GameEngine.m328e("Converting warning to error (meta.strictLevel=" + lVar3.R + ")");
                        lVar3.p(str3);
                    }
                }
            }
            if (lVar3.gp != null && lVar3.gp.size() > 0) {
                Iterator it7 = lVar3.gp.iterator();
                while (it7.hasNext()) {
                    try {
                        ((u) it7.next()).b(lVar3);
                    } catch (bo e3) {
                        a(lVar3.i(), e3, lVar3);
                    }
                }
            }
        }
        Iterator it8 = l.d.iterator();
        while (it8.hasNext()) {
            ((l) it8.next()).r();
        }
        Collections.sort(l.g, new q());
    }

    public static l a(String str, com.corrodinggames.rts.gameFramework.mod.b bVar, String str2, String str3) {
        try {
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            com.corrodinggames.rts.gameFramework.utility.j b2 = b(str);
            if (b2 == null) {
                throw new RuntimeException("Failed to open unit config file:" + str);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(b2);
            a(loadAllUnitsTook, ah.iniOpen);
            b++;
            if (bVar != null) {
                c++;
            }
            GameEngine gameEngine = GameEngine.getGameEngine();
            String str4 = "core units";
            if (bVar != null) {
                str4 = bVar.a();
            }
            gameEngine.h("Loading units - " + b + " (" + str4 + ")");
            l a2 = a(str, bufferedInputStream, b2.c(), bVar, b2, str2, str3);
            long loadAllUnitsTook2 = Unit.loadAllUnitsTook();
            try {
                bufferedInputStream.close();
                b2.close();
            } catch (IOException e2) {
                e2.printStackTrace();
            }
            a(loadAllUnitsTook2, ah.iniClose);
            return a2;
        } catch (RuntimeException e3) {
            a(str, e3, bVar);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v163, types: [byte[]] */
    public static void h() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList k2 = gameEngine.bZ.k();
        j = 0;
        i = 0;
        l = 0;
        k = false;
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        for (com.corrodinggames.rts.gameFramework.unitAction.e eVar : g.values()) {
            eVar.v = false;
            if (eVar.a != null) {
                for (com.corrodinggames.rts.gameFramework.unitAction.e eVar2 : eVar.a) {
                    eVar2.v = false;
                }
            }
            if (eVar.b != null) {
                for (com.corrodinggames.rts.gameFramework.unitAction.e eVar3 : eVar.b) {
                    eVar3.v = false;
                }
            }
            if (eVar.c != null) {
                for (com.corrodinggames.rts.gameFramework.unitAction.e eVar4 : eVar.c) {
                    eVar4.v = false;
                }
            }
        }
        for (com.corrodinggames.rts.gameFramework.a.i iVar : h.values()) {
            iVar.g = false;
        }
        byte[] bArr = null;
        byte[][] bArr2 = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = gameEngine.dZ;
            gameEngine.ea = bArr[1];
            bArr2 = new byte[]{new byte[3000000], new byte[3000000]};
            bArr2[0][0] = gameEngine.dZ;
            bArr2[1][0] = gameEngine.dZ;
            if (!GameEngine.at()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e2) {
            System.gc();
            GameEngine.m328e("Failed to reserve memory pre-mod load");
        }
        synchronized (l.c) {
            l.c.clear();
        }
        l.d.clear();
        l.e = null;
        l.f.clear();
        gameEngine.bZ.n();
        b = 0;
        c = 0;
        synchronized (n) {
            n.clear();
        }
        a(com.corrodinggames.rts.gameFramework.file.a.p("units"), 1, false, (com.corrodinggames.rts.gameFramework.mod.b) null, com.corrodinggames.rts.gameFramework.file.a.p("units"), (String) null);
        if (!GameEngine.aJ && !gameEngine.ar) {
            String m2 = m();
            if (!com.corrodinggames.rts.gameFramework.file.a.f(m2)) {
                GameEngine.m328e("Modded Custom '" + m2 + "' directory not found");
            }
            Iterator it = k2.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.gameFramework.mod.b bVar = (com.corrodinggames.rts.gameFramework.mod.b) it.next();
                if (!bVar.y && bVar.q != null) {
                    String j2 = bVar.j();
                    if (bVar.m) {
                        j2 = com.corrodinggames.rts.gameFramework.file.a.p(j2);
                    }
                    if (bVar.f) {
                        GameEngine.m328e("Disabled mod at:" + j2 + " (name:" + bVar.a() + ")");
                    } else {
                        GameEngine.m328e("Loading mod at:" + j2 + " (name:" + bVar.a() + ")");
                    }
                    a(j2, 2, true, bVar, j2, (String) null);
                }
            }
            Iterator it2 = k2.iterator();
            while (it2.hasNext()) {
                com.corrodinggames.rts.gameFramework.mod.b bVar2 = (com.corrodinggames.rts.gameFramework.mod.b) it2.next();
                if (bVar2.y && bVar2.q != null) {
                    String i2 = bVar2.i();
                    if (bVar2.f) {
                        GameEngine.m328e("Disabled workshop mod at:" + i2 + " (name:" + bVar2.a() + ")");
                    } else {
                        GameEngine.m328e("Loading workshop mod at:" + i2 + " (name:" + bVar2.a() + ")");
                    }
                    a(i2, 2, true, bVar2, i2, (String) null);
                }
            }
        }
        a();
        b(true);
        GameEngine.m328e("Done loading custom units. image cacheHits:" + j + " image cacheMisses:" + i + " (in: " + Unit.a(loadAllUnitsTook) + "ms)");
        GameEngine.m328e("========= Mods data loaded ===========");
        GameEngine.m328e("Number of mods:" + k2.size());
        Iterator it3 = k2.iterator();
        while (it3.hasNext()) {
            ((com.corrodinggames.rts.gameFramework.mod.b) it3.next()).t();
        }
        GameEngine.m328e("================================");
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
            bArr[1] = gameEngine.dZ;
            gameEngine.ea = bArr[1];
            System.gc();
            System.gc();
        }
    }

    public static void a(String str, int i2, boolean z, com.corrodinggames.rts.gameFramework.mod.b bVar, String str2, String str3) {
        boolean z2 = z && i2 == 1;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (bVar != null) {
            if (bVar.f && !gameEngine.settingsEngine.loadDisabledModData) {
                bVar.C = true;
                return;
            }
            bVar.C = false;
        }
        if (bVar != null && bVar.f) {
            GameEngine.m328e("Note: Loading disabled mod: " + str);
        }
        com.corrodinggames.rts.gameFramework.file.a.c();
        String[] h2 = com.corrodinggames.rts.gameFramework.file.a.h(str);
        if (h2 == null) {
            String c2 = com.corrodinggames.rts.gameFramework.file.a.c();
            GameEngine.print("readAllCustomUnitConfigs: ERROR");
            GameEngine.print("readAllCustomUnitConfigs: Failed to load:" + str);
            if (bVar != null) {
                if (!bVar.D) {
                    if (c2 == null) {
                        bVar.R = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        bVar.R = "Failed to list directory: " + c2;
                        return;
                    }
                }
                bVar.S = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (c2 != null) {
                    bVar.S += ": " + c2;
                    return;
                }
                return;
            }
            return;
        }
        if (bVar != null) {
            bVar.D = true;
        }
        if (!z2) {
            for (String str4 : h2) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : h2) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                com.corrodinggames.rts.gameFramework.mod.b bVar2 = bVar;
                if (z && i2 == 1 && bVar2 == null) {
                    bVar2 = gameEngine.bZ.e(str5);
                    if (bVar2 == null) {
                        GameEngine.print("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        bVar2 = gameEngine.bZ.c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (r != bVar2 && bVar2 != null) {
                        r = bVar2;
                        a();
                        GameEngine.m328e("Loading units from mod: " + bVar2.c);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        GameEngine.m328e("Skipping possible system file: " + str6);
                    } else {
                        long loadAllUnitsTook = Unit.loadAllUnitsTook();
                        a(str6, bVar2, str2, str3);
                        a(loadAllUnitsTook, ah.unitParse);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    GameEngine.m328e("Found map: " + str7);
                    if (bVar2 != null && bVar2.B) {
                        gameEngine.bZ.a(str7, bVar2);
                    } else {
                        GameEngine.m328e("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i2 < 10) {
                        if (com.corrodinggames.rts.gameFramework.file.a.f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j2 = -1;
                            if (z3) {
                                j2 = Unit.loadAllUnitsTook();
                                GameEngine.m328e("============");
                                GameEngine.m328e(">>> Mod '" + bVar2.c() + "'" + (bVar2.m() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            a(str8, i2 + 1, z, bVar2, str9, str3);
                            if (z3 && bVar2 != null && bVar2.m()) {
                                GameEngine.m328e("Mod '" + bVar2.c() + "' load took:" + Unit.a(Unit.a(j2)));
                            }
                        }
                    } else {
                        GameEngine.m328e("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    public static l a(String str, InputStream inputStream, long j2, com.corrodinggames.rts.gameFramework.mod.b bVar, com.corrodinggames.rts.gameFramework.utility.j jVar, String str2, String str3) {
        boolean z;
        as asVar;
        String substring;
        boolean z2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            if (a) {
                String str4 = "CORE";
                if (bVar != null) {
                    str4 = bVar.j();
                }
                GameEngine.m328e("Loading unit config: " + str + " [" + str4 + "]");
            }
            gameEngine.bO.e();
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            try {
                com.corrodinggames.rts.gameFramework.utility.ab abVar = new com.corrodinggames.rts.gameFramework.utility.ab(inputStream, str);
                a(loadAllUnitsTook, ah.iniParse);
                l lVar = new l();
                if (abVar.a("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                lVar.D = str;
                lVar.E = jVar.d();
                lVar.F = lVar.D;
                lVar.J = bVar;
                lVar.K = str2;
                lVar.L = str3;
                e = bVar;
                f = false;
                if (lVar.J != null) {
                }
                long loadAllUnitsTook2 = Unit.loadAllUnitsTook();
                a(lVar, abVar, abVar, str, 0);
                if (lVar.L != null) {
                    a(lVar, abVar, lVar.L + "/all-units.template", "AUTO units.template", true);
                }
                abVar.a("core", "copyFrom");
                lVar.R = abVar.b("core", "strictLevel", (Integer) 0).intValue();
                if (lVar.R < 0) {
                    throw new bo("[core]strictLevel cannot be < 0");
                }
                if (lVar.R > 1) {
                    throw new bo("[core]strictLevel cannot yet be > 1");
                }
                lVar.gs = abVar.a("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                abVar.a("core", "dont_load");
                abVar.b("core", "class", "CustomUnitMetadata");
                Iterator it = abVar.c("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    abVar.a((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = abVar.c("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str5 = (String) it2.next();
                    a(lVar, abVar, str5, str5, 0);
                }
                com.corrodinggames.rts.game.units.custom.f.a.a(lVar, abVar);
                String b2 = abVar.b("core", "overrideResourceLoadPath", (String) null);
                if (b2 != null) {
                    lVar.F = a(lVar, str, b2);
                }
                a(loadAllUnitsTook2, ah.iniSetup);
                lVar.M = abVar.e("core", "name");
                lVar.H = abVar.c();
                if (lVar.M.equals("self")) {
                    throw new bo("Unit name: " + lVar.M + " is reserved");
                }
                if (lVar.M.startsWith("self.")) {
                    throw new bo("Unit name cannot start with self.");
                }
                String b3 = abVar.b("core", "altNames", (String) null);
                if (b3 != null && !b3.equalsIgnoreCase("NONE")) {
                    for (String str6 : b3.split(",")) {
                        lVar.N.add(str6.trim());
                    }
                }
                lVar.O = g.a(abVar.b("core", "tags", (String) null));
                if (lVar.R >= 1 && lVar.O != null) {
                    for (g gVar : lVar.O.a) {
                        if (gVar.a.contains(" ")) {
                            throw new bo("(strictLevel 1) [core]tags: space in tag: '" + gVar.a + "'");
                        }
                    }
                }
                lVar.Q = abVar.b("core", "overrideAndReplace", (String) null);
                if (lVar.Q != null && lVar.Q.equalsIgnoreCase("NONE")) {
                    lVar.Q = null;
                }
                String b4 = abVar.b("core", "defineUnitMemory", (String) null);
                if (b4 != null) {
                    lVar.r.addDefineValue(lVar, "core", "defineUnitMemory", b4);
                    if (lVar.r.hasArrays()) {
                        lVar.a("1.15p11", 115011, "core", "Memory arrays (in defineUnitMemory)");
                    }
                }
                Iterator it3 = abVar.k("core", "@memory ").iterator();
                while (it3.hasNext()) {
                    String str7 = (String) it3.next();
                    String trim = str7.substring("@memory ".length()).trim();
                    String b5 = abVar.b("core", str7, (String) null);
                    if (b5 != null) {
                        if (!b5.contains(",")) {
                            lVar.r.addSingleDefine(lVar, trim, b5, "core", str7);
                            if (lVar.r.hasArrays()) {
                                lVar.a("1.15p11", 115011, "core", "Memory arrays (in " + str7 + ")");
                            }
                        } else {
                            throw new bo("[core]" + str7 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                lVar.T = (ad) abVar.a("core", "onNewMapSpawn", (Enum) null, ad.class);
                lVar.aG = abVar.a("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                lVar.o(lVar.E);
                if (lVar.M.equals("missing")) {
                    if (bVar == null) {
                        GameEngine.m328e("Setting missingPlaceHolder");
                        l.b = lVar;
                    } else {
                        GameEngine.m328e("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                lVar.aE = abVar.b("core", "displayLocaleKey", (String) null);
                lVar.aC = a(abVar, "core", "displayText", (String) null);
                lVar.aD = a(abVar, "core", "displayDescription", (String) null);
                lVar.eD = abVar.a("core", "isBio", (Boolean) false).booleanValue();
                lVar.eE = abVar.a("core", "isBug", (Boolean) false).booleanValue();
                lVar.eH = abVar.a("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                lVar.eI = abVar.a("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                lVar.cy = abVar.a("core", "stayNeutral", (Boolean) false).booleanValue();
                lVar.cz = abVar.a("core", "createNeutral", (Boolean) false).booleanValue();
                lVar.cA = abVar.a("core", "allowCaptureWhenNeutralByAI", (Boolean) false).booleanValue();
                if (abVar.a("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    lVar.cz = true;
                }
                lVar.cB = abVar.a("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                lVar.cC = abVar.a("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                lVar.cD = abVar.a("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (lVar.cD) {
                    lVar.cy = true;
                }
                lVar.cE = abVar.a("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                lVar.aF = abVar.a("core", "showInEditor", (Boolean) true).booleanValue();
                lVar.U = abVar.b("graphics", "total_frames", (Integer) 1).intValue();
                if (lVar.U < 1) {
                    throw new bo("TOTAL_FRAMES cannot be: " + lVar.U + " (must be 1 or more)");
                }
                lVar.W = abVar.b("graphics", "frame_width", (Integer) (-1)).intValue();
                lVar.X = abVar.b("graphics", "frame_height", (Integer) (-1)).intValue();
                lVar.Y = abVar.b("graphics", "default_frame", (Integer) 0).intValue();
                lVar.ah = abVar.b("graphics", "image_offsetX", (Integer) 0).intValue();
                lVar.ai = abVar.b("graphics", "image_offsetY", (Integer) 0).intValue();
                lVar.aj = abVar.a("graphics", "image_offsetH", Float.valueOf(0.0f)).floatValue();
                if (lVar.ah != 0 || lVar.ai != 0 || lVar.aj != 0.0f) {
                    lVar.ak = true;
                }
                lVar.ac = com.corrodinggames.rts.game.o.pureGreen;
                if (abVar.a("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    lVar.ac = com.corrodinggames.rts.game.o.hueAdd;
                }
                String b6 = abVar.b("graphics", "teamColoringMode", (String) null);
                if (b6 != null) {
                    if (abVar.a("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new bo("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (b6.equalsIgnoreCase("pureGreen")) {
                        lVar.ac = com.corrodinggames.rts.game.o.pureGreen;
                    } else if (b6.equalsIgnoreCase("hueAdd")) {
                        lVar.ac = com.corrodinggames.rts.game.o.hueAdd;
                    } else if (b6.equalsIgnoreCase("hueShift")) {
                        lVar.ac = com.corrodinggames.rts.game.o.hueShift;
                    } else if (b6.equalsIgnoreCase("disabled")) {
                        lVar.ac = com.corrodinggames.rts.game.o.disabled;
                    } else {
                        throw new bo("Unknown teamColoringMode:" + b6);
                    }
                }
                lVar.ab = abVar.a("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                lVar.aa = abVar.a("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                lVar.Z = abVar.a(lVar, "graphics", "isVisible", (LogicBoolean) null);
                if (lVar.Z == LogicBoolean.trueBoolean) {
                    lVar.Z = null;
                }
                lVar.cL.m = abVar.a("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                lVar.ad = lVar.a(lVar.F, abVar.e("graphics", "image"), lVar.ab, "graphics", "image");
                if (lVar.ad == null) {
                    throw new bo("Main unit image must be set on custom unit");
                }
                lVar.ae = abVar.a("graphics", "image_floatingPointSize", (Boolean) false).booleanValue();
                lVar.af = lVar.ad.m() / lVar.U;
                lVar.ag = lVar.ad.l();
                if (lVar.af < 1) {
                    lVar.af = 1;
                }
                if (lVar.W > 0) {
                    lVar.af = lVar.W;
                }
                if (lVar.X > 0) {
                    lVar.ag = lVar.X;
                    if (lVar.ag < lVar.ad.l()) {
                        lVar.V = lVar.ad.m() / lVar.af;
                        if (lVar.V < 1) {
                            lVar.V = 1;
                        }
                    }
                }
                lVar.al = lVar.a(abVar, "graphics", "image_back");
                lVar.am = abVar.a("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                lVar.an = lVar.a(abVar, "graphics", "image_wreak");
                lVar.ao = lVar.a(abVar, "graphics", "image_turret");
                lVar.as = com.corrodinggames.rts.game.units.e.j.dN;
                String b7 = abVar.b("graphics", "image_shadow", "NONE");
                if (b7.equalsIgnoreCase("AUTO")) {
                    String str8 = "[autoShadow:" + lVar.af + "," + lVar.ag + "]" + lVar.ad.d + "-" + lVar.ad.e;
                    com.corrodinggames.rts.gameFramework.unitAction.e c2 = c(str8);
                    if (c2 != null) {
                        lVar.ap = c2;
                    } else {
                        lVar.ap = com.corrodinggames.rts.game.units.am.a(lVar.ad, lVar.af, lVar.ag);
                        a(lVar.ap);
                        if (lVar.ap != null) {
                            a(str8, lVar.ap);
                        }
                    }
                } else if (b7.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str9 = "[autoShadowAnimated:" + lVar.af + "," + lVar.ag + "]" + lVar.ad.d + "-" + lVar.ad.e;
                    com.corrodinggames.rts.gameFramework.unitAction.e c3 = c(str9);
                    if (c3 != null) {
                        lVar.ap = c3;
                    } else {
                        lVar.ap = com.corrodinggames.rts.game.units.am.a(lVar.ad, lVar.ad.m(), lVar.ad.l());
                        a(lVar.ap);
                        if (lVar.ap != null) {
                            a(str9, lVar.ap);
                        }
                    }
                    lVar.aq = true;
                } else {
                    lVar.ap = lVar.a(lVar.F, b7, lVar.ab, "graphics", "image_shadow");
                }
                if (abVar.a("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    lVar.aq = true;
                }
                lVar.ar = lVar.a(lVar.ad, lVar.ac);
                lVar.s = abVar.a("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (lVar.s && lVar.ao != null) {
                    lVar.at = lVar.a(lVar.ao, lVar.ac);
                }
                float floatValue = abVar.a("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    lVar.bH = (floatValue * lVar.aG) / lVar.af;
                }
                float floatValue2 = abVar.a("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    lVar.bH *= floatValue2;
                }
                float floatValue3 = abVar.a("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f2 = floatValue3 * lVar.aG;
                    if (lVar.ao == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    lVar.bI = f2 / lVar.ao.p;
                }
                float floatValue4 = abVar.a("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    lVar.bI *= floatValue4;
                }
                lVar.au = com.corrodinggames.rts.game.units.e.c.e;
                com.corrodinggames.rts.gameFramework.unitAction.e a2 = lVar.a(abVar, "graphics", "image_shield");
                if (a2 != null) {
                    lVar.au = a2;
                    lVar.av = true;
                }
                lVar.aw = lVar.a(abVar, "graphics", "icon_build", false);
                float m2 = lVar.ad.m() * lVar.bH;
                float l2 = lVar.ad.l() * lVar.bH;
                if (m2 / 2.0f > 90.0f || l2 / 2.0f > 90.0f) {
                    lVar.C = new Rect();
                    lVar.C.a = (int) ((-m2) / 2.0f);
                    lVar.C.c = (int) (m2 / 2.0f);
                    lVar.C.b = (int) ((-l2) / 2.0f);
                    lVar.C.d = (int) (l2 / 2.0f);
                    lVar.B = true;
                }
                Iterator it4 = abVar.m("resource_", "global_resource_").iterator();
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
                    com.corrodinggames.rts.game.units.custom.e.d dVar = new com.corrodinggames.rts.game.units.custom.e.d(z2);
                    dVar.a(lVar, abVar, str10, trim2);
                    if (lVar.k(dVar.a) != null) {
                        throw new RuntimeException("[" + str10 + "] resource with name:" + dVar.a + " already exists in this file");
                    }
                    lVar.j.add(dVar);
                }
                Iterator it5 = lVar.j.iterator();
                while (it5.hasNext()) {
                    ((com.corrodinggames.rts.game.units.custom.e.d) it5.next()).a(lVar);
                }
                if (gameEngine.p()) {
                    com.corrodinggames.rts.game.units.custom.b.l.a(lVar, abVar);
                    com.corrodinggames.rts.game.units.custom.b.j.a(lVar, abVar);
                }
                com.corrodinggames.rts.game.units.custom.b.m.a(lVar, abVar);
                lVar.ca = abVar.b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (lVar.ca < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (lVar.ca > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!abVar.a("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && lVar.ca < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                lVar.cb = (s) abVar.a("core", "autoTriggerCheckRate", s.everyFrame, s.class);
                lVar.cd = abVar.a("core", "autoTriggerCheckWhileNotBuilt", (Boolean) false).booleanValue();
                lVar.cL.b = abVar.g("core", "mass");
                lVar.ce = abVar.a("core", "availableInDemo", (Boolean) true).booleanValue();
                lVar.cf = abVar.a("core", "isLocked", (Boolean) false).booleanValue();
                lVar.cg = abVar.a("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                lVar.ch = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, "core", "price", false);
                lVar.ci = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, "core", "reclaimPrice", (com.corrodinggames.rts.game.units.custom.d.b) null);
                lVar.cj = com.corrodinggames.rts.game.units.custom.d.b.b(lVar, abVar, "core", "streamingCost", null);
                boolean booleanValue = abVar.a("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (lVar.cj != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    lVar.cj = com.corrodinggames.rts.game.units.custom.d.b.b(lVar, abVar, "core", "price", null);
                    lVar.ch = com.corrodinggames.rts.game.units.custom.d.b.a;
                }
                lVar.ck = abVar.d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                lVar.cl = abVar.b("core", "techLevel", (Integer) 1).intValue();
                if (lVar.cl > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (lVar.cl < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + lVar.cl);
                }
                lVar.cm = abVar.a("core", "experimental", (Boolean) false).booleanValue();
                lVar.cv = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, "core", "borrowResourcesWhileAlive", true);
                lVar.cw = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, "core", "borrowResourcesWhileBuilt", true);
                lVar.co = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, "core", "generation_resources", true);
                int intValue = abVar.b("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    lVar.co = com.corrodinggames.rts.game.units.custom.d.b.a(lVar.co, com.corrodinggames.rts.game.units.custom.d.b.a(intValue));
                }
                lVar.cr = abVar.b("core", "generation_delay", (Integer) 40).intValue();
                if (lVar.cr == 0) {
                    lVar.cr = 1;
                }
                if (lVar.cr < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                lVar.cs = 40.0f / lVar.cr;
                if (!lVar.co.c()) {
                    lVar.cp = new com.corrodinggames.rts.game.units.custom.e.f();
                    lVar.cp.a(lVar.co);
                    lVar.cp.a(lVar.cs);
                    lVar.cn = true;
                }
                if (!lVar.cp.c()) {
                    Iterator it6 = lVar.cp.b.iterator();
                    while (it6.hasNext()) {
                        com.corrodinggames.rts.game.units.custom.e.e eVar = (com.corrodinggames.rts.game.units.custom.e.e) it6.next();
                        if (!eVar.a.c() && eVar.a.d()) {
                            if (lVar.cq == com.corrodinggames.rts.game.units.custom.e.f.a) {
                                lVar.cq = new com.corrodinggames.rts.game.units.custom.e.f();
                            }
                            lVar.cq.b(eVar.a, eVar.b);
                        }
                    }
                }
                lVar.cx = abVar.a(lVar, "core", "generation_active", LogicBoolean.trueBoolean);
                lVar.a(lVar.co);
                lVar.cF = abVar.a("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && lVar.cF != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                String b8 = abVar.b("core", "updateUnitMemory", (String) null);
                if (b8 != null) {
                    lVar.ct = VariableScope.createMemoryWriter(b8, lVar, "core", "updateUnitMemory");
                }
                lVar.cu = abVar.b("core", "updateUnitMemoryRate", Float.valueOf(60.0f)).floatValue();
                lVar.cG = abVar.b("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                lVar.cH = abVar.a(lVar, "core", "similarResourcesHaveTag", (h) null);
                lVar.f1do = bl.a(lVar, abVar.b("core", "soundOnAttackOrder", (String) null));
                lVar.dp = bl.a(lVar, abVar.b("core", "soundOnMoveOrder", (String) null));
                lVar.dq = bl.a(lVar, abVar.b("core", "soundOnNewSelection", (String) null));
                String b9 = abVar.b("graphics", "drawLayer", (String) null);
                if (b9 != null) {
                    if (b9.equals("experimentals")) {
                        lVar.cI = 4;
                    } else if (b9.equals("underwater")) {
                        lVar.cI = 1;
                    } else if (b9.equals("bottom")) {
                        lVar.cI = 1;
                    } else if (b9.equals("ground")) {
                        lVar.cI = 2;
                    } else if (b9.equals("ground2")) {
                        lVar.cI = 3;
                    } else if (b9.equals("air")) {
                        lVar.cI = 5;
                    } else if (b9.equals("top")) {
                        lVar.cI = 10;
                    } else if (b9.equals("wreaks")) {
                        lVar.cI = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + b9);
                    }
                }
                lVar.cJ = abVar.a("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                lVar.cK = abVar.a("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                lVar.dB = abVar.a("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                lVar.dC = abVar.a("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                lVar.dD = abVar.a("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(lVar.dC)).booleanValue();
                lVar.dE = abVar.a("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                lVar.dH = abVar.a("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                lVar.dI = m.a(lVar, abVar, "graphics", "animation_", false);
                Iterator it7 = abVar.e("effect_").iterator();
                while (it7.hasNext()) {
                    String str11 = (String) it7.next();
                    ay ayVar = new ay(str11.substring("effect_".length()));
                    ayVar.a(lVar, abVar, str11);
                    lVar.gd.add(ayVar);
                }
                Iterator it8 = lVar.gd.iterator();
                while (it8.hasNext()) {
                    ay ayVar2 = (ay) it8.next();
                    if (ayVar2.alsoEmitEffects != null) {
                        ayVar2.alsoEmitEffects.c();
                    }
                    if (ayVar2.alsoEmitEffectsOnDeath != null) {
                        ayVar2.alsoEmitEffectsOnDeath.c();
                    }
                    if (ayVar2.ifSpawnFailsEmitEffects != null) {
                        ayVar2.ifSpawnFailsEmitEffects.c();
                    }
                    if (ayVar2.trailEffect != null) {
                        ayVar2.trailEffect.c();
                    }
                }
                lVar.bJ = abVar.a("graphics", "splastEffect", (Boolean) false).booleanValue();
                lVar.bM = abVar.a("graphics", "dustEffect", (Boolean) false).booleanValue();
                lVar.bK = abVar.a("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                lVar.bN = abVar.a("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                lVar.bL = lVar.bM || lVar.bJ;
                String b10 = abVar.b("graphics", "movementEffect", (String) null);
                if (b10 != null) {
                    lVar.bO = lVar.a(b10, (z) null);
                    if (lVar.bO != null && lVar.bO.a()) {
                        lVar.bL = true;
                    }
                }
                String b11 = abVar.b("graphics", "movementEffectReverse", (String) null);
                if (b11 != null) {
                    lVar.bP = lVar.a(b11, (z) null);
                    if (lVar.bP != null && lVar.bP.a()) {
                        lVar.bL = true;
                    }
                }
                lVar.bR = abVar.a("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                lVar.bQ = abVar.a("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                lVar.bT = abVar.a("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String b12 = abVar.b("graphics", "repairEffect", (String) null);
                if (b12 != null) {
                    lVar.bU = lVar.a(b12, (z) null);
                    if (lVar.bU != null && lVar.bU.b()) {
                        lVar.bS = true;
                    }
                }
                String b13 = abVar.b("graphics", "repairEffectAtTarget", (String) null);
                if (b13 != null) {
                    lVar.bV = lVar.a(b13, (z) null);
                    if (lVar.bV != null && lVar.bV.b()) {
                        lVar.bS = true;
                    }
                }
                lVar.bX = abVar.a("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String b14 = abVar.b("graphics", "reclaimEffect", (String) null);
                if (b14 != null) {
                    lVar.bY = lVar.a(b14, (z) null);
                    if (lVar.bY != null && lVar.bY.b()) {
                        lVar.bW = true;
                    }
                }
                String b15 = abVar.b("graphics", "reclaimEffectAtTarget", (String) null);
                if (b15 != null) {
                    lVar.bZ = lVar.a(b15, (z) null);
                    if (lVar.bZ != null && lVar.bZ.b()) {
                        lVar.bW = true;
                    }
                }
                lVar.ds.a(lVar, abVar, "graphics", "animation_" + lVar.ds.a + "_");
                lVar.dt.a(lVar, abVar, "graphics", "animation_" + lVar.dt.a + "_");
                lVar.du.a(lVar, abVar, "graphics", "animation_" + lVar.du.a + "_");
                Iterator it9 = abVar.e("animation_").iterator();
                while (it9.hasNext()) {
                    String str12 = (String) it9.next();
                    f fVar = new f(str12.substring("animation_".length()));
                    fVar.a(lVar, abVar, str12, VariableScope.nullOrMissingString);
                    lVar.dr.add(fVar);
                }
                lVar.ds = lVar.a(n.move, lVar.ds, true);
                lVar.dt = lVar.a(n.idle, lVar.dt, true);
                lVar.du = lVar.a(n.attack, lVar.du, true);
                lVar.dw = lVar.a(n.underConstruction);
                lVar.dx = lVar.a(n.underConstructionWithLinkedBuiltTime);
                if (lVar.dw != null && lVar.dx != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                lVar.dv = lVar.a(n.created);
                lVar.dy = lVar.a(n.queuedUnits);
                if (lVar.dy != null) {
                    lVar.bg = true;
                }
                lVar.dz = lVar.a(n.repair);
                lVar.dA = lVar.a(n.reclaim);
                lVar.cL.c = abVar.g("core", "maxHp");
                lVar.cL.g = abVar.b("core", "maxShield", (Integer) 0).intValue();
                lVar.cM = abVar.a("core", "startShieldAtZero", (Boolean) false).booleanValue();
                lVar.cL.h = abVar.a("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                lVar.cU = abVar.a("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                lVar.cV = abVar.a("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                lVar.cL.l = abVar.a("core", "armour", Float.valueOf(0.0f)).floatValue();
                lVar.cN = abVar.a("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                lVar.cL.d = abVar.a("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                lVar.cO = abVar.a("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                lVar.cP = abVar.a("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                lVar.cS = abVar.a("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                lVar.cR = abVar.a("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                lVar.cQ = abVar.a("core", "energyRegenWhenRecharging", Float.valueOf(lVar.cP)).floatValue();
                lVar.cT = a(abVar, "core", "energyDisplayName", (String) null);
                lVar.cW = abVar.g("core", "radius");
                lVar.dd = abVar.b("core", "displayRadius", Integer.valueOf(lVar.cW)).intValue();
                float f3 = lVar.cW;
                if (f3 < 6.0f) {
                    f3 = 6.0f;
                }
                lVar.de = abVar.a("core", "uiTargetRadius", Float.valueOf(f3)).floatValue();
                lVar.df = abVar.b("core", "shieldRenderRadius", Integer.valueOf(lVar.cW)).intValue();
                lVar.dg = abVar.b("core", "buildingSelectionOffset", (Integer) 0).intValue();
                lVar.cX = abVar.a("core", "footprint", lVar.cX);
                lVar.cY = abVar.a("core", "constructionFootprint", lVar.cY);
                lVar.cZ.a(lVar.cX);
                lVar.cZ = abVar.a("core", "displayFootprint", lVar.cZ);
                lVar.da = abVar.a("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                lVar.db = abVar.a("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                lVar.cW = (int) (lVar.cW * lVar.aG);
                lVar.dd = (int) (lVar.dd * lVar.aG);
                lVar.cL.n = abVar.b("core", "fogOfWarSightRange", (Integer) 15).intValue();
                lVar.dh = abVar.b("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                lVar.di = abVar.a("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                lVar.dj = abVar.a("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                lVar.dk = abVar.a("core", "exit_dirOffset", (Float) null);
                lVar.dl = abVar.a("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                lVar.dm = abVar.a("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                lVar.dn = abVar.a("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                lVar.eB = abVar.b("core", "softCollisionOnAll", (Integer) 0).intValue();
                lVar.eC = abVar.a("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (lVar.eC) {
                    lVar.cX.a(0, 0, -1, -1);
                }
                lVar.eJ = abVar.a("core", "hideScorchMark", (Boolean) false).booleanValue();
                lVar.eK = abVar.a("graphics", "disableLowHpFire", Boolean.valueOf(lVar.eD)).booleanValue();
                lVar.eL = abVar.a("graphics", "disableLowHpSmoke", Boolean.valueOf(lVar.eD)).booleanValue();
                lVar.aH = abVar.a("core", "isBuilding", (Boolean) false).booleanValue();
                lVar.aI = abVar.a("core", "ignoreInUnitCapCalculation", Boolean.valueOf(lVar.aH)).booleanValue();
                lVar.aJ = abVar.a("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                lVar.aK = abVar.a("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                lVar.aL = abVar.a("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                lVar.aM = abVar.a("core", "isUnselectable", (Boolean) false).booleanValue();
                lVar.aN = abVar.a("core", "isUnselectableAsTarget", Boolean.valueOf(lVar.aM)).booleanValue();
                lVar.fO = abVar.a(lVar, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (h) null);
                lVar.aO = abVar.a("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                lVar.aP = abVar.a("core", "canNotBeDamaged", Boolean.valueOf(lVar.aO)).booleanValue();
                lVar.aQ = abVar.a("core", "showOnMinimap", (Boolean) true).booleanValue();
                lVar.aR = abVar.a("core", "showOnMinimapToEnemies", Boolean.valueOf(lVar.cL.m)).booleanValue();
                lVar.aS = abVar.a(lVar, "core", "canOnlyBeAttackedByUnitsWithTags", (h) null);
                if (lVar.aO && lVar.aS != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                lVar.aT = abVar.a("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                lVar.aU = abVar.a("core", "canRepairBuildings", (Boolean) false).booleanValue();
                lVar.aV = abVar.a("core", "canRepairUnits", (Boolean) false).booleanValue();
                lVar.aW = abVar.a("core", "autoRepair", (Boolean) false).booleanValue();
                if (lVar.aW) {
                    lVar.a(com.corrodinggames.rts.game.units.custom.b.b.a);
                }
                lVar.cL.o = abVar.b("core", "nanoRange", (Integer) (-1)).intValue();
                if (lVar.cL.o != -1) {
                    lVar.cL.o = (int) (asVar.o * lVar.aG);
                }
                lVar.aY = abVar.a("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (lVar.aY) {
                    lVar.aX = 5;
                }
                int intValue2 = abVar.b("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    lVar.aX = intValue2;
                    lVar.aX = (int) (lVar.aX * lVar.aG);
                }
                lVar.ba = abVar.a("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (lVar.ba) {
                    lVar.aZ = 5;
                }
                int intValue3 = abVar.b("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    lVar.aZ = intValue3;
                    lVar.aZ = (int) (lVar.aZ * lVar.aG);
                }
                lVar.bb = abVar.a("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                lVar.bc = abVar.a("core", "nanoReclaimSpeed", Float.valueOf(lVar.bb * 5.1f)).floatValue();
                lVar.bd = abVar.a("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                lVar.be = abVar.a("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                lVar.bf = abVar.a("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                lVar.cL.r = abVar.a("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                lVar.cL.p = abVar.a("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                lVar.bh = abVar.d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                lVar.bi = abVar.a("core", "dieOnConstruct", (Boolean) false).booleanValue();
                lVar.bk = abVar.a("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i2 = 4;
                if (lVar.cL.b > 30000.0f) {
                    i2 = 8;
                }
                if (lVar.aH) {
                    i2 = 7;
                }
                lVar.bq = abVar.b("core", "numBitsOnDeath", Integer.valueOf(i2)).intValue();
                lVar.bn = abVar.a("core", "nukeOnDeath", (Boolean) false).booleanValue();
                lVar.bo = abVar.a("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                lVar.bp = abVar.a("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                lVar.br = abVar.a("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                lVar.bm = abVar.b("core", "fireOnDeath", (Integer) 0).intValue();
                lVar.bt = (com.corrodinggames.rts.game.units.ab) abVar.a("core", "explodeTypeOnDeath", (Enum) null, com.corrodinggames.rts.game.units.ab.class);
                lVar.bu = abVar.a("core", "explodeOnDeath", (Boolean) true).booleanValue();
                lVar.bs = abVar.a("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                lVar.bv = abVar.a("core", "explodeOnDeathGroundCollision", Boolean.valueOf(abVar.a("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                lVar.by = lVar.a(abVar.b("core", "effectOnDeath", (String) null), (z) null);
                lVar.bx = lVar.a(abVar.b("core", "effectOnDeathIfUnbuilt", (String) null), (z) null);
                lVar.bz = bl.a(lVar, abVar.b("core", "soundOnDeath", (String) null));
                lVar.bw = lVar.a(abVar.b("core", "effectOnDeathGroundCollision", abVar.b("core", "effectOnDeathGroundCollosion", (String) null)), (z) null);
                lVar.bC = bp.a(lVar, abVar, "core", "unitsSpawnedOnDeath");
                lVar.bD = abVar.a("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                lVar.fk = abVar.a("core", "canReclaimResources", (Boolean) false).booleanValue();
                lVar.fl = abVar.a(lVar, "core", "canReclaimResourcesOnlyWithTags", (h) null);
                lVar.fm = abVar.b("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                lVar.fn = abVar.a(lVar, "core", "canReclaimUnitsOnlyWithTags", (h) null);
                lVar.fo = abVar.a(lVar, "core", "canRepairUnitsOnlyWithTags", (h) null);
                if (lVar.fn != null && !lVar.aV && !lVar.aU) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (lVar.fo != null && !lVar.aV && !lVar.aU) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                lVar.eM = abVar.b("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (lVar.eM < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                lVar.eN = abVar.b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                lVar.eP = g.a(abVar.b("core", "transportUnitsRequireTag", (String) null));
                String b16 = abVar.b("core", "transportUnitsRequireMovementType", (String) null);
                if (b16 != null) {
                    for (String str13 : b16.split(",")) {
                        lVar.eQ.add(com.corrodinggames.rts.game.units.ao.a(str13.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                lVar.eO = abVar.a("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                lVar.eR = abVar.a("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(lVar.eQ.size() == 0)).booleanValue();
                lVar.eS = abVar.a("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                lVar.eU = abVar.a(lVar, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                lVar.eV = abVar.a(lVar, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                lVar.eW = abVar.a(lVar, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                lVar.eY = abVar.a("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                lVar.fc = abVar.a(lVar, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (lVar.fc != null) {
                    lVar.fd = lVar.fc;
                } else {
                    lVar.fc = l.fa;
                    lVar.fd = l.fb;
                }
                lVar.eT = abVar.a("core", "transportUnitsAddUnloadOption", Boolean.valueOf(lVar.fc != LogicBoolean.falseBoolean)).booleanValue();
                lVar.eX = abVar.a("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(lVar.eX)).booleanValue();
                lVar.eZ = abVar.b("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i3 = -1; i3 <= 29; i3++) {
                    String str14 = "builtFrom_" + i3 + "_";
                    if (i3 == -1) {
                        str14 = "builtFrom_";
                    }
                    String str15 = str14 + "name";
                    String b17 = abVar.b("core", str15, (String) null);
                    if (b17 != null) {
                        for (String str16 : b17.split(",")) {
                            String trim3 = str16.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                p pVar = new p();
                                pVar.a = trim3;
                                pVar.b = abVar.a("core", str14 + "pos", Float.valueOf(999.0f)).floatValue();
                                pVar.c = abVar.a("core", str14 + "forceNano", (Boolean) false).booleanValue();
                                pVar.d = "[core]" + str15;
                                pVar.f = abVar.a(lVar, "core", str14 + "isLocked", (LogicBoolean) null);
                                pVar.g = a(abVar, "core", str14 + "isLockedMessage", (String) null);
                                if (pVar.f == LogicBoolean.falseBoolean) {
                                    pVar.f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    lVar.gg.add(pVar);
                                }
                            }
                        }
                    }
                }
                for (int i4 = 0; i4 <= 50; i4++) {
                    if (abVar.b("core", "canBuild_" + i4 + "_name", (String) null) != null) {
                        b(lVar, abVar, "core", "canBuild_" + i4 + "_", false);
                    }
                }
                Iterator it10 = abVar.e("canBuild_").iterator();
                while (it10.hasNext()) {
                    b(lVar, abVar, (String) it10.next(), VariableScope.nullOrMissingString, true);
                }
                lVar.ff = be.a(lVar, abVar);
                lVar.fg = com.corrodinggames.rts.game.units.ao.a(abVar.e("movement", "movementType"), "movementType");
                if (!lVar.aH) {
                    lVar.fh = lVar.fg;
                } else {
                    lVar.fh = com.corrodinggames.rts.game.units.ao.NONE;
                }
                Boolean a3 = abVar.a("ai", "useAsBuilder", (Boolean) null);
                lVar.fs = abVar.a("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean a4 = abVar.a("core", "isBuilder", (Boolean) null);
                if (a4 == null) {
                    a4 = a3 == null ? false : a3;
                } else if (a3 == null) {
                    a3 = a4;
                }
                if (a3 == null) {
                    a3 = false;
                }
                lVar.fp = a4.booleanValue();
                lVar.fq = a3.booleanValue();
                if (!lVar.fp && lVar.fq) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + lVar.fq + " [core]isBuilder:" + lVar.fp);
                }
                if (lVar.fk) {
                    lVar.fr = true;
                }
                Boolean a5 = abVar.a("ai", "useAsHarvester", (Boolean) null);
                if (a5 != null) {
                    lVar.fr = a5.booleanValue();
                }
                Boolean a6 = abVar.a("ai", "useAsTransport", (Boolean) null);
                if (a6 == null) {
                    a6 = Boolean.valueOf((lVar.eM <= 0 || lVar.fq || lVar.aH) ? false : true);
                    if (!lVar.eT) {
                        a6 = false;
                    }
                }
                lVar.ft = a6.booleanValue();
                if (lVar.aH) {
                    lVar.as = com.corrodinggames.rts.game.units.d.d.q;
                } else if (lVar.fg == com.corrodinggames.rts.game.units.ao.AIR) {
                    lVar.as = com.corrodinggames.rts.game.units.b.b.n;
                } else if (lVar.fg == com.corrodinggames.rts.game.units.ao.WATER) {
                    lVar.as = com.corrodinggames.rts.game.units.h.f.q;
                } else if (lVar.fg == com.corrodinggames.rts.game.units.ao.HOVER) {
                    if (lVar.cm) {
                        lVar.as = com.corrodinggames.rts.game.units.e.j.dO;
                    } else if (lVar.l()) {
                        lVar.as = com.corrodinggames.rts.game.units.e.b.h;
                    } else {
                        lVar.as = com.corrodinggames.rts.game.units.e.h.n;
                    }
                } else if (lVar.cm) {
                    lVar.as = com.corrodinggames.rts.game.units.e.j.dO;
                } else if (lVar.l()) {
                    lVar.as = com.corrodinggames.rts.game.units.e.b.h;
                } else {
                    lVar.as = com.corrodinggames.rts.game.units.e.j.dN;
                }
                com.corrodinggames.rts.gameFramework.unitAction.e a7 = lVar.a(abVar, "graphics", "icon_zoomed_out", false);
                if (a7 != null) {
                    lVar.as = lVar.a(a7, lVar.ac);
                }
                if (abVar.a("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    lVar.as = null;
                }
                lVar.t = abVar.a("graphics", "showHealthBar", (Boolean) true).booleanValue();
                lVar.u = abVar.a("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                lVar.v = abVar.a("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                lVar.w = abVar.a("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                lVar.x = abVar.a("graphics", "showTransportBar", (Boolean) true).booleanValue();
                lVar.y = abVar.a("graphics", "showShieldBar", (Boolean) true).booleanValue();
                lVar.z = abVar.a("graphics", "showQueueBar", (Boolean) true).booleanValue();
                lVar.A = abVar.a("graphics", "showSelectionIndicator", (Boolean) true).booleanValue();
                lVar.fi = abVar.a("movement", "slowDeathFall", (Boolean) false).booleanValue();
                lVar.fj = abVar.a("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                lVar.cL.j = abVar.a("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * lVar.aG;
                lVar.dN = abVar.a("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * lVar.aG;
                lVar.dO = abVar.a("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * lVar.aG;
                Boolean a8 = abVar.a("movement", "ignoreMoveOrders", (Boolean) null);
                if (lVar.aH) {
                    lVar.dP = true;
                }
                if (a8 != null) {
                    if (a8.booleanValue()) {
                        lVar.dP = true;
                        if (lVar.cL.j > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (lVar.aH) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                lVar.ej = abVar.a("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (lVar.ej <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                lVar.ek = 1.0f / lVar.ej;
                lVar.el = abVar.a("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String b18 = abVar.b("movement", "landOnGround", "false");
                if (b18.equalsIgnoreCase("false")) {
                    lVar.dQ = false;
                } else if (b18.equalsIgnoreCase("onlyIdle")) {
                    lVar.dQ = true;
                    lVar.dR = true;
                } else if (b18.equalsIgnoreCase("true")) {
                    lVar.dQ = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + b18);
                }
                float f4 = 0.0f;
                float f5 = 0.0f;
                if (lVar.fg == com.corrodinggames.rts.game.units.ao.AIR) {
                    f4 = 35.0f;
                    f5 = 1.5f;
                }
                lVar.dS = abVar.a("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                lVar.cL.q = abVar.a("movement", "targetHeight", Float.valueOf(f4)).floatValue();
                lVar.dT = abVar.a("movement", "targetHeightDrift", Float.valueOf(f5)).floatValue();
                if (lVar.cL.q > 80.0f) {
                    lVar.B = true;
                }
                lVar.dU = abVar.a("movement", "heightChangeRate", Float.valueOf(lVar.dU)).floatValue();
                lVar.dV = abVar.a("movement", "fallingAcceleration", Float.valueOf(lVar.dV)).floatValue();
                lVar.dW = abVar.a("movement", "fallingAccelerationDead", Float.valueOf(lVar.dW)).floatValue();
                lVar.cL.k = abVar.a("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                lVar.eo = abVar.a("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                lVar.dX = abVar.a("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                lVar.dY = abVar.a("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                lVar.dZ = abVar.b("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                lVar.ei = abVar.a("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                lVar.ea = abVar.a("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * lVar.aG;
                lVar.eb = abVar.a("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                lVar.dL = abVar.a("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String b19 = abVar.b("attack", "attackMovement", "normal");
                lVar.ec = com.corrodinggames.rts.game.units.b.normal;
                if (b19.equalsIgnoreCase("normal")) {
                    lVar.ec = com.corrodinggames.rts.game.units.b.normal;
                }
                if (b19.equalsIgnoreCase("strafing")) {
                    lVar.ec = com.corrodinggames.rts.game.units.b.strafing;
                }
                if (b19.equalsIgnoreCase("bomber")) {
                    lVar.ec = com.corrodinggames.rts.game.units.b.bomber;
                }
                lVar.ef = abVar.a("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                lVar.eg = abVar.a("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                lVar.eh = abVar.a("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                lVar.ed = abVar.a("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                lVar.ee = abVar.a("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float a9 = abVar.a("attack", "maxAttackRange", (Float) null);
                if (a9 != null) {
                    z = true;
                    lVar.cL.i = a9.floatValue() * lVar.aG;
                } else {
                    z = false;
                    lVar.cL.i = 100.0f * lVar.aG;
                }
                lVar.ez = abVar.a("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                lVar.dM = abVar.b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                lVar.cL.e = abVar.a("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                lVar.cL.f = abVar.a("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                lVar.dK = abVar.a("attack", "showRangeUIGuide", (Boolean) null);
                lVar.eF = abVar.a("attack", "isMelee", (Boolean) false).booleanValue();
                lVar.eG = 0.0f;
                Float a10 = abVar.a("attack", "meleeEngangementDistance", (Float) null);
                if (lVar.eF) {
                    lVar.eG = 250.0f;
                    if (a10 != null) {
                        lVar.eG = a10.floatValue();
                    }
                } else if (a10 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                a(loadAllUnitsTook, ah.unitParsePartA);
                Iterator it11 = abVar.e("projectile_").iterator();
                while (it11.hasNext()) {
                    String str17 = (String) it11.next();
                    String substring2 = str17.substring("projectile_".length());
                    if (lVar.f(substring2) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring2);
                    }
                    bh bhVar = new bh();
                    bhVar.bh = substring2;
                    bhVar.bj = lVar;
                    bh.a(bhVar, lVar, abVar, str17);
                }
                int size = lVar.fT.size();
                if (size < 1) {
                    size = 1;
                }
                lVar.fR = new bh[size];
                for (int i5 = 0; i5 < lVar.fT.size(); i5++) {
                    bh bhVar2 = (bh) lVar.fT.get(i5);
                    bhVar2.bi = i5;
                    lVar.fR[i5] = bhVar2;
                }
                for (int i6 = 0; i6 < lVar.fR.length; i6++) {
                    bh bhVar3 = lVar.fR[i6];
                    if (bhVar3 != null) {
                        bhVar3.w *= lVar.aG;
                        bhVar3.au *= lVar.aG;
                        bhVar3.aF *= lVar.aG;
                    }
                }
                if (lVar.fR[0] == null) {
                    bh bhVar4 = new bh();
                    bhVar4.bi = 0;
                    bhVar4.bh = "1";
                    bhVar4.b = 10;
                    lVar.fT.add(bhVar4);
                    lVar.fR[0] = bhVar4;
                }
                ArrayList arrayList = lVar.fS;
                Iterator it12 = abVar.e("turret_").iterator();
                while (it12.hasNext()) {
                    String str18 = (String) it12.next();
                    String substring3 = str18.substring("turret_".length());
                    if (lVar.e(substring3) != null) {
                        throw new RuntimeException("Two turrets found with the same name:" + substring3);
                    }
                    bn bnVar = new bn();
                    bnVar.a = substring3;
                    bnVar.b = str18;
                    arrayList.add(bnVar);
                }
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    bn bnVar2 = (bn) it13.next();
                    bn.a(bnVar2, lVar, abVar, bnVar2.b);
                }
                if (arrayList.size() == 0) {
                    bn bnVar3 = new bn();
                    bnVar3.f = 0.0f;
                    bnVar3.g = 0.0f;
                    bnVar3.a = "1";
                    bnVar3.m = lVar.dM;
                    arrayList.add(bnVar3);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.get(size2) != null) {
                        ((bn) arrayList.get(size2)).e = size2;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    if (arrayList.get(size3) != null) {
                        bn bnVar4 = (bn) arrayList.get(size3);
                        if (bnVar4.y != null) {
                            bnVar4.w = bnVar4.y.e;
                            if (bnVar4.y.y != null) {
                                throw new RuntimeException(bnVar4.a + ": Turret can not be attached to turret that is also attached to a turret");
                            }
                        }
                        if (bnVar4.z != null) {
                            bnVar4.x = bnVar4.z.e;
                        }
                        if (bnVar4.W < 0.0f) {
                            bnVar4.W = bnVar4.V;
                        }
                    }
                }
                if (arrayList.size() > 31) {
                    throw new RuntimeException("Turret max count per unit is: 31");
                }
                lVar.fQ = (bn[]) arrayList.toArray(new bn[0]);
                lVar.dJ = lVar.cL.i;
                float f6 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it14 = arrayList.iterator();
                while (it14.hasNext()) {
                    bn bnVar5 = (bn) it14.next();
                    bnVar5.X *= lVar.aG;
                    bnVar5.f *= lVar.aG;
                    bnVar5.g *= lVar.aG;
                    bnVar5.Y *= lVar.aG;
                    bnVar5.Z *= lVar.aG;
                    boolean z5 = false;
                    if (bnVar5.B) {
                        if (bnVar5.ab >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (lVar.dJ > bnVar5.ab) {
                                lVar.dJ = bnVar5.ab;
                            }
                            if (f6 < bnVar5.ab) {
                                f6 = bnVar5.ab;
                            }
                            if (com.corrodinggames.rts.gameFramework.f.c(bnVar5.ab - lVar.cL.i) > 5.0f) {
                                boolean z6 = false;
                                Iterator it15 = lVar.o.iterator();
                                while (it15.hasNext()) {
                                    if (com.corrodinggames.rts.gameFramework.f.c(bnVar5.ab - ((y) it15.next()).a) < 5.0f) {
                                        z6 = true;
                                    }
                                }
                                if (!z6) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (bnVar5.ac != null) {
                        z5 = bnVar5.ac.booleanValue();
                    }
                    if (z5) {
                        y yVar = new y();
                        yVar.a = bnVar5.ab;
                        lVar.o.add(yVar);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        lVar.cL.i = f6;
                    } else if (f6 < lVar.cL.i) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String b20 = abVar.b("attack", "setMainTurretAs", (String) null);
                if (b20 != null) {
                    lVar.dF = lVar.e(b20);
                    if (lVar.dF == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + b20);
                    }
                } else {
                    lVar.dF = lVar.e("1");
                    if (lVar.dF == null) {
                        lVar.dF = lVar.fQ[0];
                    }
                }
                lVar.dG = lVar.dF.e;
                a(loadAllUnitsTook, ah.unitParsePartB);
                long loadAllUnitsTook3 = Unit.loadAllUnitsTook();
                if (abVar.l("core", "action_")) {
                    for (int i7 = 0; i7 <= 50; i7++) {
                        a(lVar, abVar, "core", "action_" + i7 + "_", VariableScope.nullOrMissingString + i7, false, false);
                    }
                }
                Iterator it16 = abVar.e("action_").iterator();
                while (it16.hasNext()) {
                    String str19 = (String) it16.next();
                    String substring4 = str19.substring("action_".length());
                    if (lVar.g(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    a(lVar, abVar, str19, VariableScope.nullOrMissingString, substring4, true, false);
                }
                Iterator it17 = abVar.e("hiddenAction_").iterator();
                while (it17.hasNext()) {
                    String str20 = (String) it17.next();
                    String substring5 = str20.substring("hiddenAction_".length());
                    if (lVar.g(substring5) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring5);
                    }
                    a(lVar, abVar, str20, VariableScope.nullOrMissingString, substring5, true, true);
                }
                a(loadAllUnitsTook3, ah.actionParse);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i8 = 0;
                while (i8 <= 1) {
                    boolean z7 = i8 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i9 = 1; i9 < 21; i9++) {
                        String str21 = z7 ? "leg_" + i9 : "arm_" + i9;
                        if (abVar.g(str21)) {
                            ba baVar = new ba();
                            ba.a(baVar, lVar, abVar, str21, z7, arrayList4);
                            arrayList4.add(baVar);
                        } else {
                            arrayList4.add(null);
                        }
                    }
                    i8++;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it18 = arrayList2.iterator();
                while (it18.hasNext()) {
                    ba baVar2 = (ba) it18.next();
                    if (baVar2 != null) {
                        arrayList5.add(baVar2);
                    }
                }
                Iterator it19 = arrayList3.iterator();
                while (it19.hasNext()) {
                    ba baVar3 = (ba) it19.next();
                    if (baVar3 != null) {
                        arrayList5.add(baVar3);
                    }
                }
                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                    ((ba) arrayList5.get(size4)).a = size4;
                }
                lVar.ax = (ba[]) arrayList5.toArray(new ba[0]);
                if (lVar.ax.length > 0) {
                    lVar.a(com.corrodinggames.rts.game.units.custom.b.h.a);
                }
                Iterator it20 = lVar.dr.iterator();
                while (it20.hasNext()) {
                    ((f) it20.next()).a(lVar);
                }
                b(lVar);
                String b21 = abVar.b("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (b21 != null && !"NONE".equalsIgnoreCase(b21)) {
                    bn e2 = lVar.e(b21);
                    if (e2 == null) {
                        throw new RuntimeException("Cannot find turret:" + b21 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    lVar.bB = e2.e;
                }
                com.corrodinggames.rts.game.units.custom.b.c.a(lVar, abVar);
                lVar.bj = abVar.a("attack", "dieOnAttack", (Boolean) false).booleanValue();
                lVar.bl = abVar.a("attack", "removeOnAttack", (Boolean) false).booleanValue();
                lVar.ep = abVar.d("attack", "canAttack");
                if (lVar.ep) {
                    lVar.eq = abVar.a(lVar, "attack", "canAttackFlyingUnits");
                    lVar.er = abVar.a(lVar, "attack", "canAttackLandUnits");
                    lVar.es = abVar.a(lVar, "attack", "canAttackUnderwaterUnits");
                } else {
                    lVar.eq = abVar.a(lVar, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    lVar.er = abVar.a(lVar, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    lVar.es = abVar.a(lVar, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                lVar.et = abVar.a(lVar, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(lVar.et)) {
                    lVar.et = null;
                }
                lVar.ev = abVar.a(lVar, "attack", "canOnlyAttackUnitsWithTags", (h) null);
                lVar.ew = abVar.a(lVar, "attack", "canOnlyAttackUnitsWithoutTags", (h) null);
                if (lVar.ev != null || lVar.ew != null) {
                    lVar.eu = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it21 = arrayList.iterator();
                while (it21.hasNext()) {
                    bn bnVar6 = (bn) it21.next();
                    if (bnVar6.O != null && bnVar6.O.a(lVar.ev)) {
                        bnVar6.O = null;
                    }
                    if (bnVar6.P != null && bnVar6.P.a(lVar.ew)) {
                        bnVar6.P = null;
                    }
                    if (bnVar6.B) {
                        if (bnVar6.O != null || bnVar6.P != null) {
                            z8 = true;
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (z8 && !z9) {
                    lVar.ex = true;
                    lVar.eu = true;
                }
                lVar.ey = abVar.a("attack", "isFixedFiring", (Boolean) false).booleanValue();
                lVar.fM = abVar.a("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                lVar.fN = abVar.a("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (lVar.ep && lVar.fN) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                lVar.fv = abVar.a(lVar, "ai", "aiTags", (h) null);
                lVar.fw = abVar.a("ai", "disableUse", (Boolean) false).booleanValue();
                lVar.fz = abVar.a("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                lVar.fA = abVar.b("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                lVar.fB = abVar.a("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                lVar.fy = abVar.b("ai", "maxEachBase", Integer.valueOf(com.corrodinggames.rts.gameFramework.f.b(2, lVar.fA))).intValue();
                lVar.fx = abVar.b("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (lVar.fy < lVar.fA) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!lVar.aH) {
                    if (abVar.n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (abVar.n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                lVar.fE = abVar.b("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                lVar.fF = abVar.b("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                lVar.fG = abVar.a("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                lVar.fH = abVar.a(lVar, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (h) null);
                lVar.fC = abVar.a("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                lVar.fC = abVar.a("ai", "noneInBaseExtraPriority", Float.valueOf(lVar.fC)).floatValue();
                lVar.fD = abVar.a("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                lVar.fD = abVar.a("ai", "noneGlobalExtraPriority", Float.valueOf(lVar.fD)).floatValue();
                lVar.fI = abVar.b("ai", "upgradedFrom", (String) null);
                Float a11 = abVar.a("ai", "ai_upgradePriority", (Float) null);
                if (a11 != null && a11.floatValue() != -1.0f) {
                    if (a11.floatValue() >= 0.0f && a11.floatValue() <= 1.0f) {
                        lVar.fK = a11.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + lVar.fK + " must be between 0-1 or -1 for default");
                    }
                }
                if (lVar.ep) {
                    for (int i10 = 0; i10 < lVar.fQ.length; i10++) {
                        bn bnVar7 = lVar.fQ[i10];
                        if (bnVar7.B && bnVar7.ao == null && lVar.w) {
                            if (bnVar7.m > 140.0f && (lVar.em == -1 || lVar.fQ[lVar.em].m < bnVar7.m)) {
                                lVar.em = i10;
                            }
                            if (bnVar7.n > 80.0f) {
                                lVar.en = i10;
                            }
                        }
                    }
                }
                if (lVar.cI == -2) {
                    if (lVar.fg == com.corrodinggames.rts.game.units.ao.AIR) {
                        lVar.cI = 5;
                    } else if (lVar.j()) {
                        if (lVar.al != null) {
                            lVar.cI = 3;
                        } else {
                            lVar.cI = 2;
                        }
                    } else if (lVar.cL.q < -2.0f) {
                        lVar.cI = 1;
                    } else if (lVar.eM > 0) {
                        lVar.cI = 3;
                    } else {
                        lVar.cI = 2;
                    }
                }
                if (lVar.fW.size() > 0) {
                    lVar.fX = true;
                    com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
                    com.corrodinggames.rts.gameFramework.utility.m mVar2 = new com.corrodinggames.rts.gameFramework.utility.m();
                    com.corrodinggames.rts.gameFramework.utility.m mVar3 = new com.corrodinggames.rts.gameFramework.utility.m();
                    Iterator it22 = lVar.fW.iterator();
                    while (it22.hasNext()) {
                        r rVar = (r) it22.next();
                        if (rVar.c == s.everyFrame) {
                            mVar.add(rVar);
                        } else if (rVar.c == s.every4Frames) {
                            mVar2.add(rVar);
                        } else if (rVar.c == s.every8Frames) {
                            mVar3.add(rVar);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + rVar.c);
                        }
                    }
                    lVar.fY = (r[]) mVar.toArray(new r[0]);
                    lVar.fZ = (r[]) mVar2.toArray(new r[0]);
                    lVar.ga = (r[]) mVar3.toArray(new r[0]);
                }
                if (lVar.gp != null && lVar.gp.size() > 0) {
                    Iterator it23 = lVar.gp.iterator();
                    while (it23.hasNext()) {
                        ((u) it23.next()).a(lVar);
                    }
                }
                if (lVar.gb.a > 0) {
                    Iterator it24 = lVar.gb.iterator();
                    while (it24.hasNext()) {
                        ((t) it24.next()).a(lVar);
                    }
                    lVar.gb.clear();
                }
                a(loadAllUnitsTook, ah.unitParsePartC);
                abVar.b();
                Iterator it25 = abVar.d.iterator();
                while (it25.hasNext()) {
                    com.corrodinggames.rts.gameFramework.utility.ac acVar = (com.corrodinggames.rts.gameFramework.utility.ac) it25.next();
                    if (acVar.a() != null && (acVar.a().startsWith("hiddenAction_") || acVar.a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + acVar.a() + "]" + acVar.b() + " has been repeated");
                    }
                    String str22 = "Repeated key " + acVar;
                    lVar.r(str22);
                    if (lVar.R >= 1) {
                        GameEngine.m328e("Converting warning to error (meta.strictLevel=" + lVar.R + ")");
                        throw new bo(str22);
                    }
                }
                Iterator it26 = abVar.e.iterator();
                while (it26.hasNext()) {
                    String str23 = "Skipping line, unexpected format: '" + ((String) it26.next()) + "'";
                    lVar.r(str23);
                    if (lVar.R >= 1) {
                        GameEngine.m328e("Converting warning to error (meta.strictLevel=" + lVar.R + ")");
                        throw new bo(str23);
                    }
                }
                if (bVar != null) {
                    bVar.E++;
                }
                synchronized (l.c) {
                    l.c.add(lVar);
                }
                a(loadAllUnitsTook, ah.unitParsePartD);
                return lVar;
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } catch (bo e4) {
            a(str, e4, bVar);
            return null;
        } catch (OutOfMemoryError e5) {
            l++;
            a(str, new RuntimeException(e5), bVar);
            return null;
        } catch (RuntimeException e6) {
            a(str, e6, bVar);
            return null;
        }
    }

    public static void a(String str, Exception exc, com.corrodinggames.rts.game.units.as asVar) {
        com.corrodinggames.rts.gameFramework.mod.b bVar = null;
        if (asVar instanceof l) {
            bVar = ((l) asVar).J;
        }
        a(str, exc, bVar);
    }

    public static String a(com.corrodinggames.rts.gameFramework.mod.b bVar, String str, boolean z) {
        if (bVar != null) {
            String o2 = com.corrodinggames.rts.gameFramework.file.a.o(bVar.q);
            str = com.corrodinggames.rts.gameFramework.file.a.o(str);
            if (str.startsWith(o2)) {
                str = str.substring(o2.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + bVar.a() + ")";
            }
        }
        return str;
    }

    public static void a(String str, Exception exc, com.corrodinggames.rts.gameFramework.mod.b bVar) {
        String b2;
        String str2;
        GameEngine.print("Error while loading unit:" + str);
        GameEngine.c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof bo) {
            b2 = exc.getMessage();
        } else {
            b2 = com.corrodinggames.rts.gameFramework.f.b(exc);
        }
        if (b2 == null) {
            b2 = "<No error cause>";
        }
        if (!b2.contains("unit config file")) {
            b2 = b2.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String a2 = a(bVar, str, true);
        if (bVar != null) {
            str2 = "Error loading unit: " + a2 + ": \n" + b2;
        } else if (b2.contains("Error loading core unit")) {
            str2 = b2;
        } else {
            str2 = "Error loading core unit: " + a2 + ": \n" + b2 + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof bo) {
            bo boVar = (bo) exc;
            if (boVar.c != null || boVar.d != null) {
                str2 = str2 + " (section:" + boVar.c + ", key:" + boVar.d + ")";
            }
        }
        boolean z = false;
        if (bVar != null) {
            z = bVar.f;
        }
        if (!z) {
        }
        if (s != null) {
            s = str2;
        }
        if (bVar != null) {
            bVar.a(str2);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e2) {
            }
            throw new RuntimeException(str2, exc);
        }
    }

    public static void b(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, boolean z) {
        String b2 = abVar.b(str, str2 + "name", (String) null);
        if (b2 == null) {
            return;
        }
        for (String str3 : b2.split(",")) {
            String trim = str3.trim();
            com.corrodinggames.rts.game.units.custom.a.d dVar = new com.corrodinggames.rts.game.units.custom.a.d();
            dVar.k = trim;
            dVar.o = abVar.a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            dVar.p = abVar.a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            dVar.aJ = abVar.b(str, str2 + "tech", (Integer) 1).intValue();
            dVar.aK = abVar.a(str, str2 + "forceNano", (Boolean) false).booleanValue();
            dVar.aL = abVar.b(str, str2 + "type", (String) null);
            dVar.q = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "price", (com.corrodinggames.rts.game.units.custom.d.b) null);
            dVar.aF = abVar.a(lVar, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            dVar.v = abVar.a(lVar, str, str2 + "isVisible", (LogicBoolean) null);
            dVar.z = abVar.a(lVar, str, str2 + "isLocked", (LogicBoolean) null);
            dVar.A = a(lVar, abVar, str, str2 + "isLockedMessage", (String) null);
            if (dVar.z != null) {
                dVar.y = true;
            }
            if (dVar.z == LogicBoolean.falseBoolean) {
                dVar.z = null;
            }
            dVar.B = abVar.a(lVar, str, str2 + "isLockedAlt", (LogicBoolean) null);
            dVar.C = a(lVar, abVar, str, str2 + "isLockedAltMessage", (String) null);
            if (dVar.B != null) {
                dVar.y = true;
            }
            if (dVar.B == LogicBoolean.falseBoolean) {
                dVar.B = null;
            }
            dVar.D = abVar.a(lVar, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            dVar.E = a(lVar, abVar, str, str2 + "isLockedAlt2Message", (String) null);
            if (dVar.D != null) {
                dVar.y = true;
            }
            if (dVar.D == LogicBoolean.falseBoolean) {
                dVar.D = null;
            }
            com.corrodinggames.rts.game.units.custom.d.b a2 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "addResources", true);
            if (a2 != null && a2.d()) {
                dVar.ae = a2;
            }
            dVar.aM = com.corrodinggames.rts.game.units.custom.a.f.build;
            if (!"NONE".equalsIgnoreCase(trim)) {
                lVar.gh.add(dVar);
            }
        }
    }

    public static void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str, String str2, String str3, boolean z, boolean z2) {
        ArrayList a2;
        com.corrodinggames.rts.game.units.custom.a.d dVar = new com.corrodinggames.rts.game.units.custom.a.d();
        String b2 = abVar.b(str, str2 + "convertTo", (String) null);
        String b3 = abVar.b(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        at[] a3 = as.a(abVar, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (at[]) null);
        Float a4 = abVar.a(str, str2 + "addEnergy", (Float) null);
        com.corrodinggames.rts.game.units.custom.d.b a5 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "addResources", true);
        lVar.a(a5);
        com.corrodinggames.rts.game.units.custom.d.b a6 = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "addResourcesScaledByAIHandicaps", true);
        lVar.a(a6);
        String b4 = abVar.b(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean b5 = abVar.b(lVar, str, str2 + "alsoTriggerOrQueueActionWithTarget", null);
        LogicBoolean a7 = abVar.a(lVar, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String b6 = abVar.b(str, str2 + "alsoTriggerAction", (String) null);
        LogicBoolean c2 = abVar.c(lVar, str, str2 + "alsoTriggerActionRepeat", null);
        String b7 = abVar.b(str, str2 + "alsoQueueAction", (String) null);
        String b8 = abVar.b(str, str2 + "spawnEffects", (String) null);
        String b9 = abVar.b(str, str2 + "spawnEffectsOnQueue", (String) null);
        String b10 = abVar.b(str, str2 + "playSoundAtUnit", (String) null);
        String b11 = abVar.b(str, str2 + "playSoundGlobally", (String) null);
        String b12 = abVar.b(str, str2 + "playSoundToPlayer", (String) null);
        String b13 = abVar.b(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        com.corrodinggames.rts.game.units.custom.a.a.o.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.e.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.h.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.a.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.k.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.b.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.d.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.l.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.g.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.m.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.f.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.j.a(lVar, abVar, str, str2, dVar, str3, z);
        com.corrodinggames.rts.game.units.custom.a.a.i.a(lVar, abVar, str, str2, dVar, str3, z);
        LogicBoolean a8 = abVar.a(lVar, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            z3 = (b2 == null && b3 == null && a4 == null && b4 == null) ? true : true;
            z3 = (a5.d() || a6.d()) ? true : true;
            z3 = (b6 == null && b7 == null && b8 == null && 0 == 0) ? true : true;
            z3 = (b10 == null && b11 == null && b12 == null && b13 == null) ? true : true;
            if (dVar.ac.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(b2)) {
                b2 = null;
            }
            if ("NONE".equalsIgnoreCase(b3)) {
                b3 = null;
            }
            if (b4 != null && b4.equalsIgnoreCase("NONE")) {
                b4 = null;
            }
            dVar.a = lVar.gh.size();
            String b14 = abVar.b(str, str2 + "id", (String) null);
            if (b14 != null) {
                dVar.b = "c" + b14;
                if (dVar.b.contains(" ")) {
                    throw new RuntimeException("[" + str + "]id cannot contain space");
                }
                if (dVar.b.contains(",")) {
                    throw new RuntimeException("[" + str + "]id cannot contain ,");
                }
                if (dVar.b.contains(":")) {
                    throw new RuntimeException("[" + str + "]id cannot contain :");
                }
                if (dVar.b.contains("(")) {
                    throw new RuntimeException("[" + str + "]id cannot contain (");
                }
                if (dVar.b.contains("\ufffd\ufffd")) {
                    throw new RuntimeException("[" + str + "]id cannot contain null");
                }
                if (dVar.b.length() > 15) {
                    throw new RuntimeException("[" + str + "]id cannot be longer than 15 characters");
                }
                Iterator it = lVar.gh.iterator();
                while (it.hasNext()) {
                    if (dVar.b.equalsIgnoreCase(((com.corrodinggames.rts.game.units.custom.a.d) it.next()).b)) {
                        throw new RuntimeException("[" + str + "]id more than one action exists with id: " + b14);
                    }
                }
            }
            dVar.c = str3;
            dVar.o = abVar.a(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            dVar.s = g.a(abVar.b(str, str2 + "tags", (String) null));
            dVar.p = abVar.a(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            dVar.q = com.corrodinggames.rts.game.units.custom.d.b.a(lVar, abVar, str, str2 + "price", true);
            dVar.r = com.corrodinggames.rts.game.units.custom.d.b.b(lVar, abVar, str, str2 + "streamingCost", null);
            if (abVar.a(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (dVar.r != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                dVar.r = com.corrodinggames.rts.game.units.custom.d.b.b(lVar, abVar, str, str2 + "price", null);
                dVar.q = com.corrodinggames.rts.game.units.custom.d.b.a;
            }
            lVar.a(dVar.q);
            if (dVar.r != null) {
                lVar.a(dVar.r);
            }
            dVar.K = abVar.a(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            dVar.L = abVar.a(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            dVar.M = abVar.a(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            dVar.O = abVar.a(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            dVar.N = abVar.a(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!dVar.M && !dVar.N && dVar.O) {
                dVar.P = true;
            }
            if (!dVar.M) {
                dVar.j = com.corrodinggames.rts.game.units.a.u.none;
            } else {
                dVar.j = com.corrodinggames.rts.game.units.a.u.popupQueue;
            }
            dVar.t = abVar.a(lVar, str, str2 + "requireConditional", (LogicBoolean) null);
            dVar.u = abVar.a(lVar, str, str2 + "isActive", (LogicBoolean) null);
            dVar.v = abVar.a(lVar, str, str2 + "isVisible", (LogicBoolean) null);
            dVar.x = abVar.a(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            dVar.w = abVar.a(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(dVar.x)).booleanValue();
            if (z2) {
                if (dVar.v != null && !LogicBoolean.isStaticFalse(dVar.v)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                dVar.v = LogicBoolean.falseBoolean;
            }
            dVar.z = abVar.a(lVar, str, str2 + "isLocked", (LogicBoolean) null);
            dVar.A = a(lVar, abVar, str, str2 + "isLockedMessage", (String) null);
            if (dVar.z != null) {
                dVar.y = true;
            }
            if (dVar.z == LogicBoolean.falseBoolean) {
                dVar.z = null;
            }
            dVar.B = abVar.a(lVar, str, str2 + "isLockedAlt", (LogicBoolean) null);
            dVar.C = a(lVar, abVar, str, str2 + "isLockedAltMessage", (String) null);
            if (dVar.B != null) {
                dVar.y = true;
            }
            if (dVar.B == LogicBoolean.falseBoolean) {
                dVar.B = null;
            }
            dVar.D = abVar.a(lVar, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            dVar.E = a(lVar, abVar, str, str2 + "isLockedAlt2Message", (String) null);
            if (dVar.D != null) {
                dVar.y = true;
            }
            if (dVar.D == LogicBoolean.falseBoolean) {
                dVar.D = null;
            }
            dVar.F = LogicBoolean.create(lVar, abVar.b(str, str2 + "ai_isHighPriority", (String) null), null);
            if (dVar.F == LogicBoolean.falseBoolean) {
                dVar.F = null;
            }
            if (dVar.F != null) {
                lVar.fJ = true;
            }
            dVar.G = abVar.a(lVar, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            dVar.aN = (com.corrodinggames.rts.game.units.custom.a.e) abVar.a(str, str2 + "aiUse", dVar.aN, com.corrodinggames.rts.game.units.custom.a.e.class);
            dVar.J = lVar.a(abVar.b(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (dVar.J != null) {
                dVar.j = com.corrodinggames.rts.game.units.a.u.placeBuilding;
                if (b2 != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            dVar.I = lVar.a(abVar.b(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            dVar.aF = abVar.a(lVar, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            dVar.ay = a(lVar.F, abVar.b(str, str2 + "iconImage", "NONE"), lVar.ab, lVar, str, str2 + "iconImage");
            dVar.aB = abVar.a(lVar, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (dVar.aB == LogicBoolean.trueBoolean) {
                dVar.aB = null;
            }
            dVar.az = lVar.a(abVar, str, str2 + "iconExtraImage");
            dVar.aA = abVar.a(str, str2 + "iconExtraColor", Integer.valueOf(Color.a(100, 255, 255, 255))).intValue();
            dVar.aC = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "unitShownInUI", null);
            if (dVar.aC != null && dVar.ay != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            dVar.aD = abVar.a(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            dVar.aE = abVar.a(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            dVar.aG = (com.corrodinggames.rts.game.units.a.t) abVar.a(str, str2 + "displayType", dVar.aG, com.corrodinggames.rts.game.units.a.t.class);
            dVar.aI = abVar.a(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            dVar.d = a(lVar, abVar, str, str2 + "text", VariableScope.nullOrMissingString);
            dVar.e = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "textAddUnitName", null);
            dVar.h = a(abVar, str, str2 + "textPostFix", (String) null);
            dVar.f = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "descriptionAddFromUnit", null);
            dVar.g = UnitReference.parseUnitTypeOrReferenceFromConf(lVar, abVar, str, str2 + "descriptionAddUnitStats", null);
            dVar.i = a(lVar, abVar, str, str2 + "description", VariableScope.nullOrMissingString);
            dVar.S = abVar.d(str, str2 + "buildSpeed", Float.valueOf(dVar.S)).floatValue();
            if (dVar.S == 0.0f) {
                dVar.S = 50.0f;
            }
            dVar.T = abVar.a(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(dVar.T)).booleanValue();
            boolean z4 = false;
            dVar.U = abVar.a(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(dVar.U)).booleanValue();
            dVar.V = lVar.a(abVar.b(str, str2 + "whenBuilding_playAnimation", (String) null), dVar.V);
            dVar.W = abVar.a(str, str2 + "whenBuilding_rotateTo", dVar.W);
            dVar.X = abVar.a(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(dVar.X)).booleanValue();
            dVar.Y = abVar.a(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(dVar.Y)).booleanValue();
            dVar.Z = abVar.a(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(dVar.Z)).booleanValue();
            String b15 = abVar.b(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (b15 != null) {
                dVar.aa = lVar.e(b15);
                if (dVar.aa == null) {
                    throw new RuntimeException("Cannot find turret:" + b15 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (dVar.X) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (dVar.Z && dVar.W == null) {
                dVar.W = Float.valueOf(0.0f);
            }
            dVar.ab = abVar.a(lVar, str, str2 + "whenBuilding_triggerAction", (u) null);
            dVar.Q = abVar.a(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(dVar.Q)).booleanValue();
            dVar.R = as.a(abVar, str, str2 + "convertTo_keepCurrentFields", (at[]) null);
            if (b3 != null && !"NONE".equalsIgnoreCase(b3)) {
                dVar.l = lVar.a(b3, str2 + "whenBuilding_temporarilyConvertTo", str);
                dVar.m = a3;
                z4 = true;
            }
            if (dVar.U || dVar.V != null || dVar.W != null || dVar.l != null || dVar.ab != null) {
                lVar.bg = true;
            }
            dVar.aM = com.corrodinggames.rts.game.units.custom.a.f.convert;
            if (b2 != null && !"NONE".equalsIgnoreCase(b2)) {
                dVar.H = lVar.a(b2, str2 + "convertTo", str);
                dVar.k = b2;
                dVar.N = false;
                z4 = true;
            }
            if (a4 != null) {
                dVar.ad = a4;
                z4 = true;
            }
            if (a5 != null && a5.d()) {
                dVar.ae = a5;
                z4 = true;
            }
            if (a6 != null && a6.d()) {
                dVar.af = a6;
                z4 = true;
            }
            dVar.ah = abVar.a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            dVar.ai = abVar.b(lVar, str, str2 + "fireTurretXAtGround_withTarget", null);
            dVar.ak = abVar.b(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            dVar.am = com.corrodinggames.rts.game.units.custom.b.c.a(lVar, abVar.b(str, "fireTurretXAtGround_showGuideDecals", (String) null));
            if (dVar.ai != null && dVar.ah == null) {
                dVar.ah = new PointF(0.0f, 0.0f);
            }
            String b16 = abVar.b(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (b16 != null) {
                dVar.aj = lVar.f(b16);
                if (dVar.aj == null) {
                    throw new RuntimeException("Cannot find projectile:" + b16 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String b17 = abVar.b(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (b17 != null) {
                dVar.al = com.corrodinggames.rts.game.units.ao.a(b17, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (b4 != null) {
                bn e2 = lVar.e(b4);
                if (e2 == null) {
                    throw new RuntimeException("Cannot find turret:" + b4 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                dVar.ag = Integer.valueOf(e2.e);
                if (dVar.ah == null) {
                    dVar.j = com.corrodinggames.rts.game.units.a.u.targetGround;
                    if (dVar.J != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            dVar.an = b5;
            dVar.ao = a7;
            if (b6 != null && !"NONE".equalsIgnoreCase(b6)) {
                dVar.ap = lVar.c(b6, "alsoTriggerAction", str);
                if (c2 != null) {
                    if (LogicBoolean.isStaticNumber(c2)) {
                        float knownStaticNumber = LogicBoolean.getKnownStaticNumber(c2);
                        if (knownStaticNumber == 0.0f) {
                            dVar.ap = null;
                        } else if (knownStaticNumber != 1.0f) {
                            dVar.ar = c2;
                        }
                    } else {
                        dVar.ar = c2;
                    }
                }
                z4 = true;
            }
            if (b7 != null && !"NONE".equalsIgnoreCase(b7)) {
                dVar.aq = lVar.c(b7, "alsoQueueAction", str);
                z4 = true;
            }
            if (b8 != null) {
                dVar.as = lVar.a(b8, (z) null);
                z4 = true;
            }
            if (b9 != null) {
                dVar.at = lVar.a(b9, (z) null);
                z4 = true;
            }
            if (b10 != null) {
                dVar.au = bl.a(lVar, b10);
                z4 = true;
            }
            if (b11 != null) {
                dVar.av = bl.a(lVar, b11);
                z4 = true;
            }
            if (b12 != null) {
                dVar.aw = bl.a(lVar, b12);
                z4 = true;
            }
            if (b13 != null) {
                dVar.ax = bl.a(lVar, b13);
                z4 = true;
            }
            if (a8 != null) {
                dVar.aH = a8;
                z4 = true;
            }
            if (dVar.ac.size() > 0) {
                z4 = true;
            }
            ArrayList arrayList = null;
            String b18 = abVar.b(str, str2 + "autoTriggerOnEvent", (String) null);
            Integer b19 = abVar.b(str, str2 + "autoTriggerOnEventRecursionLimit", (Integer) null);
            if (b19 != null) {
                if (b19.intValue() < 0) {
                    throw new bo("[" + str + "]" + str2 + "autoTriggerOnEventRecursionLimit: Cannot be < 0");
                }
                if (b19.intValue() > 50) {
                    throw new bo("[" + str + "]" + str2 + "autoTriggerOnEventRecursionLimit: Cannot be > 100");
                }
            }
            if (b18 != null && (a2 = a(str, str2 + "autoTriggerOnEvent", b18)) != null) {
                if (a2.size() < 1) {
                    throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 or more options, got:" + a2.size());
                }
                Iterator it2 = a2.iterator();
                while (it2.hasNext()) {
                    ai aiVar = (ai) it2.next();
                    try {
                        af afVar = (af) com.corrodinggames.rts.gameFramework.utility.ab.a(aiVar.a, (Enum) null, af.class);
                        if (arrayList == null) {
                            arrayList = new ArrayList();
                        }
                        ae aeVar = new ae();
                        aeVar.a = afVar;
                        if (b19 != null) {
                            aeVar.e = b19.intValue();
                        } else if (aeVar.a == af.newMessage) {
                            aeVar.e = 4;
                        }
                        if (aiVar.b != null) {
                            for (String str4 : aiVar.b.keySet()) {
                                String str5 = (String) aiVar.b.get(str4);
                                boolean z5 = false;
                                if (str4.equalsIgnoreCase("withtag")) {
                                    if (aeVar.a != af.tookDamage && aeVar.a != af.newMessage) {
                                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + aeVar.a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withprojectiletag")) {
                                    if (aeVar.a != af.tookDamage) {
                                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + aeVar.a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (str4.equalsIgnoreCase("withactiontag")) {
                                    if (aeVar.a != af.queueItemAdded && aeVar.a != af.queueItemCancelled) {
                                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + aeVar.a.name() + " doesn't support parameter: " + str4);
                                    }
                                    z5 = true;
                                }
                                if (z5) {
                                    String p2 = com.corrodinggames.rts.gameFramework.f.p(str5);
                                    if (p2 == null) {
                                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + aeVar.a.name() + " expected quoted string, got: " + str5);
                                    }
                                    if (aeVar.d != null) {
                                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + aeVar.a.name() + " tag was set twice");
                                    }
                                    aeVar.d = com.corrodinggames.rts.gameFramework.utility.ab.j(str, str2 + "autoTriggerOnEvent", p2);
                                } else {
                                    throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: Unknown parameter: " + str4);
                                }
                            }
                            continue;
                        }
                        arrayList.add(aeVar);
                    } catch (bo e3) {
                        throw new bo("[" + str + "]" + str2 + "autoTriggerOnEvent: " + e3.getMessage(), e3);
                    }
                }
            }
            LogicBoolean a9 = abVar.a(lVar, str, str2 + "autoTrigger", (LogicBoolean) null);
            String b20 = abVar.b(str, str2 + "autoTrigger", (String) null);
            s sVar = (s) abVar.a(str, str2 + "autoTriggerCheckRate", lVar.cb, s.class);
            dVar.n = z4;
            if (z4 || dVar.v != null) {
                if (a9 != null && z4) {
                    r rVar = new r();
                    rVar.a = a9;
                    rVar.b = b20;
                    rVar.c = sVar;
                    rVar.d = new com.corrodinggames.rts.game.units.custom.a.g(dVar, lVar.a(dVar.k, "[" + str + "]" + str2, str));
                    lVar.fW.add(rVar);
                }
                if (arrayList != null && z4) {
                    com.corrodinggames.rts.game.units.custom.a.g gVar = new com.corrodinggames.rts.game.units.custom.a.g(dVar, lVar.a(dVar.k, "[" + str + "]" + str2, str));
                    Iterator it3 = arrayList.iterator();
                    while (it3.hasNext()) {
                        ae aeVar2 = (ae) it3.next();
                        aeVar2.b = gVar;
                        aeVar2.c = lVar;
                        lVar.gq.add(aeVar2);
                    }
                }
                if (dVar.k != null && dVar.q != null && dVar.q.b > 0) {
                    lVar.gi = true;
                }
                lVar.gh.add(dVar);
            }
        }
    }

    public static String a(l lVar, String str, String str2) {
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
            if (lVar.J == null) {
                str = "units/common.ini";
            } else {
                str = lVar.J.q + "/common.ini";
            }
        }
        String str3 = com.corrodinggames.rts.gameFramework.f.h(str) + "/";
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str3 + str2;
            }
        }
    }

    public static void a(long j2, ah ahVar) {
        ahVar.o += Unit.a(j2);
    }

    public static void i() {
        ah[] values;
        GameEngine.m328e("==Timing==");
        for (ah ahVar : ah.values()) {
            GameEngine.m328e(ahVar.name() + ": " + Unit.a(ahVar.o));
        }
    }

    public static void j() {
        for (ah ahVar : ah.values()) {
            ahVar.o = 0.0d;
        }
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e a(String str, String str2, boolean z, l lVar, String str3, String str4) {
        try {
            return a(str, str2, z, lVar);
        } catch (RuntimeException e2) {
            e2.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e2.getMessage(), e2);
        }
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e a(String str, String str2, boolean z, l lVar) {
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        com.corrodinggames.rts.gameFramework.unitAction.e b2 = b(str, str2, z, lVar);
        a(loadAllUnitsTook, ah.imageLoadOrGet);
        return b2;
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e b(String str, String str2, boolean z, l lVar) {
        com.corrodinggames.rts.gameFramework.unitAction.e a2;
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
            if (lVar.J == null) {
                str = "units/common.ini";
            } else {
                str = lVar.J.q + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str3 = com.corrodinggames.rts.gameFramework.f.h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        com.corrodinggames.rts.gameFramework.unitAction.e c2 = c(str4);
        if (c2 != null) {
            return c2;
        }
        com.corrodinggames.rts.gameFramework.utility.j c3 = c(str3, str2, lVar);
        int i2 = 0;
        if (e != null) {
            i2 = e.I;
        }
        if (i2 > 5) {
            GameEngine.m328e("Fast failing to oom image for this mod");
            a2 = gameEngine.bO.r();
        } else {
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            try {
                a2 = gameEngine.bO.a((InputStream) c3, true);
                a(loadAllUnitsTook, ah.imageLoad);
                if (a2.A()) {
                    GameEngine.m328e("oomErrors:" + l);
                    l++;
                    if (e != null) {
                        e.I++;
                        e.J++;
                    }
                } else if (e != null && !e.z && GameEngine.aZ) {
                    a2.z();
                }
            } catch (RuntimeException e2) {
                GameEngine.m328e("imageStream:" + c3);
                throw new RuntimeException("Error decode image from: " + com.corrodinggames.rts.gameFramework.file.a.d(str3 + str2), e2);
            }
        }
        try {
            c3.close();
        } catch (Exception e3) {
            e3.printStackTrace();
        }
        if (a2 == null) {
            throw new RuntimeException("Failed to decode image: " + com.corrodinggames.rts.gameFramework.file.a.e(str3 + str2));
        }
        a2.a(z);
        if (z2) {
            a2 = com.corrodinggames.rts.game.units.am.a(a2, a2.p, a2.q);
        }
        a(a2);
        a(str4, a2);
        return a2;
    }

    public static void a(String str, com.corrodinggames.rts.gameFramework.unitAction.e eVar) {
        g.put(str, eVar);
    }

    public static com.corrodinggames.rts.gameFramework.unitAction.e c(String str) {
        com.corrodinggames.rts.gameFramework.unitAction.e eVar = (com.corrodinggames.rts.gameFramework.unitAction.e) g.get(str);
        if (eVar != null) {
            j++;
            a(eVar);
            eVar.t();
            return eVar;
        }
        if (k) {
            GameEngine.m328e("loadImageInConf: cache miss: " + str);
        }
        i++;
        return null;
    }

    public static com.corrodinggames.rts.gameFramework.a.i a(String str, String str2, l lVar) {
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        com.corrodinggames.rts.gameFramework.a.i b2 = b(str, str2, lVar);
        a(loadAllUnitsTook, ah.soundLoadOrGet);
        return b2;
    }

    public static com.corrodinggames.rts.gameFramework.a.i b(String str, String str2, l lVar) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!str2.contains(".")) {
            return gameEngine.bM.a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (lVar.J == null) {
                str = "units/common.ini";
            } else {
                str = lVar.J.q + "/common.ini";
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
        String str3 = com.corrodinggames.rts.gameFramework.f.h(str) + "/";
        String str4 = str3 + str2;
        com.corrodinggames.rts.gameFramework.a.i iVar = (com.corrodinggames.rts.gameFramework.a.i) h.get(str4);
        if (iVar != null) {
            a(iVar);
            return iVar;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            com.corrodinggames.rts.gameFramework.utility.j c2 = c(str3, str2, lVar);
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            com.corrodinggames.rts.gameFramework.a.i a2 = gameEngine.bM.a(str2, c2, false);
            try {
                c2.close();
            } catch (Exception e2) {
                e2.printStackTrace();
            }
            a(loadAllUnitsTook, ah.soundLoad);
            if (a2 == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                lVar.r(str5);
                return gameEngine.bM.b("Failed to load");
            }
            a(a2);
            h.put(str4, a2);
            return a2;
        }
    }

    public static boolean a(String str, String str2, String str3, com.corrodinggames.rts.gameFramework.mod.b bVar) {
        if (str2 == null || !str2.contains("..") || GameEngine.at()) {
            return true;
        }
        String canonicalPath = new File(com.corrodinggames.rts.gameFramework.file.a.e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(com.corrodinggames.rts.gameFramework.file.a.e("units")).getCanonicalPath())) {
            return true;
        }
        String k2 = bVar.k();
        boolean startsWith = canonicalPath.startsWith(k2);
        if (!startsWith) {
            GameEngine.print("File: '" + canonicalPath + "' is not within mod: '" + k2 + "'");
        }
        return startsWith;
    }

    public static String a(String str, String str2) {
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

    public static com.corrodinggames.rts.gameFramework.utility.j c(String str, String str2, l lVar) {
        String a2 = a(str, str2);
        com.corrodinggames.rts.gameFramework.mod.b bVar = null;
        if (lVar != null) {
            bVar = lVar.J;
        } else {
            GameEngine.g("findAssetSteam meta==null");
        }
        if (bVar != null) {
            try {
                if (!a(str, str2, a2, bVar)) {
                    throw new RuntimeException("File is outside mod: " + a2);
                }
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        com.corrodinggames.rts.gameFramework.utility.j k2 = com.corrodinggames.rts.gameFramework.file.a.k(a2);
        if (k2 == null) {
            GameEngine.m328e("Orginal path: " + a2);
            throw new RuntimeException("IO Error: Failed to open: " + a(bVar, a2, true));
        }
        return k2;
    }

    public static void b(l lVar) {
        ba[] baVarArr = lVar.ax;
        for (ba baVar : baVarArr) {
            float f2 = -1.0f;
            ba baVar2 = null;
            float f3 = 1.0f;
            if (baVar.o) {
                f3 = 0.1f;
            }
            for (ba baVar3 : baVarArr) {
                if (baVar != baVar3 && !baVar3.l) {
                    float a2 = com.corrodinggames.rts.gameFramework.f.a(baVar.d * f3, baVar.e, baVar3.d * f3, baVar3.e);
                    if (baVar2 == null || a2 < f2) {
                        f2 = a2;
                        baVar2 = baVar3;
                    }
                }
            }
            float a3 = com.corrodinggames.rts.gameFramework.f.a(f2) + 2.0f;
            float f4 = a3 * a3;
            ArrayList arrayList = new ArrayList();
            for (ba baVar4 : baVarArr) {
                if (baVar != baVar4 && !baVar4.l && com.corrodinggames.rts.gameFramework.f.a(baVar.d * f3, baVar.e, baVar4.d * f3, baVar4.e) <= f4) {
                    arrayList.add(Integer.valueOf(baVar4.a));
                }
            }
            baVar.S = new int[arrayList.size()];
            for (int i2 = 0; i2 < arrayList.size(); i2++) {
                baVar.S[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
    }

    public static String k() {
        return "builtin_mods";
    }

    public static String l() {
        return "builtin_mods_enabled";
    }

    public static String m() {
        String str;
        if (GameEngine.aU) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    public static ArrayList a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = com.corrodinggames.rts.gameFramework.utility.al.a(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] b2 = com.corrodinggames.rts.gameFramework.utility.al.b(trim, "(");
                    if (b2 == null) {
                        throw new bo("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = b2[0];
                    str4 = b2[1].trim();
                }
                ai aiVar = new ai();
                aiVar.a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new bo("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = com.corrodinggames.rts.gameFramework.utility.al.a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] b3 = com.corrodinggames.rts.gameFramework.utility.al.b(str5, "=");
                            if (b3 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = b3[0].trim();
                            String trim3 = b3[1].trim();
                            if (aiVar.b == null) {
                                aiVar.b = new HashMap();
                            }
                            aiVar.b.put(trim2, trim3);
                        }
                    }
                }
                arrayList.add(aiVar);
            }
        }
        return arrayList;
    }
}