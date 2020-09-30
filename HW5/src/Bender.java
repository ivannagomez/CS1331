/**
 * This class represents Bender
 * @author Ivanna
 * @version 1.0
 */
public abstract class Bender {
    protected String name;
    protected String element;
    protected int strengthLevel;
    protected int health;

    /**
     * Constructor for Bender
     * @param name String variable, represents name
     * @param element second string variable, represents element
     * @param strengthLevel integer variable, represents strength level
     * @param health second integer variable, represents health
     */
    public Bender(String name, String element, int strengthLevel, int health) {
        this.name = name;
        this.element = element;
        this.strengthLevel = strengthLevel;
        if (health < 0) {
            this.health = 0;
        } else {
            this.health = health;
        }
    }

    /**
     * Void method, increases health
     * @param inc integer, represents the increment for health
     */
    public void healthIncrease(int inc) {
        if (health < 0) {
            health = 0;
        }
        if (health == 0) {
            return;
        } else {
            health = health + inc;
        }
    }

    /**
     * Void method for attack
     * @param bender Bender object, represents a bender
     */
    public void attack(Bender bender) {
    }

    /**
     * Boolean method to compare values
     * @param bender Bender object, represents a bender
     * @return value of bender comparison
     */
    public boolean equals(Bender bender) {
        return bender == this;
    }

    /**
     * Method to set up a string
     * @return an format string
     */
    public String toString() {
        String output = String.format("My name is %s. I have control over %s. My strength level is "
                + "%d and my current health is %d.", name, element, strengthLevel, health);
        return output;
    }

    /**
     * Getter for Strength Level
     * @return Strength Level value
     */
    public int getStrengthLevel() {
        return strengthLevel;
    }

    /**
     * Getter for health
     * @return health value
     */
    public int getHealth() {
        return health;
    }

    /**
     * Setter for Strength Level
     * @param strengthLevel represents value of Strength Level
     */
    public void setStrengthLevel(int strengthLevel) {
        this.strengthLevel = strengthLevel;
    }

    /**
     * Setter for health
     * @param health represents value of health
     */
    public void setHealth(int health) {
        this.health = health;
    }
}
