package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/a.class */
public class C0447a {

    /* renamed from: a */
    static final Pattern f2850a = Pattern.compile("\\$\\{([^\\}]*)\\}");

    /* renamed from: b */
    static final Pattern f2851b = Pattern.compile("[A-Za-z_][A-Za-z_.0-9]*");

    /* renamed from: c */
    static C0448b f2852c = new C0448b();

    /* renamed from: a */
    public static void m3702a(C0458l c0458l, C1107ab c1107ab) {
        int i = 0;
        f2852c.m3701a();
        Iterator it = c1107ab.m658d("@global ").iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Iterator it2 = c1107ab.m639k(str, "@global ").iterator();
            while (it2.hasNext()) {
                String str2 = (String) it2.next();
                String trim = str2.substring("@global ".length()).trim();
                try {
                    C0452e.m3686a(trim);
                    if (c1107ab.m651f(trim)) {
                        throw new C0417bo("[" + str + "]" + str2 + ": A section already has that name");
                    }
                    String m653e = c1107ab.m653e(str, str2);
                    if (m653e.contains("${")) {
                        throw new C0417bo("[" + str + "]" + str2 + " has dynamic value: '" + m653e + "', this is not yet supported");
                    }
                    f2852c.f2853a.m3687a(trim, m653e);
                } catch (C0417bo e) {
                    throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
                }
            }
        }
        ArrayList arrayList = new ArrayList();
        LinkedHashMap m659d = c1107ab.m659d();
        for (String str3 : m659d.keySet()) {
            if (str3 != null && !str3.startsWith("comment_") && !str3.startsWith("template_")) {
                C0448b m3698b = f2852c.m3698b();
                Iterator it3 = c1107ab.m639k(str3, "@define ").iterator();
                while (it3.hasNext()) {
                    String str4 = (String) it3.next();
                    String trim2 = str4.substring("@define ".length()).trim();
                    try {
                        C0452e.m3686a(trim2);
                        if (c1107ab.m651f(trim2)) {
                            throw new C0417bo("[" + str3 + "]" + str4 + ": A section already has that name");
                        }
                        String m653e2 = c1107ab.m653e(str3, str4);
                        if (m653e2.contains("${")) {
                            throw new C0417bo("[" + str3 + "]" + str4 + " has dynamic value: '" + m653e2 + "', this is not yet supported");
                        }
                        m3698b.f2854b.m3687a(trim2, m653e2);
                    } catch (C0417bo e2) {
                        throw new C0417bo("[" + str3 + "]" + str4 + ": " + e2.getMessage());
                    }
                }
                Map map = (Map) m659d.get(str3);
                for (String str5 : map.keySet()) {
                    String str6 = (String) map.get(str5);
                    if (str6 != null && str6.contains("${")) {
                        int i2 = 0;
                        StringBuffer stringBuffer = new StringBuffer();
                        Matcher matcher = f2850a.matcher(str6);
                        while (matcher.find()) {
                            i2++;
                            if (i2 > 100) {
                                throw new C0417bo("[" + str3 + "]" + str5 + ": Too many loops while parsing");
                            }
                            String group = matcher.group(1);
                            i++;
                            try {
                                String m3700a = m3698b.m3700a(c0458l, c1107ab, str3, group);
                                if (!group.equals(m3700a)) {
                                }
                                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(m3700a));
                            } catch (C0417bo e3) {
                                e3.printStackTrace();
                                throw new C0417bo("[" + str3 + "]" + str5 + ": " + e3.getMessage());
                            }
                        }
                        matcher.appendTail(stringBuffer);
                        arrayList.add(new C0450c(str3, str5, stringBuffer.toString()));
                    }
                }
                continue;
            }
        }
        Iterator it4 = arrayList.iterator();
        while (it4.hasNext()) {
            C0450c c0450c = (C0450c) it4.next();
            c1107ab.m652e(c0450c.f2858a, c0450c.f2859b, c0450c.f2860c);
        }
        arrayList.clear();
    }
}