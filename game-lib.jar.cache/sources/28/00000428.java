package com.corrodinggames.rts.gameFramework;

import android.graphics.PointF;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/aa.class */
public class aa extends bq {

    /* renamed from: a  reason: collision with root package name */
    int f398a;
    PointF b = new PointF();

    public void a() {
        this.f398a = 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(0);
        gameOutputStream.writeInt(this.f398a);
    }

    public void a(GameInputStream gameInputStream) {
        gameInputStream.readInt();
        this.f398a = gameInputStream.readInt();
    }

    public void a(float f) {
    }

    public ab b() {
        ab abVar = new ab(this);
        abVar.e = this.f398a;
        this.f398a++;
        return abVar;
    }

    public ab c() {
        ab abVar = new ab(this);
        abVar.e = -1;
        abVar.b = true;
        return abVar;
    }

    public void a(com.corrodinggames.rts.gameFramework.utility.m mVar, com.corrodinggames.rts.game.units.y yVar, com.corrodinggames.rts.gameFramework.utility.m mVar2, float f, int i) {
        int i2 = 0;
        while (!mVar2.isEmpty()) {
            com.corrodinggames.rts.game.units.y yVar2 = null;
            float f2 = -1.0f;
            PointF pointF = null;
            int i3 = -1;
            Object[] a2 = mVar2.a();
            Object[] a3 = mVar.a();
            int size = mVar.size();
            for (int i4 = 0; i4 < size; i4++) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) a3[i4];
                if (yVar3.ad == yVar && !yVar3.aj) {
                    float f3 = -1.0f;
                    PointF pointF2 = null;
                    int i5 = -1;
                    for (int i6 = 0; i6 < mVar2.f689a; i6++) {
                        PointF pointF3 = (PointF) a2[i6];
                        float a4 = f.a(yVar3.eo, yVar3.ep, yVar.eo + pointF3.x, yVar.ep + pointF3.y);
                        if (f3 == -1.0f || a4 < f3) {
                            f3 = a4;
                            pointF2 = pointF3;
                            i5 = i6;
                        }
                    }
                    if (f3 > f2) {
                        yVar2 = yVar3;
                        f2 = f3;
                        pointF = pointF2;
                        i3 = i5;
                    }
                }
            }
            if (yVar2 != null) {
                i2++;
                yVar2.aj = true;
                yVar2.ak = pointF.x;
                yVar2.al = pointF.y;
                yVar2.am = f;
                yVar2.ao = f2;
                yVar2.ah = (short) (i + 1);
                mVar2.remove(i3);
            } else {
                return;
            }
        }
    }

    public void a(com.corrodinggames.rts.gameFramework.utility.m mVar, com.corrodinggames.rts.game.units.y yVar) {
        while (true) {
            com.corrodinggames.rts.game.units.y yVar2 = null;
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) it.next();
                if (yVar3.ad == yVar && yVar3.ao > 0.0f && (yVar2 == null || yVar3.ao > yVar2.ao)) {
                    if (yVar3.aj && yVar3.ao > 100.0f) {
                        yVar2 = yVar3;
                    }
                }
            }
            if (yVar2 != null) {
                yVar2.aj = false;
                com.corrodinggames.rts.game.units.y yVar4 = null;
                float f = 0.0f;
                com.corrodinggames.rts.game.units.y yVar5 = yVar2;
                int a2 = f.a((int) yVar5.ao);
                Iterator it2 = mVar.iterator();
                while (it2.hasNext()) {
                    com.corrodinggames.rts.game.units.y yVar6 = (com.corrodinggames.rts.game.units.y) it2.next();
                    if (yVar6.ad == yVar && yVar6.ao > 0.0f && yVar6 != yVar5) {
                        float c = ((0 + f.c(yVar5.eo, yVar5.ep, yVar.eo + yVar6.ak, yVar.ep + yVar6.al)) + f.c(yVar6.eo, yVar6.ep, yVar.eo + yVar5.ak, yVar.ep + yVar5.al)) - (f.a((int) yVar6.ao) + a2);
                        if (c < f) {
                            f = c;
                            yVar4 = yVar6;
                        }
                    }
                }
                if (yVar4 != null) {
                    float f2 = yVar5.ak;
                    float f3 = yVar5.al;
                    yVar5.ak = yVar4.ak;
                    yVar5.al = yVar4.al;
                    yVar5.ao = f.a(yVar5.eo, yVar5.ep, yVar.eo + yVar5.ak, yVar.ep + yVar5.al);
                    yVar4.ak = f2;
                    yVar4.al = f3;
                    yVar4.ao = f.a(yVar4.eo, yVar4.ep, yVar.eo + yVar4.ak, yVar.ep + yVar4.al);
                }
            } else {
                return;
            }
        }
    }

    public com.corrodinggames.rts.gameFramework.utility.m a(int i, float f, float f2) {
        int i2;
        int i3 = 1;
        int i4 = 0;
        int i5 = 6 / 2;
        float f3 = 2.0f + (f * 2.0f * 1.5f);
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        int i6 = i;
        if (i6 % 2 != 0) {
            i6++;
        }
        float k = f.k(f2);
        float j = f.j(f2);
        for (int i7 = 0; i7 < i6; i7++) {
            if (i3 % 2 == 0) {
                i2 = i5 + (i3 / 2);
            } else {
                i2 = i5 - ((i3 + 1) / 2);
            }
            float f4 = (i2 - i5) * f3;
            float f5 = (-i4) * f3;
            mVar.add(new PointF((f5 * k) - (f4 * j), (f4 * k) + (f5 * j)));
            i3++;
            if (i3 > 6) {
                i3 = 0;
                i4++;
            }
        }
        return mVar;
    }
}