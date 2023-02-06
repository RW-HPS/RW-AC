package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.as;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.ai;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/j.class */
public class j extends com.corrodinggames.rts.game.units.custom.a.a {
    boolean a;
    boolean b;
    boolean c;
    LogicBoolean d;
    LogicBoolean e;
    LogicBoolean f;
    LogicBoolean g;
    boolean h;
    float i;
    float j;
    u k;
    boolean l;
    boolean m;
    float n = -1.0f;
    ai o;
    boolean p;
    VariableScope.CachedWriter q;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean booleanValue = abVar.a(str, str2 + "resetUnitStats", (Boolean) false).booleanValue();
        String b = abVar.b(str, str2 + "setUnitStats", (String) null);
        if (booleanValue || b != null) {
            j jVar = new j();
            jVar.p = booleanValue;
            if (b != null) {
                jVar.q = as.a(b, lVar, str, str2 + "setUnitStats");
            }
            dVar.ac.add(jVar);
        }
        boolean booleanValue2 = abVar.a(str, str2 + "deleteSelf", (Boolean) false).booleanValue();
        if (booleanValue2) {
            j jVar2 = new j();
            jVar2.a = booleanValue2;
            dVar.ac.add(jVar2);
        }
        boolean booleanValue3 = abVar.a(str, str2 + "switchToNeutralTeam", (Boolean) false).booleanValue();
        boolean booleanValue4 = abVar.a(str, str2 + "switchToAggressiveTeam", (Boolean) false).booleanValue();
        LogicBoolean a = abVar.a(lVar, str, str2 + "switchToTeam", (LogicBoolean) null, LogicBoolean.ReturnType.number);
        if (booleanValue3 || booleanValue4 || a != null) {
            j jVar3 = new j();
            jVar3.b = booleanValue3;
            jVar3.c = booleanValue4;
            jVar3.d = a;
            dVar.ac.add(jVar3);
        }
        LogicBoolean c = abVar.c(lVar, str, str2 + "setBodyRotation", null);
        if (c != null) {
            j jVar4 = new j();
            jVar4.e = c;
            dVar.ac.add(jVar4);
        }
        LogicBoolean c2 = abVar.c(lVar, str, str2 + "setHeight", null);
        if (c2 != null) {
            j jVar5 = new j();
            jVar5.f = c2;
            dVar.ac.add(jVar5);
        }
        LogicBoolean b2 = abVar.b(lVar, str, str2 + "teleportTo", null);
        if (b2 != null) {
            j jVar6 = new j();
            jVar6.g = b2;
            dVar.ac.add(jVar6);
        }
        float floatValue = abVar.a(str, str2 + "setBuilt", Float.valueOf(-1.0f)).floatValue();
        if (floatValue > 1.0f) {
            throw new bo("[" + str + "] setBuilt cannot be greater than 1");
        }
        boolean booleanValue5 = abVar.a(str, str2 + "clearAllActionCooldowns", (Boolean) false).booleanValue();
        float floatValue2 = abVar.c(str, str2 + "addAllActionCooldownsTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue2 == 0.0f) {
            floatValue2 = abVar.c(str, str2 + "addAllActionCooldownsFor", Float.valueOf(0.0f)).floatValue();
        }
        float floatValue3 = abVar.c(str, str2 + "addActionCooldownTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue3 == 0.0f) {
            floatValue3 = abVar.c(str, str2 + "addActionCooldownFor", Float.valueOf(0.0f)).floatValue();
        }
        u a2 = abVar.a(lVar, str, str2 + "addActionCooldownApplyToActions", (u) null);
        ai a3 = abVar.a(str, str2 + "offsetSelfAbsolute", (ai) null);
        if (a2 != null && floatValue3 <= 0.0f) {
            throw new bo("[" + str + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
        }
        boolean booleanValue6 = abVar.a(str, str2 + "removeAllQueuedItemsWithoutRefund", (Boolean) false).booleanValue();
        boolean booleanValue7 = abVar.a(str, str2 + "refundAllQueuedItems", (Boolean) false).booleanValue();
        if (booleanValue6 && booleanValue7) {
            throw new bo("[" + str + "]Cannot set removeAllQueuedActionsWithoutRefund and refundAllQueuedActions at the same time, pick one.");
        }
        if (floatValue3 > 0.0f || floatValue2 > 0.0f || booleanValue5 || floatValue >= 0.0f || a3 != null || booleanValue6 || booleanValue7) {
            j jVar7 = new j();
            jVar7.h = booleanValue5;
            jVar7.i = floatValue2;
            jVar7.j = floatValue3;
            jVar7.k = a2;
            jVar7.n = floatValue;
            jVar7.o = a3;
            jVar7.l = booleanValue6;
            jVar7.m = booleanValue7;
            dVar.ac.add(jVar7);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        am readUnit;
        PlayerData playerData;
        if (this.p) {
            jVar.y = jVar.x.cL;
            jVar.cv = jVar.y.c;
            if (jVar.cu > jVar.cv) {
                jVar.o(jVar.cv);
            }
            jVar.cA = jVar.y.g;
            if (jVar.cx > jVar.cA) {
                jVar.cx = jVar.cA;
            }
        }
        if (this.q != null) {
            this.q.writeToUnit(jVar);
            com.corrodinggames.rts.game.units.custom.d.b.d(jVar);
        }
        if (this.a) {
            jVar.ci();
            if (jVar.bI()) {
                GameEngine.getGameEngine().bU.a(jVar);
            }
        }
        if (this.b) {
            jVar.e(PlayerData.i);
        }
        if (this.c) {
            jVar.e(PlayerData.h);
        }
        if (this.d != null && (playerData = PlayerData.getPlayerData((int) this.d.readNumber(jVar))) != null) {
            jVar.e(playerData);
        }
        if (this.e != null) {
            jVar.h(this.e.readNumber(jVar));
        }
        if (this.f != null) {
            jVar.eq = this.f.readNumber(jVar);
        }
        if (this.g != null && (readUnit = this.g.readUnit(jVar)) != null) {
            jVar.f(readUnit.eo, readUnit.ep);
        }
        if (this.h) {
            com.corrodinggames.rts.game.units.g.e.c(jVar, s.i);
        }
        if (this.l) {
            jVar.i(false);
        }
        if (this.m) {
            jVar.i(true);
        }
        if (this.i > 0.0f) {
            com.corrodinggames.rts.game.units.g.e.a(jVar, s.i, (int) this.i);
        }
        if (this.j > 0.0f) {
            if (this.k == null) {
                com.corrodinggames.rts.game.units.g.e.a(jVar, sVar.N(), (int) this.j);
            } else {
                Iterator it = this.k.a().iterator();
                while (it.hasNext()) {
                    com.corrodinggames.rts.game.units.g.e.a(jVar, ((s) it.next()).N(), (int) this.j);
                }
            }
        }
        if (this.n >= 0.0f) {
            jVar.r(this.n);
            jVar.cn = this.n;
        }
        if (this.o != null) {
            jVar.b(jVar.eo + this.o.a, jVar.ep + this.o.b);
            jVar.eq += this.o.c;
            jVar.cK = true;
            return true;
        }
        return true;
    }
}