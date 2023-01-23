package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/w.class */
public abstract class w extends bq {
    public long eh;
    public boolean ej;
    public boolean ek;
    public boolean el;
    public int em;
    public int en;
    public float eo;
    public float ep;
    public float eq;
    public static x ei = new x();

    /* renamed from: a  reason: collision with root package name */
    private static final com.corrodinggames.rts.gameFramework.utility.o f703a = new com.corrodinggames.rts.gameFramework.utility.o();
    public static final com.corrodinggames.rts.gameFramework.utility.s er = new com.corrodinggames.rts.gameFramework.utility.s("fastGameObjectList");

    public abstract void a(float f);

    public abstract void a(float f, boolean z);

    public abstract void d(float f);

    public abstract void e(float f);

    public abstract boolean c(float f);

    public abstract boolean f(float f);

    public void S(int i) {
        this.em = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.ej);
        gameOutputStream.writeBoolean(this.ek);
        gameOutputStream.writeInt(this.em);
    }

    public void a(GameInputStream gameInputStream) {
        this.ej = gameInputStream.readBoolean();
        this.ek = gameInputStream.readBoolean();
        this.em = gameInputStream.readInt();
    }

    public w() {
        this(false);
    }

    public w(boolean z) {
        this.ej = false;
        this.ek = false;
        this.em = 2;
        this.en = 0;
        this.eq = 0.0f;
        if (!z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.eh != 0) {
                throw new RuntimeException("ID for GameObject is already set at:" + this.eh);
            }
            this.eh = gameEngine.bX.y();
            if (this.eh == 0) {
                throw new RuntimeException("Adding object with id:0 class:" + getClass().getSimpleName());
            }
            f703a.a(this);
            er.add(this);
            return;
        }
        this.eh = 0L;
    }

    public void p(float f) {
    }

    public boolean a(GameEngine gameEngine) {
        return true;
    }

    public void a() {
        if (this.eh != 0) {
            f703a.b(this);
            er.remove(this);
        }
        this.ej = true;
    }

    public static w a(long j, Class cls, boolean z) {
        if (j == -1) {
            return null;
        }
        w[] a2 = er.a();
        int size = er.size();
        for (int i = 0; i < size; i++) {
            w wVar = a2[i];
            if (wVar.eh == j) {
                if (cls.isInstance(wVar)) {
                    return wVar;
                }
                String name = wVar.getClass().getName();
                String name2 = cls.getName();
                GameNetEngine.g("object id:" + j + " was found, but with type " + name.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString) + " instead of " + name2.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString));
            }
        }
        if (!z) {
            GameNetEngine.g("getFromId:" + j + " was not found");
            return null;
        }
        return null;
    }

    public static com.corrodinggames.rts.game.units.am a(long j, boolean z) {
        return (com.corrodinggames.rts.game.units.am) a(j, com.corrodinggames.rts.game.units.am.class, z);
    }

    public static com.corrodinggames.rts.game.units.y b(long j, boolean z) {
        return (com.corrodinggames.rts.game.units.y) a(j, com.corrodinggames.rts.game.units.y.class, z);
    }

    public static com.corrodinggames.rts.gameFramework.utility.o dK() {
        f703a.a();
        return f703a;
    }

    public static void dL() {
        f703a.a();
        com.corrodinggames.rts.game.units.am.bG();
    }
}