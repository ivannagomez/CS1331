/**
 * This class represents a frog object
 * @author Ivanna
 * @version 1.0
 */
public class Frog {
    private String name;
    private int age;
    private double tongueSpeed;
    private boolean isFroglet;
    private static String species = "Rare Pepe";

    /**
     * This constructor takes in the name, mass and speed
     * @param name String represents name
     * @param age first number, represents age
     * @param tongueSpeed second number, represents the speed of the tongue
     */
    public Frog(String name, int age, double tongueSpeed) {
        this.name = name;
        this.age = age;
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = isFroglet;
        this.species = species;
    }

    /**
     * This constructor takes in the name, mass and speed
     * @param name String represents name
     * @param ageInYears first number, represents age in years
     * @param tongueSpeed second number, represents the speed of the tongue
     */
    public Frog(String name, double ageInYears, double tongueSpeed) {
        this.name = name;
        this.age = (int) (ageInYears * 12);
        this.tongueSpeed = tongueSpeed;
        this.isFroglet = isFroglet;
        this.species = species;
    }

    /**
     * This constructor takes in the name, mass and speed
     * @param name String represents name
     */
    public Frog(String name) {
        this.name = name;
        this.age = 5;
        this.tongueSpeed = 5;
        this.isFroglet = isFroglet;
        this.species = species;
    }

    /**
     * This method takes in an integer to grow the tongue speed and age
     * @param months integer represents months
     */
    public void grow(int months) {
        age = age + months;
        tongueSpeed = tongueSpeed + months;
        if (tongueSpeed > 12) {
            tongueSpeed = 12;
        }
        if (age >= 30) {
            tongueSpeed = tongueSpeed - (age - 30);
        }
        if (tongueSpeed < 5) {
            tongueSpeed = 5;
        }
        if (age > 1 && age < 7) {
            isFroglet = true;
        } else {
            isFroglet = false;
        }
    }

    /**
     * This method takes in no values but grows the age and speed
     */
    public void grow() {
        age++;
        tongueSpeed++;
    }

    /**
     * This method compares some values from the fly class some of the with frog class
     * @param fly object represented from the fly class
     */
    public void eat(Fly fly) {
        if (fly.isDead()) {
            return;
        }
        boolean caught = false;
        if (tongueSpeed > fly.getSpeed()) {
            caught = true;
        }
        if (caught && fly.getMass() >= (0.5 * age)) {
            grow(1);
            fly.setMass(0);
        } else if (caught) {
            fly.setMass(0);
        }
        if (!caught) {
            fly.grow(1);
        }
    }

    /**
     * This is a method that outputs a string, has no inputs
     * @return string in format with values
     */
    public String toString() {
        if (isFroglet) {
            String output = String.format("My name is %s and I’m a rare froglet! I'm %d months old and "
                    + "my tongue has a speed of %.2f.", name, age, tongueSpeed);
            return output;
        } else {
            String output = String.format("My name is %s and I’m a rare frog. I'm %d months old and my tongue "
                    + "has a speed of %.2f.", name, age, tongueSpeed);
            return output;
        }
    }

    /**
     * This is a getter for species
     * @return the value of species
     */
    public String getSpecies() {
        return species;
    }

    /**
     * This is a setter for species
     * @param species represents the value of species
     */
    public void setSpecies(String species) {
        this.species = species;
    }

}
