package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/g.class */
public final class g {
    final String a;
    public static ArrayList b = new ArrayList();
    public static final g[] c = new g[0];
    public static final h d = new h(c);

    private g(String str) {
        this.a = str;
    }

    public String toString() {
        return this.a;
    }

    public static h a(String str) {
        return a(str, (h) null);
    }

    public static h a(String str, h hVar) {
        if (str == null) {
            return hVar;
        }
        if (str.trim().equals(VariableScope.nullOrMissingString)) {
            return hVar;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                g c2 = c(trim);
                if (!arrayList.contains(c2)) {
                    arrayList.add(c2);
                }
            }
        }
        if (arrayList.size() == 0) {
            return hVar;
        }
        return new h((g[]) arrayList.toArray(new g[0]));
    }

    public static g b(String str) {
        String trim = str.trim();
        if (trim.contains(",")) {
            throw new bo("Expected single tag, got:" + trim);
        }
        return c(trim);
    }

    public static g c(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        Iterator it = b.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            if (gVar.a.equals(lowerCase)) {
                return gVar;
            }
        }
        g gVar2 = new g(lowerCase);
        b.add(gVar2);
        return gVar2;
    }

    public static void a(h hVar, GameOutputStream gameOutputStream) {
        g[] gVarArr;
        if (hVar == null) {
            gameOutputStream.writeIsString((String) null);
        } else if (hVar.a.length == 0) {
            gameOutputStream.writeIsString(VariableScope.nullOrMissingString);
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (g gVar : hVar.a) {
                if (!z) {
                    sb.append(",");
                }
                z = false;
                sb.append(gVar.a);
            }
            gameOutputStream.writeIsString(sb.toString());
        }
    }

    public static h a(GameInputStream gameInputStream) {
        String isReadString = gameInputStream.isReadString();
        if (isReadString == null) {
            return null;
        }
        return a(isReadString, d);
    }

    public static boolean a(h hVar, h hVar2) {
        if (hVar2 == null) {
            return false;
        }
        g[] gVarArr = hVar.a;
        g[] gVarArr2 = hVar2.a;
        for (g gVar : gVarArr) {
            for (g gVar2 : gVarArr2) {
                if (gVar == gVar2) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean a(g gVar, h hVar) {
        if (hVar == null) {
            return false;
        }
        for (g gVar2 : hVar.a) {
            if (gVar2 == gVar) {
                return true;
            }
        }
        return false;
    }

    public static boolean b(h hVar, h hVar2) {
        if (hVar2 == null) {
            if (hVar == null || hVar.b() == 0) {
                return true;
            }
            return false;
        }
        g[] gVarArr = hVar.a;
        g[] gVarArr2 = hVar2.a;
        int length = gVarArr2.length;
        for (g gVar : gVarArr) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (gVar != gVarArr2[i]) {
                        i++;
                    } else {
                        z = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z) {
                return false;
            }
        }
        return true;
    }
}