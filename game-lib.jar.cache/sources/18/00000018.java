package a.a;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/n.class */
public class n implements Runnable {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f21a;

    private n(h hVar) {
        this.f21a = hVar;
    }

    @Override // java.lang.Runnable
    public void run() {
        ArrayList arrayList;
        ArrayList arrayList2;
        arrayList = this.f21a.u;
        synchronized (arrayList) {
            arrayList2 = this.f21a.u;
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                try {
                    this.f21a.f((a.a.a.h) it.next());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}