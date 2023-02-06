package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
enum MusicType {
    starting { // from class: com.corrodinggames.rts.gameFramework.at.1
        @Override // com.corrodinggames.rts.gameFramework.MusicType
        String d() {
            return "music/starting";
        }
    },
    buildup { // from class: com.corrodinggames.rts.gameFramework.at.2
        @Override // com.corrodinggames.rts.gameFramework.MusicType
        String d() {
            return "music/buildup";
        }
    },
    attacked { // from class: com.corrodinggames.rts.gameFramework.at.3
        @Override // com.corrodinggames.rts.gameFramework.MusicType
        String d() {
            return "music/attacked";
        }
    };
    
    String[] d;

    abstract String d();

    void a() {
        this.d = com.corrodinggames.rts.gameFramework.file.a.a(d(), false);
        if (this.d == null) {
            this.d = new String[0];
            GameEngine.n("Failed to open music folder: " + d());
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        for (String str : this.d) {
            String o = com.corrodinggames.rts.gameFramework.file.a.o(str);
            if (am.a(a(o), true) != null) {
                GameEngine.m5e("Loaded track:" + o);
                arrayList.add(o);
            } else {
                GameEngine.print("Skipping track:" + o);
            }
            gameEngine.a("music", false);
        }
        this.d = (String[]) arrayList.toArray(new String[0]);
    }

    String[] b() {
        return this.d;
    }

    static void c() {
        starting.a();
        buildup.a();
        attacked.a();
    }

    String a(String str) {
        return d() + "/" + str;
    }
}