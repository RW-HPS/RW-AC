package com.corrodinggames.rts.gameFramework.net;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.w;
import java.io.ByteArrayInputStream;
import java.io.DataInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/k.class */
public class GameInputStream {

    /* renamed from: a */
    ByteArrayInputStream byteStream;

    /* renamed from: e */
    private DataInputStream dataStream;

    /* renamed from: f */
    private DataInputStream useStream;
    private LinkedList g = new LinkedList();
    int b = 999999;
    int c = 999999;
    int d = 0;

    /* renamed from: a */
    void setMainStream() {
        this.useStream = this.dataStream;
    }

    public GameInputStream(Packet packet) {
        this.byteStream = new ByteArrayInputStream(packet.bytes);
        this.dataStream = new DataInputStream(this.byteStream);
        setMainStream();
    }

    public GameInputStream(DataInputStream dataInputStream) {
        this.dataStream = dataInputStream;
        setMainStream();
    }

    public GameInputStream(String str) {
        this.byteStream = new ByteArrayInputStream(str.getBytes());
        this.dataStream = new DataInputStream(this.byteStream);
        setMainStream();
    }

    public GameInputStream(byte[] bArr) {
        this.byteStream = new ByteArrayInputStream(bArr);
        this.dataStream = new DataInputStream(this.byteStream);
        setMainStream();
    }

    public void a(int i) {
        this.b = i;
    }

    public int b() {
        return this.b;
    }

    /* renamed from: b */
    public void setCacheInt(int i) {
        this.c = i;
    }

    /* renamed from: c */
    public int getCacheInt() {
        return this.c;
    }

    /* renamed from: d */
    public byte readByte() {
        return this.useStream.readByte();
    }

    /* renamed from: e */
    public boolean readBoolean() {
        return this.useStream.readBoolean();
    }

    /* renamed from: f */
    public int readInt() {
        return this.useStream.readInt();
    }

    /* renamed from: g */
    public float readFloat() {
        return this.useStream.readFloat();
    }

    /* renamed from: h */
    public double readDouble() {
        return this.useStream.readDouble();
    }

    /* renamed from: i */
    public long readLong() {
        return this.useStream.readLong();
    }

    /* renamed from: j */
    public String isReadString() {
        if (!readBoolean()) {
            return null;
        }
        return readString();
    }

    /* renamed from: k */
    public Integer isReadInt() {
        if (!readBoolean()) {
            return null;
        }
        return Integer.valueOf(readInt());
    }

    /* renamed from: l */
    public String readString() {
        return this.useStream.readUTF();
    }

    public g m() {
        String readUTF = this.useStream.readUTF();
        if (readUTF.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        return g.c(readUTF);
    }

    /* renamed from: n  reason: collision with other method in class */
    public long m318n() {
        return this.useStream.readLong();
    }

    public w a(Class cls) {
        return w.a(this.useStream.readLong(), cls, false);
    }

    public void a(m mVar, Class cls) {
        int readInt = readInt();
        for (int i = 0; i < readInt; i++) {
            w a2 = a(cls);
            if (a2 != null) {
                mVar.add(a2);
            }
        }
    }

    public am o() {
        return a(m.warn);
    }

    public am a(m mVar) {
        return w.a(this.useStream.readLong(), mVar == m.expected);
    }

    public y p() {
        return w.b(this.useStream.readLong(), false);
    }

    public Enum b(Class cls) {
        int readInt = this.useStream.readInt();
        if (readInt == -1) {
            return null;
        }
        Object[] enumConstants = cls.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            GameNetEngine.g("readEnum:" + readInt + " is out of range for " + cls.toString());
            return null;
        }
        return (Enum) enumConstants[readInt];
    }

    public as q() {
        int readInt = this.useStream.readInt();
        if (readInt == -1) {
            return null;
        }
        if (readInt == -2) {
            String readString = readString();
            l n = l.n(readString);
            if (n == null) {
                GameNetEngine.g("readUnitType: Could not find customUnitMetadata:" + readString);
            }
            as c = l.c(n);
            if (c != null) {
                if (c instanceof l) {
                    n = (l) c;
                } else {
                    GameEngine.print("replacement not a custom unit:" + c.i());
                }
            }
            return n;
        }
        Object[] enumConstants = ar.class.getEnumConstants();
        if (readInt < 0 || readInt >= enumConstants.length) {
            GameNetEngine.g("readUnitType:" + readInt + " is out of range for UnitType");
            return null;
        }
        return (ar) enumConstants[readInt];
    }

    public PlayerData r() {
        byte readByte = this.useStream.readByte();
        PlayerData k = PlayerData.k(readByte);
        if (k == null) {
            throw new IOException("Error loading save data, could not find referenced team:" + ((int) readByte) + VariableScope.nullOrMissingString);
        }
        return k;
    }

    public PlayerData s() {
        return PlayerData.k(this.useStream.readByte());
    }

    /* renamed from: t */
    public byte[] readBytes() {
        int read;
        int i = 0;
        int readInt = readInt();
        byte[] bArr = new byte[readInt];
        while (i < readInt && (read = this.useStream.read(bArr, i, readInt - i)) != -1) {
            i += read;
        }
        return bArr;
    }

    public GameInputStream u() {
        return new GameInputStream(readBytes());
    }

    /* renamed from: v */
    public short readShort() {
        return this.useStream.readShort();
    }

    /* renamed from: a */
    public void checkMark(String str) {
        if (readShort() != 12345) {
            GameNetEngine.g("Mark wasn't read for:" + str);
            if (GameEngine.getGameEngine().aa()) {
                throw new RuntimeException("Mark wasn't read for:" + str);
            }
        }
    }

    /* renamed from: w */
    public InputStream getUseStream() {
        return this.useStream;
    }

    /* renamed from: b */
    public void startBlock(String str) {
        a(str, false);
    }

    public String x() {
        return a(false, false);
    }

    public void a(String str, boolean z) {
        a(str, z, false);
    }

    public void a(String str, boolean z, boolean z2) {
        if (this.b < 11) {
            GameEngine.m328e("Skipping start block:" + str);
            return;
        }
        String a2 = a(z, z2);
        if (!a2.equals(str)) {
            GameEngine.b("InputNetStream:endBlock", "Name does not match: expected:" + str + " , got:" + a2);
        }
    }

    /* renamed from: c */
    public byte[] getBytesAndCheckMark(String str) {
        String readUTF = this.useStream.readUTF();
        if (!readUTF.equals(str)) {
            GameEngine.b("getBlockRaw", "Name does not match: expected:" + str + " , got:" + readUTF);
        }
        return readBytes();
    }

    public String a(boolean z, boolean z2) {
        if (this.b < 11) {
            GameEngine.m328e("Skipping start block: startBlockAndGetName()");
            return "<skipped>";
        }
        String readUTF = this.useStream.readUTF();
        l lVar = new l(readBytes(), z, z2);
        lVar.f585a = readUTF;
        this.g.add(lVar);
        this.useStream = ((l) this.g.getLast()).c;
        return readUTF;
    }

    /* renamed from: d */
    public void endBlock(String str) {
        if (this.b < 11) {
            GameEngine.m328e("Skipping end block:" + str);
            return;
        }
        l lVar = (l) this.g.removeLast();
        if (!lVar.f585a.equals(str)) {
            GameEngine.b("InputNetStream:endBlock", "Name does not match: expected" + str + " ," + lVar.f585a);
        }
        if (this.g.isEmpty()) {
            this.useStream = this.dataStream;
        } else {
            this.useStream = ((l) this.g.getLast()).c;
        }
    }

    /* renamed from: y */
    public PointF getPointF() {
        if (!readBoolean()) {
            return null;
        }
        PointF pointF = new PointF();
        pointF.x = readFloat();
        pointF.y = readFloat();
        return pointF;
    }
}