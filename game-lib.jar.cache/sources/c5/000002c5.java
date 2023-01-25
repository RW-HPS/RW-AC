package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0629y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.custom.C0417bo;
import com.corrodinggames.rts.game.units.custom.C0453g;
import com.corrodinggames.rts.game.units.custom.C0454h;
import com.corrodinggames.rts.game.units.custom.C0456j;
import com.corrodinggames.rts.game.units.custom.C0458l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0402n;
import com.corrodinggames.rts.game.units.custom.p019c.C0421a;
import com.corrodinggames.rts.game.units.custom.p020d.C0429b;
import com.corrodinggames.rts.game.units.custom.p021e.C0433a;
import com.corrodinggames.rts.game.units.p027f.AbstractC0549i;
import com.corrodinggames.rts.gameFramework.C0773f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1107ab;
import com.corrodinggames.rts.gameFramework.utility.C1119am;
import com.corrodinggames.rts.gameFramework.utility.C1136m;
import com.corrodinggames.rts.gameFramework.utility.C1152y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions.class */
public class LogicBooleanGameFunctions {
    static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        LogicBoolean.addBooleanType(logicBoolean, strArr);
    }

    static void loadTypes() {
        addBooleanType(new HeightBoolean().with("underwater=true"), "self.underwater", "self.isUnderwater");
        addBooleanType(new HeightBoolean().with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
        addBooleanType(new HeightValueBoolean(), "self.height", "self.z");
        addBooleanType(new HeightBoolean().with("flying=true"), "self.flying", "self.isFlying");
        addBooleanType(new MovingBoolean(), "self.isMoving");
        addBooleanType(new HasActiveWaypoint(), "self.hasActiveWaypoint");
        addBooleanType(new NumberOfQueuedWaypoints(), "self.numberOfQueuedWaypoints");
        addBooleanType(new SpeedValueBoolean(), "self.speed");
        addBooleanType(new SpeedBoolean().with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
        addBooleanType(new InMapBoolean(), "self.isInMap");
        addBooleanType(new TouchWaterBoolean(), "self.inwater", "self.isInWater");
        addBooleanType(new OverWaterBoolean(), "self.overwater", "self.isOverwater");
        addBooleanType(new OverLiquidBoolean(), "self.isOverLiquid");
        addBooleanType(new OverCliftBoolean(), "self.isOverClift", "self.isOverCliff");
        addBooleanType(new OverPassableTileBoolean(), "self.isOverPassableTile");
        addBooleanType(new OverPassableTileBoolean().with("type='LAND'").createLocked(), "self.isOverOpenLand");
        addBooleanType(new TagsBoolean(), "self.tags", "self.hasTags");
        addBooleanType(new TeamTagBoolean(), "self.globalTeamTags", "self.hasGlobalTeamTags");
        addBooleanType(new HasFlagDynamicBoolean(), "self.hasFlag");
        addBooleanType(new EnergyBoolean(), "self.energy");
        addBooleanType(new EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
        addBooleanType(new EnergyBoolean().with("full=true"), "self.isEnergyFull");
        addBooleanType(new EnergyBoolean().with("empty=true"), "self.isEnergyEmpty");
        addBooleanType(new TransportingCountBoolean(), "self.transportingCount");
        addBooleanType(new TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
        addBooleanType(new isTransportUnloading(), "self.isTransportUnloading");
        addBooleanType(new PriceCreditsBoolean(), "self.priceCredits");
        addBooleanType(new HpBoolean(), "self.hp");
        addBooleanType(new MaxHpBoolean(), "self.maxHp");
        addBooleanType(new MaxShieldBoolean(), "self.maxShield");
        addBooleanType(new MaxEnergyBoolean(), "self.maxEnergy");
        addBooleanType(new UnitIdBoolean(), "self.id");
        addBooleanType(new TeamIdBoolean(), "self.teamId");
        addBooleanType(new TeamDefeatedTechBoolean(), "self.teamDefeatedTech");
        addBooleanType(new TeamWipedOutBoolean(), "self.teamWipedOut");
        addBooleanType(new TeamVictoryBoolean(), "self.teamVictory");
        addBooleanType(new isEnergyRechargingBoolean(), "self.isEnergyRecharging");
        addBooleanType(new PositionXBoolean(), "self.x");
        addBooleanType(new PositionYBoolean(), "self.y");
        addBooleanType(new RotationBoolean(), "self.dir");
        addBooleanType(new MaxMoveSpeedBoolean(), "self.maxMoveSpeed");
        addBooleanType(new BuiltAmountBoolean(), "self.builtAmount");
        addBooleanType(new CompletedBoolean(), "self.completed");
        addBooleanType(new ShieldBoolean(), "self.shield");
        addBooleanType(new AmmoBoolean(), "self.ammo");
        addBooleanType(new AmmoBoolean().with("empty=true"), "self.isAmmoEmpty");
        addBooleanType(new AmmoIncludingQueuedBoolean(), "self.ammoIncludingQueued");
        addBooleanType(new ResourceCountBoolean(), "self.resource");
        addBooleanType(new QueueSize(), "self.queueSize");
        addBooleanType(new NumberOfConnectionsBoolean(), "self.numberOfConnections");
        addBooleanType(new NumberOfAttachedUnitsBoolean(), "self.numberOfAttachedUnits");
        addBooleanType(new HasParent(), "self.hasParent");
        addBooleanType(new HasResourcesBoolean(), "self.hasResources");
        addBooleanType(new IsResourceLargerThan(), "self.isResourceLargerThan");
        addBooleanType(new KillsBoolean(), "self.kills");
        addBooleanType(new TimeAliveBoolean(), "self.timeAlive");
        addBooleanType(new LastConvertedBoolean(), "self.lastConverted");
        addBooleanType(new CustomTimerBoolean(), "self.customTimer");
        addBooleanType(new HasTakenDamage(), "self.hasTakenDamage");
        addBooleanType(new IsAttackingBoolean(), "self.isAttacking");
        addBooleanType(new IsReversingBoolean(), "self.isReversing");
        addBooleanType(new IsOnTeam().with("team=-1").createLocked(), "self.isOnNeutralTeam");
        addBooleanType(new IsControlledByAI(), "self.isControlledByAI");
        addBooleanType(new NumberOfUnitsInTeam(), "numberOfUnitsInTeam", "self.numberOfUnitsInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=0, lessThan=-1"), "hasUnitInTeam", "self.hasUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=-1, lessThan=1"), "noUnitInTeam", "self.noUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("neutralTeam=true"), "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("aggressiveTeam=true"), "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("allTeams=true"), "numberOfUnitsInAllTeams", "self.numberOfUnitsInAllTeams");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=false"), "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=true"), "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam");
        addBooleanType(new GameModeBoolean().with("nukesEnabled=true").createLocked(), "game.nukesEnabled");
        addBooleanType(new GameMapWidthBoolean(), "game.mapWidth");
        addBooleanType(new GameMapHeightBoolean(), "game.mapHeight");
        addBooleanType(new ThisActionRepeatedCount(), "thisActionIndex", "index");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameModeBoolean.class */
    public class GameModeBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @LogicBoolean.Parameter
        public boolean nukesEnabled;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.nukesEnabled && gameEngine.m1102O() && gameEngine.netEngine.gameMapData.nukes) {
                z = false;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "GameMode(" + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled") + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapWidthBoolean.class */
    public class GameMapWidthBoolean extends LogicNumberFunction {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "game.mapWidth";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return GameEngine.getGameEngine().f6323bL.m4707i();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapHeightBoolean.class */
    public class GameMapHeightBoolean extends LogicNumberFunction {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "game.mapHeight";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return GameEngine.getGameEngine().f6323bL.m4706j();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsGameFrameBoolean.class */
    public class IsGameFrameBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public int mod;
        @LogicBoolean.Parameter
        public int equalTo;
        @LogicBoolean.Parameter
        public boolean offset;

        @LogicBoolean.Parameter
        public void mod(int i) {
            this.mod = i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z;
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.mod >= 0) {
                if (this.offset) {
                    z = (((long) gameEngine.tick) + abstractC0629y.f7166eh) % ((long) this.mod) == ((long) this.equalTo);
                } else {
                    z = gameEngine.tick % this.mod == this.equalTo;
                }
            } else if (this.offset) {
                z = ((long) gameEngine.tick) + abstractC0629y.f7166eh == ((long) this.equalTo);
            } else {
                z = gameEngine.tick == this.equalTo;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsGameFrame(mod=" + this.mod + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightBoolean.class */
    public class HeightBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean underwater;
        @LogicBoolean.Parameter
        public boolean ground;
        @LogicBoolean.Parameter
        public boolean flying;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            String str = VariableScope.nullOrMissingString;
            if (this.underwater) {
                str = str + "underwater";
            }
            if (this.ground) {
                str = str + "ground";
            }
            if (this.flying) {
                str = str + "flying";
            }
            if (str.equals(VariableScope.nullOrMissingString)) {
                str = str + "height";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (this.underwater && abstractC0629y.f7174eq < -2.0f) {
                z = true;
            }
            if (this.ground && abstractC0629y.f7174eq > -2.0f && abstractC0629y.f7174eq < 5.0f) {
                z = true;
            }
            if (this.flying && abstractC0629y.f7174eq > 5.0f) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedValueBoolean.class */
    public class SpeedValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Speed";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            if (abstractC0629y.mo2927bi()) {
                return C0773f.m2186b(0.0f, 0.0f, abstractC0629y.f1619cc, abstractC0629y.f1620cd);
            }
            float f = abstractC0629y.f1622cf;
            return f < 0.0f ? -f : f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedBoolean.class */
    public class SpeedBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean atTopSpeed;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            float mo2846z = abstractC0629y.mo2846z() - 0.1f;
            if (abstractC0629y.mo2927bi()) {
                float m2232a = C0773f.m2232a(0.0f, 0.0f, abstractC0629y.f1619cc, abstractC0629y.f1620cd);
                if (m2232a != 0.0f && m2232a > mo2846z * mo2846z) {
                    z = true;
                }
            } else if (abstractC0629y.f1622cf != 0.0f && abstractC0629y.f1622cf > mo2846z) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "Speed";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MovingBoolean.class */
    public class MovingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.f1653cK) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "Moving";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasActiveWaypoint.class */
    public class HasActiveWaypoint extends LogicBoolean {
        EnumC0306av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (EnumC0306av) C1107ab.m698a(str, (Enum) null, EnumC0306av.class);
            } catch (C0417bo e) {
                throw new C1119am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            C0305au m2967ar = abstractC0629y.m2967ar();
            if (m2967ar != null) {
                if (this.type == null) {
                    z = true;
                } else {
                    z = m2967ar.m4172d() == this.type;
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "HasActiveWaypoint(type=" + this.type + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfQueuedWaypoints.class */
    public class NumberOfQueuedWaypoints extends LogicBoolean.AbstractNumberBoolean {
        EnumC0306av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (EnumC0306av) C1107ab.m698a(str, (Enum) null, EnumC0306av.class);
            } catch (C0417bo e) {
                throw new C1119am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "NumberOfQueuedWaypoints";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            if (this.type == null) {
                return abstractC0629y.m2963av();
            }
            int i = 0;
            int m2963av = abstractC0629y.m2963av();
            for (int i2 = 0; i2 < m2963av; i2++) {
                C0305au m2875k = abstractC0629y.m2875k(i2);
                if (m2875k != null) {
                    if (m2875k.m4172d() == this.type) {
                        i++;
                    }
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$InMapBoolean.class */
    public class InMapBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (C1152y.m484a(abstractC0629y.f7172eo, abstractC0629y.f7173ep)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "InMap";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TouchWaterBoolean.class */
    public class TouchWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.m4314cH()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "TouchWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverWaterBoolean.class */
    public class OverWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.m4312cJ()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "OverWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverLiquidBoolean.class */
    public class OverLiquidBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.m4311cK()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "overLiquid";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverCliftBoolean.class */
    public class OverCliftBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.m4313cI()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "OverClift";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverPassableTileBoolean.class */
    public class OverPassableTileBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        EnumC0246ao movementType = EnumC0246ao.LAND;

        @LogicBoolean.Parameter
        public void type(String str) {
            this.movementType = EnumC0246ao.m4246a(str, "isOverPassableTile()");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            GameEngine.getGameEngine();
            if (!C1152y.m482a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, this.movementType)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "OverLand";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompletedBoolean.class */
    public class CompletedBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.f1629cm >= 1.0f) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "isComplete";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingCountBoolean.class */
    public class TransportingCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0453g _withTag;
        public boolean filtered;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "TransportingCount";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this._withTag != null || this.slot != -1) {
                this.filtered = true;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            int i;
            if (!this.filtered) {
                i = abstractC0629y.mo2940bB();
            } else {
                i = 0;
                C1136m mo2910bz = abstractC0629y.mo2910bz();
                if (mo2910bz != null) {
                    Object[] m540a = mo2910bz.m540a();
                    for (int i2 = mo2910bz.f7109a - 1; i2 >= 0; i2--) {
                        AbstractC0629y abstractC0629y2 = (AbstractC0629y) m540a[i2];
                        if (abstractC0629y2 != null && (this.slot == -1 || i2 == this.slot)) {
                            if (this._withTag != null) {
                                if (!C0453g.m3709a(this._withTag, abstractC0629y2.mo4278de())) {
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagDynamicBoolean.class */
    public class HasFlagDynamicBoolean extends LogicBoolean {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: id */
        public LogicBoolean f3317id;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.f3317id == null) {
                throw new BooleanParseException("Flag id must be set");
            }
            Float staticNumber = getStaticNumber(this.f3317id);
            if (staticNumber != null) {
                HasFlagBoolean hasFlagBoolean = new HasFlagBoolean();
                hasFlagBoolean.m3507id((int) staticNumber.floatValue());
                return hasFlagBoolean;
            }
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            int readNumber = (int) this.f3317id.readNumber(getParameterContext(abstractC0629y));
            if (readNumber >= 0 && readNumber <= 31) {
                if (HasFlagBoolean.isFlagSet(abstractC0629y.f1648cF, 1 << readNumber)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "HasFlag(id:" + this.f3317id.getMatchFailReasonForPlayer(getParameterContext(abstractC0629y)) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagBoolean.class */
    public class HasFlagBoolean extends LogicBoolean {
        public int flagMask = 0;
        public int flagId = -1;

        @LogicBoolean.Parameter(positional = 0)
        /* renamed from: id */
        public void m3507id(int i) {
            if (i < 0 || i > 31) {
                throw new BooleanParseException("Flag id must be between 0-31");
            }
            this.flagId = i;
            this.flagMask = 1 << i;
        }

        public static boolean isFlagSet(int i, int i2) {
            return (i2 & i) == i2;
        }

        public static byte setFlag(int i, int i2) {
            return (byte) (i2 | i);
        }

        public static byte unsetFlag(int i, int i2) {
            return (byte) (i2 & (i ^ (-1)));
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "HasFlag(id:" + this.flagId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = true;
            if (this.flagMask != 0 && !isFlagSet(abstractC0629y.f1648cF, this.flagMask)) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsOnTeam.class */
    public class IsOnTeam extends LogicBoolean.LogicBooleanCommonLocking {
        int teamId = -99;

        @LogicBoolean.Parameter
        public void team(int i) {
            if (i < -1 || i > PlayerData.f1367c) {
                throw new BooleanParseException("Flag id must be between 0-" + PlayerData.f1367c);
            }
            this.teamId = i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.teamId == -99) {
                throw new BooleanParseException("Expended teamId argument for function:" + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "Team(id:" + this.teamId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = true;
            if (abstractC0629y.f1614bX.site != this.teamId) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TagsBoolean.class */
    public class TagsBoolean extends LogicBoolean {
        public C0453g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            String str = "Tag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            C0454h de;
            boolean z = true;
            if (this.includesTag != null && ((de = abstractC0629y.mo4278de()) == null || !C0453g.m3709a(this.includesTag, de))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamTagBoolean.class */
    public class TeamTagBoolean extends LogicBoolean {
        public C0453g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            String str = "Team Tag ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            C0454h m4557U;
            boolean z = true;
            if (this.includesTag != null && ((m4557U = abstractC0629y.f1614bX.m4557U()) == null || !C0453g.m3709a(this.includesTag, m4557U))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EventTagsBoolean.class */
    public class EventTagsBoolean extends LogicBoolean {
        public C0453g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            String str = "EventTag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = true;
            if (this.includesTag != null) {
                C0454h c0454h = null;
                if (LogicBoolean.activeEvent != null) {
                    c0454h = LogicBoolean.activeEvent.f2931d;
                }
                if (c0454h == null || !C0453g.m3709a(this.includesTag, c0454h)) {
                    z = false;
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean.class */
    public class TransportingUnitWithTagsBoolean extends LogicBoolean {
        public C0453g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            String str = "TransportingUnitWithTags ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            C1136m mo2910bz;
            boolean z = false;
            if (this.includesTag != null && (mo2910bz = abstractC0629y.mo2910bz()) != null) {
                Object[] m540a = mo2910bz.m540a();
                for (int i = 0; i < mo2910bz.f7109a; i++) {
                    C0454h mo4278de = ((AbstractC0244am) m540a[i]).mo4278de();
                    if (mo4278de != null && C0453g.m3709a(this.includesTag, mo4278de)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isTransportUnloading.class */
    public class isTransportUnloading extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.mo2941bA()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsTransportUnloading";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isDead.class */
    public class isDead extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.f1612bV) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsDead";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightValueBoolean.class */
    public final class HeightValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Height";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f7174eq;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyBoolean.class */
    public final class EnergyBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Energy";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1644cB;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo2932bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean.class */
    public final class EnergyIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "EnergyIncludingQueued";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1644cB + abstractC0629y.mo2911by().f2724c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo2932bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PriceCreditsBoolean.class */
    public final class PriceCreditsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "PriceCredits";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo3467cL();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HpBoolean.class */
    public final class HpBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Hp";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1637cu;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1638cv;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxHpBoolean.class */
    public final class MaxHpBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxHp";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1638cv;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxShieldBoolean.class */
    public final class MaxShieldBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxShield";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1643cA;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxEnergyBoolean.class */
    public final class MaxEnergyBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxEnergy";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo2932bd();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$UnitIdBoolean.class */
    public final class UnitIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "id";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return (float) abstractC0629y.f7166eh;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamDefeatedTechBoolean.class */
    public final class TeamDefeatedTechBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamDefeatedTech";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.f1331F;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamWipedOutBoolean.class */
    public final class TeamWipedOutBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamWipedOut";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.f1332G;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamVictoryBoolean.class */
    public final class TeamVictoryBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamVictory";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.f1333H;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isEnergyRechargingBoolean.class */
    public final class isEnergyRechargingBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "isEnergyRecharging";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo3258bX();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamIdBoolean.class */
    public final class TeamIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "teamId";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1614bX.site;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionXBoolean.class */
    public final class PositionXBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "x";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f7172eo;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionYBoolean.class */
    public final class PositionYBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "y";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f7173ep;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$RotationBoolean.class */
    public final class RotationBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "dir";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1623cg;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxMoveSpeedBoolean.class */
    public final class MaxMoveSpeedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "MaxMoveSpeed";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo2846z();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$BuiltAmountBoolean.class */
    public final class BuiltAmountBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "BuiltAmount";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1629cm;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 1.0f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ShieldBoolean.class */
    public final class ShieldBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Shield";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1640cx;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1643cA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoBoolean.class */
    public final class AmmoBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Ammo";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1647cE;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceCountBoolean.class */
    public final class ResourceCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0458l meta;
        C0433a type;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new BooleanParseException("ResourceCountBoolean requires metadata");
            }
            this.meta = c0458l;
        }

        @LogicBoolean.Parameter(positional = 0)
        public void type(String str) {
            this.type = this.meta.m3533j(str);
            if (this.type == null) {
                throw new BooleanParseException("Could not find resource type: '" + str + "'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.type == null) {
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return this.type + VariableScope.nullOrMissingString;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            if (this.type == null) {
                return 0.0f;
            }
            return (float) this.type.mo3787a(abstractC0629y);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return new ResourceScope();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean.ReturnType getReturnType() {
            if (this.type == null) {
                return LogicBoolean.ReturnType.voidReturn;
            }
            if (this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                return LogicBoolean.ReturnType.number;
            }
            return LogicBoolean.ReturnType.bool;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void throwVoidReturnError(String str) {
            throw new RuntimeException("'" + str + "' requires type");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return logicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceScope.class */
    public class ResourceScope extends LogicBooleanLoader.LogicBooleanScopeOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader.LogicBooleanContext
        public LogicBoolean parseNextElementInChain(String str, C0458l c0458l, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            C0433a m3533j = c0458l.m3533j(str2);
            if (m3533j == null) {
                throw new BooleanParseException("'" + str3 + "': Could not find resource: '" + str2 + "'");
            }
            ResourceCountBoolean resourceCountBoolean = new ResourceCountBoolean();
            resourceCountBoolean.meta = c0458l;
            resourceCountBoolean.type = m3533j;
            return resourceCountBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfConnectionsBoolean.class */
    public final class NumberOfConnectionsBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0458l meta;
        C0421a connectionMetadata;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = c0458l;
        }

        @LogicBoolean.Parameter
        public void name(String str) {
            this.connectionMetadata = this.meta.m3529l(str);
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("Could not find connection type with name: " + str);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.'");
            }
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("requires connection name");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "NumberOfConnections";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1703dI.m3883a(this.connectionMetadata);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasResourcesBoolean.class */
    public final class HasResourcesBoolean extends LogicBoolean {
        C0429b requiredResources;
        C0458l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new BooleanParseException("HasResourcesBoolean requires metadata");
            }
            this.meta = c0458l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, C0458l c0458l, String str2) {
            try {
                this.requiredResources = C0429b.m3849b(this.meta, str);
            } catch (C0417bo e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (this.requiredResources.mo3824b(abstractC0629y)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "HasResources(" + this.requiredResources.m3857a(false, true, 8, true) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsResourceLargerThan.class */
    public final class IsResourceLargerThan extends LogicBoolean {
        C0458l meta;
        C0433a source;
        C0433a compareTarget;
        @LogicBoolean.Parameter
        public float byMoreThan = 0.0f;
        @LogicBoolean.Parameter
        public float multiplyTargetBy = 1.0f;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new BooleanParseException("IsResourceLargerThan requires metadata");
            }
            this.meta = c0458l;
        }

        @LogicBoolean.Parameter
        public void source(String str) {
            this.source = this.meta.m3533j(str);
            if (this.source == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.source);
            }
        }

        @LogicBoolean.Parameter
        public void compareTarget(String str) {
            this.compareTarget = this.meta.m3533j(str);
            if (this.compareTarget == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.compareTarget);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.source == null) {
                throw new BooleanParseException("Requires 'source'");
            }
            if (this.compareTarget == null) {
                throw new BooleanParseException("Requires 'compareTarget'");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (this.source.mo3787a(abstractC0629y) > (this.compareTarget.mo3787a(abstractC0629y) + this.byMoreThan) * this.multiplyTargetBy) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsResourceLargerThan(" + this.source.m3790j() + " vs " + this.compareTarget.m3790j() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$KillsBoolean.class */
    public final class KillsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Kills";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1663cU;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam.class */
    public final class NumberOfUnitsInTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0453g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean neutralTeam;
        @LogicBoolean.Parameter
        public boolean allTeams;
        public boolean useAggressiveTeamInsteadOfNeutralTeam;
        public static final HandleCallbackCount handleCallbackCount = new HandleCallbackCount();

        @LogicBoolean.Parameter
        public void aggressiveTeam(boolean z) {
            if (z) {
                this.neutralTeam = true;
                this.useAggressiveTeamInsteadOfNeutralTeam = true;
            }
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            PlayerData playerData;
            int m4543a;
            PlayerData[] m4499d;
            int i;
            int m4543a2;
            C0453g c0453g = this._withTag;
            if (this.allTeams) {
                playerData = null;
            } else if (this.neutralTeam) {
                if (!this.useAggressiveTeamInsteadOfNeutralTeam) {
                    playerData = PlayerData.f1373i;
                } else {
                    playerData = PlayerData.f1372h;
                }
            } else {
                playerData = abstractC0629y.f1614bX;
            }
            if (playerData == null) {
                m4543a = 0;
                for (PlayerData playerData2 : PlayerData.m4499d()) {
                    if (c0453g == null) {
                        i = m4543a;
                        m4543a2 = playerData2.m4531a(this.incompleteBuildings, this.factoryQueue);
                    } else {
                        i = m4543a;
                        m4543a2 = playerData2.m4543a(c0453g, this.incompleteBuildings, this.factoryQueue);
                    }
                    m4543a = i + m4543a2;
                }
            } else if (c0453g == null) {
                m4543a = playerData.m4531a(this.incompleteBuildings, this.factoryQueue);
            } else {
                m4543a = playerData.m4543a(c0453g, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m4543a == 0) {
                return m4543a;
            }
            handleCallbackCount.withinRangeSq = this.withinRangeSq;
            handleCallbackCount.count = 0;
            handleCallbackCount.tag = c0453g;
            handleCallbackCount.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCount.targetTeam = playerData;
            GameEngine.getGameEngine().f6340cc.m3232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, this.withinRange, abstractC0629y, 0.0f, handleCallbackCount);
            return handleCallbackCount.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam$HandleCallbackCount.class */
        public class HandleCallbackCount extends AbstractC0549i {
            public C0453g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public PlayerData targetTeam;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public void setup(AbstractC0629y abstractC0629y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public int excludeTeam(AbstractC0629y abstractC0629y) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
                return this.targetTeam;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
            public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
                C0454h mo4278de = abstractC0244am.mo4278de();
                if ((this.tag == null || (mo4278de != null && C0453g.m3709a(this.tag, mo4278de))) && C0773f.m2232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep) < this.withinRangeSq) {
                    if (abstractC0244am.f1629cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.class */
    public final class NumberOfUnitsInEnemyOrAllyTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0453g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean ally;
        public static final HandleCallbackCountEnemies handleCallbackCountEnemies = new HandleCallbackCountEnemies();
        public static final HandleCallbackCountAlly handleCallbackCountAlly = new HandleCallbackCountAlly();

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Enemy Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            int m4505c;
            PlayerData playerData = abstractC0629y.f1614bX;
            if (!this.ally) {
                m4505c = 0 + playerData.m4521b(this._withTag, this.incompleteBuildings, this.factoryQueue);
            } else {
                m4505c = 0 + playerData.m4505c(this._withTag, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m4505c == 0) {
                return m4505c;
            }
            if (!this.ally) {
                handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
                handleCallbackCountEnemies.count = 0;
                handleCallbackCountEnemies.tag = this._withTag;
                handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
                GameEngine.getGameEngine().f6340cc.m3232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, this.withinRange, abstractC0629y, 0.0f, handleCallbackCountEnemies);
                return handleCallbackCountEnemies.count;
            }
            handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
            handleCallbackCountAlly.count = 0;
            handleCallbackCountAlly.tag = this._withTag;
            handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCountAlly.ally = abstractC0629y.f1614bX;
            GameEngine.getGameEngine().f6340cc.m3232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, this.withinRange, abstractC0629y, 0.0f, handleCallbackCountAlly);
            return handleCallbackCountAlly.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies.class */
        public class HandleCallbackCountEnemies extends AbstractC0549i {
            public C0453g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public void setup(AbstractC0629y abstractC0629y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public int excludeTeam(AbstractC0629y abstractC0629y) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
                return abstractC0629y.f1614bX;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
            public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
                C0454h mo4278de = abstractC0244am.mo4278de();
                if ((this.tag == null || (mo4278de != null && C0453g.m3709a(this.tag, mo4278de))) && C0773f.m2232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep) < this.withinRangeSq) {
                    if (abstractC0244am.f1629cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly.class */
        public class HandleCallbackCountAlly extends AbstractC0549i {
            public PlayerData ally;
            public C0453g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public void setup(AbstractC0629y abstractC0629y, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public int excludeTeam(AbstractC0629y abstractC0629y) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyEnemiesOfTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0549i
            public PlayerData onlyTeam(AbstractC0629y abstractC0629y) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.p027f.AbstractC0550j
            public void callback(AbstractC0629y abstractC0629y, float f, AbstractC0244am abstractC0244am) {
                if (this.ally == abstractC0244am.f1614bX || !this.ally.m4496d(abstractC0244am.f1614bX)) {
                    return;
                }
                C0454h mo4278de = abstractC0244am.mo4278de();
                if ((this.tag == null || (mo4278de != null && C0453g.m3709a(this.tag, mo4278de))) && C0773f.m2232a(abstractC0629y.f7172eo, abstractC0629y.f7173ep, abstractC0244am.f7172eo, abstractC0244am.f7173ep) < this.withinRangeSq) {
                    if (abstractC0244am.f1629cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoIncludingQueuedBoolean.class */
    public final class AmmoIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "AmmoIncludingQueued";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1647cE + abstractC0629y.mo2911by().f2727f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$QueueSize.class */
    public final class QueueSize extends LogicBoolean.AbstractNumberBoolean {
        public C0453g _withActionTag;

        @LogicBoolean.Parameter
        public void withActionTag(String str) {
            this._withActionTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "QueueSize";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            return abstractC0629y.mo3395a(this._withActionTag);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TimeAliveBoolean.class */
    public final class TimeAliveBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "TimeAlive";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1589bz;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$LastConvertedBoolean.class */
    public final class LastConvertedBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "LastConverted";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1591bB;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CustomTimerBoolean.class */
    public final class CustomTimerBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "CustomTimer";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1590bA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasTakenDamage.class */
    public class HasTakenDamage extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(AbstractC0629y abstractC0629y) {
            return abstractC0629y.f1582bs;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "HasTakenDamage";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsAttackingBoolean.class */
    public class IsAttackingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.m2984aa()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsReversingBoolean.class */
    public class IsReversingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.f1625ci) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsReversing";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsControlledByAI.class */
    public class IsControlledByAI extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            if (abstractC0629y.f1614bX.f1319w) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "IsControlledByAI";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompareUnitsBroken.class */
    public class CompareUnitsBroken extends LogicBoolean {
        C0458l meta;
        UnitReference sameUnitAs;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new BooleanParseException("SameUnitAs requires metadata");
            }
            this.meta = c0458l;
        }

        @LogicBoolean.Parameter
        public void sameUnitAs(String str) {
            try {
                this.sameUnitAs = UnitReference.parseUnitReference(this.meta, str, VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
            } catch (C0417bo e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.sameUnitAs == null) {
                throw new BooleanParseException("Missing required parameters (Possible parameters:" + getParameters().allParametersString + ")");
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "SameUnitAs";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasParent.class */
    public final class HasParent extends LogicBoolean {
        public C0453g _withTag;

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3701c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(AbstractC0629y abstractC0629y) {
            boolean z = false;
            AbstractC0244am dr = abstractC0629y.m4266dr();
            if (dr != null) {
                z = true;
                if (this._withTag != null) {
                    if (!C0453g.m3709a(this._withTag, dr.mo4278de())) {
                        z = false;
                    }
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(AbstractC0629y abstractC0629y) {
            return "HasParent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean.class */
    public final class NumberOfAttachedUnitsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0453g _withTag;
        short attachmentId = -1;
        C0458l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(C0458l c0458l) {
            if (c0458l == null) {
                throw new C1119am("NumberOfAttachedUnitsBoolean requires metadata");
            }
            this.meta = c0458l;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0453g.m3701c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0402n m3535i = this.meta.m3535i(str);
            if (m3535i == null) {
                throw new C1119am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m3535i.m3941a();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            String str = VariableScope.nullOrMissingString;
            if (this._withTag != null) {
                str = str + "tag=" + this._withTag;
            }
            if (this.attachmentId != -1) {
                str = str + " attachmentId=" + ((int) this.attachmentId);
            }
            return "NumberOfAttachedUnits(" + str + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(AbstractC0629y abstractC0629y) {
            if (!(abstractC0629y instanceof C0456j)) {
                return 0.0f;
            }
            C0456j c0456j = (C0456j) abstractC0629y;
            if (c0456j.f2896C == null) {
                return 0.0f;
            }
            int i = 0;
            Object[] m540a = c0456j.f2896C.m540a();
            for (int i2 = c0456j.f2896C.f7109a - 1; i2 >= 0; i2--) {
                AbstractC0629y abstractC0629y2 = (AbstractC0629y) m540a[i2];
                if (abstractC0629y2 != null && (this.attachmentId == -1 || i2 == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0453g.m3709a(this._withTag, abstractC0629y2.mo4278de())) {
                        }
                    }
                    i++;
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(AbstractC0629y abstractC0629y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ThisActionRepeatedCount.class */
    public class ThisActionRepeatedCount extends LogicBoolean.LogicNumberOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(AbstractC0629y abstractC0629y) {
            return C0456j.f2905dO;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "ThisActionRepeatedCount";
        }
    }
}