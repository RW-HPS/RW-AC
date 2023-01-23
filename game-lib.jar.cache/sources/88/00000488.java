package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bn.class */
public class bn {

    /* renamed from: a  reason: collision with root package name */
    private int f455a = -1;
    private bi[] b = new bi[bj.values().length];

    public bn() {
        a();
    }

    public void a() {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = new bi();
        }
    }

    public void a(GameInputStream gameInputStream) {
        int readInt;
        int readInt2;
        if (gameInputStream.readBoolean()) {
            gameInputStream.checkMark("History");
            gameInputStream.readByte();
            this.f455a = gameInputStream.readInt();
            boolean readBoolean = gameInputStream.readBoolean();
            int readByte = gameInputStream.readByte();
            a();
            for (int i = 0; i < readByte; i++) {
                int i2 = 0;
                int i3 = 0;
                int readShort = gameInputStream.readShort();
                for (int i4 = 0; i4 < readShort; i4++) {
                    if (readBoolean) {
                        readInt = gameInputStream.readInt() + i2;
                        readInt2 = gameInputStream.readInt() + i3;
                        i2 = readInt;
                        i3 = readInt2;
                    } else {
                        readInt = gameInputStream.readInt();
                        readInt2 = gameInputStream.readInt();
                    }
                    if (i < this.b.length) {
                        this.b[i].add(new bh(readInt, readInt2));
                    }
                }
            }
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        bi[] biVarArr;
        gameOutputStream.writeBoolean(true);
        if (1 != 0) {
            gameOutputStream.e();
            gameOutputStream.writeByte(0);
            gameOutputStream.writeInt(this.f455a);
            gameOutputStream.writeBoolean(true);
            gameOutputStream.writeByte(this.b.length);
            int i = 0;
            for (bi biVar : this.b) {
                short size = (short) biVar.size();
                gameOutputStream.a(size);
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i++;
                    bh bhVar = (bh) biVar.get(i4);
                    if (1 != 0) {
                        int i5 = bhVar.f452a;
                        int i6 = bhVar.b;
                        gameOutputStream.writeInt(i5 - i2);
                        gameOutputStream.writeInt(i6 - i3);
                        i2 = i5;
                        i3 = i6;
                    } else {
                        gameOutputStream.writeInt(bhVar.f452a);
                        gameOutputStream.writeInt(bhVar.b);
                    }
                }
            }
            GameEngine.m328e("TeamHistory(" + this.f455a + "): totalValues written:" + i);
        }
    }

    public void a(PlayerData playerData, int i, boolean z) {
        bj[] values;
        for (bj bjVar : bj.values()) {
            int a2 = bjVar.e.a(playerData);
            bi biVar = this.b[bjVar.ordinal()];
            if (biVar.isEmpty() || z || ((bh) biVar.get(biVar.size() - 1)).b != a2) {
                biVar.add(new bh(i, a2));
            }
        }
    }

    public void a(int i) {
        this.f455a = i;
    }

    public int b() {
        return this.f455a;
    }

    public bi a(bj bjVar) {
        return this.b[bjVar.ordinal()];
    }

    public boolean c() {
        if (this.f455a < 0) {
            return false;
        }
        for (bi biVar : this.b) {
            if (biVar.size() > 1) {
                return true;
            }
        }
        return false;
    }

    public int a(bj bjVar, int i) {
        return this.b[bjVar.ordinal()].a(i);
    }

    public void a(bn bnVar) {
        for (int i = 0; i < this.b.length; i++) {
            this.b[i] = a(this.b[i], bnVar.b[i]);
        }
    }

    private bi a(bi biVar, bi biVar2) {
        if (biVar.isEmpty()) {
            biVar.addAll(biVar2);
            return biVar;
        }
        bi biVar3 = new bi();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Iterator it = biVar.iterator();
        while (it.hasNext()) {
            bh bhVar = (bh) it.next();
            int i4 = bhVar.f452a;
            int i5 = bhVar.b;
            if (i < biVar2.size()) {
                bh bhVar2 = (bh) biVar2.get(i);
                while (bhVar2.f452a < i4) {
                    i3 = bhVar2.b;
                    biVar3.add(new bh(bhVar2.f452a, i2 + i3));
                    i++;
                    if (i < biVar2.size()) {
                        bhVar2 = (bh) biVar2.get(i);
                    }
                }
                if (bhVar2.f452a == i4) {
                    i3 = bhVar2.b;
                    i2 = i5;
                    biVar3.add(new bh(i4, i2 + i3));
                    i++;
                } else if (bhVar2.f452a > i4) {
                    i2 = i5;
                    biVar3.add(new bh(i4, i2 + i3));
                }
            } else {
                i2 = i5;
                biVar3.add(new bh(i4, i2 + i3));
            }
        }
        while (i < biVar2.size()) {
            bh bhVar3 = (bh) biVar2.get(i);
            biVar3.add(new bh(bhVar3.f452a, i2 + bhVar3.b));
            i++;
        }
        return biVar3;
    }
}