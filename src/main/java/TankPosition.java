public enum TankPosition {
    FRONT_LINE(2.0, 3.0, 1.0, 5, "Charge"),
    TANK_LINE(1.5, 2.5, 0.8, 3, "Hold Ground"),
    FLANK(1.8, 1.0, 1.5, 4, "Outmaneuver"),
    SUPPORT(1.0, 1.0, 1.2, 6, "Reinforce"),
    AMBUSH(2.5, 1.2, 0.5, 2, "Surprise Attack");

    private final double damageMultiplier;
    private final double armorMultiplier;
    private final double speedMultiplier;
    private final int visibilityLevel;
    private final String uniqueAbilityName;

    TankPosition(double damageMultiplier, double armorMultiplier, double speedMultiplier, int visibilityLevel, String uniqueAbilityName) {
        this.damageMultiplier = damageMultiplier;
        this.armorMultiplier = armorMultiplier;
        this.speedMultiplier = speedMultiplier;
        this.visibilityLevel = visibilityLevel;
        this.uniqueAbilityName = uniqueAbilityName;
    }

    // Getters for each property can be added here
}