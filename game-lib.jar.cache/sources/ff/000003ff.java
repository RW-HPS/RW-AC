package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public enum EnumC0602n {
    all { // from class: com.corrodinggames.rts.game.units.n.1
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            return true;
        }
    },
    types { // from class: com.corrodinggames.rts.game.units.n.2
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            C0560h m3173L = C0560h.m3173L();
            if (m3173L != null && m3173L.f3824F != null) {
                return m3173L.f3824F.mo3111a(interfaceC0303as);
            }
            return false;
        }
    },
    terrain { // from class: com.corrodinggames.rts.game.units.n.3
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: b */
        public boolean mo3117b() {
            return false;
        }
    },
    modded { // from class: com.corrodinggames.rts.game.units.n.4
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as != null && (interfaceC0303as instanceof C0458l)) {
                C0458l c0458l = (C0458l) interfaceC0303as;
                if (c0458l.f2968J == null) {
                    return false;
                }
                C0560h m3173L = C0560h.m3173L();
                if (m3173L != null && m3173L.f3823E != null && c0458l.f2968J != m3173L.f3823E) {
                    return false;
                }
                return true;
            }
            return false;
        }
    },
    search { // from class: com.corrodinggames.rts.game.units.n.5
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            C0560h m3173L = C0560h.m3173L();
            if (m3173L == null || m3173L.f3826H == null) {
                return false;
            }
            if (m3173L.f3827I) {
                m3173L.f3827I = false;
                m3173L.f3828J = m3173L.f3826H.toLowerCase().trim();
            }
            if (interfaceC0303as == null) {
                return false;
            }
            if (interfaceC0303as.mo3513i() != null && interfaceC0303as.mo3513i().toLowerCase(Locale.ROOT).contains(m3173L.f3828J)) {
                return true;
            }
            if (interfaceC0303as.mo3513i() != null && interfaceC0303as.mo3521e().toLowerCase(Locale.ROOT).contains(m3173L.f3828J)) {
                return true;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: b */
        public boolean mo3117b() {
            C0560h m3173L = C0560h.m3173L();
            return (m3173L == null || m3173L.f3826H == null) ? false : true;
        }
    },
    actions { // from class: com.corrodinggames.rts.game.units.n.6
        @Override // com.corrodinggames.rts.game.units.EnumC0602n
        /* renamed from: a */
        public boolean mo3116a(InterfaceC0303as interfaceC0303as) {
            return interfaceC0303as == null;
        }
    };

    /* renamed from: a */
    public abstract boolean mo3116a(InterfaceC0303as interfaceC0303as);

    /* renamed from: a */
    public String m3120a() {
        return name();
    }

    /* renamed from: b */
    public boolean mo3117b() {
        return true;
    }

    /* renamed from: a */
    public EnumC0602n m3118a(boolean z) {
        if (!z) {
            return m3119a(1, 0);
        }
        return m3119a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0602n m3119a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0602n enumC0602n = values()[ordinal];
        if (!enumC0602n.mo3117b()) {
            if (i2 > 30) {
                GameEngine.m5777e("jumpBy recursion limit hit");
                return enumC0602n;
            }
            enumC0602n = enumC0602n.m3119a(i, i2 + 1);
        }
        return enumC0602n;
    }
}