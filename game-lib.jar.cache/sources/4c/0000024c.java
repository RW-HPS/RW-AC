package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.game.units.custom.au */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/au.class */
public class C0382au extends VariableScope.CachedWriter.WriterFactory {

    /* renamed from: a */
    C0458l f2276a;

    public C0382au(C0458l c0458l) {
        this.f2276a = c0458l;
    }

    @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.CachedWriter.WriterFactory
    public VariableScope.CachedWriter.WriterElement createWriterElement(String str, String str2, String str3, String str4) {
        if (!str2.equals("=") && !str2.equals("+=") && !str2.equals("-=")) {
            throw new C0417bo("Only '=','+=','-='  is supported here, got:" + str2);
        }
        if (str3 == null) {
            throw new C0417bo("Expected a value for: " + str + " (likely missing '=')");
        }
        VariableScope.CachedWriter.Operator operator = VariableScope.CachedWriter.Operator.set;
        if (str2.equals("+=")) {
            operator = VariableScope.CachedWriter.Operator.add;
        }
        if (str2.equals("-=")) {
            operator = VariableScope.CachedWriter.Operator.subtract;
        }
        try {
            LogicBoolean parseBooleanBlock = LogicBooleanLoader.parseBooleanBlock(this.f2276a, str3, false);
            if (str4 != null) {
                throw new RuntimeException("Unexpected array [] index operator on " + str);
            }
            AbstractC0381at abstractC0381at = (AbstractC0381at) C0361as.f2272s.get(str);
            if (abstractC0381at == null) {
                abstractC0381at = (AbstractC0381at) C0361as.f2272s.get("core." + str);
            }
            if (abstractC0381at == null) {
                throw new C0417bo("Unknown key: " + str + VariableScope.nullOrMissingString);
            }
            C0383av c0383av = new C0383av();
            c0383av.f2277a = abstractC0381at;
            c0383av.f2278b = parseBooleanBlock;
            c0383av.f2279c = operator;
            if (parseBooleanBlock.getReturnType() != abstractC0381at.m3967a()) {
                throw new C0417bo("Field: " + str + " expects " + abstractC0381at.m3967a() + " type getting: " + parseBooleanBlock.getReturnType() + " from: " + str3);
            }
            return c0383av;
        } catch (RuntimeException e) {
            throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str3 + "']", e);
        }
    }
}