package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.af;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.ab;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/i.class */
public class i extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    VariableScope.MemoryWriter f225a;
    LogicBoolean b;
    com.corrodinggames.rts.game.units.custom.h c;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        LogicBoolean b = abVar.b(lVar, str, str2 + "sendMessageTo", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String b2 = abVar.b(str, str2 + "sendMessageWithData", (String) null);
        if (b2 != null) {
            memoryWriter = VariableScope.createGenericKeyValueWriter(b2, lVar, str, str2 + "sendMessageWithData");
        }
        com.corrodinggames.rts.game.units.custom.h a2 = abVar.a(lVar, str, str2 + "sendMessageWithTags", (com.corrodinggames.rts.game.units.custom.h) null);
        if (b != null) {
            i iVar = new i();
            iVar.b = b;
            iVar.f225a = memoryWriter;
            iVar.c = a2;
            dVar.ac.add(iVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        am readUnit;
        if (this.b != null && (readUnit = this.b.readUnit(jVar)) != null) {
            VariableScope variableScope = null;
            if (this.f225a != null) {
                variableScope = new VariableScope();
                this.f225a.writeToMemory(variableScope, jVar);
            }
            readUnit.a(af.newMessage, jVar, this.c, variableScope);
            return true;
        }
        return true;
    }
}