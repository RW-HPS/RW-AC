package com.corrodinggames.rts.gameFramework.net;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/v.class */
class SendErrorLogToGameDev implements Runnable {

    /* renamed from: a */
    String f6117a;

    /* renamed from: b */
    String f6118b;

    SendErrorLogToGameDev() {
    }

    public void run() {
        long m1095V = GameEngine.m1095V();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m1023b("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "error_report");
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version", Integer.toString(gameEngine.mo1014c(false)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_internal", Integer.toString(gameEngine.mo1014c(true)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", gameEngine.mo980r());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "package_name", gameEngine.mo989l());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "installation_source", gameEngine.mo987m());
                    String str = VariableScope.nullOrMissingString + Build.VERSION.SDK_INT;
                    if (GameEngine.m1036av()) {
                        str = "s:0;";
                        if (SteamEngine.getSteamEngine().m760e()) {
                            str = "s:1;";
                        }
                    }
                    if (GameEngine.m1036av() || GameEngine.f6423aZ) {
                        GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "sdk_version", str);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "device_model", gameEngine.m1110G());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "build_version", gameEngine.m1109H());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "release_version", C0773f.m2196a(GameEngine.f6403as));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "dedicated_server", C0773f.m2196a(GameEngine.f6418aU));
                    String str2 = gameEngine.netEngine != null ? gameEngine.netEngine.f5823aR : "NA";
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", str2);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token_2", C0773f.m2175b(C0773f.m2175b(str2)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "message", this.f6117a);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "stacktrace", this.f6118b);
                    GameEngine.m1023b("SendErrorReport", "making request");
                    String readLine = GameNetAPIOperate.m1288a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        GameEngine.m1023b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        GameEngine.m1023b("SendErrorReport", "took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
                        return;
                    }
                    GameEngine.m1023b("SendErrorReport", "Send trace successfully");
                    GameEngine.m1023b("SendErrorReport", "took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
                } catch (Exception e) {
                    e.printStackTrace();
                    GameEngine.m1023b("SendErrorReport", "took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                GameEngine.m1023b("SendErrorReport", "took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.m1023b("SendErrorReport", "took: " + (((float) (GameEngine.m1095V() - m1095V)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}