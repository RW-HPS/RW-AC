package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.f.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/n.class */
public class C0832n {

    /* renamed from: a */
    String f5458a;

    /* renamed from: b */
    String f5459b;

    /* renamed from: c */
    long f5460c;

    /* renamed from: d */
    String f5461d;

    /* renamed from: e */
    public int f5462e = -1;

    /* renamed from: f */
    public int f5463f = -1;

    /* renamed from: a */
    public int m1779a() {
        return (int) (System.currentTimeMillis() - this.f5460c);
    }

    /* renamed from: b */
    public boolean m1778b() {
        if (GameEngine.getGameEngine().mo1082a() || this.f5460c + 14000 > System.currentTimeMillis()) {
            return true;
        }
        return false;
    }
}