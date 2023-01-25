package com.corrodinggames.rts.gameFramework;

import java.util.Comparator;

/* renamed from: com.corrodinggames.rts.gameFramework.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/x.class */
class C1156x implements Comparator {
    C1156x() {
    }

    @Override // java.util.Comparator
    /* renamed from: a */
    public int mo431a(AbstractC1155w abstractC1155w, AbstractC1155w abstractC1155w2) {
        if (abstractC1155w.f7170em > abstractC1155w2.f7170em) {
            return 1;
        }
        if (abstractC1155w.f7170em < abstractC1155w2.f7170em) {
            return -1;
        }
        if (abstractC1155w.f7171en > abstractC1155w2.f7171en) {
            return 1;
        }
        if (abstractC1155w.f7171en < abstractC1155w2.f7171en) {
            return -1;
        }
        if (abstractC1155w.f7173ep > abstractC1155w2.f7173ep) {
            return 1;
        }
        return abstractC1155w.f7173ep < abstractC1155w2.f7173ep ? -1 : 0;
    }
}