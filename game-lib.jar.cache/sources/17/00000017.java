package a.a;

import java.io.IOException;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: game-lib.jar:a/a/m.class */
public class m extends Thread {

    /* renamed from: a  reason: collision with root package name */
    final /* synthetic */ h f20a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(h hVar) {
        super("ReliableSocket");
        this.f20a = hVar;
        setDaemon(true);
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public void run() {
        a.a.a.h i;
        while (true) {
            try {
                i = this.f20a.i();
                if (i != null) {
                    if (i instanceof a.a.a.g) {
                        this.f20a.a((a.a.a.g) i);
                    } else if (i instanceof a.a.a.c) {
                        this.f20a.a((a.a.a.c) i);
                    } else if (!(i instanceof a.a.a.a)) {
                        this.f20a.g(i);
                    }
                    this.f20a.c(i);
                } else {
                    return;
                }
            } catch (IOException e) {
                e.printStackTrace();
                return;
            }
        }
    }
}