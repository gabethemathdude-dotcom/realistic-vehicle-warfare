// TankPosition.java

package com.example.realisticvehiclewarfare;

public class TankPosition {
    public enum PositionType {
        FRONT_LINE,
        TANK_LINE,
        FLANK,
        SUPPORT,
        AMBUSH
    }

    private PositionType positionType;
    private int health;
    private int attackPower;
    private int defense;
    private String ability;

    public TankPosition(PositionType positionType) {
        this.positionType = positionType;
        setPositionStats();
    }

    private void setPositionStats() {
        switch (positionType) {
            case FRONT_LINE:
                health = 300;
                attackPower = 70;
                defense = 50;
                ability = "Charge Forward";
                break;
            case TANK_LINE:
                health = 400;
                attackPower = 50;
                defense = 70;
                ability = "Steady Defense";
                break;
            case FLANK:
                health = 250;
                attackPower = 90;
                defense = 30;
                ability = "Quick Maneuver";
                break;
            case SUPPORT:
                health = 200;
                attackPower = 30;
                defense = 40;
                ability = "Supply Drop";
                break;
            case AMBUSH:
                health = 150;
                attackPower = 100;
                defense = 20;
                ability = "Surprise Attack";
                break;
        }
    }

    public PositionType getPositionType() {
        return positionType;
    }

    public int getHealth() {
        return health;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public int getDefense() {
        return defense;
    }

    public String getAbility() {
        return ability;
    }
}