package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0468u;
import com.corrodinggames.rts.game.units.custom.C0469v;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/b.class */
public class C0323b extends AbstractC0321a {

    /* renamed from: a */
    public boolean f1922a;

    /* renamed from: b */
    public boolean f1923b;

    /* renamed from: c */
    public EnumC0306av f1924c;

    /* renamed from: d */
    public C0469v f1925d;

    /* renamed from: e */
    public boolean f1926e;

    /* renamed from: f */
    public C0454h f1927f;

    /* renamed from: g */
    public EnumC0200q f1928g;

    /* renamed from: h */
    public float f1929h;

    /* renamed from: i */
    public boolean f1930i;

    /* renamed from: j */
    public C0454h f1931j;

    /* renamed from: k */
    public EnumC0200q f1932k;

    /* renamed from: l */
    public float f1933l;

    /* renamed from: m */
    public boolean f1934m;

    /* renamed from: n */
    public boolean f1935n;

    /* renamed from: o */
    public PointF f1936o;

    /* renamed from: p */
    public PointF f1937p;

    /* renamed from: q */
    public PointF f1938q;

    /* renamed from: r */
    public LogicBoolean f1939r;

    /* renamed from: s */
    public float f1940s = -1.0f;

    /* renamed from: t */
    public C0468u f1941t;

    /* renamed from: u */
    public C0468u f1942u;

    /* renamed from: v */
    public static C0305au f1943v = new C0305au();

    /* renamed from: w */
    public static final C0324c f1944w = new C0324c();

    /* renamed from: a */
    public static void m4106a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean z2 = false;
        boolean booleanValue = c1107ab.m685a(str, str2 + "clearAllWaypoints", (Boolean) false).booleanValue();
        if (booleanValue) {
            z2 = true;
        }
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "clearActiveWaypoint", (Boolean) false).booleanValue();
        if (booleanValue2) {
            z2 = true;
        }
        EnumC0306av enumC0306av = (EnumC0306av) c1107ab.m684a(str, "addWaypoint_type", (Enum) null, EnumC0306av.class);
        boolean booleanValue3 = c1107ab.m685a(str, str2 + "addWaypoint_prepend", (Boolean) false).booleanValue();
        C0454h m705a = c1107ab.m705a(c0458l, str, str2 + "addWaypoint_target_nearestUnit_tagged", (C0454h) null);
        EnumC0200q enumC0200q = (EnumC0200q) c1107ab.m684a(str, "addWaypoint_target_nearestUnit_team", EnumC0200q.own, EnumC0200q.class);
        float floatValue = c1107ab.m683a(str, str2 + "addWaypoint_target_nearestUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        C0454h m705a2 = c1107ab.m705a(c0458l, str, str2 + "addWaypoint_target_randomUnit_tagged", (C0454h) null);
        EnumC0200q enumC0200q2 = (EnumC0200q) c1107ab.m684a(str, "addWaypoint_target_randomUnit_team", EnumC0200q.own, EnumC0200q.class);
        float floatValue2 = c1107ab.m683a(str, str2 + "addWaypoint_target_randomUnit_maxRange", Float.valueOf(10000.0f)).floatValue();
        float floatValue3 = c1107ab.m668b(str, str2 + "addWaypoint_maxTime", Float.valueOf(-1.0f)).floatValue();
        C0468u m702a = c1107ab.m702a(c0458l, str, str2 + "addWaypoint_triggerActionIfFailed", (C0468u) null);
        C0468u m702a2 = c1107ab.m702a(c0458l, str, str2 + "addWaypoint_triggerActionIfMatched", (C0468u) null);
        PointF m689a = c1107ab.m689a(str, str2 + "addWaypoint_position_offsetFromSelf", (PointF) null);
        PointF m689a2 = c1107ab.m689a(str, str2 + "addWaypoint_position_relativeOffsetFromSelf", (PointF) null);
        PointF m689a3 = c1107ab.m689a(str, str2 + "addWaypoint_position_randomOffsetFromSelf", (PointF) null);
        boolean z3 = (m689a == null && m689a2 == null && m689a3 == null) ? false : true;
        boolean z4 = m705a != null;
        boolean z5 = m705a2 != null;
        boolean booleanValue4 = c1107ab.m685a(str, str2 + "addWaypoint_position_fromAction", (Boolean) false).booleanValue();
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "addWaypoint_target_fromReference", null);
        if (m671b != null) {
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
        if ((z4 || z5 || z3 || m671b != null) && enumC0306av == null) {
            throw new RuntimeException("[" + str + "] addWaypoint_type is required when using addWaypoint_*");
        }
        if (enumC0306av != null) {
            z2 = true;
            if (!z4 && !z5 && !z3 && !booleanValue4 && m671b == null) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_tagged, addWaypoint_position_offsetFromSelf or addWaypoint_target_fromReference is required when using addWaypoint_*");
            }
        }
        if (z3) {
            z2 = true;
            if (z4 || z5) {
                throw new RuntimeException("[" + str + "] addWaypoint_target_* and addWaypoint_position_* cannot be used together");
            }
            if (enumC0306av != EnumC0306av.move && enumC0306av != EnumC0306av.attackMove) {
                throw new RuntimeException("[" + str + "] addWaypoint_position_* only supports position based waypoints (eg: move, attackMove)");
            }
        }
        if (z4 && z5) {
            throw new RuntimeException("[" + str + "] addWaypoint_target_nearestUnit_* and addWaypoint_target_randomUnit_* cannot be used together");
        }
        if (z2) {
            C0323b c0323b = new C0323b();
            c0323b.f1922a = booleanValue;
            c0323b.f1923b = booleanValue2;
            if (enumC0306av != null) {
                c0323b.f1924c = enumC0306av;
                if (c0323b.f1924c == EnumC0306av.build) {
                    c0323b.f1925d = c0458l.m3541a(c1107ab.m666b(str, str2 + "addWaypoint_unitType", (String) null), str2 + "addWaypoint_unitType", str);
                    if (c0323b.f1925d == null) {
                        throw new RuntimeException("[" + str + "] addWaypoint_type: build requires addWaypoint_unitType");
                    }
                }
                c0323b.f1926e = booleanValue3;
                c0323b.f1927f = m705a;
                c0323b.f1928g = enumC0200q;
                c0323b.f1929h = floatValue;
                c0323b.f1931j = m705a2;
                c0323b.f1932k = enumC0200q2;
                c0323b.f1933l = floatValue2;
                if (z5) {
                    c0323b.f1930i = true;
                }
                c0323b.f1934m = c1107ab.m685a(str, str2 + "addWaypoint_target_mapMustBeReachable", (Boolean) true).booleanValue();
                c0323b.f1936o = m689a;
                c0323b.f1937p = m689a2;
                c0323b.f1938q = m689a3;
                c0323b.f1935n = booleanValue4;
                c0323b.f1939r = m671b;
                c0323b.f1940s = floatValue3;
                c0323b.f1941t = m702a;
                c0323b.f1942u = m702a2;
            }
            c0339d.f2112ac.add(c0323b);
        }
    }

    /* renamed from: a */
    public C0305au m4107a(C0456j c0456j, float f, float f2, AbstractC0244am abstractC0244am, int i) {
        C0305au ap;
        if (this.f1940s == 0.0f) {
            ap = f1943v;
            ap.m4143e();
        } else if (this.f1926e) {
            ap = c0456j.m2946ao();
            c0456j.m2984aD();
            c0456j.m2986aB();
        } else {
            ap = c0456j.m2945ap();
        }
        if (this.f1924c == EnumC0306av.move) {
            ap.m4159a(f, f2);
        } else if (this.f1924c == EnumC0306av.attackMove) {
            ap.m4152b(f, f2);
        } else if (this.f1924c == EnumC0306av.guard && abstractC0244am != null) {
            ap.m4147c(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.follow && abstractC0244am != null) {
            ap.m4142e(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.loadInto && abstractC0244am != null) {
            ap.m4138g(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.loadUp && abstractC0244am != null) {
            ap.m4136h(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.attack && abstractC0244am != null) {
            ap.m4157a(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.reclaim && abstractC0244am != null) {
            ap.m4140f(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.repair && abstractC0244am != null) {
            ap.m4151b(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.touchTarget && abstractC0244am != null) {
            ap.m4144d(abstractC0244am);
        } else if (this.f1924c == EnumC0306av.build) {
            ap.m4158a(f, f2, this.f1925d.mo3471c(), 1);
        } else {
            c0456j.m2936ay();
        }
        ap.f1813l = this.f1940s;
        ap.f1815n = true;
        if (this.f1942u != null) {
            this.f1942u.m3475a(c0456j, new PointF(ap.m4139g(), ap.m4137h()), ap.m4135i(), i + 1, 0);
        }
        return ap;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1922a) {
            c0456j.m2935az();
        } else if (this.f1923b) {
            c0456j.m2936ay();
        }
        if (this.f1924c != null) {
            if (this.f1939r != null) {
                AbstractC0244am readUnit = this.f1939r.readUnit(c0456j);
                if (readUnit != null) {
                    m4107a(c0456j, readUnit.f7173eo, readUnit.f7174ep, readUnit, i);
                    return true;
                } else if (this.f1941t != null) {
                    this.f1941t.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
                    return true;
                } else {
                    return true;
                }
            } else if (this.f1935n) {
                if (pointF == null) {
                    if (this.f1941t != null) {
                        this.f1941t.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                m4107a(c0456j, pointF.x, pointF.y, (AbstractC0244am) null, i);
                return true;
            } else if (this.f1936o != null || this.f1937p != null || this.f1938q != null) {
                float f = c0456j.f7173eo;
                float f2 = c0456j.f7174ep;
                if (this.f1936o != null) {
                    f += this.f1936o.x;
                    f2 += this.f1936o.y;
                }
                if (this.f1937p != null) {
                    float f3 = this.f1937p.x;
                    float f4 = this.f1937p.y;
                    float m2107k = C0773f.m2107k(c0456j.f1623cg);
                    float m2110j = C0773f.m2110j(c0456j.f1623cg);
                    f += (m2107k * f4) - (m2110j * f3);
                    f2 += (m2110j * f4) + (m2107k * f3);
                }
                if (this.f1938q != null) {
                    f += C0773f.m2195a((AbstractC1155w) c0456j, -((int) this.f1938q.x), (int) this.f1938q.x, i + 1);
                    f2 += C0773f.m2195a((AbstractC1155w) c0456j, -((int) this.f1938q.y), (int) this.f1938q.y, i + 2);
                }
                m4107a(c0456j, f, f2, (AbstractC0244am) null, i);
                return true;
            } else if (this.f1930i) {
                f1944w.f1947c = this.f1933l * this.f1933l;
                f1944w.f1946b = this.f1931j;
                f1944w.f1948d = false;
                f1944w.f1952h = null;
                f1944w.f1949e = this.f1932k;
                f1944w.f1945a = this.f1934m;
                f1944w.f1950f = true;
                f1944w.f1951g.clear();
                GameEngine.getGameEngine().f6388cc.m3209a(c0456j.f7173eo, c0456j.f7174ep, this.f1933l, c0456j, 0.0f, f1944w);
                if (f1944w.f1951g.size() == 0) {
                    if (this.f1941t != null) {
                        this.f1941t.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                C1136m c1136m = f1944w.f1951g;
                int m2195a = C0773f.m2195a((AbstractC1155w) c0456j, 0, c1136m.size(), 0);
                c0456j.f1592bC++;
                if (m2195a > c1136m.size() - 1) {
                    m2195a = c1136m.size() - 1;
                }
                AbstractC0244am abstractC0244am2 = (AbstractC0244am) c1136m.get(m2195a);
                m4107a(c0456j, abstractC0244am2.f7173eo, abstractC0244am2.f7174ep, abstractC0244am2, i);
                return true;
            } else {
                f1944w.f1947c = this.f1929h * this.f1929h;
                f1944w.f1946b = this.f1927f;
                f1944w.f1948d = false;
                f1944w.f1952h = null;
                f1944w.f1949e = this.f1928g;
                f1944w.f1945a = this.f1934m;
                f1944w.f1950f = false;
                GameEngine.getGameEngine().f6388cc.m3209a(c0456j.f7173eo, c0456j.f7174ep, this.f1929h, c0456j, 0.0f, f1944w);
                if (f1944w.f1952h == null) {
                    if (this.f1941t != null) {
                        this.f1941t.m3475a(c0456j, pointF, abstractC0244am, i + 1, 0);
                        return true;
                    }
                    return true;
                }
                AbstractC0244am abstractC0244am3 = f1944w.f1952h;
                m4107a(c0456j, abstractC0244am3.f7173eo, abstractC0244am3.f7174ep, abstractC0244am3, i);
                return true;
            }
        }
        return true;
    }
}