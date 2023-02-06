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
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.utility.j;
import com.corrodinggames.rts.gameFramework.utility.m;
import com.corrodinggames.rts.gameFramework.w;
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
    private LinkedList e;

    /* renamed from: d */
    public int packetVersion;

    /* renamed from: a */
    public void flashAll() {
        ListIterator listIterator = this.e.listIterator(this.e.size());
        while (listIterator.hasPrevious()) {
            ((GzipDataOutStream) listIterator.previous()).a();
        }
        this.useStream.flush();
        if (this.byteStream != null) {
            this.byteStream.flush();
        }
    }

    void b() {
        this.dataStream = this.useStream;
    }

    public GameOutputStream(int i) {
        this();
        this.packetVersion = i;
    }

    public GameOutputStream() {
        this.e = new LinkedList();
        this.packetVersion = 999999;
        this.byteStream = new ByteArrayOutputStream();
        this.useStream = new DataOutputStream(this.byteStream);
        b();
    }

    public GameOutputStream(DataOutputStream dataOutputStream) {
        this.e = new LinkedList();
        this.packetVersion = 999999;
        this.useStream = dataOutputStream;
        b();
    }

    /* renamed from: b */
    public Packet getPacket(int type) {
        return a(type, -1);
    }

    public Packet a(int i, int i2) {
        try {
            flashAll();
            Packet packet = new Packet(i);
            packet.bytes = this.byteStream.toByteArray();
            packet.f0d = i2;
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

    public void a(g gVar) {
        if (gVar == null) {
            this.dataStream.writeUTF(VariableScope.nullOrMissingString);
        }
        this.dataStream.writeUTF(gVar.toString());
    }

    public void a(w wVar) {
        if (wVar == null) {
            this.dataStream.writeLong(-1L);
        } else {
            this.dataStream.writeLong(wVar.eh);
        }
    }

    public void b(w wVar) {
        if (wVar != null && !wVar.ej) {
            this.dataStream.writeLong(wVar.eh);
        } else {
            this.dataStream.writeLong(-1L);
        }
    }

    public void a(m mVar) {
        if (mVar == null) {
            writeInt(0);
            return;
        }
        writeInt(mVar.size());
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            b((w) it.next());
        }
    }

    public void b(am amVar) {
        if (amVar != null && !amVar.ej && !amVar.bV) {
            a((w) amVar);
        } else {
            a((w) null);
        }
    }

    public void a(am amVar) {
        if (amVar != null && !amVar.ej) {
            a((w) amVar);
        } else {
            a((w) null);
        }
    }

    public void a(y yVar) {
        if (yVar != null && !yVar.ej) {
            a((w) yVar);
        } else {
            a((w) null);
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

    public void a(as asVar) {
        if (asVar == null) {
            this.dataStream.writeInt(-1);
        } else if (asVar instanceof l) {
            this.dataStream.writeInt(-2);
            writeString(((l) asVar).M);
        } else {
            this.dataStream.writeInt(((ar) asVar).ordinal());
        }
    }

    public void a(PlayerConnect playerConnect) {
        if (playerConnect == null) {
            this.dataStream.writeInt(0);
        } else {
            this.dataStream.writeInt(playerConnect.connectIndex);
        }
    }

    public void a(PlayerData playerData) {
        this.dataStream.writeByte(playerData.site);
    }

    public void a(File file) {
        j a = a.a(file);
        if (a == null) {
            throw new IOException("Failed to read save file data");
        }
        try {
            a(a, (int) file.length());
            if (a != null) {
                a.close();
            }
        } catch (Throwable th) {
            if (a != null) {
                a.close();
            }
            throw th;
        }
    }

    public void a(GameInputStream gameInputStream) {
        InputStream useStream = gameInputStream.getUseStream();
        try {
            useStream.reset();
        } catch (IOException e) {
            e.printStackTrace();
        }
        a(useStream, useStream.available());
    }

    public void a(InputStream inputStream, int i) {
        int i2 = 0;
        writeInt(i);
        byte[] bArr = new byte[16384];
        while (true) {
            int read = inputStream.read(bArr, 0, bArr.length);
            if (read != -1) {
                if (i2 + read > i) {
                    int i3 = i - i2;
                    if (i3 < 0) {
                        GameNetEngine.g("writeStream: bytesTillFull is " + i3);
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

    public void a(ByteArrayOutputStream byteArrayOutputStream) {
        writeInt(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.dataStream);
    }

    public void a(byte[] bArr) {
        writeInt(bArr.length);
        this.dataStream.write(bArr);
    }

    public void b(byte[] bArr) {
        this.dataStream.write(bArr);
    }

    public void a(short s) {
        this.dataStream.writeShort(s);
    }

    public void e() {
        a((short) 12345);
    }

    public void d(String str) {
    }

    public boolean f() {
        return false;
    }

    public void e(String str) {
        startBlock(str, false);
    }

    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        GzipDataOutStream gzipDataOutStream = new GzipDataOutStream(z);
        gzipDataOutStream.c = str;
        this.e.add(gzipDataOutStream);
        this.dataStream = ((GzipDataOutStream) this.e.getLast()).e;
    }

    /* renamed from: a */
    public void endBlock(String str) {
        GzipDataOutStream gzipDataOutStream = (GzipDataOutStream) this.e.removeLast();
        if (!gzipDataOutStream.c.equals(str)) {
            GameEngine.b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + gzipDataOutStream.c);
        }
        gzipDataOutStream.a();
        if (this.e.isEmpty()) {
            this.dataStream = this.useStream;
        } else {
            this.dataStream = ((GzipDataOutStream) this.e.getLast()).e;
        }
        this.dataStream.writeUTF(gzipDataOutStream.c);
        a(gzipDataOutStream.d);
        try {
            gzipDataOutStream.b();
        } catch (Exception e) {
            if (e instanceof DataFormatException) {
                if (!GameEngine.aZ) {
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

    public void h() {
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