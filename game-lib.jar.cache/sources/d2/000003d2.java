package com.corrodinggames.rts.game.units.g;

import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.io.IOException;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/g/c.class */
public final class c {
    public static void a(y yVar, float f) {
        m mVar = yVar.bp;
        if (mVar == null) {
            return;
        }
        int i = GameEngine.getGameEngine().by;
        Object[] a = mVar.a();
        for (int i2 = mVar.a - 1; i2 >= 0; i2--) {
            a aVar = (a) a[i2];
            if (aVar.a <= i) {
                mVar.remove(i2);
            } else {
                aVar.a(yVar, f);
            }
        }
    }

    public static void a(y yVar, a aVar) {
        if (yVar.bp == null) {
            yVar.bp = new m();
        }
        if (yVar.bp.size() > 1000) {
            yVar.a("status effect limit reached");
        } else {
            yVar.bp.add(aVar);
        }
    }

    public static void a(y yVar, GameOutputStream gameOutputStream) {
        int size;
        m mVar = yVar.bp;
        if (mVar == null) {
            size = 0;
        } else {
            size = mVar.size();
        }
        gameOutputStream.a((short) size);
        if (size == 0) {
            return;
        }
        gameOutputStream.e("s");
        Object[] a = mVar.a();
        for (int i = 0; i < mVar.a; i++) {
            a aVar = (a) a[i];
            gameOutputStream.writeEnum(aVar.b());
            aVar.a(yVar, gameOutputStream);
        }
        gameOutputStream.endBlock("s");
    }

    public static void a(y yVar, GameInputStream gameInputStream) {
        int readShort = gameInputStream.readShort();
        if (readShort <= 0) {
            yVar.bp = null;
            return;
        }
        if (yVar.bp == null) {
            yVar.bp = new m();
        } else {
            yVar.bp.clear();
        }
        m mVar = yVar.bp;
        gameInputStream.startBlock("s");
        for (int i = 0; i < readShort; i++) {
            b bVar = (b) gameInputStream.b(b.class);
            if (bVar == null) {
                throw new IOException("Unknown status effect type");
            }
            a a = bVar.a();
            a.a(yVar, gameInputStream);
            mVar.add(a);
        }
        gameInputStream.endBlock("s");
    }
}