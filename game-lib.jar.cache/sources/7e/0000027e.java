package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/e.class */
public final class e {
    public f a;
    float b;
    float c;
    boolean g;
    boolean h;
    boolean i;
    int j;
    j m;
    float[] n;
    float d = 1.0f;
    boolean e = false;
    boolean f = false;
    float k = 0.0f;
    float l = 0.05f;

    public e(j jVar) {
        this.m = jVar;
    }

    public void a(f fVar, int i) {
        a(fVar, i, false);
    }

    public void a(f fVar, int i, boolean z) {
        if (fVar == null || !fVar.a()) {
            return;
        }
        if ((this.i || (this.f && this.e)) && i <= this.j && (!z || fVar != this.a)) {
            return;
        }
        this.i = true;
        if (fVar != this.a || z || this.g) {
            float f = 0.0f;
            if (this.a != null && this.e) {
                f = this.a.i;
            }
            this.a = fVar;
            this.j = i;
            c();
            this.f = z;
            if (z) {
                this.h = false;
            } else {
                this.h = true;
            }
            this.b = -1.0f;
            this.c = -1.0f;
            this.d = 1.0f;
            this.g = false;
            float f2 = fVar.h;
            if (f > f2) {
                f2 = f;
            }
            if (f2 > 0.0f) {
                this.k = 1.0f;
                this.l = f2;
            } else {
                this.k = 0.0f;
            }
        }
        this.e = true;
    }

    public void a() {
        if (this.a != null) {
            b(true);
        }
        this.e = false;
        this.a = null;
        this.j = -1;
    }

    public void b() {
        if (this.a != null) {
            if (!this.g) {
                float f = this.a.i;
                if (f > 0.0f) {
                    this.g = true;
                    c();
                    this.h = false;
                    this.j = -1;
                    this.k = 1.0f;
                    this.l = f;
                    return;
                }
            }
            b(true);
        }
        this.e = false;
        this.a = null;
        this.j = -1;
    }

    public void a(float f) {
        if (!this.e) {
            return;
        }
        this.c = this.b;
        if (this.b < 0.0f) {
            this.b = 0.0f;
        }
        float f2 = this.d;
        if (this.a != null && this.a.j != null) {
            f2 *= this.a.j.readNumber(this.m);
        }
        this.b += f2 * f;
        if (this.h && !this.i) {
            b();
        }
        this.i = false;
        if (this.e) {
            if (this.k > 0.0f) {
                this.k -= this.l * f;
            } else if (this.g) {
                b();
                return;
            }
            if (!this.g && this.a != null) {
                if (this.a.g) {
                    if (this.b > this.a.n) {
                        a(false);
                        this.b = this.a.n;
                        this.d = -1.0f;
                    } else if (this.b < 0.0f) {
                        this.b = 0.0f;
                        this.d = 1.0f;
                        if (this.f) {
                            b();
                            if (!this.g) {
                                return;
                            }
                        }
                    }
                } else {
                    if (this.b > this.a.n) {
                        if (this.f) {
                            a(false);
                            b();
                            if (!this.g) {
                                return;
                            }
                        } else {
                            a(false);
                            this.b = 0.0f;
                            this.d = 1.0f;
                        }
                    }
                    if (this.b < 0.0f && !this.f && f2 < 0.0f) {
                        this.b = this.a.n;
                    }
                }
            }
            boolean z = false;
            if (this.g) {
                z = true;
            }
            b(z);
        }
    }

    void c() {
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.a.l;
        if (this.n == null || this.n.length < mVar.size()) {
            this.n = new float[mVar.size()];
        }
        for (int i = 0; i < mVar.size(); i++) {
            c cVar = (c) mVar.get(i);
            d dVar = cVar.a;
            if (dVar == d.scale) {
                this.n[i] = this.m.c;
            } else if (dVar == d.frame) {
                this.n[i] = -99.0f;
            } else if (dVar == d.legX) {
                if (this.m.dT != null && cVar.b < this.m.dT.length) {
                    this.n[i] = this.m.dT[cVar.b].p;
                } else {
                    this.n[i] = 0.0f;
                    GameEngine.print("setBaseBlendValues: Target leg out of range for: " + this.m.r().i());
                }
            } else if (dVar == d.legY) {
                if (this.m.dT != null && cVar.b < this.m.dT.length) {
                    this.n[i] = this.m.dT[cVar.b].q;
                }
            } else if (dVar == d.legDir) {
                if (this.m.dT != null && cVar.b < this.m.dT.length) {
                    this.m.dT[cVar.b].r = com.corrodinggames.rts.gameFramework.f.a(this.m.dT[cVar.b].r, false);
                    this.n[i] = this.m.dT[cVar.b].r;
                }
            } else if (dVar == d.legHeight) {
                if (this.m.dT != null && cVar.b < this.m.dT.length) {
                    this.n[i] = this.m.dT[cVar.b].d;
                }
            } else if (dVar == d.legAlpha) {
                if (this.m.dT != null && cVar.b < this.m.dT.length) {
                    this.n[i] = this.m.dT[cVar.b].s;
                }
            } else if (dVar != d.event) {
                this.n[i] = 0.0f;
                GameEngine.print("Unsupported blend type:" + dVar);
            }
        }
    }

    void a(boolean z) {
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.a.l;
        for (int i = 0; i < mVar.size(); i++) {
            c cVar = (c) mVar.get(i);
            if (cVar.a == d.event) {
                cVar.a(this.m, this.c, this.b, z);
            }
        }
    }

    void b(boolean z) {
        float b;
        com.corrodinggames.rts.gameFramework.utility.m mVar = this.a.l;
        for (int i = 0; i < mVar.size(); i++) {
            c cVar = (c) mVar.get(i);
            d dVar = cVar.a;
            if (dVar != d.frame || this.m.el || z) {
                if (z) {
                    b = 0.0f;
                    if (dVar == d.scale) {
                        b = 1.0f;
                    } else if (dVar == d.frame) {
                        b = this.m.x.Y;
                    } else if (dVar == d.legAlpha) {
                        b = 1.0f;
                        ba[] baVarArr = this.m.x.ax;
                        if (baVarArr != null && cVar.b < baVarArr.length) {
                            b = baVarArr[cVar.b].r;
                        }
                    }
                } else {
                    b = cVar.b(this.b);
                }
                if (this.k > 0.0f && dVar != d.frame) {
                    b = (b * (1.0f - this.k)) + (this.n[i] * this.k);
                }
                if (dVar == d.frame) {
                    this.m.a = (int) b;
                } else if (dVar == d.scale) {
                    this.m.c = b;
                } else if (dVar == d.legX) {
                    if (this.m.dT != null && cVar.b < this.m.dT.length) {
                        com.corrodinggames.rts.game.units.custom.b.i iVar = this.m.dT[cVar.b];
                        iVar.p = b;
                        iVar.k = true;
                        iVar.o = true;
                    }
                } else if (dVar == d.legY) {
                    if (this.m.dT != null && cVar.b < this.m.dT.length) {
                        com.corrodinggames.rts.game.units.custom.b.i iVar2 = this.m.dT[cVar.b];
                        iVar2.q = b;
                        iVar2.k = true;
                        iVar2.o = true;
                    }
                } else if (dVar == d.legDir) {
                    if (this.m.dT != null && cVar.b < this.m.dT.length) {
                        this.m.dT[cVar.b].r = b;
                    }
                } else if (dVar == d.legHeight) {
                    if (this.m.dT != null && cVar.b < this.m.dT.length) {
                        this.m.dT[cVar.b].d = b;
                    }
                } else if (dVar == d.legAlpha) {
                    com.corrodinggames.rts.game.units.custom.b.i[] iVarArr = this.m.dT;
                    if (iVarArr != null && cVar.b < iVarArr.length) {
                        iVarArr[cVar.b].s = b;
                    }
                } else if (dVar != d.turretX && dVar == d.event) {
                    cVar.a(this.m, this.c, this.b, z);
                }
            }
        }
    }

    public boolean a(f fVar) {
        return this.e && this.a == fVar;
    }
}