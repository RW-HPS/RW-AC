package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.e.a;
import com.corrodinggames.rts.game.units.custom.f.b;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.file.d;
import com.corrodinggames.rts.gameFramework.file.e;
import com.corrodinggames.rts.gameFramework.mod.ModEngine;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.ag;
import com.corrodinggames.rts.gameFramework.utility.al;
import com.corrodinggames.rts.gameFramework.utility.j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/e.class */
public class TestRegex extends AbstractScriptTest {
    int a = 1;

    public void a() {
        GameEngine.m5e("separator regex test");
        "first".split(Pattern.quote(File.separator));
        n.a("first\\second".split(Pattern.quote("\\"))[0], "first");
        n.a("first/second".split(Pattern.quote("/"))[0], "first");
        GameEngine.m5e("Test for dis sq ranges");
        n.a(50 < 850000 * 850000);
        n.a(50.0f < ((float) (850000 * 850000)));
        n.a(50 < 8500000 * 8500000);
        n.a(50.0f < ((float) (8500000 * 8500000)));
        Random random = new Random();
        float[] fArr = new float[10000];
        for (int i = 1; i < 5; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr[i3] = random.nextFloat() * 50.0f;
            }
            long loadAllUnitsTook = Unit.loadAllUnitsTook();
            for (int i4 = 0; i4 < 1000; i4++) {
                for (float f : fArr) {
                    i2 += f.a((int) f);
                }
            }
            GameEngine.m5e("sum:" + i2);
            GameEngine.m5e("fastSquareRootInt took:" + Unit.a(Unit.a(loadAllUnitsTook)));
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr[i5] = random.nextFloat() * 50.0f;
            }
            long loadAllUnitsTook2 = Unit.loadAllUnitsTook();
            int i6 = 0;
            for (int i7 = 0; i7 < 1000; i7++) {
                for (float f2 : fArr) {
                    i6 = (int) (i6 + f.a((int) f2));
                }
            }
            GameEngine.m5e("sum:" + i6);
            GameEngine.m5e("squareRoot took:" + Unit.a(Unit.a(loadAllUnitsTook2)));
        }
        GameEngine.m5e("CommonUtils.fastSplit");
        String[] c = f.c("testA|testB", '|');
        n.a(c.length, 2);
        n.a(c[0], "testA");
        n.a(c[1], "testB");
        String[] c2 = f.c("test|", '|');
        n.a(c2.length, "test|".split("\\|").length);
        n.a(c2[0], "test");
        String[] c3 = f.c("|test", '|');
        n.a(c3.length, 2);
        n.a(c3[0], VariableScope.nullOrMissingString);
        n.a(c3[1], "test");
        n.a(f.c("|", '|').length, 0);
        GameEngine.m5e("VariableReplacement");
        b bVar = new b();
        bVar.b.a("a", "5");
        bVar.b.a("b", "10");
        bVar.b.a("abc_foo", "7");
        l lVar = l.b;
        try {
            ab abVar = new ab("assets/" + lVar.D);
            try {
                n.a(bVar.a(lVar, abVar, "core", "123"), "123");
                n.a(bVar.a(lVar, abVar, "core", "1+1"), "2");
                n.a(bVar.a(lVar, abVar, "core", "(1+1)*2"), "4");
                n.a(bVar.a(lVar, abVar, "core", "a+b"), "15");
                n.a(bVar.a(lVar, abVar, "core", "a+a+abc_foo"), "17");
                n.a(bVar.a(lVar, abVar, "core", "(2+2)*(2+2)"), "16");
                n.a(bVar.a(lVar, abVar, "core", "10/5"), "2");
                n.a(bVar.a(lVar, abVar, "core", "10-5"), "5");
                n.c(bVar.a(lVar, abVar, "core", "cos(60)"), "0.5");
                n.c(bVar.a(lVar, abVar, "core", "sin(b+20+(2-2)+(5*0))"), "0.5");
                GameEngine.m5e("PassthroughZipReader");
                n.a(ag.l("/first/second/zip.rwmod/test1/test2"), "test1/test2");
                n.a(ag.l("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
                a("A", "B");
                a("AA=11", "BB=22");
                a("AA='11'", "BB='22'");
                a("AA=(11)", "BB=22");
                a("(AA)=(11)", "BB=22");
                a("(AA)=('11')", "BB=22");
                a("(AA)=('11')", "BB=((22))");
                a("(A,A)=('1,1')", "BB=((2,2))");
                a("(A,A)=('1,,1')", "BB=((2,2))");
                GameEngine.m5e("splitWithEscaping");
                a(al.b("hello world", ' '), "hello", "world");
                a(al.b("hello world", 'X'), "hello world");
                a(al.b("hello,world", ','), "hello", "world");
                a(al.b("he\\,llo,world", ','), "he,llo", "world");
                a(VariableScope.nullOrMissingString.split(" "), VariableScope.nullOrMissingString);
                a(al.b(VariableScope.nullOrMissingString, ' '), VariableScope.nullOrMissingString);
                a(al.b("hello\\\\,World", ','), "hello\\", "World");
                a(al.b("Hello\\A,world", ','), "HelloA", "world");
                a(al.b("h\\ello\\,world", ','), "hello,world");
                a(al.b("h\\ello\\,w,orld", ','), "hello,w", "orld");
                a(al.b("h\\ello\\,w,orld", ','), "hello,w", "orld");
                n.a(al.a(new String[]{"Hello"}), "Hello");
                n.a(al.a(new String[]{"Hello", "World"}), "Hello,World");
                n.a(al.a(new String[]{"Hel,lo", "World"}), "Hel\\,lo,World");
                n.a(al.a(new String[]{"Hel,lo,", "Wor,ld"}), "Hel\\,lo\\,,Wor\\,ld");
                n.a(al.a(new String[]{"Hel\\,lo,", "Wor,ld"}), "Hel\\\\\\,lo\\,,Wor\\,ld");
                n.a(al.a(new String[]{"H\\el\\,lo,", "Wor,ld"}), "H\\\\el\\\\\\,lo\\,,Wor\\,ld");
                GameEngine.m5e("FileLoaderBackend");
                d dVar = new d("/tmp/rustedWarfareTests/", "test1");
                dVar.a = "fileLoader1: ";
                dVar.b = true;
                d dVar2 = new d("/tmp/rustedWarfareTestsSec2/", "test2");
                dVar2.a = "fileLoader2: ";
                dVar2.b = true;
                e eVar = new e(dVar, "primary-PATH/", dVar2, "[ALT-PATH]/");
                eVar.a = "mergedFileLoader: ";
                eVar.b = true;
                n.b(dVar.f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                n.b(dVar.f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                n.b(dVar.f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                n.b(dVar.f("units/test.ini"), "assets/units/test.ini");
                GameEngine.m5e("FileLoaderBackend - merged");
                n.b(eVar.f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                n.b(eVar.f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                GameEngine.m5e("FileLoaderBackend - android fake");
                boolean z = GameEngine.aU;
                GameEngine.aU = false;
                try {
                    n.b(dVar.f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                    n.b(dVar.f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    n.b(dVar.f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    n.b(dVar.f("units/test.ini"), "units/test.ini");
                    GameEngine.aU = z;
                    if (1 != 0) {
                        GameEngine.m5e("FileLoaderBackend - real file tests");
                        File file = new File(dVar.f("/SD/rustedWarfare/testDir"));
                        file.mkdirs();
                        new File(dVar2.f("/SD/rustedWarfare/testDir")).mkdirs();
                        try {
                            try {
                                File file2 = new File(dVar.f("/SD/rustedWarfare/testDir/map1.tmx"));
                                file2.createNewFile();
                                FileWriter fileWriter = new FileWriter(file2);
                                fileWriter.write("map1");
                                fileWriter.close();
                                new File(dVar.f("/SD/rustedWarfare/testDir/map2.tmx")).createNewFile();
                                File file3 = new File(dVar2.f("/SD/rustedWarfare/testDir/map3.tmx"));
                                file3.createNewFile();
                                FileWriter fileWriter2 = new FileWriter(file3);
                                fileWriter2.write("map3");
                                fileWriter2.close();
                                String[] b = dVar.b("/SD/rustedWarfare/testDir", false);
                                n.a(b.length, 2);
                                n.b(b[0], "map1.tmx");
                                n.b(b[1], "map2.tmx");
                                String[] b2 = eVar.b("/SD/rustedWarfare/testDir", false);
                                n.a(b2.length, 3);
                                n.b(b2[0], "primary-PATH/map1.tmx");
                                n.b(b2[1], "primary-PATH/map2.tmx");
                                n.b(b2[2], "[ALT-PATH]/map3.tmx");
                                String str = b2[2];
                                j j = eVar.j("/SD/rustedWarfare/testDir/" + str);
                                if (j == null) {
                                    throw new RuntimeException("Null for: /SD/rustedWarfare/testDir/" + str);
                                }
                                n.b(f.b(j), "map3");
                                GameEngine.m5e("FileLoaderBackend - clean up");
                                for (String str2 : file.list()) {
                                    new File(file.getPath(), str2).delete();
                                }
                                file.delete();
                                GameEngine.m5e("isSameOrHigherVersion..");
                                a("v1.13", "v1.14", true);
                                a("v1.13", "v2.14", true);
                                a("v1.13", "v2.11", true);
                                a("v1.13", "v1.13p5", false);
                                a("v1.13", "v1.13.2", true);
                                a("v1.13.2", "v1.13", false);
                                a("v1.13", "v1.13b", true);
                                a("v1.13", "v1.13.2p6", true);
                                a("v1.13", "v1.14.2p6", true);
                                a("v1.13p9", "v1.14.2p6", true);
                                a("v1.13p9", "v1.14p6", true);
                                a("v1.14p3", "v1.14p6", true);
                                a("v1.14p3", "v1.14p6b", true);
                                a("v1.14p8", "v1.14p3", false);
                                a("v1", "v2", true);
                                a("v1.5", "v2", true);
                                a("v2", "v1.15", false);
                                a("v2.0.5", "v1.15", false);
                                a("v1.15", "v2.0.5", true);
                                a("v1.15.6", "v2.0.5", true);
                                a("v1.15.6", "v1.16.5", true);
                                a("v1.13", "v1.13.2p5", true);
                                a("v1.14", "v1.14p3", false);
                                a("v1.14b", "v1.14p3", false);
                                a("v1.14.2", "v1.14p3", false);
                                a("v1.14.2b", "v1.14p3", false);
                                try {
                                    ModEngine.a("v1.11p1");
                                    n.a(a.a("10000", com.corrodinggames.rts.game.units.custom.e.b.none), "10000");
                                    n.a(a.a(VariableScope.nullOrMissingString, com.corrodinggames.rts.game.units.custom.e.b.space), VariableScope.nullOrMissingString);
                                    n.a(a.a("1", com.corrodinggames.rts.game.units.custom.e.b.comma), "1");
                                    n.a(a.a("10", com.corrodinggames.rts.game.units.custom.e.b.comma), "10");
                                    n.a(a.a("100", com.corrodinggames.rts.game.units.custom.e.b.comma), "100");
                                    n.a(a.a("1000", com.corrodinggames.rts.game.units.custom.e.b.comma), "1,000");
                                    n.a(a.a(".", com.corrodinggames.rts.game.units.custom.e.b.comma), ".");
                                    n.a(a.a(".2", com.corrodinggames.rts.game.units.custom.e.b.comma), ".2");
                                    n.a(a.a(".22", com.corrodinggames.rts.game.units.custom.e.b.comma), ".22");
                                    n.a(a.a(".223", com.corrodinggames.rts.game.units.custom.e.b.comma), ".223");
                                    n.a(a.a(".2234", com.corrodinggames.rts.game.units.custom.e.b.comma), ".2234");
                                    n.a(a.a("100.2234", com.corrodinggames.rts.game.units.custom.e.b.comma), "100.2234");
                                    n.a(a.a("1000.2234", com.corrodinggames.rts.game.units.custom.e.b.comma), "1,000.2234");
                                    n.a(a.a("10000", com.corrodinggames.rts.game.units.custom.e.b.comma), "10,000");
                                    n.a(a.a("9800000", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000");
                                    n.a(a.a("9800000.67", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000.67");
                                    n.a(a.a("98000000.67", com.corrodinggames.rts.game.units.custom.e.b.comma), "98,000,000.67");
                                    n.a(a.a("980000000.67", com.corrodinggames.rts.game.units.custom.e.b.comma), "980,000,000.67");
                                    n.a(a.a("9800000001.67", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000,001.67");
                                    n.a(a.a("9800000001.6", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000,001.6");
                                    n.a(a.a("9800000001.", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000,001.");
                                    n.a(a.a("9800000001", com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000,001");
                                    n.a(a.a(9800000L, com.corrodinggames.rts.game.units.custom.e.b.comma), "9,800,000");
                                } catch (bo e) {
                                    throw new RuntimeException(e);
                                }
                            } catch (IOException e2) {
                                throw new RuntimeException(e2);
                            }
                        } catch (Throwable th) {
                            GameEngine.m5e("FileLoaderBackend - clean up");
                            for (String str3 : file.list()) {
                                new File(file.getPath(), str3).delete();
                            }
                            file.delete();
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    GameEngine.aU = z;
                    throw th2;
                }
            } catch (bo e3) {
                throw new RuntimeException(e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    public void a(String str, String str2) {
        ArrayList a = al.a(str + "," + str2, ",", false, false);
        n.a((String) a.get(0), str);
        n.a((String) a.get(1), str2);
    }

    public void a(String[] strArr, String str) {
        n.a(strArr.length, 1);
        n.a(strArr[0], str);
    }

    public void a(String[] strArr, String str, String str2) {
        n.a(strArr.length, 2);
        n.a(strArr[0], str);
        n.a(strArr[1], str2);
    }

    public void a(String str, String str2, boolean z) {
        boolean z2;
        try {
            ModEngine.a(str, str2);
            z2 = true;
        } catch (bo e) {
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