//I worked on the homework assignment alone, using only course materials.
abstract public class Pet {
    private String name;
    private double health;
    private int painLevel;

    public Pet(String name, double health, int painLevel) {
        if (health > 1.0) {
            this.health = 1.0;
        } else if (health < 0) {
            this.health = 0.0;
        }
        if (painLevel > 10) {
            this.painLevel = 10;
        } else if (painLevel < 1) {
            this.painLevel = 1;
        }
    }

    public abstract int treat();

    public void speak() {
        System.out.println("Hello! My name is " + name);
    }

    public boolean equals (Object o) {
        if (o == this) {
            return true;
        }

        if (!(o instanceof Pet)) {
            return false;
        }

        Pet p = (Pet) o;
        return name.compareTo(p.name) == 0;
    }

    protected void heal() {
        this.health = 1.0;
        this.painLevel = 1;
    }
}
