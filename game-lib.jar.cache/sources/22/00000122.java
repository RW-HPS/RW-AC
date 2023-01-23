package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/m.class */
public class m extends l {
    public void a() {
        GameEngine.m328e("Unit Reference tests");
        com.corrodinggames.rts.game.units.custom.l lVar = com.corrodinggames.rts.game.units.custom.l.b;
        y a2 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a2.b(PlayerData.i);
        com.corrodinggames.rts.game.units.custom.j a3 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a3.b(PlayerData.i);
        a3.eo = 2.0f;
        com.corrodinggames.rts.game.units.custom.j a4 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a4.b(PlayerData.i);
        a4.eo = 3.0f;
        com.corrodinggames.rts.game.units.custom.j a5 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a5.b(PlayerData.i);
        a5.eo = 3.0f;
        a3.C(a4);
        a3.C(a5);
        com.corrodinggames.rts.game.units.custom.j a6 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a6.b(PlayerData.i);
        am a7 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a7.b(PlayerData.i);
        am a8 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a8.b(PlayerData.i);
        a2.bu = a6;
        a6.bv = a7;
        a4.bv = a7;
        a3.bu = a8;
        GameEngine.m328e("=== unit reference tests == (runs:2)");
        Long valueOf = Long.valueOf(br.a());
        for (int i = 0; i < 2; i++) {
            a(a2, a("self"), a2);
            a(a2, a("self.parent"), null);
            a("self.unknown", true);
            a(a2, a("self.parent"), null);
            a(a2, a("nullUnit"), null);
            a(a2, a("self.customTarget1"), a6);
            a(a2, a("self.customTarget1.customTarget2"), a7);
            a(a2, a("self.customTarget2"), null);
            a(a2, a("self.nullUnit"), null);
            a(a2, a("nullUnit.nullUnit"), null);
            a(a4, a("self.parent.customTarget1"), a8);
            a(a3, a("self.transporting(slot=0)"), a4);
            a(a3, a("self.transporting(SLOT=0)"), a4);
            a("self.transporting(MISS=0)", true);
            a(a3, a("self.transporting(slot=3)"), null);
            a(a3, a("self.transporting"), a4);
            a(a3, a("self.transporting(slot=0).customTarget2"), a7);
            a(a3, a("self.self.transporting(slot=0).customTarget2"), a7);
            a(a3, a("self.SELF.TRANsporting(slot=0).customTarget2"), a7);
            a(a3, a("self.SELF.transporting(slot=0).customTarget2"), a7);
            a(a2, a("self.nearestUnit(withinRange=500, withTag='test', relation='any')"));
            a(VariableScope.nullOrMissingString, true);
        }
        GameEngine.m328e("Took: " + br.a(valueOf.longValue(), Long.valueOf(br.a()).longValue()));
    }

    public void a(String str, boolean z) {
        try {
            UnitReference.parseSingleUnitReferenceBlock(com.corrodinggames.rts.game.units.custom.l.b, str);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.m328e("(debug)assertCreateError: " + str + " expected-error:" + e.getMessage());
            }
        }
    }

    public UnitReference a(String str) {
        try {
            UnitReference parseSingleUnitReferenceBlock = UnitReference.parseSingleUnitReferenceBlock(com.corrodinggames.rts.game.units.custom.l.b, str);
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