package a.a;

import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/f.class */
public class f implements s {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ RUDPServerSocket f12a;

    private f(RUDPServerSocket rUDPServerSocket) {
        this.f12a = rUDPServerSocket;
    }

    @Override // a.a.s
    public void a(h hVar) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        ArrayList arrayList4;
        ArrayList arrayList5;
        if (hVar instanceof e) {
            arrayList = this.f12a.h;
            synchronized (arrayList) {
                while (true) {
                    arrayList2 = this.f12a.h;
                    if (arrayList2.size() > 50) {
                        try {
                            arrayList5 = this.f12a.h;
                            arrayList5.wait();
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }
                    } else {
                        arrayList3 = this.f12a.h;
                        arrayList3.add((e) hVar);
                        arrayList4 = this.f12a.h;
                        arrayList4.notify();
                    }
                }
            }
        }
    }

    @Override // a.a.s
    public void b(h hVar) {
    }

    @Override // a.a.s
    public void c(h hVar) {
        if (hVar instanceof e) {
            this.f12a.a(((e) hVar).c());
        }
    }

    @Override // a.a.s
    public void d(h hVar) {
        if (hVar instanceof e) {
            this.f12a.a(((e) hVar).c());
        }
    }

    @Override // a.a.s
    public void e(h hVar) {
    }
}