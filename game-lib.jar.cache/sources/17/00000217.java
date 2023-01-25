package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a;
import com.corrodinggames.rts.game.units.custom.p016a.C0339d;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/h.class */
public class C0329h extends AbstractC0321a {

    /* renamed from: a */
    VariableScope.CachedWriter f1978a;

    /* renamed from: b */
    boolean f1979b;

    /* renamed from: c */
    LogicBoolean f1980c;

    /* renamed from: d */
    LogicBoolean f1981d;

    /* renamed from: e */
    VariableScope.MemoryNames f1982e;

    /* renamed from: a */
    public static void m4099a(C0458l c0458l, C1107ab c1107ab, String str, String str2, C0339d c0339d, String str3, boolean z) {
        boolean booleanValue = c1107ab.m685a(str, str2 + "swapCustomTarget1And2", (Boolean) false).booleanValue();
        LogicBoolean m671b = c1107ab.m671b(c0458l, str, str2 + "setCustomTarget1", null);
        LogicBoolean m671b2 = c1107ab.m671b(c0458l, str, str2 + "setCustomTarget2", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String m666b = c1107ab.m666b(str, str2 + "setUnitMemory", (String) null);
        if (m666b != null) {
            memoryWriter = VariableScope.createMemoryWriter(m666b, c0458l, str, str2 + "setUnitMemory");
        }
        String m666b2 = c1107ab.m666b(str, str2 + "shrinkArrays", (String) null);
        VariableScope.MemoryNames memoryNames = null;
        if (m666b2 != null) {
            memoryNames = VariableScope.createMemoryNameList(m666b2, c0458l, null, str, str2 + "shrinkArrays");
            Iterator it = memoryNames.names.iterator();
            while (it.hasNext()) {
                VariableScope.VariableName variableName = (VariableScope.VariableName) it.next();
                VariableScope.VariableDefinition variableDefinition = c0458l.f2950r.get(variableName);
                if (variableDefinition == null) {
                    throw new C0417bo("Failed to find defined memory: " + variableName, str, str2 + "shrinkArrays");
                }
                if (!LogicBoolean.ReturnType.isArrayType(variableDefinition.type)) {
                    throw new C0417bo("Memory: " + variableName + " is type: " + variableDefinition.type + " expected an array type", str, str2 + "shrinkArrays");
                }
                if (variableDefinition.type != LogicBoolean.ReturnType.numberArray && variableDefinition.type != LogicBoolean.ReturnType.unitArray) {
                    throw new C0417bo("Memory: " + variableName + " is type: " + variableDefinition.type + " only number and unit arrays are supported by shrinkArrays", str, str2 + "shrinkArrays");
                }
            }
        }
        if (booleanValue || m671b != null || m671b2 != null || memoryWriter != null || memoryNames != null) {
            C0329h c0329h = new C0329h();
            c0329h.f1978a = memoryWriter;
            c0329h.f1979b = booleanValue;
            c0329h.f1980c = m671b;
            c0329h.f1981d = m671b2;
            c0329h.f1982e = memoryNames;
            c0339d.f2112ac.add(c0329h);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0321a
    /* renamed from: a */
    public boolean mo4093a(C0456j c0456j, AbstractC0224s abstractC0224s, PointF pointF, AbstractC0244am abstractC0244am, int i) {
        if (this.f1978a != null) {
            this.f1978a.writeToUnit(c0456j);
        }
        if (this.f1979b) {
            AbstractC0244am abstractC0244am2 = c0456j.f1584bu;
            c0456j.f1584bu = c0456j.f1585bv;
            c0456j.f1585bv = abstractC0244am2;
        }
        if (this.f1980c != null) {
            c0456j.f1584bu = VariableScope.getSafeUnitReferenceForStorage(this.f1980c.readUnit(c0456j));
        }
        if (this.f1981d != null) {
            c0456j.f1585bv = VariableScope.getSafeUnitReferenceForStorage(this.f1981d.readUnit(c0456j));
        }
        if (this.f1982e != null) {
            m4100a(c0456j, this.f1982e);
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public static void m4100a(C0456j c0456j, VariableScope.MemoryNames memoryNames) {
        if (c0456j.f1586bw == null) {
            return;
        }
        Iterator it = memoryNames.names.iterator();
        while (it.hasNext()) {
            VariableScope.VariableData dataObjectRaw = c0456j.f1586bw.getDataObjectRaw((VariableScope.VariableName) it.next());
            if (dataObjectRaw != null && (dataObjectRaw instanceof VariableScope.VariableDataArray)) {
                ((VariableScope.VariableDataArray) dataObjectRaw).shrink();
            }
        }
    }
}