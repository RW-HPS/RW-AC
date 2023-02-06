package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.EngineLoad;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.awt.Toolkit;
import org.lwjgl.Sys;

/* loaded from: game-lib.jar:com/corrodinggames/rts/java/i.class */
public class i extends com.corrodinggames.rts.gameFramework.n {
    Main a;

    public i(Main main) {
        this.a = main;
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(final String str, int i) {
        GameEngine.m5e("slick queuing-alert:" + str);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.1
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5e("slick post-alert:" + str);
                i.this.a.p.b(VariableScope.nullOrMissingString, str);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(final String str, final String str2) {
        GameEngine.m5e("slick queuing-messageBox:" + str2);
        ScriptEngine.getInstance().addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.rts.java.i.2
            @Override // java.lang.Runnable
            public void run() {
                GameEngine.m5e("slick messageBox:" + str2);
                i.this.a.p.b(str, str2);
            }
        });
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if ((gameEngine == null || !gameEngine.bj) && this.a.j != null) {
            this.a.j.a(str, z);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void d() {
        GameEngine.m5e("refreshModDisplay");
        ScriptEngine.getInstance().addScriptToQueue("mods.refreshModList()");
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public void a(Throwable th) {
        a(th, true);
    }

    public void a(Throwable th, boolean z) {
        try {
            GameEngine.m5e("----------- onGameCrash ----------");
            Toolkit.getDefaultToolkit();
            String str = GameEngine.b(th) + "\nCheck logs for more details";
            GameEngine.m5e("Error message: " + str);
            if (ScriptServerSocket.a()) {
                GameEngine.m5e("onGameCrash: Not showing popup message due to active debugSocket");
                System.exit(1);
                return;
            }
            if (th != null && (th instanceof OutOfMemoryError) && !EngineLoad.b) {
                str = str + " (You are also using the 32 bit version, switching to the 64 bit version might help with out of memory)";
            }
            Sys.alert("Crash", str);
            try {
                Thread.sleep(1000L);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            GameEngine.m5e("onGameCrash: end");
        } catch (Throwable th2) {
            GameEngine.m5e("exception showing message");
            th2.printStackTrace();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public boolean b() {
        if (!GameEngine.getGameEngine().I() && !this.a.p.b()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.n
    public boolean c() {
        return ScriptServerSocket.a();
    }
}