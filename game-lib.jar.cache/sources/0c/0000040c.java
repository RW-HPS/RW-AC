package com.corrodinggames.rts.game.units;

import android.graphics.Point;
import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0178e;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.p012b.C0180g;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/p.class */
public class C0615p {

    /* renamed from: a */
    static C0623s[] f3903a;

    /* renamed from: b */
    static int f3904b;

    /* renamed from: c */
    static int f3905c;

    /* renamed from: d */
    static C0180g f3906d;

    /* renamed from: a */
    public static void m3105a(EnumC0618r enumC0618r, PointF pointF) {
        float f = pointF.x;
        float f2 = pointF.y;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = gameEngine.f6323bL;
        if (c0173b == null) {
            GameEngine.m5460e("setTerrainType called without map loaded");
            return;
        }
        int i = (int) (f * c0173b.f790r);
        int i2 = (int) (f2 * c0173b.f791s);
        if (!c0173b.m4620c(i, i2)) {
            GameEngine.m5460e("setTerrainType out of map range");
        } else if (c0173b.f834u == null) {
            GameEngine.m5460e("setTerrainType mainLayer missing");
        } else {
            if (!c0173b.f800R) {
                if (c0173b.f801S) {
                    return;
                }
                try {
                    if (c0173b.f835v == null) {
                        c0173b.f835v = new C0178e(c0173b, "grounddetails", c0173b.f793C, c0173b.f794D);
                        c0173b.f838z.add(c0173b.f835v);
                    }
                    if (c0173b.f836w == null) {
                        c0173b.f836w = new C0178e(c0173b, "grounddetails2", c0173b.f793C, c0173b.f794D);
                        c0173b.f838z.add(c0173b.f836w);
                    }
                    c0173b.f834u.f914w = true;
                    c0173b.f835v.f914w = true;
                    c0173b.f836w.f914w = true;
                } catch (C0179f e) {
                    e.printStackTrace();
                    gameEngine.m1008c("Failed to edit map", e.getMessage());
                    c0173b.f801S = true;
                    return;
                }
            }
            try {
                C0180g m4641a = c0173b.m4641a(enumC0618r.mo3082b(), 0, 0);
                if (m4641a == null) {
                    GameEngine.m5460e("setTerrainType mapTile==null");
                    return;
                }
                C0180g m4572a = c0173b.f834u.m4572a(i, i2);
                if (f3904b == i && f3905c == i2 && C0180g.m4562a(f3906d, m4641a)) {
                    return;
                }
                GameEngine.m5460e("setTerrainType changing " + m4572a.f916b + " to " + m4641a.f916b + " at:" + i2 + "," + i2);
                c0173b.f834u.m4571a(i, i2, m4641a, false);
                c0173b.f835v.m4571a(i, i2, null, false);
                c0173b.f836w.m4571a(i, i2, null, false);
                f3904b = i;
                f3905c = i2;
                f3906d = m4641a;
                ArrayList arrayList = new ArrayList();
                arrayList.add(new Point(i, i2));
                for (int i3 = 0; i3 <= 4; i3++) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        Point point = (Point) it.next();
                        m3102a(enumC0618r, m4641a, point.f224a, point.f225b, arrayList2);
                    }
                    arrayList = arrayList2;
                }
                c0173b.m4604g();
                gameEngine.f6332bU.m1179a(c0173b, false);
            } catch (C0179f e2) {
                e2.printStackTrace();
            }
        }
    }

    /* renamed from: a */
    public static void m3102a(EnumC0618r enumC0618r, C0180g c0180g, int i, int i2, ArrayList arrayList) {
        String mo3083a;
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        for (int i3 = -1; i3 <= 1; i3++) {
            for (int i4 = -1; i4 <= 1; i4++) {
                int i5 = i + i3;
                int i6 = i2 + i4;
                if (c0173b.m4620c(i5, i6) && ((i3 != 0 || i4 != 0) && (mo3083a = enumC0618r.mo3083a()) != null && m3103a(enumC0618r, c0180g, i5, i6, i3, i4, mo3083a))) {
                    arrayList.add(new Point(i5, i6));
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3100a(int[] iArr, C0623s c0623s) {
        for (int i : iArr) {
            f3903a[i + 128] = c0623s;
        }
    }

    /* renamed from: a */
    public static void m3109a() {
        f3903a = new C0623s[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
        m3100a(m3108a(1), new C0623s(2, 2));
        m3100a(m3108a(2), new C0623s(0, 2));
        m3100a(m3108a(4), new C0623s(0, 0));
        m3100a(m3108a(8), new C0623s(2, 0));
        m3100a(m3107a(16, 1, 2), new C0623s(1, 2));
        m3100a(m3107a(32, 2, 4), new C0623s(0, 1));
        m3100a(m3107a(64, 8, 4), new C0623s(1, 0));
        m3100a(m3107a(-128, 1, 8), new C0623s(2, 1));
        m3100a(m3107a(16 + 32, 2, 1, 4), new C0623s(0, 6));
        m3100a(m3107a(32 + 64, 4, 8, 2), new C0623s(0, 4));
        m3100a(m3107a(64 - 128, 8, 4, 1), new C0623s(2, 4));
        m3100a(m3107a((-128) + 16, 1, 8, 2), new C0623s(2, 6));
        m3100a(m3108a(1 + 2), new C0623s(1, 1));
        m3100a(m3108a(2 + 4), new C0623s(1, 1));
        m3100a(m3108a(4 + 8), new C0623s(1, 1));
        m3100a(m3108a(8 + 1), new C0623s(1, 1));
        m3100a(m3107a(16 + 32 + 64, 1, 2, 4, 8), new C0623s(1, 1));
        m3100a(m3107a((32 + 64) - 128, 1, 2, 4, 8), new C0623s(1, 1));
        m3100a(m3107a((64 - 128) + 16, 1, 2, 4, 8), new C0623s(1, 1));
        m3100a(m3107a((-128) + 16 + 32, 1, 2, 4, 8), new C0623s(1, 1));
        m3100a(m3107a(16 + 64, 1, 2, 8, 4), new C0623s(1, 1));
        m3100a(m3107a((-128) + 32, 1, 2, 8, 4), new C0623s(1, 1));
        m3100a(m3108a(1 + 4), new C0623s(1, 1));
        m3100a(m3108a(2 + 8), new C0623s(1, 1));
        m3100a(m3107a(16 + 4, 2, 1), new C0623s(1, 1));
        m3100a(m3107a(64 + 2, 4, 8), new C0623s(1, 1));
        m3100a(m3107a((-128) + 2, 1, 8), new C0623s(1, 1));
        m3100a(m3107a(32 + 1, 2, 4), new C0623s(1, 1));
        m3100a(m3107a(16 + 4 + 8, 2, 1), new C0623s(1, 1));
        m3100a(m3107a(64 + 2 + 1, 4, 8), new C0623s(1, 1));
        m3100a(m3107a((-128) + 2 + 4, 1, 8), new C0623s(1, 1));
        m3100a(m3107a(32 + 1 + 8, 2, 4), new C0623s(1, 1));
        m3100a(m3108a(-1), new C0623s(1, 1));
    }

    /* renamed from: a */
    private static int[] m3108a(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m3107a(int i, int... iArr) {
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

    /* renamed from: a */
    public static boolean m3103a(EnumC0618r enumC0618r, C0180g c0180g, int i, int i2, int i3, int i4, String str) {
        C0180g m4641a;
        boolean z = false;
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        byte m3099b = m3099b(enumC0618r, c0180g, i, i2);
        if (f3903a == null) {
            m3109a();
        }
        C0623s c0623s = f3903a[m3099b + 128];
        if (c0623s == null) {
            return false;
        }
        if (c0623s.f3913a == 1 && c0623s.f3914b == 1) {
            c0173b.f834u.m4571a(i, i2, c0180g, false);
            m4641a = null;
            z = true;
        } else {
            try {
                m4641a = c0173b.m4641a(str, c0623s.f3913a, c0623s.f3914b);
            } catch (C0179f e) {
                e.printStackTrace();
                return false;
            }
        }
        m3101a(enumC0618r, c0180g, m4641a, i, i2);
        return z;
    }

    /* renamed from: a */
    public static void m3101a(EnumC0618r enumC0618r, C0180g c0180g, C0180g c0180g2, int i, int i2) {
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        C0180g m4572a = c0173b.f834u.m4572a(i, i2);
        C0180g m4572a2 = c0173b.f835v.m4572a(i, i2);
        C0180g m4572a3 = c0173b.f836w.m4572a(i, i2);
        EnumC0618r m3106a = m3106a(m4572a2);
        EnumC0618r m3106a2 = m3106a(m4572a3);
        if (m3106a == enumC0618r) {
            c0173b.f835v.m4571a(i, i2, null, false);
            m4572a2 = null;
        }
        if (m3106a2 == enumC0618r) {
            c0173b.f836w.m4571a(i, i2, null, false);
            m4572a3 = null;
            m3106a2 = null;
        }
        if (m4572a2 == null && m4572a3 != null) {
            c0173b.f835v.m4571a(i, i2, m4572a3, false);
            c0173b.f836w.m4571a(i, i2, null, false);
            m4572a2 = m4572a3;
            m4572a3 = null;
        }
        if (C0180g.m4562a(m4572a, c0180g) || c0180g2 == null) {
            return;
        }
        if (m4572a2 != null) {
            if (m4572a3 != null) {
                c0173b.f835v.m4571a(i, i2, m4572a3, false);
            }
            c0173b.f836w.m4571a(i, i2, c0180g2, false);
            return;
        }
        c0173b.f835v.m4571a(i, i2, c0180g2, false);
    }

    /* renamed from: a */
    public static EnumC0618r m3106a(C0180g c0180g) {
        EnumC0618r[] values;
        if (c0180g == null) {
            return null;
        }
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        for (EnumC0618r enumC0618r : EnumC0618r.values()) {
            String str = c0180g.f915a.f951a;
            if (str != null && str.equals(enumC0618r.mo3082b())) {
                return enumC0618r;
            }
            if (str != null && str.equals(enumC0618r.mo3083a())) {
                return enumC0618r;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static boolean m3104a(EnumC0618r enumC0618r, C0180g c0180g, int i, int i2) {
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        if (c0173b.m4620c(i, i2) && C0180g.m4562a(c0173b.f834u.m4572a(i, i2), c0180g)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public static byte m3099b(EnumC0618r enumC0618r, C0180g c0180g, int i, int i2) {
        byte b = 0;
        C0173b c0173b = GameEngine.getGameEngine().f6323bL;
        int i3 = c0173b.f793C;
        int i4 = c0173b.f794D;
        if (i >= 1) {
            if (m3104a(enumC0618r, c0180g, i - 1, i2)) {
                b = (byte) (0 - 128);
            }
            if (i2 >= 1 && m3104a(enumC0618r, c0180g, i - 1, i2 - 1)) {
                b = (byte) (b + 1);
            }
            if (i2 < i4 - 1 && m3104a(enumC0618r, c0180g, i - 1, i2 + 1)) {
                b = (byte) (b + 8);
            }
        }
        if (i2 >= 1) {
            if (m3104a(enumC0618r, c0180g, i, i2 - 1)) {
                b = (byte) (b + 16);
            }
            if (i < i3 - 1 && m3104a(enumC0618r, c0180g, i + 1, i2 - 1)) {
                b = (byte) (b + 2);
            }
        }
        if (i < i3 - 1 && m3104a(enumC0618r, c0180g, i + 1, i2)) {
            b = (byte) (b + 32);
        }
        if (i2 < i4 - 1) {
            if (m3104a(enumC0618r, c0180g, i, i2 + 1)) {
                b = (byte) (b + 64);
            }
            if (i < i3 - 1 && m3104a(enumC0618r, c0180g, i + 1, i2 + 1)) {
                b = (byte) (b + 4);
            }
        }
        return b;
    }
}