package com.corrodinggames.rts.gameFramework;

import java.io.File;
import java.util.Enumeration;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j.class */
public class FileChangeEngine {
    static ConcurrentHashMap a = new ConcurrentHashMap();
    static AutoUpdateModLastModified b;

    public static long a(String str, boolean z) {
        Long l = (Long) a.get(str);
        if (l != null) {
            return l.longValue();
        }
        Long valueOf = Long.valueOf(a(str));
        if (!z) {
            a.put(str, valueOf);
            if (b == null) {
            }
        }
        return valueOf.longValue();
    }

    private static long a(String str) {
        return new File(str).lastModified();
    }

    public static synchronized void a() {
        startFileChangeEngine(GameEngine.getGameEngine().settingsEngine.liveReloading);
    }

    /* renamed from: a */
    public static synchronized void startFileChangeEngine(boolean z) {
        if (!GameEngine.av()) {
            return;
        }
        if (z) {
            if (b != null) {
                GameEngine.m2e("FileChangeEngine: Already running");
                return;
            }
            GameEngine.m2e("FileChangeEngine: Starting");
            b = new AutoUpdateModLastModified();
            b.start();
        } else if (b != null) {
            b.a = false;
            b = null;
        }
    }

    /* renamed from: b */
    public static void writeLastModified() {
        int i = 0;
        Enumeration keys = a.keys();
        while (keys.hasMoreElements()) {
            String str = (String) keys.nextElement();
            long a2 = a(str);
            Long l = (Long) a.get(str);
            if (l == null) {
                GameEngine.m2e("FileChangeEngine: old lastModified null for " + str);
            } else if (l.longValue() != a2) {
                GameEngine.m2e("FileChangeEngine: Detected change to:" + str + " now " + a2);
            }
            a.put(str, Long.valueOf(a2));
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