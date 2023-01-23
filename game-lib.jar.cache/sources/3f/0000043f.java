package com.corrodinggames.rts.gameFramework;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
public enum at {
    starting { // from class: com.corrodinggames.rts.gameFramework.at.1
        @Override // com.corrodinggames.rts.gameFramework.at
        String d() {
            return "music/starting";
        }
    },
    buildup { // from class: com.corrodinggames.rts.gameFramework.at.2
        @Override // com.corrodinggames.rts.gameFramework.at
        String d() {
            return "music/buildup";
        }
    },
    attacked { // from class: com.corrodinggames.rts.gameFramework.at.3
        @Override // com.corrodinggames.rts.gameFramework.at
        String d() {
            return "music/attacked";
        }
    };
    
    String[] d;

    abstract String d();

    void a() {
        this.d = com.corrodinggames.rts.gameFramework.e.a.a(d(), false);
        if (this.d == null) {
            this.d = new String[0];
            GameEngine.n("Failed to open music folder: " + d());
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        for (String str : this.d) {
            String o = com.corrodinggames.rts.gameFramework.e.a.o(str);
            if (am.a(a(o), true) != null) {
                GameEngine.m328e("Loaded track:" + o);
                arrayList.add(o);
            } else {
                GameEngine.print("Skipping track:" + o);
            }
            gameEngine.a("music", false);
        }
        this.d = (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String[] b() {
        return this.d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void c() {
        starting.a();
        buildup.a();
        attacked.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String a(String str) {
        return d() + "/" + str;
    }
}