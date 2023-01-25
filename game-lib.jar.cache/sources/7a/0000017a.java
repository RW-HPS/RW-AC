package com.corrodinggames.rts.game.p012b;

import android.graphics.RectF;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.EnumC0249ar;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0404bb;
import com.corrodinggames.rts.game.units.custom.C0405bc;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.net.GameNetEngine;
import com.corrodinggames.rts.gameFramework.translations.C0855a;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1151x;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/a.class */
public class C0172a {

    /* renamed from: a */
    public int f767a;

    /* renamed from: b */
    public String f768b;

    /* renamed from: c */
    public String f769c;

    /* renamed from: d */
    public String f770d;

    /* renamed from: e */
    public float f771e;

    /* renamed from: f */
    public float f772f;

    /* renamed from: g */
    public float f773g;

    /* renamed from: h */
    public float f774h;

    /* renamed from: i */
    public float f775i;

    /* renamed from: p */
    private String f776p;

    /* renamed from: j */
    public RectF f777j;

    /* renamed from: k */
    public int f778k;

    /* renamed from: l */
    public C0183j f779l;

    /* renamed from: m */
    public int f780m;

    /* renamed from: n */
    public Properties f781n;

    /* renamed from: o */
    public C1136m f782o = new C1136m();

    /* renamed from: a */
    static float m4671a(Element element, String str) {
        String attribute = element.getAttribute(str);
        try {
            return Float.parseFloat(attribute);
        } catch (NumberFormatException e) {
            throw new C0179f("Invalid map: Error reading '" + str + "' invalid float: " + attribute, e);
        }
    }

    public C0172a(Element element, C0173b c0173b, C0182i c0182i) {
        PlayerData m4365k;
        C0456j mo3564a;
        NodeList elementsByTagName;
        String textContent;
        this.f778k = -1;
        this.f780m = -1;
        this.f768b = element.getAttribute("name");
        if (this.f768b != null) {
            this.f769c = this.f768b.trim().toLowerCase(Locale.ENGLISH);
        }
        this.f770d = element.getAttribute("type");
        this.f771e = Float.parseFloat(element.getAttribute("x"));
        this.f772f = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.f775i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals(VariableScope.nullOrMissingString)) {
            this.f773g = m4671a(element, "width");
        }
        if (!element.getAttribute("height").equals(VariableScope.nullOrMissingString)) {
            this.f774h = m4671a(element, "height");
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.f776p = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (element3 != null && (elementsByTagName = element3.getElementsByTagName("property")) != null) {
            this.f781n = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                String attribute = element4.getAttribute("name");
                if (element4.hasAttribute("value")) {
                    textContent = element4.getAttribute("value");
                } else {
                    textContent = element4.getTextContent();
                }
                this.f781n.setProperty(attribute, textContent);
            }
        }
        if (element.hasAttribute("gid")) {
            this.f778k = Integer.parseInt(element.getAttribute("gid"));
            this.f779l = c0173b.m4661a(this.f778k);
            if (this.f779l != null) {
                this.f779l.f968p = true;
                this.f779l.f970r = true;
                this.f780m = this.f778k - this.f779l.f960l;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.f778k);
            }
        }
        Properties properties = this.f781n;
        this.f777j = new RectF(this.f771e, this.f772f, this.f771e + this.f773g, this.f772f + this.f774h);
        c0173b.m4653a(this.f777j);
        this.f771e = this.f777j.f234a;
        this.f772f = this.f777j.f235b;
        this.f773g = this.f777j.m5153b();
        this.f774h = this.f777j.m5149c();
        float m5147d = this.f777j.m5147d();
        float m5146e = this.f777j.m5146e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals(VariableScope.nullOrMissingString) && !attribute2.equals("unit") && !attribute2.equals("comment") && !c0182i.f946b.equalsIgnoreCase("triggers")) {
            m4667d("Triggers should be on triggers layer");
        }
        if (properties != null) {
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties.getProperty("team");
                if (property3 == null) {
                    throw new C0179f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    m4365k = PlayerData.m4365k(-1);
                } else {
                    try {
                        m4365k = PlayerData.m4365k(Integer.valueOf(property3).intValue());
                        if (m4365k == null) {
                            GameEngine.m1015b("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (m4365k.m4422b()) {
                            GameEngine.m1015b("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw new C0179f("Unit object team invalid: " + e.getMessage(), e);
                    }
                }
                if (property2 != null) {
                    C0458l m3502n = C0458l.m3502n(property2);
                    if (m3502n == null) {
                        throw new C0179f("Could not find custom unit of:" + property2 + " at x:" + this.f771e + ", y:" + this.f772f);
                    }
                    InterfaceC0303as m3527c = C0458l.m3527c(m3502n);
                    if (m3527c != null) {
                        if (m3527c instanceof C0458l) {
                            m3502n = (C0458l) m3527c;
                        } else {
                            GameEngine.print("replacement not a custom unit:" + m3527c.mo3513i());
                        }
                    }
                    mo3564a = C0458l.m3536a(false, m3502n);
                    if (mo3564a == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    InterfaceC0303as m4174a = EnumC0249ar.m4174a(property);
                    if (m4174a != null) {
                        mo3564a = m4174a.mo3564a();
                    } else {
                        throw new C0179f("Could not find unit type of:" + property + " at x:" + this.f771e + ", y:" + this.f772f);
                    }
                }
                mo3564a.f7172eo = m5147d;
                mo3564a.f7173ep = m5146e;
                if (!mo3564a.mo3397bI()) {
                    mo3564a.mo2864h(this.f775i);
                }
                if (m4365k != null) {
                    mo3564a.mo2928b(m4365k);
                    if (properties.getProperty("type") != null) {
                        mo3564a.mo3450a_(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null && !mo3564a.mo3397bI()) {
                        mo3564a.mo2864h(C0773f.m2196a(mo3564a, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    mo3564a.f1605bO = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    mo3564a.f1606bP = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    mo3564a.f1603bM = true;
                    mo3564a.mo3283n();
                    PlayerData.m4401c(mo3564a);
                    AbstractC1155w.m435dL();
                    return;
                }
                throw new C0179f("team is null:" + property);
            }
        }
    }

    /* renamed from: a */
    public boolean m4675a(AbstractC0244am abstractC0244am) {
        return this.f777j.m5152b((int) abstractC0244am.f7172eo, (int) abstractC0244am.f7173ep);
    }

    /* renamed from: a */
    public void m4674a(String str) {
        if (!this.f782o.contains(str)) {
            this.f782o.add(str);
        }
    }

    /* renamed from: a */
    public String[] m4676a() {
        if (this.f781n == null) {
            return C1151x.f7152h;
        }
        C1136m c1136m = new C1136m();
        Enumeration<?> propertyNames = this.f781n.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.f782o.contains(str)) {
                c1136m.add(str);
            }
        }
        return (String[]) c1136m.toArray(C1151x.f7152h);
    }

    /* renamed from: b */
    public String m4669b(String str) {
        m4674a(str);
        if (this.f781n == null) {
            return null;
        }
        return this.f781n.getProperty(str);
    }

    /* renamed from: a */
    public String m4672a(String str, String str2) {
        m4674a(str);
        if (this.f781n == null) {
            return null;
        }
        return this.f781n.getProperty(str, str2);
    }

    /* renamed from: c */
    public Integer m4668c(String str) {
        String m4672a = m4672a(str, (String) null);
        if (m4672a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m4672a));
        } catch (NumberFormatException e) {
            throw new C0179f(str + ": Unexpected integer value:'" + m4672a + "'");
        }
    }

    /* renamed from: a */
    public C0404bb m4673a(String str, C0404bb c0404bb) {
        String m4672a = m4672a(str, (String) null);
        if (m4672a == null) {
            return c0404bb;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0405bc(null, m4672a));
        String str2 = str + "_";
        C1136m c1136m = new C1136m();
        for (Object obj : this.f781n.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    c1136m.add(str3);
                }
            } else {
                GameEngine.print("createLocaleStringFromProperty: Non string:" + obj);
            }
        }
        Iterator it = c1136m.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String lowerCase = str4.substring(str2.length()).toLowerCase(Locale.ROOT);
            GameEngine.print("createLocaleStringFromProperty checking: " + str4);
            if (lowerCase.length() <= 4) {
                String m4669b = m4669b(str4);
                GameEngine.print("createLocaleStringFromProperty got: " + m4669b);
                GameEngine.print("createLocaleStringFromProperty code: " + lowerCase);
                arrayList.add(new C0405bc(lowerCase, m4669b));
            }
        }
        C0404bb c0404bb2 = new C0404bb((C0405bc[]) arrayList.toArray(new C0405bc[0]));
        c0404bb2.m3910b();
        GameEngine.print("createLocaleStringFromProperty final: " + c0404bb2.m3910b());
        GameEngine.print("createLocaleStringFromProperty locate: " + C0855a.m1711c());
        return c0404bb2;
    }

    /* renamed from: d */
    public void m4667d(String str) {
        GameNetEngine.m1468g("(Map trigger: " + this.f768b + ", type:" + this.f770d + "): " + str);
    }

    /* renamed from: b */
    public String m4670b() {
        return "(Map trigger: " + this.f768b + ", type:" + this.f770d + ")";
    }
}