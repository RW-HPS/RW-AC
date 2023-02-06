package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/bl.class */
public class bl {
    ArrayList a = new ArrayList();
    int b;

    public void a(float f) {
        Iterator it = this.a.iterator();
        while (it.hasNext()) {
            ((bm) it.next()).b = f;
        }
    }

    public boolean a() {
        return a(0.0f, 0.0f, 1.0f, true);
    }

    public boolean a(float f, float f2, float f3) {
        return a(f, f2, f3, false);
    }

    public boolean a(float f, float f2, float f3, boolean z) {
        if (this.a.size() == 0) {
            return false;
        }
        if (this.b >= this.a.size()) {
            this.b = 0;
        }
        bm bmVar = (bm) this.a.get(this.b);
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (z) {
            gameEngine.bM.c(bmVar.a, bmVar.b);
        } else {
            gameEngine.bM.a(bmVar.a, bmVar.b, f, f2);
        }
        this.b++;
        return true;
    }

    public static bl a(l lVar, String str) {
        return a(lVar, str, (bl) null);
    }

    public static bl a(l lVar, String str, bl blVar) {
        if ((str == null || str.equals(VariableScope.nullOrMissingString)) && blVar != null) {
            return blVar;
        }
        return new bl(lVar, str);
    }

    public bl() {
    }

    public bl(l lVar, String str) {
        String[] split;
        if (str == null || str.equals(VariableScope.nullOrMissingString) || str.equalsIgnoreCase("NONE")) {
            return;
        }
        for (String str2 : str.split(",")) {
            bm bmVar = new bm(this);
            String trim = str2.trim();
            String str3 = VariableScope.nullOrMissingString;
            if (trim.startsWith("ROOT:")) {
                trim = trim.substring("ROOT:".length());
                str3 = str3 + "ROOT:";
            }
            if (trim.startsWith("SHARED:")) {
                trim = trim.substring("SHARED:".length());
                str3 = str3 + "SHARED:";
            }
            String[] split2 = trim.split(":");
            String str4 = null;
            String trim2 = split2[0].trim();
            if (split2.length != 1) {
                if (split2.length == 2) {
                    str4 = split2[1].trim();
                } else {
                    throw new RuntimeException("Unknown sound format:" + trim);
                }
            }
            if (str4 != null) {
                try {
                    bmVar.b = Float.parseFloat(str4);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Failed to parse volume float: '" + str4 + "' of sound: '" + trim + "'");
                }
            }
            bmVar.a = ag.a(lVar.F, str3 + trim2, lVar);
            if (bmVar.a != null) {
                this.a.add(bmVar);
            }
        }
    }
}