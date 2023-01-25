package com.corrodinggames.rts.gameFramework.net;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.zip.DataFormatException;

/* renamed from: com.corrodinggames.rts.gameFramework.j.as */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/as.class */
public class GameOutputStream {

    /* renamed from: b */
    ByteArrayOutputStream byteStream;

    /* renamed from: c */
    DataOutputStream useStream;

    /* renamed from: a */
    private DataOutputStream dataStream;

    /* renamed from: e */
    private LinkedList f5947e;

    /* renamed from: d */
    public int packetVersion;

    /* renamed from: a */
    public void flashAll() {
        ListIterator listIterator = this.f5947e.listIterator(this.f5947e.size());
        while (listIterator.hasPrevious()) {
            ((GzipDataOutStream) listIterator.previous()).m1393a();
        }
        this.useStream.flush();
        if (this.byteStream != null) {
            this.byteStream.flush();
        }
    }

    /* renamed from: b */
    void mo1377b() {
        this.dataStream = this.useStream;
    }

    public GameOutputStream(int i) {
        this();
        this.packetVersion = i;
    }

    public GameOutputStream() {
        this.f5947e = new LinkedList();
        this.packetVersion = 999999;
        this.byteStream = new ByteArrayOutputStream();
        this.useStream = new DataOutputStream(this.byteStream);
        mo1377b();
    }

    public GameOutputStream(DataOutputStream dataOutputStream) {
        this.f5947e = new LinkedList();
        this.packetVersion = 999999;
        this.useStream = dataOutputStream;
        mo1377b();
    }

    /* renamed from: b */
    public Packet getPacket(int type) {
        return mo1390a(type, -1);
    }

    /* renamed from: a */
    public Packet mo1390a(int i, int i2) {
        try {
            flashAll();
            Packet packet = new Packet(i);
            packet.bytes = this.byteStream.toByteArray();
            packet.f7548d = i2;
            return packet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public String toString() {
        try {
            flashAll();
            return this.byteStream.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: d */
    public byte[] toByteArray() {
        try {
            flashAll();
            return this.byteStream.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: c */
    public void writeByte(int i) {
        this.dataStream.writeByte(i);
    }

    /* renamed from: a */
    public void writeBoolean(boolean z) {
        this.dataStream.writeBoolean(z);
    }

    /* renamed from: a */
    public void writeInt(int i) {
        this.dataStream.writeInt(i);
    }

    /* renamed from: a */
    public void writeFloat(float f) {
        this.dataStream.writeFloat(f);
    }

    /* renamed from: a */
    public void writeDouble(double d) {
        this.dataStream.writeDouble(d);
    }

    /* renamed from: a */
    public void writeLong(long j) {
        this.dataStream.writeLong(j);
    }

    /* renamed from: b */
    public void writeIsString(String str) {
        writeBoolean(str != null);
        if (str != null) {
            writeString(str);
        }
    }

    /* renamed from: a */
    public void writeIsInt(Integer num) {
        writeBoolean(num != null);
        if (num != null) {
            writeInt(num.intValue());
        }
    }

    /* renamed from: c */
    public void writeString(String str) {
        this.dataStream.writeUTF(str);
    }

    /* renamed from: a */
    public void m1400a(C0453g c0453g) {
        if (c0453g == null) {
            this.dataStream.writeUTF(VariableScope.nullOrMissingString);
        }
        this.dataStream.writeUTF(c0453g.toString());
    }

    /* renamed from: a */
    public void mo1383a(AbstractC1155w abstractC1155w) {
        if (abstractC1155w == null) {
            this.dataStream.writeLong(-1L);
        } else {
            this.dataStream.writeLong(abstractC1155w.f7166eh);
        }
    }

    /* renamed from: b */
    public void mo1374b(AbstractC1155w abstractC1155w) {
        if (abstractC1155w != null && !abstractC1155w.f7167ej) {
            this.dataStream.writeLong(abstractC1155w.f7166eh);
        } else {
            this.dataStream.writeLong(-1L);
        }
    }

    /* renamed from: a */
    public void m1398a(C1136m c1136m) {
        if (c1136m == null) {
            writeInt(0);
            return;
        }
        writeInt(c1136m.size());
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            mo1374b((AbstractC1155w) it.next());
        }
    }

    /* renamed from: b */
    public void mo1375b(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f7167ej && !abstractC0244am.f1612bV) {
            mo1383a((AbstractC1155w) abstractC0244am);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    /* renamed from: a */
    public void mo1334a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f7167ej) {
            mo1383a((AbstractC1155w) abstractC0244am);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    /* renamed from: a */
    public void mo1385a(AbstractC0629y abstractC0629y) {
        if (abstractC0629y != null && !abstractC0629y.f7167ej) {
            mo1383a((AbstractC1155w) abstractC0629y);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    /* renamed from: a */
    public void writeIsPointF(PointF pointF) {
        writeBoolean(pointF != null);
        if (pointF != null) {
            writeFloat(pointF.x);
            writeFloat(pointF.y);
        }
    }

    /* renamed from: a */
    public void writeEnum(Enum r4) {
        if (r4 == null) {
            this.dataStream.writeInt(-1);
        } else {
            this.dataStream.writeInt(r4.ordinal());
        }
    }

    /* renamed from: a */
    public void mo1386a(InterfaceC0303as interfaceC0303as) {
        if (interfaceC0303as == null) {
            this.dataStream.writeInt(-1);
        } else if (interfaceC0303as instanceof C0458l) {
            this.dataStream.writeInt(-2);
            writeString(((C0458l) interfaceC0303as).f2952M);
        } else {
            this.dataStream.writeInt(((EnumC0249ar) interfaceC0303as).ordinal());
        }
    }

    /* renamed from: a */
    public void mo1384a(PlayerConnect playerConnect) {
        if (playerConnect == null) {
            this.dataStream.writeInt(0);
        } else {
            this.dataStream.writeInt(playerConnect.connectIndex);
        }
    }

    /* renamed from: a */
    public void mo1387a(PlayerData playerData) {
        this.dataStream.writeByte(playerData.site);
    }

    /* renamed from: a */
    public void mo1381a(File file) {
        C1133j m2302a = C0765a.m2302a(file);
        if (m2302a == null) {
            throw new IOException("Failed to read save file data");
        }
        try {
            mo1380a(m2302a, (int) file.length());
            if (m2302a != null) {
                m2302a.close();
            }
        } catch (Throwable th) {
            if (m2302a != null) {
                m2302a.close();
            }
            throw th;
        }
    }

    /* renamed from: a */
    public void m1399a(GameInputStream gameInputStream) {
        InputStream useStream = gameInputStream.getUseStream();
        try {
            useStream.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        mo1380a(useStream, useStream.available());
    }

    /* renamed from: a */
    public void mo1380a(InputStream inputStream, int i) {
        int i2 = 0;
        writeInt(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (i2 + read > i) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        GameNetEngine.m1468g("writeStream: bytesTillFull is " + i3);
                        return;
                    } else {
                        this.dataStream.write(bArr, 0, i3);
                        return;
                    }
                }
                this.dataStream.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public void mo1382a(ByteArrayOutputStream byteArrayOutputStream) {
        writeInt(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.dataStream);
    }

    /* renamed from: a */
    public void mo1378a(byte[] bArr) {
        writeInt(bArr.length);
        this.dataStream.write(bArr);
    }

    /* renamed from: b */
    public void m1396b(byte[] bArr) {
        this.dataStream.write(bArr);
    }

    /* renamed from: a */
    public void mo1331a(short s) {
        this.dataStream.writeShort(s);
    }

    /* renamed from: e */
    public void mo1367e() {
        mo1331a((short) 12345);
    }

    /* renamed from: d */
    public void mo1368d(String str) {
    }

    /* renamed from: f */
    public boolean mo1365f() {
        return false;
    }

    /* renamed from: e */
    public void mo1366e(String str) {
        startBlock(str, false);
    }

    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        GzipDataOutStream gzipDataOutStream = new GzipDataOutStream(z);
        gzipDataOutStream.f5951c = str;
        this.f5947e.add(gzipDataOutStream);
        this.dataStream = ((GzipDataOutStream) this.f5947e.getLast()).f5952e;
    }

    /* renamed from: a */
    public void endBlock(String str) {
        GzipDataOutStream gzipDataOutStream = (GzipDataOutStream) this.f5947e.removeLast();
        if (!gzipDataOutStream.f5951c.equals(str)) {
            GameEngine.m1015b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + gzipDataOutStream.f5951c);
        }
        gzipDataOutStream.m1393a();
        if (this.f5947e.isEmpty()) {
            this.dataStream = this.useStream;
        } else {
            this.dataStream = ((GzipDataOutStream) this.f5947e.getLast()).f5952e;
        }
        this.dataStream.writeUTF(gzipDataOutStream.f5951c);
        mo1382a(gzipDataOutStream.f5954d);
        try {
            gzipDataOutStream.m1392b();
        } catch (Exception e) {
            if (e instanceof DataFormatException) {
                if (!GameEngine.f6423aZ) {
                    GameEngine.print("DataFormatException error calling streamBlock.close() (this is expected on android 4.4)");
                    return;
                }
                return;
            }
            GameEngine.print("Error calling streamBlock.close() to clean up memory");
            e.printStackTrace();
        }
    }

    /* renamed from: g */
    public int getPacketVersion() {
        return this.packetVersion;
    }

    /* renamed from: h */
    public void m1394h() {
        this.useStream = null;
        this.dataStream = null;
        try {
            if (this.byteStream != null) {
                this.byteStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        this.byteStream = null;
    }
}