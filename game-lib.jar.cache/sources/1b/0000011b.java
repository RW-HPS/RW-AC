package com.corrodinggames.rts.a.a;

import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.aq;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;
import java.util.Iterator;
import java.util.Random;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/f.class */
public class f extends l {
    int b;
    static final Point e = new Point();

    /* renamed from: a  reason: collision with root package name */
    int f79a = 1;
    final Rect c = new Rect();
    final PointF d = new PointF();

    public void a() {
        GameEngine.m328e("Misc Performance test");
        int i = 0;
        GameEngine.m328e("=== applyDigitGroupingStyle tests (runs:5)");
        Long valueOf = Long.valueOf(br.a());
        for (int i2 = 0; i2 < 5; i2++) {
            for (int i3 = 0; i3 < 100; i3++) {
                if (!com.corrodinggames.rts.game.units.custom.e.a.a(i3 + "9870000001.67", com.corrodinggames.rts.game.units.custom.e.b.comma).equals(VariableScope.nullOrMissingString)) {
                    i++;
                }
            }
        }
        double a2 = br.a(valueOf.longValue(), Long.valueOf(br.a()).longValue());
        this.f79a += i;
        GameEngine.m328e("Took: " + a2);
        int i4 = 0;
        GameEngine.m328e("=== applyDigitGroupingStyle_systemLibraryVersion tests (runs:5)");
        Long valueOf2 = Long.valueOf(br.a());
        for (int i5 = 0; i5 < 5; i5++) {
            for (int i6 = 0; i6 < 100; i6++) {
                if (!com.corrodinggames.rts.game.units.custom.e.a.a(i6 + 9870000001L, com.corrodinggames.rts.game.units.custom.e.b.comma).equals(VariableScope.nullOrMissingString)) {
                    i4++;
                }
            }
        }
        double a3 = br.a(valueOf2.longValue(), Long.valueOf(br.a()).longValue());
        this.f79a += i4;
        GameEngine.m328e("Took: " + a3);
        int i7 = 0;
        GameEngine.m328e("=== isLineClear tests (runs:3)");
        Long valueOf3 = Long.valueOf(br.a());
        for (int i8 = 0; i8 < 3; i8++) {
            for (int i9 = 0; i9 < 100; i9++) {
                if (aq.b(ao.LAND, i9, 1000 - i9, 50, 50, 1000, 1, 1)) {
                    i7++;
                }
            }
        }
        double a4 = br.a(valueOf3.longValue(), Long.valueOf(br.a()).longValue());
        this.f79a += i7;
        GameEngine.m328e("Took: " + a4);
        int i10 = 0;
        GameEngine.m328e("=== maths tests == (runs:3)");
        Long valueOf4 = Long.valueOf(br.a());
        for (int i11 = 0; i11 < 3; i11++) {
            for (int i12 = 0; i12 < 1000; i12++) {
                Point point = e;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                point.f45a += i12;
                this.b++;
                i10 += 0;
            }
        }
        double a5 = br.a(valueOf4.longValue(), Long.valueOf(br.a()).longValue());
        this.f79a += i10;
        GameEngine.m328e("Took: " + a5);
        com.corrodinggames.rts.gameFramework.utility.m mVar = new com.corrodinggames.rts.gameFramework.utility.m();
        int i13 = 0;
        for (int i14 = 0; i14 < 20000; i14++) {
            com.corrodinggames.rts.game.units.custom.i iVar = new com.corrodinggames.rts.game.units.custom.i();
            if (i14 % 10 != 0) {
                iVar.a(com.corrodinggames.rts.game.units.custom.g.c("test"));
                iVar.a(com.corrodinggames.rts.game.units.custom.g.c("test1"));
            }
            if (i14 % 2 == 0) {
                iVar.a(com.corrodinggames.rts.game.units.custom.g.c("test2"));
                i13++;
            }
            if (i14 % 3 == 0) {
                iVar.a(com.corrodinggames.rts.game.units.custom.g.c("test3"));
            }
            if (i14 % 4 == 0) {
                iVar.a(com.corrodinggames.rts.game.units.custom.g.c("test4"));
            }
            if (i14 % 5 == 0) {
                mVar.add(null);
            }
            mVar.add(iVar.a());
        }
        com.corrodinggames.rts.game.units.custom.h a6 = com.corrodinggames.rts.game.units.custom.g.a("test2");
        GameEngine.m328e("=== CustomTagList tests == (runs:5)");
        for (int i15 = 0; i15 < 14; i15++) {
            Long valueOf5 = Long.valueOf(br.a());
            for (int i16 = 0; i16 < 5; i16++) {
                int i17 = 0;
                Iterator it = mVar.iterator();
                while (it.hasNext()) {
                    if (com.corrodinggames.rts.game.units.custom.g.a(a6, (com.corrodinggames.rts.game.units.custom.h) it.next())) {
                        i17++;
                    }
                }
                n.a(i13, i17);
            }
            GameEngine.m328e("test2Expected:" + i13);
            double a7 = br.a(valueOf5.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += 0;
            GameEngine.m328e("Took: " + a7);
        }
        for (int i18 = 0; i18 < 2; i18++) {
            GameEngine.m328e("=== [Write]/comparison tests == (runs:5)");
            for (int i19 = 0; i19 < 5; i19++) {
                Random random = new Random();
                h[] hVarArr = new h[5000000];
                for (int i20 = 0; i20 < hVarArr.length; i20++) {
                    hVarArr[i20] = new h();
                    hVarArr[i20].d = random.nextFloat() < 0.5f;
                }
                Long valueOf6 = Long.valueOf(br.a());
                for (int i21 = 0; i21 < 5; i21++) {
                    for (h hVar : hVarArr) {
                        hVar.d = false;
                    }
                }
                double a8 = br.a(valueOf6.longValue(), Long.valueOf(br.a()).longValue());
                this.f79a += 0;
                GameEngine.m328e("Took: " + a8);
            }
            GameEngine.m328e("=== Write/[comparison] tests == (runs:5)");
            for (int i22 = 0; i22 < 5; i22++) {
                Random random2 = new Random();
                h[] hVarArr2 = new h[5000000];
                for (int i23 = 0; i23 < hVarArr2.length; i23++) {
                    hVarArr2[i23] = new h();
                    hVarArr2[i23].d = random2.nextFloat() < 0.5f;
                }
                Long valueOf7 = Long.valueOf(br.a());
                for (int i24 = 0; i24 < 5; i24++) {
                    for (h hVar2 : hVarArr2) {
                        if (hVar2.d) {
                            hVar2.d = false;
                        }
                    }
                }
                double a9 = br.a(valueOf7.longValue(), Long.valueOf(br.a()).longValue());
                this.f79a += 0;
                GameEngine.m328e("Took: " + a9);
            }
        }
        int i25 = 0;
        GameEngine.m328e("=== [Virtual method]/if tests == (runs:5)");
        for (int i26 = 0; i26 < 7; i26++) {
            Random random3 = new Random();
            i[] iVarArr = new i[1000];
            for (int i27 = 0; i27 < iVarArr.length; i27++) {
                if (random3.nextFloat() < 0.3f) {
                    j jVar = new j(this);
                    jVar.c = random3.nextInt(1000);
                    iVarArr[i27] = jVar;
                } else {
                    iVarArr[i27] = new i(this);
                    iVarArr[i27].f82a = random3.nextInt(1000);
                }
            }
            Long valueOf8 = Long.valueOf(br.a());
            for (int i28 = 0; i28 < 5; i28++) {
                for (i iVar2 : iVarArr) {
                    if (iVar2.a() == 0) {
                        i25++;
                    }
                }
            }
            double a10 = br.a(valueOf8.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i25;
            GameEngine.m328e("Took: " + a10);
        }
        int i29 = 0;
        GameEngine.m328e("=== Virtual method/[if tests] == (runs:5)");
        for (int i30 = 0; i30 < 7; i30++) {
            Random random4 = new Random();
            g[] gVarArr = new g[1000];
            for (int i31 = 0; i31 < gVarArr.length; i31++) {
                boolean z = random4.nextFloat() < 0.3f;
                g gVar = new g(this);
                gVar.b = random4.nextInt(1000);
                gVar.f80a = random4.nextInt(1000);
                gVar.c = z;
                gVarArr[i31] = gVar;
            }
            Long valueOf9 = Long.valueOf(br.a());
            for (int i32 = 0; i32 < 5; i32++) {
                for (g gVar2 : gVarArr) {
                    if (gVar2.a() == 0) {
                        i29++;
                    }
                }
            }
            double a11 = br.a(valueOf9.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i29;
            GameEngine.m328e("Took: " + a11);
        }
        int i33 = 0;
        GameEngine.m328e("=== comparison tests 1 == (runs:10)");
        for (int i34 = 0; i34 < 14; i34++) {
            Random random5 = new Random();
            float[] fArr = new float[600 * 600];
            for (int i35 = 0; i35 < 600; i35++) {
                for (int i36 = 0; i36 < 600; i36++) {
                    fArr[(i35 * 600) + i36] = random5.nextFloat();
                }
            }
            Long valueOf10 = Long.valueOf(br.a());
            for (int i37 = 0; i37 < 10; i37++) {
                for (int i38 = 0; i38 < 600; i38++) {
                    for (int i39 = 0; i39 < 600; i39++) {
                        i33 = (int) (i33 + fArr[(i38 * 600) + i39]);
                    }
                }
            }
            double a12 = br.a(valueOf10.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i33;
            GameEngine.m328e("Took: " + a12);
        }
        int i40 = 0;
        GameEngine.m328e("=== comparison tests 2 == (runs:10)");
        for (int i41 = 0; i41 < 14; i41++) {
            Random random6 = new Random();
            float[][] fArr2 = new float[600][600];
            for (int i42 = 0; i42 < 600; i42++) {
                for (int i43 = 0; i43 < 600; i43++) {
                    fArr2[i42][i43] = random6.nextFloat();
                }
            }
            Long valueOf11 = Long.valueOf(br.a());
            for (int i44 = 0; i44 < 10; i44++) {
                for (int i45 = 0; i45 < 600; i45++) {
                    for (int i46 = 0; i46 < 600; i46++) {
                        i40 = (int) (i40 + fArr2[i45][i46]);
                    }
                }
            }
            double a13 = br.a(valueOf11.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i40;
            GameEngine.m328e("Took: " + a13);
        }
        int i47 = 0;
        GameEngine.m328e("=== [divide]/multiply float tests == (runs:5)");
        for (int i48 = 0; i48 < 5; i48++) {
            Random random7 = new Random();
            float[] fArr3 = new float[5000000];
            float[] fArr4 = new float[5000000];
            for (int i49 = 0; i49 < fArr3.length; i49++) {
                fArr3[i49] = random7.nextFloat();
                fArr4[i49] = random7.nextFloat();
            }
            Long valueOf12 = Long.valueOf(br.a());
            for (int i50 = 0; i50 < 5; i50++) {
                for (int i51 = 0; i51 < fArr3.length; i51++) {
                    if (fArr3[i51] / fArr4[i51] == 0.0f) {
                        i47++;
                    }
                }
            }
            double a14 = br.a(valueOf12.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i47;
            GameEngine.m328e("Took: " + a14);
        }
        int i52 = 0;
        GameEngine.m328e("=== divide/[multiply] float tests == (runs:5)");
        for (int i53 = 0; i53 < 5; i53++) {
            Random random8 = new Random();
            float[] fArr5 = new float[5000000];
            float[] fArr6 = new float[5000000];
            for (int i54 = 0; i54 < fArr5.length; i54++) {
                fArr5[i54] = random8.nextFloat();
                fArr6[i54] = random8.nextFloat();
            }
            Long valueOf13 = Long.valueOf(br.a());
            for (int i55 = 0; i55 < 5; i55++) {
                for (int i56 = 0; i56 < fArr5.length; i56++) {
                    if (fArr5[i56] * fArr6[i56] == 0.0f) {
                        i52++;
                    }
                }
            }
            double a15 = br.a(valueOf13.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i52;
            GameEngine.m328e("Took: " + a15);
        }
        int i57 = 0;
        GameEngine.m328e("=== [divide]/multiply int tests == (runs:5)");
        for (int i58 = 0; i58 < 5; i58++) {
            Random random9 = new Random();
            int[] iArr = new int[5000000];
            int[] iArr2 = new int[5000000];
            for (int i59 = 0; i59 < iArr.length; i59++) {
                iArr[i59] = random9.nextInt();
                iArr2[i59] = random9.nextInt();
            }
            Long valueOf14 = Long.valueOf(br.a());
            for (int i60 = 0; i60 < 5; i60++) {
                for (int i61 = 0; i61 < iArr.length; i61++) {
                    if (iArr[i61] / iArr2[i61] == 0) {
                        i57++;
                    }
                }
            }
            double a16 = br.a(valueOf14.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i57;
            GameEngine.m328e("Took: " + a16);
        }
        int i62 = 0;
        GameEngine.m328e("=== [float cast and divide]/multiply int tests == (runs:5)");
        for (int i63 = 0; i63 < 5; i63++) {
            Random random10 = new Random();
            int[] iArr3 = new int[5000000];
            int[] iArr4 = new int[5000000];
            for (int i64 = 0; i64 < iArr3.length; i64++) {
                iArr3[i64] = random10.nextInt();
                iArr4[i64] = random10.nextInt();
            }
            Long valueOf15 = Long.valueOf(br.a());
            for (int i65 = 0; i65 < 5; i65++) {
                for (int i66 = 0; i66 < iArr3.length; i66++) {
                    if (iArr3[i66] / iArr4[i66] == 0.0f) {
                        i62++;
                    }
                }
            }
            double a17 = br.a(valueOf15.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i62;
            GameEngine.m328e("Took: " + a17);
        }
        int i67 = 0;
        GameEngine.m328e("=== [mixed float and divide]/multiply int tests == (runs:5)");
        for (int i68 = 0; i68 < 5; i68++) {
            Random random11 = new Random();
            int[] iArr5 = new int[5000000];
            float[] fArr7 = new float[5000000];
            for (int i69 = 0; i69 < iArr5.length; i69++) {
                iArr5[i69] = random11.nextInt();
                fArr7[i69] = random11.nextFloat();
            }
            Long valueOf16 = Long.valueOf(br.a());
            for (int i70 = 0; i70 < 5; i70++) {
                for (int i71 = 0; i71 < iArr5.length; i71++) {
                    if (iArr5[i71] / fArr7[i71] == 0.0f) {
                        i67++;
                    }
                }
            }
            double a18 = br.a(valueOf16.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i67;
            GameEngine.m328e("Took: " + a18);
        }
        int i72 = 0;
        GameEngine.m328e("=== divide/[multiply] int tests == (runs:5)");
        for (int i73 = 0; i73 < 5; i73++) {
            Random random12 = new Random();
            int[] iArr6 = new int[5000000];
            int[] iArr7 = new int[5000000];
            for (int i74 = 0; i74 < iArr6.length; i74++) {
                iArr6[i74] = random12.nextInt();
                iArr7[i74] = random12.nextInt();
            }
            Long valueOf17 = Long.valueOf(br.a());
            for (int i75 = 0; i75 < 5; i75++) {
                for (int i76 = 0; i76 < iArr6.length; i76++) {
                    if (iArr6[i76] * iArr7[i76] == 0) {
                        i72++;
                    }
                }
            }
            double a19 = br.a(valueOf17.longValue(), Long.valueOf(br.a()).longValue());
            this.f79a += i72;
            GameEngine.m328e("Took: " + a19);
        }
    }
}