package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0739bo;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/e.class */
public class C0821e {

    /* renamed from: a */
    public String f5236a;

    /* renamed from: b */
    public String f5237b;

    /* renamed from: c */
    public float f5238c;

    /* renamed from: d */
    public float f5239d;

    public C0821e(String str, String str2) {
        this.f5236a = str;
        this.f5237b = str2;
    }

    public C0821e(String str, float f) {
        this.f5236a = str;
        this.f5238c = f;
        this.f5237b = null;
    }

    /* renamed from: a */
    public static ArrayList m1921a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        C0739bo c0739bo = null;
        if (gameEngine.f6312bs != null) {
            c0739bo = gameEngine.f6336bY.m2465a(gameEngine.f6312bs);
        }
        if (c0739bo != null) {
            if (gameEngine.f6342ce != null && gameEngine.f6342ce.f6881k) {
                arrayList.add(new C0821e("Lasted till wave: " + gameEngine.f6342ce.f6895r, VariableScope.nullOrMissingString));
                if (!gameEngine.f6342ce.f6882l) {
                    arrayList.add(new C0821e("Wave difficulty: " + gameEngine.f6335bX.m1505c(gameEngine.f6342ce.f6902y), VariableScope.nullOrMissingString));
                }
            }
            arrayList.add(new C0821e("Game Time", C0773f.m2206a(gameEngine.f6315by / 1000)));
            arrayList.add(new C0821e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0821e("Units Killed", c0739bo.f4636c));
            arrayList.add(new C0821e("Buildings Killed", c0739bo.f4637d));
            arrayList.add(new C0821e("Experimentals Killed", c0739bo.f4638e));
            arrayList.add(new C0821e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0821e("Units Lost", c0739bo.f4639f));
            arrayList.add(new C0821e("Buildings Lost", c0739bo.f4640g));
            arrayList.add(new C0821e("Experimentals Lost", c0739bo.f4641h));
            arrayList.add(new C0821e("=============================", VariableScope.nullOrMissingString));
        }
        return arrayList;
    }
}