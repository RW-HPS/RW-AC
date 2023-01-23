package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.CompareJoinerBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicString;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader.class */
public class LogicBooleanLoader {
    public static final boolean TRACE = false;
    static Pattern patternSingleQuote = Pattern.compile("'(.*)'");
    static Pattern patternDoubleQuote = Pattern.compile("\"(.*)\"");
    static Pattern patternInteger = Pattern.compile("(-?\\d*)");
    static Pattern patternFloat = Pattern.compile("(-?\\d*\\.\\d*)");
    static final LogicBooleanContext defaultContextReader = new DefaultContextReader();
    static final LogicBooleanContext voidContextReader = new VoidContextReader(null);
    static final LogicBooleanContext voidNumberContextReader = new VoidContextReader("Number");
    static final LogicBooleanContext voidBoolContextReader = new VoidContextReader("Bool");
    static final LogicBooleanContext voidArrayContextReader = new VoidContextReader("Array element");
    static final LogicBooleanContext numberArrayContextReader = new ArrayContextReader(LogicBoolean.ReturnType.numberArray);
    static final LogicBooleanContext boolArrayContextReader = new ArrayContextReader(LogicBoolean.ReturnType.boolArray);
    static final LogicBooleanContext unitArrayContextReader = new ArrayContextReader(LogicBoolean.ReturnType.unitArray);

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$DefaultContextReader.class */
    public final class DefaultContextReader extends LogicBooleanContextWithDefault {
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanContext.class */
    public interface LogicBooleanContext {
        LogicBoolean parseNextElementInChain(String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping.class */
    public class ParameterMapping {
        public HashMap parameters = new HashMap();
        int numberOfPositionalParameters = 0;
        public Class type;
        public String allParametersString;

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ParameterMapping$FieldOrMethod.class */
        public class FieldOrMethod {
            Field field;
            Method method;
            Class type;
            LogicBoolean.ReturnType returnType;
            int positionalOffset = -1;
            boolean required;

            public FieldOrMethod(Field field) {
                this.field = field;
                this.type = field.getType();
            }

            public FieldOrMethod(Method method) {
                this.method = method;
                this.type = method.getParameterTypes()[0];
            }
        }

        public ParameterMapping(Class cls) {
            Method[] methods;
            this.type = cls;
            ArrayList arrayList = new ArrayList();
            LogicBooleanLoader.getAllFieldsInherited(arrayList, cls);
            this.allParametersString = VariableScope.nullOrMissingString;
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Field field = (Field) it.next();
                if (field.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    addParameter(field.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(field), (LogicBoolean.Parameter) field.getAnnotation(LogicBoolean.Parameter.class));
                }
            }
            for (Method method : cls.getMethods()) {
                if (method.isAnnotationPresent(LogicBoolean.Parameter.class)) {
                    addParameter(method.getName().toLowerCase(Locale.ROOT), new FieldOrMethod(method), (LogicBoolean.Parameter) method.getAnnotation(LogicBoolean.Parameter.class));
                }
            }
        }

        public void addParameter(String str, FieldOrMethod fieldOrMethod, LogicBoolean.Parameter parameter) {
            if (parameter.type() != LogicBoolean.ReturnType.undefined) {
                fieldOrMethod.returnType = parameter.type();
            }
            if (parameter.positional() != -1) {
                fieldOrMethod.positionalOffset = parameter.positional();
                this.numberOfPositionalParameters++;
            }
            if (parameter.required()) {
                fieldOrMethod.required = true;
            }
            if (parameter.key() != null && !parameter.key().equals(VariableScope.nullOrMissingString)) {
                str = parameter.key();
            }
            this.parameters.put(str, fieldOrMethod);
            if (!this.allParametersString.equals(VariableScope.nullOrMissingString)) {
                this.allParametersString += ", ";
            }
            this.allParametersString += str;
        }
    }

    public static boolean isEmptyIgnoringPlusMinus(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt != '-' && charAt != '+' && charAt != ' ') {
                return false;
            }
        }
        return true;
    }

    public static LogicBoolean parseNumberBlock(l lVar, String str) {
        LogicBoolean parseBooleanBlock = parseBooleanBlock(lVar, str, false);
        if (parseBooleanBlock != null && parseBooleanBlock.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Expected number for: '" + str + "' got a " + parseBooleanBlock.getReturnType() + " type");
        }
        return parseBooleanBlock;
    }

    public static LogicBoolean parseBooleanBlock(l lVar, String str, boolean z) {
        String str2;
        int b;
        ArrayList a2;
        int a3 = al.a(str);
        if (a3 != 0) {
            if (a3 > 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. A '(' was not closed.");
            }
            if (a3 < 0) {
                throw new RuntimeException("Brackets unbalanced for: '" + str + "'. Too many ')'.");
            }
        }
        String breakOuterLayerBrackets = breakOuterLayerBrackets(str.trim());
        if (breakOuterLayerBrackets.length() > 1 && breakOuterLayerBrackets.charAt(0) == '-') {
            boolean z2 = false;
            for (int i = 1; i < breakOuterLayerBrackets.length(); i++) {
                char charAt = breakOuterLayerBrackets.charAt(i);
                if (charAt != ' ') {
                    z2 = !Character.isDigit(charAt);
                }
            }
            if (z2) {
                breakOuterLayerBrackets = "0" + breakOuterLayerBrackets;
            }
        }
        String lowerCase = breakOuterLayerBrackets.toLowerCase(Locale.ROOT);
        String[] strArr = {"==", "!=", "<=", ">=", "<", ">"};
        String[] strArr2 = {"or", "and", "==", "!=", "<=", ">=", "<", ">", "%", "-", "+", "*", "/", "="};
        int length = strArr2.length;
        for (int i2 = 0; i2 < length; i2++) {
            String str3 = strArr2[i2];
            if (f.c(lowerCase, str3)) {
                boolean z3 = false;
                boolean z4 = false;
                if (str3.equals("and") || str3.equals("or")) {
                    z3 = true;
                    z4 = true;
                }
                if (str3.equals("<>")) {
                    int a4 = al.a(breakOuterLayerBrackets, 0, strArr);
                    a2 = new ArrayList();
                    a2.add(breakOuterLayerBrackets.substring(0, a4));
                    int i3 = a4 + 2;
                    if (i3 > breakOuterLayerBrackets.length() - 1) {
                        i3 = breakOuterLayerBrackets.length() - 1;
                    }
                    String substring = breakOuterLayerBrackets.substring(a4, i3);
                    if (!substring.endsWith("=")) {
                        substring = substring.substring(0, 1);
                    }
                    a2.add(breakOuterLayerBrackets.substring(a4 + substring.length()));
                    str3 = substring;
                } else if (z4) {
                    a2 = al.a(breakOuterLayerBrackets, str3, z3, true);
                } else {
                    a2 = al.a(breakOuterLayerBrackets, str3, z3, false);
                }
                if (a2.size() == 1) {
                    continue;
                } else if (str3.equals("=")) {
                    throw new RuntimeException("Unexpected assignment operator: '=', use '==' for comparison");
                } else {
                    if (!((String) a2.get(0)).equals(VariableScope.nullOrMissingString) || a2.size() != 2 || (!str3.equals("+") && !str3.equals("-"))) {
                        ArrayList arrayList = new ArrayList();
                        LogicBoolean.JoinerBoolean newJoiner = LogicBoolean.JoinerBoolean.getNewJoiner(str3);
                        boolean requireBooleanChildren = newJoiner.requireBooleanChildren();
                        if (requireBooleanChildren && ((newJoiner instanceof CompareJoinerBoolean.CompareNotEqualBoolean) || (newJoiner instanceof CompareJoinerBoolean.CompareEqualBoolean))) {
                            GameEngine.m328e(newJoiner.type() + " was set to require boolean. Workaround triggered. requireBooleanChildren:" + newJoiner.requireBooleanChildren());
                            requireBooleanChildren = false;
                        }
                        int i4 = -1;
                        if (str3.equals("+") || str3.equals("-")) {
                            boolean z5 = false;
                            Iterator it = a2.iterator();
                            while (true) {
                                if (it.hasNext()) {
                                    if (isEmptyIgnoringPlusMinus((String) it.next())) {
                                        z5 = true;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (z5) {
                                ArrayList arrayList2 = new ArrayList();
                                String str4 = VariableScope.nullOrMissingString;
                                Iterator it2 = a2.iterator();
                                while (it2.hasNext()) {
                                    String str5 = (String) it2.next();
                                    if (isEmptyIgnoringPlusMinus(str5)) {
                                        str4 = str4 + str5 + str3;
                                    } else {
                                        if (!str4.equals(VariableScope.nullOrMissingString)) {
                                            str5 = str4 + str5;
                                            str4 = VariableScope.nullOrMissingString;
                                        }
                                        arrayList2.add(str5);
                                    }
                                }
                                if (!str4.equals(VariableScope.nullOrMissingString)) {
                                    throw new RuntimeException("Unexpected empty last element using: " + str3);
                                }
                                a2 = arrayList2;
                            }
                        }
                        if (a2.size() != 1) {
                            Iterator it3 = a2.iterator();
                            while (it3.hasNext()) {
                                String str6 = (String) it3.next();
                                i4++;
                                if (str6.equals(VariableScope.nullOrMissingString)) {
                                    if (i4 == 0) {
                                        throw new RuntimeException("Unexpected empty element before: " + str3);
                                    }
                                    throw new RuntimeException("Unexpected empty element after: " + str3);
                                }
                                try {
                                    LogicBoolean parseBooleanBlock = parseBooleanBlock(lVar, str6, requireBooleanChildren);
                                    if (parseBooleanBlock == null) {
                                        throw new RuntimeException("null on:'" + breakOuterLayerBrackets + "'");
                                    }
                                    arrayList.add(parseBooleanBlock);
                                } catch (BooleanParseException e) {
                                    throw e;
                                }
                            }
                            newJoiner.children = (LogicBoolean[]) arrayList.toArray(new LogicBoolean[0]);
                            return newJoiner.validateAndOptimize(str3, VariableScope.nullOrMissingString, breakOuterLayerBrackets, null, z);
                        }
                    }
                }
            }
        }
        if (lowerCase.startsWith("not ")) {
            String substring2 = breakOuterLayerBrackets.substring("not ".length());
            return new LogicBoolean.NotBoolean(parseBooleanBlock(lVar, substring2, true)).validateAndOptimize("not", VariableScope.nullOrMissingString, substring2, null, z);
        }
        if (breakOuterLayerBrackets.length() > 0) {
            String str7 = breakOuterLayerBrackets;
            if (str7.startsWith("+")) {
                str7 = str7.substring(1).trim();
            }
            String c = al.c(str7);
            if (f.r(c)) {
                if (z) {
                    throw new RuntimeException("Expected a boolean type here, not number: " + c);
                }
                return LogicBoolean.StaticValueBoolean.getStaticNumber(c);
            }
            String p = f.p(breakOuterLayerBrackets);
            if (p != null) {
                if (z) {
                    throw new RuntimeException("Expected a boolean type here, not string: " + breakOuterLayerBrackets);
                }
                return new LogicString.StaticString(p);
            }
        }
        boolean z6 = false;
        boolean z7 = false;
        if (breakOuterLayerBrackets.startsWith("self.")) {
            breakOuterLayerBrackets = breakOuterLayerBrackets.substring("self.".length());
            z6 = true;
        }
        String[] b2 = al.b(breakOuterLayerBrackets, ".", false);
        m mVar = new m();
        LogicBoolean logicBoolean = null;
        String str8 = null;
        LogicBooleanContext logicBooleanContext = defaultContextReader;
        String str9 = null;
        int i5 = 0;
        while (i5 < b2.length) {
            if (str9 != null) {
                str2 = str9;
                str9 = null;
            } else {
                str2 = b2[i5];
            }
            if (f.b(str2, '[') && (b = al.b(str2, "[", 0)) != -1) {
                if (b == 0) {
                    int b3 = al.b(str2, "]", 0);
                    if (b3 == -1 || b >= b3) {
                        throw new RuntimeException("Unexpected use of square brankets:'" + str2 + "'");
                    }
                    if (b3 < str2.length() - 1 && b3 > 0) {
                        String substring3 = str2.substring(b, b3 + 1);
                        str9 = str2.substring(b3 + 1);
                        i5--;
                        str2 = substring3;
                    }
                    if (b != 0 || b3 != str2.length() - 1 || str2.length() < 2) {
                        throw new RuntimeException("Error reading square brankets:'" + str2 + "'");
                    }
                    str2 = "get(" + str2.substring(1, str2.length() - 1) + ")";
                } else {
                    String substring4 = str2.substring(0, b);
                    str9 = str2.substring(b);
                    i5--;
                    str2 = substring4;
                }
            }
            if (str2.equalsIgnoreCase("self")) {
                if (z7) {
                    throw new RuntimeException("No field:'" + str2 + "' globals");
                }
                if (b2.length == 1) {
                    return UnitReference.selfUnitReference;
                }
                z6 = true;
            } else if (i5 == 0 && str2.equalsIgnoreCase("game")) {
                z7 = true;
            } else {
                boolean z8 = i5 == b2.length - 1;
                String str10 = null;
                if (z6) {
                    str10 = "self.";
                }
                if (z7) {
                    str10 = "game.";
                }
                boolean z9 = z;
                if (!z8) {
                    z9 = false;
                }
                if (logicBoolean != null) {
                    logicBooleanContext = logicBoolean.createContext();
                }
                LogicBoolean parseNextElementInChain = logicBooleanContext.parseNextElementInChain(str10, lVar, str2, z9, breakOuterLayerBrackets, str8, logicBoolean);
                if (parseNextElementInChain == null) {
                    throw new RuntimeException("Null function or field:'" + str2 + "'");
                }
                logicBoolean = parseNextElementInChain;
                str8 = str2;
                z6 = true;
                mVar.add(parseNextElementInChain);
            }
            i5++;
        }
        if (mVar.size() == 0) {
            throw new RuntimeException("Unknown function:'" + breakOuterLayerBrackets + "'");
        }
        LogicBoolean logicBoolean2 = null;
        for (int i6 = mVar.f689a - 1; i6 >= 0; i6--) {
            LogicBoolean logicBoolean3 = (LogicBoolean) mVar.get(i6);
            if (logicBoolean2 != null) {
                logicBoolean3 = logicBoolean3.setChild(logicBoolean2);
            }
            logicBoolean2 = logicBoolean3;
        }
        LogicBoolean.ReturnType returnType = logicBoolean2.getReturnType();
        if (returnType == LogicBoolean.ReturnType.voidReturn) {
            logicBoolean2.throwVoidReturnError(breakOuterLayerBrackets);
            throw new RuntimeException("throwVoidReturnError");
        } else if (z && returnType != LogicBoolean.ReturnType.bool) {
            throw new BooleanParseException("Function:'" + breakOuterLayerBrackets + "' is expected to return a boolean type but it returns type: " + returnType);
        } else {
            return logicBoolean2;
        }
    }

    public static String fixArguments(String str) {
        String trim = str.trim();
        if (trim.equals(VariableScope.nullOrMissingString)) {
            return VariableScope.nullOrMissingString;
        }
        if (trim.startsWith("(") && trim.endsWith(")")) {
            return trim.substring(1, trim.length() - 1).trim();
        }
        throw new RuntimeException("Failed to parse function arguments:'" + trim + "'");
    }

    public static Matcher match(Pattern pattern, String str) {
        Matcher matcher = pattern.matcher(str);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public static void setArgumentsWithMapping(ParameterMapping parameterMapping, Object obj, String str, l lVar, String str2) {
        String str3;
        String str4;
        if (str2 == null) {
            str2 = obj.getClass().getSimpleName();
        }
        ArrayList arrayList = new ArrayList();
        if (str != null && !VariableScope.nullOrMissingString.equals(str)) {
            int i = 0;
            boolean z = false;
            Iterator it = al.a(str, ",", false).iterator();
            while (it.hasNext()) {
                String str5 = (String) it.next();
                int a2 = al.a(str5, "=");
                if (a2 > 0) {
                    str3 = str5.substring(0, a2);
                    str4 = str5.substring(a2 + 1);
                    z = true;
                } else if (z) {
                    throw new BooleanParseException(str2 + "(): SyntaxError: Cannot use non-keyword arg after keyword arg");
                } else {
                    if (parameterMapping.numberOfPositionalParameters == 0) {
                        throw new BooleanParseException(str2 + "(): Function doesn't accept any non-keyword arguments.");
                    }
                    if (parameterMapping.numberOfPositionalParameters <= i) {
                        throw new BooleanParseException(str2 + "(): Too many non-keyword arguments. Only " + parameterMapping.numberOfPositionalParameters + " accepted.");
                    }
                    str3 = null;
                    Iterator it2 = parameterMapping.parameters.keySet().iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        String str6 = (String) it2.next();
                        if (((ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str6)).positionalOffset == i) {
                            str3 = str6;
                            break;
                        }
                    }
                    if (str3 == null) {
                        throw new BooleanParseException("Error failed to find non-keyword argument index: " + i);
                    }
                    str4 = str5;
                }
                String str7 = str3;
                String lowerCase = str3.trim().toLowerCase(Locale.ROOT);
                if (arrayList.contains(lowerCase)) {
                    throw new BooleanParseException("SyntaxError: Argument '" + str7 + "' has been listed more than once");
                }
                arrayList.add(lowerCase);
                try {
                    setArgumentWithMapping(parameterMapping, obj, lowerCase, str4, lVar);
                    i++;
                } catch (BooleanParseException e) {
                    throw e;
                }
            }
        }
        for (String str8 : parameterMapping.parameters.keySet()) {
            if (((ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str8)).required && !arrayList.contains(str8)) {
                throw new BooleanParseException(str2 + "(): SyntaxError: Missing required argument: '" + str8 + "'");
            }
        }
    }

    public static Object getArgumentTextWithMapping(ParameterMapping.FieldOrMethod fieldOrMethod, Object obj) {
        if (fieldOrMethod != null && fieldOrMethod.field != null) {
            try {
                Object obj2 = fieldOrMethod.field.get(obj);
                if (obj2 == null) {
                    return null;
                }
                return obj2;
            } catch (IllegalAccessException e) {
                e.printStackTrace();
                return "<error>";
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                return "<error>";
            }
        } else if (fieldOrMethod != null && fieldOrMethod.method != null) {
            GameEngine.m328e("getArgumentTextWithMapping: method not supported");
            return "<method>";
        } else {
            GameEngine.m328e("getArgumentTextWithMapping: No method or field");
            return "<error>";
        }
    }

    public static void setArgumentWithMapping(ParameterMapping parameterMapping, Object obj, String str, String str2, l lVar) {
        String message;
        String message2;
        ParameterMapping.FieldOrMethod fieldOrMethod = (ParameterMapping.FieldOrMethod) parameterMapping.parameters.get(str);
        if (fieldOrMethod != null && fieldOrMethod.field != null) {
            Object convertParameterData = convertParameterData(str2, fieldOrMethod.type, lVar, fieldOrMethod.returnType, str);
            if (convertParameterData == null && fieldOrMethod.required) {
                throw new BooleanParseException("SyntaxError: Cannot set required argument: '" + str + "' to null");
            }
            try {
                fieldOrMethod.field.set(obj, convertParameterData);
            } catch (IllegalAccessException e) {
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e);
            } catch (IllegalArgumentException e2) {
                e2.printStackTrace();
                if (e2.getMessage() == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e2);
                }
                throw new BooleanParseException("Error parameter:'" + str + "': " + message2.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", VariableScope.nullOrMissingString).replace("java.lang.", VariableScope.nullOrMissingString));
            }
        } else if (fieldOrMethod != null && fieldOrMethod.method != null) {
            try {
                fieldOrMethod.method.invoke(obj, convertParameterData(str2, fieldOrMethod.type, lVar, fieldOrMethod.returnType, str));
            } catch (IllegalAccessException e3) {
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e3);
            } catch (IllegalArgumentException e4) {
                e4.printStackTrace();
                if (e4.getMessage() == null) {
                    throw new BooleanParseException("Error parameter:'" + str + "' on " + obj.getClass().getSimpleName(), e4);
                }
                throw new BooleanParseException("Error setting parameter:'" + str + "': " + message.replace("com.corrodinggames.rts.game.units.custom.logicBooleans.", VariableScope.nullOrMissingString).replace("java.lang.", VariableScope.nullOrMissingString));
            } catch (InvocationTargetException e5) {
                Throwable cause = e5.getCause();
                String str3 = VariableScope.nullOrMissingString;
                if (cause != null) {
                    str3 = " - " + cause.getMessage();
                }
                throw new BooleanParseException("Error setting parameter:'" + str + "' on " + obj.getClass().getSimpleName() + str3, e5);
            }
        } else {
            throw new BooleanParseException("No parameter:'" + str + "' on " + obj.getClass().getSimpleName() + " (Possible parameters:" + parameterMapping.allParametersString + ")");
        }
    }

    public static List getAllFieldsInherited(List list, Class cls) {
        list.addAll(Arrays.asList(cls.getFields()));
        return list;
    }

    public static Object convertParameterData(String str, Class cls, l lVar, LogicBoolean.ReturnType returnType, String str2) {
        LogicBoolean.ReturnType returnType2;
        if (str == null) {
            return null;
        }
        String trim = str.trim();
        if (trim.length() == 0 || trim.equals("null")) {
            return null;
        }
        if (cls == LogicBoolean.class) {
            LogicBoolean parseBooleanBlock = parseBooleanBlock(lVar, trim, false);
            if (parseBooleanBlock != null && returnType != null && returnType != (returnType2 = parseBooleanBlock.getReturnType())) {
                throw new BooleanParseException("Wrong type. Expected type: '" + returnType + "' for dynamic parameter '" + str2 + "' instead got type:'" + returnType2 + "' (parsing: " + trim + ")");
            }
            return parseBooleanBlock;
        } else if (f.s(trim)) {
            if (!f.c(trim, ".")) {
                if (cls == String.class) {
                    return trim;
                }
                return Integer.valueOf(Integer.parseInt(trim));
            } else if (cls == String.class) {
                return trim;
            } else {
                return Float.valueOf(Float.parseFloat(trim));
            }
        } else {
            String lowerCase = trim.toLowerCase(Locale.ENGLISH);
            if ("false".equals(lowerCase)) {
                return Boolean.FALSE;
            }
            if ("true".equals(lowerCase)) {
                return Boolean.TRUE;
            }
            Matcher match = match(patternSingleQuote, trim);
            if (match != null) {
                return f.q(match.group(1));
            }
            Matcher match2 = match(patternDoubleQuote, trim);
            if (match2 != null) {
                return f.q(match2.group(1));
            }
            Matcher match3 = match(patternInteger, trim);
            if (match3 != null) {
                if (cls == String.class) {
                    return match3.group(1);
                }
                return Integer.valueOf(Integer.parseInt(match3.group(1)));
            }
            Matcher match4 = match(patternFloat, trim);
            if (match4 != null) {
                if (cls == String.class) {
                    return match4.group(1);
                }
                return Float.valueOf(Float.parseFloat(match4.group(1)));
            }
            String str3 = "null";
            if (cls != null) {
                str3 = "data of " + cls.getSimpleName();
                if (cls == String.class) {
                    str3 = "string";
                }
                if (cls == Float.TYPE) {
                    str3 = "number";
                }
                if (cls == Integer.TYPE) {
                    str3 = "integer";
                }
                if (cls == Boolean.TYPE) {
                    str3 = "boolean";
                }
            }
            String str4 = "Failed to read parameter '" + str2 + "' expected non-dynamic " + str3 + " got: " + trim + VariableScope.nullOrMissingString;
            if (cls == String.class) {
                str4 = str4 + " (A quoted string was expected)";
            }
            throw new BooleanParseException(str4);
        }
    }

    public static String breakOuterLayerBrackets(String str) {
        if (str.startsWith("(") && str.endsWith(")")) {
            int a2 = al.a(str, 0);
            if (a2 == -1) {
                throw new RuntimeException("Brackets unbalanced. Starting '(' in '" + str + "' was not closed.");
            }
            if (a2 == str.length() - 1) {
                str = breakOuterLayerBrackets(str.substring(1, str.length() - 1).trim());
            }
        }
        return str;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanScopeOnly.class */
    public abstract class LogicBooleanScopeOnly extends LogicBoolean implements LogicBooleanContext {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanContext createContext() {
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return logicBoolean;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            return LogicBoolean.ReturnType.voidReturn;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "<scope>";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$LogicBooleanContextWithDefault.class */
    public abstract class LogicBooleanContextWithDefault implements LogicBooleanContext {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            return defaultParseNextElementInChain(this, str, lVar, str2, z, str3, str4, logicBoolean, LogicBoolean.booleans);
        }

        public static LogicBoolean defaultParseNextElementInChain(LogicBooleanContext logicBooleanContext, String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean, HashMap hashMap) {
            String lowerCase;
            String substring;
            UnitReference parseSingleUnitReferenceElement = UnitReference.parseSingleUnitReferenceElement(lVar, str2);
            if (parseSingleUnitReferenceElement != null) {
                return parseSingleUnitReferenceElement;
            }
            int indexOf = str2.indexOf("(");
            if (indexOf == -1) {
                lowerCase = str2.toLowerCase(Locale.ROOT);
                substring = VariableScope.nullOrMissingString;
            } else {
                lowerCase = str2.substring(0, indexOf).trim().toLowerCase(Locale.ROOT);
                substring = str2.substring(indexOf);
            }
            if (str != null) {
                lowerCase = str + lowerCase;
            }
            LogicBoolean logicBoolean2 = (LogicBoolean) hashMap.get(lowerCase);
            if (logicBoolean2 != null) {
                String fixArguments = LogicBooleanLoader.fixArguments(substring);
                return logicBoolean2.with(lVar, fixArguments, lowerCase).validateAndOptimize(lowerCase, fixArguments, str3, logicBooleanContext, z);
            }
            String str5 = VariableScope.nullOrMissingString;
            if (hashMap != null && hashMap.size() < 8 && hashMap.size() > 0) {
                String str6 = " (Allowed functions: ";
                boolean z2 = true;
                for (String str7 : hashMap.keySet()) {
                    if (!z2) {
                        str6 = str6 + ", ";
                    }
                    z2 = false;
                    str6 = str6 + str7;
                }
                str5 = str6 + ")";
            }
            if (str4 != null) {
                throw new RuntimeException("Unknown function or field:'" + str2 + "' in '" + str4 + "'" + str5);
            }
            throw new RuntimeException("Unknown function or field:'" + str2 + "'" + str5);
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$VoidContextReader.class */
    public final class VoidContextReader extends LogicBooleanContextWithDefault {
        String debugType;

        VoidContextReader(String str) {
            this.debugType = str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContextWithDefault, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            if (str4 != null) {
                if (this.debugType != null) {
                    throw new RuntimeException("No field:'" + str2 + "' in '" + str4 + "' (" + this.debugType + ")");
                }
                throw new RuntimeException("No field:'" + str2 + "' in '" + str4 + "'");
            }
            throw new RuntimeException("No field:'" + str2 + "'");
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader.class */
    public final class ArrayContextReader extends LogicBooleanContextWithDefault {
        LogicBoolean.ReturnType arrayType;
        static HashMap arrayFunctions = new HashMap();
        static HashMap arrayFunctionsUnit;

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader$ArrayFunction.class */
        public abstract class ArrayFunction extends LogicBoolean {
            public abstract void setArrayTarget(LogicBoolean logicBoolean);
        }

        public ArrayContextReader(LogicBoolean.ReturnType returnType) {
            this.arrayType = returnType;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader$ArrayGetUnit.class */
        public class ArrayGetUnit extends ArrayGet {
            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.ArrayContextReader.ArrayGet, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBooleanContext createContext() {
                return UnitReference.unitContextChangingContext;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBoolean setChild(LogicBoolean logicBoolean) {
                return UnitReference.UnitContextChangingBooleanByLogic.create(this, logicBoolean);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.ArrayContextReader.ArrayGet, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBoolean.ReturnType getReturnType() {
                return LogicBoolean.ReturnType.unit;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader$ArrayGet.class */
        public class ArrayGet extends ArrayFunction {
            @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number)
            public LogicBoolean index;
            LogicBoolean targetArray;
            public LogicBoolean.ReturnType elementType;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBooleanContext createContext() {
                return LogicBooleanLoader.voidArrayContextReader;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.ArrayContextReader.ArrayFunction
            public void setArrayTarget(LogicBoolean logicBoolean) {
                this.targetArray = logicBoolean;
                this.elementType = LogicBoolean.ReturnType.getArrayBaseType(logicBoolean.getReturnType());
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public void setArgumentsRaw(String str, l lVar, String str2) {
                if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                    validateNumberOfArguments(0);
                    return;
                }
                ArrayList a2 = al.a(str, ",", false);
                validateNumberOfArguments(a2.size());
                this.index = LogicBooleanLoader.parseNumberBlock(lVar, (String) a2.get(0));
                if (this.index == null) {
                    throw new BooleanParseException("Expected non-null argument");
                }
            }

            public void validateNumberOfArguments(int i) {
                if (i != 1) {
                    throw new BooleanParseException("Expected 1 argument");
                }
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public void validate(String str, String str2, String str3, LogicBooleanContext logicBooleanContext, boolean z) {
                super.validate(str, str2, str3, logicBooleanContext, z);
                if (this.index == null) {
                    throw new BooleanParseException("No array index");
                }
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBoolean.ReturnType getReturnType() {
                return this.elementType;
            }

            LogicBoolean readElement(y yVar) {
                int readNumber = (int) this.index.readNumber(yVar);
                if (this.targetArray == null) {
                    GameEngine.print("ArrayGet readElement targetArray==null");
                    return null;
                }
                return this.targetArray.readArrayElement(yVar, readNumber);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public boolean read(y yVar) {
                LogicBoolean readElement = readElement(yVar);
                if (readElement == null) {
                    return false;
                }
                return readElement.read(yVar);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public float readNumber(y yVar) {
                LogicBoolean readElement = readElement(yVar);
                if (readElement == null) {
                    return 0.0f;
                }
                return readElement.readNumber(yVar);
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public am readUnit(y yVar) {
                LogicBoolean readElement = readElement(yVar);
                if (readElement == null) {
                    return null;
                }
                return readElement.readUnit(yVar);
            }

            public String getName() {
                return "get";
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public String getMatchFailReasonForPlayer(y yVar) {
                String str;
                LogicBoolean readElement = readElement(yVar);
                int readNumber = (int) this.index.readNumber(yVar);
                String str2 = VariableScope.nullOrMissingString;
                if (this.targetArray != null) {
                    str2 = str2 + this.targetArray.getMatchFailReasonForPlayer(yVar);
                }
                String str3 = str2 + "." + getName() + "(" + readNumber + ")";
                if (readElement == null) {
                    str = str3 + "=null";
                } else {
                    str = str3 + "=" + readElement.getMatchFailReasonForPlayer(yVar);
                }
                return str;
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader$ArraySize.class */
        public class ArraySize extends ArrayFunction {
            LogicBoolean targetArray;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.ArrayContextReader.ArrayFunction
            public void setArrayTarget(LogicBoolean logicBoolean) {
                this.targetArray = logicBoolean;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBoolean.ReturnType getReturnType() {
                return LogicBoolean.ReturnType.number;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public boolean read(y yVar) {
                return false;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public float readNumber(y yVar) {
                return this.targetArray.getArraySize(yVar);
            }

            public String getName() {
                return "size";
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public String getMatchFailReasonForPlayer(y yVar) {
                String str = VariableScope.nullOrMissingString;
                if (this.targetArray != null) {
                    str = str + this.targetArray.getMatchFailReasonForPlayer(yVar);
                }
                return str + getName() + "(=" + readNumber(yVar) + ")";
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanLoader$ArrayContextReader$ArrayContains.class */
        public class ArrayContains extends ArrayFunction {
            public LogicBoolean value;
            LogicBoolean targetArray;
            public LogicBoolean.ReturnType elementType;

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBooleanContext createContext() {
                return LogicBooleanLoader.voidNumberContextReader;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.ArrayContextReader.ArrayFunction
            public void setArrayTarget(LogicBoolean logicBoolean) {
                this.targetArray = logicBoolean;
                this.elementType = LogicBoolean.ReturnType.getArrayBaseType(logicBoolean.getReturnType());
                if (this.value.getReturnType() != this.elementType) {
                    throw new BooleanParseException("Expected value of type: " + this.elementType + " (got:" + this.value.getReturnType() + ")");
                }
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public void setArgumentsRaw(String str, l lVar, String str2) {
                if (str == null || VariableScope.nullOrMissingString.equals(str)) {
                    validateNumberOfArguments(0);
                    return;
                }
                ArrayList a2 = al.a(str, ",", false);
                validateNumberOfArguments(a2.size());
                this.value = LogicBooleanLoader.parseBooleanBlock(lVar, (String) a2.get(0), false);
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
            public void validate(String str, String str2, String str3, LogicBooleanContext logicBooleanContext, boolean z) {
                super.validate(str, str2, str3, logicBooleanContext, z);
                if (this.value == null) {
                    throw new BooleanParseException("No value");
                }
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public LogicBoolean.ReturnType getReturnType() {
                return LogicBoolean.ReturnType.bool;
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public boolean read(y yVar) {
                return indexOf(yVar, this.targetArray, this.value) != -1;
            }

            public static final int indexOf(y yVar, LogicBoolean logicBoolean, LogicBoolean logicBoolean2) {
                int arraySize = logicBoolean.getArraySize(yVar);
                LogicBoolean.ReturnType returnType = logicBoolean2.getReturnType();
                if (returnType == LogicBoolean.ReturnType.bool) {
                    boolean read = logicBoolean2.read(yVar);
                    for (int i = 0; i < arraySize; i++) {
                        if (logicBoolean.readArrayElement(yVar, i).read(yVar) == read) {
                            return i;
                        }
                    }
                    return -1;
                } else if (returnType == LogicBoolean.ReturnType.number) {
                    float readNumber = logicBoolean2.readNumber(yVar);
                    for (int i2 = 0; i2 < arraySize; i2++) {
                        if (f.j(readNumber, logicBoolean.readArrayElement(yVar, i2).readNumber(yVar))) {
                            return i2;
                        }
                    }
                    return -1;
                } else if (returnType == LogicBoolean.ReturnType.unit) {
                    am readUnit = logicBoolean2.readUnit(yVar);
                    if (VariableScope.isMarker(readUnit)) {
                        if (readUnit == null) {
                            return -1;
                        }
                        float f = readUnit.eo;
                        float f2 = readUnit.ep;
                        int i3 = readUnit.bX.k;
                        for (int i4 = 0; i4 < arraySize; i4++) {
                            am readUnit2 = logicBoolean.readArrayElement(yVar, i4).readUnit(yVar);
                            if (readUnit2 != null && f.j(f, readUnit2.eo) && f.j(f2, readUnit2.ep) && i3 == readUnit2.bX.k) {
                                return i4;
                            }
                        }
                        return -1;
                    }
                    for (int i5 = 0; i5 < arraySize; i5++) {
                        if (readUnit == logicBoolean.readArrayElement(yVar, i5).readUnit(yVar)) {
                            return i5;
                        }
                    }
                    return -1;
                } else {
                    return -1;
                }
            }

            public String getName() {
                return "contains";
            }

            @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
            public String getMatchFailReasonForPlayer(y yVar) {
                String str = VariableScope.nullOrMissingString;
                if (this.targetArray != null) {
                    str = str + this.targetArray.getMatchFailReasonForPlayer(yVar);
                }
                String str2 = null;
                if (0 != 0) {
                    str2 = this.value.getMatchFailReasonForPlayer(yVar);
                }
                return (str + "." + getName() + "(" + str2 + ")") + "=" + valueToStringDebug(yVar);
            }
        }

        public static void addContextFunction(HashMap hashMap, LogicBoolean logicBoolean, String... strArr) {
            for (String str : strArr) {
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (hashMap.get(lowerCase) != null) {
                    throw new RuntimeException("logicBoolean: " + lowerCase + " already exists");
                }
                hashMap.put(lowerCase, logicBoolean);
            }
        }

        static {
            addContextFunction(arrayFunctions, new ArrayGet(), "get");
            addContextFunction(arrayFunctions, new ArraySize(), "size");
            addContextFunction(arrayFunctions, new ArraySize(), "length");
            addContextFunction(arrayFunctions, new ArrayContains(), "contains");
            arrayFunctionsUnit = new HashMap();
            addContextFunction(arrayFunctionsUnit, new ArrayGetUnit(), "get");
            addContextFunction(arrayFunctionsUnit, new ArraySize(), "size");
            addContextFunction(arrayFunctionsUnit, new ArraySize(), "length");
            addContextFunction(arrayFunctionsUnit, new ArrayContains(), "contains");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContextWithDefault, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            LogicBoolean defaultParseNextElementInChain;
            if (this.arrayType == LogicBoolean.ReturnType.unitArray) {
                defaultParseNextElementInChain = defaultParseNextElementInChain(this, null, lVar, str2, z, str3, str4, logicBoolean, arrayFunctionsUnit);
            } else {
                defaultParseNextElementInChain = defaultParseNextElementInChain(this, null, lVar, str2, z, str3, str4, logicBoolean, arrayFunctions);
            }
            if (defaultParseNextElementInChain == null) {
                return null;
            }
            if (!(defaultParseNextElementInChain instanceof ArrayFunction)) {
                throw new RuntimeException("Expected array function.");
            }
            ArrayFunction arrayFunction = (ArrayFunction) defaultParseNextElementInChain;
            arrayFunction.setArrayTarget(logicBoolean);
            return arrayFunction;
        }
    }
}