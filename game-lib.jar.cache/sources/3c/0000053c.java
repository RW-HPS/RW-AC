package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.j.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/p.class */
class RunnableC0918p implements Runnable {
    RunnableC0918p() {
    }

    public void run() {
        GameEngine.m1041aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m1023b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "self_info"));
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "port", Integer.toString(gameEngine.netEngine.port));
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", gameEngine.netEngine.f5745aS);
            APIEncryption.f5932a.m1418b(gameEngine.netEngine.f5745aS, arrayList);
            APIEncryption.f5932a.m1417c(gameEngine.netEngine.f5745aS, arrayList);
            BufferedReader m1288a = GameNetAPIOperate.m1288a(arrayList);
            String readLine = m1288a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1023b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + readLine);
                return;
            }
            while (true) {
                String readLine2 = m1288a.readLine();
                if (readLine2 != null) {
                    String[] split = readLine2.split(",");
                    if (split.length <= 1) {
                        GameEngine.m1023b("GetOwnInfoRunnable", "columns.length too short at:" + split.length);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        try {
                            GameEngine.m1023b("GetOwnInfoRunnable", "got info");
                            gameEngine.netEngine.m1570a(true, str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                        } catch (NumberFormatException e) {
                            GameEngine.m1023b("GetOwnInfoRunnable", "failed to load server");
                            e.printStackTrace();
                        }
                    }
                } else {
                    ActivityC0129p.m4914l();
                    GameEngine.m1023b("GetOwnInfoRunnable", "Completed load from master server without error");
                    return;
                }
            }
        } catch (ClientProtocolException e2) {
            gameEngine.netEngine.m1570a(false, (String) null, (Boolean) null);
            e2.printStackTrace();
        } catch (IOException e3) {
            gameEngine.netEngine.m1570a(false, (String) null, (Boolean) null);
            e3.printStackTrace();
        } catch (Exception e4) {
            gameEngine.netEngine.m1570a(false, (String) null, (Boolean) null);
            GameEngine.m1071a("GetOwnInfoRunnable Failed", e4);
        }
    }
}