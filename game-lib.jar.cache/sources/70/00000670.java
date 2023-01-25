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
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0765a;
import com.corrodinggames.rts.gameFramework.mod.C0859b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/g.class */
public class C1198g {

    /* renamed from: b */
    SteamEngine f7332b;

    /* renamed from: d */
    SteamUGC f7334d;

    /* renamed from: e */
    C0859b f7335e;

    /* renamed from: f */
    boolean f7336f;

    /* renamed from: g */
    C0859b f7337g;

    /* renamed from: k */
    int f7341k;

    /* renamed from: a */
    boolean f7331a = false;

    /* renamed from: h */
    ArrayList f7338h = new ArrayList();

    /* renamed from: i */
    HashMap f7339i = new HashMap();

    /* renamed from: j */
    ArrayList f7340j = new ArrayList();

    /* renamed from: c */
    SteamUGCCallback f7333c = new C1201j(this);

    /* renamed from: e */
    private void m261e() {
        if (this.f7340j.size() == 0) {
            return;
        }
        SteamUGCQuery createQueryUGCDetailsRequest = this.f7334d.createQueryUGCDetailsRequest(this.f7340j);
        this.f7340j.clear();
        this.f7334d.sendQueryUGCRequest(createQueryUGCDetailsRequest);
        this.f7334d.releaseQueryUserUGCRequest(createQueryUGCDetailsRequest);
        SteamAPI.runCallbacks();
    }

    /* renamed from: e */
    private void m260e(SteamPublishedFileID steamPublishedFileID) {
        GameEngine.m5777e("Adding request for workshop details: " + steamPublishedFileID);
        this.f7340j.add(steamPublishedFileID);
    }

    /* renamed from: a */
    public SteamPublicData_2 m274a(SteamPublishedFileID steamPublishedFileID) {
        SteamPublicData_2 steamPublicData_2 = (SteamPublicData_2) this.f7339i.get(steamPublishedFileID);
        if (steamPublicData_2 == null) {
            GameEngine.m5777e("New ItemInfo: " + steamPublishedFileID);
            steamPublicData_2 = new SteamPublicData_2();
            steamPublicData_2.f7342a = steamPublishedFileID;
            this.f7339i.put(steamPublishedFileID, steamPublicData_2);
        }
        return steamPublicData_2;
    }

    /* renamed from: b */
    public String m268b(SteamPublishedFileID steamPublishedFileID) {
        SteamPublicData_2 m274a = m274a(steamPublishedFileID);
        if (m274a.f7343b == 0 && !m274a.f7344c) {
            m274a.f7343b = System.currentTimeMillis();
            m260e(steamPublishedFileID);
        }
        if (m274a.f7344c) {
            GameEngine.m5777e("Got data for: " + steamPublishedFileID + " - " + m274a.f7345d);
            return m274a.f7345d;
        }
        GameEngine.m5777e("No data for: " + steamPublishedFileID);
        return null;
    }

    /* renamed from: c */
    public SteamPublicData_1 m265c(SteamPublishedFileID steamPublishedFileID) {
        Iterator it = this.f7338h.iterator();
        while (it.hasNext()) {
            SteamPublicData_1 steamPublicData_1 = (SteamPublicData_1) it.next();
            if (steamPublicData_1.f7346a.equals(steamPublishedFileID)) {
                return steamPublicData_1;
            }
        }
        return null;
    }

    public C1198g(SteamEngine steamEngine) {
        this.f7332b = steamEngine;
    }

    /* renamed from: a */
    public void m273a(SteamUGC steamUGC) {
        this.f7334d = steamUGC;
    }

    /* renamed from: a */
    public SteamUGCCallback m275a() {
        return this.f7333c;
    }

    /* renamed from: a */
    public void m271a(C0859b c0859b, String str, boolean z) {
        GameEngine.m5777e("workshop: " + str);
        if (z) {
            GameEngine.getGameEngine().m986i(str);
        }
    }

    /* renamed from: a */
    public boolean m272a(C0859b c0859b) {
        if (c0859b.f5645s == null) {
            m271a(c0859b, "A title is required in the file 'mod-info.txt'", true);
            return false;
        } else if (!c0859b.f5644r) {
            m271a(c0859b, "Please add and setup the file 'mod-info.txt' to this mod before uploading", true);
            return false;
        } else {
            String m1652p = c0859b.m1652p();
            if (m1652p != null && !C0765a.m2278i(m1652p)) {
                m271a(c0859b, "Could not find thumbnail file: " + m1652p + " referenced mod-info.txt", true);
                return false;
            }
            return true;
        }
    }

    /* renamed from: b */
    public void m267b(C0859b c0859b) {
        if (this.f7335e != null) {
            m271a(c0859b, "A mod is already pending publishing", false);
        } else if (c0859b.f5637k != 0) {
            m271a(c0859b, "This mod has already been published", false);
        } else if (!m272a(c0859b)) {
        } else {
            if (!c0859b.m1672a(0L)) {
                m271a(c0859b, "Failed to write metadata to mod, check file permissions", true);
                return;
            }
            this.f7335e = c0859b;
            this.f7334d.createItem(this.f7332b.f7318j.getAppID(), SteamRemoteStorage.WorkshopFileType.Community);
        }
    }

    /* renamed from: a */
    public void m270a(C0859b c0859b, boolean z, String str) {
        if (!m272a(c0859b)) {
            return;
        }
        SteamUGCUpdateHandle startItemUpdate = this.f7334d.startItemUpdate(this.f7332b.f7318j.getAppID(), new SteamPublishedFileID(c0859b.f5637k));
        if (z) {
            if (c0859b.f5645s != null) {
                this.f7334d.setItemTitle(startItemUpdate, c0859b.f5645s);
            }
            if (c0859b.f5647u != null) {
                this.f7334d.setItemDescription(startItemUpdate, c0859b.f5647u);
            }
        }
        if (z) {
            this.f7334d.setItemVisibility(startItemUpdate, SteamRemoteStorage.PublishedFileVisibility.Public);
        }
        String m1652p = c0859b.m1652p();
        if (m1652p != null) {
            this.f7334d.setItemPreview(startItemUpdate, m1652p);
        }
        String m1665c = c0859b.m1665c("tags");
        if (m1665c != null) {
            String[] split = m1665c.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
                GameEngine.m5777e("Adding tag:" + split[i]);
            }
            this.f7334d.setItemTags(startItemUpdate, split);
        }
        String m1659i = c0859b.m1659i();
        GameEngine.m5777e("convertedAbsolutePath:" + m1659i);
        this.f7334d.setItemContent(startItemUpdate, m1659i);
        c0859b.f5671S = "Uploading to workshop";
        this.f7336f = z;
        this.f7337g = c0859b;
        this.f7334d.submitItemUpdate(startItemUpdate, str);
        GameEngine.m5777e("submitted item update for:" + c0859b.f5637k);
    }

    /* renamed from: b */
    public void m269b() {
        this.f7332b.f7311c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + this.f7332b.f7318j.getAppID());
    }

    /* renamed from: c */
    public void m264c(C0859b c0859b) {
        this.f7332b.f7311c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + c0859b.f5637k);
    }

    /* renamed from: d */
    public long m262d(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    /* renamed from: c */
    public void m266c() {
        if (this.f7331a) {
            this.f7331a = false;
            GameEngine.getGameEngine().f6385bZ.m1675m();
        }
        int numSubscribedItems = this.f7334d.getNumSubscribedItems();
        if (numSubscribedItems != this.f7341k) {
            GameEngine.m5777e("Number of subscribed items changed from: " + this.f7341k + " to: " + numSubscribedItems);
            this.f7341k = numSubscribedItems;
            GameEngine.getGameEngine();
            m263d();
            this.f7331a = true;
        }
    }

    /* renamed from: d */
    public void m263d() {
        SteamUGC.ItemDownloadInfo itemDownloadInfo;
        String m268b;
        GameEngine gameEngine = GameEngine.getGameEngine();
        SteamAPI.runCallbacks();
        GameEngine.m5777e("--------------");
        GameEngine.m5777e("Steam: loadWorkshopMods");
        int numSubscribedItems = this.f7334d.getNumSubscribedItems();
        this.f7341k = numSubscribedItems;
        SteamPublishedFileID[] steamPublishedFileIDArr = new SteamPublishedFileID[numSubscribedItems];
        this.f7334d.getSubscribedItems(steamPublishedFileIDArr);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArr) {
            Collection<SteamUGC.ItemState> itemState = this.f7334d.getItemState(steamPublishedFileID);
            long m262d = m262d(steamPublishedFileID);
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
            GameEngine.m5777e("Found workshop item " + m262d + " with state: " + str + VariableScope.nullOrMissingString);
            String str2 = "sw" + m262d;
            String str3 = "(Workshop item - " + m262d + ")";
            if (!z && (m268b = m268b(steamPublishedFileID)) != null) {
                str3 = m268b;
            }
            String str4 = null;
            String str5 = null;
            if (!z5) {
                GameEngine.m5777e("Skipping: " + m262d + " as it is not subscribed");
            } else {
                if (z) {
                    SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
                    this.f7334d.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
                    str4 = itemInstallInfo.getFolder();
                    GameEngine.m5777e(" Installed at: " + str4);
                } else {
                    GameEngine.m5777e(" Not installed");
                    str5 = "Not installed.";
                    if (z4) {
                        str5 = "Update needed..";
                    }
                    if (z3) {
                        str5 = "Download pending in steam...";
                    } else if (z2) {
                        str5 = "Steam is downloading files..";
                        if (this.f7334d.getItemDownloadInfo(steamPublishedFileID, new SteamUGC.ItemDownloadInfo())) {
                            str5 = str5 + " " + C0773f.m2153c((itemDownloadInfo.getBytesDownloaded() / itemDownloadInfo.getBytesTotal()) * 100.0d) + "%";
                        }
                    }
                }
                int i = 0;
                if (!z) {
                    i = -1;
                }
                C0859b m1698a = gameEngine.f6385bZ.m1698a(str2, str2, str4, str2, true, true, false, i);
                if (m1698a.f5645s == null) {
                    m1698a.f5646t = str3;
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
                m1698a.f5672T = str5;
                if ((!z || z4) && (!z2 || z3)) {
                    GameEngine.m5777e("Queuing download on: " + steamPublishedFileID);
                    this.f7334d.downloadItem(steamPublishedFileID, false);
                }
            }
        }
        m261e();
    }
}