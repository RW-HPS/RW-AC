package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/y.class */
class ListOperate_AddRoom implements Runnable {
    ListOperate_AddRoom() {
    }

    public void run() {
        GameEngine.m1041aq();
        long m1095V = GameEngine.m1095V();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m1023b("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "add");
                String str = "u_" + C0773f.m2193b();
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "user_id", str);
                APIEncryption.f5932a.m1419a(str, arrayList);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_name", "Unnamed");
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version", Integer.toString(gameEngine.mo1014c(true)));
                if (gameEngine.netEngine.f5778v) {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", "ANY");
                } else {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", gameEngine.mo976v());
                }
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_beta", C0773f.m2196a(gameEngine.mo985n()));
                String m1542au = gameEngine.netEngine.m1542au();
                if (m1542au != null) {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_mods", m1542au);
                }
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.f5823aR);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token_2", C0773f.m2175b(C0773f.m2175b(gameEngine.netEngine.f5823aR)));
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "confirm", C0773f.m2175b("a" + C0773f.m2175b(gameEngine.netEngine.f5823aR)));
                GameNetAPIOperate.m1277b(arrayList);
                BufferedReader m1287a = GameNetAPIOperate.m1287a(arrayList, 15);
                String readLine = m1287a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    GameEngine.m1023b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    GameEngine.m1023b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = m1287a.readLine().split(",");
                if (split.length < 1) {
                    GameEngine.m1023b("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    GameEngine.m1023b("StartCreateOnMasterServer", "Created server is:" + str2);
                    gameEngine.netEngine.f5745aS = str2;
                } catch (NumberFormatException e) {
                    GameEngine.m1023b("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        APIEncryption.f5937f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        APIEncryption.f5937f = -1;
                    }
                }
                GameEngine.m1023b("StartCreateOnMasterServer", "Completed create from master server without error");
                GameEngine.m1023b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                GameEngine.m1023b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.m1023b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}