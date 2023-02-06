package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.appFramework.p;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.translations.a;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorCompletionService;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.apache.http.HttpEntity;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.client.utils.URLEncodedUtils;
import org.apache.http.message.BasicNameValuePair;

/* renamed from: com.corrodinggames.rts.gameFramework.j.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/n.class */
public class GameNetAPIOperate {
    static int e;
    public static String g;
    public static boolean a = true;
    public static boolean b = true;

    /* renamed from: c */
    public static String[] urlList = {"http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4"};
    public static HTTPService d = new HTTPService();
    public static Object f = new Object();

    public static void a(String str) {
        if (b) {
            GameEngine.m2e(str);
        }
    }

    static void a(List list, boolean z, s sVar) {
        a(list, z, sVar, urlList);
    }

    static void a(List list, boolean z, s sVar, String[] strArr) {
        sVar.f = strArr.length;
        int i = 0;
        for (String str : strArr) {
            i++;
            new Thread(new u(list, sVar, str, z, i)).start();
            if (a) {
                GameEngine.b("LoadFromMasterServer", i + ": Started RequestsParallelRunnable thread");
            }
        }
    }

    public static String a(List list, String str) {
        if (list != null) {
            Iterator it = list.iterator();
            while (it.hasNext()) {
                NameValuePair nameValuePair = (NameValuePair) it.next();
                if (str.equals(nameValuePair.getName())) {
                    return nameValuePair.getValue();
                }
            }
            return null;
        }
        return null;
    }

    public static BufferedReader a(List list) {
        return a(list, true, urlList, 10, true);
    }

    public static BufferedReader a(List list, int i) {
        return a(list, true, urlList, i, true);
    }

    public static BufferedReader a(final List list, final boolean z, String[] strArr, int i, final boolean z2) {
        Future poll;
        String a2 = a(list, "action");
        ExecutorService newFixedThreadPool = Executors.newFixedThreadPool(strArr.length);
        try {
            ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(newFixedThreadPool);
            ArrayList arrayList = new ArrayList();
            for (final String str : strArr) {
                arrayList.add(executorCompletionService.submit(new Callable() { // from class: com.corrodinggames.rts.gameFramework.j.n.1
                    @Override // java.util.concurrent.Callable
                    /* renamed from: a */
                    public t call() {
                        try {
                            GameNetAPIOperate.a("Running doSingleRequest:" + str);
                            return GameNetAPIOperate.a(list, str, z);
                        } catch (Exception e2) {
                            GameEngine.m2e("Error on doSingleRequest:" + str + " - " + e2.getMessage());
                            if (z2) {
                                e2.printStackTrace();
                                return null;
                            }
                            return null;
                        }
                    }
                }));
            }
            int length = strArr.length;
            t tVar = null;
            t tVar2 = null;
            t tVar3 = null;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    break;
                }
                try {
                    poll = executorCompletionService.poll(10L, TimeUnit.SECONDS);
                } catch (InterruptedException e2) {
                } catch (ExecutionException e3) {
                    e3.printStackTrace();
                    if (e3.getCause() != null) {
                        e3.getCause().printStackTrace();
                    }
                }
                if (poll == null) {
                    GameEngine.print("MULTI_MASTERSERVERS: poll timed out (" + a2 + ")");
                    break;
                }
                t tVar4 = (t) poll.get();
                if (tVar4 != null) {
                    tVar = tVar4;
                    if (tVar4.b) {
                        if (tVar4.c) {
                            tVar3 = tVar4;
                        } else {
                            tVar2 = tVar4;
                            break;
                        }
                    }
                }
                i2++;
            }
            if (tVar2 == null && tVar3 != null) {
                GameEngine.print("All masterserver results included an error message (" + a2 + ")");
                tVar2 = tVar3;
            }
            if (tVar2 == null) {
                GameEngine.print("No valid result found on any masterserver (" + a2 + ")");
                tVar2 = tVar;
            }
            if (tVar2 != null) {
                BufferedReader bufferedReader = tVar2.a;
                newFixedThreadPool.shutdown();
                return bufferedReader;
            }
            throw new IOException("No results found (" + a2 + ")");
        } catch (Throwable th) {
            newFixedThreadPool.shutdown();
            throw th;
        }
    }

    public static t a(List list, String str, boolean z) {
        HttpGet httpGet;
        String str2;
        GameEngine gameEngine;
        HttpResponse execute;
        String a2 = a(list, "action");
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        String str3 = str + "/interface";
        if (z) {
            HttpGet httpPost = new HttpPost(str3);
            httpPost.setEntity(new UrlEncodedFormEntity(list));
            httpGet = httpPost;
        } else {
            str3 = str3 + "?" + URLEncodedUtils.format(list, "utf-8");
            httpGet = new HttpGet(str3);
        }
        if (GameEngine.ax()) {
            str2 = "rw server";
        } else {
            str2 = "rw " + (GameEngine.av() ? "pc" : "android");
        }
        String c = a.c();
        if (GameEngine.getGameEngine() != null) {
            str2 = str2 + " " + gameEngine.c(true) + " " + c;
        }
        httpGet.setHeader("User-Agent", str2);
        httpGet.setHeader("Language", c);
        HttpClient a3 = d.a();
        try {
            execute = a3.execute(httpGet);
        } catch (NullPointerException e2) {
            GameEngine.print("doRequest: httpclient.execute threw NullPointerException, running workaround");
            a3 = d.b();
            execute = a3.execute(httpGet);
        }
        float a4 = Unit.a(loadAllUnitsTook);
        HttpEntity entity = execute.getEntity();
        InputStream content = entity.getContent();
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[16384];
        while (true) {
            int read = content.read(bArr, 0, bArr.length);
            if (read == -1) {
                break;
            }
            byteArrayOutputStream.write(bArr, 0, read);
        }
        byteArrayOutputStream.flush();
        content.close();
        entity.consumeContent();
        byte[] byteArray = byteArrayOutputStream.toByteArray();
        t tVar = new t();
        String a5 = a(byteArray);
        tVar.b = a5.startsWith("CORRODINGGAMES");
        tVar.c = a5.contains("[FAILED]");
        if (!tVar.b || tVar.c) {
            String str4 = str3 + (a2 != null ? "?action=" + a2 : VariableScope.nullOrMissingString) + " (" + a4 + "ms)";
            if (!"list".equals(a2)) {
                str4 = str4 + ":\n" + new String(byteArray);
            }
            GameEngine.m2e(str4);
        }
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
        d.a(a3);
        tVar.a = bufferedReader;
        return tVar;
    }

    public static String a(byte[] bArr) {
        int length = bArr.length;
        for (int i = 0; i < bArr.length; i++) {
            if (bArr[i] == 10 || bArr[i] == 13) {
                length = i;
                break;
            }
        }
        return new String(bArr, 0, length);
    }

    public static ListRoomInfo b(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        Iterator it = gameEngine.netEngine.bi.iterator();
        while (it.hasNext()) {
            ListRoomInfo listRoomInfo = (ListRoomInfo) it.next();
            if (str.equals(listRoomInfo.b)) {
                return listRoomInfo;
            }
        }
        return null;
    }

    public static ListRoomInfo c(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null) {
            throw new IOException("findOrCreateServer id cannot be null");
        }
        ListRoomInfo b2 = b(str);
        if (b2 != null) {
            return b2;
        }
        ListRoomInfo listRoomInfo = new ListRoomInfo();
        listRoomInfo.b = str;
        listRoomInfo.a = false;
        listRoomInfo.o = gameEngine.netEngine.p();
        return listRoomInfo;
    }

    public static void a(Runnable runnable) {
        GameEngine.b("LoadFromMasterServer", "Load requested");
        new Thread(new ListOperate_Join_GetRoomList(runnable)).start();
    }

    static void a(int i, int i2) {
        ListRoomInfo listRoomInfo;
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean z = false;
        synchronized (f) {
            Iterator it = gameEngine.netEngine.bi.iterator();
            while (it.hasNext()) {
                if (((ListRoomInfo) it.next()).p < i) {
                    GameEngine.b("LoadFromMasterServer", i2 + ": Removing stale server with id:" + listRoomInfo.b);
                    it.remove();
                    z = true;
                }
            }
        }
        if (z) {
            p.l();
        }
    }

    public static void a() {
        GameEngine.b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
        APIEncryption.e = 6;
        new Thread(new p()).start();
    }

    /* renamed from: a */
    static void listAddBasicNameValuePair(List list, String key, String value) {
        list.add(new BasicNameValuePair(key, value));
    }

    static void b(List list) {
        String str;
        GameEngine gameEngine = GameEngine.getGameEngine();
        listAddBasicNameValuePair(list, "password_required", f.a(gameEngine.netEngine.passwd != null));
        listAddBasicNameValuePair(list, "created_by", gameEngine.netEngine.y);
        listAddBasicNameValuePair(list, "private_ip", gameEngine.netEngine.ah());
        listAddBasicNameValuePair(list, "port_number", Integer.toString(gameEngine.netEngine.port));
        if (gameEngine.netEngine.u != null) {
            listAddBasicNameValuePair(list, "game_map", com.corrodinggames.rts.gameFramework.file.a.o(gameEngine.netEngine.u));
        } else {
            listAddBasicNameValuePair(list, "game_map", com.corrodinggames.rts.gameFramework.file.a.o(gameEngine.netEngine.gameMapData.mapName));
        }
        MapType mapType = gameEngine.netEngine.gameMapData.mapType;
        if (mapType == null) {
            mapType = MapType.skirmishMap;
        }
        listAddBasicNameValuePair(list, "game_mode", mapType.name());
        if (!gameEngine.netEngine.v) {
            if (gameEngine.netEngine.aW) {
                str = "ingame";
            } else if (gameEngine.netEngine.gameMapData.p) {
                str = "locked";
            } else {
                str = "battleroom";
            }
            listAddBasicNameValuePair(list, "game_status", str);
        } else {
            listAddBasicNameValuePair(list, "game_status", "chat");
        }
        listAddBasicNameValuePair(list, "player_count", Integer.toString(gameEngine.netEngine.E()));
        String num = Integer.toString(PlayerData.c);
        if (gameEngine.netEngine.v) {
        }
        listAddBasicNameValuePair(list, "max_player_count", num);
    }

    public static void b() {
        GameEngine.b("StartCreateOnMasterServer", "Create requested");
        APIEncryption.b = 5;
        new Thread(new ListOperate_AddRoom()).start();
    }

    public static void c() {
        new Thread(new ListOperate_UpdateRoom()).start();
    }

    public static void d() {
        GameEngine.b("startRemoveOnMasterServer", "Remove requested");
        new Thread(new ListOperate_RemoveRoom()).start();
    }

    public static void a(String str, String str2) {
        GameEngine.b("startErrorReport", "ErrorReport requested");
        SendErrorLogToGameDev sendErrorLogToGameDev = new SendErrorLogToGameDev();
        sendErrorLogToGameDev.b = str2;
        sendErrorLogToGameDev.a = str;
        new Thread(sendErrorLogToGameDev).start();
    }

    public static String a(int i) {
        if (i == 0) {
            return VariableScope.nullOrMissingString;
        }
        if (i > 0) {
            if (i < 100000) {
                return f.a(f.b("x" + i), 10);
            }
            if (i < 200000) {
                return f.a(f.b("y" + i), 11);
            }
            if (i < 300000) {
                return f.a(f.b("z" + i), 12);
            }
            if (i < 1000000) {
                return f.a(f.b("xx" + i), 13) + "-" + GameEngine.getGameEngine().netEngine.g(i - 300000);
            }
            if (i < 2000000) {
                return f.a(f.b("yy" + i), 14) + "-" + GameEngine.getGameEngine().netEngine.g(i - 1000000);
            }
            return "NA";
        }
        return "NA";
    }

    public static void a(w wVar, String str, int i, String str2) {
        GameEngine.m2e("getGameServerInfoFromMasterServer");
        ListOperate_Join_GetRoomIP listOperate_Join_GetRoomIP = new ListOperate_Join_GetRoomIP();
        listOperate_Join_GetRoomIP.a = wVar;
        listOperate_Join_GetRoomIP.b = str;
        listOperate_Join_GetRoomIP.c = i;
        listOperate_Join_GetRoomIP.d = str2;
        new Thread(listOperate_Join_GetRoomIP).start();
    }
}