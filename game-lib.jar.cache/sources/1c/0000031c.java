package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.al;
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
        public void setArgumentsRaw(String str, l lVar, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList a2 = al.a(str, ",", false);
            validateNumberOfArguments(a2.size());
            this.value = LogicBooleanLoader.parseNumberBlock(lVar, (String) a2.get(0));
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
        public String getMatchFailReasonForPlayer(y yVar) {
            return getName() + "(" + this.value.getMatchFailReasonForPlayer(yVar) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionInt.class */
    public class FunctionInt extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(y yVar) {
            return super.getMatchFailReasonForPlayer(yVar);
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
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, l lVar, String str2) {
            super.setArgumentsRaw(str, lVar, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Int";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return doFunction(this.value.readNumber(yVar));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return (int) f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSquareRoot.class */
    public class FunctionSquareRoot extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(y yVar) {
            return super.getMatchFailReasonForPlayer(yVar);
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
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, l lVar, String str2) {
            super.setArgumentsRaw(str, lVar, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "SquareRoot";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return doFunction(this.value.readNumber(yVar));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return f.a(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionCos.class */
    public class FunctionCos extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(y yVar) {
            return super.getMatchFailReasonForPlayer(yVar);
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
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, l lVar, String str2) {
            super.setArgumentsRaw(str, lVar, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "cos";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return doFunction(this.value.readNumber(yVar));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return f.k(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionSin.class */
    public class FunctionSin extends LogicNumberFunctionRawArgs {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public /* bridge */ /* synthetic */ String getMatchFailReasonForPlayer(y yVar) {
            return super.getMatchFailReasonForPlayer(yVar);
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
        public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, l lVar, String str2) {
            super.setArgumentsRaw(str, lVar, str2);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "sin";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return doFunction(this.value.readNumber(yVar));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicNumberFunction.LogicNumberFunctionRawArgs
        public float doFunction(float f) {
            return f.j(f);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistanceSquared.class */
    public class FunctionDistanceSquared extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)
        public LogicBoolean x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)
        public LogicBoolean y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "DistanceSquared";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            float readNumber = this.x1.readNumber(yVar);
            float readNumber2 = this.y1.readNumber(yVar);
            float readNumber3 = this.x2.readNumber(yVar);
            float readNumber4 = this.y2.readNumber(yVar);
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
        public float readNumber(y yVar) {
            am readUnit = this.unit1.readUnit(yVar);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.eo;
            float f2 = readUnit.ep;
            am readUnit2 = this.unit2.readUnit(yVar);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return f.a(f, f2, readUnit2.eo, readUnit2.ep);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDistance.class */
    public class FunctionDistance extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)
        public LogicBoolean x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)
        public LogicBoolean y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Distance";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return f.b(this.x1.readNumber(yVar), this.y1.readNumber(yVar), this.x2.readNumber(yVar), this.y2.readNumber(yVar));
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionDirection.class */
    public class FunctionDirection extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean x1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean y1;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 2, required = true)
        public LogicBoolean x2;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 3, required = true)
        public LogicBoolean y2;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Direction";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return f.d(this.x1.readNumber(yVar), this.y1.readNumber(yVar), this.x2.readNumber(yVar), this.y2.readNumber(yVar));
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
        public float readNumber(y yVar) {
            am readUnit = this.unit1.readUnit(yVar);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.eo;
            float f2 = readUnit.ep;
            am readUnit2 = this.unit2.readUnit(yVar);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return f.b(f, f2, readUnit2.eo, readUnit2.ep);
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
        public float readNumber(y yVar) {
            am readUnit = this.unit1.readUnit(yVar);
            if (readUnit == null) {
                return 0.0f;
            }
            float f = readUnit.eo;
            float f2 = readUnit.ep;
            am readUnit2 = this.unit2.readUnit(yVar);
            if (readUnit2 == null) {
                return 0.0f;
            }
            return f.d(f, f2, readUnit2.eo, readUnit2.ep);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$CreateMarker.class */
    public class CreateMarker extends UnitReference {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)
        public LogicBoolean x;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean y;
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
        public am getSingleRaw(y yVar) {
            float readNumber = this.x.readNumber(yVar);
            float readNumber2 = this.y.readNumber(yVar);
            float readNumber3 = this.height.readNumber(yVar);
            float readNumber4 = this.dir.readNumber(yVar);
            PlayerData k = PlayerData.k((int) this.teamId.readNumber(yVar));
            if (k == null) {
                k = PlayerData.i;
            }
            y yVar2 = k.t;
            yVar2.cg = readNumber4;
            yVar2.eo = readNumber;
            yVar2.ep = readNumber2;
            yVar2.eq = readNumber3;
            return yVar2;
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
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new com.corrodinggames.rts.gameFramework.utility.am("FunctionRnd requires metadata");
            }
            lVar.S++;
            this.randomIndex = lVar.S;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Rnd";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            float readNumber = this.min.readNumber(yVar);
            float readNumber2 = this.max.readNumber(yVar);
            int i = 0;
            if (yVar != null) {
                i = yVar.bC;
            }
            return f.b(readNumber, readNumber2, this.randomIndex + i);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMax.class */
    public class FunctionMax extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a  reason: collision with root package name */
        public LogicBoolean f312a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Max";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            float readNumber = this.f312a.readNumber(yVar);
            float readNumber2 = this.b.readNumber(yVar);
            if (readNumber > readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionMin.class */
    public class FunctionMin extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0, required = true)

        /* renamed from: a  reason: collision with root package name */
        public LogicBoolean f313a;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 1, required = true)
        public LogicBoolean b;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Min";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            float readNumber = this.f313a.readNumber(yVar);
            float readNumber2 = this.b.readNumber(yVar);
            if (readNumber < readNumber2) {
                return readNumber;
            }
            return readNumber2;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicNumberFunction$FunctionLength.class */
    public class FunctionLength extends LogicNumberFunction {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.string, positional = 0, required = true)

        /* renamed from: a  reason: collision with root package name */
        public LogicBoolean f311a;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "Length";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            String readString = this.f311a.readString(yVar);
            if (readString == null) {
                return 0.0f;
            }
            return readString.length();
        }
    }
}