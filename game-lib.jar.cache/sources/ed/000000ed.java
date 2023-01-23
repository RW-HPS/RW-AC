package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.game.units.custom.ag;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.mod.b;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods.class */
public class Mods extends ScriptContext {
    Root root;
    Runnable updateModsRunnable = new AnonymousClass1();
    int checkWorkshopSkip = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Mods(Root root) {
        this.root = root;
    }

    public SteamEngine getSteam() {
        SteamEngine steamEngine = SteamEngine.getSteamEngine();
        if (!steamEngine.e()) {
            steamEngine.h();
            return null;
        }
        return steamEngine;
    }

    public void openWorkshop() {
        GameEngine.getGameEngine();
        SteamEngine steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.m();
    }

    public void uploadModAsk(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (gameEngine.n()) {
            this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
        } else if (gameEngine.bZ.c(str) == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (getSteam() == null) {
        } else {
            this.root.showPopup("Are you sure you want to upload to the workshop?", VariableScope.nullOrMissingString, true, "[onenter]Upload:closePopup(); mods.uploadMod('" + str + "');", null);
        }
    }

    public void uploadMod(String str) {
        b c = GameEngine.getGameEngine().bZ.c(str);
        if (c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        SteamEngine steam = getSteam();
        if (steam == null) {
            return;
        }
        if (c.k == 0) {
            steam.b(c);
        } else {
            steam.a(c, false, "Changes.");
        }
    }

    public void viewMod(String str) {
        b c = GameEngine.getGameEngine().bZ.c(str);
        if (c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        SteamEngine steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.a(c);
    }

    public void deleteModPopup(String str) {
        b c = GameEngine.getGameEngine().bZ.c(str);
        if (c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        this.root.showPopup(VariableScope.nullOrMissingString, "Are you sure you want to permanently delete '" + c.b() + "'? (Note: You can instead disable the mod by unticking it)", true, "[onenter]Delete:closePopup(); mods.deleteMod('" + str + "');", null);
    }

    public void deleteMod(String str) {
        b c = GameEngine.getGameEngine().bZ.c(str);
        if (c == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (c.u()) {
            reloadModData();
        } else {
            this.root.showAlert("Error failed to delete mod");
        }
    }

    public void setModFilter(String str) {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.m4e("loadMods: No Active Document");
            return;
        }
        activeDocument.setMetadata("modFilter", str);
        applyModFilter();
    }

    public void applyModFilter() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.m4e("loadMods: No Active Document");
            return;
        }
        String str = (String) activeDocument.getMetadata("modFilter");
        Element elementById = activeDocument.getElementById("modList");
        if (elementById == null) {
            GameEngine.m4e("loadMods: Failed to find modList, wrong page?");
            return;
        }
        boolean checkbox = activeDocument.getElementById("onlyEnabledMods").getCheckbox();
        ArrayList findElementsByClassName = elementById.findElementsByClassName("modItem");
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            str = null;
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT).trim();
        }
        int i = 0;
        int i2 = 0;
        Iterator it = findElementsByClassName.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            int intValue = f.l(element.getAttribute("data_sessionid")).intValue();
            b a2 = gameEngine.bZ.a(intValue);
            if (a2 == null) {
                GameEngine.m4e("Could not find mod with mod session id: " + intValue);
            } else {
                if (str != null) {
                    boolean z2 = false;
                    if (a2.a() != null && a2.a().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (a2.e() != null && a2.e().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (!z2) {
                        z = true;
                    }
                }
                if (checkbox && a2.f) {
                    z = true;
                }
            }
            if (z) {
                i++;
                element.compareAndAddClass("modItemFilteredOut");
            } else {
                i2++;
                element.removeClass("modItemFilteredOut");
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (i > 0 && i2 == 0) {
            str2 = "< No mods found with active filter (" + i + " hidden) >";
        } else if (i > 0) {
            str2 = "< " + i + " mods hidden with active filter >";
        }
        activeDocument.getElementById("filterStatus").setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Mods$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods$1.class */
    public class AnonymousClass1 implements Runnable {
        AnonymousClass1() {
        }

        public void run() {
            Mods.this.updateMods();
        }
    }

    public void updateMods() {
        this.checkWorkshopSkip++;
        if (this.checkWorkshopSkip > 100) {
            this.checkWorkshopSkip = 0;
            SteamEngine steamEngine = SteamEngine.getSteamEngine();
            if (steamEngine != null) {
                steamEngine.k();
            }
        }
    }

    public void refreshModList() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.m4e("refreshModList: No Active Document");
            return;
        }
        GameEngine.m4e("refreshModList");
        if (activeDocument.getElementById("modTemplate") == null) {
            GameEngine.m4e("refreshModList: Failed to find modTemplate, wrong page?");
            return;
        }
        GameEngine.getGameEngine().bZ.d();
        _rememberTempModSelection();
        loadMods();
        _restoreTempModSelection();
    }

    public void loadMods() {
        ArrayList k = GameEngine.getGameEngine().bZ.k();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.m4e("loadMods: No Active Document");
            return;
        }
        GameEngine.m4e("loadMods");
        Element elementById = activeDocument.getElementById("modTemplate");
        Element elementById2 = activeDocument.getElementById("modList");
        if (elementById == null) {
            GameEngine.m4e("loadMods: Failed to find modTemplate, wrong page?");
        } else if (elementById2 == null) {
            GameEngine.m4e("loadMods: Failed to find modList, wrong page?");
        } else {
            this.root.setDocumentUpdate(activeDocument, this.updateModsRunnable);
            String innerRML = elementById.getInnerRML();
            String str = VariableScope.nullOrMissingString;
            int i = 0;
            Iterator it = k.iterator();
            while (it.hasNext()) {
                b bVar = (b) it.next();
                String a2 = bVar.a();
                String str2 = VariableScope.nullOrMissingString;
                String replace = innerRML.replace("_NAME_", this.root.htmlString(a2)).replace("_ID_", bVar.e);
                String str3 = bVar.R;
                if (str3 == null) {
                    str3 = VariableScope.nullOrMissingString;
                } else {
                    str2 = str2 + " modItemError";
                }
                if (bVar.v()) {
                    str2 = str2 + " modItemCanBeDeleted";
                }
                if (bVar.k == 0) {
                    if (!bVar.y && !bVar.z) {
                        str2 = str2 + " modItemCanBePublished";
                    }
                } else {
                    if (!bVar.y) {
                        str2 = str2 + " modItemIsOwner";
                    }
                    str2 = str2 + " modItemIsPublished";
                }
                if (bVar.A) {
                    str2 = str2 + " modItemHasMaps";
                }
                String l = bVar.l();
                if (l == null) {
                    l = VariableScope.nullOrMissingString;
                }
                i++;
                str = str + replace.replace("_ERROR_", this.root.htmlString(str3)).replace("_MESSAGE_", this.root.htmlStringWithNewlines(l)).replace("_DESCRIPTION_", this.root.htmlString(bVar.e())).replace("_CLASS_", str2).replace("_SESSIONID_", VariableScope.nullOrMissingString + bVar.d());
            }
            elementById2.setInnerRML(str);
            elementById2.loadCharsetIfNeeded(str);
            Iterator it2 = k.iterator();
            while (it2.hasNext()) {
                b bVar2 = (b) it2.next();
                Element elementById3 = activeDocument.getElementById(bVar2.e);
                if (elementById3 == null) {
                    GameEngine.print("Could not find:" + bVar2.c);
                } else {
                    elementById3.setCheckbox(!bVar2.f);
                }
            }
            applyModFilter();
        }
    }

    public void saveMods() {
        _saveModsCommon(true);
    }

    private void _rememberTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m4e("temp save");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                b c = gameEngine.bZ.c(id);
                if (c == null) {
                    GameEngine.a("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z = !element.getCheckbox();
                    if (c.g != z) {
                    }
                    c.g = z;
                    c.h = true;
                }
            }
        }
    }

    private void _restoreTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m4e("temp restore");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (id != null && !id.equals(VariableScope.nullOrMissingString) && !id.equals("_ID_")) {
                b c = gameEngine.bZ.c(id);
                if (c == null) {
                    GameEngine.a("Could not find mod:" + element.getInnerRML() + " id:" + id);
                } else if (c.h) {
                    if (c.g != (!element.getCheckbox())) {
                        element.setCheckbox(!c.g);
                    }
                }
            }
        }
    }

    private void _saveModsCommon(boolean z) {
        boolean z2 = false;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getGameEngine();
        GameEngine.m4e("savesMods");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                b c = gameEngine.bZ.c(id);
                if (c == null) {
                    this.root.showAlert("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z3 = !element.getCheckbox();
                    if (c.f != z3) {
                        z2 = true;
                    }
                    c.f = z3;
                    c.g = z3;
                }
            }
        }
        if (z2) {
            GameEngine.m4e("mod changes made");
        } else {
            GameEngine.m4e("no mod changes made");
        }
        gameEngine.bZ.e();
        gameEngine.settingsEngine.save();
        if (z) {
            _saveModsMessages(false);
        }
    }

    private void _saveModsMessages(boolean z) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        int a2 = gameEngine.bZ.a(false);
        int b = gameEngine.bZ.b();
        if (gameEngine.bX.B) {
            GameEngine.m4e("savesMods: in network game");
            this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
        } else if (ag.c(true)) {
            if (a2 == 0) {
                this.root.showAlert("Mod changes saved. Will be used in the next game.");
            } else if (z) {
                String str = "Note: " + a2 + " selected mods are still not loaded after reload";
                if (b > 0) {
                    str = "Warning: " + b + " selected mods had errors after reload";
                }
                this.root.showAlert(str);
            } else {
                String str2 = "Mod selection saved. But " + a2 + " mod(s) aren't loaded. Load them now?";
                if (!gameEngine.I()) {
                    str2 = str2 + " (This will end your current game).";
                }
                this.root.showPopup("Reload needed", str2, true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
            }
        } else {
            GameEngine.m4e("Errors found");
        }
    }

    public void disableAllAsk() {
        this.root.showPopup("Disable all mods?", VariableScope.nullOrMissingString, true, "[onenter]Disable All:closePopup(); mods.disableAll();", null);
    }

    public void disableAll() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        gameEngine.bZ.g();
        gameEngine.bZ.e();
        gameEngine.settingsEngine.save();
        gameEngine.bZ.l();
        loadMods();
    }

    public void reloadModDataAsk() {
        if (GameEngine.getGameEngine().I()) {
            GameEngine.m4e("Menu active, reloading without asking");
            reloadModData();
            return;
        }
        this.root.showPopup("Reload all mod data?", VariableScope.nullOrMissingString + "Warning! this will end your current game.", true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
    }

    public void reloadModData() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        _saveModsCommon(false);
        gameEngine.bZ.l();
        _saveModsMessages(true);
        loadMods();
    }
}