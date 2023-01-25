package com.corrodinggames.rts.debug.test;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0742br;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/c.class */
public class C0074c extends AbstractScriptTest {
    /* renamed from: a */
    public void m5453a() {
        GameEngine.m5924e("Logic boolean tests");
        C0458l c0458l = C0458l.f2933b;
        m5451a(c0458l, "number numA");
        m5451a(c0458l, "number numB");
        m5451a(c0458l, "number[] numArrayA");
        m5451a(c0458l, "number[] numArrayB");
        m5451a(c0458l, "bool[] boolArrayA");
        m5451a(c0458l, "unit[] unitArrayA");
        AbstractC0244am m3761a = C0458l.m3761a(false, c0458l);
        AbstractC0629y m3761a2 = C0458l.m3761a(false, c0458l);
        m3761a2.m3079b(PlayerData.f1373i);
        AbstractC0629y m3761a3 = C0458l.m3761a(false, c0458l);
        m3761a3.m3079b(PlayerData.f1373i);
        m3761a3.f1637cu = 44.0f;
        m5452a(m3761a3, "numA=5");
        m5452a(m3761a3, "numB=7");
        m5452a(m3761a3, "numArrayA[0]=1");
        m5452a(m3761a3, "numArrayA[1]=2");
        m5452a(m3761a3, "numArrayA[2]=15");
        m5452a(m3761a3, "boolArrayA[0]=true");
        m5452a(m3761a3, "unitArrayA[0]=self");
        m5452a(m3761a3, "numArrayA[(5)]=5");
        m5452a(m3761a3, "numArrayA[5+5]=10");
        m5452a(m3761a3, "numArrayA[4+4]=8");
        m5452a(m3761a3, "boolArrayA[10]=true");
        m5452a(m3761a3, "unitArrayA[10]=self");
        GameEngine.m5924e("string: " + m5439d(m3761a3, m5442b("str(memory.numArrayA)")));
        m5449a(m3761a3, m5442b("memory.numArrayA.get(5)"), 5.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(10)"), 10.0f);
        m5443b(m3761a3, m5442b("memory.boolArrayA[10]"));
        m5443b(m3761a3, m5442b("memory.unitArrayA[10]==self"));
        m5452a(m3761a3, "numArrayA[memory.numArrayA.get(2)]=98");
        m5449a(m3761a3, m5442b("memory.numArrayA.get(15)"), 98.0f);
        m5452a(m3761a3, "numArrayA[memory.numArrayA[2]]=99");
        m5449a(m3761a3, m5442b("memory.numArrayA.get(15)"), 99.0f);
        m5452a(m3761a3, "numArrayA[((((((((6))))))))]=99");
        m5452a(m3761a3, "numArrayA[((((((((memory.numArrayA[2]))))))))]=88");
        m5449a(m3761a3, m5442b("memory.numArrayA.get(15)"), 88.0f);
        m5444b(m3761a3, "numArrayA[((((((((memory.numArrayA[2])())))))]=77");
        m5444b(m3761a3, "numArrayA[((((((((memory.numArrayA[2])))[)))]]))]=66");
        m5444b(m3761a3, "numArrayA[a]=1");
        m5444b(m3761a3, "numArrayA[0]='a'");
        m5452a(m3761a3, "numArrayA[9001]=5");
        m5449a(m3761a3, m5442b("memory.numArrayA.size"), 9002.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.length"), 9002.0f);
        m5452a(m3761a3, "numArrayA[11000]=5");
        m5452a(m3761a3, "numArrayA[10000]=5");
        m5452a(m3761a3, "numArrayA[10001]=6");
        m5452a(m3761a3, "numArrayA[9999]=42");
        m5449a(m3761a3, m5442b("memory.numArrayA.get(11000)"), 0.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(10000)"), 5.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(10001)"), 0.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(9999)"), 42.0f);
        m5452a(m3761a3, "numArrayA[21]=21");
        m5452a(m3761a3, "numArrayA[22]=memory.numArrayA[21]");
        m5449a(m3761a3, m5442b("memory.numArrayA.get(22)"), 21.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(0)"), 1.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(1)"), 2.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(5)"), 5.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(500)"), 0.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA.get(9000)"), 0.0f);
        m5446a("memory.numArrayA.get('A')");
        m5449a(m3761a3, m5442b("memory.numArrayA[0]"), 1.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA[1]"), 2.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA[0]+memory.numArrayA[1]"), 3.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA[0]+(memory.numArrayA[1])"), 3.0f);
        m5449a(m3761a3, m5442b("(memory.numArrayA[0]+(memory.numArrayA[1]))"), 3.0f);
        m5449a(m3761a3, m5442b("memory.numArrayA[5]"), 5.0f);
        m5443b(m3761a3, m5442b("memory.numArrayA.contains(5)"));
        m5440c(m3761a3, m5442b("memory.numArrayA.contains(777)"));
        m5443b(m3761a3, m5442b("memory.numArrayA.contains(memory.numArrayA[5])"));
        m5446a("memory.numArrayA.contains('a')");
        m5446a("memory.numArrayA.contains(true)");
        m5446a("memory.numArrayA[5][5]");
        m5446a("memory.numArrayA[5][5][60]");
        m5446a("memory.numArrayA[5][5][[60]]");
        m5446a("memory.numArrayA[5][[5]");
        m5446a("memory.numArrayA[5]][5]");
        m5446a("memory.numArrayA[5[]][5]");
        m5446a("memory.numArrayA[[5[]][5]");
        C0456j m3761a4 = C0458l.m3761a(false, c0458l);
        m3761a4.m3079b(PlayerData.f1373i);
        m3761a4.f7172eo = 10.0f;
        m3761a4.f1637cu = 55.0f;
        m3761a4.f1638cv = 500.0f;
        m3761a3.f1584bu = m3761a4;
        m5452a(m3761a4, "numA=309");
        m5452a(m3761a4, "numB=409");
        C0456j m3761a5 = C0458l.m3761a(false, c0458l);
        m3761a5.m3079b(PlayerData.f1373i);
        m3761a5.f7173ep = 5.0f;
        m3761a5.f1637cu = 66.0f;
        m3761a5.f1638cv = 1000.0f;
        m3761a4.f1585bv = m3761a5;
        C0456j m3761a6 = C0458l.m3761a(false, c0458l);
        m3761a6.m3079b(PlayerData.f1373i);
        m3761a6.f7172eo = 2.0f;
        m5452a(m3761a6, "numA=99");
        m5452a(m3761a6, "numB=88");
        C0456j m3761a7 = C0458l.m3761a(false, c0458l);
        m3761a7.m3079b(PlayerData.f1373i);
        m3761a7.f7172eo = 3.0f;
        m5452a(m3761a7, "numA=239");
        m5452a(m3761a7, "numB=268");
        C0456j m3761a8 = C0458l.m3761a(false, c0458l);
        m3761a8.m3079b(PlayerData.f1373i);
        m3761a8.f7172eo = 3.0f;
        m3761a6.m3943C(m3761a7);
        m3761a6.m3943C(m3761a8);
        C0456j m3761a9 = C0458l.m3761a(false, c0458l);
        m3761a9.m3079b(PlayerData.f1373i);
        m3761a9.m3909a(C0453g.m3958a("globalTag1, globalTag2"), false);
        m3761a9.f7172eo = 2.0f;
        GameEngine.m5924e("=== logic boolean tests == (runs:50)");
        Long valueOf = Long.valueOf(C0742br.m2574a());
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
            }
            m5443b(m3761a3, m5442b("true"));
            m5440c(m3761a3, m5442b("false"));
            m5443b(m3761a3, m5442b("not false"));
            m5443b(m3761a3, m5442b("not not true"));
            m5449a(m3761a3, m5442b("5"), 5.0f);
            m5449a(m3761a3, m5442b("5+5"), 10.0f);
            m5449a(m3761a3, m5442b("1+2+3"), 6.0f);
            m5449a(m3761a3, m5442b("2.5+2.5"), 5.0f);
            m5449a(m3761a3, m5442b("10-2"), 8.0f);
            m5449a(m3761a3, m5442b("((5+5)-2)*3"), 24.0f);
            m5449a(m3761a3, m5442b("10/2+10*2"), 25.0f);
            m5449a(m3761a3, m5442b("-5"), -5.0f);
            m5449a(m3761a3, m5442b("--5"), 5.0f);
            m5449a(m3761a3, m5442b("9--5"), 14.0f);
            m5449a(m3761a3, m5442b("-9--5"), -4.0f);
            m5449a(m3761a3, m5442b("+5"), 5.0f);
            m5449a(m3761a3, m5442b("+ 5"), 5.0f);
            m5449a(m3761a3, m5442b(" + 5"), 5.0f);
            m5449a(m3761a3, m5442b(" ++ 5"), 5.0f);
            m5449a(m3761a3, m5442b("-+5"), -5.0f);
            m5449a(m3761a3, m5442b("--+5"), 5.0f);
            m5449a(m3761a3, m5442b("++-5"), -5.0f);
            m5449a(m3761a3, m5442b(" - - +5"), 5.0f);
            m5449a(m3761a3, m5442b("9++5"), 14.0f);
            m5446a("5 - ");
            m5446a("5 -- ");
            m5446a("5 + ");
            m5446a("5 ++ ");
            m5446a("5 ** 9 ");
            m5446a("5 -/ 9 ");
            m5446a("5 * 5 -");
            m5446a(" - ");
            m5446a(" -- ");
            m5446a(" + ");
            m5446a(" ++ ");
            m5447a(m3761a3, m5442b(" 'hello'"), "hello");
            m5447a(m3761a3, m5442b(" \"hello\" "), "hello");
            m5449a(m3761a3, m5442b("self.hp+1"), m3761a3.f1637cu + 1.0f);
            m5449a(m3761a3, m5442b("self.x+1"), m3761a3.f7172eo + 1.0f);
            m5449a(m3761a3, m5442b("self.y+1"), m3761a3.f7173ep + 1.0f);
            m5449a(m3761a3, m5442b("self.z+1"), m3761a3.f7174eq + 1.0f);
            m5449a(m3761a3, m5442b("int( 5.5+0.1 )"), 5.0f);
            m5449a(m3761a3, m5442b("-5 * 5"), -25.0f);
            m5449a(m3761a3, m5442b("-5 * self.hp"), (-5.0f) * m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("self.hp + -5"), m3761a3.f1637cu - 5.0f);
            m5449a(m3761a3, m5442b("self.hp * -5"), (-5.0f) * m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("(self.hp ) * -5 "), (-5.0f) * m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("-self.hp * -5"), (-5.0f) * (-m3761a3.f1637cu));
            m5449a(m3761a3, m5442b("-(self.hp ) * -5 "), (-5.0f) * (-m3761a3.f1637cu));
            m5449a(m3761a3, m5442b("-5 * -self.hp"), (-5.0f) * (-m3761a3.f1637cu));
            m5449a(m3761a3, m5442b("(-5 * -self.hp)/2"), ((-5.0f) * (-m3761a3.f1637cu)) / 2.0f);
            m5449a(m3761a3, m5442b("-(self.hp )"), -m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("--(self.hp )"), m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("-((self.hp ))"), -m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("-self.hp"), -m3761a3.f1637cu);
            m5449a(m3761a3, m5442b("-0"), 0.0f);
            m5449a(m3761a3, m5442b("-  1"), -1.0f);
            m5449a(m3761a3, m5442b(" -  1"), -1.0f);
            m5449a(m3761a3, m5442b("-0*-0"), 0.0f);
            m5449a(m3761a3, m5442b("-2*2"), -4.0f);
            m5449a(m3761a3, m5442b("-2-3-2"), -7.0f);
            m5440c(m3761a3, m5442b("10>10"));
            m5440c(m3761a3, m5442b("10<10"));
            m5443b(m3761a3, m5442b("10>=10"));
            m5443b(m3761a3, m5442b("10<=10"));
            m5443b(m3761a3, m5442b("'hello'=='hello'"));
            m5443b(m3761a3, m5442b("'hello'!='bye'"));
            m5446a("'hello'<'bye'");
            m5446a("'hello'>'bye'");
            m5446a("'hello'<='bye'");
            m5446a("'hello'>='bye'");
            m5446a("'hello'55'bye'");
            m5446a("'hello'><'bye'");
            m5446a("6><8");
            m5440c(m3761a3, m5442b("not (10>5 and true)"));
            m5440c(m3761a3, m5442b("not true and false"));
            m5443b(m3761a3, m5442b("not false and true"));
            m5443b(m3761a3, m5442b("not (false and true)"));
            m5440c(m3761a3, m5442b("not (1>2 or 5>2)"));
            m5443b(m3761a3, m5442b("(true and (false or true))"));
            m5443b(m3761a3, m5442b(" true and   (false   or   true  )"));
            m5443b(m3761a3, m5442b("true and((false)or(true) )"));
            m5443b(m3761a3, m5442b("100>50+20"));
            m5443b(m3761a3, m5442b("100>50*1.5"));
            m5443b(m3761a3, m5442b("not (100<50*1.5)"));
            m5443b(m3761a3, m5442b("5 < 10 < 15"));
            m5443b(m3761a3, m5442b("false==false"));
            m5443b(m3761a3, m5442b("true==true"));
            m5443b(m3761a3, m5442b("false==false==false"));
            m5443b(m3761a3, m5442b("true==true==true"));
            m5443b(m3761a3, m5442b("false!=true!=false"));
            m5443b(m3761a3, m5442b("true!=false!=true"));
            m5440c(m3761a3, m5442b("'test'==null"));
            m5443b(m3761a3, m5442b("'test'!=null"));
            m5440c(m3761a3, m5442b("'test'==null==null"));
            m5443b(m3761a3, m5442b("'test'!=null!='test2'"));
            m5443b(m3761a3, m5442b("self!=null"));
            m5440c(m3761a3, m5442b("self==null"));
            m5443b(m3761a3, m5442b("10==10"));
            m5443b(m3761a3, m5442b("10.5==10.5"));
            m5443b(m3761a3, m5442b("1/3==1/3"));
            m5440c(m3761a3, m5442b("10!=10"));
            m5443b(m3761a3, m5442b("10!=5"));
            m5446a("true - true");
            m5446a("true + true");
            m5446a("true * true");
            m5446a("true / true");
            m5446a("true < 10");
            m5446a("true == 10");
            m5446a("true != 10");
            m5446a("'text' == 10");
            m5446a("10 == ");
            m5446a("10 != ");
            m5446a("10 > ");
            m5446a("10 < ");
            m5446a("10 >= ");
            m5446a("10 <= ");
            m5446a("10 ==");
            m5446a("10 !=");
            m5446a("10 >");
            m5446a("10 <");
            m5446a("10 >=");
            m5446a("10 <=");
            m5446a("==10");
            m5446a("!=10");
            m5446a(">10");
            m5446a("<10");
            m5446a(">=10");
            m5446a("<=10");
            m5446a("10.6.6");
            m5447a(m3761a3, m5442b("select(true, 'A','B')"), "A");
            m5447a(m3761a3, m5442b("select(false, 'A','B')"), "B");
            m5447a(m3761a3, m5442b("str(5.5)"), "5.5");
            m5447a(m3761a3, m5442b("str(5)"), "5");
            m5447a(m3761a3, m5442b("lowercase('HELlo')"), "hello");
            m5447a(m3761a3, m5442b("uppercase('heLLo')"), "HELLO");
            m5447a(m3761a3, m5442b("lowercase(str('HELlo'))"), "hello");
            m5447a(m3761a3, m5442b("'hello'"), "hello");
            m5447a(m3761a3, m5442b("'hello'+' world'"), "hello world");
            m5447a(m3761a3, m5442b("'he(llo'+' world'"), "he(llo world");
            m5447a(m3761a3, m5442b("'he(llo'+' wor)ld'"), "he(llo wor)ld");
            m5446a("('hello'+' world'");
            m5446a("'hello'+)' world'");
            m5443b(m3761a3, m5442b("self.hp(lessThan=9999)"));
            m5446a("self.hp(lessThan=9999, lessThan=9998)");
            m5446a("self..hp(lessThan=9999)");
            m5446a("self...hp(lessThan=9999)");
            m5442b("game.nukesEnabled()");
            m5446a("game.nukesEnabled(nukesEnabled=true)");
            m5446a("game.nukesEnabled(nukesEnabled=false)");
            m5446a("game.nukesEnabled()==0");
            m5446a("game.nukesEnabled()!=0");
            m5446a("game.nukesEnabled()<0");
            m5446a("game.nukesEnabled()>0");
            m5446a("game.nukesEnabled()=='true'");
            m5446a("game.nukesEnabled()!='true'");
            m5446a("self.nukesEnabled()");
            m5446a("parent.nukesEnabled()");
            m5446a("hp==44");
            m5446a("5=44");
            if (m3761a3 == PlayerData.f1373i.f1315s) {
                GameEngine.m5924e("skipping for placeholderTeamUnit");
            } else {
                m5443b(m3761a3, m5442b("self.hp==44"));
                m5443b(m3761a3, m5442b("self.customTarget1.hp==55"));
                m5446a("self.memory1.hp=55");
                m5443b(m3761a3, m5442b("self.customTarget1.maxhp==500"));
                m5443b(m3761a3, m5442b("customTarget1.hp==55"));
                m5443b(m3761a3, m5442b("self.customTarget1.customTarget2.hp==66"));
                m5443b(m3761a3, m5442b("self.customTarget1==self.customTarget1"));
                m5443b(m3761a3, m5442b("self.customTarget1!=self"));
                m5443b(m3761a2, m5442b("self.customTarget1==null"));
                m5443b(m3761a2, m5442b("self.customTarget1!=self"));
                m5443b(m3761a2, m5442b("self.parent==null"));
                m5443b(m3761a2, m5442b("self.parent.customTarget1==null"));
                m5443b(m3761a2, m5442b("self.parent.customTarget1==self.parent"));
                m5443b(m3761a2, m5442b("self.parent.customTarget1!=self"));
            }
            m5449a(m3761a3, m5442b("self.getOffsetAbsolute(y=10).y"), m3761a3.f7173ep + 10.0f);
            m5443b(m3761a3, m5442b("self.getOffsetAbsolute(y=10).y==self.y+10"));
            m5443b(m3761a3, m5442b("self.getOffsetRelative(y=10, height=5).height==self.height+5"));
            m5449a(m3761a3, m5442b("self.getOffsetRelative(y=10, height=5).height"), m3761a3.f7174eq + 5.0f);
            m5449a(m3761a3, m5442b("self.getOffsetAbsolute(y=10).getOffsetAbsolute(y=10).y"), m3761a3.f7173ep + 10.0f + 10.0f);
            m5449a(m3761a6, m5442b("self.transporting().getOffsetAbsolute(x=5).x"), m3761a7.f7172eo + 5.0f);
            m5449a(m3761a6, m5442b("self.transporting(slot=1).getOffsetAbsolute(x=5).x"), m3761a8.f7172eo + 5.0f);
            m5449a(m3761a6, m5442b("self.transporting().parent.transporting().parent.id"), (float) m3761a6.f7166eh);
            m5449a(m3761a6, m5442b("self.transporting().getOffsetAbsolute(x=memory.numA).x-memory.numA"), m3761a7.f7172eo);
            m5449a(m3761a6, m5442b("self.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m3761a7.f7172eo);
            m5449a(m3761a6, m5442b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m3761a7.f7172eo);
            m5449a(m3761a6, m5442b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute().x-self.id"), m3761a7.f7172eo);
            m5449a(m3761a6, m5442b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute(x=self.id+1).x"), m3761a7.f7172eo + ((float) m3761a6.f7166eh) + ((float) m3761a6.f7166eh) + 1.0f);
            m5443b(m3761a3, m5442b("numberOfUnitsInTeam(greaterThan=-2)"));
            m5443b(m3761a3, m5442b("NumberOfUnitsInTeam(greaterTHAN=-2)"));
            m5450a(m3761a3, m5442b("self.noUnitInTeam()"));
            m5450a(m3761a3, m5442b("self.hasUnitInTeam()"));
            m5450a(m3761a3, m5442b("self.hasUnitInTeam(neutralTeam=true)"));
            m5450a(m3761a3, m5442b("self.shield()+self.ammo()+self.hp()>-1"));
            m5450a(m3761a3, m5442b("parent.shield()+parent.ammo()+parent.hp()>-1"));
            m5447a(m3761a3, m5442b("'hello'+'a'"), "helloa");
            m5447a(m3761a3, m5442b("'hello'+5"), "hello5");
            m5447a(m3761a3, m5442b("substring('hello',0,3)"), "hel");
            m5447a(m3761a3, m5442b("substring('hello',0,100)"), "hello");
            m5447a(m3761a3, m5442b("substring('HEllo',0,100)"), "HEllo");
            m5447a(m3761a3, m5442b("'HEllo'"), "HEllo");
            m5447a(m3761a3, m5442b("substring('aa',0,2)+substring('bb',0,2)"), "aabb");
            m5443b(m3761a3, m5442b(" true AND true"));
            m5443b(m3761a3, m5442b(" true aNd true"));
            m5443b(m3761a3, m5442b(" true OR false"));
            m5443b(m3761a3, m5442b(" true OR TRUE"));
            m5443b(m3761a3, m5442b(" True OR  False "));
            m5443b(m3761a3, m5442b(" True OR  (False) "));
            m5443b(m3761a3, m5442b(" NOT FALSE "));
            m5443b(m3761a3, m5442b(" NOT NOT NOT FALSE "));
            m5443b(m3761a3, m5442b(" game.nukesEnabled "));
            m5443b(m3761a3, m5442b(" GAME.NukesEnabled "));
            m5449a(m3761a3, m5442b("squareRoot( 100 )"), 10.0f);
            m5449a(m3761a3, m5442b("max(+1,2)"), 2.0f);
            m5449a(m3761a3, m5442b("min(+1,2)"), 1.0f);
            m5449a(m3761a3, m5442b("max(1,2)"), 2.0f);
            m5449a(m3761a3, m5442b("min(1,2)"), 1.0f);
            m5449a(m3761a3, m5442b("max( 1,2 )"), 2.0f);
            m5449a(m3761a3, m5442b("min( 1,2 )"), 1.0f);
            m5449a(m3761a3, m5442b("max(-1,2)"), 2.0f);
            m5449a(m3761a3, m5442b("min(-1,2)"), -1.0f);
            m5449a(m3761a3, m5442b("max( -1,2 )"), 2.0f);
            m5449a(m3761a3, m5442b("min( -1,2 )"), -1.0f);
            m5449a(m3761a3, m5442b("max( 3,1 )"), 3.0f);
            m5449a(m3761a3, m5442b("min( 3,1 )"), 1.0f);
            m5449a(m3761a3, m5442b("max( 3+3,4 )"), 6.0f);
            m5449a(m3761a3, m5442b("min( 3+3,4 )"), 4.0f);
            m5449a(m3761a3, m5442b("distanceSquared( 1,1,1,6 )"), 25.0f);
            m5449a(m3761a3, m5442b("max(distanceSquared( 1,1,1,6 ), 4)"), 25.0f);
            m5449a(m3761a3, m5442b("min(  distanceSquared( 1,1,1 , 6 )  , 4)"), 4.0f);
            m5443b(m3761a3, m5442b("distanceSquared( 1,1,1,6 )>=5*5"));
            m5443b(m3761a3, m5442b("distanceSquared( 1,1,1,6 )>4*5"));
            m5443b(m3761a3, m5442b("distanceSquared( 1,1,6,1 )<6*5"));
            m5443b(m3761a3, m5442b("distance( 0,0,5,0 )==5"));
            m5443b(m3761a3, m5442b("distance( 0,1,0,6 )==5"));
            m5448a(m3761a3, m5442b("customTarget1"), m3761a4);
            m5448a(m3761a3, m5442b("customTarget1.self"), m3761a4);
            m5448a(m3761a3, m5442b("self.customTarget1.self"), m3761a4);
            m5448a(m3761a3, m5442b("customTarget1.customTarget2"), m3761a4.f1585bv);
            m5449a(m3761a3, m5442b(" distanceBetween(customTarget1.customTarget2, customTarget1 ) "), C0773f.m2304b(m3761a4.f7172eo, m3761a4.f7173ep, m3761a5.f7172eo, m3761a5.f7173ep));
            m5449a(m3761a3, m5442b(" distanceBetweenSquared(customTarget1.customTarget2, customTarget1 ) "), C0773f.m2350a(m3761a4.f7172eo, m3761a4.f7173ep, m3761a5.f7172eo, m3761a5.f7173ep));
            m5443b(m3761a3, m5442b(" distanceBetween(self, nullUnit ) == 0 "));
            m5449a(m3761a3, m5442b(" distanceBetween(customTarget1.customTarget2, nullUnit ) "), 0.0f);
            m5449a(m3761a3, m5442b(" distanceBetween(nullUnit, nullUnit ) "), 0.0f);
            m5449a(m3761a3, m5442b(" distanceBetween( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 10.0f);
            m5449a(m3761a3, m5442b(" distanceBetweenSquared( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 100.0f);
            m5443b(m3761a3, m5441b(" self.energy < 0.5 and customTarget2==nullUnit ", true));
            m5443b(m3761a3, m5441b(" self.energy < 0.5 and customTarget2 == nullUnit ", true));
            m5443b(m3761a3, m5441b(" self.energy < 0.5 and customTarget1 != nullUnit ", true));
            m5443b(m3761a3, m5441b("parent==nullUnit and customTarget1!= nullUnit ", true));
            m5443b(m3761a3, m5441b("parent == nullUnit and customTarget1!=nullUnit ", true));
            m5446a("distanceBetween( self )");
            m5446a("distanceBetween( self, 5 )");
            m5446a("distanceBetween( self, nullUnit, nullUnit )");
            m5446a("distanceBetween(  )");
            m5443b(m3761a3, m5442b("'and'=='and'"));
            m5443b(m3761a3, m5442b("'and'!='and true'"));
            m5443b(m3761a3, m5442b("'hello.test'!='bye'"));
            m5443b(m3761a3, m5442b("'hel.lo.test'!='b.ye'"));
            m5443b(m3761a3, m5442b("'hel.lo.(test'!='b.ye'"));
            m5443b(m3761a3, m5442b("'hel.\"lo.(test'!='b.ye \"and '"));
            m5443b(m3761a3, m5442b("\"hel.lo.'(test2\"!='b.ye \"and '"));
            m5443b(m3761a3, m5442b("5==5"));
            m5443b(m3761a3, m5442b("'hel.lo.(test'!='b.ye' and 5==5"));
            m5446a("distanceSquared(  )");
            m5446a("distanceSquared( 1 )");
            m5446a("distanceSquared( 1,1 )");
            m5446a("distanceSquared( 1,1,1 )");
            m5446a("distanceSquared( 1,1,1,'test' )");
            m5446a("distanceSquared( 1,1,1,true )");
            m5446a("distanceSquared( 1,1,1,null )");
            m5446a("distanceSquared( 1,1,1, )");
            m5446a("distanceSquared( 1,1,1,'test' )");
            m5446a("distanceSquared( x1=1,1,1,'test' )");
            m5446a("distanceSquared( 1,1,1,1, x1=1 )");
            m5446a("distanceSquared( 1,1,1,1,1 )");
            m5446a("distanceSquared( 1,1,1, x1=1 )");
            m5446a("distanceSquared( 1,1,1, 1 ");
            m5446a("distanceSquared( 1,1,1, 1 ))");
            m5443b(m3761a3, m5442b("SELF.HP(lessThan=9999)"));
            m5440c(m3761a3, m5442b("Self.Parent.HP(lessThan=9999)"));
            m5446a("self.hasFlag( id=35 )");
            m5446a("self.hasFlag( 35 )");
            m5440c(m3761a3, m5442b("self.hasFlag(id=30)"));
            m5440c(m3761a3, m5442b("self.hasFlag(30)"));
            m5440c(m3761a3, m5442b("self.hasFlag(15+15)"));
            m5440c(m3761a3, m5442b("self.hasFlag(id=15*2)"));
        }
        GameEngine.m5924e("Took: " + C0742br.m2571a(valueOf.longValue(), Long.valueOf(C0742br.m2574a()).longValue()));
        GameEngine.m5924e("=== logic boolean memory tests ==");
        m5451a(c0458l, "unit testUnit1, float testFloat1");
        m5451a(c0458l, "unit testUnit2, float testFloat2");
        m5451a(c0458l, "bool testBool1");
        m5451a(c0458l, "number testNumber1");
        m5451a(c0458l, "float  testNumber2");
        m5451a(c0458l, "String testString");
        m5451a(c0458l, "String nullString");
        m5452a(m3761a3, "testString='(,,((', testFloat1=5, testFloat2=8, testBool1=true, testUnit1=self");
        m5452a(m3761a3, "nullString=null");
        m5444b(m3761a, "testNumber1=null");
        m5444b(m3761a, "testNumber2=null");
        m5444b(m3761a, "testBool1=null");
        m5444b(m3761a, "testNumber1=self");
        m5444b(m3761a, "testBool1=5");
        GameEngine.m5924e(m3761a3.f1586bw.debugMemory(false, true));
        m5449a(m3761a3, m5442b("memory.testFloat1"), 5.0f);
        m5449a(m3761a3, m5442b("memory.testFloat2"), 8.0f);
        m5443b(m3761a3, m5442b("memory.testFloat1==5"));
        m5443b(m3761a3, m5442b("memory.testString=='(,,(('"));
        m5443b(m3761a3, m5442b("memory.testBool1"));
        m5443b(m3761a3, m5442b("memory.testBool1==true"));
        m5443b(m3761a3, m5442b("memory.testUnit1==self"));
        m5443b(m3761a3, m5442b("memory.testUnit1!=nullUnit"));
        m5445a("memory.testUnit1==5", true);
        m5449a(m3761a3, m5442b("self.readUnitMemory('testFloat1', type='float')"), 5.0f);
        m5452a(m3761a3, "testFloat1=distance( 0,0,6,0 ), testFloat2=16");
        m5443b(m3761a3, m5442b("memory.testFloat1==6"));
        m5443b(m3761a3, m5442b("memory.testFloat2==16"));
        m5452a(m3761a3, "testUnit1=self.getOffsetAbsolute(y=10), testUnit2=self.getOffsetAbsolute(y=-10)");
        GameEngine.m5924e(m3761a3.f1586bw.debugMemory(false, true));
        m5449a(m3761a3, m5442b("distanceBetween( memory.testUnit1, memory.testUnit2)"), 20.0f);
        m5443b(m3761a3, m5442b("distanceBetweenSquared( memory.testUnit1, memory.testUnit2)==20*20"));
        m5448a(m3761a3, m5442b("globalSearchForFirstUnit(withTag='globalTag1')"), m3761a9);
        m5448a(m3761a3, m5442b("globalSearchForFirstUnit(withTag='globalTag2')"), m3761a9);
        m5443b(m3761a3, m5442b("globalSearchForFirstUnit()!=null"));
        m5443b(m3761a3, m5442b("globalSearchForFirstUnit(withTag='globalTag1', relation='enemy')==null"));
        m5443b(m3761a3, m5442b("globalSearchForFirstUnit(withTag='globalTagNo')==null"));
        m5445a("globalSearchForFirstUnit(withTag='globalTag1', relation='XYZ')", true);
    }

    /* renamed from: a */
    public void m5446a(String str) {
        m5445a(str, false);
    }

    /* renamed from: a */
    public void m5445a(String str, boolean z) {
        try {
            LogicBooleanLoader.parseBooleanBlock(C0458l.f2933b, str, false);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.m1116d("assertCreateError: " + str + " error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void m5451a(C0458l c0458l, String str) {
        c0458l.f3237r.defineVariables(c0458l, str);
    }

    /* renamed from: a */
    public void m5452a(AbstractC0244am abstractC0244am, String str) {
        try {
            C0456j c0456j = (C0456j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0456j.f2891x, "testsection", "testkey").writeToUnit(c0456j);
        } catch (C0417bo e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void m5444b(AbstractC0244am abstractC0244am, String str) {
        try {
            C0456j c0456j = (C0456j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0456j.f2891x, "testsection", "testkey").writeToUnit(c0456j);
            throw new RuntimeException("assertSetMemoryError got no error for: " + str);
        } catch (C0417bo e) {
        } catch (RuntimeException e2) {
        }
    }

    /* renamed from: b */
    public LogicBoolean m5442b(String str) {
        return m5441b(str, false);
    }

    /* renamed from: b */
    public LogicBoolean m5441b(String str, boolean z) {
        try {
            return LogicBooleanLoader.parseBooleanBlock(C0458l.f2933b, str, z);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m5450a(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        logicBoolean.read(abstractC0629y);
    }

    /* renamed from: b */
    public void m5443b(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        if (!logicBoolean.read(abstractC0629y)) {
            throw new RuntimeException("Asset assertBooleanTrue failed, got false for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0629y));
        }
    }

    /* renamed from: c */
    public void m5440c(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanFalse type ==" + logicBoolean.getReturnType());
        }
        C0085n.m5414b(logicBoolean.read(abstractC0629y));
    }

    /* renamed from: a */
    public void m5449a(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean, float f) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Asset assertBooleanNumber type ==" + logicBoolean.getReturnType());
        }
        float readNumber = logicBoolean.readNumber(abstractC0629y);
        if (C0773f.m2286c(readNumber - f) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + readNumber + "!=" + f + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0629y));
        }
    }

    /* renamed from: d */
    public String m5439d(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        return logicBoolean.readString(abstractC0629y);
    }

    /* renamed from: a */
    public void m5447a(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean, String str) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        C0085n.m5417a(logicBoolean.readString(abstractC0629y), str);
    }

    /* renamed from: a */
    public void m5448a(AbstractC0629y abstractC0629y, LogicBoolean logicBoolean, AbstractC0244am abstractC0244am) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
            throw new RuntimeException("Asset assertBooleanUnit type ==" + logicBoolean.getReturnType());
        }
        AbstractC0244am readUnit = logicBoolean.readUnit(abstractC0629y);
        if (readUnit != abstractC0244am) {
            GameEngine.m5924e("class: " + logicBoolean.getClass().getName());
            throw new RuntimeException("assertBooleanUnit failed:" + AbstractC0244am.m4693A(readUnit) + "!=" + AbstractC0244am.m4693A(abstractC0244am) + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0629y));
        }
    }
}