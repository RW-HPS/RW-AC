package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/k.class */
class k implements Comparator {
    Pattern a = Pattern.compile(".*\\((.*)\\).*");

    k() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(String str, String str2) {
        Date a = a(str);
        Date a2 = a(str2);
        if (a == null && a2 == null) {
            return str.compareTo(str2);
        }
        if (a != null && a2 != null) {
            return a2.compareTo(a);
        }
        if (a == null && a2 != null) {
            return -1;
        }
        if (a != null && a2 == null) {
            return 1;
        }
        return 0;
    }

    public Date a(String str) {
        Matcher matcher = this.a.matcher(str);
        if (matcher.matches()) {
            String group = matcher.group(1);
            try {
                return new SimpleDateFormat("d MMM yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
            } catch (ParseException e) {
                try {
                    return new SimpleDateFormat("d MMM yyyy HH:mm:ss", Locale.ENGLISH).parse(group);
                } catch (ParseException e2) {
                    try {
                        return new SimpleDateFormat("d MMM yyyy HH_mm_ss", Locale.ENGLISH).parse(group);
                    } catch (ParseException e3) {
                        try {
                            return new SimpleDateFormat("d MMM yyyy HH-mm-ss", Locale.ENGLISH).parse(group);
                        } catch (ParseException e4) {
                            try {
                                return new SimpleDateFormat("d MMM. yyyy HH.mm.ss", Locale.ENGLISH).parse(group);
                            } catch (ParseException e5) {
                                GameEngine.m5e("Failed to parse date:" + group);
                                return null;
                            }
                        }
                    }
                }
            }
        }
        return null;
    }
}