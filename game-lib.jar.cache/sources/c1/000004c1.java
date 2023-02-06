package com.corrodinggames.rts.gameFramework.Interface;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.utility.m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ae.class */
public class ae {
    static Paint h;
    static ag a = new ag();
    static ag b = new ag();
    static ag c = new ag();
    static Paint f = new Paint();
    public Paint d = a;
    public Paint e = a;
    public Paint g = this.d;
    m i = new m();

    static {
        c.a(true);
        h = new Paint();
        h.b(-65536);
        h.a(Paint.Style.STROKE);
    }

    public void a(Paint paint) {
        if (paint == null) {
            this.g = this.d;
        } else {
            this.g = paint;
        }
    }

    public void a(boolean z) {
        if (z) {
            this.g = this.e;
        } else {
            this.g = this.d;
        }
    }

    public String a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (afVar instanceof ai) {
                sb.append(((ai) afVar).d);
            }
        }
        return sb.toString();
    }

    public void a(String str) {
        if (this.i.size() > 0) {
            int size = this.i.size() - 1;
            af afVar = (af) this.i.get(size);
            if (afVar instanceof ai) {
                ai aiVar = (ai) afVar;
                String a2 = f.a(aiVar.d, str);
                if (!aiVar.d.equals(a2)) {
                    this.i.set(size, aiVar.b(a2));
                }
            }
        }
    }

    public void b() {
        this.i.clear();
    }

    public void a(af afVar) {
        this.i.add(afVar);
    }

    public void b(String str) {
        if (this.g != null && this.g != this.d) {
            a(str, this.g);
        } else {
            a(new ai(this, str));
        }
    }

    public void a(String str, Paint paint) {
        a(new ag(this, str, paint));
    }

    public void a(String str, int i) {
        if (this.g != null && this.g != this.d) {
            a(new ag(this, str, this.g, i));
        } else {
            a(new ag(this, str, null, i));
        }
    }

    public void a(String str, int i, boolean z) {
        Paint paint = this.d;
        if (z) {
            paint = this.e;
        }
        a(new ag(this, str, paint, i));
    }

    public void a(e eVar, int i, int i2) {
        ah ahVar = new ah(this);
        ahVar.a = eVar;
        float a2 = d.a(eVar, i, i2);
        ahVar.c = (int) (eVar.p * a2);
        ahVar.d = (int) (eVar.q * a2);
        ahVar.b = a2;
        this.i.add(ahVar);
    }

    public int c() {
        return GameEngine.getGameEngine().bO.a("A", this.g);
    }

    public aj a(int i, boolean z) {
        int lastIndexOf;
        GameEngine.getGameEngine();
        Rect rect = new Rect((-i) / 2, 0, i / 2, 10);
        m mVar = new m();
        ak akVar = new ak();
        Paint paint = this.d;
        int i2 = i - 5;
        Iterator it = this.i.iterator();
        while (it.hasNext()) {
            af afVar = (af) it.next();
            if (akVar.b >= i2 - 5) {
                if (akVar.a.size() > 0) {
                    mVar.add(akVar);
                }
                akVar = new ak();
            }
            if (!(afVar instanceof ai)) {
                akVar.a(afVar);
                akVar.b += afVar.a(this.d);
            } else {
                ai aiVar = (ai) afVar;
                String str = aiVar.d;
                int i3 = 0;
                while (i3 < str.length()) {
                    if (str.charAt(i3) == '\n') {
                        i3++;
                        mVar.add(akVar);
                        akVar = new ak();
                    } else {
                        int a2 = paint.a((CharSequence) str, i3, str.length(), true, i2 - akVar.b, (float[]) null);
                        if (a2 == 0) {
                            break;
                        }
                        boolean z2 = true;
                        int indexOf = str.indexOf("\n", i3 + 1);
                        if (indexOf != -1 && indexOf < i3 + a2) {
                            a2 = indexOf - i3;
                        } else {
                            if (i3 + a2 < str.length() && (lastIndexOf = str.substring(i3, i3 + a2).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                                a2 = lastIndexOf;
                            }
                            if (i3 + a2 == str.length()) {
                                z2 = false;
                            }
                        }
                        String substring = str.substring(i3, i3 + a2);
                        if (f.c(substring, "\\n")) {
                            substring = substring.replaceAll("(\\n)", VariableScope.nullOrMissingString);
                        }
                        ai b2 = aiVar.b(substring);
                        akVar.a(b2);
                        akVar.b += b2.a(this.d);
                        i3 += a2;
                        if (i3 < str.length() && str.charAt(i3) == '\n') {
                            i3++;
                        }
                        if (z2 || akVar.b >= i2 - 5) {
                            if (akVar.a.size() > 0) {
                                mVar.add(akVar);
                            }
                            akVar = new ak();
                        }
                    }
                }
            }
        }
        if (akVar.a.size() > 0) {
            mVar.add(akVar);
        }
        if (mVar.size() > 0 && ((ak) mVar.get(mVar.size() - 1)).a.size() == 0) {
            mVar.remove(mVar.size() - 1);
        }
        rect.d = rect.b + (mVar.size() * d.a(paint));
        if (z) {
            float d = rect.d();
            float f2 = 0.0f;
            Iterator it2 = mVar.iterator();
            while (it2.hasNext()) {
                ak akVar2 = (ak) it2.next();
                if (akVar2.b > f2) {
                    f2 = akVar2.b;
                }
            }
            float f3 = f2;
            if (f3 < rect.b()) {
                rect.a = (int) (d - (f3 / 2.0f));
                rect.c = (int) (d + (f3 / 2.0f));
            }
        }
        aj ajVar = new aj();
        ajVar.a = mVar;
        ajVar.b = rect;
        ajVar.c = this.d;
        ajVar.d = this.e;
        return ajVar;
    }
}