public class BenderDriver {
    public static void main(String[] args) {
        FireBender zuko = new FireBender("Zuko");
        AirBender katara = new AirBender("Katara");
        zuko.attack(katara);
        katara.avatarState("Fire", zuko);
        zuko.fireArmy();
        zuko.healthIncrease(0);
        System.out.println(katara.toString());
        System.out.println(zuko.toString());
    }
}
