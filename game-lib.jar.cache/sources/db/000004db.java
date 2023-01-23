package com.corrodinggames.rts.gameFramework.f;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.bo;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/e.class */
public class e {

    /* renamed from: a  reason: collision with root package name */
    public String f510a;
    public String b;
    public float c;
    public float d;

    public e(String str, String str2) {
        this.f510a = str;
        this.b = str2;
    }

    public e(String str, float f) {
        this.f510a = str;
        this.c = f;
        this.b = null;
    }

    public static ArrayList a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        bo boVar = null;
        if (gameEngine.bs != null) {
            boVar = gameEngine.bY.a(gameEngine.bs);
        }
        if (boVar != null) {
            if (gameEngine.ce != null && gameEngine.ce.k) {
                arrayList.add(new e("Lasted till wave: " + gameEngine.ce.r, VariableScope.nullOrMissingString));
                if (!gameEngine.ce.l) {
                    arrayList.add(new e("Wave difficulty: " + gameEngine.bX.c(gameEngine.ce.y), VariableScope.nullOrMissingString));
                }
            }
            arrayList.add(new e("Game Time", com.corrodinggames.rts.gameFramework.f.a(gameEngine.by / 1000)));
            arrayList.add(new e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new e("Units Killed", boVar.c));
            arrayList.add(new e("Buildings Killed", boVar.d));
            arrayList.add(new e("Experimentals Killed", boVar.e));
            arrayList.add(new e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new e("Units Lost", boVar.f));
            arrayList.add(new e("Buildings Lost", boVar.g));
            arrayList.add(new e("Experimentals Lost", boVar.h));
            arrayList.add(new e("=============================", VariableScope.nullOrMissingString));
        }
        return arrayList;
    }
}