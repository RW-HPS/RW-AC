package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aa.class */
class RunnableC0863aa implements Runnable {
    RunnableC0863aa() {
    }

    public void run() {
        GameEngine.m1041aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            ArrayList arrayList = new ArrayList(2);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "update");
            String str = gameEngine.netEngine.f5745aS;
            if (str == null) {
                GameEngine.m1023b("startUpdateOnMasterServer", "No game id");
                return;
            }
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", str);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.f5823aR);
            if (GameEngine.m1034ax()) {
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "check_port", "false");
            }
            GameNetAPIOperate.m1277b(arrayList);
            BufferedReader m1288a = GameNetAPIOperate.m1288a(arrayList);
            String readLine = m1288a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1023b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            String readLine2 = m1288a.readLine();
            if (!"GAME UPDATED".equals(readLine2)) {
                GameEngine.m1023b("startUpdateOnMasterServer", "Update server response was:" + readLine2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}