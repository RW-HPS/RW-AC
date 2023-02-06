package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aq.class */
public class APIEncryption {
    public static APIEncryption a = new APIEncryption();
    public static int b = 2;
    static int c = 3;
    static int d = 2;
    static int e = 3;
    public static int f = 4;
    static String g = "tx";
    static String h = "_";
    public static int i = 55;
    public static int j = 66;
    public static int k = 100;
    public static boolean l = true;

    public static float a(float f2, float f3, float f4) {
        return f2 + ((f3 - f2) * f4);
    }

    public void a(String str, List list) {
        long V = GameEngine.V();
        GameNetAPIOperate.listAddBasicNameValuePair(list, h + "1", VariableScope.nullOrMissingString + V);
        GameNetAPIOperate.listAddBasicNameValuePair(list, g + "2", f.d("_" + str + (b + c)));
        GameNetAPIOperate.listAddBasicNameValuePair(list, g + "3", f.d("_" + str + (b + c + V)));
    }

    public void b(String str, List list) {
        GameNetAPIOperate.listAddBasicNameValuePair(list, g + "3", f.d("-" + str + (d + e) + f));
    }

    public void c(String str, List list) {
        if (f > 1000) {
            GameNetAPIOperate.listAddBasicNameValuePair(list, g + "4", f.d("+" + str + (d + e) + f));
        }
    }

    public static void a(PlayerConnect playerConnect) {
        if (playerConnect.N) {
            GameEngine.V();
            if (GameEngine.getGameEngine().tick > -5) {
                playerConnect.O = f.a(0.0f, 0.0f, (float) k, 0.0f) > 10.0f;
            }
        }
    }
}