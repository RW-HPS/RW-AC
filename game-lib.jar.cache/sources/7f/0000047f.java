package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.os.Environment;
import android.util.Log;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.be */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/be.class */
public class C0729be {

    /* renamed from: e */
    static C0729be f4602e = null;

    /* renamed from: a */
    public boolean f4603a = false;

    /* renamed from: b */
    String f4604b = "rtsSave";

    /* renamed from: c */
    String f4605c = "rtsSave.bak";

    /* renamed from: d */
    public boolean f4606d = false;

    /* renamed from: f */
    HashMap f4607f = new HashMap();

    /* renamed from: a */
    public void m2474a(Context context) {
        if (GameEngine.f6418aU || this.f4603a) {
            return;
        }
        try {
        } catch (FileNotFoundException e) {
            Log.m5072b("RustedWarfare", "file save error:", e);
        } catch (IOException e2) {
            Log.m5072b("RustedWarfare", "file save error:", e2);
        }
        if (context == null) {
            throw new IOException("context==null");
        }
        try {
            FileOutputStream mo5310b = context.mo5310b(this.f4604b, 0);
            DataOutputStream dataOutputStream = new DataOutputStream(mo5310b);
            m2472a(dataOutputStream);
            dataOutputStream.close();
            mo5310b.close();
            if (this.f4606d) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4605c));
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    m2472a(dataOutputStream2);
                    dataOutputStream2.close();
                    fileOutputStream.close();
                } catch (IOException e3) {
                    Log.m5072b("RustedWarfare", "file read error:", e3);
                }
            }
        } catch (NullPointerException e4) {
            throw new IOException("openFileOutput NullPointerException", e4);
        }
    }

    /* renamed from: a */
    public boolean m2472a(DataOutputStream dataOutputStream) {
        if (GameEngine.f6418aU) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f4607f.size());
            for (C0730bf c0730bf : this.f4607f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(c0730bf.f4608a);
                dataOutputStream.writeUTF(c0730bf.f4609b);
                dataOutputStream.writeInt(c0730bf.f4610c);
                dataOutputStream.writeBoolean(c0730bf.f4611d);
                dataOutputStream.writeBoolean(c0730bf.f4612e);
                dataOutputStream.writeBoolean(c0730bf.f4613f);
                dataOutputStream.writeLong(c0730bf.f4614g);
                dataOutputStream.writeInt(c0730bf.f4615h);
            }
            dataOutputStream.flush();
            return true;
        } catch (IOException e) {
            Log.m5072b("RustedWarfare", "file save error:", e);
            return false;
        }
    }

    /* renamed from: b */
    public void m2470b(Context context) {
        if (this.f4603a) {
            return;
        }
        boolean z = false;
        Log.m5069d("RustedWarfare", "Trying to load from internal memory");
        try {
            FileInputStream mo5313a = context.mo5313a(this.f4604b);
            z = m2473a(new DataInputStream(mo5313a));
            if (z) {
                Log.m5069d("RustedWarfare", "loaded from internal memory");
            }
            mo5313a.close();
        } catch (IOException e) {
            Log.m5072b("RustedWarfare", "file read error:", e);
        }
        if (this.f4606d && !z) {
            Log.m5069d("RustedWarfare", "Trying to load from SD");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.f4605c));
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                if (m2473a(dataInputStream)) {
                    Log.m5069d("RustedWarfare", "loaded from SD");
                }
                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e2) {
                Log.m5072b("RustedWarfare", "file read error:", e2);
            }
        }
    }

    /* renamed from: a */
    public boolean m2473a(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.m5069d("RustedWarfare", "Warning file is at version:" + readInt);
                return false;
            }
            dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            this.f4607f.clear();
            for (int i = 0; i < readInt2; i++) {
                C0730bf c0730bf = new C0730bf(this);
                dataInputStream.readInt();
                c0730bf.f4608a = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                    Log.m5069d("RustedWarfare", "converting:" + readUTF);
                    readUTF = "maps/challenge/l090;Level 7.tmx";
                }
                c0730bf.f4609b = readUTF;
                c0730bf.f4610c = dataInputStream.readInt();
                c0730bf.f4611d = dataInputStream.readBoolean();
                c0730bf.f4612e = dataInputStream.readBoolean();
                c0730bf.f4613f = dataInputStream.readBoolean();
                c0730bf.f4614g = dataInputStream.readLong();
                c0730bf.f4615h = dataInputStream.readInt();
                this.f4607f.put(m2471a(c0730bf.f4609b), c0730bf);
            }
            return true;
        } catch (IOException e) {
            Log.m5072b("RustedWarfare", "file read error:", e);
            return false;
        }
    }

    /* renamed from: c */
    public static C0729be m2468c(Context context) {
        if (f4602e == null) {
            f4602e = new C0729be(context);
            if (!GameEngine.f6418aU) {
                f4602e.m2470b(context);
            }
        }
        return f4602e;
    }

    private C0729be(Context context) {
    }

    /* renamed from: a */
    public String m2471a(String str) {
        Integer m980l = GameEngine.m980l(str);
        if (m980l != null) {
            return GameEngine.m984j(str) + "/l" + m980l;
        }
        return str;
    }

    /* renamed from: b */
    public C0730bf m2469b(String str) {
        String m2471a = m2471a(str);
        C0730bf c0730bf = (C0730bf) this.f4607f.get(m2471a);
        Log.m5069d("RustedWarfare", "StateEngine: get(" + str + ")=" + c0730bf + "  (key=" + m2471a + ")");
        if (c0730bf == null) {
            c0730bf = new C0730bf(this);
            c0730bf.f4608a = 1;
            c0730bf.f4609b = str;
            this.f4607f.put(m2471a, c0730bf);
        }
        return c0730bf;
    }
}