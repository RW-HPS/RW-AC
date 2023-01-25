package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1119am;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction.class */
public abstract class LogicNumberFunction extends LogicBoolean.LogicNumberOnly {

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$LogicNumberFunctionRawArgs.class */
    abstract class LogicNumberFunctionRawArgs extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean value;

        public abstract float doFunction(float f);

        LogicNumberFunctionRawArgs() {
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m582a = C1118al.m582a(str, ",", false);
            validateNumberOfArguments(m582a.size());
            this.value = LogicBooleanLoader.parseNumberBlock(c0458l, (String) m582a.get(0));
            if (this.value == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.value instanceof LogicBoolean.StaticValueBoolean) {
                return new LogicBoolean.StaticValueBoolean(doFunction(((LogicBoolean.StaticValueBoolean) this.value).getStaticValue()));
            }
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.value == null) {
                throw new BooleanParseException("Expected parameters missing");
            }
            if (z) {
                throw new BooleanParseException("Expected function:" + str + " to return a boolean, but it returns a number");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return getName() + "(" + this.value.getMatchFailReasonForPlayer(abstractC0629y) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionInt.class */
    public class FunctionInt extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return super.getMatchFailReasonForPlayer(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            super.setArgumentsRaw(str, c0458l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Int";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return doFunction(this.value.readNumber(abstractC0629y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return (int) f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSquareRoot.class */
    public class FunctionSquareRoot extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return super.getMatchFailReasonForPlayer(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            super.setArgumentsRaw(str, c0458l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "SquareRoot";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return doFunction(this.value.readNumber(abstractC0629y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0773f.m2219a(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionCos.class */
    public class FunctionCos extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return super.getMatchFailReasonForPlayer(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            super.setArgumentsRaw(str, c0458l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "cos";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return doFunction(this.value.readNumber(abstractC0629y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0773f.m2107k(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSin.class */
    public class FunctionSin extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return super.getMatchFailReasonForPlayer(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
            super.validateNumberOfArguments(i);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            super.setArgumentsRaw(str, c0458l, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "sin";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return doFunction(this.value.readNumber(abstractC0629y));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return C0773f.m2110j(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceSquared.class */
    public class FunctionDistanceSquared extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3328x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3329y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3330x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3331y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceSquared";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            float readNumber = this.f3328x1.readNumber(abstractC0629y);
            float readNumber2 = this.f3329y1.readNumber(abstractC0629y);
            float readNumber3 = this.f3330x2.readNumber(abstractC0629y);
            float readNumber4 = this.f3331y2.readNumber(abstractC0629y);
            return ((readNumber - readNumber3) * (readNumber - readNumber3)) + ((readNumber2 - readNumber4) * (readNumber2 - readNumber4));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceBetweenSquared.class */
    public class FunctionDistanceBetweenSquared extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceBetweenSquared";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0629y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f7172eo;
            float f2 = readUnit.f7173ep;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0629y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0773f.m2216a(f, f2, readUnit2.f7172eo, readUnit2.f7173ep);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistance.class */
    public class FunctionDistance extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3324x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3325y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3326x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3327y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Distance";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return C0773f.m2170b(this.f3324x1.readNumber(abstractC0629y), this.f3325y1.readNumber(abstractC0629y), this.f3326x2.readNumber(abstractC0629y), this.f3327y2.readNumber(abstractC0629y));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDirection.class */
    public class FunctionDirection extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x1 */
        public LogicBoolean f3320x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y1 */
        public LogicBoolean f3321y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)

        /* renamed from: x2 */
        public LogicBoolean f3322x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)

        /* renamed from: y2 */
        public LogicBoolean f3323y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Direction";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return C0773f.m2138d(this.f3320x1.readNumber(abstractC0629y), this.f3321y1.readNumber(abstractC0629y), this.f3322x2.readNumber(abstractC0629y), this.f3323y2.readNumber(abstractC0629y));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceBetween.class */
    public class FunctionDistanceBetween extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceBetween";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0629y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f7172eo;
            float f2 = readUnit.f7173ep;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0629y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0773f.m2170b(f, f2, readUnit2.f7172eo, readUnit2.f7173ep);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDirectionBetween.class */
    public class FunctionDirectionBetween extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 0, required = true)
        public LogicBoolean unit1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.unit, positional = 1, required = true)
        public LogicBoolean unit2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DirectionBetween";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            AbstractC0244am readUnit = this.unit1.readUnit(abstractC0629y);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.f7172eo;
            float f2 = readUnit.f7173ep;
            AbstractC0244am readUnit2 = this.unit2.readUnit(abstractC0629y);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return C0773f.m2138d(f, f2, readUnit2.f7172eo, readUnit2.f7173ep);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$CreateMarker.class */
    public class CreateMarker extends UnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: x */
        public LogicBoolean f3318x;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: y */
        public LogicBoolean f3319y;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = false)
        public LogicBoolean height;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean teamId;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
        public LogicBoolean dir;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.height == null) {
                this.height = LogicBoolean.StaticValueBoolean.static_0;
            }
            if (this.dir == null) {
                this.dir = LogicBoolean.StaticValueBoolean.static_0;
            }
            if (this.teamId == null) {
                this.teamId = LogicBoolean.StaticValueBoolean.static_neg1;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public AbstractC0244am getSingleRaw(AbstractC0629y abstractC0629y) {
            float readNumber = this.f3318x.readNumber(abstractC0629y);
            float readNumber2 = this.f3319y.readNumber(abstractC0629y);
            float readNumber3 = this.height.readNumber(abstractC0629y);
            float readNumber4 = this.dir.readNumber(abstractC0629y);
            PlayerData m4365k = PlayerData.m4365k((int) this.teamId.readNumber(abstractC0629y));
            if (m4365k == null) {
                m4365k = PlayerData.f1373i;
            }
            AbstractC0629y abstractC0629y2 = m4365k.f1316t;
            abstractC0629y2.f1623cg = readNumber4;
            abstractC0629y2.f7172eo = readNumber;
            abstractC0629y2.f7173ep = readNumber2;
            abstractC0629y2.f7174eq = readNumber3;
            return abstractC0629y2;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference
        public String getClassDebugName() {
            return "createMarker";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionRnd.class */
    public class FunctionRnd extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean min;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean max;
        int randomIndex;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new C1119am("FunctionRnd requires metadata");
            }
            c0458l.f2957S++;
            this.randomIndex = c0458l.f2957S;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Rnd";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            float readNumber = this.min.readNumber(abstractC0629y);
            float readNumber2 = this.max.readNumber(abstractC0629y);
            int i = 0;
            if (abstractC0629y != null) {
                i = abstractC0629y.f1592bC;
            }
            return C0773f.m2169b(readNumber, readNumber2, this.randomIndex + i);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMax.class */
    public class FunctionMax extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3333a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: b */
        public LogicBoolean f3334b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Max";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            float readNumber = this.f3333a.readNumber(abstractC0629y);
            float readNumber2 = this.f3334b.readNumber(abstractC0629y);
            if (readNumber > readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMin.class */
    public class FunctionMin extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3335a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)

        /* renamed from: b */
        public LogicBoolean f3336b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Min";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            float readNumber = this.f3335a.readNumber(abstractC0629y);
            float readNumber2 = this.f3336b.readNumber(abstractC0629y);
            if (readNumber < readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionLength.class */
    public class FunctionLength extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.string, positional = 0, required = true)

        /* renamed from: a */
        public LogicBoolean f3332a;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Length";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            String readString = this.f3332a.readString(abstractC0629y);
            if (readString == null) {
                return 0.0f;
            }
            return readString.length();
        }
    }
}