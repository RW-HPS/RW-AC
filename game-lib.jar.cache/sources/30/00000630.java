package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/x.class */
class x implements Comparator {
    x() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int compare(w wVar, w wVar2) {
        if (wVar.em > wVar2.em) {
            return 1;
        }
        if (wVar.em < wVar2.em) {
            return -1;
        }
        if (wVar.en > wVar2.en) {
            return 1;
        }
        if (wVar.en < wVar2.en) {
            return -1;
        }
        if (wVar.ep > wVar2.ep) {
            return 1;
        }
        return wVar.ep < wVar2.ep ? -1 : 0;
    }
}