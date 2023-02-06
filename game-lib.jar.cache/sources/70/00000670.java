package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.mod.b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/g.class */
public class g {
    SteamEngine b;
    SteamUGC d;
    b e;
    boolean f;
    b g;
    int k;
    boolean a = false;
    ArrayList h = new ArrayList();
    HashMap i = new HashMap();
    ArrayList j = new ArrayList();
    SteamUGCCallback c = new j(this);

    private void e() {
        if (this.j.size() == 0) {
            return;
        }
        SteamUGCQuery createQueryUGCDetailsRequest = this.d.createQueryUGCDetailsRequest(this.j);
        this.j.clear();
        this.d.sendQueryUGCRequest(createQueryUGCDetailsRequest);
        this.d.releaseQueryUserUGCRequest(createQueryUGCDetailsRequest);
        SteamAPI.runCallbacks();
    }

    private void e(SteamPublishedFileID steamPublishedFileID) {
        GameEngine.m5e("Adding request for workshop details: " + steamPublishedFileID);
        this.j.add(steamPublishedFileID);
    }

    public SteamPublicData_2 a(SteamPublishedFileID steamPublishedFileID) {
        SteamPublicData_2 steamPublicData_2 = (SteamPublicData_2) this.i.get(steamPublishedFileID);
        if (steamPublicData_2 == null) {
            GameEngine.m5e("New ItemInfo: " + steamPublishedFileID);
            steamPublicData_2 = new SteamPublicData_2();
            steamPublicData_2.a = steamPublishedFileID;
            this.i.put(steamPublishedFileID, steamPublicData_2);
        }
        return steamPublicData_2;
    }

    public String b(SteamPublishedFileID steamPublishedFileID) {
        SteamPublicData_2 a = a(steamPublishedFileID);
        if (a.b == 0 && !a.c) {
            a.b = System.currentTimeMillis();
            e(steamPublishedFileID);
        }
        if (a.c) {
            GameEngine.m5e("Got data for: " + steamPublishedFileID + " - " + a.d);
            return a.d;
        }
        GameEngine.m5e("No data for: " + steamPublishedFileID);
        return null;
    }

    public SteamPublicData_1 c(SteamPublishedFileID steamPublishedFileID) {
        Iterator it = this.h.iterator();
        while (it.hasNext()) {
            SteamPublicData_1 steamPublicData_1 = (SteamPublicData_1) it.next();
            if (steamPublicData_1.a.equals(steamPublishedFileID)) {
                return steamPublicData_1;
            }
        }
        return null;
    }

    public g(SteamEngine steamEngine) {
        this.b = steamEngine;
    }

    public void a(SteamUGC steamUGC) {
        this.d = steamUGC;
    }

    public SteamUGCCallback a() {
        return this.c;
    }

    public void a(b bVar, String str, boolean z) {
        GameEngine.m5e("workshop: " + str);
        if (z) {
            GameEngine.getGameEngine().i(str);
        }
    }

    public boolean a(b bVar) {
        if (bVar.s == null) {
            a(bVar, "A title is required in the file 'mod-info.txt'", true);
            return false;
        } else if (!bVar.r) {
            a(bVar, "Please add and setup the file 'mod-info.txt' to this mod before uploading", true);
            return false;
        } else {
            String p = bVar.p();
            if (p != null && !a.i(p)) {
                a(bVar, "Could not find thumbnail file: " + p + " referenced mod-info.txt", true);
                return false;
            }
            return true;
        }
    }

    public void b(b bVar) {
        if (this.e != null) {
            a(bVar, "A mod is already pending publishing", false);
        } else if (bVar.k != 0) {
            a(bVar, "This mod has already been published", false);
        } else if (!a(bVar)) {
        } else {
            if (!bVar.a(0L)) {
                a(bVar, "Failed to write metadata to mod, check file permissions", true);
                return;
            }
            this.e = bVar;
            this.d.createItem(this.b.j.getAppID(), SteamRemoteStorage.WorkshopFileType.Community);
        }
    }

    public void a(b bVar, boolean z, String str) {
        if (!a(bVar)) {
            return;
        }
        SteamUGCUpdateHandle startItemUpdate = this.d.startItemUpdate(this.b.j.getAppID(), new SteamPublishedFileID(bVar.k));
        if (z) {
            if (bVar.s != null) {
                this.d.setItemTitle(startItemUpdate, bVar.s);
            }
            if (bVar.u != null) {
                this.d.setItemDescription(startItemUpdate, bVar.u);
            }
        }
        if (z) {
            this.d.setItemVisibility(startItemUpdate, SteamRemoteStorage.PublishedFileVisibility.Public);
        }
        String p = bVar.p();
        if (p != null) {
            this.d.setItemPreview(startItemUpdate, p);
        }
        String c = bVar.c("tags");
        if (c != null) {
            String[] split = c.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
                GameEngine.m5e("Adding tag:" + split[i]);
            }
            this.d.setItemTags(startItemUpdate, split);
        }
        String i2 = bVar.i();
        GameEngine.m5e("convertedAbsolutePath:" + i2);
        this.d.setItemContent(startItemUpdate, i2);
        bVar.S = "Uploading to workshop";
        this.f = z;
        this.g = bVar;
        this.d.submitItemUpdate(startItemUpdate, str);
        GameEngine.m5e("submitted item update for:" + bVar.k);
    }

    public void b() {
        this.b.c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + this.b.j.getAppID());
    }

    public void c(b bVar) {
        this.b.c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + bVar.k);
    }

    public long d(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    public void c() {
        if (this.a) {
            this.a = false;
            GameEngine.getGameEngine().bZ.m();
        }
        int numSubscribedItems = this.d.getNumSubscribedItems();
        if (numSubscribedItems != this.k) {
            GameEngine.m5e("Number of subscribed items changed from: " + this.k + " to: " + numSubscribedItems);
            this.k = numSubscribedItems;
            GameEngine.getGameEngine();
            d();
            this.a = true;
        }
    }

    public void d() {
        SteamUGC.ItemDownloadInfo itemDownloadInfo;
        String b;
        GameEngine gameEngine = GameEngine.getGameEngine();
        SteamAPI.runCallbacks();
        GameEngine.m5e("--------------");
        GameEngine.m5e("Steam: loadWorkshopMods");
        int numSubscribedItems = this.d.getNumSubscribedItems();
        this.k = numSubscribedItems;
        SteamPublishedFileID[] steamPublishedFileIDArr = new SteamPublishedFileID[numSubscribedItems];
        this.d.getSubscribedItems(steamPublishedFileIDArr);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArr) {
            Collection<SteamUGC.ItemState> itemState = this.d.getItemState(steamPublishedFileID);
            long d = d(steamPublishedFileID);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            String str = null;
            for (SteamUGC.ItemState itemState2 : itemState) {
                if (itemState2 != SteamUGC.ItemState.None) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString + itemState2;
                    } else {
                        str = str + ", " + itemState2;
                    }
                    if (itemState2 == SteamUGC.ItemState.Downloading) {
                        z2 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.DownloadPending) {
                        z2 = true;
                        z3 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Installed) {
                        z = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.NeedsUpdate) {
                        z4 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Subscribed) {
                        z5 = true;
                    }
                }
            }
            GameEngine.m5e("Found workshop item " + d + " with state: " + str + VariableScope.nullOrMissingString);
            String str2 = "sw" + d;
            String str3 = "(Workshop item - " + d + ")";
            if (!z && (b = b(steamPublishedFileID)) != null) {
                str3 = b;
            }
            String str4 = null;
            String str5 = null;
            if (!z5) {
                GameEngine.m5e("Skipping: " + d + " as it is not subscribed");
            } else {
                if (z) {
                    SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
                    this.d.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
                    str4 = itemInstallInfo.getFolder();
                    GameEngine.m5e(" Installed at: " + str4);
                } else {
                    GameEngine.m5e(" Not installed");
                    str5 = "Not installed.";
                    if (z4) {
                        str5 = "Update needed..";
                    }
                    if (z3) {
                        str5 = "Download pending in steam...";
                    } else if (z2) {
                        str5 = "Steam is downloading files..";
                        if (this.d.getItemDownloadInfo(steamPublishedFileID, new SteamUGC.ItemDownloadInfo())) {
                            str5 = str5 + " " + f.c((itemDownloadInfo.getBytesDownloaded() / itemDownloadInfo.getBytesTotal()) * 100.0d) + "%";
                        }
                    }
                }
                int i = 0;
                if (!z) {
                    i = -1;
                }
                b a = gameEngine.bZ.a(str2, str2, str4, str2, true, true, false, i);
                if (a.s == null) {
                    a.t = str3;
                }
                if (str5 == null && z4) {
                    if (z3) {
                        str5 = "An update is pending download in Steam.";
                    } else if (z3) {
                        str5 = "An update is downloading...";
                    } else {
                        str5 = "An update is available.";
                    }
                }
                a.T = str5;
                if ((!z || z4) && (!z2 || z3)) {
                    GameEngine.m5e("Queuing download on: " + steamPublishedFileID);
                    this.d.downloadItem(steamPublishedFileID, false);
                }
            }
        }
        e();
    }
}