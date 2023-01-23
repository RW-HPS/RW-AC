package a.a;

import java.io.IOException;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/l.class */
public class l implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f19a;

    private l(h hVar) {
        this.f19a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        boolean z;
        i iVar;
        arrayList = this.f19a.u;
        synchronized (arrayList) {
            arrayList2 = this.f19a.u;
            if (arrayList2.isEmpty()) {
                try {
                    h hVar = this.f19a;
                    iVar = this.f19a.y;
                    hVar.e(new a.a.a.e(iVar.a()));
                } catch (IOException e) {
                    z = h.I;
                    if (z) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}