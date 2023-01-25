package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bn.class */
public class C0738bn {

    /* renamed from: a */
    private int f4632a = -1;

    /* renamed from: b */
    private C0733bi[] f4633b = new C0733bi[EnumC0734bj.values().length];

    public C0738bn() {
        m2453a();
    }

    /* renamed from: a */
    public void m2453a() {
        for (int i = 0; i < this.f4633b.length; i++) {
            this.f4633b[i] = new C0733bi();
        }
    }

    /* renamed from: a */
    public void m2445a(GameInputStream gameInputStream) {
        int readInt;
        int readInt2;
        if (gameInputStream.readBoolean()) {
            gameInputStream.checkMark("History");
            gameInputStream.readByte();
            this.f4632a = gameInputStream.readInt();
            boolean readBoolean = gameInputStream.readBoolean();
            int readByte = gameInputStream.readByte();
            m2453a();
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
                    if (i < this.f4633b.length) {
                        this.f4633b[i].add(new C0732bh(readInt, readInt2));
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m2446a(GameOutputStream gameOutputStream) {
        C0733bi[] c0733biArr;
        gameOutputStream.writeBoolean(true);
        if (1 != 0) {
            gameOutputStream.mo1367e();
            gameOutputStream.writeByte(0);
            gameOutputStream.writeInt(this.f4632a);
            gameOutputStream.writeBoolean(true);
            gameOutputStream.writeByte(this.f4633b.length);
            int i = 0;
            for (C0733bi c0733bi : this.f4633b) {
                short size = (short) c0733bi.size();
                gameOutputStream.mo1331a(size);
                int i2 = 0;
                int i3 = 0;
                for (int i4 = 0; i4 < size; i4++) {
                    i++;
                    C0732bh c0732bh = (C0732bh) c0733bi.get(i4);
                    if (1 != 0) {
                        int i5 = c0732bh.f4623a;
                        int i6 = c0732bh.f4624b;
                        gameOutputStream.writeInt(i5 - i2);
                        gameOutputStream.writeInt(i6 - i3);
                        i2 = i5;
                        i3 = i6;
                    } else {
                        gameOutputStream.writeInt(c0732bh.f4623a);
                        gameOutputStream.writeInt(c0732bh.f4624b);
                    }
                }
            }
            GameEngine.m5460e("TeamHistory(" + this.f4632a + "): totalValues written:" + i);
        }
    }

    /* renamed from: a */
    public void m2451a(PlayerData playerData, int i, boolean z) {
        EnumC0734bj[] values;
        for (EnumC0734bj enumC0734bj : EnumC0734bj.values()) {
            int m1720a = enumC0734bj.f4629e.m1720a(playerData);
            C0733bi c0733bi = this.f4633b[enumC0734bj.ordinal()];
            if (c0733bi.isEmpty() || z || ((C0732bh) c0733bi.get(c0733bi.size() - 1)).f4624b != m1720a) {
                c0733bi.add(new C0732bh(i, m1720a));
            }
        }
    }

    /* renamed from: a */
    public void m2452a(int i) {
        this.f4632a = i;
    }

    /* renamed from: b */
    public int m2444b() {
        return this.f4632a;
    }

    /* renamed from: a */
    public C0733bi m2449a(EnumC0734bj enumC0734bj) {
        return this.f4633b[enumC0734bj.ordinal()];
    }

    /* renamed from: c */
    public boolean m2443c() {
        if (this.f4632a < 0) {
            return false;
        }
        for (C0733bi c0733bi : this.f4633b) {
            if (c0733bi.size() > 1) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public int m2448a(EnumC0734bj enumC0734bj, int i) {
        return this.f4633b[enumC0734bj.ordinal()].m2457a(i);
    }

    /* renamed from: a */
    public void m2447a(C0738bn c0738bn) {
        for (int i = 0; i < this.f4633b.length; i++) {
            this.f4633b[i] = m2450a(this.f4633b[i], c0738bn.f4633b[i]);
        }
    }

    /* renamed from: a */
    private C0733bi m2450a(C0733bi c0733bi, C0733bi c0733bi2) {
        if (c0733bi.isEmpty()) {
            c0733bi.addAll(c0733bi2);
            return c0733bi;
        }
        C0733bi c0733bi3 = new C0733bi();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        Iterator it = c0733bi.iterator();
        while (it.hasNext()) {
            C0732bh c0732bh = (C0732bh) it.next();
            int i4 = c0732bh.f4623a;
            int i5 = c0732bh.f4624b;
            if (i < c0733bi2.size()) {
                C0732bh c0732bh2 = (C0732bh) c0733bi2.get(i);
                while (c0732bh2.f4623a < i4) {
                    i3 = c0732bh2.f4624b;
                    c0733bi3.add(new C0732bh(c0732bh2.f4623a, i2 + i3));
                    i++;
                    if (i < c0733bi2.size()) {
                        c0732bh2 = (C0732bh) c0733bi2.get(i);
                    }
                }
                if (c0732bh2.f4623a == i4) {
                    i3 = c0732bh2.f4624b;
                    i2 = i5;
                    c0733bi3.add(new C0732bh(i4, i2 + i3));
                    i++;
                } else if (c0732bh2.f4623a > i4) {
                    i2 = i5;
                    c0733bi3.add(new C0732bh(i4, i2 + i3));
                }
            } else {
                i2 = i5;
                c0733bi3.add(new C0732bh(i4, i2 + i3));
            }
        }
        while (i < c0733bi2.size()) {
            C0732bh c0732bh3 = (C0732bh) c0733bi2.get(i);
            c0733bi3.add(new C0732bh(c0732bh3.f4623a, i2 + c0732bh3.f4624b));
            i++;
        }
        return c0733bi3;
    }
}