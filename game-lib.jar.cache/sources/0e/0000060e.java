package com.corrodinggames.rts.gameFramework.utility;

import android.os.Debug;
import android.p003os.Handler;
import android.p003os.Looper;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/d.class */
public class C1122d extends Thread {

    /* renamed from: a */
    private static final InterfaceC1126e f7073a = new InterfaceC1126e() { // from class: com.corrodinggames.rts.gameFramework.utility.d.1
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1126e
        /* renamed from: a */
        public void mo564a(C1101a c1101a) {
            throw c1101a;
        }
    };

    /* renamed from: b */
    private static final InterfaceC1127f f7074b = new InterfaceC1127f() { // from class: com.corrodinggames.rts.gameFramework.utility.d.2
        @Override // com.corrodinggames.rts.gameFramework.utility.InterfaceC1127f
        /* renamed from: a */
        public void mo563a(InterruptedException interruptedException) {
            Log.m5071c("ANRWatchdog", "Interrupted: " + interruptedException.getMessage());
        }
    };

    /* renamed from: c */
    private InterfaceC1126e f7075c;

    /* renamed from: d */
    private InterfaceC1127f f7076d;

    /* renamed from: e */
    private final Handler f7077e;

    /* renamed from: f */
    private final int f7078f;

    /* renamed from: g */
    private String f7079g;

    /* renamed from: h */
    private boolean f7080h;

    /* renamed from: i */
    private boolean f7081i;

    /* renamed from: j */
    private volatile int f7082j;

    /* renamed from: k */
    private final Runnable f7083k;

    public C1122d() {
        this(5000);
    }

    public C1122d(int i) {
        this.f7075c = f7073a;
        this.f7076d = f7074b;
        this.f7077e = new Handler(Looper.m5108b());
        this.f7079g = VariableScope.nullOrMissingString;
        this.f7080h = false;
        this.f7081i = false;
        this.f7082j = 0;
        this.f7083k = new Runnable() { // from class: com.corrodinggames.rts.gameFramework.utility.d.3
            @Override // java.lang.Runnable
            public void run() {
                C1122d.this.f7082j = (C1122d.this.f7082j + 1) % Integer.MAX_VALUE;
            }
        };
        this.f7078f = i;
    }

    /* renamed from: a */
    public C1122d m565a(InterfaceC1126e interfaceC1126e) {
        if (interfaceC1126e == null) {
            this.f7075c = f7073a;
        } else {
            this.f7075c = interfaceC1126e;
        }
        return this;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        C1101a m741a;
        setName("|ANR-WatchDog|");
        int i = -1;
        while (!isInterrupted()) {
            int i2 = this.f7082j;
            this.f7077e.m5118a(this.f7083k);
            try {
                Thread.sleep(this.f7078f);
                if (this.f7082j == i2) {
                    if (!this.f7081i && Debug.isDebuggerConnected()) {
                        if (this.f7082j != i) {
                            Log.m5071c("ANRWatchdog", "An ANR was detected but ignored because the debugger is connected (you can prevent this with setIgnoreDebugger(true))");
                        }
                        i = this.f7082j;
                    } else {
                        if (this.f7079g != null) {
                            m741a = C1101a.m740a(this.f7079g, this.f7080h);
                        } else {
                            m741a = C1101a.m741a();
                        }
                        this.f7075c.mo564a(m741a);
                        return;
                    }
                }
            } catch (InterruptedException e) {
                this.f7076d.mo563a(e);
                return;
            }
        }
    }
}