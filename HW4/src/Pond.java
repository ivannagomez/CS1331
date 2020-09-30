
/**
 * This class represents the main method Pond
 * @author Ivanna
 * @version 1.0
 */
public class Pond {
    public static void main(String[] args) {
        Frog frog1 = new Frog("Peepo");
        Frog frog2 = new Frog("Pepe", 10, 15);
        Frog frog3 = new Frog("Peepaw", 4.6, 15);
        Frog frog4 = new Frog("Sad Peep", 1.5, 10);

        Fly fly1 = new Fly(1, 3);
        Fly fly2 = new Fly(6);
        Fly fly3 = new Fly(10, 10);

        frog1.setSpecies("1331 Frogs");
        System.out.println(frog1.toString());
        frog1.eat(fly2);
        System.out.println(fly2.toString());
        frog1.grow(8);
        frog1.eat(fly2);
        System.out.println(fly2.toString());
        System.out.println(frog1.toString());
        System.out.println(frog4.toString());
        frog3.grow(4);
        System.out.println(frog3.toString());
        System.out.println(frog2.toString());

    }
}
