package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.file.C0765a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
enum EnumC0665at {
    starting { // from class: com.corrodinggames.rts.gameFramework.at.1
        @Override // com.corrodinggames.rts.gameFramework.EnumC0665at
        /* renamed from: d */
        String mo2730d() {
            return "music/starting";
        }
    },
    buildup { // from class: com.corrodinggames.rts.gameFramework.at.2
        @Override // com.corrodinggames.rts.gameFramework.EnumC0665at
        /* renamed from: d */
        String mo2730d() {
            return "music/buildup";
        }
    },
    attacked { // from class: com.corrodinggames.rts.gameFramework.at.3
        @Override // com.corrodinggames.rts.gameFramework.EnumC0665at
        /* renamed from: d */
        String mo2730d() {
            return "music/attacked";
        }
    };
    

    /* renamed from: d */
    String[] f4253d;

    /* renamed from: d */
    abstract String mo2730d();

    /* renamed from: a */
    void m2734a() {
        this.f4253d = C0765a.m2296a(mo2730d(), false);
        if (this.f4253d == null) {
            this.f4253d = new String[0];
            GameEngine.m976n("Failed to open music folder: " + mo2730d());
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4253d) {
            String m2272o = C0765a.m2272o(str);
            if (C0654am.m2748a(m2733a(m2272o), true) != null) {
                GameEngine.m5460e("Loaded track:" + m2272o);
                arrayList.add(m2272o);
            } else {
                GameEngine.print("Skipping track:" + m2272o);
            }
            gameEngine.m1060a("music", false);
        }
        this.f4253d = (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: b */
    String[] m2732b() {
        return this.f4253d;
    }

    /* renamed from: c */
    static void m2731c() {
        starting.m2734a();
        buildup.m2734a();
        attacked.m2734a();
    }

    /* renamed from: a */
    String m2733a(String str) {
        return mo2730d() + "/" + str;
    }
}