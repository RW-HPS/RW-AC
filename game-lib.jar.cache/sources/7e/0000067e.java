package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
public class i extends com.corrodinggames.rts.gameFramework.n {

    /* renamed from: a */
    Main f746a;

    public i(Main main) {
        this.f746a = main;
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(final String str, int i) {
        GameEngine.m2e("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.1
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m2e("slick post-alert:" + str);
                i.this.f746a.p.b(VariableScope.nullOrMissingString, str);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(final String str, final String str2) {
        GameEngine.m2e("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m2e("slick messageBox:" + str2);
                i.this.f746a.p.b(str, str2);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine == null || !gameEngine.bj) && this.f746a.j != null) {
            this.f746a.j.a(str, z);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void d() {
        GameEngine.m2e("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(Throwable th) {
        a(th, true);
    }

    public void a(Throwable th, boolean z) {
        try {
            GameEngine.m2e("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = GameEngine.b(th) + "\nCheck logs for more details";
            GameEngine.m2e("Error message: " + str);
            if (com.corrodinggames.rts.a.a.a()) {
                GameEngine.m2e("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            if (th != null && (th instanceof OutOfMemoryError) && !com.corrodinggames.rts.game.i.b) {
                str = str + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameEngine.m2e("onGameCrash: end");
        } catch (Throwable th2) {
            GameEngine.m2e("exception showing message");
            th2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public boolean b() {
        if (!GameEngine.getGameEngine().I() && !this.f746a.p.b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public boolean c() {
        return com.corrodinggames.rts.a.a.a();
    }
}