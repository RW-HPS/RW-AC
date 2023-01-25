package com.corrodinggames.rts.game.units.custom.p018b;

import com.corrodinggames.rts.game.units.custom.AbstractC0467t;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.utility.C1136m;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/g.class */
public class C0395g extends AbstractC0467t {

    /* renamed from: a */
    String f2381a;

    /* renamed from: b */
    C1136m f2382b = new C1136m();

    public C0395g(String str) {
        this.f2381a = str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.AbstractC0467t
    /* renamed from: a */
    public void mo3478a(C0458l c0458l) {
        C0392d m3944c;
        if (this.f2381a != null) {
            for (String str : this.f2381a.split(",")) {
                String trim = str.trim();
                m3944c = C0391c.m3944c(c0458l, trim);
                if (m3944c == null) {
                    throw new C0417bo("Failed to find decal: " + trim);
                }
                this.f2382b.add(m3944c);
            }
            this.f2381a = null;
        }
    }

    /* renamed from: a */
    public void m3938a(C0456j c0456j, float f, float f2) {
        C0391c.f2303i.setSite(f, f2);
        C0391c.m3949a(c0456j, 0.0f, EnumC0394f.inactive, this.f2382b, C0391c.f2303i);
    }
}