package com.corrodinggames.rts.gameFramework.translations;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SettingsEngine;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.UnsupportedEncodingException;
import java.text.FieldPosition;
import java.text.MessageFormat;
import java.util.Locale;
import java.util.MissingResourceException;
import java.util.PropertyResourceBundle;
import java.util.ResourceBundle;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.h.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/a.class */
public final class a {

    /* renamed from: a */
    static ResourceBundle f542a;
    static boolean b;
    public static String d;
    public static int c = 0;
    static Pattern e = Pattern.compile("(.*)(\\(.*\\)( *\\[by.*\\])?)");
    static final Pattern f = Pattern.compile("\\[i:([^\\]]*?)\\]");

    public static void a() {
        e();
    }

    static ResourceBundle b() {
        if (f542a == null) {
            e();
        }
        return f542a;
    }

    static PropertyResourceBundle a(String str) {
        j k = com.corrodinggames.rts.gameFramework.file.a.k("translations/" + str);
        if (k == null) {
            return null;
        }
        PropertyResourceBundle propertyResourceBundle = null;
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(k, "UTF-8");
            propertyResourceBundle = new PropertyResourceBundle(inputStreamReader);
            inputStreamReader.close();
        } catch (UnsupportedEncodingException e2) {
            e2.printStackTrace();
        } catch (IOException e3) {
            e3.printStackTrace();
        }
        return propertyResourceBundle;
    }

    public static String a(String str, Locale locale, boolean z, boolean z2) {
        String str2;
        String str3;
        if (locale == Locale.ROOT) {
            return str;
        }
        String language = locale.getLanguage();
        if (z) {
            str2 = locale.getCountry();
        } else {
            str2 = VariableScope.nullOrMissingString;
        }
        if (z2) {
            str3 = locale.getVariant();
        } else {
            str3 = VariableScope.nullOrMissingString;
        }
        if (language.equals(VariableScope.nullOrMissingString) && str2.equals(VariableScope.nullOrMissingString) && str3.equals(VariableScope.nullOrMissingString)) {
            return str;
        }
        StringBuilder sb = new StringBuilder(str);
        sb.append('_');
        if (!str3.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT)).append('_').append(str3.toLowerCase(Locale.ROOT));
        } else if (!str2.equals(VariableScope.nullOrMissingString)) {
            sb.append(language).append('_').append(str2.toLowerCase(Locale.ROOT));
        } else {
            sb.append(language);
        }
        return sb.toString();
    }

    static ResourceBundle a(String str, Locale locale) {
        String str2 = a(str, Locale.ROOT, false, false) + ".properties";
        PropertyResourceBundle a2 = a(str2);
        if (a2 == null) {
            throw new RuntimeException("Root locate file:" + str2 + " is missing, it is required");
        }
        if (Locale.ROOT.equals(locale)) {
            GameEngine.m2e("Locale: Using " + str2 + " as locale");
            return a2;
        }
        String str3 = a(str, locale, true, true) + ".properties";
        PropertyResourceBundle a3 = a(str3);
        if (a3 == null) {
            GameEngine.m2e("Locale: No locale for " + str3 + " checking locale without variant ");
            str3 = a(str, locale, true, false) + ".properties";
            a3 = a(str3);
            if (a3 == null) {
                GameEngine.m2e("Locale: No locale for " + str3 + " checking locale without variant or country");
                str3 = a(str, locale, false, false) + ".properties";
                a3 = a(str3);
                if (a3 == null) {
                    GameEngine.m2e("Locale: No locale for " + str3 + " using base locale");
                    return a2;
                }
            }
        }
        GameEngine.m2e("Locale: Using " + str3 + " as locale");
        return new b(a3, a2);
    }

    public static String c() {
        if (d != null) {
            return d;
        }
        return d().getLanguage();
    }

    public static Locale d() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.settingsEngine;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (z) {
            return Locale.ROOT;
        }
        return Locale.getDefault();
    }

    public static synchronized void e() {
        c++;
        GameEngine gameEngine = GameEngine.getGameEngine();
        SettingsEngine settingsEngine = null;
        if (gameEngine != null) {
            settingsEngine = gameEngine.settingsEngine;
        }
        boolean z = false;
        if (settingsEngine != null && settingsEngine.forceEnglish) {
            z = true;
        }
        if (f542a != null && b == z) {
            GameEngine.m2e("Locale.reload: skipping reload");
        }
        if (Build.VERSION.SDK_INT >= 9) {
            ResourceBundle.clearCache();
        }
        if (z) {
            GameEngine.m2e("Locale: forceEnglish");
            f542a = a("Strings", Locale.ROOT);
        } else if (d != null) {
            f542a = a("Strings", new Locale(d));
        } else if (settingsEngine != null && settingsEngine.overrideLanguageCode != null && !settingsEngine.overrideLanguageCode.equals(VariableScope.nullOrMissingString)) {
            f542a = a("Strings", new Locale(settingsEngine.overrideLanguageCode));
        } else {
            Locale locale = Locale.getDefault();
            GameEngine.m2e("Locale: default targetLocale:" + locale);
            if (locale != null) {
                GameEngine.m2e("Locale: default targetLocale ISO3:" + locale.getISO3Language());
            }
            f542a = a("Strings", locale);
        }
        b = z;
        if (0 != 0) {
        }
    }

    private static final String d(String str) {
        try {
            String string = b().getString(str);
            if (string.contains("[") || string.contains("]")) {
                string = string.replace("[[", "{{").replace("]]", "}}").replace("[", "{{").replace("]", "}}");
            }
            if (string.contains("{") || string.contains("}")) {
                string = string.replace("}}  {{", "}}{{").replace("}} {{", "}}{{").replace("}}{{", "\n-").replace("{{", "-").replace("}}", VariableScope.nullOrMissingString);
            }
            return string;
        } catch (NullPointerException e2) {
            throw new RuntimeException("NullPointer with key:" + str + " locale:" + b().getLocale().toString(), e2);
        }
    }

    private static final boolean e(String str) {
        try {
            b().getString(str);
            return true;
        } catch (MissingResourceException e2) {
            return false;
        }
    }

    public static final String a(String str, String str2, Object... objArr) {
        try {
            return a(str, objArr);
        } catch (MissingResourceException e2) {
            return str2;
        }
    }

    public static final String a(String str, Object... objArr) {
        String d2 = d(str);
        if (objArr.length == 0) {
            return d2;
        }
        return new MessageFormat(d2).format(objArr, new StringBuffer(), (FieldPosition) null).toString();
    }

    public static final String b(String str) {
        if (str == null) {
            return null;
        }
        String str2 = str;
        String str3 = null;
        Matcher matcher = e.matcher(str);
        if (matcher.matches()) {
            str2 = matcher.group(1);
            str3 = matcher.group(2);
        }
        String str4 = "maps.name." + str2.trim().replace(" ", "_").replace(".tmx", VariableScope.nullOrMissingString).toLowerCase(Locale.ENGLISH);
        if (e(str4)) {
            String a2 = a(str4, new Object[0]);
            if (str3 != null) {
                a2 = a2 + str3;
            }
            GameEngine.m2e("translated:" + a2);
            if (a2 != null) {
                a2 = a2.replace("_", " ");
            }
            return a2;
        }
        return str;
    }

    public static String c(String str) {
        if (!str.contains("[i:")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                GameEngine.print("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String group = matcher.group(1);
            String a2 = a(group, null, new Object[0]);
            if (a2 == null) {
                GameEngine.m2e("convertInlineBlocks: No key:" + group);
                a2 = "[No key: " + group + "]";
            }
            matcher.appendReplacement(stringBuffer, a2);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }
}