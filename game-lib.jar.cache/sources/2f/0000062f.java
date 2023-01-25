package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1139o;
import com.corrodinggames.rts.gameFramework.utility.C1144s;

/* renamed from: com.corrodinggames.rts.gameFramework.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/w.class */
public abstract class AbstractC1155w extends AbstractC0741bq {

    /* renamed from: eh */
    public long f7166eh;

    /* renamed from: ej */
    public boolean f7167ej;

    /* renamed from: ek */
    public boolean f7168ek;

    /* renamed from: el */
    public boolean f7169el;

    /* renamed from: em */
    public int f7170em;

    /* renamed from: en */
    public int f7171en;

    /* renamed from: eo */
    public float f7172eo;

    /* renamed from: ep */
    public float f7173ep;

    /* renamed from: eq */
    public float f7174eq;

    /* renamed from: ei */
    public static C1156x f7175ei = new C1156x();

    /* renamed from: a */
    private static final C1139o f7176a = new C1139o();

    /* renamed from: er */
    public static final C1144s f7177er = new C1144s("fastGameObjectList");

    /* renamed from: a */
    public abstract void mo1764a(float f);

    /* renamed from: a */
    public abstract void mo2369a(float f, boolean z);

    /* renamed from: d */
    public abstract void mo2360d(float f);

    /* renamed from: e */
    public abstract void mo2359e(float f);

    /* renamed from: c */
    public abstract boolean mo2361c(float f);

    /* renamed from: f */
    public abstract boolean mo2358f(float f);

    /* renamed from: S */
    public void m453S(int i) {
        this.f7170em = i;
    }

    /* renamed from: a */
    public void mo1977a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(this.f7167ej);
        gameOutputStream.writeBoolean(this.f7168ek);
        gameOutputStream.writeInt(this.f7170em);
    }

    /* renamed from: a */
    public void mo2367a(GameInputStream gameInputStream) {
        this.f7167ej = gameInputStream.readBoolean();
        this.f7168ek = gameInputStream.readBoolean();
        this.f7170em = gameInputStream.readInt();
    }

    public AbstractC1155w() {
        this(false);
    }

    public AbstractC1155w(boolean z) {
        this.f7167ej = false;
        this.f7168ek = false;
        this.f7170em = 2;
        this.f7171en = 0;
        this.f7174eq = 0.0f;
        if (!z) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.f7166eh != 0) {
                throw new RuntimeException("ID for GameObject is already set at:" + this.f7166eh);
            }
            this.f7166eh = gameEngine.netEngine.m1445y();
            if (this.f7166eh == 0) {
                throw new RuntimeException("Adding object with id:0 class:" + getClass().getSimpleName());
            }
            f7176a.m526a(this);
            f7177er.mo515a(this);
            return;
        }
        this.f7166eh = 0L;
    }

    /* renamed from: p */
    public void mo4256p(float f) {
    }

    /* renamed from: a */
    public boolean mo2366a(GameEngine gameEngine) {
        return true;
    }

    /* renamed from: a */
    public void mo2749a() {
        if (this.f7166eh != 0) {
            f7176a.m523b(this);
            f7177er.remove(this);
        }
        this.f7167ej = true;
    }

    /* renamed from: a */
    public static AbstractC1155w m449a(long j, Class cls, boolean z) {
        if (j == -1) {
            return null;
        }
        AbstractC1155w[] m520a = f7177er.m520a();
        int size = f7177er.size();
        for (int i = 0; i < size; i++) {
            AbstractC1155w abstractC1155w = m520a[i];
            if (abstractC1155w.f7166eh == j) {
                if (cls.isInstance(abstractC1155w)) {
                    return abstractC1155w;
                }
                String name = abstractC1155w.getClass().getName();
                String name2 = cls.getName();
                GameNetEngine.m1481g("object id:" + j + " was found, but with type " + name.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString) + " instead of " + name2.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString));
            }
        }
        if (!z) {
            GameNetEngine.m1481g("getFromId:" + j + " was not found");
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static AbstractC0244am m448a(long j, boolean z) {
        return (AbstractC0244am) m449a(j, AbstractC0244am.class, z);
    }

    /* renamed from: b */
    public static AbstractC0629y m444b(long j, boolean z) {
        return (AbstractC0629y) m449a(j, AbstractC0629y.class, z);
    }

    /* renamed from: dK */
    public static C1139o m441dK() {
        f7176a.m530a();
        return f7176a;
    }

    /* renamed from: dL */
    public static void m440dL() {
        f7176a.m530a();
        AbstractC0244am.m4334bG();
    }
}