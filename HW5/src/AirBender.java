
/**
 * This class represents the main method AirBender
 * @author Ivanna
 * @version 1.0
 */
public class AirBender extends Bender {
    private boolean avatar;

    /**
     * Constructor for AirBender
     * @param name first string, represents name
     * @param strengthLevel first int, represents strength level
     * @param health second int, represents health
     * @param avatar boolean, represents avatar
     */
    public AirBender(String name, int strengthLevel, int health, boolean avatar) {
        super(name, "Air", strengthLevel, health);
        this.avatar = avatar;
    }

    /**
     * Second constructor for AirBender
     * @param name string, represents name
     */
    public AirBender(String name) {
        super(name, "Air", 40, 35);
        this.avatar = false;
    }

    /**
     * Void method that performs an attack on other bender
     * @param bender Bender object, represents a bender
     */
    public void attack(Bender bender) {
        if (this.getHealth() > 0) {
            int totalStrength = this.strengthLevel / 2;
            bender.setHealth(bender.getHealth() - totalStrength);
        }
        if (bender.getHealth() < 0) {
            bender.setHealth(0);
        }
    }

    /**
     * Method returning a boolean value
     * @param bender Bender object, represents object
     * @return a value from comparing two integers
     */
    public boolean spiritualProjection(Bender bender) {
        boolean connection = false;
        if (bender.getHealth() == this.getHealth()) {
            connection = true;
        }
        return connection;
    }

    /**
     * Void method comparing various value and changing other values
     * @param elmnt string variable, represents an element
     * @param bender Bender object, represents an object
     */
    public void avatarState(String elmnt, Bender bender) {
        if (!avatar) {
            return;
        }
        if (elmnt.equals("Earth")) {
            bender.setHealth(bender.getHealth() / 2);
        } else if (elmnt.equals("Fire")) {
            bender.setStrengthLevel(bender.getStrengthLevel() - 10);
            if (bender.getStrengthLevel() < 10) {
                bender.setStrengthLevel(0);
            } else {
                return;
            }
        } else if (elmnt.equals("Air")) {
            if (bender.getStrengthLevel() < 15) {
                bender.setStrengthLevel(0);
            }
        } else if (elmnt.equals("Water")) {
            if ((bender.getHealth() < 5) && (bender.getStrengthLevel() < 15)) {
                bender.setHealth(0);
            }
        }
    }

    /**
     * Avatar getter
     * @return avatar value
     */
    public boolean getAvatar() {
        return avatar;
    }

    /**
     * Avatar setter
     * @param avatar represents avatar value
     */
    public void setAvatar(boolean avatar) {
        this.avatar = avatar;
    }
}
