public class Player {
    private String username;
    private String team;
    private String vehicle;
    private List<String> inventory;
    private int kills;
    private int deaths;
    private boolean alive;

    public Player(String username, String team) {
        this.username = username;
        this.team = team;
        this.inventory = new ArrayList<>();
        this.kills = 0;
        this.deaths = 0;
        this.alive = true;
    }

    public void selectVehicle(String vehicle) {
        this.vehicle = vehicle;
    }

    public void addItemToInventory(String item) {
        this.inventory.add(item);
    }

    public void recordKill() {
        this.kills++;
    }

    public void recordDeath() {
        this.deaths++;
        this.alive = false;
        respawn();
    }

    private void respawn() {
        // Logic for respawning the player
        this.alive = true;
    }

    public String getUsername() {
        return username;
    }

    public String getTeam() {
        return team;
    }

    public String getVehicle() {
        return vehicle;
    }

    public List<String> getInventory() {
        return inventory;
    }

    public int getKills() {
        return kills;
    }

    public int getDeaths() {
        return deaths;
    }

    public boolean isAlive() {
        return alive;
    }
}