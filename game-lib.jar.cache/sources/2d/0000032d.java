package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
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
    public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
        return "TEXT";
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public boolean read(AbstractC0629y abstractC0629y) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
    public float readNumber(AbstractC0629y abstractC0629y) {
        return 0.0f;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StaticString.class */
    public class StaticString extends LogicString {
        String text;

        public StaticString(String str) {
            this.text = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return this.text;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$Playername.class */
    public class Playername extends LogicString {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.name;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$TeamName.class */
    public class TeamName extends LogicString {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.getPlayerTeamName();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$WrappingLogicString.class */
    public class WrappingLogicString extends LogicString {
        LogicBoolean[] children;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m582a = C1118al.m582a(str, ",", false);
            validateNumberOfArguments(m582a.size());
            this.children = new LogicBoolean[m582a.size()];
            for (int i = 0; i < m582a.size(); i++) {
                this.children[i] = LogicBooleanLoader.parseBooleanBlock(c0458l, (String) m582a.get(i), false);
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
        public String readString(AbstractC0629y abstractC0629y) {
            return this.children[0].getMatchFailReasonForPlayer(abstractC0629y);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$DebugPassthrough.class */
    public class DebugPassthrough extends WrappingLogicString {
        public void addMessage(AbstractC0629y abstractC0629y) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine.f6313bv && gameEngine.f6444bl) {
                String str = VariableScope.nullOrMissingString;
                if (abstractC0629y != null) {
                    str = abstractC0629y.mo5459r().mo3514i() + "(" + abstractC0629y.f7166eh + ") ";
                }
                GameNetEngine.m1564a((String) null, str + "DebugPassthrough: " + this.children[0].getMatchFailReasonForPlayer(abstractC0629y));
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return this.children[0].getReturnType();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            addMessage(abstractC0629y);
            return this.children[0].read(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            addMessage(abstractC0629y);
            return this.children[0].readNumber(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            addMessage(abstractC0629y);
            return this.children[0].readString(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            addMessage(abstractC0629y);
            return this.children[0].readUnit(abstractC0629y);
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
        public String readString(AbstractC0629y abstractC0629y) {
            String readString = this.text.readString(abstractC0629y);
            int readNumber = (int) this.start.readNumber(abstractC0629y);
            int readNumber2 = (int) this.end.readNumber(abstractC0629y);
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
        public String readString(AbstractC0629y abstractC0629y) {
            return this.text.readString(abstractC0629y).toLowerCase(Locale.ROOT);
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
        public String readString(AbstractC0629y abstractC0629y) {
            return this.text.readString(abstractC0629y).toUpperCase(Locale.ROOT);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicString$StringCast.class */
    class StringCast extends LogicString {
        LogicBoolean child;
        LogicBoolean.ReturnType sourceType;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m582a = C1118al.m582a(str, ",", false);
            validateNumberOfArguments(m582a.size());
            this.child = LogicBooleanLoader.parseBooleanBlock(c0458l, (String) m582a.get(0), false);
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
        public String readString(AbstractC0629y abstractC0629y) {
            return castToString(this.sourceType, this.child, abstractC0629y);
        }

        public static String castToString(LogicBoolean.ReturnType returnType, LogicBoolean logicBoolean, AbstractC0629y abstractC0629y) {
            if (returnType == LogicBoolean.ReturnType.number) {
                return C0773f.m2213a(logicBoolean.readNumber(abstractC0629y), 2);
            }
            if (returnType == LogicBoolean.ReturnType.unit) {
                return AbstractC0244am.m4257A(logicBoolean.readUnit(abstractC0629y));
            }
            if (returnType == LogicBoolean.ReturnType.string) {
                return logicBoolean.readString(abstractC0629y);
            }
            if (returnType == LogicBoolean.ReturnType.numberArray) {
                return arrayToString(abstractC0629y, logicBoolean);
            }
            if (returnType == LogicBoolean.ReturnType.boolArray) {
                return arrayToString(abstractC0629y, logicBoolean);
            }
            return logicBoolean.read(abstractC0629y) ? "true" : "false";
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
            public /* bridge */ /* synthetic */ void setArgumentsRaw(String str, C0458l c0458l, String str2) {
                super.setArgumentsRaw(str, c0458l, str2);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString.StringCast, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public String readString(AbstractC0629y abstractC0629y) {
                return C0773f.m2213a(this.child.readNumber(abstractC0629y), 2);
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
        public void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                validateNumberOfArguments(0);
                return;
            }
            ArrayList m582a = C1118al.m582a(str, ",", false);
            validateNumberOfArguments(m582a.size());
            this.selector = LogicBooleanLoader.parseBooleanBlock(c0458l, (String) m582a.get(0), true);
            if (this.selector == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childA = LogicBooleanLoader.parseBooleanBlock(c0458l, (String) m582a.get(1), false);
            if (this.childA == null) {
                throw new BooleanParseException("Expected non-null argument");
            }
            this.childB = LogicBooleanLoader.parseBooleanBlock(c0458l, (String) m582a.get(2), false);
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
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "(selector if:(" + this.selector.getMatchFailReasonForPlayer(abstractC0629y) + ") then:(" + this.childA.getMatchFailReasonForPlayer(abstractC0629y) + ") ) else:(" + this.childB.getMatchFailReasonForPlayer(abstractC0629y) + ") )";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String readString(AbstractC0629y abstractC0629y) {
            if (this.selector.read(abstractC0629y)) {
                return this.childA.readString(abstractC0629y);
            }
            return this.childB.readString(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            if (this.selector.read(abstractC0629y)) {
                return this.childA.read(abstractC0629y);
            }
            return this.childB.read(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            if (this.selector.read(abstractC0629y)) {
                return this.childA.readNumber(abstractC0629y);
            }
            return this.childB.readNumber(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public AbstractC0244am readUnit(AbstractC0629y abstractC0629y) {
            if (this.selector.read(abstractC0629y)) {
                return this.childA.readUnit(abstractC0629y);
            }
            return this.childB.readUnit(abstractC0629y);
        }
    }

    public static String arrayToString(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        LogicBoolean readArrayElement;
        int arraySize = logicBoolean.getArraySize(abstractC0629y);
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
                if (logicBoolean.readArrayElement(abstractC0629y, i) != null) {
                    str = str + readArrayElement.valueToStringDebug(abstractC0629y);
                }
                i++;
            }
        }
        return str + "]";
    }

    public static String arraySummaryToString(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        return LogicBoolean.ReturnType.toUserString(LogicBoolean.ReturnType.getArrayBaseType(logicBoolean.getReturnType())) + "[" + logicBoolean.getArraySize(abstractC0629y) + "]";
    }
}