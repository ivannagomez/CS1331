public class Dog extends Pet {

    private double droolRate;

    public Dog(String name, double health, int painLevel, double droolRate) {
        super(name, health, painLevel);
        if (droolRate <= 0) {
            this.droolRate = 0.5;
        } else {
            this.droolRate = droolRate;
        }
    }

    public Dog(String name, double health, int painLevel) {
        super(name, health, painLevel);
        this.droolRate = 5.0;
    }

    @Override
    public int treat() {
        return 0;
    }

}
