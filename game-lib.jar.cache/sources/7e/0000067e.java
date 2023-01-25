package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1065n;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* renamed from: com.corrodinggames.rts.java.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
public class C1212i extends AbstractC1065n {

    /* renamed from: a */
    Main f7438a;

    public C1212i(Main main) {
        this.f7438a = main;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: a */
    public void mo871a(final String str, int i) {
        GameEngine.m5925e("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.1
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5925e("slick post-alert:" + str);
                C1212i.this.f7438a.f7200p.m5476b(VariableScope.nullOrMissingString, str);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: a */
    public void mo870a(final String str, final String str2) {
        GameEngine.m5925e("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5925e("slick messageBox:" + str2);
                C1212i.this.f7438a.f7200p.m5476b(str, str2);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: a */
    public void mo869a(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine == null || !gameEngine.f6310bj) && this.f7438a.f7194j != null) {
            this.f7438a.f7194j.m33a(str, z);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: d */
    public void mo865d() {
        GameEngine.m5925e("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: a */
    public void mo868a(Throwable th) {
        m107a(th, true);
    }

    /* renamed from: a */
    public void m107a(Throwable th, boolean z) {
        try {
            GameEngine.m5925e("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = GameEngine.m1128b(th) + "\nCheck logs for more details";
            GameEngine.m5925e("Error message: " + str);
            if (ScriptServerSocket.m5461a()) {
                GameEngine.m5925e("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            if (th != null && (th instanceof OutOfMemoryError) && !C0191i.f1219b) {
                str = str + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameEngine.m5925e("onGameCrash: end");
        } catch (Throwable th2) {
            GameEngine.m5925e("exception showing message");
            th2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: b */
    public boolean mo867b() {
        if (!GameEngine.getGameEngine().m1214I() && !this.f7438a.f7200p.m5480b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC1065n
    /* renamed from: c */
    public boolean mo866c() {
        return ScriptServerSocket.m5461a();
    }
}