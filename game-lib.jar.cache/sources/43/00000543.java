package com.corrodinggames.rts.gameFramework.net;

import android.os.Build;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import java.io.IOException;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/v.class */
class SendErrorLogToGameDev implements Runnable {
    String a;
    String b;

    SendErrorLogToGameDev() {
    }

    @Override // java.lang.Runnable
    public void run() {
        long V = GameEngine.V();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("SendErrorReport", "Starting");
        try {
            try {
                try {
                    ArrayList arrayList = new ArrayList(2);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "action", "error_report");
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version", Integer.toString(gameEngine.c(false)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_internal", Integer.toString(gameEngine.c(true)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "game_version_string", gameEngine.r());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "package_name", gameEngine.l());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "installation_source", gameEngine.m());
                    String str = VariableScope.nullOrMissingString + Build.VERSION.SDK_INT;
                    if (GameEngine.av()) {
                        str = "s:0;";
                        if (SteamEngine.getSteamEngine().e()) {
                            str = "s:1;";
                        }
                    }
                    if (GameEngine.av() || GameEngine.aZ) {
                        GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "system_version", System.getProperty("os.name") + " - " + System.getProperty("os.version"));
                    }
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "sdk_version", str);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "device_model", gameEngine.G());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "build_version", gameEngine.H());
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "release_version", f.a(GameEngine.as));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "dedicated_server", f.a(GameEngine.aU));
                    String str2 = gameEngine.netEngine != null ? gameEngine.netEngine.aR : "NA";
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token", str2);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "private_token_2", f.b(f.b(str2)));
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "message", this.a);
                    GameNetAPIOperate.listAddBasicNameValuePair(arrayList, "stacktrace", this.b);
                    GameEngine.b("SendErrorReport", "making request");
                    String readLine = GameNetAPIOperate.a(arrayList).readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        GameEngine.b("StartCreateOnMasterServer", "Error bad header returned from the master server: " + readLine);
                        GameEngine.b("SendErrorReport", "took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
                        return;
                    }
                    GameEngine.b("SendErrorReport", "Send trace successfully");
                    GameEngine.b("SendErrorReport", "took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
                } catch (Exception e) {
                    e.printStackTrace();
                    GameEngine.b("SendErrorReport", "took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                GameEngine.b("SendErrorReport", "took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
            }
        } catch (Throwable th) {
            GameEngine.b("SendErrorReport", "took: " + (((float) (GameEngine.V() - V)) / 1000000.0f) + " seconds");
            throw th;
        }
    }
}