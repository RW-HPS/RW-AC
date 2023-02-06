package com.corrodinggames.rts.game.maps;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.unitAction.ag;
import com.corrodinggames.rts.gameFramework.unitAction.e;
import com.corrodinggames.rts.gameFramework.unitAction.y;
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
public class Layer {
    private static byte[] x = new byte[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];
    static ag a;
    static ag[] b;
    static ag c;
    static ag d;
    static ag e;
    static ag f;
    static ag g;
    static ag[] h;
    public b i;
    public int j;
    public String k;
    public String l;
    public boolean m;
    public int n;
    public int o;
    public Properties p;
    public short[] q;
    public boolean r;
    public boolean s;
    final Rect t = new Rect();
    final Rect u = new Rect();
    final RectF v = new RectF();
    public boolean w;

    static {
        for (int i = 0; i < 256; i++) {
            x[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            x[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            x[i3] = (byte) ((26 + i3) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            x[i4] = (byte) ((52 + i4) - 48);
        }
        x[43] = 62;
        x[47] = 63;
        a = new ag();
        a.b(-16777216);
        a.a(Paint.Style.FILL);
        b = new ag[11];
        for (int i5 = 0; i5 <= 10; i5++) {
            b[i5] = new ag();
            b[i5].b(-16777216);
            b[i5].a(Paint.Style.FILL);
            b[i5].c(i5 * 25);
        }
        c = new ag();
        c.b(-16777216);
        c.a(Paint.Style.FILL);
        d = new ag();
        d.a(false);
        d.d(false);
        d.b(false);
        e = new ag();
        e.a(true);
        f = new ag();
        f.a(false);
        f.d(false);
        f.b(false);
        g = new ag();
        g.a(true);
        h = new ag[11];
        for (int i6 = 0; i6 <= 10; i6++) {
            ag agVar = new ag();
            agVar.a(new LightingColorFilter(Color.a(255 - (i6 * 25), 255 - (i6 * 25), 255 - (i6 * 25)), 0));
            h[i6] = agVar;
        }
    }

    public final g a(int i, int i2) {
        if (this.q == null) {
            this.q = new short[this.n * this.o];
        }
        return this.i.a(this.q[(i * this.o) + i2]);
    }

    public short[] a() {
        if (this.q == null) {
            this.q = new short[this.n * this.o];
        }
        return this.q;
    }

    public void a(int i, int i2, g gVar, boolean z) {
        if (this.q == null) {
            this.q = new short[this.n * this.o];
        }
        if (gVar == null) {
            this.q[(i * this.o) + i2] = 0;
            return;
        }
        if (z) {
            gVar = this.i.a(gVar, i, i2);
        }
        if (gVar.i) {
            boolean z2 = false;
            Iterator it = this.i.A.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                if (point.a == i && point.b == i2) {
                    GameEngine.m328e("resPools point:" + i + ", " + i2 + " already exists");
                    z2 = true;
                }
            }
            if (!z2) {
                this.i.A.add(new Point(i, i2));
            }
        }
        if (gVar.d == -1) {
            gVar.d = this.i.a(gVar);
        }
        this.q[(i * this.o) + i2] = gVar.d;
    }

    public void a(y yVar, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, boolean z, boolean z2, boolean z3) {
        ag agVar;
        h hVar;
        ag agVar2;
        GameEngine gameEngine = GameEngine.getGameEngine();
        b bVar = this.i;
        int i = (int) (f4 * bVar.r);
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) (f5 * bVar.s);
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (int) ((f4 + f6) * bVar.r);
        if (i3 > this.n - 1) {
            i3 = this.n - 1;
        }
        int i4 = (int) ((f5 + f7) * bVar.s);
        if (i4 > this.o - 1) {
            i4 = this.o - 1;
        }
        byte[][] bArr = gameEngine.playerTeam.N;
        float f10 = f2 * f8;
        float f11 = f3 * f9;
        float f12 = bVar.n * f8;
        float f13 = bVar.o * f9;
        byte b2 = 15;
        if (!z2) {
            b2 = 10;
        }
        boolean z4 = bVar.G;
        if (z4) {
            b2 = 15;
        }
        if (z && bArr == null) {
            z = false;
        }
        ag agVar3 = b[5];
        ag agVar4 = a;
        ag agVar5 = c;
        agVar5.c(255);
        if (z4) {
            agVar4 = b[7];
            agVar5.c((int) ((1.0f - ((1.0f - (agVar3.f() / 255.0f)) * (1.0f - (agVar4.f() / 255.0f)))) * 255.0f));
        }
        boolean z5 = false;
        if (GameEngine.av() && f8 < 1.0f && f9 < 1.0f) {
            z5 = true;
        }
        if (z3) {
        }
        if (!this.r) {
            agVar = f;
            if (z5) {
                agVar = g;
            }
        } else {
            agVar = d;
            if (z5) {
                agVar = e;
            }
        }
        ag agVar6 = agVar;
        float f14 = 0.0f;
        boolean z6 = false;
        if (!GameEngine.av()) {
            z6 = true;
        } else if (!z3) {
            if (f8 < 1.0f || f9 < 1.0f) {
                f14 = 0.5f * f8;
            }
        } else if (f8 < 1.0f || f9 >= 1.0f) {
        }
        if (f8 < 0.5f) {
            hVar = b.m;
        } else {
            hVar = b.l;
        }
        short[] a2 = a();
        g[] gVarArr = bVar.B;
        RectF rectF = this.v;
        Rect rect = this.u;
        int i5 = this.o;
        boolean z7 = this.r;
        Rect rect2 = this.t;
        bVar.l();
        byte[][] bArr2 = bVar.M;
        byte[][] bArr3 = bVar.N;
        e eVar = b.K;
        for (int i6 = i; i6 < i3 + 1; i6++) {
            int i7 = i2;
            while (i7 < i4 + 1) {
                g gVar = gVarArr[a2[(i6 * i5) + i7]];
                if (gVar != null) {
                    byte b3 = 0;
                    if (z) {
                        b3 = bArr[i6][i7];
                    }
                    if (b3 != b2) {
                        float f15 = (i6 * f12) + 0.0f;
                        float f16 = (i7 * f13) + 0.0f;
                        float f17 = ((i6 + 1) * f12) + f14;
                        float f18 = ((i7 + 1) * f13) + f14;
                        rectF.a(f15 - f10, f16 - f11, f17 - f10, f18 - f11);
                        if (z5 && !z3) {
                            rectF.b = (int) rectF.b;
                            rectF.a = (int) rectF.a;
                        }
                        if (!z3) {
                            TileSet tileSet = gVar.a;
                            if (!z6) {
                                if (gVar.c >= 0) {
                                    yVar.a(hVar.a(gVar.c), hVar.b(gVar.c), rectF, agVar6);
                                } else {
                                    gVar.a(yVar, rectF, f8, agVar6);
                                }
                            } else {
                                rect.a((int) (f15 - f10), (int) (f16 - f11), (int) (f17 - f10), (int) (f18 - f11));
                                if (gVar.c >= 0) {
                                    yVar.b(hVar.a(gVar.c), hVar.b(gVar.c), rect, agVar6);
                                } else {
                                    yVar.a(tileSet.b, tileSet.b(gVar.b), rect, agVar6);
                                }
                            }
                        }
                        if (z && z7 && z2 && (b3 != 0 || bArr3[i6][i7] != 0 || bArr2[i6][i7] != 0)) {
                            if (b3 >= 5) {
                                if (z3 && (b3 == 10 || bArr2[i6][i7] == 0)) {
                                    int i8 = i7 + 1;
                                    while (i8 < i4) {
                                        if (b3 != bArr[i6][i8] || (b3 != 10 && bArr2[i6][i8] != 0)) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    int i9 = i8 - 1;
                                    if (i9 > i7) {
                                        rectF.d += (i9 - i7) * f13;
                                        i7 = i9;
                                    }
                                }
                                if (b3 == 10) {
                                    agVar2 = agVar5;
                                } else {
                                    agVar2 = agVar3;
                                }
                                rect.a = (int) rectF.a;
                                rect.c = (int) rectF.c;
                                rect.b = (int) rectF.b;
                                rect.d = (int) rectF.d;
                                yVar.a(rect, agVar2);
                            } else {
                                byte b4 = bArr3[i6][i7];
                                if (b4 == Byte.MAX_VALUE) {
                                    b4 = bVar.a(i6, i7, bArr, (byte) 5);
                                    bArr3[i6][i7] = b4;
                                }
                                if (b4 != 0) {
                                    int i10 = b4 + 128;
                                    if (eVar != null) {
                                        b.a(i10, rect2);
                                        rect.a((int) (f15 - f10), (int) (f16 - f11), (int) (f17 - f10), (int) (f18 - f11));
                                        yVar.b(eVar, rect2, rect, agVar3);
                                    } else if (!bVar.k[b4 + 128]) {
                                        GameEngine.m328e("SmoothFog, missing: " + ((int) b4));
                                        bVar.k[b4 + 128] = true;
                                    }
                                }
                            }
                            if (b3 != 10) {
                                byte b5 = bArr2[i6][i7];
                                if (b5 == Byte.MAX_VALUE) {
                                    b5 = bVar.a(i6, i7, bArr, (byte) 10);
                                    bArr2[i6][i7] = b5;
                                }
                                if (b5 != 0) {
                                    int i11 = b5 + 128;
                                    if (eVar != null) {
                                        b.a(i11, rect2);
                                        rect.a((int) (f15 - f10), (int) (f16 - f11), (int) (f17 - f10), (int) (f18 - f11));
                                        yVar.b(eVar, rect2, rect, agVar4);
                                    } else if (!bVar.k[b5 + 128]) {
                                        GameEngine.m328e("SmoothFog, missing: " + ((int) b5));
                                        bVar.k[b5 + 128] = true;
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

    public void b() {
        this.q = null;
        this.p = null;
        this.i = null;
    }

    public Layer(b bVar, String str, int i, int i2) {
        this.i = bVar;
        a(str);
        this.n = i;
        this.o = i2;
        a();
    }

    void a(String str) {
        this.k = str;
        Log.d("RustedWarfare", "MapLayer create: " + str);
        if (str != null) {
            this.l = str.toLowerCase(Locale.ENGLISH);
        }
        this.m = this.l.contains("items");
        this.r = this.l.equalsIgnoreCase("ground");
        if (this.m || this.r) {
            this.s = true;
        }
        if (str != null && str.equalsIgnoreCase("grounddetails")) {
            this.s = true;
        }
    }

    public Layer(b bVar, Element element) {
        NodeList elementsByTagName;
        this.i = bVar;
        a(element.getAttribute("name"));
        this.n = Short.parseShort(element.getAttribute("width"));
        this.o = Short.parseShort(element.getAttribute("height"));
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.p = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.p.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        Element element4 = (Element) element.getElementsByTagName("data").item(0);
        if (element4 == null) {
            throw new f("Map is missing <data> element");
        }
        try {
            InputStream a2 = a(element4.getFirstChild().getNodeValue(), element4.getAttribute("encoding"), element4.getAttribute("compression"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a2);
            a(bufferedInputStream);
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (a2 != null) {
                a2.close();
            }
        } catch (IOException e2) {
            throw new f("Unable to decompress base64 block", e2);
        }
    }

    void a(InputStream inputStream) {
        b bVar = this.i;
        g gVar = null;
        int i = -1;
        boolean z = this.s;
        HashMap hashMap = new HashMap();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 < this.o) {
                short s3 = 0;
                while (true) {
                    short s4 = s3;
                    if (s4 < this.n) {
                        int read = 0 | inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
                        boolean z2 = (read & Integer.MIN_VALUE) != 0;
                        boolean z3 = (read & 1073741824) != 0;
                        boolean z4 = (read & 536870912) != 0;
                        int i2 = read & 536870911;
                        if (z2 || z3 || z4) {
                        }
                        if (i2 != 0) {
                            if (i == i2 && gVar != null) {
                                a(s4, s2, gVar, true);
                            } else {
                                g gVar2 = (g) hashMap.get(Integer.valueOf(i2));
                                if (gVar2 != null) {
                                    gVar = gVar2;
                                    i = i2;
                                    a(s4, s2, gVar, true);
                                } else {
                                    TileSet a2 = bVar.a(i2);
                                    if (a2 != null) {
                                        gVar = g.a(bVar, this, a2, i2 - a2.l, s4, s2, z);
                                        if (gVar != null) {
                                            a(s4, s2, gVar, true);
                                            hashMap.put(Integer.valueOf(i2), gVar);
                                        }
                                        i = i2;
                                    } else {
                                        throw new f("Unable to decode base64 block, could not find tileId: " + i2);
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

    public static InputStream a(String str, String str2, String str3) {
        InputStream gZIPInputStream;
        if (str2.equals("base64")) {
            byte[] a2 = a(str.toCharArray());
            if ("gzip".equals(str3)) {
                try {
                    gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(a2));
                } catch (IOException e2) {
                    throw new f("Unable to decode block in map", e2);
                }
            } else if (VariableScope.nullOrMissingString.equals(str3)) {
                gZIPInputStream = new ByteArrayInputStream(a2);
            } else if ("zlib".equals(str3)) {
                gZIPInputStream = new InflaterInputStream(new ByteArrayInputStream(a2));
            } else {
                throw new f("Unsupport tiled map compression: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
            }
            return gZIPInputStream;
        }
        throw new f("Unsupport tiled map encoding: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
    }

    public static byte[] a(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = x;
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
            byte b2 = cArr[i6] > '\u00ff' ? (byte) -1 : bArr[cArr[i6]];
            if (b2 >= 0) {
                i3 += 6;
                i4 = (i4 << 6) | b2;
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