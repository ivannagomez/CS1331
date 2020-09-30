/**
 * This class represents FireBender
 * @author Ivanna
 * @version 1.0
 */
public class FireBender extends Bender implements PowerUp {
    private int fireStrength;
    private boolean hasArmy;

    /**
     * Constructor for FireBender
     * @param name first string, represents name
     * @param strengthLevel first int, represents strength level
     * @param health second int, represents health
     * @param fireStrength third int, represents fire strength
     * @param hasArmy boolean, represents if there is an Army
     */
    public FireBender(String name, int strengthLevel, int health, int fireStrength, boolean hasArmy) {
        super(name, "Fire", strengthLevel, health);
        this.fireStrength = fireStrength;
        this.hasArmy = hasArmy;
        element = "Fire";
    }

    /**
     * Second constructor for FireBender
     * @param name string, represents name
     */
    public FireBender(String name) {
        super(name, "Fire", 30, 15);
        this.fireStrength = 15;
        this.hasArmy = true;
    }

    /**
     * void method, checks if there is an army and acts accordingly
     */
    public void fireArmy() {
        if (hasArmy) {
            setHealth(health * 2);
            setFireStrength(fireStrength * 3);
        } else if (!hasArmy) {
            return;
        }
    }

    /**
     * void method, attacks another bender and modifies their values
     * @param bender Bender object, represents a bender
     */
    public void attack(Bender bender) {
        if (this.getHealth() >= 5) {
            int totalStrength = this.strengthLevel * this.fireStrength;
            bender.setHealth(bender.getHealth() - totalStrength);
        }
        if (bender.getHealth() < 0) {
            bender.setHealth(0);
        }
    }

    /**
     * Boolean method to compare values
     * @param bender Bender object, represents a bender
     * @return value of bender comparison
     */
    @Override
    public boolean equals(Bender bender) {
        return super.equals(bender);
    }

    /**
     * Method to set up a string
     * @return an format string
     */
    public String toString() {
        return super.toString();
    }

    /**
     * Setter for fire strength
     * @param fireStrength integer, represents fire strength
     */
    public void setFireStrength(int fireStrength) {
        this.fireStrength = fireStrength;
    }
}
