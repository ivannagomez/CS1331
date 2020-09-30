/**
 * This class represents PowerUp
 * @author Ivanna
 * @version 1.0
 */
public interface PowerUp {
    /**
     * void method fireArmy
     */
    void fireArmy();

    /**
     * void method ro double strength level
     * @param fireBender Fire bender object, represents bender
     */
    static void strengthDoubles(FireBender fireBender) {
        fireBender.strengthLevel *= 2;
    }
}
