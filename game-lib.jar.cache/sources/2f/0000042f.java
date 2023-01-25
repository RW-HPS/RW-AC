package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ah.class */
public class C0649ah extends AbstractC0647af {

    /* renamed from: g */
    boolean f4192g;

    /* renamed from: i */
    float f4194i;

    /* renamed from: e */
    int f4190e = -1;

    /* renamed from: f */
    int f4191f = -1;

    /* renamed from: h */
    int f4193h = -1;

    /* renamed from: j */
    boolean f4195j = false;

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: a */
    public boolean mo2759a() {
        if (mo2757b()) {
            if (!this.f4187c) {
                this.f4187c = true;
                return true;
            }
            return false;
        } else if (this.f4187c) {
            this.f4187c = false;
            return false;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: b */
    public boolean mo2757b() {
        return m2760e() > 0.5f;
    }

    /* renamed from: e */
    public float m2760e() {
        return m2761a(false);
    }

    /* renamed from: a */
    public float m2761a(boolean z) {
        float f;
        if (this.f4193h != -1) {
            f = C0644ac.f4115b.mo18a(this.f4193h, this.f4190e) ? 0.0f : 1.0f;
        } else {
            float mo16b = C0644ac.f4115b.mo16b(this.f4190e, this.f4191f);
            f = this.f4192g ? -mo16b : mo16b;
        }
        if (z) {
            return f;
        }
        if (!this.f4195j && Math.abs(f - this.f4194i) > 0.001f) {
            this.f4195j = true;
        }
        if (!this.f4195j) {
            return 0.0f;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: c */
    public String mo2756c() {
        return "controller";
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0647af
    /* renamed from: d */
    public boolean mo2755d() {
        return false;
    }
}