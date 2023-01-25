package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Locale;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ab.class */
class RunnableC0864ab implements Runnable {

    /* renamed from: a */
    C0926w f5682a;

    /* renamed from: b */
    String f5683b;

    /* renamed from: c */
    int f5684c;

    /* renamed from: d */
    String f5685d;

    RunnableC0864ab() {
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m1033aq();
        GameEngine.getGameEngine();
        GameEngine.m1015b("getGameServerInfoFromMasterServer", "Starting getGameServerInfoFromMasterServer");
        String m1281a = GameNetAPIOperate.m1281a(this.f5684c);
        String str = null;
        if (this.f5685d != null) {
            str = C0773f.m2144c(this.f5683b + this.f5685d, 3);
        }
        try {
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "get"));
            arrayList.add(new BasicNameValuePair("game_id", this.f5683b));
            arrayList.add(new BasicNameValuePair("c", m1281a));
            arrayList.add(new BasicNameValuePair("p_hash", str));
            BufferedReader m1275a = GameNetAPIOperate.m1275a(arrayList);
            String readLine = m1275a.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                GameEngine.m1015b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine);
                this.f5682a.mo1254a("Unexpected header from master server", GameConnectStatusType.unknown, null);
                return;
            }
            String readLine2 = m1275a.readLine();
            if (readLine2 == null) {
                throw new IOException("Unexpected end of response");
            }
            if (readLine.contains("[FAILED]")) {
                GameEngine.print("Got failed header with status:" + readLine2);
                String str2 = "Failed to get server connection data - unknown";
                GameConnectStatusType gameConnectStatusType = GameConnectStatusType.unknown;
                if (readLine2.startsWith("ERROR_OTHER")) {
                    String[] split = readLine2.split(",");
                    if (split.length >= 2) {
                        str2 = split[1];
                    }
                    gameConnectStatusType = GameConnectStatusType.unknown;
                } else if (readLine2.startsWith("ERROR_MISSING")) {
                    str2 = "Request missing required fields";
                } else if (!readLine2.startsWith("ERROR_WRONG_C")) {
                    if (readLine2.startsWith("ERROR_MISSING_PASSWORD")) {
                        str2 = "Missing password";
                        gameConnectStatusType = GameConnectStatusType.unknown;
                    } else if (readLine2.startsWith("ERROR_WRONG_PASSWORD")) {
                        str2 = "Wrong password";
                        gameConnectStatusType = GameConnectStatusType.wrongPassword;
                    }
                }
                this.f5682a.mo1254a(str2, gameConnectStatusType, null);
                return;
            }
            String readLine3 = m1275a.readLine();
            if (readLine3 == null) {
                throw new IOException("Unexpected end of response");
            }
            if (!readLine3.toLowerCase(Locale.ROOT).contains(C0773f.m2146c("game_" + m1281a).toLowerCase(Locale.ROOT))) {
                GameEngine.m1015b("getGameServerInfoFromMasterServerRunnable", "Error bad header returned from the master server: " + readLine3);
                this.f5682a.mo1254a("Unexpected return from master server", GameConnectStatusType.unknown, null);
                return;
            }
            m1275a.readLine();
            String readLine4 = m1275a.readLine();
            if (readLine4 == null) {
                throw new IOException("Unexpected end of response");
            }
            String[] split2 = readLine4.split(",");
            if (split2.length <= 18) {
                throw new RuntimeException("getGameServerInfoFromMasterServerRunnable: columns.length too short at:" + split2.length);
            }
            String str3 = split2[3];
            String str4 = split2[4];
            String str5 = split2[5];
            String str6 = split2[6];
            String str7 = split2[7];
            String str8 = split2[8];
            String str9 = split2[9];
            String str10 = split2[10];
            String str11 = split2[11];
            String str12 = split2[12];
            String str13 = split2[13];
            String str14 = split2[15];
            String str15 = split2[16];
            String str16 = split2[17];
            String str17 = split2[18];
            GameEngine.m1015b("getGameServerInfoFromMasterServerRunnable", "got ");
            GameEngine.m1015b("getGameServerInfoFromMasterServerRunnable", "Completed get from master server without error");
            this.f5682a.mo1255a(str3 + ":" + str5);
        } catch (IOException e) {
            GameEngine.m1063a("getGameServerInfoFromMasterServerRunnable Failed", (Exception) e);
            this.f5682a.mo1254a(e.getMessage(), GameConnectStatusType.unknown, e);
        }
    }
}