package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/y.class */
class ListOperate_AddRoom implements Runnable {
    ListOperate_AddRoom() {
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        long V = GameEngine.V();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("StartCreateOnMasterServer", "Starting create");
        try {
            try {
                ArrayList arrayList = new ArrayList(2);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "add");
                String str = "u_" + f.b();
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "user_id", str);
                APIEncryption.a.a(str, arrayList);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_name", "Unnamed");
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version", Integer.toString(gameEngine.c(true)));
                if (gameEngine.netEngine.v) {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", "ANY");
                } else {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", gameEngine.v());
                }
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_beta", f.a(gameEngine.n()));
                String au = gameEngine.netEngine.au();
                if (au != null) {
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_mods", au);
                }
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.aR);
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token_2", f.b(f.b(gameEngine.netEngine.aR)));
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "confirm", f.b("a" + f.b(gameEngine.netEngine.aR)));
                GameNetAPIOperate.b(arrayList);
                BufferedReader a = GameNetAPIOperate.a(arrayList, 15);
                String readLine = a.readLine();
                if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                    GameEngine.b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                    GameEngine.b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
                    return;
                }
                String[] split = a.readLine().split(",");
                if (split.length < 1) {
                    GameEngine.b("StartCreateOnMasterServer", "columns.length too short at:" + split.length);
                }
                String str2 = split[0];
                try {
                    GameEngine.b("StartCreateOnMasterServer", "Created server is:" + str2);
                    gameEngine.netEngine.aS = str2;
                } catch (NumberFormatException e) {
                    GameEngine.b("StartCreateOnMasterServer", "failed to load server");
                    e.printStackTrace();
                }
                if (split.length >= 2) {
                    try {
                        APIEncryption.f = Integer.parseInt(split[1]);
                    } catch (NumberFormatException e2) {
                        APIEncryption.f = -1;
                    }
                }
                GameEngine.b("StartCreateOnMasterServer", "Completed create from master server without error");
                GameEngine.b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
            } catch (IOException e3) {
                e3.printStackTrace();
                GameEngine.b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.b("StartCreateOnMasterServer", "create took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}