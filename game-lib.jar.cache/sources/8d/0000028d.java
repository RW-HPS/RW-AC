package com.corrodinggames.rts.game.units.custom.f;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/a.class */
public class a {
    static final Pattern a = Pattern.compile("\\$\\{([^\\}]*)\\}");
    static final Pattern b = Pattern.compile("[A-Za-z_][A-Za-z_.0-9]*");
    static b c = new b();

    public static void a(l lVar, ab abVar) {
        int i = 0;
        c.a();
        Iterator it = abVar.d("@global ").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = abVar.k(str, "@global ").iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                String trim = str2.substring("@global ".length()).trim();
                try {
                    e.a(trim);
                    if (abVar.f(trim)) {
                        throw new bo("[" + str + "]" + str2 + ": A section already has that name");
                    }
                    String e = abVar.e(str, str2);
                    if (e.contains("${")) {
                        throw new bo("[" + str + "]" + str2 + " has dynamic value: '" + e + "', this is not yet supported");
                    }
                    c.a.a(trim, e);
                } catch (bo e2) {
                    throw new bo("[" + str + "]" + str2 + ": " + e2.getMessage());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap d = abVar.d();
        for (String str3 : d.keySet()) {
            if (str3 != null && !str3.startsWith("comment_") && !str3.startsWith("template_")) {
                b b2 = c.b();
                Iterator it3 = abVar.k(str3, "@define ").iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    String trim2 = str4.substring("@define ".length()).trim();
                    try {
                        e.a(trim2);
                        if (abVar.f(trim2)) {
                            throw new bo("[" + str3 + "]" + str4 + ": A section already has that name");
                        }
                        String e3 = abVar.e(str3, str4);
                        if (e3.contains("${")) {
                            throw new bo("[" + str3 + "]" + str4 + " has dynamic value: '" + e3 + "', this is not yet supported");
                        }
                        b2.b.a(trim2, e3);
                    } catch (bo e4) {
                        throw new bo("[" + str3 + "]" + str4 + ": " + e4.getMessage());
                    }
                }
                Map map = (Map) d.get(str3);
                for (String str5 : map.keySet()) {
                    String str6 = (String) map.get(str5);
                    if (str6 != null && str6.contains("${")) {
                        int i2 = 0;
                        StringBuffer stringBuffer = new StringBuffer();
                        Matcher matcher = a.matcher(str6);
                        while (matcher.find()) {
                            i2++;
                            if (i2 > 100) {
                                throw new bo("[" + str3 + "]" + str5 + ": Too many loops while parsing");
                            }
                            String group = matcher.group(1);
                            i++;
                            try {
                                String a2 = b2.a(lVar, abVar, str3, group);
                                if (!group.equals(a2)) {
                                }
                                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(a2));
                            } catch (bo e5) {
                                e5.printStackTrace();
                                throw new bo("[" + str3 + "]" + str5 + ": " + e5.getMessage());
                            }
                        }
                        matcher.appendTail(stringBuffer);
                        arrayList.add(new c(str3, str5, stringBuffer.toString()));
                    }
                }
                continue;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            c cVar = (c) it4.next();
            abVar.e(cVar.a, cVar.b, cVar.c);
        }
        arrayList.clear();
    }
}