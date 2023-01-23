package com.corrodinggames.rts.gameFramework.net;

/* renamed from: com.corrodinggames.rts.gameFramework.j.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/ai.class */
public enum MapType {
    skirmishMap { // from class: com.corrodinggames.rts.gameFramework.j.ai.1
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        public String a() {
            return "Skirmish Map";
        }
    },
    customMap { // from class: com.corrodinggames.rts.gameFramework.j.ai.2
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        public String a() {
            return "Custom Map";
        }
    },
    savedGame { // from class: com.corrodinggames.rts.gameFramework.j.ai.3
        @Override // com.corrodinggames.rts.gameFramework.net.MapType
        public String a() {
            return "Saved Game";
        }
    };

    public abstract String a();
}