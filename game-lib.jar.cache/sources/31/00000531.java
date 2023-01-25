package com.corrodinggames.rts.gameFramework.net;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.j.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/f.class */
public class Unknown_GameOutBlockStream extends GameOutputStream {

    /* renamed from: a */
    public String f6037a = VariableScope.nullOrMissingString;

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeInt(int i) {
        this.f6037a += "|" + i;
        super.writeInt(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeFloat(float f) {
        this.f6037a += "|" + f;
        super.writeFloat(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1331a(short s) {
        this.f6037a += "|" + ((int) s);
        super.mo1331a(s);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeBoolean(boolean z) {
        this.f6037a += "|" + z;
        super.writeBoolean(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        this.f6037a += "<" + str + ">";
        super.startBlock(str, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void endBlock(String str) {
        this.f6037a += "</" + str + ">";
        super.endBlock(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1334a(AbstractC0244am abstractC0244am) {
        this.f6037a += "|u:" + abstractC0244am;
        super.mo1334a(abstractC0244am);
    }
}