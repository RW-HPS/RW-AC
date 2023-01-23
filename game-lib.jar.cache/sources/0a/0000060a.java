package com.corrodinggames.rts.gameFramework.utility;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/al.class */
public class al {
    public static ArrayList a(String str, String str2, String str3, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        char charAt2 = str3.charAt(0);
        int length = str2.length();
        int length2 = str3.length();
        int length3 = str.length();
        int i2 = 0;
        while (i2 < length3) {
            char charAt3 = str.charAt(i2);
            if (charAt3 == '(') {
                i++;
            } else if (charAt3 == ')') {
                i--;
            }
            if (i == 0) {
                if (charAt == charAt3 && ((length == 1 || str.indexOf(str2, i2) == i2) && (!z || (!b(str, i2 - 1) && !b(str, i2 + str2.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                } else if (charAt2 == charAt3 && ((length2 == 1 || str.indexOf(str3, i2) == i2) && (!z || (!b(str, i2 - 1) && !b(str, i2 + str3.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str3.length() - 1;
                }
                i2++;
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    public static ArrayList a(String str, String str2, boolean z, boolean z2) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        boolean z6 = false;
        if (str2.equals("-")) {
            z6 = true;
        }
        char c = 0;
        char c2 = 0;
        String str3 = str;
        if (z2) {
            str3 = str.toLowerCase(Locale.ROOT);
        }
        int i2 = 0;
        while (i2 < length2) {
            char charAt2 = str3.charAt(i2);
            char charAt3 = str.charAt(i2);
            if (c2 != ' ') {
                c = c2;
            }
            c2 = charAt2;
            boolean z7 = z3;
            z3 = false;
            if (!z7) {
                if (charAt2 == '\\') {
                    z3 = true;
                }
                if (!z5 && charAt2 == '\'') {
                    z4 = !z4;
                }
                if (!z4 && charAt2 == '\"') {
                    z5 = !z5;
                }
            }
            if (!(z4 || z5)) {
                if (charAt2 == '(') {
                    i++;
                } else if (charAt2 == ')') {
                    i--;
                }
                if (i == 0 && charAt == charAt2 && ((length == 1 || str3.indexOf(str2, i2) == i2) && ((!z || (!b(str, i2 - 1) && !b(str, i2 + str2.length()))) && (!z6 || (c != '*' && c != '/' && c != '+'))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    public static ArrayList a(String str, String str2, boolean z) {
        int i = 0;
        char[] cArr = new char[5];
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        int i2 = 0;
        while (i2 < length2) {
            char charAt2 = str.charAt(i2);
            char c = 0;
            char c2 = 0;
            if (charAt2 == '(') {
                c = '(';
            } else if (charAt2 == ')') {
                c2 = '(';
            } else if (charAt2 == '[') {
                c = '[';
            } else if (charAt2 == ']') {
                c2 = '[';
            }
            if (c != 0) {
                i++;
                if (i >= cArr.length) {
                    int length3 = cArr.length;
                    char[] cArr2 = new char[length3 + 5];
                    System.arraycopy(cArr, 0, cArr2, 0, length3);
                    cArr = cArr2;
                }
                cArr[i] = c;
            } else if (c2 != 0) {
                if (cArr[i] == c2) {
                    i--;
                } else {
                    GameEngine.m328e("Bad bracket order: '" + str + "' at index:" + i2 + " got " + c2 + " type expected: " + cArr[i]);
                }
            }
            if (i == 0) {
                boolean z2 = false;
                if (charAt == charAt2 && (length == 1 || str.indexOf(str2, i2) == i2)) {
                    z2 = true;
                }
                if (z2 && (!z || (!b(str, i2 - 1) && !b(str, i2 + str2.length())))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt2);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    public static String[] b(String str, String str2, boolean z) {
        return !str.contains(str2) ? new String[]{str} : (String[]) a(str, str2, z).toArray(new String[0]);
    }

    public static int a(String str, int i) {
        if (str.charAt(i) != '(') {
            GameEngine.print("getBracketEnd: Did not start on a bracket");
            return -1;
        } else if (i + 1 >= str.length()) {
            return -1;
        } else {
            int i2 = 1;
            for (int i3 = i + 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '(') {
                    i2++;
                } else if (charAt == ')') {
                    i2--;
                }
                if (i2 == 0) {
                    return i3;
                }
            }
            return -1;
        }
    }

    public static int a(String str) {
        char[] charArray;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (char c : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
                if (c == '\\') {
                    z = true;
                }
                if (!z3 && c == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c == '\"') {
                    z3 = !z3;
                }
            }
            if (!z2 && !z3) {
                if (c == '(') {
                    i++;
                } else if (c == ')') {
                    i--;
                }
            }
        }
        return i;
    }

    public static int b(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                i--;
            }
        }
        return i;
    }

    public static String[] a(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
                if (c2 == '\\') {
                    z = true;
                }
                if (!z3 && c2 == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c2 == '\"') {
                    z3 = !z3;
                }
            }
            if (c2 == c && !z2 && !z3 && !z2) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c2);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String[] b(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (c2 == '\\') {
                    z = true;
                } else if (c2 == c) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            }
            sb.append(c2);
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        if (arrayList.size() == 0) {
            arrayList.add(VariableScope.nullOrMissingString);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    public static String a(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (z) {
                z = false;
            } else {
                stringBuffer.append(",");
            }
            if (str.contains("\\")) {
                str = str.replace("\\", "\\\\");
            }
            if (str.contains(",")) {
                str = str.replace(",", "\\,");
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    public static int a(String str, String str2) {
        return a(str, str2, 0);
    }

    public static int a(String str, String str2, int i) {
        int i2 = 0;
        char charAt = str2.charAt(0);
        int length = str2.length();
        for (int i3 = i; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            if (charAt2 == '(') {
                i2++;
            } else if (charAt2 == ')') {
                i2--;
            }
            if (i2 == 0 && charAt == charAt2 && (length == 1 || str.indexOf(str2, i3) == i3)) {
                return i3;
            }
        }
        return -1;
    }

    public static int b(String str, String str2, int i) {
        int i2 = 0;
        char[] cArr = new char[5];
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        char charAt = str2.charAt(0);
        int length = str2.length();
        for (int i3 = i; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            boolean z4 = z;
            if (!z4) {
                z = charAt2 == '\\';
                if (!z3 && charAt2 == '\'') {
                    z2 = !z2;
                }
                if (!z2 && charAt2 == '\"') {
                    z3 = !z3;
                }
            }
            if (!(z2 || z3)) {
                int i4 = i2;
                char c = 0;
                char c2 = 0;
                if (charAt2 == '(') {
                    c = '(';
                } else if (charAt2 == ')') {
                    c2 = '(';
                } else if (charAt2 == '[') {
                    c = '[';
                } else if (charAt2 == ']') {
                    c2 = '[';
                }
                if (c != 0) {
                    i2++;
                    if (i2 >= cArr.length) {
                        int length2 = cArr.length;
                        char[] cArr2 = new char[length2 + 5];
                        System.arraycopy(cArr, 0, cArr2, 0, length2);
                        cArr = cArr2;
                    }
                    cArr[i2] = c;
                } else if (c2 != 0) {
                    if (cArr[i2] == c2) {
                        i2--;
                    } else {
                        GameEngine.m328e("Bad bracket order: '" + str + "' at index:" + i3 + " got " + c2 + " type expected: " + cArr[i2]);
                    }
                }
                if ((i4 == 0 || i2 == 0) && charAt == charAt2 && (length == 1 || str.indexOf(str2, i3) == i3)) {
                    return i3;
                }
            }
        }
        return -1;
    }

    public static boolean b(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        return Character.isLetter(charAt) || Character.isDigit(charAt);
    }

    public static int a(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int indexOf2 = str.indexOf(str3);
        if (indexOf == -1) {
            return indexOf2;
        }
        if (indexOf2 != -1 && indexOf >= indexOf2) {
            return indexOf2;
        }
        return indexOf;
    }

    public static int a(String str, int i, String[] strArr) {
        int i2 = -1;
        for (String str2 : strArr) {
            int a2 = a(str, str2, i);
            if (a2 != -1 && (i2 > a2 || i2 == -1)) {
                i2 = a2;
            }
        }
        return i2;
    }

    public static String c(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '-') {
                z = !z;
            } else if (charAt != '+' && charAt != ' ') {
                if (z) {
                    return "-" + str.substring(i);
                }
                if (i == 0) {
                    return str;
                }
                return str.substring(i);
            }
        }
        return str;
    }

    public static String[] b(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + str2.length())};
    }

    public static String[] c(String str, String str2) {
        int b = b(str, str2, 0);
        if (b == -1) {
            return null;
        }
        return new String[]{str.substring(0, b), str.substring(b + str2.length())};
    }

    public static final String d(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() < 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
    }

    public static String[] e(String str) {
        return b(str, ',');
    }
}