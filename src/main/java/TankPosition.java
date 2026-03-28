public class TankPosition {

    public enum PositionType {
        FRONT_LINE,
        TANK_LINE,
        FLANK,
        SUPPORT,
        AMBUSH
    }

    private PositionType positionType;
    private int attackModifier;
    private int defenseModifier;
    private String specialAbility;
    private long cooldown; // in seconds
    private long lastSwitchedTime;

    public TankPosition(PositionType positionType, int attackModifier, int defenseModifier, String specialAbility, long cooldown) {
        this.positionType = positionType;
        this.attackModifier = attackModifier;
        this.defenseModifier = defenseModifier;
        this.specialAbility = specialAbility;
        this.cooldown = cooldown;
        this.lastSwitchedTime = 0;
    }

    public void switchPosition(TankPosition newPosition) {
        long currentTime = System.currentTimeMillis() / 1000;

        if (currentTime - lastSwitchedTime >= cooldown) {
            this.positionType = newPosition.positionType;
            this.attackModifier = newPosition.attackModifier;
            this.defenseModifier = newPosition.defenseModifier;
            this.specialAbility = newPosition.specialAbility;
            this.lastSwitchedTime = currentTime;
            System.out.println("Switched to position: " + positionType);
        } else {
            System.out.println("Cannot switch position: cooldown active.");
        }
    }

    // Getters and Setters
    public PositionType getPositionType() {
        return positionType;
    }

    public int getAttackModifier() {
        return attackModifier;
    }

    public int getDefenseModifier() {
        return defenseModifier;
    }

    public String getSpecialAbility() {
        return specialAbility;
    }

    public long getCooldown() {
        return cooldown;
    }

    public long getLastSwitchedTime() {
        return lastSwitchedTime;
    }
}
