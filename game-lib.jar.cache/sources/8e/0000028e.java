package com.corrodinggames.rts.game.units.custom.f;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.regex.Matcher;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/f/b.class */
public class b {
    public d a;
    public d b;

    public b() {
        this.a = new d();
        this.b = new d();
    }

    public b(d dVar, d dVar2) {
        this.a = dVar;
        this.b = dVar2;
    }

    public void a() {
        this.a.a();
        this.b.a();
    }

    public b b() {
        return new b(this.a, new d());
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.corrodinggames.rts.game.units.custom.f.b$1] */
    public static double a(final String str) {
        return new Object() { // from class: com.corrodinggames.rts.game.units.custom.f.b.1
            int a = -1;
            int b;

            void a() {
                int i = this.a + 1;
                this.a = i;
                this.b = i < str.length() ? str.charAt(this.a) : '\uffff';
            }

            boolean a(int i) {
                while (this.b == 32) {
                    a();
                }
                if (this.b == i) {
                    a();
                    return true;
                }
                return false;
            }

            double b() {
                a();
                double c = c();
                if (this.a < str.length()) {
                    throw new RuntimeException("Unexpected: " + ((char) this.b));
                }
                return c;
            }

            double c() {
                double d = d();
                while (true) {
                    double d2 = d;
                    if (a(43)) {
                        d = d2 + d();
                    } else if (!a(45)) {
                        return d2;
                    } else {
                        d = d2 - d();
                    }
                }
            }

            double d() {
                double e = e();
                while (true) {
                    double d = e;
                    if (a(42)) {
                        e = d * e();
                    } else if (a(47)) {
                        e = d / e();
                    } else if (!a(37)) {
                        return d;
                    } else {
                        e = d % e();
                    }
                }
            }

            double e() {
                double d;
                if (a(43)) {
                    return e();
                }
                if (a(45)) {
                    return -e();
                }
                int i = this.a;
                if (a(40)) {
                    d = c();
                    a(41);
                } else if ((this.b >= 48 && this.b <= 57) || this.b == 46) {
                    while (true) {
                        if ((this.b < 48 || this.b > 57) && this.b != 46) {
                            break;
                        }
                        a();
                    }
                    d = Double.parseDouble(str.substring(i, this.a));
                } else if (this.b >= 97 && this.b <= 122) {
                    while (this.b >= 97 && this.b <= 122) {
                        a();
                    }
                    String substring = str.substring(i, this.a);
                    double e = e();
                    if (substring.equals("sqrt")) {
                        d = Math.sqrt(e);
                    } else if (substring.equals("sin")) {
                        d = Math.sin(Math.toRadians(e));
                    } else if (substring.equals("cos")) {
                        d = Math.cos(Math.toRadians(e));
                    } else if (substring.equals("tan")) {
                        d = Math.tan(Math.toRadians(e));
                    } else if (!substring.equals("int")) {
                        throw new RuntimeException("Unknown function: " + substring);
                    } else {
                        d = (int) e;
                    }
                } else {
                    throw new RuntimeException("Unexpected: " + ((char) this.b));
                }
                if (a(94)) {
                    d = Math.pow(d, e());
                }
                return d;
            }
        }.b();
    }

    public boolean b(String str) {
        return str.contains("*") || str.contains("/") || str.contains("+") || str.contains("-") || str.contains("(") || str.contains(")") || str.contains("^") || str.contains("%");
    }

    public String a(l lVar, ab abVar, String str, String str2) {
        String trim = str2.trim();
        boolean b = b(trim);
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = a.b.matcher(trim);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                throw new bo("Too many loops while parsing");
            }
            String group = matcher.group(0);
            if (!f.r(group) && !group.equals("int") && !group.equals("cos") && !group.equals("sin") && !group.equals("sqrt")) {
                String b2 = b(lVar, abVar, str, group);
                if (b && !f.r(b2)) {
                    throw new bo("Cannot do maths on '" + b2 + "' from " + group + " (not a number)");
                }
                matcher.appendReplacement(stringBuffer, Matcher.quoteReplacement(b2));
            }
        }
        matcher.appendTail(stringBuffer);
        String stringBuffer2 = stringBuffer.toString();
        if (b) {
            stringBuffer2 = f.b(a(stringBuffer2));
        }
        return stringBuffer2;
    }

    public String b(l lVar, ab abVar, String str, String str2) {
        if (str2.contains(".")) {
            String[] c = f.c(str2, '.');
            if (c.length != 2) {
                throw new bo("Unexpected key format: " + str2);
            }
            String str3 = c[0];
            String str4 = c[1];
            if (str3.equals("section")) {
                str3 = str;
            }
            String b = abVar.b(str3, str4, (String) null);
            if (b == null) {
                if (str3.equalsIgnoreCase("self")) {
                    throw new bo("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file. Hint: You might have wanted % instead of $ for a dynamic string");
                }
                throw new bo("Static $ block: Could not find: [" + str3 + "]" + str4 + " in this conf file");
            } else if (b.contains("${")) {
                throw new bo("Reference [" + str3 + "]" + str4 + " is dynamic, chaining is not yet supported");
            } else {
                return b;
            }
        }
        String a = this.b.a(str2);
        if (a != null) {
            return a;
        }
        String a2 = this.a.a(str2);
        if (a2 != null) {
            return a2;
        }
        throw new bo("Could not find variable with name: " + str2);
    }
}