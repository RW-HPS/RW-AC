package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.message.BasicNameValuePair;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.j.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/p.class */
public class p implements Runnable {
    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("GetOwnInfoRunnable", "Starting getOwnInfoFromMasterServer");
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "self_info"));
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "port", Integer.toString(gameEngine.bX.port));
            GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "id", gameEngine.bX.aS);
            APIEncryption.f571a.b(gameEngine.bX.aS, arrayList);
            APIEncryption.f571a.c(gameEngine.bX.aS, arrayList);
            BufferedReader a2 = GameNetAPIOperate.a(arrayList);
            String readLine = a2.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.b("GetOwnInfoRunnable", "Error bad header returned from the master server: " + readLine);
                return;
            }
            while (true) {
                String readLine2 = a2.readLine();
                if (readLine2 != null) {
                    String[] split = readLine2.split(",");
                    if (split.length <= 1) {
                        GameEngine.b("GetOwnInfoRunnable", "columns.length too short at:" + split.length);
                    } else {
                        String str = split[0];
                        String str2 = split[1];
                        try {
                            GameEngine.b("GetOwnInfoRunnable", "got info");
                            gameEngine.bX.a(true, str, Boolean.valueOf(Boolean.parseBoolean(str2)));
                        } catch (NumberFormatException e) {
                            GameEngine.b("GetOwnInfoRunnable", "failed to load server");
                            e.printStackTrace();
                        }
                    }
                } else {
                    com.corrodinggames.rts.appFramework.p.l();
                    GameEngine.b("GetOwnInfoRunnable", "Completed load from master server without error");
                    return;
                }
            }
        } catch (ClientProtocolException e2) {
            gameEngine.bX.a(false, (String) null, (Boolean) null);
            e2.printStackTrace();
        } catch (IOException e3) {
            gameEngine.bX.a(false, (String) null, (Boolean) null);
            e3.printStackTrace();
        } catch (Exception e4) {
            gameEngine.bX.a(false, (String) null, (Boolean) null);
            GameEngine.a("GetOwnInfoRunnable Failed", e4);
        }
    }
}