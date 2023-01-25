package com.corrodinggames.rts.game.units.custom.p019c;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.EnumC0914m;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c/c.class */
public class C0423c {

    /* renamed from: d */
    C1136m f2699d = new C1136m();

    /* renamed from: f */
    public static C0426f f2701f;

    /* renamed from: a */
    static final Rect f2696a = new Rect();

    /* renamed from: b */
    static final RectF f2697b = new RectF();

    /* renamed from: c */
    static final Paint f2698c = new Paint();

    /* renamed from: e */
    static Paint f2700e = new Paint();

    static {
        f2700e.m5222a(255, 0, 0, 200);
        f2701f = new C0426f();
    }

    /* renamed from: a */
    public void m3857a(C0458l c0458l) {
        Object[] m535a = this.f2699d.m535a();
        for (int i = this.f2699d.f7109a - 1; i >= 0; i--) {
            C0425e c0425e = (C0425e) m535a[i];
            C0421a m3555a = c0458l.m3555a(c0425e.f2706a.f2695g);
            if (m3555a != null) {
                c0425e.f2706a = m3555a;
                while (c0425e.f2707b.size() > c0425e.f2706a.f2692d) {
                    c0425e.f2707b.remove(c0425e.f2707b.size() - 1);
                }
            } else {
                this.f2699d.remove(i);
            }
        }
    }

    /* renamed from: a */
    public C0425e m3858a(C0421a c0421a, boolean z) {
        int i = this.f2699d.f7109a;
        Object[] m535a = this.f2699d.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0425e c0425e = (C0425e) m535a[i2];
            if (c0425e.f2706a == c0421a) {
                return c0425e;
            }
        }
        if (z) {
            C0425e c0425e2 = new C0425e(c0421a);
            this.f2699d.add(c0425e2);
            return c0425e2;
        }
        return null;
    }

    /* renamed from: a */
    public int m3859a(C0421a c0421a) {
        C0425e m3858a = m3858a(c0421a, false);
        if (m3858a == null) {
            return 0;
        }
        return m3858a.f2707b.f7109a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v71, types: [android.graphics.Paint] */
    /* renamed from: a */
    public void m3861a(float f, AbstractC0244am abstractC0244am) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int i = this.f2699d.f7109a;
        if (i == 0) {
            return;
        }
        Object[] m535a = this.f2699d.m535a();
        for (int i2 = 0; i2 < i; i2++) {
            C0425e c0425e = (C0425e) m535a[i2];
            C0421a c0421a = c0425e.f2706a;
            int i3 = c0425e.f2707b.f7109a;
            Object[] m535a2 = c0425e.f2707b.m535a();
            for (int i4 = i3 - 1; i4 >= 0; i4--) {
                C0424d c0424d = (C0424d) m535a2[i4];
                if (c0424d.f2704c) {
                    AbstractC0244am abstractC0244am2 = c0424d.f2702a;
                    if (c0421a.f2693e != null) {
                        C0970e c0970e = c0421a.f2693e;
                        float f2 = abstractC0244am.f7173eo - GameEngine.getGameEngine().f6408cw;
                        float f3 = ((abstractC0244am.f7174ep - GameEngine.getGameEngine().f6409cx) - abstractC0244am.f7175eq) - 10.0f;
                        float f4 = c0970e.f6627u;
                        float m2138d = C0773f.m2138d(abstractC0244am.f7173eo, abstractC0244am.f7174ep - abstractC0244am.f7175eq, abstractC0244am2.f7173eo, abstractC0244am2.f7174ep - abstractC0244am2.f7175eq);
                        float m2216a = C0773f.m2216a(abstractC0244am.f7173eo, abstractC0244am.f7174ep - abstractC0244am.f7175eq, abstractC0244am2.f7173eo, abstractC0244am2.f7174ep - abstractC0244am2.f7175eq);
                        if (m2216a < (c0970e.f6623q - 2) * (c0970e.f6623q - 2)) {
                            f4 = C0773f.m2211a((int) m2216a);
                        }
                        gameEngine.f6374bO.mo136k();
                        gameEngine.f6374bO.mo228a(m2138d + 90.0f, f2, f3);
                        f2696a.m5166a(0, (int) (c0970e.f6623q - f4), c0970e.f6622p, c0970e.f6623q);
                        f2697b.m5152a(f2 - c0970e.f6624r, f3 - f4, f2 + c0970e.f6624r, f3);
                        C0966ag c0966ag = C0966ag.f6590r;
                        if (c0424d.f2705d != 0.0f) {
                            c0966ag = f2698c;
                            int abs = (int) Math.abs(c0424d.f2705d * 5.0f);
                            if (abs > 250) {
                                abs = 250;
                            }
                            c0966ag.m5222a(255, 255, 255 - abs, 255 - abs);
                        }
                        gameEngine.f6374bO.mo193a(c0970e, f2696a, f2697b, c0966ag);
                        gameEngine.f6374bO.mo135l();
                    }
                    if (c0421a.f2694f != null) {
                        gameEngine.f6374bO.mo226a(abstractC0244am.f7173eo - gameEngine.f6408cw, (abstractC0244am.f7174ep - gameEngine.f6409cx) - abstractC0244am.f7175eq, abstractC0244am2.f7173eo - gameEngine.f6408cw, (abstractC0244am2.f7174ep - gameEngine.f6409cx) - abstractC0244am2.f7175eq, c0421a.f2694f);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3856a(GameOutputStream gameOutputStream) {
        if (this.f2699d.f7109a == 0) {
            gameOutputStream.writeByte(-1);
            return;
        }
        gameOutputStream.writeByte(0);
        short size = (short) this.f2699d.size();
        gameOutputStream.mo1331a(size);
        Object[] m535a = this.f2699d.m535a();
        for (int i = 0; i < size; i++) {
            C0425e c0425e = (C0425e) m535a[i];
            gameOutputStream.m1400a(c0425e.f2706a.f2695g);
            gameOutputStream.mo1331a((short) c0425e.f2707b.size());
            Iterator it = c0425e.f2707b.iterator();
            while (it.hasNext()) {
                C0424d c0424d = (C0424d) it.next();
                gameOutputStream.mo1334a(c0424d.f2702a);
                gameOutputStream.writeBoolean(c0424d.f2703b);
                gameOutputStream.writeBoolean(c0424d.f2704c);
            }
        }
    }

    /* renamed from: a */
    public void m3860a(AbstractC0244am abstractC0244am, GameInputStream gameInputStream) {
        if (gameInputStream.readByte() == -1) {
            return;
        }
        int readShort = gameInputStream.readShort();
        this.f2699d.clear();
        for (int i = 0; i < readShort; i++) {
            C0453g m1295m = gameInputStream.m1295m();
            C0421a c0421a = null;
            if (abstractC0244am instanceof C0456j) {
                c0421a = ((C0456j) abstractC0244am).f2891x.m3555a(m1295m);
            }
            C0425e c0425e = null;
            if (c0421a != null) {
                c0425e = new C0425e(c0421a);
                this.f2699d.add(c0425e);
            }
            int readShort2 = gameInputStream.readShort();
            for (int i2 = 0; i2 < readShort2; i2++) {
                C0424d c0424d = new C0424d();
                c0424d.f2702a = gameInputStream.m1318a(EnumC0914m.expected);
                c0424d.f2703b = gameInputStream.readBoolean();
                c0424d.f2704c = gameInputStream.readBoolean();
                if (c0424d.f2702a != null && c0425e != null) {
                    c0425e.f2707b.add(c0424d);
                }
            }
        }
    }
}