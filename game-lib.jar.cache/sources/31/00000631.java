package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/y.class */
public class GameSaver {
    public static boolean a = false;
    final boolean b;
    int c;
    int d;

    public GameSaver() {
        if (!GameEngine.as) {
        }
        this.b = false;
        this.c = -9999;
        this.d = -9999;
    }

    public File a(String str, boolean z) {
        return a(str, "saves/", z);
    }

    public static File a(String str, String str2, boolean z) {
        return com.corrodinggames.rts.gameFramework.file.a.a(str, str2, z);
    }

    public void b(String str, boolean z) {
        File a2;
        File a3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str2 = str;
        if (str2 != null && !str2.endsWith(".rwsave")) {
            str2 = str2 + ".rwsave";
        }
        File file = null;
        boolean z2 = false;
        try {
            a2 = a(str2 + ".tmp", true);
            if (a2.exists()) {
                a2 = a(str2 + ".tmp2", true);
            }
            a3 = a(str2, true);
            GameEngine.m2e("Saving game to: " + a3.getAbsolutePath());
            OutputStream a4 = com.corrodinggames.rts.gameFramework.file.a.a(a2, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(a4);
            if (!a) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                a(new GameOutputStream(dataOutputStream));
                dataOutputStream.close();
                bufferedOutputStream.close();
                a4.close();
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                a(new com.corrodinggames.rts.gameFramework.net.aw(printStream));
                printStream.close();
                bufferedOutputStream.close();
                a4.close();
                GameEngine.n("DEBUG plain text save created");
            }
            if (z && GameEngine.at() && com.corrodinggames.rts.gameFramework.file.a.i(a3.getAbsolutePath())) {
                GameEngine.m2e("Autosave file already exists: " + a3.getAbsolutePath());
                if (!com.corrodinggames.rts.gameFramework.file.a.b(a3)) {
                    GameEngine.m2e("Old autosave failed to delete");
                }
            }
            GameEngine.m2e("Finished writing save, renaming to final filename");
        } catch (Exception e) {
            if (z) {
                GameEngine.m2e("Auto save failed: " + e.getMessage());
                return;
            }
            e.printStackTrace();
            gameEngine.a("Error saving game, please check permissions, disk space, etc. (" + f.b(e) + ")", 1);
            if (0 != 0 && com.corrodinggames.rts.gameFramework.file.a.i(file.getAbsolutePath())) {
                GameEngine.m2e("saveGame: Removing temp save file after crash");
                com.corrodinggames.rts.gameFramework.file.a.b((File) null);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            gameEngine.a("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && com.corrodinggames.rts.gameFramework.file.a.i(file.getAbsolutePath())) {
                GameEngine.m2e("saveGame: Removing temp save file after crash");
                com.corrodinggames.rts.gameFramework.file.a.b((File) null);
            }
        }
        if (!com.corrodinggames.rts.gameFramework.file.a.b(a2, a3)) {
            GameEngine.m2e("Failed to rename to final file");
            throw new IOException("Failed to rename to final file. Check file permissions of storage.");
        }
        com.corrodinggames.rts.gameFramework.file.a.c(a3);
        z2 = true;
        if (z2) {
            if (z) {
                gameEngine.bS.i.a("Auto Saved", 1000);
            } else {
                gameEngine.bS.h.a((String) null, "Game saved");
            }
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            gameOutputStream.writeString("rustedWarfareSave");
            gameOutputStream.writeInt(gameEngine.c(true));
            gameOutputStream.writeInt(96);
            gameOutputStream.writeBoolean(gameEngine.ar);
            gameOutputStream.startBlock("saveCompression", true);
            gameOutputStream.e("customUnitsBlock");
            com.corrodinggames.rts.game.units.custom.l.a(gameOutputStream);
            gameOutputStream.endBlock("customUnitsBlock");
            gameOutputStream.e("gameSetup");
            boolean z = gameEngine.netEngine.B || gameEngine.netEngine.F;
            gameOutputStream.writeBoolean(gameEngine.netEngine.B);
            gameOutputStream.writeBoolean(gameEngine.netEngine.F);
            gameOutputStream.writeBoolean(z);
            if (z) {
                gameEngine.netEngine.a(gameOutputStream);
            }
            gameOutputStream.endBlock("gameSetup");
            gameOutputStream.writeString(gameEngine.dl);
            boolean z2 = gameEngine.dm != null;
            gameOutputStream.writeBoolean(z2);
            if (z2) {
                GameEngine.m2e("Writing remote map steam into save");
                gameOutputStream.a(gameEngine.dm);
            }
            gameOutputStream.writeInt(gameEngine.by);
            gameOutputStream.writeFloat(gameEngine.cy + gameEngine.cI);
            gameOutputStream.writeFloat(gameEngine.cz + gameEngine.cJ);
            gameOutputStream.writeFloat(gameEngine.cV);
            gameOutputStream.writeInt(gameEngine.bV.a);
            gameOutputStream.writeInt(0);
            gameOutputStream.e();
            gameEngine.bL.a(gameOutputStream);
            gameOutputStream.writeBoolean(gameEngine.bv);
            gameOutputStream.writeBoolean(gameEngine.bL.E);
            gameOutputStream.writeBoolean(gameEngine.bL.F);
            gameOutputStream.writeBoolean(gameEngine.bL.G);
            gameOutputStream.writeBoolean(gameEngine.ce != null);
            if (gameEngine.ce != null) {
                gameEngine.ce.a(gameOutputStream);
            }
            gameOutputStream.e();
            int i = -1;
            if (gameEngine.playerTeam != null) {
                i = gameEngine.playerTeam.site;
            }
            gameOutputStream.writeInt(i);
            gameOutputStream.writeInt(PlayerData.c);
            for (int i2 = 0; i2 < PlayerData.c; i2++) {
                PlayerData playerData = PlayerData.getPlayerData(i2);
                gameOutputStream.writeBoolean(playerData instanceof com.corrodinggames.rts.game.a.a);
                gameOutputStream.writeBoolean(playerData instanceof com.corrodinggames.rts.game.c);
                gameOutputStream.writeBoolean(playerData != null);
                if (playerData != null) {
                    playerData.b(gameOutputStream);
                }
            }
            if (!gameEngine.bS.e) {
            }
            gameOutputStream.d("Section: unit shells");
            gameOutputStream.writeInt(w.er.size());
            Iterator it = w.er.iterator();
            while (it.hasNext()) {
                w wVar = (w) it.next();
                if (wVar == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (wVar instanceof com.corrodinggames.rts.game.units.am) {
                    com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) wVar;
                    if (amVar.mo3r() instanceof com.corrodinggames.rts.game.units.ar) {
                        gameOutputStream.writeByte(1);
                        gameOutputStream.writeEnum((Enum) ((com.corrodinggames.rts.game.units.ar) amVar.mo3r()));
                    } else if (amVar.mo3r() instanceof com.corrodinggames.rts.game.units.custom.l) {
                        gameOutputStream.writeByte(3);
                        gameOutputStream.writeString(((com.corrodinggames.rts.game.units.custom.l) amVar.mo3r()).M);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + amVar.mo3r().getClass().toString());
                    }
                } else {
                    gameOutputStream.writeByte(2);
                    if (wVar instanceof ScorchMark) {
                        gameOutputStream.writeByte(1);
                    } else if (wVar instanceof Projectile) {
                        gameOutputStream.writeByte(2);
                    } else if (wVar instanceof Emitter) {
                        gameOutputStream.writeByte(3);
                    } else {
                        String str = null;
                        if (wVar.getClass() != null) {
                            str = wVar.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                gameOutputStream.writeLong(wVar.eh);
            }
            gameOutputStream.d("Section: CurrentUnitId");
            gameOutputStream.writeLong(gameEngine.netEngine.z());
            gameEngine.bV.a(gameOutputStream);
            gameEngine.bS.a(gameOutputStream);
            gameEngine.stats.a(gameOutputStream);
            for (int i3 = 0; i3 < PlayerData.c; i3++) {
                PlayerData playerData2 = PlayerData.getPlayerData(i3);
                if (playerData2 != null) {
                    playerData2.a(gameOutputStream);
                }
            }
            gameOutputStream.e();
            Iterator it2 = w.er.iterator();
            while (it2.hasNext()) {
                w wVar2 = (w) it2.next();
                if (gameOutputStream.f()) {
                    String simpleName = wVar2.getClass().getSimpleName();
                    if (wVar2 instanceof com.corrodinggames.rts.game.units.am) {
                        simpleName = ((com.corrodinggames.rts.game.units.am) wVar2).mo3r().i();
                    }
                    gameOutputStream.d("Saving unit:" + simpleName + " (id" + wVar2.eh + ")");
                }
                wVar2.a(gameOutputStream);
                gameOutputStream.e();
            }
            gameOutputStream.endBlock("saveCompression");
            gameOutputStream.e();
            gameOutputStream.writeString("<SAVE END>");
            GameEngine.b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
        } catch (IOException e) {
            e.printStackTrace();
            throw e;
        }
    }

    public String a(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx") ? "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx" : str.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : str;
    }

    public boolean c(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            File a2 = a(str, false);
            if (a2.isDirectory()) {
                gameEngine.a("Could not load, is a directory", 1);
                return false;
            }
            com.corrodinggames.rts.gameFramework.utility.j k = com.corrodinggames.rts.gameFramework.file.a.k(a2.getAbsolutePath());
            if (k == null) {
                gameEngine.a("Could not load, failed to open: " + com.corrodinggames.rts.gameFramework.file.a.d(a2.getAbsolutePath()), 1);
                return false;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(k);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean a3 = a(new GameInputStream(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            k.close();
            return a3;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void a(String str, GameOutputStream gameOutputStream) {
        File a2 = a(str, false);
        if (a2 == null) {
            throw new IOException("Failed to get game save: " + str);
        }
        gameOutputStream.a(a2);
    }

    public synchronized boolean a(GameInputStream gameInputStream, boolean z, boolean z2, boolean z3) {
        w wVar;
        w emitter;
        PlayerData playerData;
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            Unit unit = gameEngine.cd;
            if (this.b) {
                unit.a(bs.load_total);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = gameEngine.bS.bZ.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((com.corrodinggames.rts.game.units.am) it.next()).eh));
                }
            }
            try {
                try {
                    String readString = gameInputStream.readString();
                    if (!readString.equals("rustedWarfareSave")) {
                        GameEngine.print("Map Load: Header is not correct:" + readString.substring(0, Math.min(readString.length(), 50)));
                        String str = "Failed to load save. (Could not find correct header)";
                        if (readString.equals("rustedWarfareReplay")) {
                            str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                        }
                        GameEngine.print(str);
                        gameEngine.a(str, 1);
                        return false;
                    }
                    gameInputStream.readInt();
                    int readInt = gameInputStream.readInt();
                    GameEngine.b("gameSaver", "Loading save from version: " + readInt);
                    gameInputStream.a(readInt);
                    if (readInt > 96) {
                        gameEngine.a("Cannot load: This save was made with a newer game", 1);
                        return false;
                    }
                    if (readInt >= 5) {
                        gameInputStream.readBoolean();
                    }
                    if (readInt >= 23) {
                        unit.a(bs.load_compression);
                        gameInputStream.a("saveCompression", true);
                        unit.b(bs.load_compression);
                    }
                    if (readInt >= 54) {
                        gameInputStream.startBlock("customUnitsBlock");
                        if (gameEngine.replayEngine.j() && !z3) {
                            GameEngine.m2e("Loading mods from replay");
                            try {
                                com.corrodinggames.rts.game.units.custom.l.a(gameInputStream);
                                com.corrodinggames.rts.game.units.custom.ag.d();
                            } catch (com.corrodinggames.rts.game.units.custom.bd e) {
                                GameEngine.m2e("Replay load: Missing unit:" + e.getMessage() + " d:" + e.b);
                                gameEngine.i(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                                com.corrodinggames.rts.game.units.custom.ag.b(true);
                            }
                        }
                        gameInputStream.endBlock("customUnitsBlock");
                    }
                    Integer num = null;
                    Integer num2 = null;
                    if (gameEngine.replayEngine.j() && z3) {
                        num = Integer.valueOf(gameEngine.bB);
                        num2 = Integer.valueOf(gameEngine.bC);
                    }
                    if (readInt >= 56) {
                        gameInputStream.startBlock("gameSetup");
                        boolean readBoolean = gameInputStream.readBoolean();
                        boolean z4 = readBoolean;
                        boolean z5 = false;
                        if (readInt >= 94) {
                            z5 = gameInputStream.readBoolean();
                            z4 = gameInputStream.readBoolean();
                        }
                        if ((gameEngine.replayEngine.j() || !gameEngine.netEngine.B) && !z3 && z4) {
                            GameEngine.m2e("Using game rules from save");
                            gameEngine.replayEngine.O = true;
                            gameEngine.netEngine.a(gameInputStream);
                            num = Integer.valueOf(gameEngine.bB);
                            num2 = Integer.valueOf(gameEngine.bC);
                            if ((readBoolean || z5) && !gameEngine.netEngine.F && !gameEngine.netEngine.B && !gameEngine.replayEngine.j()) {
                                GameEngine.m2e("Enabling use of singlePlayer rules from saved game.");
                                gameEngine.netEngine.F = true;
                            }
                        }
                        gameInputStream.endBlock("gameSetup");
                    }
                    gameEngine.dm = null;
                    gameEngine.dl = a(com.corrodinggames.rts.gameFramework.file.a.o(gameInputStream.readString()));
                    boolean z6 = false;
                    if (readInt >= 72) {
                        z6 = gameInputStream.readBoolean();
                        if (z6) {
                            GameEngine.m2e("Reading remote map stream");
                            gameEngine.dm = gameInputStream.u();
                        }
                    }
                    if (gameEngine.netEngine.B && !gameEngine.netEngine.isServer && z3 && gameEngine.netEngine.aB != null && !z6) {
                        gameEngine.dl = VariableScope.nullOrMissingString;
                        gameEngine.dm = gameEngine.netEngine.aB;
                    }
                    unit.a(bs.load_map);
                    if (z3) {
                        gameEngine.a(true, true, s.normalSave);
                        if (GameEngine.at()) {
                            gameEngine.dv = true;
                        }
                    } else {
                        gameEngine.a(true, s.normalSave);
                    }
                    if (!gameEngine.bL.W) {
                        GameEngine.m2e("Not loading save because map failed to load");
                        return false;
                    }
                    if (num != null) {
                        gameEngine.bB = num.intValue();
                    }
                    if (num2 != null) {
                        Integer.valueOf(gameEngine.bC);
                    }
                    synchronized (gameEngine) {
                        unit.b(bs.load_map);
                        gameEngine.by = gameInputStream.readInt();
                        float readFloat = gameInputStream.readFloat();
                        float readFloat2 = gameInputStream.readFloat();
                        float readFloat3 = gameInputStream.readFloat();
                        if (!z3) {
                            gameEngine.b(readFloat, readFloat2);
                            gameEngine.cV = readFloat3;
                        }
                        if (readInt >= 18) {
                            gameEngine.bV.a = gameInputStream.readInt();
                        }
                        gameInputStream.readInt();
                        if (readInt >= 19) {
                            gameInputStream.checkMark("end of setup");
                        }
                        gameEngine.bL.a(gameInputStream);
                        if (readInt >= 86) {
                            boolean readBoolean2 = gameInputStream.readBoolean();
                            boolean readBoolean3 = gameInputStream.readBoolean();
                            boolean readBoolean4 = gameInputStream.readBoolean();
                            boolean readBoolean5 = gameInputStream.readBoolean();
                            if (!z && !readBoolean2) {
                                gameEngine.bL.E = readBoolean3;
                                gameEngine.bL.F = readBoolean4;
                                gameEngine.bL.G = readBoolean5;
                            }
                        }
                        if (gameInputStream.readBoolean()) {
                            if (gameEngine.ce == null) {
                                GameEngine.b("gameSaver", "making new mission engine on load, this shouldn't happen");
                                gameEngine.ce = new com.corrodinggames.rts.gameFramework.status.f();
                                gameEngine.ce.a(false);
                            }
                            gameEngine.ce.a(gameInputStream);
                        }
                        if (readInt >= 19) {
                            gameInputStream.checkMark("start of teams");
                        }
                        GameEngine.b("gameSaver", "loading teams");
                        PlayerData[] playerDataArr = new PlayerData[PlayerData.e];
                        int i = -1;
                        if (readInt >= 36) {
                            i = gameInputStream.readInt();
                        }
                        int i2 = 8;
                        if (readInt >= 49) {
                            i2 = gameInputStream.readInt();
                            PlayerData.b(i2, false);
                            for (int i3 = 0; i3 < PlayerData.c; i3++) {
                                if (i3 >= i2 && !z && (playerData = PlayerData.getPlayerData(i3)) != null) {
                                    playerData.I();
                                }
                            }
                        }
                        for (int i4 = 0; i4 < i2; i4++) {
                            com.corrodinggames.rts.game.a.a playerData2 = PlayerData.getPlayerData(i4);
                            boolean readBoolean6 = gameInputStream.readBoolean();
                            boolean z7 = false;
                            if (readInt >= 7) {
                                z7 = gameInputStream.readBoolean();
                            }
                            if (gameInputStream.readBoolean()) {
                                if (readBoolean6) {
                                    if (playerData2 == null || !(playerData2 instanceof com.corrodinggames.rts.game.a.a)) {
                                        if (z && !z3 && playerData2 != null) {
                                            GameEngine.print("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                            playerData2 = new com.corrodinggames.rts.game.a.a(i4, false);
                                            playerDataArr[i4] = playerData2;
                                        } else {
                                            if (z3) {
                                                GameEngine.print("Adding new AI " + i4 + " on resync");
                                            }
                                            playerData2 = new com.corrodinggames.rts.game.a.a(i4);
                                        }
                                    }
                                } else if (z7) {
                                    if (playerData2 == null || !(playerData2 instanceof com.corrodinggames.rts.game.c)) {
                                        if (z) {
                                            GameEngine.print("Replacing team:" + i4 + " with NetworkedPlayer");
                                        }
                                        playerData2 = new com.corrodinggames.rts.game.c(i4);
                                    }
                                } else if (playerData2 == null || !(playerData2 instanceof Player)) {
                                    if (z) {
                                        GameEngine.print("Replacing team:" + i4 + " with Player");
                                        if (playerData2 != null) {
                                            playerData2.c("Existing");
                                        }
                                    }
                                    playerData2 = new Player(i4);
                                }
                                Integer num3 = playerData2.aiDifficulty;
                                if (readInt >= 2) {
                                    playerData2.b(gameInputStream);
                                } else {
                                    playerData2.c(gameInputStream);
                                }
                                if (!z3) {
                                    playerData2.i();
                                    if (z) {
                                        playerData2.aiDifficulty = num3;
                                        playerData2.c("networkLoad aiDifficultyOverride=" + num3);
                                        gameEngine.netEngine.a(playerData2);
                                        gameEngine.netEngine.b(playerData2);
                                    }
                                    if (playerData2 != null && playerData2 != playerData2) {
                                        playerData2.c("Transfering team stats");
                                        playerData2.credits = playerData2.credits;
                                        playerData2.V().a(playerData2.V());
                                    }
                                }
                            } else if (z && !gameEngine.replayEngine.j()) {
                                GameEngine.print("GameSaver: Would normally remove team:" + i4 + VariableScope.nullOrMissingString);
                                playerDataArr[i4] = PlayerData.g;
                            } else {
                                PlayerData playerData3 = PlayerData.getPlayerData(i4);
                                if (playerData3 != null) {
                                    playerData3.I();
                                }
                            }
                        }
                        boolean z8 = false;
                        gameEngine.netEngine.aq();
                        if (gameEngine.replayEngine.j()) {
                            gameEngine.playerTeam = PlayerData.i;
                        } else if (gameEngine.netEngine.B) {
                            if (gameEngine.netEngine.z != null) {
                                int i5 = gameEngine.netEngine.z.site;
                                if (i5 != -3) {
                                    PlayerData playerData4 = PlayerData.getPlayerData(i5);
                                    if (playerData4 == null) {
                                        throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                                    }
                                    gameEngine.playerTeam = playerData4;
                                }
                            }
                        } else if (i != -1 && i != -3) {
                            gameEngine.playerTeam = PlayerData.getPlayerData(i);
                        } else {
                            for (int i6 = 0; i6 < PlayerData.c; i6++) {
                                if (PlayerData.getPlayerData(i6) instanceof Player) {
                                    gameEngine.playerTeam = PlayerData.getPlayerData(i6);
                                }
                            }
                        }
                        Iterator it2 = w.dK().iterator();
                        while (it2.hasNext()) {
                            ((w) it2.next()).a();
                        }
                        if (gameEngine.aa()) {
                            Iterator it3 = w.dK().iterator();
                            while (it3.hasNext()) {
                                w wVar2 = (w) it3.next();
                                if (wVar2.eh == 0) {
                                    if (wVar2 instanceof com.corrodinggames.rts.game.units.am) {
                                        GameEngine.m2e("object: " + ((com.corrodinggames.rts.game.units.am) wVar2).c());
                                    }
                                    throw new RuntimeException("GameLoad preload: Found object in list with id:0");
                                }
                            }
                        }
                        boolean z9 = false;
                        int readInt2 = gameInputStream.readInt();
                        for (int i7 = 0; i7 < readInt2; i7++) {
                            byte readByte = gameInputStream.readByte();
                            if (readByte == 1) {
                                com.corrodinggames.rts.game.units.ar arVar = (com.corrodinggames.rts.game.units.ar) gameInputStream.b(com.corrodinggames.rts.game.units.ar.class);
                                if (arVar == com.corrodinggames.rts.game.units.ar.editorOrBuilder) {
                                    if (gameEngine.replayEngine.j() || gameEngine.bv) {
                                        GameEngine.m2e("Creating DebugEditorBuilder for replay");
                                        emitter = new com.corrodinggames.rts.game.units.h(false);
                                        com.corrodinggames.rts.game.units.h i8 = gameEngine.bS.i();
                                        if (i8 == null || i8.ej) {
                                            GameEngine.m2e("Relinking editor");
                                            gameEngine.bS.a((com.corrodinggames.rts.game.units.h) emitter);
                                        }
                                    } else {
                                        GameEngine.m2e("Creating DebugEditorBuilder for load");
                                        emitter = new com.corrodinggames.rts.game.units.h(false);
                                        z8 = true;
                                    }
                                } else {
                                    emitter = arVar.a();
                                }
                            } else if (readByte == 3) {
                                String readString2 = gameInputStream.readString();
                                com.corrodinggames.rts.game.units.custom.l n = com.corrodinggames.rts.game.units.custom.l.n(readString2);
                                if (n == null) {
                                    String str2 = "Could not find custom unit:" + readString2;
                                    GameEngine.m2e(str2);
                                    if (!z9) {
                                        z9 = true;
                                        GameNetEngine.g(str2);
                                    }
                                    n = com.corrodinggames.rts.game.units.custom.l.b;
                                    if (n == null) {
                                        throw new RuntimeException("Could not find custom unit:" + readString2 + " and missingPlaceHolder is null");
                                    }
                                }
                                com.corrodinggames.rts.game.units.as c = com.corrodinggames.rts.game.units.custom.l.c(n);
                                if (c != null) {
                                    if (c instanceof com.corrodinggames.rts.game.units.custom.l) {
                                        n = (com.corrodinggames.rts.game.units.custom.l) c;
                                    } else {
                                        GameEngine.print("replacement not a custom unit:" + c.i());
                                    }
                                }
                                emitter = n.a();
                            } else if (readByte == 2) {
                                byte readByte2 = gameInputStream.readByte();
                                if (readByte2 == 1) {
                                    emitter = new ScorchMark();
                                } else if (readByte2 == 2) {
                                    emitter = new Projectile(false);
                                } else if (readByte2 == 3) {
                                    emitter = new Emitter(gameEngine.bR);
                                } else {
                                    throw new IOException("Unhandled gameType on load:" + ((int) readByte2));
                                }
                            } else {
                                throw new IOException("Unhandled basic type on load:" + ((int) readByte));
                            }
                            emitter.eh = gameInputStream.readLong();
                            if (emitter.eh == 0) {
                                GameEngine.print("GameSaver: Adding object with id==0");
                                if (emitter instanceof com.corrodinggames.rts.game.units.am) {
                                    GameEngine.print(((com.corrodinggames.rts.game.units.am) emitter).cC());
                                }
                            }
                            w.dL();
                        }
                        if (readInt >= 3) {
                            long readLong = gameInputStream.readLong();
                            if (readLong <= 0) {
                                GameEngine.a("GameLoad: Trying to set next unit id <= 0: " + readLong);
                                readLong = 100000;
                            }
                            gameEngine.netEngine.a(readLong);
                        } else {
                            gameEngine.netEngine.a(100000L);
                        }
                        if (readInt >= 24) {
                            gameEngine.bV.a(gameInputStream);
                        }
                        if (readInt >= 4) {
                            gameEngine.bS.a(gameInputStream, z3);
                        }
                        if (readInt >= 57) {
                            gameEngine.stats.a(gameInputStream, z3);
                        }
                        if (readInt >= 7) {
                            for (int i9 = 0; i9 < i2; i9++) {
                                PlayerData playerData5 = PlayerData.getPlayerData(i9);
                                if (playerDataArr[i9] != null) {
                                    playerData5 = playerDataArr[i9];
                                    if (playerData5 == PlayerData.g) {
                                        playerData5 = null;
                                    }
                                }
                                if (playerData5 != null) {
                                    Integer num4 = playerData5.aiDifficulty;
                                    playerData5.c(gameInputStream);
                                    if (!z3) {
                                        if (z) {
                                            playerData5.aiDifficulty = num4;
                                            playerData5.c("networkLoad2 aiDifficultyOverride=" + num4);
                                        }
                                        gameEngine.netEngine.a(playerData5);
                                        gameEngine.netEngine.b(playerData5);
                                    }
                                }
                            }
                        } else if (readInt >= 2) {
                        }
                        if (readInt >= 10) {
                            gameInputStream.checkMark("Pre-unit data");
                        }
                        unit.a(bs.load_units);
                        com.corrodinggames.rts.gameFramework.utility.o dK = w.dK();
                        GameEngine.b("gameSaver", "Loading unit data for " + dK.size() + " objects.");
                        Iterator it4 = dK.iterator();
                        while (it4.hasNext()) {
                            ((w) it4.next()).a(gameInputStream);
                            if (readInt >= 10) {
                                gameInputStream.checkMark("post unit: " + wVar.getClass().toString() + " with id:" + wVar.eh);
                            }
                        }
                        GameEngine.b("gameSaver", "Loading unit data done.");
                        unit.b(bs.load_units);
                        if (z8) {
                            Iterator it5 = w.dK().iterator();
                            while (it5.hasNext()) {
                                w wVar3 = (w) it5.next();
                                if (wVar3 instanceof com.corrodinggames.rts.game.units.am) {
                                    com.corrodinggames.rts.game.units.am amVar = (com.corrodinggames.rts.game.units.am) wVar3;
                                    if (!gameEngine.replayEngine.j() && !gameEngine.bv && amVar.mo3r() == com.corrodinggames.rts.game.units.ar.editorOrBuilder) {
                                        amVar.ci();
                                    }
                                }
                            }
                        }
                        if (readInt >= 23) {
                            gameInputStream.endBlock("saveCompression");
                        }
                        if (readInt >= 19) {
                            gameInputStream.checkMark("End of Save");
                            gameInputStream.readString();
                        }
                        GameEngine.b("gameSaver", "Checking for ID overlaps");
                        int i10 = 0;
                        if (1 != 0) {
                            w[] a2 = w.er.a();
                            int size = w.er.size();
                            for (int i11 = 0; i11 < size; i11++) {
                                w wVar4 = a2[i11];
                                if (wVar4.eh == 0) {
                                    GameEngine.print("GameSaver: Fixing object with zero id.");
                                    wVar4.eh = gameEngine.netEngine.y();
                                }
                                for (int i12 = i11 + 1; i12 < size; i12++) {
                                    w wVar5 = a2[i12];
                                    if (wVar4 != wVar5 && wVar4.eh == wVar5.eh) {
                                        i10++;
                                        wVar5.eh = gameEngine.netEngine.y();
                                    }
                                }
                            }
                        }
                        GameEngine.b("gameSaver", "clearing out dead units.");
                        GameEngine.m2e("Unit.fastLiveUnitList before:" + com.corrodinggames.rts.game.units.am.bE.size());
                        Iterator it6 = com.corrodinggames.rts.game.units.am.bE.iterator();
                        while (it6.hasNext()) {
                            if (((com.corrodinggames.rts.game.units.am) it6.next()).bV) {
                                it6.remove();
                            }
                        }
                        GameEngine.m2e("Unit.fastLiveUnitList after:" + com.corrodinggames.rts.game.units.am.bE.size());
                        if (i10 > 0) {
                            if (readInt <= 2) {
                                gameEngine.a("Warning: " + i10 + " errors were found in this save, this is due to a bug in the old version", 1);
                            } else {
                                gameEngine.a("Warning: " + i10 + " errors were found in this save", 1);
                            }
                        }
                        GameEngine.b("gameSaver", "Fixing map cost.");
                        gameEngine.bU.a((com.corrodinggames.rts.game.units.y) null);
                        gameEngine.bU.b();
                        GameEngine.b("gameSaver", "Fixing map cost done.");
                        PlayerData.O();
                        for (int i13 = 0; i13 < PlayerData.c; i13++) {
                            PlayerData playerData6 = PlayerData.getPlayerData(i13);
                            if (playerData6 != null) {
                                playerData6.d(false);
                            }
                        }
                        PlayerData.e();
                        GameEngine.b("gameSaver", "Rebuilt unit caches");
                        PlayerData.O();
                        PlayerData.Y();
                        PlayerData.i.d(false);
                        PlayerData.h.d(false);
                        for (int i14 = 0; i14 < PlayerData.c; i14++) {
                            PlayerData playerData7 = PlayerData.getPlayerData(i14);
                            if (playerData7 != null && (playerData7 instanceof com.corrodinggames.rts.game.a.a)) {
                                ((com.corrodinggames.rts.game.a.a) playerData7).aq();
                            }
                        }
                        if (arrayList != null) {
                            gameEngine.bS.y();
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                com.corrodinggames.rts.game.units.am a3 = w.a(((Long) it7.next()).longValue(), true);
                                if (a3 != null) {
                                    gameEngine.bS.k(a3);
                                }
                            }
                        }
                        if (gameEngine.aa()) {
                            Iterator it8 = w.dK().iterator();
                            while (it8.hasNext()) {
                                w wVar6 = (w) it8.next();
                                if (wVar6.eh == 0) {
                                    if (wVar6 instanceof com.corrodinggames.rts.game.units.am) {
                                        GameEngine.m2e("object: " + ((com.corrodinggames.rts.game.units.am) wVar6).c());
                                    }
                                    throw new RuntimeException("GameLoad postload: Found object in list with id:0");
                                }
                            }
                        }
                        GameEngine.m2e("--- Save file load complete ---");
                        GameEngine.m2e("GameObject.fastGameObjectList:" + w.er.size());
                        GameEngine.m2e("Unit.fastLiveUnitList:" + com.corrodinggames.rts.game.units.am.bE.size());
                        if (!z3) {
                            gameEngine.replayEngine.a(z3);
                        }
                        if (this.b) {
                            unit.b(bs.load_total);
                            unit.a(true, true);
                        }
                    }
                    return true;
                } catch (EOFException e2) {
                    e2.printStackTrace();
                    GameEngine.print("Failed to load save. (End of file trying to read header)");
                    gameEngine.a("Failed to load save. (End of file trying to read header)", 1);
                    return false;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                String str3 = "Failed to load save. (Failed to read header: " + e3.getMessage() + ")";
                GameEngine.print(str3);
                gameEngine.a(str3, 1);
                return false;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            GameEngine.m2e("Save load error, clearing all units");
            Iterator it9 = w.dK().iterator();
            while (it9.hasNext()) {
                w wVar7 = (w) it9.next();
                if (wVar7.eh == 0) {
                    wVar7.eh = gameEngine.netEngine.y();
                }
                wVar7.a();
            }
            throw new RuntimeException(e4);
        }
    }

    public boolean b(String str) {
        GameEngine.m2e("Deleting: " + str);
        String o = com.corrodinggames.rts.gameFramework.file.a.o(str);
        if (o.contains("\\") || o.contains("/")) {
            GameEngine.m2e("Cannot get save with path: " + str);
            return false;
        }
        File a2 = a(str, true);
        boolean b = com.corrodinggames.rts.gameFramework.file.a.b(a2);
        com.corrodinggames.rts.gameFramework.file.a.b(a(str + ".map", true));
        if (!b) {
            GameEngine.m2e("Failed to delete: " + a2.getAbsolutePath());
            GameEngine.getGameEngine().i("Failed to delete: " + a2.getAbsolutePath());
            return true;
        }
        return true;
    }

    public void a(boolean z) {
        GameEngine.getGameEngine();
        if (!z) {
            this.c = -9999;
            this.d = -9999;
        }
    }

    public boolean a() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.settingsEngine.autosaving || GameEngine.ax() || !gameEngine.bG || gameEngine.bH || gameEngine.replayEngine.j() || gameEngine.M()) {
            return false;
        }
        return true;
    }

    public void b() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!a()) {
            return;
        }
        if (this.d == -9999) {
            this.c = gameEngine.by;
            this.d = gameEngine.by;
        }
        if (this.d + 300000 < gameEngine.by) {
            this.d = gameEngine.by;
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            c();
            GameEngine.m2e("Autosaved (" + Unit.a(Unit.a(loadAllUnitsTook)) + ")");
        }
    }

    public void c() {
        b("autosave", true);
    }
}