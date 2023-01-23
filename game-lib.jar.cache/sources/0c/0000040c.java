package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/p.class */
public class p {

    /* renamed from: a  reason: collision with root package name */
    static s[] f385a;
    static int b;
    static int c;
    static com.corrodinggames.rts.game.b.g d;

    public static void a(r rVar, PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        GameEngine gameEngine = GameEngine.getGameEngine();
        com.corrodinggames.rts.game.b.b bVar = gameEngine.bL;
        if (bVar == null) {
            GameEngine.m328e("setTerrainType called without map loaded");
            return;
        }
        int i = (int) (f * bVar.r);
        int i2 = (int) (f2 * bVar.s);
        if (!bVar.c(i, i2)) {
            GameEngine.m328e("setTerrainType out of map range");
        } else if (bVar.u == null) {
            GameEngine.m328e("setTerrainType mainLayer missing");
        } else {
            if (!bVar.R) {
                if (bVar.S) {
                    return;
                }
                try {
                    if (bVar.v == null) {
                        bVar.v = new com.corrodinggames.rts.game.b.e(bVar, "grounddetails", bVar.C, bVar.D);
                        bVar.z.add(bVar.v);
                    }
                    if (bVar.w == null) {
                        bVar.w = new com.corrodinggames.rts.game.b.e(bVar, "grounddetails2", bVar.C, bVar.D);
                        bVar.z.add(bVar.w);
                    }
                    bVar.u.w = true;
                    bVar.v.w = true;
                    bVar.w.w = true;
                } catch (com.corrodinggames.rts.game.b.f e) {
                    e.printStackTrace();
                    gameEngine.c("Failed to edit map", e.getMessage());
                    bVar.S = true;
                    return;
                }
            }
            try {
                com.corrodinggames.rts.game.b.g a2 = bVar.a(rVar.b(), 0, 0);
                if (a2 == null) {
                    GameEngine.m328e("setTerrainType mapTile==null");
                    return;
                }
                com.corrodinggames.rts.game.b.g a3 = bVar.u.a(i, i2);
                if (b == i && c == i2 && com.corrodinggames.rts.game.b.g.a(d, a2)) {
                    return;
                }
                GameEngine.m328e("setTerrainType changing " + a3.b + " to " + a2.b + " at:" + i2 + "," + i2);
                bVar.u.a(i, i2, a2, false);
                bVar.v.a(i, i2, null, false);
                bVar.w.a(i, i2, null, false);
                b = i;
                c = i2;
                d = a2;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Point(i, i2));
                for (int i3 = 0; i3 <= 4; i3++) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Point point = (Point) it.next();
                        a(rVar, a2, point.f45a, point.b, arrayList2);
                    }
                    arrayList = arrayList2;
                }
                bVar.g();
                gameEngine.bU.a(bVar, false);
            } catch (com.corrodinggames.rts.game.b.f e2) {
                e2.printStackTrace();
            }
        }
    }

    public static void a(r rVar, com.corrodinggames.rts.game.b.g gVar, int i, int i2, ArrayList arrayList) {
        String a2;
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        for (int i3 = -1; i3 <= 1; i3++) {
            for (int i4 = -1; i4 <= 1; i4++) {
                int i5 = i + i3;
                int i6 = i2 + i4;
                if (bVar.c(i5, i6) && ((i3 != 0 || i4 != 0) && (a2 = rVar.a()) != null && a(rVar, gVar, i5, i6, i3, i4, a2))) {
                    arrayList.add(new Point(i5, i6));
                }
            }
        }
    }

    public static void a(int[] iArr, s sVar) {
        for (int i : iArr) {
            f385a[i + 128] = sVar;
        }
    }

    public static void a() {
        f385a = new s[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        a(a(1), new s(2, 2));
        a(a(2), new s(0, 2));
        a(a(4), new s(0, 0));
        a(a(8), new s(2, 0));
        a(a(16, 1, 2), new s(1, 2));
        a(a(32, 2, 4), new s(0, 1));
        a(a(64, 8, 4), new s(1, 0));
        a(a(-128, 1, 8), new s(2, 1));
        a(a(16 + 32, 2, 1, 4), new s(0, 6));
        a(a(32 + 64, 4, 8, 2), new s(0, 4));
        a(a(64 - 128, 8, 4, 1), new s(2, 4));
        a(a((-128) + 16, 1, 8, 2), new s(2, 6));
        a(a(1 + 2), new s(1, 1));
        a(a(2 + 4), new s(1, 1));
        a(a(4 + 8), new s(1, 1));
        a(a(8 + 1), new s(1, 1));
        a(a(16 + 32 + 64, 1, 2, 4, 8), new s(1, 1));
        a(a((32 + 64) - 128, 1, 2, 4, 8), new s(1, 1));
        a(a((64 - 128) + 16, 1, 2, 4, 8), new s(1, 1));
        a(a((-128) + 16 + 32, 1, 2, 4, 8), new s(1, 1));
        a(a(16 + 64, 1, 2, 8, 4), new s(1, 1));
        a(a((-128) + 32, 1, 2, 8, 4), new s(1, 1));
        a(a(1 + 4), new s(1, 1));
        a(a(2 + 8), new s(1, 1));
        a(a(16 + 4, 2, 1), new s(1, 1));
        a(a(64 + 2, 4, 8), new s(1, 1));
        a(a((-128) + 2, 1, 8), new s(1, 1));
        a(a(32 + 1, 2, 4), new s(1, 1));
        a(a(16 + 4 + 8, 2, 1), new s(1, 1));
        a(a(64 + 2 + 1, 4, 8), new s(1, 1));
        a(a((-128) + 2 + 4, 1, 8), new s(1, 1));
        a(a(32 + 1 + 8, 2, 4), new s(1, 1));
        a(a(-1), new s(1, 1));
    }

    private static int[] a(int i) {
        return new int[]{i};
    }

    private static int[] a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    public static boolean a(r rVar, com.corrodinggames.rts.game.b.g gVar, int i, int i2, int i3, int i4, String str) {
        com.corrodinggames.rts.game.b.g a2;
        boolean z = false;
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        byte b2 = b(rVar, gVar, i, i2);
        if (f385a == null) {
            a();
        }
        s sVar = f385a[b2 + 128];
        if (sVar == null) {
            return false;
        }
        if (sVar.f388a == 1 && sVar.b == 1) {
            bVar.u.a(i, i2, gVar, false);
            a2 = null;
            z = true;
        } else {
            try {
                a2 = bVar.a(str, sVar.f388a, sVar.b);
            } catch (com.corrodinggames.rts.game.b.f e) {
                e.printStackTrace();
                return false;
            }
        }
        a(rVar, gVar, a2, i, i2);
        return z;
    }

    public static void a(r rVar, com.corrodinggames.rts.game.b.g gVar, com.corrodinggames.rts.game.b.g gVar2, int i, int i2) {
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        com.corrodinggames.rts.game.b.g a2 = bVar.u.a(i, i2);
        com.corrodinggames.rts.game.b.g a3 = bVar.v.a(i, i2);
        com.corrodinggames.rts.game.b.g a4 = bVar.w.a(i, i2);
        r a5 = a(a3);
        r a6 = a(a4);
        if (a5 == rVar) {
            bVar.v.a(i, i2, null, false);
            a3 = null;
        }
        if (a6 == rVar) {
            bVar.w.a(i, i2, null, false);
            a4 = null;
            a6 = null;
        }
        if (a3 == null && a4 != null) {
            bVar.v.a(i, i2, a4, false);
            bVar.w.a(i, i2, null, false);
            a3 = a4;
            a4 = null;
        }
        if (com.corrodinggames.rts.game.b.g.a(a2, gVar) || gVar2 == null) {
            return;
        }
        if (a3 != null) {
            if (a4 != null) {
                bVar.v.a(i, i2, a4, false);
            }
            bVar.w.a(i, i2, gVar2, false);
            return;
        }
        bVar.v.a(i, i2, gVar2, false);
    }

    public static r a(com.corrodinggames.rts.game.b.g gVar) {
        r[] values;
        if (gVar == null) {
            return null;
        }
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        for (r rVar : r.values()) {
            String str = gVar.f152a.f155a;
            if (str != null && str.equals(rVar.b())) {
                return rVar;
            }
            if (str != null && str.equals(rVar.a())) {
                return rVar;
            }
        }
        return null;
    }

    public static boolean a(r rVar, com.corrodinggames.rts.game.b.g gVar, int i, int i2) {
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        if (bVar.c(i, i2) && com.corrodinggames.rts.game.b.g.a(bVar.u.a(i, i2), gVar)) {
            return true;
        }
        return false;
    }

    public static byte b(r rVar, com.corrodinggames.rts.game.b.g gVar, int i, int i2) {
        byte b2 = 0;
        com.corrodinggames.rts.game.b.b bVar = GameEngine.getGameEngine().bL;
        int i3 = bVar.C;
        int i4 = bVar.D;
        if (i >= 1) {
            if (a(rVar, gVar, i - 1, i2)) {
                b2 = (byte) (0 - 128);
            }
            if (i2 >= 1 && a(rVar, gVar, i - 1, i2 - 1)) {
                b2 = (byte) (b2 + 1);
            }
            if (i2 < i4 - 1 && a(rVar, gVar, i - 1, i2 + 1)) {
                b2 = (byte) (b2 + 8);
            }
        }
        if (i2 >= 1) {
            if (a(rVar, gVar, i, i2 - 1)) {
                b2 = (byte) (b2 + 16);
            }
            if (i < i3 - 1 && a(rVar, gVar, i + 1, i2 - 1)) {
                b2 = (byte) (b2 + 2);
            }
        }
        if (i < i3 - 1 && a(rVar, gVar, i + 1, i2)) {
            b2 = (byte) (b2 + 32);
        }
        if (i2 < i4 - 1) {
            if (a(rVar, gVar, i, i2 + 1)) {
                b2 = (byte) (b2 + 64);
            }
            if (i < i3 - 1 && a(rVar, gVar, i + 1, i2 + 1)) {
                b2 = (byte) (b2 + 4);
            }
        }
        return b2;
    }
}