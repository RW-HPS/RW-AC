package com.corrodinggames.rts.game;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0410bh;
import com.corrodinggames.rts.game.units.custom.C0411bi;
import com.corrodinggames.rts.game.units.custom.C0418bp;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0473z;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/g.class */
public class C0189g {

    /* renamed from: a */
    public static final C0189g f1100a = new C0189g();

    /* renamed from: b */
    public int f1101b;

    /* renamed from: c */
    public int f1102c;

    /* renamed from: d */
    public boolean f1103d;

    /* renamed from: e */
    public boolean f1104e;

    /* renamed from: f */
    public boolean f1105f;

    /* renamed from: g */
    public boolean f1106g;

    /* renamed from: h */
    public boolean f1107h;

    /* renamed from: u */
    public float f1120u;

    /* renamed from: v */
    public float f1121v;

    /* renamed from: y */
    public short f1124y;

    /* renamed from: A */
    public boolean f1126A;

    /* renamed from: B */
    public C0970e f1127B;

    /* renamed from: C */
    public C0970e f1128C;

    /* renamed from: D */
    public float f1129D;

    /* renamed from: E */
    public float f1130E;

    /* renamed from: F */
    public float f1131F;

    /* renamed from: G */
    public float f1132G;

    /* renamed from: H */
    public float f1133H;

    /* renamed from: Q */
    public float f1142Q;

    /* renamed from: R */
    public float f1143R;

    /* renamed from: S */
    public float f1144S;

    /* renamed from: T */
    public boolean f1145T;

    /* renamed from: Y */
    public C0970e f1150Y;

    /* renamed from: Z */
    public C0970e f1151Z;

    /* renamed from: aa */
    public boolean f1152aa;

    /* renamed from: ab */
    public C0970e f1153ab;

    /* renamed from: ac */
    public boolean f1154ac;

    /* renamed from: ad */
    public float f1155ad;

    /* renamed from: ah */
    public C0473z f1159ah;

    /* renamed from: ai */
    public C0473z f1160ai;

    /* renamed from: aj */
    public C0411bi f1161aj;

    /* renamed from: ak */
    public C0411bi f1162ak;

    /* renamed from: al */
    public C0411bi f1163al;

    /* renamed from: am */
    public float f1164am;

    /* renamed from: aq */
    public boolean f1168aq;

    /* renamed from: az */
    public boolean f1177az;

    /* renamed from: aD */
    public C0454h f1181aD;

    /* renamed from: aI */
    public boolean f1186aI;

    /* renamed from: aK */
    public float f1188aK;

    /* renamed from: aL */
    public float f1189aL;

    /* renamed from: aM */
    public float f1190aM;

    /* renamed from: aN */
    public boolean f1191aN;

    /* renamed from: aO */
    public boolean f1192aO;

    /* renamed from: aP */
    public float f1193aP;

    /* renamed from: aQ */
    public float f1194aQ;

    /* renamed from: aV */
    public float f1199aV;

    /* renamed from: aX */
    public C0473z f1201aX;

    /* renamed from: aY */
    public C0473z f1202aY;

    /* renamed from: aZ */
    public C0418bp f1203aZ;

    /* renamed from: ba */
    public int f1204ba;

    /* renamed from: bb */
    public boolean f1205bb;

    /* renamed from: bc */
    public boolean f1206bc;

    /* renamed from: bd */
    public C0454h f1207bd;

    /* renamed from: i */
    public int f1108i = 35;

    /* renamed from: j */
    public float f1109j = -1.0f;

    /* renamed from: k */
    public boolean f1110k = false;

    /* renamed from: l */
    public boolean f1111l = false;

    /* renamed from: m */
    public boolean f1112m = false;

    /* renamed from: n */
    public boolean f1113n = false;

    /* renamed from: o */
    public float f1114o = 1.0f;

    /* renamed from: p */
    public boolean f1115p = false;

    /* renamed from: q */
    public boolean f1116q = false;

    /* renamed from: r */
    public boolean f1117r = false;

    /* renamed from: s */
    public boolean f1118s = false;

    /* renamed from: t */
    public boolean f1119t = false;

    /* renamed from: w */
    public float f1122w = 5.0f;

    /* renamed from: x */
    public short f1123x = -1;

    /* renamed from: z */
    public short f1125z = -1;

    /* renamed from: I */
    public boolean f1134I = false;

    /* renamed from: J */
    public boolean f1135J = false;

    /* renamed from: K */
    public float f1136K = -1.0f;

    /* renamed from: L */
    public boolean f1137L = false;

    /* renamed from: M */
    public boolean f1138M = false;

    /* renamed from: N */
    public boolean f1139N = false;

    /* renamed from: O */
    public float f1140O = -1.0f;

    /* renamed from: P */
    public float f1141P = -1.0f;

    /* renamed from: U */
    public boolean f1146U = false;

    /* renamed from: V */
    public boolean f1147V = false;

    /* renamed from: W */
    public boolean f1148W = false;

    /* renamed from: X */
    public boolean f1149X = false;

    /* renamed from: ae */
    public boolean f1156ae = false;

    /* renamed from: af */
    public boolean f1157af = false;

    /* renamed from: ag */
    public float f1158ag = 3.0f;

    /* renamed from: an */
    public float f1165an = 5.0f;

    /* renamed from: ao */
    public int f1166ao = -1;

    /* renamed from: ap */
    public float f1167ap = 0.5f;

    /* renamed from: ar */
    public boolean f1169ar = false;

    /* renamed from: as */
    public float f1170as = -1.0f;

    /* renamed from: at */
    public float f1171at = -1.0f;

    /* renamed from: au */
    public float f1172au = -1.0f;

    /* renamed from: av */
    public float f1173av = 0.1f;

    /* renamed from: aw */
    public boolean f1174aw = false;

    /* renamed from: ax */
    public float f1175ax = 120.0f;

    /* renamed from: ay */
    public float f1176ay = 15.0f;

    /* renamed from: aA */
    public float f1178aA = 5.0f;

    /* renamed from: aB */
    public float f1179aB = 120.0f;

    /* renamed from: aC */
    public float f1180aC = 15.0f;

    /* renamed from: aE */
    public int f1182aE = Color.m5237a(255, 255, 255, 255);

    /* renamed from: aF */
    public float f1183aF = 1.0f;

    /* renamed from: aG */
    public float f1184aG = 0.0f;

    /* renamed from: aH */
    public float f1185aH = 1.0f;

    /* renamed from: aJ */
    public boolean f1187aJ = true;

    /* renamed from: aR */
    public float f1195aR = 1.0f;

    /* renamed from: aS */
    public float f1196aS = 1.0f;

    /* renamed from: aT */
    public float f1197aT = 1.0f;

    /* renamed from: aU */
    public float f1198aU = 1.0f;

    /* renamed from: aW */
    public float f1200aW = -1.0f;

    /* renamed from: be */
    public C1136m f1208be = null;

    /* renamed from: bf */
    public C1136m f1209bf = null;

    /* renamed from: bg */
    public C1136m f1210bg = null;

    /* renamed from: a */
    public C0473z m4511a(AbstractC0244am abstractC0244am) {
        C1136m c1136m = this.f1210bg;
        if (c1136m != null && c1136m.f7109a > 0) {
            Iterator it = c1136m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m4508a(abstractC0244am) && c0190h.f1217g != null) {
                    return c0190h.f1217g;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public float m4510a(AbstractC0244am abstractC0244am, float f, boolean z) {
        C1136m c1136m;
        float f2;
        if (!z) {
            c1136m = this.f1208be;
        } else {
            c1136m = this.f1209bf;
        }
        if (c1136m != null && c1136m.f7109a > 0) {
            Iterator it = c1136m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m4508a(abstractC0244am)) {
                    if (!z) {
                        if (c0190h.f1215e != null) {
                            c0190h.f1215e.m3809h(abstractC0244am);
                        }
                        f2 = c0190h.f1213c;
                    } else {
                        if (c0190h.f1216f != null) {
                            c0190h.f1216f.m3809h(abstractC0244am);
                        }
                        f2 = c0190h.f1214d;
                    }
                    f *= f2;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public static void m4512a(C0189g c0189g, GameOutputStream gameOutputStream) {
        if (c0189g == f1100a) {
            gameOutputStream.writeByte(0);
        } else if (c0189g instanceof C0410bh) {
            gameOutputStream.writeByte(1);
            C0410bh.m3897a((C0410bh) c0189g, gameOutputStream);
        } else {
            GameEngine.m990g("writeOutLink: Unhandled projectile type");
            gameOutputStream.writeByte(0);
        }
    }

    /* renamed from: a */
    public static C0189g m4509a(GameInputStream gameInputStream) {
        byte readByte = gameInputStream.readByte();
        if (readByte == 0) {
            return f1100a;
        }
        if (readByte == 1) {
            C0189g m3896b = C0410bh.m3896b(gameInputStream);
            if (m3896b == null) {
                return f1100a;
            }
            return m3896b;
        }
        throw new IOException("Unknown projectile type:" + ((int) readByte));
    }
}