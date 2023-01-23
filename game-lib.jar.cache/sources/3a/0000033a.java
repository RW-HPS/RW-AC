package com.corrodinggames.rts.game.units.custom.logicBooleans;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.q;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.custom.b.n;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.k;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.v;
import com.corrodinggames.rts.game.units.f.i;
import com.corrodinggames.rts.game.units.t;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference.class */
public abstract class UnitReference extends LogicBoolean implements Cloneable {
    public static final SelfUnitReference selfUnitReference = new SelfUnitReference();
    static HashMap referenceTypes = new HashMap();
    static final LogicBooleanLoader.LogicBooleanContext unitContextChangingContext;
    static final LogicBooleanLoader.LogicBooleanContext placeholderUnitContext;

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingContext.class */
    public class UnitContextChangingContext extends LogicBooleanLoader.LogicBooleanContextWithDefault {
    }

    public abstract am getSingleRaw(y yVar);

    static {
        addUnitReferenceType(new AttachmentUnitReference(), "attachment");
        addUnitReferenceType(new ParentUnitReference(), "parent");
        addUnitReferenceType(new TransportingUnitReference(), "transporting");
        addUnitReferenceType(new ActiveWaypointTargetReference(), "activeWaypointTarget");
        addUnitReferenceType(new AttackingReference(), "attacking");
        addUnitReferenceType(new Memory1UnitReference(), "customTarget1");
        addUnitReferenceType(new Memory2UnitReference(), "customTarget2");
        addUnitReferenceType(new LastDamagedByUnitReference(), "lastDamagedBy");
        addUnitReferenceType(new NearestUnitReference(), "nearestUnit");
        addUnitReferenceType(new FirstUnitReference(), "globalSearchForFirstUnit");
        addUnitReferenceType(new NullUnitReference(), "nullUnit");
        addUnitReferenceType(new NullUnitReference(), "null");
        addUnitReferenceType(new GetOffsetAbsolute(), "getOffsetAbsolute");
        addUnitReferenceType(new GetOffsetRelative(), "getOffsetRelative");
        addUnitReferenceType(new GetAsMarker(), "getAsMarker");
        addUnitReferenceType(new ThisActionTargetReference(), "thisActionTarget");
        addUnitReferenceType(new EventSourceReference(), "eventSource");
        unitContextChangingContext = new UnitContextChangingContext();
        placeholderUnitContext = new UnitContextChangingContext();
    }

    public final am get(am amVar) {
        if (!(amVar instanceof y)) {
            return null;
        }
        return getSingleRaw((y) amVar);
    }

    public final am get(y yVar) {
        return getSingleRaw(yVar);
    }

    public final am getRealUnitOnly(y yVar) {
        am singleRaw = getSingleRaw(yVar);
        if (singleRaw instanceof t) {
            return null;
        }
        return singleRaw;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public void forMeta(l lVar) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            referenceTypes.put(lowerCase, unitReference);
            if (!lowerCase.replace("self.", "subject.").equals(lowerCase)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(l lVar, ab abVar, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(lVar, abVar.b(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(l lVar, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(lVar, trim, str2, str3, null, true));
        }
        v a2 = lVar.a(trim, str3, str2);
        if (a2 != null) {
            a2.f = true;
        }
        return new UnitReferenceOrUnitType(a2);
    }

    public static UnitReference parseUnitReferenceFromConf(l lVar, ab abVar, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(lVar, abVar.b(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(l lVar, String str, String str2, String str3, UnitReference unitReference, boolean z) {
        if (str == null) {
            return unitReference;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReference;
        }
        String lowerCase = trim.toLowerCase(Locale.ROOT);
        if (lowerCase.startsWith("unitref ")) {
            lowerCase = lowerCase.substring("unitref ".length()).trim();
        }
        if (lowerCase.equals("self")) {
            return selfUnitReference;
        }
        if (lowerCase.indexOf("(") == -1) {
            lowerCase.length();
        } else if (lowerCase.indexOf(")") != lowerCase.length() - 1) {
            throw new bo("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseSingleUnitReferenceBlock = parseSingleUnitReferenceBlock(lVar, lowerCase);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Unknown function:'" + lowerCase + "'");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(l lVar, String str) {
        String lowerCase = str.split("\\(")[0].trim().toLowerCase(Locale.ROOT);
        UnitReference unitReference = (UnitReference) referenceTypes.get(lowerCase);
        if (unitReference == null) {
            return null;
        }
        String trim = str.substring(lowerCase.length()).trim();
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = "()";
        }
        if (!trim.startsWith("(") || !trim.endsWith(")")) {
            throw new RuntimeException("Failed to parse unit reference arguments for:'" + str + "'");
        }
        UnitReference with = unitReference.with(lVar, trim.substring(1, trim.length() - 1).trim(), lowerCase);
        if (with instanceof NullUnitReference) {
        }
        return with;
    }

    public static UnitReference parseSingleUnitReferenceBlock(l lVar, String str) {
        int b = al.b(str);
        if (b != 0) {
            if (b > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (b < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String[] b2 = al.b(breakOuterLayerBrackets, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : b2) {
            if (str2.equalsIgnoreCase("self")) {
                z = true;
            } else {
                UnitReference parseSingleUnitReferenceElement = parseSingleUnitReferenceElement(lVar, str2);
                if (parseSingleUnitReferenceElement == null) {
                    throw new RuntimeException("Unknown unit reference:'" + str2 + "'");
                }
                arrayList.add(parseSingleUnitReferenceElement);
            }
        }
        if (arrayList.size() == 0) {
            if (z) {
                return selfUnitReference;
            }
            throw new RuntimeException("Unexpected unit reference:'" + breakOuterLayerBrackets + "'");
        } else if (arrayList.size() == 1) {
            return (UnitReference) arrayList.get(0);
        } else {
            return new ChainedUnitReference((UnitReference[]) arrayList.toArray(new UnitReference[0]));
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(String str) {
        return with((l) null, str, (String) null);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(l lVar, String str, String str2) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(lVar);
            unitReference.setArgumentsRaw(str, lVar, str2);
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(y yVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public am readUnit(y yVar) {
        return getSingleRaw(yVar);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public String getMatchFailReasonForPlayer(y yVar) {
        return getClassDebugName() + "(" + am.A(getSingleRaw(yVar)) + ")";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ChainedUnitReference.class */
    public class ChainedUnitReference extends UnitReference {
        UnitReference[] chain;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        ChainedUnitReference(UnitReference[] unitReferenceArr) {
            this.chain = unitReferenceArr;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            UnitReference[] unitReferenceArr = this.chain;
            y yVar2 = yVar;
            LogicBoolean.outerUnitParameterContext = yVar;
            for (UnitReference unitReference : unitReferenceArr) {
                yVar2 = unitReference.get((am) yVar2);
                if (yVar2 == null) {
                    return null;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return yVar2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            UnitReference[] unitReferenceArr = this.chain;
            y yVar2 = yVar;
            if (yVar2 instanceof y) {
                LogicBoolean.outerUnitParameterContext = yVar2;
            }
            String str = VariableScope.nullOrMissingString + "[";
            int i = 0;
            while (true) {
                if (i >= unitReferenceArr.length) {
                    break;
                }
                str = str + unitReferenceArr[i].getMatchFailReasonForPlayer(yVar);
                if (i != unitReferenceArr.length - 1) {
                    str = str + ",";
                }
                yVar2 = unitReferenceArr[i].get((am) yVar2);
                if (yVar2 != null) {
                    i++;
                } else {
                    str = str + "<null>";
                    break;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return str + "]";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttachmentUnitReference.class */
    public class AttachmentUnitReference extends UnitReference {
        l meta;
        g _withTag;
        short attachmentId = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new com.corrodinggames.rts.gameFramework.utility.am("AttachmentUnitReference requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = g.c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            n i = this.meta.i(str);
            if (i == null) {
                throw new com.corrodinggames.rts.gameFramework.utility.am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = i.a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            if (!(yVar instanceof j)) {
                return null;
            }
            j jVar = (j) yVar;
            if (jVar.C == null) {
                return null;
            }
            Object[] a2 = jVar.C.a();
            for (int i = jVar.C.f689a - 1; i >= 0; i--) {
                y yVar2 = (y) a2[i];
                if (yVar2 != null && (this.attachmentId == -1 || i == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!g.a(this._withTag, yVar2.de())) {
                        }
                    }
                    return yVar2;
                }
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "attachment";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$TransportingUnitReference.class */
    public class TransportingUnitReference extends UnitReference {
        l meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new com.corrodinggames.rts.gameFramework.utility.am("TransportingUnitReference requires metadata");
            }
            this.meta = lVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am amVar = null;
            m bz = yVar.bz();
            if (bz != null) {
                if (this.slot == -1) {
                    if (bz.size() > 0) {
                        amVar = (am) bz.get(0);
                    }
                } else if (this.slot >= 0 && this.slot < bz.size()) {
                    amVar = (am) bz.get(this.slot);
                }
            }
            return amVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "transporting";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            return yVar.dr();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "parent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory1UnitReference.class */
    public class Memory1UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am amVar = yVar.bu;
            if (amVar == null || amVar.bV) {
                return null;
            }
            return amVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget1";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory2UnitReference.class */
    public class Memory2UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am amVar = yVar.bv;
            if (amVar == null || amVar.bV) {
                return null;
            }
            return amVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget2";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LastDamagedByUnitReference.class */
    public class LastDamagedByUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am amVar = yVar.bt;
            if (amVar == null || amVar.bV) {
                return null;
            }
            return amVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "lastDamagedBy";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference.class */
    public class NearestUnitReference extends UnitReference {
        public g _withTag;
        public g _withoutTag;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        public static final HandleCallbackNearest handleCallbackNearest = new HandleCallbackNearest();
        public float withinRange = 500.0f;
        public float withinRangeSq = this.withinRange * this.withinRange;
        public q relation = q.any;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NearestUnit";
        }

        @LogicBoolean.Parameter
        public void withinRange(float f) {
            if (f > 1500.0f) {
                throw new com.corrodinggames.rts.gameFramework.utility.am("NearestUnit distance cannot be over 1500 is: " + f);
            }
            this.withinRange = f;
            this.withinRangeSq = f * f;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = g.c(str);
        }

        @LogicBoolean.Parameter
        public void withoutTag(String str) {
            this._withoutTag = g.c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (q) ab.a(str, q.any, q.class);
            } catch (bo e) {
                throw new com.corrodinggames.rts.gameFramework.utility.am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            handleCallbackNearest.nearest = null;
            handleCallbackNearest.withinRangeSq = this.withinRangeSq;
            handleCallbackNearest.tag = this._withTag;
            handleCallbackNearest.withoutTag = this._withoutTag;
            handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
            handleCallbackNearest.relation = this.relation;
            GameEngine.getGameEngine().cc.a(yVar.eo, yVar.ep, this.withinRange, yVar, 0.0f, handleCallbackNearest);
            return handleCallbackNearest.nearest;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference$HandleCallbackNearest.class */
        public class HandleCallbackNearest extends i {
            public g tag;
            public g withoutTag;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public q relation = q.any;
            public am nearest;

            @Override // com.corrodinggames.rts.game.units.f.i
            public void setup(y yVar, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public int excludeTeam(y yVar) {
                return -3;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyEnemiesOfTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.j
            public void callback(y yVar, float f, am amVar) {
                if ((this.relation != q.any && !yVar.bX.a(this.relation, amVar.bX)) || yVar == amVar) {
                    return;
                }
                h de = amVar.de();
                if (this.tag == null || (de != null && g.a(this.tag, de))) {
                    float a2 = f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
                    if (a2 < this.withinRangeSq) {
                        if (amVar.cm < 1.0f && !this.incompleteBuildings) {
                            return;
                        }
                        if (this.withoutTag != null && de != null && g.a(this.withoutTag, de)) {
                            return;
                        }
                        this.withinRangeSq = a2;
                        this.nearest = amVar;
                    }
                }
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$FirstUnitReference.class */
    public class FirstUnitReference extends UnitReference {
        public g _withTag;
        public q relation = q.any;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "globalSearchForFirstUnit";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = g.c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (q) ab.a(str, (Enum) null, q.class);
            } catch (bo e) {
                throw new com.corrodinggames.rts.gameFramework.utility.am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am[] a2 = am.bE.a();
            int size = am.bE.size();
            for (int i = 0; i < size; i++) {
                am amVar = a2[i];
                if ((this.relation == q.any || yVar.bX.a(this.relation, amVar.bX)) && yVar != amVar) {
                    h de = amVar.de();
                    if ((this._withTag == null || (de != null && g.a(this._withTag, de))) && (amVar.cm >= 1.0f || this.incompleteBuildings)) {
                        return amVar;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$PlaceholderUnitReference.class */
    public abstract class PlaceholderUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return UnitReference.placeholderUnitContext;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetAbsolute.class */
    public class GetOffsetAbsolute extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)
        public LogicBoolean x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)
        public LogicBoolean y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetAbsolute";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            y yVar2 = yVar.bX.t;
            y parameterContext = getParameterContext(yVar);
            yVar2.cg = yVar.cg;
            yVar2.eo = yVar.eo + this.x.readNumber(parameterContext);
            yVar2.ep = yVar.ep + this.y.readNumber(parameterContext);
            yVar2.eq = yVar.eq + this.height.readNumber(parameterContext);
            return yVar2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelative.class */
    public class GetOffsetRelative extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)
        public LogicBoolean x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)
        public LogicBoolean y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dirOffset = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelative";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            y yVar2 = yVar.bX.t;
            y parameterContext = getParameterContext(yVar);
            float readNumber = yVar.cg + this.dirOffset.readNumber(parameterContext);
            float k = f.k(readNumber);
            float j = f.j(readNumber);
            float readNumber2 = this.x.readNumber(parameterContext);
            float readNumber3 = this.y.readNumber(parameterContext);
            float f = (k * readNumber3) - (j * readNumber2);
            yVar2.cg = readNumber;
            yVar2.eo = yVar.eo + f;
            yVar2.ep = yVar.ep + (j * readNumber3) + (k * readNumber2);
            yVar2.eq = yVar.eq + this.height.readNumber(parameterContext);
            return yVar2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelativeStatic.class */
    public class GetOffsetRelativeStatic extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(positional = 0)
        public float x;
        @LogicBoolean.Parameter(positional = 1)
        public float y;
        @LogicBoolean.Parameter
        public float height;
        @LogicBoolean.Parameter
        public float dirOffset;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelativeStatic";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            y yVar2 = yVar.bX.t;
            float f = yVar.cg + this.dirOffset;
            float k = f.k(f);
            float j = f.j(f);
            float f2 = this.x;
            float f3 = this.y;
            float f4 = (k * f3) - (j * f2);
            yVar2.cg = f;
            yVar2.eo = yVar.eo + f4;
            yVar2.ep = yVar.ep + (j * f3) + (k * f2);
            yVar2.eq = yVar.eq + this.height;
            return yVar2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetAsMarker.class */
    public class GetAsMarker extends PlaceholderUnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getAsMarker";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            y yVar2 = yVar.bX.t;
            yVar2.cg = yVar.cg;
            yVar2.eo = yVar.eo;
            yVar2.ep = yVar.ep;
            yVar2.eq = yVar.eq;
            return yVar2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ThisActionTargetReference.class */
    public class ThisActionTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            am amVar = j.dN;
            if (amVar != null) {
                return amVar;
            }
            PointF pointF = j.dM;
            if (pointF != null) {
                y yVar2 = PlayerData.i.t;
                yVar2.cg = 0.0f;
                yVar2.eo = pointF.x;
                yVar2.ep = pointF.y;
                yVar2.eq = 0.0f;
                return yVar2;
            }
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ThisActionTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$EventSourceReference.class */
    public class EventSourceReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            k kVar = LogicBoolean.activeEvent;
            if (kVar == null) {
                return null;
            }
            return kVar.c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "EventSource";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ActiveWaypointTargetReference.class */
    public class ActiveWaypointTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            au ar = yVar.ar();
            if (ar == null) {
                return null;
            }
            return ar.l();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ActiveWaypointTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttackingReference.class */
    public class AttackingReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            return yVar.R;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NullUnitReference.class */
    public class NullUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NULL";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            return yVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "self";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        am target;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(l lVar, String str, String str2) {
            return super.with(lVar, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        public LockedUnitReference(am amVar) {
            this.target = amVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public am getSingleRaw(y yVar) {
            return this.target;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "unit";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        v unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(v vVar) {
            this.unitType = vVar;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public am getUnitOrSharedUnit(am amVar) {
            am amVar2;
            if (this.unitType != null) {
                return am.c(this.unitType.c());
            }
            if (this.unitReference != null && (amVar2 = this.unitReference.get(amVar)) != null) {
                return amVar2;
            }
            return null;
        }

        public am getUnitReferenceOrNull(am amVar) {
            am amVar2;
            if (this.unitReference != null && (amVar2 = this.unitReference.get(amVar)) != null) {
                return amVar2;
            }
            return null;
        }

        public as getTypeOrNull(am amVar) {
            am amVar2;
            if (this.unitType != null) {
                return this.unitType.c();
            }
            if (this.unitReference != null && (amVar2 = this.unitReference.get(amVar)) != null) {
                return amVar2.r();
            }
            return null;
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBooleanLoader.LogicBooleanContext createContext() {
        return unitContextChangingContext;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean setChild(LogicBoolean logicBoolean) {
        return UnitContextChangingBooleanByLogic.create(this, logicBoolean);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitContextChangingBooleanByLogic.class */
    public class UnitContextChangingBooleanByLogic extends LogicBoolean {
        LogicBoolean targetBoolean;
        LogicBoolean dynamicContext;
        LogicBoolean[] dynamicContextChain;

        public static UnitContextChangingBooleanByLogic create(LogicBoolean logicBoolean, LogicBoolean logicBoolean2) {
            ArrayList arrayList = null;
            if (logicBoolean2 instanceof UnitContextChangingBooleanByLogic) {
                UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic = (UnitContextChangingBooleanByLogic) logicBoolean2;
                arrayList = new ArrayList();
                arrayList.add(logicBoolean);
                if (unitContextChangingBooleanByLogic.dynamicContextChain != null) {
                    for (LogicBoolean logicBoolean3 : unitContextChangingBooleanByLogic.dynamicContextChain) {
                        arrayList.add(logicBoolean3);
                    }
                } else {
                    arrayList.add(unitContextChangingBooleanByLogic.dynamicContext);
                }
                logicBoolean2 = unitContextChangingBooleanByLogic.targetBoolean;
            }
            UnitContextChangingBooleanByLogic unitContextChangingBooleanByLogic2 = new UnitContextChangingBooleanByLogic();
            if (arrayList != null) {
                unitContextChangingBooleanByLogic2.dynamicContextChain = (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]);
            } else {
                unitContextChangingBooleanByLogic2.dynamicContext = logicBoolean;
            }
            unitContextChangingBooleanByLogic2.targetBoolean = logicBoolean2;
            if (logicBoolean == null) {
                throw new RuntimeException("dynamicContext==null");
            }
            if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
                throw new RuntimeException("dynamicContext type!=unit. Got:" + logicBoolean.getReturnType());
            }
            return unitContextChangingBooleanByLogic2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return super.setChild(logicBoolean);
        }

        public y getUnitContext(y yVar) {
            if (this.dynamicContextChain != null) {
                y yVar2 = yVar;
                for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                    am readUnit = logicBoolean.readUnit(yVar2);
                    if (!(readUnit instanceof y)) {
                        return null;
                    }
                    yVar2 = (y) readUnit;
                }
                return yVar2;
            }
            am readUnit2 = this.dynamicContext.readUnit(yVar);
            if (!(readUnit2 instanceof y)) {
                return null;
            }
            return (y) readUnit2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            LogicBoolean.setOuterUnitParameterContext(yVar);
            try {
                y unitContext = getUnitContext(yVar);
                if (unitContext != null) {
                    boolean read = this.targetBoolean.read(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return read;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return false;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            LogicBoolean.setOuterUnitParameterContext(yVar);
            try {
                y unitContext = getUnitContext(yVar);
                if (unitContext != null) {
                    float readNumber = this.targetBoolean.readNumber(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readNumber;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return 0.0f;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            LogicBoolean.setOuterUnitParameterContext(yVar);
            try {
                y unitContext = getUnitContext(yVar);
                if (unitContext != null) {
                    String readString = this.targetBoolean.readString(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readString;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return "<unit not found>";
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public am readUnit(y yVar) {
            LogicBoolean.setOuterUnitParameterContext(yVar);
            try {
                y unitContext = getUnitContext(yVar);
                if (unitContext != null) {
                    am readUnit = this.targetBoolean.readUnit(unitContext);
                    LogicBoolean.clearOuterUnitParameterContext();
                    return readUnit;
                }
                LogicBoolean.clearOuterUnitParameterContext();
                return null;
            } catch (Throwable th) {
                LogicBoolean.clearOuterUnitParameterContext();
                throw th;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public UnitContextChangingBooleanByLogic with(l lVar, String str, String str2) {
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.targetBoolean.getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            am readUnit;
            String str;
            LogicBoolean[] logicBooleanArr;
            if (this.dynamicContextChain != null) {
                String str2 = VariableScope.nullOrMissingString;
                y yVar2 = yVar;
                LogicBoolean.setOuterUnitParameterContext(yVar);
                try {
                    for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                        String str3 = str2 + logicBoolean.getMatchFailReasonForPlayer(yVar2);
                        am readUnit2 = logicBoolean.readUnit(yVar2);
                        if (readUnit2 instanceof y) {
                            str2 = str3 + ".";
                            yVar2 = (y) readUnit2;
                        } else {
                            return str3 + "<unit not found>";
                        }
                    }
                    return str2 + this.targetBoolean.getMatchFailReasonForPlayer(yVar2);
                } finally {
                }
            }
            LogicBoolean.setOuterUnitParameterContext(yVar);
            try {
                if (!(this.dynamicContext.readUnit(yVar) instanceof y)) {
                    str = "=<unit not found> (type:" + this.dynamicContext.getReturnType() + ")";
                } else {
                    str = "." + this.targetBoolean.getMatchFailReasonForPlayer((y) readUnit);
                }
                return this.dynamicContext.getMatchFailReasonForPlayer(yVar) + str;
            } finally {
            }
        }
    }
}