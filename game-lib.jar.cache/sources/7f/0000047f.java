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

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/be.class */
public class be {
    static be e = null;
    public boolean a = false;
    String b = "rtsSave";
    String c = "rtsSave.bak";
    public boolean d = false;
    HashMap f = new HashMap();

    public void a(Context context) {
        if (GameEngine.aU || this.a) {
            return;
        }
        try {
        } catch (FileNotFoundException e2) {
            Log.b("RustedWarfare", "file save error:", e2);
        } catch (IOException e3) {
            Log.b("RustedWarfare", "file save error:", e3);
        }
        if (context == null) {
            throw new IOException("context==null");
        }
        try {
            FileOutputStream b = context.b(this.b, 0);
            DataOutputStream dataOutputStream = new DataOutputStream(b);
            a(dataOutputStream);
            dataOutputStream.close();
            b.close();
            if (this.d) {
                try {
                    FileOutputStream fileOutputStream = new FileOutputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.c));
                    DataOutputStream dataOutputStream2 = new DataOutputStream(fileOutputStream);
                    a(dataOutputStream2);
                    dataOutputStream2.close();
                    fileOutputStream.close();
                } catch (IOException e4) {
                    Log.b("RustedWarfare", "file read error:", e4);
                }
            }
        } catch (NullPointerException e5) {
            throw new IOException("openFileOutput NullPointerException", e5);
        }
    }

    public boolean a(DataOutputStream dataOutputStream) {
        if (GameEngine.aU) {
            return false;
        }
        try {
            dataOutputStream.writeInt(1);
            dataOutputStream.writeInt(0);
            dataOutputStream.writeInt(this.f.size());
            for (bf bfVar : this.f.values()) {
                dataOutputStream.writeInt(0);
                dataOutputStream.writeInt(bfVar.a);
                dataOutputStream.writeUTF(bfVar.b);
                dataOutputStream.writeInt(bfVar.c);
                dataOutputStream.writeBoolean(bfVar.d);
                dataOutputStream.writeBoolean(bfVar.e);
                dataOutputStream.writeBoolean(bfVar.f);
                dataOutputStream.writeLong(bfVar.g);
                dataOutputStream.writeInt(bfVar.h);
            }
            dataOutputStream.flush();
            return true;
        } catch (IOException e2) {
            Log.b("RustedWarfare", "file save error:", e2);
            return false;
        }
    }

    public void b(Context context) {
        if (this.a) {
            return;
        }
        boolean z = false;
        Log.d("RustedWarfare", "Trying to load from internal memory");
        try {
            FileInputStream a = context.a(this.b);
            z = a(new DataInputStream(a));
            if (z) {
                Log.d("RustedWarfare", "loaded from internal memory");
            }
            a.close();
        } catch (IOException e2) {
            Log.b("RustedWarfare", "file read error:", e2);
        }
        if (this.d && !z) {
            Log.d("RustedWarfare", "Trying to load from SD");
            try {
                FileInputStream fileInputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/" + this.c));
                DataInputStream dataInputStream = new DataInputStream(fileInputStream);
                if (a(dataInputStream)) {
                    Log.d("RustedWarfare", "loaded from SD");
                }
                dataInputStream.close();
                fileInputStream.close();
            } catch (IOException e3) {
                Log.b("RustedWarfare", "file read error:", e3);
            }
        }
    }

    public boolean a(DataInputStream dataInputStream) {
        try {
            int readInt = dataInputStream.readInt();
            if (readInt > 1) {
                Log.d("RustedWarfare", "Warning file is at version:" + readInt);
                return false;
            }
            dataInputStream.readInt();
            int readInt2 = dataInputStream.readInt();
            this.f.clear();
            for (int i = 0; i < readInt2; i++) {
                bf bfVar = new bf(this);
                dataInputStream.readInt();
                bfVar.a = dataInputStream.readInt();
                String readUTF = dataInputStream.readUTF();
                if (readUTF.equals("maps/challenge/l030;Level 5.tmx")) {
                    Log.d("RustedWarfare", "converting:" + readUTF);
                    readUTF = "maps/challenge/l090;Level 7.tmx";
                }
                bfVar.b = readUTF;
                bfVar.c = dataInputStream.readInt();
                bfVar.d = dataInputStream.readBoolean();
                bfVar.e = dataInputStream.readBoolean();
                bfVar.f = dataInputStream.readBoolean();
                bfVar.g = dataInputStream.readLong();
                bfVar.h = dataInputStream.readInt();
                this.f.put(a(bfVar.b), bfVar);
            }
            return true;
        } catch (IOException e2) {
            Log.b("RustedWarfare", "file read error:", e2);
            return false;
        }
    }

    public static be c(Context context) {
        if (e == null) {
            e = new be(context);
            if (!GameEngine.aU) {
                e.b(context);
            }
        }
        return e;
    }

    private be(Context context) {
    }

    public String a(String str) {
        Integer l = GameEngine.l(str);
        if (l != null) {
            return GameEngine.j(str) + "/l" + l;
        }
        return str;
    }

    public bf b(String str) {
        String a = a(str);
        bf bfVar = (bf) this.f.get(a);
        Log.d("RustedWarfare", "StateEngine: get(" + str + ")=" + bfVar + "  (key=" + a + ")");
        if (bfVar == null) {
            bfVar = new bf(this);
            bfVar.a = 1;
            bfVar.b = str;
            this.f.put(a, bfVar);
        }
        return bfVar;
    }
}