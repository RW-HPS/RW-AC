package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/au.class */
public class au extends VariableScope.CachedWriter.WriterFactory {
    l a;

    public au(l lVar) {
        this.a = lVar;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
    public VariableScope.CachedWriter.WriterElement createWriterElement(String str, String str2, String str3, String str4) {
        if (!str2.equals("=") && !str2.equals("+=") && !str2.equals("-=")) {
            throw new bo("Only '=','+=','-='  is supported here, got:" + str2);
        }
        if (str3 == null) {
            throw new bo("Expected a value for: " + str + " (likely missing '=')");
        }
        VariableScope.CachedWriter.Operator operator = VariableScope.CachedWriter.Operator.set;
        if (str2.equals("+=")) {
            operator = VariableScope.CachedWriter.Operator.add;
        }
        if (str2.equals("-=")) {
            operator = VariableScope.CachedWriter.Operator.subtract;
        }
        try {
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.a, str3, false);
            if (str4 != null) {
                throw new RuntimeException("Unexpected array [] index operator on " + str);
            }
            at atVar = (at) as.s.get(str);
            if (atVar == null) {
                atVar = (at) as.s.get("core." + str);
            }
            if (atVar == null) {
                throw new bo("Unknown key: " + str + VariableScope.nullOrMissingString);
            }
            av avVar = new av();
            avVar.a = atVar;
            avVar.b = parseBooleanBlock;
            avVar.c = operator;
            if (parseBooleanBlock.getReturnType() != atVar.a()) {
                throw new bo("Field: " + str + " expects " + atVar.a() + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
            }
            return avVar;
        } catch (RuntimeException e) {
            throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
        }
    }
}