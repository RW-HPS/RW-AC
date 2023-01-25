package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0624t;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0457k;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope.class */
public class VariableScope {
    public static final String nullOrMissingString = "";
    VariableName[] variableNames = emptyNames;
    VariableData[] variableData = emptyData;
    public static final VariableScope emptyVariableScope = new EmptyVariableScope();
    static final VariableName[] emptyNames = new VariableName[0];
    static final VariableData[] emptyData = new VariableData[0];
    public static final VariableDataNull variableDataNull = new VariableDataNull();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryNames.class */
    public class MemoryNames {
        public C1136m names = new C1136m();
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDefinition.class */
    public class VariableDefinition {
        public VariableName name;
        public LogicBoolean.ReturnType type;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$EmptyVariableScope.class */
    public class EmptyVariableScope extends VariableScope {
        EmptyVariableScope() {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope
        public void setDataRaw(VariableName variableName, VariableData variableData) {
            throw new RuntimeException("Not allowed");
        }
    }

    public boolean isEmpty() {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                return false;
            }
        }
        return true;
    }

    public String debugMemory(boolean z, boolean z2) {
        VariableData variableData;
        String str = nullOrMissingString;
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableData[i] != null) {
                String str2 = str + this.variableNames[i].f3343id + "=" + variableData.valueToStringDebug(null);
                if (z2) {
                    str2 = str2 + " (" + variableData.getReturnType().name() + ")";
                }
                if (z) {
                    str = str2 + "\n";
                } else {
                    str = str2 + "|";
                }
            }
        }
        return str;
    }

    public VariableData getDataObjectRaw(VariableName variableName) {
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                return this.variableData[i];
            }
        }
        return variableDataNull;
    }

    public void setArrayDataRaw(VariableName variableName, VariableData variableData, int i) {
        VariableDataNumberArray variableDataNumberArray = null;
        LogicBoolean.ReturnType returnType = LogicBoolean.ReturnType.undefined;
        if (variableData != null) {
            returnType = variableData.getReturnType();
        }
        for (int i2 = 0; i2 < this.variableData.length; i2++) {
            if (this.variableNames[i2] == variableName && (this.variableData[i2] instanceof VariableDataArray)) {
                VariableDataArray variableDataArray = (VariableDataArray) this.variableData[i2];
                if (returnType == LogicBoolean.ReturnType.undefined || variableDataArray.getElementReturnType() == returnType) {
                    variableDataNumberArray = variableDataArray;
                }
            }
        }
        if (variableDataNumberArray == null && variableData == null) {
            return;
        }
        if (variableDataNumberArray == null) {
            if (returnType == LogicBoolean.ReturnType.number) {
                variableDataNumberArray = new VariableDataNumberArray();
            } else if (returnType == LogicBoolean.ReturnType.bool) {
                variableDataNumberArray = new VariableDataBoolArray();
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                variableDataNumberArray = new VariableDataUnitArray();
            } else {
                GameEngine.print("Unhandled array type: " + returnType);
                return;
            }
            setDataRaw(variableName, variableDataNumberArray);
        }
        variableDataNumberArray.setDataAtIndex(variableData, i);
    }

    public void setDataRaw(VariableName variableName, VariableData variableData) {
        if (variableData == null) {
            variableData = variableDataNull;
        }
        for (int i = 0; i < this.variableData.length; i++) {
            if (this.variableNames[i] == variableName) {
                this.variableData[i] = variableData;
                return;
            }
        }
        VariableName[] variableNameArr = new VariableName[this.variableData.length + 1];
        VariableData[] variableDataArr = new VariableData[this.variableData.length + 1];
        for (int i2 = 0; i2 < this.variableData.length; i2++) {
            variableDataArr[i2] = this.variableData[i2];
            variableNameArr[i2] = this.variableNames[i2];
        }
        variableDataArr[variableDataArr.length - 1] = variableData;
        variableNameArr[variableNameArr.length - 1] = variableName;
        this.variableData = variableDataArr;
        this.variableNames = variableNameArr;
    }

    public void clearAllData() {
        this.variableData = emptyData;
        this.variableNames = emptyNames;
    }

    public void setUnit(VariableDefinition variableDefinition, AbstractC0244am abstractC0244am) {
        if (variableDefinition.type != LogicBoolean.ReturnType.unit) {
        }
        setDataRaw(variableDefinition.name, new VariableDataUnit(abstractC0244am));
    }

    AbstractC0244am getUnit(VariableName variableName) {
        return getDataObjectRaw(variableName).readUnit(null);
    }

    LogicBoolean getAsLogicBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName);
    }

    public void setFromLogicBoolean(VariableName variableName, AbstractC0629y abstractC0629y, LogicBoolean logicBoolean, LogicBoolean logicBoolean2) {
        VariableDataBoolean variableDataBoolean = null;
        if (logicBoolean != null) {
            LogicBoolean.ReturnType returnType = logicBoolean.getReturnType();
            if (returnType == LogicBoolean.ReturnType.bool) {
                variableDataBoolean = new VariableDataBoolean(logicBoolean.read(abstractC0629y));
            } else if (returnType == LogicBoolean.ReturnType.unit) {
                variableDataBoolean = new VariableDataUnit(getSafeUnitReferenceForStorage(logicBoolean.readUnit(abstractC0629y)));
            } else if (returnType == LogicBoolean.ReturnType.number) {
                variableDataBoolean = new VariableDataNumber(logicBoolean.readNumber(abstractC0629y));
            } else if (returnType == LogicBoolean.ReturnType.string) {
                variableDataBoolean = new VariableDataString(logicBoolean.readString(abstractC0629y));
            }
        }
        if (logicBoolean2 != null) {
            setArrayDataRaw(variableName, variableDataBoolean, (int) logicBoolean2.readNumber(abstractC0629y));
            return;
        }
        setDataRaw(variableName, variableDataBoolean);
    }

    double getNumber(VariableName variableName) {
        return getDataObjectRaw(variableName).readNumber(null);
    }

    String getString(VariableName variableName) {
        return getDataObjectRaw(variableName).readString(null);
    }

    boolean getBoolean(VariableName variableName) {
        return getDataObjectRaw(variableName).read(null);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableMapping.class */
    public class VariableMapping {
        C0458l meta;
        C1136m mapping = new C1136m();

        public VariableDefinition create(String str, LogicBoolean.ReturnType returnType) {
            VariableName variableName = VariableName.get(str);
            if (get(variableName) != null) {
                throw new RuntimeException("A variable already exists with the name: " + str);
            }
            VariableDefinition variableDefinition = new VariableDefinition();
            variableDefinition.name = variableName;
            variableDefinition.type = returnType;
            this.mapping.add(variableDefinition);
            return variableDefinition;
        }

        public VariableDefinition get(String str) {
            VariableName variableName = VariableName.get(str.toLowerCase(Locale.ROOT).trim());
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public VariableDefinition get(VariableName variableName) {
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (variableDefinition.name == variableName) {
                    return variableDefinition;
                }
            }
            return null;
        }

        public boolean hasArrays() {
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                if (LogicBoolean.ReturnType.isArrayType(((VariableDefinition) it.next()).type)) {
                    return true;
                }
            }
            return false;
        }

        public String getListOfPossibleNames() {
            String str = null;
            Iterator it = this.mapping.iterator();
            while (it.hasNext()) {
                VariableDefinition variableDefinition = (VariableDefinition) it.next();
                if (str == null) {
                    str = VariableScope.nullOrMissingString + variableDefinition.name;
                } else {
                    str = str + ", " + variableDefinition.name;
                }
            }
            return str;
        }

        public void addDefineKey(C1107ab c1107ab, C0458l c0458l, String str, String str2, String str3) {
            String m666b = c1107ab.m666b(str2, str3, (String) null);
            if (m666b != null && !m666b.equals(VariableScope.nullOrMissingString)) {
                throw new RuntimeException("[" + str2 + "]" + str + ": Unexpected format");
            }
            defineVariablesRaw(str, str2, str3);
        }

        public void addDefineValue(C0458l c0458l, String str, String str2, String str3) {
            defineVariablesRaw(str2, str, str3);
        }

        public void defineVariables(C0458l c0458l, String str) {
            defineVariablesRaw("define", VariableScope.nullOrMissingString, str);
        }

        public void addSingleDefine(C0458l c0458l, String str, String str2, String str3, String str4) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            String trim = str.toLowerCase(Locale.ROOT).trim();
            LogicBoolean.ReturnType userType = VariableScope.getUserType(lowerCase);
            if (userType == null) {
                throw new RuntimeException("[" + str3 + "]" + str4 + ": Unknown type: " + lowerCase);
            }
            checkNameReserved(trim, str3, str4);
            VariableDefinition variableDefinition = get(trim);
            if (variableDefinition != null) {
                if (variableDefinition.type == userType) {
                    return;
                }
                throw new RuntimeException("[" + str3 + "]" + str4 + ": A memory variable already exists with the name: " + trim + " and is a different type: " + variableDefinition.type.name());
            }
            create(trim, userType);
        }

        public void defineVariablesRaw(String str, String str2, String str3) {
            for (String str4 : C0773f.m2145c(str3, ',')) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    int indexOf = trim.indexOf(" ");
                    if (indexOf == -1) {
                        throw new RuntimeException("[" + str2 + "]" + str + ": Expected 'type name' in each section, got: " + trim);
                    }
                    addSingleDefine(this.meta, trim.substring(indexOf, trim.length()).toLowerCase(Locale.ROOT).trim(), trim.substring(0, indexOf).toLowerCase(Locale.ROOT).trim(), str2, str);
                }
            }
        }

        public void checkNameReserved(String str, String str2, String str3) {
            boolean z = false;
            if (str.equals(VariableScope.nullOrMissingString)) {
                z = true;
            }
            if (str.equals("game") || str.equals("parent") || str.equals("self") || str.equals("this")) {
                z = true;
            }
            if (str.equals("boolean") || str.equals("bool") || str.equals("unit") || str.equals("void") || str.equals("null") || str.equals("number") || str.equals("float")) {
                z = true;
            }
            if (z) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable cannot be named: '" + str + "'");
            }
            if (str.contains(".") || str.contains("=") || str.contains("(") || str.contains(")") || str.contains("'") || str.contains("\"") || str.contains("?") || str.contains("|") || str.contains("\\") || str.contains("/") || str.contains("[") || str.contains("]") || str.contains(":") || str.contains(";")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name has reserved symbols: '" + str + "'");
            }
            if (str.contains(" ")) {
                throw new RuntimeException("[" + str2 + "]" + str3 + ": Variable name cannot have a space: '" + str + "'");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableName.class */
    public class VariableName {
        private static HashMap existingVariableName = new HashMap();

        /* renamed from: id */
        private String f3343id;

        public static VariableName getExistingOrNull(String str) {
            synchronized (existingVariableName) {
                VariableName variableName = (VariableName) existingVariableName.get(str);
                if (variableName != null) {
                    return variableName;
                }
                return null;
            }
        }

        public static VariableName get(String str) {
            synchronized (existingVariableName) {
                VariableName variableName = (VariableName) existingVariableName.get(str);
                if (variableName != null) {
                    return variableName;
                }
                VariableName variableName2 = new VariableName();
                variableName2.f3343id = str;
                existingVariableName.put(str, variableName2);
                return variableName2;
            }
        }

        public String getId() {
            return this.f3343id;
        }

        public String toString() {
            return this.f3343id;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableData.class */
    public abstract class VariableData extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public abstract LogicBoolean.ReturnType getReturnType();

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "Data(" + valueToStringDebug(null) + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return 0.0f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return VariableScope.nullOrMissingString;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNull.class */
    public class VariableDataNull extends VariableData {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "null";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataUnit.class */
    public class VariableDataUnit extends VariableData {
        AbstractC0244am unit;

        public VariableDataUnit(AbstractC0244am abstractC0244am) {
            this.unit = abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            return this.unit;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataBoolean.class */
    public class VariableDataBoolean extends VariableData {
        boolean bool;

        public VariableDataBoolean(boolean z) {
            this.bool = z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return this.bool;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataString.class */
    public class VariableDataString extends VariableData {
        String text;

        public VariableDataString(String str) {
            this.text = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.string;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNumber.class */
    public class VariableDataNumber extends VariableData {
        double number;

        public VariableDataNumber(double d) {
            this.number = d;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return (float) this.number;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataArray.class */
    public abstract class VariableDataArray extends VariableData {
        int size;

        public abstract LogicBoolean.ReturnType getElementReturnType();

        public abstract void setDataAtIndex(VariableData variableData, int i);

        public abstract VariableData readDataAtIndex(int i);

        public abstract void shrink();

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public int getArraySize(AbstractC0629y abstractC0629y) {
            return this.size;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean readArrayElement(AbstractC0629y abstractC0629y, int i) {
            return readDataAtIndex(i);
        }

        public boolean readBooleanIndex(int i) {
            return false;
        }

        public float readNumberIndex(int i) {
            return 0.0f;
        }

        public AbstractC0244am readUnitIndex(int i) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataNumberArray.class */
    public class VariableDataNumberArray extends VariableDataArray {
        float[] dataArray;
        public static final boolean trace = false;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray, com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.numberArray;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public LogicBoolean.ReturnType getElementReturnType() {
            return LogicBoolean.ReturnType.number;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public float readNumberIndex(int i) {
            if (i < 0 || i >= this.size) {
                return 0.0f;
            }
            return this.dataArray[i];
        }

        public void setNumberIndex(int i, float f) {
            if (i < 0 || i > 10000) {
                return;
            }
            if (this.dataArray == null) {
                this.dataArray = new float[i + 1];
            }
            if (i >= this.dataArray.length) {
                int length = this.dataArray.length;
                int i2 = length + (length < 12 / 2 ? 12 : length >> 1);
                if (i2 < i + 1) {
                    i2 = i + 1;
                }
                float[] fArr = new float[i2];
                System.arraycopy(this.dataArray, 0, fArr, 0, length);
                this.dataArray = fArr;
            }
            if (this.size < i + 1) {
                this.size = i + 1;
                if (this.size > this.dataArray.length) {
                    throw new RuntimeException("size:" + this.size + ", dataArray.length:" + this.dataArray.length);
                }
            }
            this.dataArray[i] = f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void shrink() {
            int i = 0;
            while (i < this.size) {
                if (this.dataArray[i] == 0.0f) {
                    for (int i2 = i + 1; i2 < this.size; i2++) {
                        this.dataArray[i2 - 1] = this.dataArray[i2];
                    }
                    this.dataArray[this.size - 1] = 0.0f;
                    this.size--;
                    i--;
                }
                i++;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void setDataAtIndex(VariableData variableData, int i) {
            setNumberIndex(i, variableData.readNumber(null));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public VariableData readDataAtIndex(int i) {
            return new VariableDataNumber(readNumberIndex(i));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataBoolArray.class */
    public class VariableDataBoolArray extends VariableDataArray {
        boolean[] dataArray;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray, com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.boolArray;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public LogicBoolean.ReturnType getElementReturnType() {
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public boolean readBooleanIndex(int i) {
            if (i < 0 || i >= this.size) {
                return false;
            }
            return this.dataArray[i];
        }

        public void setBooleanIndex(int i, boolean z) {
            if (i >= 0 && i <= 10000) {
                if (this.dataArray == null) {
                    this.dataArray = new boolean[i + 1];
                }
                if (i >= this.dataArray.length) {
                    int length = this.dataArray.length;
                    int i2 = length + (length < 12 / 2 ? 12 : length >> 1);
                    if (i2 < i + 1) {
                        i2 = i + 1;
                    }
                    boolean[] zArr = new boolean[i2];
                    System.arraycopy(this.dataArray, 0, zArr, 0, length);
                    this.dataArray = zArr;
                }
                if (this.size < i + 1) {
                    this.size = i + 1;
                    if (this.size > this.dataArray.length) {
                        throw new RuntimeException("size:" + this.size + ", dataArray.length:" + this.dataArray.length);
                    }
                }
                this.dataArray[i] = z;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void shrink() {
            int i = 0;
            while (i < this.size) {
                if (!this.dataArray[i]) {
                    for (int i2 = i + 1; i2 < this.size; i2++) {
                        this.dataArray[i2 - 1] = this.dataArray[i2];
                    }
                    this.dataArray[this.size - 1] = false;
                    this.size--;
                    i--;
                }
                i++;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void setDataAtIndex(VariableData variableData, int i) {
            setBooleanIndex(i, variableData.read(null));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public VariableData readDataAtIndex(int i) {
            return new VariableDataBoolean(readBooleanIndex(i));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$VariableDataUnitArray.class */
    public class VariableDataUnitArray extends VariableDataArray {
        AbstractC0244am[] dataArray;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray, com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableData, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.unitArray;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public LogicBoolean.ReturnType getElementReturnType() {
            return LogicBoolean.ReturnType.unit;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public AbstractC0244am readUnitIndex(int i) {
            if (i < 0 || i >= this.size) {
                return null;
            }
            return this.dataArray[i];
        }

        public void setUnitIndex(int i, AbstractC0244am abstractC0244am) {
            if (i >= 0 && i <= 10000) {
                if (this.dataArray == null) {
                    this.dataArray = new AbstractC0244am[i + 1];
                }
                if (i >= this.dataArray.length) {
                    int length = this.dataArray.length;
                    int i2 = length + (length < 12 / 2 ? 12 : length >> 1);
                    if (i2 < i + 1) {
                        i2 = i + 1;
                    }
                    AbstractC0244am[] abstractC0244amArr = new AbstractC0244am[i2];
                    System.arraycopy(this.dataArray, 0, abstractC0244amArr, 0, length);
                    this.dataArray = abstractC0244amArr;
                }
                if (this.size < i + 1) {
                    this.size = i + 1;
                    if (this.size > this.dataArray.length) {
                        throw new RuntimeException("size:" + this.size + ", dataArray.length:" + this.dataArray.length);
                    }
                }
                this.dataArray[i] = abstractC0244am;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void setDataAtIndex(VariableData variableData, int i) {
            setUnitIndex(i, variableData.readUnit(null));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public VariableData readDataAtIndex(int i) {
            return new VariableDataUnit(readUnitIndex(i));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.VariableDataArray
        public void shrink() {
            int i = 0;
            while (i < this.size) {
                AbstractC0244am abstractC0244am = this.dataArray[i];
                if (abstractC0244am == null || (!VariableScope.isMarker(abstractC0244am) && abstractC0244am.f1612bV)) {
                    for (int i2 = i + 1; i2 < this.size; i2++) {
                        this.dataArray[i2 - 1] = this.dataArray[i2];
                    }
                    this.dataArray[this.size - 1] = null;
                    this.size--;
                    i--;
                }
                i++;
            }
        }
    }

    public static void writeOut(GameOutputStream gameOutputStream, VariableScope variableScope) {
        if (variableScope == null) {
            gameOutputStream.writeByte(-2);
        } else if (variableScope.variableData.length == 0) {
            gameOutputStream.writeByte(-1);
        } else {
            gameOutputStream.writeByte(0);
            gameOutputStream.mo1331a((short) variableScope.variableData.length);
            int length = variableScope.variableData.length;
            for (int i = 0; i < length; i++) {
                VariableData variableData = variableScope.variableData[i];
                gameOutputStream.writeString(variableScope.variableNames[i].f3343id);
                gameOutputStream.writeBoolean(false);
                if (0 == 0) {
                    writeOutDynamicData(gameOutputStream, variableData);
                }
            }
        }
    }

    public static VariableScope readIn(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        if (readByte == -2 || readByte == -1) {
            return null;
        }
        int readShort = gameInputStream.readShort();
        VariableScope variableScope = new VariableScope();
        for (int i = 0; i < readShort; i++) {
            VariableName variableName = VariableName.get(gameInputStream.readString());
            if (!gameInputStream.readBoolean()) {
                variableScope.setDataRaw(variableName, readInDynamicData(gameInputStream));
            }
        }
        return variableScope;
    }

    public static void writeOutUnitOrPlaceholder(GameOutputStream gameOutputStream, AbstractC0244am abstractC0244am) {
        if (abstractC0244am instanceof C0624t) {
            gameOutputStream.writeByte(1);
            gameOutputStream.writeFloat(abstractC0244am.f7172eo);
            gameOutputStream.writeFloat(abstractC0244am.f7173ep);
            gameOutputStream.writeFloat(abstractC0244am.f7174eq);
            gameOutputStream.writeFloat(abstractC0244am.f1623cg);
            gameOutputStream.mo1387a(abstractC0244am.f1614bX);
            return;
        }
        gameOutputStream.writeByte(0);
        gameOutputStream.mo1375b(abstractC0244am);
    }

    public static void writeOutDynamicData(GameOutputStream gameOutputStream, VariableData variableData) {
        if (variableData == null) {
            gameOutputStream.writeEnum((Enum) null);
            return;
        }
        LogicBoolean.ReturnType returnType = variableData.getReturnType();
        gameOutputStream.writeEnum(returnType);
        if (variableData instanceof VariableDataUnit) {
            writeOutUnitOrPlaceholder(gameOutputStream, ((VariableDataUnit) variableData).unit);
        } else if (variableData instanceof VariableDataBoolean) {
            gameOutputStream.writeBoolean(((VariableDataBoolean) variableData).bool);
        } else if (variableData instanceof VariableDataString) {
            gameOutputStream.writeIsString(((VariableDataString) variableData).text);
        } else if (variableData instanceof VariableDataNumber) {
            gameOutputStream.writeDouble(((VariableDataNumber) variableData).number);
        } else if (variableData instanceof VariableDataArray) {
            VariableDataArray variableDataArray = (VariableDataArray) variableData;
            gameOutputStream.writeInt(variableDataArray.size);
            if (variableDataArray instanceof VariableDataBoolArray) {
                VariableDataBoolArray variableDataBoolArray = (VariableDataBoolArray) variableDataArray;
                for (int i = 0; i < variableDataBoolArray.size; i++) {
                    gameOutputStream.writeBoolean(variableDataBoolArray.dataArray[i]);
                }
            } else if (variableDataArray instanceof VariableDataNumberArray) {
                VariableDataNumberArray variableDataNumberArray = (VariableDataNumberArray) variableDataArray;
                for (int i2 = 0; i2 < variableDataNumberArray.size; i2++) {
                    gameOutputStream.writeFloat(variableDataNumberArray.dataArray[i2]);
                }
            } else if (variableDataArray instanceof VariableDataUnitArray) {
                VariableDataUnitArray variableDataUnitArray = (VariableDataUnitArray) variableDataArray;
                for (int i3 = 0; i3 < variableDataUnitArray.size; i3++) {
                    writeOutUnitOrPlaceholder(gameOutputStream, variableDataUnitArray.dataArray[i3]);
                }
            } else {
                throw new RuntimeException("Unhandled array type: " + returnType.name());
            }
        } else if (returnType != LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Unhandled type: " + returnType.name());
        }
    }

    public static AbstractC0244am readInUnitOrPlaceholder(GameInputStream gameInputStream) {
        C0624t m1293o;
        byte readByte = gameInputStream.readByte();
        if (readByte == 1) {
            float readFloat = gameInputStream.readFloat();
            float readFloat2 = gameInputStream.readFloat();
            float readFloat3 = gameInputStream.readFloat();
            float readFloat4 = gameInputStream.readFloat();
            m1293o = C0624t.m3081a(gameInputStream.m1289s());
            m1293o.f7172eo = readFloat;
            m1293o.f7173ep = readFloat2;
            m1293o.f7174eq = readFloat3;
            m1293o.f1623cg = readFloat4;
        } else if (readByte == 0) {
            m1293o = gameInputStream.m1293o();
        } else {
            throw new IOException("Unhandled unit type: " + ((int) readByte));
        }
        return m1293o;
    }

    public static VariableData readInDynamicData(GameInputStream gameInputStream) {
        LogicBoolean.ReturnType returnType = (LogicBoolean.ReturnType) gameInputStream.m1309b(LogicBoolean.ReturnType.class);
        if (returnType == null) {
            return null;
        }
        if (returnType == LogicBoolean.ReturnType.unit) {
            return new VariableDataUnit(readInUnitOrPlaceholder(gameInputStream));
        }
        if (returnType == LogicBoolean.ReturnType.bool) {
            return new VariableDataBoolean(gameInputStream.readBoolean());
        }
        if (returnType == LogicBoolean.ReturnType.string) {
            return new VariableDataString(gameInputStream.isReadString());
        }
        if (returnType == LogicBoolean.ReturnType.number) {
            return new VariableDataNumber(gameInputStream.readDouble());
        }
        if (returnType == LogicBoolean.ReturnType.boolArray || returnType == LogicBoolean.ReturnType.numberArray || returnType == LogicBoolean.ReturnType.unitArray) {
            int readInt = gameInputStream.readInt();
            if (returnType == LogicBoolean.ReturnType.boolArray) {
                VariableDataBoolArray variableDataBoolArray = new VariableDataBoolArray();
                for (int i = 0; i < readInt; i++) {
                    variableDataBoolArray.setBooleanIndex(i, gameInputStream.readBoolean());
                }
                return variableDataBoolArray;
            } else if (returnType == LogicBoolean.ReturnType.numberArray) {
                VariableDataNumberArray variableDataNumberArray = new VariableDataNumberArray();
                for (int i2 = 0; i2 < readInt; i2++) {
                    variableDataNumberArray.setNumberIndex(i2, gameInputStream.readFloat());
                }
                return variableDataNumberArray;
            } else if (returnType == LogicBoolean.ReturnType.unitArray) {
                VariableDataUnitArray variableDataUnitArray = new VariableDataUnitArray();
                for (int i3 = 0; i3 < readInt; i3++) {
                    variableDataUnitArray.setUnitIndex(i3, readInUnitOrPlaceholder(gameInputStream));
                }
                return variableDataUnitArray;
            } else {
                throw new RuntimeException("Unhandled array type: " + returnType.name());
            }
        } else if (returnType == LogicBoolean.ReturnType.undefined) {
            throw new RuntimeException("Undefined type: " + returnType.name());
        } else {
            throw new RuntimeException("Unhandled type: " + returnType.name());
        }
    }

    public static LogicBoolean.ReturnType getUserType(String str) {
        LogicBoolean.ReturnType returnType = null;
        if (str.equals("boolean")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("bool")) {
            returnType = LogicBoolean.ReturnType.bool;
        } else if (str.equals("unit")) {
            returnType = LogicBoolean.ReturnType.unit;
        } else if (str.equals("number")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("float")) {
            returnType = LogicBoolean.ReturnType.number;
        } else if (str.equals("text")) {
            returnType = LogicBoolean.ReturnType.string;
        } else if (str.equals("string")) {
            returnType = LogicBoolean.ReturnType.string;
        } else if (str.equals("number[]")) {
            returnType = LogicBoolean.ReturnType.numberArray;
        } else if (str.equals("float[]")) {
            returnType = LogicBoolean.ReturnType.numberArray;
        } else if (str.equals("bool[]")) {
            returnType = LogicBoolean.ReturnType.boolArray;
        } else if (str.equals("boolean[]")) {
            returnType = LogicBoolean.ReturnType.boolArray;
        } else if (str.equals("unit[]")) {
            returnType = LogicBoolean.ReturnType.unitArray;
        }
        return returnType;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$AbstractMemoryLogicBoolean.class */
    public abstract class AbstractMemoryLogicBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            LogicBoolean.ReturnType returnType = getReturnType();
            if (returnType == LogicBoolean.ReturnType.unit) {
                return UnitReference.unitContextChangingContext;
            }
            if (LogicBoolean.ReturnType.isArrayType(returnType)) {
                if (returnType == LogicBoolean.ReturnType.numberArray) {
                    return LogicBooleanLoader.numberArrayContextReader;
                }
                if (returnType == LogicBoolean.ReturnType.boolArray) {
                    return LogicBooleanLoader.boolArrayContextReader;
                }
                if (returnType == LogicBoolean.ReturnType.unitArray) {
                    return LogicBooleanLoader.unitArrayContextReader;
                }
                GameEngine.print("Unhandled array context type: " + returnType);
                return LogicBooleanLoader.voidContextReader;
            }
            return super.createContext();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            if (LogicBoolean.ReturnType.isArrayType(getReturnType())) {
                return logicBoolean;
            }
            return UnitReference.UnitContextChangingBooleanByLogic.create(this, logicBoolean);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryReadLogicBoolean.class */
    public class KnownMemoryReadLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName name;
        LogicBoolean.ReturnType type;

        public KnownMemoryReadLogicBoolean(VariableDefinition variableDefinition) {
            this.name = variableDefinition.name;
            this.type = variableDefinition.type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return false;
            }
            return abstractC0629y.f1586bw.getBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return 0.0f;
            }
            return (float) abstractC0629y.f1586bw.getNumber(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1586bw == null ? VariableScope.nullOrMissingString : abstractC0629y.f1586bw.getString(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return null;
            }
            return abstractC0629y.f1586bw.getUnit(this.name);
        }

        public LogicBoolean readAsLogicBoolean(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return null;
            }
            return abstractC0629y.f1586bw.getAsLogicBoolean(this.name);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public int getArraySize(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return 0;
            }
            return abstractC0629y.f1586bw.getDataObjectRaw(this.name).getArraySize(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean readArrayElement(AbstractC0629y abstractC0629y, int i) {
            if (abstractC0629y.f1586bw == null) {
                return null;
            }
            return abstractC0629y.f1586bw.getDataObjectRaw(this.name).readArrayElement(abstractC0629y, i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            LogicBoolean readAsLogicBoolean = readAsLogicBoolean(abstractC0629y);
            if (readAsLogicBoolean == null) {
                return "memory(" + this.name.f3343id + "=null)";
            }
            String str = VariableScope.nullOrMissingString;
            if (this.type != readAsLogicBoolean.getReturnType() && readAsLogicBoolean.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + readAsLogicBoolean.getReturnType().name() + ")";
            }
            return "memory(" + this.name.f3343id + "=" + readAsLogicBoolean.getMatchFailReasonForPlayer(abstractC0629y) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadEventMemoryLogicBoolean.class */
    public class ReadEventMemoryLogicBoolean extends ReadUnitMemoryLogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.ReadUnitMemoryLogicBoolean
        public LogicBoolean getUnitMemory(AbstractC0629y abstractC0629y) {
            C0457k c0457k = LogicBoolean.activeEvent;
            VariableScope variableScope = null;
            if (c0457k != null) {
                variableScope = c0457k.f2932e;
            }
            if (variableScope == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = variableScope.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            return asLogicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$ReadUnitMemoryLogicBoolean.class */
    public class ReadUnitMemoryLogicBoolean extends AbstractMemoryLogicBoolean {
        VariableName _name;
        LogicBoolean.ReturnType _type;
        @LogicBoolean.Parameter(key = "default")
        public LogicBoolean defaultValue;
        @LogicBoolean.Parameter(key = "index")
        public LogicBoolean index;

        @LogicBoolean.Parameter(required = true, positional = 0)
        public void name(String str) {
            this._name = VariableName.get(str.toLowerCase(Locale.ROOT).trim());
        }

        @LogicBoolean.Parameter(required = true)
        public void type(String str) {
            this._type = VariableScope.getUserType(str);
            if (this._type == null) {
                throw new RuntimeException("Unknown type: " + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.defaultValue != null && this.defaultValue.getReturnType() != this._type) {
                throw new BooleanParseException("defaultValue type:" + this.defaultValue.getReturnType() + " does not match requested type: " + this._type);
            }
            if (this.defaultValue == null) {
                this.defaultValue = VariableScope.variableDataNull;
            }
        }

        public LogicBoolean getUnitMemory(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.f1586bw == null) {
                return this.defaultValue;
            }
            LogicBoolean asLogicBoolean = abstractC0629y.f1586bw.getAsLogicBoolean(this._name);
            if (asLogicBoolean == null) {
                return this.defaultValue;
            }
            if (this.index != null) {
                LogicBoolean readArrayElement = asLogicBoolean.readArrayElement(abstractC0629y, (int) this.index.readNumber(abstractC0629y));
                if (readArrayElement == null) {
                    return this.defaultValue;
                }
                asLogicBoolean = readArrayElement;
            }
            return asLogicBoolean;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return getUnitMemory(abstractC0629y).read(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return getUnitMemory(abstractC0629y).readNumber(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            LogicBoolean unitMemory = getUnitMemory(abstractC0629y);
            return LogicString.StringCast.castToString(unitMemory.getReturnType(), unitMemory, abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            return getUnitMemory(abstractC0629y).readUnit(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public int getArraySize(AbstractC0629y abstractC0629y) {
            return getUnitMemory(abstractC0629y).getArraySize(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean readArrayElement(AbstractC0629y abstractC0629y, int i) {
            return getUnitMemory(abstractC0629y).readArrayElement(abstractC0629y, i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this._type;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            if (this._type == null || this._name == null) {
                return "<memory with type/name == null>";
            }
            LogicBoolean unitMemory = getUnitMemory(abstractC0629y);
            if (unitMemory == null) {
                return "memory(" + this._name.f3343id + " as " + this._type.name() + ")";
            }
            String str = VariableScope.nullOrMissingString;
            if (this._type != unitMemory.getReturnType() && unitMemory.getReturnType() != LogicBoolean.ReturnType.voidReturn) {
                str = "(TYPE MISMATCH GOT: " + unitMemory.getReturnType().name() + ")";
            }
            return "memory(" + this._name.f3343id + " as " + this._type.name() + "=" + unitMemory.getMatchFailReasonForPlayer(abstractC0629y) + str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$KnownMemoryScopeLogicBoolean.class */
    public class KnownMemoryScopeLogicBoolean extends LogicBooleanLoader.LogicBooleanScopeOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, C0458l c0458l, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            VariableDefinition variableDefinition = c0458l.f3237r.get(str2.toLowerCase(Locale.ROOT));
            if (variableDefinition == null) {
                throw new RuntimeException("Unknown variable:'" + str2 + "' in '" + str4 + "'");
            }
            return new KnownMemoryReadLogicBoolean(variableDefinition);
        }
    }

    public static MemoryWriter createGenericKeyValueWriter(String str, C0458l c0458l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0458l, null));
            return memoryWriter;
        } catch (C0417bo e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public static MemoryWriter createMemoryWriter(String str, C0458l c0458l, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            memoryWriter.addWriterElements(str, new MemoryWriterFactory(c0458l));
            return memoryWriter;
        } catch (C0417bo e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    public static MemoryNames createMemoryNameList(String str, C0458l c0458l, LogicBoolean.ReturnType returnType, String str2, String str3) {
        try {
            MemoryWriter memoryWriter = new MemoryWriter();
            MemoryWriterFactory memoryWriterFactory = new MemoryWriterFactory(c0458l);
            memoryWriterFactory.noValues = true;
            memoryWriter.addWriterElements(str, memoryWriterFactory);
            MemoryNames memoryNames = new MemoryNames();
            Iterator it = memoryWriter.writers.iterator();
            while (it.hasNext()) {
                CachedWriter.WriterElement writerElement = (CachedWriter.WriterElement) it.next();
                if (!(writerElement instanceof MemoryWriterFactory.MemoryWriterElement)) {
                    throw new C0417bo("Unexpected element reading: " + str, str2, str3);
                }
                MemoryWriterFactory.MemoryWriterElement memoryWriterElement = (MemoryWriterFactory.MemoryWriterElement) writerElement;
                if (memoryWriterElement instanceof MemoryWriterFactory.MemoryWriterElementIndex) {
                    throw new C0417bo("Expected memory name without an index got: " + str, str2, str3);
                }
                if (returnType != null) {
                    VariableDefinition variableDefinition = c0458l.f3237r.get(memoryWriterElement.name);
                    if (variableDefinition == null) {
                        throw new C0417bo("Failed to find defined memory: " + str, str2, str3);
                    }
                    if (variableDefinition.type != returnType) {
                        throw new C0417bo("Memory: " + str + " is type: " + variableDefinition.type + " expected: " + returnType, str2, str3);
                    }
                }
                memoryNames.names.add(memoryWriterElement.name);
            }
            return memoryNames;
        } catch (C0417bo e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriter.class */
    public class MemoryWriter extends CachedWriter {
        public void writeToMemory(VariableScope variableScope, AbstractC0629y abstractC0629y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((MemoryWriterFactory.MemoryWriterElement) ((CachedWriter.WriterElement) it.next())).writeToMemory(variableScope, abstractC0629y);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory.class */
    public class MemoryWriterFactory extends CachedWriter.WriterFactory {
        C0458l meta;
        VariableMapping target;
        boolean noValues;

        public MemoryWriterFactory(C0458l c0458l, VariableMapping variableMapping) {
            this.meta = c0458l;
            this.target = variableMapping;
        }

        public MemoryWriterFactory(C0458l c0458l) {
            this.meta = c0458l;
            if (c0458l != null) {
                this.target = c0458l.f3237r;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory$MemoryWriterElement.class */
        public class MemoryWriterElement extends CachedWriter.WriterElement {
            public VariableName name;
            public LogicBoolean value;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
            public void writeToUnit(AbstractC0629y abstractC0629y) {
                if (abstractC0629y.f1586bw == null) {
                    abstractC0629y.f1586bw = new VariableScope();
                }
                abstractC0629y.f1586bw.setFromLogicBoolean(this.name, abstractC0629y, this.value, null);
            }

            public void writeToMemory(VariableScope variableScope, AbstractC0629y abstractC0629y) {
                variableScope.setFromLogicBoolean(this.name, abstractC0629y, this.value, null);
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$MemoryWriterFactory$MemoryWriterElementIndex.class */
        public class MemoryWriterElementIndex extends MemoryWriterElement {
            public LogicBoolean nameIndex;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.MemoryWriterFactory.MemoryWriterElement, com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterElement
            public void writeToUnit(AbstractC0629y abstractC0629y) {
                if (abstractC0629y.f1586bw == null) {
                    abstractC0629y.f1586bw = new VariableScope();
                }
                abstractC0629y.f1586bw.setFromLogicBoolean(this.name, abstractC0629y, this.value, this.nameIndex);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.MemoryWriterFactory.MemoryWriterElement
            public void writeToMemory(VariableScope variableScope, AbstractC0629y abstractC0629y) {
                variableScope.setFromLogicBoolean(this.name, abstractC0629y, this.value, this.nameIndex);
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v46, types: [com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope$MemoryWriterFactory$MemoryWriterElement] */
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
        public CachedWriter.WriterElement createWriterElement(String str, String str2, String str3, String str4) {
            VariableName variableName;
            LogicBoolean.ReturnType returnType;
            MemoryWriterElementIndex memoryWriterElementIndex;
            if (!str2.equals("=")) {
                throw new C0417bo("Only '=' is supported here, got:" + str2);
            }
            if (!this.noValues) {
                if (str3 == null) {
                    throw new C0417bo("Expected a value for: " + str + " (likely missing '=')");
                }
            } else if (str3 != null) {
                throw new C0417bo("Expected no value for: " + str + " (Remove '=" + str3 + "')");
            }
            LogicBoolean logicBoolean = null;
            if (str3 != null) {
                try {
                    logicBoolean = LogicBooleanLoader.parseBooleanBlock(this.meta, str3, false);
                } catch (RuntimeException e) {
                    throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
                }
            }
            if (this.target != null) {
                VariableDefinition variableDefinition = this.target.get(str);
                if (variableDefinition == null) {
                    throw new C0417bo("Unknown variable: " + str + " (has it been defined in this unit?)");
                }
                variableName = variableDefinition.name;
                returnType = variableDefinition.type;
            } else {
                variableName = VariableName.get(str);
                returnType = LogicBoolean.ReturnType.undefined;
            }
            LogicBoolean.ReturnType returnType2 = returnType;
            LogicBoolean logicBoolean2 = null;
            if (str4 != null) {
                if (!LogicBoolean.ReturnType.isArrayType(returnType)) {
                    if (returnType != LogicBoolean.ReturnType.undefined) {
                        throw new C0417bo("Variable: " + str + " is not an array type " + returnType + " cannot use [] index on it.");
                    }
                } else {
                    returnType2 = LogicBoolean.ReturnType.getArrayBaseType(returnType);
                }
                try {
                    logicBoolean2 = LogicBooleanLoader.parseBooleanBlock(this.meta, str4, false);
                    if (logicBoolean2 != null && logicBoolean2.getReturnType() != LogicBoolean.ReturnType.number) {
                        throw new RuntimeException("Expected " + str + "[] array index to be a number got " + logicBoolean2.getReturnType() + " type, [parsing: '" + str4 + "']");
                    }
                    if (logicBoolean2 == null) {
                        throw new RuntimeException("Missing " + str + "[] array index");
                    }
                } catch (RuntimeException e2) {
                    throw new RuntimeException("Error reading " + str + "[] array index: " + e2.getMessage() + ", [parsing: '" + str4 + "']", e2);
                }
            } else if (!this.noValues && LogicBoolean.ReturnType.isArrayType(returnType) && (str3 == null || !"null".equalsIgnoreCase(str3.trim()))) {
                throw new C0417bo("Variable " + str + " is an array type. Expected: NAME[INDEX]=VALUE format (or NAME=null)");
            }
            if (logicBoolean2 == null) {
                memoryWriterElementIndex = new MemoryWriterElement();
                memoryWriterElementIndex.name = variableName;
                memoryWriterElementIndex.value = logicBoolean;
            } else {
                MemoryWriterElementIndex memoryWriterElementIndex2 = new MemoryWriterElementIndex();
                memoryWriterElementIndex = memoryWriterElementIndex2;
                memoryWriterElementIndex2.name = variableName;
                memoryWriterElementIndex2.value = logicBoolean;
                memoryWriterElementIndex2.nameIndex = logicBoolean2;
            }
            if (returnType2 != LogicBoolean.ReturnType.undefined && logicBoolean != null && logicBoolean.getReturnType() != returnType2) {
                if (LogicBoolean.isStaticNull(logicBoolean)) {
                    if (!LogicBoolean.ReturnType.canBeNull(returnType2)) {
                        throw new C0417bo("Variable: " + str + " of type " + returnType2 + " cannot be set to null.");
                    }
                } else {
                    throw new C0417bo("Variable: " + str + " expects " + LogicBoolean.ReturnType.toUserString(returnType2) + " type getting: " + LogicBoolean.ReturnType.toUserString(logicBoolean.getReturnType()) + " from: " + str3);
                }
            }
            return memoryWriterElementIndex;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter.class */
    public class CachedWriter {
        C1136m writers = new C1136m();

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$Operator.class */
        public enum Operator {
            set,
            add,
            subtract
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterElement.class */
        public abstract class WriterElement {
            public abstract void writeToUnit(AbstractC0629y abstractC0629y);
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/VariableScope$CachedWriter$WriterFactory.class */
        public abstract class WriterFactory {
            public abstract WriterElement createWriterElement(String str, String str2, String str3, String str4);
        }

        public void writeToUnit(AbstractC0629y abstractC0629y) {
            Iterator it = this.writers.iterator();
            while (it.hasNext()) {
                ((WriterElement) it.next()).writeToUnit(abstractC0629y);
            }
        }

        public static CachedWriter create(String str, WriterFactory writerFactory) {
            CachedWriter cachedWriter = new CachedWriter();
            cachedWriter.addWriterElements(str, writerFactory);
            return cachedWriter;
        }

        public void addWriterElements(String str, WriterFactory writerFactory) {
            String str2;
            String str3;
            Iterator it = C1118al.m581a(str, ",", false, false).iterator();
            while (it.hasNext()) {
                String str4 = (String) it.next();
                String[] m572c = C1118al.m572c(str4, "=");
                if (m572c == null) {
                    str2 = str4;
                    str3 = null;
                } else {
                    str2 = m572c[0];
                    str3 = m572c[1];
                }
                String str5 = null;
                if (C0773f.m2143c(str2, "[")) {
                    int indexOf = str2.indexOf(91);
                    int m575b = C1118al.m575b(str2, "]", indexOf);
                    if (indexOf == -1 || m575b == -1) {
                        throw new C0417bo("Unexpected array[] format for: " + str2);
                    }
                    str5 = str2.substring(indexOf + 1, m575b);
                    if (str5.trim().equals(VariableScope.nullOrMissingString)) {
                        throw new C0417bo("Array [] index in: " + str2 + " is empty");
                    }
                    String substring = str2.substring(m575b + 1, str2.length());
                    for (int i = 0; i < substring.length(); i++) {
                        char charAt = substring.charAt(i);
                        if (charAt != '+' && charAt != '=' && charAt != '-' && charAt != '*' && charAt != '/' && charAt != ' ') {
                            throw new C0417bo("Unexpected text:'" + substring + "' after [] index of: " + str2);
                        }
                        if (charAt == '=') {
                            break;
                        }
                    }
                    str2 = str2.substring(0, indexOf) + substring;
                }
                String trim = str2.toLowerCase(Locale.ROOT).trim();
                String str6 = "=";
                if (trim.endsWith("+") || trim.endsWith("-") || trim.endsWith("*") || trim.endsWith("/")) {
                    str6 = trim.substring(trim.length() - 1, trim.length()) + "=";
                    trim = trim.substring(0, trim.length() - 1).trim();
                }
                if (trim.contains(" ")) {
                    throw new C0417bo("Key cannot contain spaces for: " + str4);
                }
                if (trim.contains("[")) {
                    throw new C0417bo("Key cannot contain [ for: " + str4);
                }
                if (trim.contains("]")) {
                    throw new C0417bo("Key cannot contain ] for: " + str4);
                }
                if (trim.contains("(")) {
                    throw new C0417bo("Key cannot contain ( for: " + str4);
                }
                if (trim.contains(")")) {
                    throw new C0417bo("Key cannot contain ) for: " + str4);
                }
                if (trim.contains(".")) {
                    throw new C0417bo("Key cannot contain . for: " + str4);
                }
                this.writers.add(writerFactory.createWriterElement(trim, str6, str3, str5));
            }
        }
    }

    public static boolean isMarker(AbstractC0244am abstractC0244am) {
        if (abstractC0244am == null) {
            return false;
        }
        return abstractC0244am instanceof C0624t;
    }

    public static AbstractC0244am getSafeUnitReferenceForStorage(AbstractC0244am abstractC0244am) {
        if (abstractC0244am == null) {
            return null;
        }
        if (abstractC0244am instanceof C0624t) {
            C0624t m3081a = C0624t.m3081a(abstractC0244am.f1614bX);
            m3081a.f7172eo = abstractC0244am.f7172eo;
            m3081a.f7173ep = abstractC0244am.f7173ep;
            m3081a.f7174eq = abstractC0244am.f7174eq;
            m3081a.f1623cg = abstractC0244am.f1623cg;
            return m3081a;
        }
        return abstractC0244am;
    }
}