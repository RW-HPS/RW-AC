package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j.class */
public class FileChangeEngine {

    /* renamed from: a  reason: collision with root package name */
    static ConcurrentHashMap f548a = new ConcurrentHashMap();
    static k b;

    public static long a(String str, boolean z) {
        Long l = (Long) f548a.get(str);
        if (l != null) {
            return l.longValue();
        }
        Long valueOf = Long.valueOf(a(str));
        if (!z) {
            f548a.put(str, valueOf);
            if (b == null) {
            }
        }
        return valueOf.longValue();
    }

    private static long a(String str) {
        return new File(str).lastModified();
    }

    public static synchronized void a() {
        a(GameEngine.getGameEngine().settingsEngine.liveReloading);
    }

    public static synchronized void a(boolean z) {
        if (!GameEngine.av()) {
            return;
        }
        if (z) {
            if (b != null) {
                GameEngine.m328e("FileChangeEngine: Already running");
                return;
            }
            GameEngine.m328e("FileChangeEngine: Starting");
            b = new k();
            b.start();
        } else if (b != null) {
            b.f598a = false;
            b = null;
        }
    }

    public static void b() {
        int i = 0;
        Enumeration keys = f548a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            long a2 = a(str);
            Long l = (Long) f548a.get(str);
            if (l == null) {
                GameEngine.m328e("FileChangeEngine: old lastModified null for " + str);
            } else if (l.longValue() != a2) {
                GameEngine.m328e("FileChangeEngine: Detected change to:" + str + " now " + a2);
            }
            f548a.put(str, Long.valueOf(a2));
            i++;
            if (i > 50) {
                i = 0;
                try {
                    Thread.sleep(2L);
                } catch (InterruptedException e) {
                }
            }
        }
    }
}