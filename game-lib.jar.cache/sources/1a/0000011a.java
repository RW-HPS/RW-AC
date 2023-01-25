package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0440b;
import com.corrodinggames.rts.game.units.custom.p023f.C0448b;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0768d;
import com.corrodinggames.rts.gameFramework.file.C0769e;
import com.corrodinggames.rts.gameFramework.mod.C0858a;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1112ag;
import com.corrodinggames.rts.gameFramework.utility.C1118al;
import com.corrodinggames.rts.gameFramework.utility.C1133j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/e.class */
public class C0076e extends AbstractScriptTest {

    /* renamed from: a */
    int f395a = 1;

    /* renamed from: a */
    public void m5437a() {
        GameEngine.m5924e("separator regex test");
        "first".split(Pattern.quote(File.separator));
        C0085n.m5417a("first\\second".split(Pattern.quote("\\"))[0], "first");
        C0085n.m5417a("first/second".split(Pattern.quote("/"))[0], "first");
        GameEngine.m5924e("Test for dis sq ranges");
        C0085n.m5416a(50 < 850000 * 850000);
        C0085n.m5416a(50.0f < ((float) (850000 * 850000)));
        C0085n.m5416a(50 < 8500000 * 8500000);
        C0085n.m5416a(50.0f < ((float) (8500000 * 8500000)));
        Random random = new Random();
        float[] fArr = new float[10000];
        for (int i = 1; i < 5; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr[i3] = random.nextFloat() * 50.0f;
            }
            long m2574a = C0742br.m2574a();
            for (int i4 = 0; i4 < 1000; i4++) {
                for (float f : fArr) {
                    i2 += C0773f.m2345a((int) f);
                }
            }
            GameEngine.m5924e("sum:" + i2);
            GameEngine.m5924e("fastSquareRootInt took:" + C0742br.m2573a(C0742br.m2572a(m2574a)));
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr[i5] = random.nextFloat() * 50.0f;
            }
            long m2574a2 = C0742br.m2574a();
            int i6 = 0;
            for (int i7 = 0; i7 < 1000; i7++) {
                for (float f2 : fArr) {
                    i6 = (int) (i6 + C0773f.m2353a((int) f2));
                }
            }
            GameEngine.m5924e("sum:" + i6);
            GameEngine.m5924e("squareRoot took:" + C0742br.m2573a(C0742br.m2572a(m2574a2)));
        }
        GameEngine.m5924e("CommonUtils.fastSplit");
        String[] m2279c = C0773f.m2279c("testA|testB", '|');
        C0085n.m5419a(m2279c.length, 2);
        C0085n.m5417a(m2279c[0], "testA");
        C0085n.m5417a(m2279c[1], "testB");
        String[] m2279c2 = C0773f.m2279c("test|", '|');
        C0085n.m5419a(m2279c2.length, "test|".split("\\|").length);
        C0085n.m5417a(m2279c2[0], "test");
        String[] m2279c3 = C0773f.m2279c("|test", '|');
        C0085n.m5419a(m2279c3.length, 2);
        C0085n.m5417a(m2279c3[0], VariableScope.nullOrMissingString);
        C0085n.m5417a(m2279c3[1], "test");
        C0085n.m5419a(C0773f.m2279c("|", '|').length, 0);
        GameEngine.m5924e("VariableReplacement");
        C0448b c0448b = new C0448b();
        c0448b.f2854b.m3964a("a", "5");
        c0448b.f2854b.m3964a("b", "10");
        c0448b.f2854b.m3964a("abc_foo", "7");
        C0458l c0458l = C0458l.f2933b;
        try {
            C1107ab c1107ab = new C1107ab("assets/" + c0458l.f2944D);
            try {
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "123"), "123");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "1+1"), "2");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "(1+1)*2"), "4");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "a+b"), "15");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "a+a+abc_foo"), "17");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "(2+2)*(2+2)"), "16");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "10/5"), "2");
                C0085n.m5417a(c0448b.m3977a(c0458l, c1107ab, "core", "10-5"), "5");
                C0085n.m5413c(c0448b.m3977a(c0458l, c1107ab, "core", "cos(60)"), "0.5");
                C0085n.m5413c(c0448b.m3977a(c0458l, c1107ab, "core", "sin(b+20+(2-2)+(5*0))"), "0.5");
                GameEngine.m5924e("PassthroughZipReader");
                C0085n.m5417a(C1112ag.m628l("/first/second/zip.rwmod/test1/test2"), "test1/test2");
                C0085n.m5417a(C1112ag.m628l("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
                m5436a("A", "B");
                m5436a("AA=11", "BB=22");
                m5436a("AA='11'", "BB='22'");
                m5436a("AA=(11)", "BB=22");
                m5436a("(AA)=(11)", "BB=22");
                m5436a("(AA)=('11')", "BB=22");
                m5436a("(AA)=('11')", "BB=((22))");
                m5436a("(A,A)=('1,1')", "BB=((2,2))");
                m5436a("(A,A)=('1,,1')", "BB=((2,2))");
                GameEngine.m5924e("splitWithEscaping");
                m5433a(C1118al.m598b("hello world", ' '), "hello", "world");
                m5434a(C1118al.m598b("hello world", 'X'), "hello world");
                m5433a(C1118al.m598b("hello,world", ','), "hello", "world");
                m5433a(C1118al.m598b("he\\,llo,world", ','), "he,llo", "world");
                m5434a(VariableScope.nullOrMissingString.split(" "), VariableScope.nullOrMissingString);
                m5434a(C1118al.m598b(VariableScope.nullOrMissingString, ' '), VariableScope.nullOrMissingString);
                m5433a(C1118al.m598b("hello\\\\,World", ','), "hello\\", "World");
                m5433a(C1118al.m598b("Hello\\A,world", ','), "HelloA", "world");
                m5434a(C1118al.m598b("h\\ello\\,world", ','), "hello,world");
                m5433a(C1118al.m598b("h\\ello\\,w,orld", ','), "hello,w", "orld");
                m5433a(C1118al.m598b("h\\ello\\,w,orld", ','), "hello,w", "orld");
                C0085n.m5417a(C1118al.m600a(new String[]{"Hello"}), "Hello");
                C0085n.m5417a(C1118al.m600a(new String[]{"Hello", "World"}), "Hello,World");
                C0085n.m5417a(C1118al.m600a(new String[]{"Hel,lo", "World"}), "Hel\\,lo,World");
                C0085n.m5417a(C1118al.m600a(new String[]{"Hel,lo,", "Wor,ld"}), "Hel\\,lo\\,,Wor\\,ld");
                C0085n.m5417a(C1118al.m600a(new String[]{"Hel\\,lo,", "Wor,ld"}), "Hel\\\\\\,lo\\,,Wor\\,ld");
                C0085n.m5417a(C1118al.m600a(new String[]{"H\\el\\,lo,", "Wor,ld"}), "H\\\\el\\\\\\,lo\\,,Wor\\,ld");
                GameEngine.m5924e("FileLoaderBackend");
                C0768d c0768d = new C0768d("/tmp/rustedWarfareTests/", "test1");
                c0768d.f4954a = "fileLoader1: ";
                c0768d.f4955b = true;
                C0768d c0768d2 = new C0768d("/tmp/rustedWarfareTestsSec2/", "test2");
                c0768d2.f4954a = "fileLoader2: ";
                c0768d2.f4955b = true;
                C0769e c0769e = new C0769e(c0768d, "primary-PATH/", c0768d2, "[ALT-PATH]/");
                c0769e.f4954a = "mergedFileLoader: ";
                c0769e.f4955b = true;
                C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m5415b(c0768d.mo2384f("units/test.ini"), "assets/units/test.ini");
                GameEngine.m5924e("FileLoaderBackend - merged");
                C0085n.m5415b(c0769e.mo2384f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m5415b(c0769e.mo2384f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                GameEngine.m5924e("FileLoaderBackend - android fake");
                boolean z = GameEngine.f6418aU;
                GameEngine.f6418aU = false;
                try {
                    C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                    C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m5415b(c0768d.mo2384f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m5415b(c0768d.mo2384f("units/test.ini"), "units/test.ini");
                    GameEngine.f6418aU = z;
                    if (1 != 0) {
                        GameEngine.m5924e("FileLoaderBackend - real file tests");
                        File file = new File(c0768d.mo2384f("/SD/rustedWarfare/testDir"));
                        file.mkdirs();
                        new File(c0768d2.mo2384f("/SD/rustedWarfare/testDir")).mkdirs();
                        try {
                            try {
                                File file2 = new File(c0768d.mo2384f("/SD/rustedWarfare/testDir/map1.tmx"));
                                file2.createNewFile();
                                FileWriter fileWriter = new FileWriter(file2);
                                fileWriter.write("map1");
                                fileWriter.close();
                                new File(c0768d.mo2384f("/SD/rustedWarfare/testDir/map2.tmx")).createNewFile();
                                File file3 = new File(c0768d2.mo2384f("/SD/rustedWarfare/testDir/map3.tmx"));
                                file3.createNewFile();
                                FileWriter fileWriter2 = new FileWriter(file3);
                                fileWriter2.write("map3");
                                fileWriter2.close();
                                String[] b = c0768d.mo2374b("/SD/rustedWarfare/testDir", false);
                                C0085n.m5419a(b.length, 2);
                                C0085n.m5415b(b[0], "map1.tmx");
                                C0085n.m5415b(b[1], "map2.tmx");
                                String[] mo2374b = c0769e.mo2374b("/SD/rustedWarfare/testDir", false);
                                C0085n.m5419a(mo2374b.length, 3);
                                C0085n.m5415b(mo2374b[0], "primary-PATH/map1.tmx");
                                C0085n.m5415b(mo2374b[1], "primary-PATH/map2.tmx");
                                C0085n.m5415b(mo2374b[2], "[ALT-PATH]/map3.tmx");
                                String str = mo2374b[2];
                                C1133j mo2381j = c0769e.mo2381j("/SD/rustedWarfare/testDir/" + str);
                                if (mo2381j == null) {
                                    throw new RuntimeException("Null for: /SD/rustedWarfare/testDir/" + str);
                                }
                                C0085n.m5415b(C0773f.m2295b(mo2381j), "map3");
                                GameEngine.m5924e("FileLoaderBackend - clean up");
                                for (String str2 : file.list()) {
                                    new File(file.getPath(), str2).delete();
                                }
                                file.delete();
                                GameEngine.m5924e("isSameOrHigherVersion..");
                                m5435a("v1.13", "v1.14", true);
                                m5435a("v1.13", "v2.14", true);
                                m5435a("v1.13", "v2.11", true);
                                m5435a("v1.13", "v1.13p5", false);
                                m5435a("v1.13", "v1.13.2", true);
                                m5435a("v1.13.2", "v1.13", false);
                                m5435a("v1.13", "v1.13b", true);
                                m5435a("v1.13", "v1.13.2p6", true);
                                m5435a("v1.13", "v1.14.2p6", true);
                                m5435a("v1.13p9", "v1.14.2p6", true);
                                m5435a("v1.13p9", "v1.14p6", true);
                                m5435a("v1.14p3", "v1.14p6", true);
                                m5435a("v1.14p3", "v1.14p6b", true);
                                m5435a("v1.14p8", "v1.14p3", false);
                                m5435a("v1", "v2", true);
                                m5435a("v1.5", "v2", true);
                                m5435a("v2", "v1.15", false);
                                m5435a("v2.0.5", "v1.15", false);
                                m5435a("v1.15", "v2.0.5", true);
                                m5435a("v1.15.6", "v2.0.5", true);
                                m5435a("v1.15.6", "v1.16.5", true);
                                m5435a("v1.13", "v1.13.2p5", true);
                                m5435a("v1.14", "v1.14p3", false);
                                m5435a("v1.14b", "v1.14p3", false);
                                m5435a("v1.14.2", "v1.14p3", false);
                                m5435a("v1.14.2b", "v1.14p3", false);
                                try {
                                    C0858a.m1835a("v1.11p1");
                                    C0085n.m5417a(C0433a.m4055a("10000", EnumC0440b.f2793a), "10000");
                                    C0085n.m5417a(C0433a.m4055a(VariableScope.nullOrMissingString, EnumC0440b.f2794b), VariableScope.nullOrMissingString);
                                    C0085n.m5417a(C0433a.m4055a("1", EnumC0440b.f2795c), "1");
                                    C0085n.m5417a(C0433a.m4055a("10", EnumC0440b.f2795c), "10");
                                    C0085n.m5417a(C0433a.m4055a("100", EnumC0440b.f2795c), "100");
                                    C0085n.m5417a(C0433a.m4055a("1000", EnumC0440b.f2795c), "1,000");
                                    C0085n.m5417a(C0433a.m4055a(".", EnumC0440b.f2795c), ".");
                                    C0085n.m5417a(C0433a.m4055a(".2", EnumC0440b.f2795c), ".2");
                                    C0085n.m5417a(C0433a.m4055a(".22", EnumC0440b.f2795c), ".22");
                                    C0085n.m5417a(C0433a.m4055a(".223", EnumC0440b.f2795c), ".223");
                                    C0085n.m5417a(C0433a.m4055a(".2234", EnumC0440b.f2795c), ".2234");
                                    C0085n.m5417a(C0433a.m4055a("100.2234", EnumC0440b.f2795c), "100.2234");
                                    C0085n.m5417a(C0433a.m4055a("1000.2234", EnumC0440b.f2795c), "1,000.2234");
                                    C0085n.m5417a(C0433a.m4055a("10000", EnumC0440b.f2795c), "10,000");
                                    C0085n.m5417a(C0433a.m4055a("9800000", EnumC0440b.f2795c), "9,800,000");
                                    C0085n.m5417a(C0433a.m4055a("9800000.67", EnumC0440b.f2795c), "9,800,000.67");
                                    C0085n.m5417a(C0433a.m4055a("98000000.67", EnumC0440b.f2795c), "98,000,000.67");
                                    C0085n.m5417a(C0433a.m4055a("980000000.67", EnumC0440b.f2795c), "980,000,000.67");
                                    C0085n.m5417a(C0433a.m4055a("9800000001.67", EnumC0440b.f2795c), "9,800,000,001.67");
                                    C0085n.m5417a(C0433a.m4055a("9800000001.6", EnumC0440b.f2795c), "9,800,000,001.6");
                                    C0085n.m5417a(C0433a.m4055a("9800000001.", EnumC0440b.f2795c), "9,800,000,001.");
                                    C0085n.m5417a(C0433a.m4055a("9800000001", EnumC0440b.f2795c), "9,800,000,001");
                                    C0085n.m5417a(C0433a.m4058a(9800000L, EnumC0440b.f2795c), "9,800,000");
                                } catch (C0417bo e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (Throwable th) {
                            GameEngine.m5924e("FileLoaderBackend - clean up");
                            for (String str3 : file.list()) {
                                new File(file.getPath(), str3).delete();
                            }
                            file.delete();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    GameEngine.f6418aU = z;
                    throw th2;
                }
            } catch (C0417bo e3) {
                throw new RuntimeException(e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m5436a(String str, String str2) {
        ArrayList m601a = C1118al.m601a(str + "," + str2, ",", false, false);
        C0085n.m5417a((String) m601a.get(0), str);
        C0085n.m5417a((String) m601a.get(1), str2);
    }

    /* renamed from: a */
    public void m5434a(String[] strArr, String str) {
        C0085n.m5419a(strArr.length, 1);
        C0085n.m5417a(strArr[0], str);
    }

    /* renamed from: a */
    public void m5433a(String[] strArr, String str, String str2) {
        C0085n.m5419a(strArr.length, 2);
        C0085n.m5417a(strArr[0], str);
        C0085n.m5417a(strArr[1], str2);
    }

    /* renamed from: a */
    public void m5435a(String str, String str2, boolean z) {
        boolean z2;
        try {
            C0858a.m1832a(str, str2);
            z2 = true;
        } catch (C0417bo e) {
            if (z) {
                GameEngine.print(e.getMessage());
            }
            z2 = false;
        }
        if (z2 != z) {
            throw new RuntimeException("isSameOrHigherVersion(" + str + "," + str2 + "): Asset failed got: " + z2);
        }
    }
}