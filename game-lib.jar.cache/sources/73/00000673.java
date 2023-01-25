package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.C0859b;

/* renamed from: com.corrodinggames.rts.java.c.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/j.class */
public class C1201j implements SteamUGCCallback {

    /* renamed from: a */
    final /* synthetic */ C1198g f7348a;

    public C1201j(C1198g c1198g) {
        this.f7348a = c1198g;
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUGCQueryCompleted(SteamUGCQuery steamUGCQuery, int i, int i2, boolean z, SteamResult steamResult) {
        GameEngine.m5777e("Got workshop callback: onUGCQueryCompleted (" + steamResult + ") numResultsReturned:" + i);
        if (steamResult != SteamResult.OK) {
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            SteamUGCDetails steamUGCDetails = new SteamUGCDetails();
            if (!this.f7348a.f7334d.getQueryUGCResult(steamUGCQuery, i3, steamUGCDetails)) {
                GameEngine.m5777e("getQueryUGCResult failed for index: " + i3);
            } else {
                SteamPublishedFileID publishedFileID = steamUGCDetails.getPublishedFileID();
                GameEngine.m5777e("getQueryUGCResult: " + publishedFileID);
                SteamPublicData_2 m274a = this.f7348a.m274a(publishedFileID);
                m274a.f7345d = steamUGCDetails.getTitle();
                m274a.f7344c = true;
                this.f7348a.f7331a = true;
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m258a("onSubscribeItem", steamResult);
        GameEngine.getGameEngine();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUnsubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m258a("onUnsubscribeItem", steamResult);
        GameEngine.getGameEngine();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onRequestUGCDetails(SteamUGCDetails steamUGCDetails, SteamResult steamResult) {
        m258a("onRequestUGCDetails", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onCreateItem(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m258a("onCreateItem", steamResult);
        if (this.f7348a.f7335e == null) {
            this.f7348a.m271a((C0859b) null, "Error no mod pending creation!", false);
        } else if (this.f7348a.f7335e.f5637k != 0) {
            this.f7348a.m271a(this.f7348a.f7335e, "This mod has already been published", true);
        } else {
            this.f7348a.f7335e.m1672a(SteamNativeHandle.getNativeHandle(steamPublishedFileID));
            this.f7348a.m270a(this.f7348a.f7335e, true, "Created.");
            this.f7348a.f7335e = null;
            GameEngine.getGameEngine().f6385bZ.m1675m();
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubmitItemUpdate(boolean z, SteamResult steamResult) {
        String str;
        C0859b c0859b = this.f7348a.f7337g;
        this.f7348a.f7337g = null;
        m258a("onSubmitItemUpdate", steamResult);
        if (steamResult == SteamResult.OK) {
            str = "Workshop item updated.";
        } else if (this.f7348a.f7336f) {
            str = "Error. Workshop returned: " + steamResult + " while trying to upload workshop data.";
        } else {
            str = "Error. Workshop returned: " + steamResult + " while trying to update existing workshop item.";
            if (steamResult == SteamResult.FileNotFound) {
                str = str + " (If you want to create a new workshop item instead of updating, delete steam.dat from this mod.)";
            }
        }
        if (z) {
            str = str + "WLA agreement needs to be accepted on the workshop site.";
        }
        GameEngine.getGameEngine().m986i(str);
        GameEngine.getGameEngine().f6385bZ.m1675m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onDownloadItemResult(int i, SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m258a("onDownloadItemResult", steamResult);
        synchronized (this.f7348a.f7338h) {
            SteamPublicData_1 m265c = this.f7348a.m265c(steamPublishedFileID);
            if (m265c != null) {
                m265c.m259a(steamResult);
                this.f7348a.f7338h.remove(m265c);
            }
        }
        GameEngine.getGameEngine().f6385bZ.m1675m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUserFavoriteItemsListChanged(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m258a("onUserFavoriteItemsListChanged", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m258a("onSetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onGetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, boolean z2, boolean z3, SteamResult steamResult) {
        m258a("onGetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStartPlaytimeTracking(SteamResult steamResult) {
        m258a("onStartPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTracking(SteamResult steamResult) {
        m258a("onStopPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTrackingForAllItems(SteamResult steamResult) {
        m258a("onStopPlaytimeTrackingForAllItems", steamResult);
    }

    /* renamed from: a */
    public void m258a(String str, SteamResult steamResult) {
        GameEngine.m5777e("Got workshop callback: " + str + " (" + steamResult + ")");
    }
}