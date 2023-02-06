package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.j.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/f.class */
public class Unknown_GameOutBlockStream extends GameOutputStream {
    public String a = VariableScope.nullOrMissingString;

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeInt(int i) {
        this.a += "|" + i;
        super.writeInt(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeFloat(float f) {
        this.a += "|" + f;
        super.writeFloat(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(short s) {
        this.a += "|" + ((int) s);
        super.a(s);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeBoolean(boolean z) {
        this.a += "|" + z;
        super.writeBoolean(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        this.a += "<" + str + ">";
        super.startBlock(str, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void endBlock(String str) {
        this.a += "</" + str + ">";
        super.endBlock(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(am amVar) {
        this.a += "|u:" + amVar;
        super.a(amVar);
    }
}