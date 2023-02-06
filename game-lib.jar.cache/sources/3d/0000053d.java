package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.j.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/q.class */
class ListOperate_Join_GetRoomList implements Runnable {
    Runnable a;

    ListOperate_Join_GetRoomList(Runnable runnable) {
        this.a = runnable;
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.aq();
        final GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("LoadFromMasterServer", "Starting load");
        final int i = GameNetAPIOperate.e;
        GameNetAPIOperate.e++;
        try {
            new Timer().schedule(new o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(gameEngine.c(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", f.a(gameEngine.n())));
            GameNetAPIOperate.a((List) arrayList, false, new s() { // from class: com.corrodinggames.rts.gameFramework.j.q.1
                @Override // com.corrodinggames.rts.gameFramework.net.s
                void a(BufferedReader bufferedReader, int i2, String str) {
                    GameEngine gameEngine2 = GameEngine.getGameEngine();
                    String readLine = bufferedReader.readLine();
                    if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                        String str2 = i2 + ": Unknown header from the master server: '" + f.a(readLine, 30) + "'";
                        GameEngine.b("LoadFromMasterServer", str2);
                        this.d = str2;
                        try {
                            String str3 = VariableScope.nullOrMissingString + readLine + "\n";
                            GameEngine.m2e("----------- Full response ----------");
                            GameEngine.b("LoadFromMasterServer", "line:" + readLine);
                            while (true) {
                                String readLine2 = bufferedReader.readLine();
                                if (readLine2 != null) {
                                    GameEngine.b("LoadFromMasterServer", "line:" + readLine2);
                                    str3 = str3 + readLine2 + "\n";
                                } else {
                                    GameEngine.m2e("------------------------------------");
                                    GameNetAPIOperate.g = str3;
                                    return;
                                }
                            }
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    } else {
                        GameEngine.b("LoadFromMasterServer", i2 + ": Starting load");
                        int i3 = 0;
                        while (true) {
                            String readLine3 = bufferedReader.readLine();
                            if (readLine3 == null) {
                                break;
                            }
                            String[] split = readLine3.split(",", -1);
                            if (split.length <= 21) {
                                GameEngine.b("LoadFromMasterServer", i2 + ": columns.length too short at:" + split.length);
                                GameEngine.b("LoadFromMasterServer", i2 + ": short line is:" + readLine3);
                            } else {
                                String str4 = split[0];
                                String str5 = split[1];
                                String str6 = split[2];
                                String str7 = split[3];
                                String str8 = split[4];
                                String str9 = split[5];
                                String str10 = split[6];
                                String str11 = split[7];
                                String str12 = split[8];
                                String str13 = split[9];
                                String str14 = split[10];
                                String str15 = split[11];
                                String str16 = split[12];
                                String str17 = split[13];
                                String str18 = split[15];
                                String str19 = split[16];
                                String str20 = split[17];
                                String str21 = split[18];
                                String str22 = split[19];
                                String str23 = split[20];
                                String str24 = split[21];
                                String str25 = null;
                                String str26 = null;
                                if (str7 != null && str7.startsWith("url:") && Boolean.parseBoolean(str20)) {
                                    str25 = str7.substring(4);
                                    str26 = str5;
                                    if (!f.c(str25 + ";" + str26).equals(str8)) {
                                        GameEngine.m2e("Skipping " + str21);
                                    }
                                }
                                if (str21 == null || str21.trim().length() == 0) {
                                    str21 = str4;
                                }
                                try {
                                    String str27 = str21;
                                    synchronized (GameNetAPIOperate.f) {
                                        ListRoomInfo c = GameNetAPIOperate.c(str27);
                                        c.c = str7;
                                        c.d = str8;
                                        c.e = str25;
                                        c.f = str26;
                                        c.g = Integer.valueOf(str9).intValue();
                                        c.h = Boolean.parseBoolean(str10);
                                        c.m = Boolean.parseBoolean(str12);
                                        c.j = str6;
                                        try {
                                            c.l = Integer.parseInt(c.j);
                                        } catch (NumberFormatException e2) {
                                            GameEngine.print("game_version_int:" + e2.getMessage());
                                        }
                                        c.n = str11;
                                        c.q = str13;
                                        c.r = str14;
                                        c.s = str15;
                                        c.k = str16;
                                        c.a = Boolean.parseBoolean(str17);
                                        c.t = str18;
                                        c.u = str19;
                                        c.y = Boolean.parseBoolean(str22);
                                        if (VariableScope.nullOrMissingString.equals(str23)) {
                                            str23 = null;
                                        }
                                        c.z = str23;
                                        if (!str24.trim().equals(VariableScope.nullOrMissingString)) {
                                            c.A = Integer.valueOf(str24).intValue();
                                        }
                                        try {
                                            c.v = Integer.parseInt(c.t);
                                        } catch (NumberFormatException e3) {
                                            GameEngine.print("game_player_count_int:" + e3.getMessage());
                                        }
                                        try {
                                            c.w = Integer.parseInt(c.u);
                                        } catch (NumberFormatException e4) {
                                            GameEngine.print("game_max_player_count_int:" + e4.getMessage());
                                        }
                                        c.x = Boolean.parseBoolean(str20);
                                        if (c.p < i) {
                                            c.p = i;
                                        }
                                        if (GameNetAPIOperate.b(c.b) == null) {
                                            gameEngine2.netEngine.bi.add(c);
                                        }
                                        i3++;
                                    }
                                } catch (NumberFormatException e5) {
                                    GameEngine.b("LoadFromMasterServer", i2 + ": failed to load server");
                                    e5.printStackTrace();
                                }
                            }
                        }
                        GameEngine.b("LoadFromMasterServer", "[" + i2 + "]: Found " + i3 + " servers");
                        if (i3 == 0) {
                            try {
                                Thread.sleep(2000L);
                            } catch (InterruptedException e6) {
                                e6.printStackTrace();
                            }
                        }
                        this.e = true;
                        ListOperate_Join_GetRoomList.this.a.run();
                        try {
                            Thread.sleep(2000L);
                        } catch (InterruptedException e7) {
                            e7.printStackTrace();
                        }
                        GameNetAPIOperate.a(i, i2);
                        GameEngine.b("LoadFromMasterServer", i2 + ": Completed load from master server without error");
                    }
                }

                @Override // com.corrodinggames.rts.gameFramework.net.s
                void a() {
                    if (!this.e) {
                        gameEngine.netEngine.bh = this.d;
                        ListOperate_Join_GetRoomList.this.a.run();
                    }
                }
            });
        } catch (Exception e) {
            e.printStackTrace();
            gameEngine.a("Error getting game list from server", 1);
        }
    }
}