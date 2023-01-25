package com.corrodinggames.rts.game.units.custom.logicBooleans;

import android.graphics.PointF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.C0624t;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0457k;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.C0469v;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0402n;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1119am;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
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

    public abstract AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y);

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

    public final AbstractC0244am get(AbstractC0244am abstractC0244am) {
        if (!(abstractC0244am instanceof AbstractC0629y)) {
            return null;
        }
        return getSingleRaw((AbstractC0629y) abstractC0244am);
    }

    public final AbstractC0244am get(AbstractC0629y abstractC0629y) {
        return getSingleRaw(abstractC0629y);
    }

    public final AbstractC0244am getRealUnitOnly(AbstractC0629y abstractC0629y) {
        AbstractC0244am singleRaw = getSingleRaw(abstractC0629y);
        if (singleRaw instanceof C0624t) {
            return null;
        }
        return singleRaw;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public void forMeta(C0458l c0458l) {
    }

    static void addUnitReferenceType(UnitReference unitReference, String... strArr) {
        for (String str : strArr) {
            String lowerCase = str.toLowerCase(Locale.ROOT);
            referenceTypes.put(lowerCase, unitReference);
            if (!lowerCase.replace("self.", "subject.").equals(lowerCase)) {
            }
        }
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReferenceFromConf(C0458l c0458l, C1107ab c1107ab, String str, String str2, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        return parseUnitTypeOrReference(c0458l, c1107ab.m666b(str, str2, (String) null), str, str2, unitReferenceOrUnitType);
    }

    public static UnitReferenceOrUnitType parseUnitTypeOrReference(C0458l c0458l, String str, String str2, String str3, UnitReferenceOrUnitType unitReferenceOrUnitType) {
        if (str == null) {
            return unitReferenceOrUnitType;
        }
        String trim = str.trim();
        if (VariableScope.nullOrMissingString.equals(trim) || "NONE".equalsIgnoreCase(trim)) {
            return unitReferenceOrUnitType;
        }
        if (trim.toLowerCase(Locale.ROOT).startsWith("unitref ")) {
            return new UnitReferenceOrUnitType(parseUnitReference(c0458l, trim, str2, str3, null, true));
        }
        C0469v m3541a = c0458l.m3541a(trim, str3, str2);
        if (m3541a != null) {
            m3541a.f3386f = true;
        }
        return new UnitReferenceOrUnitType(m3541a);
    }

    public static UnitReference parseUnitReferenceFromConf(C0458l c0458l, C1107ab c1107ab, String str, String str2, UnitReference unitReference) {
        return parseUnitReference(c0458l, c1107ab.m666b(str, str2, (String) null), str, str2, unitReference, false);
    }

    public static UnitReference parseUnitReference(C0458l c0458l, String str, String str2, String str3, UnitReference unitReference, boolean z) {
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
            throw new C0417bo("[" + str2 + "]" + str3 + " UnitReference: Unexpected format for: '" + lowerCase + "'");
        }
        try {
            UnitReference parseSingleUnitReferenceBlock = parseSingleUnitReferenceBlock(c0458l, lowerCase);
            if (parseSingleUnitReferenceBlock == null) {
                throw new RuntimeException("Unknown function:'" + lowerCase + "'");
            }
            return parseSingleUnitReferenceBlock;
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + " UnitReference error: " + e.getMessage() + ", [parsing: '" + lowerCase + "']", e);
        }
    }

    public static UnitReference parseSingleUnitReferenceElement(C0458l c0458l, String str) {
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
        UnitReference with = unitReference.with(c0458l, trim.substring(1, trim.length() - 1).trim(), lowerCase);
        if (with instanceof NullUnitReference) {
        }
        return with;
    }

    public static UnitReference parseSingleUnitReferenceBlock(C0458l c0458l, String str) {
        int m579b = C1118al.m579b(str);
        if (m579b != 0) {
            if (m579b > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (m579b < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = LogicBooleanLoader.breakOuterLayerBrackets(str.trim());
        String[] m574b = C1118al.m574b(breakOuterLayerBrackets, ".", false);
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        for (String str2 : m574b) {
            if (str2.equalsIgnoreCase("self")) {
                z = true;
            } else {
                UnitReference parseSingleUnitReferenceElement = parseSingleUnitReferenceElement(c0458l, str2);
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
        return with((C0458l) null, str, (String) null);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public UnitReference with(C0458l c0458l, String str, String str2) {
        try {
            UnitReference unitReference = (UnitReference) clone();
            unitReference.forMeta(c0458l);
            unitReference.setArgumentsRaw(str, c0458l, str2);
            return unitReference;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(AbstractC0629y abstractC0629y) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
        return getSingleRaw(abstractC0629y);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.unit;
    }

    public String getClassDebugName() {
        return "<unit reference>";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
        return getClassDebugName() + "(" + AbstractC0244am.m4256A(getSingleRaw(abstractC0629y)) + ")";
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ChainedUnitReference.class */
    public class ChainedUnitReference extends UnitReference {
        UnitReference[] chain;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        ChainedUnitReference(UnitReference[] unitReferenceArr) {
            this.chain = unitReferenceArr;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0629y abstractC0629y2 = abstractC0629y;
            LogicBoolean.outerUnitParameterContext = abstractC0629y;
            for (UnitReference unitReference : unitReferenceArr) {
                abstractC0629y2 = unitReference.get((AbstractC0244am) abstractC0629y2);
                if (abstractC0629y2 == null) {
                    return null;
                }
            }
            LogicBoolean.outerUnitParameterContext = null;
            return abstractC0629y2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            UnitReference[] unitReferenceArr = this.chain;
            AbstractC0629y abstractC0629y2 = abstractC0629y;
            if (abstractC0629y2 instanceof AbstractC0629y) {
                LogicBoolean.outerUnitParameterContext = abstractC0629y2;
            }
            String str = VariableScope.nullOrMissingString + "[";
            int i = 0;
            while (true) {
                if (i >= unitReferenceArr.length) {
                    break;
                }
                str = str + unitReferenceArr[i].getMatchFailReasonForPlayer(abstractC0629y);
                if (i != unitReferenceArr.length - 1) {
                    str = str + ",";
                }
                abstractC0629y2 = unitReferenceArr[i].get((AbstractC0244am) abstractC0629y2);
                if (abstractC0629y2 != null) {
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
        C0458l meta;
        C0453g _withTag;
        short attachmentId = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
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
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new C1119am("AttachmentUnitReference requires metadata");
            }
            this.meta = c0458l;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3677c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0402n m3512i = this.meta.m3512i(str);
            if (m3512i == null) {
                throw new C1119am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m3512i.m3917a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            if (!(abstractC0629y instanceof C0456j)) {
                return null;
            }
            C0456j c0456j = (C0456j) abstractC0629y;
            if (c0456j.f2896C == null) {
                return null;
            }
            Object[] m535a = c0456j.f2896C.m535a();
            for (int i = c0456j.f2896C.f7109a - 1; i >= 0; i--) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) m535a[i];
                if (abstractC0629y2 != null && (this.attachmentId == -1 || i == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0453g.m3685a(this._withTag, abstractC0629y2.mo3599de())) {
                        }
                    }
                    return abstractC0629y2;
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
        C0458l meta;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new C1119am("TransportingUnitReference requires metadata");
            }
            this.meta = c0458l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am abstractC0244am = null;
            C1136m mo2886bz = abstractC0629y.mo2886bz();
            if (mo2886bz != null) {
                if (this.slot == -1) {
                    if (mo2886bz.size() > 0) {
                        abstractC0244am = (AbstractC0244am) mo2886bz.get(0);
                    }
                } else if (this.slot >= 0 && this.slot < mo2886bz.size()) {
                    abstractC0244am = (AbstractC0244am) mo2886bz.get(this.slot);
                }
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "transporting";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ParentUnitReference.class */
    public class ParentUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            return abstractC0629y.m4199dr();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "parent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory1UnitReference.class */
    public class Memory1UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am abstractC0244am = abstractC0629y.f1584bu;
            if (abstractC0244am == null || abstractC0244am.f1612bV) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget1";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$Memory2UnitReference.class */
    public class Memory2UnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am abstractC0244am = abstractC0629y.f1585bv;
            if (abstractC0244am == null || abstractC0244am.f1612bV) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "customTarget2";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LastDamagedByUnitReference.class */
    public class LastDamagedByUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am abstractC0244am = abstractC0629y.f1583bt;
            if (abstractC0244am == null || abstractC0244am.f1612bV) {
                return null;
            }
            return abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "lastDamagedBy";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference.class */
    public class NearestUnitReference extends UnitReference {
        public C0453g _withTag;
        public C0453g _withoutTag;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        public static final HandleCallbackNearest handleCallbackNearest = new HandleCallbackNearest();
        public float withinRange = 500.0f;
        public float withinRangeSq = this.withinRange * this.withinRange;
        public EnumC0200q relation = EnumC0200q.f1397f;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
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
                throw new C1119am("NearestUnit distance cannot be over 1500 is: " + f);
            }
            this.withinRange = f;
            this.withinRangeSq = f * f;
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3677c(str);
        }

        @LogicBoolean.Parameter
        public void withoutTag(String str) {
            this._withoutTag = C0453g.m3677c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1107ab.m693a(str, EnumC0200q.f1397f, EnumC0200q.class);
            } catch (C0417bo e) {
                throw new C1119am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            handleCallbackNearest.nearest = null;
            handleCallbackNearest.withinRangeSq = this.withinRangeSq;
            handleCallbackNearest.tag = this._withTag;
            handleCallbackNearest.withoutTag = this._withoutTag;
            handleCallbackNearest.incompleteBuildings = this.incompleteBuildings;
            handleCallbackNearest.relation = this.relation;
            GameEngine.getGameEngine().f6340cc.m3208a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, this.withinRange, abstractC0629y, 0.0f, handleCallbackNearest);
            return handleCallbackNearest.nearest;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NearestUnitReference$HandleCallbackNearest.class */
        public class HandleCallbackNearest extends AbstractC0549i {
            public C0453g tag;
            public C0453g withoutTag;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public EnumC0200q relation = EnumC0200q.f1397f;
            public AbstractC0244am nearest;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public void setup(AbstractC0629y abstractC0629y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public int excludeTeam(AbstractC0629y abstractC0629y) {
                return -3;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
            public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
                if ((this.relation != EnumC0200q.f1397f && !abstractC0629y.f1614bX.m4440a(this.relation, abstractC0244am.f1614bX)) || abstractC0629y == abstractC0244am) {
                    return;
                }
                C0454h mo3599de = abstractC0244am.mo3599de();
                if (this.tag == null || (mo3599de != null && C0453g.m3685a(this.tag, mo3599de))) {
                    float m2216a = C0773f.m2216a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep);
                    if (m2216a < this.withinRangeSq) {
                        if (abstractC0244am.f1629cm < 1.0f && !this.incompleteBuildings) {
                            return;
                        }
                        if (this.withoutTag != null && mo3599de != null && C0453g.m3685a(this.withoutTag, mo3599de)) {
                            return;
                        }
                        this.withinRangeSq = m2216a;
                        this.nearest = abstractC0244am;
                    }
                }
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$FirstUnitReference.class */
    public class FirstUnitReference extends UnitReference {
        public C0453g _withTag;
        public EnumC0200q relation = EnumC0200q.f1397f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
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
            this._withTag = C0453g.m3677c(str);
        }

        @LogicBoolean.Parameter
        public void relation(String str) {
            try {
                this.relation = (EnumC0200q) C1107ab.m693a(str, (Enum) null, EnumC0200q.class);
            } catch (C0417bo e) {
                throw new C1119am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am[] m499a = AbstractC0244am.f1594bE.m499a();
            int size = AbstractC0244am.f1594bE.size();
            for (int i = 0; i < size; i++) {
                AbstractC0244am abstractC0244am = m499a[i];
                if ((this.relation == EnumC0200q.f1397f || abstractC0629y.f1614bX.m4440a(this.relation, abstractC0244am.f1614bX)) && abstractC0629y != abstractC0244am) {
                    C0454h mo3599de = abstractC0244am.mo3599de();
                    if ((this._withTag == null || (mo3599de != null && C0453g.m3685a(this._withTag, mo3599de))) && (abstractC0244am.f1629cm >= 1.0f || this.incompleteBuildings)) {
                        return abstractC0244am;
                    }
                }
            }
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$PlaceholderUnitReference.class */
    public abstract class PlaceholderUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
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

        /* renamed from: x */
        public LogicBoolean f3337x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3338y = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean height = LogicBoolean.StaticValueBoolean.static_0;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetAbsolute";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0629y abstractC0629y2 = abstractC0629y.f1614bX.f1316t;
            AbstractC0629y parameterContext = getParameterContext(abstractC0629y);
            abstractC0629y2.f1623cg = abstractC0629y.f1623cg;
            abstractC0629y2.f7172eo = abstractC0629y.f7172eo + this.f3337x.readNumber(parameterContext);
            abstractC0629y2.f7173ep = abstractC0629y.f7173ep + this.f3338y.readNumber(parameterContext);
            abstractC0629y2.f7174eq = abstractC0629y.f7174eq + this.height.readNumber(parameterContext);
            return abstractC0629y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelative.class */
    public class GetOffsetRelative extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: x */
        public LogicBoolean f3339x = LogicBoolean.StaticValueBoolean.static_0;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1)

        /* renamed from: y */
        public LogicBoolean f3340y = LogicBoolean.StaticValueBoolean.static_0;
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
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0629y abstractC0629y2 = abstractC0629y.f1614bX.f1316t;
            AbstractC0629y parameterContext = getParameterContext(abstractC0629y);
            float readNumber = abstractC0629y.f1623cg + this.dirOffset.readNumber(parameterContext);
            float m2107k = C0773f.m2107k(readNumber);
            float m2110j = C0773f.m2110j(readNumber);
            float readNumber2 = this.f3339x.readNumber(parameterContext);
            float readNumber3 = this.f3340y.readNumber(parameterContext);
            float f = (m2107k * readNumber3) - (m2110j * readNumber2);
            abstractC0629y2.f1623cg = readNumber;
            abstractC0629y2.f7172eo = abstractC0629y.f7172eo + f;
            abstractC0629y2.f7173ep = abstractC0629y.f7173ep + (m2110j * readNumber3) + (m2107k * readNumber2);
            abstractC0629y2.f7174eq = abstractC0629y.f7174eq + this.height.readNumber(parameterContext);
            return abstractC0629y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetOffsetRelativeStatic.class */
    public class GetOffsetRelativeStatic extends PlaceholderUnitReference {
        @LogicBoolean.Parameter(positional = 0)

        /* renamed from: x */
        public float f3341x;
        @LogicBoolean.Parameter(positional = 1)

        /* renamed from: y */
        public float f3342y;
        @LogicBoolean.Parameter
        public float height;
        @LogicBoolean.Parameter
        public float dirOffset;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getOffsetRelativeStatic";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0629y abstractC0629y2 = abstractC0629y.f1614bX.f1316t;
            float f = abstractC0629y.f1623cg + this.dirOffset;
            float m2107k = C0773f.m2107k(f);
            float m2110j = C0773f.m2110j(f);
            float f2 = this.f3341x;
            float f3 = this.f3342y;
            float f4 = (m2107k * f3) - (m2110j * f2);
            abstractC0629y2.f1623cg = f;
            abstractC0629y2.f7172eo = abstractC0629y.f7172eo + f4;
            abstractC0629y2.f7173ep = abstractC0629y.f7173ep + (m2110j * f3) + (m2107k * f2);
            abstractC0629y2.f7174eq = abstractC0629y.f7174eq + this.height;
            return abstractC0629y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$GetAsMarker.class */
    public class GetAsMarker extends PlaceholderUnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "getAsMarker";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0629y abstractC0629y2 = abstractC0629y.f1614bX.f1316t;
            abstractC0629y2.f1623cg = abstractC0629y.f1623cg;
            abstractC0629y2.f7172eo = abstractC0629y.f7172eo;
            abstractC0629y2.f7173ep = abstractC0629y.f7173ep;
            abstractC0629y2.f7174eq = abstractC0629y.f7174eq;
            return abstractC0629y2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ThisActionTargetReference.class */
    public class ThisActionTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            AbstractC0244am abstractC0244am = C0456j.f2904dN;
            if (abstractC0244am != null) {
                return abstractC0244am;
            }
            PointF pointF = C0456j.f2903dM;
            if (pointF != null) {
                AbstractC0629y abstractC0629y2 = PlayerData.f1373i.f1316t;
                abstractC0629y2.f1623cg = 0.0f;
                abstractC0629y2.f7172eo = pointF.x;
                abstractC0629y2.f7173ep = pointF.y;
                abstractC0629y2.f7174eq = 0.0f;
                return abstractC0629y2;
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
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            C0457k c0457k = LogicBoolean.activeEvent;
            if (c0457k == null) {
                return null;
            }
            return c0457k.f2930c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "EventSource";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$ActiveWaypointTargetReference.class */
    public class ActiveWaypointTargetReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            C0305au m2943ar = abstractC0629y.m2943ar();
            if (m2943ar == null) {
                return null;
            }
            return m2943ar.m4132l();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "ActiveWaypointTarget";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$AttackingReference.class */
    public class AttackingReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f3928R;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$NullUnitReference.class */
    public class NullUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "NULL";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return null;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$SelfUnitReference.class */
    public class SelfUnitReference extends UnitReference {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            return abstractC0629y;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "self";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$LockedUnitReference.class */
    public class LockedUnitReference extends UnitReference {
        AbstractC0244am target;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(C0458l c0458l, String str, String str2) {
            return super.with(c0458l, str, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean with(String str) {
            return super.with(str);
        }

        public LockedUnitReference(AbstractC0244am abstractC0244am) {
            this.target = abstractC0244am;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            return this.target;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "unit";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/UnitReference$UnitReferenceOrUnitType.class */
    public class UnitReferenceOrUnitType {
        C0469v unitType;
        UnitReference unitReference;

        UnitReferenceOrUnitType(C0469v c0469v) {
            this.unitType = c0469v;
        }

        UnitReferenceOrUnitType(UnitReference unitReference) {
            this.unitReference = unitReference;
        }

        public AbstractC0244am getUnitOrSharedUnit(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitType != null) {
                return AbstractC0244am.m4223c(this.unitType.mo3471c());
            }
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2;
            }
            return null;
        }

        public AbstractC0244am getUnitReferenceOrNull(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2;
            }
            return null;
        }

        public InterfaceC0303as getTypeOrNull(AbstractC0244am abstractC0244am) {
            AbstractC0244am abstractC0244am2;
            if (this.unitType != null) {
                return this.unitType.mo3471c();
            }
            if (this.unitReference != null && (abstractC0244am2 = this.unitReference.get(abstractC0244am)) != null) {
                return abstractC0244am2.mo5458r();
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

        public AbstractC0629y getUnitContext(AbstractC0629y abstractC0629y) {
            if (this.dynamicContextChain != null) {
                AbstractC0629y abstractC0629y2 = abstractC0629y;
                for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                    AbstractC0244am readUnit = logicBoolean.readUnit(abstractC0629y2);
                    if (!(readUnit instanceof AbstractC0629y)) {
                        return null;
                    }
                    abstractC0629y2 = (AbstractC0629y) readUnit;
                }
                return abstractC0629y2;
            }
            AbstractC0244am readUnit2 = this.dynamicContext.readUnit(abstractC0629y);
            if (!(readUnit2 instanceof AbstractC0629y)) {
                return null;
            }
            return (AbstractC0629y) readUnit2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
            try {
                AbstractC0629y unitContext = getUnitContext(abstractC0629y);
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
        public float readNumber(AbstractC0629y abstractC0629y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
            try {
                AbstractC0629y unitContext = getUnitContext(abstractC0629y);
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
        public String readString(AbstractC0629y abstractC0629y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
            try {
                AbstractC0629y unitContext = getUnitContext(abstractC0629y);
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
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
            try {
                AbstractC0629y unitContext = getUnitContext(abstractC0629y);
                if (unitContext != null) {
                    AbstractC0244am readUnit = this.targetBoolean.readUnit(unitContext);
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
        public void forMeta(C0458l c0458l) {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public UnitContextChangingBooleanByLogic with(C0458l c0458l, String str, String str2) {
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.targetBoolean.getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            AbstractC0244am readUnit;
            String str;
            LogicBoolean[] logicBooleanArr;
            if (this.dynamicContextChain != null) {
                String str2 = VariableScope.nullOrMissingString;
                AbstractC0629y abstractC0629y2 = abstractC0629y;
                LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
                try {
                    for (LogicBoolean logicBoolean : this.dynamicContextChain) {
                        String str3 = str2 + logicBoolean.getMatchFailReasonForPlayer(abstractC0629y2);
                        AbstractC0244am readUnit2 = logicBoolean.readUnit(abstractC0629y2);
                        if (readUnit2 instanceof AbstractC0629y) {
                            str2 = str3 + ".";
                            abstractC0629y2 = (AbstractC0629y) readUnit2;
                        } else {
                            return str3 + "<unit not found>";
                        }
                    }
                    return str2 + this.targetBoolean.getMatchFailReasonForPlayer(abstractC0629y2);
                } finally {
                }
            }
            LogicBoolean.setOuterUnitParameterContext(abstractC0629y);
            try {
                if (!(this.dynamicContext.readUnit(abstractC0629y) instanceof AbstractC0629y)) {
                    str = "=<unit not found> (type:" + this.dynamicContext.getReturnType() + ")";
                } else {
                    str = "." + this.targetBoolean.getMatchFailReasonForPlayer((AbstractC0629y) readUnit);
                }
                return this.dynamicContext.getMatchFailReasonForPlayer(abstractC0629y) + str;
            } finally {
            }
        }
    }
}