package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/g.class */
public final class C0453g {

    /* renamed from: a */
    final String f2862a;

    /* renamed from: b */
    public static ArrayList f2863b = new ArrayList();

    /* renamed from: c */
    public static final C0453g[] f2864c = new C0453g[0];

    /* renamed from: d */
    public static final C0454h f2865d = new C0454h(f2864c);

    private C0453g(String str) {
        this.f2862a = str;
    }

    public String toString() {
        return this.f2862a;
    }

    /* renamed from: a */
    public static C0454h m3681a(String str) {
        return m3680a(str, (C0454h) null);
    }

    /* renamed from: a */
    public static C0454h m3680a(String str, C0454h c0454h) {
        if (str == null) {
            return c0454h;
        }
        if (str.trim().equals(VariableScope.nullOrMissingString)) {
            return c0454h;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : str.split(",")) {
            String trim = str2.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                C0453g m3677c = m3677c(trim);
                if (!arrayList.contains(m3677c)) {
                    arrayList.add(m3677c);
                }
            }
        }
        if (arrayList.size() == 0) {
            return c0454h;
        }
        return new C0454h((C0453g[]) arrayList.toArray(new C0453g[0]));
    }

    /* renamed from: b */
    public static C0453g m3678b(String str) {
        String trim = str.trim();
        if (trim.contains(",")) {
            throw new C0417bo("Expected single tag, got:" + trim);
        }
        return m3677c(trim);
    }

    /* renamed from: c */
    public static C0453g m3677c(String str) {
        String lowerCase = str.trim().toLowerCase(Locale.ROOT);
        Iterator it = f2863b.iterator();
        while (it.hasNext()) {
            C0453g c0453g = (C0453g) it.next();
            if (c0453g.f2862a.equals(lowerCase)) {
                return c0453g;
            }
        }
        C0453g c0453g2 = new C0453g(lowerCase);
        f2863b.add(c0453g2);
        return c0453g2;
    }

    /* renamed from: a */
    public static void m3683a(C0454h c0454h, GameOutputStream gameOutputStream) {
        C0453g[] c0453gArr;
        if (c0454h == null) {
            gameOutputStream.writeIsString((String) null);
        } else if (c0454h.f2866a.length == 0) {
            gameOutputStream.writeIsString(VariableScope.nullOrMissingString);
        } else {
            StringBuilder sb = new StringBuilder();
            boolean z = true;
            for (C0453g c0453g : c0454h.f2866a) {
                if (!z) {
                    sb.append(",");
                }
                z = false;
                sb.append(c0453g.f2862a);
            }
            gameOutputStream.writeIsString(sb.toString());
        }
    }

    /* renamed from: a */
    public static C0454h m3682a(GameInputStream gameInputStream) {
        String isReadString = gameInputStream.isReadString();
        if (isReadString == null) {
            return null;
        }
        return m3680a(isReadString, f2865d);
    }

    /* renamed from: a */
    public static boolean m3684a(C0454h c0454h, C0454h c0454h2) {
        if (c0454h2 == null) {
            return false;
        }
        C0453g[] c0453gArr = c0454h.f2866a;
        C0453g[] c0453gArr2 = c0454h2.f2866a;
        for (C0453g c0453g : c0453gArr) {
            for (C0453g c0453g2 : c0453gArr2) {
                if (c0453g == c0453g2) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public static boolean m3685a(C0453g c0453g, C0454h c0454h) {
        if (c0454h == null) {
            return false;
        }
        for (C0453g c0453g2 : c0454h.f2866a) {
            if (c0453g2 == c0453g) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static boolean m3679b(C0454h c0454h, C0454h c0454h2) {
        if (c0454h2 == null) {
            if (c0454h == null || c0454h.m3674b() == 0) {
                return true;
            }
            return false;
        }
        C0453g[] c0453gArr = c0454h.f2866a;
        C0453g[] c0453gArr2 = c0454h2.f2866a;
        int length = c0453gArr2.length;
        for (C0453g c0453g : c0453gArr) {
            boolean z = false;
            int i = 0;
            while (true) {
                if (i < length) {
                    if (c0453g != c0453gArr2[i]) {
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