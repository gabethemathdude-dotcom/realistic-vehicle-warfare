// Tank.java

public class Tank extends Vehicle {
    private String position;
    private int damageOutput;
    private int armor;
    private long lastPositionSwitch;

    public Tank() {
        this.damageOutput = randomDamage();
        this.position = "Default";
        this.armor = calculateArmor(this.position);
        this.lastPositionSwitch = 0;
    }

    private int randomDamage() {
        return (int) (Math.random() * (150 - 75 + 1)) + 75;
    }

    private int calculateArmor(String position) {
        switch (position) {
            case "Front": return 100;
            case "Side": return 75;
            case "Rear": return 50;
            default: return 60;
        }
    }

    public void switchPosition(String newPosition) {
        long currentTime = System.currentTimeMillis();
        if (currentTime - lastPositionSwitch >= 30000) { // 30 seconds cooldown
            this.position = newPosition;
            this.armor = calculateArmor(newPosition);
            lastPositionSwitch = currentTime;
        } else {
            System.out.println("Cooldown not finished. Wait before switching positions.");
        }
    }

    public void fire() {
        System.out.println("Firing! Damage output: " + damageOutput);
    }

    public String getPosition() {
        return position;
    }

    public int getArmor() {
        return armor;
    }
}