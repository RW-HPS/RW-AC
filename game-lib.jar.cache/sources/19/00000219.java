package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0361as;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0468u;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p028g.C0559e;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1115ai;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/j.class */
public class C0331j extends AbstractC0321a {

    /* renamed from: a */
    boolean f1986a;

    /* renamed from: b */
    boolean f1987b;

    /* renamed from: c */
    boolean f1988c;

    /* renamed from: d */
    LogicBoolean f1989d;

    /* renamed from: e */
    LogicBoolean f1990e;

    /* renamed from: f */
    LogicBoolean f1991f;

    /* renamed from: g */
    LogicBoolean f1992g;

    /* renamed from: h */
    boolean f1993h;

    /* renamed from: i */
    float f1994i;

    /* renamed from: j */
    float f1995j;

    /* renamed from: k */
    C0468u f1996k;

    /* renamed from: l */
    boolean f1997l;

    /* renamed from: m */
    boolean f1998m;

    /* renamed from: n */
    float f1999n = -1.0f;

    /* renamed from: o */
    C1115ai f2000o;

    /* renamed from: p */
    boolean f2001p;

    /* renamed from: q */
    VariableScope.CachedWriter f2002q;

    /* renamed from: a */
    public static void m4097a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1107ab.m685a(str, str2 + "resetUnitStats", (Boolean) false).booleanValue();
        String m666b = c1107ab.m666b(str, str2 + "setUnitStats", (String) null);
        if (booleanValue || m666b != null) {
            C0331j c0331j = new C0331j();
            c0331j.f2001p = booleanValue;
            if (m666b != null) {
                c0331j.f2002q = C0361as.m3971a(m666b, c0458l, str, str2 + "setUnitStats");
            }
            c0339d.f2112ac.add(c0331j);
        }
        boolean booleanValue2 = c1107ab.m685a(str, str2 + "deleteSelf", (Boolean) false).booleanValue();
        if (booleanValue2) {
            C0331j c0331j2 = new C0331j();
            c0331j2.f1986a = booleanValue2;
            c0339d.f2112ac.add(c0331j2);
        }
        boolean booleanValue3 = c1107ab.m685a(str, str2 + "switchToNeutralTeam", (Boolean) false).booleanValue();
        boolean booleanValue4 = c1107ab.m685a(str, str2 + "switchToAggressiveTeam", (Boolean) false).booleanValue();
        LogicBoolean m703a = c1107ab.m703a(c0458l, str, str2 + "switchToTeam", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        if (booleanValue3 || booleanValue4 || m703a != null) {
            C0331j c0331j3 = new C0331j();
            c0331j3.f1987b = booleanValue3;
            c0331j3.f1988c = booleanValue4;
            c0331j3.f1989d = m703a;
            c0339d.f2112ac.add(c0331j3);
        }
        LogicBoolean m664c = c1107ab.m664c(c0458l, str, str2 + "setBodyRotation", null);
        if (m664c != null) {
            C0331j c0331j4 = new C0331j();
            c0331j4.f1990e = m664c;
            c0339d.f2112ac.add(c0331j4);
        }
        LogicBoolean m664c2 = c1107ab.m664c(c0458l, str, str2 + "setHeight", null);
        if (m664c2 != null) {
            C0331j c0331j5 = new C0331j();
            c0331j5.f1991f = m664c2;
            c0339d.f2112ac.add(c0331j5);
        }
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "teleportTo", null);
        if (m671b != null) {
            C0331j c0331j6 = new C0331j();
            c0331j6.f1992g = m671b;
            c0339d.f2112ac.add(c0331j6);
        }
        float floatValue = c1107ab.m683a(str, str2 + "setBuilt", Float.valueOf(-1.0f)).floatValue();
        if (floatValue > 1.0f) {
            throw new C0417bo("[" + str + "] setBuilt cannot be greater than 1");
        }
        boolean booleanValue5 = c1107ab.m685a(str, str2 + "clearAllActionCooldowns", (Boolean) false).booleanValue();
        float floatValue2 = c1107ab.m661c(str, str2 + "addAllActionCooldownsTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue2 == 0.0f) {
            floatValue2 = c1107ab.m661c(str, str2 + "addAllActionCooldownsFor", Float.valueOf(0.0f)).floatValue();
        }
        float floatValue3 = c1107ab.m661c(str, str2 + "addActionCooldownTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue3 == 0.0f) {
            floatValue3 = c1107ab.m661c(str, str2 + "addActionCooldownFor", Float.valueOf(0.0f)).floatValue();
        }
        C0468u m702a = c1107ab.m702a(c0458l, str, str2 + "addActionCooldownApplyToActions", (C0468u) null);
        C1115ai m686a = c1107ab.m686a(str, str2 + "offsetSelfAbsolute", (C1115ai) null);
        if (m702a != null && floatValue3 <= 0.0f) {
            throw new C0417bo("[" + str + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
        }
        boolean booleanValue6 = c1107ab.m685a(str, str2 + "removeAllQueuedItemsWithoutRefund", (Boolean) false).booleanValue();
        boolean booleanValue7 = c1107ab.m685a(str, str2 + "refundAllQueuedItems", (Boolean) false).booleanValue();
        if (booleanValue6 && booleanValue7) {
            throw new C0417bo("[" + str + "]Cannot set removeAllQueuedActionsWithoutRefund and refundAllQueuedActions at the same time, pick one.");
        }
        if (floatValue3 > 0.0f || floatValue2 > 0.0f || booleanValue5 || floatValue >= 0.0f || m686a != null || booleanValue6 || booleanValue7) {
            C0331j c0331j7 = new C0331j();
            c0331j7.f1993h = booleanValue5;
            c0331j7.f1994i = floatValue2;
            c0331j7.f1995j = floatValue3;
            c0331j7.f1996k = m702a;
            c0331j7.f1999n = floatValue;
            c0331j7.f2000o = m686a;
            c0331j7.f1997l = booleanValue6;
            c0331j7.f1998m = booleanValue7;
            c0339d.f2112ac.add(c0331j7);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        AbstractC0244am readUnit;
        PlayerData m4365k;
        if (this.f2001p) {
            c0456j.f2892y = c0456j.f2891x.f3278cL;
            c0456j.f1638cv = c0456j.f2892y.f2256c;
            if (c0456j.f1637cu > c0456j.f1638cv) {
                c0456j.m4195o(c0456j.f1638cv);
            }
            c0456j.f1643cA = c0456j.f2892y.f2260g;
            if (c0456j.f1640cx > c0456j.f1643cA) {
                c0456j.f1640cx = c0456j.f1643cA;
            }
        }
        if (this.f2002q != null) {
            this.f2002q.writeToUnit(c0456j);
            C0429b.m3816d(c0456j);
        }
        if (this.f1986a) {
            c0456j.m4210ci();
            if (c0456j.mo3397bI()) {
                GameEngine.getGameEngine().f6332bU.m1176a(c0456j);
            }
        }
        if (this.f1987b) {
            c0456j.mo3586e(PlayerData.f1373i);
        }
        if (this.f1988c) {
            c0456j.mo3586e(PlayerData.f1372h);
        }
        if (this.f1989d != null && (m4365k = PlayerData.m4365k((int) this.f1989d.readNumber(c0456j))) != null) {
            c0456j.mo3586e(m4365k);
        }
        if (this.f1990e != null) {
            c0456j.mo2864h(this.f1990e.readNumber(c0456j));
        }
        if (this.f1991f != null) {
            c0456j.f7174eq = this.f1991f.readNumber(c0456j);
        }
        if (this.f1992g != null && (readUnit = this.f1992g.readUnit(c0456j)) != null) {
            c0456j.mo3584f(readUnit.f7172eo, readUnit.f7173ep);
        }
        if (this.f1993h) {
            C0559e.m3175c(c0456j, AbstractC0224s.f1466i);
        }
        if (this.f1997l) {
            c0456j.m3579i(false);
        }
        if (this.f1998m) {
            c0456j.m3579i(true);
        }
        if (this.f1994i > 0.0f) {
            C0559e.m3181a(c0456j, AbstractC0224s.f1466i, (int) this.f1994i);
        }
        if (this.f1995j > 0.0f) {
            if (this.f1996k == null) {
                C0559e.m3181a(c0456j, abstractC0224s.m4309N(), (int) this.f1995j);
            } else {
                Iterator it = this.f1996k.m3477a().iterator();
                while (it.hasNext()) {
                    C0559e.m3181a(c0456j, ((AbstractC0224s) it.next()).m4309N(), (int) this.f1995j);
                }
            }
        }
        if (this.f1999n >= 0.0f) {
            c0456j.m4193r(this.f1999n);
            c0456j.f1630cn = this.f1999n;
        }
        if (this.f2000o != null) {
            c0456j.m2933b(c0456j.f7172eo + this.f2000o.f7064a, c0456j.f7173ep + this.f2000o.f7065b);
            c0456j.f7174eq += this.f2000o.f7066c;
            c0456j.f1653cK = true;
            return true;
        }
        return true;
    }
}