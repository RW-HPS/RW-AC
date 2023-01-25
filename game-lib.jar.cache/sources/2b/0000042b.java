package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ad.class */
public class C0645ad {

    /* renamed from: a */
    public String f4181a;

    /* renamed from: b */
    public boolean f4182b = false;

    /* renamed from: c */
    public ArrayList f4183c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4184d = new ArrayList();

    /* renamed from: a */
    public boolean m2774a() {
        Iterator it = this.f4183c.iterator();
        while (it.hasNext()) {
            AbstractC0647af abstractC0647af = (AbstractC0647af) it.next();
            if (abstractC0647af.f4185a == -1 && abstractC0647af.mo2759a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2768b() {
        Iterator it = this.f4183c.iterator();
        while (it.hasNext()) {
            AbstractC0647af abstractC0647af = (AbstractC0647af) it.next();
            if (abstractC0647af != null && abstractC0647af.f4185a == -1 && abstractC0647af.mo2757b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m2765c() {
        Iterator it = this.f4183c.iterator();
        while (it.hasNext()) {
            AbstractC0647af abstractC0647af = (AbstractC0647af) it.next();
            if (abstractC0647af != null) {
                return abstractC0647af.mo2756c().toUpperCase();
            }
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: a */
    public AbstractC0647af m2773a(int i) {
        if (this.f4183c.size() > i) {
            return (AbstractC0647af) this.f4183c.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public String m2767b(int i) {
        if (this.f4183c.size() > i) {
            AbstractC0647af abstractC0647af = (AbstractC0647af) this.f4183c.get(i);
            if (abstractC0647af == null) {
                return "<null>";
            }
            return abstractC0647af.mo2756c().toUpperCase();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: c */
    public C0645ad m2764c(int i) {
        return m2772a(i, 0, 0, false);
    }

    /* renamed from: a */
    public C0645ad m2772a(int i, int i2, int i3, boolean z) {
        C0648ag c0648ag = new C0648ag();
        c0648ag.f4189e = i;
        c0648ag.f4185a = -1;
        c0648ag.f4186b = i3;
        if (z) {
            c0648ag.f4188d = true;
        }
        if (this.f4183c.size() <= i2) {
            this.f4183c.add(new C0652ak());
        }
        if (this.f4183c.size() <= i2) {
            this.f4183c.add(new C0652ak());
        }
        this.f4183c.set(i2, c0648ag);
        return this;
    }

    /* renamed from: a */
    public C0645ad m2770a(String str) {
        return m2769a(str, -1);
    }

    /* renamed from: a */
    public C0645ad m2769a(String str, int i) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        return m2771a(-1, str, i);
    }

    /* renamed from: a */
    public C0645ad m2771a(int i, String str, int i2) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        C0648ag c0648ag = new C0648ag();
        c0648ag.f4185a = i;
        c0648ag.f4186b = 0;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("alt+")) {
            lowerCase = lowerCase.replace("alt+", VariableScope.nullOrMissingString);
            c0648ag.f4186b += 4;
        }
        if (lowerCase.contains("ctrl+")) {
            lowerCase = lowerCase.replace("ctrl+", VariableScope.nullOrMissingString);
            c0648ag.f4186b++;
        }
        if (lowerCase.contains("shift+")) {
            lowerCase = lowerCase.replace("shift+", VariableScope.nullOrMissingString);
            c0648ag.f4186b += 2;
        }
        try {
            c0648ag.f4189e = C0644ac.m2775d(lowerCase);
            if (i2 == -1) {
                this.f4183c.add(c0648ag);
            } else {
                if (this.f4183c.size() <= i2) {
                    this.f4183c.add(new C0652ak());
                }
                if (this.f4183c.size() <= i2) {
                    this.f4183c.add(new C0652ak());
                }
                this.f4183c.set(i2, c0648ag);
            }
        } catch (SlickToAndroidKeycodes.MissingKey e) {
            e.printStackTrace();
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (gameEngine != null) {
                gameEngine.m1065a(e.getMessage(), 1);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C0645ad m2766b(int i, int i2, int i3, boolean z) {
        C0649ah c0649ah = new C0649ah();
        c0649ah.f4185a = i;
        c0649ah.f4190e = i2;
        c0649ah.f4191f = i3;
        c0649ah.f4192g = z;
        try {
            c0649ah.f4194i = c0649ah.m2761a(true);
            this.f4183c.add(c0649ah);
            return this;
        } catch (IndexOutOfBoundsException e) {
            GameEngine.print("Failed to bind Axis:" + i3 + " on joystick:" + i2);
            return this;
        }
    }

    /* renamed from: d */
    public boolean mo2762d() {
        return false;
    }

    /* renamed from: e */
    public String m2763e() {
        return this.f4181a.replace("-", VariableScope.nullOrMissingString).replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
    }
}