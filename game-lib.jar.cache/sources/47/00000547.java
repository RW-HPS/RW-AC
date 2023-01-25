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

    public void run() {
        GameEngine.m1041aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m1023b("startRemoveOnMasterServer", "Starting remove");
        try {
            ArrayList arrayList = new ArrayList(2);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "remove");
            String str = gameEngine.netEngine.f5745aS;
            if (str == null) {
                GameEngine.m1023b("startRemoveOnMasterServer", "No game id");
                return;
            }
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", str);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.f5823aR);
            BufferedReader m1288a = GameNetAPIOperate.m1288a(arrayList);
            String readLine = m1288a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1023b("startRemoveOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            GameEngine.m1023b("startRemoveOnMasterServer", "Remove server response was:" + m1288a.readLine());
            GameEngine.m1023b("startRemoveOnMasterServer", "Completed load from master server without error");
        } catch (IOException e) {
            GameEngine.m1023b("startRemoveOnMasterServer", "Remove failed");
            e.printStackTrace();
        }
    }
}