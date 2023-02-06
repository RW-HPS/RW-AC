package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.emitter.Emitter;
import java.util.ArrayList;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ay.class */
public class ay {
    public static final ay defaultEffectTemplate = new ay("default");
    public String name;
    private az builtInEffect;
    public com.corrodinggames.rts.gameFramework.emitter.g imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    z ifSpawnFailsEmitEffects;
    public float life;
    public float lifeRandom;
    public boolean showInFog;
    public float xOffsetRelative;
    public float yOffsetRelative;
    public float hOffset;
    public boolean alwayStartDirAtZero;
    public float pivotOffset;
    public float pivotOffsetRandom;
    public float dirOffset;
    public float xOffsetRelativeRandom;
    public float yOffsetRelativeRandom;
    public float hOffsetRandom;
    public float dirOffsetRandom;
    public float xOffsetAbsolute;
    public float yOffsetAbsolute;
    public float xOffsetAbsoluteRandom;
    public float yOffsetAbsoluteRandom;
    public float xSpeedRelative;
    public float ySpeedRelative;
    public float hSpeed;
    public float dirSpeed;
    public float xSpeedRelativeRandom;
    public float ySpeedRelativeRandom;
    public float hSpeedRandom;
    public float dirSpeedRandom;
    public float xSpeedAbsolute;
    public float ySpeedAbsolute;
    public float xSpeedAbsoluteRandom;
    public float ySpeedAbsoluteRandom;
    public com.corrodinggames.rts.gameFramework.emitter.h priority;
    public float scaleTo;
    public float scaleFrom;
    public float alpha;
    public int color;
    public LightingColorFilter cachedLightingColorFilter;
    public float teamColorRatio;
    public boolean shadow;
    public short drawLayer;
    public float fadeInTime;
    public boolean fadeOut;
    public float delayedStartTimer;
    public float delayedStartTimerRandom;
    public int frameIndex;
    public int frameIndexRandom;
    public int stripIndex;
    public boolean attachedToUnit;
    public boolean liveAfterAttachedDies;
    public boolean atmospheric;
    public boolean physics;
    public float physicsGravity;
    public int animateFrameStart;
    public int animateFrameEnd;
    public int animateFrameStartRandomAdd;
    public boolean animateFramePingPong;
    public boolean animateFrameLooping;
    public float animateFrameSpeed;
    public float animateFrameSpeedRandom;
    public z alsoEmitEffects;
    public z alsoEmitEffectsOnDeath;
    public z trailEffect;
    public float trailEffectRate;
    public bl alsoPlaySound;
    public static ArrayList fields;

    public ay(az azVar) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = com.corrodinggames.rts.gameFramework.emitter.h.high;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = azVar;
    }

    ay(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = com.corrodinggames.rts.gameFramework.emitter.h.high;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.name = str;
    }

    public com.corrodinggames.rts.gameFramework.emitter.e a(float f, float f2, float f3, float f4, com.corrodinggames.rts.gameFramework.w wVar, int i, short s) {
        com.corrodinggames.rts.game.units.am amVar;
        com.corrodinggames.rts.gameFramework.emitter.e eVar;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.spawnChance < 1.0f && com.corrodinggames.rts.gameFramework.f.c(0.0f, 1.0f) > this.spawnChance) {
            if (i < 5 && this.ifSpawnFailsEmitEffects != null) {
                this.ifSpawnFailsEmitEffects.a(f, f2, f3, f4, wVar, i + 1, s);
                return null;
            }
            return null;
        } else if (this.builtInEffect != null) {
            if (this.builtInEffect == az.small) {
                eVar = gameEngine.bR.a(f, f2, f3, f4);
            } else if (this.builtInEffect == az.medium) {
                eVar = gameEngine.bR.b(f, f2, f3, f4, 0);
                if (eVar != null) {
                    eVar.G = 0.75f;
                    eVar.F = 0.75f;
                }
            } else if (this.builtInEffect == az.large) {
                eVar = gameEngine.bR.b(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == az.smoke) {
                eVar = gameEngine.bR.c(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == az.shockwave) {
                eVar = gameEngine.bR.d(f, f2, f3, 0);
            } else if (this.builtInEffect == az.largeExplosion) {
                gameEngine.bR.a(f, f2, f3);
                eVar = null;
            } else if (this.builtInEffect == az.smallExplosion) {
                eVar = gameEngine.bR.b(f, f2, f3);
            } else if (this.builtInEffect == az.resourcePoolSmoke) {
                Emitter.a(f, f2).j = -6684775;
                Emitter b = Emitter.b(f, f2);
                b.a = 500.0f;
                b.j = -6684775;
                gameEngine.bR.b(com.corrodinggames.rts.gameFramework.emitter.h.critical);
                com.corrodinggames.rts.gameFramework.emitter.e c = gameEngine.bR.c(f, f2, f3, -1127220);
                if (c != null) {
                    c.G = 0.15f;
                    c.F = 1.0f;
                    c.ar = (short) 2;
                    c.V = 35.0f;
                    c.W = c.V;
                    c.U = 0.0f;
                    c.x = -13378253;
                }
                eVar = null;
            } else if (this.builtInEffect == az.noneExplosion) {
                return null;
            } else {
                throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }
            if (eVar == null) {
                return null;
            }
            eVar.ar = (short) 2;
            if (wVar != null) {
                com.corrodinggames.rts.gameFramework.emitter.c.a(eVar, wVar);
            }
            return eVar;
        } else if (!this.createWhenZoomedOut && !gameEngine.dc) {
            return null;
        } else {
            if (!this.createWhenOverLiquid && com.corrodinggames.rts.gameFramework.utility.y.d(f, f2)) {
                return null;
            }
            if (!this.createWhenOverLand && !com.corrodinggames.rts.gameFramework.utility.y.d(f, f2)) {
                return null;
            }
            if (this.createWhenOffscreen) {
                gameEngine.bR.b();
            } else {
                gameEngine.bR.a();
            }
            boolean z = this.showInFog;
            boolean z2 = false;
            if (!z && this.attachedToUnit) {
                z2 = true;
                z = true;
            }
            com.corrodinggames.rts.gameFramework.emitter.e b2 = gameEngine.bR.b(f, f2, f3, com.corrodinggames.rts.gameFramework.emitter.d.custom, z, this.priority);
            if (b2 == null) {
                return null;
            }
            b2.a = this;
            b2.A = (short) (s + 1);
            if (z2 && !this.showInFog) {
                b2.e = false;
            }
            b2.V = this.life;
            b2.V += a(this.lifeRandom);
            b2.W = b2.V;
            b2.aq = this.stripIndex;
            if (this.imageStrip != null) {
            }
            b2.ap = this.frameIndex;
            if (this.frameIndexRandom != 0) {
                b2.ap += com.corrodinggames.rts.gameFramework.f.rand(-this.frameIndexRandom, this.frameIndexRandom);
                if (b2.ap < 0) {
                    b2.ap = 0;
                }
            }
            float a = f4 + this.pivotOffset + a(this.pivotOffsetRandom);
            if (this.alwayStartDirAtZero) {
                b2.Y = 0.0f;
            } else {
                b2.Y = a;
            }
            b2.Y += this.dirOffset;
            b2.Y += a(this.dirOffsetRandom);
            if (this.xOffsetAbsoluteRandom != 0.0f || this.yOffsetAbsoluteRandom != 0.0f || this.xOffsetAbsolute != 0.0f || this.yOffsetAbsolute != 0.0f) {
                float a2 = this.xOffsetAbsolute + a(this.xOffsetAbsoluteRandom);
                float a3 = this.yOffsetAbsolute + a(this.yOffsetAbsoluteRandom);
                b2.I += a2;
                b2.J += a3;
            }
            if (this.xOffsetRelativeRandom != 0.0f || this.yOffsetRelativeRandom != 0.0f || this.xOffsetRelative != 0.0f || this.yOffsetRelative != 0.0f) {
                float k = com.corrodinggames.rts.gameFramework.f.k(a);
                float j = com.corrodinggames.rts.gameFramework.f.j(a);
                float a4 = this.xOffsetRelative + a(this.xOffsetRelativeRandom);
                float a5 = this.yOffsetRelative + a(this.yOffsetRelativeRandom);
                b2.I += (k * a5) - (j * a4);
                b2.J += (j * a5) + (k * a4);
            }
            b2.K += this.hOffset + a(-this.hOffsetRandom, this.hOffsetRandom);
            b2.an = true;
            b2.r = true;
            b2.ar = this.drawLayer;
            b2.G = this.scaleFrom;
            b2.F = this.scaleTo;
            b2.E = this.alpha;
            b2.x = this.color;
            b2.B = this.cachedLightingColorFilter;
            if (this.teamColorRatio != 0.0f && wVar != null) {
                PlayerData playerData = null;
                if (wVar instanceof com.corrodinggames.rts.game.units.am) {
                    playerData = ((com.corrodinggames.rts.game.units.am) wVar).bX;
                }
                if ((wVar instanceof Projectile) && (amVar = ((Projectile) wVar).j) != null) {
                    playerData = amVar.bX;
                }
                if (playerData != null) {
                    float f5 = 1.0f - this.teamColorRatio;
                    int a6 = Color.a(b2.x);
                    int b3 = (int) (Color.b(b2.x) * f5);
                    int c2 = (int) (Color.c(b2.x) * f5);
                    int d = (int) (Color.d(b2.x) * f5);
                    int K = playerData.K();
                    b2.x = Color.a(a6, com.corrodinggames.rts.gameFramework.f.b((int) (b3 + (Color.b(K) * this.teamColorRatio)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (c2 + (Color.c(K) * this.teamColorRatio)), 0, 255), com.corrodinggames.rts.gameFramework.f.b((int) (d + (Color.d(K) * this.teamColorRatio)), 0, 255));
                    if (GameEngine.at()) {
                        b2.B = new LightingColorFilter(b2.x, 0);
                    }
                }
            }
            if (this.fadeInTime != 0.0f) {
                b2.s = true;
                b2.t = this.fadeInTime;
            }
            b2.as = this.shadow;
            b2.r = this.fadeOut;
            b2.U = this.delayedStartTimer;
            b2.U += a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            b2.u = this.atmospheric;
            b2.v = this.physics;
            b2.w = this.physicsGravity;
            b2.q = this.priority;
            b2.P = this.xSpeedAbsolute + a(this.xSpeedAbsoluteRandom);
            b2.Q = this.ySpeedAbsolute + a(this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0f || this.ySpeedRelative != 0.0f || this.xSpeedRelativeRandom != 0.0f || this.ySpeedRelativeRandom != 0.0f) {
                float k2 = com.corrodinggames.rts.gameFramework.f.k(a);
                float j2 = com.corrodinggames.rts.gameFramework.f.j(a);
                float a7 = this.xSpeedRelative + a(this.xSpeedRelativeRandom);
                float a8 = this.ySpeedRelative + a(this.ySpeedRelativeRandom);
                b2.P += (k2 * a8) - (j2 * a7);
                b2.Q += (j2 * a8) + (k2 * a7);
            }
            b2.R = this.hSpeed + a(this.hSpeedRandom);
            b2.Z = this.dirSpeed + a(this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
                b2.ae = true;
            }
            b2.af = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
                b2.af += com.corrodinggames.rts.gameFramework.f.rand(0, this.animateFrameStartRandomAdd);
            }
            b2.ag = this.animateFrameEnd;
            b2.ak = this.animateFrameStart;
            b2.ah = this.animateFramePingPong;
            b2.ai = this.animateFrameLooping;
            b2.aj = this.animateFrameSpeed;
            b2.aj += a(this.animateFrameSpeedRandom);
            if (wVar != null && this.attachedToUnit) {
                com.corrodinggames.rts.gameFramework.emitter.c.a(b2, wVar);
            }
            if (this.alsoPlaySound != null) {
                this.alsoPlaySound.a(f, f2, 1.0f);
            }
            if (i < 5 && this.alsoEmitEffects != null) {
                this.alsoEmitEffects.a(f, f2, f3, a, wVar, i + 1, (short) 0);
            }
            return b2;
        }
    }

    public final float a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return com.corrodinggames.rts.gameFramework.f.c(-f, f);
    }

    public final float a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return com.corrodinggames.rts.gameFramework.f.c(f, f2);
    }

    public void a(l lVar, com.corrodinggames.rts.gameFramework.utility.ab abVar, String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.createWhenOffscreen = abVar.a(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = abVar.a(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = abVar.a(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = abVar.a(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
            throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
        }
        this.spawnChance = abVar.a(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
        this.life = abVar.a(str, "life", Float.valueOf(200.0f)).floatValue();
        this.lifeRandom = abVar.a(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
        this.showInFog = abVar.a(str, "showInFog", (Boolean) false).booleanValue();
        this.xOffsetRelative = abVar.a(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelative = abVar.a(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.hOffset = abVar.a(str, "hOffset", Float.valueOf(0.0f)).floatValue();
        this.alwayStartDirAtZero = abVar.a(str, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
        this.pivotOffset = abVar.a(str, "pivotOffset", Float.valueOf(0.0f)).floatValue();
        this.pivotOffsetRandom = abVar.a(str, "pivotOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffset = abVar.a(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
        this.xOffsetRelativeRandom = abVar.a(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelativeRandom = abVar.a(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hOffsetRandom = abVar.a(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffsetRandom = abVar.a(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsolute = abVar.a(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsolute = abVar.a(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsoluteRandom = abVar.a(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsoluteRandom = abVar.a(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelative = abVar.a(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelative = abVar.a(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.hSpeed = abVar.a(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
        this.dirSpeed = abVar.a(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelativeRandom = abVar.a(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelativeRandom = abVar.a(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hSpeedRandom = abVar.a(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.dirSpeedRandom = abVar.a(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsolute = abVar.a(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsolute = abVar.a(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsoluteRandom = abVar.a(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsoluteRandom = abVar.a(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.scaleTo = abVar.a(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
        this.scaleFrom = abVar.a(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
        this.alpha = abVar.a(str, "alpha", Float.valueOf(this.alpha)).floatValue();
        this.color = abVar.a(str, "color", Integer.valueOf(this.color)).intValue();
        if (GameEngine.at() && this.color != 0 && this.color != -1) {
            this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
        }
        this.teamColorRatio = abVar.a(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
        if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
            throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
        }
        this.shadow = abVar.a(str, "shadow", (Boolean) false).booleanValue();
        this.drawLayer = (short) 2;
        if (abVar.a(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
            this.drawLayer = (short) 1;
        }
        String b = abVar.b(str, "drawType", (String) null);
        if (b != null && !b.equals("normal")) {
            if (b.equals("displacement")) {
                this.drawLayer = (short) 3;
            } else {
                throw new bo("Unknown drawType: " + b);
            }
        }
        this.fadeInTime = abVar.a(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
        this.fadeOut = abVar.a(str, "fadeOut", (Boolean) true).booleanValue();
        this.delayedStartTimer = abVar.b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        this.delayedStartTimerRandom = abVar.a(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
        this.frameIndex = abVar.b(str, "frameIndex", (Integer) 0).intValue();
        this.frameIndexRandom = abVar.b(str, "frameIndexRandom", (Integer) 0).intValue();
        String b2 = abVar.b(str, "stripIndex", "0");
        this.stripIndex = gameEngine.bR.a(b2);
        if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + b2);
        }
        this.attachedToUnit = abVar.a(str, "attachedToUnit", (Boolean) true).booleanValue();
        this.liveAfterAttachedDies = abVar.a(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
        this.atmospheric = abVar.a(str, "atmospheric", (Boolean) false).booleanValue();
        this.physics = abVar.a(str, "physics", (Boolean) false).booleanValue();
        this.physicsGravity = abVar.a(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
        String b3 = abVar.b(str, "priority", (String) null);
        if (b3 != null) {
            try {
                this.priority = com.corrodinggames.rts.gameFramework.emitter.h.valueOf(b3);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Unknown priority:" + b3);
            }
        }
        int intValue = abVar.b(str, "total_frames", (Integer) 1).intValue();
        if (intValue < 1) {
            throw new bo("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
        }
        com.corrodinggames.rts.gameFramework.unitAction.e a = lVar.a(abVar, str, "image");
        if (a != null) {
            this.imageStrip = new com.corrodinggames.rts.gameFramework.emitter.g();
            this.imageStrip.i = a;
            this.imageStrip.b = this.imageStrip.i.m() / intValue;
            this.imageStrip.c = this.imageStrip.i.l();
            this.imageStrip.b = abVar.b(str, "frame_width", Integer.valueOf(this.imageStrip.b)).intValue();
            this.imageStrip.c = abVar.b(str, "frame_height", Integer.valueOf(this.imageStrip.c)).intValue();
            if (intValue == 1 && this.imageStrip.b >= this.imageStrip.i.m()) {
                this.imageStrip.k = true;
            } else if (this.imageStrip.c < this.imageStrip.i.l()) {
                this.imageStrip.h = this.imageStrip.i.m() / this.imageStrip.b;
                if (this.imageStrip.h < 1) {
                    this.imageStrip.h = 1;
                }
            }
            this.imageStrip.d = 0;
            this.imageStrip.e = 0;
            this.imageStrip.f = this.imageStrip.b;
            this.imageStrip.g = this.imageStrip.c;
            String b4 = abVar.b(str, "imageShadow", (String) null);
            if (b4 != null) {
                this.imageStrip.j = ag.a(lVar.F, b4, lVar.ab, lVar, str, "imageShadow");
                this.shadow = true;
            }
            if (this.shadow && this.imageStrip.j == null) {
                throw new bo("imageShadow is required if image and shadow:true is used");
            }
        }
        this.animateFrameStart = abVar.b(str, "animateFrameStart", (Integer) 0).intValue();
        this.animateFrameStartRandomAdd = abVar.b(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
        this.animateFrameEnd = abVar.b(str, "animateFrameEnd", (Integer) 0).intValue();
        this.animateFramePingPong = abVar.a(str, "animateFramePingPong", (Boolean) false).booleanValue();
        this.animateFrameLooping = abVar.a(str, "animateFrameLooping", (Boolean) false).booleanValue();
        this.animateFrameSpeed = abVar.b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
        this.animateFrameSpeedRandom = abVar.b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
        if (a != null && ((this.imageStrip.b >= this.imageStrip.i.m() || intValue != 1) && this.animateFrameEnd > intValue)) {
            throw new bo("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        this.alsoEmitEffects = lVar.c(abVar.b(str, "alsoEmitEffects", (String) null));
        this.alsoEmitEffectsOnDeath = lVar.c(abVar.b(str, "alsoEmitEffectsOnDeath", (String) null));
        this.trailEffect = lVar.c(abVar.b(str, "trailEffect", (String) null));
        this.trailEffectRate = abVar.b(str, "trailEffectRate", Float.valueOf(6.0f)).floatValue();
        this.ifSpawnFailsEmitEffects = lVar.c(abVar.b(str, "ifSpawnFailsEmitEffects", (String) null));
        this.alsoPlaySound = bl.a(lVar, abVar.b(str, "alsoPlaySound", (String) null), (bl) null);
    }
}