package com.corrodinggames.rts.game.units.custom.b;

import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.gameFramework.unitAction.ag;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/d.class */
public class d implements Comparable {
    String a;
    boolean c;
    boolean d;
    boolean e;
    boolean f;
    boolean g;
    boolean i;
    public float j;
    public boolean k;
    public boolean l;
    public boolean m;
    public boolean n;
    public boolean q;
    public LogicBoolean r;
    public LogicBoolean s;
    public LogicBoolean t;
    public boolean u;
    public e v;
    public e[] w;
    public float x;
    public int y;
    public boolean z;
    LogicBoolean A;
    LogicBoolean B;
    public com.corrodinggames.rts.gameFramework.unitAction.e C;
    public float D;
    public float E;
    public LogicBoolean F;
    public f G;
    public float H;
    public boolean I;
    public boolean M;
    public LogicBoolean N;
    public int O;
    public int P;
    public float Q;
    public float R;
    public float S;
    public float T;
    public float U;
    public float V;
    public LogicBoolean W;
    public LogicBoolean X;
    public boolean Y;
    public boolean Z;
    public float aa;
    public float ab;
    public LogicBoolean ac;
    public LogicBoolean ad;
    public boolean af;
    public ag ah;
    public LogicBoolean ai;
    boolean b = false;
    q h = q.any;
    public int o = -1;
    public float p = 1.0f;
    public int J = -1;
    public int K = -1;
    public int L = -1;
    public int ae = -1;
    public int ag = -1;

    @Override // java.lang.Comparable
    /* renamed from: a */
    public int compareTo(d dVar) {
        if (dVar == null) {
            return 0;
        }
        float f = this.H - dVar.H;
        if (f < 0.0f) {
            return -1;
        }
        return f > 0.0f ? 1 : 0;
    }
}