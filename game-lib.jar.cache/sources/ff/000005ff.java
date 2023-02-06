package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.bb;
import com.corrodinggames.rts.game.units.custom.bc;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.math.BigInteger;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ab.class */
public class ab {
    private static final Pattern g = Pattern.compile("\\p{C}");
    private static final Pattern h = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");
    private static final Pattern i = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");
    String a;
    private boolean k;
    public String f;
    private LinkedHashMap j = new LinkedHashMap();
    boolean b = true;
    LinkedHashSet c = new LinkedHashSet();
    public ArrayList d = new ArrayList();
    public ArrayList e = new ArrayList();

    public void a() {
        this.k = true;
        this.b = false;
    }

    public void a(String str, String str2) {
        a(str, str2, "Unknown");
    }

    public void a(String str, String str2, String str3) {
        if (this.b) {
            this.c.add(str + ":" + str2);
        }
    }

    public void b() {
        if (!this.b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.c.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                if (str3 != null && str3.trim().equals(VariableScope.nullOrMissingString)) {
                                    str2 = this.a + " Found line in [" + str + "] with no key name.";
                                } else {
                                    str2 = this.a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    public int c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.j.keySet()) {
                Map map = (Map) this.j.get(str);
                for (String str2 : map.keySet()) {
                    messageDigest.update((str + ":" + str2 + ":" + ((String) map.get(str2))).getBytes("UTF-8"));
                }
            }
            return new BigInteger(1, messageDigest.digest()).intValue();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException(e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException(e2);
        }
    }

    public ab(String str) {
        this.a = "ini";
        this.a = str;
        this.f = str;
        a(str);
    }

    public ab(InputStream inputStream, String str) {
        this.a = "ini";
        this.a = str;
        a(inputStream);
    }

    public void a(String str) {
        a(new BufferedReader(new FileReader(str)));
    }

    public void a(InputStream inputStream) {
        a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void a(BufferedReader bufferedReader) {
        int i2 = 0;
        String str = null;
        boolean z = false;
        String str2 = VariableScope.nullOrMissingString;
        boolean z2 = false;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                String str3 = readLine;
                if (readLine != null) {
                    i2++;
                    if (str3.startsWith("\ufeff")) {
                        str3 = str3.substring(1);
                    }
                    String trim = str3.trim();
                    boolean z3 = false;
                    if (z || !trim.startsWith("#")) {
                        if (com.corrodinggames.rts.gameFramework.f.c(str3, "\"\"\"")) {
                            int i3 = 0;
                            if (!z && str3.trim().startsWith("\"\"\"")) {
                                z2 = true;
                            }
                            while (true) {
                                int indexOf = str3.indexOf("\"\"\"", i3);
                                if (indexOf == -1) {
                                    break;
                                }
                                str2 = str2 + str3.substring(i3, indexOf);
                                i3 = indexOf + 3;
                                z = !z;
                            }
                            str2 = str2 + str3.substring(i3, str3.length());
                            if (!z) {
                                if (z2) {
                                    str2 = VariableScope.nullOrMissingString;
                                    z2 = false;
                                } else {
                                    str3 = str2;
                                    str2 = VariableScope.nullOrMissingString;
                                    z2 = false;
                                    z3 = true;
                                    if (trim.length() != 0) {
                                        if (com.corrodinggames.rts.gameFramework.f.c(str3, "[")) {
                                            Matcher matcher = h.matcher(str3);
                                            if (matcher.matches()) {
                                                str = matcher.group(1).trim();
                                            }
                                        }
                                        if (str == null || !str.startsWith("comment_")) {
                                            Matcher matcher2 = i.matcher(str3);
                                            if (matcher2.matches()) {
                                                if (str == null) {
                                                    GameEngine.print("IniFile: " + this.a + "  line " + i2 + " is not in a [section]:'" + str3 + "'");
                                                    this.e.add("Line " + i2 + " is not in a [section]: '" + str3 + "'");
                                                } else {
                                                    String trim2 = matcher2.group(1).trim();
                                                    String group = matcher2.group(2);
                                                    if (!z3) {
                                                        group = group.trim();
                                                    }
                                                    if (trim2.equals(VariableScope.nullOrMissingString)) {
                                                        throw new IOException(this.a + ": Unexpected format on line " + i2 + ": Key cannot be empty for line '" + str3 + "'");
                                                    }
                                                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.j.get(str);
                                                    if (linkedHashMap == null) {
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        linkedHashMap = linkedHashMap2;
                                                        this.j.put(str, linkedHashMap2);
                                                    }
                                                    if (linkedHashMap.get(trim2) != null) {
                                                        this.d.add(new ac(str, trim2));
                                                    }
                                                    linkedHashMap.put(trim2, group);
                                                }
                                            } else if (g.matcher(str3).find()) {
                                                if (str3.length() != 1) {
                                                    throw new IOException(this.a + ": Unexpected format on line:" + i2 + ": '" + str3.replaceAll("\\p{C}", "?") + "' in ini file (hint: This line might have hidden unicode)");
                                                }
                                            } else {
                                                GameEngine.print(this.a + ": Unexpected format on line:" + i2 + ": '" + str3 + "' in ini file");
                                                this.e.add(str3);
                                            }
                                        }
                                    }
                                }
                            }
                        } else if (z) {
                            str2 = str2 + str3;
                        } else if (trim.length() != 0) {
                        }
                    }
                } else if (z) {
                    throw new IOException(this.a + ": End of file while in multi-line string (hint: You are likely missing a closing \"\"\")");
                } else {
                    return;
                }
            } finally {
                bufferedReader.close();
            }
        }
    }

    private String a(String str, String str2, boolean z, String str3) {
        String a = a(str, str2, z);
        if (a != null) {
            a(str, str2, str3);
        }
        return a;
    }

    public String b(String str, String str2) {
        Map map = (Map) this.j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    private String a(String str, String str2, boolean z) {
        Map map = (Map) this.j.get(str);
        if (map == null) {
            if (!z) {
                throw new RuntimeException("Could not find section: [" + str + "] in configuration file");
            }
            return null;
        }
        String str3 = (String) map.get(str2);
        if (str3 == null) {
            if (!z) {
                throw new RuntimeException("Could not find: " + str2 + " in configuration file under [" + str + "]");
            }
            return null;
        } else if (str3.equals("IGNORE")) {
            if (!z) {
                throw new RuntimeException("Key: " + str2 + " under [" + str + "], is set to IGNORE but is required and has no default");
            }
            return null;
        } else {
            return str3;
        }
    }

    public String a(String str, String str2, String str3, String str4) {
        String b = b(str, str2, (String) null);
        String b2 = b(str, str3, (String) null);
        if (b == null || b2 == null) {
            return b != null ? b : b2 != null ? b2 : str4;
        }
        throw new RuntimeException("[" + str + "]Cannot set " + str2 + " and " + str3 + " at the same time");
    }

    public Boolean a(String str, String str2, String str3, Boolean bool) {
        String a = a(str, str2, str3, (String) null);
        if (a == null) {
            return bool;
        }
        if (a.equalsIgnoreCase("true")) {
            return true;
        }
        if (a.equalsIgnoreCase("false")) {
            return false;
        }
        if (a.equalsIgnoreCase("1")) {
            return true;
        }
        if (a.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + a + "' in section:" + str);
    }

    public Boolean a(String str, String str2, Boolean bool) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            return bool;
        }
        if (b.equalsIgnoreCase("true")) {
            return true;
        }
        if (b.equalsIgnoreCase("false")) {
            return false;
        }
        if (b.equalsIgnoreCase("1")) {
            return true;
        }
        if (b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + b + "' in section:" + str);
    }

    public void c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    public boolean d(String str, String str2) {
        Boolean a = a(str, str2, (Boolean) null);
        if (a == null) {
            c(str, str2);
        }
        return a.booleanValue();
    }

    public String e(String str, String str2) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            c(str, str2);
        }
        return b;
    }

    public String b(String str, String str2, String str3) {
        String a = a(str, str2, true, "string");
        if (a == null) {
            return str3;
        }
        if (a.contains("%{") && a.contains("}")) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Doesn't support dynamic %{} sections");
        }
        return a;
    }

    public String c(String str, String str2, String str3) {
        String a = a(str, str2, true, "string");
        if (a == null) {
            return str3;
        }
        return a;
    }

    public String f(String str, String str2) {
        String c = c(str, str2, (String) null);
        if (c == null) {
            c(str, str2);
        }
        return c;
    }

    public static String b(String str) {
        if (str == null) {
            return null;
        }
        return com.corrodinggames.rts.gameFramework.f.a(str, "\\n", "\n");
    }

    public com.corrodinggames.rts.game.units.custom.aj a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, String str3) {
        bb a = a(str, str2, str3, true);
        if (a == null) {
            return null;
        }
        try {
            return new com.corrodinggames.rts.game.units.custom.aj(lVar, a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    public bb a(String str, String str2, String str3, boolean z) {
        String b;
        String e;
        if (z) {
            b = c(str, str2, (String) null);
        } else {
            b = b(str, str2, (String) null);
        }
        if (b == null) {
            if (str3 == null) {
                return null;
            }
            b = str3;
        }
        String b2 = b(b);
        bb bbVar = new bb();
        if (b2 != null && b2.startsWith("i:")) {
            bbVar.e = b2.substring("i:".length());
            bbVar.e = bbVar.e.trim();
            com.corrodinggames.rts.gameFramework.translations.a.a(bbVar.e, new Object[0]);
            return bbVar;
        }
        ArrayList arrayList = new ArrayList();
        bc bcVar = new bc();
        bcVar.a = null;
        bcVar.b = b2;
        arrayList.add(bcVar);
        String str4 = str2 + "_";
        Iterator it = k(str, str4).iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
            if (z) {
                e = f(str, str5);
            } else {
                e = e(str, str5);
            }
            String b3 = b(e);
            bc bcVar2 = new bc();
            bcVar2.a = lowerCase;
            bcVar2.b = b3;
            arrayList.add(bcVar2);
        }
        bbVar.b = (bc[]) arrayList.toArray(new bc[0]);
        bbVar.b();
        return bbVar;
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2) {
        try {
            return LogicBoolean.create(lVar, e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(lVar, b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    public LogicBoolean b(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, LogicBoolean logicBoolean) {
        return a(lVar, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    public LogicBoolean c(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, LogicBoolean logicBoolean) {
        return a(lVar, str, str2, logicBoolean, LogicBoolean.ReturnType.number);
    }

    public LogicBoolean a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return a(b(str, str2, (String) null), lVar, str, str2, logicBoolean, returnType);
    }

    public static LogicBoolean a(String str, com.corrodinggames.rts.game.units.custom.l lVar, String str2, String str3, LogicBoolean logicBoolean) {
        return a(str, lVar, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    public static LogicBoolean a(String str, com.corrodinggames.rts.game.units.custom.l lVar, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (returnType == LogicBoolean.ReturnType.number && com.corrodinggames.rts.gameFramework.f.r(str)) {
                return LogicBoolean.StaticValueBoolean.getStaticNumber(str);
            }
            if (str.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                str = str.substring("unitref ".length()).trim();
            }
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(lVar, str, false);
            if (parseBooleanBlock == null) {
                return null;
            }
            LogicBoolean.ReturnType returnType2 = parseBooleanBlock.getReturnType();
            if (returnType2 != returnType) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Type mismatch. Expected type:" + returnType + " got:" + returnType2);
            }
            return parseBooleanBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public com.corrodinggames.rts.game.units.custom.g a(String str, String str2, com.corrodinggames.rts.game.units.custom.g gVar) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            return gVar;
        }
        if (b.trim().equals(VariableScope.nullOrMissingString)) {
            return gVar;
        }
        if (b.contains(",")) {
            throw new bo("[" + str + "]" + str2 + ": Expected single tag, got:" + b);
        }
        return com.corrodinggames.rts.game.units.custom.g.c(b);
    }

    public com.corrodinggames.rts.game.units.custom.h a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, com.corrodinggames.rts.game.units.custom.h hVar) {
        return com.corrodinggames.rts.game.units.custom.g.a(b(str, str2, (String) null), hVar);
    }

    public com.corrodinggames.rts.game.units.custom.u a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, com.corrodinggames.rts.game.units.custom.u uVar) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            return uVar;
        }
        return lVar.c(b, str2, str);
    }

    public com.corrodinggames.rts.game.units.custom.e.a a(com.corrodinggames.rts.game.units.custom.l lVar, String str, String str2, com.corrodinggames.rts.game.units.custom.e.a aVar, boolean z) {
        com.corrodinggames.rts.game.units.custom.e.a a;
        String b = b(str, str2, (String) null);
        if (b == null) {
            return aVar;
        }
        if (z && (a = com.corrodinggames.rts.game.units.custom.e.a.a(b)) != null) {
            return a;
        }
        com.corrodinggames.rts.game.units.custom.e.a k = lVar.k(b);
        if (k == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + b);
        }
        return k;
    }

    public Integer a(String str, String str2, Integer num) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            return num;
        }
        if (b.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.a(b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + b);
        }
    }

    public int g(String str, String str2) {
        String a = a(str, str2, false, "int");
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + a);
        }
    }

    public Short a(String str, String str2, Short sh) {
        String a = a(str, str2, true, "short");
        if (a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + a);
        }
    }

    public Integer b(String str, String str2, Integer num) {
        String a = a(str, str2, true, "int");
        if (a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + a);
        }
    }

    public Float a(String str, String str2, Float f) {
        String a = a(str, str2, true, "float");
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static float: " + a);
        }
    }

    public PointF a(String str, String str2, PointF pointF) {
        String a = a(str, str2, true, "point");
        if (a == null) {
            return pointF;
        }
        if (a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.x = Float.parseFloat(split[0]);
            pointF2.y = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    public ai a(String str, String str2, ai aiVar) {
        String a = a(str, str2, true, "point3d");
        if (a == null) {
            return aiVar;
        }
        if (a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = a.split(",");
            if (split.length != 2 && split.length != 3) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
            }
            ai aiVar2 = new ai();
            aiVar2.a = Float.parseFloat(split[0]);
            aiVar2.b = Float.parseFloat(split[1]);
            if (split.length > 2) {
                aiVar2.c = Float.parseFloat(split[2]);
            }
            return aiVar2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    public Float h(String str, String str2) {
        Float b = b(str, str2, (Float) null);
        if (b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return b;
    }

    public Float b(String str, String str2, Float f) {
        return a(str, str2, f, false);
    }

    public Float c(String str, String str2, Float f) {
        Float a = a(str, str2, (Float) null, false);
        if (a == null) {
            return f;
        }
        return Float.valueOf(a.floatValue() * 16.666666f);
    }

    public Float a(String str, String str2, Float f, boolean z) {
        String a = a(str, str2, true, "time");
        if (a == null) {
            return f;
        }
        try {
            return Float.valueOf(a(a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    public Float d(String str, String str2, Float f) {
        return a(str, str2, f, true);
    }

    public static float a(String str, boolean z, String str2, String str3) {
        float f;
        boolean z2 = false;
        if (str.endsWith("s")) {
            str = str.substring(0, str.length() - 1);
            f = 60.0f;
            z2 = true;
        } else {
            f = 1.0f;
        }
        try {
            float parseFloat = Float.parseFloat(str) * f;
            if (z) {
                if (z2) {
                    return 1.0f / parseFloat;
                }
                return parseFloat;
            }
            return parseFloat;
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": Failed to read time:" + str + " expected a float with optional 's' postfix");
        }
    }

    public float i(String str, String str2) {
        String a = a(str, str2, false, "float");
        try {
            return Float.parseFloat(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    public double j(String str, String str2) {
        String a = a(str, str2, false, "double");
        try {
            return Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    public double a(String str, String str2, double d) {
        String a = a(str, str2, true, "double");
        if (a == null) {
            return d;
        }
        try {
            return Double.parseDouble(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    public long a(String str, String str2, long j) {
        String a = a(str, str2, true, "long");
        if (a == null) {
            return j;
        }
        try {
            return Long.parseLong(a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + a + " in key:" + str2 + " section:" + str);
        }
    }

    public void d(String str, String str2, String str3) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    public void e(String str, String str2, String str3) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    public void a(ab abVar) {
        if (this.k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : abVar.j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) abVar.j.get(str);
            if (!a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.j.put(str, linkedHashMap2);
                }
                for (String str2 : linkedHashMap.keySet()) {
                    if (linkedHashMap2.get(str2) == null) {
                        linkedHashMap2.put(str2, linkedHashMap.get(str2));
                    }
                }
            }
        }
    }

    public Rect a(String str, String str2, Rect rect) {
        String b = b(str, str2, (String) null);
        if (b == null) {
            return rect;
        }
        String[] split = b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + b);
        }
    }

    public Enum a(String str, String str2, Enum r8, Class cls) {
        try {
            return a(b(str, str2, (String) null), r8, cls);
        } catch (bo e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    public static Enum a(String str, Enum r4, Class cls) {
        if (str == null) {
            return r4;
        }
        String trim = str.trim();
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (r0.name().equalsIgnoreCase(trim)) {
                return r0;
            }
        }
        throw a(trim, cls);
    }

    private static RuntimeException a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new bo("Unknown value: " + str + " (Expected: " + com.corrodinggames.rts.gameFramework.f.b(str2, 100) + ")");
    }

    public m c(String str) {
        m mVar = new m();
        for (String str2 : this.j.keySet()) {
            if (((Map) this.j.get(str2)).get(str) != null) {
                mVar.add(str2);
            }
        }
        return mVar;
    }

    public m d(String str) {
        m mVar = new m();
        for (String str2 : this.j.keySet()) {
            Map map = (Map) this.j.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        mVar.add(str2);
                        break;
                    }
                }
            }
        }
        return mVar;
    }

    public LinkedHashMap d() {
        return this.j;
    }

    public m k(String str, String str2) {
        m mVar = new m();
        Map map = (Map) this.j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2) && !"IGNORE".equals(map.get(str3))) {
                    mVar.add(str3);
                }
            }
        }
        return mVar;
    }

    public m f(String str, String str2, String str3) {
        m mVar = new m();
        Map map = (Map) this.j.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    mVar.add(str4);
                }
            }
        }
        return mVar;
    }

    public boolean l(String str, String str2) {
        Map map = (Map) this.j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2)) {
                    return true;
                }
            }
            return false;
        }
        return false;
    }

    public m e(String str) {
        m mVar = new m();
        for (String str2 : this.j.keySet()) {
            if (str2.startsWith(str) && g(str2)) {
                mVar.add(str2);
            }
        }
        return mVar;
    }

    public m m(String str, String str2) {
        m mVar = new m();
        for (String str3 : this.j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (g(str3)) {
                    mVar.add(str3);
                }
            }
        }
        return mVar;
    }

    public boolean f(String str) {
        if (this.j.get(str) != null) {
            return true;
        }
        return false;
    }

    public boolean g(String str) {
        Map map = (Map) this.j.get(str);
        if (map == null) {
            return false;
        }
        for (String str2 : map.keySet()) {
            if (str2 != null && !str2.startsWith("@")) {
                return true;
            }
        }
        return false;
    }

    public boolean n(String str, String str2) {
        if (a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    public static boolean g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    public static float h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    public static int i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    public static com.corrodinggames.rts.game.units.custom.g j(String str, String str2, String str3) {
        String trim = str3.trim();
        if (trim.contains(",")) {
            throw new bo("[" + str + "]" + str2 + ": Unexpected single tag, got:'" + trim + "'");
        }
        if (trim.contains("\"")) {
            throw new bo("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains("'")) {
            throw new bo("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains(" ")) {
            throw new bo("[" + str + "]" + str2 + ": tag cannot contain space, got:'" + trim + "'");
        }
        return com.corrodinggames.rts.game.units.custom.g.c(trim);
    }
}