package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public enum EnumC0609o {
    land { // from class: com.corrodinggames.rts.game.units.o.1
        @Override // com.corrodinggames.rts.game.units.EnumC0609o
        /* renamed from: a */
        public boolean mo3111a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4223c = AbstractC0244am.m4223c(interfaceC0303as);
            return (m4223c.mo3635bO() || interfaceC0303as.mo3511j() || m4223c.mo3069h() == EnumC0246ao.AIR || m4223c.mo3069h() == EnumC0246ao.WATER) ? false : true;
        }
    },
    air { // from class: com.corrodinggames.rts.game.units.o.2
        @Override // com.corrodinggames.rts.game.units.EnumC0609o
        /* renamed from: a */
        public boolean mo3111a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4223c = AbstractC0244am.m4223c(interfaceC0303as);
            return (m4223c.mo3635bO() || interfaceC0303as.mo3511j() || m4223c.mo3069h() != EnumC0246ao.AIR) ? false : true;
        }
    },
    sea { // from class: com.corrodinggames.rts.game.units.o.3
        @Override // com.corrodinggames.rts.game.units.EnumC0609o
        /* renamed from: a */
        public boolean mo3111a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            AbstractC0244am m4223c = AbstractC0244am.m4223c(interfaceC0303as);
            return (m4223c.mo3635bO() || interfaceC0303as.mo3511j() || m4223c.mo3069h() != EnumC0246ao.WATER) ? false : true;
        }
    },
    buildings { // from class: com.corrodinggames.rts.game.units.o.4
        @Override // com.corrodinggames.rts.game.units.EnumC0609o
        /* renamed from: a */
        public boolean mo3111a(InterfaceC0303as interfaceC0303as) {
            return (interfaceC0303as == null || AbstractC0244am.m4223c(interfaceC0303as).mo3635bO() || !interfaceC0303as.mo3511j()) ? false : true;
        }
    },
    bio { // from class: com.corrodinggames.rts.game.units.o.5
        @Override // com.corrodinggames.rts.game.units.EnumC0609o
        /* renamed from: a */
        public boolean mo3111a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            return AbstractC0244am.m4223c(interfaceC0303as).mo3635bO();
        }
    };

    /* renamed from: a */
    public abstract boolean mo3111a(InterfaceC0303as interfaceC0303as);

    /* renamed from: a */
    public String m3115a() {
        return name();
    }

    /* renamed from: a */
    public EnumC0609o m3113a(boolean z) {
        if (!z) {
            return m3114a(1, 0);
        }
        return m3114a(-1, 0);
    }

    /* renamed from: a */
    public EnumC0609o m3114a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        EnumC0609o enumC0609o = values()[ordinal];
        if (!enumC0609o.m3112b()) {
            if (i2 > 30) {
                GameEngine.m5777e("jumpBy recursion limit hit");
                return enumC0609o;
            }
            enumC0609o = enumC0609o.m3114a(i, i2 + 1);
        }
        return enumC0609o;
    }

    /* renamed from: b */
    public boolean m3112b() {
        return true;
    }
}