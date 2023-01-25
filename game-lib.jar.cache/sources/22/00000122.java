package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/m.class */
public class TestUnitReference extends AbstractScriptTest {
    /* renamed from: a */
    public void m5426a() {
        GameEngine.m5924e("Unit Reference tests");
        C0458l c0458l = C0458l.f2933b;
        AbstractC0629y m3761a = C0458l.m3761a(false, c0458l);
        m3761a.m3079b(PlayerData.f1373i);
        C0456j m3761a2 = C0458l.m3761a(false, c0458l);
        m3761a2.m3079b(PlayerData.f1373i);
        m3761a2.f7172eo = 2.0f;
        C0456j m3761a3 = C0458l.m3761a(false, c0458l);
        m3761a3.m3079b(PlayerData.f1373i);
        m3761a3.f7172eo = 3.0f;
        C0456j m3761a4 = C0458l.m3761a(false, c0458l);
        m3761a4.m3079b(PlayerData.f1373i);
        m3761a4.f7172eo = 3.0f;
        m3761a2.m3943C(m3761a3);
        m3761a2.m3943C(m3761a4);
        C0456j m3761a5 = C0458l.m3761a(false, c0458l);
        m3761a5.m3079b(PlayerData.f1373i);
        C0456j m3761a6 = C0458l.m3761a(false, c0458l);
        m3761a6.m3079b(PlayerData.f1373i);
        C0456j m3761a7 = C0458l.m3761a(false, c0458l);
        m3761a7.m3079b(PlayerData.f1373i);
        m3761a.f1584bu = m3761a5;
        m3761a5.f1585bv = m3761a6;
        m3761a3.f1585bv = m3761a6;
        m3761a2.f1584bu = m3761a7;
        GameEngine.m5924e("=== unit reference tests == (runs:2)");
        Long valueOf = Long.valueOf(C0742br.m2574a());
        for (int i = 0; i < 2; i++) {
            m5424a(m3761a, m5423a("self"), m3761a);
            m5424a(m3761a, m5423a("self.parent"), null);
            m5422a("self.unknown", true);
            m5424a(m3761a, m5423a("self.parent"), null);
            m5424a(m3761a, m5423a("nullUnit"), null);
            m5424a(m3761a, m5423a("self.customTarget1"), m3761a5);
            m5424a(m3761a, m5423a("self.customTarget1.customTarget2"), m3761a6);
            m5424a(m3761a, m5423a("self.customTarget2"), null);
            m5424a(m3761a, m5423a("self.nullUnit"), null);
            m5424a(m3761a, m5423a("nullUnit.nullUnit"), null);
            m5424a(m3761a3, m5423a("self.parent.customTarget1"), m3761a7);
            m5424a(m3761a2, m5423a("self.transporting(slot=0)"), m3761a3);
            m5424a(m3761a2, m5423a("self.transporting(SLOT=0)"), m3761a3);
            m5422a("self.transporting(MISS=0)", true);
            m5424a(m3761a2, m5423a("self.transporting(slot=3)"), null);
            m5424a(m3761a2, m5423a("self.transporting"), m3761a3);
            m5424a(m3761a2, m5423a("self.transporting(slot=0).customTarget2"), m3761a6);
            m5424a(m3761a2, m5423a("self.self.transporting(slot=0).customTarget2"), m3761a6);
            m5424a(m3761a2, m5423a("self.SELF.TRANsporting(slot=0).customTarget2"), m3761a6);
            m5424a(m3761a2, m5423a("self.SELF.transporting(slot=0).customTarget2"), m3761a6);
            m5425a(m3761a, m5423a("self.nearestUnit(withinRange=500, withTag='test', relation='any')"));
            m5422a(VariableScope.nullOrMissingString, true);
        }
        GameEngine.m5924e("Took: " + C0742br.m2571a(valueOf.longValue(), Long.valueOf(C0742br.m2574a()).longValue()));
    }

    /* renamed from: a */
    public void m5422a(String str, boolean z) {
        try {
            UnitReference.parseSingleUnitReferenceBlock(C0458l.f2933b, str);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.m5924e("(debug)assertCreateError: " + str + " expected-error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public UnitReference m5423a(String str) {
        try {
            UnitReference parseSingleUnitReferenceBlock = UnitReference.parseSingleUnitReferenceBlock(C0458l.f2933b, str);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Null when parsing [" + str + "]");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m5424a(AbstractC0629y abstractC0629y, UnitReference unitReference, AbstractC0244am abstractC0244am) {
        AbstractC0244am abstractC0244am2 = unitReference.get(abstractC0629y);
        if (abstractC0244am2 != abstractC0244am) {
            throw new RuntimeException("assertSame type expected:" + AbstractC0244am.m4693A(abstractC0244am) + " got: " + AbstractC0244am.m4693A(abstractC0244am2));
        }
    }

    /* renamed from: a */
    public void m5425a(AbstractC0629y abstractC0629y, UnitReference unitReference) {
        unitReference.get(abstractC0629y);
    }
}