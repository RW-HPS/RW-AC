package com.corrodinggames.rts.appFramework;

import android.p003os.Handler;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.ListRoomInfo;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p.class */
public class ActivityC0129p extends ActivityC0089b {

    /* renamed from: c */
    static ActivityC0129p f540c;

    /* renamed from: d */
    final Handler f541d;

    /* renamed from: e */
    private Runnable f542e;

    /* renamed from: l */
    public static void m4914l() {
        if (f540c != null) {
            f540c.f541d.m5145a(f540c.f542e);
        }
    }

    /* renamed from: m */
    public static ArrayList m4913m() {
        ArrayList arrayList;
        synchronized (GameNetAPIOperate.f6095f) {
            GameEngine gameEngine = GameEngine.getGameEngine();
            arrayList = new ArrayList();
            Iterator it = gameEngine.netEngine.f5811bi.iterator();
            while (it.hasNext()) {
                arrayList.add((ListRoomInfo) it.next());
            }
            Collections.sort(arrayList, new C01301());
        }
        return arrayList;
    }

    /* renamed from: com.corrodinggames.rts.appFramework.p$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p$1.class */
    final class C01301 implements Comparator {
        C01301() {
        }

        /* renamed from: a */
        public int m4912a(ListRoomInfo listRoomInfo) {
            if (listRoomInfo.m1339d()) {
                return 0;
            }
            if (listRoomInfo.f6058x && listRoomInfo.f6055s.equals("chat")) {
                return 1;
            }
            if (listRoomInfo.f6038a) {
                return 2;
            }
            if (listRoomInfo.f6055s.equals("battleroom")) {
                if (listRoomInfo.f6063v != -1 && listRoomInfo.f6063v < listRoomInfo.f6064w) {
                    if (listRoomInfo.f6058x) {
                        if (listRoomInfo.f6063v != 0) {
                            return 3;
                        }
                        return 4;
                    } else if (listRoomInfo.f6045h && !listRoomInfo.f6058x) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (listRoomInfo.f6058x) {
                    return 6;
                } else {
                    if (listRoomInfo.f6045h && !listRoomInfo.f6058x) {
                        return 8;
                    }
                    return 9;
                }
            }
            return 99;
        }

        /* renamed from: a */
        public int mo4893a(ListRoomInfo listRoomInfo, ListRoomInfo listRoomInfo2) {
            Integer valueOf = Integer.valueOf(m4912a(listRoomInfo));
            Integer valueOf2 = Integer.valueOf(m4912a(listRoomInfo2));
            if (!listRoomInfo.m1336g()) {
                valueOf = Integer.valueOf(valueOf.intValue() + 20);
            }
            if (!listRoomInfo2.m1336g()) {
                valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
            }
            int compareTo = valueOf.compareTo(valueOf2);
            if (compareTo != 0) {
                return compareTo;
            }
            return listRoomInfo.f6053q.compareTo(listRoomInfo2.f6053q);
        }
    }
}