package com.corrodinggames.rts.appFramework;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/k.class */
public class k implements Comparator {

    /* renamed from: a  reason: collision with root package name */
    Pattern f108a = Pattern.compile(".*\\((.*)\\).*");

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(String str, String str2) {
        Date a2 = a(str);
        Date a3 = a(str2);
        if (a2 == null && a3 == null) {
            return str.compareTo(str2);
        }
        if (a2 != null && a3 != null) {
            return a3.compareTo(a2);
        }
        if (a2 == null && a3 != null) {
            return -1;
        }
        if (a2 != null && a3 == null) {
            return 1;
        }
        return 0;
    }

    public Date a(String str) {
        Matcher matcher = this.f108a.matcher(str);
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
                                GameEngine.m328e("Failed to parse date:" + group);
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