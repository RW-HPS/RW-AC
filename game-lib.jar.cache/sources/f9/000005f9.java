package com.corrodinggames.rts.gameFramework.utility;

import android.os.Looper;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a.class */
public class a extends Error {
    private a(c cVar) {
        super("Application Not Responding", cVar);
    }

    @Override // java.lang.Throwable
    public Throwable fillInStackTrace() {
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a(String str, boolean z) {
        final Thread e = Looper.b().e();
        TreeMap treeMap = new TreeMap(new Comparator() { // from class: com.corrodinggames.rts.gameFramework.utility.a.1
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(Thread thread, Thread thread2) {
                if (thread == thread2) {
                    return 0;
                }
                if (thread == e) {
                    return 1;
                }
                if (thread2 == e) {
                    return -1;
                }
                return thread2.getName().compareTo(thread.getName());
            }
        });
        for (Map.Entry<Thread, StackTraceElement[]> entry : Thread.getAllStackTraces().entrySet()) {
            if (entry.getKey() == e || (entry.getKey().getName().startsWith(str) && (z || entry.getValue().length > 0))) {
                treeMap.put(entry.getKey(), entry.getValue());
            }
        }
        if (!treeMap.containsKey(e)) {
            treeMap.put(e, e.getStackTrace());
        }
        c cVar = null;
        for (Map.Entry entry2 : treeMap.entrySet()) {
            b bVar = new b(a((Thread) entry2.getKey()), (StackTraceElement[]) entry2.getValue());
            bVar.getClass();
            cVar = new c(bVar, cVar);
        }
        return new a(cVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static a a() {
        Thread e = Looper.b().e();
        b bVar = new b(a(e), e.getStackTrace());
        bVar.getClass();
        return new a(new c(bVar, null));
    }

    private static String a(Thread thread) {
        return thread.getName() + " (state = " + thread.getState() + ")";
    }
}