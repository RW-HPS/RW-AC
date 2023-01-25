package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ae.class */
public class C0795ae {

    /* renamed from: h */
    static Paint f5165h;

    /* renamed from: a */
    static C0966ag f5166a = new C0966ag();

    /* renamed from: b */
    static C0966ag f5167b = new C0966ag();

    /* renamed from: c */
    static C0966ag f5168c = new C0966ag();

    /* renamed from: f */
    static Paint f5169f = new Paint();

    /* renamed from: d */
    public Paint f5170d = f5166a;

    /* renamed from: e */
    public Paint f5171e = f5166a;

    /* renamed from: g */
    public Paint f5172g = this.f5170d;

    /* renamed from: i */
    C1136m f5173i = new C1136m();

    static {
        f5168c.mo914a(true);
        f5165h = new Paint();
        f5165h.m5206b(-65536);
        f5165h.m5221a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m1982a(Paint paint) {
        if (paint == null) {
            this.f5172g = this.f5170d;
        } else {
            this.f5172g = paint;
        }
    }

    /* renamed from: a */
    public void m1975a(boolean z) {
        if (z) {
            this.f5172g = this.f5171e;
        } else {
            this.f5172g = this.f5170d;
        }
    }

    /* renamed from: a */
    public String m1984a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f5173i.iterator();
        while (it.hasNext()) {
            C0796af c0796af = (C0796af) it.next();
            if (c0796af instanceof C0799ai) {
                sb.append(((C0799ai) c0796af).f5182d);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1979a(String str) {
        if (this.f5173i.size() > 0) {
            int size = this.f5173i.size() - 1;
            C0796af c0796af = (C0796af) this.f5173i.get(size);
            if (c0796af instanceof C0799ai) {
                C0799ai c0799ai = (C0799ai) c0796af;
                String m2182a = C0773f.m2182a(c0799ai.f5182d, str);
                if (!c0799ai.f5182d.equals(m2182a)) {
                    this.f5173i.set(size, c0799ai.mo1968b(m2182a));
                }
            }
        }
    }

    /* renamed from: b */
    public void m1974b() {
        this.f5173i.clear();
    }

    /* renamed from: a */
    public void m1981a(C0796af c0796af) {
        this.f5173i.add(c0796af);
    }

    /* renamed from: b */
    public void m1973b(String str) {
        if (this.f5172g != null && this.f5172g != this.f5170d) {
            m1976a(str, this.f5172g);
        } else {
            m1981a(new C0799ai(this, str));
        }
    }

    /* renamed from: a */
    public void m1976a(String str, Paint paint) {
        m1981a(new C0797ag(this, str, paint));
    }

    /* renamed from: a */
    public void m1978a(String str, int i) {
        if (this.f5172g != null && this.f5172g != this.f5170d) {
            m1981a(new C0797ag(this, str, this.f5172g, i));
        } else {
            m1981a(new C0797ag(this, str, null, i));
        }
    }

    /* renamed from: a */
    public void m1977a(String str, int i, boolean z) {
        Paint paint = this.f5170d;
        if (z) {
            paint = this.f5171e;
        }
        m1981a(new C0797ag(this, str, paint, i));
    }

    /* renamed from: a */
    public void m1980a(C0970e c0970e, int i, int i2) {
        C0798ah c0798ah = new C0798ah(this);
        c0798ah.f5177a = c0970e;
        float m1926a = C0820d.m1926a(c0970e, i, i2);
        c0798ah.f5179c = (int) (c0970e.f6620p * m1926a);
        c0798ah.f5180d = (int) (c0970e.f6621q * m1926a);
        c0798ah.f5178b = m1926a;
        this.f5173i.add(c0798ah);
    }

    /* renamed from: c */
    public int m1972c() {
        return GameEngine.getGameEngine().f6326bO.mo180a("A", this.f5172g);
    }

    /* renamed from: a */
    public C0800aj m1983a(int i, boolean z) {
        int lastIndexOf;
        GameEngine.getGameEngine();
        Rect rect = new Rect((-i) / 2, 0, i / 2, 10);
        C1136m c1136m = new C1136m();
        C0801ak c0801ak = new C0801ak();
        Paint paint = this.f5170d;
        int i2 = i - 5;
        Iterator it = this.f5173i.iterator();
        while (it.hasNext()) {
            C0796af c0796af = (C0796af) it.next();
            if (c0801ak.f5189b >= i2 - 5) {
                if (c0801ak.f5188a.size() > 0) {
                    c1136m.add(c0801ak);
                }
                c0801ak = new C0801ak();
            }
            if (!(c0796af instanceof C0799ai)) {
                c0801ak.m1966a(c0796af);
                c0801ak.f5189b += c0796af.mo1970a(this.f5170d);
            } else {
                C0799ai c0799ai = (C0799ai) c0796af;
                String str = c0799ai.f5182d;
                int i3 = 0;
                while (i3 < str.length()) {
                    if (str.charAt(i3) == '\n') {
                        i3++;
                        c1136m.add(c0801ak);
                        c0801ak = new C0801ak();
                    } else {
                        int m5218a = paint.m5218a((CharSequence) str, i3, str.length(), true, i2 - c0801ak.f5189b, (float[]) null);
                        if (m5218a == 0) {
                            break;
                        }
                        boolean z2 = true;
                        int indexOf = str.indexOf("\n", i3 + 1);
                        if (indexOf != -1 && indexOf < i3 + m5218a) {
                            m5218a = indexOf - i3;
                        } else {
                            if (i3 + m5218a < str.length() && (lastIndexOf = str.substring(i3, i3 + m5218a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                                m5218a = lastIndexOf;
                            }
                            if (i3 + m5218a == str.length()) {
                                z2 = false;
                            }
                        }
                        String substring = str.substring(i3, i3 + m5218a);
                        if (C0773f.m2143c(substring, "\\n")) {
                            substring = substring.replaceAll("(\\n)", VariableScope.nullOrMissingString);
                        }
                        C0799ai mo1968b = c0799ai.mo1968b(substring);
                        c0801ak.m1966a(mo1968b);
                        c0801ak.f5189b += mo1968b.mo1970a(this.f5170d);
                        i3 += m5218a;
                        if (i3 < str.length() && str.charAt(i3) == '\n') {
                            i3++;
                        }
                        if (z2 || c0801ak.f5189b >= i2 - 5) {
                            if (c0801ak.f5188a.size() > 0) {
                                c1136m.add(c0801ak);
                            }
                            c0801ak = new C0801ak();
                        }
                    }
                }
            }
        }
        if (c0801ak.f5188a.size() > 0) {
            c1136m.add(c0801ak);
        }
        if (c1136m.size() > 0 && ((C0801ak) c1136m.get(c1136m.size() - 1)).f5188a.size() == 0) {
            c1136m.remove(c1136m.size() - 1);
        }
        rect.f233d = rect.f231b + (c1136m.size() * C0820d.m1927a(paint));
        if (z) {
            float m5165d = rect.m5165d();
            float f = 0.0f;
            Iterator it2 = c1136m.iterator();
            while (it2.hasNext()) {
                C0801ak c0801ak2 = (C0801ak) it2.next();
                if (c0801ak2.f5189b > f) {
                    f = c0801ak2.f5189b;
                }
            }
            float f2 = f;
            if (f2 < rect.m5170b()) {
                rect.f230a = (int) (m5165d - (f2 / 2.0f));
                rect.f232c = (int) (m5165d + (f2 / 2.0f));
            }
        }
        C0800aj c0800aj = new C0800aj();
        c0800aj.f5184a = c1136m;
        c0800aj.f5185b = rect;
        c0800aj.f5186c = this.f5170d;
        c0800aj.f5187d = this.f5171e;
        return c0800aj;
    }
}