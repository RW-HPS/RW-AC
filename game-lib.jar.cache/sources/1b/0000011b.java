package com.corrodinggames.rts.debug.test;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.C0248aq;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0455i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0440b;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import java.util.Iterator;
import java.util.Random;

/* renamed from: com.corrodinggames.rts.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/f.class */
public class TestMiscPerformance extends AbstractScriptTest {

    /* renamed from: b */
    int f396b;

    /* renamed from: e */
    static final Point f397e = new Point();

    /* renamed from: a */
    int f398a = 1;

    /* renamed from: c */
    final Rect f399c = new Rect();

    /* renamed from: d */
    final PointF f400d = new PointF();

    /* renamed from: a */
    public void m5432a() {
        GameEngine.m5924e("Misc Performance test");
        int i = 0;
        GameEngine.m5924e("=== applyDigitGroupingStyle tests (runs:5)");
        Long valueOf = Long.valueOf(C0742br.m2574a());
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 100; i3++) {
                if (!C0433a.m4055a(i3 + "9870000001.67", EnumC0440b.f2795c).equals(VariableScope.nullOrMissingString)) {
                    i++;
                }
            }
        }
        double m2571a = C0742br.m2571a(valueOf.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
        this.f398a += i;
        GameEngine.m5924e("Took: " + m2571a);
        int i4 = 0;
        GameEngine.m5924e("=== applyDigitGroupingStyle_systemLibraryVersion tests (runs:5)");
        Long valueOf2 = Long.valueOf(C0742br.m2574a());
        for (int i5 = 0; i5 < 5; i5++) {
            for (int i6 = 0; i6 < 100; i6++) {
                if (!C0433a.m4058a(i6 + 9870000001L, EnumC0440b.f2795c).equals(VariableScope.nullOrMissingString)) {
                    i4++;
                }
            }
        }
        double m2571a2 = C0742br.m2571a(valueOf2.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
        this.f398a += i4;
        GameEngine.m5924e("Took: " + m2571a2);
        int i7 = 0;
        GameEngine.m5924e("=== isLineClear tests (runs:3)");
        Long valueOf3 = Long.valueOf(C0742br.m2574a());
        for (int i8 = 0; i8 < 3; i8++) {
            for (int i9 = 0; i9 < 100; i9++) {
                if (C0248aq.m4611b(EnumC0246ao.f1709b, i9, 1000 - i9, 50, 50, 1000, 1, 1)) {
                    i7++;
                }
            }
        }
        double m2571a3 = C0742br.m2571a(valueOf3.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
        this.f398a += i7;
        GameEngine.m5924e("Took: " + m2571a3);
        int i10 = 0;
        GameEngine.m5924e("=== maths tests == (runs:3)");
        Long valueOf4 = Long.valueOf(C0742br.m2574a());
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 1000; i12++) {
                Point point = f397e;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                point.f224a += i12;
                this.f396b++;
                i10 += 0;
            }
        }
        double m2571a4 = C0742br.m2571a(valueOf4.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
        this.f398a += i10;
        GameEngine.m5924e("Took: " + m2571a4);
        C1136m c1136m = new C1136m();
        int i13 = 0;
        for (int i14 = 0; i14 < 20000; i14++) {
            C0455i c0455i = new C0455i();
            if (i14 % 10 != 0) {
                c0455i.m3949a(C0453g.m3954c("test"));
                c0455i.m3949a(C0453g.m3954c("test1"));
            }
            if (i14 % 2 == 0) {
                c0455i.m3949a(C0453g.m3954c("test2"));
                i13++;
            }
            if (i14 % 3 == 0) {
                c0455i.m3949a(C0453g.m3954c("test3"));
            }
            if (i14 % 4 == 0) {
                c0455i.m3949a(C0453g.m3954c("test4"));
            }
            if (i14 % 5 == 0) {
                c1136m.add(null);
            }
            c1136m.add(c0455i.m3950a());
        }
        C0454h m3958a = C0453g.m3958a("test2");
        GameEngine.m5924e("=== CustomTagList tests == (runs:5)");
        for (int i15 = 0; i15 < 14; i15++) {
            Long valueOf5 = Long.valueOf(C0742br.m2574a());
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = 0;
                Iterator it = c1136m.iterator();
                while (it.hasNext()) {
                    if (C0453g.m3961a(m3958a, (C0454h) it.next())) {
                        i17++;
                    }
                }
                C0085n.m5419a(i13, i17);
            }
            GameEngine.m5924e("test2Expected:" + i13);
            double m2571a5 = C0742br.m2571a(valueOf5.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += 0;
            GameEngine.m5924e("Took: " + m2571a5);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            GameEngine.m5924e("=== [Write]/comparison tests == (runs:5)");
            for (int i19 = 0; i19 < 5; i19++) {
                Random random = new Random();
                C0079h[] c0079hArr = new C0079h[5000000];
                for (int i20 = 0; i20 < c0079hArr.length; i20++) {
                    c0079hArr[i20] = new C0079h();
                    c0079hArr[i20].f408d = random.nextFloat() < 0.5f;
                }
                Long valueOf6 = Long.valueOf(C0742br.m2574a());
                for (int i21 = 0; i21 < 5; i21++) {
                    for (C0079h c0079h : c0079hArr) {
                        c0079h.f408d = false;
                    }
                }
                double m2571a6 = C0742br.m2571a(valueOf6.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
                this.f398a += 0;
                GameEngine.m5924e("Took: " + m2571a6);
            }
            GameEngine.m5924e("=== Write/[comparison] tests == (runs:5)");
            for (int i22 = 0; i22 < 5; i22++) {
                Random random2 = new Random();
                C0079h[] c0079hArr2 = new C0079h[5000000];
                for (int i23 = 0; i23 < c0079hArr2.length; i23++) {
                    c0079hArr2[i23] = new C0079h();
                    c0079hArr2[i23].f408d = random2.nextFloat() < 0.5f;
                }
                Long valueOf7 = Long.valueOf(C0742br.m2574a());
                for (int i24 = 0; i24 < 5; i24++) {
                    for (C0079h c0079h2 : c0079hArr2) {
                        if (c0079h2.f408d) {
                            c0079h2.f408d = false;
                        }
                    }
                }
                double m2571a7 = C0742br.m2571a(valueOf7.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
                this.f398a += 0;
                GameEngine.m5924e("Took: " + m2571a7);
            }
        }
        int i25 = 0;
        GameEngine.m5924e("=== [Virtual method]/if tests == (runs:5)");
        for (int i26 = 0; i26 < 7; i26++) {
            Random random3 = new Random();
            C0080i[] c0080iArr = new C0080i[1000];
            for (int i27 = 0; i27 < c0080iArr.length; i27++) {
                if (random3.nextFloat() < 0.3f) {
                    C0081j c0081j = new C0081j(this);
                    c0081j.f417c = random3.nextInt(1000);
                    c0080iArr[i27] = c0081j;
                } else {
                    c0080iArr[i27] = new C0080i(this);
                    c0080iArr[i27].f415a = random3.nextInt(1000);
                }
            }
            Long valueOf8 = Long.valueOf(C0742br.m2574a());
            for (int i28 = 0; i28 < 5; i28++) {
                for (C0080i c0080i : c0080iArr) {
                    if (c0080i.mo5430a() == 0) {
                        i25++;
                    }
                }
            }
            double m2571a8 = C0742br.m2571a(valueOf8.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i25;
            GameEngine.m5924e("Took: " + m2571a8);
        }
        int i29 = 0;
        GameEngine.m5924e("=== Virtual method/[if tests] == (runs:5)");
        for (int i30 = 0; i30 < 7; i30++) {
            Random random4 = new Random();
            C0078g[] c0078gArr = new C0078g[1000];
            for (int i31 = 0; i31 < c0078gArr.length; i31++) {
                boolean z = random4.nextFloat() < 0.3f;
                C0078g c0078g = new C0078g(this);
                c0078g.f402b = random4.nextInt(1000);
                c0078g.f401a = random4.nextInt(1000);
                c0078g.f403c = z;
                c0078gArr[i31] = c0078g;
            }
            Long valueOf9 = Long.valueOf(C0742br.m2574a());
            for (int i32 = 0; i32 < 5; i32++) {
                for (C0078g c0078g2 : c0078gArr) {
                    if (c0078g2.m5431a() == 0) {
                        i29++;
                    }
                }
            }
            double m2571a9 = C0742br.m2571a(valueOf9.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i29;
            GameEngine.m5924e("Took: " + m2571a9);
        }
        int i33 = 0;
        GameEngine.m5924e("=== comparison tests 1 == (runs:10)");
        for (int i34 = 0; i34 < 14; i34++) {
            Random random5 = new Random();
            float[] fArr = new float[600 * 600];
            for (int i35 = 0; i35 < 600; i35++) {
                for (int i36 = 0; i36 < 600; i36++) {
                    fArr[(i35 * 600) + i36] = random5.nextFloat();
                }
            }
            Long valueOf10 = Long.valueOf(C0742br.m2574a());
            for (int i37 = 0; i37 < 10; i37++) {
                for (int i38 = 0; i38 < 600; i38++) {
                    for (int i39 = 0; i39 < 600; i39++) {
                        i33 = (int) (i33 + fArr[(i38 * 600) + i39]);
                    }
                }
            }
            double m2571a10 = C0742br.m2571a(valueOf10.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i33;
            GameEngine.m5924e("Took: " + m2571a10);
        }
        int i40 = 0;
        GameEngine.m5924e("=== comparison tests 2 == (runs:10)");
        for (int i41 = 0; i41 < 14; i41++) {
            Random random6 = new Random();
            float[][] fArr2 = new float[600][600];
            for (int i42 = 0; i42 < 600; i42++) {
                for (int i43 = 0; i43 < 600; i43++) {
                    fArr2[i42][i43] = random6.nextFloat();
                }
            }
            Long valueOf11 = Long.valueOf(C0742br.m2574a());
            for (int i44 = 0; i44 < 10; i44++) {
                for (int i45 = 0; i45 < 600; i45++) {
                    for (int i46 = 0; i46 < 600; i46++) {
                        i40 = (int) (i40 + fArr2[i45][i46]);
                    }
                }
            }
            double m2571a11 = C0742br.m2571a(valueOf11.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i40;
            GameEngine.m5924e("Took: " + m2571a11);
        }
        int i47 = 0;
        GameEngine.m5924e("=== [divide]/multiply float tests == (runs:5)");
        for (int i48 = 0; i48 < 5; i48++) {
            Random random7 = new Random();
            float[] fArr3 = new float[5000000];
            float[] fArr4 = new float[5000000];
            for (int i49 = 0; i49 < fArr3.length; i49++) {
                fArr3[i49] = random7.nextFloat();
                fArr4[i49] = random7.nextFloat();
            }
            Long valueOf12 = Long.valueOf(C0742br.m2574a());
            for (int i50 = 0; i50 < 5; i50++) {
                for (int i51 = 0; i51 < fArr3.length; i51++) {
                    if (fArr3[i51] / fArr4[i51] == 0.0f) {
                        i47++;
                    }
                }
            }
            double m2571a12 = C0742br.m2571a(valueOf12.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i47;
            GameEngine.m5924e("Took: " + m2571a12);
        }
        int i52 = 0;
        GameEngine.m5924e("=== divide/[multiply] float tests == (runs:5)");
        for (int i53 = 0; i53 < 5; i53++) {
            Random random8 = new Random();
            float[] fArr5 = new float[5000000];
            float[] fArr6 = new float[5000000];
            for (int i54 = 0; i54 < fArr5.length; i54++) {
                fArr5[i54] = random8.nextFloat();
                fArr6[i54] = random8.nextFloat();
            }
            Long valueOf13 = Long.valueOf(C0742br.m2574a());
            for (int i55 = 0; i55 < 5; i55++) {
                for (int i56 = 0; i56 < fArr5.length; i56++) {
                    if (fArr5[i56] * fArr6[i56] == 0.0f) {
                        i52++;
                    }
                }
            }
            double m2571a13 = C0742br.m2571a(valueOf13.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i52;
            GameEngine.m5924e("Took: " + m2571a13);
        }
        int i57 = 0;
        GameEngine.m5924e("=== [divide]/multiply int tests == (runs:5)");
        for (int i58 = 0; i58 < 5; i58++) {
            Random random9 = new Random();
            int[] iArr = new int[5000000];
            int[] iArr2 = new int[5000000];
            for (int i59 = 0; i59 < iArr.length; i59++) {
                iArr[i59] = random9.nextInt();
                iArr2[i59] = random9.nextInt();
            }
            Long valueOf14 = Long.valueOf(C0742br.m2574a());
            for (int i60 = 0; i60 < 5; i60++) {
                for (int i61 = 0; i61 < iArr.length; i61++) {
                    if (iArr[i61] / iArr2[i61] == 0) {
                        i57++;
                    }
                }
            }
            double m2571a14 = C0742br.m2571a(valueOf14.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i57;
            GameEngine.m5924e("Took: " + m2571a14);
        }
        int i62 = 0;
        GameEngine.m5924e("=== [float cast and divide]/multiply int tests == (runs:5)");
        for (int i63 = 0; i63 < 5; i63++) {
            Random random10 = new Random();
            int[] iArr3 = new int[5000000];
            int[] iArr4 = new int[5000000];
            for (int i64 = 0; i64 < iArr3.length; i64++) {
                iArr3[i64] = random10.nextInt();
                iArr4[i64] = random10.nextInt();
            }
            Long valueOf15 = Long.valueOf(C0742br.m2574a());
            for (int i65 = 0; i65 < 5; i65++) {
                for (int i66 = 0; i66 < iArr3.length; i66++) {
                    if (iArr3[i66] / iArr4[i66] == 0.0f) {
                        i62++;
                    }
                }
            }
            double m2571a15 = C0742br.m2571a(valueOf15.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i62;
            GameEngine.m5924e("Took: " + m2571a15);
        }
        int i67 = 0;
        GameEngine.m5924e("=== [mixed float and divide]/multiply int tests == (runs:5)");
        for (int i68 = 0; i68 < 5; i68++) {
            Random random11 = new Random();
            int[] iArr5 = new int[5000000];
            float[] fArr7 = new float[5000000];
            for (int i69 = 0; i69 < iArr5.length; i69++) {
                iArr5[i69] = random11.nextInt();
                fArr7[i69] = random11.nextFloat();
            }
            Long valueOf16 = Long.valueOf(C0742br.m2574a());
            for (int i70 = 0; i70 < 5; i70++) {
                for (int i71 = 0; i71 < iArr5.length; i71++) {
                    if (iArr5[i71] / fArr7[i71] == 0.0f) {
                        i67++;
                    }
                }
            }
            double m2571a16 = C0742br.m2571a(valueOf16.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i67;
            GameEngine.m5924e("Took: " + m2571a16);
        }
        int i72 = 0;
        GameEngine.m5924e("=== divide/[multiply] int tests == (runs:5)");
        for (int i73 = 0; i73 < 5; i73++) {
            Random random12 = new Random();
            int[] iArr6 = new int[5000000];
            int[] iArr7 = new int[5000000];
            for (int i74 = 0; i74 < iArr6.length; i74++) {
                iArr6[i74] = random12.nextInt();
                iArr7[i74] = random12.nextInt();
            }
            Long valueOf17 = Long.valueOf(C0742br.m2574a());
            for (int i75 = 0; i75 < 5; i75++) {
                for (int i76 = 0; i76 < iArr6.length; i76++) {
                    if (iArr6[i76] * iArr7[i76] == 0) {
                        i72++;
                    }
                }
            }
            double m2571a17 = C0742br.m2571a(valueOf17.longValue(), Long.valueOf(C0742br.m2574a()).longValue());
            this.f398a += i72;
            GameEngine.m5924e("Took: " + m2571a17);
        }
    }
}