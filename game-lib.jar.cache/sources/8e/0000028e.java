package com.corrodinggames.rts.game.units.custom.p023f;

import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.util.regex.Matcher;

/* renamed from: com.corrodinggames.rts.game.units.custom.f.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/b.class */
public class C0448b {

    /* renamed from: a */
    public C0451d f2853a;

    /* renamed from: b */
    public C0451d f2854b;

    public C0448b() {
        this.f2853a = new C0451d();
        this.f2854b = new C0451d();
    }

    public C0448b(C0451d c0451d, C0451d c0451d2) {
        this.f2853a = c0451d;
        this.f2854b = c0451d2;
    }

    /* renamed from: a */
    public void m3701a() {
        this.f2853a.m3689a();
        this.f2854b.m3689a();
    }

    /* renamed from: b */
    public C0448b m3698b() {
        return new C0448b(this.f2853a, new C0451d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.corrodinggames.rts.game.units.custom.f.b$1] */
    /* renamed from: a */
    public static double m3699a(final String str) {
        return new Object() { // from class: com.corrodinggames.rts.game.units.custom.f.b.1

            /* renamed from: a */
            int f2855a = -1;

            /* renamed from: b */
            int f2856b;

            /* renamed from: a */
            void m3695a() {
                int i = this.f2855a + 1;
                this.f2855a = i;
                this.f2856b = i < str.length() ? str.charAt(this.f2855a) : '\uffff';
            }

            /* renamed from: a */
            boolean m3694a(int i) {
                while (this.f2856b == 32) {
                    m3695a();
                }
                if (this.f2856b == i) {
                    m3695a();
                    return true;
                }
                return false;
            }

            /* renamed from: b */
            double m3693b() {
                m3695a();
                double m3692c = m3692c();
                if (this.f2855a < str.length()) {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2856b));
                }
                return m3692c;
            }

            /* renamed from: c */
            double m3692c() {
                double m3691d = m3691d();
                while (true) {
                    double d = m3691d;
                    if (m3694a(43)) {
                        m3691d = d + m3691d();
                    } else if (!m3694a(45)) {
                        return d;
                    } else {
                        m3691d = d - m3691d();
                    }
                }
            }

            /* renamed from: d */
            double m3691d() {
                double m3690e = m3690e();
                while (true) {
                    double d = m3690e;
                    if (m3694a(42)) {
                        m3690e = d * m3690e();
                    } else if (m3694a(47)) {
                        m3690e = d / m3690e();
                    } else if (!m3694a(37)) {
                        return d;
                    } else {
                        m3690e = d % m3690e();
                    }
                }
            }

            /* renamed from: e */
            double m3690e() {
                double d;
                if (m3694a(43)) {
                    return m3690e();
                }
                if (m3694a(45)) {
                    return -m3690e();
                }
                int i = this.f2855a;
                if (m3694a(40)) {
                    d = m3692c();
                    m3694a(41);
                } else if ((this.f2856b >= 48 && this.f2856b <= 57) || this.f2856b == 46) {
                    while (true) {
                        if ((this.f2856b < 48 || this.f2856b > 57) && this.f2856b != 46) {
                            break;
                        }
                        m3695a();
                    }
                    d = Double.parseDouble(str.substring(i, this.f2855a));
                } else if (this.f2856b >= 97 && this.f2856b <= 122) {
                    while (this.f2856b >= 97 && this.f2856b <= 122) {
                        m3695a();
                    }
                    String substring = str.substring(i, this.f2855a);
                    double m3690e = m3690e();
                    if (substring.equals("sqrt")) {
                        d = Math.sqrt(m3690e);
                    } else if (substring.equals("sin")) {
                        d = Math.sin(Math.toRadians(m3690e));
                    } else if (substring.equals("cos")) {
                        d = Math.cos(Math.toRadians(m3690e));
                    } else if (substring.equals("tan")) {
                        d = Math.tan(Math.toRadians(m3690e));
                    } else if (!substring.equals("int")) {
                        throw new RuntimeException("Unknown function: " + substring);
                    } else {
                        d = (int) m3690e;
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + ((char) this.f2856b));
                }
                if (m3694a(94)) {
                    d = Math.pow(d, m3690e());
                }
                return d;
            }
        }.m3693b();
    }

    /* renamed from: b */
    public boolean m3696b(String str) {
        return str.contains("*") || str.contains("/") || str.contains("+") || str.contains("-") || str.contains("(") || str.contains(")") || str.contains("^") || str.contains("%");
    }

    /* renamed from: a */
    public String m3700a(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        String trim = str2.trim();
        boolean m3696b = m3696b(trim);
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = C0447a.f2851b.matcher(trim);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                throw new C0417bo("Too many loops while parsing");
            }
            String group = matcher.group(0);
            if (!C0773f.m2098r(group) && !group.equals("int") && !group.equals("cos") && !group.equals("sin") && !group.equals("sqrt")) {
                String m3697b = m3697b(c0458l, c1107ab, str, group);
                if (m3696b && !C0773f.m2098r(m3697b)) {
                    throw new C0417bo("Cannot do maths on '" + m3697b + "' from " + group + " (not a number)");
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(m3697b));
            }
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        if (m3696b) {
            stringBuffer2 = C0773f.m2176b(m3699a(stringBuffer2));
        }
        return stringBuffer2;
    }

    /* renamed from: b */
    public String m3697b(C0458l c0458l, C1107ab c1107ab, String str, String str2) {
        if (str2.contains(".")) {
            String[] m2145c = C0773f.m2145c(str2, '.');
            if (m2145c.length != 2) {
                throw new C0417bo("Unexpected key format: " + str2);
            }
            String str3 = m2145c[0];
            String str4 = m2145c[1];
            if (str3.equals("section")) {
                str3 = str;
            }
            String m666b = c1107ab.m666b(str3, str4, (String) null);
            if (m666b == null) {
                if (str3.equalsIgnoreCase("self")) {
                    throw new C0417bo("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file. Hint: You might have wanted % instead of $ for a dynamic string");
                }
                throw new C0417bo("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file");
            } else if (m666b.contains("${")) {
                throw new C0417bo("Reference [" + str3 + "]" + str4 + " is dynamic, chaining is not yet supported");
            } else {
                return m666b;
            }
        }
        String m3688a = this.f2854b.m3688a(str2);
        if (m3688a != null) {
            return m3688a;
        }
        String m3688a2 = this.f2853a.m3688a(str2);
        if (m3688a2 != null) {
            return m3688a2;
        }
        throw new C0417bo("Could not find variable with name: " + str2);
    }
}