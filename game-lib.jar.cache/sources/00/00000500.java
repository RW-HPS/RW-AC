package com.corrodinggames.rts.gameFramework.mod;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Interface.InterfaceEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.i.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/a.class */
public class ModEngine {
    public static String a;
    public static String b;
    public b c = new b();
    Object d = new Object();
    ArrayList e = new ArrayList();
    ArrayList f = new ArrayList();

    public ModEngine() {
        try {
            a(GameEngine.getGameEngine().u());
        } catch (bo e) {
            throw new RuntimeException(e);
        }
    }

    private static int a(String str, int i) {
        String[] c = f.c(str, '.');
        if (c == null) {
            throw new bo("Unexpected version format (Missing " + i + ")");
        }
        if (c.length > 3) {
            throw new bo("Unexpected version format (" + str + ")");
        }
        if (c.length <= i) {
            return 0;
        }
        try {
            return Integer.valueOf(c[i]).intValue();
        } catch (NumberFormatException e) {
            throw new bo("Unexpected version format (Bad " + i + ")", e);
        }
    }

    public static void a(String str) {
        a(str, GameEngine.getGameEngine().u());
    }

    public static String b(String str) {
        return f.a(f.a(f.a(f.a(f.a(f.a(f.a(f.a(f.a(f.a(f.a(f.a(str, "v", VariableScope.nullOrMissingString).trim(), "a", VariableScope.nullOrMissingString), "b", VariableScope.nullOrMissingString), "c", VariableScope.nullOrMissingString), "d", VariableScope.nullOrMissingString), "e", VariableScope.nullOrMissingString), "f", VariableScope.nullOrMissingString), "g", VariableScope.nullOrMissingString), "h1", VariableScope.nullOrMissingString), "h2", VariableScope.nullOrMissingString), "h3", VariableScope.nullOrMissingString), "h4", VariableScope.nullOrMissingString);
    }

    public static void a(String str, String str2) {
        String b2 = b(str2);
        String b3 = b(str);
        try {
            int i = 1000;
            int i2 = 1000;
            if (b2.contains("p")) {
                String[] b4 = al.b(b2, "p");
                try {
                    i = Integer.valueOf(b4[1]).intValue();
                    b2 = b4[0];
                } catch (NumberFormatException e) {
                    throw new bo("Unexpected min version:" + b3 + " (Bad build number)", e);
                }
            }
            if (b3.contains("p")) {
                String[] b5 = al.b(b3, "p");
                try {
                    i2 = Integer.valueOf(b5[1]).intValue();
                    b3 = b5[0];
                } catch (NumberFormatException e2) {
                    throw new bo("Unexpected min version:" + b3 + "(Bad build number)", e2);
                }
            }
            try {
                int a2 = a(b2, 0);
                int a3 = a(b3, 0);
                int a4 = a(b2, 1);
                int a5 = a(b3, 1);
                int a6 = a(b2, 2);
                int a7 = a(b3, 2);
                if (a3 < 1) {
                    throw new bo("Min version cannot be less than v1.10");
                }
                if (a3 > a2) {
                    throw new bo("Requires version: " + b3 + " or higher. (You have: " + b2 + ")");
                }
                if (a2 > a3) {
                    return;
                }
                if (a5 < 10 && a3 == 1) {
                    throw new bo("Min version cannot be less than v1.10");
                }
                if (a5 > a4) {
                    throw new bo("Requires version: " + b3 + " or higher. (You have: " + b2 + ")");
                }
                if (a4 > a5) {
                    return;
                }
                if (a7 > a6) {
                    throw new bo("Requires version: " + b3 + " or higher. (You have: " + b2 + ")");
                }
                if (a6 <= a7 && i2 > i) {
                    throw new bo("Requires newer build: " + b3 + " or higher. (You have: " + b2 + ")");
                }
            } catch (bo e3) {
                throw new bo("Requires version: " + b3 + " or higher. " + e3.getMessage(), e3);
            }
        } catch (RuntimeException e4) {
            throw new bo("Requires version: " + b3 + " or higher." + e4.getMessage(), e4);
        }
    }

    public void a() {
        k();
        f();
    }

    public int a(boolean z) {
        int i = 0;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f && !bVar.D && (!z || bVar.R == null)) {
                i++;
            }
        }
        return i;
    }

    public int b() {
        int i = 0;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f && bVar.R != null) {
                i++;
            }
        }
        return i;
    }

    public int c() {
        int i = 0;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (!((b) it.next()).z) {
                i++;
            }
        }
        return i;
    }

    public void d() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.g = bVar.f;
            bVar.h = false;
        }
    }

    public void e() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = VariableScope.nullOrMissingString;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            String replace = bVar.c.replace(",", " ").replace("|", " ");
            if (replace.length() > 15) {
                replace = replace.substring(12) + "...";
            }
            if (str.length() != 0) {
                str = str + ",";
            }
            str = str + replace + "|" + bVar.e + "|" + (bVar.f ? "disabled" : "enabled");
        }
        gameEngine.settingsEngine.modSettingsVersion = 1;
        gameEngine.settingsEngine.modSettings = str;
    }

    public void f() {
        String[] split;
        boolean z;
        GameEngine.m5e("Loading mod selection");
        for (String str : GameEngine.getGameEngine().settingsEngine.modSettings.split(",")) {
            String[] split2 = str.split("\\|");
            if (split2.length != 3) {
                GameEngine.m5e("loadSelection: wrong count (" + split2.length + "):" + str);
            } else {
                String str2 = split2[0];
                String str3 = split2[1];
                String str4 = split2[2];
                if (str4.equals("enabled")) {
                    z = false;
                } else if (str4.equals("disabled")) {
                    z = true;
                } else {
                    GameEngine.m5e("loadSelection: Unknown option:" + str);
                }
                b c = c(str3);
                if (c == null) {
                    GameEngine.m5e("loadSelection: Did not find mod in settings:" + str2);
                } else {
                    c.f = z;
                    c.i = true;
                }
            }
        }
    }

    public b c(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.e.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public int d(String str) {
        if (str == null) {
            return 0;
        }
        int i = 0;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            if (str.equals(((b) it.next()).c())) {
                i++;
            }
        }
        return i;
    }

    public b a(int i) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.L == i) {
                return bVar;
            }
        }
        return null;
    }

    public void g() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            ((b) it.next()).f = true;
        }
    }

    public int h() {
        int i = 0;
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (!bVar.f || bVar.D) {
                i++;
            }
        }
        return i;
    }

    public b e(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.d.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public b f(String str) {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.a().equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    public b a(String str, String str2, String str3, String str4, boolean z, boolean z2, boolean z3, int i) {
        b c = c(str4);
        if (c == null) {
            c = new b();
            c.c = str;
            c.d = str2;
            c.e = str4;
            c.f = !z;
        }
        if (c.q == null && str3 != null) {
            c.q = str3;
            c.p = c.q;
            c.n();
            if (c.q != null && c.q.toLowerCase(Locale.ROOT).contains("rwmod")) {
                c.j = true;
            }
        }
        c.x = i;
        c.l = true;
        c.y = z2;
        c.z = z3;
        if (!c.z) {
            c.o = "Storage: " + a.d(c.q);
        }
        c.r();
        synchronized (this.d) {
            if (!this.e.contains(c)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.e);
                arrayList.add(c);
                Collections.sort(arrayList);
                this.e = arrayList;
            }
        }
        return c;
    }

    public void a(b bVar) {
        synchronized (this.d) {
            ArrayList arrayList = new ArrayList();
            arrayList.addAll(this.e);
            arrayList.remove(bVar);
            this.e = arrayList;
        }
    }

    public void a(String str, boolean z, boolean z2) {
        GameEngine.m5e("loading mod custom units at:" + str);
        String[] h = a.h(str);
        if (h == null) {
            GameEngine.print("getAllModList: ERROR");
            GameEngine.print("getAllModList: Failed to load:" + str);
            return;
        }
        for (String str2 : h) {
            String str3 = str + "/" + str2;
            if (a.f(str3) || str2.endsWith(".ini")) {
                String e = f.e(str2);
                String str4 = str2;
                if (str4.contains("/")) {
                    str4 = str4.substring(str2.lastIndexOf("/") + 1);
                }
                a(str4, str2, str3, e, z, false, z2, 0);
            }
        }
    }

    public ArrayList i() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m()) {
                arrayList.addAll(bVar.q());
            }
        }
        return arrayList;
    }

    public ArrayList j() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            if (bVar.m()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    public ArrayList k() {
        Iterator it = this.e.iterator();
        while (it.hasNext()) {
            b bVar = (b) it.next();
            bVar.l = false;
            if (bVar.m) {
                bVar.l = true;
            }
        }
        SteamEngine steamEngine = SteamEngine.getSteamEngine();
        if (steamEngine != null) {
            steamEngine.l();
        } else {
            GameEngine.m5e("getAllModList: SteamEngine==null");
        }
        String m = ag.m();
        if (!a.f(m)) {
            GameEngine.m5e("Modded Custom '" + m + "' directory not found");
        } else {
            a(m, true, false);
        }
        String k = ag.k();
        if (!a.f(k)) {
            GameEngine.m5e("Modded Custom '" + k + "' directory not found");
        } else {
            a(k, false, true);
        }
        String l = ag.l();
        if (!a.f(l)) {
            GameEngine.m5e("Modded Custom '" + l + "' directory not found");
        } else {
            a(l, true, true);
        }
        Iterator it2 = this.e.iterator();
        while (it2.hasNext()) {
            b bVar2 = (b) it2.next();
            if (!bVar2.l) {
                GameEngine.m5e("Removing mod no longer found on system: " + bVar2.a());
                a(bVar2);
            }
        }
        GameEngine.m5e("========= Mods ===========");
        GameEngine.m5e("Number of mods:" + this.e.size());
        Iterator it3 = this.e.iterator();
        while (it3.hasNext()) {
            GameEngine.m5e("Mod: '" + ((b) it3.next()).a());
        }
        GameEngine.m5e("================================");
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.settingsEngine.lastModCount == -1 || gameEngine.settingsEngine.modSettingsVersion < 1) {
            GameEngine.m5e("Disabling all new mods for first/new load");
            Iterator it4 = this.e.iterator();
            while (it4.hasNext()) {
                ((b) it4.next()).f = true;
            }
            e();
            gameEngine.settingsEngine.save();
        } else if (this.e.size() > gameEngine.settingsEngine.lastModCount + 4) {
            GameEngine.m5e("Too many new mods found, not enabling new mods");
            GameEngine.m5e("Number of mods:" + this.e.size() + " vs " + gameEngine.settingsEngine.lastModCount);
            Iterator it5 = this.e.iterator();
            while (it5.hasNext()) {
                b bVar3 = (b) it5.next();
                if (!bVar3.i) {
                    bVar3.f = true;
                }
            }
            e();
            gameEngine.settingsEngine.save();
        }
        gameEngine.settingsEngine.lastModCount = this.e.size();
        return this.e;
    }

    public void l() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            gameEngine.br = true;
            gameEngine.e();
            a(false, false);
            gameEngine.x();
        } finally {
            gameEngine.br = false;
        }
    }

    public void a(boolean z, boolean z2) {
        GameEngine.getGameEngine();
        ae.b();
        if (!z2) {
            Iterator it = this.e.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                if (bVar.R != null) {
                    GameEngine.m5e("re-enabling mod: " + bVar.a());
                }
                bVar.R = null;
                bVar.V.clear();
                bVar.S = null;
                bVar.U.clear();
                bVar.C = false;
                bVar.D = false;
                bVar.E = 0;
                bVar.F = 0;
                bVar.G = 0L;
                bVar.H = 0L;
                bVar.I = 0;
                bVar.J = 0;
                bVar.w = 0;
            }
        }
        k();
        ArrayList arrayList = new ArrayList(l.d);
        if (!z2) {
            ag.h();
        } else {
            ag.b();
        }
        if (z) {
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                l lVar = (l) it2.next();
                if (lVar.J != null && !lVar.J.f && lVar.J.R != null && l.a(lVar) == null) {
                    GameEngine.m5e("Was missing: " + lVar.M);
                    l.d.add(lVar);
                    i++;
                }
            }
            if (i > 0) {
                ag.e();
            }
        }
        l.A();
        PlayerData.P();
        InterfaceEngine.K();
    }

    public void m() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.dH != null) {
            gameEngine.dH.d();
        } else {
            GameEngine.m5e("No active callbacks");
        }
    }

    public String[] a(String[] strArr, String str) {
        String[] a2;
        GameEngine.m5e("addExtraMapsForPath: " + str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        if (GameEngine.at() && "/SD/rusted_warfare_maps".equals(str) && (a2 = a.a("/SD/rustedWarfare/maps", true)) != null) {
            int length = a2.length;
            for (int i = 0; i < length; i++) {
                arrayList.add("NEW_PATH|maps2/" + a2[i]);
            }
        }
        Iterator it = g(str).iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            arrayList.add("MOD|" + cVar.c.e + "/" + cVar.b);
        }
        if (strArr == null && arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public ArrayList g(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f.iterator();
        while (it.hasNext()) {
            c cVar = (c) it.next();
            boolean z = false;
            if (str.startsWith("mod/") && str.startsWith("mod/" + cVar.c.e)) {
                z = true;
            }
            if (!cVar.c.f && str.startsWith("/SD/rusted_warfare_maps")) {
                z = true;
            }
            if (z) {
                GameEngine.m5e("Adding extra map:" + cVar.a);
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    public void n() {
        this.f.clear();
    }

    public void a(String str, b bVar) {
        c cVar = new c(this);
        cVar.a = str;
        cVar.c = bVar;
        if (bVar.q == null) {
            GameEngine.a("Skipping:" + str + " as mod sourceFolder is null");
            return;
        }
        String str2 = str;
        String str3 = bVar.q;
        if (str2.startsWith(str3)) {
            str2 = str2.substring(str3.length());
        } else {
            String o = a.o(str2);
            if (o.startsWith(str3)) {
                str2 = o.substring(str3.length());
                GameEngine.m5e("Mod path:" + bVar.q + " in map path without tag:" + str2);
            } else {
                GameEngine.a("Mod path:" + bVar.q + " not in map path:" + str2);
            }
        }
        cVar.b = str2;
        bVar.A = true;
        bVar.F++;
        this.f.add(cVar);
    }

    public b h(String str) {
        if (str.contains("MOD|")) {
            String[] split = str.split("/");
            if (split.length >= 2) {
                for (int length = split.length - 2; length >= 0; length--) {
                    String str2 = split[length];
                    if (str2.startsWith("MOD|")) {
                        String substring = str2.substring("MOD|".length());
                        b c = c(substring);
                        if (c == null) {
                            GameEngine.m5e("getLinkedModForFile: Failed to find mod with hash:" + substring);
                            return null;
                        }
                        return c;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}