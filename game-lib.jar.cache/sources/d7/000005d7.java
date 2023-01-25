package com.corrodinggames.rts.gameFramework.status;

/* renamed from: com.corrodinggames.rts.gameFramework.n.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/e.class */
public enum EnumC1073e {
    f6861a { // from class: com.corrodinggames.rts.gameFramework.n.e.1
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "objective";
        }
    },
    f6862b { // from class: com.corrodinggames.rts.gameFramework.n.e.4
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "move";
        }
    },
    f6863c { // from class: com.corrodinggames.rts.gameFramework.n.e.5
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "changeCredits";
        }
    },
    f6864d { // from class: com.corrodinggames.rts.gameFramework.n.e.6
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "teamTags";
        }
    },
    f6865e { // from class: com.corrodinggames.rts.gameFramework.n.e.7
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "unitAdd";
        }
    },
    f6866f { // from class: com.corrodinggames.rts.gameFramework.n.e.8
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "unitRemove";
        }
    },
    f6867g { // from class: com.corrodinggames.rts.gameFramework.n.e.9
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "mapText";
        }
    },
    f6868h { // from class: com.corrodinggames.rts.gameFramework.n.e.10
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "moveCamera";
        }
    },
    f6869i { // from class: com.corrodinggames.rts.gameFramework.n.e.11
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "unitDetect";
        }
    },
    f6870j { // from class: com.corrodinggames.rts.gameFramework.n.e.2
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "teamTagDetect";
        }
    },
    f6871k { // from class: com.corrodinggames.rts.gameFramework.n.e.3
        @Override // com.corrodinggames.rts.gameFramework.status.EnumC1073e
        /* renamed from: a */
        public String mo794a() {
            return "basic";
        }
    };

    /* renamed from: a */
    public abstract String mo794a();

    /* renamed from: a */
    public static EnumC1073e m795a(String str) {
        EnumC1073e[] values;
        for (EnumC1073e enumC1073e : values()) {
            if (enumC1073e.mo794a().equalsIgnoreCase(str)) {
                return enumC1073e;
            }
        }
        return null;
    }
}