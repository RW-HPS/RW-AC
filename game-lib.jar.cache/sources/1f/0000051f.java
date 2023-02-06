package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.j.an */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/an.class */
public class an implements Runnable {
    String a;
    boolean b;
    boolean c;
    Thread d;
    public String e;
    Runnable f;
    public Socket g;
    boolean h = false;

    public an(String str, boolean z, Runnable runnable) {
        this.a = str;
        this.b = z;
        this.f = runnable;
    }

    public boolean a() {
        if (!this.c) {
            return false;
        }
        this.h = true;
        return true;
    }

    public void b() {
        this.c = true;
        this.d = new Thread(this);
        this.d.start();
    }

    @Override // java.lang.Runnable
    public void run() {
        try {
            try {
                this.g = GameNetEngine.getSocketAndResolveIp(this.a, this.b);
                this.c = false;
                if (!this.h) {
                    this.f.run();
                } else if (this.g != null) {
                    try {
                        this.g.close();
                        this.g = null;
                        this.e = "cancelled";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (ag e2) {
                GameEngine.m5e("Cancelled connectSocketToServer");
                this.e = "CANCELLED";
                this.c = false;
                if (!this.h) {
                    this.f.run();
                } else if (this.g != null) {
                    try {
                        this.g.close();
                        this.g = null;
                        this.e = "cancelled";
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (IOException e4) {
                this.e = e4.getMessage();
                e4.printStackTrace();
                this.c = false;
                if (!this.h) {
                    this.f.run();
                } else if (this.g != null) {
                    try {
                        this.g.close();
                        this.g = null;
                        this.e = "cancelled";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            this.c = false;
            if (!this.h) {
                this.f.run();
            } else if (this.g != null) {
                try {
                    this.g.close();
                    this.g = null;
                    this.e = "cancelled";
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}