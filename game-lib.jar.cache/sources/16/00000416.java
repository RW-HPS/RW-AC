package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* renamed from: com.corrodinggames.rts.game.units.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/u.class */
public class C0625u extends AbstractC0628x {

    /* renamed from: a */
    public int f3915a;

    /* renamed from: b */
    public float f3916b;

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w, com.corrodinggames.rts.gameFramework.AbstractC0741bq
    /* renamed from: a */
    public void mo442a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(0);
        gameOutputStream.writeInt(this.f3915a);
        gameOutputStream.writeFloat(this.f3916b);
        super.mo442a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC0674az, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo441a(GameInputStream gameInputStream) {
        gameInputStream.readByte();
        this.f3915a = gameInputStream.readInt();
        this.f3916b = gameInputStream.readFloat();
        super.mo441a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: b */
    public EnumC0249ar mo1747r() {
        return EnumC0249ar.fogRevealer;
    }

    /* renamed from: f */
    public static void m3077f() {
        GameEngine.getGameEngine();
    }

    public C0625u(boolean z) {
        super(z);
        this.f3915a = 14;
        this.f3916b = 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0629y, com.corrodinggames.rts.game.units.AbstractC0244am, com.corrodinggames.rts.gameFramework.AbstractC1155w
    /* renamed from: a */
    public void mo446a(float f) {
        super.mo446a(f);
        this.f3916b -= f;
        if (this.f3916b < 0.0f) {
            m4210ci();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0629y
    /* renamed from: s */
    public int mo2831s() {
        return this.f3915a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: t */
    public boolean mo1746t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0628x, com.corrodinggames.rts.game.units.AbstractC0244am
    /* renamed from: u */
    public boolean mo1745u() {
        return true;
    }
}