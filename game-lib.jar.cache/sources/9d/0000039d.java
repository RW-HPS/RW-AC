package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.gameFramework.AbstractC0741bq;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.d.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/j.class */
public class C0504j extends AbstractC0741bq {

    /* renamed from: a */
    public int f3516a;

    /* renamed from: b */
    public float f3517b;

    /* renamed from: e */
    public C0454h f3518e;

    /* renamed from: f */
    public boolean f3519f;

    /* renamed from: g */
    public InterfaceC0303as f3520g;

    /* renamed from: h */
    public PointF f3521h;

    /* renamed from: i */
    public AbstractC0244am f3522i;

    /* renamed from: k */
    public boolean f3523k;

    /* renamed from: l */
    public boolean f3524l;

    /* renamed from: c */
    public C0429b f3525c = C0429b.f2734a;

    /* renamed from: d */
    public C0429b f3526d = null;

    /* renamed from: j */
    public C0208c f3527j = AbstractC0224s.f1466i;

    /* renamed from: m */
    public float f3528m = -1.0f;

    /* renamed from: n */
    public double f3529n = 0.0d;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeInt(-1);
        gameOutputStream.writeInt(this.f3516a);
        gameOutputStream.writeFloat(this.f3517b);
        gameOutputStream.writeInt(-1);
        gameOutputStream.writeInt(this.f3525c.m3852a());
        gameOutputStream.writeBoolean(this.f3519f);
        gameOutputStream.writeString(this.f3527j.m4340a());
        gameOutputStream.writeString(this.f3527j.m4340a());
        gameOutputStream.mo1375b(this.f3522i);
        gameOutputStream.writeIsPointF(this.f3521h);
        gameOutputStream.writeBoolean(this.f3524l);
        gameOutputStream.writeFloat(this.f3528m);
        gameOutputStream.mo1386a(this.f3520g);
        this.f3525c.m3836a(gameOutputStream);
        C0429b.m3835a(gameOutputStream, this.f3526d);
        C0453g.m3683a(this.f3518e, gameOutputStream);
    }

    /* renamed from: a */
    public void m3367a(GameInputStream gameInputStream) {
        String.valueOf(gameInputStream.readInt());
        this.f3516a = gameInputStream.readInt();
        this.f3517b = gameInputStream.readFloat();
        int i = 0;
        if (gameInputStream.m1311b() >= 4) {
            this.f3527j = C0208c.m4336a(String.valueOf(gameInputStream.readInt()));
        }
        if (gameInputStream.m1311b() >= 6) {
            i = gameInputStream.readInt();
        }
        if (gameInputStream.m1311b() >= 25) {
            this.f3519f = gameInputStream.readBoolean();
        }
        if (gameInputStream.m1311b() >= 33) {
            gameInputStream.readString();
            this.f3527j = C0208c.m4336a(gameInputStream.readString());
        }
        if (gameInputStream.m1311b() >= 61) {
            this.f3522i = gameInputStream.m1293o();
            this.f3521h = gameInputStream.getPointF();
        }
        if (gameInputStream.m1311b() >= 64) {
            this.f3524l = gameInputStream.readBoolean();
            this.f3528m = gameInputStream.readFloat();
        }
        if (gameInputStream.m1311b() >= 71) {
            this.f3520g = gameInputStream.m1291q();
        }
        if (gameInputStream.m1311b() >= 73) {
            this.f3525c = C0429b.m3823b(gameInputStream);
        } else {
            this.f3525c = C0429b.m3851a(i);
        }
        if (gameInputStream.m1311b() >= 91) {
            this.f3526d = C0429b.m3834a(gameInputStream);
        }
        if (gameInputStream.m1311b() >= 95) {
            this.f3518e = C0453g.m3682a(gameInputStream);
        }
    }
}