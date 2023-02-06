package com.corrodinggames.rts.gameFramework.status;

/* renamed from: com.corrodinggames.rts.gameFramework.n.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/e.class */
public enum e {
    objective { // from class: com.corrodinggames.rts.gameFramework.n.e.1
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "objective";
        }
    },
    event_move { // from class: com.corrodinggames.rts.gameFramework.n.e.4
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "move";
        }
    },
    event_changeCredits { // from class: com.corrodinggames.rts.gameFramework.n.e.5
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "changeCredits";
        }
    },
    event_teamTags { // from class: com.corrodinggames.rts.gameFramework.n.e.6
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "teamTags";
        }
    },
    event_unitAdd { // from class: com.corrodinggames.rts.gameFramework.n.e.7
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "unitAdd";
        }
    },
    event_unitRemove { // from class: com.corrodinggames.rts.gameFramework.n.e.8
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "unitRemove";
        }
    },
    mapText { // from class: com.corrodinggames.rts.gameFramework.n.e.9
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "mapText";
        }
    },
    moveCamera { // from class: com.corrodinggames.rts.gameFramework.n.e.10
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "moveCamera";
        }
    },
    trigger_unitDetect { // from class: com.corrodinggames.rts.gameFramework.n.e.11
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "unitDetect";
        }
    },
    trigger_teamTagDetect { // from class: com.corrodinggames.rts.gameFramework.n.e.2
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "teamTagDetect";
        }
    },
    trigger_basic { // from class: com.corrodinggames.rts.gameFramework.n.e.3
        @Override // com.corrodinggames.rts.gameFramework.status.e
        public String a() {
            return "basic";
        }
    };

    public abstract String a();

    public static e a(String str) {
        e[] values;
        for (e eVar : values()) {
            if (eVar.a().equalsIgnoreCase(str)) {
                return eVar;
            }
        }
        return null;
    }
}