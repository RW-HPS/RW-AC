package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.am;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.Unit;
import com.corrodinggames.rts.gameFramework.f;

/* renamed from: com.corrodinggames.rts.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/c.class */
public class c extends AbstractScriptTest {
    public void a() {
        GameEngine.m5e("Logic boolean tests");
        l lVar = l.b;
        a(lVar, "number numA");
        a(lVar, "number numB");
        a(lVar, "number[] numArrayA");
        a(lVar, "number[] numArrayB");
        a(lVar, "bool[] boolArrayA");
        a(lVar, "unit[] unitArrayA");
        am a = l.a(false, lVar);
        y a2 = l.a(false, lVar);
        a2.b(PlayerData.i);
        y a3 = l.a(false, lVar);
        a3.b(PlayerData.i);
        a3.cu = 44.0f;
        a(a3, "numA=5");
        a(a3, "numB=7");
        a(a3, "numArrayA[0]=1");
        a(a3, "numArrayA[1]=2");
        a(a3, "numArrayA[2]=15");
        a(a3, "boolArrayA[0]=true");
        a(a3, "unitArrayA[0]=self");
        a(a3, "numArrayA[(5)]=5");
        a(a3, "numArrayA[5+5]=10");
        a(a3, "numArrayA[4+4]=8");
        a(a3, "boolArrayA[10]=true");
        a(a3, "unitArrayA[10]=self");
        GameEngine.m5e("string: " + d(a3, b("str(memory.numArrayA)")));
        a(a3, b("memory.numArrayA.get(5)"), 5.0f);
        a(a3, b("memory.numArrayA.get(10)"), 10.0f);
        b(a3, b("memory.boolArrayA[10]"));
        b(a3, b("memory.unitArrayA[10]==self"));
        a(a3, "numArrayA[memory.numArrayA.get(2)]=98");
        a(a3, b("memory.numArrayA.get(15)"), 98.0f);
        a(a3, "numArrayA[memory.numArrayA[2]]=99");
        a(a3, b("memory.numArrayA.get(15)"), 99.0f);
        a(a3, "numArrayA[((((((((6))))))))]=99");
        a(a3, "numArrayA[((((((((memory.numArrayA[2]))))))))]=88");
        a(a3, b("memory.numArrayA.get(15)"), 88.0f);
        b(a3, "numArrayA[((((((((memory.numArrayA[2])())))))]=77");
        b(a3, "numArrayA[((((((((memory.numArrayA[2])))[)))]]))]=66");
        b(a3, "numArrayA[a]=1");
        b(a3, "numArrayA[0]='a'");
        a(a3, "numArrayA[9001]=5");
        a(a3, b("memory.numArrayA.size"), 9002.0f);
        a(a3, b("memory.numArrayA.length"), 9002.0f);
        a(a3, "numArrayA[11000]=5");
        a(a3, "numArrayA[10000]=5");
        a(a3, "numArrayA[10001]=6");
        a(a3, "numArrayA[9999]=42");
        a(a3, b("memory.numArrayA.get(11000)"), 0.0f);
        a(a3, b("memory.numArrayA.get(10000)"), 5.0f);
        a(a3, b("memory.numArrayA.get(10001)"), 0.0f);
        a(a3, b("memory.numArrayA.get(9999)"), 42.0f);
        a(a3, "numArrayA[21]=21");
        a(a3, "numArrayA[22]=memory.numArrayA[21]");
        a(a3, b("memory.numArrayA.get(22)"), 21.0f);
        a(a3, b("memory.numArrayA.get(0)"), 1.0f);
        a(a3, b("memory.numArrayA.get(1)"), 2.0f);
        a(a3, b("memory.numArrayA.get(5)"), 5.0f);
        a(a3, b("memory.numArrayA.get(500)"), 0.0f);
        a(a3, b("memory.numArrayA.get(9000)"), 0.0f);
        a("memory.numArrayA.get('A')");
        a(a3, b("memory.numArrayA[0]"), 1.0f);
        a(a3, b("memory.numArrayA[1]"), 2.0f);
        a(a3, b("memory.numArrayA[0]+memory.numArrayA[1]"), 3.0f);
        a(a3, b("memory.numArrayA[0]+(memory.numArrayA[1])"), 3.0f);
        a(a3, b("(memory.numArrayA[0]+(memory.numArrayA[1]))"), 3.0f);
        a(a3, b("memory.numArrayA[5]"), 5.0f);
        b(a3, b("memory.numArrayA.contains(5)"));
        c(a3, b("memory.numArrayA.contains(777)"));
        b(a3, b("memory.numArrayA.contains(memory.numArrayA[5])"));
        a("memory.numArrayA.contains('a')");
        a("memory.numArrayA.contains(true)");
        a("memory.numArrayA[5][5]");
        a("memory.numArrayA[5][5][60]");
        a("memory.numArrayA[5][5][[60]]");
        a("memory.numArrayA[5][[5]");
        a("memory.numArrayA[5]][5]");
        a("memory.numArrayA[5[]][5]");
        a("memory.numArrayA[[5[]][5]");
        j a4 = l.a(false, lVar);
        a4.b(PlayerData.i);
        a4.eo = 10.0f;
        a4.cu = 55.0f;
        a4.cv = 500.0f;
        a3.bu = a4;
        a(a4, "numA=309");
        a(a4, "numB=409");
        j a5 = l.a(false, lVar);
        a5.b(PlayerData.i);
        a5.ep = 5.0f;
        a5.cu = 66.0f;
        a5.cv = 1000.0f;
        a4.bv = a5;
        j a6 = l.a(false, lVar);
        a6.b(PlayerData.i);
        a6.eo = 2.0f;
        a(a6, "numA=99");
        a(a6, "numB=88");
        j a7 = l.a(false, lVar);
        a7.b(PlayerData.i);
        a7.eo = 3.0f;
        a(a7, "numA=239");
        a(a7, "numB=268");
        j a8 = l.a(false, lVar);
        a8.b(PlayerData.i);
        a8.eo = 3.0f;
        a6.C(a7);
        a6.C(a8);
        j a9 = l.a(false, lVar);
        a9.b(PlayerData.i);
        a9.a(g.a("globalTag1, globalTag2"), false);
        a9.eo = 2.0f;
        GameEngine.m5e("=== logic boolean tests == (runs:50)");
        Long valueOf = Long.valueOf(Unit.loadAllUnitsTook());
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
            }
            b(a3, b("true"));
            c(a3, b("false"));
            b(a3, b("not false"));
            b(a3, b("not not true"));
            a(a3, b("5"), 5.0f);
            a(a3, b("5+5"), 10.0f);
            a(a3, b("1+2+3"), 6.0f);
            a(a3, b("2.5+2.5"), 5.0f);
            a(a3, b("10-2"), 8.0f);
            a(a3, b("((5+5)-2)*3"), 24.0f);
            a(a3, b("10/2+10*2"), 25.0f);
            a(a3, b("-5"), -5.0f);
            a(a3, b("--5"), 5.0f);
            a(a3, b("9--5"), 14.0f);
            a(a3, b("-9--5"), -4.0f);
            a(a3, b("+5"), 5.0f);
            a(a3, b("+ 5"), 5.0f);
            a(a3, b(" + 5"), 5.0f);
            a(a3, b(" ++ 5"), 5.0f);
            a(a3, b("-+5"), -5.0f);
            a(a3, b("--+5"), 5.0f);
            a(a3, b("++-5"), -5.0f);
            a(a3, b(" - - +5"), 5.0f);
            a(a3, b("9++5"), 14.0f);
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
            a(a3, b(" 'hello'"), "hello");
            a(a3, b(" \"hello\" "), "hello");
            a(a3, b("self.hp+1"), a3.cu + 1.0f);
            a(a3, b("self.x+1"), a3.eo + 1.0f);
            a(a3, b("self.y+1"), a3.ep + 1.0f);
            a(a3, b("self.z+1"), a3.eq + 1.0f);
            a(a3, b("int( 5.5+0.1 )"), 5.0f);
            a(a3, b("-5 * 5"), -25.0f);
            a(a3, b("-5 * self.hp"), (-5.0f) * a3.cu);
            a(a3, b("self.hp + -5"), a3.cu - 5.0f);
            a(a3, b("self.hp * -5"), (-5.0f) * a3.cu);
            a(a3, b("(self.hp ) * -5 "), (-5.0f) * a3.cu);
            a(a3, b("-self.hp * -5"), (-5.0f) * (-a3.cu));
            a(a3, b("-(self.hp ) * -5 "), (-5.0f) * (-a3.cu));
            a(a3, b("-5 * -self.hp"), (-5.0f) * (-a3.cu));
            a(a3, b("(-5 * -self.hp)/2"), ((-5.0f) * (-a3.cu)) / 2.0f);
            a(a3, b("-(self.hp )"), -a3.cu);
            a(a3, b("--(self.hp )"), a3.cu);
            a(a3, b("-((self.hp ))"), -a3.cu);
            a(a3, b("-self.hp"), -a3.cu);
            a(a3, b("-0"), 0.0f);
            a(a3, b("-  1"), -1.0f);
            a(a3, b(" -  1"), -1.0f);
            a(a3, b("-0*-0"), 0.0f);
            a(a3, b("-2*2"), -4.0f);
            a(a3, b("-2-3-2"), -7.0f);
            c(a3, b("10>10"));
            c(a3, b("10<10"));
            b(a3, b("10>=10"));
            b(a3, b("10<=10"));
            b(a3, b("'hello'=='hello'"));
            b(a3, b("'hello'!='bye'"));
            a("'hello'<'bye'");
            a("'hello'>'bye'");
            a("'hello'<='bye'");
            a("'hello'>='bye'");
            a("'hello'55'bye'");
            a("'hello'><'bye'");
            a("6><8");
            c(a3, b("not (10>5 and true)"));
            c(a3, b("not true and false"));
            b(a3, b("not false and true"));
            b(a3, b("not (false and true)"));
            c(a3, b("not (1>2 or 5>2)"));
            b(a3, b("(true and (false or true))"));
            b(a3, b(" true and   (false   or   true  )"));
            b(a3, b("true and((false)or(true) )"));
            b(a3, b("100>50+20"));
            b(a3, b("100>50*1.5"));
            b(a3, b("not (100<50*1.5)"));
            b(a3, b("5 < 10 < 15"));
            b(a3, b("false==false"));
            b(a3, b("true==true"));
            b(a3, b("false==false==false"));
            b(a3, b("true==true==true"));
            b(a3, b("false!=true!=false"));
            b(a3, b("true!=false!=true"));
            c(a3, b("'test'==null"));
            b(a3, b("'test'!=null"));
            c(a3, b("'test'==null==null"));
            b(a3, b("'test'!=null!='test2'"));
            b(a3, b("self!=null"));
            c(a3, b("self==null"));
            b(a3, b("10==10"));
            b(a3, b("10.5==10.5"));
            b(a3, b("1/3==1/3"));
            c(a3, b("10!=10"));
            b(a3, b("10!=5"));
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
            a(a3, b("select(true, 'A','B')"), "A");
            a(a3, b("select(false, 'A','B')"), "B");
            a(a3, b("str(5.5)"), "5.5");
            a(a3, b("str(5)"), "5");
            a(a3, b("lowercase('HELlo')"), "hello");
            a(a3, b("uppercase('heLLo')"), "HELLO");
            a(a3, b("lowercase(str('HELlo'))"), "hello");
            a(a3, b("'hello'"), "hello");
            a(a3, b("'hello'+' world'"), "hello world");
            a(a3, b("'he(llo'+' world'"), "he(llo world");
            a(a3, b("'he(llo'+' wor)ld'"), "he(llo wor)ld");
            a("('hello'+' world'");
            a("'hello'+)' world'");
            b(a3, b("self.hp(lessThan=9999)"));
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
            if (a3 == PlayerData.i.s) {
                GameEngine.m5e("skipping for placeholderTeamUnit");
            } else {
                b(a3, b("self.hp==44"));
                b(a3, b("self.customTarget1.hp==55"));
                a("self.memory1.hp=55");
                b(a3, b("self.customTarget1.maxhp==500"));
                b(a3, b("customTarget1.hp==55"));
                b(a3, b("self.customTarget1.customTarget2.hp==66"));
                b(a3, b("self.customTarget1==self.customTarget1"));
                b(a3, b("self.customTarget1!=self"));
                b(a2, b("self.customTarget1==null"));
                b(a2, b("self.customTarget1!=self"));
                b(a2, b("self.parent==null"));
                b(a2, b("self.parent.customTarget1==null"));
                b(a2, b("self.parent.customTarget1==self.parent"));
                b(a2, b("self.parent.customTarget1!=self"));
            }
            a(a3, b("self.getOffsetAbsolute(y=10).y"), a3.ep + 10.0f);
            b(a3, b("self.getOffsetAbsolute(y=10).y==self.y+10"));
            b(a3, b("self.getOffsetRelative(y=10, height=5).height==self.height+5"));
            a(a3, b("self.getOffsetRelative(y=10, height=5).height"), a3.eq + 5.0f);
            a(a3, b("self.getOffsetAbsolute(y=10).getOffsetAbsolute(y=10).y"), a3.ep + 10.0f + 10.0f);
            a(a6, b("self.transporting().getOffsetAbsolute(x=5).x"), a7.eo + 5.0f);
            a(a6, b("self.transporting(slot=1).getOffsetAbsolute(x=5).x"), a8.eo + 5.0f);
            a(a6, b("self.transporting().parent.transporting().parent.id"), (float) a6.eh);
            a(a6, b("self.transporting().getOffsetAbsolute(x=memory.numA).x-memory.numA"), a7.eo);
            a(a6, b("self.transporting().getOffsetAbsolute(x=self.id).x-self.id"), a7.eo);
            a(a6, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).x-self.id"), a7.eo);
            a(a6, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute().x-self.id"), a7.eo);
            a(a6, b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute(x=self.id+1).x"), a7.eo + ((float) a6.eh) + ((float) a6.eh) + 1.0f);
            b(a3, b("numberOfUnitsInTeam(greaterThan=-2)"));
            b(a3, b("NumberOfUnitsInTeam(greaterTHAN=-2)"));
            a(a3, b("self.noUnitInTeam()"));
            a(a3, b("self.hasUnitInTeam()"));
            a(a3, b("self.hasUnitInTeam(neutralTeam=true)"));
            a(a3, b("self.shield()+self.ammo()+self.hp()>-1"));
            a(a3, b("parent.shield()+parent.ammo()+parent.hp()>-1"));
            a(a3, b("'hello'+'a'"), "helloa");
            a(a3, b("'hello'+5"), "hello5");
            a(a3, b("substring('hello',0,3)"), "hel");
            a(a3, b("substring('hello',0,100)"), "hello");
            a(a3, b("substring('HEllo',0,100)"), "HEllo");
            a(a3, b("'HEllo'"), "HEllo");
            a(a3, b("substring('aa',0,2)+substring('bb',0,2)"), "aabb");
            b(a3, b(" true AND true"));
            b(a3, b(" true aNd true"));
            b(a3, b(" true OR false"));
            b(a3, b(" true OR TRUE"));
            b(a3, b(" True OR  False "));
            b(a3, b(" True OR  (False) "));
            b(a3, b(" NOT FALSE "));
            b(a3, b(" NOT NOT NOT FALSE "));
            b(a3, b(" game.nukesEnabled "));
            b(a3, b(" GAME.NukesEnabled "));
            a(a3, b("squareRoot( 100 )"), 10.0f);
            a(a3, b("max(+1,2)"), 2.0f);
            a(a3, b("min(+1,2)"), 1.0f);
            a(a3, b("max(1,2)"), 2.0f);
            a(a3, b("min(1,2)"), 1.0f);
            a(a3, b("max( 1,2 )"), 2.0f);
            a(a3, b("min( 1,2 )"), 1.0f);
            a(a3, b("max(-1,2)"), 2.0f);
            a(a3, b("min(-1,2)"), -1.0f);
            a(a3, b("max( -1,2 )"), 2.0f);
            a(a3, b("min( -1,2 )"), -1.0f);
            a(a3, b("max( 3,1 )"), 3.0f);
            a(a3, b("min( 3,1 )"), 1.0f);
            a(a3, b("max( 3+3,4 )"), 6.0f);
            a(a3, b("min( 3+3,4 )"), 4.0f);
            a(a3, b("distanceSquared( 1,1,1,6 )"), 25.0f);
            a(a3, b("max(distanceSquared( 1,1,1,6 ), 4)"), 25.0f);
            a(a3, b("min(  distanceSquared( 1,1,1 , 6 )  , 4)"), 4.0f);
            b(a3, b("distanceSquared( 1,1,1,6 )>=5*5"));
            b(a3, b("distanceSquared( 1,1,1,6 )>4*5"));
            b(a3, b("distanceSquared( 1,1,6,1 )<6*5"));
            b(a3, b("distance( 0,0,5,0 )==5"));
            b(a3, b("distance( 0,1,0,6 )==5"));
            a(a3, b("customTarget1"), a4);
            a(a3, b("customTarget1.self"), a4);
            a(a3, b("self.customTarget1.self"), a4);
            a(a3, b("customTarget1.customTarget2"), a4.bv);
            a(a3, b(" distanceBetween(customTarget1.customTarget2, customTarget1 ) "), f.b(a4.eo, a4.ep, a5.eo, a5.ep));
            a(a3, b(" distanceBetweenSquared(customTarget1.customTarget2, customTarget1 ) "), f.a(a4.eo, a4.ep, a5.eo, a5.ep));
            b(a3, b(" distanceBetween(self, nullUnit ) == 0 "));
            a(a3, b(" distanceBetween(customTarget1.customTarget2, nullUnit ) "), 0.0f);
            a(a3, b(" distanceBetween(nullUnit, nullUnit ) "), 0.0f);
            a(a3, b(" distanceBetween( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 10.0f);
            a(a3, b(" distanceBetweenSquared( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 100.0f);
            b(a3, b(" self.energy < 0.5 and customTarget2==nullUnit ", true));
            b(a3, b(" self.energy < 0.5 and customTarget2 == nullUnit ", true));
            b(a3, b(" self.energy < 0.5 and customTarget1 != nullUnit ", true));
            b(a3, b("parent==nullUnit and customTarget1!= nullUnit ", true));
            b(a3, b("parent == nullUnit and customTarget1!=nullUnit ", true));
            a("distanceBetween( self )");
            a("distanceBetween( self, 5 )");
            a("distanceBetween( self, nullUnit, nullUnit )");
            a("distanceBetween(  )");
            b(a3, b("'and'=='and'"));
            b(a3, b("'and'!='and true'"));
            b(a3, b("'hello.test'!='bye'"));
            b(a3, b("'hel.lo.test'!='b.ye'"));
            b(a3, b("'hel.lo.(test'!='b.ye'"));
            b(a3, b("'hel.\"lo.(test'!='b.ye \"and '"));
            b(a3, b("\"hel.lo.'(test2\"!='b.ye \"and '"));
            b(a3, b("5==5"));
            b(a3, b("'hel.lo.(test'!='b.ye' and 5==5"));
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
            b(a3, b("SELF.HP(lessThan=9999)"));
            c(a3, b("Self.Parent.HP(lessThan=9999)"));
            a("self.hasFlag( id=35 )");
            a("self.hasFlag( 35 )");
            c(a3, b("self.hasFlag(id=30)"));
            c(a3, b("self.hasFlag(30)"));
            c(a3, b("self.hasFlag(15+15)"));
            c(a3, b("self.hasFlag(id=15*2)"));
        }
        GameEngine.m5e("Took: " + Unit.a(valueOf.longValue(), Long.valueOf(Unit.loadAllUnitsTook()).longValue()));
        GameEngine.m5e("=== logic boolean memory tests ==");
        a(lVar, "unit testUnit1, float testFloat1");
        a(lVar, "unit testUnit2, float testFloat2");
        a(lVar, "bool testBool1");
        a(lVar, "number testNumber1");
        a(lVar, "float  testNumber2");
        a(lVar, "String testString");
        a(lVar, "String nullString");
        a(a3, "testString='(,,((', testFloat1=5, testFloat2=8, testBool1=true, testUnit1=self");
        a(a3, "nullString=null");
        b(a, "testNumber1=null");
        b(a, "testNumber2=null");
        b(a, "testBool1=null");
        b(a, "testNumber1=self");
        b(a, "testBool1=5");
        GameEngine.m5e(a3.bw.debugMemory(false, true));
        a(a3, b("memory.testFloat1"), 5.0f);
        a(a3, b("memory.testFloat2"), 8.0f);
        b(a3, b("memory.testFloat1==5"));
        b(a3, b("memory.testString=='(,,(('"));
        b(a3, b("memory.testBool1"));
        b(a3, b("memory.testBool1==true"));
        b(a3, b("memory.testUnit1==self"));
        b(a3, b("memory.testUnit1!=nullUnit"));
        a("memory.testUnit1==5", true);
        a(a3, b("self.readUnitMemory('testFloat1', type='float')"), 5.0f);
        a(a3, "testFloat1=distance( 0,0,6,0 ), testFloat2=16");
        b(a3, b("memory.testFloat1==6"));
        b(a3, b("memory.testFloat2==16"));
        a(a3, "testUnit1=self.getOffsetAbsolute(y=10), testUnit2=self.getOffsetAbsolute(y=-10)");
        GameEngine.m5e(a3.bw.debugMemory(false, true));
        a(a3, b("distanceBetween( memory.testUnit1, memory.testUnit2)"), 20.0f);
        b(a3, b("distanceBetweenSquared( memory.testUnit1, memory.testUnit2)==20*20"));
        a(a3, b("globalSearchForFirstUnit(withTag='globalTag1')"), a9);
        a(a3, b("globalSearchForFirstUnit(withTag='globalTag2')"), a9);
        b(a3, b("globalSearchForFirstUnit()!=null"));
        b(a3, b("globalSearchForFirstUnit(withTag='globalTag1', relation='enemy')==null"));
        b(a3, b("globalSearchForFirstUnit(withTag='globalTagNo')==null"));
        a("globalSearchForFirstUnit(withTag='globalTag1', relation='XYZ')", true);
    }

    public void a(String str) {
        a(str, false);
    }

    public void a(String str, boolean z) {
        try {
            LogicBooleanLoader.parseBooleanBlock(l.b, str, false);
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

    public void a(l lVar, String str) {
        lVar.r.defineVariables(lVar, str);
    }

    public void a(am amVar, String str) {
        try {
            j jVar = (j) amVar;
            VariableScope.createMemoryWriter(str, jVar.x, "testsection", "testkey").writeToUnit(jVar);
        } catch (bo e) {
            throw new RuntimeException(e);
        }
    }

    public void b(am amVar, String str) {
        try {
            j jVar = (j) amVar;
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
            return LogicBooleanLoader.parseBooleanBlock(l.b, str, z);
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
        if (f.c(readNumber - f) > 0.001f) {
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
            GameEngine.m5e("class: " + logicBoolean.getClass().getName());
            throw new RuntimeException("assertBooleanUnit failed:" + am.A(readUnit) + "!=" + am.A(amVar) + " for: " + logicBoolean.getMatchFailReasonForPlayer(yVar));
        }
    }
}