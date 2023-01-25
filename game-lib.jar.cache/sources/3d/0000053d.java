package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Timer;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.j.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/q.class */
class RunnableC0919q implements Runnable {

    /* renamed from: a */
    Runnable f6101a;

    RunnableC0919q(Runnable runnable) {
        this.f6101a = runnable;
    }

    public void run() {
        GameEngine.m1041aq();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m1023b("LoadFromMasterServer", "Starting load");
        int i = GameNetAPIOperate.f6089e;
        GameNetAPIOperate.f6089e++;
        try {
            new Timer().schedule(new C0917o(i), 5000L);
            ArrayList arrayList = new ArrayList(2);
            arrayList.add(new BasicNameValuePair("action", "list"));
            arrayList.add(new BasicNameValuePair("game_version", Integer.toString(gameEngine.mo1014c(true))));
            arrayList.add(new BasicNameValuePair("game_version_beta", C0773f.m2196a(gameEngine.mo985n())));
            GameNetAPIOperate.m1283a((List) arrayList, false, (AbstractC0922s) new C09201(i, gameEngine));
        } catch (Exception e) {
            e.printStackTrace();
            gameEngine.m1073a("Error getting game list from server", 1);
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.j.q$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/q$1.class */
    class C09201 extends AbstractC0922s {

        /* renamed from: a */
        final /* synthetic */ int f6102a;

        /* renamed from: b */
        final /* synthetic */ GameEngine f6103b;

        C09201(int i, GameEngine gameEngine) {
            RunnableC0919q.this = r4;
            this.f6102a = i;
            this.f6103b = gameEngine;
        }

        /* renamed from: a */
        void mo1269a(BufferedReader bufferedReader, int i, String str) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            String readLine = bufferedReader.readLine();
            if (readLine == null || !readLine.contains("CORRODINGGAMES")) {
                String str2 = i + ": Unknown header from the master server: '" + C0773f.m2200a(readLine, 30) + "'";
                GameEngine.m1023b("LoadFromMasterServer", str2);
                this.f6106d = str2;
                try {
                    String str3 = VariableScope.nullOrMissingString + readLine + "\n";
                    GameEngine.m5490e("----------- Full response ----------");
                    GameEngine.m1023b("LoadFromMasterServer", "line:" + readLine);
                    while (true) {
                        String readLine2 = bufferedReader.readLine();
                        if (readLine2 != null) {
                            GameEngine.m1023b("LoadFromMasterServer", "line:" + readLine2);
                            str3 = str3 + readLine2 + "\n";
                        } else {
                            GameEngine.m5490e("------------------------------------");
                            GameNetAPIOperate.f6090g = str3;
                            return;
                        }
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            } else {
                GameEngine.m1023b("LoadFromMasterServer", i + ": Starting load");
                int i2 = 0;
                while (true) {
                    String readLine3 = bufferedReader.readLine();
                    if (readLine3 == null) {
                        break;
                    }
                    String[] split = readLine3.split(",", -1);
                    if (split.length <= 21) {
                        GameEngine.m1023b("LoadFromMasterServer", i + ": columns.length too short at:" + split.length);
                        GameEngine.m1023b("LoadFromMasterServer", i + ": short line is:" + readLine3);
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
                            if (!C0773f.m2162c(str25 + ";" + str26).equals(str8)) {
                                GameEngine.m5490e("Skipping " + str21);
                            }
                        }
                        if (str21 == null || str21.trim().length() == 0) {
                            str21 = str4;
                        }
                        try {
                            String str27 = str21;
                            synchronized (GameNetAPIOperate.f6095f) {
                                ListRoomInfo m1275c = GameNetAPIOperate.m1275c(str27);
                                m1275c.f6040c = str7;
                                m1275c.f6041d = str8;
                                m1275c.f6042e = str25;
                                m1275c.f6043f = str26;
                                m1275c.f6044g = Integer.valueOf(str9).intValue();
                                m1275c.f6045h = Boolean.parseBoolean(str10);
                                m1275c.f6049m = Boolean.parseBoolean(str12);
                                m1275c.f6046j = str6;
                                try {
                                    m1275c.f6048l = Integer.parseInt(m1275c.f6046j);
                                } catch (NumberFormatException e2) {
                                    GameEngine.print("game_version_int:" + e2.getMessage());
                                }
                                m1275c.f6050n = str11;
                                m1275c.f6053q = str13;
                                m1275c.f6054r = str14;
                                m1275c.f6055s = str15;
                                m1275c.f6047k = str16;
                                m1275c.f6038a = Boolean.parseBoolean(str17);
                                m1275c.f6056t = str18;
                                m1275c.f6057u = str19;
                                m1275c.f6059y = Boolean.parseBoolean(str22);
                                if (VariableScope.nullOrMissingString.equals(str23)) {
                                    str23 = null;
                                }
                                m1275c.f6060z = str23;
                                if (!str24.trim().equals(VariableScope.nullOrMissingString)) {
                                    m1275c.f6061A = Integer.valueOf(str24).intValue();
                                }
                                try {
                                    m1275c.f6063v = Integer.parseInt(m1275c.f6056t);
                                } catch (NumberFormatException e3) {
                                    GameEngine.print("game_player_count_int:" + e3.getMessage());
                                }
                                try {
                                    m1275c.f6064w = Integer.parseInt(m1275c.f6057u);
                                } catch (NumberFormatException e4) {
                                    GameEngine.print("game_max_player_count_int:" + e4.getMessage());
                                }
                                m1275c.f6058x = Boolean.parseBoolean(str20);
                                if (m1275c.f6052p < this.f6102a) {
                                    m1275c.f6052p = this.f6102a;
                                }
                                if (GameNetAPIOperate.m1278b(m1275c.f6039b) == null) {
                                    gameEngine.netEngine.f5811bi.add(m1275c);
                                }
                                i2++;
                            }
                        } catch (NumberFormatException e5) {
                            GameEngine.m1023b("LoadFromMasterServer", i + ": failed to load server");
                            e5.printStackTrace();
                        }
                    }
                }
                GameEngine.m1023b("LoadFromMasterServer", "[" + i + "]: Found " + i2 + " servers");
                if (i2 == 0) {
                    try {
                        Thread.sleep(2000L);
                    } catch (InterruptedException e6) {
                        e6.printStackTrace();
                    }
                }
                this.f6107e = true;
                RunnableC0919q.this.f6101a.run();
                try {
                    Thread.sleep(2000L);
                } catch (InterruptedException e7) {
                    e7.printStackTrace();
                }
                GameNetAPIOperate.m1293a(this.f6102a, i);
                GameEngine.m1023b("LoadFromMasterServer", i + ": Completed load from master server without error");
            }
        }

        /* renamed from: a */
        void mo1270a() {
            if (!this.f6107e) {
                this.f6103b.netEngine.f5810bh = this.f6106d;
                RunnableC0919q.this.f6101a.run();
            }
        }
    }
}