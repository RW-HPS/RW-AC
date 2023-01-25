package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aq.class */
public class APIEncryption {

    /* renamed from: a */
    public static APIEncryption f5932a = new APIEncryption();

    /* renamed from: b */
    public static int f5933b = 2;

    /* renamed from: c */
    static int f5934c = 3;

    /* renamed from: d */
    static int f5935d = 2;

    /* renamed from: e */
    static int f5936e = 3;

    /* renamed from: f */
    public static int f5937f = 4;

    /* renamed from: g */
    static String f5938g = "tx";

    /* renamed from: h */
    static String f5939h = "_";

    /* renamed from: i */
    public static int f5940i = 55;

    /* renamed from: j */
    public static int f5941j = 66;

    /* renamed from: k */
    public static int f5942k = 100;

    /* renamed from: l */
    public static boolean f5943l = true;

    /* renamed from: a */
    public static float m1408a(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public void m1406a(String str, List list) {
        long m1087V = GameEngine.m1087V();
        GameNetAPIOperate.listAddBasicNameValuePair(list, f5939h + "1", VariableScope.nullOrMissingString + m1087V);
        GameNetAPIOperate.listAddBasicNameValuePair(list, f5938g + "2", C0773f.m2136d("_" + str + (f5933b + f5934c)));
        GameNetAPIOperate.listAddBasicNameValuePair(list, f5938g + "3", C0773f.m2136d("_" + str + (f5933b + f5934c + m1087V)));
    }

    /* renamed from: b */
    public void m1405b(String str, List list) {
        GameNetAPIOperate.listAddBasicNameValuePair(list, f5938g + "3", C0773f.m2136d("-" + str + (f5935d + f5936e) + f5937f));
    }

    /* renamed from: c */
    public void m1404c(String str, List list) {
        if (f5937f > 1000) {
            GameNetAPIOperate.listAddBasicNameValuePair(list, f5938g + "4", C0773f.m2136d("+" + str + (f5935d + f5936e) + f5937f));
        }
    }

    /* renamed from: a */
    public static void m1407a(PlayerConnect playerConnect) {
        if (playerConnect.f6009N) {
            GameEngine.m1087V();
            if (GameEngine.getGameEngine().tick > -5) {
                playerConnect.f6010O = C0773f.m2216a(0.0f, 0.0f, (float) f5942k, 0.0f) > 10.0f;
            }
        }
    }
}