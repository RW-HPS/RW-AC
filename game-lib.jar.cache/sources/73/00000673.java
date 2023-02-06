package com.corrodinggames.rts.java.steam;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.mod.b;

/* renamed from: com.corrodinggames.rts.java.c.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/j.class */
public class j implements SteamUGCCallback {
    final /* synthetic */ g a;

    public j(g gVar) {
        this.a = gVar;
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUGCQueryCompleted(SteamUGCQuery steamUGCQuery, int i, int i2, boolean z, SteamResult steamResult) {
        GameEngine.m5e("Got workshop callback: onUGCQueryCompleted (" + steamResult + ") numResultsReturned:" + i);
        if (steamResult != SteamResult.OK) {
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            SteamUGCDetails steamUGCDetails = new SteamUGCDetails();
            if (!this.a.d.getQueryUGCResult(steamUGCQuery, i3, steamUGCDetails)) {
                GameEngine.m5e("getQueryUGCResult failed for index: " + i3);
            } else {
                SteamPublishedFileID publishedFileID = steamUGCDetails.getPublishedFileID();
                GameEngine.m5e("getQueryUGCResult: " + publishedFileID);
                SteamPublicData_2 a = this.a.a(publishedFileID);
                a.d = steamUGCDetails.getTitle();
                a.c = true;
                this.a.a = true;
            }
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        a("onSubscribeItem", steamResult);
        GameEngine.getGameEngine();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUnsubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        a("onUnsubscribeItem", steamResult);
        GameEngine.getGameEngine();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onRequestUGCDetails(SteamUGCDetails steamUGCDetails, SteamResult steamResult) {
        a("onRequestUGCDetails", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onCreateItem(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        a("onCreateItem", steamResult);
        if (this.a.e == null) {
            this.a.a((b) null, "Error no mod pending creation!", false);
        } else if (this.a.e.k != 0) {
            this.a.a(this.a.e, "This mod has already been published", true);
        } else {
            this.a.e.a(SteamNativeHandle.getNativeHandle(steamPublishedFileID));
            this.a.a(this.a.e, true, "Created.");
            this.a.e = null;
            GameEngine.getGameEngine().bZ.m();
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubmitItemUpdate(boolean z, SteamResult steamResult) {
        String str;
        b bVar = this.a.g;
        this.a.g = null;
        a("onSubmitItemUpdate", steamResult);
        if (steamResult == SteamResult.OK) {
            str = "Workshop item updated.";
        } else if (this.a.f) {
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
        GameEngine.getGameEngine().i(str);
        GameEngine.getGameEngine().bZ.m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onDownloadItemResult(int i, SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        a("onDownloadItemResult", steamResult);
        synchronized (this.a.h) {
            SteamPublicData_1 c = this.a.c(steamPublishedFileID);
            if (c != null) {
                c.a(steamResult);
                this.a.h.remove(c);
            }
        }
        GameEngine.getGameEngine().bZ.m();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUserFavoriteItemsListChanged(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        a("onUserFavoriteItemsListChanged", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        a("onSetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onGetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, boolean z2, boolean z3, SteamResult steamResult) {
        a("onGetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStartPlaytimeTracking(SteamResult steamResult) {
        a("onStartPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTracking(SteamResult steamResult) {
        a("onStopPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTrackingForAllItems(SteamResult steamResult) {
        a("onStopPlaytimeTrackingForAllItems", steamResult);
    }

    public void a(String str, SteamResult steamResult) {
        GameEngine.m5e("Got workshop callback: " + str + " (" + steamResult + ")");
    }
}