package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/z.class */
class ListOperate_RemoveRoom implements Runnable {
    ListOperate_RemoveRoom() {
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("startRemoveOnMasterServer", "Starting remove");
        try {
            ArrayList arrayList = new ArrayList(2);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "remove");
            String str = gameEngine.netEngine.aS;
            if (str == null) {
                GameEngine.b("startRemoveOnMasterServer", "No game id");
                return;
            }
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", str);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.aR);
            BufferedReader a = GameNetAPIOperate.a(arrayList);
            String readLine = a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.b("startRemoveOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            GameEngine.b("startRemoveOnMasterServer", "Remove server response was:" + a.readLine());
            GameEngine.b("startRemoveOnMasterServer", "Completed load from master server without error");
        } catch (IOException e) {
            GameEngine.b("startRemoveOnMasterServer", "Remove failed");
            e.printStackTrace();
        }
    }
}