package kick;
import lotr.Character;
public class toCry implements Kick {
    @Override
    public void kick(Character attacker, Character target) {
        System.out.println("I am crying, I can not kick, no power :(");
    }
}
