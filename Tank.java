public class Tank extends Vehicle {
    private String currentPosition;
    private long lastSwitchTime;

    public Tank() {
        this.currentPosition = "FRONT_LINE"; // Default position
        this.lastSwitchTime = 0;
    }

    public void switchPosition(String newPosition) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastSwitchTime >= 30000) { // 30 seconds cooldown
            this.currentPosition = newPosition;
            lastSwitchTime = currentTime;
        } else {
            System.out.println("Cooldown: Please wait before switching positions.");
        }
    }

    public double getPositionMultiplier() {
        switch (currentPosition) {
            case "FRONT_LINE":
                return 1.2; // +20% damage
            case "TANK_LINE":
                return 1.3; // +30% armor
            case "FLANK":
                return 1.15; // +15% speed
            case "SUPPORT":
                return 1.25; // +25% range
            case "AMBUSH":
                return 1.4; // +40% camo
            default:
                return 1.0; // No bonus
        }
    }

    public void performAbility() {
        switch (currentPosition) {
            case "FRONT_LINE":
                ramCharge();
                break;
            case "TANK_LINE":
                taunt();
                break;
            case "FLANK":
                stealth();
                break;
            case "SUPPORT":
                bombardment();
                break;
            case "AMBUSH":
                oneShot();
                break;
            default:
                System.out.println("No special ability available.");
        }
    }

    private void ramCharge() {
        System.out.println("Executing RAM_CHARGE ability.");
    }

    private void taunt() {
        System.out.println("Executing TAUNT ability.");
    }

    private void stealth() {
        System.out.println("Executing STEALTH ability.");
    }

    private void bombardment() {
        System.out.println("Executing BOMBARDMENT ability.");
    }

    private void oneShot() {
        System.out.println("Executing ONE_SHOT ability.");
    }
}