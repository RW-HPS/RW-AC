package com.corrodinggames.rts.appFramework;

import android.os.Handler;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.ListRoomInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p.class */
public class p extends b {
    static p c;
    final Handler d;
    private Runnable e;

    public static void l() {
        if (c != null) {
            c.d.a(c.e);
        }
    }

    public static ArrayList m() {
        ArrayList arrayList;
        synchronized (GameNetAPIOperate.f) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            arrayList = new ArrayList();
            Iterator it = gameEngine.netEngine.bi.iterator();
            while (it.hasNext()) {
                arrayList.add((ListRoomInfo) it.next());
            }
            Collections.sort(arrayList, new Comparator() { // from class: com.corrodinggames.rts.appFramework.p.1
                public int a(ListRoomInfo listRoomInfo) {
                    if (listRoomInfo.d()) {
                        return 0;
                    }
                    if (listRoomInfo.x && listRoomInfo.s.equals("chat")) {
                        return 1;
                    }
                    if (listRoomInfo.a) {
                        return 2;
                    }
                    if (listRoomInfo.s.equals("battleroom")) {
                        if (listRoomInfo.v != -1 && listRoomInfo.v < listRoomInfo.w) {
                            if (listRoomInfo.x) {
                                if (listRoomInfo.v != 0) {
                                    return 3;
                                }
                                return 4;
                            } else if (listRoomInfo.h && !listRoomInfo.x) {
                                return 7;
                            } else {
                                return 9;
                            }
                        } else if (listRoomInfo.x) {
                            return 6;
                        } else {
                            if (listRoomInfo.h && !listRoomInfo.x) {
                                return 8;
                            }
                            return 9;
                        }
                    }
                    return 99;
                }

                @Override // java.util.Comparator
                /* renamed from: a */
                public int compare(ListRoomInfo listRoomInfo, ListRoomInfo listRoomInfo2) {
                    Integer valueOf = Integer.valueOf(a(listRoomInfo));
                    Integer valueOf2 = Integer.valueOf(a(listRoomInfo2));
                    if (!listRoomInfo.g()) {
                        valueOf = Integer.valueOf(valueOf.intValue() + 20);
                    }
                    if (!listRoomInfo2.g()) {
                        valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
                    }
                    int compareTo = valueOf.compareTo(valueOf2);
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    return listRoomInfo.q.compareTo(listRoomInfo2.q);
                }
            });
        }
        return arrayList;
    }
}