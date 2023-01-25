package com.corrodinggames.rts.game.p012b;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/j.class */
public class C0183j {

    /* renamed from: a */
    public String f951a;

    /* renamed from: b */
    public C0970e f952b;

    /* renamed from: c */
    public String f953c;

    /* renamed from: d */
    int f954d;

    /* renamed from: e */
    int f955e;

    /* renamed from: f */
    int f956f;

    /* renamed from: g */
    int f957g;

    /* renamed from: j */
    int f958j;

    /* renamed from: k */
    float f959k;

    /* renamed from: l */
    public int f960l;

    /* renamed from: n */
    public short f961n;

    /* renamed from: o */
    public C0173b f962o;

    /* renamed from: t */
    static String f963t = "[EMBED]";

    /* renamed from: u */
    static ArrayList f964u = new ArrayList();

    /* renamed from: h */
    int f965h = 0;

    /* renamed from: i */
    int f966i = 0;

    /* renamed from: m */
    public int f967m = Integer.MAX_VALUE;

    /* renamed from: p */
    public boolean f968p = false;

    /* renamed from: q */
    public boolean f969q = false;

    /* renamed from: r */
    public boolean f970r = false;

    /* renamed from: s */
    public boolean f971s = false;

    /* renamed from: x */
    private HashMap f972x = new HashMap();

    /* renamed from: v */
    Rect f973v = new Rect();

    /* renamed from: w */
    int f974w = -1;

    /* renamed from: a */
    public String m4541a(C0173b c0173b, Element element) {
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            NodeList elementsByTagName = element2.getElementsByTagName("property");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                if (element3.getAttribute("name").equals("embedded_png")) {
                    String attribute = element3.getAttribute("value");
                    if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
                        return attribute;
                    }
                    Node firstChild = element3.getFirstChild();
                    if (firstChild != null) {
                        return firstChild.getNodeValue();
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static Element m4542a(C0173b c0173b, String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c0173b.m4613d("tilesets/", str)).getDocumentElement();
        } catch (Exception e) {
            GameEngine.getGameEngine().m1065a("Unable to load or parse sourced tileset: tilesets/" + str, 1);
            throw new C0179f("Unable to load or parse sourced tileset: tilesets/" + str, e);
        }
    }

    public C0183j(C0173b c0173b, String str, int i) {
        this.f962o = c0173b;
        this.f960l = i;
        Element m4542a = m4542a(c0173b, str);
        this.f951a = str;
        m4538a(m4542a);
    }

    public C0183j(C0173b c0173b, Element element) {
        this.f962o = c0173b;
        this.f960l = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
            element = m4542a(c0173b, attribute);
            this.f951a = attribute;
        }
        m4538a(element);
    }

    /* renamed from: a */
    public void m4538a(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("image");
        if (elementsByTagName.getLength() > 0) {
            this.f953c = GameEngine.m982k(((Element) elementsByTagName.item(0)).getAttribute("source").trim());
        }
        String m4541a = m4541a(this.f962o, element);
        if (m4541a != null) {
            this.f953c = m4539a(m4541a, this.f953c);
        }
        if (this.f953c == null) {
            throw new C0179f("Map tileset is missing an image tag or embedded image data");
        }
        this.f954d = this.f962o.f786n;
        this.f955e = this.f962o.f787o;
        if (element.hasAttribute("tilewidth")) {
            this.f954d = Integer.parseInt(element.getAttribute("tilewidth"));
            this.f955e = Integer.parseInt(element.getAttribute("tileheight"));
        }
        if (GameEngine.m1106C()) {
            this.f954d = this.f962o.f786n;
            this.f955e = this.f962o.f787o;
        }
        int i = 0;
        if (element.hasAttribute("spacing")) {
            i = Integer.parseInt(element.getAttribute("spacing"));
        }
        this.f956f = this.f954d + i;
        this.f957g = this.f955e + i;
        NodeList elementsByTagName2 = element.getElementsByTagName("tile");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            int parseInt = Integer.parseInt(element2.getAttribute("id")) + this.f960l;
            Properties properties = new Properties();
            Element element3 = (Element) element2.getElementsByTagName("properties").item(0);
            if (element3 != null) {
                NodeList elementsByTagName3 = element3.getElementsByTagName("property");
                for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
                    Element element4 = (Element) elementsByTagName3.item(i3);
                    String attribute = element4.getAttribute("name");
                    String attribute2 = element4.getAttribute("value");
                    if ("unit".equalsIgnoreCase(attribute) || "customUnit".equalsIgnoreCase(attribute)) {
                        this.f971s = true;
                    }
                    properties.setProperty(attribute, attribute2);
                }
            }
            this.f972x.put(new Integer(parseInt), properties);
        }
    }

    /* renamed from: a */
    public static String m4539a(String str, String str2) {
        Iterator it = f964u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k.f980f)) {
                return c0184k.f978d;
            }
        }
        C0184k c0184k2 = new C0184k();
        c0184k2.f976b = false;
        c0184k2.f979e = null;
        c0184k2.f980f = str;
        c0184k2.f977c = f963t;
        c0184k2.f978d = f963t + C0184k.f975a;
        c0184k2.f981g = str2;
        C0184k.f975a++;
        f964u.add(c0184k2);
        return c0184k2.f978d;
    }

    /* renamed from: a */
    public static C0970e m4540a(String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        String str2 = "tilesets/bitmaps/";
        if (str.startsWith(f963t)) {
            str2 = f963t;
        }
        C0184k c0184k = null;
        Iterator it = f964u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0184k c0184k2 = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k2.f978d) && str2.equalsIgnoreCase(c0184k2.f977c)) {
                c0184k = c0184k2;
                break;
            }
        }
        if (c0184k != null) {
            if (c0184k.f980f != null) {
                try {
                    C0970e mo184a = gameEngine.f6326bO.mo184a((InputStream) new BufferedInputStream(C0178e.m4567a(c0184k.f980f, "base64", VariableScope.nullOrMissingString)), false);
                    if (mo184a == null) {
                        throw new C0179f("Embedded tilesetBitmap is null for: " + str);
                    }
                    c0184k.f979e = mo184a;
                    c0184k.f980f = null;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw new C0179f("Error loading embedded base64 image:" + c0184k.f981g + " - " + e.getMessage());
                }
            }
            c0184k.f976b = true;
            return c0184k.f979e;
        }
        try {
            InputStream m4613d = gameEngine.f6323bL.m4613d(str2, str);
            C0970e mo184a2 = gameEngine.f6326bO.mo184a(m4613d, false);
            if (m4613d != null) {
                try {
                    m4613d.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (mo184a2 == null) {
                throw new RuntimeException("tilesetBitmap is null for: " + str);
            }
            mo184a2.m902a("tilesets/" + str);
            C0184k c0184k3 = new C0184k();
            c0184k3.f976b = true;
            c0184k3.f979e = mo184a2;
            c0184k3.f977c = str2;
            c0184k3.f978d = str;
            f964u.add(c0184k3);
            return c0184k3.f979e;
        } catch (IOException e3) {
            throw new C0179f("Image file could not be found or loaded: " + str2 + str, e3);
        }
    }

    /* renamed from: a */
    public static void m4546a() {
        Iterator it = f964u.iterator();
        while (it.hasNext()) {
            ((C0184k) it.next()).f976b = false;
        }
    }

    /* renamed from: b */
    public static void m4537b() {
        Iterator it = f964u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (!c0184k.f976b) {
                if (c0184k.f979e != null) {
                    c0184k.f979e.mo50o();
                    c0184k.f979e = null;
                }
                c0184k.f980f = null;
                it.remove();
            }
        }
    }

    /* renamed from: c */
    void m4534c() {
        this.f952b = m4540a(this.f953c);
        this.f958j = this.f952b.mo387m() / this.f956f;
        if (this.f958j == 0) {
            this.f958j = 1;
        }
        this.f959k = 1.0f / this.f958j;
    }

    /* renamed from: a */
    public Properties m4545a(int i) {
        return (Properties) this.f972x.get(new Integer(i));
    }

    /* renamed from: a */
    public final void m4543a(int i, Rect rect) {
        int i2 = i % this.f958j;
        int i3 = (int) (i * this.f959k);
        int i4 = this.f965h + (i2 * this.f956f);
        int i5 = this.f966i + (i3 * this.f957g);
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + this.f954d;
        rect.f233d = i5 + this.f955e;
    }

    /* renamed from: b */
    public final Rect m4536b(int i) {
        if (this.f974w == i) {
            return this.f973v;
        }
        this.f974w = i;
        m4543a(i, this.f973v);
        return this.f973v;
    }

    /* renamed from: c */
    public void m4533c(int i) {
        this.f967m = i;
    }

    /* renamed from: d */
    public boolean m4531d(int i) {
        return i >= this.f960l && i <= this.f967m;
    }

    /* renamed from: d */
    public void m4532d() {
        this.f952b = null;
        this.f962o = null;
        this.f972x = null;
    }

    /* renamed from: b */
    public Integer m4535b(String str, String str2) {
        for (Map.Entry entry : this.f972x.entrySet()) {
            Integer num = (Integer) entry.getKey();
            String property = ((Properties) entry.getValue()).getProperty(str);
            if (property != null && property.equals(str2)) {
                return num;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m4544a(int i, int i2) {
        int mo387m;
        if (this.f952b == null) {
            GameEngine.m5460e("getIndexOffsetByPosition tilesetBitmap == null");
            mo387m = 3;
        } else if (this.f954d == 0) {
            GameEngine.m5460e("getIndexOffsetByPosition tileWidth==0");
            mo387m = 3;
        } else {
            mo387m = this.f952b.mo387m() / this.f954d;
        }
        return i + (i2 * mo387m);
    }
}