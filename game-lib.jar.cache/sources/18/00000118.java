package com.corrodinggames.rts.a.a;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.br;

/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/c.class */
public class c extends l {
    public void a() {
        GameEngine.m328e("Logic boolean tests");
        com.corrodinggames.rts.game.units.custom.l lVar = com.corrodinggames.rts.game.units.custom.l.b;
        a(lVar, "number numA");
        a(lVar, "number numB");
        a(lVar, "number[] numArrayA");
        a(lVar, "number[] numArrayB");
        a(lVar, "bool[] boolArrayA");
        a(lVar, "unit[] unitArrayA");
        am a2 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        y a3 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a3.b(PlayerData.i);
        y a4 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a4.b(PlayerData.i);
        a4.cu = 44.0f;
        a(a4, "numA=5");
        a(a4, "numB=7");
        a(a4, "numArrayA[0]=1");
        a(a4, "numArrayA[1]=2");
        a(a4, "numArrayA[2]=15");
        a(a4, "boolArrayA[0]=true");
        a(a4, "unitArrayA[0]=self");
        a(a4, "numArrayA[(5)]=5");
        a(a4, "numArrayA[5+5]=10");
        a(a4, "numArrayA[4+4]=8");
        a(a4, "boolArrayA[10]=true");
        a(a4, "unitArrayA[10]=self");
        GameEngine.m328e("string: " + d(a4, b("str(memory.numArrayA)")));
        a(a4, b("memory.numArrayA.get(5)"), 5.0f);
        a(a4, b("memory.numArrayA.get(10)"), 10.0f);
        b(a4, b("memory.boolArrayA[10]"));
        b(a4, b("memory.unitArrayA[10]==self"));
        a(a4, "numArrayA[memory.numArrayA.get(2)]=98");
        a(a4, b("memory.numArrayA.get(15)"), 98.0f);
        a(a4, "numArrayA[memory.numArrayA[2]]=99");
        a(a4, b("memory.numArrayA.get(15)"), 99.0f);
        a(a4, "numArrayA[((((((((6))))))))]=99");
        a(a4, "numArrayA[((((((((memory.numArrayA[2]))))))))]=88");
        a(a4, b("memory.numArrayA.get(15)"), 88.0f);
        b(a4, "numArrayA[((((((((memory.numArrayA[2])())))))]=77");
        b(a4, "numArrayA[((((((((memory.numArrayA[2])))[)))]]))]=66");
        b(a4, "numArrayA[a]=1");
        b(a4, "numArrayA[0]='a'");
        a(a4, "numArrayA[9001]=5");
        a(a4, b("memory.numArrayA.size"), 9002.0f);
        a(a4, b("memory.numArrayA.length"), 9002.0f);
        a(a4, "numArrayA[11000]=5");
        a(a4, "numArrayA[10000]=5");
        a(a4, "numArrayA[10001]=6");
        a(a4, "numArrayA[9999]=42");
        a(a4, b("memory.numArrayA.get(11000)"), 0.0f);
        a(a4, b("memory.numArrayA.get(10000)"), 5.0f);
        a(a4, b("memory.numArrayA.get(10001)"), 0.0f);
        a(a4, b("memory.numArrayA.get(9999)"), 42.0f);
        a(a4, "numArrayA[21]=21");
        a(a4, "numArrayA[22]=memory.numArrayA[21]");
        a(a4, b("memory.numArrayA.get(22)"), 21.0f);
        a(a4, b("memory.numArrayA.get(0)"), 1.0f);
        a(a4, b("memory.numArrayA.get(1)"), 2.0f);
        a(a4, b("memory.numArrayA.get(5)"), 5.0f);
        a(a4, b("memory.numArrayA.get(500)"), 0.0f);
        a(a4, b("memory.numArrayA.get(9000)"), 0.0f);
        a("memory.numArrayA.get('A')");
        a(a4, b("memory.numArrayA[0]"), 1.0f);
        a(a4, b("memory.numArrayA[1]"), 2.0f);
        a(a4, b("memory.numArrayA[0]+memory.numArrayA[1]"), 3.0f);
        a(a4, b("memory.numArrayA[0]+(memory.numArrayA[1])"), 3.0f);
        a(a4, b("(memory.numArrayA[0]+(memory.numArrayA[1]))"), 3.0f);
        a(a4, b("memory.numArrayA[5]"), 5.0f);
        b(a4, b("memory.numArrayA.contains(5)"));
        c(a4, b("memory.numArrayA.contains(777)"));
        b(a4, b("memory.numArrayA.contains(memory.numArrayA[5])"));
        a("memory.numArrayA.contains('a')");
        a("memory.numArrayA.contains(true)");
        a("memory.numArrayA[5][5]");
        a("memory.numArrayA[5][5][60]");
        a("memory.numArrayA[5][5][[60]]");
        a("memory.numArrayA[5][[5]");
        a("memory.numArrayA[5]][5]");
        a("memory.numArrayA[5[]][5]");
        a("memory.numArrayA[[5[]][5]");
        com.corrodinggames.rts.game.units.custom.j a5 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a5.b(PlayerData.i);
        a5.eo = 10.0f;
        a5.cu = 55.0f;
        a5.cv = 500.0f;
        a4.bu = a5;
        a(a5, "numA=309");
        a(a5, "numB=409");
        com.corrodinggames.rts.game.units.custom.j a6 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a6.b(PlayerData.i);
        a6.ep = 5.0f;
        a6.cu = 66.0f;
        a6.cv = 1000.0f;
        a5.bv = a6;
        com.corrodinggames.rts.game.units.custom.j a7 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a7.b(PlayerData.i);
        a7.eo = 2.0f;
        a(a7, "numA=99");
        a(a7, "numB=88");
        com.corrodinggames.rts.game.units.custom.j a8 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a8.b(PlayerData.i);
        a8.eo = 3.0f;
        a(a8, "numA=239");
        a(a8, "numB=268");
        com.corrodinggames.rts.game.units.custom.j a9 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a9.b(PlayerData.i);
        a9.eo = 3.0f;
        a7.C(a8);
        a7.C(a9);
        com.corrodinggames.rts.game.units.custom.j a10 = com.corrodinggames.rts.game.units.custom.l.a(false, lVar);
        a10.b(PlayerData.i);
        a10.a(com.corrodinggames.rts.game.units.custom.g.a("globalTag1, globalTag2"), false);
        a10.eo = 2.0f;
        GameEngine.m328e("=== logic boolean tests == (runs:50)");
        Long valueOf = Long.valueOf(br.a());
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
            }
            b(a4, b("true"));
            c(a4, b("false"));
            b(a4, b("not false"));
            b(a4, b("not not true"));
            a(a4, b("5"), 5.0f);
            a(a4, b("5+5"), 10.0f);
            a(a4, b("1+2+3"), 6.0f);
            a(a4, b("2.5+2.5"), 5.0f);
            a(a4, b("10-2"), 8.0f);
            a(a4, b("((5+5)-2)*3"), 24.0f);
            a(a4, b("10/2+10*2"), 25.0f);
            a(a4, b("-5"), -5.0f);
            a(a4, b("--5"), 5.0f);
            a(a4, b("9--5"), 14.0f);
            a(a4, b("-9--5"), -4.0f);
            a(a4, b("+5"), 5.0f);
            a(a4, b("+ 5"), 5.0f);
            a(a4, b(" + 5"), 5.0f);
            a(a4, b(" ++ 5"), 5.0f);
            a(a4, b("-+5"), -5.0f);
            a(a4, b("--+5"), 5.0f);
            a(a4, b("++-5"), -5.0f);
            a(a4, b(" - - +5"), 5.0f);
            a(a4, b("9++5"), 14.0f);
            a("5 - ");
            a("5 -- ");
            a("5 + ");
            a("5 ++ ");
            a("5 ** 9 ");
            a("5 -/ 9 ");
            a("5 * 5 -");
            a(" - ");
            a(" -- ");
            a(" + ");
            a(" ++ ");
            a(a4, b(" 'hello'"), "hello");
            a(a4, b(" \"hello\" "), "hello");
            a(a4, b("self.hp+1"), a4.cu + 1.0f);
            a(a4, b("self.x+1"), a4.eo + 1.0f);
            a(a4, b("self.y+1"), a4.ep + 1.0f);
            a(a4, b("self.z+1"), a4.eq + 1.0f);
            a(a4, b("int( 5.5+0.1 )"), 5.0f);
            a(a4, b("-5 * 5"), -25.0f);
            a(a4, b("-5 * self.hp"), (-5.0f) * a4.cu);
            a(a4, b("self.hp + -5"), a4.cu - 5.0f);
            a(a4, b("self.hp * -5"), (-5.0f) * a4.cu);
            a(a4, b("(self.hp ) * -5 "), (-5.0f) * a4.cu);
            a(a4, b("-self.hp * -5"), (-5.0f) * (-a4.cu));
            a(a4, b("-(self.hp ) * -5 "), (-5.0f) * (-a4.cu));
            a(a4, b("-5 * -self.hp"), (-5.0f) * (-a4.cu));
            a(a4, b("(-5 * -self.hp)/2"), ((-5.0f) * (-a4.cu)) / 2.0f);
            a(a4, b("-(self.hp )"), -a4.cu);
            a(a4, b("--(self.hp )"), a4.cu);
            a(a4, b("-((self.hp ))"), -a4.cu);
            a(a4, b("-self.hp"), -a4.cu);
            a(a4, b("-0"), 0.0f);
            a(a4, b("-  1"), -1.0f);
            a(a4, b(" -  1"), -1.0f);
            a(a4, b("-0*-0"), 0.0f);
            a(a4, b("-2*2"), -4.0f);
            a(a4, b("-2-3-2"), -7.0f);
            c(a4, b("10>10"));
            c(a4, b("10<10"));
            b(a4, b("10>=10"));
            b(a4, b("10<=10"));
            b(a4, b("'hello'=='hello'"));
            b(a4, b("'hello'!='bye'"));
            a("'hello'<'bye'");
            a("'hello'>'bye'");
            a("'hello'<='bye'");
            a("'hello'>='bye'");
            a("'hello'55'bye'");
            a("'hello'><'bye'");
            a("6><8");
            c(a4, b("not (10>5 and true)"));
            c(a4, b("not true and false"));
            b(a4, b("not false and true"));
            b(a4, b("not (false and true)"));
            c(a4, b("not (1>2 or 5>2)"));
            b(a4, b("(true and (false or true))"));
            b(a4, b(" true and   (false   or   true  )"));
            b(a4, b("true and((false)or(true) )"));
            b(a4, b("100>50+20"));
            b(a4, b("100>50*1.5"));
            b(a4, b("not (100<50*1.5)"));
            b(a4, b("5 < 10 < 15"));
            b(a4, b("false==false"));
            b(a4, b("true==true"));
            b(a4, b("false==false==false"));
            b(a4, b("true==true==true"));
            b(a4, b("false!=true!=false"));
            b(a4, b("true!=false!=true"));
            c(a4, b("'test'==null"));
            b(a4, b("'test'!=null"));
            c(a4, b("'test'==null==null"));
            b(a4, b("'test'!=null!='test2'"));
            b(a4, b("self!=null"));
            c(a4, b("self==null"));
            b(a4, b("10==10"));
            b(a4, b("10.5==10.5"));
            b(a4, b("1/3==1/3"));
            c(a4, b("10!=10"));
            b(a4, b("10!=5"));
            a("true - true");
            a("true + true");
            a("true * true");
            a("true / true");
            a("true < 10");
            a("true == 10");
            a("true != 10");
            a("'text' == 10");
            a("10 == ");
            a("10 != ");
            a("10 > ");
            a("10 < ");
            a("10 >= ");
            a("10 <= ");
            a("10 ==");
            a("10 !=");
            a("10 >");
            a("10 <");
            a("10 >=");
            a("10 <=");
            a("==10");
            a("!=10");
            a(">10");
            a("<10");
            a(">=10");
            a("<=10");
            a("10.6.6");
            a(a4, b("select(true, 'A','B')"), "A");
            a(a4, b("select(false, 'A','B')"), "B");
            a(a4, b("str(5.5)"), "5.5");
            a(a4, b("str(5)"), "5");
            a(a4, b("lowercase('HELlo')"), "hello");
            a(a4, b("uppercase('heLLo')"), "HELLO");
            a(a4, b("lowercase(str('HELlo'))"), "hello");
            a(a4, b("'hello'"), "hello");
            a(a4, b("'hello'+' world'"), "hello world");
            a(a4, b("'he(llo'+' world'"), "he(llo world");
            a(a4, b("'he(llo'+' wor)ld'"), "he(llo wor)ld");
            a("('hello'+' world'");
            a("'hello'+)' world'");
            b(a4, b("self.hp(lessThan=9999)"));
            a("self.hp(lessThan=9999, lessThan=9998)");
            a("self..hp(lessThan=9999)");
            a("self...hp(lessThan=9999)");
            b("game.nukesEnabled()");
            a("game.nukesEnabled(nukesEnabled=true)");
            a("game.nukesEnabled(nukesEnabled=false)");
            a("game.nukesEnabled()==0");
            a("game.nukesEnabled()!=0");
            a("game.nukesEnabled()<0");
            a("game.nukesEnabled()>0");
            a("game.nukesEnabled()=='true'");
            a("game.nukesEnabled()!='true'");
            a("self.nukesEnabled()");
            a("parent.nukesEnabled()");
            a("hp==44");
            a("5=44");
            if (a4 == PlayerData.i.s) {
                GameEngine.m328e("skipping for placeholderTeamUnit");
            } else {
                b(a4, b("self.hp==44"));
                b(a4, b("self.customTarget1.hp==55"));
                a("self.memory1.hp=55");
                b(a4, b("self.customTarget1.maxhp==500"));
                b(a4, b("customTarget1.hp==55"));
                b(a4, b("self.customTarget1.customTarget2.hp==66"));
                b(a4, b("self.customTarget1==self.customTarget1"));
                b(a4, b("self.customTarget1!=self"));
                b(a3, b("self.customTarget1==null"));
                b(a3, b("self.customTarget1!=self"));
                b(a3, b("self.parent==null"));
                b(a3, b("self.parent.customTarget1==null"));
                b(a3, b("self.parent.customTarget1==self.parent"));
                b(a3, b("self.parent.customTarget1!=self"));
            }
            a(a4, b("self.getOffsetAbsolute(y=10).y"), a4.ep + 10.0f);
            b(a4, b("self.getOffsetAbsolute(y=10).y==self.y+10"));
            b(a4, b("self.getOffsetRelative(y=10, height=5).height==self.height+5"));
            a(a4, b("self.getOffsetRelative(y=10, height=5).height"), a4.eq + 5.0f);
            a(a4, b("self.getOffsetAbsolute(y=10).getOffsetAbsolute(y=10).y"), a4.ep + 10.0f + 10.0f);
            a(a7, b("self.transporting().getOffsetAbsolute(x=5).x"), a8.eo + 5.0f);
            a(a7, b("self.transporting(slot=1).getOffsetAbsolute(x=5).x"), a9.eo + 5.0f);
            a(a7, b("self.transporting().parent.transporting().parent.id"), (float) a7.eh);
            a(a7, b("self.transporting().getOffsetAbsolute(x=memory.numA).x-memory.numA"), a8.eo);
            a(a7, b("self.transporting().getOffsetAbsolute(x=self.id).x-self.id"), a8.eo);
            a(a7, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).x-self.id"), a8.eo);
            a(a7, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute().x-self.id"), a8.eo);
            a(a7, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute(x=self.id+1).x"), a8.eo + ((float) a7.eh) + ((float) a7.eh) + 1.0f);
            b(a4, b("numberOfUnitsInTeam(greaterThan=-2)"));
            b(a4, b("NumberOfUnitsInTeam(greaterTHAN=-2)"));
            a(a4, b("self.noUnitInTeam()"));
            a(a4, b("self.hasUnitInTeam()"));
            a(a4, b("self.hasUnitInTeam(neutralTeam=true)"));
            a(a4, b("self.shield()+self.ammo()+self.hp()>-1"));
            a(a4, b("parent.shield()+parent.ammo()+parent.hp()>-1"));
            a(a4, b("'hello'+'a'"), "helloa");
            a(a4, b("'hello'+5"), "hello5");
            a(a4, b("substring('hello',0,3)"), "hel");
            a(a4, b("substring('hello',0,100)"), "hello");
            a(a4, b("substring('HEllo',0,100)"), "HEllo");
            a(a4, b("'HEllo'"), "HEllo");
            a(a4, b("substring('aa',0,2)+substring('bb',0,2)"), "aabb");
            b(a4, b(" true AND true"));
            b(a4, b(" true aNd true"));
            b(a4, b(" true OR false"));
            b(a4, b(" true OR TRUE"));
            b(a4, b(" True OR  False "));
            b(a4, b(" True OR  (False) "));
            b(a4, b(" NOT FALSE "));
            b(a4, b(" NOT NOT NOT FALSE "));
            b(a4, b(" game.nukesEnabled "));
            b(a4, b(" GAME.NukesEnabled "));
            a(a4, b("squareRoot( 100 )"), 10.0f);
            a(a4, b("max(+1,2)"), 2.0f);
            a(a4, b("min(+1,2)"), 1.0f);
            a(a4, b("max(1,2)"), 2.0f);
            a(a4, b("min(1,2)"), 1.0f);
            a(a4, b("max( 1,2 )"), 2.0f);
            a(a4, b("min( 1,2 )"), 1.0f);
            a(a4, b("max(-1,2)"), 2.0f);
            a(a4, b("min(-1,2)"), -1.0f);
            a(a4, b("max( -1,2 )"), 2.0f);
            a(a4, b("min( -1,2 )"), -1.0f);
            a(a4, b("max( 3,1 )"), 3.0f);
            a(a4, b("min( 3,1 )"), 1.0f);
            a(a4, b("max( 3+3,4 )"), 6.0f);
            a(a4, b("min( 3+3,4 )"), 4.0f);
            a(a4, b("distanceSquared( 1,1,1,6 )"), 25.0f);
            a(a4, b("max(distanceSquared( 1,1,1,6 ), 4)"), 25.0f);
            a(a4, b("min(  distanceSquared( 1,1,1 , 6 )  , 4)"), 4.0f);
            b(a4, b("distanceSquared( 1,1,1,6 )>=5*5"));
            b(a4, b("distanceSquared( 1,1,1,6 )>4*5"));
            b(a4, b("distanceSquared( 1,1,6,1 )<6*5"));
            b(a4, b("distance( 0,0,5,0 )==5"));
            b(a4, b("distance( 0,1,0,6 )==5"));
            a(a4, b("customTarget1"), a5);
            a(a4, b("customTarget1.self"), a5);
            a(a4, b("self.customTarget1.self"), a5);
            a(a4, b("customTarget1.customTarget2"), a5.bv);
            a(a4, b(" distanceBetween(customTarget1.customTarget2, customTarget1 ) "), com.corrodinggames.rts.gameFramework.f.b(a5.eo, a5.ep, a6.eo, a6.ep));
            a(a4, b(" distanceBetweenSquared(customTarget1.customTarget2, customTarget1 ) "), com.corrodinggames.rts.gameFramework.f.a(a5.eo, a5.ep, a6.eo, a6.ep));
            b(a4, b(" distanceBetween(self, nullUnit ) == 0 "));
            a(a4, b(" distanceBetween(customTarget1.customTarget2, nullUnit ) "), 0.0f);
            a(a4, b(" distanceBetween(nullUnit, nullUnit ) "), 0.0f);
            a(a4, b(" distanceBetween( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 10.0f);
            a(a4, b(" distanceBetweenSquared( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 100.0f);
            b(a4, b(" self.energy < 0.5 and customTarget2==nullUnit ", true));
            b(a4, b(" self.energy < 0.5 and customTarget2 == nullUnit ", true));
            b(a4, b(" self.energy < 0.5 and customTarget1 != nullUnit ", true));
            b(a4, b("parent==nullUnit and customTarget1!= nullUnit ", true));
            b(a4, b("parent == nullUnit and customTarget1!=nullUnit ", true));
            a("distanceBetween( self )");
            a("distanceBetween( self, 5 )");
            a("distanceBetween( self, nullUnit, nullUnit )");
            a("distanceBetween(  )");
            b(a4, b("'and'=='and'"));
            b(a4, b("'and'!='and true'"));
            b(a4, b("'hello.test'!='bye'"));
            b(a4, b("'hel.lo.test'!='b.ye'"));
            b(a4, b("'hel.lo.(test'!='b.ye'"));
            b(a4, b("'hel.\"lo.(test'!='b.ye \"and '"));
            b(a4, b("\"hel.lo.'(test2\"!='b.ye \"and '"));
            b(a4, b("5==5"));
            b(a4, b("'hel.lo.(test'!='b.ye' and 5==5"));
            a("distanceSquared(  )");
            a("distanceSquared( 1 )");
            a("distanceSquared( 1,1 )");
            a("distanceSquared( 1,1,1 )");
            a("distanceSquared( 1,1,1,'test' )");
            a("distanceSquared( 1,1,1,true )");
            a("distanceSquared( 1,1,1,null )");
            a("distanceSquared( 1,1,1, )");
            a("distanceSquared( 1,1,1,'test' )");
            a("distanceSquared( x1=1,1,1,'test' )");
            a("distanceSquared( 1,1,1,1, x1=1 )");
            a("distanceSquared( 1,1,1,1,1 )");
            a("distanceSquared( 1,1,1, x1=1 )");
            a("distanceSquared( 1,1,1, 1 ");
            a("distanceSquared( 1,1,1, 1 ))");
            b(a4, b("SELF.HP(lessThan=9999)"));
            c(a4, b("Self.Parent.HP(lessThan=9999)"));
            a("self.hasFlag( id=35 )");
            a("self.hasFlag( 35 )");
            c(a4, b("self.hasFlag(id=30)"));
            c(a4, b("self.hasFlag(30)"));
            c(a4, b("self.hasFlag(15+15)"));
            c(a4, b("self.hasFlag(id=15*2)"));
        }
        GameEngine.m328e("Took: " + br.a(valueOf.longValue(), Long.valueOf(br.a()).longValue()));
        GameEngine.m328e("=== logic boolean memory tests ==");
        a(lVar, "unit testUnit1, float testFloat1");
        a(lVar, "unit testUnit2, float testFloat2");
        a(lVar, "bool testBool1");
        a(lVar, "number testNumber1");
        a(lVar, "float  testNumber2");
        a(lVar, "String testString");
        a(lVar, "String nullString");
        a(a4, "testString='(,,((', testFloat1=5, testFloat2=8, testBool1=true, testUnit1=self");
        a(a4, "nullString=null");
        b(a2, "testNumber1=null");
        b(a2, "testNumber2=null");
        b(a2, "testBool1=null");
        b(a2, "testNumber1=self");
        b(a2, "testBool1=5");
        GameEngine.m328e(a4.bw.debugMemory(false, true));
        a(a4, b("memory.testFloat1"), 5.0f);
        a(a4, b("memory.testFloat2"), 8.0f);
        b(a4, b("memory.testFloat1==5"));
        b(a4, b("memory.testString=='(,,(('"));
        b(a4, b("memory.testBool1"));
        b(a4, b("memory.testBool1==true"));
        b(a4, b("memory.testUnit1==self"));
        b(a4, b("memory.testUnit1!=nullUnit"));
        a("memory.testUnit1==5", true);
        a(a4, b("self.readUnitMemory('testFloat1', type='float')"), 5.0f);
        a(a4, "testFloat1=distance( 0,0,6,0 ), testFloat2=16");
        b(a4, b("memory.testFloat1==6"));
        b(a4, b("memory.testFloat2==16"));
        a(a4, "testUnit1=self.getOffsetAbsolute(y=10), testUnit2=self.getOffsetAbsolute(y=-10)");
        GameEngine.m328e(a4.bw.debugMemory(false, true));
        a(a4, b("distanceBetween( memory.testUnit1, memory.testUnit2)"), 20.0f);
        b(a4, b("distanceBetweenSquared( memory.testUnit1, memory.testUnit2)==20*20"));
        a(a4, b("globalSearchForFirstUnit(withTag='globalTag1')"), a10);
        a(a4, b("globalSearchForFirstUnit(withTag='globalTag2')"), a10);
        b(a4, b("globalSearchForFirstUnit()!=null"));
        b(a4, b("globalSearchForFirstUnit(withTag='globalTag1', relation='enemy')==null"));
        b(a4, b("globalSearchForFirstUnit(withTag='globalTagNo')==null"));
        a("globalSearchForFirstUnit(withTag='globalTag1', relation='XYZ')", true);
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z) {
        try {
            LogicBooleanLoader.parseBooleanBlock(com.corrodinggames.rts.game.units.custom.l.b, str, false);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.d("assertCreateError: " + str + " error:" + e.getMessage());
            }
        }
    }

    public void a(com.corrodinggames.rts.game.units.custom.l lVar, String str) {
        lVar.r.defineVariables(lVar, str);
    }

    public void a(am amVar, String str) {
        try {
            com.corrodinggames.rts.game.units.custom.j jVar = (com.corrodinggames.rts.game.units.custom.j) amVar;
            VariableScope.createMemoryWriter(str, jVar.x, "testsection", "testkey").writeToUnit(jVar);
        } catch (bo e) {
            throw new RuntimeException(e);
        }
    }

    public void b(am amVar, String str) {
        try {
            com.corrodinggames.rts.game.units.custom.j jVar = (com.corrodinggames.rts.game.units.custom.j) amVar;
            VariableScope.createMemoryWriter(str, jVar.x, "testsection", "testkey").writeToUnit(jVar);
            throw new RuntimeException("assertSetMemoryError got no error for: " + str);
        } catch (bo e) {
        } catch (RuntimeException e2) {
        }
    }

    public LogicBoolean b(String str) {
        return b(str, false);
    }

    public LogicBoolean b(String str, boolean z) {
        try {
            return LogicBooleanLoader.parseBooleanBlock(com.corrodinggames.rts.game.units.custom.l.b, str, z);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    public void a(y yVar, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        logicBoolean.read(yVar);
    }

    public void b(y yVar, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        if (!logicBoolean.read(yVar)) {
            throw new RuntimeException("Asset assertBooleanTrue failed, got false for: " + logicBoolean.getMatchFailReasonForPlayer(yVar));
        }
    }

    public void c(y yVar, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanFalse type ==" + logicBoolean.getReturnType());
        }
        n.b(logicBoolean.read(yVar));
    }

    public void a(y yVar, LogicBoolean logicBoolean, float f) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Asset assertBooleanNumber type ==" + logicBoolean.getReturnType());
        }
        float readNumber = logicBoolean.readNumber(yVar);
        if (com.corrodinggames.rts.gameFramework.f.c(readNumber - f) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + readNumber + "!=" + f + " for: " + logicBoolean.getMatchFailReasonForPlayer(yVar));
        }
    }

    public String d(y yVar, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        return logicBoolean.readString(yVar);
    }

    public void a(y yVar, LogicBoolean logicBoolean, String str) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        n.a(logicBoolean.readString(yVar), str);
    }

    public void a(y yVar, LogicBoolean logicBoolean, am amVar) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
            throw new RuntimeException("Asset assertBooleanUnit type ==" + logicBoolean.getReturnType());
        }
        am readUnit = logicBoolean.readUnit(yVar);
        if (readUnit != amVar) {
            GameEngine.m328e("class: " + logicBoolean.getClass().getName());
            throw new RuntimeException("assertBooleanUnit failed:" + am.A(readUnit) + "!=" + am.A(amVar) + " for: " + logicBoolean.getMatchFailReasonForPlayer(yVar));
        }
    }
}