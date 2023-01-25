package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.appFramework.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/k.class */
class C0119k implements Comparator {

    /* renamed from: a */
    Pattern f478a = Pattern.compile(".*\\((.*)\\).*");

    C0119k() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(String str, String str2) {
        Date m4913a = m4913a(str);
        Date m4913a2 = m4913a(str2);
        if (m4913a == null && m4913a2 == null) {
            return str.compareTo(str2);
        }
        if (m4913a != null && m4913a2 != null) {
            return m4913a2.compareTo(m4913a);
        }
        if (m4913a == null && m4913a2 != null) {
            return -1;
        }
        if (m4913a != null && m4913a2 == null) {
            return 1;
        }
        return 0;
    }

    /* renamed from: a */
    public Date m4913a(String str) {
        Matcher matcher = this.f478a.matcher(str);
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
                                GameEngine.m5460e("Failed to parse date:" + group);
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