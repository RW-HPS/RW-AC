package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aa */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aa.class */
class ListOperate_UpdateRoom implements Runnable {
    ListOperate_UpdateRoom() {
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            ArrayList arrayList = new ArrayList(2);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "update");
            String str = gameEngine.netEngine.aS;
            if (str == null) {
                GameEngine.b("startUpdateOnMasterServer", "No game id");
                return;
            }
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", str);
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", gameEngine.netEngine.aR);
            if (GameEngine.ax()) {
                GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "check_port", "false");
            }
            GameNetAPIOperate.b(arrayList);
            BufferedReader a = GameNetAPIOperate.a(arrayList);
            String readLine = a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.b("startUpdateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                return;
            }
            String readLine2 = a.readLine();
            if (!"GAME UPDATED".equals(readLine2)) {
                GameEngine.b("startUpdateOnMasterServer", "Update server response was:" + readLine2);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}