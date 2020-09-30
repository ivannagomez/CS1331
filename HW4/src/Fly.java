/**
 * This class represents a fly object
 * @author Ivanna
 * @version 1.0
 */
public class Fly {
    private double mass;
    private double speed;

    /**
     *This constructor takes in the mass and speed
     * @param mass first double, represents mass
     * @param speed second double, represents speed
     */
    public Fly(double mass, double speed) {
        this.mass = mass;
        this.speed = speed;
    }

    /**
     *This constructor takes in the mass
     * @param mass first number, represents mass
     */
    public Fly(double mass) {
        this.mass = mass;
        this.speed = 10.0;
    }

    /**
     * This constructor takes in no values
     */
    public Fly() {
        this.speed = 10.0;
        this.mass = 5.00;
    }

    /**
     * This is a setter for mass
     * @param mass first number, represents mass
     */
    public void setMass(double mass) {
        this.mass = mass;
    }

    /**
     * This is a setter for speed
     * @param speed first number, represents speed
     */
    public void setSpeed(double speed) {
        this.speed = speed;
    }

    /**
     * This is a getter for mass
     * @return value of mass
     */
    public double getMass() {
        return mass;
    }

    /**
     * This is a getter for speed
     * @return value of speed
     */
    public double getSpeed() {
        return speed;
    }

    /**
     * This is a method that outputs a string, has no inputs
     * @return string in format with values
     */
    public String toString() {
        if (mass == 0) {
            String output = String.format("I'm dead, but I used to be a fly with a speed of %.2f.", speed);
            return output;
        } else {
            String output = String.format("I'm a speedy fly with %.2f speed and %.2f mass.", speed, mass);
            return output;
        }
    }

    /**
     * This is a method to grow the value of mass, takes in new mass input
     * @param newMass represents the mass to be added
     */
    public void grow(int newMass) {
        mass = mass + newMass;
        if (mass < 20) {
            speed += newMass;
        }
        if (mass >= 20) {
            speed = speed - 0.5 * (mass - 20);
        }
    }

    /**
     * This is a method to check the boolean state of the fly
     * @return the boolean state of the fly
     */
    public boolean isDead() {
        return mass == 0;
    }
}
