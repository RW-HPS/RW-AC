package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.units.custom.be;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar.class */
public enum ar implements as {
    extractor { // from class: com.corrodinggames.rts.game.units.ar.1
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.g(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.g.K();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 1200;
            }
            if (i == 3) {
                return 2500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean p() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int a(am amVar) {
            if (amVar.cJ()) {
                return 110;
            }
            return 0;
        }
    },
    landFactory { // from class: com.corrodinggames.rts.game.units.ar.12
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.m(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.m.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.d.m.a(arrayList, i);
        }
    },
    airFactory { // from class: com.corrodinggames.rts.game.units.ar.23
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.a.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 1500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.d.a.a(arrayList, i);
        }
    },
    seaFactory { // from class: com.corrodinggames.rts.game.units.ar.34
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.t(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.t.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.d.t.a(arrayList, i);
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int a(am amVar) {
            return 110;
        }
    },
    commandCenter { // from class: com.corrodinggames.rts.game.units.ar.45
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.e(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.e.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 3000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.d.e.a(arrayList, i);
        }
    },
    turret { // from class: com.corrodinggames.rts.game.units.ar.50
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.a.b(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.a.b.dB();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    antiAirTurret { // from class: com.corrodinggames.rts.game.units.ar.51
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.a.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.a.a.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 8.0E-4f;
        }
    },
    builder { // from class: com.corrodinggames.rts.game.units.ar.52
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.b(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.b.K();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean m() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean n() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.e.b.a(arrayList, i);
            h.a((ArrayList) null, i);
        }
    },
    tank { // from class: com.corrodinggames.rts.game.units.ar.53
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.n(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.n.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 350;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.002f;
        }
    },
    hoverTank { // from class: com.corrodinggames.rts.game.units.ar.2
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.g(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.g.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 450;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.002f;
        }
    },
    artillery { // from class: com.corrodinggames.rts.game.units.ar.3
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.a.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0014f;
        }
    },
    helicopter { // from class: com.corrodinggames.rts.game.units.ar.4
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.b.f(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.b.f.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 650;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0012f;
        }
    },
    airShip { // from class: com.corrodinggames.rts.game.units.ar.5
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.b.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.b.a.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.002f;
        }
    },
    gunShip { // from class: com.corrodinggames.rts.game.units.ar.6
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.b.e(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.b.e.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    missileShip { // from class: com.corrodinggames.rts.game.units.ar.7
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.h.d(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.h.d.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    gunBoat { // from class: com.corrodinggames.rts.game.units.ar.8
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.h.c(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.h.c.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 300;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.005f;
        }
    },
    megaTank { // from class: com.corrodinggames.rts.game.units.ar.9
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.m(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.m.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0015f;
        }
    },
    laserTank { // from class: com.corrodinggames.rts.game.units.ar.10
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.k(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.k.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1300;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0013f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    hovercraft { // from class: com.corrodinggames.rts.game.units.ar.11
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.i(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.i.L();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.003f;
        }
    },
    ladybug { // from class: com.corrodinggames.rts.game.units.ar.13
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.c.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.c.a.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 400;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.004f;
        }
    },
    battleShip { // from class: com.corrodinggames.rts.game.units.ar.14
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.h.a(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.h.a.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    tankDestroyer { // from class: com.corrodinggames.rts.game.units.ar.15
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.o(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.o.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.003f;
        }
    },
    heavyTank { // from class: com.corrodinggames.rts.game.units.ar.16
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.f(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.f.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0011f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    heavyHoverTank { // from class: com.corrodinggames.rts.game.units.ar.17
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.e(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.e.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    laserDefence { // from class: com.corrodinggames.rts.game.units.ar.18
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.p(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.p.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    dropship { // from class: com.corrodinggames.rts.game.units.ar.19
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.b.d(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.b.d.L();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    tree { // from class: com.corrodinggames.rts.game.units.ar.20
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new al(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            al.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.0025f;
        }
    },
    repairbay { // from class: com.corrodinggames.rts.game.units.ar.21
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.r(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.r.M();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    NukeLaucher { // from class: com.corrodinggames.rts.game.units.ar.22
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.q(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.q.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 45000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 1.0E-4f;
        }
    },
    AntiNukeLaucher { // from class: com.corrodinggames.rts.game.units.ar.24
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.c(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.c.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 15000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 7.0E-4f;
        }
    },
    mammothTank { // from class: com.corrodinggames.rts.game.units.ar.25
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.l(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.l.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 3900;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 9.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 3;
        }
    },
    experimentalTank { // from class: com.corrodinggames.rts.game.units.ar.26
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.d(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.d.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 14000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 3;
        }
    },
    experimentalLandFactory { // from class: com.corrodinggames.rts.game.units.ar.27
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.f(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.f.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 3.5E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.d.f.a(arrayList, i);
        }
    },
    crystalResource { // from class: com.corrodinggames.rts.game.units.ar.28
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new e(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            e.a_();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 5000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    wall_v { // from class: com.corrodinggames.rts.game.units.ar.29
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.w(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.w.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 100;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.003f;
        }
    },
    fabricator { // from class: com.corrodinggames.rts.game.units.ar.30
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.h(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.h.K();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public int c(int i) {
            if (i == 2) {
                return 3000;
            }
            if (i == 3) {
                return 5000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    attackSubmarine { // from class: com.corrodinggames.rts.game.units.ar.31
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.h.e(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.h.e.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    builderShip { // from class: com.corrodinggames.rts.game.units.ar.32
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.h.b(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.h.b.t_();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
            com.corrodinggames.rts.game.units.h.b.a(arrayList, i);
        }
    },
    amphibiousJet { // from class: com.corrodinggames.rts.game.units.ar.33
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.b.c(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.b.c.L();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 2000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 2;
        }
    },
    supplyDepot { // from class: com.corrodinggames.rts.game.units.ar.35
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.d.v(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.d.v.K();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.001f;
        }
    },
    experimentalHoverTank { // from class: com.corrodinggames.rts.game.units.ar.36
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new com.corrodinggames.rts.game.units.e.c(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            com.corrodinggames.rts.game.units.e.c.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 21000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int g() {
            return 3;
        }
    },
    turret_artillery { // from class: com.corrodinggames.rts.game.units.ar.37
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            com.corrodinggames.rts.game.units.d.a.b bVar = new com.corrodinggames.rts.game.units.d.a.b(z);
            bVar.a_("artillery");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return ar.turret.c() + com.corrodinggames.rts.game.units.d.a.b.dN.c();
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    turret_flamethrower { // from class: com.corrodinggames.rts.game.units.ar.38
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            com.corrodinggames.rts.game.units.d.a.b bVar = new com.corrodinggames.rts.game.units.d.a.b(z);
            bVar.a_("flamethrower");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return ar.turret.c() + com.corrodinggames.rts.game.units.d.a.b.dO.c();
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    fogRevealer { // from class: com.corrodinggames.rts.game.units.ar.39
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new u(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            u.f();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    spreadingFire { // from class: com.corrodinggames.rts.game.units.ar.40
        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new ai(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            ai.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    antiAirTurretT2 { // from class: com.corrodinggames.rts.game.units.ar.41
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            com.corrodinggames.rts.game.units.d.a.a aVar = new com.corrodinggames.rts.game.units.d.a.a(z);
            aVar.a(2);
            return aVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return ar.turret.c() + com.corrodinggames.rts.game.units.d.a.a.e.c();
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    turretT2 { // from class: com.corrodinggames.rts.game.units.ar.42
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            com.corrodinggames.rts.game.units.d.a.b bVar = new com.corrodinggames.rts.game.units.d.a.b(z);
            bVar.a_("gunT2");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return ar.turret.c() + com.corrodinggames.rts.game.units.d.a.b.dL.c();
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    turretT3 { // from class: com.corrodinggames.rts.game.units.ar.43
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            com.corrodinggames.rts.game.units.d.a.b bVar = new com.corrodinggames.rts.game.units.d.a.b(z);
            bVar.a_("gunT3");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return ar.turret.c() + com.corrodinggames.rts.game.units.d.a.b.dL.c() + com.corrodinggames.rts.game.units.d.a.b.dM.c();
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 3.0E-4f;
        }
    },
    damagingBorder { // from class: com.corrodinggames.rts.game.units.ar.44
        @Override // com.corrodinggames.rts.game.units.ar
        public boolean A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new f(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            f.d_();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    zoneMarker { // from class: com.corrodinggames.rts.game.units.ar.46
        @Override // com.corrodinggames.rts.game.units.ar
        public boolean A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            f fVar = new f(z);
            fVar.q = true;
            return fVar;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            f.d_();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 6.0E-4f;
        }
    },
    editorOrBuilder { // from class: com.corrodinggames.rts.game.units.ar.47
        @Override // com.corrodinggames.rts.game.units.ar
        public boolean A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new h(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            h.K();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public boolean n() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void a(ArrayList arrayList, int i) {
        }
    },
    dummyNonUnitWithTeam { // from class: com.corrodinggames.rts.game.units.ar.48
        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public String e() {
            return i();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public String i() {
            return "marker";
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public boolean A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public boolean C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public am a(boolean z) {
            return new t(z);
        }

        @Override // com.corrodinggames.rts.game.units.ar
        public void b() {
            t.b();
        }

        @Override // com.corrodinggames.rts.game.units.ar, com.corrodinggames.rts.game.units.as
        public int c() {
            return 9999;
        }

        @Override // com.corrodinggames.rts.game.units.as
        public float D() {
            return 1.0f;
        }
    };
    
    com.corrodinggames.rts.game.units.a.z aa;
    int ab;
    String ac;
    String ad;
    public static ArrayList ae;
    at[] af;
    public static boolean ag;
    com.corrodinggames.rts.game.units.custom.d.b ah;

    public abstract am a(boolean z);

    public abstract void b();

    @Override // com.corrodinggames.rts.game.units.as
    public abstract int c();

    ar() {
        this.aa = new com.corrodinggames.rts.game.units.a.z(this);
        this.ab = -1;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public am a() {
        return a(false);
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.a.z d() {
        return this.aa;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String e() {
        if (this.ab != com.corrodinggames.rts.gameFramework.translations.a.c || this.ac == null) {
            this.ab = com.corrodinggames.rts.gameFramework.translations.a.c;
            String str = "units." + name() + ".name";
            this.ac = com.corrodinggames.rts.gameFramework.translations.a.a(str, null, new Object[0]);
            if (this.ac == null) {
                if (GameEngine.getGameEngine().as() && !A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.ac = name();
            }
        }
        return this.ac;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String f() {
        if (this.ab != com.corrodinggames.rts.gameFramework.translations.a.c || this.ad == null) {
            this.ab = com.corrodinggames.rts.gameFramework.translations.a.c;
            String str = "units." + name() + ".description";
            this.ad = com.corrodinggames.rts.gameFramework.translations.a.a(str, null, new Object[0]);
            if (this.ad == null) {
                if (GameEngine.getGameEngine().as() && !A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.ad = VariableScope.nullOrMissingString;
            }
        }
        return this.ad;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int g() {
        return 1;
    }

    public void a(ArrayList arrayList, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.as
    public void h() {
        at[] atVarArr = new at[3];
        for (int i = 1; i <= 3; i++) {
            at atVar = new at();
            a(atVar.a, i);
            atVarArr[i - 1] = atVar;
        }
        this.af = atVarArr;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public ArrayList a(int i) {
        if (i > 3) {
            throw new RuntimeException("Tech level:" + i + " greater than maxTechLevel");
        }
        return this.af[i - 1].a;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String i() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean j() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean k() {
        return j();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean m() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean n() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public ao o() {
        am a = am.a(this);
        if (a == null) {
            throw new RuntimeException("Shared unit is null for:" + name());
        }
        return a.h();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean p() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public be q() {
        return null;
    }

    public static as a(String str) {
        return a(str, true);
    }

    public static as a(String str, boolean z) {
        ar[] values;
        as m;
        if (z && (m = com.corrodinggames.rts.game.units.custom.l.m(str)) != null) {
            return m;
        }
        for (ar arVar : values()) {
            if (arVar.name().equalsIgnoreCase(str)) {
                return arVar;
            }
        }
        com.corrodinggames.rts.game.units.custom.l n = com.corrodinggames.rts.game.units.custom.l.n(str);
        if (n != null) {
            return n;
        }
        return null;
    }

    private static String a(String str, float f) {
        return a(str, f, VariableScope.nullOrMissingString);
    }

    private static String a(String str, float f, String str2) {
        String str3 = VariableScope.nullOrMissingString + f;
        if (f % 1.0f == 0.0f) {
            str3 = VariableScope.nullOrMissingString + ((int) f);
        }
        return a(str, str3, str2);
    }

    private static String a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    private static int a(y yVar) {
        com.corrodinggames.rts.game.units.a.s a;
        com.corrodinggames.rts.game.units.a.c cm = yVar.cm();
        if (cm != null && (a = yVar.a(cm)) != null) {
            return a.c();
        }
        return 0;
    }

    public static void r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            GameEngine.a("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = ae.iterator();
        while (it.hasNext()) {
            as asVar = (as) it.next();
            am a = am.a(asVar);
            if ((a instanceof y) && !asVar.i().startsWith("bug") && com.corrodinggames.rts.game.units.custom.l.c(asVar) == null && (!(asVar instanceof com.corrodinggames.rts.game.units.custom.l) || ((com.corrodinggames.rts.game.units.custom.l) asVar).aF)) {
                y yVar = (y) a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(asVar.i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + asVar.i().replace("/", "_").replace("\\", "_") + ".png";
                    GameEngine gameEngine = GameEngine.getGameEngine();
                    com.corrodinggames.rts.gameFramework.unitAction.e b = gameEngine.bO.b(100, 100, true);
                    com.corrodinggames.rts.gameFramework.unitAction.y mo10b = gameEngine.bO.mo10b(b);
                    com.corrodinggames.rts.gameFramework.unitAction.y yVar2 = gameEngine.bO;
                    gameEngine.bO = mo10b;
                    a(asVar, b.r, b.s, 0.0f, 0.0f, PlayerData.getPlayerData(0), 20.0f, 100, false, false, 1, true, null);
                    gameEngine.bO = yVar2;
                    mo10b.p();
                    gameEngine.bO.a(b, new File(str2));
                }
            }
        }
    }

    public static void s() {
        int a;
        int a2;
        for (int i = 0; i < 50; i++) {
            GameEngine.a("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = VariableScope.nullOrMissingString;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(ae);
        Collections.sort(arrayList, new Comparator() { // from class: com.corrodinggames.rts.game.units.ar.49
            @Override // java.util.Comparator
            /* renamed from: a */
            public int compare(as asVar, as asVar2) {
                return asVar.u().compareTo(asVar2.u());
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            as asVar = (as) it.next();
            am a3 = am.a(asVar);
            if ((a3 instanceof y) && !asVar.i().startsWith("bug") && com.corrodinggames.rts.game.units.custom.l.c(asVar) == null && (!(asVar instanceof com.corrodinggames.rts.game.units.custom.l) || ((com.corrodinggames.rts.game.units.custom.l) asVar).aF)) {
                if (asVar != editorOrBuilder) {
                    y yVar = (y) a3;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(asVar.i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + asVar.i() + "\" />\n") + "<h4>" + asVar.e() + "</h4>\n") + "<p>" + asVar.f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + a("Price", "$" + asVar.c(), VariableScope.nullOrMissingString);
                        if (a(yVar) > 0) {
                            str3 = str3 + a("T2 Upgrade Price", "$" + a, VariableScope.nullOrMissingString);
                            y yVar2 = (y) asVar.a();
                            yVar2.a(2);
                            if (yVar2.V() == 2 && (a2 = a(yVar2)) > 0) {
                                str3 = str3 + a("T3 Upgrade Price", "$" + a2, VariableScope.nullOrMissingString);
                            }
                        }
                        String str4 = (((str3 + a("Hp", yVar.cv)) + a("Speed", yVar.z())) + a("Turn speed", yVar.A())) + a("Mass", yVar.bN());
                        if (yVar.l()) {
                            str4 = (str4 + a("Shoot Delay", yVar.b(0))) + a("Attack Range", yVar.m());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int bl = yVar.bl();
                            for (int i2 = 0; i2 < bl; i2++) {
                                int i3 = Projectile.a.a;
                                yVar.a((am) yVar, i2);
                                if (i3 != Projectile.a.a) {
                                    Projectile projectile = (Projectile) Projectile.a.get(Projectile.a.a - 1);
                                    if (projectile.U > f) {
                                        f = projectile.U;
                                    }
                                    if (projectile.Y > f2) {
                                        f2 = projectile.Y;
                                    }
                                    f3 += projectile.U;
                                    f4 += projectile.Y;
                                }
                            }
                            if (f3 != 0.0f) {
                                String str5 = VariableScope.nullOrMissingString;
                                if (f3 != f) {
                                    str5 = " (total:" + f3 + ")";
                                }
                                str4 = str4 + a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = VariableScope.nullOrMissingString;
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        GameEngine.m5e(str);
    }

    public static void t() {
        ar[] values;
        for (ar arVar : values()) {
            arVar.name();
            arVar.e();
            arVar.f();
        }
    }

    public static boolean a(as asVar, float f, float f2, float f3, float f4, PlayerData playerData) {
        GameEngine.getGameEngine();
        am a = am.a(asVar);
        if (a == null) {
            GameEngine.m5e("isValidHere: Failed to get unit from type:" + asVar);
            return false;
        }
        a.b(playerData);
        a.eq = f4;
        a.eo = f;
        a.ep = f2;
        if (!a.bI()) {
            a.cg = f3;
            if (a instanceof y) {
                ((y) a).j(f3);
            }
        }
        boolean z = true;
        if (a instanceof y) {
            z = ((y) a).c(playerData);
        }
        a.eq = 0.0f;
        a.cg = 0.0f;
        return z;
    }

    public static void a(as asVar, float f, float f2, float f3, float f4, PlayerData playerData, float f5, float f6, boolean z, boolean z2, int i, am amVar) {
        a(asVar, f, f2, f3, f4, playerData, f5, f6, z, z2, i, true, amVar);
    }

    public static void a(as asVar, float f, float f2, float f3, float f4, PlayerData playerData, float f5, float f6, boolean z, boolean z2, int i, boolean z3, am amVar) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        am c = am.c(asVar);
        boolean bI = c.bI();
        c.b(playerData);
        if (c instanceof y) {
            ((y) c).a(i);
        }
        c.eq = f4;
        if (c.h() == ao.HOVER || c.h() == ao.OVER_CLIFF || c.h() == ao.OVER_CLIFF_WATER) {
            c.eq += 4.0f;
        }
        if (c.h() == ao.AIR) {
            c.eq += 10.0f;
        }
        if (!bI) {
            c.cg = f3;
            if (c instanceof y) {
                ((y) c).j(f3);
            }
        } else {
            c.cg = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = c.cp;
        c.cp = true;
        c.cs = false;
        c.ct = false;
        if (!z3) {
            c.ct = true;
        }
        c.co = false;
        c.cq = false;
        c.cr = false;
        if (z || z2) {
            c.cq = z2;
            c.cr = z;
            z4 = false;
        } else {
            c.co = true;
        }
        if (!z4) {
            c.eo = f;
            c.ep = f2;
        } else {
            c.eo = gameEngine.cw + f;
            c.ep = gameEngine.cx + f2;
        }
        float f7 = c.cj * 2.0f * 0.8f;
        if (c instanceof y) {
            y yVar = (y) c;
            if (yVar.M != null) {
                float cD = yVar.et * yVar.cD();
                if (cD > f7) {
                    f7 = cD;
                }
            }
        }
        float f8 = 1.0f;
        if (f7 < f5) {
            f8 = f5 / f7;
        }
        if (f7 > f6) {
            f8 = f6 / f7;
        }
        gameEngine.bO.k();
        if (z4) {
        }
        if (f8 != 1.0f) {
            gameEngine.bO.a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            ag = true;
        } else {
            ag = false;
        }
        if (amVar != null) {
            com.corrodinggames.rts.game.units.custom.e.f fVar = c.dH;
            c.dH = amVar.dH;
            int i2 = c.cE;
            c.cE = amVar.cE;
            float f9 = c.cu;
            c.cu = amVar.cu;
            float f10 = c.cB;
            c.cB = amVar.cB;
            VariableScope variableScope = c.bw;
            c.bw = amVar.bw;
            c.d(0.0f);
            c.c(0.0f);
            c.a(0.0f, false);
            c.dH = fVar;
            c.cE = i2;
            c.cu = f9;
            c.cB = f10;
            c.bw = variableScope;
        } else {
            c.d(0.0f);
            c.c(0.0f);
            c.a(0.0f, false);
        }
        gameEngine.bO.l();
        c.eq = 0.0f;
        if (!bI) {
            c.cg = 0.0f;
        } else {
            c.cg = -90.0f;
        }
        if (c instanceof y) {
            y yVar2 = (y) c;
            yVar2.j(0.0f);
            yVar2.a(1);
        }
        c.cq = false;
        c.cr = false;
        c.cp = z5;
        c.co = false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int b(int i) {
        int c = c();
        if (i >= 2) {
            c += c(2);
        }
        if (i >= 3) {
            c += c(2);
        }
        return c;
    }

    public int c(int i) {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b u() {
        int c = c();
        if (c == 0) {
            return com.corrodinggames.rts.game.units.custom.d.b.a;
        }
        if (this.ah == null || this.ah.a() != c) {
            this.ah = com.corrodinggames.rts.game.units.custom.d.b.a(c);
        }
        return this.ah;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b d(int i) {
        return com.corrodinggames.rts.game.units.custom.d.b.a(b(i));
    }

    @Override // com.corrodinggames.rts.game.units.as
    public String v() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean w() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.h x() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public boolean y() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.gameFramework.unitAction.e z() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public int a(am amVar) {
        return 0;
    }

    public boolean A() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.as
    public com.corrodinggames.rts.game.units.custom.d.b B() {
        return null;
    }
}