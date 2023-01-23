package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.PlayerData;
import com.corrodinggames.rts.game.units.ao;
import com.corrodinggames.rts.game.units.au;
import com.corrodinggames.rts.game.units.av;
import com.corrodinggames.rts.game.units.custom.b.n;
import com.corrodinggames.rts.game.units.custom.bo;
import com.corrodinggames.rts.game.units.custom.d.b;
import com.corrodinggames.rts.game.units.custom.e.a;
import com.corrodinggames.rts.game.units.custom.g;
import com.corrodinggames.rts.game.units.custom.h;
import com.corrodinggames.rts.game.units.custom.j;
import com.corrodinggames.rts.game.units.custom.l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.f.i;
import com.corrodinggames.rts.game.units.y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.f;
import com.corrodinggames.rts.gameFramework.utility.ab;
import com.corrodinggames.rts.gameFramework.utility.am;
import com.corrodinggames.rts.gameFramework.utility.m;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions.class */
public class LogicBooleanGameFunctions {
    static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        LogicBoolean.addBooleanType(logicBoolean, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadTypes() {
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
        public boolean read(y yVar) {
            boolean z = true;
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.nukesEnabled && gameEngine.O() && gameEngine.bX.gameMapData.i) {
                z = false;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
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
        public float readNumber(y yVar) {
            return GameEngine.getGameEngine().bL.i();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapHeightBoolean.class */
    public class GameMapHeightBoolean extends LogicNumberFunction {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "game.mapHeight";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return GameEngine.getGameEngine().bL.j();
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
        public boolean read(y yVar) {
            boolean z;
            GameEngine gameEngine = GameEngine.getGameEngine();
            if (this.mod >= 0) {
                if (this.offset) {
                    z = (((long) gameEngine.tick) + yVar.eh) % ((long) this.mod) == ((long) this.equalTo);
                } else {
                    z = gameEngine.tick % this.mod == this.equalTo;
                }
            } else if (this.offset) {
                z = ((long) gameEngine.tick) + yVar.eh == ((long) this.equalTo);
            } else {
                z = gameEngine.tick == this.equalTo;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
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
        public String getMatchFailReasonForPlayer(y yVar) {
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
        public boolean read(y yVar) {
            boolean z = false;
            if (this.underwater && yVar.eq < -2.0f) {
                z = true;
            }
            if (this.ground && yVar.eq > -2.0f && yVar.eq < 5.0f) {
                z = true;
            }
            if (this.flying && yVar.eq > 5.0f) {
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
        public float getValue(y yVar) {
            if (yVar.bi()) {
                return f.b(0.0f, 0.0f, yVar.cc, yVar.cd);
            }
            float f = yVar.cf;
            return f < 0.0f ? -f : f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedBoolean.class */
    public class SpeedBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean atTopSpeed;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            float z2 = yVar.z() - 0.1f;
            if (yVar.bi()) {
                float a2 = f.a(0.0f, 0.0f, yVar.cc, yVar.cd);
                if (a2 != 0.0f && a2 > z2 * z2) {
                    z = true;
                }
            } else if (yVar.cf != 0.0f && yVar.cf > z2) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "Speed";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MovingBoolean.class */
    public class MovingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cK) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "Moving";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasActiveWaypoint.class */
    public class HasActiveWaypoint extends LogicBoolean {
        av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (av) ab.a(str, (Enum) null, av.class);
            } catch (bo e) {
                throw new am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            au ar = yVar.ar();
            if (ar != null) {
                if (this.type == null) {
                    z = true;
                } else {
                    z = ar.d() == this.type;
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "HasActiveWaypoint(type=" + this.type + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfQueuedWaypoints.class */
    public class NumberOfQueuedWaypoints extends LogicBoolean.AbstractNumberBoolean {
        av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (av) ab.a(str, (Enum) null, av.class);
            } catch (bo e) {
                throw new am(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "NumberOfQueuedWaypoints";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            if (this.type == null) {
                return yVar.av();
            }
            int i = 0;
            int av = yVar.av();
            for (int i2 = 0; i2 < av; i2++) {
                au k = yVar.k(i2);
                if (k != null) {
                    if (k.d() == this.type) {
                        i++;
                    }
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$InMapBoolean.class */
    public class InMapBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (com.corrodinggames.rts.gameFramework.utility.y.a(yVar.eo, yVar.ep)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "InMap";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TouchWaterBoolean.class */
    public class TouchWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cH()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "TouchWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverWaterBoolean.class */
    public class OverWaterBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cJ()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "OverWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverLiquidBoolean.class */
    public class OverLiquidBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cK()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "overLiquid";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverCliftBoolean.class */
    public class OverCliftBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cI()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "OverClift";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverPassableTileBoolean.class */
    public class OverPassableTileBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        ao movementType = ao.LAND;

        @LogicBoolean.Parameter
        public void type(String str) {
            this.movementType = ao.a(str, "isOverPassableTile()");
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            GameEngine.getGameEngine();
            if (!com.corrodinggames.rts.gameFramework.utility.y.a(yVar.eo, yVar.ep, this.movementType)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "OverLand";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompletedBoolean.class */
    public class CompletedBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.cm >= 1.0f) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "isComplete";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingCountBoolean.class */
    public class TransportingCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        public g _withTag;
        public boolean filtered;
        @LogicBoolean.Parameter
        public int slot = -1;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "TransportingCount";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this._withTag != null || this.slot != -1) {
                this.filtered = true;
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            int i;
            if (!this.filtered) {
                i = yVar.bB();
            } else {
                i = 0;
                m bz = yVar.bz();
                if (bz != null) {
                    Object[] a2 = bz.a();
                    for (int i2 = bz.f689a - 1; i2 >= 0; i2--) {
                        y yVar2 = (y) a2[i2];
                        if (yVar2 != null && (this.slot == -1 || i2 == this.slot)) {
                            if (this._withTag != null) {
                                if (!g.a(this._withTag, yVar2.de())) {
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
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagDynamicBoolean.class */
    public class HasFlagDynamicBoolean extends LogicBoolean {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)
        public LogicBoolean id;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.id == null) {
                throw new BooleanParseException("Flag id must be set");
            }
            Float staticNumber = getStaticNumber(this.id);
            if (staticNumber != null) {
                HasFlagBoolean hasFlagBoolean = new HasFlagBoolean();
                hasFlagBoolean.id((int) staticNumber.floatValue());
                return hasFlagBoolean;
            }
            return this;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            int readNumber = (int) this.id.readNumber(getParameterContext(yVar));
            if (readNumber >= 0 && readNumber <= 31) {
                if (HasFlagBoolean.isFlagSet(yVar.cF, 1 << readNumber)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "HasFlag(id:" + this.id.getMatchFailReasonForPlayer(getParameterContext(yVar)) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagBoolean.class */
    public class HasFlagBoolean extends LogicBoolean {
        public int flagMask = 0;
        public int flagId = -1;

        @LogicBoolean.Parameter(positional = 0)
        public void id(int i) {
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
        public String getMatchFailReasonForPlayer(y yVar) {
            return "HasFlag(id:" + this.flagId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = true;
            if (this.flagMask != 0 && !isFlagSet(yVar.cF, this.flagMask)) {
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
            if (i < -1 || i > PlayerData.c) {
                throw new BooleanParseException("Flag id must be between 0-" + PlayerData.c);
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
        public String getMatchFailReasonForPlayer(y yVar) {
            return "Team(id:" + this.teamId + ")";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = true;
            if (yVar.bX.k != this.teamId) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TagsBoolean.class */
    public class TagsBoolean extends LogicBoolean {
        public g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            String str = "Tag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            h de;
            boolean z = true;
            if (this.includesTag != null && ((de = yVar.de()) == null || !g.a(this.includesTag, de))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamTagBoolean.class */
    public class TeamTagBoolean extends LogicBoolean {
        public g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            String str = "Team Tag ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            h U;
            boolean z = true;
            if (this.includesTag != null && ((U = yVar.bX.U()) == null || !g.a(this.includesTag, U))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EventTagsBoolean.class */
    public class EventTagsBoolean extends LogicBoolean {
        public g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            String str = "EventTag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = true;
            if (this.includesTag != null) {
                h hVar = null;
                if (LogicBoolean.activeEvent != null) {
                    hVar = LogicBoolean.activeEvent.d;
                }
                if (hVar == null || !g.a(this.includesTag, hVar)) {
                    z = false;
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean.class */
    public class TransportingUnitWithTagsBoolean extends LogicBoolean {
        public g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            String str = "TransportingUnitWithTags ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            m bz;
            boolean z = false;
            if (this.includesTag != null && (bz = yVar.bz()) != null) {
                Object[] a2 = bz.a();
                for (int i = 0; i < bz.f689a; i++) {
                    h de = ((com.corrodinggames.rts.game.units.am) a2[i]).de();
                    if (de != null && g.a(this.includesTag, de)) {
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
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.bA()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "IsTransportUnloading";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isDead.class */
    public class isDead extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.bV) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.eq;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cB;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return yVar.bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean.class */
    public final class EnergyIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "EnergyIncludingQueued";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.cB + yVar.by().c;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return yVar.bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PriceCreditsBoolean.class */
    public final class PriceCreditsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "PriceCredits";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.cL();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cu;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return yVar.cv;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxHpBoolean.class */
    public final class MaxHpBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "maxHp";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.cv;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cA;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.bd();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return (float) yVar.eh;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public boolean read(y yVar) {
            return yVar.bX.F;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamWipedOutBoolean.class */
    public final class TeamWipedOutBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamWipedOut";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            return yVar.bX.G;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamVictoryBoolean.class */
    public final class TeamVictoryBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "teamVictory";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            return yVar.bX.H;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isEnergyRechargingBoolean.class */
    public final class isEnergyRechargingBoolean extends LogicBoolean.LogicBooleanCommon {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicBooleanCommon
        public String getName() {
            return "isEnergyRecharging";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            return yVar.bX();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamIdBoolean.class */
    public final class TeamIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "teamId";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.bX.k;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.eo;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.ep;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cg;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.z();
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cm;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cx;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return yVar.cA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoBoolean.class */
    public final class AmmoBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Ammo";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.cE;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceCountBoolean.class */
    public final class ResourceCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        l meta;
        a type;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("ResourceCountBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter(positional = 0)
        public void type(String str) {
            this.type = this.meta.j(str);
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
        public float getValue(y yVar) {
            if (this.type == null) {
                return 0.0f;
            }
            return (float) this.type.a(yVar);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public LogicBoolean parseNextElementInChain(String str, l lVar, String str2, boolean z, String str3, String str4, LogicBoolean logicBoolean) {
            a j = lVar.j(str2);
            if (j == null) {
                throw new BooleanParseException("'" + str3 + "': Could not find resource: '" + str2 + "'");
            }
            ResourceCountBoolean resourceCountBoolean = new ResourceCountBoolean();
            resourceCountBoolean.meta = lVar;
            resourceCountBoolean.type = j;
            return resourceCountBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfConnectionsBoolean.class */
    public final class NumberOfConnectionsBoolean extends LogicBoolean.AbstractNumberBoolean {
        l meta;
        com.corrodinggames.rts.game.units.custom.c.a connectionMetadata;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter
        public void name(String str) {
            this.connectionMetadata = this.meta.l(str);
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
        public float getValue(y yVar) {
            return yVar.dI.a(this.connectionMetadata);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasResourcesBoolean.class */
    public final class HasResourcesBoolean extends LogicBoolean {
        b requiredResources;
        l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("HasResourcesBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void setArgumentsRaw(String str, l lVar, String str2) {
            try {
                this.requiredResources = b.b(this.meta, str);
            } catch (bo e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (this.requiredResources.b(yVar)) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "HasResources(" + this.requiredResources.a(false, true, 8, true) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsResourceLargerThan.class */
    public final class IsResourceLargerThan extends LogicBoolean {
        l meta;
        a source;
        a compareTarget;
        @LogicBoolean.Parameter
        public float byMoreThan = 0.0f;
        @LogicBoolean.Parameter
        public float multiplyTargetBy = 1.0f;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("IsResourceLargerThan requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter
        public void source(String str) {
            this.source = this.meta.j(str);
            if (this.source == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.source);
            }
        }

        @LogicBoolean.Parameter
        public void compareTarget(String str) {
            this.compareTarget = this.meta.j(str);
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
        public boolean read(y yVar) {
            boolean z = false;
            if (this.source.a(yVar) > (this.compareTarget.a(yVar) + this.byMoreThan) * this.multiplyTargetBy) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "IsResourceLargerThan(" + this.source.j() + " vs " + this.compareTarget.j() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$KillsBoolean.class */
    public final class KillsBoolean extends LogicBoolean.AbstractNumberBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "Kills";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.cU;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam.class */
    public final class NumberOfUnitsInTeam extends LogicBoolean.AbstractNumberBoolean {
        public g _withTag;
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
            this._withTag = g.c(str);
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
        public float getValue(y yVar) {
            PlayerData playerData;
            int a2;
            PlayerData[] d;
            int i;
            int a3;
            g gVar = this._withTag;
            if (this.allTeams) {
                playerData = null;
            } else if (this.neutralTeam) {
                if (!this.useAggressiveTeamInsteadOfNeutralTeam) {
                    playerData = PlayerData.i;
                } else {
                    playerData = PlayerData.h;
                }
            } else {
                playerData = yVar.bX;
            }
            if (playerData == null) {
                a2 = 0;
                for (PlayerData playerData2 : PlayerData.d()) {
                    if (gVar == null) {
                        i = a2;
                        a3 = playerData2.a(this.incompleteBuildings, this.factoryQueue);
                    } else {
                        i = a2;
                        a3 = playerData2.a(gVar, this.incompleteBuildings, this.factoryQueue);
                    }
                    a2 = i + a3;
                }
            } else if (gVar == null) {
                a2 = playerData.a(this.incompleteBuildings, this.factoryQueue);
            } else {
                a2 = playerData.a(gVar, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || a2 == 0) {
                return a2;
            }
            handleCallbackCount.withinRangeSq = this.withinRangeSq;
            handleCallbackCount.count = 0;
            handleCallbackCount.tag = gVar;
            handleCallbackCount.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCount.targetTeam = playerData;
            GameEngine.getGameEngine().cc.a(yVar.eo, yVar.ep, this.withinRange, yVar, 0.0f, handleCallbackCount);
            return handleCallbackCount.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam$HandleCallbackCount.class */
        public class HandleCallbackCount extends i {
            public g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public PlayerData targetTeam;

            @Override // com.corrodinggames.rts.game.units.f.i
            public void setup(y yVar, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public int excludeTeam(y yVar) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyEnemiesOfTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyTeam(y yVar) {
                return this.targetTeam;
            }

            @Override // com.corrodinggames.rts.game.units.f.j
            public void callback(y yVar, float f, com.corrodinggames.rts.game.units.am amVar) {
                h de = amVar.de();
                if ((this.tag == null || (de != null && g.a(this.tag, de))) && f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep) < this.withinRangeSq) {
                    if (amVar.cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.class */
    public final class NumberOfUnitsInEnemyOrAllyTeam extends LogicBoolean.AbstractNumberBoolean {
        public g _withTag;
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
            this._withTag = g.c(str);
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
        public float getValue(y yVar) {
            int c;
            PlayerData playerData = yVar.bX;
            if (!this.ally) {
                c = 0 + playerData.b(this._withTag, this.incompleteBuildings, this.factoryQueue);
            } else {
                c = 0 + playerData.c(this._withTag, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || c == 0) {
                return c;
            }
            if (!this.ally) {
                handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
                handleCallbackCountEnemies.count = 0;
                handleCallbackCountEnemies.tag = this._withTag;
                handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
                GameEngine.getGameEngine().cc.a(yVar.eo, yVar.ep, this.withinRange, yVar, 0.0f, handleCallbackCountEnemies);
                return handleCallbackCountEnemies.count;
            }
            handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
            handleCallbackCountAlly.count = 0;
            handleCallbackCountAlly.tag = this._withTag;
            handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCountAlly.ally = yVar.bX;
            GameEngine.getGameEngine().cc.a(yVar.eo, yVar.ep, this.withinRange, yVar, 0.0f, handleCallbackCountAlly);
            return handleCallbackCountAlly.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies.class */
        public class HandleCallbackCountEnemies extends i {
            public g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.f.i
            public void setup(y yVar, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public int excludeTeam(y yVar) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyEnemiesOfTeam(y yVar) {
                return yVar.bX;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.j
            public void callback(y yVar, float f, com.corrodinggames.rts.game.units.am amVar) {
                h de = amVar.de();
                if ((this.tag == null || (de != null && g.a(this.tag, de))) && f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep) < this.withinRangeSq) {
                    if (amVar.cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly.class */
        public class HandleCallbackCountAlly extends i {
            public PlayerData ally;
            public g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            @Override // com.corrodinggames.rts.game.units.f.i
            public void setup(y yVar, float f) {
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public int excludeTeam(y yVar) {
                return -1;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyEnemiesOfTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.i
            public PlayerData onlyTeam(y yVar) {
                return null;
            }

            @Override // com.corrodinggames.rts.game.units.f.j
            public void callback(y yVar, float f, com.corrodinggames.rts.game.units.am amVar) {
                if (this.ally == amVar.bX || !this.ally.d(amVar.bX)) {
                    return;
                }
                h de = amVar.de();
                if ((this.tag == null || (de != null && g.a(this.tag, de))) && f.a(yVar.eo, yVar.ep, amVar.eo, amVar.ep) < this.withinRangeSq) {
                    if (amVar.cm < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public float getValue(y yVar) {
            return yVar.cE + yVar.by().f;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$QueueSize.class */
    public final class QueueSize extends LogicBoolean.AbstractNumberBoolean {
        public g _withActionTag;

        @LogicBoolean.Parameter
        public void withActionTag(String str) {
            this._withActionTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public String getName() {
            return "QueueSize";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getValue(y yVar) {
            return yVar.a(this._withActionTag);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
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
        public int getTime(y yVar) {
            return yVar.bz;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$LastConvertedBoolean.class */
    public final class LastConvertedBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "LastConverted";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(y yVar) {
            return yVar.bB;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CustomTimerBoolean.class */
    public final class CustomTimerBoolean extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "CustomTimer";
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(y yVar) {
            return yVar.bA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasTakenDamage.class */
    public class HasTakenDamage extends LogicBoolean.TimeBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public int getTime(y yVar) {
            return yVar.bs;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.TimeBoolean
        public String getName() {
            return "HasTakenDamage";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsAttackingBoolean.class */
    public class IsAttackingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.aa()) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsReversingBoolean.class */
    public class IsReversingBoolean extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.ci) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "IsReversing";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsControlledByAI.class */
    public class IsControlledByAI extends LogicBoolean {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            if (yVar.bX.w) {
                z = true;
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "IsControlledByAI";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompareUnitsBroken.class */
    public class CompareUnitsBroken extends LogicBoolean {
        l meta;
        UnitReference sameUnitAs;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("SameUnitAs requires metadata");
            }
            this.meta = lVar;
        }

        @LogicBoolean.Parameter
        public void sameUnitAs(String str) {
            try {
                this.sameUnitAs = UnitReference.parseUnitReference(this.meta, str, VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
            } catch (bo e) {
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
        public boolean read(y yVar) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "SameUnitAs";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasParent.class */
    public final class HasParent extends LogicBoolean {
        public g _withTag;

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = g.c(str);
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public boolean read(y yVar) {
            boolean z = false;
            com.corrodinggames.rts.game.units.am dr = yVar.dr();
            if (dr != null) {
                z = true;
                if (this._withTag != null) {
                    if (!g.a(this._withTag, dr.de())) {
                        z = false;
                    }
                }
            }
            return z;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public String getMatchFailReasonForPlayer(y yVar) {
            return "HasParent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean.class */
    public final class NumberOfAttachedUnitsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public g _withTag;
        short attachmentId = -1;
        l meta;

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public void forMeta(l lVar) {
            if (lVar == null) {
                throw new am("NumberOfAttachedUnitsBoolean requires metadata");
            }
            this.meta = lVar;
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
            this._withTag = g.c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            n i = this.meta.i(str);
            if (i == null) {
                throw new am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = i.a();
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
        public float getValue(y yVar) {
            if (!(yVar instanceof j)) {
                return 0.0f;
            }
            j jVar = (j) yVar;
            if (jVar.C == null) {
                return 0.0f;
            }
            int i = 0;
            Object[] a2 = jVar.C.a();
            for (int i2 = jVar.C.f689a - 1; i2 >= 0; i2--) {
                y yVar2 = (y) a2[i2];
                if (yVar2 != null && (this.attachmentId == -1 || i2 == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!g.a(this._withTag, yVar2.de())) {
                        }
                    }
                    i++;
                }
            }
            return i;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.AbstractNumberBoolean
        public float getMaxValue(y yVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ThisActionRepeatedCount.class */
    public class ThisActionRepeatedCount extends LogicBoolean.LogicNumberOnly {
        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly, com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean
        public float readNumber(y yVar) {
            return j.dO;
        }

        @Override // com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean.LogicNumberOnly
        public String getName() {
            return "ThisActionRepeatedCount";
        }
    }
}