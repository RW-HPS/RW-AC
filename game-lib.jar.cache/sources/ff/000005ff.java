package com.corrodinggames.rts.gameFramework.utility;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.C0352aj;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0405bc;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0468u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
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

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ab.class */
public class C1107ab {

    /* renamed from: g */
    private static final Pattern f7037g = Pattern.compile("\\p{C}");

    /* renamed from: h */
    private static final Pattern f7038h = Pattern.compile("\\s*\\[([^]]*)\\]\\s*");

    /* renamed from: i */
    private static final Pattern f7039i = Pattern.compile("\\s*([^=:]*)(?:=|:)(.*)");

    /* renamed from: a */
    String f7040a;

    /* renamed from: k */
    private boolean f7041k;

    /* renamed from: f */
    public String f7042f;

    /* renamed from: j */
    private LinkedHashMap f7043j = new LinkedHashMap();

    /* renamed from: b */
    boolean f7044b = true;

    /* renamed from: c */
    LinkedHashSet f7045c = new LinkedHashSet();

    /* renamed from: d */
    public ArrayList f7046d = new ArrayList();

    /* renamed from: e */
    public ArrayList f7047e = new ArrayList();

    /* renamed from: a */
    public void m708a() {
        this.f7041k = true;
        this.f7044b = false;
    }

    /* renamed from: a */
    public void m692a(String str, String str2) {
        m679a(str, str2, "Unknown");
    }

    /* renamed from: a */
    public void m679a(String str, String str2, String str3) {
        if (this.f7044b) {
            this.f7045c.add(str + ":" + str2);
        }
    }

    /* renamed from: b */
    public void m672b() {
        if (!this.f7044b) {
            throw new RuntimeException("Not tracking reads");
        }
        for (String str : this.f7043j.keySet()) {
            if (str == null || !str.startsWith("template_")) {
                boolean z = false;
                String str2 = null;
                Map map = (Map) this.f7043j.get(str);
                for (String str3 : map.keySet()) {
                    if (str3 == null || (!str3.startsWith("@define ") && !str3.startsWith("@global "))) {
                        if (!this.f7045c.contains(str + ":" + str3)) {
                            if (!"IGNORE".equals((String) map.get(str3)) && str2 == null) {
                                if (str3 != null && str3.trim().equals(VariableScope.nullOrMissingString)) {
                                    str2 = this.f7040a + " Found line in [" + str + "] with no key name.";
                                } else {
                                    str2 = this.f7040a + ": The key '[" + str + "]" + str3 + "' was not used. (hint: make sure it's valid and in the right section)";
                                }
                            }
                        } else {
                            z = true;
                        }
                    }
                }
                if (str2 != null) {
                    if (z || this.f7043j.size() == 1) {
                        throw new RuntimeException(str2);
                    }
                    throw new RuntimeException(this.f7040a + ": No keys in section: [" + str + "] were used (is this section named correctly?)");
                }
            }
        }
    }

    /* renamed from: c */
    public int m665c() {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("MD5");
            for (String str : this.f7043j.keySet()) {
                Map map = (Map) this.f7043j.get(str);
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

    public C1107ab(String str) {
        this.f7040a = "ini";
        this.f7040a = str;
        this.f7042f = str;
        m697a(str);
    }

    public C1107ab(InputStream inputStream, String str) {
        this.f7040a = "ini";
        this.f7040a = str;
        m698a(inputStream);
    }

    /* renamed from: a */
    public void m697a(String str) {
        m699a(new BufferedReader(new FileReader(str)));
    }

    /* renamed from: a */
    public void m698a(InputStream inputStream) {
        m699a(new BufferedReader(new InputStreamReader(inputStream, "UTF-8")));
    }

    /* JADX WARN: Removed duplicated region for block: B:102:0x0117 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x011a A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void m699a(BufferedReader bufferedReader) {
        int i = 0;
        String str = null;
        boolean z = false;
        String str2 = VariableScope.nullOrMissingString;
        boolean z2 = false;
        while (true) {
            try {
                String readLine = bufferedReader.readLine();
                String str3 = readLine;
                if (readLine != null) {
                    i++;
                    if (str3.startsWith("\ufeff")) {
                        str3 = str3.substring(1);
                    }
                    String trim = str3.trim();
                    boolean z3 = false;
                    if (z || !trim.startsWith("#")) {
                        if (C0773f.m2143c(str3, "\"\"\"")) {
                            int i2 = 0;
                            if (!z && str3.trim().startsWith("\"\"\"")) {
                                z2 = true;
                            }
                            while (true) {
                                int indexOf = str3.indexOf("\"\"\"", i2);
                                if (indexOf == -1) {
                                    break;
                                }
                                str2 = str2 + str3.substring(i2, indexOf);
                                i2 = indexOf + 3;
                                z = !z;
                            }
                            str2 = str2 + str3.substring(i2, str3.length());
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
                                        if (C0773f.m2143c(str3, "[")) {
                                            Matcher matcher = f7038h.matcher(str3);
                                            if (matcher.matches()) {
                                                str = matcher.group(1).trim();
                                            }
                                        }
                                        if (str == null || !str.startsWith("comment_")) {
                                            Matcher matcher2 = f7039i.matcher(str3);
                                            if (matcher2.matches()) {
                                                if (str == null) {
                                                    GameEngine.print("IniFile: " + this.f7040a + "  line " + i + " is not in a [section]:'" + str3 + "'");
                                                    this.f7047e.add("Line " + i + " is not in a [section]: '" + str3 + "'");
                                                } else {
                                                    String trim2 = matcher2.group(1).trim();
                                                    String group = matcher2.group(2);
                                                    if (!z3) {
                                                        group = group.trim();
                                                    }
                                                    if (trim2.equals(VariableScope.nullOrMissingString)) {
                                                        throw new IOException(this.f7040a + ": Unexpected format on line " + i + ": Key cannot be empty for line '" + str3 + "'");
                                                    }
                                                    LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7043j.get(str);
                                                    if (linkedHashMap == null) {
                                                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                                                        linkedHashMap = linkedHashMap2;
                                                        this.f7043j.put(str, linkedHashMap2);
                                                    }
                                                    if (linkedHashMap.get(trim2) != null) {
                                                        this.f7046d.add(new C1108ac(str, trim2));
                                                    }
                                                    linkedHashMap.put(trim2, group);
                                                }
                                            } else if (f7037g.matcher(str3).find()) {
                                                if (str3.length() != 1) {
                                                    throw new IOException(this.f7040a + ": Unexpected format on line:" + i + ": '" + str3.replaceAll("\\p{C}", "?") + "' in ini file (hint: This line might have hidden unicode)");
                                                }
                                            } else {
                                                GameEngine.print(this.f7040a + ": Unexpected format on line:" + i + ": '" + str3 + "' in ini file");
                                                this.f7047e.add(str3);
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
                    throw new IOException(this.f7040a + ": End of file while in multi-line string (hint: You are likely missing a closing \"\"\")");
                } else {
                    return;
                }
            } finally {
                bufferedReader.close();
            }
        }
    }

    /* renamed from: a */
    private String m674a(String str, String str2, boolean z, String str3) {
        String m675a = m675a(str, str2, z);
        if (m675a != null) {
            m679a(str, str2, str3);
        }
        return m675a;
    }

    /* renamed from: b */
    public String m669b(String str, String str2) {
        Map map = (Map) this.f7043j.get(str);
        if (map == null) {
            return null;
        }
        return (String) map.get(str2);
    }

    /* renamed from: a */
    private String m675a(String str, String str2, boolean z) {
        Map map = (Map) this.f7043j.get(str);
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

    /* renamed from: a */
    public String m677a(String str, String str2, String str3, String str4) {
        String m666b = m666b(str, str2, (String) null);
        String m666b2 = m666b(str, str3, (String) null);
        if (m666b == null || m666b2 == null) {
            return m666b != null ? m666b : m666b2 != null ? m666b2 : str4;
        }
        throw new RuntimeException("[" + str + "]Cannot set " + str2 + " and " + str3 + " at the same time");
    }

    /* renamed from: a */
    public Boolean m678a(String str, String str2, String str3, Boolean bool) {
        String m677a = m677a(str, str2, str3, (String) null);
        if (m677a == null) {
            return bool;
        }
        if (m677a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m677a.equalsIgnoreCase("false")) {
            return false;
        }
        if (m677a.equalsIgnoreCase("1")) {
            return true;
        }
        if (m677a.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m677a + "' in section:" + str);
    }

    /* renamed from: a */
    public Boolean m685a(String str, String str2, Boolean bool) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return bool;
        }
        if (m666b.equalsIgnoreCase("true")) {
            return true;
        }
        if (m666b.equalsIgnoreCase("false")) {
            return false;
        }
        if (m666b.equalsIgnoreCase("1")) {
            return true;
        }
        if (m666b.equalsIgnoreCase("0")) {
            return false;
        }
        throw new RuntimeException(str2 + ": unexpected boolean value:'" + m666b + "' in section:" + str);
    }

    /* renamed from: c */
    public void m662c(String str, String str2) {
        throw new RuntimeException("Could not find " + str2 + " in configuration file in section:" + str);
    }

    /* renamed from: d */
    public boolean m657d(String str, String str2) {
        Boolean m685a = m685a(str, str2, (Boolean) null);
        if (m685a == null) {
            m662c(str, str2);
        }
        return m685a.booleanValue();
    }

    /* renamed from: e */
    public String m653e(String str, String str2) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            m662c(str, str2);
        }
        return m666b;
    }

    /* renamed from: b */
    public String m666b(String str, String str2, String str3) {
        String m674a = m674a(str, str2, true, "string");
        if (m674a == null) {
            return str3;
        }
        if (m674a.contains("%{") && m674a.contains("}")) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Doesn't support dynamic %{} sections");
        }
        return m674a;
    }

    /* renamed from: c */
    public String m660c(String str, String str2, String str3) {
        String m674a = m674a(str, str2, true, "string");
        if (m674a == null) {
            return str3;
        }
        return m674a;
    }

    /* renamed from: f */
    public String m650f(String str, String str2) {
        String m660c = m660c(str, str2, (String) null);
        if (m660c == null) {
            m662c(str, str2);
        }
        return m660c;
    }

    /* renamed from: b */
    public static String m670b(String str) {
        if (str == null) {
            return null;
        }
        return C0773f.m2181a(str, "\\n", "\n");
    }

    /* renamed from: a */
    public C0352aj m701a(C0458l c0458l, String str, String str2, String str3) {
        C0404bb m676a = m676a(str, str2, str3, true);
        if (m676a == null) {
            return null;
        }
        try {
            return new C0352aj(c0458l, m676a);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new C0417bo("[" + str + "]" + str2 + ": " + e.getMessage());
        }
    }

    /* renamed from: a */
    public C0404bb m676a(String str, String str2, String str3, boolean z) {
        String m666b;
        String m653e;
        if (z) {
            m666b = m660c(str, str2, (String) null);
        } else {
            m666b = m666b(str, str2, (String) null);
        }
        if (m666b == null) {
            if (str3 == null) {
                return null;
            }
            m666b = str3;
        }
        String m670b = m670b(m666b);
        C0404bb c0404bb = new C0404bb();
        if (m670b != null && m670b.startsWith("i:")) {
            c0404bb.f2509e = m670b.substring("i:".length());
            c0404bb.f2509e = c0404bb.f2509e.trim();
            C0855a.m1714a(c0404bb.f2509e, new Object[0]);
            return c0404bb;
        }
        ArrayList arrayList = new ArrayList();
        C0405bc c0405bc = new C0405bc();
        c0405bc.f2510a = null;
        c0405bc.f2511b = m670b;
        arrayList.add(c0405bc);
        String str4 = str2 + "_";
        Iterator it = m639k(str, str4).iterator();
        while (it.hasNext()) {
            String str5 = (String) it.next();
            String lowerCase = str5.substring(str4.length()).toLowerCase(Locale.ROOT);
            if (z) {
                m653e = m650f(str, str5);
            } else {
                m653e = m653e(str, str5);
            }
            String m670b2 = m670b(m653e);
            C0405bc c0405bc2 = new C0405bc();
            c0405bc2.f2510a = lowerCase;
            c0405bc2.f2511b = m670b2;
            arrayList.add(c0405bc2);
        }
        c0404bb.f2506b = (C0405bc[]) arrayList.toArray(new C0405bc[0]);
        c0404bb.m3910b();
        return c0404bb;
    }

    /* renamed from: a */
    public LogicBoolean m707a(C0458l c0458l, String str, String str2) {
        try {
            return LogicBoolean.create(c0458l, m653e(str, str2), null);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public LogicBoolean m704a(C0458l c0458l, String str, String str2, LogicBoolean logicBoolean) {
        try {
            return LogicBoolean.create(c0458l, m666b(str, str2, (String) null), logicBoolean);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: b */
    public LogicBoolean m671b(C0458l c0458l, String str, String str2, LogicBoolean logicBoolean) {
        return m703a(c0458l, str, str2, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: c */
    public LogicBoolean m664c(C0458l c0458l, String str, String str2, LogicBoolean logicBoolean) {
        return m703a(c0458l, str, str2, logicBoolean, LogicBoolean.ReturnType.number);
    }

    /* renamed from: a */
    public LogicBoolean m703a(C0458l c0458l, String str, String str2, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        return m695a(m666b(str, str2, (String) null), c0458l, str, str2, logicBoolean, returnType);
    }

    /* renamed from: a */
    public static LogicBoolean m696a(String str, C0458l c0458l, String str2, String str3, LogicBoolean logicBoolean) {
        return m695a(str, c0458l, str2, str3, logicBoolean, LogicBoolean.ReturnType.unit);
    }

    /* renamed from: a */
    public static LogicBoolean m695a(String str, C0458l c0458l, String str2, String str3, LogicBoolean logicBoolean, LogicBoolean.ReturnType returnType) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            if (returnType == LogicBoolean.ReturnType.number && C0773f.m2098r(str)) {
                return LogicBoolean.StaticValueBoolean.getStaticNumber(str);
            }
            if (str.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
                str = str.substring("unitref ".length()).trim();
            }
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(c0458l, str, false);
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

    /* renamed from: a */
    public C0453g m687a(String str, String str2, C0453g c0453g) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0453g;
        }
        if (m666b.trim().equals(VariableScope.nullOrMissingString)) {
            return c0453g;
        }
        if (m666b.contains(",")) {
            throw new C0417bo("[" + str + "]" + str2 + ": Expected single tag, got:" + m666b);
        }
        return C0453g.m3677c(m666b);
    }

    /* renamed from: a */
    public C0454h m705a(C0458l c0458l, String str, String str2, C0454h c0454h) {
        return C0453g.m3680a(m666b(str, str2, (String) null), c0454h);
    }

    /* renamed from: a */
    public C0468u m702a(C0458l c0458l, String str, String str2, C0468u c0468u) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0468u;
        }
        return c0458l.m3525c(m666b, str2, str);
    }

    /* renamed from: a */
    public C0433a m706a(C0458l c0458l, String str, String str2, C0433a c0433a, boolean z) {
        C0433a m3779a;
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return c0433a;
        }
        if (z && (m3779a = C0433a.m3779a(m666b)) != null) {
            return m3779a;
        }
        C0433a m3508k = c0458l.m3508k(m666b);
        if (m3508k == null) {
            throw new BooleanParseException("[" + str + "]" + str2 + ": Could not find custom resource type of:" + m666b);
        }
        return m3508k;
    }

    /* renamed from: a */
    public Integer m681a(String str, String str2, Integer num) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return num;
        }
        if (m666b.equals(VariableScope.nullOrMissingString)) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color: ''");
        }
        try {
            return Integer.valueOf(Color.m5242a(m666b));
        } catch (IllegalArgumentException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Unknown color:" + m666b);
        }
    }

    /* renamed from: g */
    public int m647g(String str, String str2) {
        String m674a = m674a(str, str2, false, "int");
        try {
            return Integer.parseInt(m674a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m674a);
        }
    }

    /* renamed from: a */
    public Short m680a(String str, String str2, Short sh) {
        String m674a = m674a(str, str2, true, "short");
        if (m674a == null) {
            return sh;
        }
        try {
            return Short.valueOf(Short.parseShort(m674a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m674a);
        }
    }

    /* renamed from: b */
    public Integer m667b(String str, String str2, Integer num) {
        String m674a = m674a(str, str2, true, "int");
        if (m674a == null) {
            return num;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m674a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static integer: " + m674a);
        }
    }

    /* renamed from: a */
    public Float m683a(String str, String str2, Float f) {
        String m674a = m674a(str, str2, true, "float");
        if (m674a == null) {
            return f;
        }
        try {
            return Float.valueOf(Float.parseFloat(m674a));
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Not a static float: " + m674a);
        }
    }

    /* renamed from: a */
    public PointF m689a(String str, String str2, PointF pointF) {
        String m674a = m674a(str, str2, true, "point");
        if (m674a == null) {
            return pointF;
        }
        if (m674a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m674a.split(",");
            if (split.length != 2) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2");
            }
            PointF pointF2 = new PointF();
            pointF2.x = Float.parseFloat(split[0]);
            pointF2.y = Float.parseFloat(split[1]);
            return pointF2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m674a + " in key:" + str2 + " section:" + str + " expected format: x,y");
        }
    }

    /* renamed from: a */
    public C1115ai m686a(String str, String str2, C1115ai c1115ai) {
        String m674a = m674a(str, str2, true, "point3d");
        if (m674a == null) {
            return c1115ai;
        }
        if (m674a.equalsIgnoreCase("NONE")) {
            return null;
        }
        try {
            String[] split = m674a.split(",");
            if (split.length != 2 && split.length != 3) {
                throw new NumberFormatException("Got:" + split.length + " elements expected 2 or 3");
            }
            C1115ai c1115ai2 = new C1115ai();
            c1115ai2.f7064a = Float.parseFloat(split[0]);
            c1115ai2.f7065b = Float.parseFloat(split[1]);
            if (split.length > 2) {
                c1115ai2.f7066c = Float.parseFloat(split[2]);
            }
            return c1115ai2;
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read point:" + m674a + " in key:" + str2 + " section:" + str + " expected format: x,y,[height]");
        }
    }

    /* renamed from: h */
    public Float m645h(String str, String str2) {
        Float m668b = m668b(str, str2, (Float) null);
        if (m668b == null) {
            throw new RuntimeException("Could not find key:" + str2 + " in section:" + str);
        }
        return m668b;
    }

    /* renamed from: b */
    public Float m668b(String str, String str2, Float f) {
        return m682a(str, str2, f, false);
    }

    /* renamed from: c */
    public Float m661c(String str, String str2, Float f) {
        Float m682a = m682a(str, str2, (Float) null, false);
        if (m682a == null) {
            return f;
        }
        return Float.valueOf(m682a.floatValue() * 16.666666f);
    }

    /* renamed from: a */
    public Float m682a(String str, String str2, Float f, boolean z) {
        String m674a = m674a(str, str2, true, "time");
        if (m674a == null) {
            return f;
        }
        try {
            return Float.valueOf(m673a(m674a, z, str, str2));
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read time:" + m674a + " in key:" + str2 + " section:" + str + " expected a float with optional 's' or 'ms' postfix");
        }
    }

    /* renamed from: d */
    public Float m656d(String str, String str2, Float f) {
        return m682a(str, str2, f, true);
    }

    /* renamed from: a */
    public static float m673a(String str, boolean z, String str2, String str3) {
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

    /* renamed from: i */
    public float m643i(String str, String str2) {
        String m674a = m674a(str, str2, false, "float");
        try {
            return Float.parseFloat(m674a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m674a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: j */
    public double m641j(String str, String str2) {
        String m674a = m674a(str, str2, false, "double");
        try {
            return Double.parseDouble(m674a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m674a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public double m691a(String str, String str2, double d) {
        String m674a = m674a(str, str2, true, "double");
        if (m674a == null) {
            return d;
        }
        try {
            return Double.parseDouble(m674a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("Failed to read float:" + m674a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: a */
    public long m690a(String str, String str2, long j) {
        String m674a = m674a(str, str2, true, "long");
        if (m674a == null) {
            return j;
        }
        try {
            return Long.parseLong(m674a);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read long:" + m674a + " in key:" + str2 + " section:" + str);
        }
    }

    /* renamed from: d */
    public void m655d(String str, String str2, String str3) {
        if (this.f7041k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7043j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f7043j.put(str, linkedHashMap);
        }
        if (linkedHashMap.get(str2) == null) {
            linkedHashMap.put(str2, str3);
        }
    }

    /* renamed from: e */
    public void m652e(String str, String str2, String str3) {
        if (this.f7041k) {
            throw new RuntimeException("locked changes");
        }
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.f7043j.get(str);
        if (linkedHashMap == null) {
            linkedHashMap = new LinkedHashMap();
            this.f7043j.put(str, linkedHashMap);
        }
        linkedHashMap.put(str2, str3);
    }

    /* renamed from: a */
    public void m700a(C1107ab c1107ab) {
        if (this.f7041k) {
            throw new RuntimeException("locked changes");
        }
        for (String str : c1107ab.f7043j.keySet()) {
            LinkedHashMap linkedHashMap = (LinkedHashMap) c1107ab.f7043j.get(str);
            if (!m685a(str, "@copyFrom_skipThisSection", (Boolean) false).booleanValue()) {
                LinkedHashMap linkedHashMap2 = (LinkedHashMap) this.f7043j.get(str);
                if (linkedHashMap2 == null) {
                    linkedHashMap2 = new LinkedHashMap();
                    this.f7043j.put(str, linkedHashMap2);
                }
                for (String str2 : linkedHashMap.keySet()) {
                    if (linkedHashMap2.get(str2) == null) {
                        linkedHashMap2.put(str2, linkedHashMap.get(str2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public Rect m688a(String str, String str2, Rect rect) {
        String m666b = m666b(str, str2, (String) null);
        if (m666b == null) {
            return rect;
        }
        String[] split = m666b.split(",");
        if (split.length != 4) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect: expected 4 ints, not:" + split.length);
        }
        try {
            return new Rect(Integer.valueOf(split[0].trim()).intValue(), Integer.valueOf(split[1].trim()).intValue(), Integer.valueOf(split[2].trim()).intValue(), Integer.valueOf(split[3].trim()).intValue());
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": getRect expected ints got: " + m666b);
        }
    }

    /* renamed from: a */
    public Enum m684a(String str, String str2, Enum r8, Class cls) {
        try {
            return m693a(m666b(str, str2, (String) null), r8, cls);
        } catch (C0417bo e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static Enum m693a(String str, Enum r4, Class cls) {
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
        throw m694a(trim, cls);
    }

    /* renamed from: a */
    private static RuntimeException m694a(String str, Class cls) {
        String str2 = VariableScope.nullOrMissingString;
        for (Object obj : cls.getEnumConstants()) {
            Enum r0 = (Enum) obj;
            if (!str2.equals(VariableScope.nullOrMissingString)) {
                str2 = str2 + ",";
            }
            str2 = str2 + r0.name();
        }
        throw new C0417bo("Unknown value: " + str + " (Expected: " + C0773f.m2157b(str2, 100) + ")");
    }

    /* renamed from: c */
    public C1136m m663c(String str) {
        C1136m c1136m = new C1136m();
        for (String str2 : this.f7043j.keySet()) {
            if (((Map) this.f7043j.get(str2)).get(str) != null) {
                c1136m.add(str2);
            }
        }
        return c1136m;
    }

    /* renamed from: d */
    public C1136m m658d(String str) {
        C1136m c1136m = new C1136m();
        for (String str2 : this.f7043j.keySet()) {
            Map map = (Map) this.f7043j.get(str2);
            Iterator it = map.keySet().iterator();
            while (true) {
                if (it.hasNext()) {
                    String str3 = (String) it.next();
                    if (str3.startsWith(str) && !"IGNORE".equals(map.get(str3))) {
                        c1136m.add(str2);
                        break;
                    }
                }
            }
        }
        return c1136m;
    }

    /* renamed from: d */
    public LinkedHashMap m659d() {
        return this.f7043j;
    }

    /* renamed from: k */
    public C1136m m639k(String str, String str2) {
        C1136m c1136m = new C1136m();
        Map map = (Map) this.f7043j.get(str);
        if (map != null) {
            for (String str3 : map.keySet()) {
                if (str3.startsWith(str2) && !"IGNORE".equals(map.get(str3))) {
                    c1136m.add(str3);
                }
            }
        }
        return c1136m;
    }

    /* renamed from: f */
    public C1136m m649f(String str, String str2, String str3) {
        C1136m c1136m = new C1136m();
        Map map = (Map) this.f7043j.get(str);
        if (map != null) {
            for (String str4 : map.keySet()) {
                if (str4.startsWith(str2) || str4.startsWith(str3)) {
                    c1136m.add(str4);
                }
            }
        }
        return c1136m;
    }

    /* renamed from: l */
    public boolean m638l(String str, String str2) {
        Map map = (Map) this.f7043j.get(str);
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

    /* renamed from: e */
    public C1136m m654e(String str) {
        C1136m c1136m = new C1136m();
        for (String str2 : this.f7043j.keySet()) {
            if (str2.startsWith(str) && m648g(str2)) {
                c1136m.add(str2);
            }
        }
        return c1136m;
    }

    /* renamed from: m */
    public C1136m m637m(String str, String str2) {
        C1136m c1136m = new C1136m();
        for (String str3 : this.f7043j.keySet()) {
            if (str3.startsWith(str) || str3.startsWith(str2)) {
                if (m648g(str3)) {
                    c1136m.add(str3);
                }
            }
        }
        return c1136m;
    }

    /* renamed from: f */
    public boolean m651f(String str) {
        if (this.f7043j.get(str) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean m648g(String str) {
        Map map = (Map) this.f7043j.get(str);
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

    /* renamed from: n */
    public boolean m636n(String str, String str2) {
        if (m675a(str, str2, true) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public static boolean m646g(String str, String str2, String str3) {
        if (str3.equalsIgnoreCase("true")) {
            return true;
        }
        if (str3.equalsIgnoreCase("false")) {
            return false;
        }
        throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected boolean value:'" + str3 + "'");
    }

    /* renamed from: h */
    public static float m644h(String str, String str2, String str3) {
        try {
            return Float.parseFloat(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read float:" + str3);
        }
    }

    /* renamed from: i */
    public static int m642i(String str, String str2, String str3) {
        try {
            return Integer.parseInt(str3);
        } catch (NumberFormatException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": Failed to read int:" + str3);
        }
    }

    /* renamed from: j */
    public static C0453g m640j(String str, String str2, String str3) {
        String trim = str3.trim();
        if (trim.contains(",")) {
            throw new C0417bo("[" + str + "]" + str2 + ": Unexpected single tag, got:'" + trim + "'");
        }
        if (trim.contains("\"")) {
            throw new C0417bo("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains("'")) {
            throw new C0417bo("[" + str + "]" + str2 + ": tag cannot contain quote, got:'" + trim + "'");
        }
        if (trim.contains(" ")) {
            throw new C0417bo("[" + str + "]" + str2 + ": tag cannot contain space, got:'" + trim + "'");
        }
        return C0453g.m3677c(trim);
    }
}