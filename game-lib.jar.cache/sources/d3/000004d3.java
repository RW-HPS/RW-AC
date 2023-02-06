package com.corrodinggames.rts.gameFramework.Interface;

/* renamed from: com.corrodinggames.rts.gameFramework.f.aq */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/aq.class */
class aq extends au {
    public aq(String str) {
        super(-1000.0f, -1000.0f);
        this.g = str;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public boolean a(au auVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public void b(au auVar) {
    }

    @Override // com.corrodinggames.rts.gameFramework.Interface.au
    public String a() {
        return this.g;
    }
}