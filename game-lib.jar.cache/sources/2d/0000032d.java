package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString.class */
public abstract class LogicString extends LogicBoolean {
    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public LogicBoolean.ReturnType getReturnType() {
        return LogicBoolean.ReturnType.string;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
        super.validate(str, str2, str3, logicBooleanContext, z);
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public String getMatchFailReasonForPlayer(y yVar) {
        return "TEXT";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(y yVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public float readNumber(y yVar) {
        return 0.0f;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StaticString.class */
    public class StaticString extends LogicString {
        String text;

        public StaticString(String str) {
            this.text = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Playername.class */
    public class Playername extends LogicString {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return yVar.bX.name;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$TeamName.class */
    public class TeamName extends LogicString {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return yVar.bX.getPlayerTeamName();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$WrappingLogicString.class */
    public class WrappingLogicString extends LogicString {
        LogicBoolean[] children;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, l lVar, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList a = al.a(str, ",", false);
            validateNumberOfArguments(a.size());
            this.children = new LogicBoolean[a.size()];
            for (int i = 0; i < a.size(); i++) {
                this.children[i] = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a.get(i), false);
                if (this.children == null) {
                    throw new BooleanParseException("Expected non-null argument");
                }
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Debug.class */
    public class Debug extends WrappingLogicString {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return this.children[0].getMatchFailReasonForPlayer(yVar);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$DebugPassthrough.class */
    public class DebugPassthrough extends WrappingLogicString {
        public void addMessage(y yVar) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.bv && gameEngine.bl) {
                String str = VariableScope.nullOrMissingString;
                if (yVar != null) {
                    str = yVar.mo1r().i() + "(" + yVar.eh + ") ";
                }
                GameNetEngine.a((String) null, str + "DebugPassthrough: " + this.children[0].getMatchFailReasonForPlayer(yVar));
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.children[0].getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            addMessage(yVar);
            return this.children[0].read(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            addMessage(yVar);
            return this.children[0].readNumber(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            addMessage(yVar);
            return this.children[0].readString(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public am readUnit(y yVar) {
            addMessage(yVar);
            return this.children[0].readUnit(yVar);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Substring.class */
    public class Substring extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, required = true, positional = 1)
        public LogicBoolean start;
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, required = true, positional = 2)
        public LogicBoolean end;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                this.text = StringCast.createStringCast(this.text);
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            String readString = this.text.readString(yVar);
            int readNumber = (int) this.start.readNumber(yVar);
            int readNumber2 = (int) this.end.readNumber(yVar);
            if (readNumber < 0) {
                readNumber = 0;
            }
            if (readNumber2 < 0) {
                readNumber2 = 0;
            }
            if (readNumber > readString.length()) {
                readNumber = readString.length();
            }
            if (readNumber2 > readString.length()) {
                readNumber2 = readString.length();
            }
            if (readNumber2 < readNumber) {
                readNumber2 = readNumber;
            }
            return readString.substring(readNumber, readNumber2);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$LowerString.class */
    public class LowerString extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                throw new BooleanParseException("Expected string argument");
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return this.text.readString(yVar).toLowerCase(Locale.ROOT);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$UpperString.class */
    public class UpperString extends LogicString {
        @LogicBoolean.Parameter(required = true, positional = 0)
        public LogicBoolean text;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            if (this.text == null) {
                throw new BooleanParseException("Expected argument text");
            }
            if (this.text.getReturnType() != LogicBoolean.ReturnType.string) {
                throw new BooleanParseException("Expected string argument");
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return this.text.readString(yVar).toUpperCase(Locale.ROOT);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StringCast.class */
    class StringCast extends LogicString {
        LogicBoolean child;
        LogicBoolean.ReturnType sourceType;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, l lVar, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList a = al.a(str, ",", false);
            validateNumberOfArguments(a.size());
            this.child = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a.get(0), false);
            if (this.child == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 1) {
                throw new BooleanParseException("Expected 1 argument");
            }
        }

        public static LogicBoolean createStringCast(LogicBoolean logicBoolean) {
            StringCast stringCast = new StringCast();
            stringCast.child = logicBoolean;
            return stringCast.validateAndOptimize("cast", VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            this.sourceType = this.child.getReturnType();
            if (this.child instanceof StaticString) {
                return this.child;
            }
            if (this.child instanceof LogicBoolean.StaticBoolean) {
                return new StaticString(readString(null));
            }
            if (this.child instanceof LogicBoolean.StaticValueBoolean) {
                return new StaticString(readString(null));
            }
            return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            return castToString(this.sourceType, this.child, yVar);
        }

        public static String castToString(LogicBoolean.ReturnType returnType, LogicBoolean logicBoolean, y yVar) {
            if (returnType == LogicBoolean.ReturnType.number) {
                return f.a(logicBoolean.readNumber(yVar), 2);
            }
            if (returnType == LogicBoolean.ReturnType.unit) {
                return am.A(logicBoolean.readUnit(yVar));
            }
            if (returnType == LogicBoolean.ReturnType.string) {
                return logicBoolean.readString(yVar);
            }
            if (returnType == LogicBoolean.ReturnType.numberArray) {
                return arrayToString(yVar, logicBoolean);
            }
            if (returnType == LogicBoolean.ReturnType.boolArray) {
                return arrayToString(yVar, logicBoolean);
            }
            return logicBoolean.read(yVar) ? "true" : "false";
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StringCast$NumberToStringCast.class */
        public class NumberToStringCast extends StringCast {
            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString.StringCast, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public /* bridge */ /* synthetic */ LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
                return super.validateAndOptimize(str, str2, str3, logicBooleanContext, z);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString.StringCast
            public /* bridge */ /* synthetic */ void validateNumberOfArguments(int i) {
                super.validateNumberOfArguments(i);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString.StringCast, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, l lVar, String str2) {
                super.setArgumentsRaw(str, lVar, str2);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString.StringCast, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public String readString(y yVar) {
                return f.a(this.child.readNumber(yVar), 2);
            }
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Select.class */
    public class Select extends LogicString {
        LogicBoolean.ReturnType commonType;
        LogicBoolean selector;
        LogicBoolean childA;
        LogicBoolean childB;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, l lVar, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList a = al.a(str, ",", false);
            validateNumberOfArguments(a.size());
            this.selector = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a.get(0), true);
            if (this.selector == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childA = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a.get(1), false);
            if (this.childA == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childB = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a.get(2), false);
            if (this.childB == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.commonType = this.childA.getReturnType();
            if (this.commonType != this.childB.getReturnType()) {
                throw new BooleanParseException("Select() expected 2 and 3 argument to be the same type, got: " + this.commonType.name() + " and " + this.childB.getReturnType().name());
            }
        }

        public void validateNumberOfArguments(int i) {
            if (i != 3) {
                throw new BooleanParseException("Expected 3 arguments");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.commonType;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "(selector if:(" + this.selector.getMatchFailReasonForPlayer(yVar) + ") then:(" + this.childA.getMatchFailReasonForPlayer(yVar) + ") ) else:(" + this.childB.getMatchFailReasonForPlayer(yVar) + ") )";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(y yVar) {
            if (this.selector.read(yVar)) {
                return this.childA.readString(yVar);
            }
            return this.childB.readString(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            if (this.selector.read(yVar)) {
                return this.childA.read(yVar);
            }
            return this.childB.read(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            if (this.selector.read(yVar)) {
                return this.childA.readNumber(yVar);
            }
            return this.childB.readNumber(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public am readUnit(y yVar) {
            if (this.selector.read(yVar)) {
                return this.childA.readUnit(yVar);
            }
            return this.childB.readUnit(yVar);
        }
    }

    public static String arrayToString(y yVar, LogicBoolean logicBoolean) {
        LogicBoolean readArrayElement;
        int arraySize = logicBoolean.getArraySize(yVar);
        String str = "[";
        int i = 0;
        while (true) {
            if (i >= arraySize) {
                break;
            } else if (i > 12) {
                str = str + ",...";
                break;
            } else {
                if (i != 0) {
                    str = str + ",";
                }
                if (logicBoolean.readArrayElement(yVar, i) != null) {
                    str = str + readArrayElement.valueToStringDebug(yVar);
                }
                i++;
            }
        }
        return str + "]";
    }

    public static String arraySummaryToString(y yVar, LogicBoolean logicBoolean) {
        return LogicBoolean.ReturnType.toUserString(LogicBoolean.ReturnType.getArrayBaseType(logicBoolean.getReturnType())) + "[" + logicBoolean.getArraySize(yVar) + "]";
    }
}