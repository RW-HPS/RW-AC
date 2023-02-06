package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;

/* renamed from: com.corrodinggames.rts.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/m.class */
public class TestUnitReference extends AbstractScriptTest {
    public void a() {
        GameEngine.m5e("Unit Reference tests");
        l lVar = l.b;
        y a = l.a(false, lVar);
        a.b(PlayerData.i);
        j a2 = l.a(false, lVar);
        a2.b(PlayerData.i);
        a2.eo = 2.0f;
        j a3 = l.a(false, lVar);
        a3.b(PlayerData.i);
        a3.eo = 3.0f;
        j a4 = l.a(false, lVar);
        a4.b(PlayerData.i);
        a4.eo = 3.0f;
        a2.C(a3);
        a2.C(a4);
        j a5 = l.a(false, lVar);
        a5.b(PlayerData.i);
        am a6 = l.a(false, lVar);
        a6.b(PlayerData.i);
        am a7 = l.a(false, lVar);
        a7.b(PlayerData.i);
        a.bu = a5;
        a5.bv = a6;
        a3.bv = a6;
        a2.bu = a7;
        GameEngine.m5e("=== unit reference tests == (runs:2)");
        Long valueOf = Long.valueOf(Unit.loadAllUnitsTook());
        for (int i = 0; i < 2; i++) {
            a(a, a("self"), a);
            a(a, a("self.parent"), null);
            a("self.unknown", true);
            a(a, a("self.parent"), null);
            a(a, a("nullUnit"), null);
            a(a, a("self.customTarget1"), a5);
            a(a, a("self.customTarget1.customTarget2"), a6);
            a(a, a("self.customTarget2"), null);
            a(a, a("self.nullUnit"), null);
            a(a, a("nullUnit.nullUnit"), null);
            a(a3, a("self.parent.customTarget1"), a7);
            a(a2, a("self.transporting(slot=0)"), a3);
            a(a2, a("self.transporting(SLOT=0)"), a3);
            a("self.transporting(MISS=0)", true);
            a(a2, a("self.transporting(slot=3)"), null);
            a(a2, a("self.transporting"), a3);
            a(a2, a("self.transporting(slot=0).customTarget2"), a6);
            a(a2, a("self.self.transporting(slot=0).customTarget2"), a6);
            a(a2, a("self.SELF.TRANsporting(slot=0).customTarget2"), a6);
            a(a2, a("self.SELF.transporting(slot=0).customTarget2"), a6);
            a(a, a("self.nearestUnit(withinRange=500, withTag='test', relation='any')"));
            a(VariableScope.nullOrMissingString, true);
        }
        GameEngine.m5e("Took: " + Unit.a(valueOf.longValue(), Long.valueOf(Unit.loadAllUnitsTook()).longValue()));
    }

    public void a(String str, boolean z) {
        try {
            UnitReference.parseSingleUnitReferenceBlock(l.b, str);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.m5e("(debug)assertCreateError: " + str + " expected-error:" + e.getMessage());
            }
        }
    }

    public UnitReference a(String str) {
        try {
            UnitReference parseSingleUnitReferenceBlock = UnitReference.parseSingleUnitReferenceBlock(l.b, str);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Null when parsing [" + str + "]");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    public void a(y yVar, UnitReference unitReference, am amVar) {
        am amVar2 = unitReference.get(yVar);
        if (amVar2 != amVar) {
            throw new RuntimeException("assertSame type expected:" + am.A(amVar) + " got: " + am.A(amVar2));
        }
    }

    public void a(y yVar, UnitReference unitReference) {
        unitReference.get(yVar);
    }
}