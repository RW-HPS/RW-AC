package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0118j;
import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.appFramework.ActivityC0131q;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.debug.ScriptServerSocket;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0645ad;
import com.corrodinggames.rts.gameFramework.C0749bt;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.C0846g;
import com.corrodinggames.rts.gameFramework.FileChangeEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SystemType;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.net.C0902b;
import com.corrodinggames.rts.gameFramework.net.GameMapData;
import com.corrodinggames.rts.gameFramework.net.GameNetAPIOperate;
import com.corrodinggames.rts.gameFramework.net.ListRoomInfo;
import com.corrodinggames.rts.gameFramework.net.MapType;
import com.corrodinggames.rts.gameFramework.net.PlayerConnect;
import com.corrodinggames.rts.gameFramework.net.RunnableC0889an;
import com.corrodinggames.rts.gameFramework.p044l.AbstractC0956b;
import com.corrodinggames.rts.gameFramework.p044l.C0955a;
import com.corrodinggames.rts.gameFramework.player.EnumC0850c;
import com.corrodinggames.rts.gameFramework.player.EnumC0853f;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root.class */
public class Root extends ScriptContext {
    public static final boolean DEBUG_TIMING = true;
    public Multiplayer multiplayer;
    public Mods mods;
    C0749bt openDocumentTimer = new C0749bt("openDocument", true);
    RunnableC0889an threadedGameConnector;
    ElementDocument lastConnectingPopup;
    static C0749bt convertTextStopwatch = new C0749bt("ConvertText", true);
    static C0749bt loadSettingsStopwatch = new C0749bt("LoadSettings", true);
    ArrayList lastSortedDiscoveredServers;

    public void logDebug(String str) {
        GameEngine.m5925e("ui[debug]: " + str);
    }

    public void logWarn(String str) {
        GameEngine.m5925e("ui[warn]: " + str);
    }

    public void back() {
        this.libRocket.backToLastDocument();
        if (this.libRocket.getActiveDocument() == null) {
            GameEngine.print("back: libRocket.getActiveDocument()==null");
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine == null || !gameEngine.f6448bq) {
                GameEngine.print("back: showing main menu!");
                showMainMenu();
                return;
            }
            GameEngine.print("back: resuming game");
            this.guiEngine.m5505a(false);
        }
    }

    public void backOrClose() {
        if (closePopup()) {
            return;
        }
        this.libRocket.backToLastDocument();
    }

    public String fullVersionOnlyStyle() {
        if (GameEngine.getGameEngine().f6441ar) {
            return "notInDemo";
        }
        return VariableScope.nullOrMissingString;
    }

    public void openIfNotDemo(String str, Object obj, String str2) {
        if (GameEngine.getGameEngine().f6441ar) {
            alert(str2);
        } else {
            open(str, obj);
        }
    }

    public String getVersionName() {
        return GameEngine.getGameEngine().m1084t();
    }

    public void delayedOpenNoHistory(final String str, Object obj) {
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.1
            @Override // java.lang.Runnable
            public void run() {
                Root.this.libRocket.setDocument(str, null, false);
                Root.this.onShowNewScreen();
            }
        }).framesDelay = 1;
    }

    public void openAfterHelpPopup(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (GameEngine.m1143au() && !gameEngine.settingsEngine.hasPlayedGameOrSeenHelp) {
            gameEngine.settingsEngine.hasPlayedGameOrSeenHelp = true;
            gameEngine.settingsEngine.save();
            showPopup(VariableScope.nullOrMissingString, "First time playing? Would you like to view the quick help slides?", false, "[onenter]View Help:closePopup(); open('help_quick_mobile.rml');", "Skip:closePopup(); open(" + restrictedString(str) + ");");
            return;
        }
        open(str, null);
    }

    public void open(String str, Object obj) {
        this.openDocumentTimer.m2563a();
        AbstractC0048b.f357a.m2558f();
        HashMap hashMap = null;
        if (obj != null) {
            hashMap = new HashMap();
            hashMap.put("mode", obj);
        }
        this.libRocket.setDocument(str, hashMap);
        onShowNewScreen();
        this.openDocumentTimer.m2560d();
        AbstractC0048b.f357a.m2559e();
    }

    public void onShowNewScreen() {
        this.guiEngine.m5505a(true);
    }

    public void resume() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m5497f();
    }

    public void resumeNonMenu() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m5505a(false);
    }

    public void startNew(String str) {
        this.guiEngine.m5506a(str);
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void showRangeValue(String str, String str2, boolean z) {
        String num;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return;
        }
        String attribute = activeElementById.getAttribute("value");
        if (z) {
            num = new Float(attribute).toString();
        } else {
            num = Integer.toString((int) Float.parseFloat(attribute));
        }
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById2 == null) {
            logWarn("Could not find:" + str2);
        } else {
            activeElementById2.setText(num);
        }
    }

    public String getValueById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById.getAttribute("value");
    }

    public void setValueById(String str, String str2) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
        } else {
            activeElementById.setAttribute("value", str2);
        }
    }

    public Element getElementById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById;
    }

    public boolean clickElement(Element element) {
        if (element == null) {
            logWarn("element is null");
            return false;
        }
        element.click();
        return true;
    }

    public void directJoinPopup() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = VariableScope.nullOrMissingString;
        if (gameEngine.settingsEngine.lastNetworkIP != null) {
            str = gameEngine.settingsEngine.lastNetworkIP;
        }
        showInputPopup("Direct Join", "Enter IP address or host name", str, "[onenter]Join:joinServerFromPopup(getPopupText())", null);
    }

    public void joinServerFromPopup(String str) {
        closePopup();
        hideKeyboard();
        if (str == null) {
            logDebug("joinAddress==null");
            return;
        }
        String trim = str.trim();
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.settingsEngine.lastNetworkIP = trim;
        gameEngine.settingsEngine.save();
        joinServerWithId(trim, null);
    }

    public void joinServerWithId(String str, String str2) {
        GameEngine.getGameEngine().netEngine.f5817bw = str2;
        joinServer(str);
    }

    public void joinServer(String str) {
        if (ScriptEngine.inDebugScript && !ScriptServerSocket.f390d) {
            return;
        }
        logDebug("joinAddress=" + str);
        this.threadedGameConnector = GameEngine.getGameEngine().netEngine.m1685a(str, false, new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.2
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
            }
        });
        this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", null, "Please wait");
    }

    public void joinServerCallback() {
        logDebug("joinServerCallback");
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.threadedGameConnector == null) {
            logDebug("threadedGameConnector==null");
            return;
        }
        closePopupOnly();
        if (this.threadedGameConnector.f5904e != null) {
            if (this.threadedGameConnector.f5904e.equals("CANCELLED")) {
                logDebug("Server join cancelled");
                return;
            } else {
                logWarn("Server join failed");
                showPopup("Connection failed", this.threadedGameConnector.f5904e, true, null, null);
            }
        } else {
            try {
                gameEngine.netEngine.closeServer("starting new");
                gameEngine.netEngine.bindSocket(this.threadedGameConnector.f5906g);
                logDebug("connected");
                showBattleroom();
            } catch (IOException e) {
                gameEngine.m1122c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
        this.threadedGameConnector = null;
    }

    public void cancelJoinServer() {
        if (this.threadedGameConnector != null) {
            if (this.threadedGameConnector.m1536a()) {
                closePopup();
                return;
            }
            return;
        }
        closePopup();
    }

    public void alert(String str) {
        showAlert(str);
    }

    public void showAlert(String str) {
        logDebug("alert:" + str);
        if (str == null) {
            str = "null";
        }
        this.libRocket.m5473c(str);
    }

    public void showPopupWithButtons(String str, String str2, boolean z, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m5483a(str, str2, (String) null, c0051e, c0051e2, z);
    }

    public void showPopupWithButtonsAndInput(String str, String str2, boolean z, String str3, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str3)) {
            this.guiEngine.m5494l();
        }
        this.libRocket.m5482a(str, str2, str3, c0051e, c0051e2, true, z);
    }

    public void showPopup(String str, String str2, boolean z, String str3, String str4) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m5481a(str, str2, (String) null, str3, str4, z);
    }

    public void showInputPopup(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m5494l();
        }
        this.libRocket.m5481a(str, str2, str6, str4, str5, true);
    }

    public void showInputPopupNonClose(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m5494l();
        }
        this.libRocket.m5482a(str, str2, str6, str4, str5, true, false);
    }

    public ElementDocument getPopup() {
        return this.libRocket.m5475c();
    }

    public ElementDocument getAlertOrPopup() {
        return this.libRocket.m5470e();
    }

    public boolean closePopup() {
        return this.libRocket.m5467h();
    }

    public boolean closePopupOnly() {
        return this.libRocket.m5465j();
    }

    public boolean closeAlertOnly() {
        return this.libRocket.m5466i();
    }

    public String getPopupText() {
        return this.libRocket.m5464k();
    }

    public void showHostOptions() {
        this.libRocket.m5481a("Host game", m5463i("menus.hostgame.info_pc"), (String) null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);", true);
    }

    public void hostStartFromPopup(boolean z) {
        ElementDocument m5468g = this.libRocket.m5468g();
        Element elementById = m5468g.getElementById("password");
        String str = null;
        if (elementById == null) {
            logWarn("hostStartFromPopup: password==null");
        } else {
            String value = elementById.getValue();
            if (value != null && !value.trim().equals(VariableScope.nullOrMissingString)) {
                str = value;
            }
        }
        boolean checkbox = m5468g.getElementById("useMods").getCheckbox();
        closePopup();
        hostStartWithPasswordAndMods(z, str, checkbox);
    }

    public void hostStart(boolean z) {
        GameEngine.print("old version of hostStart");
        hostStartWithPassword(z, null);
    }

    public void hostStartWithPassword(boolean z, String str) {
        GameEngine.print("old version of hostStartWithPassword");
        hostStartWithPasswordAndMods(z, str, true);
    }

    public void hostStartWithPasswordAndMods(boolean publicRoom, String passwd, boolean useMods) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.closeServer("starting new");
        gameEngine.netEngine.passwd = passwd;
        gameEngine.netEngine.useMods = useMods;
        gameEngine.netEngine.publicRoom = publicRoom;
        if (gameEngine.netEngine.startNet(false)) {
            logDebug("-Hosting-");
            logDebug("using password: " + (gameEngine.netEngine.passwd != null));
            logDebug("using mods: " + (gameEngine.netEngine.useMods));
            logDebug("public: " + (gameEngine.netEngine.publicRoom));
            String m1651av = gameEngine.netEngine.m1651av();
            if (m1651av != null && !C0765a.m2412i(m1651av)) {
                GameEngine.print("hostStart: map does not exist: " + m1651av + " reseting");
                m1651av = null;
            }
            if (m1651av == null) {
                gameEngine.netEngine.gameMapData.f5852a = MapType.values()[0];
                gameEngine.netEngine.f5801az = "maps/skirmish/[p8]Many Islands (8p).tmx";
                gameEngine.netEngine.gameMapData.f5853b = "[p8]Many Islands (8p).tmx";
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("hosting failed");
    }

    public void exit() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.settingsEngine.numLoadsSinceRunningGameOrNormalExit != 0) {
            gameEngine.settingsEngine.numLoadsSinceRunningGameOrNormalExit = 0;
            gameEngine.settingsEngine.save();
        }
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.3
            @Override // java.lang.Runnable
            public void run() {
                Root.this.guiEngine.mo301d(true);
            }
        });
    }

    public String getMapDetails(String str) {
        return "hello 123";
    }

    public String getHTMLMapNameFromPath(String str) {
        return htmlString(getMapNameFromPath(str));
    }

    public String getMapNameFromPath(String str) {
        return convertMapName(new File(str).getName());
    }

    public String convertMapName(String str) {
        return C0855a.m1845b(convertMapNameWithoutTranslation(str));
    }

    public String convertMapNameWithoutTranslation(String str) {
        return ActivityC0117i.m5381e(str);
    }

    public String getHTMLMapThumbnail(String str) {
        return escapedString(getMapThumbnail(str));
    }

    public String getMapThumbnail(String str) {
        if (str.startsWith("saves/")) {
        }
        String m5396c = C0090c.m5396c(str);
        String str2 = "thumbnail:assets:" + m5396c;
        if (!C0765a.m2412i(m5396c)) {
            if (GameEngine.f6423aZ) {
                GameEngine.m1180a("getMapThumbnail: Failed to find: " + m5396c);
                return "drawable:error_missingmap.png";
            }
            return "drawable:error_missingmap.png";
        }
        return str2;
    }

    public boolean isMapSkirmish(String str) {
        return ActivityC0117i.m5380f(str);
    }

    public void showLevelOptions() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str = (String) this.libRocket.m5477b("mode");
        if (str == null) {
            GameEngine.m1104g("levelPath==null");
            return;
        }
        boolean z = true;
        if (!isMapSkirmish(str)) {
            z = false;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        Iterator it = activeDocument.findElementsByClassName("skirmishOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Element elementById = activeDocument.getElementById("advancedButton");
        if (elementById != null) {
            elementById.show(z || ActivityC0117i.m5379g(str));
        }
        activeDocument.getElementById("aiDifficulty").setValue(VariableScope.nullOrMissingString + gameEngine.settingsEngine.aiDifficulty);
    }

    public void loadConfigAndStartSwitchToAdvanced(String str) {
        GameEngine.getGameEngine().f6313bv = false;
        loadConfigCommon(str, true);
        _startAdvancedMode(false);
    }

    private void _startAdvancedMode(boolean z) {
        boolean m1729S;
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.closeServer("starting singleplayer");
        gameEngine.netEngine.f5698y = "You";
        gameEngine.netEngine.useMods = true;
        if (z) {
            m1729S = gameEngine.netEngine.m1730R();
        } else {
            m1729S = gameEngine.netEngine.m1729S();
        }
        if (m1729S) {
            logDebug("started startSinglePlayerServer");
            GameMapData m1610e = gameEngine.netEngine.m1610e();
            if (m1610e != null) {
                m1610e.aidiff = gameEngine.settingsEngine.aiDifficulty;
                gameEngine.netEngine.m1706a(m1610e);
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("failed startSinglePlayerServer");
    }

    public void loadConfigAndStartNewSandbox(String str) {
        _loadConfigAndStartNewSandboxCommon(str, true);
    }

    public void loadConfigAndStartNewSandboxInAdvanced(String str) {
        GameEngine.m5925e("loadConfigAndStartNewSandboxInAdvanced");
        _loadConfigAndStartNewSandboxCommon(str, false);
        _startAdvancedMode(true);
        GameEngine.m5925e("editorMode:" + GameEngine.getGameEngine().f6313bv);
    }

    private void _loadConfigAndStartNewSandboxCommon(String str, boolean z) {
        if (str.startsWith("saves/")) {
            GameEngine.m5925e("Starting sandbox from save: " + str);
            loadGame(str.substring("saves/".length()));
        } else {
            GameEngine.m5925e("Starting sandbox from map: " + str);
            loadConfigCommon(str, false);
        }
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6323bL.f842E = false;
        gameEngine.f6330bS.m1922y();
        gameEngine.f6313bv = true;
        if (z) {
            this.guiEngine.m5497f();
        }
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigAndStartNew(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6313bv = false;
        gameEngine.netEngine.closeServer("starting singleplayer");
        loadConfigCommon(str, false);
        this.guiEngine.m5497f();
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigCommon(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        gameEngine.settingsEngine.aiDifficulty = activeDocument.getElementById("aiDifficulty").getValueAsInt(0).intValue();
        gameEngine.settingsEngine.save();
        this.guiEngine.m5502b(true);
        this.guiEngine.m5500c(false);
        boolean isMapSkirmish = isMapSkirmish(str);
        int intValue = activeDocument.getElementById("numberOfAIs").getValueAsInt(4).intValue();
        boolean z2 = true;
        int intValue2 = activeDocument.getElementById("aiTeams").getValueAsInt(1).intValue();
        int i = intValue2 - 1;
        if (intValue2 == 5) {
            i = 0;
            z2 = false;
        }
        ActivityC0117i.m5383a(str, isMapSkirmish, intValue, i, z2, z);
    }

    public void showMapPopup(String str, String str2) {
        ElementDocument m5485a = this.libRocket.m5485a("levelSelect.rml", (Object) str, "Map Select", false);
        if (m5485a != null) {
            m5485a.setMetadata("mapClickFunction", str2);
            Iterator it = m5485a.findElementsByClassName("noStyleInPopup").iterator();
            while (it.hasNext()) {
                ((Element) it.next()).setAttribute("class", VariableScope.nullOrMissingString);
            }
            if (showMapsWithDoc(m5485a)) {
                GameEngine.m5925e("showMapsWithDoc passed");
                this.libRocket.m5467h();
                this.libRocket.m5489a(m5485a);
            }
        }
    }

    public void refreshAfterFileImport() {
        GameEngine.m5925e("refreshAfterFileImport");
        GameEngine.getGameEngine().f6337bZ.m1810k();
        this.libRocket.reloadDocument();
    }

    public boolean showMaps() {
        return showMapsWithDoc(this.libRocket.m5469f());
    }

    public boolean showMapsWithDoc(ElementDocument elementDocument) {
        String[] m1827a;
        String[] strArr;
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m5925e("showMaps");
        if (elementDocument == null) {
            GameEngine.m5925e("showMaps: elementDocument==null");
            return false;
        }
        Element elementById = elementDocument.getElementById("mapTemplateHolder");
        Element elementById2 = elementDocument.getElementById("mapHolder");
        String innerRML = elementById.getInnerRML();
        String str3 = VariableScope.nullOrMissingString;
        String str4 = (String) elementDocument.getMetadata("mode");
        String str5 = (String) elementDocument.getMetadata("mapClickFunction");
        boolean equals = str4.equals("saves");
        boolean equals2 = str4.equals("replays");
        boolean startsWith = str4.startsWith("/SD/");
        if (equals) {
            m1827a = ActivityC0118j.m5377l();
            if (m1827a == null) {
                gameEngine.m1179a("No saves", 1);
                return false;
            }
        } else if (equals2) {
            m1827a = ActivityC0131q.m5348l();
            if (!gameEngine.settingsEngine.saveMultiplayerReplays) {
                alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }
            if (m1827a == null) {
                if (gameEngine.settingsEngine.saveMultiplayerReplays) {
                    gameEngine.m1179a("No replays yet", 1);
                    return false;
                }
                return false;
            }
        } else {
            m1827a = gameEngine.f6337bZ.m1827a(C0765a.m2430a(str4, true), str4);
            if (m1827a == null) {
                gameEngine.m1179a("Could not find folder: " + C0765a.m2417e(str4), 1);
                return false;
            }
        }
        String str6 = str4 + "/";
        int i = 0;
        for (String str7 : m1827a) {
            String convertMapName = convertMapName(str7);
            boolean m5384a = ActivityC0117i.m5384a(str7, str6 + str7);
            String str8 = convertMapName + VariableScope.nullOrMissingString;
            if (gameEngine.f6441ar && !m5384a) {
                str8 = "[LOCKED] " + str8;
            }
            String replace = innerRML.replace("_NAME_", htmlString(str8));
            if (equals) {
                str = "loadGame(" + escapedString(str7) + ")";
                str2 = "loadGameEdit(" + escapedString(str7) + ")";
            } else if (equals2) {
                str = "loadReplay(" + escapedString(str7) + ")";
                str2 = "loadReplayEdit(" + escapedString(str7) + ")";
            } else {
                str = "open('levelOptions.rml', " + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            if (str5 != null) {
                str = str5 + "(" + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            String replace2 = replace.replace("_ONCLICK_", str).replace("_ONCLICKEDIT_", str2);
            String str9 = "thumbnail:assets:";
            int i2 = 18;
            if (startsWith) {
                i2 = 2;
            }
            if (i > i2) {
                str9 = "lazy:" + str9;
            }
            String m5396c = C0090c.m5396c(str6 + str7);
            if (GameEngine.f6423aZ) {
            }
            String str10 = str9 + m5396c;
            if (!C0765a.m2412i(m5396c)) {
                if (GameEngine.f6423aZ) {
                    GameEngine.m1180a("List: Failed to find: " + m5396c + " after converting:" + m5396c + " ( " + str10 + " )");
                }
                str10 = "drawable:error_missingmap.png";
            }
            if (equals || equals2) {
                str10 = VariableScope.nullOrMissingString;
            }
            i++;
            str3 = str3 + replace2.replace("_IMG_", htmlString(str10));
        }
        elementById2.setInnerRML(str3);
        elementById2.loadCharsetIfNeeded(str3);
        if (equals || equals2) {
            elementById2.addClass("savesOnly");
        } else {
            elementById2.addClass("notSavesOnly");
        }
        if (startsWith && str5 == null && GameEngine.m1143au()) {
            elementDocument.addClass("showImportButton");
            return true;
        }
        return true;
    }

    public void convertTextOnPage() {
        GameEngine.getGameEngine();
        logDebug("convertTextOnPage");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (isMobile()) {
            activeDocument.addClass("mobile");
        }
        if (this.libRocket.getHeight() < 800) {
            activeDocument.addClass("smallScreen");
        }
        convertTextStopwatch.m2563a();
        Iterator it = activeDocument.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            int numAttributes = element.getNumAttributes();
            for (int i = 0; i < numAttributes; i++) {
                String attributeKey = element.getAttributeKey(i);
                String attributeValue = element.getAttributeValue(i);
                if (attributeKey != null) {
                    if (attributeKey.equals("nestedclone") && !attributeValue.equalsIgnoreCase("false")) {
                        GameEngine.m5925e("nested clone:" + element.getId());
                        element.setAttribute(attributeKey, "false");
                        Element m5479clone = element.m5479clone();
                        element.prependChild(m5479clone);
                        m5479clone.removeReference();
                    } else if (attributeKey.equals("childclone") && !attributeValue.equalsIgnoreCase("false")) {
                        element.setAttribute(attributeKey, "false");
                        if (element.getNumChildren() < 1) {
                            GameEngine.m5925e("child clone failed no children:" + element.getId());
                        }
                        Element m5479clone2 = element.getChild(0).m5479clone();
                        m5479clone2.addClass("clone");
                        element.prependChild(m5479clone2);
                        m5479clone2.removeReference();
                    } else {
                        String m5471d = this.libRocket.m5471d(attributeValue);
                        if (m5471d != null) {
                            GameEngine.m5925e("convertTextOnPage:" + attributeKey + ": '" + attributeValue + "' to '" + m5471d + "'");
                            if (attributeKey.equals("_html")) {
                                GameEngine.m5925e("setting html:" + attributeKey);
                                element.setInnerRML(m5471d);
                            } else {
                                if (attributeKey.startsWith("_")) {
                                    attributeKey = attributeKey.substring("_".length());
                                    GameEngine.m5925e("converted key to:" + attributeKey);
                                }
                                element.setAttribute(attributeKey, m5471d);
                            }
                        }
                    }
                }
            }
            if (activeDocument.translatedToUnicode) {
                String tagName = element.getTagName();
                if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                    element.loadCharsetIfNeededWithCurrentText();
                }
            }
        }
        convertTextStopwatch.m2560d();
    }

    public void keyBindingPopup_apply(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument m5475c = this.libRocket.m5475c();
        if (m5475c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        String[] split = ((String) m5475c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        C0645ad c0645ad = (C0645ad) gameEngine.f6331bT.f4177al.get(parseInt);
        if (!z) {
            Object metadata = m5475c.getMetadata("lastKeyPressed");
            if (metadata == null) {
                logWarn("keyBindingPopup_apply: no last key entered");
                return;
            }
            int intValue = ((Integer) metadata).intValue();
            int i = 0;
            Object metadata2 = m5475c.getMetadata("lastKeyModifiersPressed");
            if (metadata2 != null) {
                i = ((Integer) metadata2).intValue();
            }
            c0645ad.m2919a(intValue, parseInt2, i, true);
        } else {
            c0645ad.m2919a(0, parseInt2, 0, true);
        }
        showKeyBinding();
        closePopup();
    }

    public void keyBindingPopup_onKeydown(int i) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument m5475c = this.libRocket.m5475c();
        if (m5475c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m5475c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        int mo298i = this.guiEngine.mo298i();
        String str = VariableScope.nullOrMissingString + GameEngine.m1099j(mo298i);
        if (i == 111) {
        }
        if (i == 0) {
            logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
        } else if (!gameEngine.m1101i(i)) {
            m5475c.setMetadata("lastKeyPressed", Integer.valueOf(i));
            m5475c.setMetadata("lastKeyModifiersPressed", Integer.valueOf(mo298i));
            String str2 = str + SlickToAndroidKeycodes.m769a(i);
            keyBindingPopup_apply(false);
        } else {
            elementById.setText("Key: " + str);
        }
    }

    public void showKeyBindingPopup() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument m5475c = this.libRocket.m5475c();
        if (m5475c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m5475c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        String[] split = ((String) m5475c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        Integer.parseInt(split[1]);
        C0645ad c0645ad = (C0645ad) gameEngine.f6331bT.f4177al.get(parseInt);
        elementById.setText("Press a key..");
    }

    public String getKeyBindingAction(int i, C0645ad c0645ad, int i2) {
        return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(i + ":" + i2) + ", " + escapedString(c0645ad.f4181a) + "); showKeyBindingPopup();";
    }

    public void backWarnIfOverlappingKeyBinding() {
        if (((Boolean) this.libRocket.getActiveDocument().getMetadata("hasOverlappingKeys", false)).booleanValue()) {
            showPopupWithButtons(null, "One or more keys are overlapping and have been highlighted in red. These can cause problems.", false, new C0051e("Ignore", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.4
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    Root.this.back();
                }
            }), new C0051e("Fix", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.5
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                }
            }));
        } else {
            back();
        }
    }

    public void showKeyBinding() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        activeDocument.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
        TableData tableData = new TableData();
        ArrayList arrayList = tableData.rows;
        ArrayList arrayList2 = gameEngine.f6331bT.f4177al;
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            C0645ad c0645ad = (C0645ad) arrayList2.get(i);
            if (c0645ad.f4182b) {
                TableRow tableRow = new TableRow();
                tableRow.addCell(c0645ad.f4181a);
                if (c0645ad.mo2909d()) {
                    tableRow.addClass("rowHeader");
                } else {
                    for (int i2 = 0; i2 <= 1; i2++) {
                        boolean m2928a = gameEngine.f6331bT.m2928a(c0645ad, i2);
                        TableCell addCell = tableRow.addCell(c0645ad.m2914b(i2));
                        addCell.setLibrocketOnClick(getKeyBindingAction(i, c0645ad, i2));
                        if (m2928a) {
                            addCell.color = -65536;
                            z = true;
                        }
                    }
                }
                arrayList.add(tableRow);
            }
        }
        activeDocument.setMetadata("hasOverlappingKeys", Boolean.valueOf(z));
        refreshTable("keysDiv", tableData);
    }

    public void loadSettings() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        loadSettingsStopwatch.m2563a();
        logDebug("loadSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                String attribute = element.getAttribute("type", "unknown");
                String valueDynamic = gameEngine.settingsEngine.getValueDynamic(id);
                if (attribute.equals("checkbox")) {
                    if (Boolean.parseBoolean(valueDynamic)) {
                        element.setAttribute("checked", VariableScope.nullOrMissingString);
                    } else {
                        element.setAttribute("checked", null);
                    }
                } else {
                    element.setAttribute("value", valueDynamic);
                }
            }
        }
        loadSettingsStopwatch.m2560d();
    }

    public void loadLeaderboard() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        logDebug("loadLeaderboard");
        Element activeElementById = this.libRocket.getActiveElementById("leaderboardType");
        Element activeElementById2 = this.libRocket.getActiveElementById("leaderboardGrouping");
        if (activeElementById == null || activeElementById2 == null) {
            GameEngine.m1180a("loadLeaderboard: Failed to find elements. (For page: " + this.libRocket.getActiveDocumentPath() + ")");
            return;
        }
        activeElementById.setAttribute("value", gameEngine.f6458cg.m1863e().name());
        activeElementById2.setAttribute("value", gameEngine.f6458cg.m1862f().name());
    }

    public void saveLeaderboard() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        EnumC0853f enumC0853f = EnumC0853f.f5600a;
        EnumC0850c enumC0850c = EnumC0850c.f5594a;
        logDebug("saveLeaderboard");
        Element activeElementById = this.libRocket.getActiveElementById("leaderboardType");
        Element activeElementById2 = this.libRocket.getActiveElementById("leaderboardGrouping");
        if (activeElementById == null || activeElementById2 == null) {
            GameEngine.m1180a("saveLeaderboard: Failed to find elements. (For page: " + this.libRocket.getActiveDocumentPath() + ")");
        } else {
            gameEngine.m1183a(EnumC0853f.valueOf(activeElementById.getAttribute("value")), EnumC0850c.valueOf(activeElementById2.getAttribute("value")));
        }
    }

    public void applyResolution() {
        this.guiEngine.mo300g();
    }

    public void updateRenderScaleInSettings(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        Element activeElementById = this.libRocket.getActiveElementById("uiRenderScale");
        Element activeElementById2 = this.libRocket.getActiveElementById("renderDensity");
        Float f = null;
        Float f2 = null;
        if (activeElementById == null) {
            logDebug("updateRenderScaleInSettings: uiRenderScale==null");
        } else {
            f = activeElementById.getValueAsFloat(Float.valueOf(1.0f));
            this.libRocket.getActiveElementById("uiRenderScaleDisplay").compareAndSetText("x" + C0773f.m2308b(f.floatValue() + 0.01f, 1));
        }
        if (activeElementById2 == null) {
            logDebug("updateRenderScaleInSettings: renderDensity==null");
        } else {
            f2 = activeElementById2.getValueAsFloat(Float.valueOf(1.0f));
            this.libRocket.getActiveElementById("renderDensityDisplay").compareAndSetText("x" + C0773f.m2308b(f2.floatValue() + 0.01f, 1));
        }
        if (z) {
            float f3 = gameEngine.settingsEngine.uiRenderScale;
            if (f != null) {
                gameEngine.settingsEngine.uiRenderScale = f.floatValue();
            }
            float f4 = gameEngine.settingsEngine.renderDensity;
            if (f2 != null) {
                gameEngine.settingsEngine.renderDensity = f2.floatValue();
            }
            try {
                applyResolution();
                gameEngine.settingsEngine.uiRenderScale = f3;
                gameEngine.settingsEngine.renderDensity = f4;
            } catch (Throwable th) {
                gameEngine.settingsEngine.uiRenderScale = f3;
                gameEngine.settingsEngine.renderDensity = f4;
                throw th;
            }
        }
    }

    public void closeSettings() {
        applyResolution();
    }

    public void saveSettings() {
        String attribute;
        GameEngine gameEngine = GameEngine.getGameEngine();
        logDebug("saveSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                if (element.getAttribute("type", "unknown").equals("checkbox")) {
                    String attribute2 = element.getAttribute("checked");
                    if (attribute2 == null || "false".equals(attribute2)) {
                        attribute = "false";
                    } else {
                        attribute = "true";
                    }
                } else {
                    attribute = element.getAttribute("value");
                }
                try {
                    gameEngine.settingsEngine.setValueDynamic(id, attribute);
                } catch (NumberFormatException e) {
                    alert("Error:" + e.getMessage());
                }
            }
        }
        this.guiEngine.mo300g();
        FileChangeEngine.m1777a();
        C0855a.m1840e();
        this.guiEngine.mo299h();
    }

    public String hideStyle(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "display:none;";
    }

    public String hideIf(boolean z) {
        return hideClass(!z);
    }

    public String hideUnless(boolean z) {
        return hideClass(z);
    }

    public String hideClass(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "hide";
    }

    public String hideIfMobile() {
        if (GameEngine.m1143au()) {
            return "hide";
        }
        return VariableScope.nullOrMissingString;
    }

    public boolean canResume() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine != null && gameEngine.f6455bG && !gameEngine.f6456bH) {
            return true;
        }
        return false;
    }

    public boolean isMobile() {
        return GameEngine.m1143au();
    }

    public boolean isIOS() {
        return GameEngine.f6423aZ;
    }

    public boolean isDesktop() {
        return GameEngine.m1142av();
    }

    public boolean isMac() {
        return C0191i.f1220c;
    }

    public boolean hasModSupport() {
        return !GameEngine.f6423aZ;
    }

    public boolean usingMods() {
        if (!GameEngine.f6423aZ || GameEngine.getGameEngine().f6337bZ.m1824c() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasWorkshopSupport() {
        return GameEngine.m1142av();
    }

    public boolean hasReloadSupport() {
        return !GameEngine.f6423aZ;
    }

    String restrictedString(String str) {
        if (str == null) {
            return null;
        }
        return "'" + str.replace("'", ".").replace("\"", ".").replace("(", ".").replace(")", ".").replace(",", ".").replace("<", ".").replace(">", ".") + "'";
    }

    String escapedString(String str) {
        return "'" + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;").replace("${", "$ {") + "'";
    }

    String htmlString(String str) {
        return VariableScope.nullOrMissingString + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("${", "$ {") + VariableScope.nullOrMissingString;
    }

    String htmlStringWithNewlines(String str) {
        return VariableScope.nullOrMissingString + htmlString(str).replace("\n", "<br/>") + VariableScope.nullOrMissingString;
    }

    public void checkServerListScroll() {
        Element activeElementById = this.libRocket.getActiveElementById("serverScrollDiv");
        if (activeElementById == null) {
            logWarn("serverScrollDiv==null");
            return;
        }
        Boolean bool = (Boolean) this.libRocket.m5477b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        if (!bool.booleanValue() && activeElementById.getScrollTop() > 200.0f) {
            this.libRocket.getActiveDocument().setMetadata("showFullServerList", true);
            this.scriptEngine.addScriptToQueue("displayServerList()");
        }
    }

    public void refreshServerList() {
        refreshServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void displayServerList() {
        displayServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void refreshServerListRaw(final String str, final String str2, final String str3) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refreshing");
        }
        Runnable runnable = new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.6
            @Override // java.lang.Runnable
            public void run() {
                Root.this.scriptEngine.addScriptToQueue("displayServerListRaw(" + Root.this.restrictedString(str) + "," + Root.this.restrictedString(str2) + "," + Root.this.restrictedString(str3) + ")");
            }
        };
        gameEngine.netEngine.f5810bh = null;
        GameNetAPIOperate.m1399a(runnable);
    }

    public void displayServerListRaw(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        GameEngine gameEngine = GameEngine.getGameEngine();
        Element activeElementById = this.libRocket.getActiveElementById(str);
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById == null) {
            GameEngine.print("serverListData is null, we may have changed page");
            return;
        }
        ArrayList m5352m = ActivityC0129p.m5352m();
        this.lastSortedDiscoveredServers = m5352m;
        String m1847a = C0855a.m1847a("menus.lobby.gameState.battleroom", new Object[0]);
        String m1847a2 = C0855a.m1847a("menus.lobby.gameState.ingame", new Object[0]);
        String m1847a3 = C0855a.m1847a("menus.lobby.gameState.chat", new Object[0]);
        if (activeElementById.getNumChildren() > m5352m.size()) {
            for (int numChildren = activeElementById.getNumChildren() - 1; numChildren >= m5352m.size(); numChildren--) {
                GameEngine.m5925e("removing rowIndex:" + numChildren);
                activeElementById.removeChild(activeElementById.getChild(numChildren));
            }
            if (activeElementById.getNumChildren() != m5352m.size()) {
                GameEngine.print("-- Non matching size after clean up:" + activeElementById.getNumChildren() + " vs " + m5352m.size());
            }
        }
        Boolean bool = (Boolean) this.libRocket.m5477b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        int i = 0;
        if (!bool.booleanValue() && m5352m.size() > 50) {
            ArrayList arrayList = new ArrayList();
            Iterator it = m5352m.iterator();
            while (it.hasNext()) {
                arrayList.add((ListRoomInfo) it.next());
                if (arrayList.size() > 50) {
                    break;
                }
            }
            i = m5352m.size() - arrayList.size();
            m5352m = arrayList;
        }
        int i2 = 0;
        Iterator it2 = m5352m.iterator();
        while (it2.hasNext()) {
            ListRoomInfo listRoomInfo = (ListRoomInfo) it2.next();
            Element element = null;
            if (i2 < activeElementById.getNumChildren()) {
                element = activeElementById.getChild(i2);
            }
            if (element != null && element.hasClassName("serverRowMessage")) {
                GameEngine.m5925e("removing non rowIndex:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element != null && element.findByClassName("rState") == null) {
                GameEngine.m5925e("removing non rowIndex with no rState:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element == null) {
                element = activeElementById2.m5479clone();
                activeElementById.appendChild(element);
                element.removeReference();
                element.setAttribute("onclick", "clickedServerRow(" + i2 + ")");
            }
            String str7 = listRoomInfo.f6055s;
            if (str7 != null) {
                str7 = str7.replace("battleroom", m1847a).replace("ingame", m1847a2).replace("chat", m1847a3);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            if (listRoomInfo != null && listRoomInfo.f6058x) {
                z = true;
                if ("chat".equalsIgnoreCase(listRoomInfo.f6055s)) {
                    z2 = true;
                }
                if (listRoomInfo.m1447d()) {
                    z4 = true;
                }
            }
            int m5707a = Color.m5707a(255, 255, 255, 255);
            String str8 = "serverRow serverRowData realServerRow ";
            if (listRoomInfo != null) {
                if (z) {
                    str8 = str8 + "dedicatedServerRow ";
                    if (z2 || z4) {
                        m5707a = Color.m5707a(255, 152, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_DIGITAL, 249);
                        str8 = str8 + "chatRow ";
                    }
                } else {
                    if (listRoomInfo.f6045h) {
                        m5707a = Color.m5707a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
                        str8 = str8 + "openRow ";
                    }
                    if (listRoomInfo.f6038a) {
                        m5707a = Color.m5707a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL, 149, 35);
                        str8 = str8 + "lanRow ";
                    }
                }
                if (listRoomInfo.m1450a()) {
                    str8 = str8 + "lastConnectedRow ";
                }
                if (!z2 && !z4 && !(VariableScope.nullOrMissingString + gameEngine.m1120c(true)).equals(listRoomInfo.f6046j)) {
                    z3 = true;
                }
            }
            String str9 = VariableScope.nullOrMissingString + "color:" + C0773f.m2249h(m5707a) + ";";
            if (0 != 0) {
                String str10 = str9 + "font-weight: bold;";
                str8 = str8 + "boldRow ";
            }
            element.compareAndSetClassNames(str8);
            element.findByClassName("rState").compareAndSetText(str7);
            element.findByClassName("rHost").compareAndSetText(C0773f.m2318a(listRoomInfo.f6050n, 15));
            if (listRoomInfo.f6056t == "?") {
                str4 = "?";
            } else {
                str4 = listRoomInfo.f6056t + "\\" + listRoomInfo.f6057u;
            }
            element.findByClassName("rPlayers").compareAndSetText(C0773f.m2318a(str4, 15));
            String m2318a = C0773f.m2318a(ActivityC0117i.m5381e(listRoomInfo.f6053q), 40);
            if (m2318a == null) {
                m2318a = VariableScope.nullOrMissingString;
            }
            element.findByClassName("rMap").compareAndSetText(m2318a);
            if ("ANY".equalsIgnoreCase(listRoomInfo.f6047k)) {
                str5 = listRoomInfo.f6047k;
            } else {
                str5 = "v" + C0773f.m2318a(listRoomInfo.f6047k, 8);
            }
            Element findByClassName = element.findByClassName("rVersion");
            findByClassName.compareAndSetText(str5);
            String str11 = "cell rVersion ";
            if (z3) {
                String str12 = "color:" + C0773f.m2249h(Color.m5707a(255, 155, 147, 147)) + ";";
                str11 = str11 + "nonMatchingRow ";
            } else {
                String str13 = "color:" + C0773f.m2249h(m5707a) + ";";
            }
            findByClassName.compareAndSetClassNames(str11);
            if (listRoomInfo.f6045h) {
                if (listRoomInfo.f6049m) {
                    str6 = "P";
                } else {
                    str6 = "Y";
                }
            } else {
                str6 = "N";
            }
            if (listRoomInfo.f6038a) {
                str6 = "L";
            }
            Element findByClassName2 = element.findByClassName("rOpen");
            findByClassName2.compareAndSetText(str6);
            String str14 = "cell rOpen ";
            if (!listRoomInfo.f6045h && !listRoomInfo.f6038a) {
                String str15 = "color:" + C0773f.m2249h(Color.m5707a(255, 155, 147, 147)) + ";";
                str14 = str14 + "notOpenRow ";
            } else {
                String str16 = "color:" + C0773f.m2249h(m5707a) + ";";
            }
            findByClassName2.compareAndSetClassNames(str14);
            i2++;
        }
        if (m5352m.size() == 0 && gameEngine.netEngine.f5810bh != null) {
            String str17 = "ERROR: " + gameEngine.netEngine.f5810bh;
            Element m5479clone = activeElementById2.m5479clone();
            activeElementById.appendChild(m5479clone);
            m5479clone.removeReference();
            m5479clone.setText(str17);
        }
        Element activeElementById3 = this.libRocket.getActiveElementById("padding");
        if (activeElementById3 == null && i > 0) {
            activeElementById3 = activeElementById2.m5479clone();
            activeElementById.appendChild(activeElementById3);
            activeElementById3.removeReference();
            activeElementById3.setAttribute("id", "padding");
            activeElementById3.addClass("serverRowMessage");
        }
        if (activeElementById3 != null && i > 0) {
            activeElementById3.setStyle("height:" + (18 * i) + "px;");
        }
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refresh");
        }
        GameEngine.print("DONE");
    }

    public void clickedServerRow(int i) {
        clickedServer(((ListRoomInfo) this.lastSortedDiscoveredServers.get(i)).f6039b);
    }

    public void clickedServer(String str) {
        String str2;
        if (getAlertOrPopup() != null) {
            logWarn("clickedServer: getAlertOrPopup!=null");
            return;
        }
        try {
            ListRoomInfo m1386b = GameNetAPIOperate.m1386b(str);
            if (m1386b == null) {
                logWarn("clickedServer: server==null");
                alert("That server no longer exists");
                return;
            }
            String m1449b = m1386b.m1449b();
            if (m1386b.m1447d()) {
                str2 = "[onenter]Open Link:closePopup(); openWhitelistedLink(" + restrictedString(m1386b.m1448c()) + ");";
            } else if (!m1386b.f6038a) {
                str2 = "[onenter]Join:closePopup(); joinServerWithId(" + restrictedString(m1386b.m1446e()) + "," + restrictedString(m1386b.f6039b) + ");";
            } else {
                str2 = "[onenter]Join over LAN:closePopup(); joinServerWithId(" + restrictedString(m1386b.m1445f()) + "," + restrictedString(m1386b.f6039b) + ");";
            }
            showPopup(null, m1449b, true, str2, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideKeyboard() {
        this.guiEngine.m5493m();
    }

    public void saveGame(String str) {
        closePopup();
        hideKeyboard();
        GameEngine.getGameEngine().f6338ca.m440b(str.replace(".", "_").replace("/", "_").replace("\\", "_"), false);
    }

    public void exportMap(String str) {
        closePopup();
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            gameEngine.f6323bL.m5087b(gameEngine.f6378dl, "/SD/rusted_warfare_maps/" + str.replace(".", "_").replace("/", "_").replace("\\", "_").replace("|", "_").replace("?", "_") + ".tmx");
            showAlert("Map exported");
        } catch (C0179f e) {
            showAlert("Failed to export map. error: " + e.getMessage());
        } catch (IOException e2) {
            showAlert("Failed to export map. IO error: " + e2.getMessage());
        }
    }

    public void loadGame(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.netEngine.closeServer("loading new save");
        gameEngine.f6313bv = false;
        if (gameEngine.f6338ca.m438c(str, false)) {
            resumeNonMenu();
        }
    }

    public void loadGameEdit(final String str) {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        C0051e c0051e = null;
        if (C0955a.m1076b()) {
            c0051e = new C0051e("Share", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.7
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    C0955a.m1077a(gameEngine.f6338ca.m444a(str, false));
                }
            });
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.8
            @Override // java.lang.Runnable
            public void run() {
                gameEngine.f6338ca.m441b(str);
                Root.this.closePopup();
                Root.this.showMaps();
            }
        }));
    }

    public void loadReplay(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.f6313bv = false;
        if (gameEngine.f6339cb.m2623c(str)) {
            resumeNonMenu();
        }
    }

    public void loadReplayEdit(final String str) {
        final GameEngine gameEngine = GameEngine.getGameEngine();
        C0051e c0051e = null;
        if (C0955a.m1076b()) {
            c0051e = new C0051e("Share", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.9
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    C0955a.m1077a(gameEngine.f6339cb.m2629a(str, false));
                }
            });
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.10
            @Override // java.lang.Runnable
            public void run() {
                gameEngine.f6339cb.m2619e(str);
                Root.this.closePopup();
                Root.this.showMaps();
            }
        }));
    }

    public void makeSaveGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null) {
            str2 = (gameEngine.m1152al() + " (" + C0773f.m2320a("d MMM yyyy HH-mm-ss") + ")").replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Save Game", "Enter a name to save the game under", str2, "[onenter]Save:saveGame(getPopupText())", null);
    }

    public void makeExportMapGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null) {
            str2 = ("New " + gameEngine.m1152al() + " - " + C0773f.m2320a("d MMM yyyy")).replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Export Map", "Enter a name to export the map as", str2, "[onenter]Export:exportMap(getPopupText())", null);
    }

    public void makeSendMessagePopup() {
        GameEngine.getGameEngine();
        showInputPopup("Send Message", VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, "[onenter]Send: sendChatMessage(getPopupText()); closePopup();", "Switch - Team only: makeSendTeamMessagePopupWithDefaultText(getPopupText()); ");
    }

    public void makeSendTeamMessagePopup() {
        makeSendTeamMessagePopupWithDefaultText(VariableScope.nullOrMissingString);
    }

    public void makeSendTeamMessagePopupWithDefaultText(String str) {
        GameEngine.getGameEngine();
        showInputPopup("Send Team Message", VariableScope.nullOrMissingString, str, "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", "+ Ping Map:sendTeamChatMessageAndPing(getPopupText()); closePopup();");
    }

    public void sendChatMessage(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.guiEngine.m5493m();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.netEngine.m1571m(str);
        gameEngine.f6330bS.f5372u = false;
    }

    public void sendTeamChatMessageAndPing(String str) {
        sendTeamChatMessage(str);
        GameEngine.getGameEngine().f6330bS.m2038I();
    }

    public void sendTeamChatMessage(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.guiEngine.m5493m();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.netEngine.m1573l(str);
    }

    public void receiveChatMessage(int i, String str, String str2, PlayerConnect playerConnect) {
        refreshChat();
    }

    public void refreshChat() {
        Element activeElementById;
        Element activeElementById2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.libRocket.getActiveDocument() == null || (activeElementById = this.libRocket.getActiveElementById("chatLogHistory")) == null) {
            return;
        }
        boolean attributeBoolean = activeElementById.getAttributeBoolean("reversed", false);
        if (gameEngine.netEngine.f5783F && (activeElementById2 = this.libRocket.getActiveElementById("chatBox")) != null) {
            activeElementById2.hide();
        }
        activeElementById.setInnerRML(VariableScope.nullOrMissingString);
        ConcurrentLinkedQueue m1767b = gameEngine.netEngine.f5802aC.m1767b();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = m1767b.iterator();
        while (it.hasNext()) {
            C0902b c0902b = (C0902b) it.next();
            if (attributeBoolean) {
                stringBuffer.insert(0, "<div>" + c0902b.m1482b() + "</div>");
            } else {
                stringBuffer.append("<div>" + c0902b.m1482b() + "</div>");
            }
        }
        stringBuffer.append("<div id='chatLastRowSpacer'></div>");
        activeElementById.setInnerRML(stringBuffer.toString());
        activeElementById.loadCharsetIfNeededWithCurrentText();
        Element activeElementById3 = this.libRocket.getActiveElementById("chatLastRowSpacer");
        if (activeElementById3 != null) {
            activeElementById3.scrollIntoView(false);
        }
    }

    public void trace(String str) {
        GameEngine.m5925e("Trace:" + str);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableData.class */
    public class TableData {
        public ArrayList rows = new ArrayList();

        public boolean same(TableData tableData, boolean z) {
            if (this.rows.size() != tableData.rows.size()) {
                return false;
            }
            for (int i = 0; i < this.rows.size(); i++) {
                if (!((TableRow) this.rows.get(i)).same((TableRow) tableData.rows.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableRow.class */
    public class TableRow {
        public ArrayList tableCells = new ArrayList();
        public Runnable androidOnclick;
        public String librocketOnClick;
        public String extraClasses;

        public void addClass(String str) {
            if (this.extraClasses == null) {
                this.extraClasses = str;
            } else {
                this.extraClasses += " " + str;
            }
        }

        public TableCell addCell(String str) {
            TableCell tableCell = new TableCell(str);
            this.tableCells.add(tableCell);
            return tableCell;
        }

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public void setAndroidOnClick(Runnable runnable) {
            this.androidOnclick = runnable;
        }

        public boolean same(TableRow tableRow, boolean z) {
            if (!C0773f.m2268d(this.librocketOnClick, tableRow.librocketOnClick) || !C0773f.m2268d(this.extraClasses, tableRow.extraClasses) || this.tableCells.size() != tableRow.tableCells.size()) {
                return false;
            }
            for (int i = 0; i < this.tableCells.size(); i++) {
                if (!((TableCell) this.tableCells.get(i)).same((TableCell) tableRow.tableCells.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableCell.class */
    public class TableCell {
        public String text;
        public String classes;
        public String librocketOnClick;
        public Integer color;

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public TableCell(String str) {
            this.text = str;
        }

        public void addClass(String str) {
            if (this.classes != null) {
                this.classes += " " + str;
            } else {
                this.classes = str;
            }
        }

        public boolean same(TableCell tableCell, boolean z) {
            if (!C0773f.m2268d(this.classes, tableCell.classes) || !C0773f.m2268d(this.librocketOnClick, tableCell.librocketOnClick) || !C0773f.m2321a(this.color, tableCell.color)) {
                return false;
            }
            if (!z && !C0773f.m2268d(this.text, tableCell.text)) {
                return false;
            }
            return true;
        }
    }

    public void updateTableTextOnly(String str, TableData tableData, TableData tableData2) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.print("updateTableText: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableListData");
        for (int i = 0; i < arrayList.size(); i++) {
            TableRow tableRow = (TableRow) arrayList.get(i);
            for (int i2 = 0; i2 < tableRow.tableCells.size(); i2++) {
                TableCell tableCell = (TableCell) tableRow.tableCells.get(i2);
                Element child = elementById.getChild(i);
                if (child == null) {
                    GameEngine.print("updateTableText failed to get row " + i);
                    return;
                }
                Element child2 = child.getChild(i2);
                if (child2 == null) {
                    GameEngine.print("updateTableText failed to get cell " + i2);
                    return;
                }
                child2.compareAndSetText(tableCell.text);
            }
        }
    }

    public void refreshTable(String str, TableData tableData) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.print("refreshTable: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableRowTemplateHolder");
        Element elementById2 = activeElementById.getElementById("tableListData");
        Element child = elementById.findByClassName("rowTemplate").getChild(0);
        Element child2 = elementById.findByClassName("cellTemplate").getChild(0);
        elementById2.setInnerRML(VariableScope.nullOrMissingString);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TableRow tableRow = (TableRow) it.next();
            Element cloneAndFix = child.cloneAndFix();
            if (tableRow.librocketOnClick != null) {
                cloneAndFix.setAttribute("onclick", tableRow.librocketOnClick);
            }
            if (tableRow.extraClasses != null) {
                cloneAndFix.addClass(tableRow.extraClasses);
            }
            Iterator it2 = tableRow.tableCells.iterator();
            while (it2.hasNext()) {
                TableCell tableCell = (TableCell) it2.next();
                Element cloneAndFix2 = child2.cloneAndFix();
                cloneAndFix2.compareAndSetText(tableCell.text);
                if (tableCell.librocketOnClick != null) {
                    cloneAndFix2.setAttribute("onclick", tableCell.librocketOnClick);
                    cloneAndFix2.addClass("clickablecell");
                }
                if (tableCell.classes != null) {
                    cloneAndFix2.addClass(tableCell.classes);
                }
                if (tableCell.color != null) {
                    cloneAndFix2.setAttribute("style", "color:" + C0773f.m2249h(tableCell.color.intValue()) + ";");
                }
                cloneAndFix.appendChild(cloneAndFix2);
                cloneAndFix2.removeReference();
            }
            elementById2.appendChild(cloneAndFix);
            cloneAndFix.removeReference();
        }
    }

    public ElementDocument createAndShowPopup(String str, Object obj, String str2) {
        return this.libRocket.m5485a(str, obj, str2, true);
    }

    public ElementDocument createPopupHidden(String str, Object obj, String str2) {
        return this.libRocket.m5485a(str, obj, str2, false);
    }

    public boolean tryToShowPopupDocument(ElementDocument elementDocument) {
        return this.libRocket.m5479b(elementDocument);
    }

    public void showMainMenu() {
        GameEngine.getGameEngine().f6330bS.f5372u = false;
        AbstractC0043a.m5510a().m5504b();
    }

    public void onEnter() {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g == null) {
            GameEngine.m5925e("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m5468g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String attribute = element.getAttribute("onenter");
            if (attribute != null && element.isFocused()) {
                this.scriptEngine.processScript(attribute);
            }
        }
    }

    public void scrollFromFocusedElement(float f) {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g == null) {
            GameEngine.m5925e("onEnter: elementDocument==null");
            return;
        }
        Element topLevelFocusedElement = m5468g.getTopLevelFocusedElement();
        if (topLevelFocusedElement == null) {
            GameEngine.m5925e("focusedElement: Not found");
            return;
        }
        ArrayList chainFromChildElement = m5468g.getChainFromChildElement(topLevelFocusedElement);
        if (chainFromChildElement == null) {
            GameEngine.m5925e("scrollFromFocusedElement: Failed to find chain");
            return;
        }
        Iterator it = chainFromChildElement.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            if ("scrollDiv".equals(element.getId())) {
                z = true;
            }
            if (element.hasClassName("slider")) {
                z = true;
            }
            if (z) {
                element.setScrollTop(element.getScrollTop() + f);
                return;
            }
        }
        GameEngine.m5925e("Found no slider element to offset");
    }

    public boolean isSliderOrUIElementSelected() {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g == null) {
            GameEngine.m5925e("onEnter: elementDocument==null");
            return false;
        }
        Element topLevelFocusedElement = m5468g.getTopLevelFocusedElement();
        if (topLevelFocusedElement != null) {
            String tagName = topLevelFocusedElement.getTagName();
            boolean z = false;
            if ("scrollDiv".equals(topLevelFocusedElement.getId())) {
                z = true;
            }
            if (topLevelFocusedElement.hasClassName("slider")) {
                z = true;
            }
            if ("input".equals(tagName) && "range".equals(topLevelFocusedElement.getAttribute("type", "text"))) {
                z = true;
            }
            if (z) {
                GameEngine.m5925e("Slider element: true");
                return true;
            }
            GameEngine.m5925e("Slider element: false");
        }
        GameEngine.m5925e("Slider element: no element focused");
        return false;
    }

    public void onTouch() {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g == null) {
            GameEngine.m5925e("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m5468g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if ("text".equals(element.getAttribute("type")) && element.isFocused()) {
                this.guiEngine.m5494l();
            }
        }
    }

    public void onEscape() {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g == null) {
            GameEngine.m5925e("onEscape: elementDocument==null");
            return;
        }
        boolean z = false;
        Iterator it = m5468g.getAllNestedChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Element element = (Element) it.next();
            if (element.getAttribute("click_on_escape") != null) {
                element.click();
                z = true;
                break;
            }
        }
        if (!z && closePopup()) {
        }
    }

    public void askQuitGame() {
        closePopup();
        showPopup("Are you sure you want to quit?", VariableScope.nullOrMissingString, true, "[onenter]Quit:closePopup(); exit();", null);
    }

    public String getCurrentDocumentPath() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            return null;
        }
        return activeDocument.documentPath;
    }

    public String getCurrentPopupPath() {
        ElementDocument m5475c = this.libRocket.m5475c();
        if (m5475c == null) {
            return null;
        }
        return m5475c.documentPath;
    }

    public String getCreditsText() {
        return "Credits goes here";
    }

    public void runRunnable(Runnable runnable) {
        logDebug("runRunnable");
        if (runnable == null) {
            logDebug("runnable==null");
        }
        runnable.run();
    }

    public boolean isLinux() {
        return C0846g.m1870a() == SystemType.f5609c;
    }

    public boolean not(boolean z) {
        return !z;
    }

    public boolean and(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: or */
    public boolean m5462or(boolean z, boolean z2) {
        return z || z2;
    }

    public void showBattleroom() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = true;
        if (activeDocument != null && "battleroom.rml".equals(activeDocument.documentPath)) {
            GameEngine.m5925e("Already on battleroom page");
            z = false;
        }
        this.libRocket.setDocument("battleroom.rml", null, z);
    }

    public void setDocument(String str) {
        this.libRocket.setDocument(str);
    }

    public void playNextMusicTrack() {
        GameEngine.getGameEngine().f6325bN.m2888e();
    }

    public void toggleMusic() {
        GameEngine.getGameEngine().f6325bN.f4207u = !GameEngine.getGameEngine().f6325bN.f4207u;
    }

    public void updateMusicButton(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById != null) {
            if (GameEngine.getGameEngine().f6325bN.f4207u) {
                activeElementById.setText(">");
            } else {
                activeElementById.setText("||");
            }
        }
    }

    public void setSandboxMapFromPopup(String str) {
        GameEngine.getGameEngine();
        closePopup();
        this.libRocket.getActiveDocument().setMetadata("mode", str);
        showLevelOptions();
        this.libRocket.getActiveDocument().findByClassName("mapImage").setAttribute("src", getMapThumbnail(str));
        this.libRocket.getActiveDocument().findByClassName("mapText").setText(getMapNameFromPath(str));
    }

    public void showSandboxMapSelectOnChange() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        int parseInt = Integer.parseInt(activeDocument.getElementById("typeSelector").getValue());
        int intValue = ((Integer) activeDocument.getMetadata("lastTypeSelector", 0)).intValue();
        this.libRocket.getActiveDocument().setMetadata("lastTypeSelector", Integer.valueOf(parseInt));
        if (parseInt != intValue) {
            showSandboxMapSelect();
        }
    }

    public void showSandboxMapSelect() {
        showMapPopup(getModeMapPath(this.libRocket.getActiveDocument(), "typeSelector"), "setSandboxMapFromPopup");
    }

    public String getModeMapPath(Element element, String str) {
        int intValue;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (str == null) {
            if (gameEngine.netEngine.gameMapData.f5852a == null) {
                GameEngine.print("getModeMapPath: currentType==0");
                intValue = 0;
            } else {
                intValue = gameEngine.netEngine.gameMapData.f5852a.ordinal();
            }
        } else {
            Element elementById = element.getElementById(str);
            if (elementById == null) {
                GameEngine.m1104g("getModeMapPath: typeSelector==null");
                intValue = 0;
            } else {
                intValue = elementById.getValueAsInt(0).intValue();
            }
        }
        if (intValue == 0) {
            return "maps/skirmish";
        }
        if (intValue == 1) {
            return "/SD/rusted_warfare_maps";
        }
        if (intValue == 2) {
            return "saves";
        }
        throw new RuntimeException("Unknown typeIndex:" + intValue);
    }

    public void event_unicodeEntered() {
        ElementDocument m5468g = this.libRocket.m5468g();
        if (m5468g != null) {
            Element findByClassName = m5468g.findByClassName("textinputUnicodeWrap");
            if (findByClassName != null) {
                findByClassName.compareAndAddClass("unicodeWasTyped");
                return;
            } else {
                GameEngine.m5925e("event_unicodeEntered: missing textinput");
                return;
            }
        }
        GameEngine.m5925e("event_unicodeEntered: missing document");
    }

    public boolean isVersionBeta() {
        return GameEngine.getGameEngine().m1091n();
    }

    public Object ifCondition(boolean z, Object obj, Object obj2) {
        return z ? obj : obj2;
    }

    /* renamed from: i */
    public String m5463i(String str) {
        return C0855a.m1847a(str, new Object[0]);
    }

    public void openLinkToCG(String str) {
        openWhitelistedLink("http://corrodinggames.com/" + str);
    }

    public void openWhitelistedLink(String str) {
        GameEngine.m5925e("Opening link:" + str);
        if (!str.startsWith("http://corrodinggames.com/") && !str.startsWith("https://corrodinggames.com/") && !str.startsWith("http://corrodinggames.net/") && !str.startsWith("https://corrodinggames.net/")) {
            GameEngine.m5925e("Not in whitelist");
        } else if (this.guiEngine.m5503b(str)) {
            alert("Opened link: " + str);
        } else {
            alert("Sorry couldn't load browser to: " + str + " please navigate manually");
        }
    }

    public void writeGameLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m5495k = AbstractC0043a.m5510a().m5495k();
        if (m5495k == null) {
            z = true;
        } else {
            synchronized (m5495k) {
                ListIterator listIterator = m5495k.listIterator(C0773f.m2301b(0, m5495k.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("<br/>");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        GameEngine.m5925e("writeGameLog ready");
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.m5925e("Failed to find: " + str);
        } else {
            activeElementById.setInnerRML(stringBuffer.toString());
        }
    }

    public void exportGameLog() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m5495k = AbstractC0043a.m5510a().m5495k();
        if (m5495k == null) {
            z = true;
        } else {
            synchronized (m5495k) {
                ListIterator listIterator = m5495k.listIterator(C0773f.m2301b(0, m5495k.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("\n");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        try {
            File file = new File(C0765a.m2417e("/SD/rustedWarfare/RustedWarfareLog-" + C0773f.m2320a("d_MMM_yyyy_HH.mm.ss") + ".txt"));
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append((CharSequence) stringBuffer.toString());
            fileWriter.flush();
            fileWriter.close();
            C0955a.m1077a(file);
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            alert("Failed to export logs: " + e.getMessage());
        }
    }

    public void setPageMinWidthAndHeight(float f, float f2) {
        GameEngine.m5925e("setPageMinWidthAndHeight(" + f + ", " + f2 + ")");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.m5925e("setPageMinWidthAndHeight - no page");
            return;
        }
        activeDocument.setMetadataFloat("minWidth", Float.valueOf(f));
        activeDocument.setMetadataFloat("minHeight", Float.valueOf(f2));
        this.guiEngine.m5492n();
    }

    public void importFilePopup() {
        C0955a.m1078a(new AbstractC0956b() { // from class: com.corrodinggames.librocket.scripts.Root.11
            @Override // com.corrodinggames.rts.gameFramework.p044l.AbstractC0956b
            public void onFileSelected() {
                GameEngine.m5925e("importFilePopup: onFileSelected");
            }

            @Override // com.corrodinggames.rts.gameFramework.p044l.AbstractC0956b
            public void onCancelled() {
                GameEngine.m5925e("importFilePopup: onCancelled");
            }
        });
    }

    protected void setDocumentUpdate(ElementDocument elementDocument, Runnable runnable) {
        elementDocument.setMetadata("onUpdateFunction", runnable);
    }

    public void onFrameUpdate(float f) {
        Object metadata;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && (metadata = activeDocument.getMetadata("onUpdateFunction")) != null) {
            ((Runnable) metadata).run();
        }
    }
}