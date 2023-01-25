package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.p022a.C0436c;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/a.class */
public class C0847a {

    /* renamed from: a */
    private final EnumC0853f f5587a;

    /* renamed from: b */
    private final EnumC0850c f5588b;

    /* renamed from: c */
    private final ArrayList f5589c;

    public C0847a() {
        this(EnumC0853f.f5600a, EnumC0850c.f5594a);
    }

    public C0847a(EnumC0853f enumC0853f, EnumC0850c enumC0850c) {
        this.f5589c = new ArrayList();
        this.f5587a = enumC0853f;
        this.f5588b = enumC0850c;
    }

    /* renamed from: a */
    public void m1736a() {
        if (this.f5587a == EnumC0853f.f5600a) {
            return;
        }
        ArrayList m4407b = PlayerData.m4407b(false);
        if (this.f5588b == EnumC0850c.f5594a) {
            Iterator it = m4407b.iterator();
            while (it.hasNext()) {
                this.f5589c.add(new C0852e((PlayerData) it.next()));
            }
        } else if (this.f5588b == EnumC0850c.f5595b) {
            Iterator it2 = PlayerData.m4379f().iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = m4407b.iterator();
                while (it3.hasNext()) {
                    PlayerData playerData = (PlayerData) it3.next();
                    if (playerData.team == num.intValue()) {
                        arrayList.add(playerData);
                    }
                }
                this.f5589c.add(new C0849b(num.intValue(), arrayList));
            }
        } else if (this.f5588b == EnumC0850c.f5596c) {
            int i = 0;
            ArrayList m4379f = PlayerData.m4379f();
            Iterator it4 = m4379f.iterator();
            while (it4.hasNext()) {
                Integer num2 = (Integer) it4.next();
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = m4407b.iterator();
                while (it5.hasNext()) {
                    PlayerData playerData2 = (PlayerData) it5.next();
                    if (playerData2.team == num2.intValue()) {
                        arrayList2.add(playerData2);
                    }
                }
                if (i < arrayList2.size()) {
                    i = arrayList2.size();
                }
            }
            if (i <= 1) {
                Iterator it6 = m4407b.iterator();
                while (it6.hasNext()) {
                    this.f5589c.add(new C0852e((PlayerData) it6.next()));
                }
            } else {
                Iterator it7 = m4379f.iterator();
                while (it7.hasNext()) {
                    Integer num3 = (Integer) it7.next();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it8 = m4407b.iterator();
                    while (it8.hasNext()) {
                        PlayerData playerData3 = (PlayerData) it8.next();
                        if (playerData3.team == num3.intValue()) {
                            arrayList3.add(playerData3);
                        }
                    }
                    this.f5589c.add(new C0849b(num3.intValue(), arrayList3));
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        this.f5589c.add(new C0852e((PlayerData) it9.next()));
                    }
                }
            }
        }
        m1733b();
    }

    /* renamed from: b */
    public void m1733b() {
        Iterator it = this.f5589c.iterator();
        while (it.hasNext()) {
            ((AbstractC0851d) it.next()).m1726b(this.f5587a);
        }
    }

    /* renamed from: c */
    public void m1732c() {
        int ordinal = this.f5587a.ordinal() + 1;
        if (ordinal >= EnumC0853f.values().length) {
            ordinal = 0;
        }
        GameEngine.getGameEngine().m1069a(EnumC0853f.values()[ordinal], EnumC0850c.f5596c);
    }

    /* renamed from: a */
    public String m1735a(AbstractC0851d abstractC0851d) {
        if (this.f5588b == EnumC0850c.f5596c && (abstractC0851d instanceof C0852e)) {
            return "   " + m1734a(this.f5587a, AbstractC0851d.m1727b(abstractC0851d));
        }
        return m1734a(this.f5587a, AbstractC0851d.m1727b(abstractC0851d));
    }

    /* renamed from: a */
    public static String m1734a(EnumC0853f enumC0853f, int i) {
        switch (enumC0853f) {
            case f5600a:
                return VariableScope.nullOrMissingString + i;
            case f5601b:
                return "+" + C0436c.f2786D.m3783a(i, true);
            default:
                return C0436c.f2786D.m3783a(i, true);
        }
    }

    /* renamed from: d */
    public ArrayList m1731d() {
        return this.f5589c;
    }

    /* renamed from: e */
    public EnumC0853f m1730e() {
        return this.f5587a;
    }

    /* renamed from: f */
    public EnumC0850c m1729f() {
        return this.f5588b;
    }
}