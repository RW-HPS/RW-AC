package com.corrodinggames.rts.game.units.d;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/s.class */
public class s extends com.corrodinggames.rts.game.units.f.i {

    /* renamed from: a  reason: collision with root package name */
    public float f339a;
    public boolean b;
    public boolean c;
    PlayerData d;
    am e;
    float f;
    float g;
    boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public s(boolean z) {
        this.b = z;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public int excludeTeam(y yVar) {
        return -2;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public PlayerData onlyEnemiesOfTeam(y yVar) {
        return null;
    }

    public void a(float f, boolean z) {
        this.f339a = f * f;
        this.h = z;
        this.c = true;
    }

    @Override // com.corrodinggames.rts.game.units.f.i
    public void setup(y yVar, float f) {
        this.e = null;
        this.f = -1.0f;
        this.g = -1.0f;
        this.d = yVar.bX;
        if (!this.c) {
            throw new RuntimeException("AutoRepairCallback not ready");
        }
        this.c = false;
    }

    @Override // com.corrodinggames.rts.game.units.f.j
    public void callback(y yVar, float f, am amVar) {
        if (yVar == amVar) {
            return;
        }
        if ((amVar.cu < amVar.cv || amVar.cm < 1.0f) && !amVar.bV && amVar.cN == null && this.d.d(amVar.bX) && yVar.a(amVar)) {
            float a2 = com.corrodinggames.rts.gameFramework.f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep);
            if (a2 < this.f339a) {
                if (amVar.cm < 1.0f && yVar.g(amVar) != null) {
                    return;
                }
                boolean z = false;
                if (!this.h) {
                    if (this.f == -1.0f || this.f > amVar.cu) {
                        z = true;
                    }
                } else if (this.g == -1.0f || this.g > a2) {
                    z = true;
                }
                if (z && amVar.g() == 0.0f) {
                    this.f = amVar.cu;
                    this.g = a2;
                    this.e = amVar;
                }
            }
        }
    }
}