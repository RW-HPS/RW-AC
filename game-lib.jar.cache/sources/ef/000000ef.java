package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.appFramework.i;
import com.corrodinggames.rts.appFramework.j;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.net.GameMapData;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.net.Server_type;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import com.corrodinggames.rts.gameFramework.utility.al;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer.class */
public class Multiplayer extends ScriptContext {
    Root root;
    String[] currentDropdownRawArray;
    Root.TableData lastPlayerTable;
    boolean useMapDropdown = false;

    Multiplayer(Root root) {
        this.root = root;
    }

    void updateMapDropdown(Element element, String str, String str2) {
        String[] strArr;
        String[] strArr2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        int intValue = element.getElementById(str2).getValueAsInt(0).intValue();
        this.currentDropdownRawArray = null;
        ArrayList arrayList = new ArrayList();
        if (intValue == 0) {
            this.currentDropdownRawArray = a.a("maps/skirmish", true);
            Arrays.sort(this.currentDropdownRawArray);
            for (String str3 : this.currentDropdownRawArray) {
                arrayList.add(i.e(str3));
            }
        } else if (intValue == 1) {
            this.currentDropdownRawArray = a.a("/SD/rusted_warfare_maps", true);
            if (this.currentDropdownRawArray == null) {
                gameEngine.a("Could not find folder: /SD/rusted_warfare_maps", 1);
                this.currentDropdownRawArray = new String[0];
            }
            Arrays.sort(this.currentDropdownRawArray);
            for (String str4 : this.currentDropdownRawArray) {
                arrayList.add(i.e(str4));
            }
        } else if (intValue == 2) {
            this.currentDropdownRawArray = j.l();
            if (this.currentDropdownRawArray == null) {
                gameEngine.a("Could not find a save folder on SD card", 1);
                this.currentDropdownRawArray = new String[0];
            }
            for (String str5 : this.currentDropdownRawArray) {
                arrayList.add(i.e(str5));
            }
        } else {
            throw new RuntimeException("Unknown typeIndex:" + intValue);
        }
        String str6 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 1;
        for (String str7 : this.currentDropdownRawArray) {
            i++;
            if (intValue == 0 && str7.equalsIgnoreCase("[p8]Many Islands (8p).tmx")) {
                i2 = i;
            }
        }
        int i3 = 0;
        for (String str8 : this.currentDropdownRawArray) {
            i3++;
            str6 = str6 + generateOption(str8, this.root.convertMapName(str8), i3 == i2) + "\n";
        }
        GameEngine.m5e("mapList:" + str6);
        if (intValue != 2) {
        }
        element.getElementById("mapsSelectorParent").setInnerRML("<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>");
        getMapDropdown().setInnerRML(str6);
    }

    String generateOption(String str, String str2, boolean z) {
        return generateOption(str, str2, z, null, false);
    }

    String generateOption(String str, String str2, boolean z, Integer num, boolean z2) {
        String str3 = VariableScope.nullOrMissingString;
        if (z) {
            str3 = str3 + " selected='selected'";
        }
        String htmlString = this.root.htmlString(str2);
        String str4 = VariableScope.nullOrMissingString;
        if (num != null) {
            str4 = str4 + " style='color:" + f.h(num.intValue()) + ";'";
        }
        if (z2) {
            str4 = str4 + " class='disabled-option'";
        }
        if (str4 != null && !VariableScope.nullOrMissingString.equals(str4)) {
            htmlString = "<span " + str4 + ">" + htmlString + "</span>";
        }
        return "<option value=" + this.root.escapedString(str) + " " + str3 + ">" + htmlString + "</option>";
    }

    Element getMapDropdown() {
        return this.libRocket.c().findByClassName("mapsSelector");
    }

    String getMapDropdownSelected() {
        return getMapDropdown().getAttribute("value");
    }

    void readInterfaceIntoNetworkSettings() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.isServer) {
            String mapDropdownSelected = getMapDropdownSelected();
            if (mapDropdownSelected == null) {
                mapDropdownSelected = "<No Map>";
            }
            gameEngine.netEngine.gameMapData.mapName = mapDropdownSelected;
            gameEngine.netEngine.gameMapData.mapType = MapType.values()[0];
        }
    }

    public void multiplayerStart() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.isServer) {
            if (gameEngine.netEngine.gameMapData.mapType == MapType.skirmishMap) {
                gameEngine.netEngine.az = "maps/skirmish/" + gameEngine.netEngine.gameMapData.mapName;
            } else if (gameEngine.netEngine.gameMapData.mapType == MapType.customMap) {
                gameEngine.netEngine.az = "/SD/rusted_warfare_maps/" + gameEngine.netEngine.gameMapData.mapName;
            } else if (gameEngine.netEngine.gameMapData.mapType == MapType.savedGame) {
                gameEngine.netEngine.az = null;
            } else {
                this.libRocket.c("Error: No map type selected");
                return;
            }
            if (gameEngine.netEngine.gameMapData.mapName == null || VariableScope.nullOrMissingString.equals(gameEngine.netEngine.gameMapData.mapName) || gameEngine.netEngine.gameMapData.mapName.equals("<No Map>")) {
                this.libRocket.c("Error: No map selected");
            } else {
                gameEngine.netEngine.ae();
            }
        } else if (gameEngine.netEngine.H) {
            gameEngine.netEngine.k("-start");
        } else {
            GameEngine.b("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
        }
    }

    public void battleroomSetup() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.lastPlayerTable = null;
        refreshUI();
        this.root.refreshChat();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && gameEngine.netEngine.F) {
            activeDocument.addClass("singlePlayer");
        }
        gameEngine.netEngine.as();
    }

    public void refreshUI() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Element activeElementById = this.libRocket.getActiveElementById("infoDiv");
        if (activeElementById == null) {
            GameEngine.m5e("refreshUI: infoTextElement==null");
            return;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = gameEngine.netEngine.isServer || gameEngine.netEngine.H;
        boolean z2 = gameEngine.netEngine.isServer;
        boolean z3 = (z || gameEngine.netEngine.gameMapData.m) ? false : true;
        Iterator it = activeDocument.findElementsByClassName("forHostOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Iterator it2 = activeDocument.findElementsByClassName("forLocalHostOnly").iterator();
        while (it2.hasNext()) {
            ((Element) it2.next()).show(z2);
        }
        Iterator it3 = activeDocument.findElementsByClassName("forUnlockedTeamsNonHost").iterator();
        while (it3.hasNext()) {
            ((Element) it3.next()).show(z3);
        }
        if (gameEngine.P()) {
            Iterator it4 = activeDocument.findElementsByClassName("forRealNetworkOnly").iterator();
            while (it4.hasNext()) {
                ((Element) it4.next()).show(false);
            }
        }
        activeElementById.compareAndSetText(gameEngine.netEngine.at());
        String av = gameEngine.netEngine.av();
        if (gameEngine.netEngine.gameMapData.mapType == MapType.savedGame) {
            av = "saves/" + gameEngine.netEngine.gameMapData.mapName;
        }
        Element activeElementById2 = this.libRocket.getActiveElementById("mapImage");
        if (gameEngine.netEngine.v) {
            activeElementById2.hide();
        }
        String attribute = activeElementById2.getAttribute("src");
        if (av == null) {
            if (!VariableScope.nullOrMissingString.equals(attribute)) {
                activeElementById2.setAttribute("src", VariableScope.nullOrMissingString);
            }
        } else {
            String mapThumbnail = this.root.getMapThumbnail(av);
            if (mapThumbnail == null) {
                mapThumbnail = VariableScope.nullOrMissingString;
            }
            if (!mapThumbnail.equals(attribute)) {
                activeElementById2.setAttribute("src", mapThumbnail);
            }
        }
        refreshPlayerTable();
    }

    public void refreshPlayerTable() {
        Root.TableData playerTable = getPlayerTable();
        if (this.lastPlayerTable != null) {
            if (this.lastPlayerTable.same(playerTable, false)) {
                return;
            }
            if (this.lastPlayerTable.same(playerTable, true)) {
                this.root.updateTableTextOnly("playersDiv", playerTable, this.lastPlayerTable);
                return;
            }
        }
        this.root.refreshTable("playersDiv", playerTable);
        this.lastPlayerTable = playerTable;
    }

    public Root.TableData getPlayerTable() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Root.TableData tableData = new Root.TableData();
        ArrayList arrayList = tableData.rows;
        int i = -1;
        int i2 = 0;
        ArrayList a = PlayerData.a(true);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            PlayerData playerData = (PlayerData) it.next();
            if (playerData != null) {
                if (i != -1 && i != playerData.team) {
                    i2++;
                }
                i = playerData.team;
            }
        }
        int i3 = -1;
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            PlayerData playerData2 = (PlayerData) it2.next();
            if (playerData2 != null) {
                if (i3 != -1 && i3 != playerData2.team && i2 <= 3) {
                    Root.TableRow tableRow = new Root.TableRow();
                    for (int i4 = 0; i4 < 4; i4++) {
                        tableRow.addCell(VariableScope.nullOrMissingString).addClass("spacer");
                    }
                    arrayList.add(tableRow);
                }
                i3 = playerData2.team;
                String str = "unnamed";
                if (playerData2.name != null) {
                    str = playerData2.name;
                }
                String status = playerData2.getStatus();
                String num = Integer.toString(playerData2.site + 1);
                boolean b = playerData2.b();
                if (b) {
                    num = "S";
                }
                if (!b && playerData2.startUnit != null && playerData2.startUnit.intValue() != gameEngine.netEngine.gameMapData.initUnit) {
                    num = num + " - " + gameEngine.netEngine.d(playerData2.startUnit.intValue());
                }
                String playerTeamName = playerData2.getPlayerTeamName();
                Root.TableRow tableRow2 = new Root.TableRow();
                Root.TableCell addCell = tableRow2.addCell(str);
                if (playerData2.color != null) {
                    addCell.color = Integer.valueOf(PlayerData.i(playerData2.color.intValue()));
                }
                if (playerData2 == gameEngine.netEngine.z) {
                    addCell.addClass("boldText");
                }
                tableRow2.addCell(num).color = Integer.valueOf(playerData2.M());
                tableRow2.addCell(playerTeamName).color = Integer.valueOf(PlayerData.i(playerData2.team));
                tableRow2.addCell(status);
                tableRow2.setLibrocketOnClick("mp.showPlayerConfig('" + playerData2.site + "')");
                arrayList.add(tableRow2);
            }
        }
        if (!gameEngine.netEngine.isServer && gameEngine.netEngine.S == null) {
            arrayList.clear();
            String str2 = "Connecting...";
            if (gameEngine.netEngine.socketList.size() == 0) {
                str2 = "Disconnected";
            }
            Root.TableRow tableRow3 = new Root.TableRow();
            tableRow3.addCell(str2);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            arrayList.add(tableRow3);
        }
        return tableData;
    }

    public void showSetTeamsDialog() {
        GameEngine.getGameEngine();
        if (this.root.createAndShowPopup("battleroom_setTeams.rml", null, "Set Teams") != null) {
        }
    }

    public void showPlayerConfigForSelf() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.z != null) {
            showPlayerConfig(VariableScope.nullOrMissingString + gameEngine.netEngine.z.site);
        }
    }

    public void showPlayerConfig(final String str) {
        GameEngine.getGameEngine();
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Multiplayer.1
            @Override // java.lang.Runnable
            public void run() {
                Multiplayer.this.showPlayerConfigNow(str);
            }
        });
    }

    public void showPlayerConfigNow(String str) {
        ElementDocument createAndShowPopup;
        GameEngine gameEngine = GameEngine.getGameEngine();
        PlayerData playerData = PlayerData.getPlayerData(Integer.parseInt(str));
        if (playerData == null) {
            this.root.logWarn("showPlayerConfig: " + str + "==null");
        } else if ((gameEngine.netEngine.aw() || (gameEngine.netEngine.z == playerData && !gameEngine.netEngine.gameMapData.m)) && (createAndShowPopup = this.root.createAndShowPopup("battleroom_player.rml", playerData, playerData.name)) != null) {
            Element elementById = createAndShowPopup.getElementById("team_id");
            Element elementById2 = createAndShowPopup.getElementById("spawnPoint");
            Element elementById3 = createAndShowPopup.getElementById("allyTeam");
            Element elementById4 = createAndShowPopup.getElementById("aiDifficulty");
            Element elementById5 = createAndShowPopup.getElementById("startingUnits");
            Element elementById6 = createAndShowPopup.getElementById("playerColor");
            Element elementById7 = createAndShowPopup.getElementById("playerOverridesSection");
            Element elementById8 = createAndShowPopup.getElementById("aiDifficultySelection");
            if (!GameEngine.o("sd")) {
                setupStartingUnitDropDown(elementById5, true);
                setupPlayerColorDropDown(elementById6, true, true, playerData);
            } else {
                GameEngine.m5e("sd");
            }
            elementById.setValue(VariableScope.nullOrMissingString + playerData.site);
            String str2 = VariableScope.nullOrMissingString + (playerData.site + 1);
            if (playerData.b()) {
                str2 = "-2";
            }
            elementById2.setValue(str2);
            if (playerData.u) {
                elementById3.setValue(VariableScope.nullOrMissingString + (playerData.team + 1));
            } else {
                elementById3.setValue("fromSpawn2");
            }
            if (elementById7 == null) {
                throw new RuntimeException("playerOverridesSection==null");
            }
            if (!gameEngine.netEngine.isServer) {
                elementById7.hide();
            }
            if (elementById8 == null) {
                throw new RuntimeException("aiDifficultySelection==null");
            }
            if (!GameEngine.o("s1")) {
                if (playerData.w) {
                    if (playerData.aiDifficulty == null) {
                        elementById4.setValue("-99");
                    } else {
                        elementById4.setValue(VariableScope.nullOrMissingString + playerData.aiDifficulty);
                    }
                } else {
                    elementById8.hide();
                }
            } else {
                GameEngine.m5e("s1");
            }
            if (!GameEngine.o("s2")) {
                if (playerData.startUnit == null) {
                    elementById5.setValue("-99");
                } else {
                    GameEngine.m5e("startingUnitOverride: " + playerData.startUnit);
                    elementById5.setValue(VariableScope.nullOrMissingString + playerData.startUnit);
                }
            } else {
                GameEngine.m5e("s2");
            }
            if (!GameEngine.o("s3")) {
                if (playerData.color == null) {
                    elementById6.setValue("-99");
                    return;
                }
                GameEngine.m5e("playerColor: " + playerData.color);
                elementById6.setValue(VariableScope.nullOrMissingString + playerData.color);
                return;
            }
            GameEngine.m5e("s3");
        }
    }

    public void teamsSet_apply() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (!gameEngine.netEngine.isServer) {
            GameEngine.m5e("Not server");
            return;
        }
        GameEngine.m5e("playerConfig_kick");
        String value = this.libRocket.c().getElementById("teamLayout").getValue();
        if ("2t".equalsIgnoreCase(value)) {
            gameEngine.netEngine.a(Server_type.layout_2sides);
        } else if ("3t".equalsIgnoreCase(value)) {
            gameEngine.netEngine.a(Server_type.layout_3sides);
        } else if ("FFA".equalsIgnoreCase(value)) {
            gameEngine.netEngine.a(Server_type.layout_ffa);
        } else if ("spectators".equalsIgnoreCase(value)) {
            gameEngine.netEngine.a(Server_type.layout_spectators);
        } else {
            GameEngine.print("teamsSet_apply: unknown layout: " + value);
        }
        refreshUI();
    }

    public void playerConfig_kick() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m5e("playerConfig_kick");
        String value = this.libRocket.c().getElementById("team_id").getValue();
        PlayerData playerData = PlayerData.getPlayerData(Integer.parseInt(value));
        if (playerData == null) {
            this.root.logWarn("playerConfig_kick: " + value + "==null");
        } else {
            gameEngine.netEngine.e(playerData);
        }
    }

    public void playerConfig_apply() {
        boolean z;
        int i;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m5e("playerConfig_kick");
        String value = this.libRocket.c().getElementById("team_id").getValue();
        PlayerData playerData = PlayerData.getPlayerData(Integer.parseInt(value));
        if (playerData == null) {
            this.root.logWarn("playerConfig_apply: " + value + "==null");
            return;
        }
        ElementDocument c = this.libRocket.c();
        Element elementById = c.getElementById("spawnPoint");
        Element elementById2 = c.getElementById("allyTeam");
        Element elementById3 = c.getElementById("aiDifficulty");
        Element elementById4 = c.getElementById("startingUnits");
        Element elementById5 = c.getElementById("playerColor");
        String value2 = elementById.getValue();
        String value3 = elementById2.getValue();
        int intValue = Integer.valueOf(value2).intValue() - 1;
        boolean z2 = false;
        if (intValue == -3) {
            z2 = true;
        } else {
            if (intValue < 0) {
                intValue = 1;
            }
            if (intValue > PlayerData.c - 1) {
                intValue = PlayerData.c - 1;
            }
        }
        boolean z3 = false;
        if (z2) {
            i = -3;
            z = true;
        } else if (value3.equals("fromSpawn2")) {
            i = intValue % 2;
            playerData.u = false;
            z = true;
        } else {
            z = false;
            i = playerData.team;
            try {
                i = Integer.valueOf(value3).intValue() - 1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            playerData.u = true;
        }
        if (playerData.team != i) {
            if (gameEngine.netEngine.isServer) {
                z3 = true;
            } else if (gameEngine.netEngine.H || gameEngine.netEngine.z == playerData) {
                z3 = true;
            } else {
                GameEngine.b("row.setOnClickListener", "Clicked but not server or proxy controller");
            }
        }
        try {
            if (playerData.site != intValue) {
                if (gameEngine.netEngine.isServer) {
                    z3 = false;
                    gameEngine.netEngine.setPlayerTeamSynchronized(playerData, intValue);
                    playerData.team = i;
                } else if (gameEngine.netEngine.H || gameEngine.netEngine.z == playerData) {
                    z3 = false;
                    int i2 = i;
                    if (z) {
                        i2 = -1;
                    }
                    gameEngine.netEngine.a(playerData, intValue, Integer.valueOf(i2));
                } else {
                    GameEngine.b("row.setOnClickListener", "Clicked but not server or proxy controller");
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (playerData.w) {
            int intValue2 = elementById3.getValueAsInt(-99).intValue();
            if (intValue2 == -99) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(intValue2);
            }
            if (playerData.aiDifficulty != valueOf3) {
                if (gameEngine.netEngine.isServer) {
                    playerData.aiDifficulty = valueOf3;
                } else {
                    GameEngine.m5e("aiDifficultyOverride: not server or proxy controller");
                }
            }
        }
        int intValue3 = elementById4.getValueAsInt(-99).intValue();
        GameEngine.m5e("startingUnits now: " + intValue3);
        if (intValue3 == -99) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intValue3);
        }
        if (playerData.startUnit != valueOf) {
            if (gameEngine.netEngine.isServer) {
                playerData.startUnit = valueOf;
            } else {
                GameEngine.m5e("startingUnitOverride: not server or proxy controller");
            }
        }
        int intValue4 = elementById5.getValueAsInt(-99).intValue();
        GameEngine.m5e("playerColor now: " + intValue4);
        if (intValue4 == -99) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(intValue4);
        }
        if (playerData.color != valueOf2) {
            if (gameEngine.netEngine.isServer) {
                playerData.color = valueOf2;
            } else {
                GameEngine.m5e("colorOverride: not server or proxy controller");
            }
        }
        if (z3) {
            if (gameEngine.netEngine.isServer) {
                playerData.team = i;
            } else if (z) {
                gameEngine.netEngine.b(playerData, -1);
            } else {
                gameEngine.netEngine.b(playerData, i);
            }
        }
        gameEngine.netEngine.f();
        gameEngine.netEngine.M();
        refreshUI();
    }

    public void disconnect(String str) {
        GameEngine.getGameEngine().netEngine.closeServer(str);
    }

    public void multiplayerBackPrompt() {
        this.root.showPopup(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.title", new Object[0]), "What would you like to do?", true, (com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); back();", null);
    }

    public void surrenderPrompt() {
        this.root.showPopup(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.surrender.title", new Object[0]), com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.surrender.message", new Object[0]), true, (com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.surrender.surrenderButton", new Object[0]) + ":") + "closePopup(); mp.surrender();", null);
    }

    public void surrender() {
        GameEngine.m5e("Surrender requested");
        this.root.sendChatMessage("-surrender");
    }

    public void multiplayerExitPrompt() {
        String a = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
        String a2 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
        String str = (com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
        String str2 = null;
        if (GameEngine.getGameEngine().netEngine.isServer) {
            a = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.title", new Object[0]);
            a2 = com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
            str = (com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.exitGame", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
            str2 = (com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]) + ":") + "closePopup(); mp.sendReturnToBattleroomEvent();";
        }
        this.root.showPopup(a, a2, true, str, str2);
    }

    public void sendReturnToBattleroomEvent() {
        GameEngine.m5e("mp.sendReturnToBattleroomEvent()");
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.ag();
        gameEngine.bS.u = false;
    }

    public void addAI() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.isServer) {
            gameEngine.netEngine.ap();
        } else if (gameEngine.netEngine.H) {
            gameEngine.netEngine.k("-addai");
        } else {
            this.root.logWarn("addAI(): Clicked but not server or proxy controller");
        }
    }

    public String _getRandomDefaultPlayerName() {
        return "Unnamed" + f.rand(0, 999);
    }

    public void loadUsername() {
        GameEngine.m5e("mp.loadUsername()");
        String str = GameEngine.getGameEngine().settingsEngine.lastNetworkPlayerName;
        Element activeElementById = this.libRocket.getActiveElementById("username");
        String c = SteamEngine.getSteamEngine().c();
        GameEngine.m5e("steamName:" + c);
        if (c != null && str == null) {
            str = c;
        }
        if (str == null || VariableScope.nullOrMissingString.equals(str)) {
            str = _getRandomDefaultPlayerName();
        }
        activeElementById.loadCharsetIfNeeded(str);
        activeElementById.setAttribute("value", str);
    }

    public void getUsernameFromInterface() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String valueById = this.root.getValueById("username");
        if (valueById == null) {
            GameEngine.print("getUsernameFromInterface: Cannot find username");
            return;
        }
        String trim = valueById.trim();
        GameEngine.m5e("set username:" + trim);
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = _getRandomDefaultPlayerName();
        }
        gameEngine.netEngine.a(trim);
    }

    public void gameOptionsGet() {
        gameOptionsGetOrPush(false);
    }

    public void gameOptionsPush() {
        gameOptionsGetOrPush(true);
    }

    public void gameOptionsRefreshTypes() {
        GameEngine.getGameEngine();
        ElementDocument c = this.libRocket.c();
        if (this.useMapDropdown) {
            updateMapDropdown(c, "mapsSelector", "typeSelector");
        }
    }

    public void gameOptionsGetOrPush(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument c = this.libRocket.c();
        Element elementById = c.getElementById("fogMode");
        Element elementById2 = c.getElementById("startingCredits");
        Element elementById3 = c.getElementById("incomeMultiplier");
        Element elementById4 = c.getElementById("noNukes");
        Element elementById5 = c.getElementById("sharedControl");
        Element elementById6 = c.getElementById("aiDifficulty");
        Element elementById7 = c.getElementById("startingUnits");
        if (!z) {
            setupStartingUnitDropDown(elementById7, false);
        }
        Element elementById8 = c.getElementById("typeSelector");
        Element mapDropdown = getMapDropdown();
        if (!z) {
            if (gameEngine.netEngine.gameMapData.mapType == null) {
                GameEngine.m5e("gameOptionsGetOrPush: game.network.setup.currentType==null");
            } else {
                elementById8.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.mapType.ordinal());
            }
            if (this.useMapDropdown) {
                updateMapDropdown(c, "mapsSelector", "typeSelector");
                Element mapDropdown2 = getMapDropdown();
                GameEngine.m5e("new currentMapSelection=" + gameEngine.netEngine.gameMapData.mapName);
                mapDropdown2.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.mapName);
            }
            c.getElementById("typeSelector");
            elementById.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.fog);
            elementById2.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.credits);
            elementById7.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.initUnit);
            gameEngine.netEngine.gameMapData.e = true;
            elementById4.setCheckbox(gameEngine.netEngine.gameMapData.nukes);
            elementById5.setCheckbox(gameEngine.netEngine.gameMapData.sharedControl);
            elementById3.setValue(VariableScope.nullOrMissingString + f.a(gameEngine.netEngine.gameMapData.income, 1) + "x");
            elementById6.setValue(VariableScope.nullOrMissingString + gameEngine.netEngine.gameMapData.aidiff);
            return;
        }
        GameMapData e = gameEngine.netEngine.e();
        if (e != null) {
            String str = null;
            if (this.useMapDropdown) {
                str = mapDropdown.getValue();
                if (str == null) {
                    GameEngine.m5e("gameOptionsGetOrPush: mapDropdownSelected==null");
                    str = "<No Map>";
                }
            }
            int intValue = elementById8.getValueAsInt(0).intValue();
            MapType mapType = e.mapType;
            e.mapType = MapType.values()[intValue];
            if (this.useMapDropdown) {
                e.mapName = str;
            } else if (mapType != e.mapType) {
                e.mapName = null;
            }
            e.fog = elementById.getValueAsInt(null).intValue();
            e.credits = elementById2.getValueAsInt(null).intValue();
            float f = 1.0f;
            try {
                f = Float.parseFloat(elementById3.getValue().replace("x", VariableScope.nullOrMissingString));
            } catch (NumberFormatException e2) {
                e2.printStackTrace();
            }
            e.income = f;
            e.nukes = elementById4.getCheckbox();
            e.sharedControl = elementById5.getCheckbox();
            e.aidiff = elementById6.getValueAsInt(null).intValue();
            e.initUnit = elementById7.getValueAsInt(1).intValue();
            gameEngine.netEngine.a(e);
        }
    }

    public void closeBattleroomIfOpen() {
        GameEngine.getGameEngine();
        if (this.libRocket.getActiveElementById("battleroomPage") == null) {
            GameEngine.m5e("closeBattleroomIfOpen: battleroomPage==null");
        } else {
            this.libRocket.backToLastDocument();
        }
    }

    public void reinviteAsk() {
        this.root.showPopup(com.corrodinggames.rts.gameFramework.translations.a.a("menus.ingame.multiplayerReinvite.title", new Object[0]), "While in-game you can only reinvite players who were in-game before but dropped out", true, "reInvite:closePopup(); mp.showSteamInviteDialog();", null);
    }

    public void showSteamInviteDialog() {
        SteamEngine.getSteamEngine().g();
    }

    public void setMapFromPopup(String str) {
        if (!isInControlOfServer()) {
            this.root.sendChatMessage("clicked on '" + this.root.getMapNameFromPath(str) + "'");
            this.root.closePopup();
            return;
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameMapData e = gameEngine.netEngine.e();
        if (e != null) {
            String str2 = str;
            if (!str2.contains("MOD|")) {
                str2 = f.k(str2);
            }
            e.mapName = str2;
            gameEngine.netEngine.a(e);
        }
        this.root.closePopup();
    }

    public void showMapSelect() {
        this.root.showMapPopup(this.root.getModeMapPath(null, null), "mp.setMapFromPopup");
    }

    public boolean isInControlOfServer() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        return gameEngine.netEngine.isServer || gameEngine.netEngine.H;
    }

    public void askPassword() {
        GameEngine.m5e("mp.askPassword()");
        GameEngine.getGameEngine();
        this.root.showInputPopupNonClose("Password Required", "This server requires a password to join", VariableScope.nullOrMissingString, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
    }

    public void askPasswordEntered(String str) {
        GameEngine.m5e("mp.askPasswordEntered()");
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.passwd = str;
        gameEngine.netEngine.X();
        this.root.closePopup();
    }

    public void cancelPaswordAsk() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.netEngine.isServer) {
            this.root.logWarn("cancelPaswordAsk: we are the server");
        } else {
            gameEngine.netEngine.closeServer("Cancel password");
            closeBattleroomIfOpen();
        }
        this.root.closePopup();
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer$DropdownOption.class */
    public class DropdownOption {
        String key;
        String value;

        public DropdownOption(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public void setupStartingUnitDropDown(Element element, boolean z) {
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", com.corrodinggames.rts.gameFramework.translations.a.a("menus.settings.option.default", new Object[0]), false);
        }
        Iterator it = getStartingUnitOptions().iterator();
        while (it.hasNext()) {
            DropdownOption dropdownOption = (DropdownOption) it.next();
            str = str + generateOption(dropdownOption.key, dropdownOption.value, false);
        }
        element.setInnerRML(str);
    }

    public void setupPlayerColorDropDown(Element element, boolean z, boolean z2, PlayerData playerData) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", com.corrodinggames.rts.gameFramework.translations.a.a("menus.settings.option.default", new Object[0]), false);
        }
        for (int i = 0; i < 10; i++) {
            boolean z3 = false;
            if (z2 && gameEngine.netEngine.a(i, playerData)) {
                z3 = true;
            }
            String d = al.d(PlayerData.j(i));
            int i2 = i;
            int i3 = i;
            if (z3) {
                d = d + " (used)";
                i2 = -7829368;
                i3 = -99;
            }
            str = str + generateOption(VariableScope.nullOrMissingString + i3, d, false, Integer.valueOf(PlayerData.i(i2)), z3);
        }
        element.setInnerRML(str);
    }

    public ArrayList getStartingUnitOptions() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ArrayList arrayList = new ArrayList();
        Iterator it = gameEngine.netEngine.i().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList.add(new DropdownOption(num.toString(), gameEngine.netEngine.d(num.intValue())));
        }
        return arrayList;
    }
}