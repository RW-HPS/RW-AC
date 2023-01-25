package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.C0966ag;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.unitAction.InterfaceC1063y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/e.class */
public class C0178e {

    /* renamed from: x */
    private static byte[] f891x = new byte[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: a */
    static C0966ag f892a;

    /* renamed from: b */
    static C0966ag[] f893b;

    /* renamed from: c */
    static C0966ag f894c;

    /* renamed from: d */
    static C0966ag f895d;

    /* renamed from: e */
    static C0966ag f896e;

    /* renamed from: f */
    static C0966ag f897f;

    /* renamed from: g */
    static C0966ag f898g;

    /* renamed from: h */
    static C0966ag[] f899h;

    /* renamed from: i */
    public C0173b f900i;

    /* renamed from: j */
    public int f901j;

    /* renamed from: k */
    public String f902k;

    /* renamed from: l */
    public String f903l;

    /* renamed from: m */
    public boolean f904m;

    /* renamed from: n */
    public int f905n;

    /* renamed from: o */
    public int f906o;

    /* renamed from: p */
    public Properties f907p;

    /* renamed from: q */
    public short[] f908q;

    /* renamed from: r */
    public boolean f909r;

    /* renamed from: s */
    public boolean f910s;

    /* renamed from: t */
    final Rect f911t = new Rect();

    /* renamed from: u */
    final Rect f912u = new Rect();

    /* renamed from: v */
    final RectF f913v = new RectF();

    /* renamed from: w */
    public boolean f914w;

    static {
        for (int i = 0; i < 256; i++) {
            f891x[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f891x[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f891x[i3] = (byte) ((26 + i3) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f891x[i4] = (byte) ((52 + i4) - 48);
        }
        f891x[43] = 62;
        f891x[47] = 63;
        f892a = new C0966ag();
        f892a.m5206b(-16777216);
        f892a.m5221a(Paint.Style.f219a);
        f893b = new C0966ag[11];
        for (int i5 = 0; i5 <= 10; i5++) {
            f893b[i5] = new C0966ag();
            f893b[i5].m5206b(-16777216);
            f893b[i5].m5221a(Paint.Style.f219a);
            f893b[i5].m5201c(i5 * 25);
        }
        f894c = new C0966ag();
        f894c.m5206b(-16777216);
        f894c.m5221a(Paint.Style.f219a);
        f895d = new C0966ag();
        f895d.mo914a(false);
        f895d.m5195d(false);
        f895d.m5203b(false);
        f896e = new C0966ag();
        f896e.mo914a(true);
        f897f = new C0966ag();
        f897f.mo914a(false);
        f897f.m5195d(false);
        f897f.m5203b(false);
        f898g = new C0966ag();
        f898g.mo914a(true);
        f899h = new C0966ag[11];
        for (int i6 = 0; i6 <= 10; i6++) {
            C0966ag c0966ag = new C0966ag();
            c0966ag.m5225a(new LightingColorFilter(Color.m5244a(255 - (i6 * 25), 255 - (i6 * 25), 255 - (i6 * 25)), 0));
            f899h[i6] = c0966ag;
        }
    }

    /* renamed from: a */
    public final C0180g m4572a(int i, int i2) {
        if (this.f908q == null) {
            this.f908q = new short[this.f905n * this.f906o];
        }
        return this.f900i.m4635a(this.f908q[(i * this.f906o) + i2]);
    }

    /* renamed from: a */
    public short[] m4573a() {
        if (this.f908q == null) {
            this.f908q = new short[this.f905n * this.f906o];
        }
        return this.f908q;
    }

    /* renamed from: a */
    public void m4571a(int i, int i2, C0180g c0180g, boolean z) {
        if (this.f908q == null) {
            this.f908q = new short[this.f905n * this.f906o];
        }
        if (c0180g == null) {
            this.f908q[(i * this.f906o) + i2] = 0;
            return;
        }
        if (z) {
            c0180g = this.f900i.m4651a(c0180g, i, i2);
        }
        if (c0180g.f923i) {
            boolean z2 = false;
            Iterator it = this.f900i.f839A.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                if (point.f224a == i && point.f225b == i2) {
                    GameEngine.m5460e("resPools point:" + i + ", " + i2 + " already exists");
                    z2 = true;
                }
            }
            if (!z2) {
                this.f900i.f839A.add(new Point(i, i2));
            }
        }
        if (c0180g.f918d == -1) {
            c0180g.f918d = this.f900i.m4652a(c0180g);
        }
        this.f908q[(i * this.f906o) + i2] = c0180g.f918d;
    }

    /* renamed from: a */
    public void m4570a(InterfaceC1063y interfaceC1063y, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3) {
        C0966ag c0966ag;
        C0181h c0181h;
        C0966ag c0966ag2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        C0173b c0173b = this.f900i;
        int i = (int) (f3 * c0173b.f790r);
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) (f4 * c0173b.f791s);
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (int) ((f3 + f5) * c0173b.f790r);
        if (i3 > this.f905n - 1) {
            i3 = this.f905n - 1;
        }
        int i4 = (int) ((f4 + f6) * c0173b.f791s);
        if (i4 > this.f906o - 1) {
            i4 = this.f906o - 1;
        }
        byte[][] bArr = gameEngine.f6312bs.f1339N;
        float f9 = f * f7;
        float f10 = f2 * f8;
        float f11 = c0173b.f786n * f7;
        float f12 = c0173b.f787o * f8;
        byte b = 15;
        if (!z2) {
            b = 10;
        }
        boolean z4 = c0173b.f844G;
        if (z4) {
            b = 15;
        }
        if (z && bArr == null) {
            z = false;
        }
        C0966ag c0966ag3 = f893b[5];
        C0966ag c0966ag4 = f892a;
        C0966ag c0966ag5 = f894c;
        c0966ag5.m5201c(255);
        if (z4) {
            c0966ag4 = f893b[7];
            c0966ag5.m5201c((int) ((1.0f - ((1.0f - (c0966ag3.m5192f() / 255.0f)) * (1.0f - (c0966ag4.m5192f() / 255.0f)))) * 255.0f));
        }
        boolean z5 = false;
        if (GameEngine.m1028av() && f7 < 1.0f && f8 < 1.0f) {
            z5 = true;
        }
        if (z3) {
        }
        if (!this.f909r) {
            c0966ag = f897f;
            if (z5) {
                c0966ag = f898g;
            }
        } else {
            c0966ag = f895d;
            if (z5) {
                c0966ag = f896e;
            }
        }
        C0966ag c0966ag6 = c0966ag;
        float f13 = 0.0f;
        boolean z6 = false;
        if (!GameEngine.m1028av()) {
            z6 = true;
        } else if (!z3) {
            if (f7 < 1.0f || f8 < 1.0f) {
                f13 = 0.5f * f7;
            }
        } else if (f7 < 1.0f || f8 >= 1.0f) {
        }
        if (f7 < 0.5f) {
            c0181h = C0173b.f785m;
        } else {
            c0181h = C0173b.f784l;
        }
        short[] m4573a = m4573a();
        C0180g[] c0180gArr = c0173b.f841B;
        RectF rectF = this.f913v;
        Rect rect = this.f912u;
        int i5 = this.f906o;
        boolean z7 = this.f909r;
        Rect rect2 = this.f911t;
        c0173b.m4598l();
        byte[][] bArr2 = c0173b.f797M;
        byte[][] bArr3 = c0173b.f798N;
        C0970e c0970e = C0173b.f795K;
        for (int i6 = i; i6 < i3 + 1; i6++) {
            int i7 = i2;
            while (i7 < i4 + 1) {
                C0180g c0180g = c0180gArr[m4573a[(i6 * i5) + i7]];
                if (c0180g != null) {
                    byte b2 = 0;
                    if (z) {
                        b2 = bArr[i6][i7];
                    }
                    if (b2 != b) {
                        float f14 = (i6 * f11) + 0.0f;
                        float f15 = (i7 * f12) + 0.0f;
                        float f16 = ((i6 + 1) * f11) + f13;
                        float f17 = ((i7 + 1) * f12) + f13;
                        rectF.m5158a(f14 - f9, f15 - f10, f16 - f9, f17 - f10);
                        if (z5 && !z3) {
                            rectF.f235b = (int) rectF.f235b;
                            rectF.f234a = (int) rectF.f234a;
                        }
                        if (!z3) {
                            C0183j c0183j = c0180g.f915a;
                            if (!z6) {
                                if (c0180g.f917c >= 0) {
                                    interfaceC1063y.mo193a(c0181h.m4558a(c0180g.f917c), c0181h.m4549b(c0180g.f917c), rectF, c0966ag6);
                                } else {
                                    c0180g.m4561a(interfaceC1063y, rectF, f7, c0966ag6);
                                }
                            } else {
                                rect.m5172a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                if (c0180g.f917c >= 0) {
                                    interfaceC1063y.mo159b(c0181h.m4558a(c0180g.f917c), c0181h.m4549b(c0180g.f917c), rect, c0966ag6);
                                } else {
                                    interfaceC1063y.mo194a(c0183j.f952b, c0183j.m4536b(c0180g.f916b), rect, c0966ag6);
                                }
                            }
                        }
                        if (z && z7 && z2 && (b2 != 0 || bArr3[i6][i7] != 0 || bArr2[i6][i7] != 0)) {
                            if (b2 >= 5) {
                                if (z3 && (b2 == 10 || bArr2[i6][i7] == 0)) {
                                    int i8 = i7 + 1;
                                    while (i8 < i4) {
                                        if (b2 != bArr[i6][i8] || (b2 != 10 && bArr2[i6][i8] != 0)) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    int i9 = i8 - 1;
                                    if (i9 > i7) {
                                        rectF.f237d += (i9 - i7) * f12;
                                        i7 = i9;
                                    }
                                }
                                if (b2 == 10) {
                                    c0966ag2 = c0966ag5;
                                } else {
                                    c0966ag2 = c0966ag3;
                                }
                                rect.f230a = (int) rectF.f234a;
                                rect.f232c = (int) rectF.f236c;
                                rect.f231b = (int) rectF.f235b;
                                rect.f233d = (int) rectF.f237d;
                                interfaceC1063y.mo208a(rect, c0966ag2);
                            } else {
                                byte b3 = bArr3[i6][i7];
                                if (b3 == Byte.MAX_VALUE) {
                                    b3 = c0173b.m4658a(i6, i7, bArr, (byte) 5);
                                    bArr3[i6][i7] = b3;
                                }
                                if (b3 != 0) {
                                    int i10 = b3 + 128;
                                    if (c0970e != null) {
                                        C0173b.m4657a(i10, rect2);
                                        rect.m5172a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        interfaceC1063y.mo159b(c0970e, rect2, rect, c0966ag3);
                                    } else if (!c0173b.f832k[b3 + 128]) {
                                        GameEngine.m5460e("SmoothFog, missing: " + ((int) b3));
                                        c0173b.f832k[b3 + 128] = true;
                                    }
                                }
                            }
                            if (b2 != 10) {
                                byte b4 = bArr2[i6][i7];
                                if (b4 == Byte.MAX_VALUE) {
                                    b4 = c0173b.m4658a(i6, i7, bArr, (byte) 10);
                                    bArr2[i6][i7] = b4;
                                }
                                if (b4 != 0) {
                                    int i11 = b4 + 128;
                                    if (c0970e != null) {
                                        C0173b.m4657a(i11, rect2);
                                        rect.m5172a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        interfaceC1063y.mo159b(c0970e, rect2, rect, c0966ag4);
                                    } else if (!c0173b.f832k[b4 + 128]) {
                                        GameEngine.m5460e("SmoothFog, missing: " + ((int) b4));
                                        c0173b.f832k[b4 + 128] = true;
                                    }
                                }
                            }
                        }
                    }
                }
                i7++;
            }
        }
    }

    /* renamed from: b */
    public void m4565b() {
        this.f908q = null;
        this.f907p = null;
        this.f900i = null;
    }

    public C0178e(C0173b c0173b, String str, int i, int i2) {
        this.f900i = c0173b;
        m4568a(str);
        this.f905n = i;
        this.f906o = i2;
        m4573a();
    }

    /* renamed from: a */
    void m4568a(String str) {
        this.f902k = str;
        Log.m5069d("RustedWarfare", "MapLayer create: " + str);
        if (str != null) {
            this.f903l = str.toLowerCase(Locale.ENGLISH);
        }
        this.f904m = this.f903l.contains("items");
        this.f909r = this.f903l.equalsIgnoreCase("ground");
        if (this.f904m || this.f909r) {
            this.f910s = true;
        }
        if (str != null && str.equalsIgnoreCase("grounddetails")) {
            this.f910s = true;
        }
    }

    public C0178e(C0173b c0173b, Element element) {
        NodeList elementsByTagName;
        this.f900i = c0173b;
        m4568a(element.getAttribute("name"));
        this.f905n = Short.parseShort(element.getAttribute("width"));
        this.f906o = Short.parseShort(element.getAttribute("height"));
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.f907p = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f907p.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        Element element4 = (Element) element.getElementsByTagName("data").item(0);
        if (element4 == null) {
            throw new C0179f("Map is missing <data> element");
        }
        try {
            InputStream m4567a = m4567a(element4.getFirstChild().getNodeValue(), element4.getAttribute("encoding"), element4.getAttribute("compression"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m4567a);
            m4569a(bufferedInputStream);
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (m4567a != null) {
                m4567a.close();
            }
        } catch (IOException e) {
            throw new C0179f("Unable to decompress base64 block", e);
        }
    }

    /* renamed from: a */
    void m4569a(InputStream inputStream) {
        C0173b c0173b = this.f900i;
        C0180g c0180g = null;
        int i = -1;
        boolean z = this.f910s;
        HashMap hashMap = new HashMap();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 < this.f906o) {
                short s3 = 0;
                while (true) {
                    short s4 = s3;
                    if (s4 < this.f905n) {
                        int read = 0 | inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
                        boolean z2 = (read & Integer.MIN_VALUE) != 0;
                        boolean z3 = (read & 1073741824) != 0;
                        boolean z4 = (read & 536870912) != 0;
                        int i2 = read & 536870911;
                        if (z2 || z3 || z4) {
                        }
                        if (i2 != 0) {
                            if (i == i2 && c0180g != null) {
                                m4571a(s4, s2, c0180g, true);
                            } else {
                                C0180g c0180g2 = (C0180g) hashMap.get(Integer.valueOf(i2));
                                if (c0180g2 != null) {
                                    c0180g = c0180g2;
                                    i = i2;
                                    m4571a(s4, s2, c0180g, true);
                                } else {
                                    C0183j m4661a = c0173b.m4661a(i2);
                                    if (m4661a != null) {
                                        c0180g = C0180g.m4563a(c0173b, this, m4661a, i2 - m4661a.f960l, s4, s2, z);
                                        if (c0180g != null) {
                                            m4571a(s4, s2, c0180g, true);
                                            hashMap.put(Integer.valueOf(i2), c0180g);
                                        }
                                        i = i2;
                                    } else {
                                        throw new C0179f("Unable to decode base64 block, could not find tileId: " + i2);
                                    }
                                }
                            }
                        }
                        s3 = (short) (s4 + 1);
                    }
                }
            } else {
                return;
            }
            s = (short) (s2 + 1);
        }
    }

    /* renamed from: a */
    public static InputStream m4567a(String str, String str2, String str3) {
        InputStream gZIPInputStream;
        if (str2.equals("base64")) {
            byte[] m4566a = m4566a(str.toCharArray());
            if ("gzip".equals(str3)) {
                try {
                    gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(m4566a));
                } catch (IOException e) {
                    throw new C0179f("Unable to decode block in map", e);
                }
            } else if (VariableScope.nullOrMissingString.equals(str3)) {
                gZIPInputStream = new ByteArrayInputStream(m4566a);
            } else if ("zlib".equals(str3)) {
                gZIPInputStream = new InflaterInputStream(new ByteArrayInputStream(m4566a));
            } else {
                throw new C0179f("Unsupport tiled map compression: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
            }
            return gZIPInputStream;
        }
        throw new C0179f("Unsupport tiled map encoding: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
    }

    /* renamed from: a */
    public static byte[] m4566a(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = f891x;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] > '\u00ff' || bArr[cArr[i]] < 0) {
                length--;
            }
        }
        int i2 = (length / 4) * 3;
        if (length % 4 == 3) {
            i2 += 2;
        }
        if (length % 4 == 2) {
            i2++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < cArr.length; i6++) {
            byte b = cArr[i6] > '\u00ff' ? (byte) -1 : bArr[cArr[i6]];
            if (b >= 0) {
                i3 += 6;
                i4 = (i4 << 6) | b;
                if (i3 >= 8) {
                    i3 -= 8;
                    int i7 = i5;
                    i5++;
                    bArr2[i7] = (byte) ((i4 >> i3) & 255);
                }
            }
        }
        if (i5 != bArr2.length) {
            throw new RuntimeException("Data length appears to be wrong (wrote " + i5 + " should be " + bArr2.length + ")");
        }
        return bArr2;
    }
}