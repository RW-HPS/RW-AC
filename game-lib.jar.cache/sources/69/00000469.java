package com.corrodinggames.rts.gameFramework.b;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.List;

/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/i.class */
public class i extends c {
    protected List a;
    private final List b;
    private b c;
    private b d;

    private void a(b bVar) {
        a();
        for (int i = 0; i < this.a.size(); i++) {
            this.b.add(new x(bVar.b(), bVar.c(), false));
        }
    }

    private void a() {
        for (x xVar : this.b) {
            xVar.j();
        }
        this.b.clear();
    }

    public b a(b bVar, k kVar, j jVar) {
        if (bVar instanceof x) {
            if (!((x) bVar).k()) {
                return this.c;
            }
        } else if (this.d == bVar && this.c != null) {
            return this.c;
        }
        if (this.b.size() != this.a.size() || this.d != bVar) {
            a(bVar);
        }
        this.d = bVar;
        x xVar = bVar;
        int i = 0;
        int size = this.b.size();
        while (i < size) {
            x xVar2 = (x) this.b.get(i);
            af afVar = (af) this.a.get(i);
            kVar.c(xVar2);
            jVar.a(xVar, afVar, i == 0);
            kVar.d();
            xVar = xVar2;
            GameEngine.m5e("FilterGroup: renderTarget");
            i++;
        }
        this.c = xVar;
        return xVar;
    }
}