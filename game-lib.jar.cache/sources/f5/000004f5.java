package com.corrodinggames.rts.gameFramework.player;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.e.a.c;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/a.class */
public class a {
    private final f a;
    private final c b;
    private final ArrayList c;

    public a() {
        this(f.none, c.player);
    }

    public a(f fVar, c cVar) {
        this.c = new ArrayList();
        this.a = fVar;
        this.b = cVar;
    }

    public void a() {
        if (this.a == f.none) {
            return;
        }
        ArrayList b = PlayerData.b(false);
        if (this.b == c.player) {
            Iterator it = b.iterator();
            while (it.hasNext()) {
                this.c.add(new e((PlayerData) it.next()));
            }
        } else if (this.b == c.allyGroup) {
            Iterator it2 = PlayerData.f().iterator();
            while (it2.hasNext()) {
                Integer num = (Integer) it2.next();
                ArrayList arrayList = new ArrayList();
                Iterator it3 = b.iterator();
                while (it3.hasNext()) {
                    PlayerData playerData = (PlayerData) it3.next();
                    if (playerData.team == num.intValue()) {
                        arrayList.add(playerData);
                    }
                }
                this.c.add(new b(num.intValue(), arrayList));
            }
        } else if (this.b == c.combinedPlayerAndGroup) {
            int i = 0;
            ArrayList f = PlayerData.f();
            Iterator it4 = f.iterator();
            while (it4.hasNext()) {
                Integer num2 = (Integer) it4.next();
                ArrayList arrayList2 = new ArrayList();
                Iterator it5 = b.iterator();
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
                Iterator it6 = b.iterator();
                while (it6.hasNext()) {
                    this.c.add(new e((PlayerData) it6.next()));
                }
            } else {
                Iterator it7 = f.iterator();
                while (it7.hasNext()) {
                    Integer num3 = (Integer) it7.next();
                    ArrayList arrayList3 = new ArrayList();
                    Iterator it8 = b.iterator();
                    while (it8.hasNext()) {
                        PlayerData playerData3 = (PlayerData) it8.next();
                        if (playerData3.team == num3.intValue()) {
                            arrayList3.add(playerData3);
                        }
                    }
                    this.c.add(new b(num3.intValue(), arrayList3));
                    Iterator it9 = arrayList3.iterator();
                    while (it9.hasNext()) {
                        this.c.add(new e((PlayerData) it9.next()));
                    }
                }
            }
        }
        b();
    }

    public void b() {
        Iterator it = this.c.iterator();
        while (it.hasNext()) {
            ((d) it.next()).b(this.a);
        }
    }

    public void c() {
        int ordinal = this.a.ordinal() + 1;
        if (ordinal >= f.values().length) {
            ordinal = 0;
        }
        GameEngine.getGameEngine().a(f.values()[ordinal], c.combinedPlayerAndGroup);
    }

    public String a(d dVar) {
        if (this.b == c.combinedPlayerAndGroup && (dVar instanceof e)) {
            return "   " + a(this.a, d.b(dVar));
        }
        return a(this.a, d.b(dVar));
    }

    public static String a(f fVar, int i) {
        switch (fVar) {
            case none:
                return VariableScope.nullOrMissingString + i;
            case income:
                return "+" + c.D.a(i, true);
            default:
                return c.D.a(i, true);
        }
    }

    public ArrayList d() {
        return this.c;
    }

    public f e() {
        return this.a;
    }

    public c f() {
        return this.b;
    }
}