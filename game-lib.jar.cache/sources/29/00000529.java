package com.corrodinggames.rts.gameFramework.net;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aw.class */
public class C0899aw extends GameOutputStream {

    /* renamed from: a */
    ByteArrayOutputStream f5963a;

    /* renamed from: e */
    PrintStream f5964e;

    /* renamed from: f */
    private PrintStream f5965f;

    /* renamed from: g */
    private LinkedList f5966g;

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void flashAll() {
        ListIterator listIterator = this.f5966g.listIterator(this.f5966g.size());
        while (listIterator.hasPrevious()) {
            ((C0900ax) listIterator.previous()).m1364a();
        }
        this.f5964e.flush();
        if (this.f5963a != null) {
            this.f5963a.flush();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    void mo1377b() {
        this.f5965f = this.f5964e;
    }

    public C0899aw() {
        this.f5966g = new LinkedList();
        this.f5963a = new ByteArrayOutputStream();
        this.f5964e = new PrintStream(this.f5963a);
        mo1377b();
    }

    public C0899aw(PrintStream printStream) {
        this.f5966g = new LinkedList();
        this.f5964e = printStream;
        mo1377b();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    public Packet getPacket(int i) {
        return mo1390a(i, -1);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public Packet mo1390a(int i, int i2) {
        try {
            flashAll();
            Packet packet = new Packet(i);
            packet.bytes = this.f5963a.toByteArray();
            packet.f7548d = i2;
            return packet;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: c */
    public String toString() {
        try {
            flashAll();
            return this.f5963a.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: d */
    public byte[] toByteArray() {
        try {
            flashAll();
            return this.f5963a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: c */
    public void writeByte(int i) {
        this.f5965f.println(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeBoolean(boolean z) {
        this.f5965f.println(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeInt(int i) {
        this.f5965f.println("#int:");
        this.f5965f.println(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeFloat(float f) {
        this.f5965f.println("#writeFloat");
        this.f5965f.println(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeLong(long j) {
        this.f5965f.println("#writeLong");
        this.f5965f.println(j);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    public void writeIsString(String str) {
        writeBoolean(str != null);
        if (str != null) {
            writeString(str);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: c */
    public void writeString(String str) {
        this.f5965f.println(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1383a(AbstractC1155w abstractC1155w) {
        this.f5965f.println("#writeGameObject:");
        if (abstractC1155w == null) {
            this.f5965f.println(-1);
        } else {
            this.f5965f.println(abstractC1155w.f7166eh);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    public void mo1374b(AbstractC1155w abstractC1155w) {
        this.f5965f.println("#writeExistingGameObject:");
        if (abstractC1155w != null && !abstractC1155w.f7167ej) {
            this.f5965f.println(abstractC1155w.f7166eh);
        } else {
            this.f5965f.println(-1);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    public void mo1375b(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f7167ej && !abstractC0244am.f1612bV) {
            mo1383a((AbstractC1155w) abstractC0244am);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1334a(AbstractC0244am abstractC0244am) {
        if (abstractC0244am != null && !abstractC0244am.f7167ej) {
            mo1383a((AbstractC1155w) abstractC0244am);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1385a(AbstractC0629y abstractC0629y) {
        if (abstractC0629y != null && !abstractC0629y.f7167ej) {
            mo1383a((AbstractC1155w) abstractC0629y);
        } else {
            mo1383a((AbstractC1155w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeIsPointF(PointF pointF) {
        this.f5965f.println("#PointF:");
        writeBoolean(pointF != null);
        if (pointF != null) {
            writeFloat(pointF.x);
            writeFloat(pointF.y);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeEnum(Enum r5) {
        if (r5 == null) {
            this.f5965f.println("#Enum: null");
            this.f5965f.println(-1);
            return;
        }
        this.f5965f.println("#Enum:" + r5.getClass().getSimpleName() + " : " + r5.toString());
        this.f5965f.println(r5.ordinal());
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1386a(InterfaceC0303as interfaceC0303as) {
        this.f5965f.println("#unitType:");
        if (interfaceC0303as == null) {
            this.f5965f.println(-1);
        } else if (interfaceC0303as instanceof C0458l) {
            this.f5965f.println(-2);
            writeString(((C0458l) interfaceC0303as).f2952M);
        } else {
            this.f5965f.println(((EnumC0249ar) interfaceC0303as).ordinal());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1384a(PlayerConnect playerConnect) {
        if (playerConnect == null) {
            this.f5965f.println(0);
        } else {
            this.f5965f.println(playerConnect.connectIndex);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1387a(PlayerData playerData) {
        this.f5965f.println("#team:");
        this.f5965f.println(playerData.site);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1381a(File file) {
        C1133j m2302a = C0765a.m2302a(file);
        try {
            mo1380a(m2302a, (int) file.length());
        } finally {
            m2302a.close();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
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
                        this.f5965f.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f5965f.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1382a(ByteArrayOutputStream byteArrayOutputStream) {
        writeInt(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f5965f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1378a(byte[] bArr) {
        writeInt(bArr.length);
        this.f5965f.write(bArr);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void mo1331a(short s) {
        this.f5965f.println("#writeShort");
        this.f5965f.println((int) s);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: e */
    public void mo1367e() {
        this.f5965f.println("#writeMark:");
        mo1331a((short) 12345);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: d */
    public void mo1368d(String str) {
        this.f5965f.println("#writeIfDebugOnly: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: f */
    public boolean mo1365f() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: e */
    public void mo1366e(String str) {
        startBlock(str, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        C0900ax c0900ax = new C0900ax(z);
        c0900ax.f5968b = str;
        this.f5966g.add(c0900ax);
        this.f5965f = ((C0900ax) this.f5966g.getLast()).f5969d;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void endBlock(String str) {
        C0900ax c0900ax = (C0900ax) this.f5966g.removeLast();
        if (!c0900ax.f5968b.equals(str)) {
            GameEngine.m1015b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + c0900ax.f5968b);
        }
        c0900ax.m1364a();
        if (this.f5966g.isEmpty()) {
            this.f5965f = this.f5964e;
        } else {
            this.f5965f = ((C0900ax) this.f5966g.getLast()).f5969d;
        }
        String str2 = VariableScope.nullOrMissingString;
        String str3 = VariableScope.nullOrMissingString;
        for (int i = 0; i < this.f5966g.size(); i++) {
            str2 = str2 + ">";
            str3 = str3 + "<";
        }
        this.f5965f.println(str2 + ">>>> Start of block: " + c0900ax.f5968b);
        mo1382a(c0900ax.f5971c);
        this.f5965f.println(str3 + "<<<< End of block: " + c0900ax.f5968b);
        c0900ax.m1363b();
    }
}