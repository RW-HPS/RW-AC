package com.corrodinggames.rts.game.maps;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.corrodinggames.rts.AssetsID;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.al;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.as;
import com.corrodinggames.rts.game.units.custom.b.n;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.d.d;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.a;
import com.corrodinggames.rts.gameFramework.net.GameInputStream;
import com.corrodinggames.rts.gameFramework.net.GameOutputStream;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.unitAction.y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.gameFramework.utility.ae;
import com.corrodinggames.rts.gameFramework.utility.af;
import com.corrodinggames.rts.gameFramework.utility.j;
import com.corrodinggames.rts.gameFramework.w;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.corrodinggames.rts.game.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b.class */
public final class b {
    static boolean f;
    public static h l;
    public static h m;
    public int n;
    public int o;
    public int p;
    public int q;
    public float r;
    public float s;
    public Layer x;

    /* renamed from: C */
    public int width;

    /* renamed from: D */
    public int height;
    public static e K;
    public static y L;
    public byte[][] M;
    public byte[][] N;
    public ObjectGroup Q;
    public boolean R;
    public boolean S;
    public int T;
    public int U;
    public boolean W;
    public boolean X;
    public int Y;
    public int Z;
    Paint ab;
    Paint ac;
    Paint ad;
    Paint ae;
    Paint af;
    Paint ag;
    HashMap ah;
    float ai;
    long ap;
    float aq;
    float ar;
    static final boolean a = false;
    static final boolean b = false;
    static final boolean c = false;
    public static boolean d = false;
    static ReentrantLock e = new ReentrantLock();
    static Paint g = new Paint();
    static Paint h = new Paint();
    static Paint i = new Paint();
    static Paint j = new Paint();
    public static boolean H = false;
    public static boolean I = false;
    public static boolean J = false;
    public static c al = new c();
    boolean[] k = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: t */
    public ArrayList tileSets = new ArrayList();
    public Layer u = null;
    public Layer v = null;
    public Layer w = null;
    public Layer y = null;
    public ArrayList z = new ArrayList();
    public ArrayList A = new ArrayList();
    private int as = 1;
    public g[] B = new g[0];
    public boolean E = true;
    public boolean F = false;
    public boolean G = false;
    Rect O = new Rect();
    protected ArrayList P = new ArrayList();
    public PointF V = new PointF();
    float aa = 0.0f;
    float aj = 1.0f;
    int ak = 0;
    Paint am = new Paint();
    Rect an = new Rect();
    Rect ao = new Rect();

    public static void a() {
        if (f) {
            return;
        }
        e.lock();
    }

    public static void b() {
        if (f) {
            return;
        }
        e.unlock();
    }

    public static void c() {
        GameEngine gameEngine = GameEngine.getGameEngine();
        g.a(150, 255, 255, 255);
        g.a(Paint.Style.STROKE);
        g.a(1.0f);
        gameEngine.a(g, 16.0f);
        h.a(150, 255, 0, 0);
        h.a(Paint.Style.STROKE);
        h.a(1.0f);
        i.a(150, 0, 255, 0);
        i.a(Paint.Style.STROKE);
        i.a(1.0f);
        j.a(150, 255, 0, 0);
        long loadAllUnitsTook = Unit.loadAllUnitsTook();
        e a2 = gameEngine.bO.a(AssetsID.drawable.fog_smooth);
        K = gameEngine.bO.b(((20 + 2) * 16) + 1, ((20 + 2) * 16) + 1, true);
        K.m = true;
        K.b(true);
        L = gameEngine.bO.b(K);
        e b2 = gameEngine.bO.b(20 + 1, 20 + 1, true);
        y b3 = gameEngine.bO.b(b2);
        a(b(1), 2, 5, true, b2, b3, a2);
        a(b(2), 0, 5, true, b2, b3, a2);
        a(b(4), 0, 3, true, b2, b3, a2);
        a(b(8), 2, 3, true, b2, b3, a2);
        a(a(16, 1, 2), 1, 0, true, b2, b3, a2);
        a(a(32, 2, 4), 2, 1, true, b2, b3, a2);
        a(a(64, 8, 4), 1, 2, true, b2, b3, a2);
        a(a(-128, 1, 8), 0, 1, true, b2, b3, a2);
        a(a(16 + 32, 2, 1, 4), 2, 0, true, b2, b3, a2);
        a(a(32 + 64, 4, 8, 2), 2, 2, true, b2, b3, a2);
        a(a(64 - 128, 8, 4, 1), 0, 2, true, b2, b3, a2);
        a(a((-128) + 16, 1, 8, 2), 0, 0, true, b2, b3, a2);
        a(b(1 + 2), a(2, 5, 0, 5), true, b2, b3, a2);
        a(b(2 + 4), a(0, 5, 0, 3), true, b2, b3, a2);
        a(b(4 + 8), a(0, 3, 2, 3), true, b2, b3, a2);
        a(b(8 + 1), a(2, 3, 2, 5), true, b2, b3, a2);
        a(a(16 + 32 + 64, 1, 2, 4, 8), a(2, 0, 2, 2), true, b2, b3, a2);
        a(a((32 + 64) - 128, 1, 2, 4, 8), a(2, 2, 0, 2), true, b2, b3, a2);
        a(a((64 - 128) + 16, 1, 2, 4, 8), a(0, 2, 0, 0), true, b2, b3, a2);
        a(a((-128) + 16 + 32, 1, 2, 4, 8), a(0, 0, 2, 0), true, b2, b3, a2);
        a(b(16 + 64), a(1, 0, 1, 2), true, b2, b3, a2);
        a(b((-128) + 32), a(0, 1, 2, 1), true, b2, b3, a2);
        a(b(1 + 4), a(2, 5, 0, 3), true, b2, b3, a2);
        a(b(2 + 8), a(0, 5, 2, 3), true, b2, b3, a2);
        a(a(16 + 4, 2, 1), a(1, 0, 0, 3), true, b2, b3, a2);
        a(a(64 + 2, 4, 8), a(1, 2, 0, 5), true, b2, b3, a2);
        a(a((-128) + 2, 1, 8), a(0, 1, 0, 5), true, b2, b3, a2);
        a(a(32 + 1, 2, 4), a(2, 1, 2, 5), true, b2, b3, a2);
        a(a(16 + 8, 2, 1), a(1, 0, 2, 3), true, b2, b3, a2);
        a(a(64 + 1, 4, 8), a(1, 2, 2, 5), true, b2, b3, a2);
        a(a((-128) + 4, 1, 8), a(0, 1, 0, 3), true, b2, b3, a2);
        a(a(32 + 8, 2, 4), a(2, 1, 2, 3), true, b2, b3, a2);
        a(a(16 + 4 + 8, 2, 1), a(1, 0, 0, 3, 2, 3), true, b2, b3, a2);
        a(a(64 + 2 + 1, 4, 8), a(1, 2, 0, 5, 2, 5), true, b2, b3, a2);
        a(a((-128) + 2 + 4, 1, 8), a(0, 1, 2, 5, 2, 3), true, b2, b3, a2);
        a(a(32 + 1 + 8, 2, 4), a(2, 1, 0, 5, 0, 3), true, b2, b3, a2);
        a(b(-1), a(1, 4), true, b2, b3, a2);
        L.p();
        L.q();
        L = null;
        b3.q();
        Unit.a("smoothFog load took:", loadAllUnitsTook);
        d();
        l = new h(1.0f, false);
        l.a();
        m = new h(0.5f, false);
        m.a();
    }

    public static void d() {
        if (H) {
            return;
        }
        H = true;
        I = GameEngine.getGameEngine().settingsEngine.softFogFading;
        if (GameEngine.at() && Build.VERSION.SDK_INT > 26) {
            long maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
            GameEngine.m328e("MaxHeapSizeInMB:" + maxMemory);
            if (maxMemory > 200) {
                GameEngine.m328e("enabling softFades");
                I = true;
            }
        }
    }

    private static int[] b(int i2) {
        return new int[]{i2};
    }

    private static int[] a(int i2, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i2));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i2 + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i2 + iArr[0]));
            arrayList.add(Integer.valueOf(i2 + iArr[1]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i2 + iArr[0]));
            arrayList.add(Integer.valueOf(i2 + iArr[1]));
            arrayList.add(Integer.valueOf(i2 + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i2 + iArr[0]));
            arrayList.add(Integer.valueOf(i2 + iArr[1]));
            arrayList.add(Integer.valueOf(i2 + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i2 + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i2 + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            if (arrayList.get(i3) != null) {
                iArr2[i3] = ((Integer) arrayList.get(i3)).intValue();
            }
        }
        return iArr2;
    }

    private static int[] a(int... iArr) {
        return iArr;
    }

    private static void a(int[] iArr, int i2, int i3, boolean z, e eVar, y yVar, e eVar2) {
        a(iArr, a(i2, i3), z, eVar, yVar, eVar2);
    }

    private static void a(int[] iArr, int[] iArr2, boolean z, e eVar, y yVar, e eVar2) {
        if (z) {
            yVar.o();
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        rect.a(0, 0, 20, 20);
        for (int i2 = 0; i2 < iArr2.length; i2 += 2) {
            int i3 = iArr2[i2 + 0] * 20;
            int i4 = iArr2[i2 + 1] * 20;
            rect2.a(i3, i4, i3 + 20, i4 + 20);
            yVar.a(eVar2, rect2, rect, (Paint) null);
            rect4.a(rect2.c - 1, rect2.b, rect2.c, rect2.d);
            rect3.a(rect.c, rect.b, rect.c + 1, rect.d);
            yVar.a(eVar2, rect4, rect3, (Paint) null);
            rect4.a(rect2.a, rect2.d - 1, rect2.c, rect2.d);
            rect3.a(rect.a, rect.d, rect.c, rect.d + 1);
            yVar.a(eVar2, rect4, rect3, (Paint) null);
        }
        yVar.p();
        for (int i5 : iArr) {
            a(i5 + 128, eVar);
        }
    }

    public static void a(int i2, e eVar) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.a(0, 0, 20, 20);
        a(i2, rect);
        h.a(L, eVar, rect2, rect, (Paint) null);
    }

    public static void a(int i2, Rect rect) {
        int i3 = ((i2 % 16) * (20 + 2)) + 1;
        int i4 = (((int) (i2 * 0.0625f)) * (20 + 2)) + 1;
        rect.a = i3;
        rect.b = i4;
        rect.c = i3 + 20;
        rect.d = i4 + 20;
    }

    public final short a(g gVar) {
        if (this.as >= this.B.length) {
            g[] gVarArr = new g[f.c(this.B.length + 100, 32767)];
            System.arraycopy(this.B, 0, gVarArr, 0, this.B.length);
            this.B = gVarArr;
        }
        int i2 = this.as;
        if (this.as < 32766) {
            this.as++;
        } else {
            GameEngine.print("Max unique tile limit reached at: " + this.as);
        }
        this.B[i2] = gVar;
        return (short) i2;
    }

    public final g a(short s) {
        return this.B[s];
    }

    public g a(g gVar, int i2, int i3) {
        int length;
        if (gVar != null && gVar.m != null && (((i2 * 13) + (i3 * 1313)) % (gVar.m.length + 1)) - 1 >= 0) {
            return gVar.m[length];
        }
        return gVar;
    }

    public boolean a(float f2, float f3, PlayerData playerData) {
        if (this.E) {
            int i2 = (int) (f2 * this.r);
            int i3 = (int) (f3 * this.s);
            if (playerData.N != null && c(i2, i3) && playerData.N[i2][i3] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    public boolean a(int i2, int i3, PlayerData playerData) {
        if (this.E && playerData.N != null && c(i2, i3) && playerData.N[i2][i3] >= 5) {
            return false;
        }
        return true;
    }

    public void a(float f2, float f3) {
        this.T = (int) (f2 * this.r);
        this.U = (int) (f3 * this.s);
    }

    public void a(int i2, int i3) {
        this.T = i2 * this.n;
        this.U = i3 * this.o;
    }

    public void b(int i2, int i3) {
        this.T = (i2 * this.n) + this.p;
        this.U = (i3 * this.o) + this.q;
    }

    public PointF a(Point point) {
        this.V.setSite(point.a * this.n, point.b * this.o);
        return this.V;
    }

    public void b(float f2, float f3) {
        a(f2, f3);
        a(this.T, this.U);
    }

    public float a(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > i()) {
            f2 = i();
        }
        return f2;
    }

    public float b(float f2) {
        if (f2 < 0.0f) {
            f2 = 0.0f;
        }
        if (f2 > j()) {
            f2 = j();
        }
        return f2;
    }

    public final boolean c(int i2, int i3) {
        return i2 >= 0 && i2 < this.width && i3 >= 0 && i3 < this.height;
    }

    public g c(float f2, float f3) {
        int i2 = (int) (f2 * this.r);
        int i3 = (int) (f3 * this.s);
        if (i2 < 0 || i2 >= this.width || i3 < 0 || i3 >= this.height) {
            return null;
        }
        return this.u.a(i2, i3);
    }

    public g d(int i2, int i3) {
        if (c(i2, i3)) {
            return this.u.a(i2, i3);
        }
        return null;
    }

    public g e(int i2, int i3) {
        if (!c(i2, i3) || this.y == null) {
            return null;
        }
        return this.y.a(i2, i3);
    }

    void a(RectF rectF) {
        if (GameEngine.C()) {
            rectF.a *= this.n / 20;
            rectF.c *= this.n / 20;
            rectF.b *= this.o / 20;
            rectF.d *= this.o / 20;
        }
    }

    public b() {
        this.n = 20;
        this.o = 20;
        if (GameEngine.C()) {
            this.n = 60;
            this.o = 60;
        }
        this.p = this.n / 2;
        this.q = this.o / 2;
        this.r = 1.0f / this.n;
        this.s = 1.0f / this.o;
        this.ab = new ag();
        this.ab.a(100, 255, 0, 0);
        this.ab.b(16.0f);
        this.ac = new ag();
        this.ac.a(Paint.Style.STROKE);
        this.ac.a(1.0f);
        this.ac.a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0);
        this.ad = new ag();
        this.ad.a(Paint.Style.STROKE);
        this.ad.a(1.0f);
        this.ad.a(100, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 0);
        this.ae = new ag();
        this.ae.a(Paint.Style.STROKE);
        this.ae.a(1.0f);
        this.ae.a(255, 175, 0, 0);
        this.af = new ag();
        this.af.a(155, 175, 0, 0);
        this.ag = new ag();
        this.ag.a(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    public static void a(String str, GameOutputStream gameOutputStream) {
        InputStream b2 = b(str);
        if (b2 == null) {
            throw new IOException("writeMapStream: Could not find map:" + str);
        }
        int a2 = (int) a(str);
        if (a2 == -1) {
            new IOException("writeMapStream: Failed to get map size");
        }
        if (a2 == 0) {
            new IOException("writeMapStream: Got empty map size");
        }
        GameEngine.m328e("Sending map stream of size: " + a2);
        gameOutputStream.a(b2, a2);
    }

    public static long a(String str) {
        String str2 = VariableScope.nullOrMissingString + str;
        String e2 = a.e(str2);
        af a2 = ae.a(e2);
        if (a2 != null && !e2.endsWith(".rwmod")) {
            long a3 = a2.a(e2, false);
            if (a3 == -1) {
            }
            return a3;
        } else if (a.c(str2)) {
            try {
                return GameEngine.getGameEngine().am.d().b(e2).getLength();
            } catch (IOException e3) {
                throw new RuntimeException(e3);
            }
        } else {
            return new File(e2).length();
        }
    }

    public static InputStream b(String str) {
        InputStream d2;
        InputStream d3 = d(str);
        if (d3 == null && (d2 = d(str.replace(".tmx", VariableScope.nullOrMissingString) + "_moved")) != null) {
            String trim = f.a(d2).trim();
            GameEngine.m328e("Found moved map at:" + trim);
            d3 = d(trim);
        }
        return d3;
    }

    public static String c(String str) {
        if (str == null) {
            return null;
        }
        return a.e(str);
    }

    public static InputStream d(String str) {
        String c2 = c(VariableScope.nullOrMissingString + str);
        GameEngine.m328e("Mapfile: " + c2);
        return a.k(c2);
    }

    public void a(Document document, OutputStream outputStream) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    public void a(InputStream inputStream, OutputStream outputStream) {
        float f2;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.1
            @Override // org.xml.sax.EntityResolver
            public InputSource resolveEntity(String str, String str2) {
                return new InputSource(new ByteArrayInputStream(new byte[0]));
            }
        });
        Document parse = newDocumentBuilder.parse(inputStream);
        Element documentElement = parse.getDocumentElement();
        String attribute = documentElement.getAttribute("orientation");
        if (!attribute.equals("orthogonal")) {
            throw new f("Only orthogonal maps are supported, found: " + attribute);
        }
        NodeList elementsByTagName = documentElement.getElementsByTagName("SOMETHING");
        for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
            Element element = (Element) elementsByTagName.item(i2);
        }
        NodeList elementsByTagName2 = documentElement.getElementsByTagName("layer");
        for (int i3 = 0; i3 < elementsByTagName2.getLength(); i3++) {
            Element element2 = (Element) elementsByTagName2.item(i3);
            if ("units".equalsIgnoreCase(element2.getAttribute("name"))) {
                element2.getParentNode().removeChild(element2);
            }
        }
        NodeList elementsByTagName3 = documentElement.getElementsByTagName("objectgroup");
        for (int i4 = 0; i4 < elementsByTagName3.getLength(); i4++) {
            Element element3 = (Element) elementsByTagName3.item(i4);
            if ("UnitObjects".equalsIgnoreCase(element3.getAttribute("name"))) {
                element3.getParentNode().removeChild(element3);
            }
        }
        Element createElement = parse.createElement("objectgroup");
        createElement.setAttribute("name", "UnitObjects");
        Iterator it = am.bF().iterator();
        while (it.hasNext()) {
            am amVar = (am) it.next();
            if ((amVar instanceof am) && (!(amVar instanceof al) || !((al) amVar).bM)) {
                if (!amVar.bV && !amVar.u()) {
                    n dn = amVar.dn();
                    if (amVar.cO != null && dn != null) {
                        if (!dn.D) {
                        }
                    } else {
                        Element createElement2 = parse.createElement("object");
                        int i5 = 20;
                        if (20 < amVar.cj) {
                            i5 = (int) amVar.cj;
                        }
                        createElement2.setAttribute("name", amVar.r().i() + " (t:" + amVar.bX.site + ")");
                        createElement2.setAttribute("x", VariableScope.nullOrMissingString + (amVar.eo - (i5 / 2)));
                        createElement2.setAttribute("y", VariableScope.nullOrMissingString + (amVar.ep - (i5 / 2)));
                        createElement2.setAttribute("width", VariableScope.nullOrMissingString + i5);
                        createElement2.setAttribute("height", VariableScope.nullOrMissingString + i5);
                        if (amVar.bI()) {
                            f2 = amVar.cg;
                        } else {
                            f2 = amVar.cg + 90.0f;
                        }
                        createElement2.setAttribute("rotation", VariableScope.nullOrMissingString + f2);
                        Integer a2 = a(amVar.r());
                        if (a2 != null) {
                            createElement2.setAttribute("gid", VariableScope.nullOrMissingString + a2);
                        }
                        Element createElement3 = parse.createElement("properties");
                        Element createElement4 = parse.createElement("property");
                        createElement4.setAttribute("name", "unit");
                        createElement4.setAttribute("value", amVar.r().i());
                        createElement3.appendChild(createElement4);
                        Element createElement5 = parse.createElement("property");
                        createElement5.setAttribute("name", "team");
                        createElement5.setAttribute("value", VariableScope.nullOrMissingString + amVar.bX.site);
                        createElement3.appendChild(createElement5);
                        createElement2.appendChild(createElement3);
                        createElement.appendChild(createElement2);
                    }
                }
            }
        }
        documentElement.appendChild(createElement);
        a(parse, outputStream);
    }

    public boolean a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        try {
            b(str, str2);
            gameEngine.bS.h.a((String) null, "Map exported.");
            return true;
        } catch (f e2) {
            gameEngine.c("Error exporting map", "Failed to export map. error: " + e2.getMessage());
            return false;
        } catch (IOException e3) {
            e3.printStackTrace();
            gameEngine.c("Error exporting map", "Failed to export map. IO error: " + e3.getMessage());
            return false;
        } catch (NoClassDefFoundError e4) {
            e4.printStackTrace();
            gameEngine.c("Error exporting map", "Failed to export map. Class not found: " + e4.getMessage());
            return false;
        }
    }

    public void b(String str, String str2) {
        GameEngine.m328e(" --- Saving map:" + str + " to: " + str2);
        InputStream b2 = b(str);
        if (b2 == null) {
            throw new IOException("Could not find orginal map: " + str);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(b2);
        String e2 = a.e(str2);
        File parentFile = new File(e2).getParentFile();
        if (!a.i(parentFile.getAbsolutePath())) {
            a.l(parentFile.getAbsolutePath());
        }
        if (!a.f(parentFile.getAbsolutePath())) {
            GameEngine.print("Save Map: Could not create parent directory");
        }
        try {
            OutputStream b3 = a.b(e2, false);
            if (b3 == null) {
                throw new IOException("Failed to get save target:" + e2);
            }
            try {
                a(bufferedInputStream, b3);
                try {
                    b3.close();
                    bufferedInputStream.close();
                    b2.close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            } catch (IOException e4) {
                throw new IOException(e4);
            } catch (ParserConfigurationException e5) {
                throw new IOException(e5);
            } catch (TransformerException e6) {
                throw new IOException(e6);
            } catch (SAXException e7) {
                throw new IOException(e7);
            }
        } catch (FileNotFoundException e8) {
            throw new IOException("Failed to open save target:" + e2);
        }
    }

    public void a(String str, boolean z) {
        GameEngine.m328e(" --- Loading map ---");
        InputStream b2 = b(str);
        if (b2 == null) {
            throw new f("Could not find map: " + a.d(c(str)));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(b2);
        a(bufferedInputStream, z);
        try {
            bufferedInputStream.close();
            b2.close();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }

    public TileSet e(String str) {
        TileSet tileSet = null;
        Iterator it = this.tileSets.iterator();
        while (it.hasNext()) {
            TileSet tileSet2 = (TileSet) it.next();
            if (str.equals(tileSet2.a)) {
                tileSet = tileSet2;
            }
        }
        if (tileSet == null) {
            int i2 = 1;
            if (this.tileSets.size() > 0) {
                TileSet tileSet3 = (TileSet) this.tileSets.get(this.tileSets.size() - 1);
                i2 = tileSet3.l + 100;
                tileSet3.c(i2);
            }
            TileSet tileSet4 = new TileSet(this, str, i2 + 1);
            this.tileSets.add(tileSet4);
            tileSet = tileSet4;
        }
        if (tileSet.b == null) {
            tileSet.c();
        }
        return tileSet;
    }

    public g a(String str, int i2, int i3) {
        TileSet e2 = e(str);
        if (this.ah == null) {
            this.ah = new HashMap();
        }
        int a2 = e2.l + e2.a(i2, i3);
        g gVar = (g) this.ah.get(Integer.valueOf(a2));
        if (gVar != null) {
            return gVar;
        }
        g a3 = g.a(this, this.u, e2, a2 - e2.l, (short) 0, (short) 0, true);
        this.ah.put(Integer.valueOf(a2), a3);
        return a3;
    }

    public void a(InputStream inputStream, boolean z) {
        int a2;
        NodeList elementsByTagName;
        this.A.clear();
        l.b();
        m.b();
        try {
            GameEngine.m328e("---- Loading map data ----");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.2
                @Override // org.xml.sax.EntityResolver
                public InputSource resolveEntity(String str, String str2) {
                    return new InputSource(new ByteArrayInputStream(new byte[0]));
                }
            });
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new f("Only orthogonal maps are supported, found: " + attribute);
            }
            int width = Integer.parseInt(documentElement.getAttribute("width"));
            int height = Integer.parseInt(documentElement.getAttribute("height"));
            this.width = width;
            this.height = height;
            GameEngine.m328e("Map size: " + this.width + ", " + this.height);
            this.ar = 150.0f;
            if (this.E) {
                GameEngine.m328e("Setting up team fog..");
                for (int i2 = 0; i2 < PlayerData.c; i2++) {
                    PlayerData playerData = PlayerData.getPlayerData(i2);
                    if (playerData != null) {
                        playerData.L = this.width;
                        playerData.M = this.height;
                        playerData.N = new byte[this.width][this.height];
                        for (int i3 = 0; i3 < this.width; i3++) {
                            for (int i4 = 0; i4 < this.height; i4++) {
                                playerData.N[i3][i4] = 10;
                            }
                        }
                    }
                }
            } else {
                GameEngine.m328e("No team fog on this map..");
                for (int i5 = 0; i5 < PlayerData.c; i5++) {
                    PlayerData playerData2 = PlayerData.getPlayerData(i5);
                    if (playerData2 != null) {
                        playerData2.N = null;
                    }
                }
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (element != null && (elementsByTagName = element.getElementsByTagName("property")) != null) {
                Properties properties = new Properties();
                for (int i6 = 0; i6 < elementsByTagName.getLength(); i6++) {
                    Element element2 = (Element) elementsByTagName.item(i6);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            TileSet tileSet = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                TileSet tileSet2 = new TileSet(this, (Element) elementsByTagName2.item(s));
                tileSet2.n = s;
                if (tileSet != null) {
                    tileSet.c(tileSet2.l - 1);
                }
                tileSet = tileSet2;
                this.tileSets.add(tileSet2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i7 = 0; i7 < elementsByTagName3.getLength(); i7++) {
                Element element3 = (Element) elementsByTagName3.item(i7);
                String attribute2 = element3.getAttribute("name");
                if (!"set".equalsIgnoreCase(attribute2) && !"set-disabled".equalsIgnoreCase(attribute2)) {
                    Layer layer = new Layer(this, element3);
                    layer.j = i7;
                    this.z.add(layer);
                }
            }
            Iterator it = this.z.iterator();
            while (it.hasNext()) {
                Layer layer2 = (Layer) it.next();
                if (layer2.r) {
                    this.u = layer2;
                }
                if (layer2.k.equalsIgnoreCase("grounddetails")) {
                    this.v = layer2;
                }
                if (layer2.k.equalsIgnoreCase("grounddetails2")) {
                    this.w = layer2;
                }
                if (layer2.k.equalsIgnoreCase("Items") || layer2.k.equalsIgnoreCase("Objects")) {
                    this.y = layer2;
                }
                if (layer2.k.equalsIgnoreCase("PathingOverride")) {
                    this.x = layer2;
                }
            }
            if (this.u == null) {
                throw new f("'Ground' layer was not found in map, this layer is required");
            }
            if (this.B == null || this.B.length == 0) {
                throw new f("Invalid map, no tiles have been set");
            }
            if (!GameEngine.C() && !GameEngine.D()) {
                for (int i8 = 0; i8 < this.width; i8++) {
                    for (int i9 = 0; i9 < this.height; i9++) {
                        if (this.u.a(i8, i9) == null) {
                            throw new f("An empty tile on the Ground layer at " + i8 + "," + i9 + " all tiles must be filled");
                        }
                    }
                }
            }
            if (this.y == null) {
                throw new f("'Items' layer was not found in map, this layer is required");
            }
            NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int i10 = 0; i10 < elementsByTagName4.getLength(); i10++) {
                ObjectGroup objectGroup = new ObjectGroup((Element) elementsByTagName4.item(i10), this);
                objectGroup.a = i10;
                this.P.add(objectGroup);
            }
            TileSet.a();
            Iterator it2 = this.tileSets.iterator();
            while (it2.hasNext()) {
                TileSet tileSet3 = (TileSet) it2.next();
                if (tileSet3.q) {
                    tileSet3.c();
                }
            }
            TileSet.b();
            int i11 = 0;
            while (i11 <= 1) {
                Iterator it3 = this.z.iterator();
                while (it3.hasNext()) {
                    Layer layer3 = (Layer) it3.next();
                    if ((layer3 == this.u) == (i11 == 0)) {
                        layer3.w = false;
                        if (layer3.s) {
                            for (int i12 = 0; i12 < this.width; i12++) {
                                for (int i13 = 0; i13 < this.height; i13++) {
                                    g a3 = layer3.a(i12, i13);
                                    if (a3 != null && a3.c == -2) {
                                        a3.c = l.a(a3.a, a3.b);
                                        if (a3.c >= 0 && (a2 = m.a(a3.a, a3.b)) != a3.c) {
                                            throw new RuntimeException("Meta index mismatch: " + a2 + " vs " + a3.c);
                                        }
                                        if (a3.c < 0) {
                                            layer3.w = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i11++;
            }
            l.c();
            m.c();
            this.Q = f("triggers");
            a aVar = null;
            if (this.Q != null) {
                aVar = this.Q.a("map_info");
            }
            boolean z2 = false;
            boolean z3 = false;
            GameEngine gameEngine = GameEngine.getGameEngine();
            gameEngine.ce = null;
            String str = null;
            String str2 = null;
            if (aVar != null) {
                String b2 = aVar.b("type");
                str2 = aVar.b("fog");
                if ("mission".equalsIgnoreCase(b2) || "survival".equalsIgnoreCase(b2) || "challenge".equalsIgnoreCase(b2) || "skirmish".equalsIgnoreCase(b2)) {
                    str = b2;
                } else {
                    GameEngine.print("Unknown map type:" + b2);
                }
            } else {
                GameEngine.print("Map type not found on mapInfo");
            }
            if (str == null) {
                GameEngine.print("Defaulting to skirmish map type");
                str = "skirmish";
            } else {
                GameEngine.print("Map type: " + str);
            }
            gameEngine.ce = new com.corrodinggames.rts.gameFramework.status.f();
            gameEngine.ce.a(z);
            if (str2 != null && !VariableScope.nullOrMissingString.equals(str2)) {
                if (!str2.equalsIgnoreCase("none")) {
                    z2 = true;
                    if (str2.equalsIgnoreCase("los")) {
                        z3 = true;
                    } else if (!str2.equalsIgnoreCase("map")) {
                        GameEngine.m328e("Unknown map fog type: " + str2);
                    }
                }
            } else if (GameEngine.av() && !gameEngine.N()) {
                z2 = true;
                if (str != null && str.equalsIgnoreCase("skirmish")) {
                    z3 = true;
                }
            }
            if (!z2) {
                this.E = false;
            }
            if (z2 && z3) {
                this.F = true;
            }
            this.W = true;
        } catch (IOException e2) {
            throw new f("Failed to parse map", e2);
        } catch (ParserConfigurationException e3) {
            throw new RuntimeException("Failed to parse map", e3);
        } catch (SAXException e4) {
            GameEngine.m328e(" --- SAXException: Failed to parse map - " + e4.getMessage() + " ---");
            try {
                GameEngine.m328e("available:" + inputStream.available());
                inputStream.reset();
                GameEngine.m328e("after reset:" + inputStream.available());
            } catch (IOException e5) {
                GameEngine.m328e("-- error writing debug info --");
                e5.printStackTrace();
            }
            throw new f("Failed to parse map - " + e4.getMessage(), e4);
        }
    }

    public void e() {
    }

    public void a(ScorchMark scorchMark) {
        if (GameEngine.aU && !GameEngine.aW) {
            return;
        }
        al.a(scorchMark);
    }

    public void a(com.corrodinggames.rts.game.units.y yVar, int i2, int i3, int i4, int i5, int i6, int i7, y yVar2, boolean z, int i8) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = gameEngine.bL;
        as i9 = gameEngine.bS.ac.i();
        ao o = i9.o();
        for (int i10 = i2; i10 <= i4; i10++) {
            for (int i11 = i3; i11 <= i5; i11++) {
                boolean a2 = d.a(yVar, i9, o, i10, i11, i8);
                int i12 = (i10 * bVar.n) - i6;
                int i13 = (i11 * bVar.o) - i7;
                this.an.a(i12, i13, (i12 + bVar.n) - 1, (i13 + bVar.o) - 1);
                if (z) {
                    if (a2) {
                        yVar2.b(this.an, bVar.ad);
                    } else {
                        yVar2.b(this.an, bVar.af);
                        yVar2.b(this.an, bVar.ae);
                    }
                } else if (a2) {
                    yVar2.b(this.an, bVar.ac);
                } else {
                    yVar2.b(this.an, bVar.ae);
                }
            }
        }
    }

    public static void f() {
        al.d();
    }

    public void c(float f2) {
        al.a(f2);
    }

    public void g() {
        al.c();
    }

    public void d(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        boolean at = GameEngine.at();
        if (at) {
            gameEngine.bO.a(e);
        }
        c(f2);
        if (at) {
            gameEngine.bO.b(e);
        }
        if (this.X) {
            new Rect();
            Rect rect = new Rect();
            int i2 = this.Y * this.n;
            int i3 = this.Z * this.o;
            rect.a(i2, i3, i2 + this.n, i3 + this.o);
            rect.a(-GameEngine.getGameEngine().cu, -GameEngine.getGameEngine().cv);
        }
    }

    public void e(float f2) {
        GameEngine.getGameEngine();
        f(f2);
    }

    public void h() {
        Iterator it = this.tileSets.iterator();
        while (it.hasNext()) {
            ((TileSet) it.next()).d();
        }
        this.tileSets.clear();
        Iterator it2 = this.z.iterator();
        while (it2.hasNext()) {
            ((Layer) it2.next()).b();
        }
        this.z.clear();
        this.P.clear();
        this.Q = null;
        al.c();
    }

    public TileSet a(int i2) {
        for (int i3 = 0; i3 < this.tileSets.size(); i3++) {
            TileSet tileSet = (TileSet) this.tileSets.get(i3);
            if (tileSet.d(i2)) {
                return tileSet;
            }
        }
        return null;
    }

    public Integer a(as asVar) {
        String i2 = asVar.i();
        Integer c2 = c("unit", i2);
        if (c2 == null) {
            c2 = c("customUnit", i2);
        }
        return c2;
    }

    public Integer c(String str, String str2) {
        for (int i2 = 0; i2 < this.tileSets.size(); i2++) {
            Integer b2 = ((TileSet) this.tileSets.get(i2)).b(str, str2);
            if (b2 != null) {
                return b2;
            }
        }
        return null;
    }

    public ObjectGroup f(String str) {
        Iterator it = this.P.iterator();
        while (it.hasNext()) {
            ObjectGroup objectGroup = (ObjectGroup) it.next();
            if (str.equalsIgnoreCase(objectGroup.b)) {
                return objectGroup;
            }
        }
        return null;
    }

    public float i() {
        return this.width * this.n;
    }

    public float j() {
        return this.height * this.o;
    }

    public void a(float f2, float f3, int i2, PlayerData playerData, boolean z) {
        com.corrodinggames.rts.gameFramework.status.f fVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.E) {
            long j2 = 0;
            if (a) {
                j2 = Unit.loadAllUnitsTook();
            }
            boolean z2 = true;
            boolean z3 = playerData.E;
            if (!gameEngine.ay() && (fVar = gameEngine.ce) != null && !fVar.a() && !fVar.b()) {
                z2 = false;
            }
            if (!z2) {
                b(f2, f3, i2, playerData, z);
            } else {
                for (int i3 = 0; i3 < PlayerData.c; i3++) {
                    PlayerData playerData2 = PlayerData.getPlayerData(i3);
                    if (playerData2 != null && (playerData2 == playerData || (!playerData2.w && (playerData2.d(playerData) || z3)))) {
                        b(f2, f3, i2, playerData2, z);
                    }
                }
            }
            if (a) {
                this.ap += Unit.loadAllUnitsTook() - j2;
            }
        }
    }

    public byte a(int i2, int i3, byte[][] bArr, byte b2) {
        byte b3 = 0;
        int i4 = this.width;
        int i5 = this.height;
        if (i2 >= 1) {
            if (bArr[i2 - 1][i3] >= b2) {
                b3 = (byte) (0 - 128);
            }
            if (i3 >= 1 && bArr[i2 - 1][i3 - 1] >= b2) {
                b3 = (byte) (b3 + 1);
            }
            if (i3 < i5 - 1 && bArr[i2 - 1][i3 + 1] >= b2) {
                b3 = (byte) (b3 + 8);
            }
        }
        if (i3 >= 1) {
            if (bArr[i2][i3 - 1] >= b2) {
                b3 = (byte) (b3 + 16);
            }
            if (i2 < i4 - 1 && bArr[i2 + 1][i3 - 1] >= b2) {
                b3 = (byte) (b3 + 2);
            }
        }
        if (i2 < i4 - 1 && bArr[i2 + 1][i3] >= b2) {
            b3 = (byte) (b3 + 32);
        }
        if (i3 < i5 - 1) {
            if (bArr[i2][i3 + 1] >= b2) {
                b3 = (byte) (b3 + 64);
            }
            if (i2 < i4 - 1 && bArr[i2 + 1][i3 + 1] >= b2) {
                b3 = (byte) (b3 + 4);
            }
        }
        if (b3 == Byte.MAX_VALUE) {
            b3 = -1;
        }
        return b3;
    }

    public void k() {
        l();
        for (int i2 = 0; i2 < this.width; i2++) {
            for (int i3 = 0; i3 < this.height; i3++) {
                this.M[i2][i3] = 0;
                this.N[i2][i3] = 0;
            }
        }
    }

    public void f(int i2, int i3) {
        this.M[i2][i3] = 0;
        this.N[i2][i3] = 0;
    }

    public void g(int i2, int i3) {
        int i4 = i2 - 1;
        int i5 = i3 - 1;
        if (i4 < 0) {
            i4 = 0;
        }
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = i2 + 1;
        int i7 = i3 + 1;
        if (i6 > this.width - 1) {
            i6 = this.width - 1;
        }
        if (i7 > this.height - 1) {
            i7 = this.height - 1;
        }
        for (int i8 = i4; i8 <= i6; i8++) {
            for (int i9 = i5; i9 <= i7; i9++) {
                if (this.M[i8][i9] != 0) {
                    this.M[i8][i9] = Byte.MAX_VALUE;
                }
                if (this.N[i8][i9] != 0) {
                    this.N[i8][i9] = Byte.MAX_VALUE;
                }
            }
        }
    }

    public void l() {
        boolean z = false;
        if (this.M == null) {
            z = true;
        } else if (this.M.length != this.width || this.M[0].length != this.height) {
            GameEngine.m328e("smoothFog_cache: Size mismatch");
            z = true;
        }
        if (z) {
            GameEngine.m328e("Building smoothFog_cache");
            this.M = new byte[this.width][this.height];
            this.N = new byte[this.width][this.height];
            for (int i2 = 0; i2 < this.width; i2++) {
                for (int i3 = 0; i3 < this.height; i3++) {
                    this.M[i2][i3] = Byte.MAX_VALUE;
                    this.N[i2][i3] = Byte.MAX_VALUE;
                }
            }
        }
    }

    public void b(float f2, float f3, int i2, PlayerData playerData, boolean z) {
        byte b2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.E && playerData.N != null) {
            l();
            float f4 = (i2 - 5) * (i2 - 5);
            float f5 = (i2 - 3) * (i2 - 3);
            float f6 = i2 * i2;
            float f7 = (1.0f / (f6 - f5)) * 10.0f;
            a(f2, f3);
            int i3 = this.T;
            int i4 = this.U;
            float f8 = f2 * this.r;
            float f9 = f3 * this.s;
            byte[][] bArr = playerData.N;
            int i5 = i2 - 1;
            int i6 = i3 - i5;
            int i7 = i4 - i5;
            if (i6 < 0) {
                i6 = 0;
            }
            if (i7 < 0) {
                i7 = 0;
            }
            int i8 = i3 + i5;
            int i9 = i4 + i5;
            if (i8 > this.width - 1) {
                i8 = this.width - 1;
            }
            if (i9 > this.height - 1) {
                i9 = this.height - 1;
            }
            c cVar = al;
            boolean z2 = false;
            boolean q = playerData.q();
            for (int i10 = i6; i10 <= i8; i10++) {
                for (int i11 = i7; i11 <= i9; i11++) {
                    byte b3 = bArr[i10][i11];
                    if (b3 != 0) {
                        float a2 = f.a(f8, f9, i10, i11);
                        if (a2 <= f5) {
                            if (b3 > 0) {
                                bArr[i10][i11] = 0;
                                if (q) {
                                    cVar.a(i10, i11, true);
                                    z2 = true;
                                    if (a2 <= f4 && z) {
                                        f(i10, i11);
                                    } else {
                                        g(i10, i11);
                                    }
                                }
                            }
                        } else if (a2 <= f6 && b3 > (b2 = (byte) ((a2 - f5) * f7))) {
                            bArr[i10][i11] = b2;
                            if (q) {
                                cVar.a(i10, i11, true);
                                z2 = true;
                                g(i10, i11);
                            }
                        }
                    }
                }
            }
            if (z2) {
                gameEngine.bW.O = true;
            }
        }
    }

    public void f(float f2) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (a) {
            this.aq += f2;
            if (this.aq > 60.0f) {
                this.aq = 0.0f;
                if (this.ap > 0) {
                    GameEngine.m328e("seeThoughFogOfWarTimes: " + Unit.b(this.ap));
                    this.ap = 0L;
                }
                if (this.ap < 0) {
                    GameEngine.m328e("seeThoughFogOfWarTimes negative: " + Unit.b(this.ap));
                    this.ap = 0L;
                }
            }
        }
        if (this.E && this.F) {
            l();
            this.ar += f2;
            if (this.ar > 260.0f) {
                this.ar = 0.0f;
                w[] a2 = am.er.a();
                int size = w.er.size();
                boolean z = false;
                for (int i2 = 0; i2 < PlayerData.c; i2++) {
                    PlayerData playerData = PlayerData.getPlayerData(i2);
                    if (playerData != null && !playerData.G) {
                        z = true;
                        for (int i3 = 0; i3 < size; i3++) {
                            w wVar = a2[i3];
                            if (wVar instanceof com.corrodinggames.rts.game.units.y) {
                                com.corrodinggames.rts.game.units.y yVar = (com.corrodinggames.rts.game.units.y) wVar;
                                if (yVar.bI()) {
                                    yVar.g(playerData);
                                }
                            }
                        }
                        if (playerData.N == null) {
                            GameEngine.print("fogOfWar_map==null for:" + i2);
                        }
                        boolean z2 = false;
                        boolean q = playerData.q();
                        byte[][] bArr = playerData.N;
                        byte[][] bArr2 = this.N;
                        for (int i4 = 0; i4 < this.width; i4++) {
                            for (int i5 = 0; i5 < this.height; i5++) {
                                if (bArr[i4][i5] < 5) {
                                    bArr[i4][i5] = 5;
                                    if (q) {
                                        al.a(i4, i5, true);
                                        z2 = true;
                                        bArr2[i4][i5] = Byte.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            gameEngine.bW.O = true;
                        }
                    }
                }
                for (int i6 = 0; i6 < size; i6++) {
                    w wVar2 = a2[i6];
                    if (wVar2 instanceof com.corrodinggames.rts.game.units.y) {
                        com.corrodinggames.rts.game.units.y yVar2 = (com.corrodinggames.rts.game.units.y) wVar2;
                        if (!yVar2.bV) {
                            yVar2.c(false);
                        }
                    }
                }
                if (z) {
                    for (int i7 = 0; i7 < size; i7++) {
                        w wVar3 = a2[i7];
                        if (wVar3 instanceof com.corrodinggames.rts.game.units.y) {
                            com.corrodinggames.rts.game.units.y yVar3 = (com.corrodinggames.rts.game.units.y) wVar3;
                            if (yVar3.bI()) {
                                yVar3.cX();
                            }
                        }
                    }
                }
            }
        }
    }

    public void a(GameOutputStream gameOutputStream) {
        gameOutputStream.writeBoolean(false);
    }

    public void a(GameInputStream gameInputStream) {
        if (gameInputStream.readBoolean()) {
            int readInt = gameInputStream.readInt();
            int readInt2 = gameInputStream.readInt();
            for (int i2 = 0; i2 < readInt; i2++) {
                for (int i3 = 0; i3 < readInt2; i3++) {
                    gameInputStream.readByte();
                }
            }
        }
    }

    private InputStream a(String str, String str2, int i2) {
        String[] split = str2.split("/");
        if (split.length >= i2) {
            String str3 = VariableScope.nullOrMissingString;
            boolean z = true;
            for (int length = split.length - i2; length < split.length; length++) {
                if (!z) {
                    str3 = str3 + "/";
                }
                z = false;
                str3 = str3 + split[length];
            }
            return a.j(str + str3);
        }
        return null;
    }

    public InputStream d(String str, String str2) {
        j j2 = a.j(str + str2);
        if (j2 == null) {
            j2 = a(str, str2, 3);
        }
        if (j2 == null) {
            j2 = a(str, str2, 2);
        }
        if (j2 == null) {
            j2 = a(str, str2, 1);
        }
        if (j2 == null) {
            throw new IOException("File could not be found:" + str + str2);
        }
        return j2;
    }

    public boolean a(PlayerData playerData, int i2, int i3) {
        if (!this.G && this.E && playerData.N != null && c(i2, i3) && playerData.N[i2][i3] == 10) {
            return false;
        }
        return true;
    }
}