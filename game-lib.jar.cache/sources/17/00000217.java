package com.corrodinggames.rts.game.units.custom.a.a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.a.s;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.ab;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/h.class */
public class h extends com.corrodinggames.rts.game.units.custom.a.a {

    /* renamed from: a  reason: collision with root package name */
    VariableScope.CachedWriter f224a;
    boolean b;
    LogicBoolean c;
    LogicBoolean d;
    VariableScope.MemoryNames e;

    public static void a(com.corrodinggames.rts.game.units.custom.l lVar, ab abVar, String str, String str2, com.corrodinggames.rts.game.units.custom.a.d dVar, String str3, boolean z) {
        boolean booleanValue = abVar.a(str, str2 + "swapCustomTarget1And2", (Boolean) false).booleanValue();
        LogicBoolean b = abVar.b(lVar, str, str2 + "setCustomTarget1", null);
        LogicBoolean b2 = abVar.b(lVar, str, str2 + "setCustomTarget2", null);
        VariableScope.MemoryWriter memoryWriter = null;
        String b3 = abVar.b(str, str2 + "setUnitMemory", (String) null);
        if (b3 != null) {
            memoryWriter = VariableScope.createMemoryWriter(b3, lVar, str, str2 + "setUnitMemory");
        }
        String b4 = abVar.b(str, str2 + "shrinkArrays", (String) null);
        VariableScope.MemoryNames memoryNames = null;
        if (b4 != null) {
            memoryNames = VariableScope.createMemoryNameList(b4, lVar, null, str, str2 + "shrinkArrays");
            Iterator it = memoryNames.names.iterator();
            while (it.hasNext()) {
                VariableScope.VariableName variableName = (VariableScope.VariableName) it.next();
                VariableScope.VariableDefinition variableDefinition = lVar.r.get(variableName);
                if (variableDefinition == null) {
                    throw new bo("Failed to find defined memory: " + variableName, str, str2 + "shrinkArrays");
                }
                if (!LogicBoolean.ReturnType.isArrayType(variableDefinition.type)) {
                    throw new bo("Memory: " + variableName + " is type: " + variableDefinition.type + " expected an array type", str, str2 + "shrinkArrays");
                }
                if (variableDefinition.type != LogicBoolean.ReturnType.numberArray && variableDefinition.type != LogicBoolean.ReturnType.unitArray) {
                    throw new bo("Memory: " + variableName + " is type: " + variableDefinition.type + " only number and unit arrays are supported by shrinkArrays", str, str2 + "shrinkArrays");
                }
            }
        }
        if (booleanValue || b != null || b2 != null || memoryWriter != null || memoryNames != null) {
            h hVar = new h();
            hVar.f224a = memoryWriter;
            hVar.b = booleanValue;
            hVar.c = b;
            hVar.d = b2;
            hVar.e = memoryNames;
            dVar.ac.add(hVar);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.a.a
    public boolean a(com.corrodinggames.rts.game.units.custom.j jVar, s sVar, PointF pointF, am amVar, int i) {
        if (this.f224a != null) {
            this.f224a.writeToUnit(jVar);
        }
        if (this.b) {
            am amVar2 = jVar.bu;
            jVar.bu = jVar.bv;
            jVar.bv = amVar2;
        }
        if (this.c != null) {
            jVar.bu = VariableScope.getSafeUnitReferenceForStorage(this.c.readUnit(jVar));
        }
        if (this.d != null) {
            jVar.bv = VariableScope.getSafeUnitReferenceForStorage(this.d.readUnit(jVar));
        }
        if (this.e != null) {
            a(jVar, this.e);
            return true;
        }
        return true;
    }

    public static void a(com.corrodinggames.rts.game.units.custom.j jVar, VariableScope.MemoryNames memoryNames) {
        if (jVar.bw == null) {
            return;
        }
        Iterator it = memoryNames.names.iterator();
        while (it.hasNext()) {
            VariableScope.VariableData dataObjectRaw = jVar.bw.getDataObjectRaw((VariableScope.VariableName) it.next());
            if (dataObjectRaw != null && (dataObjectRaw instanceof VariableScope.VariableDataArray)) {
                ((VariableScope.VariableDataArray) dataObjectRaw).shrink();
            }
        }
    }
}