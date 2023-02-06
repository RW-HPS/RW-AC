package com.corrodinggames.rts.gameFramework;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ah.class */
public class ah extends af {
    boolean g;
    float i;
    int e = -1;
    int f = -1;
    int h = -1;
    boolean j = false;

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean a() {
        if (b()) {
            if (!this.c) {
                this.c = true;
                return true;
            }
            return false;
        } else if (this.c) {
            this.c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean b() {
        return e() > 0.5f;
    }

    public float e() {
        return a(false);
    }

    public float a(boolean z) {
        float f;
        if (this.h != -1) {
            f = ac.b.a(this.h, this.e) ? 0.0f : 1.0f;
        } else {
            float b = ac.b.b(this.e, this.f);
            f = this.g ? -b : b;
        }
        if (z) {
            return f;
        }
        if (!this.j && Math.abs(f - this.i) > 0.001f) {
            this.j = true;
        }
        if (!this.j) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public String c() {
        return "controller";
    }

    @Override // com.corrodinggames.rts.gameFramework.af
    public boolean d() {
        return false;
    }
}