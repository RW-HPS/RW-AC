package com.corrodinggames.rts.gameFramework.net;

import android.graphics.PointF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ar;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.utility.j;
import com.corrodinggames.rts.gameFramework.w;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.PrintStream;
import java.util.LinkedList;
import java.util.ListIterator;

/* renamed from: com.corrodinggames.rts.gameFramework.j.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/aw.class */
public class aw extends GameOutputStream {
    ByteArrayOutputStream a;
    PrintStream e;
    private PrintStream f;
    private LinkedList g;

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void flashAll() {
        ListIterator listIterator = this.g.listIterator(this.g.size());
        while (listIterator.hasPrevious()) {
            ((ax) listIterator.previous()).a();
        }
        this.e.flush();
        if (this.a != null) {
            this.a.flush();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    void b() {
        this.f = this.e;
    }

    public aw() {
        this.g = new LinkedList();
        this.a = new ByteArrayOutputStream();
        this.e = new PrintStream(this.a);
        b();
    }

    public aw(PrintStream printStream) {
        this.g = new LinkedList();
        this.e = printStream;
        b();
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: b */
    public Packet getPacket(int i) {
        return a(i, -1);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public Packet a(int i, int i2) {
        try {
            flashAll();
            Packet packet = new Packet(i);
            packet.bytes = this.a.toByteArray();
            packet.f0d = i2;
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
            return this.a.toString();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: d */
    public byte[] toByteArray() {
        try {
            flashAll();
            return this.a.toByteArray();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: c */
    public void writeByte(int i) {
        this.f.println(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeBoolean(boolean z) {
        this.f.println(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeInt(int i) {
        this.f.println("#int:");
        this.f.println(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeFloat(float f) {
        this.f.println("#writeFloat");
        this.f.println(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeLong(long j) {
        this.f.println("#writeLong");
        this.f.println(j);
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
        this.f.println(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(w wVar) {
        this.f.println("#writeGameObject:");
        if (wVar == null) {
            this.f.println(-1);
        } else {
            this.f.println(wVar.eh);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void b(w wVar) {
        this.f.println("#writeExistingGameObject:");
        if (wVar != null && !wVar.ej) {
            this.f.println(wVar.eh);
        } else {
            this.f.println(-1);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void b(am amVar) {
        if (amVar != null && !amVar.ej && !amVar.bV) {
            a((w) amVar);
        } else {
            a((w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(am amVar) {
        if (amVar != null && !amVar.ej) {
            a((w) amVar);
        } else {
            a((w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(y yVar) {
        if (yVar != null && !yVar.ej) {
            a((w) yVar);
        } else {
            a((w) null);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void writeIsPointF(PointF pointF) {
        this.f.println("#PointF:");
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
            this.f.println("#Enum: null");
            this.f.println(-1);
            return;
        }
        this.f.println("#Enum:" + r5.getClass().getSimpleName() + " : " + r5.toString());
        this.f.println(r5.ordinal());
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(as asVar) {
        this.f.println("#unitType:");
        if (asVar == null) {
            this.f.println(-1);
        } else if (asVar instanceof l) {
            this.f.println(-2);
            writeString(((l) asVar).M);
        } else {
            this.f.println(((ar) asVar).ordinal());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(PlayerConnect playerConnect) {
        if (playerConnect == null) {
            this.f.println(0);
        } else {
            this.f.println(playerConnect.connectIndex);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(PlayerData playerData) {
        this.f.println("#team:");
        this.f.println(playerData.site);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(File file) {
        j a = a.a(file);
        try {
            a(a, (int) file.length());
        } finally {
            a.close();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
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
                        this.f.write(bArr, 0, i3);
                        return;
                    }
                }
                this.f.write(bArr, 0, read);
                i2 += read;
            } else {
                return;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(ByteArrayOutputStream byteArrayOutputStream) {
        writeInt(byteArrayOutputStream.size());
        byteArrayOutputStream.writeTo(this.f);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(byte[] bArr) {
        writeInt(bArr.length);
        this.f.write(bArr);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void a(short s) {
        this.f.println("#writeShort");
        this.f.println((int) s);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void e() {
        this.f.println("#writeMark:");
        a((short) 12345);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void d(String str) {
        this.f.println("#writeIfDebugOnly: " + str);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public boolean f() {
        return true;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    public void e(String str) {
        startBlock(str, false);
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void startBlock(String str, boolean z) {
        ax axVar = new ax(z);
        axVar.b = str;
        this.g.add(axVar);
        this.f = ((ax) this.g.getLast()).d;
    }

    @Override // com.corrodinggames.rts.gameFramework.net.GameOutputStream
    /* renamed from: a */
    public void endBlock(String str) {
        ax axVar = (ax) this.g.removeLast();
        if (!axVar.b.equals(str)) {
            GameEngine.b("OutputNetStream:endBlock", "Name does not match: expected" + str + " , got:" + axVar.b);
        }
        axVar.a();
        if (this.g.isEmpty()) {
            this.f = this.e;
        } else {
            this.f = ((ax) this.g.getLast()).d;
        }
        String str2 = VariableScope.nullOrMissingString;
        String str3 = VariableScope.nullOrMissingString;
        for (int i = 0; i < this.g.size(); i++) {
            str2 = str2 + ">";
            str3 = str3 + "<";
        }
        this.f.println(str2 + ">>>> Start of block: " + axVar.b);
        a(axVar.c);
        this.f.println(str3 + "<<<< End of block: " + axVar.b);
        axVar.b();
    }
}