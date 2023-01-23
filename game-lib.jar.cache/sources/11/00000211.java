package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.w;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/b.class */
public class b extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    public boolean f218a;
    public boolean b;
    public av c;
    public v d;
    public boolean e;
    public com.corrodinggames.rts.game.units.custom.h f;
    public q g;
    public float h;
    public boolean i;
    public com.corrodinggames.rts.game.units.custom.h j;
    public q k;
    public float l;
    public boolean m;
    public boolean n;
    public PointF o;
    public PointF p;
    public PointF q;
    public LogicBoolean r;
    public float s = -1.0f;
    public u t;
    public u u;
    public static au v = new au();
    public static final c w = new c();

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean z2 = false;
        boolean booleanValue = abVar.a(str, str2 + "clearAllWaypoints", (Boolean) false).booleanValue();
        if (booleanValue) {
            z2 = true;
        }
        boolean booleanValue2 = abVar.a(str, str2 + "clearActiveWaypoint", (Boolean) false).booleanValue();
        if (booleanValue2) {
            z2 = true;
        }
        av avVar = (av) abVar.a(str, "addWaypoint_type", (Enum) null, av.class);
        boolean booleanValue3 = abVar.a(str, str2 + "addWaypoint_prepend", (Boolean) false).booleanValue();
        com.corrodinggames.rts.game.units.custom.h a2 = abVar.a(lVar, str, str2 + "addWaypoint_target_nearestUnit_tagged", (com.corrodinggames.rts.game.units.custom.h) null);
        q qVar = (q) abVar.a(str, "addWaypoint_target_nearestUnit_team", q.own, q.class);
        float floatValue = abVar.a(str, str2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        com.corrodinggames.rts.game.units.custom.h a3 = abVar.a(lVar, str, str2 + "addWaypoint_target_randomUnit_tagged", (com.corrodinggames.rts.game.units.custom.h) null);
        q qVar2 = (q) abVar.a(str, "addWaypoint_target_randomUnit_team", q.own, q.class);
        float floatValue2 = abVar.a(str, str2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        float floatValue3 = abVar.b(str, str2 + "addWaypoint_maxTime", Float.valueOf(-1.0f)).floatValue();
        u a4 = abVar.a(lVar, str, str2 + "addWaypoint_triggerActionIfFailed", (u) null);
        u a5 = abVar.a(lVar, str, str2 + "addWaypoint_triggerActionIfMatched", (u) null);
        PointF a6 = abVar.a(str, str2 + "addWaypoint_position_offsetFromSelf", (PointF) null);
        PointF a7 = abVar.a(str, str2 + "addWaypoint_position_relativeOffsetFromSelf", (PointF) null);
        PointF a8 = abVar.a(str, str2 + "addWaypoint_position_randomOffsetFromSelf", (PointF) null);
        boolean z3 = (a6 == null && a7 == null && a8 == null) ? false : true;
        boolean z4 = a2 != null;
        boolean z5 = a3 != null;
        boolean booleanValue4 = abVar.a(str, str2 + "addWaypoint_position_fromAction", (Boolean) false).booleanValue();
        LogicBoolean b = abVar.b(lVar, str, str2 + "addWaypoint_target_fromReference", null);
        if (b != null) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit/randomUnit and addWaypoint_target_fromReference cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_target_fromReference cannot be used together");
            }
            if (booleanValue4) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_fromAction and addWaypoint_target_fromReference cannot be used together");
            }
        }
        if (booleanValue4) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_fromAction cannot be used together");
            }
            if (z3) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_offset* and addWaypoint_position_fromAction cannot be used together");
            }
        }
        if ((z4 || z5 || z3 || b != null) && avVar == null) {
            throw new RuntimeException("[" + str + "] addWaypoint_type is required when using addWaypoint_*");
        }
        if (avVar != null) {
            z2 = true;
            if (!z4 && !z5 && !z3 && !booleanValue4 && b == null) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf or addWaypoint_target_fromReference is required when using addWaypoint_*");
            }
        }
        if (z3) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
            }
            if (avVar != av.move && avVar != av.attackMove) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
            }
        }
        if (z4 && z5) {
            throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
        }
        if (z2) {
            b bVar = new b();
            bVar.f218a = booleanValue;
            bVar.b = booleanValue2;
            if (avVar != null) {
                bVar.c = avVar;
                if (bVar.c == av.build) {
                    bVar.d = lVar.a(abVar.b(str, str2 + "addWaypoint_unitType", (String) null), str2 + "addWaypoint_unitType", str);
                    if (bVar.d == null) {
                        throw new RuntimeException("[" + str + "] addWaypoint_type: build requires addWaypoint_unitType");
                    }
                }
                bVar.e = booleanValue3;
                bVar.f = a2;
                bVar.g = qVar;
                bVar.h = floatValue;
                bVar.j = a3;
                bVar.k = qVar2;
                bVar.l = floatValue2;
                if (z5) {
                    bVar.i = true;
                }
                bVar.m = abVar.a(str, str2 + "addWaypoint_target_mapMustBeReachable", (Boolean) true).booleanValue();
                bVar.o = a6;
                bVar.p = a7;
                bVar.q = a8;
                bVar.n = booleanValue4;
                bVar.r = b;
                bVar.s = floatValue3;
                bVar.t = a4;
                bVar.u = a5;
            }
            dVar.ac.add(bVar);
        }
    }

    public au a(com.corrodinggames.rts.game.units.custom.j jVar, float f, float f2, am amVar, int i) {
        au ap;
        if (this.s == 0.0f) {
            ap = v;
            ap.e();
        } else if (this.e) {
            ap = jVar.ao();
            jVar.aD();
            jVar.aB();
        } else {
            ap = jVar.ap();
        }
        if (this.c == av.move) {
            ap.a(f, f2);
        } else if (this.c == av.attackMove) {
            ap.b(f, f2);
        } else if (this.c == av.guard && amVar != null) {
            ap.c(amVar);
        } else if (this.c == av.follow && amVar != null) {
            ap.e(amVar);
        } else if (this.c == av.loadInto && amVar != null) {
            ap.g(amVar);
        } else if (this.c == av.loadUp && amVar != null) {
            ap.h(amVar);
        } else if (this.c == av.attack && amVar != null) {
            ap.a(amVar);
        } else if (this.c == av.reclaim && amVar != null) {
            ap.f(amVar);
        } else if (this.c == av.repair && amVar != null) {
            ap.b(amVar);
        } else if (this.c == av.touchTarget && amVar != null) {
            ap.d(amVar);
        } else if (this.c == av.build) {
            ap.a(f, f2, this.d.c(), 1);
        } else {
            jVar.ay();
        }
        ap.l = this.s;
        ap.n = true;
        if (this.u != null) {
            this.u.a(jVar, new PointF(ap.g(), ap.h()), ap.i(), i + 1, 0);
        }
        return ap;
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if (this.f218a) {
            jVar.az();
        } else if (this.b) {
            jVar.ay();
        }
        if (this.c != null) {
            if (this.r != null) {
                am readUnit = this.r.readUnit(jVar);
                if (readUnit != null) {
                    a(jVar, readUnit.eo, readUnit.ep, readUnit, i);
                    return true;
                } else if (this.t != null) {
                    this.t.a(jVar, pointF, amVar, i + 1, 0);
                    return true;
                } else {
                    return true;
                }
            } else if (this.n) {
                if (pointF == null) {
                    if (this.t != null) {
                        this.t.a(jVar, pointF, amVar, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                a(jVar, pointF.x, pointF.y, (am) null, i);
                return true;
            } else if (this.o != null || this.p != null || this.q != null) {
                float f = jVar.eo;
                float f2 = jVar.ep;
                if (this.o != null) {
                    f += this.o.x;
                    f2 += this.o.y;
                }
                if (this.p != null) {
                    float f3 = this.p.x;
                    float f4 = this.p.y;
                    float k = com.corrodinggames.rts.gameFramework.f.k(jVar.cg);
                    float j = com.corrodinggames.rts.gameFramework.f.j(jVar.cg);
                    f += (k * f4) - (j * f3);
                    f2 += (j * f4) + (k * f3);
                }
                if (this.q != null) {
                    f += com.corrodinggames.rts.gameFramework.f.a((w) jVar, -((int) this.q.x), (int) this.q.x, i + 1);
                    f2 += com.corrodinggames.rts.gameFramework.f.a((w) jVar, -((int) this.q.y), (int) this.q.y, i + 2);
                }
                a(jVar, f, f2, (am) null, i);
                return true;
            } else if (this.i) {
                w.c = this.l * this.l;
                w.b = this.j;
                w.d = false;
                w.h = null;
                w.e = this.k;
                w.f219a = this.m;
                w.f = true;
                w.g.clear();
                GameEngine.getGameEngine().cc.a(jVar.eo, jVar.ep, this.l, jVar, 0.0f, w);
                if (w.g.size() == 0) {
                    if (this.t != null) {
                        this.t.a(jVar, pointF, amVar, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                com.corrodinggames.rts.gameFramework.utility.m mVar = w.g;
                int a2 = com.corrodinggames.rts.gameFramework.f.a((w) jVar, 0, mVar.size(), 0);
                jVar.bC++;
                if (a2 > mVar.size() - 1) {
                    a2 = mVar.size() - 1;
                }
                am amVar2 = (am) mVar.get(a2);
                a(jVar, amVar2.eo, amVar2.ep, amVar2, i);
                return true;
            } else {
                w.c = this.h * this.h;
                w.b = this.f;
                w.d = false;
                w.h = null;
                w.e = this.g;
                w.f219a = this.m;
                w.f = false;
                GameEngine.getGameEngine().cc.a(jVar.eo, jVar.ep, this.h, jVar, 0.0f, w);
                if (w.h == null) {
                    if (this.t != null) {
                        this.t.a(jVar, pointF, amVar, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                am amVar3 = w.h;
                a(jVar, amVar3.eo, amVar3.ep, amVar3, i);
                return true;
            }
        }
        return true;
    }
}