package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/u.class */
public class u extends x {
    public int a;
    public float b;

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w, com.corrodinggames.rts.gameFramework.bq
    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeByte(0);
        gameOutputStream.writeInt(this.a);
        gameOutputStream.writeFloat(this.b);
        super.a(gameOutputStream);
    }

    @Override // com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.az, com.corrodinggames.rts.gameFramework.w
    public void a(GameInputStream gameInputStream) {
        gameInputStream.readByte();
        this.a = gameInputStream.readInt();
        this.b = gameInputStream.readFloat();
        super.a(gameInputStream);
    }

    @Override // com.corrodinggames.rts.game.units.am
    /* renamed from: b */
    public ar mo1r() {
        return ar.fogRevealer;
    }

    public static void f() {
        GameEngine.getGameEngine();
    }

    public u(boolean z) {
        super(z);
        this.a = 14;
        this.b = 60.0f;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.y, com.corrodinggames.rts.game.units.am, com.corrodinggames.rts.gameFramework.w
    public void a(float f) {
        super.a(f);
        this.b -= f;
        if (this.b < 0.0f) {
            ci();
        }
    }

    @Override // com.corrodinggames.rts.game.units.y
    public int s() {
        return this.a;
    }

    @Override // com.corrodinggames.rts.game.units.am
    public boolean t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.x, com.corrodinggames.rts.game.units.am
    public boolean u() {
        return true;
    }
}