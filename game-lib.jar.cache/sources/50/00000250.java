package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.gameFramework.AbstractC1155w;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0758c;
import com.corrodinggames.rts.gameFramework.p035d.C0760e;
import com.corrodinggames.rts.gameFramework.p035d.C0761f;
import com.corrodinggames.rts.gameFramework.p035d.C0762g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0759d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0763h;
import com.corrodinggames.rts.gameFramework.unitAction.C0970e;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1152y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ay.class */
public class C0386ay {
    public static final C0386ay defaultEffectTemplate = new C0386ay("default");
    public String name;
    private EnumC0387az builtInEffect;
    public C0762g imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    C0473z ifSpawnFailsEmitEffects;
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
    public EnumC0763h priority;
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
    public C0473z alsoEmitEffects;
    public C0473z alsoEmitEffectsOnDeath;
    public C0473z trailEffect;
    public float trailEffectRate;
    public C0414bl alsoPlaySound;
    public static ArrayList fields;

    public C0386ay(EnumC0387az enumC0387az) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0763h.high;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = enumC0387az;
    }

    C0386ay(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0763h.high;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.name = str;
    }

    /* renamed from: a */
    public C0760e m3956a(float f, float f2, float f3, float f4, AbstractC1155w abstractC1155w, int i, short s) {
        AbstractC0244am abstractC0244am;
        C0760e c0760e;
        GameEngine gameEngine = GameEngine.getGameEngine();
        if (this.spawnChance < 1.0f && C0773f.m2151c(0.0f, 1.0f) > this.spawnChance) {
            if (i < 5 && this.ifSpawnFailsEmitEffects != null) {
                this.ifSpawnFailsEmitEffects.m3464a(f, f2, f3, f4, abstractC1155w, i + 1, s);
                return null;
            }
            return null;
        } else if (this.builtInEffect != null) {
            if (this.builtInEffect == EnumC0387az.small) {
                c0760e = gameEngine.f6329bR.m2390a(f, f2, f3, f4);
            } else if (this.builtInEffect == EnumC0387az.medium) {
                c0760e = gameEngine.f6329bR.m2367b(f, f2, f3, f4, 0);
                if (c0760e != null) {
                    c0760e.f4816G = 0.75f;
                    c0760e.f4815F = 0.75f;
                }
            } else if (this.builtInEffect == EnumC0387az.large) {
                c0760e = gameEngine.f6329bR.m2367b(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0387az.smoke) {
                c0760e = gameEngine.f6329bR.m2362c(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0387az.shockwave) {
                c0760e = gameEngine.f6329bR.m2359d(f, f2, f3, 0);
            } else if (this.builtInEffect == EnumC0387az.largeExplosion) {
                gameEngine.f6329bR.m2391a(f, f2, f3);
                c0760e = null;
            } else if (this.builtInEffect == EnumC0387az.smallExplosion) {
                c0760e = gameEngine.f6329bR.m2370b(f, f2, f3);
            } else if (this.builtInEffect == EnumC0387az.resourcePoolSmoke) {
                C0761f.m2348a(f, f2).f4896j = -6684775;
                C0761f m2344b = C0761f.m2344b(f, f2);
                m2344b.f4876a = 500.0f;
                m2344b.f4896j = -6684775;
                gameEngine.f6329bR.m2364b(EnumC0763h.critical);
                C0760e m2361c = gameEngine.f6329bR.m2361c(f, f2, f3, -1127220);
                if (m2361c != null) {
                    m2361c.f4816G = 0.15f;
                    m2361c.f4815F = 1.0f;
                    m2361c.f4873ar = (short) 2;
                    m2361c.f4831V = 35.0f;
                    m2361c.f4832W = m2361c.f4831V;
                    m2361c.f4830U = 0.0f;
                    m2361c.f4811x = -13378253;
                }
                c0760e = null;
            } else if (this.builtInEffect == EnumC0387az.noneExplosion) {
                return null;
            } else {
                throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }
            if (c0760e == null) {
                return null;
            }
            c0760e.f4873ar = (short) 2;
            if (abstractC1155w != null) {
                C0758c.m2379a(c0760e, abstractC1155w);
            }
            return c0760e;
        } else if (!this.createWhenZoomedOut && !gameEngine.f6472dc) {
            return null;
        } else {
            if (!this.createWhenOverLiquid && C1152y.m450d(f, f2)) {
                return null;
            }
            if (!this.createWhenOverLand && !C1152y.m450d(f, f2)) {
                return null;
            }
            if (this.createWhenOffscreen) {
                gameEngine.f6329bR.m2372b();
            } else {
                gameEngine.f6329bR.m2394a();
            }
            boolean z = this.showInFog;
            boolean z2 = false;
            if (!z && this.attachedToUnit) {
                z2 = true;
                z = true;
            }
            C0760e m2365b = gameEngine.f6329bR.m2365b(f, f2, f3, EnumC0759d.custom, z, this.priority);
            if (m2365b == null) {
                return null;
            }
            m2365b.f4863a = this;
            m2365b.f4813A = (short) (s + 1);
            if (z2 && !this.showInFog) {
                m2365b.f4864e = false;
            }
            m2365b.f4831V = this.life;
            m2365b.f4831V += m3958a(this.lifeRandom);
            m2365b.f4832W = m2365b.f4831V;
            m2365b.f4849aq = this.stripIndex;
            if (this.imageStrip != null) {
            }
            m2365b.f4848ap = this.frameIndex;
            if (this.frameIndexRandom != 0) {
                m2365b.f4848ap += C0773f.rand(-this.frameIndexRandom, this.frameIndexRandom);
                if (m2365b.f4848ap < 0) {
                    m2365b.f4848ap = 0;
                }
            }
            float m3958a = f4 + this.pivotOffset + m3958a(this.pivotOffsetRandom);
            if (this.alwayStartDirAtZero) {
                m2365b.f4833Y = 0.0f;
            } else {
                m2365b.f4833Y = m3958a;
            }
            m2365b.f4833Y += this.dirOffset;
            m2365b.f4833Y += m3958a(this.dirOffsetRandom);
            if (this.xOffsetAbsoluteRandom != 0.0f || this.yOffsetAbsoluteRandom != 0.0f || this.xOffsetAbsolute != 0.0f || this.yOffsetAbsolute != 0.0f) {
                float m3958a2 = this.xOffsetAbsolute + m3958a(this.xOffsetAbsoluteRandom);
                float m3958a3 = this.yOffsetAbsolute + m3958a(this.yOffsetAbsoluteRandom);
                m2365b.f4818I += m3958a2;
                m2365b.f4819J += m3958a3;
            }
            if (this.xOffsetRelativeRandom != 0.0f || this.yOffsetRelativeRandom != 0.0f || this.xOffsetRelative != 0.0f || this.yOffsetRelative != 0.0f) {
                float m2107k = C0773f.m2107k(m3958a);
                float m2110j = C0773f.m2110j(m3958a);
                float m3958a4 = this.xOffsetRelative + m3958a(this.xOffsetRelativeRandom);
                float m3958a5 = this.yOffsetRelative + m3958a(this.yOffsetRelativeRandom);
                m2365b.f4818I += (m2107k * m3958a5) - (m2110j * m3958a4);
                m2365b.f4819J += (m2110j * m3958a5) + (m2107k * m3958a4);
            }
            m2365b.f4820K += this.hOffset + m3957a(-this.hOffsetRandom, this.hOffsetRandom);
            m2365b.f4871an = true;
            m2365b.f4806r = true;
            m2365b.f4873ar = this.drawLayer;
            m2365b.f4816G = this.scaleFrom;
            m2365b.f4815F = this.scaleTo;
            m2365b.f4814E = this.alpha;
            m2365b.f4811x = this.color;
            m2365b.f4869B = this.cachedLightingColorFilter;
            if (this.teamColorRatio != 0.0f && abstractC1155w != null) {
                PlayerData playerData = null;
                if (abstractC1155w instanceof AbstractC0244am) {
                    playerData = ((AbstractC0244am) abstractC1155w).f1614bX;
                }
                if ((abstractC1155w instanceof C0188f) && (abstractC0244am = ((C0188f) abstractC1155w).f985j) != null) {
                    playerData = abstractC0244am.f1614bX;
                }
                if (playerData != null) {
                    float f5 = 1.0f - this.teamColorRatio;
                    int m5245a = Color.m5245a(m2365b.f4811x);
                    int m5241b = (int) (Color.m5241b(m2365b.f4811x) * f5);
                    int m5240c = (int) (Color.m5240c(m2365b.f4811x) * f5);
                    int m5239d = (int) (Color.m5239d(m2365b.f4811x) * f5);
                    int m4461K = playerData.m4461K();
                    m2365b.f4811x = Color.m5243a(m5245a, C0773f.m2166b((int) (m5241b + (Color.m5241b(m4461K) * this.teamColorRatio)), 0, 255), C0773f.m2166b((int) (m5240c + (Color.m5240c(m4461K) * this.teamColorRatio)), 0, 255), C0773f.m2166b((int) (m5239d + (Color.m5239d(m4461K) * this.teamColorRatio)), 0, 255));
                    if (GameEngine.m1030at()) {
                        m2365b.f4869B = new LightingColorFilter(m2365b.f4811x, 0);
                    }
                }
            }
            if (this.fadeInTime != 0.0f) {
                m2365b.f4807s = true;
                m2365b.f4808t = this.fadeInTime;
            }
            m2365b.f4874as = this.shadow;
            m2365b.f4806r = this.fadeOut;
            m2365b.f4830U = this.delayedStartTimer;
            m2365b.f4830U += m3957a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            m2365b.f4809u = this.atmospheric;
            m2365b.f4810v = this.physics;
            m2365b.f4867w = this.physicsGravity;
            m2365b.f4866q = this.priority;
            m2365b.f4825P = this.xSpeedAbsolute + m3958a(this.xSpeedAbsoluteRandom);
            m2365b.f4826Q = this.ySpeedAbsolute + m3958a(this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0f || this.ySpeedRelative != 0.0f || this.xSpeedRelativeRandom != 0.0f || this.ySpeedRelativeRandom != 0.0f) {
                float m2107k2 = C0773f.m2107k(m3958a);
                float m2110j2 = C0773f.m2110j(m3958a);
                float m3958a6 = this.xSpeedRelative + m3958a(this.xSpeedRelativeRandom);
                float m3958a7 = this.ySpeedRelative + m3958a(this.ySpeedRelativeRandom);
                m2365b.f4825P += (m2107k2 * m3958a7) - (m2110j2 * m3958a6);
                m2365b.f4826Q += (m2110j2 * m3958a7) + (m2107k2 * m3958a6);
            }
            m2365b.f4827R = this.hSpeed + m3958a(this.hSpeedRandom);
            m2365b.f4834Z = this.dirSpeed + m3958a(this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
                m2365b.f4839ae = true;
            }
            m2365b.f4840af = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
                m2365b.f4840af += C0773f.rand(0, this.animateFrameStartRandomAdd);
            }
            m2365b.f4841ag = this.animateFrameEnd;
            m2365b.f4845ak = this.animateFrameStart;
            m2365b.f4842ah = this.animateFramePingPong;
            m2365b.f4843ai = this.animateFrameLooping;
            m2365b.f4844aj = this.animateFrameSpeed;
            m2365b.f4844aj += m3958a(this.animateFrameSpeedRandom);
            if (abstractC1155w != null && this.attachedToUnit) {
                C0758c.m2379a(m2365b, abstractC1155w);
            }
            if (this.alsoPlaySound != null) {
                this.alsoPlaySound.m3887a(f, f2, 1.0f);
            }
            if (i < 5 && this.alsoEmitEffects != null) {
                this.alsoEmitEffects.m3464a(f, f2, f3, m3958a, abstractC1155w, i + 1, (short) 0);
            }
            return m2365b;
        }
    }

    /* renamed from: a */
    public final float m3958a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return C0773f.m2151c(-f, f);
    }

    /* renamed from: a */
    public final float m3957a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return C0773f.m2151c(f, f2);
    }

    /* renamed from: a */
    public void m3955a(C0458l c0458l, C1107ab c1107ab, String str) {
        GameEngine gameEngine = GameEngine.getGameEngine();
        this.createWhenOffscreen = c1107ab.m685a(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = c1107ab.m685a(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = c1107ab.m685a(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = c1107ab.m685a(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
            throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
        }
        this.spawnChance = c1107ab.m683a(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
        this.life = c1107ab.m683a(str, "life", Float.valueOf(200.0f)).floatValue();
        this.lifeRandom = c1107ab.m683a(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
        this.showInFog = c1107ab.m685a(str, "showInFog", (Boolean) false).booleanValue();
        this.xOffsetRelative = c1107ab.m683a(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelative = c1107ab.m683a(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.hOffset = c1107ab.m683a(str, "hOffset", Float.valueOf(0.0f)).floatValue();
        this.alwayStartDirAtZero = c1107ab.m678a(str, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
        this.pivotOffset = c1107ab.m683a(str, "pivotOffset", Float.valueOf(0.0f)).floatValue();
        this.pivotOffsetRandom = c1107ab.m683a(str, "pivotOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffset = c1107ab.m683a(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
        this.xOffsetRelativeRandom = c1107ab.m683a(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelativeRandom = c1107ab.m683a(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hOffsetRandom = c1107ab.m683a(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffsetRandom = c1107ab.m683a(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsolute = c1107ab.m683a(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsolute = c1107ab.m683a(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsoluteRandom = c1107ab.m683a(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsoluteRandom = c1107ab.m683a(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelative = c1107ab.m683a(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelative = c1107ab.m683a(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.hSpeed = c1107ab.m683a(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
        this.dirSpeed = c1107ab.m683a(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelativeRandom = c1107ab.m683a(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelativeRandom = c1107ab.m683a(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hSpeedRandom = c1107ab.m683a(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.dirSpeedRandom = c1107ab.m683a(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsolute = c1107ab.m683a(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsolute = c1107ab.m683a(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsoluteRandom = c1107ab.m683a(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsoluteRandom = c1107ab.m683a(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.scaleTo = c1107ab.m683a(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
        this.scaleFrom = c1107ab.m683a(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
        this.alpha = c1107ab.m683a(str, "alpha", Float.valueOf(this.alpha)).floatValue();
        this.color = c1107ab.m681a(str, "color", Integer.valueOf(this.color)).intValue();
        if (GameEngine.m1030at() && this.color != 0 && this.color != -1) {
            this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
        }
        this.teamColorRatio = c1107ab.m683a(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
        if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
            throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
        }
        this.shadow = c1107ab.m685a(str, "shadow", (Boolean) false).booleanValue();
        this.drawLayer = (short) 2;
        if (c1107ab.m685a(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
            this.drawLayer = (short) 1;
        }
        String m666b = c1107ab.m666b(str, "drawType", (String) null);
        if (m666b != null && !m666b.equals("normal")) {
            if (m666b.equals("displacement")) {
                this.drawLayer = (short) 3;
            } else {
                throw new C0417bo("Unknown drawType: " + m666b);
            }
        }
        this.fadeInTime = c1107ab.m683a(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
        this.fadeOut = c1107ab.m685a(str, "fadeOut", (Boolean) true).booleanValue();
        this.delayedStartTimer = c1107ab.m668b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        this.delayedStartTimerRandom = c1107ab.m683a(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
        this.frameIndex = c1107ab.m667b(str, "frameIndex", (Integer) 0).intValue();
        this.frameIndexRandom = c1107ab.m667b(str, "frameIndexRandom", (Integer) 0).intValue();
        String m666b2 = c1107ab.m666b(str, "stripIndex", "0");
        this.stripIndex = gameEngine.f6329bR.m2375a(m666b2);
        if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + m666b2);
        }
        this.attachedToUnit = c1107ab.m685a(str, "attachedToUnit", (Boolean) true).booleanValue();
        this.liveAfterAttachedDies = c1107ab.m685a(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
        this.atmospheric = c1107ab.m685a(str, "atmospheric", (Boolean) false).booleanValue();
        this.physics = c1107ab.m685a(str, "physics", (Boolean) false).booleanValue();
        this.physicsGravity = c1107ab.m683a(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
        String m666b3 = c1107ab.m666b(str, "priority", (String) null);
        if (m666b3 != null) {
            try {
                this.priority = EnumC0763h.valueOf(m666b3);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Unknown priority:" + m666b3);
            }
        }
        int intValue = c1107ab.m667b(str, "total_frames", (Integer) 1).intValue();
        if (intValue < 1) {
            throw new C0417bo("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
        }
        C0970e m3547a = c0458l.m3547a(c1107ab, str, "image");
        if (m3547a != null) {
            this.imageStrip = new C0762g();
            this.imageStrip.f4908i = m3547a;
            this.imageStrip.f4901b = this.imageStrip.f4908i.mo387m() / intValue;
            this.imageStrip.f4902c = this.imageStrip.f4908i.mo388l();
            this.imageStrip.f4901b = c1107ab.m667b(str, "frame_width", Integer.valueOf(this.imageStrip.f4901b)).intValue();
            this.imageStrip.f4902c = c1107ab.m667b(str, "frame_height", Integer.valueOf(this.imageStrip.f4902c)).intValue();
            if (intValue == 1 && this.imageStrip.f4901b >= this.imageStrip.f4908i.mo387m()) {
                this.imageStrip.f4910k = true;
            } else if (this.imageStrip.f4902c < this.imageStrip.f4908i.mo388l()) {
                this.imageStrip.f4907h = this.imageStrip.f4908i.mo387m() / this.imageStrip.f4901b;
                if (this.imageStrip.f4907h < 1) {
                    this.imageStrip.f4907h = 1;
                }
            }
            this.imageStrip.f4903d = 0;
            this.imageStrip.f4904e = 0;
            this.imageStrip.f4905f = this.imageStrip.f4901b;
            this.imageStrip.f4906g = this.imageStrip.f4902c;
            String m666b4 = c1107ab.m666b(str, "imageShadow", (String) null);
            if (m666b4 != null) {
                this.imageStrip.f4909j = C0349ag.m4017a(c0458l.f2946F, m666b4, c0458l.f2962ab, c0458l, str, "imageShadow");
                this.shadow = true;
            }
            if (this.shadow && this.imageStrip.f4909j == null) {
                throw new C0417bo("imageShadow is required if image and shadow:true is used");
            }
        }
        this.animateFrameStart = c1107ab.m667b(str, "animateFrameStart", (Integer) 0).intValue();
        this.animateFrameStartRandomAdd = c1107ab.m667b(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
        this.animateFrameEnd = c1107ab.m667b(str, "animateFrameEnd", (Integer) 0).intValue();
        this.animateFramePingPong = c1107ab.m685a(str, "animateFramePingPong", (Boolean) false).booleanValue();
        this.animateFrameLooping = c1107ab.m685a(str, "animateFrameLooping", (Boolean) false).booleanValue();
        this.animateFrameSpeed = c1107ab.m668b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
        this.animateFrameSpeedRandom = c1107ab.m668b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
        if (m3547a != null && ((this.imageStrip.f4901b >= this.imageStrip.f4908i.mo387m() || intValue != 1) && this.animateFrameEnd > intValue)) {
            throw new C0417bo("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        this.alsoEmitEffects = c0458l.m3526c(c1107ab.m666b(str, "alsoEmitEffects", (String) null));
        this.alsoEmitEffectsOnDeath = c0458l.m3526c(c1107ab.m666b(str, "alsoEmitEffectsOnDeath", (String) null));
        this.trailEffect = c0458l.m3526c(c1107ab.m666b(str, "trailEffect", (String) null));
        this.trailEffectRate = c1107ab.m668b(str, "trailEffectRate", Float.valueOf(6.0f)).floatValue();
        this.ifSpawnFailsEmitEffects = c0458l.m3526c(c1107ab.m666b(str, "ifSpawnFailsEmitEffects", (String) null));
        this.alsoPlaySound = C0414bl.m3884a(c0458l, c1107ab.m666b(str, "alsoPlaySound", (String) null), (C0414bl) null);
    }
}