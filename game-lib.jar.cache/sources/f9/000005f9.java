package com.corrodinggames.rts.gameFramework.utility;

import android.p003os.Looper;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a.class */
public class C1101a extends Error {
    private C1101a(C1121c c1121c) {
        super("Application Not Responding", c1121c);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* renamed from: a */
    static C1101a m740a(String str, boolean z) {
        final Thread m5105e = Looper.m5108b().m5105e();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.corrodinggames.rts.gameFramework.utility.a.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo738a(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                if (thread == m5105e) {
                    return 1;
                }
                if (thread2 == m5105e) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == m5105e || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(m5105e)) {
            treeMap.put(m5105e, m5105e.getStackTrace());
        }
        C1121c c1121c = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            C1120b c1120b = new C1120b(m739a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue());
            c1120b.getClass();
            c1121c = new C1121c(c1120b, c1121c);
        }
        return new C1101a(c1121c);
    }

    /* renamed from: a */
    static C1101a m741a() {
        Thread m5105e = Looper.m5108b().m5105e();
        C1120b c1120b = new C1120b(m739a(m5105e), m5105e.getStackTrace());
        c1120b.getClass();
        return new C1101a(new C1121c(c1120b, null));
    }

    /* renamed from: a */
    private static String m739a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}