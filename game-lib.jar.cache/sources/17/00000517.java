package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ai.class */
public enum MapType {
    skirmishMap { // from class: com.corrodinggames.rts.gameFramework.j.ai.1
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        /* renamed from: a */
        public String type() {
            return "Skirmish Map";
        }
    },
    customMap { // from class: com.corrodinggames.rts.gameFramework.j.ai.2
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        /* renamed from: a */
        public String type() {
            return "Custom Map";
        }
    },
    savedGame { // from class: com.corrodinggames.rts.gameFramework.j.ai.3
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        /* renamed from: a */
        public String type() {
            return "Saved Game";
        }
    };

    /* renamed from: a */
    public abstract String type();
}