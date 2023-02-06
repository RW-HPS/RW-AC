package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/d.class */
public class d extends Thread {
    private static final e a = new e() { // from class: com.corrodinggames.rts.gameFramework.utility.d.1
        @Override // com.corrodinggames.rts.gameFramework.utility.e
        public void a(a aVar) {
            throw aVar;
        }
    };
    private static final f b = new f() { // from class: com.corrodinggames.rts.gameFramework.utility.d.2
        @Override // com.corrodinggames.rts.gameFramework.utility.f
        public void a(InterruptedException interruptedException) {
            Log.c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };
    private e c;
    private f d;
    private final Handler e;
    private final int f;
    private String g;
    private boolean h;
    private boolean i;
    private volatile int j;
    private final Runnable k;

    public d() {
        this(5000);
    }

    public d(int i) {
        this.c = a;
        this.d = b;
        this.e = new Handler(Looper.b());
        this.g = VariableScope.nullOrMissingString;
        this.h = false;
        this.i = false;
        this.j = 0;
        this.k = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.d.3
            @Override // java.lang.Runnable
            public void run() {
                d.this.j = (d.this.j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f = i;
    }

    public d a(e eVar) {
        if (eVar == null) {
            this.c = a;
        } else {
            this.c = eVar;
        }
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        a a2;
        setName("|ANR-WatchDog|");
        int i = -1;
        while (!isInterrupted()) {
            int i2 = this.j;
            this.e.a(this.k);
            try {
                Thread.sleep(this.f);
                if (this.j == i2) {
                    if (!this.i && Debug.isDebuggerConnected()) {
                        if (this.j != i) {
                            Log.c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i = this.j;
                    } else {
                        if (this.g != null) {
                            a2 = a.a(this.g, this.h);
                        } else {
                            a2 = a.a();
                        }
                        this.c.a(a2);
                        return;
                    }
                }
            } catch (InterruptedException e) {
                this.d.a(e);
                return;
            }
        }
    }
}