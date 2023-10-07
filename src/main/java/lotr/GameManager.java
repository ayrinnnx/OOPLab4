package lotr;

public class GameManager {
    public static void fight(Character c1, Character c2) {
        System.out.println("And the first player is: " + c1.getClass().getSimpleName() +
                "with power: " + c1.getPower() + " (1)");
        System.out.println("His opponent is: " + c2.getClass().getSimpleName() +
                "with power: " + c2.getPower() + " (2)");
        while (c1.isAlive() && c2.isAlive()) {
            System.out.println("The first participant strikes: ");
            c1.kick(c2);
            System.out.println("Result: " + c2.getHp());
            System.out.println("The second participant strikes: ");
            c2.kick(c1);
            System.out.println("Result: " + c1.getHp());
        }
    }

}
